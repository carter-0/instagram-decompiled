package com.instagram.trials.viewmodels;

import X.02z;
import X.05G;
import X.0u9;
import X.106;
import X.10b;
import X.1HR;
import X.AnonymousClass0Ud;
import X.AnonymousClass0r6;
import X.AnonymousClass7TG;
import X.AnonymousClass8ZF;
import X.C249513ju;
import X.C46327Dbv;
import X.C62117KaP;
import X.C63666L2c;
import X.G9w;
import X.LSk;
import com.instagram.trials.impl.TrialsPreferencesImpl;
import com.instagram.trials.model.TrialMetricsData;
import com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl;

public final class ClipsTrialBottomSheetViewModel extends AnonymousClass8ZF {
    public final C46327Dbv A00;
    public final C63666L2c A01;
    public final TrialsPreferencesImpl A02;
    public final LSk A03;
    public final TrialMetricsData A04;
    public final ClipsTrialBottomSheetRepositoryImpl A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final C249513ju A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;
    public final AnonymousClass0Ud A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 6
            boolean r0 = X.C66142MDu.A02(r3, r6)
            if (r0 == 0) goto L_0x0040
            r4 = r6
            X.MDu r4 = (X.C66142MDu) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0040
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r2) goto L_0x0048
            X.0eS.A00(r1)
        L_0x0023:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0045
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0045
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0030:
            X.0eS.A00(r1)
            com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl r1 = r5.A05
            java.lang.String r0 = r5.A06
            r4.A00 = r2
            java.lang.Object r1 = r1.A03(r0, r4)
            if (r1 != r3) goto L_0x0023
            return r3
        L_0x0040:
            X.MDu r4 = X.C66142MDu.A00(r5, r6, r3)
            goto L_0x0015
        L_0x0045:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0048:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel.A00(com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel, X.4D7):java.lang.Object");
    }

    public ClipsTrialBottomSheetViewModel(C46327Dbv dbv, C63666L2c l2c, TrialsPreferencesImpl trialsPreferencesImpl, LSk lSk, TrialMetricsData trialMetricsData, ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A05 = clipsTrialBottomSheetRepositoryImpl;
        this.A06 = str;
        this.A08 = str2;
        this.A03 = lSk;
        this.A0E = z;
        this.A07 = str3;
        this.A00 = dbv;
        this.A0D = z2;
        this.A04 = trialMetricsData;
        this.A01 = l2c;
        this.A02 = trialsPreferencesImpl;
        this.A0F = z3;
        02z A012 = 106.A01(C62117KaP.A00);
        this.A0B = A012;
        this.A0C = 10b.A03(A012);
        1HR A0w = G9w.A0w();
        this.A09 = A0w;
        this.A0A = 0u9.A04(A0w);
    }
}
