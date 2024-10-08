package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

public final class T74 implements C252243on {
    public final /* synthetic */ C9756RgE A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C277014uI A03;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
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

    public T74(C9756RgE rgE, C307896Rx r2, C277014uI r3, C277014uI r4) {
        this.A00 = rgE;
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r7 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 42625(0xa681, float:5.973E-41)
            if (r5 != r0) goto L_0x0022
            r3 = 0
            r2 = -1
            if (r6 != r2) goto L_0x0023
            if (r7 == 0) goto L_0x0011
            java.lang.String r0 = "extra_result_code"
            java.lang.String r3 = r7.getStringExtra(r0)
        L_0x0011:
            X.4uI r2 = r4.A03
            if (r3 == 0) goto L_0x0022
            X.6Tl r0 = X.DbU.A0T(r3)
        L_0x0019:
            X.6Tm r1 = r0.A00()
            X.6Rx r0 = r4.A01
            X.C299275ur.A00(r0, r1, r2)
        L_0x0022:
            return
        L_0x0023:
            if (r7 == 0) goto L_0x002d
            java.lang.String r0 = "extra_result_error_code"
            java.lang.String r1 = r7.getStringExtra(r0)
            if (r1 != 0) goto L_0x0033
        L_0x002d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r7 == 0) goto L_0x0039
        L_0x0033:
            java.lang.String r0 = "extra_result_error_message"
            java.lang.String r3 = r7.getStringExtra(r0)
        L_0x0039:
            X.4uI r2 = r4.A02
            if (r3 == 0) goto L_0x0022
            X.6Tl r0 = X.DbU.A0T(r1)
            r0.A02(r3)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T74.onActivityResult(int, int, android.content.Intent):void");
    }
}
