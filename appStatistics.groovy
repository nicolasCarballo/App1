package App1
import app1.appDomain
import App1.AppAnalyzer

class appStatistics {
	new appDomain( author: "Peter Ledbrook",content: "Time waits for no man").save()
	new appDomain(author: "Glen Smith", content: "Groovy solves all problems").save(flush: true)
	def analyzer = new AppAnalyzer(appDomain.list())
	try {
		def reportFile = new File("report.txt")
		reportFile.withPrintWriter { w ->
			w.println """\
			Quote report
			-----------
			Total: ${analyzer.citaCount}
			Number of quotes by author:
			"""
			for (entry in analyzer.citaCountPerAuthor) {
				w.println "  " + entry.key.padRight(20) + entry.value
	} }
		println reportFile.text
	}
	catch (IOException ex) {
		println "Unable to write to the 'report.txt' file!"
	}
	Each map entry’s key is the author name; the value is the quote count.
			
}
