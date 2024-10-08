package X;

import android.view.View;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.user.model.User;
import java.util.Map;

public final class ECV extends 1P0 {
    public User A00;
    public boolean A01;
    public final /* synthetic */ E6T A02;

    public ECV(E6T e6t, User user, boolean z) {
        this.A02 = e6t;
        this.A01 = z;
        this.A00 = user;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r17) {
        /*
            r16 = this;
            r10 = r17
            r0 = 1792937100(0x6ade0c8c, float:1.3422039E26)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.7ax r10 = (X.C334247ax) r10
            r0 = -293154983(0xffffffffee86cf59, float:-2.086083E28)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r2 = r16
            X.ECV.super.onSuccess(r10)
            r10.getItems()
            java.util.List r0 = r10.getItems()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009d
            X.E6T r7 = r2.A02
            java.util.List r1 = r10.getItems()
            X.E6T.A04(r7, r1)
            java.util.Map r0 = r7.A0A
            com.instagram.user.model.User r3 = r2.A00
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x00b1
            java.util.Map r0 = r7.A0A
            java.lang.Object r2 = r0.get(r3)
            X.F2g r2 = (X.F2g) r2
            java.util.List r9 = r2.A05
            r9.addAll(r1)
            int r8 = r9.size()
            int r4 = r2.A00
            int r8 = r8 - r4
            boolean r0 = r2.A03
            r1 = 10
            if (r0 == 0) goto L_0x0053
            r1 = 50
        L_0x0053:
            if (r8 > r1) goto L_0x00aa
            int r0 = r9.size()
            r2.A00 = r0
            int r0 = r9.size()
            int r0 = r0 + 1
        L_0x0061:
            r2.A01 = r0
            java.lang.String r0 = r10.getNextMaxId()
            r2.A02 = r0
        L_0x0069:
            java.util.Map r0 = r7.A0A
            r0.put(r3, r2)
        L_0x006e:
            X.Djg r2 = r7.A06
            java.util.Map r0 = r7.A0A
            java.util.ArrayList r1 = X.Dba.A0e(r0)
            java.util.List r0 = r2.A04
            r0.clear()
            r0.addAll(r1)
            r0 = 0
            r2.A03 = r0
            r0 = 1521446800(0x5aaf6f90, float:2.46903926E16)
            X.0fE.A00(r2, r0)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r7.A04
            if (r0 == 0) goto L_0x009d
            java.lang.String r8 = "invite_followers_via_suma_followings"
            r10 = 0
            java.lang.String r9 = r7.A07
            X.Xtl r7 = new X.Xtl
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.Ci5(r7)
        L_0x009d:
            r0 = -2029802465(0xffffffff8703ac1f, float:-9.905926E-35)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -576238373(0xffffffffdda74cdb, float:-1.50690639E18)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x00aa:
            int r4 = r4 + r1
            r2.A00 = r4
            int r0 = r2.A01
            int r0 = r0 + r1
            goto L_0x0061
        L_0x00b1:
            java.lang.String r0 = r10.getNextMaxId()
            X.F2g r2 = new X.F2g
            r2.<init>(r3, r0, r1)
            java.util.Map r0 = r7.A0A
            r0.put(r3, r2)
            java.util.Map r0 = r7.A0A
            java.util.Set r0 = r0.keySet()
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x00d6
            r2.A03 = r0
            android.content.Context r0 = r7.getContext()
            r2.A00(r0)
            goto L_0x0069
        L_0x00d6:
            java.util.Map r0 = r7.A0A
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r0)
        L_0x00dc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006e
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r4)
            java.lang.Object r2 = r3.getValue()
            X.F2g r2 = (X.F2g) r2
            r0 = 0
            r2.A03 = r0
            android.content.Context r0 = r7.getContext()
            r2.A00(r0)
            java.util.Map r1 = r7.A0A
            java.lang.Object r0 = r3.getKey()
            r1.put(r0, r2)
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ECV.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r13) {
        String str;
        int A03 = AnonymousClass0fD.A03(1999050410);
        Throwable A012 = r13.A01();
        if (A012 != null) {
            str = A012.getMessage();
        } else {
            str = "";
        }
        E6T e6t = this.A02;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e6t.A04;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ci6(new C22030Xtl("invite_followers_via_suma_followings", e6t.A07, (String) null, str, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A0A(702755836, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-2066879152);
        if (this.A01) {
            E6T e6t = this.A02;
            if (e6t.A0I.incrementAndGet() == e6t.A09.size()) {
                View view = e6t.A01;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (e6t.A0A.keySet().isEmpty()) {
                    C46710Djg djg = e6t.A06;
                    djg.A03 = true;
                    0fE.A00(djg, -900434024);
                }
            }
        }
        AnonymousClass0fD.A0A(421865071, A03);
    }
}
