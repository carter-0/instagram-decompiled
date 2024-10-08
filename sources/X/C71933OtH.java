package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.OtH  reason: case insensitive filesystem */
public final class C71933OtH implements C252243on {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C331157Pu A01;

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

    public C71933OtH(Fragment fragment, C331157Pu r2) {
        this.A01 = r2;
        this.A00 = fragment;
    }

    public final void onStart() {
        C331157Pu r0 = this.A01;
        BottomSheetFragment bottomSheetFragment = r0.A03;
        bottomSheetFragment.unregisterLifecycleListener(this);
        bottomSheetFragment.A0V(this.A00, r0.A02, true, true, false);
    }
}
