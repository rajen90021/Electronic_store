package elctric.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {

	
	
	@Id
	private String id;
	
	private String name;
	
	@Column(unique = true)
	private String email;
	
	@Column(length = 10)
	private String password;
	
	private String gender;
	
	
	@Column(length = 1000)
	private String about;
	
	
	
	private String imageName;
}
