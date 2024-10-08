package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.DmQ  reason: case insensitive filesystem */
public final class C46848DmQ extends 2Rw {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public final Context A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final 2el A09;
    public final E23 A0A;
    public final ArrayList A0B = AnonymousClass7TE.A1C();
    public final HashMap A0C = AnonymousClass7TE.A1E();
    public final HashMap A0D = AnonymousClass7TE.A1E();

    public C46848DmQ(Context context, AnonymousClass0iw r3, UserSession userSession, 2el r5, E23 e23) {
        0qQ.A0B(userSession, 2);
        this.A06 = context;
        this.A08 = userSession;
        this.A07 = r3;
        this.A0A = e23;
        this.A09 = r5;
    }

    public static final int A00(C46848DmQ dmQ, int i) {
        for (int i2 = i; i2 >= 0; i2--) {
            if (dmQ.getItemViewType(i2) == 0) {
                return (i - i2) - 1;
            }
        }
        return -1;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            return new C46915DnV(DbU.A09(LayoutInflater.from(this.A06), viewGroup, R.layout.interest_header, false));
        }
        if (i == 1 || i == 3) {
            return new C47031DpN(DbU.A09(LayoutInflater.from(this.A06), viewGroup, R.layout.interest_recommendation_item, false));
        }
        if (i == 2) {
            return new C46916DnW(DbU.A09(LayoutInflater.from(this.A06), viewGroup, R.layout.see_more_with_chevron_row, false));
        }
        throw AnonymousClass7TE.A1B("Unknown view type");
    }

    public static final String A01(C46848DmQ dmQ, String str) {
        Number number;
        if (str == null || (number = (Number) dmQ.A0D.get(str)) == null || number.intValue() != 2) {
            return null;
        }
        return "from_your_contacts";
    }

    /* JADX WARNING: type inference failed for: r13v7, types: [com.instagram.clips.animatedthumbnail.AnimatedThumbnailView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010f, code lost:
        if (r1 == 0) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x016d, code lost:
        if (r9 == 3) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r29, int r30) {
        /*
            r28 = this;
            r6 = r29
            r2 = 0
            X.0qQ.A0B(r6, r2)
            r3 = r28
            r7 = r30
            int r9 = r3.getItemViewType(r7)
            java.util.ArrayList r0 = r3.A0B
            java.lang.Object r5 = X.DbZ.A0g(r0, r7)
            r0 = 9
            java.lang.String r10 = X.C273654mx.A00(r0)
            if (r9 != r2) goto L_0x0057
            X.DnV r6 = (X.C46915DnV) r6
            android.widget.TextView r6 = r6.A00
            java.lang.String r5 = (java.lang.String) r5
            r6.setText(r5)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0056
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            android.content.Context r3 = r3.A06
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r0 = X.DbS.A03(r1, r0)
            r4.height = r0
            r0 = 16
            r6.setGravity(r0)
            r6.setPadding(r2, r2, r2, r2)
            android.view.ViewGroup$MarginLayoutParams r4 = X.DbW.A0A(r6, r10)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
        L_0x004f:
            int r0 = X.DbS.A03(r1, r0)
            r4.setMargins(r2, r0, r2, r2)
        L_0x0056:
            return
        L_0x0057:
            r8 = 1
            if (r9 == r8) goto L_0x007f
            r0 = 3
            if (r9 == r0) goto L_0x007f
            X.DnW r6 = (X.C46916DnW) r6
            android.view.View r4 = r6.itemView
            r1 = 20
            X.FPA r0 = new X.FPA
            r0.<init>((X.C46848DmQ) r3, (java.lang.Object) r5, (int) r7, (int) r1)
            X.AnonymousClass0fU.A00(r0, r4)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0056
            android.view.View r0 = r6.A00
            android.view.ViewGroup$MarginLayoutParams r4 = X.DbW.A0A(r0, r10)
            android.content.Context r0 = r3.A06
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            goto L_0x004f
        L_0x007f:
            if (r9 != r8) goto L_0x033c
            r0 = r5
            X.4hL r0 = (X.C270814hL) r0
            com.instagram.user.model.User r4 = r0.A00
        L_0x0086:
            if (r4 == 0) goto L_0x0056
            java.lang.String r1 = r4.getId()
            r15 = 1
            if (r9 == r8) goto L_0x00a2
            r0 = 3
            if (r9 != r0) goto L_0x0339
            java.util.HashMap r0 = r3.A0D
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0339
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x0339
        L_0x00a2:
            X.DpN r6 = (X.C47031DpN) r6
            android.widget.LinearLayout r1 = r6.A04
            X.FO7 r10 = new X.FO7
            r11 = r3
            r12 = r4
            r13 = r5
            r14 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            X.AnonymousClass0fU.A00(r10, r1)
            java.lang.String r0 = r4.getId()
            r12 = 0
            X.30a r11 = X.AnonymousClass30Y.A00(r4, r12, r0)
            java.util.HashMap r0 = r3.A0D
            java.lang.Object r10 = X.DbV.A0r(r4, r0)
            java.lang.Integer r10 = (java.lang.Integer) r10
            boolean r0 = r5 instanceof X.C47217Dt4
            if (r0 == 0) goto L_0x00ca
            r12 = r5
            X.Dt4 r12 = (X.C47217Dt4) r12
        L_0x00ca:
            X.E23 r0 = r3.A0A
            r27 = r0
            java.util.HashMap r0 = r3.A0C
            java.lang.Object r13 = X.DbV.A0r(r4, r0)
            java.lang.String r13 = (java.lang.String) r13
            int r21 = A00(r3, r7)
            X.FZV r0 = new X.FZV
            r18 = r27
            r19 = r10
            r20 = r13
            r16 = r0
            r17 = r12
            r16.<init>(r17, r18, r19, r20, r21)
            X.30Y r10 = X.DbU.A0a(r0, r11)
            X.2el r0 = r3.A09
            r26 = r0
            r0.A05(r1, r10)
            int r10 = r1.getPaddingTop()
            int r0 = r1.getPaddingBottom()
            r1.setPadding(r2, r10, r2, r0)
            android.widget.TextView r12 = r6.A07
            X.DbU.A1H(r12, r4)
            java.lang.String r0 = r4.getFullName()
            if (r0 == 0) goto L_0x0111
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0112
        L_0x0111:
            r0 = 1
        L_0x0112:
            r11 = 8
            android.widget.TextView r1 = r6.A05
            if (r0 != 0) goto L_0x0334
            java.lang.String r0 = r4.getFullName()
            r1.setText(r0)
            r1.setVisibility(r2)
        L_0x0122:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r6.A08
            com.instagram.common.typedurl.ImageUrl r0 = r4.Bh3()
            X.0iw r10 = r3.A07
            r1.setUrl(r0, r10)
            boolean r0 = r4.isVerified()
            X.C244273av.A0B(r12, r0)
            java.lang.String r12 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            if (r15 == 0) goto L_0x031e
            X.4Cl r0 = r4.A03
            java.lang.Integer r0 = r0.B6v()
            if (r0 == 0) goto L_0x0178
            X.4Cl r0 = r4.A03
            java.lang.Integer r1 = r0.B6v()
            android.content.Context r13 = r3.A06
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r13)
            java.lang.String r0 = X.C253673rC.A03(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            r0 = 2131962607(0x7f132aef, float:1.9561944E38)
            java.lang.String r0 = r13.getString(r0)
            r1.append(r0)
            android.widget.TextView r0 = r6.A06
            r0.setText(r1)
            r0.setVisibility(r2)
            r0 = 3
            if (r9 != r0) goto L_0x0178
        L_0x016f:
            android.widget.LinearLayout r0 = r6.A03
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbW.A0A(r0, r12)
            r0.setMargins(r2, r2, r2, r2)
        L_0x0178:
            X.DbY.A1O(r4)
            com.instagram.user.follow.FollowButton r13 = r6.A09
            X.4at r12 = r13.A0J
            com.instagram.common.session.UserSession r1 = r3.A08
            r12.A03(r10, r1, r4)
            android.content.Context r0 = r3.A06
            r22 = r0
            android.content.res.Resources r14 = r22.getResources()
            r0 = 2131165319(0x7f070087, float:1.7944852E38)
            int r0 = r14.getDimensionPixelSize(r0)
            r13.setMinimumWidth(r0)
            r13.setVisibility(r2)
            X.EUE r0 = new X.EUE
            r16 = r0
            r17 = r6
            r18 = r3
            r19 = r5
            r20 = r7
            r21 = r15
            r16.<init>(r17, r18, r19, r20, r21)
            r12.A07(r0)
            if (r15 != 0) goto L_0x0317
            com.instagram.user.model.FollowStatus r12 = r4.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r12 == r0) goto L_0x0317
            com.instagram.user.model.FollowStatus r12 = r4.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            if (r12 == r0) goto L_0x0317
            android.widget.ImageView r13 = r6.A02
            r12 = 19
            X.FPA r0 = new X.FPA
            r0.<init>((X.C46848DmQ) r3, (java.lang.Object) r5, (int) r7, (int) r12)
            X.AnonymousClass0fU.A00(r0, r13)
            r13.setVisibility(r2)
        L_0x01ce:
            if (r9 != r8) goto L_0x0056
            X.4hL r5 = (X.C270814hL) r5
            java.util.List r5 = r5.A01
            if (r5 == 0) goto L_0x0056
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            if (r0 == 0) goto L_0x0056
            X.1Xj r0 = X.DbZ.A0T(r5, r2)
            X.1iA r7 = r0.BR7()
            X.1iA r0 = X.1iA.A0a
            if (r7 != r0) goto L_0x0343
            java.lang.String r16 = r4.getId()
            android.view.ViewStub r0 = r6.A00
            r0.setVisibility(r11)
            android.view.ViewStub r4 = r6.A01
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x030c
            android.view.View r0 = r4.inflate()
        L_0x01fd:
            X.0qQ.A0A(r0)
            X.0qQ.A0B(r0, r8)
            r4 = 2131432916(0x7f0b15d4, float:1.8487603E38)
            android.view.View r15 = X.AnonymousClass7TF.A0G(r0, r4)
            r4 = 2131432915(0x7f0b15d3, float:1.84876E38)
            android.view.View r13 = X.AnonymousClass7TF.A0G(r0, r4)
            r4 = 2131440842(0x7f0b34ca, float:1.8503679E38)
            android.view.View r14 = X.AnonymousClass7TF.A0G(r0, r4)
            r4 = 2131440841(0x7f0b34c9, float:1.8503677E38)
            android.view.View r12 = X.AnonymousClass7TF.A0G(r0, r4)
            r4 = 2131442692(0x7f0b3c04, float:1.8507431E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r0, r4)
            r4 = 2131442691(0x7f0b3c03, float:1.850743E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r0, r4)
            r4 = 2131433134(0x7f0b16ae, float:1.8488045E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r0, r4)
            r6 = 2131433133(0x7f0b16ad, float:1.8488043E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r0, r6)
            r0.setVisibility(r2)
            r7 = 4
            com.instagram.common.ui.widget.imageview.IgImageView r15 = (com.instagram.common.ui.widget.imageview.IgImageView) r15
            com.instagram.common.ui.widget.imageview.IgImageView r14 = (com.instagram.common.ui.widget.imageview.IgImageView) r14
            com.instagram.common.ui.widget.imageview.IgImageView r9 = (com.instagram.common.ui.widget.imageview.IgImageView) r9
            com.instagram.common.ui.widget.imageview.IgImageView r4 = (com.instagram.common.ui.widget.imageview.IgImageView) r4
            com.instagram.common.ui.widget.imageview.IgImageView[] r4 = new com.instagram.common.ui.widget.imageview.IgImageView[]{r15, r14, r9, r4}
            java.util.List r9 = X.0sr.A1P(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r13 = (com.instagram.common.ui.widget.imageview.IgImageView) r13
            com.instagram.common.ui.widget.imageview.IgImageView r12 = (com.instagram.common.ui.widget.imageview.IgImageView) r12
            com.instagram.common.ui.widget.imageview.IgImageView r8 = (com.instagram.common.ui.widget.imageview.IgImageView) r8
            com.instagram.common.ui.widget.imageview.IgImageView r6 = (com.instagram.common.ui.widget.imageview.IgImageView) r6
            com.instagram.common.ui.widget.imageview.IgImageView[] r4 = new com.instagram.common.ui.widget.imageview.IgImageView[]{r13, r12, r8, r6}
            java.util.List r8 = X.0sr.A1P(r4)
            android.content.res.Resources r6 = r22.getResources()
            r4 = 2131165223(0x7f070027, float:1.7944657E38)
            int r4 = r6.getDimensionPixelSize(r4)
            int r6 = r4 * 3
            r3.A03 = r6
            int r4 = r3.A04
            int r4 = r4 - r6
            int r4 = r4 / r7
            r3.A02 = r4
            float r6 = (float) r4
            r4 = 1058013184(0x3f100000, float:0.5625)
            float r6 = r6 / r4
            int r4 = (int) r6
            r3.A01 = r4
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            int r4 = r3.A01
            r6.height = r4
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            int r0 = r3.A02
            int r4 = r0 * 4
            int r0 = r3.A03
            int r4 = r4 + r0
            r6.width = r4
            int r12 = r5.size()
            r7 = 0
        L_0x0295:
            if (r7 >= r12) goto L_0x0056
            java.lang.Object r13 = r8.get(r7)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.clips.animatedthumbnail.AnimatedThumbnailView"
            X.0qQ.A0C(r13, r0)
            com.instagram.clips.animatedthumbnail.AnimatedThumbnailView r13 = (com.instagram.clips.animatedthumbnail.AnimatedThumbnailView) r13
            java.lang.Object r6 = r9.get(r7)
            com.instagram.common.ui.widget.imageview.IgImageView r6 = (com.instagram.common.ui.widget.imageview.IgImageView) r6
            X.1Xj r4 = X.DbZ.A0T(r5, r7)
            r13.setVisibility(r11)
            android.view.ViewGroup$LayoutParams r14 = r6.getLayoutParams()
            int r0 = r3.A02
            r14.width = r0
            android.view.ViewGroup$LayoutParams r14 = r6.getLayoutParams()
            int r0 = r3.A01
            r14.height = r0
            com.instagram.common.typedurl.ImageUrl r0 = r4.A1Q()
            if (r0 == 0) goto L_0x03b1
            r6.setUrl(r1, r0, r10)
            r15 = 6
            X.FNn r14 = new X.FNn
            r0 = r16
            r14.<init>(r4, r3, r0, r15)
            X.AnonymousClass0fU.A00(r14, r6)
            r6.setVisibility(r2)
            com.instagram.model.mediasize.SpritesheetInfo r15 = r4.A1q()
            java.lang.String r14 = r4.getId()
            r0 = 0
            X.30a r14 = X.AnonymousClass30Y.A00(r15, r0, r14)
            int r0 = r3.A02
            r17 = r0
            int r15 = r3.A01
            X.FZW r0 = new X.FZW
            r19 = r10
            r20 = r6
            r21 = r4
            r22 = r27
            r23 = r16
            r24 = r17
            r25 = r15
            r17 = r0
            r18 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            X.30Y r4 = X.DbU.A0a(r0, r14)
            r0 = r26
            r0.A05(r6, r4)
            int r7 = r7 + 1
            goto L_0x0295
        L_0x030c:
            android.view.View r4 = r6.itemView
            r0 = 2131433130(0x7f0b16aa, float:1.8488037E38)
            android.view.View r0 = r4.requireViewById(r0)
            goto L_0x01fd
        L_0x0317:
            android.widget.ImageView r0 = r6.A02
            r0.setVisibility(r11)
            goto L_0x01ce
        L_0x031e:
            r0 = r5
            X.Dt4 r0 = (X.C47217Dt4) r0
            java.lang.String r1 = r0.A04
            android.widget.TextView r0 = r6.A06
            if (r1 == 0) goto L_0x032f
            r0.setText(r1)
            r0.setVisibility(r2)
            goto L_0x016f
        L_0x032f:
            r0.setVisibility(r11)
            goto L_0x0178
        L_0x0334:
            r1.setVisibility(r11)
            goto L_0x0122
        L_0x0339:
            r15 = 0
            goto L_0x00a2
        L_0x033c:
            r0 = r5
            X.Dt4 r0 = (X.C47217Dt4) r0
            com.instagram.user.model.User r4 = r0.A00
            goto L_0x0086
        L_0x0343:
            android.view.ViewStub r0 = r6.A01
            r0.setVisibility(r11)
            android.view.ViewStub r4 = r6.A00
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x03a7
            android.view.View r0 = r4.inflate()
        L_0x0354:
            X.0qQ.A0A(r0)
            X.0qQ.A0B(r0, r8)
            r4 = 2131435942(0x7f0b21a6, float:1.849374E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r0, r4)
            r4 = 2131435946(0x7f0b21aa, float:1.8493749E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r0, r4)
            r4 = 2131436007(0x7f0b21e7, float:1.8493872E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r0, r4)
            r7 = 0
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r8 = (com.instagram.common.ui.widget.imageview.ConstrainedImageView) r8
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r6 = (com.instagram.common.ui.widget.imageview.ConstrainedImageView) r6
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r4 = (com.instagram.common.ui.widget.imageview.ConstrainedImageView) r4
            com.instagram.common.ui.widget.imageview.ConstrainedImageView[] r0 = new com.instagram.common.ui.widget.imageview.ConstrainedImageView[]{r8, r6, r4}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0385:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0056
            int r4 = r7 + 1
            java.lang.Object r2 = r6.next()
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            X.1Xj r0 = X.DbZ.A0T(r5, r7)
            com.instagram.common.typedurl.ImageUrl r0 = r0.A1Q()
            if (r0 == 0) goto L_0x03b6
            r2.setUrl(r1, r0, r10)
            r0 = 18
            X.FPA.A00(r2, r5, r3, r7, r0)
            r7 = r4
            goto L_0x0385
        L_0x03a7:
            android.view.View r4 = r6.itemView
            r0 = 2131442752(0x7f0b3c40, float:1.8507553E38)
            android.view.View r0 = r4.requireViewById(r0)
            goto L_0x0354
        L_0x03b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46848DmQ.onBindViewHolder(X.3kE, int):void");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1130597754);
        int size = this.A0B.size();
        AnonymousClass0fD.A0A(1043904722, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A032 = AnonymousClass0fD.A03(1568982358);
        ArrayList arrayList = this.A0B;
        if (arrayList.get(i) instanceof String) {
            i2 = 0;
            i3 = -545630706;
        } else if (arrayList.get(i) instanceof C270814hL) {
            i2 = 1;
            i3 = -992253871;
        } else {
            boolean z = arrayList.get(i) instanceof C47217Dt4;
            i2 = 2;
            i3 = 34527462;
            if (z) {
                i2 = 3;
                i3 = -747578101;
            }
        }
        AnonymousClass0fD.A0A(i3, A032);
        return i2;
    }
}
