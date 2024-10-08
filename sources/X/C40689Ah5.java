package X;

import android.net.Uri;

/* renamed from: X.Ah5  reason: case insensitive filesystem */
public final class C40689Ah5 implements C41797B1c {
    public final C41797B1c[] A00;

    public C40689Ah5(C41797B1c[] b1cArr) {
        0qQ.A0B(b1cArr, 1);
        this.A00 = (C41797B1c[]) b1cArr.clone();
    }

    public final C364808m2 BG5(Uri uri) {
        for (C41797B1c BG5 : this.A00) {
            C364808m2 BG52 = BG5.BG5(uri);
            if (BG52 != null) {
                return BG52;
            }
        }
        return null;
    }
}
