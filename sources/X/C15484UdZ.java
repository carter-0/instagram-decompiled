package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UdZ  reason: case insensitive filesystem */
public final class C15484UdZ extends 2Ru implements C231322rQ, AnonymousClass36F {
    public 1Xj A00;
    public AnonymousClass3W1 A01;
    public boolean A02;
    public final Context A03;
    public final AnonymousClass2s2 A04;
    public final UserSession A05;
    public final GTP A06;
    public final AnonymousClass2kR A07;
    public final AnonymousClass4DU A08;
    public final C15531UeK A09;
    public final C20988X8e A0A;
    public final AnonymousClass71T A0B;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2s0, X.2s2, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15484UdZ(FragmentActivity fragmentActivity, AnonymousClass2kR r13, XCB xcb, C20988X8e x8e) {
        super(false);
        AnonymousClass7TG.A1Q(r13, x8e);
        this.A07 = r13;
        this.A0A = x8e;
        Context context = r13.A00;
        this.A03 = context;
        UserSession userSession = r13.A01;
        this.A05 = userSession;
        AnonymousClass4DU r3 = r13.A02;
        this.A08 = r3;
        ? obj = new Object();
        this.A04 = obj;
        AnonymousClass71T r1 = new AnonymousClass71T(context);
        this.A0B = r1;
        GTP gtp = new GTP(fragmentActivity, fragmentActivity, r13, true, true);
        this.A06 = gtp;
        C15531UeK ueK = new C15531UeK(r3, userSession, xcb);
        this.A09 = ueK;
        x8e.Epa();
        init(new C231642s0[]{obj, r1, gtp, ueK});
    }

    public static final void A00(C15484UdZ udZ) {
        C3253572b r3;
        Object obj;
        C231642s0 r0;
        udZ.A02 = true;
        udZ.clear();
        udZ.addModel((Object) null, udZ.A04);
        if (udZ.isEmpty()) {
            C20988X8e x8e = udZ.A0A;
            r3 = x8e.Afm();
            obj = x8e.B0w();
            r0 = udZ.A0B;
        } else {
            1Xj r2 = udZ.A00;
            if (r2 != null) {
                udZ.addModel(r2, udZ.BQr(r2), udZ.A06);
                C46292DTv A032 = C254423sS.A03(r2);
                if (A032 != null) {
                    r3 = new 0eP(r2, A032);
                    obj = C60340gF.A00;
                    r0 = udZ.A09;
                }
            }
            udZ.notifyDataSetChanged();
        }
        udZ.addModel(r3, obj, r0);
        udZ.notifyDataSetChanged();
    }

    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final boolean AJb(1Xj r2) {
        0qQ.A0B(r2, 0);
        return 0qQ.A0K(this.A00, r2);
    }

    public final AnonymousClass3W1 BQr(1Xj r3) {
        0qQ.A0B(r3, 0);
        AnonymousClass3W1 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3W1 A18 = G9t.A18(r3);
        A18.A0D(0);
        this.A01 = A18;
        return A18;
    }

    public final void Crn() {
        this.A02 = false;
    }

    public final void EU8(AnonymousClass310 r2) {
        0qQ.A0B(r2, 0);
        this.A06.A03(r2);
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A06.A03 = r2;
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

    public final /* synthetic */ Object EDl(int i) {
        return null;
    }

    public final boolean isEmpty() {
        return DbW.A1a(this.A00);
    }

    public final void AV9() {
        A00(this);
    }

    public final void Cs9(1Xj r1) {
        notifyDataSetChanged();
    }

    public final void DQv(1Xj r1) {
        A00(this);
    }
}
