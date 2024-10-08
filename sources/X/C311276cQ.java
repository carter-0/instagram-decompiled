package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6cQ  reason: invalid class name and case insensitive filesystem */
public final class C311276cQ implements C252243on {
    public boolean A00;
    public final C310016aI A01;
    public final C273384mU A02;
    public final C229382nI A03;
    public final 1wn A04 = new C311286cR(this);
    public final UserSession A05;

    public C311276cQ(C229382nI r2, UserSession userSession, C310016aI r4, C273384mU r5) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 4);
        this.A03 = r2;
        this.A05 = userSession;
        this.A02 = r5;
        this.A01 = r4;
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

    public final void onResume() {
        this.A00 = false;
        AnonymousClass1Nd.A00(this.A05).A01(this.A04, C57061INb.class);
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onPause() {
        AnonymousClass1Nd.A00(this.A05).A02(this.A04, C57061INb.class);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C229382nI r0 = this.A03;
        r0.A01.put(R.id.story_bloks_sticker_controller, new C313186g1(this));
    }
}
