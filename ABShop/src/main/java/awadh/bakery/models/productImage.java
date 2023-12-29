package awadh.bakery.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productImages")
public class productImage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "image_id")
	private Long imgId;
	private String imageName; // Name of the image
	private String imageType; // MIME type of the image
	private String imageExtension; // File extension of the image
	@Lob
	private byte[] imageData;
	@OneToOne(mappedBy = "image")
	private product product;
}
