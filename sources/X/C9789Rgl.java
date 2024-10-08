package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* renamed from: X.Rgl  reason: case insensitive filesystem */
public abstract class C9789Rgl {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Bitmap A00;
        Object A03 = r7.A03(0);
        0qQ.A0C(A03, C66579MXk.A00(0));
        Context context = ((C307786Rm) A03).A00;
        SCZ.A00 = r6;
        C308276Tl A0P = DbS.A0P();
        Uri uri = SOG.A06.A00;
        String str = null;
        if (!(uri == null || (A00 = SOG.A00(context, uri)) == null)) {
            ByteArrayOutputStream A0b = Pxe.A0b();
            0fO.A02(Bitmap.CompressFormat.JPEG, A00, A0b, 100);
            str = Base64.encodeToString(A0b.toByteArray(), 0);
        }
        A0P.A03(str, 0);
        SCZ.A00(A0P.A00(), 40);
        return null;
    }
}
