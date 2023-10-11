package awadh.bakery.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.*;



@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class productImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Long Id;
    @Column
    private String imageName;
    @Column
    private String imageType;
    @Column
    private byte[] imageData;
    @OneToOne(cascade = CascadeType.ALL)
    private product product;
   
}
