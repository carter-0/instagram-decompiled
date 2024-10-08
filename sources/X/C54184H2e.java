package X;

import com.instagram.creator.agent.settings.keyword.KeywordRepository;
import java.util.concurrent.CancellationException;

/* renamed from: X.H2e  reason: case insensitive filesystem */
public final class C54184H2e extends AnonymousClass8ZF {
    public C262204Co A00;
    public C262204Co A01;
    public C262204Co A02;
    public final KeywordRepository A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final 05G A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r9.longValue() <= 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r4 >= java.lang.System.currentTimeMillis()) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54184H2e(com.instagram.creator.agent.settings.keyword.KeywordRepository r18, java.lang.Long r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r17 = this;
            r1 = r17
            r1.<init>()
            r0 = r18
            r1.A03 = r0
            r8 = r20
            r1.A06 = r8
            r10 = r21
            r1.A05 = r10
            r0 = r22
            r1.A04 = r0
            r6 = 0
            r9 = r19
            if (r19 == 0) goto L_0x002d
            long r4 = r9.longValue()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r16 = 1
            if (r0 < 0) goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            int r0 = r8.length()
            boolean r15 = X.AnonymousClass7TF.A1Q(r0)
            if (r16 != 0) goto L_0x0044
            if (r19 == 0) goto L_0x0044
            long r2 = r9.longValue()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r14 = 1
            if (r0 > 0) goto L_0x0045
        L_0x0044:
            r14 = 0
        L_0x0045:
            r4 = 0
            X.IQj r7 = X.C57145IQj.A00
            X.HLa r5 = X.C54617HLa.SUCCESS
            r13 = 2000(0x7d0, float:2.803E-42)
            X.GnP r3 = new X.GnP
            r11 = r23
            r12 = r24
            r6 = r4
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.02z r0 = X.DbS.A10(r3)
            r1.A08 = r0
            X.05F r0 = X.10b.A03(r0)
            r1.A0A = r0
            X.IQk r0 = X.C57146IQk.A00
            X.02z r0 = X.106.A01(r0)
            r1.A07 = r0
            X.05F r0 = X.10b.A03(r0)
            r1.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54184H2e.<init>(com.instagram.creator.agent.settings.keyword.KeywordRepository, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A00() {
        Object value;
        C262204Co r0 = this.A02;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        C53392GnP gnP = (C53392GnP) this.A0A.getValue();
        if (gnP.A08.length() > 0 && gnP.A07.length() > 0 && (gnP.A04 instanceof C57145IQj) && (gnP.A05 instanceof C57145IQj)) {
            05G r2 = this.A08;
            do {
                value = r2.getValue();
            } while (!r2.AIY(value, C53392GnP.A00((C53531Gq1) null, (C54617HLa) null, C54617HLa.LOADING, (JM1) null, (JM1) null, (C53392GnP) value, (Long) null, (String) null, (String) null, (String) null, 6143, false)));
            this.A02 = C51966G9m.A1L(new C58102ImO(this, (AnonymousClass4D7) null, 44), C318116oQ.A00(this));
        }
    }
}
