package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.35V  reason: invalid class name */
public final class AnonymousClass35V implements C61110lV, C252243on {
    public final AnonymousClass0eM A00;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onCreate() {
        Object value = this.A00.getValue();
        0qQ.A07(value);
        ((C2370236a) value).A03("MainFeedFragment.onCreate");
    }

    public final void onPause() {
        Object value = this.A00.getValue();
        0qQ.A07(value);
        ((C2370236a) value).A03("MainFeedFragment.onPause");
    }

    public final void onResume() {
        Object value = this.A00.getValue();
        0qQ.A07(value);
        ((C2370236a) value).A03("MainFeedFragment.onResume");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        14i.A03(15Y.A03, this);
    }

    public AnonymousClass35V(UserSession userSession) {
        this.A00 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LY(userSession, 38));
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-1708049740);
        Object value = this.A00.getValue();
        0qQ.A07(value);
        ((C2370236a) value).A03("MainFeedFragment.onAppBackgrounded");
        AnonymousClass0fD.A0A(12946900, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(1494567215);
        Object value = this.A00.getValue();
        0qQ.A07(value);
        ((C2370236a) value).A03("MainFeedFragment.onAppForegrounded");
        AnonymousClass0fD.A0A(-934438236, A03);
    }

    public final void onDestroyView() {
        14i.A06(this);
    }
}
