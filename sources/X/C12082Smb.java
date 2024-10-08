package X;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: X.Smb  reason: case insensitive filesystem */
public final class C12082Smb implements C13708TfS {
    public final void CyG(Context context, Bitmap bitmap, String str) {
        if ("LOAD_PROPIC_FOR_PREVIEW".equals(str)) {
            C7375Q9j q9j = SCW.A01;
            if (q9j != null) {
                q9j.setImageBitmap(bitmap);
                SCW.A01.invalidate();
            }
            SCZ.A01("ON_LOCAL_MEDIA_FETCH_SUCCESS");
            SCW.A01(context, "LOAD_FRAME");
        } else if ("LOAD_FRAME".equals(str)) {
            SCW.A00 = bitmap;
            SCW.A00(context, bitmap);
        }
    }

    public final void DOI(String str, Throwable th) {
        th.printStackTrace();
        if ("LOAD_PROPIC_FOR_PREVIEW".equals(str)) {
            SCZ.A01("ON_LOCAL_MEDIA_FETCH_ERROR");
        }
    }
}
