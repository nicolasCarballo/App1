package App1

import app1.appDomain

class AppAnalyzer {
		private final List<appDomain> citas
		
		AppAnalyzer(List<appDomain> citas) {
			println "Constructor"
			this.citas = new ArrayList(citas)
		}
		int getCitaCount() {
			return this.citas.size()
		}
		Map<String, Integer> getCitaCountPerAuthor() {
			println "Mapeo"
			def result = [:]
			for( cita in citas ){
				if (result.containsKey(cita.author)) {
					result[cita.author] = result[cita.author] + 1
				}
				else {
					result[cita.author] = 1
				}
			}			
			return result
		}
}
