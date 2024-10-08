package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7GT  reason: invalid class name */
public final class AnonymousClass7GT implements C252243on {
    public final UserSession A00;
    public final C62320sa A01;
    public final C62320sa A02;

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

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onDestroy() {
        for (C2598243f A002 : C262044Bx.A00(this.A00).A00.values()) {
            A002.A00();
        }
        this.A02.invoke();
    }

    public final void onStart() {
        String str;
        DirectThreadKey A04;
        C2598043d A002 = C262044Bx.A00(this.A00);
        C254743sy r0 = (C254743sy) this.A01.invoke();
        if (r0 == null || (A04 = C66647MaG.A04(r0)) == null) {
            str = null;
        } else {
            str = A04.A00;
        }
        for (C2598243f r02 : A002.A00.values()) {
            r02.A01 = str;
        }
    }

    public AnonymousClass7GT(C62320sa r1, UserSession userSession, C62320sa r3) {
        this.A00 = userSession;
        this.A01 = r1;
        this.A02 = r3;
    }
}
