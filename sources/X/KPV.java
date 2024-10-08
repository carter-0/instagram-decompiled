package X;

import android.os.Bundle;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

public final class KPV extends C59889JbE {
    public final Bundle A00;
    public final PublishScreenCategoryType A01;
    public final String A02;

    public KPV(Bundle bundle, PublishScreenCategoryType publishScreenCategoryType, String str) {
        super("publish_screen_category");
        this.A02 = str;
        this.A01 = publishScreenCategoryType;
        this.A00 = bundle;
    }
}
