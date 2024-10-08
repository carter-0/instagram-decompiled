package X;

import android.view.View;

public final class MM9 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MM9(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static View A00(MM9 mm9) {
        return (View) ((AZV) mm9.A01).A0C.getValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0242, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0249, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0377, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0129, code lost:
        r1.setVisibility(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x000c;
                case 2: goto L_0x0026;
                case 3: goto L_0x0005;
                case 4: goto L_0x002d;
                case 5: goto L_0x0037;
                case 6: goto L_0x0062;
                case 7: goto L_0x0077;
                case 8: goto L_0x00e5;
                case 9: goto L_0x00f8;
                case 10: goto L_0x0102;
                case 11: goto L_0x0111;
                case 12: goto L_0x011d;
                case 13: goto L_0x012e;
                case 14: goto L_0x000c;
                case 15: goto L_0x0026;
                case 16: goto L_0x0005;
                case 17: goto L_0x0137;
                case 18: goto L_0x014b;
                case 19: goto L_0x0154;
                case 20: goto L_0x0160;
                case 21: goto L_0x0172;
                case 22: goto L_0x017e;
                case 23: goto L_0x018a;
                case 24: goto L_0x0196;
                case 25: goto L_0x01a2;
                case 26: goto L_0x01ad;
                case 27: goto L_0x01b9;
                case 28: goto L_0x01c5;
                case 29: goto L_0x01d1;
                case 30: goto L_0x01dd;
                case 31: goto L_0x01e9;
                case 32: goto L_0x01fb;
                case 33: goto L_0x020a;
                case 34: goto L_0x0226;
                case 35: goto L_0x024e;
                case 36: goto L_0x0267;
                case 37: goto L_0x0279;
                case 38: goto L_0x028b;
                case 39: goto L_0x029d;
                case 40: goto L_0x02a9;
                case 41: goto L_0x000c;
                case 42: goto L_0x0026;
                case 43: goto L_0x0005;
                case 44: goto L_0x02c2;
                case 45: goto L_0x02d7;
                case 46: goto L_0x0341;
                case 47: goto L_0x034f;
                case 48: goto L_0x0364;
                case 49: goto L_0x036e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x000c:
            java.lang.Object r3 = r12.A01
            return r3
        L_0x000f:
            java.lang.Object r2 = r12.A01
            X.LN1 r2 = (X.LN1) r2
            X.0eM r0 = r2.A03
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131433359(0x7f0b178f, float:1.8488501E38)
            android.view.View r3 = r1.requireViewById(r0)
            r0 = 38
            X.LY0.A00(r3, r0, r2)
            return r3
        L_0x0026:
            java.lang.Object r0 = r12.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x002d:
            java.lang.Object r0 = r12.A01
            X.80W r0 = (X.AnonymousClass80W) r0
            X.8Mu r3 = new X.8Mu
            r3.<init>(r0)
            return r3
        L_0x0037:
            java.lang.Object r0 = r12.A01
            X.8hW r0 = (X.C362208hW) r0
            com.instagram.common.session.UserSession r6 = r0.A05
            X.1Av r3 = X.1Au.A00(r6)
            X.0s0 r2 = r3.A0r
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 512(0x200, float:7.175E-43)
            int r0 = X.DbY.A03(r3, r2, r1, r0)
            long r4 = (long) r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36606676279170535(0x820d94000715e7, double:3.2135477099768585E-306)
            long r2 = X.182.A01(r2, r6, r0)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x005d
            r0 = 1
        L_0x005d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0062:
            java.lang.Object r0 = r12.A01
            X.8hW r0 = (X.C362208hW) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A0r
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 512(0x200, float:7.175E-43)
            X.DbZ.A1b(r3, r2, r1, r0)
            goto L_0x0375
        L_0x0077:
            java.lang.Object r3 = r12.A01
            X.8hA r3 = (X.C361998hA) r3
            X.8hl r1 = r3.A06
            java.lang.String r5 = "storyDraftsAdapter"
            if (r1 == 0) goto L_0x00aa
            java.util.Set r0 = r1.A0A
            r1.A01(r0)
            com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r4 = r3.A0I
            X.8hl r0 = r3.A06
            if (r0 == 0) goto L_0x00aa
            java.util.Set r0 = r0.A0A
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r1.next()
            X.8ve r0 = (X.C369988ve) r0
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x0096
            r2.add(r0)
            goto L_0x0096
        L_0x00aa:
            X.0qQ.A0F(r5)
            goto L_0x00d2
        L_0x00ae:
            r4.A04(r2)
            X.8hG r0 = r3.A05
            java.lang.String r5 = "delegate"
            if (r0 == 0) goto L_0x00aa
            r2 = 0
            r0.A0h(r2)
            X.8XC r0 = r3.A0J
            X.0Ud r0 = r0.A01
            java.util.List r0 = X.JTO.A17(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0375
            java.lang.String r0 = "draftsTabView"
            com.instagram.common.ui.base.IgTextView r1 = r3.A03
            if (r1 != 0) goto L_0x00d7
            X.0qQ.A0F(r0)
        L_0x00d2:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d7:
            r0 = 8
            r1.setVisibility(r0)
            X.8hG r0 = r3.A05
            if (r0 == 0) goto L_0x00aa
            r0.A0g(r2)
            goto L_0x0375
        L_0x00e5:
            java.lang.Object r0 = r12.A01
            X.8iX r0 = (X.C362818iX) r0
            X.8iW r0 = r0.A08
            r1 = 0
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00f3
            r1 = 1
        L_0x00f3:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L_0x00f8:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.KVR r3 = new X.KVR
            r3.<init>(r0)
            return r3
        L_0x0102:
            java.lang.Object r0 = r12.A01
            X.9SC r0 = (X.AnonymousClass9SC) r0
            X.0sa r0 = r0.A01
            boolean r0 = X.C51971G9r.A1b(r0)
            java.lang.Boolean r3 = X.DbT.A0l(r0)
            return r3
        L_0x0111:
            java.lang.Object r0 = r12.A01
            X.8XA r0 = (X.AnonymousClass8XA) r0
            X.8hG r0 = r0.A02
            if (r0 == 0) goto L_0x0375
            android.view.View r1 = r0.A0R
            r0 = 0
            goto L_0x0129
        L_0x011d:
            java.lang.Object r0 = r12.A01
            X.8XA r0 = (X.AnonymousClass8XA) r0
            X.8hG r0 = r0.A02
            if (r0 == 0) goto L_0x0375
            android.view.View r1 = r0.A0R
            r0 = 8
        L_0x0129:
            r1.setVisibility(r0)
            goto L_0x0375
        L_0x012e:
            java.lang.Object r0 = r12.A01
            X.8XA r0 = (X.AnonymousClass8XA) r0
            r0.A0Q()
            goto L_0x0375
        L_0x0137:
            java.lang.Object r2 = r12.A01
            X.K4E r2 = (X.K4E) r2
            X.0eM r0 = r2.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r2.requireContext()
            X.KCY r3 = new X.KCY
            r3.<init>(r1, r0)
            return r3
        L_0x014b:
            java.lang.Object r0 = r12.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r3 = r0.A00()
            return r3
        L_0x0154:
            android.view.View r1 = A00(r12)
            r0 = 2131427578(0x7f0b00fa, float:1.8476776E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x0160:
            android.view.View r1 = A00(r12)
            r0 = 2131433666(0x7f0b18c2, float:1.8489124E38)
            android.widget.ImageView r3 = X.DbU.A0F(r1, r0)
            r0 = 2131238397(0x7f081dfd, float:1.8093072E38)
            r3.setImageResource(r0)
            return r3
        L_0x0172:
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131442628(0x7f0b3bc4, float:1.8507301E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x017e:
            android.view.View r1 = A00(r12)
            r0 = 2131433672(0x7f0b18c8, float:1.8489136E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x018a:
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131437940(0x7f0b2974, float:1.8497793E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x0196:
            android.view.View r1 = A00(r12)
            r0 = 2131433667(0x7f0b18c3, float:1.8489126E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x01a2:
            java.lang.Object r0 = r12.A01
            X.AZV r0 = (X.AZV) r0
            X.0eM r0 = r0.A0D
            android.view.View r3 = X.AnonymousClass7TG.A0Q(r0)
            return r3
        L_0x01ad:
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131433671(0x7f0b18c7, float:1.8489134E38)
            X.3oV r3 = X.DbU.A0Z(r1, r0)
            return r3
        L_0x01b9:
            android.view.View r1 = A00(r12)
            r0 = 2131433669(0x7f0b18c5, float:1.848913E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x01c5:
            android.view.View r1 = A00(r12)
            r0 = 2131433665(0x7f0b18c1, float:1.8489122E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x01d1:
            android.view.View r1 = A00(r12)
            r0 = 2131433670(0x7f0b18c6, float:1.8489132E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x01dd:
            android.view.View r1 = A00(r12)
            r0 = 2131433673(0x7f0b18c9, float:1.8489138E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x01e9:
            java.lang.Object r0 = r12.A01
            X.LmS r0 = (X.C65048LmS) r0
            android.content.Context r0 = r0.A09
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            java.lang.Integer r3 = X.JTP.A0k(r1, r0)
            return r3
        L_0x01fb:
            java.lang.Object r0 = r12.A01
            X.LmS r0 = (X.C65048LmS) r0
            android.content.Context r0 = r0.A09
            int r0 = X.AnonymousClass7TG.A06(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x020a:
            java.lang.Object r3 = r12.A01
            X.Lh1 r3 = (X.C64724Lh1) r3
            android.view.View r1 = r3.A00
            if (r1 != 0) goto L_0x0215
            java.lang.String r0 = "captionEditor"
            goto L_0x0242
        L_0x0215:
            r0 = 2131435115(0x7f0b1e6b, float:1.8492063E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            X.3E6 r1 = r3.A0J
            X.L0K r0 = r3.A0L
            X.KG4 r3 = new X.KG4
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0226:
            java.lang.Object r2 = r12.A01
            X.Lh1 r2 = (X.C64724Lh1) r2
            android.content.Context r0 = r2.A0F
            X.2tC r1 = X.AnonymousClass2t9.A00(r0)
            X.0eM r0 = r2.A0P
            java.lang.Object r0 = r0.getValue()
            X.2tF r0 = (X.C232232tF) r0
            X.2t9 r3 = X.DbU.A0U(r1, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A03
            if (r0 != 0) goto L_0x024a
            java.lang.String r0 = "editRecyclerView"
        L_0x0242:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x024a:
            r0.setAdapter(r3)
            return r3
        L_0x024e:
            java.lang.Object r2 = r12.A01
            X.Lze r2 = (X.C65786Lze) r2
            X.0eM r0 = r2.A0C
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131430439(0x7f0b0c27, float:1.848258E38)
            android.view.View r3 = r1.requireViewById(r0)
            X.0qQ.A0A(r3)
            r0 = 0
            X.C65786Lze.A01(r3, r2, r0)
            return r3
        L_0x0267:
            java.lang.Object r0 = r12.A01
            X.Lze r0 = (X.C65786Lze) r0
            X.0eM r0 = r0.A0D
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131441782(0x7f0b3876, float:1.8505585E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x0279:
            java.lang.Object r0 = r12.A01
            X.Lze r0 = (X.C65786Lze) r0
            X.0eM r0 = r0.A0D
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131435172(0x7f0b1ea4, float:1.8492179E38)
            android.view.View r3 = r1.requireViewById(r0)
            return r3
        L_0x028b:
            java.lang.Object r0 = r12.A01
            X.Lze r0 = (X.C65786Lze) r0
            X.0eM r0 = r0.A0D
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131435173(0x7f0b1ea5, float:1.849218E38)
            android.view.View r3 = r1.requireViewById(r0)
            return r3
        L_0x029d:
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131435174(0x7f0b1ea6, float:1.8492183E38)
            android.view.View r3 = X.DbY.A0F(r1, r0)
            return r3
        L_0x02a9:
            java.lang.Object r2 = r12.A01
            X.Lze r2 = (X.C65786Lze) r2
            X.0eM r0 = r2.A0C
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131435698(0x7f0b20b2, float:1.8493246E38)
            android.view.View r3 = r1.requireViewById(r0)
            X.0qQ.A0A(r3)
            r0 = 0
            X.C65786Lze.A01(r3, r2, r0)
            return r3
        L_0x02c2:
            java.lang.Object r0 = r12.A01
            X.JYD r0 = (X.JYD) r0
            android.content.Context r0 = r0.A08
            X.6ST r3 = X.DbV.A0h(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131969783(0x7f1346f7, float:1.9576499E38)
            X.DbU.A18(r1, r3, r0)
            return r3
        L_0x02d7:
            java.lang.Object r10 = r12.A01
            X.JYD r10 = (X.JYD) r10
            X.Jc9 r9 = r10.A0P
            X.7wF r0 = r10.A01
            r8 = 0
            java.util.List r0 = X.C59943Jc9.A00(r9, r0)
            if (r0 == 0) goto L_0x0375
            r3 = 0
            int r7 = r0.size()
            r6 = 450(0x1c2, float:6.3E-43)
            int r0 = r7 + -1
            int r6 = r6 / r0
            r5 = 1
        L_0x02f2:
            if (r5 >= r7) goto L_0x0375
            java.util.Queue r1 = r10.A0W
            boolean r0 = r1.isEmpty()
            java.lang.String r11 = "Required value was null."
            if (r0 != 0) goto L_0x0327
            java.lang.Object r1 = r1.poll()
            if (r1 == 0) goto L_0x033c
            android.view.View r1 = (android.view.View) r1
        L_0x0306:
            X.7wF r0 = r10.A01
            X.2dQ r0 = r9.A03(r0, r5)
            if (r0 == 0) goto L_0x0337
            r1.setLayoutParams(r0)
            r0 = -1
            r1.setBackgroundColor(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.A0C
            r0.addView(r1)
            X.M6X r0 = new X.M6X
            r0.<init>(r1, r10)
            X.11Z.A04(r0, r3)
            long r0 = (long) r6
            long r3 = r3 + r0
            int r5 = r5 + 1
            goto L_0x02f2
        L_0x0327:
            android.content.Context r0 = r10.A08
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131626672(0x7f0e0ab0, float:1.8880587E38)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.A0C
            android.view.View r1 = X.DbU.A0A(r2, r0, r1, r8)
            goto L_0x0306
        L_0x0337:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x033c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x0341:
            java.lang.Object r2 = r12.A01
            X.Llp r2 = (X.C65012Llp) r2
            android.content.Context r1 = r2.A03
            X.8AL r0 = r2.A0A
            X.KKq r3 = new X.KKq
            r3.<init>(r1, r0, r2)
            return r3
        L_0x034f:
            java.lang.Object r0 = r12.A01
            X.Llp r0 = (X.C65012Llp) r0
            android.app.Activity r0 = r0.A02
            X.6ST r3 = X.DbV.A0h(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131969783(0x7f1346f7, float:1.9576499E38)
            X.DbU.A18(r1, r3, r0)
            return r3
        L_0x0364:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.27j r3 = new X.27j
            r3.<init>(r0)
            return r3
        L_0x036e:
            java.lang.Object r0 = r12.A01
            X.7jY r0 = (X.C339407jY) r0
            X.C339407jY.A02(r0)
        L_0x0375:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MM9.invoke():java.lang.Object");
    }
}
