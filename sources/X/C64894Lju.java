package X;

import android.graphics.Rect;
import java.util.Map;

/* renamed from: X.Lju  reason: case insensitive filesystem */
public final class C64894Lju implements C250603lj {
    public final Rect A00 = AnonymousClass7TE.A0W();
    public final LS8 A01;

    public final void ATF(AnonymousClass30Y r10, C252093oY r11) {
        float f;
        int i;
        int i2;
        Map map;
        boolean A1U = AnonymousClass7TF.A1U(0, r10, r11);
        float CFe = r11.CFe(r10);
        Object obj = r10.A03;
        L9E l9e = (L9E) obj;
        if (l9e instanceof KUT) {
            f = 0.8f;
        } else {
            f = l9e.A00;
        }
        float A02 = CFe + (1.0f - C229632nm.A02(f, 0.5f, 1.0f));
        Rect rect = this.A00;
        r11.B9a(rect, r10);
        int intValue = r11.CEk(r10).intValue();
        LS8 ls8 = this.A01;
        if (intValue == 0) {
            0qQ.A06(obj);
            i = rect.top;
            i2 = rect.left;
            map = ls8.A06;
            map.put(l9e, new L8J(ls8, A02, i, i2));
        } else if (intValue != A1U) {
            0qQ.A06(obj);
            ls8.A06.remove(l9e);
        } else {
            0qQ.A06(obj);
            i = rect.top;
            i2 = rect.left;
            map = ls8.A06;
            L8J l8j = (L8J) map.get(l9e);
            if (l8j != null) {
                if (l8j.A00 != A02 || l8j.A02 != i || l8j.A01 != i2) {
                    l8j.A00 = A02;
                    l8j.A02 = i;
                    l8j.A01 = i2;
                } else {
                    return;
                }
            }
            map.put(l9e, new L8J(ls8, A02, i, i2));
        }
        ls8.A01.sendEmptyMessage(0);
    }

    public C64894Lju(LS8 ls8) {
        this.A01 = ls8;
    }
}
