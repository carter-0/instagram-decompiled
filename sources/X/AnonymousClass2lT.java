package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.2lT  reason: invalid class name */
public final class AnonymousClass2lT extends AnonymousClass2lU implements C252243on {
    public final void A07(1Xj r9, boolean z) {
        String id;
        boolean z2 = z;
        if (!(r9 == null || (id = r9.getId()) == null)) {
            String str = this.A01;
            if (str != null && str.equals(id)) {
                C228362lW r2 = this.A04;
                String str2 = this.A05;
                Integer num = AnonymousClass05K.A00;
                r2.A01((1Xj) null, num, AnonymousClass05K.A0N, str2);
                r2.A06((1Xj) null, num, str2, "is_auto_play", z2);
                if (!z) {
                    r2.A02((1Xj) null, num, str2);
                }
            }
            String str3 = this.A02;
            if (str3 != null && str3.equals(id)) {
                C228362lW r22 = this.A04;
                String str4 = this.A05;
                Integer num2 = AnonymousClass05K.A0N;
                r22.A01((1Xj) null, num2, num2, str4);
                r22.A06((1Xj) null, num2, str4, "is_auto_play", z2);
                if (!z) {
                    r22.A02((1Xj) null, num2, str4);
                }
            }
        }
        super.A07(r9, z);
    }

    public final boolean A0A(String str) {
        0qQ.A0B(str, 0);
        return "feed_timeline".equals(str);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r13.A5E() != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.1Xj r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0066
            java.lang.String r1 = r13.getId()
            if (r1 == 0) goto L_0x0066
            boolean r0 = r13.A5D()
            if (r0 != 0) goto L_0x0015
            boolean r0 = r13.A5E()
            r11 = 0
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r11 = 1
        L_0x0016:
            java.lang.String r0 = r12.A01
            if (r0 == 0) goto L_0x003e
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            X.2lW r2 = r12.A04
            java.lang.String r5 = r12.A05
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3 = 0
            r2.A01(r3, r4, r0, r5)
            boolean r7 = r13.CeS()
            java.lang.String r6 = "is_video"
            r2.A06(r3, r4, r5, r6, r7)
            java.lang.String r10 = "is_carousel"
            r6 = r2
            r7 = r3
            r8 = r4
            r9 = r5
            r6.A06(r7, r8, r9, r10, r11)
        L_0x003e:
            java.lang.String r0 = r12.A02
            if (r0 == 0) goto L_0x0066
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0066
            X.2lW r1 = r12.A04
            java.lang.String r4 = r12.A05
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2 = 0
            r1.A01(r2, r3, r0, r4)
            boolean r6 = r13.CeS()
            java.lang.String r5 = "is_video"
            r1.A06(r2, r3, r4, r5, r6)
            java.lang.String r10 = "is_carousel"
            r6 = r1
            r7 = r2
            r8 = r3
            r9 = r4
            r6.A06(r7, r8, r9, r10, r11)
        L_0x0066:
            super.A04(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2lT.A04(X.1Xj):void");
    }

    public final boolean A09(1sy r3) {
        if (r3 == 1sy.A0H) {
            return true;
        }
        return false;
    }

    public final void onCreate() {
        A08(this.A00, true);
    }

    public final void A02(1Xj r6) {
        String id = r6.getId();
        if (id != null) {
            String str = this.A01;
            if (str != null && str.equals(id)) {
                this.A04.A03((1Xj) null, AnonymousClass05K.A00, this.A05);
            }
            String str2 = this.A02;
            if (str2 != null && str2.equals(id)) {
                this.A04.A03((1Xj) null, AnonymousClass05K.A0N, this.A05);
            }
        }
        super.A02(r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r13.A5E() != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.1Xj r13) {
        /*
            r12 = this;
            java.lang.String r1 = r13.getId()
            if (r1 == 0) goto L_0x0074
            java.util.Set r0 = r12.A06
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0074
            boolean r0 = r13.A5D()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r13.A5E()
            r11 = 0
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r11 = 1
        L_0x001c:
            java.lang.String r0 = r12.A01
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            boolean r0 = r13.CeS()
            if (r0 != 0) goto L_0x0048
            X.2lW r2 = r12.A04
            java.lang.String r5 = r12.A05
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            boolean r7 = r13.CeS()
            r3 = 0
            java.lang.String r6 = "is_video"
            r2.A06(r3, r4, r5, r6, r7)
            java.lang.String r10 = "is_carousel"
            r6 = r2
            r7 = r3
            r8 = r4
            r9 = r5
            r6.A06(r7, r8, r9, r10, r11)
            r2.A02(r3, r4, r5)
        L_0x0048:
            java.lang.String r0 = r12.A02
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
            boolean r0 = r13.CeS()
            if (r0 != 0) goto L_0x0074
            X.2lW r0 = r12.A04
            java.lang.String r3 = r12.A05
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            boolean r5 = r13.CeS()
            r1 = 0
            java.lang.String r4 = "is_video"
            r0.A06(r1, r2, r3, r4, r5)
            java.lang.String r10 = "is_carousel"
            r6 = r0
            r7 = r1
            r8 = r2
            r9 = r3
            r6.A06(r7, r8, r9, r10, r11)
            r0.A02(r1, r2, r3)
        L_0x0074:
            super.A03(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2lT.A03(X.1Xj):void");
    }

    public final void A05(1Xj r7) {
        String id = r7.getId();
        if (id != null) {
            String str = this.A01;
            if (str != null && str.equals(id)) {
                C228362lW r4 = this.A04;
                String str2 = this.A05;
                Integer num = AnonymousClass05K.A00;
                r4.A01((1Xj) null, num, AnonymousClass05K.A0Y, str2);
                r4.A02((1Xj) null, num, str2);
            }
            String str3 = this.A02;
            if (str3 != null && str3.equals(id)) {
                C228362lW r42 = this.A04;
                String str4 = this.A05;
                Integer num2 = AnonymousClass05K.A0N;
                r42.A01((1Xj) null, num2, AnonymousClass05K.A0Y, str4);
                r42.A02((1Xj) null, num2, str4);
            }
        }
        super.A05(r7);
    }
}
