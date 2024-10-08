package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.365  reason: invalid class name */
public final class AnonymousClass365 implements C252243on {
    public HCA A00;
    public final UserSession A01;
    public final C228152ks A02;
    public final C227802jw A03;

    public AnonymousClass365(UserSession userSession, C228152ks r3, C227802jw r4) {
        0qQ.A0B(r3, 3);
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = r3;
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

    public final void onDestroyView() {
        C228152ks r2 = this.A02;
        0h9 r1 = this.A03.mLifecycleRegistry;
        0qQ.A07(r1);
        HCA hca = this.A00;
        if (hca != null) {
            r2.FJ2(hca);
            r1.A0A(hca);
            this.A00 = null;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C227802jw r2 = this.A03;
        2dZ A002 = 2dY.A00(r2.requireActivity());
        Activity rootActivity = r2.getRootActivity();
        boolean Cda = r2.Cda();
        C228152ks r7 = this.A02;
        0h9 r4 = r2.mLifecycleRegistry;
        0qQ.A07(r4);
        C227762js A032 = r2.A0A().A03();
        if (rootActivity != null && A002 != null && Cda) {
            View findViewById = rootActivity.findViewById(R.id.gradient_background);
            0qQ.A07(findViewById);
            C226112fe.A0B.A04(rootActivity, new C57430Iaa(rootActivity, r4, A032, (IgView) findViewById, r7, this, Cda), true);
        }
    }
}
