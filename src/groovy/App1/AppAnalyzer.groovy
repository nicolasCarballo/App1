package App1

import app1.appDomain

class AppAnalyzer {
		private final List<appDomain> quotes
		
		AppAnalyzer(List<appDomain> cita) {
			this.quotes = new ArrayList(cita)
		}

		int getQuoteCount() {
			return this.quotes.size()
	}
}
