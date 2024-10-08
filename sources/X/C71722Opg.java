package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservable;

/* renamed from: X.Opg  reason: case insensitive filesystem */
public final class C71722Opg implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public C71722Opg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C71722Opg A00(Object obj, int i) {
        return new C71722Opg(obj, i);
    }

    public static void A01(MailboxObservable mailboxObservable, Object obj, int i) {
        mailboxObservable.addResultCallback(new C71722Opg(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v63, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v64, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.NB3, X.5z0] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03a6, code lost:
        X.0KC.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03b4, code lost:
        if (r1 != null) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03b6, code lost:
        r0 = new X.C257453xQ(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03bb, code lost:
        r2.A02(r0);
        r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03cc, code lost:
        if (r1 == null) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03ce, code lost:
        r0 = X.C2612848z.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        if (r4 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x041f, code lost:
        r3.requireActivity().runOnUiThread(new X.C73226PZ4(r3, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x042b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        if (r0 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x047d, code lost:
        if (r4 != null) goto L_0x064b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05ff, code lost:
        r1 = new X.N0I(X.C60340gF.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0649, code lost:
        if (r4 != null) goto L_0x064b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x064b, code lost:
        r7 = (X.C71087ObS) r3.A01;
        r1 = new X.N0I(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x06ba, code lost:
        r7.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02d1, code lost:
        if (r4.A01 == false) goto L_0x02d3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x033e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r32) {
        /*
            r31 = this;
            r3 = r31
            r4 = r32
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x06be;
                case 1: goto L_0x06b1;
                case 2: goto L_0x0663;
                case 3: goto L_0x0643;
                case 4: goto L_0x0477;
                case 5: goto L_0x0619;
                case 6: goto L_0x0608;
                case 7: goto L_0x05ea;
                case 8: goto L_0x05e0;
                case 9: goto L_0x05b7;
                case 10: goto L_0x05af;
                case 11: goto L_0x05a1;
                case 12: goto L_0x035f;
                case 13: goto L_0x0597;
                case 14: goto L_0x058f;
                case 15: goto L_0x053c;
                case 16: goto L_0x04e2;
                case 17: goto L_0x04ae;
                case 18: goto L_0x06b1;
                case 19: goto L_0x0490;
                case 20: goto L_0x0466;
                case 21: goto L_0x039c;
                case 22: goto L_0x0391;
                case 23: goto L_0x0386;
                case 24: goto L_0x045c;
                case 25: goto L_0x0453;
                case 26: goto L_0x044a;
                case 27: goto L_0x0441;
                case 28: goto L_0x0438;
                case 29: goto L_0x042f;
                case 30: goto L_0x02d8;
                case 31: goto L_0x02c2;
                case 32: goto L_0x02b8;
                case 33: goto L_0x02b8;
                case 34: goto L_0x02aa;
                case 35: goto L_0x0282;
                case 36: goto L_0x02b8;
                case 37: goto L_0x00bc;
                case 38: goto L_0x0095;
                case 39: goto L_0x05e0;
                case 40: goto L_0x0597;
                case 41: goto L_0x0080;
                case 42: goto L_0x006b;
                case 43: goto L_0x0413;
                case 44: goto L_0x0403;
                case 45: goto L_0x03f3;
                case 46: goto L_0x03e3;
                case 47: goto L_0x03d1;
                case 48: goto L_0x0009;
                case 49: goto L_0x0009;
                case 50: goto L_0x0059;
                case 51: goto L_0x0047;
                case 52: goto L_0x0009;
                case 53: goto L_0x0059;
                case 54: goto L_0x0009;
                case 55: goto L_0x0009;
                case 56: goto L_0x0032;
                case 57: goto L_0x0059;
                case 58: goto L_0x0029;
                case 59: goto L_0x0009;
                case 60: goto L_0x0009;
                case 61: goto L_0x03aa;
                case 62: goto L_0x03c2;
                case 63: goto L_0x0029;
                case 64: goto L_0x0029;
                case 65: goto L_0x0009;
                case 66: goto L_0x0029;
                case 67: goto L_0x0032;
                case 68: goto L_0x0029;
                case 69: goto L_0x0016;
                case 70: goto L_0x0047;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r3.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            X.MYb r0 = X.MYb.A0M
            r1.A02(r4)
        L_0x0012:
            r1.A00()
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r1 = r3.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            X.MYb r0 = X.MYb.A0M
            java.lang.Object r0 = r4.value
            if (r0 == 0) goto L_0x0012
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Long r0 = X.C51968G9o.A0v(r0)
            goto L_0x0067
        L_0x0029:
            java.lang.Object r1 = r3.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            X.MYb r0 = X.MYb.A0M
            goto L_0x0063
        L_0x0032:
            java.lang.Object r1 = r3.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            X.MYb r0 = X.MYb.A0M
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x0043
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0043:
            r1.A02(r0)
            goto L_0x0012
        L_0x0047:
            java.lang.Object r1 = r3.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            X.MYb r0 = X.MYb.A0M
            java.lang.Object r0 = r4.value
            X.3xP r0 = X.C257443xP.A00(r0)
            r1.A02(r0)
            goto L_0x0012
        L_0x0059:
            java.lang.Object r1 = r3.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            X.MYb r0 = X.MYb.A0M
            if (r4 == 0) goto L_0x0012
        L_0x0063:
            java.lang.Object r0 = r4.value
            if (r0 == 0) goto L_0x0012
        L_0x0067:
            r1.A02(r0)
            goto L_0x0012
        L_0x006b:
            java.lang.Object r1 = r3.A01
            X.OZd r1 = (X.C71026OZd) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            if (r0 == 0) goto L_0x0015
            int r0 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            return
        L_0x0080:
            java.lang.Object r1 = r3.A01
            X.OZd r1 = (X.C71026OZd) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            if (r0 == 0) goto L_0x0015
            int r0 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            return
        L_0x0095:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            X.5z0 r0 = (X.C301345z0) r0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r3 = r3.A01
            X.MtQ r3 = (X.C67711MtQ) r3
            r2 = 0
            com.facebook.msys.mci.CQLResultSet r1 = r0.mResultSet
            r0 = 5
            int r0 = r1.getInteger(r2, r0)
            if (r0 != r2) goto L_0x0015
            X.NUa r1 = r3.A07
            java.lang.String r0 = "OTC_RESTORE_WAIT_ACKED"
            r1.A0B(r0)
            X.05G r1 = r3.A0B
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.FIA(r0)
            return
        L_0x00bc:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            X.5z0 r0 = (X.C301345z0) r0
            if (r0 == 0) goto L_0x027c
            java.lang.Object r3 = r3.A01
            X.OL4 r3 = (X.OL4) r3
            r2 = 0
            com.facebook.msys.mci.CQLResultSet r1 = r0.mResultSet
            r0 = 2
            com.facebook.msys.mci.CQLResultSet r0 = r1.getChildResultSet(r2, r0)
            X.NB4 r1 = new X.NB4
            r1.<init>(r0)
            int r18 = X.C66580MXl.A04(r1)
            r0 = 0
        L_0x00da:
            r4 = r18
            if (r0 >= r4) goto L_0x0015
            java.lang.String r4 = X.C66580MXl.A0v(r1, r0, r2)
            long r13 = X.C66580MXl.A08(r4)
            X.2Dm r10 = r3.A02
            X.3U9 r9 = r10.B34(r13)
            r6 = 1
            if (r9 != 0) goto L_0x0118
            com.instagram.common.session.UserSession r4 = r3.A01
            X.1bO r9 = X.1bO.A00(r4)
            java.lang.String r5 = java.lang.String.valueOf(r13)
            java.lang.String r4 = r3.A03
            java.util.List r11 = X.C66581MXm.A11(r5, r4)
            com.instagram.direct.perf.constants.ThreadFetchReason r7 = com.instagram.direct.perf.constants.ThreadFetchReason.MISSING_DATA_IN_INBOX_SNAPSHOT_E2E
            X.PDy r8 = X.C72645PDy.A00
            java.util.Collections.sort(r11)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            X.7BO r6 = new X.7BO
            r6.<init>((com.instagram.direct.perf.constants.ThreadFetchReason) r7, (X.C74340PtG) r8, (X.1bO) r9, (java.lang.Boolean) r10, (java.util.List) r11)
            r6.A03()
            X.0qQ.A0A(r6)
        L_0x0115:
            int r0 = r0 + 1
            goto L_0x00da
        L_0x0118:
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 2
            boolean r24 = r5.getBoolean(r0, r4)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            com.instagram.model.direct.DirectThreadKey r6 = r9.BJz()
            X.OrG r5 = X.C71813OrG.A00
            r4 = 0
            java.util.List r12 = r10.BSS(r5, r6, r4)
            if (r12 != 0) goto L_0x0132
            X.0sn r12 = X.0sn.A00
        L_0x0132:
            boolean r22 = r9.CKK()
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 4
            com.facebook.msys.mci.CQLResultSet r4 = r5.getChildResultSet(r0, r4)
            X.NB3 r8 = new X.NB3
            r8.<init>(r4)
            int r7 = X.C66580MXl.A04(r8)
            r6 = 0
        L_0x0147:
            if (r6 >= r7) goto L_0x016d
            X.Oa0 r25 = X.C71037Oa0.A00
            com.instagram.common.session.UserSession r15 = r3.A01
            X.7Qc r5 = new X.7Qc
            r5.<init>(r9)
            X.P0X r4 = new X.P0X
            r4.<init>(r8, r6)
            r26 = r15
            r27 = r4
            r28 = r5
            r29 = r13
            X.0eP r4 = r25.A03(r26, r27, r28, r29)
            java.lang.Object r4 = r4.A00
            if (r4 == 0) goto L_0x016a
            r11.add(r4)
        L_0x016a:
            int r6 = r6 + 1
            goto L_0x0147
        L_0x016d:
            java.util.Comparator r5 = X.AnonymousClass48U.A04
            java.util.List r20 = X.00k.A0g(r12, r5)
            java.util.List r21 = X.00k.A0g(r11, r5)
            r23 = r2
            r25 = r2
            r19 = r5
            X.59G r6 = X.C70002Nvg.A00(r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r7 = r6.A00
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r4 = r6.A01
            boolean r15 = X.AnonymousClass7TE.A1a(r4)
            java.lang.Object r4 = r6.A02
            boolean r17 = X.AnonymousClass7TE.A1a(r4)
            boolean r4 = X.AnonymousClass7TE.A1b(r7)
            if (r4 == 0) goto L_0x0115
            X.NHP r12 = new X.NHP
            r12.<init>()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r7.iterator()
        L_0x01a4:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x01bb
            java.lang.Object r8 = r13.next()
            r4 = r8
            X.3su r4 = (X.C254703su) r4
            X.2FW r6 = r4.A10
            X.2FW r4 = X.2FW.A0q
            if (r6 != r4) goto L_0x01a4
            r11.add(r8)
            goto L_0x01a4
        L_0x01bb:
            r12.A04 = r11
            com.instagram.model.direct.DirectThreadKey r6 = r9.BJz()
            java.lang.Object r4 = X.00k.A0K(r7)
            java.lang.String r13 = X.C66580MXl.A0y(r4)
            java.lang.String r11 = ""
            if (r13 != 0) goto L_0x01ce
            r13 = r11
        L_0x01ce:
            java.lang.Object r4 = X.00k.A0I(r7)
            java.lang.String r4 = X.C66580MXl.A0y(r4)
            if (r4 == 0) goto L_0x01d9
            r11 = r4
        L_0x01d9:
            java.lang.Object r14 = X.00k.A0K(r7)
            X.0sn r8 = X.0sn.A00
            X.2Dr r10 = (X.2Dr) r10
            X.2En r4 = r10.A0F
            X.48S r4 = r4.A04(r6)
            if (r4 == 0) goto L_0x0115
            monitor-enter(r4)
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0705 }
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0705 }
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0705 }
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0705 }
            java.util.List r6 = r12.A04     // Catch:{ all -> 0x0705 }
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1D(r6)     // Catch:{ all -> 0x0705 }
            java.util.Collections.sort(r6, r5)     // Catch:{ all -> 0x0705 }
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r7)     // Catch:{ all -> 0x0705 }
            java.util.Collections.sort(r7, r5)     // Catch:{ all -> 0x0705 }
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r8)     // Catch:{ all -> 0x0705 }
            java.util.Collections.sort(r8, r5)     // Catch:{ all -> 0x0705 }
            java.util.ArrayList r7 = X.AnonymousClass3S1.A02(r5, r7, r8)     // Catch:{ all -> 0x0705 }
            java.util.ArrayList r6 = X.AnonymousClass3S1.A02(r5, r6, r7)     // Catch:{ all -> 0x0705 }
            if (r14 == 0) goto L_0x0223
            java.util.List r14 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x0705 }
            java.util.ArrayList r6 = X.AnonymousClass3S1.A02(r5, r6, r14)     // Catch:{ all -> 0x0705 }
        L_0x0223:
            r14 = 1
            X.48V r5 = X.AnonymousClass48V.A00     // Catch:{ all -> 0x0705 }
            java.lang.String r14 = X.AnonymousClass48V.A01(r11, r15, r14)     // Catch:{ all -> 0x0705 }
            r11 = r17
            java.lang.String r13 = X.AnonymousClass48V.A00(r13, r11)     // Catch:{ all -> 0x0705 }
            X.48h r11 = new X.48h     // Catch:{ all -> 0x0705 }
            r11.<init>(r5, r14, r13)     // Catch:{ all -> 0x0705 }
            X.48h r13 = X.AnonymousClass48U.A02(r12)     // Catch:{ all -> 0x0705 }
            java.util.List r5 = r4.A0K     // Catch:{ all -> 0x0705 }
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r16
            r24 = r10
            X.AnonymousClass48S.A0E(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0705 }
            X.3U9 r12 = r4.A0I     // Catch:{ all -> 0x0705 }
            X.1UV r5 = r4.A07     // Catch:{ all -> 0x0705 }
            java.lang.Object r5 = X.AnonymousClass3S1.A00(r5, r8)     // Catch:{ all -> 0x0705 }
            X.3su r5 = (X.C254703su) r5     // Catch:{ all -> 0x0705 }
            X.AnonymousClass48S.A08(r11, r5, r12, r7)     // Catch:{ all -> 0x0705 }
            X.48h r5 = X.AnonymousClass48S.A01(r13, r11)     // Catch:{ all -> 0x0705 }
            X.AnonymousClass48S.A09(r5, r12, r6)     // Catch:{ all -> 0x0705 }
            r5 = r16
            X.AnonymousClass48S.A0C(r4, r5, r9)     // Catch:{ all -> 0x0705 }
            r10.addAll(r9)     // Catch:{ all -> 0x0705 }
            X.AnonymousClass48S.A0B(r4)     // Catch:{ all -> 0x0705 }
            r4.A0U()     // Catch:{ all -> 0x0705 }
            r12.A07(r2)     // Catch:{ all -> 0x0705 }
            java.util.Collections.unmodifiableList(r16)     // Catch:{ all -> 0x0705 }
            java.util.Collections.unmodifiableList(r23)     // Catch:{ all -> 0x0705 }
            java.util.Collections.unmodifiableList(r10)     // Catch:{ all -> 0x0705 }
            java.util.Collections.unmodifiableList(r9)     // Catch:{ all -> 0x0705 }
            monitor-exit(r4)
            goto L_0x0115
        L_0x027c:
            java.lang.String r1 = "ArmadilloExpressInboxSnapshotMissingThreadChecker"
            java.lang.String r0 = "inbox result set is null"
            goto L_0x03a6
        L_0x0282:
            X.OAt r4 = (X.C70545OAt) r4
            r7 = 0
            X.0qQ.A0B(r4, r7)
            com.facebook.msys.mcf.MsysError r1 = r4.A00
            java.lang.String r6 = r4.A01
            if (r1 == 0) goto L_0x02a1
            java.lang.Object r2 = r3.A01
            X.N2E r2 = (X.N2E) r2
            java.lang.String r0 = "Closing due to error: "
            java.lang.String r1 = X.AnonymousClass7TF.A0m(r0, r1)
            java.lang.String r0 = "ArmadilloExpressStreamableDownloadResponse"
            X.0KC.A0C(r0, r1)
            X.N2E.A00(r2)
            return
        L_0x02a1:
            if (r6 == 0) goto L_0x0015
            java.lang.Object r4 = r3.A01
            X.N2E r4 = (X.N2E) r4
            monitor-enter(r4)
            goto L_0x06d0
        L_0x02aa:
            X.OAn r4 = (X.C70539OAn) r4
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x0015
            boolean r0 = r4.A01
            X.C51968G9o.A1O(r1, r0)
            return
        L_0x02b8:
            java.lang.Object r0 = r3.A01
            com.facebook.msys.mca.MailboxCallback r0 = (com.facebook.msys.mca.MailboxCallback) r0
            if (r0 == 0) goto L_0x0015
            r0.onCompletion(r4)
            return
        L_0x02c2:
            X.OAm r4 = (X.C70538OAm) r4
            java.lang.Object r2 = r3.A01
            X.0sP r2 = (X.0sP) r2
            if (r2 == 0) goto L_0x0015
            com.facebook.msys.mcf.MsysError r0 = r4.A00
            if (r0 != 0) goto L_0x02d3
            boolean r1 = r4.A01
            r0 = 1
            if (r1 != 0) goto L_0x02d4
        L_0x02d3:
            r0 = 0
        L_0x02d4:
            X.C51968G9o.A1O(r2, r0)
            return
        L_0x02d8:
            X.OAl r4 = (X.C70537OAl) r4
            r7 = 0
            X.0qQ.A0B(r4, r7)
            com.facebook.msys.mcf.MsysError r8 = r4.A01
            if (r8 == 0) goto L_0x034b
            java.lang.Object r9 = r3.A01
            X.ODP r9 = (X.ODP) r9
            java.lang.String r2 = r9.A02
            X.0qQ.A0B(r2, r7)
            java.lang.String r1 = "msys://ae-media"
            r10 = 0
            r0 = 1
            boolean r0 = X.C66580MXl.A1a(r1, r0, r2)
            if (r0 == 0) goto L_0x035d
            android.net.Uri r6 = X.DbT.A09(r2)
            java.lang.String r0 = "thead_id"
            java.lang.String r5 = r6.getQueryParameter(r0)
            java.lang.String r0 = "thead_jid"
            java.lang.String r2 = r6.getQueryParameter(r0)
            java.lang.String r0 = "otid"
            java.lang.String r11 = r6.getQueryParameter(r0)
            java.lang.String r0 = "timestamp_us"
            java.lang.String r1 = r6.getQueryParameter(r0)
            if (r5 == 0) goto L_0x035d
            if (r11 == 0) goto L_0x035d
            if (r2 == 0) goto L_0x035d
            if (r1 == 0) goto L_0x035d
            r0 = 10
            X.00y.A0n(r0, r2)
            java.lang.Long.parseLong(r1)
            java.lang.String r0 = "force_eb_restore"
            r6.getBooleanQueryParameter(r0, r7)
            r10 = r5
        L_0x0327:
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = r9.A01
            java.lang.String r0 = r0.objectId_
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r11, r0}
            java.lang.String r1 = "ArmadilloExpressMediaStore"
            java.lang.String r0 = "Failed to download media threadId: %s otid: %s objId: %s"
            X.0KC.A0L(r1, r0, r8, r2)
            X.Pty r5 = r9.A00
            java.lang.String r2 = r8.getMessage()
            if (r2 != 0) goto L_0x0340
            java.lang.String r2 = "Unknown download error"
        L_0x0340:
            int r1 = r8.getCode()
            java.lang.String r0 = r8.getDomain()
            r5.DCq(r2, r1, r0)
        L_0x034b:
            android.net.Uri r2 = r4.A00
            if (r2 == 0) goto L_0x0015
            java.lang.Object r0 = r3.A01
            X.ODP r0 = (X.ODP) r0
            X.Pty r1 = r0.A00
            java.lang.String r0 = X.DbT.A10(r2)
            r1.Dog(r0, r7)
            return
        L_0x035d:
            r11 = 0
            goto L_0x0327
        L_0x035f:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r3.A01
            X.OZI r0 = (X.OZI) r0
            X.1xN r2 = r0.A00
            if (r2 == 0) goto L_0x0015
            X.NAX r0 = r0.A02
            X.68J r1 = r0.mMailboxApiHandleMetaProvider
            boolean r0 = r1 instanceof X.AnonymousClass68I
            if (r0 == 0) goto L_0x0384
            X.68I r1 = (X.AnonymousClass68I) r1
        L_0x0377:
            X.0qQ.A0A(r1)
            r0 = 8
            X.Opg r0 = A00(r2, r0)
            r1.A04(r0)
            return
        L_0x0384:
            r1 = 0
            goto L_0x0377
        L_0x0386:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.String r1 = "AdvancedCryptoTransport"
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "Error while deleting all echo files."
            goto L_0x03a6
        L_0x0391:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.String r1 = "AdvancedCryptoTransport"
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "Error while restoring from echo."
            goto L_0x03a6
        L_0x039c:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.String r1 = "AdvancedCryptoTransport"
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "Error while backing up to echo."
        L_0x03a6:
            X.0KC.A0C(r1, r0)
            return
        L_0x03aa:
            java.lang.Object r2 = r3.A01
            X.67Z r2 = (X.AnonymousClass67Z) r2
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            X.MYb r0 = X.MYb.A0M
            java.lang.Object r1 = r4.value
            if (r1 == 0) goto L_0x03ce
        L_0x03b6:
            X.3xQ r0 = new X.3xQ
            r0.<init>(r1)
        L_0x03bb:
            r2.A02(r0)
            r2.A00()
            return
        L_0x03c2:
            java.lang.Object r2 = r3.A01
            X.67Z r2 = (X.AnonymousClass67Z) r2
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            X.MYb r0 = X.MYb.A0M
            java.lang.Object r1 = r4.value
            if (r1 != 0) goto L_0x03b6
        L_0x03ce:
            X.48z r0 = X.C2612848z.A00
            goto L_0x03bb
        L_0x03d1:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Object r3 = r3.A01
            X.NgW r3 = (X.C69183NgW) r3
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x03e0
            java.lang.String r2 = "ICDC metadata is updated successfully"
            goto L_0x041f
        L_0x03e0:
            java.lang.String r2 = "Failed to update ICDC metadata"
            goto L_0x041f
        L_0x03e3:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.Object r3 = r3.A01
            X.NgW r3 = (X.C69183NgW) r3
            if (r0 == 0) goto L_0x03f0
            java.lang.String r2 = "ICDC metadata are removed successfully"
            goto L_0x041f
        L_0x03f0:
            java.lang.String r2 = "ICDC metadata failed to remove"
            goto L_0x041f
        L_0x03f3:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.Object r3 = r3.A01
            X.NgW r3 = (X.C69183NgW) r3
            if (r0 == 0) goto L_0x0400
            java.lang.String r2 = "ICDC device injected successfully"
            goto L_0x041f
        L_0x0400:
            java.lang.String r2 = "ICDC device injection failed"
            goto L_0x041f
        L_0x0403:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.Object r3 = r3.A01
            X.NgW r3 = (X.C69183NgW) r3
            if (r0 == 0) goto L_0x0410
            java.lang.String r2 = "ICDC failure data are cleared successfully"
            goto L_0x041f
        L_0x0410:
            java.lang.String r2 = "ICDC failure data failed to clear"
            goto L_0x041f
        L_0x0413:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.Object r3 = r3.A01
            X.NgW r3 = (X.C69183NgW) r3
            if (r0 == 0) goto L_0x042c
            java.lang.String r2 = "ICDC devices are cleared successfully"
        L_0x041f:
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.PZ4 r0 = new X.PZ4
            r0.<init>(r3, r2)
            r1.runOnUiThread(r0)
            return
        L_0x042c:
            java.lang.String r2 = "ICDC devices failed to clear"
            goto L_0x041f
        L_0x042f:
            java.lang.Object r1 = r3.A01
            com.facebook.msys.mca.Mailbox r1 = (com.facebook.msys.mca.Mailbox) r1
            r0 = 0
            r1.m69lambda$shutdown$2$comfacebookmsysmcaMailbox(r0)
            return
        L_0x0438:
            java.lang.Object r1 = r3.A01
            com.facebook.msys.mca.Mailbox r1 = (com.facebook.msys.mca.Mailbox) r1
            r0 = 0
            r1.m68lambda$logoutAndEncrypt$1$comfacebookmsysmcaMailbox(r0)
            return
        L_0x0441:
            java.lang.Object r1 = r3.A01
            com.facebook.msys.mca.Mailbox r1 = (com.facebook.msys.mca.Mailbox) r1
            r0 = 0
            r1.m70lambda$shutdownAndDelete$3$comfacebookmsysmcaMailbox(r0)
            return
        L_0x044a:
            java.lang.Object r1 = r3.A01
            com.facebook.msys.mca.Mailbox r1 = (com.facebook.msys.mca.Mailbox) r1
            r0 = 0
            r1.m71lambda$shutdownAndEncrypt$4$comfacebookmsysmcaMailbox(r0)
            return
        L_0x0453:
            java.lang.Object r1 = r3.A01
            com.facebook.msys.mca.Mailbox r1 = (com.facebook.msys.mca.Mailbox) r1
            r0 = 0
            r1.m67lambda$logoutAndDelete$0$comfacebookmsysmcaMailbox(r0)
            return
        L_0x045c:
            java.lang.Object r0 = r3.A01
            X.NBS r0 = (X.NBS) r0
            X.68H r0 = r0.A01
            X.AnonymousClass68H.A01(r0)
            return
        L_0x0466:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            if (r0 != 0) goto L_0x05ff
            r0 = 0
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x0477:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            if (r4 == 0) goto L_0x0481
            java.lang.Object r4 = r4.value
            if (r4 == 0) goto L_0x0481
            goto L_0x064b
        L_0x0481:
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            com.encryptedbackups.statemanager.model.RecoveryCodeGenerationException r0 = new com.encryptedbackups.statemanager.model.RecoveryCodeGenerationException
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x0490:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            java.lang.String r1 = "EncryptedBackupOneTimeCodeStorageManager"
            if (r0 != 0) goto L_0x064b
            java.lang.String r0 = "listenForPakeMessages failed"
            X.0KC.A0C(r1, r0)
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.Nnh r0 = new X.Nnh
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x04ae:
            X.OB6 r4 = (X.OB6) r4
            java.lang.Number r0 = r4.A00
            java.lang.String r4 = r4.A01
            java.lang.String r1 = "EncryptedBackupOneTimeCodeStorageManager"
            if (r0 == 0) goto L_0x04ce
            if (r4 == 0) goto L_0x04ce
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            long r1 = r0.longValue()
            X.ONK r0 = new X.ONK
            r0.<init>(r1, r4)
            X.N0I r1 = new X.N0I
            r1.<init>(r0)
            goto L_0x06ba
        L_0x04ce:
            java.lang.String r0 = "generateOneTimeCode failed"
            X.0KC.A0C(r1, r0)
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.Nng r0 = new X.Nng
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x04e2:
            java.lang.Object r1 = X.C66583MXo.A0g(r4)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            if (r1 == 0) goto L_0x0532
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r1.iterator()
        L_0x04f3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x064b
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x04f3
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "MCAMailboxEncryptedBackupsManagerAvailableOTCDeviceIDDictKey"
            java.lang.String r6 = X.C66584MXp.A0Z(r0, r1)
            java.lang.String r0 = "MCAMailboxEncryptedBackupsManagerAvailableOTCDeviceModelDictKey"
            java.lang.String r8 = X.C66584MXp.A0Z(r0, r1)
            java.lang.String r0 = "MCAMailboxEncryptedBackupsManagerAvailableOTCDeviceManufacturerDictKey"
            java.lang.String r7 = X.C66584MXp.A0Z(r0, r1)
            java.lang.String r0 = "MCAMailboxEncryptedBackupsManagerAvailableOTCDeviceLastLoginLocationDictKey"
            java.lang.String r9 = X.C66584MXp.A0Z(r0, r1)
            java.lang.String r0 = "MCAMailboxEncryptedBackupsManagerAvailableOTCDeviceLastLoginDateDictKey"
            java.lang.String r10 = X.C66584MXp.A0Z(r0, r1)
            if (r6 == 0) goto L_0x04f3
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x04f3
            com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice r5 = new com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice
            r5.<init>(r6, r7, r8, r9, r10)
            r4.add(r5)
            goto L_0x04f3
        L_0x0532:
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x053c:
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.String r7 = "EncryptedBackupOneTimeCodeStorageManager"
            if (r4 == 0) goto L_0x057b
            int r6 = r4.intValue()
            X.Njr[] r5 = X.C69352Njr.values()
            int r4 = r5.length
            r2 = 0
        L_0x054c:
            if (r2 >= r4) goto L_0x0567
            r1 = r5[r2]
            int r0 = r1.A00
            if (r0 != r6) goto L_0x0564
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.O5R r0 = new X.O5R
            r0.<init>(r1)
            X.N0I r1 = new X.N0I
            r1.<init>(r0)
            goto L_0x06ba
        L_0x0564:
            int r2 = r2 + 1
            goto L_0x054c
        L_0x0567:
            java.lang.String r0 = "enterOneTimeCode failed with unknown status"
            X.0KC.A0C(r7, r0)
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.Nnf r0 = new X.Nnf
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x057b:
            java.lang.String r0 = "enterOneTimeCode failed"
            X.0KC.A0C(r7, r0)
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.Nnf r0 = new X.Nnf
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x058f:
            java.lang.Object r0 = r3.A01
            X.ObS r0 = (X.C71087ObS) r0
            r0.A03()
            return
        L_0x0597:
            com.facebook.msys.mca.Mailbox r4 = (com.facebook.msys.mca.Mailbox) r4
            java.lang.Object r1 = r3.A01
            java.util.Set r0 = r4.mStoredProcedureChangedListeners
            r0.remove(r1)
            return
        L_0x05a1:
            java.lang.Object r0 = X.C66583MXo.A0g(r4)
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.3xP r1 = X.C257443xP.A00(r0)
            goto L_0x06ba
        L_0x05af:
            java.lang.Object r0 = r3.A01
            X.ObS r0 = (X.C71087ObS) r0
            r0.A05(r4)
            return
        L_0x05b7:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.String r1 = "EncryptedBackupsManagerApi"
            if (r0 == 0) goto L_0x05cc
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.NiI r0 = X.C69256NiI.A02
            X.N0I r1 = new X.N0I
            r1.<init>(r0)
            goto L_0x06ba
        L_0x05cc:
            java.lang.String r0 = "EncryptedBackups removeVirtualDevice fails."
            X.0KC.A0C(r1, r0)
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            com.encryptedbackups.statemanager.model.RemoveVirtualDeviceException r0 = new com.encryptedbackups.statemanager.model.RemoveVirtualDeviceException
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x05e0:
            com.facebook.msys.mca.Mailbox r4 = (com.facebook.msys.mca.Mailbox) r4
            java.lang.Object r0 = r3.A01
            X.1xN r0 = (X.1xN) r0
            r4.addStoredProcedureChangedListener(r0)
            return
        L_0x05ea:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            if (r0 != 0) goto L_0x05ff
            com.encryptedbackups.statemanager.model.PersistOnboardingDecisionException r0 = new com.encryptedbackups.statemanager.model.PersistOnboardingDecisionException
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x05ff:
            X.0gF r0 = X.C60340gF.A00
            X.N0I r1 = new X.N0I
            r1.<init>(r0)
            goto L_0x06ba
        L_0x0608:
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            if (r32 != 0) goto L_0x0612
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0u()
        L_0x0612:
            X.N0I r1 = new X.N0I
            r1.<init>(r4)
            goto L_0x06ba
        L_0x0619:
            X.OAi r4 = (X.C70534OAi) r4
            if (r4 == 0) goto L_0x0635
            java.lang.String r2 = r4.A00
            java.lang.String r1 = r4.A01
            if (r2 == 0) goto L_0x0635
            if (r1 == 0) goto L_0x0635
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.ONJ r0 = new X.ONJ
            r0.<init>(r2, r1)
            X.N0I r1 = new X.N0I
            r1.<init>(r0)
            goto L_0x06ba
        L_0x0635:
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            com.encryptedbackups.statemanager.model.RecoveryCodeGenerationException r0 = new com.encryptedbackups.statemanager.model.RecoveryCodeGenerationException
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x0643:
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            if (r4 == 0) goto L_0x0655
            java.lang.Object r4 = r4.value
            if (r4 == 0) goto L_0x0655
        L_0x064b:
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.N0I r1 = new X.N0I
            r1.<init>(r4)
            goto L_0x06ba
        L_0x0655:
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            com.encryptedbackups.statemanager.model.TPIDException r0 = new com.encryptedbackups.statemanager.model.TPIDException
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x0663:
            X.OAg r4 = (X.C70532OAg) r4
            r0 = 0
            if (r4 == 0) goto L_0x068f
            java.lang.String r6 = r4.A01
            java.lang.Number r0 = r4.A00
        L_0x066c:
            java.lang.String r1 = "EncryptedBackupsManagerApi"
            if (r6 == 0) goto L_0x069e
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            if (r0 == 0) goto L_0x0691
            int r5 = r0.intValue()
            X.NjU[] r4 = X.C69329NjU.values()
            int r3 = r4.length
            r2 = 0
        L_0x0680:
            if (r2 >= r3) goto L_0x0691
            r1 = r4[r2]
            java.lang.Number r0 = r1.A00
            boolean r0 = X.C66583MXo.A1W(r5, r0)
            if (r0 != 0) goto L_0x0693
            int r2 = r2 + 1
            goto L_0x0680
        L_0x068f:
            r6 = r0
            goto L_0x066c
        L_0x0691:
            X.NjU r1 = X.C69329NjU.A05
        L_0x0693:
            X.ONI r0 = new X.ONI
            r0.<init>(r1, r6)
            X.N0I r1 = new X.N0I
            r1.<init>(r0)
            goto L_0x06ba
        L_0x069e:
            java.lang.String r0 = "EncryptedBackups fetchHSMVirtualDeviceInfo fails."
            X.0KC.A0C(r1, r0)
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            com.encryptedbackups.statemanager.model.FetchHSMVirtualDeviceInfoException r0 = new com.encryptedbackups.statemanager.model.FetchHSMVirtualDeviceInfoException
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x06ba
        L_0x06b1:
            java.lang.Object r7 = r3.A01
            X.ObS r7 = (X.C71087ObS) r7
            X.N0I r1 = new X.N0I
            r1.<init>(r4)
        L_0x06ba:
            r7.A05(r1)
            return
        L_0x06be:
            java.lang.Object r0 = X.C66583MXo.A0g(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = X.AnonymousClass7TG.A1X(r0)
            java.lang.Object r0 = r3.A01
            X.0sP r0 = (X.0sP) r0
            X.C51968G9o.A1O(r0, r1)
            return
        L_0x06d0:
            r4.A01 = r6     // Catch:{ all -> 0x0705 }
            boolean r0 = r4.A03     // Catch:{ all -> 0x0705 }
            if (r0 == 0) goto L_0x0703
            X.0eM r0 = X.C71105Ocj.A05     // Catch:{ all -> 0x0705 }
            com.instagram.common.session.UserSession r0 = r4.A00     // Catch:{ all -> 0x0705 }
            if (r0 != 0) goto L_0x06e4
            X.DbS.A17()     // Catch:{ all -> 0x0705 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0705 }
            throw r0     // Catch:{ all -> 0x0705 }
        L_0x06e4:
            X.Ocj r0 = X.C69851NtF.A00(r0)     // Catch:{ all -> 0x0705 }
            com.instagram.common.session.UserSession r0 = r0.A01     // Catch:{ all -> 0x0705 }
            X.NAY r5 = X.OXH.A00(r0)     // Catch:{ all -> 0x0705 }
            X.OpT r0 = X.C71709OpT.A00     // Catch:{ all -> 0x0705 }
            X.68L r3 = X.C66581MXm.A0I(r5)     // Catch:{ all -> 0x0705 }
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r3, r0)     // Catch:{ all -> 0x0705 }
            r1 = 5
            X.OoX r0 = new X.OoX     // Catch:{ all -> 0x0705 }
            r0.<init>(r5, r2, r6, r1)     // Catch:{ all -> 0x0705 }
            X.C66582MXn.A1E(r3, r0, r2)     // Catch:{ all -> 0x0705 }
            r4.A03 = r7     // Catch:{ all -> 0x0705 }
        L_0x0703:
            monitor-exit(r4)
            return
        L_0x0705:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71722Opg.onCompletion(java.lang.Object):void");
    }
}
