package ScrumTeam.ScrumTeam;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ScrumTeam {

	@Id
	private String id;
	private String projectname;
	private String startdate,enddate;
	private String description;
	private String status;
	private List<ProjectMember> members;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<ProjectMember> getMembers() {
		return members;
	}
	public void setMembers(List<ProjectMember> members) {
		this.members = members;
	}
	
	
	
}
