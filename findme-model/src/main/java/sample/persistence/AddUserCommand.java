package sample.persistence;


public class AddUserCommand {
	
	private static final long serialVersionUID = 1L;
	private User user;
	
	public AddUserCommand(User user) {
		this.user = user;
	}

	public void validate() {
	}

	public User getUser() {
		return user;
	}

}
