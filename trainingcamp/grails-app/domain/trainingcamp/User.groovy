package trainingcamp


class User {

  	String name
	String email

	static hasMany = [camps: Camp, roles: UserRole]
	static belongsTo = Camp

	static constraints = {
		name(nullable: false, blank: false, unique: true)
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
