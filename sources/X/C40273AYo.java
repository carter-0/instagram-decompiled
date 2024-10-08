package X;

import android.graphics.Bitmap;

/* renamed from: X.AYo  reason: case insensitive filesystem */
public final class C40273AYo implements 1NU {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass8QA A01;

    public C40273AYo(Bitmap bitmap, AnonymousClass8QA r2) {
        this.A01 = r2;
        this.A00 = bitmap;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        1GK r4 = (1GK) obj;
        0qQ.A0B(r4, 0);
        AnonymousClass8QA r2 = this.A01;
        Bitmap bitmap = this.A00;
        if (r2.A04) {
            r2.A0M.offer(bitmap);
        } else {
            bitmap.recycle();
        }
        Object A07 = r4.A07();
        0qQ.A0A(A07);
        return A07;
    }
}
