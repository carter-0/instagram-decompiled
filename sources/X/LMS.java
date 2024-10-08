package X;

import android.graphics.RectF;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;

public final class LMS {
    public final RectF A00;
    public final IGTVBrandedContentTags A01;
    public final IGTVShoppingMetadata A02;

    public LMS(RectF rectF, IGTVBrandedContentTags iGTVBrandedContentTags, IGTVShoppingMetadata iGTVShoppingMetadata, String str) {
        0qQ.A0B(str, 1);
        this.A00 = rectF;
        this.A02 = iGTVShoppingMetadata;
        this.A01 = iGTVBrandedContentTags;
    }

    public LMS() {
        this((RectF) null, (IGTVBrandedContentTags) null, (IGTVShoppingMetadata) null, "");
    }
}
