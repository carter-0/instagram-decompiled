package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mfy  reason: case insensitive filesystem */
public final class C66965Mfy implements C252243on, G87 {
    public N4P A00;
    public final 1wn A01 = C71932OtG.A00(this, 24);
    public final UserSession A02;
    public final C74470PvQ A03;
    public final C231002qi A04;
    public final 27S A05 = new Ot0(this, 7);

    public C66965Mfy(UserSession userSession, C74470PvQ pvQ, C231002qi r5) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = pvQ;
        this.A04 = r5;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void Dox() {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
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

    public final void DfM() {
        if (this.A03.isResumed()) {
            AnonymousClass1Nd.A00(this.A02).A01(this.A01, 2Kd.class);
        }
    }

    public final void DfN() {
        if (this.A03.isResumed()) {
            AnonymousClass1Nd.A00(this.A02).A02(this.A01, 2Kd.class);
        }
    }

    public final void Doy() {
        C74470PvQ pvQ = this.A03;
        if (pvQ.isResumed()) {
            AnonymousClass1Nd.A00(this.A02).A01(this.A01, 2Kd.class);
        }
        pvQ.Cfo();
    }

    public final void Doz() {
        this.A03.APp();
    }

    public final void onPause() {
        AnonymousClass1Nd.A00(this.A02).A02(this.A05, C290835g2.class);
    }

    public final void onResume() {
        AnonymousClass1Nd.A00(this.A02).A01(this.A05, C290835g2.class);
    }
}
