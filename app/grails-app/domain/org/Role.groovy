package org

class Role {

	String authority
	String desc

	static mapping = {
		cache true
	}

	static constraints = {
		authority blank: false, unique: true
	}
	
	@Override
	public String toString() {
		return authority;
	}
	
	public boolean isAdmin() {
		return "Admin".equalsIgnoreCase(authority);
	}
	
	public boolean isSubAdmin() {
		return "Sub_Admin".equalsIgnoreCase(authority);
	}
}
