package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class GAS implements C230532pm {
    public final C230532pm A00;
    public final C230562pp A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.GV0, X.2po, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.2uc, java.lang.Object] */
    public GAS(UserSession userSession, AnonymousClass4DU r11, C231332rR r12) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        ? obj = new Object();
        0Tu r3 = 0Tu.A05;
        boolean A06 = 182.A06(r3, userSession, 36315829683883583L);
        boolean A062 = 182.A06(r3, userSession, 36315829683949120L);
        if (A06 || A062) {
            obj.A00 = new C232872ua(userSession, new Object(), new C52497GUz(userSession2, false, false, A06, A062), r11);
        }
        C230562pp r1 = new C230562pp(obj);
        this.A01 = r1;
        this.A00 = new C230572pq(userSession, r1, r11, (C228402lc) r12);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DMB(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A00.DMB(r2);
    }

    public final void DMS(1Xj r2, int i) {
        0qQ.A0B(r2, 0);
        this.A00.DMS(r2, i);
    }

    public final void DMV(View view, 1Xj r3, double d) {
        0qQ.A0B(r3, 0);
        this.A00.DMV(view, r3, d);
    }

    public final void Duz(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A00.Duz(r2);
    }

    public final void Dv0(0jB r7, 1Xj r8, int i, int i2, int i3) {
        this.A00.Dv0((0jB) null, r8, i, i2, i3);
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

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void ChV(1Xj r8, 1Xj r9, 1Xj r10, int i, int i2, int i3) {
        this.A00.ChV(r8, r9, r10, i, i2, i3);
    }
}
