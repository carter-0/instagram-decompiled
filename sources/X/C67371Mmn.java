package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mmn  reason: case insensitive filesystem */
public final class C67371Mmn extends C232222tE {
    public final XBt A00;
    public final X41 A01;
    public final 0sP A02;
    public final 0sI A03;
    public final 0sI A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;

    /* JADX WARNING: type inference failed for: r18v0, types: [android.view.View] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0013: MOVE  (r4v0 int) = (r28v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A00(X.C296995qz r25, X.HAU r26, com.instagram.igds.components.imagebutton.IgImageButton r27, int r28) {
        /*
            r24 = this;
            r3 = 0
            r16 = r27
            boolean r5 = X.DbW.A1Z(r16)
            r10 = r26
            X.5u2 r11 = r10.A02
            java.util.List r0 = r11.A05
            if (r0 == 0) goto L_0x00ad
            int r0 = r0.size()
            r4 = r28
            if (r0 < r4) goto L_0x00ad
            r0 = r25
            int r0 = r0.A01
            X.5qz r8 = new X.5qz
            r8.<init>(r0, r4)
            java.util.List r0 = r11.A05
            X.0qQ.A0A(r0)
            java.lang.Object r15 = r0.get(r4)
            X.1Xj r15 = (X.1Xj) r15
            r9 = r24
            com.instagram.common.session.UserSession r14 = r9.A06
            X.1se r0 = X.1sd.A00(r14)
            boolean r0 = r0.A05(r15)
            if (r0 == 0) goto L_0x004c
            X.0iw r6 = r9.A05
            int r0 = r8.A01
            X.AnonymousClass7TF.A1B(r15, r5, r6)
            r5 = 0
            r7 = r15
            r8 = r16
            r9 = r0
            r10 = r4
            r11 = r3
            r12 = r3
            X.OSK.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x004c:
            X.5qq r7 = X.C296895qp.A02(r5, r5)
            X.X41 r6 = r9.A01
            r2 = 0
            X.5ow r0 = X.C295805ow.UNKNOWN
            X.5ov r1 = new X.5ov
            r1.<init>(r0, r2, r11, r2)
            r1.A01()
            X.5qy r0 = new X.5qy
            r0.<init>(r7, r1, r15)
            r17 = r6
            r18 = r16
            r19 = r8
            r20 = r7
            r21 = r0
            r22 = r3
            r17.ECL(r18, r19, r20, r21, r22)
            X.ICQ r11 = new X.ICQ
            r17 = r11
            r18 = r15
            r20 = r9
            r21 = r8
            r22 = r4
            r23 = r3
            r19 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.IDZ r12 = new X.IDZ
            r17 = r12
            r18 = r4
            r19 = r3
            r20 = r15
            r22 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            int r1 = r8.A01
            X.0iw r13 = r9.A05
            r17 = 1065353216(0x3f800000, float:1.0)
            X.AnonymousClass7TF.A1B(r14, r3, r15)
            r0 = 11
            X.0qQ.A0B(r13, r0)
            r21 = r3
            r18 = r1
            r19 = r4
            r20 = r5
            X.C321466uD.A03(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x00ad:
            X.C321466uD.A04(r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67371Mmn.A00(X.5qz, X.HAU, com.instagram.igds.components.imagebutton.IgImageButton, int):void");
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        HAU hau = (HAU) r10;
        C68027Myt myt = (C68027Myt) r11;
        boolean A1U = AnonymousClass7TF.A1U(0, hau, myt);
        C296995qz B9n = this.A00.B9n(hau);
        this.A01.ECL(JTO.A0F(myt), B9n, hau.A02, hau, false);
        if (hau.A01) {
            View view = myt.itemView;
            C66584MXp.A0i(view, myt, view.getPaddingLeft(), myt.A00.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        } else {
            View view2 = myt.itemView;
            C66584MXp.A0i(view2, myt, view2.getPaddingLeft(), 0);
        }
        C71409Ok8.A01(myt.A00, 10, this, hau);
        myt.A01.setText(hau.A02.A00().A04);
        A00(B9n, hau, myt.A03, 0);
        A00(B9n, hau, myt.A02, A1U ? 1 : 0);
        A00(B9n, hau, myt.A04, 2);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        C68027Myt myt = new C68027Myt(DbT.A0D(layoutInflater, viewGroup, R.layout.tri_media_keyword_recommendation, false));
        Context A07 = DbS.A07(myt);
        0qQ.A0A(A07);
        int A09 = (int) (((float) ((0nA.A09(A07) - (AnonymousClass7TG.A02(A07) * 2)) - (A07.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing) * 2))) / 3.0f);
        0nA.A0g(myt.A03, A09, A09);
        0nA.A0g(myt.A02, A09, A09);
        0nA.A0g(myt.A04, A09, A09);
        return myt;
    }

    public final Class modelClass() {
        return HAU.class;
    }

    public C67371Mmn(AnonymousClass0iw r1, UserSession userSession, XBt xBt, X41 x41, 0sP r5, 0sI r6, 0sI r7) {
        this.A06 = userSession;
        this.A05 = r1;
        this.A01 = x41;
        this.A00 = xBt;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
    }
}
