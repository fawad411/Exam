package Composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class HTMLParentElement extends HTMLTag {
	private String tagName;
	private String startTag; 
	private String endTag;
	String childrenTag;
	
	public HTMLParentElement(String tagName){
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
	}
	public String getTagName() {
		return tagName;
	}

	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	public void addChildTag(HTMLTag htmlTag){
		childrenTag.add(htmlTag);
	}
	
	public void removeChildTag(HTMLTag htmlTag){
		childrenTag.remove(htmlTag);
	}

	public List<HTMLTag>getChildren(){
		return childrenadd;
	}

	public void generateHtml() {
		System.out.println(startTag);
		for(HTMLTag tag : childrenTag){
			tag.generateHtml();
		}
		System.out.println(endTag);
		
	}

}
