package com.passservices.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    private String securityId;
    private String identityId;
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

    public Employee() {
    }

    public Employee(long id, String firstName, String lastName, Date birthDate) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
	this.securityId = securityId;
    }

    public Employee(long id, String firstName, String lastName, Date birthDate, String securityId) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
	this.securityId = securityId;
    }

    public Employee(long id, String firstName, String lastName, Date birthDate, String securityId, String identityId) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
	this.securityId = securityId;
	this.identityId = identityId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the securityId
	 */
	public String getSecurityId() {
		return securityId;
	}

	/**
	 * @param securityId the securityId to set
	 */
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	/**
	 * @return the identityId
	 */
	public String getIdentityId() {
		return identityId;
	}

	/**
	 * @param identityId the identityId to set
	 */
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	/**
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param securityId
	 * @param identityId
	 * @param expirationDate
	 */
	public Employee(long id, String firstName, String lastName, Date birthDate, String securityId, String identityId,
			Date expirationDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.securityId = securityId;
		this.identityId = identityId;
		this.expirationDate = expirationDate;
	}

}
