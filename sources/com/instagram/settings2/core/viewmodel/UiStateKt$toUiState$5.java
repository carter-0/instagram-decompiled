package com.instagram.settings2.core.viewmodel;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C61074JwC;
import X.C61083JwL;
import X.C61241JzZ;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$5", f = "UiState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UiStateKt$toUiState$5 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ C61083JwL A00;
    public final /* synthetic */ C61083JwL A01;
    public final /* synthetic */ C61074JwC A02;
    public final /* synthetic */ C61241JzZ A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UiStateKt$toUiState$5(C61083JwL jwL, C61083JwL jwL2, C61074JwC jwC, C61241JzZ jzZ, Boolean bool, String str, List list, AnonymousClass4D7 r9, boolean z, boolean z2) {
        super(2, r9);
        this.A03 = jzZ;
        this.A07 = z;
        this.A04 = bool;
        this.A05 = str;
        this.A08 = z2;
        this.A06 = list;
        this.A02 = jwC;
        this.A01 = jwL;
        this.A00 = jwL2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$5, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        C61241JzZ jzZ = this.A03;
        boolean z = this.A07;
        Boolean bool = this.A04;
        String str = this.A05;
        boolean z2 = this.A08;
        List list = this.A06;
        return new UiStateKt$toUiState$5(this.A01, this.A00, this.A02, jzZ, bool, str, list, r13, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UiStateKt$toUiState$5) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        if (X.0qQ.A0K(r1, "nido_pending_setting_change_request2") != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.0eS.A00(r10)
            X.JzZ r0 = r9.A03
            X.MXZ r4 = r0.A03
            boolean r0 = r9.A07
            java.lang.Boolean r2 = r9.A04
            java.lang.String r1 = r9.A05
            if (r0 == 0) goto L_0x001a
            if (r2 != 0) goto L_0x001a
            java.lang.String r0 = "nido_pending_setting_change_request2"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r7 = 1
            if (r0 == 0) goto L_0x0030
        L_0x001a:
            r7 = 0
            if (r2 == 0) goto L_0x0030
            boolean r8 = r2.booleanValue()
        L_0x0021:
            r6 = 1
            java.util.List r5 = r9.A06
            X.JwC r3 = r9.A02
            X.JwL r1 = r9.A01
            X.JwL r2 = r9.A00
            X.GqT r0 = new X.GqT
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0030:
            boolean r8 = r9.A08
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
