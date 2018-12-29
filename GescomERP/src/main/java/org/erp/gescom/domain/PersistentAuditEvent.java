package org.erp.gescom.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection="persistent_audit_event")
public class PersistentAuditEvent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Field("event_id")
	private String id;
	
	private String principal;
	
	@Field("event_date")
	private Instant auditEventDate;
	
	@Field("event_type")
	private String auditEventtype;
	
	private Map<String, String> data = new HashMap<>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public Instant getAuditEventDate() {
		return auditEventDate;
	}
	public void setAuditEventDate(Instant auditEventDate) {
		this.auditEventDate = auditEventDate;
	}
	public String getAuditEventtype() {
		return auditEventtype;
	}
	public void setAuditEventtype(String auditEventtype) {
		this.auditEventtype = auditEventtype;
	}
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	
	

}