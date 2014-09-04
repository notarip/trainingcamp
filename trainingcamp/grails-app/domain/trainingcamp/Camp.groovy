package trainingcamp


import org.apache.commons.logging.LogFactory


class Camp {

	static final log = LogFactory.getLog(this)
	
    String name

    static hasMany = [users: User, admins:User, coachs:User]
    
	static constraints = {
        name(nullable: false, blank: false, unique: true)
    }
	
	
	void addToAdmins(User admin){
		boolean itsOk = Boolean.FALSE
		if(admins == null) admins = new ArrayList<User>()
		
		if(!admin.roles.empty){
			def roles = admin.roles
			for (var in roles) {
				if(var.name.equals("ADMIN")){
					this.admins.add(admin)
					itsOk = Boolean.TRUE
					break
				}
			}
		}
		if(!itsOk)
			 log.error "El usuario debe ser ADMIN"
		
				
	}
	
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
