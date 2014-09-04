package trainingcamp

class Routine {

	
	static belongsTo = User
	static hasMany = [exercises:Exercise]
	
    static constraints = {
    }
}
