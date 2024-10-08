package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Bd  reason: invalid class name and case insensitive filesystem */
public final class C303876Bd implements Appendable {
    public final StringBuilder A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public C303876Bd(int i) {
        this.A00 = new StringBuilder(16);
        this.A04 = new ArrayList();
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
        this.A03 = new ArrayList();
    }

    public final int A00(AnonymousClass5ZB r5) {
        C303916Bh r2 = new C303916Bh(r5, "", this.A00.length(), AnonymousClass972.MUTABLE_FLAG_MASK);
        List list = this.A03;
        list.add(r2);
        this.A04.add(r2);
        return list.size() - 1;
    }

    public final int A01(String str, String str2) {
        C303916Bh r2 = new C303916Bh(str2, str, this.A00.length(), AnonymousClass972.MUTABLE_FLAG_MASK);
        List list = this.A03;
        list.add(r2);
        this.A01.add(r2);
        return list.size() - 1;
    }

    public final C286025Tq A02() {
        StringBuilder sb = this.A00;
        String obj = sb.toString();
        List list = this.A04;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C303916Bh) list.get(i)).A00(sb.length()));
        }
        ArrayList arrayList2 = null;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        List list2 = this.A02;
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList3.add(((C303916Bh) list2.get(i2)).A00(sb.length()));
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        List list3 = this.A01;
        ArrayList arrayList4 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList4.add(((C303916Bh) list3.get(i3)).A00(sb.length()));
        }
        if (!arrayList4.isEmpty()) {
            arrayList2 = arrayList4;
        }
        return new C286025Tq(obj, arrayList, arrayList3, arrayList2);
    }

    public final void A03() {
        List list = this.A03;
        if (!list.isEmpty()) {
            ((C303916Bh) list.remove(list.size() - 1)).A00 = this.A00.length();
            return;
        }
        throw new IllegalStateException("Nothing to pop.");
    }

    public final void A04(int i) {
        List list = this.A03;
        if (i >= list.size()) {
            throw new IllegalStateException(002.A0P(" should be less than ", i, list.size()));
        }
        while (list.size() - 1 >= i) {
            A03();
        }
    }

    public final void A05(C286025Tq r12) {
        StringBuilder sb = this.A00;
        int length = sb.length();
        sb.append(r12.A00);
        List list = r12.A03;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C3022062b r0 = (C3022062b) list.get(i);
                A06((AnonymousClass5ZB) r0.A02, r0.A01 + length, r0.A00 + length);
            }
        }
        List list2 = r12.A02;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C3022062b r02 = (C3022062b) list2.get(i2);
                this.A02.add(new C303916Bh(r02.A02, "", r02.A01 + length, r02.A00 + length));
            }
        }
        List list3 = r12.A01;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C3022062b r03 = (C3022062b) list3.get(i3);
                this.A01.add(new C303916Bh(r03.A02, r03.A03, r03.A01 + length, r03.A00 + length));
            }
        }
    }

    public final void A06(AnonymousClass5ZB r4, int i, int i2) {
        this.A04.add(new C303916Bh(r4, "", i, i2));
    }

    public final void A07(CharSequence charSequence) {
        if (charSequence instanceof C286025Tq) {
            A05((C286025Tq) charSequence);
        } else {
            this.A00.append(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r15 >= r7.length()) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cb, code lost:
        if (r15 >= r7.length()) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.lang.CharSequence r13, int r14, int r15) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C286025Tq
            if (r0 == 0) goto L_0x014a
            X.5Tq r13 = (X.C286025Tq) r13
            java.lang.StringBuilder r0 = r12.A00
            int r11 = r0.length()
            java.lang.String r7 = r13.A00
            r0.append(r7, r14, r15)
            java.util.List r5 = X.C3021962a.A00(r13, r14, r15)
            r8 = 0
            if (r5 == 0) goto L_0x0035
            int r4 = r5.size()
            r3 = 0
        L_0x001d:
            if (r3 >= r4) goto L_0x0035
            java.lang.Object r0 = r5.get(r3)
            X.62b r0 = (X.C3022062b) r0
            java.lang.Object r2 = r0.A02
            X.5ZB r2 = (X.AnonymousClass5ZB) r2
            int r1 = r0.A01
            int r1 = r1 + r11
            int r0 = r0.A00
            int r0 = r0 + r11
            r12.A06(r2, r1, r0)
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0035:
            if (r14 == r15) goto L_0x00bf
            java.util.List r9 = r13.A02
            if (r9 == 0) goto L_0x00bf
            if (r14 != 0) goto L_0x0067
            int r0 = r7.length()
            if (r15 < r0) goto L_0x0067
        L_0x0043:
            int r10 = r9.size()
            r6 = 0
        L_0x0048:
            if (r6 >= r10) goto L_0x00bf
            java.lang.Object r0 = r9.get(r6)
            X.62b r0 = (X.C3022062b) r0
            java.lang.Object r5 = r0.A02
            int r4 = r0.A01
            int r4 = r4 + r11
            int r3 = r0.A00
            int r3 = r3 + r11
            java.util.List r2 = r12.A02
            java.lang.String r1 = ""
            X.6Bh r0 = new X.6Bh
            r0.<init>(r5, r1, r4, r3)
            r2.add(r0)
            int r6 = r6 + 1
            goto L_0x0048
        L_0x0067:
            int r0 = r9.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            int r4 = r9.size()
            r5 = 0
            r3 = 0
        L_0x0076:
            if (r3 >= r4) goto L_0x008f
            java.lang.Object r2 = r9.get(r3)
            r0 = r2
            X.62b r0 = (X.C3022062b) r0
            int r1 = r0.A01
            int r0 = r0.A00
            boolean r0 = X.C3021962a.A02(r14, r15, r1, r0)
            if (r0 == 0) goto L_0x008c
            r6.add(r2)
        L_0x008c:
            int r3 = r3 + 1
            goto L_0x0076
        L_0x008f:
            int r0 = r6.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            int r4 = r6.size()
        L_0x009c:
            if (r5 >= r4) goto L_0x0043
            java.lang.Object r1 = r6.get(r5)
            X.62b r1 = (X.C3022062b) r1
            java.lang.Object r3 = r1.A02
            int r0 = r1.A01
            int r2 = X.C229632nm.A03(r0, r14, r15)
            int r2 = r2 - r14
            int r0 = r1.A00
            int r1 = X.C229632nm.A03(r0, r14, r15)
            int r1 = r1 - r14
            X.62b r0 = new X.62b
            r0.<init>(r3, r2, r1)
            r9.add(r0)
            int r5 = r5 + 1
            goto L_0x009c
        L_0x00bf:
            if (r14 == r15) goto L_0x014f
            java.util.List r9 = r13.A01
            if (r9 == 0) goto L_0x014f
            if (r14 != 0) goto L_0x00f0
            int r0 = r7.length()
            if (r15 < r0) goto L_0x00f0
        L_0x00cd:
            int r6 = r9.size()
        L_0x00d1:
            if (r8 >= r6) goto L_0x014f
            java.lang.Object r0 = r9.get(r8)
            X.62b r0 = (X.C3022062b) r0
            java.util.List r5 = r12.A01
            java.lang.Object r4 = r0.A02
            int r3 = r0.A01
            int r3 = r3 + r11
            int r2 = r0.A00
            int r2 = r2 + r11
            java.lang.String r1 = r0.A03
            X.6Bh r0 = new X.6Bh
            r0.<init>(r4, r1, r3, r2)
            r5.add(r0)
            int r8 = r8 + 1
            goto L_0x00d1
        L_0x00f0:
            int r0 = r9.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            int r4 = r9.size()
            r6 = 0
            r3 = 0
        L_0x00ff:
            if (r3 >= r4) goto L_0x0118
            java.lang.Object r2 = r9.get(r3)
            r0 = r2
            X.62b r0 = (X.C3022062b) r0
            int r1 = r0.A01
            int r0 = r0.A00
            boolean r0 = X.C3021962a.A02(r14, r15, r1, r0)
            if (r0 == 0) goto L_0x0115
            r7.add(r2)
        L_0x0115:
            int r3 = r3 + 1
            goto L_0x00ff
        L_0x0118:
            int r0 = r7.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            int r5 = r7.size()
        L_0x0125:
            if (r6 >= r5) goto L_0x00cd
            java.lang.Object r1 = r7.get(r6)
            X.62b r1 = (X.C3022062b) r1
            java.lang.String r4 = r1.A03
            java.lang.Object r3 = r1.A02
            int r0 = r1.A01
            int r2 = X.C229632nm.A03(r0, r14, r15)
            int r2 = r2 - r14
            int r0 = r1.A00
            int r1 = X.C229632nm.A03(r0, r14, r15)
            int r1 = r1 - r14
            X.62b r0 = new X.62b
            r0.<init>(r3, r4, r2, r1)
            r9.add(r0)
            int r6 = r6 + 1
            goto L_0x0125
        L_0x014a:
            java.lang.StringBuilder r0 = r12.A00
            r0.append(r13, r14, r15)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C303876Bd.A08(java.lang.CharSequence, int, int):void");
    }

    public final void A09(String str) {
        this.A00.append(str);
    }

    public final void A0A(String str, String str2, int i, int i2) {
        this.A01.add(new C303916Bh(str2, str, i, i2));
    }

    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        this.A00.append(c);
        return this;
    }

    public C303876Bd() {
        this(16);
    }

    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        A08(charSequence, i, i2);
        return this;
    }

    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        A07(charSequence);
        return this;
    }
}
