package trainingcamp

class UserRole {
	
	String name
	static hasMany = [users:User]    
	static belongsTo = User

    static constraints = {
    }
	
	@Override
	public String toString() {
		return this.name;
	}
}
