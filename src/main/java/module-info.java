open module NightGames
{
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;

	requires java.compiler;
	requires lombok;
	requires dagger;
	requires javax.inject;
	requires org.apache.logging.log4j;

	exports org.nightgames.ports.main;
}
