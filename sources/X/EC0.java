package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;

public final class EC0 extends 1P0 {
    public final /* synthetic */ G75 A00;
    public final /* synthetic */ C317826nu A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public EC0(G75 g75, C317826nu r2, String str, String str2) {
        this.A00 = g75;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e6 A[EDGE_INSN: B:71:0x00e6->B:42:0x00e6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x007a A[EDGE_INSN: B:74:0x007a->B:23:0x007a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r18
            r0 = -156984420(0xfffffffff6a49b9c, float:-1.6693219E33)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.3JC r1 = (X.AnonymousClass3JC) r1
            r0 = 821196918(0x30f27876, float:1.7642054E-9)
            int r4 = X.AnonymousClass7TG.A0D(r1, r0)
            java.lang.Object r7 = r1.A01
            X.3FZ r7 = (X.AnonymousClass3FZ) r7
            r12 = 0
            r13 = r17
            if (r7 == 0) goto L_0x010e
            java.lang.Class<X.DqN> r6 = X.C47086DqN.class
            java.lang.String r3 = "fx_growth"
            X.3FZ r0 = r7.A00(r6, r3)
            if (r0 == 0) goto L_0x010e
            X.3FZ r2 = r7.A00(r6, r3)
            if (r2 == 0) goto L_0x0035
            java.lang.Class<X.DqL> r1 = X.C47084DqL.class
            java.lang.String r0 = "can_user_see_ac_upsell_for_entry_point_one"
            com.google.common.collect.ImmutableList r11 = r2.A02(r0, r1)
            if (r11 != 0) goto L_0x003c
        L_0x0035:
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r11)
        L_0x003c:
            X.3FZ r2 = r7.A00(r6, r3)
            if (r2 == 0) goto L_0x004c
            java.lang.Class<X.DqM> r1 = X.C47085DqM.class
            java.lang.String r0 = "can_user_see_ac_upsell_for_entry_point_two"
            com.google.common.collect.ImmutableList r14 = r2.A02(r0, r1)
            if (r14 != 0) goto L_0x0053
        L_0x004c:
            com.google.common.collect.ImmutableList r14 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r14)
        L_0x0053:
            X.6nu r3 = r13.A01
            java.util.Map r7 = r3.A03
            java.lang.String r8 = r13.A02
            boolean r0 = r11 instanceof java.util.Collection
            r10 = 0
            r16 = 1
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x00c8
        L_0x0066:
            r0 = 0
        L_0x0067:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.put(r8, r0)
            java.lang.String r6 = r13.A03
            boolean r0 = r14 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x00aa
        L_0x007a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r7.put(r6, r0)
            java.util.Map r10 = r3.A04
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r11)
            java.util.Iterator r15 = r11.iterator()
        L_0x008b:
            boolean r0 = r15.hasNext()
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r2 = r15.next()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            r0 = 342(0x156, float:4.79E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.A05(r0)
            if (r0 == 0) goto L_0x00a6
            r9 = r0
        L_0x00a6:
            r1.add(r9)
            goto L_0x008b
        L_0x00aa:
            java.util.Iterator r9 = r14.iterator()
        L_0x00ae:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r2 = r9.next()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            X.EXH r1 = X.EXH.A03
            java.lang.String r0 = "eligibility"
            java.lang.Enum r1 = r2.A04(r0, r1)
            X.EXH r0 = X.EXH.A02
            if (r1 != r0) goto L_0x00ae
            r10 = 1
            goto L_0x007a
        L_0x00c8:
            java.util.Iterator r6 = r11.iterator()
        L_0x00cc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r2 = r6.next()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            X.EXH r1 = X.EXH.A03
            java.lang.String r0 = "eligibility"
            java.lang.Enum r1 = r2.A04(r0, r1)
            X.EXH r0 = X.EXH.A02
            if (r1 != r0) goto L_0x00cc
            r0 = 1
            goto L_0x0067
        L_0x00e6:
            r10.put(r8, r1)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r14)
            java.util.Iterator r14 = r14.iterator()
        L_0x00f1:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r1 = r14.next()
            X.3FZ r1 = (X.AnonymousClass3FZ) r1
            r0 = 342(0x156, float:4.79E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.A05(r0)
            if (r0 != 0) goto L_0x010a
            r0 = r9
        L_0x010a:
            r2.add(r0)
            goto L_0x00f1
        L_0x010e:
            X.G75 r1 = r13.A00
            if (r1 == 0) goto L_0x0117
            java.lang.String r0 = "Prefetch Failed: server response.result?.fxGrowth is null"
            r1.onFail(r0)
        L_0x0117:
            r0 = 1557225849(0x5cd16179, float:4.7148354E17)
            goto L_0x0148
        L_0x011b:
            r10.put(r6, r2)
            X.C317826nu.A04(r12, r11, r3, r8)
            X.G75 r0 = r13.A00
            if (r0 == 0) goto L_0x0128
            r0.onSuccess()
        L_0x0128:
            java.lang.Object r0 = r7.get(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r16)
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x0152
            java.lang.Object r0 = r7.get(r6)
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "native auth response: ineligible"
        L_0x0142:
            X.C317826nu.A05(r3, r0)
        L_0x0145:
            r0 = 1305315062(0x4dcd86f6, float:4.3102176E8)
        L_0x0148:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 706106028(0x2a1652ac, float:1.3351359E-13)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0152:
            java.lang.Object r0 = r7.get(r8)
            boolean r0 = X.0qQ.A0K(r0, r2)
            java.lang.String r1 = ": native auth response: eligible"
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = X.002.A0R(r8, r1)
            X.C317826nu.A05(r3, r0)
        L_0x0165:
            java.lang.Object r0 = r7.get(r6)
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = X.002.A0R(r6, r1)
            goto L_0x0142
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EC0.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r8) {
        String str;
        int A0D = AnonymousClass7TG.A0D(r8, 1877609486);
        G75 g75 = this.A00;
        String str2 = null;
        if (g75 != null) {
            Throwable A012 = r8.A01();
            if (A012 != null) {
                str2 = A012.getMessage();
            }
            g75.onFail(002.A0R("Prefetch Failed: server onFail: ", str2));
        }
        C317826nu r1 = this.A01;
        C317826nu.A05(r1, "native auth response: failure");
        UserSession userSession = r1.A02;
        C48152EZu A002 = C317826nu.A00(this.A02);
        Throwable A013 = r8.A01();
        0eP A1L = AnonymousClass7TE.A1L("exception", String.valueOf(A013));
        if (A013 == null || (str = A013.getMessage()) == null) {
            str = "";
        }
        FFL.A01(A002, userSession, "upsell_combined_two_entry_point_multi_native_auth_prefetch_exception", DbY.A0p(DialogModule.KEY_MESSAGE, str, A1L));
        AnonymousClass0fD.A0A(-2089126442, A0D);
    }
}
