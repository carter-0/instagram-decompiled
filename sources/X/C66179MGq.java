package X;

import android.content.Context;
import android.view.View;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.MGq  reason: case insensitive filesystem */
public final class C66179MGq extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66179MGq(Context context, 0xG r3, UserSession userSession, 2Er r5, A7D a7d, C328737Ga r7, User user, AnonymousClass4D7 r9) {
        super(2, r9);
        this.A02 = 4;
        this.A01 = a7d;
        this.A00 = userSession;
        this.A06 = user;
        this.A03 = r3;
        this.A04 = r7;
        this.A07 = r5;
        this.A05 = context;
    }

    public static void A00(C66179MGq mGq, int i) {
        ((View) mGq.A07).setVisibility(i);
        View view = (View) mGq.A03;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.4D7, X.MGq] */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.4D7, X.MGq] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r19) {
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8 = obj;
        AnonymousClass4D7 r15 = r19;
        switch (this.A02) {
            case 0:
                ? mGq = new C66179MGq((LithoView) this.A03, (C53335GmL) this.A04, (C52971GgO) this.A00, (UserSession) this.A07, (AnonymousClass4DU) this.A06, r15, (0sP) this.A05);
                mGq.A01 = obj8;
                return mGq;
            case 1:
                obj7 = this.A01;
                obj6 = this.A04;
                obj5 = this.A07;
                obj4 = this.A03;
                obj3 = this.A06;
                obj2 = this.A05;
                i = 1;
                break;
            case 2:
                obj7 = this.A01;
                obj6 = this.A04;
                obj2 = this.A05;
                obj3 = this.A06;
                obj4 = this.A03;
                obj5 = this.A07;
                i = 2;
                break;
            case 3:
                obj7 = this.A01;
                obj6 = this.A04;
                obj2 = this.A05;
                obj3 = this.A06;
                obj4 = this.A03;
                obj5 = this.A07;
                i = 3;
                break;
            default:
                UserSession userSession = (UserSession) this.A00;
                0xG r9 = (0xG) this.A03;
                C328737Ga r13 = (C328737Ga) this.A04;
                2Er r11 = (2Er) this.A07;
                return new C66179MGq((Context) this.A05, r9, userSession, r11, (A7D) this.A01, r13, (User) this.A06, r15);
        }
        C66179MGq mGq2 = new C66179MGq(obj7, obj6, obj5, obj4, obj3, obj2, r15, i);
        mGq2.A00 = obj8;
        return mGq2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a7, code lost:
        if (r1 != 0) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0351, code lost:
        if (r0 != null) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x043e, code lost:
        if (r7 == X.AnonymousClass05K.A0N) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0469, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a7, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f3, code lost:
        X.0qQ.A0F(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0232, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0239, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x046e;
                case 1: goto L_0x0257;
                case 2: goto L_0x01ba;
                case 3: goto L_0x00a8;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.0eS.A00(r19)
            java.lang.Object r9 = r0.A01
            X.A7D r9 = (X.A7D) r9
            com.instagram.user.follow.FollowButton r1 = r9.A03
            if (r1 == 0) goto L_0x0025
            X.4at r4 = r1.A0J
            if (r4 == 0) goto L_0x0025
            java.lang.Object r3 = r0.A00
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r0.A06
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.Object r1 = r0.A03
            X.0xG r1 = (X.0xG) r1
            r4.A03(r1, r3, r2)
        L_0x0025:
            com.instagram.user.follow.FollowButton r1 = r9.A03
            if (r1 == 0) goto L_0x003c
            X.4at r1 = r1.A0J
            if (r1 == 0) goto L_0x003c
            java.lang.Object r10 = r0.A00
            java.lang.Object r11 = r0.A07
            java.lang.Object r8 = r0.A04
            r7 = 0
            X.EUC r6 = new X.EUC
            r6.<init>(r7, r8, r9, r10, r11)
            r1.A07(r6)
        L_0x003c:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r9.A02
            if (r1 == 0) goto L_0x0053
            java.lang.Object r4 = r0.A04
            java.lang.Object r8 = r0.A05
            java.lang.Object r7 = r0.A06
            java.lang.Object r5 = r0.A00
            java.lang.Object r6 = r0.A07
            r3 = 1
            X.FOw r2 = new X.FOw
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.setPrimaryActionOnClickListener(r2)
        L_0x0053:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r9.A02
            if (r1 == 0) goto L_0x006a
            java.lang.Object r4 = r0.A04
            java.lang.Object r8 = r0.A05
            java.lang.Object r7 = r0.A06
            java.lang.Object r5 = r0.A00
            java.lang.Object r6 = r0.A07
            r3 = 2
            X.FOw r2 = new X.FOw
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.setSecondaryActionOnClickListener(r2)
        L_0x006a:
            java.lang.Object r10 = r0.A04
            X.2YL r10 = (X.2YL) r10
            X.6oS r5 = X.C318116oQ.A00(r10)
            r12 = 0
            r2 = 29
            X.MGe r1 = new X.MGe
            r1.<init>((java.lang.Object) r9, (java.lang.Object) r10, (X.AnonymousClass4D7) r12, (int) r2)
            X.19B r4 = X.19B.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.1Eo.A03(r3, r4, r1, r5)
            java.lang.Object r0 = r0.A06
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r11 = r0.getUsername()
            X.6oS r0 = X.C318116oQ.A00(r10)
            r13 = 41
            X.MGl r8 = new X.MGl
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.String) r11, (X.AnonymousClass4D7) r12, (int) r13)
            X.1Eo.A03(r3, r4, r8, r0)
            X.6oS r2 = X.C318116oQ.A00(r10)
            r1 = 30
            X.MGe r0 = new X.MGe
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r10, (X.AnonymousClass4D7) r12, (int) r1)
            X.1Eo.A03(r3, r4, r0, r2)
        L_0x00a5:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00a8:
            X.0eS.A00(r19)
            java.lang.Object r4 = r0.A00
            X.JV5 r4 = (X.JV5) r4
            boolean r1 = r4.A01
            java.lang.String r10 = "subtitleView"
            java.lang.String r9 = "viewModel"
            java.lang.String r8 = "titleView"
            r3 = 0
            r2 = 8
            if (r1 == 0) goto L_0x00e8
            java.lang.Object r5 = r0.A01
            X.K5o r5 = (X.C61394K5o) r5
            X.JiX r1 = r5.A02
            if (r1 == 0) goto L_0x0469
            int r4 = r1.A00
            r1 = 1
            if (r4 == r1) goto L_0x00e5
            r1 = 2
            if (r4 != r1) goto L_0x00d1
            java.lang.Object r1 = r0.A05
        L_0x00ce:
            X.JTO.A1a(r1, r3)
        L_0x00d1:
            android.widget.TextView r1 = r5.A01
            if (r1 == 0) goto L_0x0232
            r1.setVisibility(r2)
            android.widget.TextView r1 = r5.A00
            if (r1 == 0) goto L_0x01f3
            r1.setVisibility(r2)
            java.lang.Object r0 = r0.A06
            X.JTO.A1a(r0, r2)
            goto L_0x00a5
        L_0x00e5:
            java.lang.Object r1 = r0.A04
            goto L_0x00ce
        L_0x00e8:
            java.lang.Object r1 = r0.A04
            X.JTO.A1a(r1, r2)
            java.lang.Object r1 = r0.A05
            X.JTO.A1a(r1, r2)
            java.lang.Object r13 = r0.A01
            X.K5o r13 = (X.C61394K5o) r13
            android.widget.TextView r1 = r13.A01
            if (r1 == 0) goto L_0x0232
            r1.setVisibility(r3)
            android.widget.TextView r1 = r13.A00
            if (r1 == 0) goto L_0x01f3
            r1.setVisibility(r3)
            java.lang.Object r1 = r0.A06
            X.JTO.A1a(r1, r3)
            java.lang.Object r1 = r4.A00
            X.JwC r1 = (X.C61074JwC) r1
            java.lang.Object r7 = r1.A03
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.Object r6 = r1.A01
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.Object r5 = r1.A02
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.Object r14 = r1.A00
            android.widget.TextView r1 = r13.A01
            if (r1 == 0) goto L_0x0232
            r1.setVisibility(r2)
            android.widget.TextView r1 = r13.A00
            if (r1 == 0) goto L_0x01f3
            r1.setVisibility(r2)
            if (r7 == 0) goto L_0x013d
            android.widget.TextView r1 = r13.A01
            if (r1 == 0) goto L_0x0232
            r1.setVisibility(r3)
            android.widget.TextView r2 = r13.A01
            if (r2 == 0) goto L_0x0232
            int r1 = r7.intValue()
            X.DbU.A1G(r2, r13, r1)
        L_0x013d:
            if (r6 == 0) goto L_0x017f
            android.widget.TextView r1 = r13.A00
            if (r1 == 0) goto L_0x01f3
            r1.setVisibility(r3)
            if (r5 == 0) goto L_0x01ae
            if (r14 == 0) goto L_0x01ae
            int r1 = r5.intValue()
            java.lang.String r15 = X.DbU.A0m(r13, r1)
            int r1 = r6.intValue()
            java.lang.String r6 = X.DbV.A0z(r13, r15, r1)
            X.0qQ.A07(r6)
            android.widget.TextView r5 = r13.A00
            if (r5 == 0) goto L_0x01f3
            android.content.Context r2 = r5.getContext()
            android.content.Context r1 = r13.getContext()
            int r1 = X.2Yu.A06(r1)
            int r16 = r2.getColor(r1)
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            X.04x r11 = X.04x.A0I
            X.K94 r10 = new X.K94
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.AnonymousClass7AV.A07(r10, r5, r15, r6)
        L_0x017f:
            java.lang.Object r5 = r0.A03
            X.JlD r5 = (X.C60420JlD) r5
            java.lang.Object r2 = r4.A03
            java.util.Collection r2 = (java.util.Collection) r2
            X.0qQ.A0B(r2, r3)
            java.util.List r1 = r5.A02
            X.DbW.A0z(r5, r2, r1)
            X.JiX r1 = r13.A02
            if (r1 == 0) goto L_0x0469
            X.0Ud r1 = r1.A09
            boolean r1 = X.JTR.A1a(r1)
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r3 = r0.A07
            android.view.View r3 = (android.view.View) r3
            android.view.ViewTreeObserver r2 = r3.getViewTreeObserver()
            r1 = 4
            X.LYs r0 = new X.LYs
            r0.<init>(r1, r3, r13)
            r2.addOnGlobalLayoutListener(r0)
            goto L_0x00a5
        L_0x01ae:
            android.widget.TextView r2 = r13.A00
            if (r2 == 0) goto L_0x01f3
            int r1 = r6.intValue()
            X.DbU.A1G(r2, r13, r1)
            goto L_0x017f
        L_0x01ba:
            X.0eS.A00(r19)
            java.lang.Object r4 = r0.A00
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r6 = r0.A01
            X.K5o r6 = (X.C61394K5o) r6
            X.JiX r1 = r6.A02
            java.lang.String r10 = "viewModel"
            r12 = 0
            if (r1 == 0) goto L_0x01f3
            X.0r6 r3 = r1.A02
            r2 = 25
            X.MGX r1 = new X.MGX
            r1.<init>(r6, r12, r2)
            X.C51968G9o.A1P(r1, r4, r3)
            X.JiX r1 = r6.A02
            if (r1 == 0) goto L_0x01f3
            X.0Ud r1 = r1.A0A
            java.lang.Object r7 = r0.A04
            java.lang.Object r11 = r0.A05
            java.lang.Object r10 = r0.A06
            java.lang.Object r9 = r0.A03
            java.lang.Object r8 = r0.A07
            r13 = 3
            X.MGq r5 = new X.MGq
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (X.AnonymousClass4D7) r12, (int) r13)
            X.C51968G9o.A1P(r5, r4, r1)
            goto L_0x00a5
        L_0x01f3:
            X.0qQ.A0F(r10)
            goto L_0x0235
        L_0x01f7:
            java.lang.Object r1 = r0.A04
            X.JTP.A1O(r1, r2)
            A00(r0, r2)
            java.lang.Object r1 = r0.A06
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r1 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r1
            r1.A02(r2, r2)
            java.lang.Object r0 = r0.A05
            X.JTP.A1O(r0, r3)
            android.widget.TextView r0 = r1.A0B
            r0.setVisibility(r3)
            android.widget.ViewFlipper r0 = r5.A07
            if (r0 == 0) goto L_0x01f3
            r0.setDisplayedChild(r2)
            java.lang.Object r1 = r6.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0298
            boolean r0 = X.C59963JcW.A03(r5)
            if (r0 == 0) goto L_0x0298
            X.C59962JcV.A05(r5)
            X.LOy r7 = r5.A0N
            if (r7 == 0) goto L_0x0298
            java.util.List r9 = r5.A0V
            com.instagram.creation.base.ui.filterview.FilterViewContainer r1 = r5.A0B
            if (r1 != 0) goto L_0x023a
            java.lang.String r8 = "filterViewContainer"
        L_0x0232:
            X.0qQ.A0F(r8)
        L_0x0235:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x023a:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.Lkn r8 = new X.Lkn
            r8.<init>(r1, r5, r0)
            r0 = 25
            X.Jbg r10 = X.C59917Jbg.A00(r5, r0)
            r0 = 26
            X.Jbg r11 = X.C59917Jbg.A00(r5, r0)
            r0 = 27
            X.Jbg r12 = X.C59917Jbg.A00(r5, r0)
            r7.A02(r8, r9, r10, r11, r12)
            goto L_0x0298
        L_0x0257:
            X.0eS.A00(r19)
            java.lang.Object r6 = r0.A00
            X.JcX r6 = (X.C59964JcX) r6
            java.lang.Object r5 = r0.A01
            X.JcV r5 = (X.C59962JcV) r5
            boolean r1 = r5.A0Y
            java.lang.String r10 = "creationMainActionsFlipper"
            r9 = 1
            r2 = 0
            r3 = 8
            if (r1 == 0) goto L_0x041e
            java.lang.Object r1 = r6.A01
            int r7 = X.AnonymousClass7TE.A0M(r1)
            if (r7 == r2) goto L_0x03b9
            if (r7 == r9) goto L_0x0355
            r1 = 2
            if (r7 == r1) goto L_0x0391
            r4 = 3
            if (r7 == r4) goto L_0x0329
            r1 = 4
            if (r7 != r1) goto L_0x0499
            java.lang.Object r1 = r0.A04
            X.JTP.A1O(r1, r2)
            A00(r0, r2)
            java.lang.Object r1 = r0.A06
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r1 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r1
            r1.A02(r2, r2)
            java.lang.Object r0 = r0.A05
            X.JTP.A1O(r0, r3)
        L_0x0293:
            android.widget.TextView r0 = r1.A0B
        L_0x0295:
            r0.setVisibility(r3)
        L_0x0298:
            boolean r0 = r6.A03
            r10 = r0 ^ 1
            boolean r7 = r6.A05
            android.view.View r0 = r5.A05
            if (r0 == 0) goto L_0x02a9
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x02aa
        L_0x02a9:
            r0 = 0
        L_0x02aa:
            r0 = r0 ^ 1
            if (r10 == r0) goto L_0x02e9
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r8 = r5.A0C
            int r4 = X.JTQ.A00(r10)
            r0 = 200(0xc8, double:9.9E-322)
            X.0Ng r9 = X.C59250Ng.A00
            X.C61210lx.A02(r8, r9, r4, r0)
            android.view.View r8 = r5.A05
            int r4 = X.DbW.A00(r10)
            X.C61210lx.A02(r8, r9, r4, r0)
            com.instagram.common.ui.base.IgFrameLayout r1 = r5.A09
            if (r1 == 0) goto L_0x02cf
            int r0 = X.DbW.A01(r10)
            r1.setVisibility(r0)
        L_0x02cf:
            com.instagram.creation.base.ui.filterview.FilterViewContainer r0 = r5.A0B
            java.lang.String r9 = "filterViewContainer"
            if (r0 == 0) goto L_0x0469
            r0.setClipChildren(r10)
            if (r10 == 0) goto L_0x0314
            com.instagram.creation.base.ui.filterview.FilterViewContainer r0 = r5.A0B
            if (r0 == 0) goto L_0x0469
            android.view.View r1 = r0.A00
            if (r1 == 0) goto L_0x02e9
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x02e9
            r1.setVisibility(r2)
        L_0x02e9:
            android.view.View r0 = r5.A03
            if (r0 == 0) goto L_0x0306
            int r0 = r0.getVisibility()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r7 != r0) goto L_0x0306
        L_0x02f7:
            boolean r0 = r6.A04
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00a5
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            goto L_0x00a5
        L_0x0306:
            android.view.View r4 = r5.A03
            int r3 = X.DbW.A01(r7)
            r1 = 200(0xc8, double:9.9E-322)
            X.0Ng r0 = X.C59250Ng.A00
            X.C61210lx.A02(r4, r0, r3, r1)
            goto L_0x02f7
        L_0x0314:
            X.8Xk r0 = r5.A0H
            X.JTS.A1O(r0, r5)
            com.instagram.creation.base.ui.filterview.FilterViewContainer r0 = r5.A0B
            if (r0 == 0) goto L_0x0469
            android.view.View r1 = r0.A00
            if (r1 == 0) goto L_0x02e9
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x02e9
            r1.setVisibility(r3)
            goto L_0x02e9
        L_0x0329:
            boolean r1 = X.C59963JcW.A03(r5)
            if (r1 != 0) goto L_0x0298
            java.lang.Object r1 = r0.A04
            X.JTP.A1O(r1, r2)
            A00(r0, r2)
            java.lang.Object r1 = r0.A06
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r1 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r1
            r1.A02(r2, r2)
            java.lang.Object r0 = r0.A05
            X.JTP.A1O(r0, r3)
            android.widget.TextView r0 = r1.A0B
            r0.setVisibility(r3)
            android.widget.ViewFlipper r0 = r5.A07
            if (r0 == 0) goto L_0x01f3
            r0.setDisplayedChild(r4)
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x0298
            goto L_0x0295
        L_0x0355:
            boolean r1 = X.C59963JcW.A03(r5)
            if (r1 == 0) goto L_0x0360
            X.C59962JcV.A07(r5)
            goto L_0x0298
        L_0x0360:
            java.lang.Object r1 = r0.A04
            X.JTP.A1O(r1, r3)
            A00(r0, r3)
            java.lang.Object r4 = r0.A06
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r4 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r4
            r4.A02(r3, r2)
            java.lang.Object r0 = r0.A05
            X.JTP.A1O(r0, r2)
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x037b
            r0.setVisibility(r3)
        L_0x037b:
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131961425(0x7f132651, float:1.9559547E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A03(r0, r2)
            android.widget.ViewFlipper r0 = r5.A07
            if (r0 == 0) goto L_0x01f3
            r0.setDisplayedChild(r9)
            goto L_0x03b2
        L_0x0391:
            boolean r1 = X.C59963JcW.A03(r5)
            if (r1 != 0) goto L_0x0298
            java.lang.Object r1 = r0.A04
            X.JTP.A1O(r1, r3)
            java.lang.Object r1 = r0.A07
            X.JTO.A1a(r1, r3)
            java.lang.Object r1 = r0.A05
            X.JTP.A1O(r1, r3)
            java.lang.Object r0 = r0.A03
            X.JTP.A1O(r0, r3)
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x03b2
            r0.setVisibility(r3)
        L_0x03b2:
            X.8Xk r0 = r5.A0H
            X.JTS.A1O(r0, r5)
            goto L_0x0298
        L_0x03b9:
            boolean r1 = X.C59962JcV.A0B(r5)
            if (r1 == 0) goto L_0x01f7
            X.0eM r1 = r5.A0j
            boolean r4 = X.AnonymousClass7TF.A1Z(r1)
            java.lang.Object r1 = r0.A04
            android.view.View r1 = (android.view.View) r1
            if (r4 == 0) goto L_0x03f4
            if (r1 == 0) goto L_0x03d0
            r1.setVisibility(r2)
        L_0x03d0:
            A00(r0, r2)
            java.lang.Object r1 = r0.A06
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r1 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r1
            r1.A02(r2, r2)
            java.lang.Object r0 = r0.A05
            X.JTP.A1O(r0, r3)
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x03e6
            r0.setVisibility(r3)
        L_0x03e6:
            android.widget.TextView r0 = r1.A0B
            r0.setVisibility(r3)
        L_0x03eb:
            android.widget.ViewFlipper r0 = r5.A07
            if (r0 == 0) goto L_0x01f3
            r0.setDisplayedChild(r2)
            goto L_0x0298
        L_0x03f4:
            if (r1 == 0) goto L_0x03f9
            r1.setVisibility(r3)
        L_0x03f9:
            A00(r0, r3)
            java.lang.Object r4 = r0.A06
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r4 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r4
            r4.A02(r2, r2)
            java.lang.Object r0 = r0.A05
            X.JTP.A1O(r0, r3)
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x040f
            r0.setVisibility(r2)
        L_0x040f:
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131962420(0x7f132a34, float:1.9561565E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A03(r0, r2)
            goto L_0x03eb
        L_0x041e:
            java.lang.Object r7 = r0.A04
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto L_0x042f
            java.lang.Object r4 = r6.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            boolean r1 = X.AnonymousClass7TF.A1W(r4, r1)
            r7.setSelected(r1)
        L_0x042f:
            java.lang.Object r8 = r0.A05
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto L_0x0444
            java.lang.Object r7 = r6.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r7 == r1) goto L_0x0440
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            r1 = 0
            if (r7 != r4) goto L_0x0441
        L_0x0440:
            r1 = 1
        L_0x0441:
            r8.setSelected(r1)
        L_0x0444:
            java.lang.Object r7 = r6.A01
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r7 != r1) goto L_0x0455
            java.lang.Object r0 = r0.A06
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r0 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r0
            r0.A02(r3, r9)
            goto L_0x0298
        L_0x0455:
            android.widget.ViewFlipper r4 = r5.A07
            if (r4 == 0) goto L_0x01f3
            int r1 = r7.intValue()
            r4.setDisplayedChild(r1)
            java.lang.Object r1 = r0.A06
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r1 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r1
            r1.A02(r2, r9)
            goto L_0x0293
        L_0x0469:
            X.0qQ.A0F(r9)
            goto L_0x0235
        L_0x046e:
            X.0eS.A00(r19)
            java.lang.Object r4 = r0.A01
            X.7ac r4 = (X.C334067ac) r4
            java.lang.Object r1 = r0.A03
            com.facebook.litho.LithoView r1 = (com.facebook.litho.LithoView) r1
            java.lang.Object r5 = r0.A07
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r3 = r0.A00
            X.GgO r3 = (X.C52971GgO) r3
            java.lang.Object r6 = r0.A06
            X.4DU r6 = (X.AnonymousClass4DU) r6
            java.lang.Object r7 = r0.A05
            X.0sP r7 = (X.0sP) r7
            java.lang.Object r0 = r0.A04
            X.GmL r0 = (X.C53335GmL) r0
            boolean r8 = r0.A0e
            X.7bR r2 = new X.7bR
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.setComponentAsync(r2)
            goto L_0x00a5
        L_0x0499:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66179MGq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66179MGq) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66179MGq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, AnonymousClass4D7 r8, int i) {
        super(2, r8);
        this.A02 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A07 = obj3;
        this.A03 = obj4;
        this.A06 = obj5;
        this.A05 = obj6;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66179MGq(LithoView lithoView, C53335GmL gmL, C52971GgO ggO, UserSession userSession, AnonymousClass4DU r6, AnonymousClass4D7 r7, 0sP r8) {
        super(2, r7);
        this.A02 = 0;
        this.A03 = lithoView;
        this.A07 = userSession;
        this.A00 = ggO;
        this.A06 = r6;
        this.A05 = r8;
        this.A04 = gmL;
    }
}
