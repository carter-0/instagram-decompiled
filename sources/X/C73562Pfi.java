package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Pfi  reason: case insensitive filesystem */
public final class C73562Pfi extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01 = 0;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73562Pfi(LBR lbr, IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response response, C381559bx r4, String str, List list, List list2, AnonymousClass4D7 r8, int i) {
        super(2, r8);
        this.A07 = lbr;
        this.A04 = response;
        this.A03 = list;
        this.A05 = r4;
        this.A08 = str;
        this.A02 = i;
        this.A06 = list2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Pfi, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.Pfi, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        AnonymousClass4D7 r7 = r12;
        if (this.A01 != 0) {
            PEX pex = (PEX) this.A07;
            OH1 oh1 = (OH1) this.A06;
            int i = this.A02;
            String str = this.A08;
            int i2 = this.A00;
            return new C73562Pfi((ImageUrl) this.A04, pex, oh1, (1Xj) this.A05, (User) this.A03, str, r7, i, i2);
        }
        return new C73562Pfi((LBR) this.A07, (IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response) this.A04, (C381559bx) this.A05, this.A08, (List) this.A03, (List) this.A06, r7, this.A02);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            r34 = this;
            r6 = r34
            r4 = r35
            int r0 = r6.A01
            if (r0 == 0) goto L_0x00d8
            X.0eS.A00(r4)
            java.lang.Object r12 = r6.A05
            X.1Xj r12 = (X.1Xj) r12
            java.lang.String r5 = "StoryXmaShareSender"
            r1 = 0
            r14 = 1
            X.0eP r0 = X.C71148Oe6.A04(r12, r5, r14)
            if (r0 != 0) goto L_0x001e
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r1)
        L_0x001e:
            java.lang.Object r8 = r0.A00
            com.instagram.model.mediasize.ExtendedImageUrl r8 = (com.instagram.model.mediasize.ExtendedImageUrl) r8
            java.lang.Object r11 = r0.A01
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Object r0 = r6.A07
            X.PEX r0 = (X.PEX) r0
            X.1a8 r13 = r0.A00
            com.instagram.common.session.UserSession r10 = r0.A01
            X.6EZ r0 = X.AnonymousClass6EY.A00(r10, r5)
            X.6Ea r4 = r0.A00
            java.lang.Object r7 = r6.A06
            X.OH1 r7 = (X.OH1) r7
            com.instagram.model.direct.DirectShareTarget r0 = r7.A00
            X.9HR r3 = X.C66583MXo.A0X(r0)
            java.lang.String r0 = r7.A03
            r23 = r0
            int r0 = r6.A02
            r16 = r0
            java.lang.Object r9 = r6.A03
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            java.lang.String r21 = r9.getUsername()
            java.lang.String r22 = r12.A2n()
            if (r22 == 0) goto L_0x01af
            long r1 = r12.A17()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            java.lang.String r15 = r6.A08
            X.Oe6 r2 = X.C71148Oe6.A00
            X.1Xy r1 = r12.A0C
            com.instagram.model.hashtag.Hashtag r1 = r1.B6n()
            java.lang.String r25 = X.C71148Oe6.A01(r10, r12, r1, r9)
            int r9 = r6.A00
            if (r11 == 0) goto L_0x00d5
            byte[] r19 = X.C71148Oe6.A07(r11)
        L_0x0073:
            if (r8 == 0) goto L_0x00ce
            java.lang.String r1 = r8.A0A
            java.lang.String r24 = X.C71148Oe6.A02(r1)
            int r31 = r8.getHeight()
            int r32 = r8.getWidth()
        L_0x0083:
            java.lang.String r7 = r7.A04
            java.lang.Object r1 = r6.A04
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            byte[] r20 = r2.A09(r1, r5)
            java.lang.String r2 = X.JTP.A0o(r1)
            java.lang.String r26 = X.C71148Oe6.A02(r2)
            int r2 = r1.getHeight()
            java.lang.Integer r17 = X.JTO.A0w(r2)
            int r1 = r1.getWidth()
            java.lang.Integer r18 = X.JTO.A0w(r1)
            X.1aU r2 = X.C304566Ea.A01(r4, r3)
            X.OvZ r1 = new X.OvZ
            r27 = r7
            r28 = r15
            r29 = r16
            r30 = r9
            r33 = r14
            r14 = r1
            r15 = r0
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.1aU r1 = r2.A0M(r1)
            java.lang.String r0 = "instagram_xma_story_share_client_send"
            X.1aU r1 = X.C66582MXn.A0N(r1, r0)
            X.PTp r0 = X.C73032PTp.A00
            r13.A02(r1, r0)
        L_0x00cb:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x00ce:
            java.lang.String r24 = "image/heic"
            r31 = 0
            r32 = 0
            goto L_0x0083
        L_0x00d5:
            r19 = 0
            goto L_0x0073
        L_0x00d8:
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto L_0x017e
            if (r0 != r5) goto L_0x01b4
            X.0eS.A00(r4)
        L_0x00e4:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.Object r7 = r6.A07
            X.LBR r7 = (X.LBR) r7
            r5 = 0
            X.0qQ.A0B(r4, r5)
            android.content.Context r3 = r7.A05
            java.io.File r2 = r3.getCacheDir()
            int r1 = r4.hashCode()
            java.lang.String r0 = ".png"
            java.lang.String r0 = X.002.A03(r1, r0)
            java.io.File r2 = X.JTO.A0s(r2, r0)
            r2.createNewFile()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            X.0fO.A02(r0, r4, r1, r5)
            byte[] r1 = r1.toByteArray()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            r0.write(r1)
            r0.flush()
            r0.close()
            java.lang.String r8 = X.JTP.A0t(r2)
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r3)
            int r0 = r0.widthPixels
            double r2 = (double) r0
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r2 = r2 * r0
            int r0 = (int) r2
            android.graphics.Bitmap r4 = X.1MF.A09(r4, r0, r0, r5, r5)
            X.0qQ.A07(r4)
            java.lang.Object r3 = r6.A04
            com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response r3 = (com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response) r3
            java.lang.String r2 = r6.A08
            int r1 = r6.A02
            X.Ou3 r0 = new X.Ou3
            r0.<init>(r4, r3, r2, r1)
            java.lang.Object r1 = r6.A06
            java.util.List r1 = (java.util.List) r1
            r1.add(r0)
            java.util.List r0 = r7.A0E
            r0.add(r8)
            X.M7S r0 = new X.M7S
            r0.<init>(r7, r1)
            X.11Z.A02(r0)
            X.OGu r1 = r7.A0B
            r0 = 8
            X.Ply r2 = new X.Ply
            r2.<init>(r7, r0)
            android.view.ViewGroup r0 = r1.A01
            r0.setVisibility(r5)
            X.0eM r0 = r1.A04
            X.DbW.A1R(r0, r5)
            X.0eM r0 = r1.A03
            X.DbW.A1R(r0, r5)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 37
            X.C71397Ojw.A00(r1, r0, r2)
            goto L_0x00cb
        L_0x017e:
            X.0eS.A00(r4)
            java.lang.Object r0 = r6.A07
            X.LBR r0 = (X.LBR) r0
            com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor r8 = r0.A02
            if (r8 != 0) goto L_0x0193
            java.lang.String r0 = "contentCompositor"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0193:
            java.lang.Object r3 = r6.A04
            com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response r3 = (com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response) r3
            java.lang.Object r2 = r6.A03
            java.util.List r2 = (java.util.List) r2
            X.4DH r1 = r0.A07
            java.lang.Object r0 = r6.A05
            X.9bx r0 = (X.C381559bx) r0
            r6.A00 = r5
            r9 = r1
            r10 = r3
            r11 = r0
            r12 = r2
            r13 = r6
            java.lang.Object r4 = r8.A03(r9, r10, r11, r12, r13)
            if (r4 != r7) goto L_0x00e4
            return r7
        L_0x01af:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73562Pfi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C73562Pfi) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73562Pfi(ImageUrl imageUrl, PEX pex, OH1 oh1, 1Xj r5, User user, String str, AnonymousClass4D7 r8, int i, int i2) {
        super(2, r8);
        this.A05 = r5;
        this.A07 = pex;
        this.A06 = oh1;
        this.A02 = i;
        this.A03 = user;
        this.A08 = str;
        this.A00 = i2;
        this.A04 = imageUrl;
    }
}
