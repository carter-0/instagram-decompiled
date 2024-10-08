package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.364  reason: invalid class name */
public final class AnonymousClass364 implements C252243on, C252223ol {
    public AnonymousClass3KQ A00;
    public final UserSession A01;
    public final AnonymousClass2rI A02;
    public final C227802jw A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new AnonymousClass9LY(this, 41));

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

    public final Integer BQo() {
        return AnonymousClass05K.A00;
    }

    public final String BjP() {
        1Xj A06 = this.A03.A06();
        if (A06 != null) {
            return A06.A0C.getLoggingInfoToken();
        }
        return null;
    }

    public final String getMediaId() {
        1Xj A022;
        AnonymousClass2rI r1 = this.A02;
        int A023 = r1.A02(-1);
        if (A023 < 0 || (A022 = 1Xi.A02(r1.A03(A023).A05)) == null) {
            return null;
        }
        return A022.getId();
    }

    public final void onPause() {
        AnonymousClass0eM r2 = this.A04;
        ((AnonymousClass3KG) r2.getValue()).A06(this.A00);
        ((AnonymousClass3KG) r2.getValue()).A04();
        this.A00 = null;
    }

    public final void onResume() {
        AnonymousClass0eM r4 = this.A04;
        ((AnonymousClass3KG) r4.getValue()).A03();
        r4.getValue();
        this.A00 = AnonymousClass3KG.A00(new AnonymousClass3KM(this.A03, this.A01, AnonymousClass2kO.A00, this));
        AnonymousClass3KG r1 = (AnonymousClass3KG) r4.getValue();
        AnonymousClass3KQ r0 = this.A00;
        if (r0 != null) {
            r1.A05(r0);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass364(UserSession userSession, AnonymousClass2rI r4, C227802jw r5) {
        this.A03 = r5;
        this.A01 = userSession;
        this.A02 = r4;
    }
}
