package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.32y  reason: invalid class name and case insensitive filesystem */
public final class C2362332y implements C252243on {
    public C238133Ar A00;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        this.A00 = C238103Ao.A00((ViewGroup) view.findViewById(16908298));
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final void onDestroyView() {
        this.A00 = null;
    }

    public final /* synthetic */ void onPause() {
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

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (r7 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r7 != false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r16 = this;
            r0 = r16
            X.3Ar r4 = r0.A00
            if (r4 == 0) goto L_0x009a
            int r3 = r4.B6L()
            int r2 = r4.BLQ()
            if (r3 > r2) goto L_0x0091
        L_0x0010:
            X.3s4 r1 = X.C253923rd.A0B(r4, r3)
            X.3s4 r0 = X.C254183s4.AD_CTA
            if (r1 != r0) goto L_0x0094
            android.view.View r0 = r4.AnE(r3)
            r0.getClass()
            java.lang.Object r8 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder"
            X.0qQ.A0C(r8, r0)
            X.3rt r8 = (X.C254073rt) r8
            X.5Ev r4 = r8.A08
            if (r4 == 0) goto L_0x0091
            X.1Xj r6 = r4.A02
            X.3W1 r5 = r4.A04
            boolean r7 = r8.A01(r6, r5)
            boolean r0 = X.1sx.A0J(r6)
            r3 = 1
            r15 = 0
            if (r0 != 0) goto L_0x0069
            X.5Eu r1 = r4.A00
            X.0sP r0 = r1.A03
            android.content.Context r2 = r8.A0G
            java.lang.Object r11 = r0.invoke(r2)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            X.5Ew r9 = r4.A01
            X.0sL r1 = r1.A07
            X.4DU r0 = r8.A0W
            java.lang.Object r12 = r1.invoke(r2, r0)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            X.3YT r0 = r8.A0R
            java.util.List r13 = r0.Bqk(r6, r5)
            X.3W1 r10 = r8.A09
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0065
            r14 = 0
            if (r7 == 0) goto L_0x0066
        L_0x0065:
            r14 = 1
        L_0x0066:
            r8.A00(r9, r10, r11, r12, r13, r14, r15)
        L_0x0069:
            boolean r1 = r5.A29
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0072
            r0 = 0
            if (r7 == 0) goto L_0x0073
        L_0x0072:
            r0 = 1
        L_0x0073:
            X.AnonymousClass5F6.A01(r8, r1, r15, r0)
            X.3W1 r4 = r8.A09
            if (r4 == 0) goto L_0x0091
            long r0 = r8.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            com.instagram.common.session.UserSession r1 = r8.A0N
            boolean r0 = r8.A0B
            if (r0 != 0) goto L_0x0092
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0092
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x0092
        L_0x008e:
            X.AnonymousClass5F6.A00(r1, r4, r2, r3)
        L_0x0091:
            return
        L_0x0092:
            r3 = 0
            goto L_0x008e
        L_0x0094:
            if (r3 == r2) goto L_0x0091
            int r3 = r3 + 1
            goto L_0x0010
        L_0x009a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2362332y.onResume():void");
    }
}
