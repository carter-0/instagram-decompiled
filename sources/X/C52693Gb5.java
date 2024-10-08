package X;

import android.content.ClipDescription;
import android.view.ActionMode;

/* renamed from: X.Gb5  reason: case insensitive filesystem */
public final class C52693Gb5 {
    public int A00;
    public long A01;
    public long A02;
    public C52754Gc7 A03;
    public C56547I1b A04;
    public AnonymousClass5V6 A05;
    public AnonymousClass5TC A06;
    public AnonymousClass5VM A07;
    public JS3 A08;
    public C285975Tl A09;
    public C59648JRq A0A;
    public Integer A0B;
    public 0sP A0C;
    public JNW A0D;
    public final C59629JQx A0E;
    public final JLM A0F;
    public final C284945Oz A0G;
    public final C284945Oz A0H;
    public final C284945Oz A0I;
    public final C284945Oz A0J;
    public final C284945Oz A0K;
    public final C55978Hqj A0L;

    public static void A02(C52693Gb5 gb5) {
        gb5.A0H.Epw((Object) null);
        gb5.A0G.Epw((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
        if (X.C3026964x.A00((int) (r0 & 4294967295L), (int) (r0 >> 32)) != r4) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        if (X.C285965Tk.A03(r4) == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        if (X.C56168Htx.A01(r8, true) == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0127, code lost:
        if (X.C56168Htx.A01(r8, false) == false) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(X.C59646JRo r23, X.C52693Gb5 r24, X.C285975Tl r25, long r26, boolean r28, boolean r29, boolean r30) {
        /*
            r8 = r24
            X.Gc7 r0 = r8.A03
            if (r0 == 0) goto L_0x0172
            X.I1h r2 = X.C52754Gc7.A00(r0)
            if (r2 == 0) goto L_0x0172
            X.JS3 r9 = r8.A08
            r7 = r25
            long r4 = r7.A00
            r21 = 32
            long r0 = r4 >> r21
            int r3 = (int) r0
            int r6 = r9.E1S(r3)
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r4 & r19
            int r3 = (int) r0
            int r0 = r9.E1S(r3)
            long r17 = X.C3026964x.A00(r6, r0)
            r6 = 0
            r0 = r26
            int r16 = r2.A01(r0, r6)
            r9 = r29
            if (r29 != 0) goto L_0x0167
            if (r28 != 0) goto L_0x0167
            long r0 = r17 >> r21
            int r3 = (int) r0
            r22 = r3
        L_0x003d:
            r13 = r16
        L_0x003f:
            X.JNW r12 = r8.A0D
            r11 = -1
            if (r28 != 0) goto L_0x004b
            if (r12 == 0) goto L_0x004b
            int r0 = r8.A00
            if (r0 == r11) goto L_0x004b
            r11 = r0
        L_0x004b:
            X.62f r10 = r2.A02
            if (r28 == 0) goto L_0x0142
            r2 = 0
        L_0x0050:
            X.Hrg r1 = new X.Hrg
            r0 = r22
            r1.<init>(r10, r0, r13, r11)
            X.IFi r10 = new X.IFi
            r10.<init>(r1, r2, r9)
            X.Hso r0 = r10.A01
            if (r0 == 0) goto L_0x007e
            if (r12 == 0) goto L_0x007e
            boolean r0 = r12 instanceof X.C56861IFi
            if (r0 == 0) goto L_0x007e
            X.IFi r12 = (X.C56861IFi) r12
            boolean r1 = r10.A02
            boolean r0 = r12.A02
            if (r1 != r0) goto L_0x007e
            X.Hrg r3 = r10.A00
            X.Hrg r2 = r12.A00
            int r1 = r3.A02
            int r0 = r2.A02
            if (r1 != r0) goto L_0x007e
            int r1 = r3.A00
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0174
        L_0x007e:
            r8.A0D = r10
            r0 = r16
            r8.A00 = r0
            r0 = r23
            X.Hso r3 = r0.AAn(r10)
            X.JS3 r2 = r8.A08
            X.Hsn r0 = r3.A01
            int r0 = r0.A00
            int r1 = r2.FHr(r0)
            X.Hsn r0 = r3.A00
            int r0 = r0.A00
            int r0 = r2.FHr(r0)
            long r0 = X.C3026964x.A00(r1, r0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0174
            boolean r3 = X.C285965Tk.A04(r0)
            boolean r2 = X.C285965Tk.A04(r4)
            r9 = 1
            if (r3 == r2) goto L_0x00be
            long r2 = r0 & r19
            int r11 = (int) r2
            long r2 = r0 >> r21
            int r10 = (int) r2
            long r10 = X.C3026964x.A00(r11, r10)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            r11 = 1
            if (r2 == 0) goto L_0x00bf
        L_0x00be:
            r11 = 0
        L_0x00bf:
            boolean r10 = X.C285965Tk.A03(r0)
            if (r10 == 0) goto L_0x00cc
            boolean r2 = X.C285965Tk.A03(r4)
            r3 = 1
            if (r2 != 0) goto L_0x00cd
        L_0x00cc:
            r3 = 0
        L_0x00cd:
            r5 = r30
            if (r30 == 0) goto L_0x00ec
            X.5Tq r2 = r7.A01
            java.lang.String r2 = r2.A00
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x00ec
            if (r11 != 0) goto L_0x00ec
            if (r3 != 0) goto L_0x00ec
            X.5V6 r2 = r8.A05
            if (r2 == 0) goto L_0x00ec
            X.5V5 r2 = (X.AnonymousClass5V5) r2
            r3 = 9
            android.view.View r2 = r2.A00
            r2.performHapticFeedback(r3)
        L_0x00ec:
            X.5Tq r4 = r7.A01
            r2 = 0
            X.5Tl r3 = new X.5Tl
            r3.<init>(r4, r2, r0)
            X.0sP r2 = r8.A0C
            r2.invoke(r3)
            if (r30 != 0) goto L_0x0100
            r2 = r10 ^ 1
            A05(r8, r2)
        L_0x0100:
            X.Gc7 r2 = r8.A03
            if (r2 == 0) goto L_0x0109
            X.5Oz r2 = r2.A0B
            X.C51967G9n.A16(r2, r5)
        L_0x0109:
            X.Gc7 r4 = r8.A03
            if (r4 == 0) goto L_0x011c
            if (r10 != 0) goto L_0x0116
            boolean r2 = X.C56168Htx.A01(r8, r9)
            r3 = 1
            if (r2 != 0) goto L_0x0117
        L_0x0116:
            r3 = 0
        L_0x0117:
            X.5Oz r2 = r4.A0I
            X.C51967G9n.A16(r2, r3)
        L_0x011c:
            X.Gc7 r4 = r8.A03
            if (r4 == 0) goto L_0x012f
            if (r10 != 0) goto L_0x0129
            boolean r2 = X.C56168Htx.A01(r8, r6)
            r3 = 1
            if (r2 != 0) goto L_0x012a
        L_0x0129:
            r3 = 0
        L_0x012a:
            X.5Oz r2 = r4.A0H
            X.C51967G9n.A16(r2, r3)
        L_0x012f:
            X.Gc7 r3 = r8.A03
            if (r3 == 0) goto L_0x0141
            if (r10 == 0) goto L_0x013c
            boolean r2 = X.C56168Htx.A01(r8, r9)
            if (r2 == 0) goto L_0x013c
            r6 = 1
        L_0x013c:
            X.5Oz r2 = r3.A0F
            X.C51967G9n.A16(r2, r6)
        L_0x0141:
            return r0
        L_0x0142:
            long r0 = r17 >> r21
            int r15 = (int) r0
            X.GSi r0 = X.HRB.A00(r10, r15)
            r2 = 1
            X.Hsn r14 = new X.Hsn
            r14.<init>(r0, r15, r2)
            long r0 = r17 & r19
            int r15 = (int) r0
            X.GSi r0 = X.HRB.A00(r10, r15)
            X.Hsn r1 = new X.Hsn
            r1.<init>(r0, r15, r2)
            boolean r0 = X.C285965Tk.A04(r17)
            X.Hso r2 = new X.Hso
            r2.<init>(r14, r1, r0)
            goto L_0x0050
        L_0x0167:
            r22 = r16
            if (r29 == 0) goto L_0x003d
            if (r28 != 0) goto L_0x003d
            long r0 = r17 & r19
            int r13 = (int) r0
            goto L_0x003f
        L_0x0172:
            long r4 = X.C285965Tk.A01
        L_0x0174:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52693Gb5.A00(X.JRo, X.Gb5, X.5Tl, long, boolean, boolean, boolean):long");
    }

    public static final void A01(HL2 hl2, C52693Gb5 gb5) {
        C52754Gc7 gc7 = gb5.A03;
        if (gc7 != null && gc7.A09.getValue() != hl2) {
            gc7.A09.Epw(hl2);
        }
    }

    public static void A03(C52693Gb5 gb5, long j) {
        gb5.A01 = j;
        gb5.A0G.Epw(new C289295dM(j));
        gb5.A02 = 0;
    }

    public static final void A05(C52693Gb5 gb5, boolean z) {
        C52754Gc7 gc7 = gb5.A03;
        if (gc7 != null) {
            C51967G9n.A16(gc7.A0G, z);
        }
        if (z) {
            gb5.A0B();
        } else {
            gb5.A08();
        }
    }

    public final long A06(boolean z) {
        C56553I1h A002;
        C286025Tq r2;
        long j;
        int i;
        C52754Gc7 gc7 = this.A03;
        if (gc7 == null || (A002 = C52754Gc7.A00(gc7)) == null) {
            return 9205357640488583168L;
        }
        C3022462f r3 = A002.A02;
        C52754Gc7 gc72 = this.A03;
        if (gc72 == null || (r2 = gc72.A01.A02) == null) {
            return 9205357640488583168L;
        }
        if (!0qQ.A0K(r2.A00, r3.A04.A03.A00)) {
            return 9205357640488583168L;
        }
        C284945Oz r22 = this.A0K;
        long A0G2 = C51968G9o.A0G(r22);
        if (z) {
            j = A0G2 >> 32;
        } else {
            j = A0G2 & 4294967295L;
        }
        int E1S = this.A08.E1S((int) j);
        boolean A042 = C285965Tk.A04(C51968G9o.A0G(r22));
        C3022262d r7 = r3.A03;
        int A062 = r7.A06(E1S);
        if (A062 >= r7.A02) {
            return 9205357640488583168L;
        }
        boolean z2 = false;
        if (!z ? !A042 : A042) {
            i = Math.max(E1S - 1, 0);
        } else {
            i = E1S;
        }
        if (r3.A08(i) == r3.A09(E1S)) {
            z2 = true;
        }
        float A022 = r3.A02(E1S, z2);
        long j2 = r3.A02;
        return C289325dP.A00(C229632nm.A02(A022, 0.0f, (float) C51965G9l.A04(j2)), C229632nm.A02(r7.A03(A062), 0.0f, (float) C289005cr.A00(j2)));
    }

    public final void A07() {
        C284945Oz r5 = this.A0K;
        if (!C285965Tk.A03(C51968G9o.A0G(r5))) {
            AnonymousClass5TC r6 = this.A06;
            if (r6 != null) {
                C285975Tl A0i = C51966G9m.A0i(r5);
                C286025Tq r4 = A0i.A01;
                long j = A0i.A00;
                r6.Eny(r4.subSequence(C285965Tk.A01(j), C285965Tk.A00(j)));
            }
            A04(this, C56172Hu1.A01(C51966G9m.A0i(r5), C51973G9u.A05(r5)).A01(C56172Hu1.A00(C51966G9m.A0i(r5), C51973G9u.A05(r5))), C285965Tk.A01(C51968G9o.A0G(r5)));
            C55978Hqj hqj = this.A0L;
            if (hqj != null) {
                hqj.A04 = true;
            }
        }
    }

    public final void A08() {
        Integer num;
        AnonymousClass5VM r2 = this.A07;
        if (r2 != null) {
            num = ((AnonymousClass5VL) r2).A01;
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A00 && r2 != null) {
            AnonymousClass5VL r22 = (AnonymousClass5VL) r2;
            r22.A01 = AnonymousClass05K.A01;
            ActionMode actionMode = r22.A00;
            if (actionMode != null) {
                actionMode.finish();
            }
            r22.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0139, code lost:
        if (r1 != 1) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0163, code lost:
        if (r0 != 2) goto L_0x0165;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r47 = this;
            r13 = r47
            X.5TC r0 = r13.A06
            if (r0 == 0) goto L_0x006b
            X.5TB r0 = (X.AnonymousClass5TB) r0
            android.content.ClipboardManager r0 = r0.A00
            android.content.ClipData r1 = r0.getPrimaryClip()
            if (r1 == 0) goto L_0x006b
            int r0 = r1.getItemCount()
            if (r0 <= 0) goto L_0x006b
            r2 = 0
            android.content.ClipData$Item r0 = r1.getItemAt(r2)
            if (r0 == 0) goto L_0x006b
            java.lang.CharSequence r12 = r0.getText()
            if (r12 == 0) goto L_0x006b
            boolean r0 = r12 instanceof android.text.Spanned
            if (r0 != 0) goto L_0x006c
            java.lang.String r1 = r12.toString()
            X.0sn r0 = X.0sn.A00
            X.5Tq r3 = new X.5Tq
            r3.<init>(r0, r0, r1)
        L_0x0032:
            X.5Oz r4 = r13.A0K
            X.5Tl r1 = X.C51966G9m.A0i(r4)
            int r0 = X.C51973G9u.A05(r4)
            X.5Tq r0 = X.C56172Hu1.A01(r1, r0)
            X.5Tq r2 = r0.A01(r3)
            X.5Tl r1 = X.C51966G9m.A0i(r4)
            int r0 = X.C51973G9u.A05(r4)
            X.5Tq r0 = X.C56172Hu1.A00(r1, r0)
            X.5Tq r2 = r2.A01(r0)
            long r0 = X.C51968G9o.A0G(r4)
            int r1 = X.C285965Tk.A01(r0)
            int r0 = r3.length()
            int r1 = r1 + r0
            A04(r13, r2, r1)
            X.Hqj r1 = r13.A0L
            if (r1 == 0) goto L_0x006b
            r0 = 1
            r1.A04 = r0
        L_0x006b:
            return
        L_0x006c:
            r11 = r12
            android.text.Spanned r11 = (android.text.Spanned) r11
            int r1 = r12.length()
            java.lang.Class<android.text.Annotation> r0 = android.text.Annotation.class
            r8 = 0
            java.lang.Object[] r7 = r11.getSpans(r2, r1, r0)
            android.text.Annotation[] r7 = (android.text.Annotation[]) r7
            java.util.ArrayList r27 = X.AnonymousClass7TE.A1C()
            X.0qQ.A0B(r7, r2)
            int r0 = r7.length
            int r15 = r0 + -1
            if (r15 < 0) goto L_0x028f
        L_0x0088:
            r3 = r7[r8]
            java.lang.String r1 = r3.getKey()
            r0 = 1462(0x5b6, float:2.049E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0289
            int r26 = r11.getSpanStart(r3)
            int r25 = r11.getSpanEnd(r3)
            java.lang.String r0 = r3.getValue()
            android.os.Parcel r14 = android.os.Parcel.obtain()
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            r14.unmarshall(r1, r2, r0)
            r14.setDataPosition(r2)
            r30 = 0
            long r45 = X.AnonymousClass5RW.A08
            long r21 = X.AnonymousClass5Z5.A01
            r19 = r45
            r41 = r21
            r24 = r30
            r23 = r30
            r18 = r30
            r40 = r30
            r43 = r21
            r17 = r30
            r16 = r30
            r10 = r30
            r29 = r10
        L_0x00d1:
            int r0 = r14.dataAvail()
            r6 = 1
            if (r0 <= r6) goto L_0x0260
            byte r5 = r14.readByte()
            r4 = 8
            if (r5 != r6) goto L_0x00eb
            int r0 = r14.dataAvail()
            if (r0 < r4) goto L_0x0260
            long r19 = r14.readLong()
            goto L_0x00d1
        L_0x00eb:
            r3 = 2
            r1 = 5
            if (r5 != r3) goto L_0x0114
            int r0 = r14.dataAvail()
            if (r0 < r1) goto L_0x0260
            byte r0 = r14.readByte()
            if (r0 != r6) goto L_0x0109
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
        L_0x0100:
            float r3 = r14.readFloat()
            long r41 = X.AnonymousClass5Z7.A00(r3, r0)
            goto L_0x00d1
        L_0x0109:
            if (r0 != r3) goto L_0x0111
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0100
        L_0x0111:
            r41 = r21
            goto L_0x00d1
        L_0x0114:
            r9 = 3
            r0 = 4
            if (r5 != r9) goto L_0x012a
            int r1 = r14.dataAvail()
            if (r1 < r0) goto L_0x0260
            int r1 = r14.readInt()
            X.5ZD r24 = new X.5ZD
            r0 = r24
            r0.<init>(r1)
            goto L_0x00d1
        L_0x012a:
            if (r5 != r0) goto L_0x0144
            int r0 = r14.dataAvail()
            if (r0 < r6) goto L_0x0260
            byte r1 = r14.readByte()
            if (r1 == 0) goto L_0x013b
            r0 = 1
            if (r1 == r6) goto L_0x013c
        L_0x013b:
            r0 = 0
        L_0x013c:
            X.5hl r23 = new X.5hl
            r1 = r23
            r1.<init>(r0)
            goto L_0x00d1
        L_0x0144:
            if (r5 != r1) goto L_0x0167
            int r0 = r14.dataAvail()
            if (r0 < r6) goto L_0x0260
            byte r0 = r14.readByte()
            if (r0 == 0) goto L_0x0165
            if (r0 != r6) goto L_0x015e
            r1 = 1
        L_0x0155:
            X.5hm r18 = new X.5hm
            r0 = r18
            r0.<init>(r1)
            goto L_0x00d1
        L_0x015e:
            if (r0 != r9) goto L_0x0162
            r1 = 3
            goto L_0x0155
        L_0x0162:
            r1 = 2
            if (r0 == r3) goto L_0x0155
        L_0x0165:
            r1 = 0
            goto L_0x0155
        L_0x0167:
            r9 = 6
            if (r5 != r9) goto L_0x0170
            java.lang.String r40 = r14.readString()
            goto L_0x00d1
        L_0x0170:
            r9 = 7
            if (r5 != r9) goto L_0x019a
            int r0 = r14.dataAvail()
            if (r0 < r1) goto L_0x0260
            byte r0 = r14.readByte()
            if (r0 != r6) goto L_0x018e
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
        L_0x0184:
            float r3 = r14.readFloat()
            long r43 = X.AnonymousClass5Z7.A00(r3, r0)
            goto L_0x00d1
        L_0x018e:
            if (r0 != r3) goto L_0x0196
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0184
        L_0x0196:
            r43 = r21
            goto L_0x00d1
        L_0x019a:
            if (r5 != r4) goto L_0x01af
            int r1 = r14.dataAvail()
            if (r1 < r0) goto L_0x0260
            float r1 = r14.readFloat()
            X.5hn r17 = new X.5hn
            r0 = r17
            r0.<init>(r1)
            goto L_0x00d1
        L_0x01af:
            r1 = 9
            if (r5 != r1) goto L_0x01ca
            int r0 = r14.dataAvail()
            if (r0 < r4) goto L_0x0260
            float r3 = r14.readFloat()
            float r1 = r14.readFloat()
            X.5ho r16 = new X.5ho
            r0 = r16
            r0.<init>(r3, r1)
            goto L_0x00d1
        L_0x01ca:
            r1 = 10
            if (r5 != r1) goto L_0x01da
            int r0 = r14.dataAvail()
            if (r0 < r4) goto L_0x0260
            long r45 = r14.readLong()
            goto L_0x00d1
        L_0x01da:
            r1 = 11
            if (r5 != r1) goto L_0x0235
            int r1 = r14.dataAvail()
            if (r1 < r0) goto L_0x0260
            int r1 = r14.readInt()
            X.5ht r10 = X.C291795ht.A01
            r0 = r1 & 2
            boolean r3 = X.AnonymousClass7TF.A1P(r0)
            X.5ht r0 = X.C291795ht.A03
            r1 = r1 & 1
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            if (r3 == 0) goto L_0x022e
            if (r1 == 0) goto L_0x00d1
            X.5ht[] r0 = new X.C291795ht[]{r10, r0}
            java.util.List r4 = X.0sr.A1P(r0)
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            int r1 = r4.size()
        L_0x020d:
            if (r3 >= r1) goto L_0x0223
            java.lang.Object r0 = r4.get(r3)
            X.5ht r0 = (X.C291795ht) r0
            int r5 = r5.intValue()
            int r0 = r0.A00
            r5 = r5 | r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r3 = r3 + 1
            goto L_0x020d
        L_0x0223:
            int r0 = r5.intValue()
            X.5ht r10 = new X.5ht
            r10.<init>(r0)
            goto L_0x00d1
        L_0x022e:
            if (r1 != 0) goto L_0x0232
            X.5ht r0 = X.C291795ht.A02
        L_0x0232:
            r10 = r0
            goto L_0x00d1
        L_0x0235:
            r0 = 12
            if (r5 != r0) goto L_0x00d1
            int r1 = r14.dataAvail()
            r0 = 20
            if (r1 < r0) goto L_0x0260
            X.5hu r0 = X.C291805hu.A03
            long r33 = r14.readLong()
            float r1 = r14.readFloat()
            float r0 = r14.readFloat()
            long r35 = X.C289325dP.A00(r1, r0)
            float r32 = r14.readFloat()
            X.5hu r29 = new X.5hu
            r31 = r29
            r31.<init>(r32, r33, r35)
            goto L_0x00d1
        L_0x0260:
            X.5ZA r38 = X.AnonymousClass5Z8.A00(r19)
            X.5ZB r0 = new X.5ZB
            r28 = r0
            r31 = r30
            r32 = r23
            r33 = r18
            r34 = r24
            r35 = r30
            r36 = r17
            r37 = r10
            r39 = r16
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45)
            X.62b r4 = new X.62b
            r3 = r26
            r1 = r25
            r4.<init>(r0, r3, r1)
            r0 = r27
            r0.add(r4)
        L_0x0289:
            if (r8 == r15) goto L_0x028f
            int r8 = r8 + 1
            goto L_0x0088
        L_0x028f:
            java.lang.String r2 = r12.toString()
            X.0sn r1 = X.0sn.A00
            X.5Tq r3 = new X.5Tq
            r0 = r27
            r3.<init>(r0, r1, r2)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52693Gb5.A09():void");
    }

    public final void A0A() {
        C284945Oz r1 = this.A0K;
        C285975Tl r12 = new C285975Tl(C51966G9m.A0i(r1).A01, (C285965Tk) null, C3026964x.A00(0, C51973G9u.A05(r1)));
        this.A0C.invoke(r12);
        C285975Tl r0 = this.A09;
        this.A09 = new C285975Tl(r0.A01, r0.A02, r12.A00);
        A0E(true);
    }

    public final void A0B() {
        C58682Ivr ivr;
        C58682Ivr ivr2;
        C58682Ivr ivr3;
        AnonymousClass5VN r0;
        long j;
        long j2;
        float f;
        C268064ch A022;
        float f2;
        C268064ch A023;
        float f3;
        C268064ch A024;
        C268064ch A025;
        AnonymousClass5TC r02;
        ClipDescription primaryClipDescription;
        if (C51971G9r.A1W(this.A0J)) {
            C52754Gc7 gc7 = this.A03;
            if (gc7 == null || C51971G9r.A1W(gc7.A0B)) {
                C284945Oz r10 = this.A0K;
                C58682Ivr ivr4 = null;
                if (!C285965Tk.A03(C51968G9o.A0G(r10))) {
                    ivr = new C58682Ivr(this, 43);
                } else {
                    ivr = null;
                }
                if (C285965Tk.A03(C51968G9o.A0G(r10)) || !C51971G9r.A1W(this.A0I)) {
                    ivr2 = null;
                } else {
                    ivr2 = new C58682Ivr(this, 44);
                }
                if (!C51971G9r.A1W(this.A0I) || (r02 = this.A06) == null || (primaryClipDescription = ((AnonymousClass5TB) r02).A00.getPrimaryClipDescription()) == null || !primaryClipDescription.hasMimeType("text/*")) {
                    ivr3 = null;
                } else {
                    ivr3 = new C58682Ivr(this, 45);
                }
                long A0G2 = C51968G9o.A0G(r10);
                if (C285965Tk.A00(A0G2) - C285965Tk.A01(A0G2) != C51973G9u.A05(r10)) {
                    ivr4 = new C58682Ivr(this, 46);
                }
                AnonymousClass5VM r3 = this.A07;
                if (r3 != null) {
                    C52754Gc7 gc72 = this.A03;
                    if (gc72 == null || !(!gc72.A06)) {
                        r0 = AnonymousClass5VN.A04;
                    } else {
                        int E1S = this.A08.E1S(C51965G9l.A04(C51968G9o.A0G(r10)));
                        int E1S2 = this.A08.E1S(C51968G9o.A02(C51968G9o.A0G(r10)));
                        C52754Gc7 gc73 = this.A03;
                        if (gc73 == null || (A025 = gc73.A02()) == null) {
                            j = 0;
                        } else {
                            j = A025.CgY(A06(true));
                        }
                        C52754Gc7 gc74 = this.A03;
                        if (gc74 == null || (A024 = gc74.A02()) == null) {
                            j2 = 0;
                        } else {
                            j2 = A024.CgY(A06(false));
                        }
                        C52754Gc7 gc75 = this.A03;
                        float f4 = 0.0f;
                        if (gc75 == null || (A023 = gc75.A02()) == null) {
                            f = 0.0f;
                        } else {
                            C56553I1h A002 = C52754Gc7.A00(gc72);
                            if (A002 != null) {
                                f3 = A002.A02.A06(E1S).A03;
                            } else {
                                f3 = 0.0f;
                            }
                            f = C289295dM.A02(A023.CgY(C289325dP.A00(0.0f, f3)));
                        }
                        C52754Gc7 gc76 = this.A03;
                        if (!(gc76 == null || (A022 = gc76.A02()) == null)) {
                            C56553I1h A003 = C52754Gc7.A00(gc72);
                            if (A003 != null) {
                                f2 = A003.A02.A06(E1S2).A03;
                            } else {
                                f2 = 0.0f;
                            }
                            f4 = C289295dM.A02(A022.CgY(C289325dP.A00(0.0f, f2)));
                        }
                        float A012 = C289295dM.A01(j);
                        float A013 = C289295dM.A01(j2);
                        r0 = new AnonymousClass5VN(Math.min(A012, A013), Math.min(f, f4), Math.max(A012, A013), Math.max(C289295dM.A02(j), C289295dM.A02(j2)) + (25.0f * gc72.A01.A05.AwL()));
                    }
                    AnonymousClass5VL r32 = (AnonymousClass5VL) r3;
                    AnonymousClass5VO r2 = r32.A03;
                    r2.A00 = r0;
                    r2.A01 = ivr;
                    r2.A02 = ivr2;
                    r2.A03 = ivr3;
                    r2.A04 = ivr4;
                    ActionMode actionMode = r32.A00;
                    if (actionMode == null) {
                        r32.A01 = AnonymousClass05K.A00;
                        r32.A00 = r32.A02.startActionMode(new C52832GdO(r2), 1);
                        return;
                    }
                    actionMode.invalidate();
                }
            }
        }
    }

    public final void A0C(C289295dM r7) {
        HL2 hl2;
        C56553I1h i1h;
        int A002;
        C284945Oz r5 = this.A0K;
        if (!C285965Tk.A03(C51968G9o.A0G(r5))) {
            C52754Gc7 gc7 = this.A03;
            if (gc7 != null) {
                i1h = C52754Gc7.A00(gc7);
            } else {
                i1h = null;
            }
            if (r7 == null || i1h == null) {
                A002 = C285965Tk.A00(C51968G9o.A0G(r5));
            } else {
                A002 = this.A08.FHr(i1h.A01(r7.A00, true));
            }
            C285975Tl A0i = C51966G9m.A0i(r5);
            this.A0C.invoke(new C285975Tl(A0i.A01, A0i.A02, C3026964x.A00(A002, A002)));
        }
        if (r7 == null || C51973G9u.A05(r5) <= 0) {
            hl2 = HL2.None;
        } else {
            hl2 = HL2.Cursor;
        }
        A01(hl2, this);
        A05(this, false);
    }

    public final void A0D(boolean z) {
        C284945Oz r6 = this.A0K;
        if (!C285965Tk.A03(C51968G9o.A0G(r6))) {
            AnonymousClass5TC r5 = this.A06;
            if (r5 != null) {
                C285975Tl A0i = C51966G9m.A0i(r6);
                C286025Tq r4 = A0i.A01;
                long j = A0i.A00;
                r5.Eny(r4.subSequence(C285965Tk.A01(j), C285965Tk.A00(j)));
            }
            if (z) {
                A04(this, C51966G9m.A0i(r6).A01, C285965Tk.A00(C51968G9o.A0G(r6)));
            }
        }
    }

    public final void A0E(boolean z) {
        C56547I1b i1b;
        C52754Gc7 gc7 = this.A03;
        if (!(gc7 == null || C51971G9r.A1W(gc7.A0A) || (i1b = this.A04) == null)) {
            i1b.A01();
        }
        this.A09 = C51966G9m.A0i(this.A0K);
        A05(this, z);
        A01(HL2.Selection, this);
    }

    public C52693Gb5(C55978Hqj hqj) {
        this.A0L = hqj;
        this.A08 = I5K.A00;
        this.A0C = C58897IzM.A00;
        long j = C285965Tk.A01;
        this.A0K = C51970G9q.A0S(new C285975Tl("", j));
        this.A0A = C56477Hz9.A00;
        Boolean A0v = AnonymousClass7TE.A0v();
        this.A0I = C51969G9p.A0S(A0v);
        this.A0J = C51969G9p.A0S(A0v);
        this.A01 = 0;
        this.A02 = 0;
        this.A0H = C51969G9p.A0S((Object) null);
        this.A0G = C51969G9p.A0S((Object) null);
        this.A00 = -1;
        this.A09 = new C285975Tl("", j);
        this.A0E = new IFX(this);
        this.A0F = new C56857IFe(this);
    }

    public static void A04(C52693Gb5 gb5, C286025Tq r5, int i) {
        gb5.A0C.invoke(new C285975Tl(r5, (C285965Tk) null, C3026964x.A00(i, i)));
        A01(HL2.None, gb5);
    }

    public C52693Gb5() {
        this((C55978Hqj) null);
    }
}
