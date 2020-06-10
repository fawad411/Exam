package Composite_pattern;
import java.util.List;

public abstract class HTMLTag {
	String tagname;
	public HTMLTag() {
		
	}
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	public void setTagBody(String tagBody){
	}
	public void addChildTag(HTMLTag htmlTag){
	
	}
	public void removeChildTag(HTMLTag htmlTag){

	}
	
	public abstract void generateHtml();
	
}
