package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.concurrent.CancellationException;

public final class IO7 implements C252243on {
    public final int A00;
    public final Object A01;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public IO7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
        switch (this.A00) {
            case 1:
                C54155H0z h0z = (C54155H0z) this.A01;
                if (i != 7001) {
                    if (i != 7002 || i2 != -1) {
                        return;
                    }
                    if (intent == null || !intent.getBooleanExtra("ARGUMENT_SCHOOL_ADDED", false)) {
                        DbX.A1J(h0z);
                        return;
                    }
                } else if (i2 == -1 && intent != null) {
                    if (intent.getBooleanExtra("ARGUMENT_SCHOOL_REMOVED", false)) {
                        C54155H0z.A00(h0z);
                        return;
                    } else if (!intent.getBooleanExtra("ARGUMENT_SCHOOL_ADDED", false)) {
                        return;
                    }
                } else {
                    return;
                }
                ((C53025GhG) h0z.A0F.getValue()).A01(0);
                return;
            case 2:
                ((Fragment) this.A01).onActivityResult(i, i2, intent);
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final void onDestroyView() {
        switch (this.A00) {
            case 0:
                C56911IHg iHg = (C56911IHg) this.A01;
                I7R i7r = iHg.A0C;
                AnonymousClass2Q9 r1 = i7r.A00;
                if (r1 != null) {
                    r1.AG7((CancellationException) null);
                    i7r.A00 = null;
                }
                if (iHg.A00 != null) {
                    AnonymousClass1Nd.A00(iHg.A0A).A02(iHg.A00, C61149Jy0.class);
                }
                iHg.A04.unregisterLifecycleListener(this);
                return;
            case 3:
                C52034GCg gCg = (C52034GCg) this.A01;
                AnonymousClass1Nd.A00(gCg.A0B).A02(gCg.A0A, C61149Jy0.class);
                gCg.A05.unregisterLifecycleListener(this);
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }
}
