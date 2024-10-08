package com.instagram.api.schemas;

import X.1E6;
import X.1E9;
import X.D5W;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public interface MediaVCRTappableDataIntf extends Parcelable {
    public static final D5W A00 = D5W.A00;

    Float B1i();

    User BZ1();

    String BZ7();

    Float Byt();

    MediaVCRTappableDataIntf E7a(1E9 r1);

    MediaVCRTappableData F64(1E9 r1);

    MediaVCRTappableData F65(1E6 r1);

    TreeUpdaterJNI FHC();

    boolean getCanViewerLinkBackToOriginalMediaFromVcr();

    String getEndBackgroundColor();

    String getOriginalCommentId();

    String getOriginalCommentText();

    String getOriginalMediaId();

    String getStartBackgroundColor();

    String getTextColor();
}
