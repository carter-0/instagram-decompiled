package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Hm  reason: invalid class name and case insensitive filesystem */
public final class C353408Hm extends C353418Hn {
    public String A00;
    public final C352888Fl A01;
    public final C3508086k A02;
    public final AnonymousClass8DD A03;
    public final UserSession A04;
    public final C3496881i A05;

    public final void Ds2() {
        this.A00 = null;
        if (!A03() || this.A00) {
            ARR();
        } else {
            DWr();
        }
    }

    public final void APG() {
        String str;
        AnonymousClass87G A0D;
        if (this.A00 == null) {
            AnonymousClass8DD r0 = this.A03;
            if (r0 == null || (A0D = r0.A0D()) == null) {
                str = null;
            } else {
                str = A0D.getId();
            }
            this.A00 = str;
        }
        C342057ny.A00(new C40810Ajg(this));
    }

    public final void ARR() {
        C342057ny.A00(new C40811Ajh(this));
    }

    public final void DI7() {
        C340297l2 r0 = this.A05.A02;
        if (r0 != null) {
            C41842B2x b2x = r0.A04;
            if (b2x != null) {
                b2x.D5c();
            }
            this.A00 = false;
        }
    }

    public final void DWr() {
        C340297l2 r1 = this.A05.A02;
        if (r1 != null) {
            C340297l2.A05(C390989sA.A03, r1);
        }
        this.A00 = true;
        ARR();
    }

    public C353408Hm(Context context, UserSession userSession, C352888Fl r3, C3508086k r4, AnonymousClass8DD r5, C3496881i r6) {
        super(userSession, context);
        this.A04 = userSession;
        this.A05 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }
}
