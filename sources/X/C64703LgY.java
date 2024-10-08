package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.LgY  reason: case insensitive filesystem */
public final class C64703LgY implements C252243on {
    public final UserSession A00;
    public final ClipsCreationViewModel A01;
    public final AnonymousClass8RL A02;
    public final AnonymousClass8RF A03;
    public final AnonymousClass861 A04;
    public final MXI A05;
    public volatile AnonymousClass51M A06;
    public volatile Integer A07;
    public volatile Integer A08;
    public volatile Integer A09;

    public C64703LgY(UserSession userSession, MXI mxi, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RL r5, AnonymousClass8RF r6, AnonymousClass861 r7) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A05 = mxi;
        this.A01 = clipsCreationViewModel;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = r7;
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

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A05.Eib(LY4.A00(this, 56));
    }
}
