package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UdH  reason: case insensitive filesystem */
public final class C15466UdH extends C331047Ph implements C231272rL, C228412ld, C231322rQ, AnonymousClass36F {
    public 1Xj A00;
    public C17698VcT A01;
    public boolean A02;
    public boolean A03;
    public AnonymousClass3W1 A04;
    public final UserSession A05;
    public final Context A06;
    public final AnonymousClass2s2 A07;
    public final GTP A08;
    public final AnonymousClass2kR A09;
    public final AnonymousClass4DU A0A;
    public final C15529UeI A0B;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2s2, java.lang.Object] */
    public C15466UdH(FragmentActivity fragmentActivity, AnonymousClass2kR r12, C19376WWr wWr, C19376WWr wWr2) {
        this.A09 = r12;
        this.A05 = r12.A01;
        Context context = r12.A00;
        this.A06 = context;
        AnonymousClass4DU r0 = r12.A02;
        this.A0A = r0;
        GTP gtp = new GTP(fragmentActivity, fragmentActivity, r12, true, true);
        this.A08 = gtp;
        C15529UeI ueI = new C15529UeI(r0, wWr, wWr2);
        this.A0B = ueI;
        ? obj = new Object();
        this.A07 = obj;
        C13990Tnq.A1I(this, gtp, ueI, obj, context.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_survey_thanks_vertical_margin));
    }

    public static final void A00(C15466UdH udH) {
        udH.A02 = true;
        udH.A06();
        udH.A08(udH.A0B, udH.A01);
        1Xj r2 = udH.A00;
        if (r2 != null) {
            udH.A09(udH.A08, r2, udH.BQr(r2));
            if (udH.A03) {
                udH.A08(udH.A07, (Object) null);
            }
            udH.A07();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final boolean AJb(1Xj r2) {
        0qQ.A0B(r2, 0);
        return r2.equals(this.A00);
    }

    public final AnonymousClass3W1 BQr(1Xj r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass3W1 r1 = this.A04;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass3W1 A18 = G9t.A18(r4);
        A18.A0O(1sy.A0N);
        A18.A0D(0);
        this.A04 = A18;
        return A18;
    }

    public final void Crn() {
        this.A02 = false;
    }

    public final void DQv(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
        A07();
    }

    public final void EU8(AnonymousClass310 r2) {
        0qQ.A0B(r2, 0);
        this.A08.A03(r2);
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A08.A03 = r2;
    }

    public final /* synthetic */ int BJU(String str) {
        return -1;
    }

    public final /* synthetic */ List CBH() {
        return new ArrayList();
    }

    public final boolean CRD() {
        return this.A02;
    }

    public final void Cs9(1Xj r2) {
        if (r2 != null) {
            this.A00 = r2;
        }
        0fE.A00(this, 308568685);
    }

    public final /* synthetic */ Object EDl(int i) {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void AV9() {
        A00(this);
    }

    public final void notifyDataSetChanged() {
        A00(this);
    }
}
