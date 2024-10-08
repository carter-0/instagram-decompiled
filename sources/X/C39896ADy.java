package X;

import java.security.SecureRandom;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.ADy  reason: case insensitive filesystem */
public final class C39896ADy {
    public long A00 = -1;
    public long A01;
    public Map A02;
    public boolean A03;
    public final long A04;
    public final A8N A05;
    public final C10927S1f A06;
    public final String A07;
    public final String A08;
    public final Executor A09;
    public final Object A0A;
    public final SecureRandom A0B;

    public C39896ADy(A8N a8n, String str, String str2, Executor executor, long j) {
        0qQ.A0B(str, 2);
        0qQ.A0B(executor, 5);
        this.A05 = a8n;
        this.A07 = str;
        this.A04 = j;
        this.A08 = str2;
        this.A09 = executor;
        SecureRandom secureRandom = new SecureRandom();
        this.A0B = secureRandom;
        this.A0A = new Object();
        this.A01 = secureRandom.nextLong();
        A8N a8n2 = this.A05;
        0eP A002 = a8n2.A00(C390809rs.One);
        Object obj = A002.A00;
        Object obj2 = A002.A01;
        0eP A003 = a8n2.A00(C390809rs.Two);
        Object obj3 = A003.A00;
        Object obj4 = A003.A01;
        0eP A004 = a8n2.A00(C390809rs.Three);
        0eP A1L = AnonymousClass7TE.A1L(new AnonymousClass59G(obj, obj3, A004.A00), new AnonymousClass59G(obj2, obj4, A004.A01));
        this.A06 = new C10927S1f((AnonymousClass59G) A1L.A00, (AnonymousClass59G) A1L.A01);
        executor.execute(new Ai7(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0113, code lost:
        r1 = X.AnonymousClass7TE.A1F();
        r19 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011f, code lost:
        if (r19.hasNext() == false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0121, code lost:
        r11 = (X.A71) r19.next();
        r10 = r11.A00;
        r9 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012b, code lost:
        if (r9 == null) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012f, code lost:
        if (r9 == X.AGm.A01) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0131, code lost:
        r9 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0133, code lost:
        r18 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013d, code lost:
        if (r1.contains(r18) != false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013f, code lost:
        r1.add(r18);
        r13 = r11.A04;
        r0 = new X.C375199Cq(r13, r10);
        r12 = (X.C3739997t) X.C3739497o.A01.A02(r13, X.C375049Ca.A00);
        r0 = r12.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0159, code lost:
        if (r0 == null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015f, code lost:
        if (r0.intValue() == r9) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0161, code lost:
        r1 = X.AnonymousClass7TG.A0q("Wrong ID set for key with ID requirement");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0169, code lost:
        r16 = X.C375189Cp.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0171, code lost:
        if (r16.equals(r10) == false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0173, code lost:
        r15 = X.C375139Ck.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0175, code lost:
        r13 = (X.C384229gy) X.C3741398h.DEFAULT_INSTANCE.A0C();
        r0 = X.AnonymousClass973.A08(r12);
        r13.A03();
        r14 = (X.C3741398h) r13.A00;
        r0 = (X.C3741498i) r0.A01();
        r0.getClass();
        r14.keyData_ = r0;
        r14.bitField0_ |= 1;
        r13.A03();
        ((X.C3741398h) r13.A00).status_ = r15.A00;
        r13.A03();
        ((X.C3741398h) r13.A00).keyId_ = r9;
        r0 = r12.A01;
        r13.A03();
        ((X.C3741398h) r13.A00).outputPrefixType_ = r0.A01();
        r8.A04((X.C3741398h) r13.A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c7, code lost:
        if (r11.A03 == false) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d0, code lost:
        if (X.C375189Cp.A02.equals(r10) == false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01d2, code lost:
        r15 = X.C375139Ck.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01db, code lost:
        if (X.C375189Cp.A01.equals(r10) == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01dd, code lost:
        r15 = X.C375139Ck.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e0, code lost:
        if (r20 != null) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e2, code lost:
        r20 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e6, code lost:
        if (r10 == r16) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e9, code lost:
        r7.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f0, code lost:
        r9 = X.C3740397x.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fc, code lost:
        if (r1.contains(java.lang.Integer.valueOf(r9)) == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ff, code lost:
        if (r20 == null) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0201, code lost:
        r1 = r20.intValue();
        r8.A03();
        ((X.C3738097a) r8.A00).primaryKeyId_ = r1;
        r1 = (X.C3738097a) r8.A01();
        X.AnonymousClass9BV.A02(r1);
        r23.put(r21, new X.AnonymousClass9BV(r6.A00, r1, r7));
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0229, code lost:
        r1 = X.AnonymousClass7TG.A0q("Primary key is not enabled");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0230, code lost:
        r1 = X.AnonymousClass7TG.A0q("Two primaries were set");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0237, code lost:
        r1 = X.AnonymousClass7TE.A0z("Unknown key status");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x023e, code lost:
        r1 = X.AnonymousClass7TG.A0q(X.002.A0c("Id ", " is used twice in the keyset", r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x024b, code lost:
        r1 = X.AnonymousClass7TG.A0q("No ID was set (with withFixedId or withRandomId)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0252, code lost:
        r1 = X.AnonymousClass7TG.A0q("No primary was set");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C39896ADy r26) {
        /*
            r3 = r26
            java.lang.Object r2 = r3.A0A
            monitor-enter(r2)
            boolean r0 = r3.A03     // Catch:{ all -> 0x029d }
            if (r0 != 0) goto L_0x029b
            r1 = 824185612(0x3120130c, float:2.3293891E-9)
            X.C18398Vqy.A00 = r1     // Catch:{ all -> 0x029d }
            X.02m r24 = X.C18398Vqy.A01     // Catch:{ all -> 0x029d }
            r0 = r24
            r0.markerStart(r1)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "register_hybrid_config_start"
            X.C18398Vqy.A00(r0)     // Catch:{ all -> 0x029d }
            X.C21951Xmg.A00()     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "register_hybrid_config_end"
            X.C18398Vqy.A00(r0)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "generate_keyset_start"
            X.C18398Vqy.A00(r0)     // Catch:{ all -> 0x029d }
            X.A8N r0 = r3.A05     // Catch:{ all -> 0x029d }
            r26 = r0
            r4 = 0
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x029d }
            java.util.LinkedHashMap r23 = X.AnonymousClass7TE.A1H()     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "construct_keyset_handle_start"
            X.C18398Vqy.A00(r0)     // Catch:{ all -> 0x029d }
            X.9rs[] r22 = X.C390809rs.values()     // Catch:{ all -> 0x029d }
            r0 = r22
            int r0 = r0.length     // Catch:{ all -> 0x029d }
            r25 = r0
            r5 = 0
        L_0x0042:
            r0 = r25
            if (r5 >= r0) goto L_0x0282
            r21 = r22[r5]     // Catch:{ all -> 0x029d }
            r1 = r26
            r0 = r21
            X.0eP r0 = r1.A00(r0)     // Catch:{ all -> 0x029d }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x029d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x029d }
            byte[] r1 = X.C374809Aw.A01(r0)     // Catch:{ all -> 0x029d }
            X.A60 r6 = new X.A60     // Catch:{ all -> 0x029d }
            r6.<init>()     // Catch:{ all -> 0x029d }
            r0 = 2192(0x890, float:3.072E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x029d }
            X.9Au r0 = X.C374779At.A00(r0)     // Catch:{ all -> 0x029d }
            X.983 r8 = r0.A00     // Catch:{ all -> 0x029d }
            if (r8 == 0) goto L_0x0260
            java.lang.String r0 = "null cannot be cast to non-null type com.google.crypto.tink.hybrid.HpkeParameters"
            X.0qQ.A0C(r8, r0)     // Catch:{ all -> 0x029d }
            X.XOb r8 = (X.C21195XOb) r8     // Catch:{ all -> 0x029d }
            X.97y r1 = X.C3740497y.A00(r1)     // Catch:{ all -> 0x029d }
            r7 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x029d }
            X.XOg r0 = X.C21200XOg.A00(r8, r1, r0)     // Catch:{ all -> 0x029d }
            X.A71 r8 = new X.A71     // Catch:{ all -> 0x029d }
            r8.<init>(r0)     // Catch:{ all -> 0x029d }
            java.lang.Integer r0 = r0.A04()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x0095
            int r1 = r0.intValue()     // Catch:{ all -> 0x029d }
            X.AGm r0 = new X.AGm     // Catch:{ all -> 0x029d }
            r0.<init>(r1)     // Catch:{ all -> 0x029d }
            r8.A01 = r0     // Catch:{ all -> 0x029d }
        L_0x0095:
            X.A60 r0 = r8.A02     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x00ae
            java.util.List r0 = r0.A02     // Catch:{ all -> 0x029d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x029d }
        L_0x009f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x029d }
            X.A71 r0 = (X.A71) r0     // Catch:{ all -> 0x029d }
            r0.A03 = r4     // Catch:{ all -> 0x029d }
            goto L_0x009f
        L_0x00ae:
            r8.A03 = r7     // Catch:{ all -> 0x029d }
            X.A60 r0 = r8.A02     // Catch:{ all -> 0x029d }
            if (r0 != 0) goto L_0x0259
            java.util.List r9 = r6.A02     // Catch:{ all -> 0x029d }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x029d }
        L_0x00ba:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x029d }
            X.A71 r0 = (X.A71) r0     // Catch:{ all -> 0x029d }
            r0.A03 = r4     // Catch:{ all -> 0x029d }
            goto L_0x00ba
        L_0x00c9:
            r8.A02 = r6     // Catch:{ all -> 0x029d }
            r9.add(r8)     // Catch:{ all -> 0x029d }
            r20 = 0
            boolean r0 = r6.A01     // Catch:{ all -> 0x029d }
            if (r0 != 0) goto L_0x027b
            r6.A01 = r7     // Catch:{ all -> 0x029d }
            X.97a r0 = X.C3738097a.DEFAULT_INSTANCE     // Catch:{ all -> 0x029d }
            X.9Cx r8 = r0.A0C()     // Catch:{ all -> 0x029d }
            X.9Cv r8 = (X.C375249Cv) r8     // Catch:{ all -> 0x029d }
            int r0 = r9.size()     // Catch:{ all -> 0x029d }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x029d }
            r7.<init>(r0)     // Catch:{ all -> 0x029d }
            r10 = 0
        L_0x00e8:
            int r0 = r9.size()     // Catch:{ all -> 0x029d }
            int r0 = r0 + -1
            if (r10 >= r0) goto L_0x0113
            java.lang.Object r0 = r9.get(r10)     // Catch:{ all -> 0x029d }
            X.A71 r0 = (X.A71) r0     // Catch:{ all -> 0x029d }
            X.AGm r0 = r0.A01     // Catch:{ all -> 0x029d }
            X.AGm r1 = X.AGm.A01     // Catch:{ all -> 0x029d }
            if (r0 != r1) goto L_0x0110
            int r0 = r10 + 1
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x029d }
            X.A71 r0 = (X.A71) r0     // Catch:{ all -> 0x029d }
            X.AGm r0 = r0.A01     // Catch:{ all -> 0x029d }
            if (r0 == r1) goto L_0x0110
            java.lang.String r0 = "Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'."
            java.security.GeneralSecurityException r1 = X.AnonymousClass7TG.A0q(r0)     // Catch:{ all -> 0x029d }
            goto L_0x0281
        L_0x0110:
            int r10 = r10 + 1
            goto L_0x00e8
        L_0x0113:
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()     // Catch:{ all -> 0x029d }
            java.util.Iterator r19 = r9.iterator()     // Catch:{ all -> 0x029d }
        L_0x011b:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r11 = r19.next()     // Catch:{ all -> 0x029d }
            X.A71 r11 = (X.A71) r11     // Catch:{ all -> 0x029d }
            X.9Cp r10 = r11.A00     // Catch:{ all -> 0x029d }
            X.AGm r9 = r11.A01     // Catch:{ all -> 0x029d }
            if (r9 == 0) goto L_0x024b
            X.AGm r0 = X.AGm.A01     // Catch:{ all -> 0x029d }
            if (r9 == r0) goto L_0x01f0
            int r9 = r9.A00     // Catch:{ all -> 0x029d }
        L_0x0133:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x029d }
            r0 = r18
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x029d }
            if (r0 != 0) goto L_0x023e
            r0 = r18
            r1.add(r0)     // Catch:{ all -> 0x029d }
            X.97G r13 = r11.A04     // Catch:{ all -> 0x029d }
            X.9Cq r17 = new X.9Cq     // Catch:{ all -> 0x029d }
            r0 = r17
            r0.<init>(r13, r10)     // Catch:{ all -> 0x029d }
            X.97o r12 = X.C3739497o.A01     // Catch:{ all -> 0x029d }
            X.9Ca r0 = X.C375049Ca.A00     // Catch:{ all -> 0x029d }
            X.97u r12 = r12.A02(r13, r0)     // Catch:{ all -> 0x029d }
            X.97t r12 = (X.C3739997t) r12     // Catch:{ all -> 0x029d }
            java.lang.Integer r0 = r12.A04     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x0169
            int r0 = r0.intValue()     // Catch:{ all -> 0x029d }
            if (r0 == r9) goto L_0x0169
            java.lang.String r0 = "Wrong ID set for key with ID requirement"
            java.security.GeneralSecurityException r1 = X.AnonymousClass7TG.A0q(r0)     // Catch:{ all -> 0x029d }
            goto L_0x0281
        L_0x0169:
            X.9Cp r16 = X.C375189Cp.A03     // Catch:{ all -> 0x029d }
            r0 = r16
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x01ca
            X.9Ck r15 = X.C375139Ck.ENABLED     // Catch:{ all -> 0x029d }
        L_0x0175:
            X.98h r0 = X.C3741398h.DEFAULT_INSTANCE     // Catch:{ all -> 0x029d }
            X.9Cx r13 = r0.A0C()     // Catch:{ all -> 0x029d }
            X.9gy r13 = (X.C384229gy) r13     // Catch:{ all -> 0x029d }
            X.9h7 r0 = X.AnonymousClass973.A08(r12)     // Catch:{ all -> 0x029d }
            r13.A03()     // Catch:{ all -> 0x029d }
            X.972 r14 = r13.A00     // Catch:{ all -> 0x029d }
            X.98h r14 = (X.C3741398h) r14     // Catch:{ all -> 0x029d }
            X.972 r0 = r0.A01()     // Catch:{ all -> 0x029d }
            X.98i r0 = (X.C3741498i) r0     // Catch:{ all -> 0x029d }
            r0.getClass()     // Catch:{ all -> 0x029d }
            r14.keyData_ = r0     // Catch:{ all -> 0x029d }
            int r0 = r14.bitField0_     // Catch:{ all -> 0x029d }
            r0 = r0 | 1
            r14.bitField0_ = r0     // Catch:{ all -> 0x029d }
            r13.A03()     // Catch:{ all -> 0x029d }
            X.972 r14 = r13.A00     // Catch:{ all -> 0x029d }
            X.98h r14 = (X.C3741398h) r14     // Catch:{ all -> 0x029d }
            int r0 = r15.A00     // Catch:{ all -> 0x029d }
            r14.status_ = r0     // Catch:{ all -> 0x029d }
            r13.A03()     // Catch:{ all -> 0x029d }
            X.972 r0 = r13.A00     // Catch:{ all -> 0x029d }
            X.98h r0 = (X.C3741398h) r0     // Catch:{ all -> 0x029d }
            r0.keyId_ = r9     // Catch:{ all -> 0x029d }
            X.98D r0 = r12.A01     // Catch:{ all -> 0x029d }
            r13.A03()     // Catch:{ all -> 0x029d }
            X.972 r9 = r13.A00     // Catch:{ all -> 0x029d }
            X.98h r9 = (X.C3741398h) r9     // Catch:{ all -> 0x029d }
            int r0 = r0.A01()     // Catch:{ all -> 0x029d }
            r9.outputPrefixType_ = r0     // Catch:{ all -> 0x029d }
            X.972 r0 = r13.A01()     // Catch:{ all -> 0x029d }
            X.98h r0 = (X.C3741398h) r0     // Catch:{ all -> 0x029d }
            r8.A04(r0)     // Catch:{ all -> 0x029d }
            boolean r0 = r11.A03     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x01e9
            goto L_0x01e0
        L_0x01ca:
            X.9Cp r0 = X.C375189Cp.A02     // Catch:{ all -> 0x029d }
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x01d5
            X.9Ck r15 = X.C375139Ck.DISABLED     // Catch:{ all -> 0x029d }
            goto L_0x0175
        L_0x01d5:
            X.9Cp r0 = X.C375189Cp.A01     // Catch:{ all -> 0x029d }
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x0237
            X.9Ck r15 = X.C375139Ck.DESTROYED     // Catch:{ all -> 0x029d }
            goto L_0x0175
        L_0x01e0:
            if (r20 != 0) goto L_0x0230
            r20 = r18
            r0 = r16
            if (r10 == r0) goto L_0x01e9
            goto L_0x0229
        L_0x01e9:
            r0 = r17
            r7.add(r0)     // Catch:{ all -> 0x029d }
            goto L_0x011b
        L_0x01f0:
            int r9 = X.C3740397x.A00()     // Catch:{ all -> 0x029d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x029d }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x0133
            goto L_0x01f0
        L_0x01ff:
            if (r20 == 0) goto L_0x0252
            int r1 = r20.intValue()     // Catch:{ all -> 0x029d }
            r8.A03()     // Catch:{ all -> 0x029d }
            X.972 r0 = r8.A00     // Catch:{ all -> 0x029d }
            X.97a r0 = (X.C3738097a) r0     // Catch:{ all -> 0x029d }
            r0.primaryKeyId_ = r1     // Catch:{ all -> 0x029d }
            X.972 r1 = r8.A01()     // Catch:{ all -> 0x029d }
            X.97a r1 = (X.C3738097a) r1     // Catch:{ all -> 0x029d }
            X.AnonymousClass9BV.A02(r1)     // Catch:{ all -> 0x029d }
            X.9Cs r0 = r6.A00     // Catch:{ all -> 0x029d }
            X.9BV r6 = new X.9BV     // Catch:{ all -> 0x029d }
            r6.<init>(r0, r1, r7)     // Catch:{ all -> 0x029d }
            r1 = r23
            r0 = r21
            r1.put(r0, r6)     // Catch:{ all -> 0x029d }
            int r5 = r5 + 1
            goto L_0x0042
        L_0x0229:
            java.lang.String r0 = "Primary key is not enabled"
            java.security.GeneralSecurityException r1 = X.AnonymousClass7TG.A0q(r0)     // Catch:{ all -> 0x029d }
            goto L_0x0281
        L_0x0230:
            java.lang.String r0 = "Two primaries were set"
            java.security.GeneralSecurityException r1 = X.AnonymousClass7TG.A0q(r0)     // Catch:{ all -> 0x029d }
            goto L_0x0281
        L_0x0237:
            java.lang.String r0 = "Unknown key status"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x029d }
            goto L_0x0281
        L_0x023e:
            java.lang.String r1 = "Id "
            java.lang.String r0 = " is used twice in the keyset"
            java.lang.String r0 = X.002.A0c(r1, r0, r9)     // Catch:{ all -> 0x029d }
            java.security.GeneralSecurityException r1 = X.AnonymousClass7TG.A0q(r0)     // Catch:{ all -> 0x029d }
            goto L_0x0281
        L_0x024b:
            java.lang.String r0 = "No ID was set (with withFixedId or withRandomId)"
            java.security.GeneralSecurityException r1 = X.AnonymousClass7TG.A0q(r0)     // Catch:{ all -> 0x029d }
            goto L_0x0281
        L_0x0252:
            java.lang.String r0 = "No primary was set"
            java.security.GeneralSecurityException r1 = X.AnonymousClass7TG.A0q(r0)     // Catch:{ all -> 0x029d }
            goto L_0x0281
        L_0x0259:
            java.lang.String r0 = "Entry has already been added to a KeysetHandle.Builder"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x029d }
            goto L_0x0281
        L_0x0260:
            X.97o r0 = X.C3739497o.A01     // Catch:{ GeneralSecurityException -> 0x026a }
            r0.A03(r8)     // Catch:{ GeneralSecurityException -> 0x026a }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ GeneralSecurityException -> 0x026a }
            throw r0     // Catch:{ GeneralSecurityException -> 0x026a }
        L_0x026a:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "Parsing parameters failed in getProto(). You probably want to call some Tink register function for "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r8, r0, r1)     // Catch:{ all -> 0x029d }
            X.AvC r1 = new X.AvC     // Catch:{ all -> 0x029d }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x029d }
            goto L_0x0281
        L_0x027b:
            java.lang.String r0 = "KeysetHandle.Builder#build must only be called once"
            java.security.GeneralSecurityException r1 = X.AnonymousClass7TG.A0q(r0)     // Catch:{ all -> 0x029d }
        L_0x0281:
            throw r1     // Catch:{ all -> 0x029d }
        L_0x0282:
            java.lang.String r0 = "construct_keyset_handle_end"
            X.C18398Vqy.A00(r0)     // Catch:{ all -> 0x029d }
            r0 = r23
            r3.A02 = r0     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "generate_keyset_end"
            X.C18398Vqy.A00(r0)     // Catch:{ all -> 0x029d }
            r5 = 1
            int r4 = X.C18398Vqy.A00     // Catch:{ all -> 0x029d }
            r1 = 2
            r0 = r24
            r0.markerEnd(r4, r1)     // Catch:{ all -> 0x029d }
            r3.A03 = r5     // Catch:{ all -> 0x029d }
        L_0x029b:
            monitor-exit(r2)
            return
        L_0x029d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39896ADy.A00(X.ADy):void");
    }

    public final long A01() {
        if (this.A00 == -1) {
            this.A00 = Instant.now().getEpochSecond();
        }
        return Instant.now().getEpochSecond() - this.A00;
    }

    public final AnonymousClass59G A02(Integer num) {
        ArrayList A002 = this.A06.A00(num, false, true);
        ArrayList A0r = AnonymousClass7TG.A0r(A002);
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            A0r.add(it.next().toString());
        }
        if (A0r.size() != 3) {
            return new AnonymousClass59G("", "", "");
        }
        return new AnonymousClass59G(A0r.get(0), A0r.get(1), A0r.get(2));
    }
}
