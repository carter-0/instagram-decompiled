package X;

import android.content.Context;
import com.instagram.api.schemas.AppstoreMetadataDict;

/* renamed from: X.HbW  reason: case insensitive filesystem */
public abstract class C55061HbW {
    public static final String A00(Context context, AppstoreMetadataDict appstoreMetadataDict) {
        String valueOf = String.valueOf(appstoreMetadataDict.Aeb());
        if (appstoreMetadataDict.BXF() == null) {
            return valueOf;
        }
        String A0u = DbV.A0u(context, valueOf, appstoreMetadataDict.BXF(), 2131952967);
        0qQ.A0A(A0u);
        return A0u;
    }
}
