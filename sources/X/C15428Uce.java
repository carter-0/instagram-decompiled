package X;

import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.Uce  reason: case insensitive filesystem */
public final class C15428Uce extends C18477VsT {
    public C17201VMf A00;
    public Product A01;
    public List A02;
    public final C17332VRl A03 = new C17332VRl();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15428Uce(X.C17732Vd1 r28) {
        /*
            r27 = this;
            r3 = r28
            X.Uz4 r6 = r3.A08
            java.lang.String r4 = r3.A0A
            X.VbM r2 = r3.A04
            java.util.List r0 = r3.A0G
            X.VsU r1 = new X.VsU
            r1.<init>(r2, r0)
            int r0 = r3.A00
            r5 = r27
            r5.<init>(r1, r6, r4, r0)
            X.VRl r0 = new X.VRl
            r0.<init>()
            r5.A03 = r0
            java.util.List r0 = r3.A0F
            X.0qQ.A07(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0026:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r4 = r6.next()
            X.VbL r4 = (X.C17629VbL) r4
            X.Uz4 r1 = r4.A03
            X.Uz4 r0 = X.C16668Uz4.RICH_TEXT
            if (r0 != r1) goto L_0x004c
            X.VRl r2 = r5.A03
            int r1 = r3.A00
            X.Uch r0 = new X.Uch
            r0.<init>(r4, r1)
            X.Ucn r1 = new X.Ucn
            r1.<init>(r0)
            java.util.List r0 = r2.A00
            r0.add(r1)
            goto L_0x0026
        L_0x004c:
            X.Uz4 r0 = X.C16668Uz4.PHOTO
            if (r0 != r1) goto L_0x0026
            X.VRl r2 = r5.A03
            int r1 = r3.A00
            X.Uci r0 = new X.Uci
            r0.<init>(r4, r1)
            X.Ucj r1 = new X.Ucj
            r1.<init>(r0)
            java.util.List r0 = r2.A00
            r0.add(r1)
            java.util.List r0 = r4.A05
            java.util.ArrayList r0 = X.C18679Vwc.A02(r0)
            r5.A02 = r0
            java.lang.String r1 = r4.A04
            X.VMf r0 = new X.VMf
            r0.<init>(r1)
            r5.A00 = r0
            r5.A01 = r1
            goto L_0x0026
        L_0x0077:
            X.VZY r7 = r3.A03
            if (r7 == 0) goto L_0x00fc
            X.VVm r0 = r7.A01
            if (r0 == 0) goto L_0x00fc
            X.VNR r0 = r7.A00
            if (r0 == 0) goto L_0x00fc
            r11 = 0
            java.lang.String r6 = r7.A02
            java.lang.String r4 = r7.A03
            java.lang.String r1 = "Required value was null."
            com.instagram.model.mediasize.ImageInfoImpl r12 = new com.instagram.model.mediasize.ImageInfoImpl
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            java.util.List r0 = r0.A00
            java.util.ArrayList r10 = X.DbV.A15(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x00a0:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r9.next()
            X.VVl r0 = (X.C17432VVl) r0
            java.lang.String r8 = r0.A02
            if (r8 == 0) goto L_0x00a0
            int r3 = r0.A01
            int r2 = r0.A00
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r8, r3, r2)
            r10.add(r0)
            goto L_0x00a0
        L_0x00bd:
            com.instagram.model.mediasize.ImageInfo r0 = X.1iI.A06(r12, r10)
            com.instagram.model.mediasize.ImageInfoImpl r0 = r0.FEa()
            com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl r13 = new com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl
            r13.<init>(r0, r11)
            X.VVm r3 = r7.A01
            if (r3 == 0) goto L_0x0103
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.String r2 = r3.A00
            if (r2 == 0) goto L_0x00fd
            java.lang.String r0 = r3.A01
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
            java.lang.String r0 = r3.A02
            com.instagram.user.model.User r14 = X.1aC.A03(r1, r2, r0)
            java.lang.String r0 = r7.A04
            r12 = r11
            r18 = r11
            r19 = r11
            r20 = r6
            r21 = r6
            r22 = r11
            r23 = r11
            r24 = r4
            r25 = r11
            r26 = r0
            com.instagram.user.model.Product r0 = X.W2E.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5.A01 = r0
        L_0x00fc:
            return
        L_0x00fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0103:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15428Uce.<init>(X.Vd1):void");
    }
}
