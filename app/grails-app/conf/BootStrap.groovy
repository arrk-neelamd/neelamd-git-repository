import org.Role
import org.User
import org.UserRole

class BootStrap {

	def init = { servletContext ->

		createMasterData()
	}
	def destroy = {
	}

	void createMasterData() {

		def role  = new Role(authority:"ROLE_SUPER_ADMIN", desc:"Super admin")
		role.save()
		def user  = new User(username:"admin", password: "admin" , enabled: true)
		//user.setRole(r);
		user.save()

		UserRole.create user, role

		role  = new Role(authority:"ROLE_SUB_ADMIN", desc:"Sub admin")
        role.save()
		user  = new User(username:"subadmin", password: "subadmin" , enabled: true)
		user.save()

		UserRole.create user, role

		role  = new Role(authority:"ROLE_USER", desc:"normal user")
		role.save()
		user  = new User(username:"user", password: "user" , enabled: true)
		user.save()

		UserRole.create user, role

	}
}
