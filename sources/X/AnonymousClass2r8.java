package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.2r8  reason: invalid class name */
public final class AnonymousClass2r8 implements C252243on {
    public WeakReference A00;
    public final Activity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final void A00(String str, String str2) {
        0qQ.A0B(str, 0);
        1as r1 = 1as.A04;
        UserSession userSession = this.A03;
        FragmentActivity fragmentActivity = this.A01;
        0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        r1.A03(fragmentActivity, this.A02, userSession, str, str2, (String) null, C273654mx.A00(654), 1);
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

    public final void onResume() {
        C67809MvD mvD;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (mvD = (C67809MvD) weakReference.get()) != null) {
            mvD.A00();
        }
    }

    public AnonymousClass2r8(Activity activity, AnonymousClass0iw r2, UserSession userSession) {
        this.A01 = activity;
        this.A03 = userSession;
        this.A02 = r2;
    }
}
