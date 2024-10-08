package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.Lga  reason: case insensitive filesystem */
public final class C64704Lga implements C252243on {
    public Dialog A00;
    public final Context A01;
    public final UserSession A02;
    public final C60107Jfn A03;
    public final ClipsCreationViewModel A04;
    public final AnonymousClass8RL A05;
    public final AnonymousClass8RF A06;
    public final ClipsStackedTimelineViewController A07;
    public final AnonymousClass861 A08;

    public C64704Lga(Context context, UserSession userSession, ClipsStackedTimelineViewController clipsStackedTimelineViewController, C60107Jfn jfn, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RL r7, AnonymousClass8RF r8, AnonymousClass861 r9) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = context;
        this.A07 = clipsStackedTimelineViewController;
        this.A05 = r7;
        this.A04 = clipsCreationViewModel;
        this.A06 = r8;
        this.A03 = jfn;
        this.A08 = r9;
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

    public static final void A00(C64704Lga lga, int i) {
        lga.A06.A0G(new KM6(i, AnonymousClass05K.A0j));
        LRJ.A02.A02("Jump cut failed");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A07;
        ClipsTimelineActionBarViewController.A01(LY4.A00(this, 55), C62636KjH.A0P, clipsStackedTimelineViewController.A0C);
    }
}
