package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsFooterCell;

public final class MGT extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGT(Bitmap bitmap, L82 l82, C52973GgQ ggQ, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A07 = 1;
        this.A09 = l82;
        this.A0A = ggQ;
        this.A08 = bitmap;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.MGT, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.MGT, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.MGT, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v3, types: [X.MGT, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r23) {
        AnonymousClass4D7 r0 = r23;
        switch (this.A07) {
            case 0:
                Object obj2 = this.A05;
                Object obj3 = this.A04;
                Object obj4 = this.A0A;
                Object obj5 = this.A06;
                Object obj6 = this.A02;
                Object obj7 = this.A03;
                Object obj8 = this.A08;
                return new MGT(obj2, obj3, obj4, obj5, obj6, obj7, obj8, this.A09, this.A01, r0, 0);
            case 1:
                return new MGT((Bitmap) this.A08, (L82) this.A09, (C52973GgQ) this.A0A, r0);
            case 2:
                ? mgt = new MGT((View) this.A05, (E48) this.A0A, (IgdsBottomButtonLayout) this.A08, (IgdsBulletCell) this.A09, (IgdsBulletCell) this.A02, (IgdsBulletCell) this.A01, (IgdsHeadline) this.A04, (IgdsFooterCell) this.A03, r0);
                mgt.A06 = obj;
                return mgt;
            default:
                Object obj9 = this.A05;
                Object obj10 = this.A03;
                Object obj11 = this.A0A;
                Object obj12 = this.A06;
                Object obj13 = this.A04;
                Object obj14 = this.A01;
                return new MGT(obj9, obj13, obj11, obj12, this.A02, obj10, this.A08, this.A09, obj14, r0, 3);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MGT, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009e, code lost:
        X.0eS.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d7, code lost:
        if (r6.AIY(r7, X.C53395GnS.A01(new X.C61084JwM(r10, (X.C55638Hkx) r9, (X.YCQ) X.C21082XDv.A03), (X.HMG) null, r8, (java.lang.Integer) null, 131067)) != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00db, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        r5 = new X.C59700JUh(r6, r7, r8, r9, r10, r11, r12, r13, r14);
        r0.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
        if (X.AnonymousClass3DM.A00(r1, r3, r0, r5) != r2) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r9 = r18
            r0 = r17
            int r1 = r0.A07
            switch(r1) {
                case 0: goto L_0x003c;
                case 1: goto L_0x00a2;
                case 2: goto L_0x0061;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 != 0) goto L_0x009e
            X.0eS.A00(r9)
            java.lang.Object r1 = r0.A05
            X.07V r3 = X.JTO.A0J(r1)
            java.lang.Object r1 = r0.A03
            X.07U r1 = (X.07U) r1
            r13 = 0
            java.lang.Object r6 = r0.A0A
            java.lang.Object r11 = r0.A06
            java.lang.Object r8 = r0.A04
            java.lang.Object r10 = r0.A01
            java.lang.Object r7 = r0.A08
            java.lang.Object r9 = r0.A02
            java.lang.Object r12 = r0.A09
            r14 = 9
        L_0x002e:
            X.JUh r5 = new X.JUh
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A00 = r4
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r1, r3, r0, r5)
            if (r0 != r2) goto L_0x00d9
            return r2
        L_0x003c:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 != 0) goto L_0x009e
            X.0eS.A00(r9)
            java.lang.Object r1 = r0.A05
            X.07V r3 = X.JTO.A0J(r1)
            java.lang.Object r1 = r0.A04
            X.07U r1 = (X.07U) r1
            r13 = 0
            java.lang.Object r6 = r0.A0A
            java.lang.Object r11 = r0.A06
            java.lang.Object r9 = r0.A02
            java.lang.Object r8 = r0.A03
            java.lang.Object r7 = r0.A08
            java.lang.Object r12 = r0.A09
            java.lang.Object r10 = r0.A01
            r14 = 5
            goto L_0x002e
        L_0x0061:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r3 = 1
            if (r1 == 0) goto L_0x0070
            X.0eS.A00(r9)
        L_0x006b:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0070:
            X.0eS.A00(r9)
            java.lang.Object r12 = r0.A0A
            X.E48 r12 = (X.E48) r12
            X.0eM r1 = r12.A06
            java.lang.Object r1 = r1.getValue()
            X.Dku r1 = (X.C46767Dku) r1
            X.0Ud r1 = r1.A03
            java.lang.Object r11 = r0.A05
            java.lang.Object r6 = r0.A04
            java.lang.Object r7 = r0.A09
            java.lang.Object r9 = r0.A02
            java.lang.Object r13 = r0.A01
            java.lang.Object r10 = r0.A03
            java.lang.Object r8 = r0.A08
            r5 = 0
            X.FxH r4 = new X.FxH
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.A00 = r3
            java.lang.Object r0 = r1.collect(r4, r0)
            if (r0 != r2) goto L_0x006b
            return r2
        L_0x009e:
            X.0eS.A00(r9)
            goto L_0x00d9
        L_0x00a2:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r8 = r0.A06
            X.GnS r8 = (X.C53395GnS) r8
            java.lang.Object r10 = r0.A05
            X.I12 r10 = (X.I12) r10
            java.lang.Object r7 = r0.A04
            java.lang.Object r11 = r0.A03
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Object r6 = r0.A02
            X.05G r6 = (X.05G) r6
            java.lang.Object r14 = r0.A01
            java.lang.String r14 = (java.lang.String) r14
            X.0eS.A00(r9)
        L_0x00c2:
            r5 = 0
            X.Hkx r9 = (X.C55638Hkx) r9
            X.XDv r1 = X.C21082XDv.A03
            X.JwM r3 = new X.JwM
            r3.<init>((X.I12) r10, (X.C55638Hkx) r9, (X.YCQ) r1)
            r1 = 131067(0x1fffb, float:1.83664E-40)
            X.GnS r1 = X.C53395GnS.A00(r3, (X.C61084JwM) null, (X.I12) null, (X.L82) null, r5, r8, r5, (X.AnonymousClass62P) null, 0, r1, false, false, false)
            boolean r1 = r6.AIY(r7, r1)
            if (r1 == 0) goto L_0x00f5
        L_0x00d9:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x00dc:
            X.0eS.A00(r9)
            java.lang.Object r1 = r0.A09
            X.L82 r1 = (X.L82) r1
            java.lang.String r3 = r1.A03
            X.0sn r1 = X.0sn.A00
            java.lang.String r14 = X.C63195Kt2.A00(r3, r1)
            java.lang.Object r1 = r0.A0A
            X.GgQ r1 = (X.C52973GgQ) r1
            X.05G r6 = r1.A0I
            java.lang.Object r11 = r0.A08
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
        L_0x00f5:
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            X.GnS r8 = (X.C53395GnS) r8
            boolean r16 = X.DbW.A1S(r4, r14, r11)
            r12 = 0
            X.I12 r10 = new X.I12
            r13 = r12
            r15 = r12
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.A01 = r14
            r0.A02 = r6
            r0.A03 = r11
            r0.A04 = r7
            r0.A05 = r10
            r0.A06 = r8
            r0.A00 = r4
            java.lang.Object r9 = com.instagram.genai.imageutils.MaskUtilsKt.A04(r11, r0)
            if (r9 != r2) goto L_0x00c2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGT) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGT(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, AnonymousClass4D7 r11, int i) {
        super(2, r11);
        this.A07 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A0A = obj3;
        this.A06 = obj4;
        this.A02 = obj5;
        this.A03 = obj6;
        this.A08 = obj7;
        this.A09 = obj8;
        this.A01 = obj9;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGT(View view, E48 e48, IgdsBottomButtonLayout igdsBottomButtonLayout, IgdsBulletCell igdsBulletCell, IgdsBulletCell igdsBulletCell2, IgdsBulletCell igdsBulletCell3, IgdsHeadline igdsHeadline, IgdsFooterCell igdsFooterCell, AnonymousClass4D7 r10) {
        super(2, r10);
        this.A07 = 2;
        this.A0A = e48;
        this.A05 = view;
        this.A04 = igdsHeadline;
        this.A09 = igdsBulletCell;
        this.A02 = igdsBulletCell2;
        this.A01 = igdsBulletCell3;
        this.A03 = igdsFooterCell;
        this.A08 = igdsBottomButtonLayout;
    }
}
