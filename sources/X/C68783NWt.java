package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;

/* renamed from: X.NWt  reason: case insensitive filesystem */
public final class C68783NWt extends C392289uY {
    public C70455O7g A00;
    public final long A01;
    public final 1a8 A02;
    public final UserSession A03;
    public final C70844ONw A04;
    public final C69342Njh A05;
    public final C69355Nju A06;
    public final Long A07;
    public final Long A08;
    public final String A09;
    public final String A0A;
    public final C70454O7f A0B;
    public final C69323NjO A0C;
    public final C69342Njh A0D;
    public final C69324NjP A0E;
    public final AnonymousClass7ZA A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public C68783NWt(1a8 r3, UserSession userSession, C70844ONw oNw, C70454O7f o7f, C69323NjO njO, C69342Njh njh, C69342Njh njh2, C69324NjP njP, C69355Nju nju, AnonymousClass7ZA r12, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        0qQ.A0B(nju, 5);
        0qQ.A0B(oNw, 17);
        C66581MXm.A1P(r3, 18, o7f);
        this.A03 = userSession;
        this.A01 = j;
        this.A0J = str;
        this.A0I = str2;
        this.A06 = nju;
        this.A07 = l;
        this.A0G = str3;
        this.A09 = str4;
        this.A05 = njh;
        this.A08 = l2;
        this.A0H = str5;
        this.A0A = str6;
        this.A0D = njh2;
        this.A0C = njO;
        this.A0E = njP;
        this.A0F = r12;
        this.A04 = oNw;
        this.A02 = r3;
        this.A0B = o7f;
    }

    public final View A06(Context context) {
        C69342Njh njh;
        0qQ.A0B(context, 0);
        ViewStub viewStub = new ViewStub(context);
        String str = this.A0J;
        String str2 = this.A0I;
        String str3 = this.A0G;
        if (this.A06 == C69355Nju.UNSEND_NUX_BANNER) {
            njh = C69342Njh.PRIMARY;
        } else {
            njh = this.A05;
        }
        String str4 = this.A0H;
        C70455O7g o7g = new C70455O7g(viewStub, this.A0C, njh, this.A0D, new PIC(this), str, str2, str3, str4);
        this.A00 = o7g;
        C71662eb r1 = o7g.A00;
        if (r1.A04()) {
            View A012 = r1.A01();
            0qQ.A0A(A012);
            return A012;
        }
        ViewStub viewStub2 = r1.A01;
        if (viewStub2 != null) {
            return viewStub2;
        }
        throw AnonymousClass7TE.A0z("ViewStubHolder#getViewStub should not return null.\nUnderlying private field 'mViewStub' is internally managed by ViewStubHolder and can be\nset to null regardless of the fact that we initially passed a non-null constructor param value.");
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r6, boolean z) {
        0qQ.A0B(puH, 1);
        C70454O7f o7f = this.A0B;
        C69355Nju nju = this.A06;
        0qQ.A0B(nju, 0);
        C70030Nw8 nw8 = C70030Nw8.$redex_init_class;
        if (nju.ordinal() == 11) {
            1Au.A00(o7f.A00);
            puH.onFailure();
            return;
        }
        puH.DoM(this);
    }

    public final void A04(boolean z) {
        C70455O7g o7g = this.A00;
        if (o7g != null) {
            if (!A05() && !z) {
                C70948OSv.A01.A04(this.A03, this.A01);
                1a8 r3 = this.A02;
                C70844ONw oNw = this.A04;
                r3.A02(oNw.A00(this.A0E), PTP.A00);
                r3.A02(oNw.A01(this.A06), PTQ.A00);
            }
            o7g.A00.A03(0);
        }
    }

    public final boolean A05() {
        View view;
        C70455O7g o7g = this.A00;
        if (o7g == null) {
            return false;
        }
        C71662eb r1 = o7g.A00;
        if (r1.A04()) {
            view = r1.A01();
            0qQ.A0A(view);
        } else {
            view = r1.A01;
            if (view == null) {
                throw AnonymousClass7TE.A0z("ViewStubHolder#getViewStub should not return null.\nUnderlying private field 'mViewStub' is internally managed by ViewStubHolder and can be\nset to null regardless of the fact that we initially passed a non-null constructor param value.");
            }
        }
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }
}
