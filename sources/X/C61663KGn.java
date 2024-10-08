package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.KGn  reason: case insensitive filesystem */
public final class C61663KGn extends C232232tF {
    public final float A00;
    public final L3P A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C20703Wxa(this, 9));

    public C61663KGn(L3P l3p, AnonymousClass0iw r4, UserSession userSession, float f) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = f;
        this.A02 = r4;
        this.A01 = l3p;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.media_thumbnail_preview_item_layout, false);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) AnonymousClass7TF.A0F(A0D, R.id.thumbnail_preview_container);
        mediaFrameLayout.A00 = this.A00;
        return new C60706Jpr(A0D, mediaFrameLayout, new AnonymousClass3TS(DbU.A0D(A0D, R.id.audio_icon_view_stub)), new C256003v4(JTR.A0X(A0D, R.id.video_subtitle_view_stub), false), (IgProgressImageView) AnonymousClass7TF.A0G(A0D, R.id.media_image_preview), (MediaActionsView) AnonymousClass7TF.A0G(A0D, R.id.preview_media_actions_view), mediaFrameLayout);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x008c: MOVE  (r1v8 X.2t9) = (r1v7 X.2t9)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r11, X.C249703kE r12) {
        /*
            r10 = this;
            X.Li3 r11 = (X.C64787Li3) r11
            X.Jpr r12 = (X.C60706Jpr) r12
            r4 = 0
            X.AnonymousClass7TF.A1H(r11, r12)
            X.3W1 r1 = r12.A00
            if (r1 == 0) goto L_0x0015
            X.3TS r0 = r12.A02
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r0.A01()
            r1.A0S(r0)
        L_0x0015:
            X.3W1 r8 = r11.A01
            r12.A00 = r8
            X.0eM r0 = r10.A04
            java.lang.Object r1 = r0.getValue()
            X.3fS r1 = (X.C246923fS) r1
            X.1Xj r3 = r11.A00
            com.instagram.feed.widget.IgProgressImageView r9 = r12.A03
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r9)
            X.3fX r1 = r1.A00(r0, r3)
            X.0iw r0 = r10.A02
            X.C247843h0.A00(r0, r1, r9)
            com.instagram.ui.mediaactions.MediaActionsView r5 = r12.A04
            X.3TO r2 = r11.A02
            com.instagram.common.session.UserSession r1 = r10.A03
            X.4Jd r0 = new X.4Jd
            r0.<init>(r1)
            java.lang.String r6 = ""
            X.9IB r0 = r0.A00(r3, r6)
            r7 = 0
            X.AnonymousClass4Je.A00(r0, r8, r9, r5, r2)
            X.3TS r5 = r12.A02
            boolean r2 = r3.A6W(r1)
            r1 = 6
            X.9IQ r0 = new X.9IQ
            r0.<init>((java.lang.Integer) r7, (int) r1, (boolean) r2)
            X.C250563lf.A0f(r0, r5, r8)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r5.A01()
            r8.A0R(r0)
            android.view.View r5 = r12.A01
            X.1iA r2 = r3.BR7()
            X.1iA r0 = X.1iA.A0a
            java.lang.String r1 = "Media Thumbnail %s Cell"
            if (r2 != r0) goto L_0x00d7
            java.lang.String r0 = "Video"
        L_0x006b:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = X.0mp.A06(r1, r0)
            r5.setContentDescription(r0)
            r0 = 3
            X.LYA.A01(r5, r11, r12, r10, r0)
            X.LYi r0 = new X.LYi
            r0.<init>(r4, r10, r11)
            r5.setOnTouchListener(r0)
            X.L3P r2 = r10.A01
            androidx.recyclerview.widget.RecyclerView r0 = r2.A00
            X.2Rw r1 = r0.A0A
            boolean r0 = r1 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x00d3
            X.2t9 r1 = (X.AnonymousClass2t9) r1
            if (r1 == 0) goto L_0x00d3
            X.K6m r5 = r2.A01
            java.lang.String r0 = r3.getId()
            if (r0 != 0) goto L_0x0099
            r0 = r6
        L_0x0099:
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x00d3
            X.0eM r0 = r5.A0F
            java.lang.Object r0 = r0.getValue()
            X.Ji9 r0 = (X.C60252Ji9) r0
            X.0Ud r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.L5u r1 = (X.C63762L5u) r1
            boolean r0 = r1 instanceof X.C61452K8g
            if (r0 == 0) goto L_0x00d4
            X.K8g r1 = (X.C61452K8g) r1
            X.1Xj r2 = r1.A03
        L_0x00b7:
            if (r2 == 0) goto L_0x00d3
            X.1iA r1 = r2.BR7()
            X.1iA r0 = X.1iA.A09
            if (r1 != r0) goto L_0x00cb
            X.1Xj r0 = r2.A1c(r4)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
        L_0x00cb:
            java.lang.String r0 = "media_mismatch"
            X.C61415K6m.A04(r5, r0)
            X.C61415K6m.A02(r5, r12, r3, r4)
        L_0x00d3:
            return
        L_0x00d4:
            X.1Xj r2 = r1.A00
            goto L_0x00b7
        L_0x00d7:
            java.lang.String r0 = "Photo"
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61663KGn.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C64787Li3.class;
    }
}
