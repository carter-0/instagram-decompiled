package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.OtI  reason: case insensitive filesystem */
public final class C71934OtI implements C252243on {
    public final /* synthetic */ Drawable A00;
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

    public C71934OtI(Drawable drawable, C331157Pu r2) {
        this.A01 = r2;
        this.A00 = drawable;
    }

    public final void onStart() {
        BottomSheetFragment bottomSheetFragment = this.A01.A03;
        bottomSheetFragment.unregisterLifecycleListener(this);
        ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
        if (viewGroup != null) {
            viewGroup.setBackground(this.A00);
        }
    }
}
