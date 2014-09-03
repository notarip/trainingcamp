import trainingcamp.Camp
import trainingcamp.User
import trainingcamp.UserRole

class BootStrap {

    def init = { servletContext ->
		
		
		def userRole = new UserRole(name:"USER").save()
		def adminRole = new UserRole(name:"ADMIN").save()
		def coachRole = new UserRole(name:"COACH").save()
		
		def mega1 = new Camp(name:"mega1").save()
		
		def mega2 = new Camp(name:"mega2").save() 
		
		
		def pablo = new User(name:"pablo", email:"pablo@user.com")
		pablo.addToRoles(userRole)
		pablo.save()
		
		def jose = new User(name:"jose",email:"jose@admin.com")
		jose.addToRoles(adminRole)
		jose.addToRoles(coachRole)
		jose.save()
		
		def pepe = new User(name:"pepe",email:"pepe@admin.com")
		pepe.addToRoles(adminRole)
		pepe.addToRoles(coachRole)
		pepe.save()
		
		
		mega1.addToUsers(pablo)
		mega1.addToAdmins(pablo)
		mega1.addToAdmins(jose)
		mega1.addToCoachs(jose)
		mega1.save()

		mega2.addToUsers(pablo)
		mega2.addToAdmins(pepe)
		mega2.addToCoachs(jose)		
		mega2.save()
						
		
    }
    def destroy = {
    }
}
