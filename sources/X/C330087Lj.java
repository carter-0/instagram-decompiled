package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.7Lj  reason: invalid class name and case insensitive filesystem */
public final class C330087Lj implements AnonymousClass3N3 {
    public final C252063oV A00;
    public final GradientSpinnerAvatarView A01;

    public C330087Lj(C252063oV r2, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        0qQ.A0B(gradientSpinnerAvatarView, 1);
        0qQ.A0B(r2, 2);
        this.A01 = gradientSpinnerAvatarView;
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass34S r11, X.AnonymousClass0iw r12, com.instagram.common.session.UserSession r13, X.C330047Lf r14, com.instagram.direct.model.messaginguser.MessagingUser r15, com.instagram.model.reels.Reel r16, java.util.List r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r10 = this;
            r7 = 0
            X.0qQ.A0B(r13, r7)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r6 = 2
            r9 = r17
            X.0qQ.A0B(r9, r6)
            r0 = 4
            X.0qQ.A0B(r14, r0)
            java.lang.Object r5 = r11.A00
            if (r5 == 0) goto L_0x0097
            r4 = 8
            r3 = 0
            if (r20 == 0) goto L_0x0120
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r8 = r10.A01
            r0 = r19
            r8.setBackgroundRingColor(r0)
            boolean r0 = X.AnonymousClass48O.A02(r18)
            if (r0 == 0) goto L_0x00c7
            android.content.Context r1 = r8.getContext()
            r0 = 2131240029(0x7f08245d, float:1.8096382E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x00c7
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            r8.A0E(r0, r12, r5)
        L_0x003a:
            r8.setImportantForAccessibility(r6)
            r3 = 1
            r4 = 0
            r1 = r16
            if (r16 == 0) goto L_0x00bf
            r4 = 1
            boolean r0 = r1.A16(r13)
            r2 = 1
            if (r0 != 0) goto L_0x00bf
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r8.A0O
            X.AnonymousClass3NW.A02(r13, r1, r0)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r8.A0P
            if (r0 == 0) goto L_0x0057
            X.AnonymousClass3NW.A02(r13, r1, r0)
        L_0x0057:
            r8.setGradientSpinnerVisible(r4)
            r8.setGradientSpinnerActivated(r2)
            android.content.Context r2 = r8.getContext()
            if (r4 == 0) goto L_0x0098
            r0 = 2131974507(0x7f13596b, float:1.958608E38)
            java.lang.String r0 = r2.getString(r0)
            r8.setContentDescription(r0)
            if (r16 == 0) goto L_0x008f
            boolean r0 = r1.A0Z()
            if (r0 != r3) goto L_0x008f
            r0 = 2131240219(0x7f08251b, float:1.8096767E38)
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r8.setBottomBadgeDrawable(r0)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r8.A0O
            r0.A03()
            int r0 = r8.A04
            if (r0 != r6) goto L_0x008f
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r8.A0P
            if (r0 == 0) goto L_0x0138
            r0.A03()
        L_0x008f:
            X.73X r0 = new X.73X
            r0.<init>(r14, r1, r8)
            X.AnonymousClass0fU.A00(r0, r8)
        L_0x0097:
            return
        L_0x0098:
            if (r21 == 0) goto L_0x0097
            if (r15 == 0) goto L_0x00a5
            X.73Y r0 = new X.73Y
            r0.<init>(r14, r15)
        L_0x00a1:
            X.AnonymousClass0fU.A00(r0, r8)
            return
        L_0x00a5:
            X.JU2 r0 = new X.JU2
            r0.<init>(r14)
            X.AnonymousClass0fU.A00(r0, r8)
            X.3oV r1 = r10.A00
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x0097
            android.view.View r8 = r1.getView()
            X.LWu r0 = new X.LWu
            r0.<init>(r14)
            goto L_0x00a1
        L_0x00bf:
            r2 = 0
            r0 = 2132017510(0x7f140166, float:1.96733E38)
            r8.setGradientColorRes(r0)
            goto L_0x0057
        L_0x00c7:
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0115
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327670908205671(0x810fd300003a67, double:3.0371035899142254E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x0115
            X.3oV r0 = r10.A00
            android.view.View r2 = r0.getView()
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r2 = (com.instagram.igds.components.faceswarm.IgdsFaceSwarm) r2
            r2.setVisibility(r7)
            r8.setVisibility(r4)
            r0 = 36
            r2.setCustomSizeDp(r0)
            r2.setIsContained(r7)
            X.HMS r0 = X.HMS.TYPE_012
            r2.setPreferredThreeItemTemplate(r0)
            X.HMl r0 = X.C54654HMl.TYPE_0213
            r2.setPreferredFourItemTemplate(r0)
            r2.A08 = r7
            r2.setImageUrls(r9, r12)
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0d(r2, r0)
            goto L_0x003a
        L_0x0115:
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            java.lang.Object r0 = r11.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r8.A0G(r3, r12, r5, r0)
            goto L_0x003a
        L_0x0120:
            X.3oV r1 = r10.A00
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x012f
            android.view.View r0 = r1.getView()
            r0.setVisibility(r4)
        L_0x012f:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r8 = r10.A01
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            r8.A0F(r3, r12, r5)
            goto L_0x003a
        L_0x0138:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330087Lj.A00(X.34S, X.0iw, com.instagram.common.session.UserSession, X.7Lf, com.instagram.direct.model.messaginguser.MessagingUser, com.instagram.model.reels.Reel, java.util.List, int, int, boolean, boolean):void");
    }

    public final boolean EtJ() {
        return true;
    }

    public final RectF AeG() {
        return 0nA.A0F(this.A01);
    }

    public final View AeY() {
        return this.A01;
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A01);
    }

    public final GradientSpinner Bkt() {
        return this.A01.A0O;
    }

    public final void CLE() {
        this.A01.setVisibility(8);
    }

    public final void Eu3(AnonymousClass0iw r3) {
        this.A01.setVisibility(0);
    }
}
