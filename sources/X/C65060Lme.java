package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.Lme  reason: case insensitive filesystem */
public final class C65060Lme implements MXJ {
    public C65499LuN A00;
    public final MTl A01;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void AQD(float f) {
    }

    public final void CN3(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        C65499LuN luN = this.A00;
        if (luN != null) {
            0qQ.A07(viewGroup.getContext());
            viewGroup.addView(luN.A06);
            return;
        }
        0qQ.A0F("musicAdjustmentController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CQZ() {
        return true;
    }

    public final boolean CQa() {
        return true;
    }

    public final /* synthetic */ void Cyg() {
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
        this.A01.AJD();
    }

    public final List Bdz() {
        return AnonymousClass7TE.A1I(C62562Khs.DEFAULT);
    }

    public final void cancel() {
        this.A01.cancel();
    }

    public C65060Lme(MTl mTl) {
        this.A01 = mTl;
    }
}
