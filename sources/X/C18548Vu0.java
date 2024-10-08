package X;

/* renamed from: X.Vu0  reason: case insensitive filesystem */
public final class C18548Vu0 {
    public static final byte[] A01;
    public static final byte[] A02 = {73, 73, 42, 0};
    public static final byte[] A03 = {77, 77, 0, 42};
    public static final byte[] A04 = C18095VlP.A01("GIF87a");
    public static final byte[] A05 = C18095VlP.A01("GIF89a");
    public static final byte[] A06 = C18095VlP.A01("ftyp");
    public static final byte[] A07 = {0, 0, 1, 0};
    public static final byte[] A08 = {-1, -40, -1};
    public static final byte[] A09 = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[][] A0A = {C18095VlP.A01("heic"), C18095VlP.A01("heix"), C18095VlP.A01("hevc"), C18095VlP.A01("hevx"), C18095VlP.A01("mif1"), C18095VlP.A01("msf1")};
    public static final int A0B;
    public final int A00;

    static {
        byte[] A012 = C18095VlP.A01("BM");
        A01 = A012;
        A0B = A012.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0077, code lost:
        if (r8 < 6) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00e2, code lost:
        if (X.C18095VlP.A00(r7, r0, 0) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C18637VvZ A00(byte[] r7, int r8) {
        /*
            r6 = this;
            r5 = 0
            r2 = 20
            if (r8 < r2) goto L_0x0059
            byte[] r0 = X.C18723Vyx.A02
            boolean r0 = X.C18723Vyx.A00(r7, r0, r5)
            if (r0 == 0) goto L_0x0059
            r1 = 8
            byte[] r0 = X.C18723Vyx.A01
            boolean r0 = X.C18723Vyx.A00(r7, r0, r1)
            if (r0 == 0) goto L_0x0059
            r1 = 12
            byte[] r0 = X.C18723Vyx.A05
            boolean r0 = X.C18723Vyx.A00(r7, r0, r1)
            if (r0 == 0) goto L_0x0024
            X.VvZ r0 = X.C17167VKw.A0B
            return r0
        L_0x0024:
            byte[] r0 = X.C18723Vyx.A03
            boolean r0 = X.C18723Vyx.A00(r7, r0, r1)
            if (r0 == 0) goto L_0x002f
            X.VvZ r0 = X.C17167VKw.A0A
            return r0
        L_0x002f:
            r0 = 21
            if (r8 < r0) goto L_0x00e7
            byte[] r0 = X.C18723Vyx.A04
            boolean r0 = X.C18723Vyx.A00(r7, r0, r1)
            if (r0 == 0) goto L_0x00e7
            byte r2 = r7[r2]
            r1 = 2
            r0 = r2 & 2
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r1)
            if (r0 == 0) goto L_0x0049
            X.VvZ r0 = X.C17167VKw.A07
            return r0
        L_0x0049:
            r1 = 16
            r0 = r2 & 16
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r1)
            if (r0 == 0) goto L_0x0056
            X.VvZ r0 = X.C17167VKw.A09
            return r0
        L_0x0056:
            X.VvZ r0 = X.C17167VKw.A08
            return r0
        L_0x0059:
            byte[] r0 = A08
            r2 = 3
            if (r8 < r2) goto L_0x0067
            boolean r0 = X.C18095VlP.A00(r7, r0, r5)
            if (r0 == 0) goto L_0x0067
            X.VvZ r0 = X.C17167VKw.A05
            return r0
        L_0x0067:
            byte[] r0 = A09
            r4 = 8
            if (r8 < r4) goto L_0x0076
            boolean r0 = X.C18095VlP.A00(r7, r0, r5)
            if (r0 == 0) goto L_0x0087
            X.VvZ r0 = X.C17167VKw.A06
            return r0
        L_0x0076:
            r0 = 6
            if (r8 >= r0) goto L_0x0087
        L_0x0079:
            byte[] r1 = A01
            int r0 = r1.length
            if (r8 < r0) goto L_0x009a
            boolean r0 = X.C18095VlP.A00(r7, r1, r5)
            if (r0 == 0) goto L_0x009a
            X.VvZ r0 = X.C17167VKw.A00
            return r0
        L_0x0087:
            byte[] r0 = A04
            boolean r0 = X.C18095VlP.A00(r7, r0, r5)
            if (r0 != 0) goto L_0x0097
            byte[] r0 = A05
            boolean r0 = X.C18095VlP.A00(r7, r0, r5)
            if (r0 == 0) goto L_0x0079
        L_0x0097:
            X.VvZ r0 = X.C17167VKw.A02
            return r0
        L_0x009a:
            byte[] r1 = A07
            r0 = 4
            if (r8 < r0) goto L_0x00e7
            boolean r0 = X.C18095VlP.A00(r7, r1, r5)
            if (r0 == 0) goto L_0x00a8
            X.VvZ r0 = X.C17167VKw.A04
            return r0
        L_0x00a8:
            r0 = 12
            if (r8 < r0) goto L_0x00cd
            byte r0 = r7[r2]
            if (r0 < r4) goto L_0x00cd
            byte[] r1 = A06
            r0 = 4
            boolean r0 = X.C18095VlP.A00(r7, r1, r0)
            if (r0 == 0) goto L_0x00cd
            byte[][] r3 = A0A
            r2 = 6
            r1 = 0
        L_0x00bd:
            r0 = r3[r1]
            boolean r0 = X.C18095VlP.A00(r7, r0, r4)
            if (r0 == 0) goto L_0x00c8
            X.VvZ r0 = X.C17167VKw.A03
            return r0
        L_0x00c8:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x00cd
            goto L_0x00bd
        L_0x00cd:
            byte[] r0 = A02
            r1 = 1
            X.0qQ.A0B(r0, r1)
            boolean r0 = X.C18095VlP.A00(r7, r0, r5)
            if (r0 != 0) goto L_0x00e4
            byte[] r0 = A03
            X.0qQ.A0B(r0, r1)
            boolean r0 = X.C18095VlP.A00(r7, r0, r5)
            if (r0 == 0) goto L_0x00e7
        L_0x00e4:
            X.VvZ r0 = X.C17167VKw.A01
            return r0
        L_0x00e7:
            X.VvZ r0 = X.C18637VvZ.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18548Vu0.A00(byte[], int):X.VvZ");
    }

    public C18548Vu0() {
        Integer[] numArr = {21, 20, 3, 8, 6, Integer.valueOf(A0B), 4, 12};
        int i = 1;
        Integer num = numArr[0];
        while (true) {
            Integer num2 = numArr[i];
            num = num.compareTo(num2) < 0 ? num2 : num;
            if (i == 7) {
                break;
            }
            i++;
        }
        if (num != null) {
            this.A00 = num.intValue();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
