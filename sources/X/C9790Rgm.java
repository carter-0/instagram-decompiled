package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* renamed from: X.Rgm  reason: case insensitive filesystem */
public abstract class C9790Rgm {
    public static Object A00(C307896Rx r5) {
        String A0c;
        C308276Tl A0P;
        Bitmap A00;
        Context context = C308206Td.A09(r5).A00;
        SCZ.A00 = r5;
        SOG sog = SOG.A06;
        if (sog.A04) {
            A0P = DbS.A0P();
            Uri uri = sog.A01;
            if (uri == null) {
                uri = sog.A00;
            }
            A0c = null;
            if (!(uri == null || (A00 = SOG.A00(context, uri)) == null)) {
                ByteArrayOutputStream A0b = Pxe.A0b();
                0fO.A02(Bitmap.CompressFormat.JPEG, A00, A0b, 100);
                A0c = Base64.encodeToString(A0b.toByteArray(), 0);
            }
        } else {
            Uri uri2 = sog.A01;
            if (uri2 == null && (uri2 = sog.A00) == null) {
                A0c = null;
            } else {
                AnonymousClass6QE r0 = AnonymousClass6QE.A02;
                A0c = Pxi.A0c(uri2);
            }
            A0P = DbS.A0P();
        }
        A0P.A01(A0c);
        SCZ.A00(A0P.A00(), 36);
        return null;
    }
}
