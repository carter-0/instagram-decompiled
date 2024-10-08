package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.5DA  reason: invalid class name */
public final class AnonymousClass5DA implements AnonymousClass1cS {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass0eK A02;

    public final void DTJ(1OS r1, C74248Prc prc) {
    }

    public final void DTN(1OS r1, C74248Prc prc) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (((X.C65481cr) r13).A0H == null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DTO(X.1OS r13, X.C74248Prc r14, X.C74248Prc r15) {
        /*
            r12 = this;
            X.MaP r15 = (X.C66656MaP) r15
            java.lang.String r4 = r15.A02
            java.lang.String r0 = "upload_failed_transient"
            boolean r0 = r0.equals(r4)
            java.lang.String r3 = "upload_failed_permanent"
            if (r0 != 0) goto L_0x0014
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x0096
        L_0x0014:
            X.4gN r7 = r15.A01
            r7.getClass()
            boolean r0 = r13 instanceof X.1bp
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r13 instanceof X.C65481cr
            if (r0 == 0) goto L_0x0029
            r0 = r13
            X.1cr r0 = (X.C65481cr) r0
            java.lang.String r0 = r0.A0H
            r10 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r10 = 0
        L_0x002a:
            boolean r0 = r13 instanceof X.C66491nb
            if (r0 != 0) goto L_0x0043
            boolean r0 = r13 instanceof X.1cE
            if (r0 == 0) goto L_0x00b4
            r0 = r13
            X.1cE r0 = (X.1cE) r0
            java.lang.Long r0 = r0.A0E
            if (r0 == 0) goto L_0x00b4
            long r5 = r0.longValue()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b4
        L_0x0043:
            r11 = 1
        L_0x0044:
            X.1bp r13 = (X.1bp) r13
            boolean r9 = r3.equals(r4)
            java.util.List r8 = r13.C6L()
            X.2FW r5 = r13.Aqm()
            java.lang.String r4 = r13.A06()
            X.0eK r0 = r12.A02
            java.lang.Object r3 = r0.get()
            X.2Dm r3 = (X.2Dm) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 1
            X.0qQ.A0B(r8, r0)
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0097
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0097
        L_0x0070:
            android.content.Context r5 = r12.A00
            com.instagram.common.session.UserSession r6 = r12.A01
            r13.Aqm()
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.OYQ.A00(r5, r6, r7, r8, r9, r10, r11)
            X.OVs r2 = X.C69881Ntj.A00(r6)
            X.MaY r0 = r13.A02
            X.ODs r1 = r0.A00
            r0 = 0
            java.lang.Object r0 = X.00k.A0O(r8, r0)
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            if (r0 == 0) goto L_0x0096
            r2.A01(r1, r0)
        L_0x0096:
            return
        L_0x0097:
            java.util.Iterator r2 = r8.iterator()
        L_0x009b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r2.next()
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            X.3su r0 = r3.BRx(r0, r5, r4)
            if (r0 == 0) goto L_0x009b
            java.lang.Integer r1 = r0.A1F
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x009b
            return
        L_0x00b4:
            r11 = 0
            goto L_0x0044
        L_0x00b6:
            java.lang.String r1 = r13.A02()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1854513303: goto L_0x015d;
                case -620744187: goto L_0x00c2;
                case -35397858: goto L_0x0160;
                case 1721185536: goto L_0x012f;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            return
        L_0x00c2:
            r0 = 4106(0x100a, float:5.754E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0096
            java.lang.String r1 = r7.A03
            r0 = 403(0x193, float:5.65E-43)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0174
            boolean r0 = r13 instanceof X.C66001id
            r4 = 0
            if (r0 == 0) goto L_0x0112
            X.1id r13 = (X.C66001id) r13
            com.instagram.model.direct.DirectThreadKey r0 = r13.C6K()
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.instagram.common.session.UserSession r0 = r12.A01
            X.2Dm r3 = X.1bJ.A00(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x00f5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r0 = r2.next()
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x00f5
            r0 = r3
            X.2Dr r0 = (X.2Dr) r0
            X.3U9 r0 = r0.A0N(r1)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r4 = r0.C6f()
        L_0x0112:
            android.content.Context r2 = r12.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            if (r4 == 0) goto L_0x016d
            int r0 = r4.length()
            if (r0 == 0) goto L_0x016d
            r1 = 2131959165(0x7f131d7d, float:1.9554963E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r0 = r2.getString(r1, r0)
            X.C59689JTv.A09(r2, r0)
            return
        L_0x012f:
            r0 = 3958(0xf76, float:5.546E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0096
            X.1g2 r13 = (X.AnonymousClass1g2) r13
            boolean r5 = r3.equals(r4)
            android.content.Context r1 = r12.A00
            com.instagram.common.session.UserSession r2 = r12.A01
            com.instagram.model.direct.DirectThreadKey r0 = r13.A01
            java.util.List r4 = java.util.Collections.singletonList(r0)
            r6 = 0
            X.0qQ.A0B(r1, r6)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 2
            X.0qQ.A0B(r4, r0)
            r3 = 0
            r7 = r6
            X.OYQ.A00(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x015d:
            r0 = 4151(0x1037, float:5.817E-42)
            goto L_0x0162
        L_0x0160:
            r0 = 2990(0xbae, float:4.19E-42)
        L_0x0162:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0174
            return
        L_0x016d:
            r0 = 2131959164(0x7f131d7c, float:1.955496E38)
            X.C59689JTv.A07(r2, r0)
            return
        L_0x0174:
            android.content.Context r2 = r12.A00
            X.4gN r1 = X.C270214gN.A0L
            r0 = 0
            if (r7 == r1) goto L_0x017c
            r0 = 1
        L_0x017c:
            X.C69904Nu6.A00(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5DA.DTO(X.1OS, X.Prc, X.Prc):void");
    }

    public AnonymousClass5DA(Context context, UserSession userSession, AnonymousClass0eK r4) {
        this.A00 = context.getApplicationContext();
        this.A01 = userSession;
        this.A02 = r4;
    }
}
