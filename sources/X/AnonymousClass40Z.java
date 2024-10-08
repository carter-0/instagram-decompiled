package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.40Z  reason: invalid class name */
public final class AnonymousClass40Z extends C2590140a implements C2590340d {
    public int A00 = -1;
    public AnonymousClass5H5 A01;
    public final C250863mB A02;
    public final AnonymousClass40P A03;
    public final AnonymousClass40W A04;
    public final AnonymousClass5H6 A05;
    public final AnonymousClass40Y A06;
    public final AnonymousClass40R A07;

    public AnonymousClass40Z(SerialDescriptor serialDescriptor, C250863mB r3, AnonymousClass40W r4, AnonymousClass5H5 r5, AnonymousClass40Y r6) {
        AnonymousClass5H6 r0;
        0qQ.A0B(r3, 1);
        0qQ.A0B(serialDescriptor, 4);
        this.A02 = r3;
        this.A06 = r6;
        this.A04 = r4;
        this.A07 = r3.A02;
        this.A01 = r5;
        AnonymousClass40P r02 = r3.A00;
        this.A03 = r02;
        if (r02.A0A) {
            r0 = null;
        } else {
            r0 = new AnonymousClass5H6(serialDescriptor);
        }
        this.A05 = r0;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 258 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0174, code lost:
        if (r10 == 8) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0176, code lost:
        if (r10 == 6) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x017a, code lost:
        if (r10 != 9) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0186, code lost:
        if (((java.lang.Number) X.00k.A0K(r6)).byteValue() == 8) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0188, code lost:
        r2 = r3.A00;
        r1 = new java.lang.StringBuilder();
        r0 = "found ] instead of } at path: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0191, code lost:
        r1.append(r0);
        r1.append(r3.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01a5, code lost:
        throw X.C18804W2u.A01(((X.AnonymousClass40V) r3).A00, r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01a7, code lost:
        if (r10 != 7) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b3, code lost:
        if (((java.lang.Number) X.00k.A0K(r6)).byteValue() == 6) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b5, code lost:
        r2 = r3.A00;
        r1 = new java.lang.StringBuilder();
        r0 = "found } instead of ] at path: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c1, code lost:
        if (r10 != 10) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c3, code lost:
        r2 = "Unexpected end of input due to malformed JSON during ignoring unknown keys";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01c7, code lost:
        r6.add(java.lang.Byte.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01cf, code lost:
        X.018.A14(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d2, code lost:
        r3.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d9, code lost:
        if (r6.size() != 0) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025d, code lost:
        X.0qQ.A0B(r10, 0);
        r1 = ((X.AnonymousClass40V) r3).A00.subSequence(0, r3.A00).toString();
        X.0qQ.A0B(r1, 0);
        r2 = X.00l.A07(r1, r10, r1.length() - 1);
        r1 = X.002.A0S(X.AnonymousClass000.A00(2253), r10, '\'');
        r0 = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x028f, code lost:
        r0 = "object";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        if (r7.A02.A00.A06 == false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f2, code lost:
        if (r2 == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x013e, code lost:
        if (r1.A0B != false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0140, code lost:
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0142, code lost:
        if (r1 == null) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x014a, code lost:
        if (X.0qQ.A0K(r1.A00, r10) == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x014c, code lost:
        r1.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x014f, code lost:
        r6 = new java.util.ArrayList();
        r0 = r3.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x015b, code lost:
        if (r0 == 8) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015d, code lost:
        if (r0 == 6) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x015f, code lost:
        r3.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0163, code lost:
        r10 = r3.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0168, code lost:
        if (r10 != 1) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x016a, code lost:
        if (r4 == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016c, code lost:
        r3.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0170, code lost:
        r3.A08();
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int ANp(kotlinx.serialization.descriptors.SerialDescriptor r17) {
        /*
            r16 = this;
            r8 = 0
            r9 = r17
            X.0qQ.A0B(r9, r8)
            r7 = r16
            X.40Y r5 = r7.A06
            int r1 = r5.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0046
            X.40W r3 = r7.A04
            if (r1 == r8) goto L_0x00fe
            boolean r1 = r3.A0H()
            boolean r0 = r3.A0G()
            r6 = -1
            if (r0 == 0) goto L_0x0038
            int r0 = r7.A00
            if (r0 == r6) goto L_0x0089
            if (r1 != 0) goto L_0x0089
            r0 = 2262(0x8d6, float:3.17E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
        L_0x002c:
            int r1 = r3.A00
            java.lang.String r0 = ""
            r3.A0F(r2, r0, r1)
        L_0x0033:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0038:
            if (r1 == 0) goto L_0x00c3
            X.3mB r0 = r7.A02
            X.40P r0 = r0.A00
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "array"
            goto L_0x0291
        L_0x0046:
            int r1 = r7.A00
            int r0 = r1 % 2
            r4 = 0
            r2 = 0
            if (r0 == 0) goto L_0x004f
            r2 = 1
        L_0x004f:
            r6 = -1
            if (r2 == 0) goto L_0x007f
            if (r1 == r6) goto L_0x005a
            X.40W r0 = r7.A04
            boolean r4 = r0.A0H()
        L_0x005a:
            X.40W r3 = r7.A04
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x008e
            if (r2 == 0) goto L_0x0087
            int r0 = r7.A00
            if (r0 != r6) goto L_0x0078
            r0 = r4 ^ 1
            int r2 = r3.A00
            if (r0 != 0) goto L_0x0087
            r0 = 234(0xea, float:3.28E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
        L_0x0074:
            java.lang.String r0 = ""
            goto L_0x028a
        L_0x0078:
            int r2 = r3.A00
            if (r4 != 0) goto L_0x0087
            java.lang.String r1 = "Expected comma after the key-value pair"
            goto L_0x0074
        L_0x007f:
            X.40W r1 = r7.A04
            r0 = 58
            r1.A0E(r0)
            goto L_0x005a
        L_0x0087:
            int r0 = r7.A00
        L_0x0089:
            int r6 = r0 + 1
            r7.A00 = r6
            goto L_0x00c3
        L_0x008e:
            if (r4 == 0) goto L_0x00c3
            X.3mB r0 = r7.A02
            X.40P r0 = r0.A00
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x028f
            goto L_0x00c3
        L_0x0099:
            X.3uF r1 = r10.BKK()
            X.48A r0 = X.AnonymousClass48A.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00b1
            boolean r2 = r10.CYM()
            if (r2 == 0) goto L_0x00e1
            boolean r0 = r3.A0I(r8)
            if (r0 == 0) goto L_0x00e1
        L_0x00b1:
            X.5H6 r0 = r7.A05
            if (r0 == 0) goto L_0x00c3
            X.TsW r2 = r0.A01
            r0 = 64
            if (r6 >= r0) goto L_0x00d0
            long r7 = r2.A00
            r0 = 1
            long r0 = r0 << r6
            long r7 = r7 | r0
            r2.A00 = r7
        L_0x00c3:
            X.40Y r0 = X.AnonymousClass40Y.MAP
            if (r5 == r0) goto L_0x00cf
            X.40X r0 = r3.A03
            int[] r1 = r0.A01
            int r0 = r0.A00
            r1[r0] = r6
        L_0x00cf:
            return r6
        L_0x00d0:
            int r0 = r6 >>> 6
            int r9 = r0 + -1
            r4 = r6 & 63
            long[] r2 = r2.A03
            r7 = r2[r9]
            r0 = 1
            long r0 = r0 << r4
            long r7 = r7 | r0
            r2[r9] = r7
            goto L_0x00c3
        L_0x00e1:
            java.lang.String r0 = r3.A0C(r4)
            if (r0 == 0) goto L_0x00b1
            int r1 = X.C2591440o.A01(r0, r10, r12)
            X.40P r0 = r12.A00
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x00f4
            r0 = 1
            if (r2 != 0) goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            if (r1 != r11) goto L_0x00b1
            if (r13 != 0) goto L_0x00fb
            if (r0 == 0) goto L_0x00b1
        L_0x00fb:
            r3.A09()
        L_0x00fe:
            boolean r0 = r3.A0H()
            boolean r1 = r3.A0G()
            if (r1 == 0) goto L_0x01e3
            X.40P r1 = r7.A03
            boolean r4 = r1.A0C
            if (r4 == 0) goto L_0x01dd
            java.lang.String r10 = r3.A0B()
        L_0x0112:
            r0 = 58
            r3.A0E(r0)
            X.3mB r12 = r7.A02
            int r6 = X.C2591440o.A01(r10, r9, r12)
            r11 = -3
            if (r6 == r11) goto L_0x013c
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x00b1
            boolean r13 = r9.CRn(r6)
            kotlinx.serialization.descriptors.SerialDescriptor r10 = r9.B0R(r6)
            r1 = 1
            if (r13 == 0) goto L_0x0099
            boolean r0 = r10.CYM()
            if (r0 != 0) goto L_0x0099
            boolean r0 = r3.A0I(r1)
            if (r0 == 0) goto L_0x0099
            goto L_0x00fe
        L_0x013c:
            boolean r0 = r1.A0B
            if (r0 != 0) goto L_0x014f
            X.5H5 r1 = r7.A01
            if (r1 == 0) goto L_0x025d
            java.lang.String r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 == 0) goto L_0x025d
            r0 = 0
            r1.A00 = r0
        L_0x014f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            byte r0 = r3.A04()
            r2 = 6
            r1 = 8
            if (r0 == r1) goto L_0x0163
            if (r0 == r2) goto L_0x0163
            r3.A0A()
            goto L_0x00fe
        L_0x0163:
            byte r10 = r3.A04()
            r0 = 1
            if (r10 != r0) goto L_0x0174
            if (r4 == 0) goto L_0x0170
            r3.A0A()
            goto L_0x0163
        L_0x0170:
            r3.A08()
            goto L_0x0163
        L_0x0174:
            if (r10 == r1) goto L_0x01c7
            if (r10 == r2) goto L_0x01c7
            r0 = 9
            if (r10 != r0) goto L_0x01a6
            java.lang.Object r0 = X.00k.A0K(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            if (r0 == r1) goto L_0x01cf
            int r2 = r3.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "found ] instead of } at path: "
        L_0x0191:
            r1.append(r0)
            X.40X r0 = r3.A03
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.40V r3 = (X.AnonymousClass40V) r3
            java.lang.String r0 = r3.A00
            X.4t6 r0 = X.C18804W2u.A01(r0, r1, r2)
            throw r0
        L_0x01a6:
            r0 = 7
            if (r10 != r0) goto L_0x01bf
            java.lang.Object r0 = X.00k.A0K(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            if (r0 == r2) goto L_0x01cf
            int r2 = r3.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "found } instead of ] at path: "
            goto L_0x0191
        L_0x01bf:
            r0 = 10
            if (r10 != r0) goto L_0x01d2
            java.lang.String r2 = "Unexpected end of input due to malformed JSON during ignoring unknown keys"
            goto L_0x002c
        L_0x01c7:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r10)
            r6.add(r0)
            goto L_0x01d2
        L_0x01cf:
            X.018.A14(r6)
        L_0x01d2:
            r3.A03()
            int r0 = r6.size()
            if (r0 != 0) goto L_0x0163
            goto L_0x00fe
        L_0x01dd:
            java.lang.String r10 = r3.A08()
            goto L_0x0112
        L_0x01e3:
            if (r0 == 0) goto L_0x01ed
            X.3mB r0 = r7.A02
            X.40P r0 = r0.A00
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x028f
        L_0x01ed:
            X.5H6 r0 = r7.A05
            if (r0 == 0) goto L_0x025a
            X.TsW r9 = r0.A01
            kotlinx.serialization.descriptors.SerialDescriptor r8 = r9.A02
            int r2 = r8.B0a()
        L_0x01f9:
            long r0 = r9.A00
            r14 = -1
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0221
            long r6 = r0 ^ r14
            int r6 = java.lang.Long.numberOfTrailingZeros(r6)
            r10 = 1
            long r10 = r10 << r6
            long r0 = r0 | r10
            r9.A00 = r0
            X.0sL r1 = r9.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r1.invoke(r8, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01f9
            goto L_0x00c3
        L_0x0221:
            r0 = 64
            if (r2 <= r0) goto L_0x025a
            long[] r7 = r9.A03
            int r4 = r7.length
            r2 = 0
        L_0x0229:
            if (r2 >= r4) goto L_0x025a
            int r13 = r2 + 1
            int r12 = r13 * 64
            r10 = r7[r2]
        L_0x0231:
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0256
            long r0 = r14 ^ r10
            int r6 = java.lang.Long.numberOfTrailingZeros(r0)
            r0 = 1
            long r0 = r0 << r6
            long r10 = r10 | r0
            int r6 = r6 + r12
            X.0sL r1 = r9.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r1.invoke(r8, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0231
            r7[r2] = r10
            goto L_0x00c3
        L_0x0256:
            r7[r2] = r10
            r2 = r13
            goto L_0x0229
        L_0x025a:
            r6 = -1
            goto L_0x00c3
        L_0x025d:
            X.0qQ.A0B(r10, r8)
            int r1 = r3.A00
            r0 = r3
            X.40V r0 = (X.AnonymousClass40V) r0
            java.lang.String r0 = r0.A00
            java.lang.CharSequence r0 = r0.subSequence(r8, r1)
            java.lang.String r1 = r0.toString()
            X.0qQ.A0B(r1, r8)
            int r0 = r1.length()
            int r0 = r0 + -1
            int r2 = X.00l.A07(r1, r10, r0)
            r0 = 2253(0x8cd, float:3.157E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 39
            java.lang.String r1 = X.002.A0S(r1, r10, r0)
            java.lang.String r0 = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys."
        L_0x028a:
            r3.A0F(r1, r0, r2)
            goto L_0x0033
        L_0x028f:
            java.lang.String r0 = "object"
        L_0x0291:
            X.C18804W2u.A06(r0, r3)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass40Z.ANp(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    public final JsonElement AO0() {
        return new W1J(this.A02.A00, this.A04).A03();
    }

    public final AnonymousClass40R Bsb() {
        return this.A07;
    }
}
