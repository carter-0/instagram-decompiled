package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.DeS  reason: case insensitive filesystem */
public final class C46405DeS implements C252243on {
    public final /* synthetic */ C229382nI A00;
    public final /* synthetic */ C46403DeQ A01;

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

    public C46405DeS(C229382nI r1, C46403DeQ deQ) {
        this.A01 = deQ;
        this.A00 = r1;
    }

    public final void onDestroy() {
        C46403DeQ deQ = this.A01;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        deQ.A00 = null;
        this.A00.A06(this);
    }

    public final void onDestroyView() {
        C46403DeQ deQ = this.A01;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass6NS r0 = deQ.A00;
        if (r0 != null) {
            r0.A04();
        }
    }
}
