package trainingcamp


class User {

  	String name
	String email
	String password

	static hasMany = [adminCamps:Camp,userCamps:Camp,coachCamps:Camp, roles: UserRole, routines:Routine]
	static belongsTo = Camp
	static mappedBy = [adminCamps:"admins", userCamps: "users",coachCamps: "coachs"]

	
	static constraints = {
		name(nullable: false, blank: false, unique: true)
		email email:true
		password size: 5..15, blank: false
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
