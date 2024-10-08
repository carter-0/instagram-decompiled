package X;

import android.graphics.RectF;
import com.instagram.model.reels.Reel;

/* renamed from: X.PRz  reason: case insensitive filesystem */
public final class C72990PRz implements C59559JOf {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C72990PRz(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A01 = obj;
        this.A03 = obj2;
    }

    public final void CxA() {
        if (this.A00 != 0) {
            C239413Gj r4 = (C239413Gj) this.A04;
            String str = ((C270194gL) this.A01).A0e;
            str.getClass();
            Reel reel = (Reel) this.A02;
            C239413Gj.A06(r4, str, JTP.A0r(reel), DbS.A0q(this.A03));
            C239413Gj.A01(reel, AnonymousClass3BQ.IN_APP_NOTIFICATION, r4, (String) null, (String) null);
            return;
        }
        C66633Ma2.A0B((RectF) this.A01, (C74455PvA) this.A03, (C66633Ma2) this.A04, (AnonymousClass2Ep) this.A02);
    }
}
