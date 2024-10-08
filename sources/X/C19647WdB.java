package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WdB  reason: case insensitive filesystem */
public final class C19647WdB implements X9L {
    public final Context A00;
    public final UserSession A01;
    public final ProductTileMedia A02;
    public final Product A03;
    public final String A04;
    public final List A05 = new ArrayList();
    public final boolean A06;
    public final User A07;

    public final String BOK() {
        return null;
    }

    public final boolean CKq() {
        return false;
    }

    public final boolean CL2() {
        return false;
    }

    public final String getNextMaxId() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r13v3, types: [java.lang.Object, X.VWk] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003d, code lost:
        if (java.lang.Boolean.TRUE.equals(r2.A01.A0C.A02) == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19647WdB(android.content.Context r24, com.instagram.common.session.UserSession r25, com.instagram.model.shopping.productfeed.ProductTileMedia r26, com.instagram.user.model.Product r27, com.instagram.user.model.User r28, java.lang.String r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r23 = this;
            r3 = r23
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.A05 = r0
            r0 = r24
            r3.A00 = r0
            r0 = r25
            r3.A01 = r0
            r0 = r28
            r3.A07 = r0
            r2 = r27
            r3.A03 = r2
            r0 = r26
            r3.A02 = r0
            r0 = r33
            r3.A06 = r0
            r0 = r29
            r3.A04 = r0
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x00dd
            if (r30 == 0) goto L_0x003f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r2.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            java.lang.Boolean r0 = r0.A02
            boolean r0 = r1.equals(r0)
            r11 = 1
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r11 = 0
        L_0x0040:
            java.util.List r2 = r3.A05
            com.instagram.user.model.Product r1 = r3.A03
            com.instagram.model.shopping.productfeed.ProductTileMedia r0 = r3.A02
            X.UrN r0 = X.VHJ.A00(r0, r1)
            r2.add(r0)
            X.UrK r0 = X.C16257UrK.A00
            r2.add(r0)
            if (r31 == 0) goto L_0x00cf
            X.UrL r0 = X.C16258UrL.A00
            r2.add(r0)
            android.content.Context r8 = r3.A00
            com.instagram.common.session.UserSession r10 = r3.A01
            boolean r5 = r3.A06
            java.lang.String r4 = r3.A04
            r3 = 0
            X.Vsa r12 = X.C18481Vsa.A04
            r0 = 3
            X.0qQ.A0B(r12, r0)
            r0 = 2131952356(0x7f1302e4, float:1.9541152E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r8, r0)
            r0 = 2131973842(0x7f1356d2, float:1.9584731E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r8, r0)
            r0 = 2131976634(0x7f1361ba, float:1.9590394E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r8, r0)
            X.0Tu r7 = X.0Tu.A06
            r0 = 36313501811083295(0x8102f00000081f, double:3.02814299583966E-306)
            boolean r6 = X.182.A06(r7, r10, r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            if (r11 == 0) goto L_0x00d0
            if (r6 != 0) goto L_0x00d0
            r14 = r9
        L_0x008f:
            X.VHH.A00(r4, r5)
            boolean r1 = X.182.A06(r7, r10, r0)
            r0 = 2131957177(0x7f1315b9, float:1.955093E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r8, r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r1 == 0) goto L_0x00a9
            r6 = r9
            r0 = 2131952356(0x7f1302e4, float:1.9541152E38)
            java.lang.String r7 = r8.getString(r0)
        L_0x00a9:
            java.lang.String r1 = "secondary_cta_button"
            r0 = 2
            X.0qQ.A0B(r7, r0)
            X.VWk r13 = new X.VWk
            r13.<init>()
            r13.A01 = r1
            r13.A02 = r7
            X.0qQ.A0B(r6, r3)
            r13.A00 = r6
        L_0x00bd:
            java.lang.String r15 = "cta_button"
            X.UrT r11 = new X.UrT
            r19 = r4
            r20 = r3
            r21 = r3
            r22 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x00cc:
            r2.add(r11)
        L_0x00cf:
            return
        L_0x00d0:
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            r6 = 2131957177(0x7f1315b9, float:1.955093E38)
            java.lang.String r16 = r8.getString(r6)
            if (r11 != 0) goto L_0x008f
            r13 = 0
            goto L_0x00bd
        L_0x00dd:
            java.util.List r2 = r3.A05
            com.instagram.user.model.Product r1 = r3.A03
            com.instagram.model.shopping.productfeed.ProductTileMedia r0 = r3.A02
            X.UrN r0 = X.VHJ.A00(r0, r1)
            r2.add(r0)
            X.UrK r0 = X.C16257UrK.A00
            r2.add(r0)
            if (r32 == 0) goto L_0x00cf
            android.content.Context r1 = r3.A00
            r20 = 0
            r0 = 2131976650(0x7f1361ca, float:1.9590427E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r1, r0)
            X.Vsa r12 = X.C18481Vsa.A04
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            java.lang.String r15 = "cta_button"
            r13 = 0
            X.UrT r11 = new X.UrT
            r17 = r16
            r18 = r16
            r19 = r13
            r21 = r20
            r22 = r20
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19647WdB.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.model.shopping.productfeed.ProductTileMedia, com.instagram.user.model.Product, com.instagram.user.model.User, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    public final User BRo() {
        return this.A07;
    }

    public final List BZ9() {
        return this.A05;
    }

    public final Product Bft() {
        return this.A03;
    }

    public final List Bqs(String str) {
        return this.A05;
    }
}
