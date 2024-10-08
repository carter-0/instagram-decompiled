package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;

public final class EMN extends C50515Fdb implements C252243on {
    public Dialog A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final AnonymousClass4DH A03;
    public final AnonymousClass0aP A04;
    public final C46634DiE A05;

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

    public final void onDestroy() {
        this.A03.unregisterLifecycleListener(this);
    }

    public final void onPause() {
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void onResume() {
        Dialog dialog = this.A00;
        if (dialog != null) {
            A00(dialog, this);
        }
    }

    public EMN(Context context, FragmentActivity fragmentActivity, AnonymousClass4DH r3, AnonymousClass0aP r4, C46634DiE diE) {
        super(fragmentActivity);
        this.A01 = context;
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = fragmentActivity;
        this.A05 = diE;
        r3.registerLifecycleListener(this);
    }

    public static final void A00(Dialog dialog, EMN emn) {
        String str;
        AnonymousClass0fN.A00(dialog);
        AnonymousClass0aP r3 = emn.A04;
        C46634DiE diE = emn.A05;
        if (diE == null || (str = diE.A01) == null) {
            str = "";
        }
        C49956FGl.A04(r3, str, "login", "invalid_saved_credentials");
        SmartLockPluginImpl instance = 1WP.getInstance();
        if (instance != null) {
            instance.A00 = false;
        }
    }
}
