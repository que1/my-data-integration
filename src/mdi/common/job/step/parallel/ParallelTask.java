package mdi.common.job.step.parallel;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import mdi.common.job.step.parallel.element.IElement;

public class ParallelTask implements Serializable {

	private static final long serialVersionUID = 7647489927737249987L;

	private String parallelTaskName;

	private List<IElement> elementList;

	public ParallelTask(String parallelTaskName) {
		this.parallelTaskName = parallelTaskName;
		this.elementList = new LinkedList<IElement>();
	}

	public String getParallelTaskName() {
		return this.parallelTaskName;
	}

	public IElement getElement(String elementName) {
		for (IElement element : this.elementList) {
			if (element.getElementName().equals(elementName)) {
				return element;
			} else {
				continue;
			}
		}
		return null;
	}

	public void addElement(IElement element) {
		this.elementList.add(element);
	}

	public void addElement(int index, IElement element) {
		this.elementList.add(index, element);
	}

	public void removeElement(String elementName) {
		this.elementList.remove(this.getElement(elementName));
	}

	public void removeElement(int index) {
		this.elementList.remove(index);
	}
}
