package X;

/* renamed from: X.UVl  reason: case insensitive filesystem */
public final class C15208UVl extends C15209UVm {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C19105WLm A05;
    public C19105WLm A06;
    public C19105WLm A07;
    public C15218UVv A08;
    public C15218UVv A09;
    public UW3 A0A;
    public UVO A0B;
    public C17187VLr A0C;
    public C18474VsQ A0D;
    public VV1 A0E;
    public C18567VuJ A0F;
    public WM2 A0G;
    public WM2 A0H;
    public String A0I;
    public String A0J;
    public final WLN A0K = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.WLj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.WLj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.WLm} */
    /* JADX WARNING: type inference failed for: r0v60, types: [X.X2w, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r10 = this;
            int r0 = r10.A00
            r2 = 2
            if (r0 == 0) goto L_0x019d
            r5 = 1
            if (r0 == r5) goto L_0x019d
            r1 = 4
            if (r0 == r2) goto L_0x0173
            r2 = 32
            r4 = 0
            if (r0 == r1) goto L_0x00b6
            r1 = 82
            r3 = 35
            if (r0 == r3) goto L_0x0033
            if (r0 == r1) goto L_0x016f
            r1 = 33
            if (r0 == r2) goto L_0x002d
            if (r0 != r1) goto L_0x002c
            java.lang.Object r0 = r10.A01
            X.WM2 r0 = (X.WM2) r0
            r10.A0H = r0
            X.WLS r0 = new X.WLS
            r0.<init>()
            X.WL4.A00(r10, r0, r3)
        L_0x002c:
            return
        L_0x002d:
            X.WLm r0 = r10.A07
            r10.A05(r1, r0)
            return
        L_0x0033:
            java.lang.Object r0 = r10.A01
            X.VuJ r0 = (X.C18567VuJ) r0
            r10.A0F = r0
            r10.A03 = r4
            r10.A00 = r4
            X.WLm r2 = new X.WLm
            r2.<init>()
            r10.A05 = r2
            r10.A01 = r4
            r0 = 0
        L_0x0047:
            X.WM2 r4 = r10.A0H
            java.util.ArrayList r3 = r4.A00
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0181
            java.util.ArrayList r2 = r4.A00
            java.lang.Object r2 = r2.get(r0)
            X.UW3 r2 = (X.UW3) r2
            r10.A0A = r2
            X.UVD r0 = r2.A00
            X.UVv r0 = (X.C15218UVv) r0
            r10.A08 = r0
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x00af
            int r0 = r10.A03
            int r0 = r0 + 1
            r10.A03 = r0
        L_0x006b:
            java.lang.String r2 = r2.A02
            if (r2 == 0) goto L_0x0087
            java.lang.String r0 = "for (;;);"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x007c
            r0 = 9
            r2.substring(r0)
        L_0x007c:
            com.facebook.zero.sdk.staticdeps.json.JsonProvider.get()     // Catch:{ IOException -> 0x0087 }
            java.lang.String r2 = "parseStrict"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ IOException -> 0x0087 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0087 }
            throw r0     // Catch:{ IOException -> 0x0087 }
        L_0x0087:
            X.UW3 r2 = r10.A0A
            java.lang.String r6 = r2.A01
            if (r6 != 0) goto L_0x008e
            r6 = 0
        L_0x008e:
            X.UVv r0 = r10.A08
            X.VV1 r0 = r0.A01
            java.lang.String r4 = r0.A01
            int r7 = r2.A00
            boolean r8 = r2.A03
            X.WLm r2 = r10.A05
            X.UVZ r3 = new X.UVZ
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            X.WLi r0 = new X.WLi
            r0.<init>(r3)
            r2.A00(r0)
            int r0 = r10.A01
            int r0 = r0 + 1
            r10.A01 = r0
            goto L_0x0047
        L_0x00af:
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            goto L_0x006b
        L_0x00b6:
            java.lang.Object r1 = r10.A01
            X.VsQ r1 = (X.C18474VsQ) r1
            r10.A0D = r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x016f
            X.VLr r3 = r1.A00
            r10.A0C = r3
            if (r3 == 0) goto L_0x016f
            r10.A02 = r4
            X.UVO r0 = r10.A0B
            long r0 = r0.A00
            r10.A04 = r0
            X.WLm r0 = new X.WLm
            r0.<init>()
            r10.A06 = r0
            X.WLm r0 = new X.WLm
            r0.<init>()
            r10.A07 = r0
            X.WM2 r1 = r3.A00
            X.WM2 r0 = new X.WM2
            r0.<init>(r1)
            r10.A0G = r0
            java.lang.String r0 = com.facebook.zero.sdk.staticdeps.uuid.UUIDGenerator.uuid()
            r10.A0I = r0
            r10.A01 = r4
            r0 = 0
        L_0x00ee:
            X.WM2 r3 = r10.A0G
            java.util.ArrayList r1 = r3.A00
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x01a5
            java.util.ArrayList r1 = r3.A00
            java.lang.Object r0 = r1.get(r0)
            X.VV1 r0 = (X.VV1) r0
            r10.A0E = r0
            java.lang.String r0 = com.facebook.zero.sdk.staticdeps.uuid.UUIDGenerator.uuid()
            r10.A0J = r0
            X.VV1 r4 = r10.A0E
            X.VsQ r3 = r10.A0D
            long r5 = r10.A04
            X.UVO r0 = r10.A0B
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0144
            X.Vk4 r0 = r3.A01
            java.util.HashMap r0 = r0.A00
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            java.lang.String r0 = r4.A01
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0144
            long r0 = r0.longValue()
            long r5 = r5 - r0
            long r3 = r4.A00
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0144
            int r0 = r10.A02
            int r0 = r0 + 1
            r10.A02 = r0
        L_0x013d:
            int r0 = r10.A01
            int r0 = r0 + 1
            r10.A01 = r0
            goto L_0x00ee
        L_0x0144:
            X.VV1 r5 = r10.A0E
            long r8 = r10.A04
            java.lang.String r6 = r10.A0I
            java.lang.String r7 = r10.A0J
            X.UVv r4 = new X.UVv
            r4.<init>(r5, r6, r7, r8)
            r10.A09 = r4
            X.WLm r1 = r10.A06
            X.WLi r0 = new X.WLi
            r0.<init>(r4)
            r1.A00(r0)
            X.WLm r3 = r10.A07
            java.lang.Class<X.UW3> r0 = X.UW3.class
            X.WLv r1 = new X.WLv
            r1.<init>(r10, r4, r0)
            X.WLn r0 = new X.WLn
            r0.<init>((X.C20893X2z) r1)
            r3.A00(r0)
            goto L_0x013d
        L_0x016f:
            r10.A04(r5)
            return
        L_0x0173:
            java.lang.Object r0 = r10.A01
            X.UVO r0 = (X.UVO) r0
            r10.A0B = r0
            X.WLN r0 = r10.A0K
            X.WLj r2 = new X.WLj
            r2.<init>(r0)
            goto L_0x0199
        L_0x0181:
            int r6 = r10.A00
            int r7 = r10.A03
            int r8 = r10.A02
            int r5 = r7 + r6
            int r5 = r5 + r8
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            X.UVY r3 = new X.UVY
            r3.<init>(r4, r5, r6, r7, r8)
            X.WLi r0 = new X.WLi
            r0.<init>(r3)
            r2.A00(r0)
        L_0x0199:
            r10.A05(r1, r2)
            return
        L_0x019d:
            java.lang.Class<X.UVO> r1 = X.UVO.class
            X.WLn r0 = new X.WLn
            r0.<init>((java.lang.Class) r1)
            goto L_0x01a7
        L_0x01a5:
            X.WLm r0 = r10.A06
        L_0x01a7:
            r10.A05(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15208UVl.A03():void");
    }
}
