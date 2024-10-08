package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

public abstract class GT9 extends AnonymousClass4DH implements AnonymousClass4DR, C268594df, C273504mg, C273494mf, AnonymousClass0j6, AnonymousClass4DS, C252213ok {
    public static final String __redex_internal_original_name = "CommentListBottomsheetBaseFragment";
    public C53368Gms A00 = new C53368Gms(0, 0, 7);
    public C59544JNq A01;
    public C62320sa A02;
    public AnonymousClass3KQ A03;
    public boolean A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = A00(this, 39);
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final 0sP A0B;
    public final int A0C;
    public final AnonymousClass0eM A0D = A00(this, 34);
    public final AnonymousClass0eM A0E;

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0196, code lost:
        if (r4 != null) goto L_0x0191;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r26) {
        /*
            r25 = this;
            r2 = 0
            r3 = r26
            X.0qQ.A0B(r3, r2)
            r7 = r25
            X.37D r0 = X.DbX.A0i(r7)
            X.7Pu r0 = X.C48943Emh.A00(r0)
            X.0eM r1 = r7.A0A
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r1)
            X.0eM r1 = r7.A09
            java.lang.Object r9 = r1.getValue()
            X.I03 r9 = (X.I03) r9
            X.GmL r11 = r7.A03()
            X.GgO r1 = r7.A04()
            X.0Ud r1 = r1.A0T
            java.lang.Object r1 = r1.getValue()
            X.7ae r1 = (X.C334087ae) r1
            X.GgO r6 = r7.A04()
            X.C51974G9v.A1M(r10, r9, r11)
            r4 = 6
            X.0qQ.A0B(r1, r4)
            r8 = 7
            X.0qQ.A0B(r6, r8)
            boolean r4 = r1 instanceof X.C335437cx
            if (r4 == 0) goto L_0x01bb
            if (r0 == 0) goto L_0x017d
            X.7cx r1 = (X.C335437cx) r1
            X.0Tu r8 = X.0Tu.A05
            r4 = 36323032344242945(0x810b9b000b2b01, double:3.0341701433861996E-306)
            boolean r14 = X.182.A06(r8, r10, r4)
            boolean r4 = r11.A0d
            if (r4 != 0) goto L_0x00a9
            java.lang.StringBuilder r12 = X.AnonymousClass7TE.A1A()
            boolean r4 = X.1CI.A00(r10)
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0066
            boolean r4 = r7 instanceof X.C54218H3n
            if (r4 == 0) goto L_0x0066
            java.lang.String r5 = "[C] "
        L_0x0066:
            r12.append(r5)
            boolean r4 = r9.A05
            if (r4 == 0) goto L_0x01b2
            java.lang.Integer r4 = r9.A02
            if (r4 == 0) goto L_0x01b2
            android.content.Context r8 = r7.requireContext()
            int r4 = r4.intValue()
            r5 = 1
            java.lang.String r11 = "❏ "
            int r4 = r4 + 1
            java.lang.String r11 = X.002.A0O(r11, r4)
            r4 = 2131956425(0x7f1312c9, float:1.9549405E38)
            java.lang.String r4 = X.DbW.A0h(r8, r11, r4)
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r4)
            r4 = 10063(0x274f, float:1.4101E-41)
            int r11 = X.00l.A04(r13, r4, r2)
            r4 = -1
            if (r11 == r4) goto L_0x00a2
            android.text.style.ImageSpan r8 = X.C393839x5.A00(r8, r5, r5)
            int r5 = r11 + 1
            r4 = 33
            r13.setSpan(r8, r11, r5, r4)
        L_0x00a2:
            java.lang.String r4 = X.AnonymousClass7TF.A0i(r13, r12)
            r0.A0M(r4)
        L_0x00a9:
            boolean r4 = r1.A03
            r16 = 0
            if (r4 == 0) goto L_0x01ae
            r4 = 1
            java.lang.String r18 = ""
            X.7Ps r15 = new X.7Ps
            r17 = r16
            r19 = r2
            r20 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            r15.A0A = r4
            r5 = 28
            X.FPE r4 = new X.FPE
            r4.<init>((int) r5, (java.lang.Object) r7, (java.lang.Object) r10)
            r15.A05 = r4
            if (r14 == 0) goto L_0x01a7
            android.content.Context r11 = r7.requireContext()
            X.XDU r8 = X.XDU.A4o
            X.GOf r5 = X.C52337GOf.OUTLINE
            X.GOg r4 = X.GOg.SIZE_16
            android.graphics.drawable.Drawable r4 = X.C14091Tpi.A00(r11, r8, r4, r5)
            X.0qQ.A07(r4)
            r15.A04 = r4
            r4 = 4
            r15.A00 = r4
        L_0x00e0:
            X.7Pt r5 = r15.A00()
        L_0x00e4:
            boolean r4 = r1.A02
            if (r4 == 0) goto L_0x01a4
            X.1Xj r11 = r1.A00
            r8 = 1
            java.lang.String r18 = ""
            X.7Ps r15 = new X.7Ps
            r17 = r16
            r19 = r2
            r20 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            r15.A0A = r8
            r4 = 2131956359(0x7f131287, float:1.9549271E38)
            java.lang.String r4 = X.DbU.A0m(r7, r4)
            r15.A07 = r4
            X.ICB r4 = new X.ICB
            r18 = r8
            r19 = r9
            r20 = r7
            r21 = r11
            r22 = r10
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            r15.A05 = r4
            if (r14 == 0) goto L_0x019e
            android.content.Context r10 = r7.requireContext()
            X.XDU r9 = X.XDU.A5k
            X.GOf r8 = X.C52337GOf.OUTLINE
            X.GOg r4 = X.GOg.SIZE_16
            android.graphics.drawable.Drawable r4 = X.C14091Tpi.A00(r10, r9, r4, r8)
            X.0qQ.A07(r4)
            r15.A04 = r4
            r4 = 4
            r15.A00 = r4
        L_0x012e:
            X.7Pt r4 = r15.A00()
        L_0x0132:
            boolean r1 = r1.A01
            if (r1 == 0) goto L_0x0188
            r9 = 1
            java.lang.String r18 = ""
            X.7Ps r15 = new X.7Ps
            r17 = r16
            r19 = r2
            r20 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            r1 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r1 = r7.getString(r1)
            r15.A06 = r1
            r15.A0A = r9
            r8 = 16
            X.ICx r1 = new X.ICx
            r1.<init>(r6, r8)
            r15.A05 = r1
            X.7Pt r6 = r15.A00()
            X.7Ps r15 = new X.7Ps
            r15.<init>(r16, r17, r18, r19, r20)
            X.7Pt r1 = r15.A00()
            r0.A0I(r1)
            r0.A0K(r6, r9)
        L_0x016b:
            if (r14 == 0) goto L_0x017d
            int r1 = X.DbZ.A02(r7)
            if (r5 != 0) goto L_0x0181
            if (r4 != 0) goto L_0x0181
            if (r6 != 0) goto L_0x0181
            X.HX1.A00(r0)
            r0.A0A(r1, r1)
        L_0x017d:
            r3.Etr(r2)
        L_0x0180:
            return
        L_0x0181:
            r0.A06()
            r0.A0A(r1, r2)
            goto L_0x017d
        L_0x0188:
            r6 = r16
            if (r5 == 0) goto L_0x0196
            if (r4 == 0) goto L_0x0199
            r0.A0I(r5)
        L_0x0191:
            r1 = 1
            r0.A0K(r4, r1)
            goto L_0x016b
        L_0x0196:
            if (r4 == 0) goto L_0x016b
            goto L_0x0191
        L_0x0199:
            r1 = 1
            r0.A0K(r5, r1)
            goto L_0x016b
        L_0x019e:
            r4 = 2131238568(0x7f081ea8, float:1.8093418E38)
            r15.A02 = r4
            goto L_0x012e
        L_0x01a4:
            r4 = r16
            goto L_0x0132
        L_0x01a7:
            r4 = 2131238465(0x7f081e41, float:1.809321E38)
            r15.A02 = r4
            goto L_0x00e0
        L_0x01ae:
            r5 = r16
            goto L_0x00e4
        L_0x01b2:
            r4 = 2131964352(0x7f1331c0, float:1.9565483E38)
            java.lang.String r13 = X.DbU.A0m(r7, r4)
            goto L_0x00a2
        L_0x01bb:
            boolean r4 = r1 instanceof X.C335447cy
            if (r4 == 0) goto L_0x032c
            android.content.Context r5 = r7.requireContext()
            X.7cy r1 = (X.C335447cy) r1
            android.content.res.Resources r10 = r5.getResources()     // Catch:{ NotFoundException -> 0x01df }
            r9 = 2131821034(0x7f1101ea, float:1.92748E38)
            int r7 = r1.A00     // Catch:{ NotFoundException -> 0x01df }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ NotFoundException -> 0x01df }
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch:{ NotFoundException -> 0x01df }
            java.lang.String r4 = r10.getQuantityString(r9, r7, r4)     // Catch:{ NotFoundException -> 0x01df }
            if (r4 == 0) goto L_0x01df
            r3.setTitle(r4)
        L_0x01df:
            java.lang.Integer r16 = X.AnonymousClass05K.A0C
            r10 = 0
            r4 = 2131099701(0x7f060035, float:1.7811763E38)
            int r4 = r5.getColor(r4)
            android.graphics.drawable.ColorDrawable r13 = X.C51965G9l.A0D(r4)
            r4 = 2131100036(0x7f060184, float:1.7812442E38)
            int r17 = r5.getColor(r4)
            r4 = 2131099815(0x7f0600a7, float:1.7811994E38)
            int r19 = r5.getColor(r4)
            X.ICn r15 = X.C56790ICn.A00
            r7 = 2131239025(0x7f082071, float:1.8094345E38)
            r4 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r4 = r5.getColor(r4)
            android.graphics.ColorFilter r12 = X.AnonymousClass37O.A00(r4)
            r18 = -2
            r4 = 1
            X.57Z r9 = new X.57Z
            r11 = r10
            r14 = r10
            r20 = r18
            r21 = r7
            r22 = r18
            r23 = r18
            r24 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3.ErJ(r9)
            java.util.List r1 = r1.A01
            java.util.List r1 = X.00k.A0Y(r1)
            java.util.Iterator r12 = r1.iterator()
        L_0x022c:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0323
            java.lang.Object r9 = r12.next()
            X.JLf r9 = (X.C59481JLf) r9
            r1 = 2131100036(0x7f060184, float:1.7812442E38)
            int r11 = r5.getColor(r1)
            X.IMz r1 = X.C57059IMz.A00
            boolean r1 = X.0qQ.A0K(r9, r1)
            if (r1 == 0) goto L_0x025c
            X.3JR r10 = X.DbS.A0K()
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            r10.A02(r1)
            r10.A02 = r11
            r11 = 4
        L_0x0253:
            X.ID2 r1 = new X.ID2
            r1.<init>((int) r11, (java.lang.Object) r6, (java.lang.Object) r9)
        L_0x0258:
            X.DbX.A19(r1, r10, r3)
            goto L_0x022c
        L_0x025c:
            boolean r1 = X.C53495GpR.A00(r4, r9)
            if (r1 == 0) goto L_0x026f
            X.3JR r10 = X.DbS.A0K()
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            r10.A02(r1)
            r10.A02 = r11
            r11 = 5
            goto L_0x0253
        L_0x026f:
            boolean r1 = r9 instanceof X.C53494GpQ
            if (r1 == 0) goto L_0x0292
            X.3JR r10 = X.DbS.A0K()
            r1 = r9
            X.GpQ r1 = (X.C53494GpQ) r1
            boolean r11 = r1.A03
            r1 = 2131238644(0x7f081ef4, float:1.8093573E38)
            if (r11 == 0) goto L_0x0284
            r1 = 2131238643(0x7f081ef3, float:1.809357E38)
        L_0x0284:
            r10.A06 = r1
            r1 = 2131969457(0x7f1345b1, float:1.9575837E38)
            if (r11 == 0) goto L_0x028e
            r1 = 2131975960(0x7f135f18, float:1.9589027E38)
        L_0x028e:
            r10.A05 = r1
            r11 = 6
            goto L_0x0253
        L_0x0292:
            boolean r1 = X.C53495GpR.A00(r2, r9)
            if (r1 == 0) goto L_0x02ac
            X.3JR r10 = X.DbS.A0K()
            r1 = 2131238125(0x7f081ced, float:1.809252E38)
            r10.A06 = r1
            r1 = 2131956372(0x7f131294, float:1.9549298E38)
            r10.A05 = r1
            X.ID2 r1 = new X.ID2
            r1.<init>((int) r8, (java.lang.Object) r6, (java.lang.Object) r9)
            goto L_0x0258
        L_0x02ac:
            X.IMx r1 = X.C57057IMx.A00
            boolean r1 = X.0qQ.A0K(r9, r1)
            if (r1 == 0) goto L_0x02c5
            X.3JR r10 = X.DbS.A0K()
            r1 = 2131238721(0x7f081f41, float:1.8093729E38)
            r10.A06 = r1
            r1 = 2131956374(0x7f131296, float:1.9549302E38)
            r10.A05 = r1
            r11 = 8
            goto L_0x0253
        L_0x02c5:
            X.IN1 r1 = X.IN1.A00
            boolean r1 = X.0qQ.A0K(r9, r1)
            if (r1 == 0) goto L_0x02df
            X.3JR r10 = X.DbS.A0K()
            r1 = 2131238596(0x7f081ec4, float:1.8093475E38)
            r10.A06 = r1
            r1 = 2131956401(0x7f1312b1, float:1.9549357E38)
            r10.A05 = r1
            r11 = 9
            goto L_0x0253
        L_0x02df:
            X.IMy r1 = X.C57058IMy.A00
            boolean r1 = X.0qQ.A0K(r9, r1)
            if (r1 == 0) goto L_0x02f6
            X.3JR r10 = X.DbS.A0K()
            r10.A06 = r7
            r1 = 2131956395(0x7f1312ab, float:1.9549345E38)
            r10.A05 = r1
            r11 = 10
            goto L_0x0253
        L_0x02f6:
            X.IN2 r1 = X.IN2.A00
            boolean r1 = X.0qQ.A0K(r9, r1)
            if (r1 != 0) goto L_0x022c
            X.IN0 r1 = X.IN0.A00
            boolean r1 = X.0qQ.A0K(r9, r1)
            if (r1 != 0) goto L_0x022c
            X.IN3 r1 = X.IN3.A00
            boolean r1 = X.0qQ.A0K(r9, r1)
            if (r1 != 0) goto L_0x022c
            boolean r1 = X.C53496GpS.A00(r4, r9)
            if (r1 != 0) goto L_0x022c
            boolean r1 = r9 instanceof X.C53493GpP
            if (r1 != 0) goto L_0x022c
            boolean r1 = X.C53496GpS.A00(r2, r9)
            if (r1 != 0) goto L_0x022c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0323:
            r3.Etr(r4)
            if (r0 == 0) goto L_0x0180
            X.HX1.A00(r0)
            return
        L_0x032c:
            X.7ad r0 = X.C334077ad.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0180
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GT9.configureActionBar(X.2da):void");
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final void onBottomSheetClosed() {
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH4(07U.A04, this, viewLifecycleOwner, (AnonymousClass4D7) null, 23), AnonymousClass07a.A00(viewLifecycleOwner));
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A06)).A9Y(this);
        AnonymousClass0eM r3 = this.A09;
        C334537bS r1 = new C334537bS(this, AnonymousClass7TE.A0l(this.A0A), I03.A00(r3));
        AnonymousClass1L1 r0 = ((I03) r3.getValue()).A01;
        0qQ.A0B(r0, 0);
        r1.A00 = r0;
        registerLifecycleListener(r1);
        super.onViewCreated(view, bundle);
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C58680Ivp(obj, i));
    }

    public final C53335GmL A03() {
        return (C53335GmL) this.A0D.getValue();
    }

    public final C52971GgO A04() {
        return (C52971GgO) this.A0E.getValue();
    }

    public final UserSession A05() {
        return AnonymousClass7TE.A0l(this.A0A);
    }

    public final void A06(C53368Gms gms) {
        int i;
        boolean z = this instanceof C54219H3o;
        0qQ.A0B(gms, 0);
        View view = this.mView;
        if (z) {
            if (view != null) {
                i = gms.A01 + gms.A00;
            } else {
                return;
            }
        } else if (view != null) {
            i = gms.A00;
        } else {
            return;
        }
        0nA.A0X(view, i);
        view.requestLayout();
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final int AqL() {
        return this.A0C;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return false;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final void DMr(int i, boolean z) {
        boolean z2 = this.A04;
        boolean A1W = C51970G9q.A1W(i, AnonymousClass2uJ.A01);
        this.A04 = A1W;
        if (!A1W && z2 && A03().A0N) {
            Context context = getContext();
            if (context != null) {
                DbX.A14(context, AnonymousClass37D.A00);
            }
        } else if (z) {
            C53368Gms gms = new C53368Gms(i, this.A00.A00, 7);
            this.A00 = gms;
            A06(gms);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final String getModuleName() {
        return I03.A00(this.A09).getModuleName();
    }

    public final AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0A);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final boolean isScrolledToBottom() {
        if (this.mView != null) {
            return A04().A00.A01;
        }
        return true;
    }

    public final boolean isScrolledToTop() {
        if (this.mView != null) {
            return A04().A00.A02;
        }
        return true;
    }

    public final boolean onBackPressed() {
        C334657be r3 = (C334657be) this.A05.getValue();
        if (r3.A01 == null) {
            return false;
        }
        C334657be.A02(r3, false);
        return true;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C53368Gms gms = new C53368Gms(this.A00.A01, i, 7);
        this.A00 = gms;
        A06(gms);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public GT9() {
        0eO r3 = 0eO.A02;
        this.A07 = AnonymousClass0eN.A00(r3, new C58680Ivp(this, 37));
        this.A06 = A00(this, 36);
        this.A05 = A00(this, 35);
        this.A08 = A00(this, 38);
        C58680Ivp ivp = new C58680Ivp(this, 43);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C58680Ivp(new C58680Ivp(this, 40), 41));
        this.A0E = DbS.A0I(new C58680Ivp(A002, 42), ivp, new C58188Ins(27, (Object) null, A002), DbS.A0z(C52971GgO.class));
        this.A0B = new J6O(this, 32);
        this.A0C = IgNetworkConsentStorage.MAX_ENTRIES;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final View C4U() {
        return requireView();
    }

    public final 0jB E4x() {
        0jB A0k = C51965G9l.A0k();
        A0k.A04(new 0j9(AnonymousClass05K.A0u, "media_id"), A03().A0E);
        return A0k;
    }

    public final int getExtraDragSpace() {
        AnonymousClass37D r0;
        int i;
        View view;
        TextView A0L;
        FragmentActivity activity = getActivity();
        AnonymousClass37D r1 = null;
        if (activity != null) {
            r0 = DbT.A0i(activity);
        } else {
            r0 = null;
        }
        C331157Pu A002 = C48943Emh.A00(r0);
        int i2 = 0;
        if (A002 == null || (A0L = A002.A03.A0L()) == null) {
            i = 0;
        } else {
            i = A0L.getHeight();
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            r1 = DbT.A0i(activity2);
        }
        C331157Pu A003 = C48943Emh.A00(r1);
        if (A003 != null) {
            BottomSheetFragment bottomSheetFragment = A003.A03;
            C252063oV r12 = bottomSheetFragment.elementAboveTitleView;
            if (!(!bottomSheetFragment.isAdded() || r12 == null || (view = r12.getView()) == null)) {
                i2 = view.getHeight();
            }
        }
        return i + i2;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = -1059788139(0xffffffffc0d4ea95, float:-6.6536355)
            int r6 = X.AnonymousClass0fD.A02(r0)
            X.0eM r4 = r10.A09
            java.lang.Object r0 = r4.getValue()
            X.I03 r0 = (X.I03) r0
            java.lang.String r0 = r0.A04
            r10.setModuleNameV2(r0)
            X.0eM r0 = r10.A07
            java.lang.Object r3 = r0.getValue()
            X.MYU r3 = (X.MYU) r3
            android.content.Context r2 = r10.requireContext()
            X.0eM r0 = r10.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2cc r1 = X.C71342cb.A00(r0)
            X.4DU r0 = X.I03.A00(r4)
            r3.A0O(r2, r1, r0, r10)
            X.GT9.super.onCreate(r11)
            X.GgO r7 = r10.A04()
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = r7.A0A
            r1 = 49
            X.Inh r0 = new X.Inh
            r0.<init>(r7, r1)
            r5.A0S(r0)
            X.GmL r4 = r7.A08
            boolean r0 = r4.A0e
            if (r0 == 0) goto L_0x0051
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x0051
            r5.A0E()
        L_0x0051:
            X.05G r0 = r5.A0H
            java.lang.Object r0 = r0.getValue()
            X.7aH r0 = (X.C333867aH) r0
            X.7aC r0 = r0.A03
            X.7aB r0 = r0.A00
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0081
            com.instagram.common.session.UserSession r3 = r5.A0B
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322023026337686(0x810ab000022796, double:3.033531846678717E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0081
            X.GmL r0 = r5.A04
            boolean r0 = r0.A0a
            if (r0 == 0) goto L_0x0117
            r0 = 36322023026403223(0x810ab000032797, double:3.0335318467201626E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0117
        L_0x0081:
            X.7aO r1 = r7.A0I
            if (r1 == 0) goto L_0x0092
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0092
            boolean r0 = X.C52971GgO.A06(r7)
            if (r0 == 0) goto L_0x0092
            r5.A0I(r1)
        L_0x0092:
            X.7a5 r8 = r7.A0B
            r1 = 13
            X.J6I r0 = new X.J6I
            r0.<init>(r7, r1)
            r8.A00(r0)
            r1 = 21
            X.J6I r0 = new X.J6I
            r0.<init>(r7, r1)
            r8.A00(r0)
            X.7a3 r2 = r7.A09
            java.lang.String r1 = r4.A0E
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.7a2 r0 = r2.A00
            java.util.Map r0 = r0.A00
            java.lang.Object r9 = r0.get(r1)
            X.9JD r9 = (X.AnonymousClass9JD) r9
            if (r9 == 0) goto L_0x010e
            java.lang.String r1 = r9.A02
            if (r1 == 0) goto L_0x00d4
            r0 = 19
            X.PmT r4 = new X.PmT
            r4.<init>(r7, r9, r1, r0)
            X.4Cq r3 = r5.A01
            r2 = 0
            r1 = 15
            X.MH4 r0 = new X.MH4
            r0.<init>((X.AnonymousClass4D7) r2, (java.lang.Object) r4, (java.lang.Object) r5, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x00d4:
            X.05G r3 = r7.A0P
            java.lang.Object r2 = r9.A01
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r1 = r9.A00
            X.7a4 r1 = (X.AnonymousClass7a4) r1
            X.7ce r0 = new X.7ce
            r0.<init>(r1, r2)
        L_0x00e3:
            r3.Epw(r0)
        L_0x00e6:
            X.0Rd r1 = r7.A0F
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0107
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323328696265815(0x810be000002c57, double:3.0343575575987764E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0107
            r1 = 14
            X.J6I r0 = new X.J6I
            r0.<init>(r7, r1)
            r8.A01(r0)
        L_0x0107:
            r0 = 261053310(0xf8f5b7e, float:1.413613E-29)
            X.AnonymousClass0fD.A09(r0, r6)
            return
        L_0x010e:
            boolean r0 = r4.A0M
            if (r0 == 0) goto L_0x00e6
            X.05G r3 = r7.A0P
            X.7cf r0 = X.C335257cf.A00
            goto L_0x00e3
        L_0x0117:
            r0 = 36322023026272149(0x810ab000012795, double:3.033531846637271E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x013a
            X.7a5 r0 = r5.A05
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x0081
            X.1Xj r0 = r0.BPf()
            if (r0 == 0) goto L_0x0081
            java.util.List r0 = r0.A3f()
            if (r0 == 0) goto L_0x013a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0081
        L_0x013a:
            X.4Cq r3 = r5.A01
            r2 = 0
            r1 = 20
            X.MG7 r0 = new X.MG7
            r0.<init>(r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GT9.onCreate(android.os.Bundle):void");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2041895805);
        C334657be r2 = (C334657be) this.A05.getValue();
        if (r2.A01 != null) {
            C334657be.A02(r2, false);
        }
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A06)).EEH(this);
        super.onDestroyView();
        AnonymousClass0fD.A09(17200009, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-393920373);
        GT9.super.onPause();
        C52971GgO A042 = A04();
        A042.A0B.A01(new J6I(A042, 11));
        AnonymousClass0eM r2 = this.A08;
        ((AnonymousClass3KG) r2.getValue()).A06(this.A03);
        ((AnonymousClass3KG) r2.getValue()).A04();
        this.A03 = null;
        AnonymousClass0fD.A09(1842539665, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1734491212);
        super.onResume();
        C53368Gms gms = this.A00;
        this.A00 = gms;
        A06(gms);
        AnonymousClass0eM r1 = this.A08;
        ((AnonymousClass3KG) r1.getValue()).A03();
        r1.getValue();
        this.A03 = AnonymousClass3KG.A00(new C335427cw(this));
        AnonymousClass3KQ r12 = this.A03;
        0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.common.screenshot.ScreenshotSession");
        ((AnonymousClass3KG) r1.getValue()).A05(r12);
        AnonymousClass0fD.A09(-14797507, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1281232495);
        GT9.super.onStart();
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A06)).DmJ(requireActivity());
        AnonymousClass0fD.A09(1895113042, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1232633196);
        GT9.super.onStop();
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A06)).onStop();
        AnonymousClass0fD.A09(-1306877510, A022);
    }
}
