package SpringBootAPP1.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Role {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy = "native")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	
	@Column(name = "descripcion")
	private String descripcion;



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public int hashCode() {
		return Objects.hash(descripcion, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(descripcion, other.descripcion) && id == other.id && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", descripcion=" + descripcion + "]";
	}
	
}
