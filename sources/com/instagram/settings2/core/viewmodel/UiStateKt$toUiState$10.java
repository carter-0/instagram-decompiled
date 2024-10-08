package com.instagram.settings2.core.viewmodel;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C61074JwC;
import X.C61083JwL;
import X.C61242Jza;
import com.instagram.settings2.core.session.SettingsSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$10", f = "UiState.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, s = {})
public final class UiStateKt$toUiState$10 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C61083JwL A02;
    public final /* synthetic */ C61083JwL A03;
    public final /* synthetic */ C61074JwC A04;
    public final /* synthetic */ C61242Jza A05;
    public final /* synthetic */ SettingsSession A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UiStateKt$toUiState$10(C61083JwL jwL, C61083JwL jwL2, C61074JwC jwC, C61242Jza jza, SettingsSession settingsSession, String str, String str2, String str3, List list, List list2, AnonymousClass4D7 r12, boolean z) {
        super(2, r12);
        this.A0B = list;
        this.A05 = jza;
        this.A0C = z;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = list2;
        this.A04 = jwC;
        this.A03 = jwL;
        this.A02 = jwL2;
        this.A06 = settingsSession;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$10, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        List list = this.A0B;
        C61242Jza jza = this.A05;
        boolean z = this.A0C;
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A09;
        List list2 = this.A0A;
        ? uiStateKt$toUiState$10 = new UiStateKt$toUiState$10(this.A03, this.A02, this.A04, jza, this.A06, str, str2, str3, list, list2, r15, z);
        uiStateKt$toUiState$10.A01 = obj;
        return uiStateKt$toUiState$10;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$10, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r5 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            X.1Hj r9 = X.1Hj.A02
            int r0 = r10.A00
            r8 = 1
            if (r0 == 0) goto L_0x0036
            X.0eS.A00(r11)
        L_0x000b:
            java.util.List r7 = (java.util.List) r7
            X.Jza r0 = r10.A05
            X.MXa r4 = r0.A05
            boolean r0 = r10.A0C
            java.lang.String r5 = r10.A07
            java.lang.String r1 = r10.A08
            if (r0 == 0) goto L_0x0023
            if (r5 != 0) goto L_0x0023
            java.lang.String r0 = "nido_pending_setting_change_request2"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0026
        L_0x0023:
            r8 = 0
            if (r5 != 0) goto L_0x0028
        L_0x0026:
            java.lang.String r5 = r10.A09
        L_0x0028:
            java.util.List r6 = r10.A0A
            X.JwC r3 = r10.A04
            X.JwL r1 = r10.A03
            X.JwL r2 = r10.A02
            X.GqU r0 = new X.GqU
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0036:
            X.0eS.A00(r11)
            java.lang.Object r7 = r10.A01
            X.4Cq r7 = (X.C262224Cq) r7
            java.util.List r0 = r10.A0B
            com.instagram.settings2.core.session.SettingsSession r6 = r10.A06
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0049:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r3 = r4.next()
            r2 = 0
            r1 = 39
            X.MGf r0 = new X.MGf
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r6, (X.AnonymousClass4D7) r2, (int) r1)
            X.JTQ.A1M(r5, r0, r7)
            goto L_0x0049
        L_0x005f:
            r10.A00 = r8
            java.lang.Object r7 = X.AnonymousClass42T.A00(r5, r10)
            if (r7 != r9) goto L_0x000b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$10.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UiStateKt$toUiState$10) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
