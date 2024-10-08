package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.80C  reason: invalid class name */
public final class AnonymousClass80C implements C252243on {
    public final C227622jd A00 = new C227622jd();

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        this.A00.A0C(view);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        this.A00.A09(configuration);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        this.A00.A0A(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A00.A0D(view, bundle);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A00.A08(i, i2, intent);
    }

    public final void onCreate() {
        this.A00.A01();
    }

    public final void onDestroy() {
        this.A00.A02();
    }

    public final void onDestroyView() {
        this.A00.A03();
    }

    public final void onPause() {
        this.A00.A04();
    }

    public final void onResume() {
        this.A00.A05();
    }

    public final void onStart() {
        this.A00.A06();
    }

    public final void onStop() {
        this.A00.A07();
    }

    public final void onViewStateRestored(Bundle bundle) {
        this.A00.A0B(bundle);
    }
}
