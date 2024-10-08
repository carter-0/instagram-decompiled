package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.2qA  reason: invalid class name and case insensitive filesystem */
public final class C230742qA implements C61110lV, C252243on {
    public boolean A00;
    public final 02m A01;
    public final C230722q8 A02;
    public final String A03;

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

    public final void onPause() {
        if (this.A00) {
            this.A00 = false;
            this.A01.markerEnd(499003080, 4);
        }
    }

    public C230742qA(02m r1, C230722q8 r2, String str) {
        this.A03 = str;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1066829884);
        if (this.A00) {
            this.A00 = false;
            this.A01.markerEnd(499003080, 4);
        }
        AnonymousClass0fD.A0A(-1379571811, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-1625328647, AnonymousClass0fD.A03(969511238));
    }
}
