package trainingcamp


class Camp {

    String name

    static hasMany = [users: User, admins:User, coachs:User]
    

    static constraints = {
        name(nullable: false, blank: false, unique: true)
    }
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
