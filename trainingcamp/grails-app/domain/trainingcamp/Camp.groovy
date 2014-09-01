package trainingcamp


class Camp {

    String name

    static hasMany = [users: User, admins:User, coachs:User]

    static constraints = {
        name(nullable: false, blank: false, unique: true)
    }
	
//	void addToAdmins(User admin){
//		boolean itsOk = Boolean.FALSE
//		
//		if(!admin.roles.empty){
//			def roles = admin.roles
//			for (var in roles) {
//				if(var.name.equals("ADMIN")){
//					this.admins.add(admin)
//					itsOk = Boolean.TRUE
//					break
//				}
//			}
//		}else{
//			throw new Exception("El usuario debe ser admin") 
//		}		
//	}
	
	
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
