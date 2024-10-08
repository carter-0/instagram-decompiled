package X;

import android.graphics.RectF;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.FpB  reason: case insensitive filesystem */
public final class C51139FpB implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            Reel reel = (Reel) obj2;
            0qQ.A0B(reel, 0);
            C330367Mm r4 = (C330367Mm) this.A04;
            r4.A05.post(new C51550Fvw((RectF) this.A02, (AnonymousClass0iw) this.A01, r4, reel, (AnonymousClass3BQ) this.A03, this.A05, (String) null, (String) null, 0sn.A00));
            return;
        }
        if (!((C8918RFl) obj2).A01) {
            String str = this.A05;
            if (str.length() > 0) {
                ((T7R) this.A02).A04(new C50179FSl((C307896Rx) this.A01, (C277014uI) this.A04, (C277014uI) this.A03, str), (List) null, AnonymousClass7TE.A1I(str));
                return;
            }
        }
        DbS.A1R(AnonymousClass6Tm.A01, (C277014uI) this.A03, this.A01);
    }

    public C51139FpB(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A04 = obj3;
        this.A05 = str;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj4;
    }
}
