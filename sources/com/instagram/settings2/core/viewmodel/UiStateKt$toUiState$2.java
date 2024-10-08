package com.instagram.settings2.core.viewmodel;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C53400GnX;
import X.C60340gF;
import X.C61083JwL;
import X.I4T;
import com.instagram.settings2.core.session.SettingsSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$2", f = "UiState.kt", i = {0, 1}, l = {74, 99}, m = "invokeSuspend", n = {"$this$coroutineScope", "footers"}, s = {"L$0", "L$0"})
public final class UiStateKt$toUiState$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C61083JwL A02;
    public final /* synthetic */ C53400GnX A03;
    public final /* synthetic */ SettingsSession A04;
    public final /* synthetic */ I4T A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UiStateKt$toUiState$2(C61083JwL jwL, C53400GnX gnX, SettingsSession settingsSession, I4T i4t, List list, List list2, List list3, AnonymousClass4D7 r9, boolean z) {
        super(2, r9);
        this.A07 = list;
        this.A06 = list2;
        this.A08 = list3;
        this.A03 = gnX;
        this.A02 = jwL;
        this.A05 = i4t;
        this.A04 = settingsSession;
        this.A09 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        List list = this.A07;
        List list2 = this.A06;
        List list3 = this.A08;
        C53400GnX gnX = this.A03;
        ? uiStateKt$toUiState$2 = new UiStateKt$toUiState$2(this.A02, gnX, this.A04, this.A05, list, list2, list3, r12, this.A09);
        uiStateKt$toUiState$2.A01 = obj;
        return uiStateKt$toUiState$2;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$2, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f A[PHI: r0 
      PHI: (r0v2 java.util.List) = (r0v1 java.util.List), (r0v4 java.util.List) binds: [B:18:0x0064, B:20:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1Hj r6 = X.1Hj.A02
            int r0 = r14.A00
            r4 = 0
            r5 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r9) goto L_0x0059
            java.lang.Object r4 = r14.A01
            java.util.List r4 = (java.util.List) r4
            X.0eS.A00(r15)
        L_0x0012:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.List r3 = X.00k.A0X(r15)
            X.GnX r0 = r14.A03
            java.lang.Object r2 = r0.A03
            X.XRY r2 = (X.XRY) r2
            X.JwL r1 = r14.A02
            X.JwC r0 = new X.JwC
            r0.<init>((X.C61083JwL) r1, (X.XRY) r2, (java.util.List) r3, (java.util.List) r4)
            return r0
        L_0x0026:
            X.0eS.A00(r15)
            java.lang.Object r3 = r14.A01
            X.4Cq r3 = (X.C262224Cq) r3
            java.util.List r0 = r14.A07
            if (r0 == 0) goto L_0x0062
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0039:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r2 = r7.next()
            r1 = 21
            X.MFx r0 = new X.MFx
            r0.<init>(r2, r4, r1)
            X.JTQ.A1M(r8, r0, r3)
            goto L_0x0039
        L_0x004e:
            r14.A01 = r3
            r14.A00 = r9
            java.lang.Object r15 = X.AnonymousClass42T.A00(r8, r14)
            if (r15 != r6) goto L_0x005f
            return r6
        L_0x0059:
            java.lang.Object r0 = r14.A01
            X.4Cq r3 = X.JTO.A1D(r0, r15)
        L_0x005f:
            r4 = r15
            java.util.List r4 = (java.util.List) r4
        L_0x0062:
            java.util.List r0 = r14.A06
            if (r0 != 0) goto L_0x006f
            java.util.List r0 = r14.A08
            if (r0 != 0) goto L_0x006f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x006f:
            X.I4T r9 = r14.A05
            com.instagram.settings2.core.session.SettingsSession r10 = r14.A04
            boolean r13 = r14.A09
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x007d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r8 = r1.next()
            r11 = 0
            r12 = 18
            X.JTf r7 = new X.JTf
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.JTQ.A1M(r2, r7, r3)
            goto L_0x007d
        L_0x0093:
            r14.A01 = r4
            r14.A00 = r5
            java.lang.Object r15 = X.AnonymousClass42T.A00(r2, r14)
            if (r15 != r6) goto L_0x0012
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UiStateKt$toUiState$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
