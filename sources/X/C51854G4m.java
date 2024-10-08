package X;

/* renamed from: X.G4m  reason: case insensitive filesystem */
public abstract class C51854G4m extends C48256Ebb {
    /* JADX WARNING: type inference failed for: r0v32, types: [X.FW1, X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v33, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0168, code lost:
        if (r1 != null) goto L_0x0138;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C307896Rx r9, X.AnonymousClass6Tm r10) {
        /*
            r8 = this;
            r2 = 0
            java.lang.String r0 = X.DbY.A0h(r10, r2)
            X.0qQ.A0B(r0, r2)
            X.16F r0 = X.16P.A00(r0)
            libraries.fxcallauncher.model.FxUnifiedLauncherCallbackInfo r1 = X.C49267EsA.parseFromJson(r0)
            java.lang.String r0 = r1.A01
            X.0qQ.A0B(r0, r2)
            r8.A01 = r0
            java.util.List r0 = r1.A03
            X.0qQ.A0B(r0, r2)
            r8.A03 = r0
            java.lang.String r0 = r1.A02
            X.0qQ.A0B(r0, r2)
            r8.A02 = r0
            java.lang.String r0 = r1.A00
            X.0qQ.A0B(r0, r2)
            r8.A00 = r0
            java.util.List r0 = r8.A03
            if (r0 == 0) goto L_0x0177
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = r8.A02
            if (r0 == 0) goto L_0x0174
            int r0 = r0.length()
            if (r0 > 0) goto L_0x004e
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L_0x0171
            int r0 = r0.length()
            if (r0 > 0) goto L_0x004e
            r1 = 0
        L_0x004e:
            r8.A04 = r1
            X.6Rm r0 = r9.A03
            r7 = 0
            if (r0 == 0) goto L_0x016b
            r1 = 2131433345(0x7f0b1781, float:1.8488473E38)
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r6 = r0.get(r1)
        L_0x005e:
            androidx.fragment.app.FragmentActivity r4 = X.Dba.A08(r9)
            if (r6 == 0) goto L_0x010a
            boolean r0 = r6 instanceof X.ELU
            if (r0 == 0) goto L_0x00a7
            X.ELU r6 = (X.ELU) r6
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L_0x0171
            r6.A05(r0)
        L_0x0071:
            X.0lg r3 = X.DbU.A0V(r9)
            X.DbS.A1Z(r3)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r3)
            boolean r0 = r8.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.FW1 r0 = new X.FW1
            r0.<init>()
            r0.A00 = r1
            r2.A00(r0)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r3)
            X.FWF r0 = new X.FWF
            r0.<init>()
            r1.A00(r0)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r3)
            boolean r1 = r8.A04
            X.Lfh r0 = new X.Lfh
            r0.<init>(r1)
            r2.A00(r0)
            return r7
        L_0x00a7:
            boolean r0 = r6 instanceof X.C51853G4l
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L_0x0171
            int r1 = r0.length()
            X.G4n r6 = (X.C51855G4n) r6
            r0 = r6
            X.G4l r0 = (X.C51853G4l) r0
            if (r1 <= 0) goto L_0x00e0
            X.FYz r4 = r0.A02
            java.lang.String r2 = r6.A01()
            r6.A00()
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "client_flow_succeeded"
            java.lang.String r3 = ""
            X.C50342FYz.A00(r4, r0, r3, r2, r1)
            X.Eyy r0 = r6.A02
            if (r0 == 0) goto L_0x017a
            X.Eu2 r0 = r0.A01
            X.ELU r2 = r0.A00
            com.facebook.common.callercontext.CallerContext r0 = X.ELU.A03
            X.G7U r1 = r2.A02
            java.lang.String r0 = r2.A05
            r1.onAuthorizeSuccess(r3, r0)
            goto L_0x0071
        L_0x00e0:
            X.FYz r5 = r0.A02
            java.lang.String r4 = r6.A01()
            java.lang.String r3 = r6.A00()
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "Client Flow Interrupted"
            r0 = 2
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "client_flow_failed"
            X.C50342FYz.A00(r5, r0, r1, r4, r2)
            X.Eyy r0 = r6.A02
            if (r0 == 0) goto L_0x017a
            X.Eu2 r0 = r0.A01
            X.ELU r1 = r0.A00
            com.facebook.common.callercontext.CallerContext r0 = X.ELU.A03
            X.G7U r0 = r1.A02
            r0.onAuthorizeFail()
            goto L_0x0071
        L_0x010a:
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0071
            android.content.Intent r3 = X.DbS.A09()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.List r0 = r8.A03
            if (r0 == 0) goto L_0x0177
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0166
            java.util.List r0 = r8.A00()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0166
            java.util.List r0 = r8.A00()
            java.lang.Object r0 = r0.get(r2)
            libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount r0 = (libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount) r0
            java.lang.String r1 = r0.A02
        L_0x0138:
            java.lang.String r0 = "userID"
            r5.put(r0, r1)
            r0 = 131(0x83, float:1.84E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putExtra(r0, r5)
            java.lang.String r1 = r8.A01
            if (r1 == 0) goto L_0x016e
            java.lang.String r0 = "tokenString"
            r5.put(r0, r1)
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L_0x016e
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0162
            r0 = -1
            r4.setResult(r0, r3)
        L_0x015d:
            r4.finish()
            goto L_0x0071
        L_0x0162:
            r4.setResult(r2, r3)
            goto L_0x015d
        L_0x0166:
            java.lang.String r1 = r8.A02
            if (r1 == 0) goto L_0x0174
            goto L_0x0138
        L_0x016b:
            r6 = r7
            goto L_0x005e
        L_0x016e:
            java.lang.String r0 = "tokenString_DEPRECATED_DO_NOT_USE"
            goto L_0x017c
        L_0x0171:
            java.lang.String r0 = "obId"
            goto L_0x017c
        L_0x0174:
            java.lang.String r0 = "userId_DEPRECATED_DO_NOT_USE"
            goto L_0x017c
        L_0x0177:
            java.lang.String r0 = "addedAccounts"
            goto L_0x017c
        L_0x017a:
            java.lang.String r0 = "unifiedLauncherFlowConfig"
        L_0x017c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51854G4m.A01(X.6Rx, X.6Tm):java.lang.Object");
    }
}
