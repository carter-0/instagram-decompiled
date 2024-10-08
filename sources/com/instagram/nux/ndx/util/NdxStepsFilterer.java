package com.instagram.nux.ndx.util;

import X.0Aj;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass35F;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C267044ar;
import X.C49048EoS;
import X.DbV;
import X.DbY;
import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class NdxStepsFilterer {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass35F A02;
    public final Integer A03;
    public final ArrayList A04;

    /* JADX WARNING: type inference failed for: r10v1, types: [X.Peq, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass12V r14, X.G62 r15, X.FB9 r16, X.0tS r17, X.0BQ r18, X.AnonymousClass4D7 r19) {
        /*
            r13 = this;
            r5 = r16
            r9 = 0
            r3 = r19
            boolean r0 = r3 instanceof X.C73552Peq
            if (r0 == 0) goto L_0x00da
            r10 = r3
            X.Peq r10 = (X.C73552Peq) r10
            int r0 = r10.A06
            if (r0 != r9) goto L_0x00da
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00da
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x001b:
            java.lang.Object r3 = r10.A05
            X.1Hj r8 = X.1Hj.A02
            int r0 = r10.A00
            r7 = 1
            if (r0 == 0) goto L_0x007e
            if (r0 != r7) goto L_0x016d
            long r1 = r10.A01
            java.lang.Object r6 = r10.A04
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r10.A03
            X.FB9 r5 = (X.FB9) r5
            java.lang.Object r7 = r10.A02
            com.instagram.nux.ndx.util.NdxStepsFilterer r7 = (com.instagram.nux.ndx.util.NdxStepsFilterer) r7
            X.0eS.A00(r3)
        L_0x0037:
            com.instagram.common.session.UserSession r0 = r7.A01
            X.1CV r12 = r5.A00(r0)
            X.0qQ.A0B(r6, r9)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00f1
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.Pzc r11 = new X.Pzc
            r11.<init>()
            java.lang.Class<X.Jtv> r10 = X.C60937Jtv.class
            com.instagram.nux.aymh.accountprovider.AccountSerializer r8 = new com.instagram.nux.aymh.accountprovider.AccountSerializer
            r8.<init>()
            java.util.List r4 = r11.A0A
            r3 = 0
            X.PzZ r0 = new X.PzZ
            r0.<init>(r3, r10, r8, r9)
            r4.add(r0)
            com.google.gson.Gson r4 = r11.A00()
            java.util.Iterator r3 = r6.iterator()
        L_0x0069:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = r4.A0B(r0)
            X.0qQ.A07(r0)
            r5.add(r0)
            goto L_0x0069
        L_0x007e:
            X.0eS.A00(r3)
            long r1 = java.lang.System.currentTimeMillis()
            java.util.List r0 = r18.BNu()
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0091:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a7
            com.instagram.user.model.User r0 = X.DbT.A0k(r4)
            java.lang.String r3 = r0.getId()
            java.lang.String r0 = r0.getUsername()
            X.AnonymousClass7TF.A1I(r3, r0, r6)
            goto L_0x0091
        L_0x00a7:
            java.util.Map r11 = X.0Yt.A08(r6)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            android.app.Activity r3 = r13.A00
            com.instagram.common.session.UserSession r0 = r13.A01
            X.0r6 r3 = r15.AY2(r3, r14, r0)
            r0 = 6
            X.MC8 r4 = new X.MC8
            r12 = r17
            r4.<init>((int) r0, (java.lang.Object) r12, (java.lang.Object) r3, (java.lang.Object) r11)
            r3 = 13
            X.FxC r0 = new X.FxC
            r0.<init>((X.AnonymousClass0r6) r4, (int) r3)
            r10.A02 = r13
            r10.A03 = r5
            r10.A04 = r6
            r10.A01 = r1
            r10.A00 = r7
            java.lang.Object r0 = X.11N.A00(r6, r10, r0)
            if (r0 != r8) goto L_0x00d7
            return r8
        L_0x00d7:
            r7 = r13
            goto L_0x0037
        L_0x00da:
            X.Peq r10 = new X.Peq
            r10.<init>(r13, r3, r9)
            goto L_0x001b
        L_0x00e1:
            X.0xY r4 = r12.AR4()
            java.util.Set r3 = X.00k.A0k(r5)
            java.lang.String r0 = "additional_accounts"
            r4.E5h(r0, r3)
            r4.apply()
        L_0x00f1:
            X.35F r7 = r7.A02
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            if (r0 == 0) goto L_0x0159
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x0100:
            X.0wc r1 = r7.A00
            java.lang.String r0 = "ig4a_ndx_request"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r1 = "multiple_account"
            java.lang.String r0 = "flow_name"
            r7.AAJ(r0, r1)
            int r0 = r3.intValue()
            if (r0 == 0) goto L_0x0156
            java.lang.String r0 = "fail_client_filter"
        L_0x0117:
            X.DbY.A1F(r7, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.String r1 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r0 = "ig_ndx_source"
            r7.AAJ(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "step_latency"
            r7.AAJ(r0, r1)
            if (r3 != r2) goto L_0x0161
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r4 = r6.iterator()
        L_0x0136:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x015c
            java.lang.Object r3 = r4.next()
            X.Jtv r3 = (X.C60937Jtv) r3
            java.lang.String r2 = r3.A04
            r1 = 44
            java.lang.String r0 = r3.A03
            java.lang.String r1 = X.002.A0T(r2, r0, r1)
            java.lang.Integer r0 = r3.A01
            java.lang.String r0 = X.C49774F6h.A01(r0)
            r5.put(r1, r0)
            goto L_0x0136
        L_0x0156:
            java.lang.String r0 = "pass_client_filter"
            goto L_0x0117
        L_0x0159:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x0100
        L_0x015c:
            java.lang.String r0 = "aymh_info"
            r7.A9H(r0, r5)
        L_0x0161:
            r7.Cgf()
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x016d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.ndx.util.NdxStepsFilterer.A00(X.12V, X.G62, X.FB9, X.0tS, X.0BQ, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r13) {
        /*
            r12 = this;
            r3 = 10
            boolean r0 = X.C66138MDq.A02(r3, r13)
            r5 = r12
            if (r0 == 0) goto L_0x0087
            r11 = r13
            X.MDq r11 = (X.C66138MDq) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0087
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0017:
            java.lang.Object r0 = r11.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r11.A00
            r4 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r4) goto L_0x008d
            java.lang.Object r2 = r11.A01
            com.instagram.nux.ndx.util.NdxStepsFilterer r2 = (com.instagram.nux.ndx.util.NdxStepsFilterer) r2
            X.0eS.A00(r0)
        L_0x0029:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0036
            java.util.ArrayList r1 = r2.A04
            java.lang.String r0 = "multiple_account"
            r1.remove(r0)
        L_0x0036:
            java.util.ArrayList r0 = r2.A04
            return r0
        L_0x0039:
            X.0eS.A00(r0)
            java.util.ArrayList r2 = r12.A04
            java.lang.String r1 = "contact_importer"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x004f
            boolean r0 = r12.A02()
            if (r0 != 0) goto L_0x004f
            r2.remove(r1)
        L_0x004f:
            java.lang.String r0 = "multiple_account"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0085
            r11.A01 = r12
            r11.A00 = r4
            X.0tS r9 = X.DbT.A0h()
            X.EXE r2 = X.EXE.GOOGLE
            X.EXE r1 = X.EXE.ONE_TAP
            X.EXE r0 = X.EXE.SMART_LOCK
            X.EXE[] r0 = new X.EXE[]{r2, r1, r0}
            java.util.Set r0 = X.0sc.A07(r0)
            X.FfM r7 = new X.FfM
            r7.<init>(r0)
            X.12T r6 = X.AnonymousClass12T.A00
            com.instagram.common.session.UserSession r0 = r12.A01
            X.0BQ r10 = X.AnonymousClass0BO.A00(r0)
            X.FB9 r8 = X.FB9.A00
            java.lang.Object r0 = r5.A00(r6, r7, r8, r9, r10, r11)
            if (r0 != r3) goto L_0x0083
            return r3
        L_0x0083:
            r2 = r12
            goto L_0x0029
        L_0x0085:
            r2 = r12
            goto L_0x0036
        L_0x0087:
            X.MDq r11 = new X.MDq
            r11.<init>(r12, r13, r3)
            goto L_0x0017
        L_0x008d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.ndx.util.NdxStepsFilterer.A01(X.4D7):java.lang.Object");
    }

    public final boolean A02() {
        Integer num;
        String str;
        boolean A002 = C267044ar.A00(this.A00, this.A01);
        AnonymousClass35F r1 = this.A02;
        Integer num2 = this.A03;
        0qQ.A0B(num2, 0);
        if (A002) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        0Aj A0e = AnonymousClass7TE.A0e(r1.A00, "ig4a_ndx_request");
        A0e.AAJ("flow_name", "contact_importer");
        if (num.intValue() != 0) {
            str = "fail_client_filter";
        } else {
            str = "pass_client_filter";
        }
        DbY.A1F(A0e, str);
        DbV.A1K(A0e, C49048EoS.A00(num2));
        return A002;
    }

    public NdxStepsFilterer(Activity activity, UserSession userSession, AnonymousClass35F r4, Integer num, ArrayList arrayList) {
        AnonymousClass7TG.A1Q(num, arrayList);
        0qQ.A0B(r4, 5);
        this.A01 = userSession;
        this.A03 = num;
        this.A04 = arrayList;
        this.A00 = activity;
        this.A02 = r4;
    }
}
