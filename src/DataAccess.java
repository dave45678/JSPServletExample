public class DataAccess {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean IsValidUser(){
		if (username.equals("dave") && password.equals("blue")){
			return true;
		}else{
			return false;
		}
	}
}
