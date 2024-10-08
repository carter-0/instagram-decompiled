package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9gF  reason: invalid class name and case insensitive filesystem */
public final class C383779gF extends C16746V4d {
    public final /* synthetic */ C18078Vl7 A00;
    public final /* synthetic */ C357638Yz A01;
    public final /* synthetic */ C353438Hq A02;

    public final void A0B(V2D v2d) {
        W0T A002;
        if (v2d instanceof C383759gD) {
            C353438Hq.A02(this.A00, this.A02, true);
        } else if (v2d instanceof C383769gE) {
            C353438Hq.A02(this.A00, this.A02, false);
        } else if (v2d instanceof C15179UUe) {
            C353438Hq r2 = this.A02;
            if (!r2.A09.A0Y() && (A002 = C353438Hq.A00(r2)) != null && A002.A0I()) {
                A002.A06();
                r2.DWr();
                A002.A0D(false);
            }
        }
    }

    public C383779gF(C18078Vl7 vl7, C357638Yz r2, C353438Hq r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = vl7;
    }

    public final void A00() {
        C353438Hq r7 = this.A02;
        r7.A05();
        r7.A04();
        this.A01.A03 = true;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - r7.A00 > 1800000) {
            r7.A00 = currentTimeMillis;
            this.A00.A0B.E2t();
        }
    }

    public final void A05() {
        this.A02.A06(false);
    }

    public final void A06() {
        C353438Hq r2 = this.A02;
        W0T A002 = C353438Hq.A00(r2);
        if (A002 != null && A002.A0I()) {
            if (r2.A09.A0Y()) {
                C342057ny.A00(new C40813Ajj(r2));
            } else {
                A002.A06();
                r2.DWr();
            }
        }
        this.A01.A03 = false;
    }

    public final void A07() {
        C353438Hq r5 = this.A02;
        UserSession userSession = r5.A08;
        Context context = r5.A07;
        if (C362988ir.A01(context.getApplicationContext(), userSession)) {
            1pd.A00(C362988ir.A00()).A00(context, userSession, new C40618Afg(r5, 2), "GlassesStoryViewListener_STREAM_STARTING_CALLBACK_ID");
        }
    }
}
