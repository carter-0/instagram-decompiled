package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OtJ  reason: case insensitive filesystem */
public final class C71935OtJ implements C252243on {
    public final long A00;
    public final AnonymousClass1aS A01 = 1aF.A00();
    public final AnonymousClass0eM A02;
    public final 1a8 A03 = C66581MXm.A0P();

    public final /* synthetic */ void ADC(View view) {
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

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void D6z(View view) {
        PU8.A00(((MYb) this.A02.getValue()).A0B.A0M(new C72004Oue(Long.valueOf(this.A00))), this.A03, this, 70);
    }

    public final void onPause() {
        this.A03.A02(C72120Owf.A02(this.A01, C74178PqK.A00(this, 6), 56), PTU.A00);
    }

    public final void onResume() {
        this.A03.A02(C72120Owf.A02(this.A01, C74178PqK.A00(this, 7), 56), PTV.A00);
    }

    public final void onStop() {
        this.A03.A01();
    }

    public C71935OtJ(UserSession userSession, long j) {
        this.A00 = j;
        this.A02 = AnonymousClass0eN.A00(0eO.A02, C73911Plm.A00(userSession, 10));
    }
}
