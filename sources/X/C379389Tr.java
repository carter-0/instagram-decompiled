package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: X.9Tr  reason: invalid class name and case insensitive filesystem */
public final class C379389Tr implements C370288w9 {
    public final /* synthetic */ AnonymousClass8L7 A00;

    public C379389Tr(AnonymousClass8L7 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.A5a] */
    public final /* bridge */ /* synthetic */ void DYh(Object obj) {
        Rect rect = (Rect) obj;
        AnonymousClass8L7 r1 = this.A00;
        C39684A5a a5a = null;
        r1.A01.A02 = null;
        C379379Tq r4 = r1.A00;
        if (r4 != null) {
            if (rect != null) {
                float centerX = (float) rect.centerX();
                ? obj2 = new Object();
                obj2.A00 = centerX;
                obj2.A01 = (float) rect.centerY();
                a5a = obj2;
            }
            r4.A04.add(a5a);
            AnonymousClass8L8 r3 = r4.A01.A00;
            r3.A00 = new C379459Tz(a5a, r4.A02, r4.A03);
            Bitmap bitmap = r4.A00;
            C3502784a r12 = r3.A01;
            r12.A01 = new AnonymousClass9U0(bitmap, r3);
            r12.A00 = new C370298wA(bitmap);
            r12.A00();
        }
    }
}
