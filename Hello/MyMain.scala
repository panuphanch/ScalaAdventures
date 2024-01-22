import scalaj.http.Http
import scala.xml.XML

object MyMain extends App {
	val rssBBC = "https://feeds.bbci.co.uk/news/world/rss.xml"
	var response = Http(rssBBC).asString
	
	val xml = XML.loadString(response.body)
	val titles = xml \\ "item" \ "title"
	val titleText = for { title <- titles } yield title.text
	titleText.foreach(println)
}