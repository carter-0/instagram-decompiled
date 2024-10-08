package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.PDi  reason: case insensitive filesystem */
public final class C72629PDi implements C74460PvF {
    public final int A00;
    public final Object A01;

    public C72629PDi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D7X() {
        if (2 - this.A00 == 0) {
            C71085Ob8 ob8 = (C71085Ob8) this.A01;
            ob8.A0B = true;
            FrameLayout frameLayout = ob8.A0N;
            frameLayout.setVisibility(0);
            View view = ob8.A04;
            if (view != null) {
                view.setVisibility(0);
                C252063oV r8 = ob8.A0R;
                r8.setVisibility(0);
                ob8.A04(ob8.A0A, ob8.A01);
                float f = ob8.A01;
                FrameLayout frameLayout2 = ob8.A0M;
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout2.getWidth(), AnonymousClass972.MUTABLE_FLAG_MASK), View.MeasureSpec.makeMeasureSpec(frameLayout2.getHeight(), AnonymousClass972.MUTABLE_FLAG_MASK));
                int measuredHeight = frameLayout.getMeasuredHeight();
                View view2 = ob8.A04;
                if (view2 != null) {
                    view2.setTranslationY(f + ((float) measuredHeight));
                }
                View view3 = ob8.A04;
                if (view3 != null) {
                    view3.setAlpha(1.0f);
                }
                r8.getView().setAlpha(1.0f);
                ob8.A0L.setAlpha(1.0f);
                AnonymousClass37D r0 = ob8.A0U;
                if (r0 != null) {
                    r0.A0V(true);
                }
                C71091OcD ocD = ob8.A08;
                String str = null;
                if (ocD == null) {
                    0qQ.A0F("reactionsTrayController");
                    throw AnonymousClass00P.createAndThrow();
                }
                ocD.A05(0.0f);
                0wc r2 = ob8.A0P;
                C254743sy r1 = ob8.A0T;
                if (r1 != null) {
                    str = C67003Mgb.A01(r1);
                }
                0qQ.A0B(r2, 0);
                0Aj A0e = AnonymousClass7TE.A0e(r2, "direct_enter_customize_reactions");
                DbS.A1J(A0e, "customize_button");
                if (str != null) {
                    C66580MXl.A1K(A0e, str);
                }
                A0e.Cgf();
                DirectThreadKey A04 = C66647MaG.A04(r1);
                if (ob8.A0H == 29 && A04 != null) {
                    C313756gx A002 = C313746gw.A00(ob8.A0Q);
                    int i = ob8.A0E;
                    String str2 = A04.A00;
                    String str3 = A04.A01;
                    1Ln A0J = DbT.A0J(A002);
                    if (DbT.A1Y(A0J)) {
                        DbW.A17(A0J, A002);
                        DbV.A1M(A0J, "reaction_customizations_rendered");
                        A0J.A0p("customize_button");
                        C66582MXn.A1C(A0J, A002, DbZ.A0b(A0J, "reaction_sheet", str2, str3, i));
                        return;
                    }
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        r1 = r0.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DBt(X.C317486nL r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x012f;
                case 1: goto L_0x00f7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r8.A01
            X.Ob8 r3 = (X.C71085Ob8) r3
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x011a
            X.OcD r6 = r3.A08
            java.lang.String r0 = "reactionsTrayController"
            if (r6 != 0) goto L_0x001b
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001b:
            java.lang.String r5 = r9.A02
            java.util.List r1 = r6.A0K
            int r0 = r6.A03
            java.lang.Object r7 = r1.get(r0)
            X.OFN r7 = (X.OFN) r7
            java.util.List r2 = r6.A03()
            boolean r0 = r2.contains(r5)
            if (r0 == 0) goto L_0x0042
            int r1 = r2.indexOf(r5)
            int r0 = r6.A03
            if (r1 == r0) goto L_0x0042
            int r1 = r2.indexOf(r5)
            java.lang.String r0 = r7.A00
            X.C71091OcD.A02(r6, r0, r1)
        L_0x0042:
            X.LNx r4 = r6.A0G
            if (r4 == 0) goto L_0x00f4
            X.OEv r0 = r4.A00
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = r0.A00
        L_0x004c:
            java.lang.String r0 = r7.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0066
            X.OEv r0 = r4.A00
            if (r0 == 0) goto L_0x0061
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r0.A01
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A02
            boolean r0 = r0.A03
            X.C71081Ob0.A00(r2, r1, r0)
        L_0x0061:
            java.util.Queue r0 = r4.A02
            r0.clear()
        L_0x0066:
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r1 = r7.A02
            r0 = 1
            X.5nL r4 = X.JTP.A0c(r1, r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A0U(r2, r1, r0)
            r4.A0V(r2, r1, r0)
            r0 = 100
            X.5nL r1 = r4.A0C(r0)
            X.PQO r0 = new X.PQO
            r0.<init>(r7, r6, r5)
            r1.A05 = r0
            r1.A0H()
            int r0 = r6.A03
            r6 = 0
            if (r0 != 0) goto L_0x0091
            r6 = 1
            X.C71085Ob8.A02(r3, r5)
        L_0x0091:
            X.7Pu r0 = r3.A09
            if (r0 == 0) goto L_0x00a1
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r0.A03
            android.view.ViewGroup r0 = r1.bottomSheetContainer
            if (r0 == 0) goto L_0x00a1
            X.0nA.A0N(r0)
            r1.DMt()
        L_0x00a1:
            X.3sy r0 = r3.A0T
            com.instagram.model.direct.DirectThreadKey r2 = X.C66647MaG.A04(r0)
            int r1 = r3.A0H
            r0 = 29
            if (r1 != r0) goto L_0x012f
            if (r2 == 0) goto L_0x012f
            com.instagram.common.session.UserSession r0 = r3.A0Q
            X.6gx r5 = X.C313746gw.A00(r0)
            int r4 = r3.A0E
            java.lang.String r3 = r2.A00
            java.lang.String r1 = r2.A01
            X.1Ln r2 = X.DbT.A0J(r5)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x012f
            X.DbW.A17(r2, r5)
            java.lang.String r0 = "reaction_replaced"
            X.DbV.A1M(r2, r0)
            java.lang.String r0 = "reaction_list"
            r2.A0p(r0)
            java.lang.String r0 = "reaction_sheet"
            java.lang.Long r0 = X.DbZ.A0b(r2, r0, r3, r1, r4)
            r2.A0i(r0)
            if (r6 == 0) goto L_0x00f1
            java.lang.String r1 = "True"
        L_0x00df:
            java.lang.String r0 = "is_double_tap"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            r2.A0w(r0)
            java.lang.String r0 = r5.A01
            r2.A0v(r0)
            r2.Cgf()
            return
        L_0x00f1:
            java.lang.String r1 = "False"
            goto L_0x00df
        L_0x00f4:
            r1 = 0
            goto L_0x004c
        L_0x00f7:
            java.lang.Object r5 = r8.A01
            X.OZT r5 = (X.OZT) r5
            X.OAW r0 = r5.A0C
            java.lang.String r4 = r9.A02
            java.lang.String r3 = "none"
            java.lang.String r2 = "overreact_tray"
            X.Meq r0 = r0.A00
            X.GME r1 = r0.A04
            if (r1 == 0) goto L_0x010d
            r0 = 0
            r1.A0I(r4, r3, r2, r0)
        L_0x010d:
            X.7Pu r0 = r5.A03
            if (r0 == 0) goto L_0x0115
            r0.A07()
            return
        L_0x0115:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x011a:
            X.OJm r4 = r3.A0S
            java.lang.String r2 = r9.A02
            java.lang.String r1 = "none"
            java.lang.String r0 = "overreact_tray"
            r4.A00(r2, r1, r0)
            X.7Pu r0 = r3.A09
            if (r0 == 0) goto L_0x0130
            r0.A07()
            r3.A03()
        L_0x012f:
            return
        L_0x0130:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72629PDi.DBt(X.6nL):void");
    }

    public final void Dis() {
        C331157Pu r0;
        if (this.A00 == 0 && (r0 = ((O7B) this.A01).A00.A02) != null) {
            r0.A07();
        }
    }
}
