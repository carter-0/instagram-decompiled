package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.H0l  reason: case insensitive filesystem */
public final class C54141H0l extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "LockoutFragment";
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C51764G0g(this, 5));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C51764G0g(this, 6));
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C51764G0g(this, 7));
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final String getModuleName() {
        return "dogfooding_lockout";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final boolean onBackPressed() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        C54683HOo hOo;
        int A022 = AnonymousClass0fD.A02(1917041907);
        C54141H0l.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A02 = bundle2.getBoolean("com.instagram.release.lockout.disable_back_press", true);
            this.A00 = bundle2.getBoolean("com.instagram.release.lockout.expired_build", false);
        }
        boolean A032 = ((C2376138k) this.A04.getValue()).A03();
        this.A01 = A032;
        boolean z = this.A00;
        AnonymousClass39A r1 = (AnonymousClass39A) this.A05.getValue();
        if (z) {
            hOo = C54683HOo.PRESENT_STALE_BUILD_LOCKOUT_SCREEN;
        } else if (A032) {
            hOo = C54683HOo.PRESENT_PROD_LOCKOUT_SCREEN_NO_SNOOZE;
        } else {
            hOo = C54683HOo.PRESENT_PROD_LOCKOUT_SCREEN;
        }
        r1.A00(hOo);
        AnonymousClass0fD.A09(-148081326, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1549766711);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 23), -813392769);
        AnonymousClass0fD.A09(-173750079, A022);
        return A0H;
    }

    public final void onDestroyView() {
        AnonymousClass2ZP r1;
        int A022 = AnonymousClass0fD.A02(604424277);
        super.onDestroyView();
        Activity rootActivity = getRootActivity();
        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
            r1.Enj(0);
        }
        AnonymousClass0fD.A09(-154165670, A022);
    }

    public final void onStart() {
        AnonymousClass2ZP r1;
        int A022 = AnonymousClass0fD.A02(1408102525);
        C54141H0l.super.onStart();
        Activity rootActivity = getRootActivity();
        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
            r1.Enj(8);
        }
        AnonymousClass0fD.A09(-500217301, A022);
    }
}
