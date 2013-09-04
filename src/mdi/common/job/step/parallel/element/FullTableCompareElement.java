package mdi.common.job.step.parallel.element;

import java.io.Serializable;

public class FullTableCompareElement implements Serializable, IElement {
	
	private static final long serialVersionUID = 4645196188557783394L;
	
	private String elementID;
	private String elementName;
	
	public FullTableCompareElement(String elementID, String elementName) {
		this.elementID = elementID;
		this.elementName = elementName;
	}

	@Override
	public String getElementID() {
		return this.elementID;
	}
	
	@Override
	public String getElementName() {
		return this.elementName;
	}

}
