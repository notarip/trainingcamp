package trainingcamp


class User {

  	String name
	String email

	static hasMany = [adminCamps:Camp,userCamps:Camp,coachCamps:Camp, roles: UserRole]
	static belongsTo = Camp
	static mappedBy = [adminCamps:"admins", userCamps: "users",coachCamps: "coachs"]

	
	static constraints = {
		name(nullable: false, blank: false, unique: true)
		email email:true
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
