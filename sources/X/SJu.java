package X;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class SJu {
    public HashSet A00;
    public LinkedHashMap A01;
    public LinkedHashMap A02;
    public LinkedList A03;
    public LinkedList A04;
    public LinkedList A05;
    public LinkedList A06;
    public LinkedList A07;
    public LinkedList A08;
    public LinkedList A09;
    public boolean A0A;
    public final C268854eA A0B;
    public final C268894eF A0C;
    public final C269144ee A0D;
    public final C10974S3i A0E;
    public final C269054eV A0F;
    public final C269244eo A0G;
    public final boolean A0H;
    public final boolean A0I;

    public static final boolean A00(C8213QkM qkM, List list) {
        if (list != null) {
            String str = qkM.A05.A02;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C8213QkM) list.get(i)).A05.A02.equals(str)) {
                    list.set(i, qkM);
                    return true;
                }
            }
        }
        return false;
    }

    public final void A03(C12834T9g t9g, C8208QkH qkH) {
        if (t9g != null) {
            Object obj = t9g.A01;
            LinkedHashMap linkedHashMap = this.A01;
            if (linkedHashMap == null) {
                linkedHashMap = AnonymousClass7TE.A1H();
                this.A01 = linkedHashMap;
            }
            Object put = linkedHashMap.put(obj, qkH);
            if (put != null && put.getClass() == qkH.getClass()) {
                String A0y = C66581MXm.A0y(obj);
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Duplicate injectable value with id '");
                A1A.append(obj);
                A1A.append("' (of type ");
                A1A.append(A0y);
                throw Pxg.A0d(")", A1A);
            }
        }
    }

    public final void A04(C8202QkB qkB, Map map) {
        boolean z;
        C8213QkM A012;
        REE A032;
        C268854eA r8 = this.A0B;
        C8202QkB qkB2 = qkB;
        C269434f7 A0D2 = r8.A0D(qkB);
        if (A0D2 != null) {
            z = true;
            if (!A0D2.A02()) {
                if ("".isEmpty()) {
                    String str = A0D2.A02;
                    A012 = (C8213QkM) map.get(str);
                    if (A012 == null) {
                        A012 = new C8213QkM(r8, A0D2, A0D2, this.A0D, this.A0H);
                        map.put(str, A012);
                    }
                    A012.A00 = new S7Z(A0D2, A012.A00, qkB2, z, true, false);
                    this.A07.add(A012);
                }
                A012 = A01("", map);
                A012.A00 = new S7Z(A0D2, A012.A00, qkB2, z, true, false);
                this.A07.add(A012);
            }
        }
        z = false;
        if (!"".isEmpty() && (A032 = r8.A03(qkB.A02)) != null && A032 != REE.DISABLED) {
            A0D2 = C269434f7.A00("");
            A012 = A01("", map);
            A012.A00 = new S7Z(A0D2, A012.A00, qkB2, z, true, false);
            this.A07.add(A012);
        }
    }

    public final void A05(String str) {
        if (!this.A0H && str != null) {
            HashSet hashSet = this.A00;
            if (hashSet == null) {
                hashSet = AnonymousClass7TE.A1F();
                this.A00 = hashSet;
            }
            hashSet.add(str);
        }
    }

    public SJu(C268894eF r2, C269144ee r3, C10974S3i s3i, C269054eV r5, boolean z) {
        C268854eA r0;
        this.A0D = r3;
        this.A0H = z;
        this.A0C = r2;
        this.A0F = r5;
        if (r3.A07()) {
            this.A0I = true;
            r0 = r3.A01();
        } else {
            r0 = C8156Qhp.A00;
        }
        this.A0B = r0;
        this.A0G = r3.A04(r5, r2.A00);
        this.A0E = s3i;
    }

    public final C8213QkM A01(String str, Map map) {
        C8213QkM qkM = (C8213QkM) map.get(str);
        if (qkM != null) {
            return qkM;
        }
        C269144ee r4 = this.A0D;
        C268854eA r1 = this.A0B;
        boolean z = this.A0H;
        C269434f7 A002 = C269434f7.A00(str);
        C8213QkM qkM2 = new C8213QkM(r1, A002, A002, r4, z);
        map.put(str, qkM2);
        return qkM2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x020d, code lost:
        if (r6 == null) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x03d4, code lost:
        if (r5 == null) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x04cf, code lost:
        if (r5 != r7) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0648, code lost:
        if (r5 != null) goto L_0x064a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0.A0D.A09(X.C269354ez.ALLOW_FINAL_FIELDS_AS_MUTATORS) != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x06d8, code lost:
        if (r6.A02 == null) goto L_0x06db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x069d  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0713  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x074a  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0764  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x077d  */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x07b5 A[LOOP:26: B:460:0x07af->B:462:0x07b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x07c3  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x07d1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0803  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0843  */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x089c  */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x0899 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r22 = this;
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            r0 = r22
            X.4eA r1 = r0.A0B
            boolean r4 = r0.A0H
            if (r4 != 0) goto L_0x0017
            X.4ee r5 = r0.A0D
            X.4ez r3 = X.C269354ez.ALLOW_FINAL_FIELDS_AS_MUTATORS
            boolean r3 = r5.A09(r3)
            r14 = 1
            if (r3 == 0) goto L_0x0018
        L_0x0017:
            r14 = 0
        L_0x0018:
            X.4ee r3 = r0.A0D
            X.4ez r5 = X.C269354ez.PROPAGATE_TRANSIENT_MARKER
            boolean r13 = r3.A09(r5)
            X.4eV r8 = r0.A0F
            java.util.List r5 = X.C269054eV.A02(r8)
            java.util.Iterator r12 = r5.iterator()
        L_0x002a:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x010a
            java.lang.Object r7 = r12.next()
            X.QkC r7 = (X.C8203QkC) r7
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Boolean r5 = r1.A0Q(r7)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x004f
            java.util.LinkedList r5 = r0.A08
            if (r5 != 0) goto L_0x004c
            java.util.LinkedList r5 = X.Pxe.A1A()
            r0.A08 = r5
        L_0x004c:
            r5.add(r7)
        L_0x004f:
            java.lang.Boolean r5 = r1.A0R(r7)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0067
            java.util.LinkedList r5 = r0.A09
            if (r5 != 0) goto L_0x0063
            java.util.LinkedList r5 = X.Pxe.A1A()
            r0.A09 = r5
        L_0x0063:
            r5.add(r7)
            goto L_0x002a
        L_0x0067:
            java.lang.Boolean r5 = r1.A0O(r7)
            boolean r9 = r6.equals(r5)
            java.lang.Boolean r5 = r1.A0P(r7)
            boolean r6 = r6.equals(r5)
            if (r9 != 0) goto L_0x00ef
            if (r6 != 0) goto L_0x00fe
            java.lang.reflect.Field r9 = r7.A00
            java.lang.String r6 = r9.getName()
            if (r6 == 0) goto L_0x002a
            r11 = 0
            X.C269434f7.A01(r6, r11)
            if (r4 == 0) goto L_0x00d7
            X.4f7 r16 = r1.A0E(r7)
        L_0x008d:
            r10 = 0
            if (r16 == 0) goto L_0x00d4
            r10 = 1
            boolean r5 = r16.A02()
            if (r5 == 0) goto L_0x00d4
            X.4f7 r16 = X.C269434f7.A01(r6, r11)
            r19 = 0
        L_0x009d:
            if (r16 == 0) goto L_0x00c9
            r20 = 1
        L_0x00a1:
            boolean r21 = r1.A0o(r7)
            int r5 = r9.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isTransient(r5)
            if (r5 == 0) goto L_0x00b7
            if (r10 != 0) goto L_0x00b7
            r20 = 0
            if (r13 == 0) goto L_0x00b7
            r21 = 1
        L_0x00b7:
            if (r14 == 0) goto L_0x00dc
            if (r16 != 0) goto L_0x00dc
            if (r21 != 0) goto L_0x00dc
            int r5 = r9.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isFinal(r5)
            if (r5 == 0) goto L_0x00dc
            goto L_0x002a
        L_0x00c9:
            X.4eo r5 = r0.A0G
            X.4en r5 = (X.C269234en) r5
            X.4ep r5 = r5.A01
            boolean r20 = r5.A00(r9)
            goto L_0x00a1
        L_0x00d4:
            r19 = r10
            goto L_0x009d
        L_0x00d7:
            X.4f7 r16 = r1.A0D(r7)
            goto L_0x008d
        L_0x00dc:
            X.QkM r6 = r0.A01(r6, r2)
            X.S7Z r5 = r6.A01
            X.S7Z r15 = new X.S7Z
            r18 = r7
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r6.A01 = r15
            goto L_0x002a
        L_0x00ef:
            java.util.LinkedList r5 = r0.A03
            if (r5 != 0) goto L_0x00f9
            java.util.LinkedList r5 = X.Pxe.A1A()
            r0.A03 = r5
        L_0x00f9:
            r5.add(r7)
            if (r6 == 0) goto L_0x002a
        L_0x00fe:
            java.util.LinkedList r5 = r0.A05
            if (r5 != 0) goto L_0x0063
            java.util.LinkedList r5 = X.Pxe.A1A()
            r0.A05 = r5
            goto L_0x0063
        L_0x010a:
            X.TAJ r5 = X.C269054eV.A01(r8)
            java.util.Iterator r11 = r5.iterator()
        L_0x0112:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0289
            java.lang.Object r15 = r11.next()
            X.QkF r15 = (X.C8206QkF) r15
            int r6 = r15.A0F()
            if (r6 != 0) goto L_0x01e2
            java.lang.reflect.Method r7 = r15.A01
            java.lang.Class r6 = r7.getReturnType()
            java.lang.Class r5 = java.lang.Void.TYPE
            if (r6 == r5) goto L_0x0112
            java.lang.Class<java.lang.Void> r5 = java.lang.Void.class
            if (r6 != r5) goto L_0x013b
            X.4ez r5 = X.C269354ez.ALLOW_VOID_VALUED_PROPERTIES
            boolean r5 = r3.A09(r5)
            if (r5 != 0) goto L_0x013b
            goto L_0x0112
        L_0x013b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Boolean r5 = r1.A0O(r15)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0153
            java.util.LinkedList r5 = r0.A04
            if (r5 != 0) goto L_0x0284
            java.util.LinkedList r5 = X.Pxe.A1A()
            r0.A04 = r5
            goto L_0x0284
        L_0x0153:
            java.lang.Boolean r5 = r1.A0Q(r15)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0169
            java.util.LinkedList r5 = r0.A08
            if (r5 != 0) goto L_0x0284
            java.util.LinkedList r5 = X.Pxe.A1A()
            r0.A08 = r5
            goto L_0x0284
        L_0x0169:
            java.lang.Boolean r5 = r1.A0R(r15)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x017f
            java.util.LinkedList r5 = r0.A09
            if (r5 != 0) goto L_0x0284
            java.util.LinkedList r5 = X.Pxe.A1A()
            r0.A09 = r5
            goto L_0x0284
        L_0x017f:
            X.4f7 r13 = r1.A0E(r15)
            r16 = 0
            X.S3i r9 = r0.A0E
            java.lang.String r5 = r7.getName()
            java.lang.String r6 = r9.A03(r15, r5)
            if (r13 == 0) goto L_0x01c4
            if (r6 != 0) goto L_0x01a1
            java.lang.String r5 = r7.getName()
            java.lang.String r6 = r9.A02(r15, r5)
            if (r6 != 0) goto L_0x01a1
            java.lang.String r6 = r7.getName()
        L_0x01a1:
            boolean r5 = r13.A02()
            if (r5 == 0) goto L_0x01c1
            r5 = 0
            X.4f7 r13 = X.C269434f7.A01(r6, r5)
        L_0x01ac:
            r17 = 1
        L_0x01ae:
            boolean r18 = r1.A0o(r15)
            X.QkM r5 = r0.A01(r6, r2)
            X.S7Z r14 = r5.A02
            X.S7Z r12 = new X.S7Z
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r5.A02 = r12
            goto L_0x0112
        L_0x01c1:
            r16 = 1
            goto L_0x01ac
        L_0x01c4:
            if (r6 != 0) goto L_0x01db
            java.lang.String r5 = r7.getName()
            java.lang.String r6 = r9.A02(r15, r5)
            if (r6 == 0) goto L_0x0112
            X.4eo r5 = r0.A0G
            X.4en r5 = (X.C269234en) r5
            X.4ep r5 = r5.A03
        L_0x01d6:
            boolean r17 = r5.A00(r7)
            goto L_0x01ae
        L_0x01db:
            X.4eo r5 = r0.A0G
            X.4en r5 = (X.C269234en) r5
            X.4ep r5 = r5.A02
            goto L_0x01d6
        L_0x01e2:
            r5 = 1
            if (r6 != r5) goto L_0x026b
            X.4f7 r13 = r1.A0D(r15)
            r16 = 0
            X.S3i r6 = r0.A0E
            if (r13 == 0) goto L_0x023b
            java.lang.reflect.Method r9 = r15.A01
            java.lang.String r10 = r9.getName()
            X.QkA r6 = (X.C8201QkA) r6
            java.lang.String r7 = r6.A01
            if (r7 == 0) goto L_0x020f
            boolean r5 = r10.startsWith(r7)
            if (r5 == 0) goto L_0x020f
            boolean r6 = r6.A02
            int r5 = r7.length()
            if (r6 == 0) goto L_0x0236
            java.lang.String r6 = X.C8201QkA.A01(r10, r5)
        L_0x020d:
            if (r6 != 0) goto L_0x0213
        L_0x020f:
            java.lang.String r6 = r9.getName()
        L_0x0213:
            boolean r5 = r13.A02()
            if (r5 == 0) goto L_0x0233
            r5 = 0
            X.4f7 r13 = X.C269434f7.A01(r6, r5)
        L_0x021e:
            r17 = 1
        L_0x0220:
            boolean r18 = r1.A0o(r15)
            X.QkM r5 = r0.A01(r6, r2)
            X.S7Z r14 = r5.A03
            X.S7Z r12 = new X.S7Z
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r5.A03 = r12
            goto L_0x0112
        L_0x0233:
            r16 = 1
            goto L_0x021e
        L_0x0236:
            java.lang.String r6 = X.C8201QkA.A00(r10, r5)
            goto L_0x020d
        L_0x023b:
            java.lang.reflect.Method r10 = r15.A01
            java.lang.String r9 = r10.getName()
            X.QkA r6 = (X.C8201QkA) r6
            java.lang.String r7 = r6.A01
            if (r7 == 0) goto L_0x0112
            boolean r5 = r9.startsWith(r7)
            if (r5 == 0) goto L_0x0112
            boolean r6 = r6.A02
            int r5 = r7.length()
            if (r6 == 0) goto L_0x0266
            java.lang.String r6 = X.C8201QkA.A01(r9, r5)
        L_0x0259:
            if (r6 == 0) goto L_0x0112
            X.4eo r5 = r0.A0G
            X.4en r5 = (X.C269234en) r5
            X.4ep r5 = r5.A04
            boolean r17 = r5.A00(r10)
            goto L_0x0220
        L_0x0266:
            java.lang.String r6 = X.C8201QkA.A00(r9, r5)
            goto L_0x0259
        L_0x026b:
            r5 = 2
            if (r6 != r5) goto L_0x0112
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Boolean r5 = r1.A0P(r15)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0112
            java.util.LinkedList r5 = r0.A06
            if (r5 != 0) goto L_0x0284
            java.util.LinkedList r5 = X.Pxe.A1A()
            r0.A06 = r5
        L_0x0284:
            r5.add(r15)
            goto L_0x0112
        L_0x0289:
            boolean r5 = r8.A09()
            if (r5 != 0) goto L_0x02f5
            boolean r5 = r0.A0I
            if (r5 == 0) goto L_0x02f5
            X.4eY r5 = X.C269054eV.A00(r8)
            java.util.List r5 = r5.A01
            java.util.Iterator r10 = r5.iterator()
        L_0x029d:
            boolean r5 = r10.hasNext()
            r9 = 0
            if (r5 == 0) goto L_0x02c4
            java.lang.Object r7 = r10.next()
            X.QkG r7 = (X.C8207QkG) r7
            java.util.LinkedList r5 = r0.A07
            if (r5 != 0) goto L_0x02b4
            java.util.LinkedList r5 = X.Pxe.A1A()
            r0.A07 = r5
        L_0x02b4:
            int r6 = r7.A0F()
        L_0x02b8:
            if (r9 >= r6) goto L_0x029d
            X.QkB r5 = r7.A0H(r9)
            r0.A04(r5, r2)
            int r9 = r9 + 1
            goto L_0x02b8
        L_0x02c4:
            X.4eY r5 = X.C269054eV.A00(r8)
            java.util.List r5 = r5.A02
            java.util.Iterator r10 = r5.iterator()
        L_0x02ce:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x02f5
            java.lang.Object r9 = r10.next()
            X.QkG r9 = (X.C8207QkG) r9
            java.util.LinkedList r5 = r0.A07
            if (r5 != 0) goto L_0x02e4
            java.util.LinkedList r5 = X.Pxe.A1A()
            r0.A07 = r5
        L_0x02e4:
            int r7 = r9.A0F()
            r6 = 0
        L_0x02e9:
            if (r6 >= r7) goto L_0x02ce
            X.QkB r5 = r9.A0H(r6)
            r0.A04(r5, r2)
            int r6 = r6 + 1
            goto L_0x02e9
        L_0x02f5:
            java.util.Iterator r10 = X.AnonymousClass7TF.A0t(r2)
        L_0x02f9:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x03a0
            java.lang.Object r9 = r10.next()
            X.QkM r9 = (X.C8213QkM) r9
            X.S7Z r7 = r9.A01
            r6 = r7
        L_0x0308:
            if (r6 == 0) goto L_0x0311
            boolean r5 = r6.A05
            if (r5 != 0) goto L_0x0332
            X.S7Z r6 = r6.A01
            goto L_0x0308
        L_0x0311:
            X.S7Z r6 = r9.A02
        L_0x0313:
            if (r6 == 0) goto L_0x031c
            boolean r5 = r6.A05
            if (r5 != 0) goto L_0x0332
            X.S7Z r6 = r6.A01
            goto L_0x0313
        L_0x031c:
            X.S7Z r6 = r9.A03
        L_0x031e:
            if (r6 == 0) goto L_0x0327
            boolean r5 = r6.A05
            if (r5 != 0) goto L_0x0332
            X.S7Z r6 = r6.A01
            goto L_0x031e
        L_0x0327:
            X.S7Z r6 = r9.A00
        L_0x0329:
            if (r6 == 0) goto L_0x039b
            boolean r5 = r6.A05
            if (r5 != 0) goto L_0x0332
            X.S7Z r6 = r6.A01
            goto L_0x0329
        L_0x0332:
            r6 = r7
        L_0x0333:
            if (r6 == 0) goto L_0x033c
            boolean r5 = r6.A03
            if (r5 != 0) goto L_0x035d
            X.S7Z r6 = r6.A01
            goto L_0x0333
        L_0x033c:
            X.S7Z r6 = r9.A02
        L_0x033e:
            if (r6 == 0) goto L_0x0347
            boolean r5 = r6.A03
            if (r5 != 0) goto L_0x035d
            X.S7Z r6 = r6.A01
            goto L_0x033e
        L_0x0347:
            X.S7Z r6 = r9.A03
        L_0x0349:
            if (r6 == 0) goto L_0x0352
            boolean r5 = r6.A03
            if (r5 != 0) goto L_0x035d
            X.S7Z r6 = r6.A01
            goto L_0x0349
        L_0x0352:
            X.S7Z r6 = r9.A00
        L_0x0354:
            if (r6 == 0) goto L_0x02f9
            boolean r5 = r6.A03
            if (r5 != 0) goto L_0x035d
            X.S7Z r6 = r6.A01
            goto L_0x0354
        L_0x035d:
            boolean r5 = r9.A0S()
            if (r5 != 0) goto L_0x036e
            r10.remove()
        L_0x0366:
            java.lang.String r5 = r9.A0L()
            r0.A05(r5)
            goto L_0x02f9
        L_0x036e:
            if (r7 == 0) goto L_0x0374
            X.S7Z r7 = r7.A01()
        L_0x0374:
            r9.A01 = r7
            X.S7Z r5 = r9.A02
            if (r5 == 0) goto L_0x037e
            X.S7Z r5 = r5.A01()
        L_0x037e:
            r9.A02 = r5
            X.S7Z r5 = r9.A03
            if (r5 == 0) goto L_0x0388
            X.S7Z r5 = r5.A01()
        L_0x0388:
            r9.A03 = r5
            X.S7Z r5 = r9.A00
            if (r5 == 0) goto L_0x0392
            X.S7Z r5 = r5.A01()
        L_0x0392:
            r9.A00 = r5
            boolean r5 = r9.A0N()
            if (r5 != 0) goto L_0x02f9
            goto L_0x0366
        L_0x039b:
            r10.remove()
            goto L_0x02f9
        L_0x03a0:
            X.4ez r5 = X.C269354ez.INFER_PROPERTY_MUTATORS
            boolean r12 = r3.A09(r5)
            java.util.Iterator r11 = X.AnonymousClass7TF.A0t(r2)
        L_0x03aa:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x04d3
            java.lang.Object r10 = r11.next()
            X.QkM r10 = (X.C8213QkM) r10
            r9 = r0
            if (r4 == 0) goto L_0x03ba
            r9 = 0
        L_0x03ba:
            X.EUq r7 = X.C48072EUq.AUTO
            X.4eA r6 = r10.A04
            if (r6 == 0) goto L_0x03d6
            boolean r5 = r10.A08
            if (r5 == 0) goto L_0x048b
            X.S7Z r5 = r10.A02
            if (r5 == 0) goto L_0x0464
            java.lang.Object r5 = r5.A02
            X.4eW r5 = (X.C269064eW) r5
            X.EUq r5 = r6.A08(r5)
            if (r5 == 0) goto L_0x0464
            if (r5 == r7) goto L_0x0464
        L_0x03d4:
            if (r5 != 0) goto L_0x03d7
        L_0x03d6:
            r5 = r7
        L_0x03d7:
            int r6 = r5.ordinal()
            r5 = 1
            r7 = 0
            if (r6 == r5) goto L_0x041b
            r5 = 3
            if (r6 == r5) goto L_0x03aa
            r5 = 2
            if (r6 == r5) goto L_0x0412
            X.S7Z r6 = r10.A02
            if (r6 == 0) goto L_0x03ed
            X.S7Z r6 = r6.A03()
        L_0x03ed:
            r10.A02 = r6
            X.S7Z r5 = r10.A00
            if (r5 == 0) goto L_0x03f7
            X.S7Z r5 = r5.A03()
        L_0x03f7:
            r10.A00 = r5
            if (r12 == 0) goto L_0x03fd
            if (r6 != 0) goto L_0x03aa
        L_0x03fd:
            X.S7Z r5 = r10.A01
            if (r5 == 0) goto L_0x0405
            X.S7Z r5 = r5.A03()
        L_0x0405:
            r10.A01 = r5
            X.S7Z r5 = r10.A03
            if (r5 == 0) goto L_0x040f
            X.S7Z r5 = r5.A03()
        L_0x040f:
            r10.A03 = r5
            goto L_0x03aa
        L_0x0412:
            r10.A02 = r7
            boolean r5 = r10.A08
            if (r5 == 0) goto L_0x03aa
            r10.A01 = r7
            goto L_0x03aa
        L_0x041b:
            if (r9 == 0) goto L_0x0458
            java.lang.String r5 = r10.A0L()
            r9.A05(r5)
            X.S7Z r5 = r10.A01
            java.util.Set r6 = X.C8213QkM.A04(r5, r7)
            X.S7Z r5 = r10.A02
            java.util.Set r6 = X.C8213QkM.A04(r5, r6)
            X.S7Z r5 = r10.A03
            java.util.Set r6 = X.C8213QkM.A04(r5, r6)
            X.S7Z r5 = r10.A00
            java.util.Set r5 = X.C8213QkM.A04(r5, r6)
            if (r5 != 0) goto L_0x0442
            java.util.Set r5 = java.util.Collections.emptySet()
        L_0x0442:
            java.util.Iterator r6 = r5.iterator()
        L_0x0446:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x0458
            java.lang.Object r5 = r6.next()
            X.4f7 r5 = (X.C269434f7) r5
            java.lang.String r5 = r5.A02
            r9.A05(r5)
            goto L_0x0446
        L_0x0458:
            r10.A03 = r7
            r10.A00 = r7
            boolean r5 = r10.A08
            if (r5 != 0) goto L_0x03aa
            r10.A01 = r7
            goto L_0x03aa
        L_0x0464:
            X.S7Z r5 = r10.A01
            if (r5 == 0) goto L_0x0476
            java.lang.Object r5 = r5.A02
            X.4eW r5 = (X.C269064eW) r5
            X.EUq r5 = r6.A08(r5)
            if (r5 == 0) goto L_0x0476
            if (r5 == r7) goto L_0x0476
            goto L_0x03d4
        L_0x0476:
            X.S7Z r5 = r10.A00
            if (r5 == 0) goto L_0x0488
            java.lang.Object r5 = r5.A02
            X.4eW r5 = (X.C269064eW) r5
            X.EUq r5 = r6.A08(r5)
            if (r5 == 0) goto L_0x0488
            if (r5 == r7) goto L_0x0488
            goto L_0x03d4
        L_0x0488:
            X.S7Z r5 = r10.A03
            goto L_0x04c3
        L_0x048b:
            X.S7Z r5 = r10.A00
            if (r5 == 0) goto L_0x049d
            java.lang.Object r5 = r5.A02
            X.4eW r5 = (X.C269064eW) r5
            X.EUq r5 = r6.A08(r5)
            if (r5 == 0) goto L_0x049d
            if (r5 == r7) goto L_0x049d
            goto L_0x03d4
        L_0x049d:
            X.S7Z r5 = r10.A03
            if (r5 == 0) goto L_0x04af
            java.lang.Object r5 = r5.A02
            X.4eW r5 = (X.C269064eW) r5
            X.EUq r5 = r6.A08(r5)
            if (r5 == 0) goto L_0x04af
            if (r5 == r7) goto L_0x04af
            goto L_0x03d4
        L_0x04af:
            X.S7Z r5 = r10.A01
            if (r5 == 0) goto L_0x04c1
            java.lang.Object r5 = r5.A02
            X.4eW r5 = (X.C269064eW) r5
            X.EUq r5 = r6.A08(r5)
            if (r5 == 0) goto L_0x04c1
            if (r5 == r7) goto L_0x04c1
            goto L_0x03d4
        L_0x04c1:
            X.S7Z r5 = r10.A02
        L_0x04c3:
            if (r5 == 0) goto L_0x03d6
            java.lang.Object r5 = r5.A02
            X.4eW r5 = (X.C269064eW) r5
            X.EUq r5 = r6.A08(r5)
            if (r5 == 0) goto L_0x03d6
            if (r5 == r7) goto L_0x03d6
            goto L_0x03d4
        L_0x04d3:
            java.util.Iterator r11 = X.AnonymousClass7TF.A0s(r2)
            r7 = 0
        L_0x04d8:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x054c
            java.lang.Object r9 = X.C51971G9r.A0p(r11)
            X.QkM r9 = (X.C8213QkM) r9
            X.S7Z r6 = r9.A01
            r5 = 0
            java.util.Set r6 = X.C8213QkM.A04(r6, r5)
            X.S7Z r5 = r9.A02
            java.util.Set r6 = X.C8213QkM.A04(r5, r6)
            X.S7Z r5 = r9.A03
            java.util.Set r6 = X.C8213QkM.A04(r5, r6)
            X.S7Z r5 = r9.A00
            java.util.Set r10 = X.C8213QkM.A04(r5, r6)
            if (r10 != 0) goto L_0x0503
            java.util.Set r10 = java.util.Collections.emptySet()
        L_0x0503:
            boolean r5 = r10.isEmpty()
            if (r5 != 0) goto L_0x04d8
            r11.remove()
            if (r7 != 0) goto L_0x0512
            java.util.LinkedList r7 = X.Pxe.A1A()
        L_0x0512:
            int r6 = r10.size()
            r5 = 1
            if (r6 != r5) goto L_0x052c
            java.util.Iterator r5 = r10.iterator()
            java.lang.Object r6 = r5.next()
            X.4f7 r6 = (X.C269434f7) r6
            X.QkM r5 = new X.QkM
            r5.<init>(r6, r9)
            r7.add(r5)
            goto L_0x04d8
        L_0x052c:
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            X.S7Z r5 = r9.A01
            X.C8213QkM.A05(r5, r9, r10, r6)
            X.S7Z r5 = r9.A02
            X.C8213QkM.A05(r5, r9, r10, r6)
            X.S7Z r5 = r9.A03
            X.C8213QkM.A05(r5, r9, r10, r6)
            X.S7Z r5 = r9.A00
            X.C8213QkM.A05(r5, r9, r10, r6)
            java.util.Collection r5 = r6.values()
            r7.addAll(r5)
            goto L_0x04d8
        L_0x054c:
            if (r7 == 0) goto L_0x0581
            java.util.Iterator r9 = r7.iterator()
        L_0x0552:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0581
            java.lang.Object r7 = r9.next()
            X.QkM r7 = (X.C8213QkM) r7
            java.lang.String r6 = r7.A0L()
            java.lang.Object r5 = r2.get(r6)
            X.QkM r5 = (X.C8213QkM) r5
            if (r5 != 0) goto L_0x057d
            r2.put(r6, r7)
        L_0x056d:
            java.util.LinkedList r5 = r0.A07
            boolean r5 = A00(r7, r5)
            if (r5 == 0) goto L_0x0552
            java.util.HashSet r5 = r0.A00
            if (r5 == 0) goto L_0x0552
            r5.remove(r6)
            goto L_0x0552
        L_0x057d:
            r5.A0Y(r7)
            goto L_0x056d
        L_0x0581:
            java.util.List r5 = X.C269054eV.A02(r8)
            java.util.Iterator r7 = r5.iterator()
        L_0x0589:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x059d
            java.lang.Object r6 = r7.next()
            X.QkH r6 = (X.C8208QkH) r6
            X.T9g r5 = r1.A02(r6)
            r0.A03(r5, r6)
            goto L_0x0589
        L_0x059d:
            X.TAJ r5 = X.C269054eV.A01(r8)
            java.util.Iterator r9 = r5.iterator()
        L_0x05a5:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x05c0
            java.lang.Object r7 = r9.next()
            X.QkG r7 = (X.C8207QkG) r7
            int r6 = r7.A0F()
            r5 = 1
            if (r6 != r5) goto L_0x05a5
            X.T9g r5 = r1.A02(r7)
            r0.A03(r5, r7)
            goto L_0x05a5
        L_0x05c0:
            java.util.Iterator r12 = X.AnonymousClass7TF.A0t(r2)
        L_0x05c4:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x063e
            java.lang.Object r9 = r12.next()
            X.QkM r9 = (X.C8213QkM) r9
            r10 = 0
            if (r4 == 0) goto L_0x05ee
            X.S7Z r11 = r9.A02
            X.S7Z r7 = r9.A01
            if (r11 == 0) goto L_0x0627
            X.S7Z r6 = r9.A00
            X.S7Z r5 = r9.A03
            X.S7Z[] r5 = new X.S7Z[]{r11, r7, r6, r5}
            X.Suc r6 = X.C8213QkM.A02(r9, r5, r10)
            X.S7Z r5 = r9.A02
            X.S7Z r5 = X.C8213QkM.A03(r6, r5, r9)
            r9.A02 = r5
            goto L_0x05c4
        L_0x05ee:
            X.S7Z r11 = r9.A00
            X.S7Z r7 = r9.A03
            X.S7Z r6 = r9.A01
            if (r11 == 0) goto L_0x0609
            X.S7Z r5 = r9.A02
            X.S7Z[] r5 = new X.S7Z[]{r11, r7, r6, r5}
            X.Suc r6 = X.C8213QkM.A02(r9, r5, r10)
            X.S7Z r5 = r9.A00
            X.S7Z r5 = X.C8213QkM.A03(r6, r5, r9)
            r9.A00 = r5
            goto L_0x05c4
        L_0x0609:
            if (r7 == 0) goto L_0x061e
            X.S7Z r5 = r9.A02
            X.S7Z[] r5 = new X.S7Z[]{r7, r6, r5}
            X.Suc r6 = X.C8213QkM.A02(r9, r5, r10)
            X.S7Z r5 = r9.A03
            X.S7Z r5 = X.C8213QkM.A03(r6, r5, r9)
            r9.A03 = r5
            goto L_0x05c4
        L_0x061e:
            if (r6 == 0) goto L_0x05c4
            X.S7Z r5 = r9.A02
            X.S7Z[] r5 = new X.S7Z[]{r6, r5}
            goto L_0x0631
        L_0x0627:
            if (r7 == 0) goto L_0x05c4
            X.S7Z r6 = r9.A00
            X.S7Z r5 = r9.A03
            X.S7Z[] r5 = new X.S7Z[]{r7, r6, r5}
        L_0x0631:
            X.Suc r6 = X.C8213QkM.A02(r9, r5, r10)
            X.S7Z r5 = r9.A01
            X.S7Z r5 = X.C8213QkM.A03(r6, r5, r9)
            r9.A01 = r5
            goto L_0x05c4
        L_0x063e:
            java.lang.Object r6 = r1.A0e(r8)
            if (r6 != 0) goto L_0x06de
            X.4eS r5 = r3.A01
            X.T9E r5 = r5.A02
        L_0x0648:
            if (r5 == 0) goto L_0x0709
        L_0x064a:
            java.util.Collection r6 = r2.values()
            int r5 = r2.size()
            X.QkM[] r5 = new X.C8213QkM[r5]
            java.lang.Object[] r10 = r6.toArray(r5)
            X.QkM[] r10 = (X.C8213QkM[]) r10
            r2.clear()
            int r9 = r10.length
            r7 = 0
        L_0x065f:
            if (r7 >= r9) goto L_0x0709
            r6 = r10[r7]
            X.4f7 r11 = r6.A06
            boolean r5 = r6.A0T()
            if (r5 == 0) goto L_0x0673
            X.4ez r5 = X.C269354ez.ALLOW_EXPLICIT_PROPERTY_RENAMING
            boolean r5 = r3.A09(r5)
            if (r5 == 0) goto L_0x06db
        L_0x0673:
            if (r4 == 0) goto L_0x06c4
            X.S7Z r5 = r6.A02
            if (r5 == 0) goto L_0x06ba
            r6.A0G()
        L_0x067c:
            java.lang.String r12 = r11.A02
            if (r12 == 0) goto L_0x06db
            boolean r5 = r12.equals(r12)
            if (r5 != 0) goto L_0x06db
            X.4f7 r13 = r6.A06
            java.lang.String r5 = r13.A02
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x06b2
            r5 = r13
        L_0x0691:
            if (r5 != r13) goto L_0x06ac
            r11 = r6
        L_0x0694:
            r6 = r11
        L_0x0695:
            java.lang.Object r5 = r2.get(r12)
            X.QkM r5 = (X.C8213QkM) r5
            if (r5 != 0) goto L_0x06a8
            r2.put(r12, r6)
        L_0x06a0:
            java.util.LinkedList r5 = r0.A07
            A00(r6, r5)
            int r7 = r7 + 1
            goto L_0x065f
        L_0x06a8:
            r5.A0Y(r6)
            goto L_0x06a0
        L_0x06ac:
            X.QkM r11 = new X.QkM
            r11.<init>(r5, r6)
            goto L_0x0694
        L_0x06b2:
            java.lang.String r11 = r13.A01
            X.4f7 r5 = new X.4f7
            r5.<init>(r12, r11)
            goto L_0x0691
        L_0x06ba:
            boolean r5 = r6.A0Q()
            if (r5 == 0) goto L_0x06db
            r6.A0E()
            goto L_0x067c
        L_0x06c4:
            boolean r5 = r6.A0R()
            if (r5 != 0) goto L_0x067c
            boolean r5 = r6.A0P()
            if (r5 != 0) goto L_0x067c
            boolean r5 = r6.A0Q()
            if (r5 != 0) goto L_0x067c
            X.S7Z r5 = r6.A02
            if (r5 == 0) goto L_0x06db
            goto L_0x067c
        L_0x06db:
            java.lang.String r12 = r11.A02
            goto L_0x0695
        L_0x06de:
            boolean r5 = r6 instanceof X.T9E
            if (r5 != 0) goto L_0x064a
            boolean r5 = r6 instanceof java.lang.Class
            if (r5 == 0) goto L_0x08a2
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Class<X.T9E> r5 = X.T9E.class
            if (r6 == r5) goto L_0x0709
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L_0x06fc
            boolean r5 = r3.A06()
            java.lang.Object r5 = X.C269574fL.A03(r6, r5)
            goto L_0x0648
        L_0x06fc:
            java.lang.String r2 = "AnnotationIntrospector returned Class "
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "; expected Class<PropertyNamingStrategy>"
            java.lang.IllegalStateException r0 = X.Pxg.A0e(r2, r1, r0)
            throw r0
        L_0x0709:
            java.util.Iterator r6 = X.AnonymousClass7TF.A0t(r2)
        L_0x070d:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0742
            java.lang.Object r5 = r6.next()
            X.QkM r5 = (X.C8213QkM) r5
            X.S7Z r4 = r5.A01
            if (r4 == 0) goto L_0x0721
            X.S7Z r4 = r4.A00()
        L_0x0721:
            r5.A01 = r4
            X.S7Z r4 = r5.A02
            if (r4 == 0) goto L_0x072b
            X.S7Z r4 = r4.A00()
        L_0x072b:
            r5.A02 = r4
            X.S7Z r4 = r5.A03
            if (r4 == 0) goto L_0x0735
            X.S7Z r4 = r4.A00()
        L_0x0735:
            r5.A03 = r4
            X.S7Z r4 = r5.A00
            if (r4 == 0) goto L_0x073f
            X.S7Z r4 = r4.A00()
        L_0x073f:
            r5.A00 = r4
            goto L_0x070d
        L_0x0742:
            X.4ez r4 = X.C269354ez.USE_WRAPPER_NAME_AS_PROPERTY_NAME
            boolean r4 = r3.A09(r4)
            if (r4 == 0) goto L_0x075e
            java.util.Iterator r5 = X.AnonymousClass7TF.A0s(r2)
        L_0x074e:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x075e
            java.lang.Object r4 = X.C51971G9r.A0p(r5)
            X.SK8 r4 = (X.SK8) r4
            r4.A0F()
            goto L_0x074e
        L_0x075e:
            java.lang.Boolean r4 = r1.A0N(r8)
            if (r4 != 0) goto L_0x089c
            X.4ez r4 = X.C269354ez.SORT_PROPERTIES_ALPHABETICALLY
            long r6 = r3.A00
            long r4 = r4.A00
            long r6 = r6 & r4
            r9 = 0
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            boolean r13 = X.AnonymousClass7TF.A1P(r4)
        L_0x0773:
            java.util.Iterator r5 = X.AnonymousClass7TF.A0t(r2)
        L_0x0777:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0899
            java.lang.Object r4 = r5.next()
            X.SK8 r4 = (X.SK8) r4
            X.T9n r4 = r4.A0B()
            java.lang.Integer r4 = r4.A03
            if (r4 == 0) goto L_0x0777
            r12 = 1
        L_0x078c:
            java.lang.String[] r11 = r1.A0r(r8)
            if (r13 != 0) goto L_0x07a0
            if (r12 != 0) goto L_0x07a0
            java.util.LinkedList r1 = r0.A07
            if (r1 != 0) goto L_0x07a0
            if (r11 != 0) goto L_0x07a0
        L_0x079a:
            r0.A02 = r2
            r1 = 1
            r0.A0A = r1
            return
        L_0x07a0:
            int r6 = r2.size()
            if (r13 == 0) goto L_0x07c3
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
        L_0x07ab:
            java.util.Iterator r5 = X.AnonymousClass7TF.A0t(r2)
        L_0x07af:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x07ca
            java.lang.Object r4 = r5.next()
            X.SK8 r4 = (X.SK8) r4
            java.lang.String r1 = r4.A0L()
            r7.put(r1, r4)
            goto L_0x07af
        L_0x07c3:
            int r1 = r6 + r6
            java.util.LinkedHashMap r7 = X.DbS.A0x(r1)
            goto L_0x07ab
        L_0x07ca:
            int r6 = r6 + r6
            java.util.LinkedHashMap r6 = X.DbS.A0x(r6)
            if (r11 == 0) goto L_0x0801
            int r10 = r11.length
            r9 = 0
        L_0x07d3:
            if (r9 >= r10) goto L_0x0801
            r8 = r11[r9]
            java.lang.Object r4 = r7.remove(r8)
            if (r4 != 0) goto L_0x07fb
            java.util.Iterator r5 = X.AnonymousClass7TF.A0t(r2)
        L_0x07e1:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x07fe
            java.lang.Object r4 = r5.next()
            X.QkM r4 = (X.C8213QkM) r4
            X.4f7 r1 = r4.A05
            java.lang.String r1 = r1.A02
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x07e1
            java.lang.String r8 = r4.A0L()
        L_0x07fb:
            r6.put(r8, r4)
        L_0x07fe:
            int r9 = r9 + 1
            goto L_0x07d3
        L_0x0801:
            if (r12 == 0) goto L_0x083f
            java.util.TreeMap r8 = new java.util.TreeMap
            r8.<init>()
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r7)
        L_0x080c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0827
            java.lang.Object r4 = X.C51971G9r.A0p(r5)
            X.SK8 r4 = (X.SK8) r4
            X.T9n r1 = r4.A0B()
            java.lang.Integer r1 = r1.A03
            if (r1 == 0) goto L_0x080c
            r8.put(r1, r4)
            r5.remove()
            goto L_0x080c
        L_0x0827:
            java.util.Iterator r5 = X.AnonymousClass7TF.A0t(r8)
        L_0x082b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x083f
            java.lang.Object r4 = r5.next()
            X.SK8 r4 = (X.SK8) r4
            java.lang.String r1 = r4.A0L()
            r6.put(r1, r4)
            goto L_0x082b
        L_0x083f:
            java.util.LinkedList r1 = r0.A07
            if (r1 == 0) goto L_0x088e
            if (r13 == 0) goto L_0x0870
            X.4ez r1 = X.C269354ez.SORT_CREATOR_PROPERTIES_FIRST
            boolean r1 = r3.A09(r1)
            if (r1 == 0) goto L_0x088e
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.util.LinkedList r1 = r0.A07
            java.util.Iterator r4 = r1.iterator()
        L_0x0858:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x086c
            java.lang.Object r3 = r4.next()
            X.SK8 r3 = (X.SK8) r3
            java.lang.String r1 = r3.A0L()
            r5.put(r1, r3)
            goto L_0x0858
        L_0x086c:
            java.util.Collection r1 = r5.values()
        L_0x0870:
            java.util.Iterator r5 = r1.iterator()
        L_0x0874:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x088e
            java.lang.Object r4 = r5.next()
            X.SK8 r4 = (X.SK8) r4
            java.lang.String r3 = r4.A0L()
            boolean r1 = r7.containsKey(r3)
            if (r1 == 0) goto L_0x0874
            r6.put(r3, r4)
            goto L_0x0874
        L_0x088e:
            r6.putAll(r7)
            r2.clear()
            r2.putAll(r6)
            goto L_0x079a
        L_0x0899:
            r12 = 0
            goto L_0x078c
        L_0x089c:
            boolean r13 = r4.booleanValue()
            goto L_0x0773
        L_0x08a2:
            java.lang.String r2 = "AnnotationIntrospector returned PropertyNamingStrategy definition of type "
            java.lang.String r1 = X.C66581MXm.A0y(r6)
            java.lang.String r0 = "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead"
            java.lang.IllegalStateException r0 = X.Pxg.A0e(r2, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SJu.A02():void");
    }

    public final void A06(String str, Object... objArr) {
        String format = String.format(str, objArr);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Problem with definition of ");
        A1A.append(this.A0F);
        throw AnonymousClass7TE.A0w(Pxg.A0s(": ", format, A1A));
    }
}
