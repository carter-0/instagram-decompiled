package X;

import android.os.Bundle;
import android.os.Handler;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.registration.model.RegFlowExtras;
import java.io.IOException;
import java.util.List;

/* renamed from: X.Fdc  reason: case insensitive filesystem */
public final class C50516Fdc implements G8H {
    public final IgFragmentActivity A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass0iw A02;
    public final C49662F0t A03;
    public final Handler A04 = AnonymousClass7TF.A0D();
    public final EEM A05;
    public final F23 A06;

    public C50516Fdc(IgFragmentActivity igFragmentActivity, AnonymousClass4DH r3, AnonymousClass0iw r4, C49662F0t f0t, EEM eem, F23 f23) {
        AnonymousClass7TF.A1D(r4, 3, igFragmentActivity);
        this.A01 = r3;
        this.A03 = f0t;
        this.A02 = r4;
        this.A00 = igFragmentActivity;
        this.A05 = eem;
        this.A06 = f23;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void Cta(String str, String str2) {
        String str3;
        1P0 em9;
        1OC A0D;
        String str4 = str2;
        0qQ.A0B(str4, 1);
        C49662F0t f0t = this.A03;
        String A002 = A00(f0t);
        ? r3 = this.A00;
        String A003 = 0qv.A00(r3);
        0qQ.A07(A003);
        String A0s = DbT.A0s(r3);
        0qQ.A07(A0s);
        try {
            str3 = FH2.A01(r3, f0t.A02, f0t.A04, AnonymousClass05K.A01);
        } catch (IOException unused) {
            str3 = null;
        }
        C60937Jtv jtv = f0t.A03;
        Integer num = jtv.A01;
        int intValue = num.intValue();
        if (intValue == 9 || intValue == 7 || intValue == 6) {
            AnonymousClass0aP r11 = f0t.A02;
            C46634DiE diE = f0t.A04;
            em9 = new EM9(r3, this.A02, r11, this, diE, AnonymousClass05K.A0C, A002);
            String str5 = str4;
            A0D = FHA.A0D(r11, str3, A003, (String) null, (String) null, A0s, A01(f0t), str5, A002, (List) null, FGv.A00());
        } else if (intValue == 1) {
            AnonymousClass0aP r10 = f0t.A02;
            em9 = new C47907EMb(this.A01, this.A02, r10, this, f0t.A04, A002, jtv.A04);
            A0D = FHA.A04(r3, r10, A01(f0t), A002, str4);
        } else {
            throw DbW.A0c("Invalid account source ", C49774F6h.A01(num));
        }
        A0D.A00 = em9;
        r3.schedule(A0D);
    }

    public final /* synthetic */ void DPh(F2Z f2z) {
        f2z.A00(false);
    }

    public final void DmU(C49708F2t f2t) {
        0qQ.A0B(f2t, 0);
        this.A06.A00(f2t, (String) null);
    }

    public final void Dmd(AnonymousClass0aP r3, C47361Dvv dvv) {
        0qQ.A0B(r3, 0);
        this.A04.post(new C51465FuZ(r3, dvv, this));
    }

    public static final String A00(C49662F0t f0t) {
        C60937Jtv jtv = f0t.A03;
        Integer num = jtv.A01;
        int intValue = num.intValue();
        if (intValue == 9 || intValue == 7 || intValue == 6) {
            Object obj = jtv.A02;
            0qQ.A0C(obj, Pxd.A00(93));
            return ((C15050ULg) obj).A01;
        } else if (intValue == 1) {
            Object obj2 = jtv.A02;
            0qQ.A0C(obj2, Pxd.A00(92));
            return ((QP8) obj2).A04;
        } else {
            throw DbW.A0c("Invalid account source ", C49774F6h.A01(num));
        }
    }

    public static final String A01(C49662F0t f0t) {
        C60937Jtv jtv = f0t.A03;
        Integer num = jtv.A01;
        int intValue = num.intValue();
        if (intValue == 9 || intValue == 7 || intValue == 6) {
            Object obj = jtv.A02;
            0qQ.A0C(obj, Pxd.A00(93));
            return ((C15050ULg) obj).A00;
        } else if (intValue == 1) {
            Object obj2 = jtv.A02;
            0qQ.A0C(obj2, Pxd.A00(92));
            return ((QP8) obj2).A01;
        } else {
            throw DbW.A0c("Invalid account source ", C49774F6h.A01(num));
        }
    }

    public final void DTb() {
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        IgFragmentActivity igFragmentActivity = this.A00;
        0qQ.A0C(igFragmentActivity, "null cannot be cast to non-null type com.instagram.multipleaccounts.delegate.MultipleAccountsDelegate");
        regFlowExtras.A04 = ((G7B) igFragmentActivity).BKa();
        DbW.A0X();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        DbS.A1A(A0a, "IgSessionManager.LOGGED_OUT_TOKEN");
        E3Y e3y = new E3Y();
        e3y.setArguments(A0a);
        C49958FGq.A07(e3y, igFragmentActivity.getSupportFragmentManager(), "android.nux.ContactPointTriageFragment");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    public final void DjB() {
        ? r2 = this.A00;
        C49662F0t f0t = this.A03;
        1OC A022 = FHA.A02(r2, f0t.A02, f0t.A03.A03);
        A022.A00 = new EDF(r2);
        r2.schedule(A022);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    public final void DjC() {
        ? r5 = this.A00;
        C49662F0t f0t = this.A03;
        AnonymousClass0aP r0 = f0t.A02;
        String A002 = A00(f0t);
        String A003 = 0qv.A00(r5);
        String A0s = DbT.A0s(r5);
        1NY A0N = DbU.A0N(r0);
        A0N.A0A("accounts/send_password_reset/");
        Dbb.A1L(A0N, DcV.A01(), A002, A003, A0s);
        1OC A0N2 = DbY.A0N(A0N, DwE.class, F6D.class);
        A0N2.A00 = new EDF(r5);
        r5.schedule(A0N2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    public final void DjD() {
        ? r1 = this.A00;
        C49662F0t f0t = this.A03;
        r1.schedule(FHA.A00(r1, f0t.A02, (Boolean) null, (Boolean) null, f0t.A03.A03, (String) null, false, false));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    public final void Dme() {
        C49662F0t f0t = this.A03;
        String valueOf = String.valueOf(f0t.A03.A03);
        AnonymousClass0aP r3 = f0t.A02;
        EQR eqr = new EQR(this.A01, r3);
        ? r1 = this.A00;
        1OC A012 = FHA.A01(r1, r3, AnonymousClass05K.A0Y, valueOf);
        A012.A00 = eqr;
        r1.schedule(A012);
    }

    public final void DOw() {
        FV8 A002 = FV8.A00();
        AnonymousClass0aP r5 = this.A03.A02;
        boolean A042 = A002.A04(r5, "ig_android_growth_FX_access_fbig_create_cp_claiming", "AymhLoginFailureDelegate");
        EEM eem = this.A05;
        if (A042) {
            eem.A0B(r5, FV8.A00().A01(r5, "ig_android_growth_FX_access_fbig_create_cp_claiming", "AymhLoginFailureDelegate"), FV8.A00().A02(r5, "ig_android_growth_FX_access_fbig_create_cp_claiming", "AymhLoginFailureDelegate"), true);
        } else {
            eem.A07();
        }
    }
}
