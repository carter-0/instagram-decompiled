package com.instagram.settings2.core.viewmodel;

import X.0sG;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.SettingsScreenViewModel$uiState$1", f = "SettingsScreenViewModel.kt", i = {0, 0, 1, 1, 2, 2}, l = {162, 161, 175, 181, 180}, m = "invokeSuspend", n = {"$this$combineTransform", "disableNavigationRowClick", "$this$combineTransform", "disableNavigationRowClick", "$this$combineTransform", "disableNavigationRowClick"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0"})
public final class SettingsScreenViewModel$uiState$1 extends AnonymousClass1Ek implements 0sG {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ boolean A04;
    public final /* synthetic */ SettingsScreenViewModel A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsScreenViewModel$uiState$1(SettingsScreenViewModel settingsScreenViewModel, AnonymousClass4D7 r3) {
        super(7, r3);
        this.A05 = settingsScreenViewModel;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.settings2.core.viewmodel.SettingsScreenViewModel$uiState$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0100 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r2 = r28
            X.1Hj r9 = X.1Hj.A02
            r10 = r27
            int r0 = r10.A00
            r8 = 5
            r7 = 4
            r14 = 3
            r13 = 2
            r12 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0035
            if (r0 == r12) goto L_0x0025
            if (r0 == r13) goto L_0x001e
            if (r0 == r14) goto L_0x00ca
            if (r0 == r7) goto L_0x00f0
            X.0eS.A00(r2)
        L_0x001b:
            X.0gF r9 = X.C60340gF.A00
        L_0x001d:
            return r9
        L_0x001e:
            boolean r4 = r10.A04
            java.lang.Object r5 = r10.A01
            X.02o r5 = (X.02o) r5
            goto L_0x009c
        L_0x0025:
            boolean r4 = r10.A04
            java.lang.Object r0 = r10.A02
            X.02o r0 = (X.02o) r0
            java.lang.Object r5 = r10.A01
            X.02o r5 = (X.02o) r5
            X.0eS.A00(r2)     // Catch:{ Exception -> 0x00ab }
            r1 = r5
            r5 = r0
            goto L_0x008c
        L_0x0035:
            X.0eS.A00(r2)
            java.lang.Object r5 = r10.A01
            X.02o r5 = (X.02o) r5
            java.lang.Object r11 = r10.A02
            java.lang.String r11 = (java.lang.String) r11
            boolean r4 = r10.A04
            java.lang.Object r3 = r10.A03
            X.MQy r3 = (X.C66418MQy) r3
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r2 = r10.A05     // Catch:{ Exception -> 0x00a9 }
            X.G5E r0 = r2.A01     // Catch:{ Exception -> 0x00a9 }
            boolean r0 = X.DbW.A1a(r0)
            if (r0 != 0) goto L_0x0053
            X.0gF r9 = X.C60340gF.A00     // Catch:{ Exception -> 0x00a9 }
            return r9
        L_0x0053:
            X.Jvx r0 = r2.A05     // Catch:{ Exception -> 0x00a9 }
            r26 = r0
            X.XQw r0 = r2.A0A     // Catch:{ Exception -> 0x00a9 }
            r17 = r0
            boolean r24 = X.AnonymousClass7TF.A1P(r4)
            com.instagram.settings2.core.session.SettingsSession r0 = r2.A08     // Catch:{ Exception -> 0x00a9 }
            r16 = r0
            X.I4T r15 = r2.A0B     // Catch:{ Exception -> 0x00a9 }
            X.L2T r1 = r2.A09     // Catch:{ Exception -> 0x00a9 }
            boolean r0 = r2.A04     // Catch:{ Exception -> 0x00a9 }
            r10.A01 = r5     // Catch:{ Exception -> 0x00a9 }
            r10.A02 = r5     // Catch:{ Exception -> 0x00a9 }
            r10.A04 = r4     // Catch:{ Exception -> 0x00a9 }
            r10.A00 = r12     // Catch:{ Exception -> 0x00a9 }
            r23 = r10
            r25 = r0
            r20 = r17
            r21 = r15
            r22 = r11
            r17 = r16
            r18 = r1
            r19 = r2
            r15 = r26
            r16 = r3
            java.lang.Object r2 = com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x00a9 }
            if (r2 == r9) goto L_0x001d
            r1 = r5
        L_0x008c:
            r10.A01 = r1     // Catch:{ Exception -> 0x00a6 }
            r10.A02 = r6     // Catch:{ Exception -> 0x00a6 }
            r10.A04 = r4     // Catch:{ Exception -> 0x00a6 }
            r10.A00 = r13     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object r0 = r5.emit(r2, r10)     // Catch:{ Exception -> 0x00a6 }
            if (r0 == r9) goto L_0x001d
            r5 = r1
            goto L_0x009f
        L_0x009c:
            X.0eS.A00(r2)     // Catch:{ Exception -> 0x00ab }
        L_0x009f:
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r1 = r10.A05     // Catch:{ Exception -> 0x00ab }
            r0 = 0
            r1.A04 = r0     // Catch:{ Exception -> 0x00ab }
            goto L_0x001b
        L_0x00a6:
            r2 = move-exception
            r5 = r1
            goto L_0x00ac
        L_0x00a9:
            r2 = move-exception
            goto L_0x00ac
        L_0x00ab:
            r2 = move-exception
        L_0x00ac:
            java.lang.String r1 = "SettingsScreenViewModel"
            java.lang.String r0 = "Failed to resolve screen"
            X.0KC.A0F(r1, r0, r2)
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r0 = r10.A05
            X.3ju r1 = r0.A0F
            X.Jzd r0 = X.C61083JwL.A03()
            r10.A01 = r5
            r10.A02 = r6
            r10.A04 = r4
            r10.A00 = r14
            java.lang.Object r0 = r1.ELH(r0, r10)
            if (r0 != r9) goto L_0x00d2
            return r9
        L_0x00ca:
            boolean r4 = r10.A04
            java.lang.Object r0 = r10.A01
            X.02o r5 = X.JTO.A1H(r0, r2)
        L_0x00d2:
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r13 = r10.A05
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x001b
            X.Jvx r11 = r13.A05
            X.XQw r14 = X.C21251XQw.MAIN_SETTINGS_SCREEN
            com.instagram.settings2.core.session.SettingsSession r12 = r13.A08
            X.I4T r0 = r13.A0B
            r10.A01 = r5
            r10.A00 = r7
            r15 = r0
            r16 = r10
            r17 = r4
            java.lang.Object r2 = com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt.A01(r11, r12, r13, r14, r15, r16, r17)
            if (r2 != r9) goto L_0x00f6
            return r9
        L_0x00f0:
            java.lang.Object r0 = r10.A01
            X.02o r5 = X.JTO.A1H(r0, r2)
        L_0x00f6:
            r10.A01 = r6
            r10.A00 = r8
            java.lang.Object r0 = r5.emit(r2, r10)
            if (r0 != r9) goto L_0x001b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.SettingsScreenViewModel$uiState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean A1a = AnonymousClass7TE.A1a(obj3);
        SettingsScreenViewModel$uiState$1 settingsScreenViewModel$uiState$1 = new SettingsScreenViewModel$uiState$1(this.A05, (AnonymousClass4D7) obj7);
        settingsScreenViewModel$uiState$1.A01 = obj;
        settingsScreenViewModel$uiState$1.A02 = obj2;
        settingsScreenViewModel$uiState$1.A04 = A1a;
        settingsScreenViewModel$uiState$1.A03 = obj4;
        return settingsScreenViewModel$uiState$1.invokeSuspend(C60340gF.A00);
    }
}
