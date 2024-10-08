package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import java.util.List;

/* renamed from: X.Lmf  reason: case insensitive filesystem */
public final class C65061Lmf implements MXJ {
    public 0hq A00;
    public final AnonymousClass4DH A01;
    public final C65154LoJ A02;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void AQD(float f) {
    }

    public final void CN3(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(A0S);
        C51968G9o.A1D(fragmentContainerView, -1);
        JTP.A13(fragmentContainerView);
        0hq supportFragmentManager = ((FragmentActivity) 0mE.A01(A0S, FragmentActivity.class)).getSupportFragmentManager();
        this.A00 = supportFragmentManager;
        if (supportFragmentManager != null) {
            0s1 r2 = new 0s1(supportFragmentManager);
            r2.A09(this.A01, fragmentContainerView.getId());
            r2.A00();
        }
        viewGroup.addView(fragmentContainerView);
    }

    public final boolean CQZ() {
        return true;
    }

    public final boolean CQa() {
        return true;
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DG2(float f, float f2) {
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

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void AJD() {
        this.A02.AJD();
    }

    public final List Bdz() {
        return AnonymousClass7TE.A1I(C62562Khs.DEFAULT);
    }

    public final void Cyg() {
        this.A02.A01.invoke();
    }

    public final void cancel() {
        this.A02.cancel();
    }

    public C65061Lmf(AnonymousClass4DH r1, C65154LoJ loJ) {
        this.A01 = r1;
        this.A02 = loJ;
    }
}
