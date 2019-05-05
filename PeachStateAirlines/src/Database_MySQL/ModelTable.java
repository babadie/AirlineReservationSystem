package Database_MySQL;

public class ModelTable {
	
	String id,name,email,prog;

	public ModelTable(String id, String name, String email, String prog) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.prog = prog;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProg() {
		return prog;
	}

	public void setProg(String prog) {
		this.prog = prog;
	}
	
	

}
