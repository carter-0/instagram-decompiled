package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.FXf  reason: case insensitive filesystem */
public final class C50300FXf implements C252243on {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public C50300FXf(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public final /* synthetic */ void onCreate() {
    }

    public final void onDestroy() {
        if (this.A00 != 0) {
            ((C229352nF) this.A01).A07(this.A03);
            C308206Td.A0L((C307896Rx) this.A02, this);
            return;
        }
        ((AnonymousClass6NS) this.A01).A03();
        C12794T7h t7h = (C12794T7h) this.A02;
        t7h.A00.remove(this.A03);
        ((C229382nI) t7h.A01.getValue()).A06(this);
    }

    public final void onDestroyView() {
        if (this.A00 == 0) {
            ((AnonymousClass6NS) this.A01).A04();
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

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }
}
