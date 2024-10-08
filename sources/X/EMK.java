package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class EMK extends C47695EDe implements C252243on {
    public final AnonymousClass4DH A00;
    public final AnonymousClass6ST A01;

    public EMK(AnonymousClass4DH r13, AnonymousClass0iw r14, AnonymousClass0aP r15, G8H g8h, C46634DiE diE, String str) {
        super(r13.requireActivity(), (Uri) null, r14, r15, g8h, diE, AnonymousClass05K.A0C, str);
        this.A00 = r13;
        AnonymousClass6ST r1 = new AnonymousClass6ST(r13.requireContext(), true);
        this.A01 = r1;
        DbU.A1L(r13, r1, 2131965555);
        r13.registerLifecycleListener(this);
    }

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

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final boolean A01() {
        FragmentActivity activity;
        AnonymousClass4DH r3 = this.A00;
        if (r3.mView == null || (activity = r3.getActivity()) == null || !r3.isAdded() || r3.mRemoving || r3.mDetached || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    public final void onDestroy() {
        this.A00.unregisterLifecycleListener(this);
    }

    public final void onPause() {
        this.A01.dismiss();
    }

    public final void onResume() {
        AnonymousClass0fN.A00(this.A01);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1234794583);
        if (A01()) {
            this.A01.dismiss();
        }
        this.A00.unregisterLifecycleListener(this);
        EMK.super.onFinish();
        AnonymousClass0fD.A0A(-1511192229, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1260388047);
        if (A01()) {
            AnonymousClass0fN.A00(this.A01);
        }
        EMK.super.onStart();
        AnonymousClass0fD.A0A(1059200533, A03);
    }
}
