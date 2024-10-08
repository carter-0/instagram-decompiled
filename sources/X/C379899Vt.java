package X;

import android.graphics.Rect;
import java.util.HashMap;

/* renamed from: X.9Vt  reason: invalid class name and case insensitive filesystem */
public final class C379899Vt implements C370288w9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass84L A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C62320sa A05;

    public C379899Vt(AnonymousClass84L r1, String str, C62320sa r3, int i, int i2, int i3) {
        this.A03 = r1;
        this.A04 = str;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A05 = r3;
    }

    public final /* bridge */ /* synthetic */ void DYh(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Rect rect = (Rect) obj;
        AnonymousClass84L r2 = this.A03;
        r2.A01.A02 = null;
        if (rect != null) {
            HashMap hashMap = r2.A02;
            String str = this.A04;
            int i6 = this.A02;
            int i7 = this.A00;
            int i8 = this.A01;
            Rect A0W = AnonymousClass7TE.A0W();
            if (i8 != 0) {
                if (i8 == 90) {
                    i2 = rect.top;
                    A0W.left = i2;
                    i3 = i7 - rect.right;
                } else if (i8 != 180) {
                    if (i8 == 270) {
                        i2 = i6 - rect.bottom;
                        A0W.left = i2;
                        i3 = rect.left;
                    }
                    hashMap.put(str, A0W);
                } else {
                    A0W.left = rect.left;
                    A0W.top = (i7 - rect.top) - rect.height();
                    A0W.right = A0W.left + rect.width();
                    i4 = A0W.top;
                    i5 = rect.height();
                    i = i4 + i5;
                }
                A0W.top = i3;
                A0W.right = i2 + rect.height();
                i4 = A0W.top;
                i5 = rect.width();
                i = i4 + i5;
            } else {
                A0W.left = rect.left;
                A0W.top = rect.top;
                A0W.right = rect.right;
                i = rect.bottom;
            }
            A0W.bottom = i;
            hashMap.put(str, A0W);
        }
        this.A05.invoke();
    }
}
