package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Timer;

/* renamed from: X.KGs  reason: case insensitive filesystem */
public final class C61668KGs extends C232232tF {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public C61668KGs(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = r2;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60602JoB(DbT.A0D(layoutInflater, viewGroup, R.layout.iglive_reactions_picker_item, false));
    }

    private final void A00(IgImageView igImageView, C61177JyT jyT) {
        if (jyT.A00) {
            JTQ.A0v(igImageView, 0.0f);
            igImageView.setVisibility(0);
            jyT.A00 = false;
            new Timer().schedule(new MD0(igImageView), jyT.A01);
            return;
        }
        igImageView.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0109, code lost:
        if (r3 != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r26, X.C249703kE r27) {
        /*
            r25 = this;
            r0 = r27
            r1 = r26
            X.JyT r1 = (X.C61177JyT) r1
            X.JoB r0 = (X.C60602JoB) r0
            r5 = 0
            boolean r20 = X.AnonymousClass7TF.A1U(r5, r1, r0)
            com.instagram.common.typedurl.ImageUrl r4 = r1.A02
            r2 = r25
            if (r4 == 0) goto L_0x0058
            java.lang.String r3 = r1.A06
            java.lang.String r6 = "image"
            boolean r6 = X.0qQ.A0K(r3, r6)
            java.lang.String r24 = ""
            if (r6 == 0) goto L_0x0093
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r0.A01
            X.0iw r6 = r2.A00
            r7.setUrl(r4, r6)
            java.lang.String r8 = r1.A07
            if (r8 != 0) goto L_0x002c
            r8 = r24
        L_0x002c:
            java.lang.String r6 = r1.A05
            if (r6 != 0) goto L_0x0032
            r6 = r24
        L_0x0032:
            r23 = r3
        L_0x0034:
            r18 = 0
            X.KbX r7 = new X.KbX
            r20 = r18
            r21 = r8
            r22 = r6
            r19 = r4
            r17 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
        L_0x0045:
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r0.A01
            java.lang.String r3 = r1.A03
            r4.setContentDescription(r3)
            r2.A00(r4, r1)
            X.3NG r4 = X.AnonymousClass7TE.A0m(r4)
            r3 = 13
            X.C61686KHu.A00(r4, r7, r1, r3)
        L_0x0058:
            java.lang.String r7 = r1.A04
            if (r7 == 0) goto L_0x0092
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r0.A00
            android.text.Spannable r3 = X.C306386Ly.A0d
            android.content.Context r4 = r6.getContext()
            android.view.View r0 = r0.itemView
            android.content.res.Resources r3 = X.DbU.A05(r0)
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r0 = r3.getDimensionPixelSize(r0)
            X.6Ly r0 = X.AnonymousClass7TE.A0s(r4, r0)
            r0.A0M(r7)
            r6.setImageDrawable(r0)
            java.lang.String r0 = r1.A03
            r6.setContentDescription(r0)
            r2.A00(r6, r1)
            r0 = 0
            X.KbW r3 = new X.KbW
            r3.<init>(r0, r7, r5)
            X.3NG r2 = X.AnonymousClass7TE.A0m(r6)
            r0 = 13
            X.C61686KHu.A00(r2, r3, r1, r0)
        L_0x0092:
            return
        L_0x0093:
            java.lang.String r6 = "animation"
            boolean r6 = X.0qQ.A0K(r3, r6)
            if (r6 == 0) goto L_0x00fb
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r0.A01
            android.content.Context r10 = X.AnonymousClass7TE.A0S(r6)
            com.instagram.common.session.UserSession r11 = r2.A01
            java.lang.String r13 = X.JTP.A0o(r4)
            android.content.res.Resources r8 = r10.getResources()
            r7 = 2131165286(0x7f070066, float:1.7944785E38)
            int r17 = r8.getDimensionPixelSize(r7)
            int r18 = X.AnonymousClass7TF.A02(r10, r7)
            r12 = 0
            java.lang.String r14 = "IGLIVE_AVATAR_REACTION"
            r15 = r12
            r16 = r12
            r21 = r5
            r22 = r20
            r23 = r5
            r19 = r5
            android.graphics.drawable.Drawable r7 = X.C320996tP.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r6.setImageDrawable(r7)
            java.lang.String r9 = r1.A07
            if (r9 != 0) goto L_0x00d1
            r9 = r24
        L_0x00d1:
            java.lang.String r6 = r1.A05
            if (r6 != 0) goto L_0x00d7
            r6 = r24
        L_0x00d7:
            android.content.res.Resources r8 = r10.getResources()
            r7 = 2131165209(0x7f070019, float:1.7944629E38)
            int r17 = r8.getDimensionPixelSize(r7)
            int r18 = X.AnonymousClass7TF.A02(r10, r7)
            android.graphics.drawable.Drawable r14 = X.C320996tP.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.KbX r7 = new X.KbX
            r13 = r7
            r15 = r4
            r17 = r9
            r18 = r6
            r19 = r3
            r20 = r24
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0045
        L_0x00fb:
            java.lang.String r8 = r1.A07
            if (r8 != 0) goto L_0x0101
            r8 = r24
        L_0x0101:
            java.lang.String r6 = r1.A05
            if (r6 != 0) goto L_0x0107
            r6 = r24
        L_0x0107:
            r23 = r24
            if (r3 == 0) goto L_0x0034
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61668KGs.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C61177JyT.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        C60602JoB joB = (C60602JoB) r3;
        0qQ.A0B(joB, 0);
        IgImageView igImageView = joB.A01;
        igImageView.setVisibility(8);
        igImageView.clearAnimation();
        IgImageView igImageView2 = joB.A00;
        igImageView2.setVisibility(8);
        igImageView2.clearAnimation();
    }
}
