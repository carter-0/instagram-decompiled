package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.35U  reason: invalid class name */
public final class AnonymousClass35U implements C252243on {
    public C2372036s A00;
    public final UserSession A01;
    public final AnonymousClass2rI A02;
    public final C228152ks A03;

    public AnonymousClass35U(UserSession userSession, AnonymousClass2rI r3, C228152ks r4) {
        0qQ.A0B(r4, 3);
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r4;
    }

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

    public final void onCreate() {
        if (182.A06(0Tu.A05, this.A01, 2342154346361258492L)) {
            int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            02m r2 = 02m.A0p;
            0qQ.A07(r2);
            C2372036s r1 = new C2372036s(r2, AnonymousClass2kO.A00.getModuleName());
            this.A00 = r1;
            this.A02.mViewLifecycleListener = r1;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C2372036s r1 = this.A00;
        if (r1 != null) {
            this.A03.EBt(r1);
        }
    }
}
