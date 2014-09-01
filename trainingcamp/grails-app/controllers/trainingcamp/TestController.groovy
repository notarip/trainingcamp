package trainingcamp

class TestController {

    def index() { 

		def result = User.all
		
		for (var in result) {
			
			def camps = var.camps
			render  (var)
			
			for (var2 in camps) {
				render (var2)
			}
		}
				
		render "hola"
		
		
	}
}
