package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7bS  reason: invalid class name and case insensitive filesystem */
public final class C334537bS implements C252243on, C234052wu {
    public C249763kK A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final 1Ng A03;
    public final 1wn A04 = new C334597bY(this);
    public final 1wn A05 = new C334557bU(this);
    public final 1wn A06 = new C334547bT(this);
    public final 1wn A07 = new C334567bV(this);
    public final 1wn A08 = new C334627bb(this);
    public final 1wn A09 = new C334577bW(this);
    public final 1wn A0A = new C334617ba(this);
    public final 1wn A0B = new C334647bd(this);
    public final 1wn A0C = new C334607bZ(this);
    public final 1wn A0D = new C334587bX(this);
    public final UserSession A0E;
    public final C334637bc A0F = new C334637bc(this);
    public final AnonymousClass4DU A0G;

    public C334537bS(Fragment fragment, UserSession userSession, AnonymousClass4DU r4) {
        0qQ.A0B(userSession, 3);
        this.A01 = fragment;
        this.A0G = r4;
        this.A0E = userSession;
        this.A02 = fragment.requireActivity();
        this.A03 = AnonymousClass1Nd.A00(userSession);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final void A00() {
        1Ng r2 = this.A03;
        r2.A02(this.A0B, C240213Ka.class);
        r2.A02(this.A0A, C240223Kb.class);
        r2.A02(this.A08, C240233Kc.class);
        r2.A02(this.A07, C240243Kd.class);
        r2.A02(this.A0C, C240253Ke.class);
        r2.A02(this.A04, C240263Kf.class);
        r2.A02(this.A0D, C240273Kg.class);
        r2.A02(this.A09, C240283Kh.class);
        r2.A02(this.A06, C240303Kj.class);
        r2.A02(this.A05, C240323Kl.class);
        r2.A02(this.A0F, C240343Kn.class);
    }

    public final void onResume() {
        1Ng r2 = this.A03;
        r2.A01(this.A0B, C240213Ka.class);
        r2.A01(this.A0A, C240223Kb.class);
        r2.A01(this.A08, C240233Kc.class);
        r2.A01(this.A07, C240243Kd.class);
        r2.A01(this.A0C, C240253Ke.class);
        r2.A01(this.A04, C240263Kf.class);
        r2.A01(this.A0D, C240273Kg.class);
        r2.A01(this.A09, C240283Kh.class);
        r2.A01(this.A06, C240303Kj.class);
        r2.A01(this.A05, C240323Kl.class);
        r2.A01(this.A0F, C240343Kn.class);
    }

    public final void onDestroy() {
        A00();
    }

    public final void onPause() {
        A00();
    }
}
