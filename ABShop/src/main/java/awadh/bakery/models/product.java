package awadh.bakery.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;




@Entity
@Table(name = "products")
public class product implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name", length = 50, nullable = false)
    @NotEmpty(message = "Product name is required")
    @Size(max = 50, message = "Product name must not exceed 50 characters")
    private String productName;

    @Column(name = "product_desc", length = 100, nullable = false)
    @NotEmpty(message = "Product description is required")
    @Size(max = 100, message = "Product description must not exceed 100 characters")
    private String productDesc;

    @Column(name = "product_mrp", nullable = false)
    @NotNull(message = "Product MRP is required")
    @DecimalMin(value = "0", message = "Product MRP must be greater than or equal to 0")
    private BigDecimal productMRP;

    @Column(name = "product_mfd", nullable = false)
    @NotNull(message = "Manufacturing date is required")
    private String productMFD;

    @Column(name = "product_expiry_date", nullable = false)
    @NotNull(message = "Expiry date is required")
    private String productExpiryDate;

   @Column(name = "product_model", length = 30, nullable = false)
    @NotEmpty(message = "Product model is required")
    @Size(max = 30, message = "Product model must not exceed 30 characters")
    private String productModel;
    @Lob
    @Column(name = "product_image")
    private byte[] productImage;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public BigDecimal getProductMRP() {
		return productMRP;
	}
	public void setProductMRP(BigDecimal productMRP) {
		this.productMRP = productMRP;
	}
	public String getProductMFD() {
		return productMFD;
	}
	public void setProductMFD(String productMFD) {
		this.productMFD = productMFD;
	}
	public String getProductExpiryDate() {
		return productExpiryDate;
	}
	public void setProductExpiryDate(String productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}
	public String getProductModel() {
		return productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}
	public byte[] getProductImage() {
		return productImage;
	}
	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}
	public product() {
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productMRP = productMRP;
		this.productMFD = productMFD;
		this.productExpiryDate = productExpiryDate;
		this.productModel = productModel;
		this.productImage = productImage;
	}
    public void setImageFileName(String uniqueFileName) {
    }



	
	    
}
