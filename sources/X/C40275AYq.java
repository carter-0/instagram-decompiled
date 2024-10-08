package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.AYq  reason: case insensitive filesystem */
public final class C40275AYq implements 1NU {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass8QA A01;
    public final /* synthetic */ C354998Oe A02;
    public final /* synthetic */ String A03;

    public C40275AYq(Bitmap bitmap, AnonymousClass8QA r2, C354998Oe r3, String str) {
        this.A01 = r2;
        this.A00 = bitmap;
        this.A03 = str;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        1GK r6 = (1GK) obj;
        0qQ.A0B(r6, 0);
        File file = (File) r6.A07();
        AnonymousClass8QA r4 = this.A01;
        Bitmap bitmap = this.A00;
        if (r4.A04) {
            r4.A0M.offer(bitmap);
        } else {
            bitmap.recycle();
        }
        String str = this.A03;
        HashMap hashMap = r4.A0H.A00;
        if (!hashMap.containsKey(str)) {
            return null;
        }
        Object obj2 = hashMap.get(str);
        if (obj2 != null) {
            C354998Oe r1 = this.A02;
            C354988Od r0 = ((C366678pU) obj2).A01.A01;
            if (r0 == null) {
                throw AnonymousClass7TE.A0y();
            } else if (!0qQ.A0K(r1, r0.A00)) {
                return null;
            } else {
                r4.A0K.put(str, Uri.fromFile(file).toString());
                return null;
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }
}
