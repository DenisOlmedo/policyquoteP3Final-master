package org.acme.insurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Rejection implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Reason")
	private java.lang.String reason;

	public Rejection() {
	}

	public java.lang.String getReason() {
		return this.reason;
	}

	public void setReason(java.lang.String reason) {
		this.reason = reason;
	}

	public Rejection(java.lang.String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "{" +
			" reason='" + reason + "'" +
			"}";
	}

}