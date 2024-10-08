package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.NgT  reason: case insensitive filesystem */
public final class C69180NgT extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EncryptedBackupsFishfoodingFragment";
    public final C70944OSr A00 = new C70944OSr(true);
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131962488);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Dba.A15(getViewLifecycleOwner(), C66583MXo.A0S(this).A00, new C74193PqZ(this, 31), 24);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C69180NgT() {
        C73904Plf plf = new C73904Plf(this, 7);
        C73904Plf plf2 = new C73904Plf(this, 9);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C73904Plf.A00(plf2, r7, 10);
        this.A01 = DbS.A0I(new C73904Plf(A002, 11), plf, new C73664Phd(37, A002, (Object) null), DbS.A0z(C60096Jfc.class));
        C73904Plf plf3 = new C73904Plf(this, 15);
        AnonymousClass0eM A003 = C73904Plf.A00(new C73904Plf(this, 12), r7, 13);
        this.A04 = DbS.A0I(new C73904Plf(A003, 14), plf3, new C73664Phd(38, A003, (Object) null), DbS.A0z(C67754Mu9.class));
        this.A02 = AnonymousClass0eN.A01(new C73904Plf(this, 8));
    }

    public final void afterOnViewCreated() {
        DbZ.A1C(this, new MGY(this, (AnonymousClass4D7) null, 33), C66583MXo.A0S(this).A09);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(864558626);
        C69180NgT.super.onStart();
        C67754Mu9 A0S = C66583MXo.A0S(this);
        A0S.A07.A05(AnonymousClass05K.A0Y);
        A0S.A04.A02(C72120Owf.A00(A0S.A02, A0S, 5), C73006PSp.A00);
        AnonymousClass0fD.A09(-636705251, A022);
    }
}
