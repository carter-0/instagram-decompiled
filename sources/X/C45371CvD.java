package X;

import com.instagram.api.schemas.ProductTileMetadata;
import com.instagram.api.schemas.ProductTileMetadataDecorations;
import com.instagram.api.schemas.ProductTileMetadataDestination;
import java.util.List;

/* renamed from: X.CvD  reason: case insensitive filesystem */
public class C45371CvD {
    public ProductTileMetadataDecorations A00;
    public ProductTileMetadataDestination A01;
    public List A02;
    public final ProductTileMetadata A03;

    public C45371CvD(ProductTileMetadata productTileMetadata) {
        this.A03 = productTileMetadata;
        this.A00 = productTileMetadata.Avh();
        this.A01 = productTileMetadata.AwY();
        this.A02 = productTileMetadata.BKR();
    }
}
