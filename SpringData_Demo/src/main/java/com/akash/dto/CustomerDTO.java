package com.akash.dto;

import java.time.LocalDate;
import java.util.Objects;
import com.akash.utility.CustomerType;

public class CustomerDTO 
{

	Integer customerId;
	String emailId;
	String name;
	LocalDate dateOfBirth;
	CustomerType customerType;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}


	@Override
	public int hashCode() {
		return Objects.hash(customerId, customerType, dateOfBirth, emailId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDTO other = (CustomerDTO) obj;
		return Objects.equals(customerId, other.customerId) && customerType == other.customerType
				&& Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", emailId=" + emailId + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + ", customerType=" + customerType + "]";
	}
	
	
	
}
