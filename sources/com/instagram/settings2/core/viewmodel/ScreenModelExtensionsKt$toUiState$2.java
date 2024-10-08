package com.instagram.settings2.core.viewmodel;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C21251XQw;
import X.C60340gF;
import X.C61065Jw3;
import X.C61083JwL;
import X.C66418MQy;
import X.I4T;
import X.L2T;
import com.instagram.settings2.core.session.SettingsSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt$toUiState$2", f = "ScreenModelExtensions.kt", i = {}, l = {134, 203}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenModelExtensionsKt$toUiState$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ C61065Jw3 A02;
    public final /* synthetic */ C61083JwL A03;
    public final /* synthetic */ C66418MQy A04;
    public final /* synthetic */ SettingsSession A05;
    public final /* synthetic */ L2T A06;
    public final /* synthetic */ SettingsScreenViewModel A07;
    public final /* synthetic */ C21251XQw A08;
    public final /* synthetic */ I4T A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ List A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenModelExtensionsKt$toUiState$2(C61065Jw3 jw3, C61083JwL jwL, C66418MQy mQy, SettingsSession settingsSession, L2T l2t, SettingsScreenViewModel settingsScreenViewModel, C21251XQw xQw, I4T i4t, String str, List list, List list2, AnonymousClass4D7 r13, boolean z, boolean z2, boolean z3) {
        super(2, r13);
        this.A02 = jw3;
        this.A03 = jwL;
        this.A0B = list;
        this.A08 = xQw;
        this.A0F = z;
        this.A0A = str;
        this.A07 = settingsScreenViewModel;
        this.A0E = z2;
        this.A04 = mQy;
        this.A09 = i4t;
        this.A0C = list2;
        this.A05 = settingsSession;
        this.A0D = z3;
        this.A06 = l2t;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt$toUiState$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r18) {
        C61065Jw3 jw3 = this.A02;
        C61083JwL jwL = this.A03;
        List list = this.A0B;
        C21251XQw xQw = this.A08;
        boolean z = this.A0F;
        String str = this.A0A;
        SettingsScreenViewModel settingsScreenViewModel = this.A07;
        boolean z2 = this.A0E;
        C66418MQy mQy = this.A04;
        I4T i4t = this.A09;
        List list2 = this.A0C;
        return new ScreenModelExtensionsKt$toUiState$2(jw3, jwL, mQy, this.A05, this.A06, settingsScreenViewModel, xQw, i4t, str, list, list2, r18, z, z2, this.A0D);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt$toUiState$2, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r7 = r24
            X.1Hj r15 = X.1Hj.A02
            r2 = r23
            int r3 = r2.A00
            r1 = 2
            r0 = 1
            if (r3 == 0) goto L_0x0035
            if (r3 == r0) goto L_0x005b
            java.lang.Object r6 = r2.A01
            X.HPi r6 = (X.C54703HPi) r6
            X.0eS.A00(r7)
        L_0x0015:
            X.Jw3 r7 = (X.C61065Jw3) r7
        L_0x0017:
            X.JwL r5 = r2.A03
            java.util.List r4 = r2.A0B
            X.XQw r3 = r2.A08
            boolean r1 = r2.A0F
            java.lang.String r0 = r2.A0A
            X.GnT r15 = new X.GnT
            r17 = r5
            r18 = r6
            r19 = r3
            r20 = r0
            r21 = r4
            r22 = r1
            r16 = r7
            r15.<init>((X.C61065Jw3) r16, (X.C61083JwL) r17, (X.C54703HPi) r18, (X.C21251XQw) r19, (java.lang.String) r20, (java.util.List) r21, (boolean) r22)
            return r15
        L_0x0035:
            X.0eS.A00(r7)
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r7 = r2.A07
            X.XQw r8 = r2.A08
            boolean r13 = r2.A0E
            java.lang.String r10 = r2.A0A
            X.MQy r4 = r2.A04
            X.I4T r9 = r2.A09
            java.util.List r11 = r2.A0C
            com.instagram.settings2.core.session.SettingsSession r5 = r2.A05
            boolean r14 = r2.A0D
            X.L2T r6 = r2.A06
            r12 = 0
            com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt$toUiState$2$1 r3 = new com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt$toUiState$2$1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2.A00 = r0
            java.lang.Object r7 = X.19E.A00(r2, r3)
            if (r7 != r15) goto L_0x005e
            return r15
        L_0x005b:
            X.0eS.A00(r7)
        L_0x005e:
            r6 = r7
            X.HPi r6 = (X.C54703HPi) r6
            X.Jw3 r0 = r2.A02
            if (r0 == 0) goto L_0x007b
            r2.A01 = r6
            r2.A00 = r1
            int r4 = r0.A01
            int r3 = r0.A00
            java.lang.Object r1 = r0.A02
            X.JwG r1 = (X.C61078JwG) r1
            r0 = 13
            X.Jw3 r7 = new X.Jw3
            r7.<init>((X.C61078JwG) r1, (int) r4, (int) r3, (int) r0)
            if (r7 != r15) goto L_0x0015
            return r15
        L_0x007b:
            r7 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt$toUiState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScreenModelExtensionsKt$toUiState$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
