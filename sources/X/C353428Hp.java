package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Hp  reason: invalid class name and case insensitive filesystem */
public final class C353428Hp extends C353418Hn {
    public final C352888Fl A00;
    public final C3508086k A01;
    public final AnonymousClass8DD A02;
    public final C3496881i A03;

    public final void APG() {
    }

    public final void ARR() {
        C342057ny.A00(new C40812Aji(this));
    }

    public final void DI7() {
        C340297l2 r0 = this.A03.A02;
        if (r0 != null) {
            C41842B2x b2x = r0.A04;
            if (b2x != null) {
                b2x.D5c();
            }
            this.A00 = false;
        }
    }

    public final void DWr() {
        C340297l2 r1 = this.A03.A02;
        if (r1 != null) {
            C340297l2.A05(C390989sA.A03, r1);
        }
        this.A00 = true;
        ARR();
    }

    public C353428Hp(Context context, UserSession userSession, C352888Fl r3, C3508086k r4, AnonymousClass8DD r5, C3496881i r6) {
        super(userSession, context);
        this.A03 = r6;
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = r4;
    }

    public final void Ds2() {
        if (!A03() || this.A00) {
            ARR();
        } else {
            DWr();
        }
    }
}
