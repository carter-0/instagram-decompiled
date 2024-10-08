package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mhd  reason: case insensitive filesystem */
public final class C67062Mhd extends C232222tE {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C74512Pw7 A03;
    public final C74398PuE A04;
    public final AnonymousClass34Y A05;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup, 0);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater, 1);
        UserSession userSession = this.A02;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36322572784118034L)) {
            inflate = 2Su.A01(layoutInflater2, new ViewGroup.LayoutParams(-1, -2), viewGroup2, R.layout.direct_inbox_row_layout, false, true);
        } else {
            inflate = layoutInflater.inflate(R.layout.direct_inbox_row_layout, viewGroup, false);
            0qQ.A07(inflate);
        }
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass34Y r2 = this.A05;
        0qQ.A0B(userSession, 0);
        return new C67283MlI(inflate, r2, 182.A06(r3, userSession, 36328431117483354L));
    }

    /* JADX WARNING: type inference failed for: r0v31, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r12v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView] */
    /* JADX WARNING: type inference failed for: r14v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r12v21, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r12v24 */
    /* JADX WARNING: type inference failed for: r12v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x052b, code lost:
        if (r9.A01 != false) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x052d, code lost:
        r0 = com.instagram.android.R.drawable.instagram_call_filled_12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x061b, code lost:
        if (r13 == null) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0141, code lost:
        if (X.0qQ.A0K(r13.Bh3(), r1) != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02bb, code lost:
        if (r8 != false) goto L_0x02bd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:262:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r39, X.C249703kE r40) {
        /*
            r38 = this;
            r6 = r40
            r7 = r39
            X.Mb9 r7 = (X.C66702Mb9) r7
            X.MlI r6 = (X.C67283MlI) r6
            r15 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r15, r7, r6)
            r1 = r38
            com.instagram.common.session.UserSession r5 = r1.A02
            androidx.fragment.app.FragmentActivity r4 = r1.A00
            X.0iw r0 = r1.A01
            r37 = r0
            X.Pw7 r3 = r1.A03
            X.PuE r11 = r1.A04
            r10 = 0
            X.0qQ.A0B(r5, r15)
            X.0qQ.A0B(r4, r8)
            r23 = 2
            r1 = r23
            X.C51973G9u.A0r(r1, r0, r3, r11)
            X.3sy r1 = r6.A06
            if (r1 == 0) goto L_0x0055
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x0055
            java.lang.String r9 = X.C66647MaG.A09(r1)
            if (r9 == 0) goto L_0x0055
            X.Mha r0 = r6.A0O
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r0.A04
            X.9IV r0 = r0.getCurrentSpinnerProgressState()
            r3.Eyb(r0, r9)
            X.JZB r0 = r6.A0Q
            com.instagram.ui.widget.gradientspinner.GradientSpinner r2 = r0.A01
            if (r2 == 0) goto L_0x06b2
            int r1 = r2.A04
            int r0 = r2.A0P
            if (r1 != r0) goto L_0x06b2
            X.3Pi r0 = r2.getProgressState()
        L_0x0052:
            r3.Eyc(r0, r9)
        L_0x0055:
            com.instagram.model.direct.DirectThreadKey r0 = r7.A0I
            r36 = r0
            r6.A06 = r0
            android.view.ViewGroup r2 = r6.A07
            r0 = 2130969266(0x7f0402b2, float:1.754721E38)
            int r0 = X.2Yu.A0H(r4, r0)
            r2.setBackgroundResource(r0)
            boolean r0 = r7.A0i
            r17 = r0
            r2.setSelected(r0)
            float r0 = r7.A00
            r2.setAlpha(r0)
            boolean r0 = r7.A0l
            r2.setClickable(r0)
            java.lang.String r12 = r36.A01()
            X.0qQ.A07(r12)
            java.lang.String r9 = r7.A0O
            java.util.List r0 = r7.A0R
            r35 = r0
            int r13 = r7.A03
            r6.getBindingAdapterPosition()
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            X.MhZ r18 = new X.MhZ
            r1 = r0
            r0 = r18
            r0.<init>(r13, r12, r9, r1)
            boolean r0 = r7.A0m
            r21 = r0
            r9 = 8
            r1 = 0
            if (r0 != 0) goto L_0x063f
            X.2eb r0 = r6.A0C
            r0.A03(r9)
            X.3sy r13 = r7.A0J
            if (r13 == 0) goto L_0x063c
            java.util.List r12 = r7.A0S
            int r11 = r7.A04
            r0 = r1
            X.Mkz r1 = new X.Mkz
            r24 = r1
            r25 = r18
            r26 = r3
            r27 = r13
            r28 = r12
            r29 = r11
            r24.<init>(r25, r26, r27, r28, r29)
        L_0x00bc:
            X.AnonymousClass0fU.A00(r1, r2)
            if (r13 == 0) goto L_0x00d2
            X.OkL r0 = new X.OkL
            r24 = r0
            r25 = r15
            r26 = r3
            r27 = r7
            r28 = r6
            r29 = r18
            r24.<init>(r25, r26, r27, r28, r29)
        L_0x00d2:
            r2.setOnLongClickListener(r0)
        L_0x00d5:
            X.McM r14 = r7.A0A
            java.util.List r13 = r7.A0S
            X.Mha r12 = r6.A0O
            X.2eb r0 = r6.A0H
            r34 = r0
            X.MlK r0 = r6.A05
            r16 = r0
            X.0Tu r11 = X.0Tu.A05
            r19 = 36318801800731096(0x8107c2000019d8, double:3.031494730634275E-306)
            r0 = r19
            boolean r33 = X.182.A06(r11, r5, r0)
            r25 = r34
            r26 = r18
            r27 = r3
            r28 = r12
            r29 = r14
            r30 = r16
            r31 = r13
            r32 = r21
            r24 = r37
            X.C67061Mhc.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.0qQ.A0B(r14, r15)
            int r19 = X.DbW.A03(r8, r13, r12)
            X.Nof r15 = r14.A01
            boolean r0 = r15 instanceof X.C66695Mb2
            if (r0 == 0) goto L_0x05bd
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.inbox.ui.threadavatar.ThreadAvatarViewModel.Avatar.Single"
            X.0qQ.A0C(r15, r0)
            X.Mb2 r15 = (X.C66695Mb2) r15
            com.instagram.common.typedurl.ImageUrl r1 = r15.A00
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r14 = r12.A04
            com.instagram.common.ui.widget.imageview.CircularImageView r12 = r14.A0M
            r12.A09()
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x012d
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r14.A0N
            if (r0 == 0) goto L_0x06c1
            r0.A09()
        L_0x012d:
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x05b6
            com.instagram.user.model.User r13 = X.AnonymousClass0eD.A00(r5)
            if (r13 == 0) goto L_0x0165
            com.instagram.common.typedurl.ImageUrl r0 = r13.Bh3()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0165
        L_0x0143:
            boolean r0 = X.C240943Ng.A02(r5, r13)
            if (r0 == 0) goto L_0x0637
            r0 = 36319510470598091(0x81086700041dcb, double:3.031942896311747E-306)
            boolean r0 = X.182.A06(r11, r5, r0)
            if (r0 == 0) goto L_0x0637
            r12.setVisibility(r10)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r12)
            X.C240943Ng.A00(r0, r12)
            android.graphics.drawable.Drawable r0 = r12.getDrawable()
            X.C240943Ng.A01(r0)
        L_0x0165:
            X.Mb1 r11 = r7.A0B
            com.instagram.common.ui.base.IgTextView r1 = r6.A09
            android.widget.TextView r0 = r6.A08
            X.C67064Mhf.A01(r1, r0, r5, r11)
            com.instagram.common.ui.base.IgTextView r14 = r6.A0A
            X.2eb r13 = r6.A0F
            android.widget.ImageView r12 = r6.A01
            X.2eb r11 = r6.A03
            X.3oV r1 = r6.A04
            X.Mb0 r0 = r7.A0D
            r24 = r4
            r25 = r12
            r26 = r14
            r27 = r5
            r28 = r13
            r29 = r11
            r30 = r1
            r31 = r0
            X.C67073Mho.A00(r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r11 = r7.A0b
            java.lang.String r1 = r7.A0K
            r0 = r34
            X.0qQ.A0B(r0, r10)
            if (r11 == 0) goto L_0x05a6
            r0.A03(r10)
            android.view.View r1 = r34.A01()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131964271(0x7f13316f, float:1.9565319E38)
            r1.setText(r0)
        L_0x01a7:
            X.2eb r0 = r6.A0M
            r0.A03(r9)
            X.2eb r12 = r6.A0L
            X.Mhs r1 = r6.A0R
            X.DcN r0 = r7.A0G
            r11 = 0
            X.C46488Dfr.A00(r12, r1, r0)
            X.3oV r15 = r6.A0N
            X.N5L r0 = r7.A0F
            r14 = 0
            X.0qQ.A0B(r15, r10)
            if (r0 == 0) goto L_0x05a2
            X.9IM r1 = r0.A00
            int r0 = r1.A00
            if (r0 == 0) goto L_0x05a2
            android.view.View r13 = r15.getView()
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.view.View r0 = r15.getView()
            android.content.Context r12 = r0.getContext()
            int r1 = r1.A00
            r0 = 2131954386(0x7f130ad2, float:1.954527E38)
            if (r1 != r8) goto L_0x01de
            r0 = 2131954387(0x7f130ad3, float:1.9545272E38)
        L_0x01de:
            X.DbT.A18(r12, r13, r0)
        L_0x01e1:
            r15.setVisibility(r14)
            int r1 = r7.A02
            if (r1 == 0) goto L_0x0589
            boolean r0 = r7.A0n
            if (r0 != 0) goto L_0x0589
            android.widget.ImageView r0 = r6.A00
            if (r0 == 0) goto L_0x01f3
            r0.setVisibility(r1)
        L_0x01f3:
            X.2eb r0 = r6.A02
            if (r0 == 0) goto L_0x01fa
            r0.A03(r1)
        L_0x01fa:
            X.2eb r13 = r6.A0D
            X.0Tu r16 = X.0Tu.A06
            r0 = 36330110449631703(0x81120b000041d7, double:3.038646365735293E-306)
            r12 = r16
            boolean r0 = X.182.A06(r12, r5, r0)
            if (r0 != 0) goto L_0x020d
            int r9 = r7.A01
        L_0x020d:
            r13.A03(r9)
            X.2eb r0 = r6.A0J
            r26 = r0
            X.2eb r0 = r6.A0E
            r25 = r0
            X.2eb r13 = r6.A0B
            X.2eb r0 = r6.A0I
            r24 = r0
            X.JZB r12 = r6.A0Q
            X.MlJ r14 = r6.A0P
            X.2eb r0 = r6.A0G
            r20 = r0
            X.Noi r9 = r7.A0C
            r1 = r23
            r0 = r26
            X.0qQ.A0B(r0, r1)
            r15 = r19
            r1 = r25
            r0 = r24
            X.C51974G9v.A0d(r15, r1, r13, r0, r12)
            r0 = 7
            X.0qQ.A0B(r14, r0)
            r1 = 8
            r0 = r20
            X.0qQ.A0B(r0, r1)
            r13.A03(r1)
            r0 = r24
            r0.A03(r1)
            boolean r0 = r13.A04()
            if (r0 == 0) goto L_0x025f
            android.view.View r15 = r13.A01()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.pulsingbutton.PulsingPillButton"
            X.0qQ.A0C(r15, r0)
            com.instagram.ui.widget.pulsingbutton.PulsingPillButton r15 = (com.instagram.ui.widget.pulsingbutton.PulsingPillButton) r15
            r15.setPulsingEnabled(r10)
        L_0x025f:
            r0 = r25
            r0.A03(r1)
            android.view.ViewGroup r0 = r12.A00
            if (r0 == 0) goto L_0x026b
            r0.setVisibility(r1)
        L_0x026b:
            android.view.View r0 = r14.A01
            if (r0 == 0) goto L_0x0272
            r0.setVisibility(r1)
        L_0x0272:
            r0 = r26
            r0.A03(r1)
            if (r21 != 0) goto L_0x0586
            boolean r0 = r9 instanceof X.C68780NWp
            if (r0 == 0) goto L_0x02fe
            X.NWp r9 = (X.C68780NWp) r9
            android.view.View r1 = r13.A01()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.pulsingbutton.PulsingPillButton"
            X.0qQ.A0C(r1, r0)
            com.instagram.ui.widget.pulsingbutton.PulsingPillButton r1 = (com.instagram.ui.widget.pulsingbutton.PulsingPillButton) r1
            r1.setPulsingEnabled(r8)
            r0 = 2131100318(0x7f06029e, float:1.7813014E38)
            int r8 = r4.getColor(r0)
            r0 = 2131100358(0x7f0602c6, float:1.7813095E38)
            int r0 = r4.getColor(r0)
            r1.A00(r8, r0)
            r0 = 2131959524(0x7f131ee4, float:1.955569E38)
            r1.setButtonText(r0)
            r0 = -1
            r1.A02 = r0
            boolean r8 = r9.A01
            r0 = 28
            if (r8 == 0) goto L_0x02af
            r0 = 27
        L_0x02af:
            X.C71408Ok7.A00(r1, r0, r9, r3)
            r13.A03(r10)
            r0 = 2131959525(0x7f131ee5, float:1.9555693E38)
            X.DbU.A12(r4, r1, r0)
            if (r8 == 0) goto L_0x052d
        L_0x02bd:
            r0 = 2131238969(0x7f082039, float:1.8094232E38)
        L_0x02c0:
            r1.setButtonResource(r0)
        L_0x02c3:
            r1 = 8
        L_0x02c5:
            r0 = r20
            r0.A03(r1)
            X.2eb r1 = r6.A0K
            java.util.List r0 = r7.A0Q
            X.C67075Mhq.A01(r5, r1, r0)
            android.view.View r8 = r6.itemView
            r6 = r36
            r1 = r35
            r0 = r18
            r3.DKO(r8, r0, r6, r1)
            java.lang.String r1 = r7.A0L
            X.Pwa r0 = r7.A08
            if (r0 == 0) goto L_0x02e9
            java.lang.String r1 = r0.ANc(r1)
            X.0qQ.A07(r1)
        L_0x02e9:
            r2.setContentDescription(r1)
            android.content.Context r0 = r4.getApplicationContext()
            if (r17 == 0) goto L_0x02fd
            if (r0 == 0) goto L_0x02fd
            boolean r0 = X.C66732Mbd.A03(r0, r5)
            if (r0 == 0) goto L_0x02fd
            r3.Cqc()
        L_0x02fd:
            return
        L_0x02fe:
            boolean r0 = r9 instanceof X.C66705MbC
            if (r0 == 0) goto L_0x033c
            X.MbC r9 = (X.C66705MbC) r9
            r0 = r19
            X.0qQ.A0B(r9, r0)
            int r0 = r9.A00
            android.graphics.drawable.Drawable r12 = r4.getDrawable(r0)
            if (r12 == 0) goto L_0x02c3
            r0 = r25
            r0.A03(r10)
            android.view.View r8 = r25.A01()
            X.0qQ.A07(r8)
            r0 = 2131437363(0x7f0b2733, float:1.8496623E38)
            android.widget.TextView r10 = X.AnonymousClass7TE.A0d(r8, r0)
            android.graphics.drawable.Drawable r1 = r12.mutate()
            int r0 = r9.A01
            X.AnonymousClass7TE.A1R(r1, r0)
            r10.setCompoundDrawablesRelativeWithIntrinsicBounds(r12, r11, r11, r11)
            java.lang.Integer r1 = r9.A04
            r0 = r22
            if (r1 != r0) goto L_0x06b5
            r0 = 26
            X.C71408Ok7.A00(r8, r0, r9, r3)
            goto L_0x02c3
        L_0x033c:
            boolean r0 = r9 instanceof X.C68781NWr
            if (r0 == 0) goto L_0x03a3
            X.NWr r9 = (X.C68781NWr) r9
            r0 = 2131238054(0x7f081ca6, float:1.8092376E38)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            if (r0 == 0) goto L_0x02c3
            r0 = 29
            X.Ok7 r8 = new X.Ok7
            r8.<init>((int) r0, (java.lang.Object) r9, (java.lang.Object) r3)
            boolean r10 = r9.A04
            com.instagram.common.typedurl.ImageUrl r1 = r9.A00
            com.instagram.common.typedurl.ImageUrl r9 = r9.A01
            android.view.View r0 = r14.A01
            if (r0 != 0) goto L_0x037f
            android.view.ViewStub r0 = r14.A04
            android.view.View r11 = r0.inflate()
            X.0qQ.A07(r11)
            android.content.Context r0 = r11.getContext()
            r14.A00 = r0
            r14.A01 = r11
            r0 = 2131438105(0x7f0b2a19, float:1.8498127E38)
            android.view.View r0 = r11.requireViewById(r0)
            r14.A02 = r0
            r0 = 2131441196(0x7f0b362c, float:1.8504397E38)
            android.view.View r0 = r11.requireViewById(r0)
            r14.A03 = r0
        L_0x037f:
            X.C67284MlJ.A00(r1, r9, r14, r10)
            android.view.View r0 = r14.A01
            if (r0 == 0) goto L_0x0389
            X.AnonymousClass0fU.A00(r8, r0)
        L_0x0389:
            android.view.View r8 = r14.A01
            if (r8 == 0) goto L_0x02c3
            android.content.Context r1 = r14.A00
            if (r1 != 0) goto L_0x039b
            java.lang.String r0 = "context"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x039b:
            r0 = 2131960008(0x7f1320c8, float:1.9556673E38)
            X.DbU.A12(r1, r8, r0)
            goto L_0x02c3
        L_0x03a3:
            boolean r0 = r9 instanceof X.C66962Mfv
            if (r0 == 0) goto L_0x0459
            X.Mfv r9 = (X.C66962Mfv) r9
            boolean r0 = r9.A03
            r16 = r0
            X.3Pi r14 = r9.A02
            r0 = 17
            X.Ojy r13 = new X.Ojy
            r13.<init>(r0, r12, r9, r3)
            android.view.ViewGroup r0 = r12.A00
            if (r0 != 0) goto L_0x0410
            android.view.ViewStub r0 = r12.A03
            android.view.View r15 = r0.inflate()
            android.content.Context r9 = r15.getContext()
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            r12.A00 = r15
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r8 = r15.findViewById(r0)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r8 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r8
            r0 = 0
            if (r8 == 0) goto L_0x042f
            r11 = r23
            r8.setSpinnerType(r11)
        L_0x03d9:
            r12.A01 = r8
            r8 = 2131239500(0x7f08224c, float:1.8095309E38)
            android.graphics.drawable.Drawable r8 = r9.getDrawable(r8)
            r11 = 2131441476(0x7f0b3744, float:1.8504965E38)
            android.view.View r11 = r15.findViewById(r11)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r11 = (com.instagram.ui.widget.slideouticon.SlideInAndOutIconView) r11
            if (r11 == 0) goto L_0x0400
            X.3Td r0 = X.C242233Td.END
            r11.A03 = r0
            int r9 = X.DbU.A01(r9)
            X.JZN r0 = new X.JZN
            r0.<init>(r9)
            r11.A01 = r0
            r11.setIcon(r8)
            r0 = r11
        L_0x0400:
            r12.A02 = r0
            X.4UR r9 = r12.A04
            java.lang.ref.WeakReference r8 = X.C51965G9l.A0v(r0)
            java.util.Set r0 = r9.A07
            r0.clear()
            r0.add(r8)
        L_0x0410:
            android.view.ViewGroup r0 = r12.A00
            if (r0 == 0) goto L_0x0417
            X.AnonymousClass0fU.A00(r13, r0)
        L_0x0417:
            if (r14 == 0) goto L_0x0420
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r12.A01
            if (r0 == 0) goto L_0x0420
            r0.setProgressState(r14)
        L_0x0420:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r12.A01
            if (r0 == 0) goto L_0x0431
            int r8 = r0.A04
            int r0 = r0.A0P
            if (r8 != r0) goto L_0x0431
            X.JZB.A01(r12)
            goto L_0x02c3
        L_0x042f:
            r8 = r11
            goto L_0x03d9
        L_0x0431:
            X.JZB.A00(r12)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r12.A02
            if (r16 == 0) goto L_0x0450
            if (r0 == 0) goto L_0x02c3
            com.instagram.common.ui.text.TitleTextView r8 = r0.A0C
            r8.setVisibility(r10)
            r1 = 1065353216(0x3f800000, float:1.0)
            r8.setAlpha(r1)
            r0 = 0
            r8.setTranslationX(r0)
            r8.setScaleX(r1)
            r8.setScaleY(r1)
            goto L_0x02c3
        L_0x0450:
            if (r0 == 0) goto L_0x02c3
            com.instagram.common.ui.text.TitleTextView r0 = r0.A0C
            r0.setVisibility(r1)
            goto L_0x02c3
        L_0x0459:
            boolean r0 = r9 instanceof X.NWq
            if (r0 == 0) goto L_0x04ca
            X.NWq r9 = (X.NWq) r9
            r0 = r26
            r0.A03(r10)
            android.view.View r14 = r26.A01()
            X.0qQ.A07(r14)
            r0 = 2131437362(0x7f0b2732, float:1.849662E38)
            android.widget.TextView r13 = X.AnonymousClass7TE.A0d(r14, r0)
            r13.setTypeface(r11, r8)
            com.instagram.model.direct.DirectThreadKey r12 = r9.A01
            X.2cs r10 = r3.ByR(r12, r10)
            if (r10 != 0) goto L_0x04ae
            X.JTR.A1B(r13)
        L_0x0480:
            r1 = 2131231265(0x7f080221, float:1.8078606E38)
            int r0 = X.2Yu.A0B(r4)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4Ed.A01(r4, r1, r0)
            if (r0 == 0) goto L_0x06bc
            r13.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r11, r11, r11)
            java.lang.String r0 = r9.A02
            r14.setContentDescription(r0)
            r0 = 30
            X.C71408Ok7.A00(r14, r0, r9, r3)
            r0 = 36325579259458624(0x810dec00053440, double:3.0357808228241994E-306)
            r8 = r16
            boolean r0 = X.182.A06(r8, r5, r0)
            if (r0 == 0) goto L_0x02c3
            java.lang.String r0 = r9.A03
            r3.DKN(r12, r0)
            goto L_0x02c3
        L_0x04ae:
            X.2ct r0 = r10.A09
            double r0 = r0.A00
            float r15 = (float) r0
            r13.setScaleX(r15)
            r13.setScaleY(r15)
            java.util.concurrent.CopyOnWriteArraySet r0 = r10.A0D
            r0.clear()
            X.Lbo r0 = new X.Lbo
            r0.<init>(r13, r8)
            r10.A0A(r0)
            r10.A03()
            goto L_0x0480
        L_0x04ca:
            boolean r0 = r9 instanceof X.C66977MgB
            if (r0 == 0) goto L_0x057f
            X.MgB r9 = (X.C66977MgB) r9
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0532
            android.view.View r1 = r13.A01()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.pulsingbutton.PulsingPillButton"
            X.0qQ.A0C(r1, r0)
            com.instagram.ui.widget.pulsingbutton.PulsingPillButton r1 = (com.instagram.ui.widget.pulsingbutton.PulsingPillButton) r1
            r0 = 2131099808(0x7f0600a0, float:1.781198E38)
            int r11 = r4.getColor(r0)
            X.1QG r0 = X.1QE.A0E()
            X.1QG r12 = X.1QG.A04
            if (r0 != r12) goto L_0x04fb
            boolean r0 = X.C61670oa.A0B()
            if (r0 == 0) goto L_0x04fb
            r0 = 2131100426(0x7f06030a, float:1.7813233E38)
            int r11 = r4.getColor(r0)
        L_0x04fb:
            r0 = 2131099956(0x7f060134, float:1.781228E38)
            int r8 = r4.getColor(r0)
            X.1QG r0 = X.1QE.A0E()
            if (r0 != r12) goto L_0x0515
            boolean r0 = X.C61670oa.A0B()
            if (r0 == 0) goto L_0x0515
            r0 = 2131100426(0x7f06030a, float:1.7813233E38)
            int r8 = r4.getColor(r0)
        L_0x0515:
            r1.A00(r11, r8)
            r0 = 2131959454(0x7f131e9e, float:1.9555549E38)
            r1.setButtonText(r0)
            r1.setPulsingEnabled(r10)
            r13.A03(r10)
            r0 = 25
            X.C71408Ok7.A00(r1, r0, r9, r3)
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x02bd
        L_0x052d:
            r0 = 2131238020(0x7f081c84, float:1.8092307E38)
            goto L_0x02c0
        L_0x0532:
            r0 = r24
            r0.A03(r10)
            android.view.View r1 = r24.A01()
            X.0qQ.A07(r1)
            r0 = 2131436385(0x7f0b2361, float:1.8494639E38)
            android.widget.TextView r10 = X.AnonymousClass7TE.A0d(r1, r0)
            r10.setTypeface(r11, r8)
            r0 = 25
            X.C71408Ok7.A00(r1, r0, r9, r3)
            X.JTR.A1B(r10)
            boolean r0 = r9.A01
            java.lang.String r8 = "Required value was null."
            if (r0 == 0) goto L_0x0568
            r1 = 2131238020(0x7f081c84, float:1.8092307E38)
            int r0 = X.2Yu.A0B(r4)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4Ed.A01(r4, r1, r0)
            if (r0 != 0) goto L_0x057a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0568:
            r1 = 2131238969(0x7f082039, float:1.8094232E38)
            int r0 = X.2Yu.A0B(r4)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4Ed.A01(r4, r1, r0)
            if (r0 != 0) goto L_0x057a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x057a:
            r10.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r11, r11, r11)
            goto L_0x02c3
        L_0x057f:
            if (r9 == 0) goto L_0x02c3
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0586:
            r1 = 0
            goto L_0x02c5
        L_0x0589:
            android.widget.ImageView r0 = r6.A00
            if (r0 == 0) goto L_0x0590
            X.C67318Mls.A00(r4, r0)
        L_0x0590:
            X.2eb r0 = r6.A02
            if (r0 == 0) goto L_0x01fa
            android.view.View r0 = r0.A01()
            X.0qQ.A07(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.C67318Mls.A00(r4, r0)
            goto L_0x01fa
        L_0x05a2:
            r14 = 8
            goto L_0x01e1
        L_0x05a6:
            if (r1 == 0) goto L_0x01a7
            r0.A03(r10)
            android.view.View r0 = r34.A01()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            goto L_0x01a7
        L_0x05b6:
            r0 = 0
            java.util.List r13 = X.C378909Rr.A00(r1, r0, r13)
            r0 = 0
            goto L_0x0617
        L_0x05bd:
            boolean r0 = r15 instanceof X.C66824MdG
            if (r0 == 0) goto L_0x0623
            java.lang.String r14 = "null cannot be cast to non-null type com.instagram.direct.inbox.ui.threadavatar.ThreadAvatarViewModel.Avatar.Double"
            X.0qQ.A0C(r15, r14)
            r1 = r15
            X.MdG r1 = (X.C66824MdG) r1
            com.instagram.common.typedurl.ImageUrl r0 = r1.A00
            r16 = r0
            X.0qQ.A0C(r15, r14)
            com.instagram.common.typedurl.ImageUrl r14 = r1.A01
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r12.A04
            com.instagram.common.ui.widget.imageview.CircularImageView r12 = r1.A0M
            r12.A09()
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x05e4
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r1.A0N
            if (r0 == 0) goto L_0x06c6
            r0.A09()
        L_0x05e4:
            r0 = r16
            java.util.List r13 = X.C378909Rr.A00(r0, r14, r13)
            com.instagram.user.model.User r0 = X.DbS.A0g(r13, r10)
            if (r0 == 0) goto L_0x0616
            com.instagram.common.ui.widget.imageview.CircularImageView r14 = r1.A0N
            if (r14 == 0) goto L_0x0616
            boolean r0 = X.C240943Ng.A02(r5, r0)
            if (r0 == 0) goto L_0x061f
            r0 = 36319510470598091(0x81086700041dcb, double:3.031942896311747E-306)
            boolean r0 = X.182.A06(r11, r5, r0)
            if (r0 == 0) goto L_0x061f
            r14.setVisibility(r10)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r14)
            X.C240943Ng.A00(r0, r14)
            android.graphics.drawable.Drawable r0 = r14.getDrawable()
            X.C240943Ng.A01(r0)
        L_0x0616:
            r0 = 1
        L_0x0617:
            com.instagram.user.model.User r13 = X.DbS.A0g(r13, r0)
            if (r13 == 0) goto L_0x0165
            goto L_0x0143
        L_0x061f:
            r14.setVisibility(r9)
            goto L_0x0616
        L_0x0623:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r12.A04
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r1.A0M
            r0.setVisibility(r9)
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0165
            com.instagram.common.ui.widget.imageview.CircularImageView r12 = r1.A0N
            if (r12 != 0) goto L_0x0637
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0637:
            r12.setVisibility(r9)
            goto L_0x0165
        L_0x063c:
            r0 = r1
            goto L_0x00bc
        L_0x063f:
            r2.setOnClickListener(r1)
            r2.setOnLongClickListener(r1)
            boolean r0 = X.2El.A0H(r5)
            if (r0 != 0) goto L_0x068d
            boolean r13 = r7.A0c
            boolean r12 = r7.A0g
            X.3sy r0 = r7.A0J
            boolean r1 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r5)
            boolean r0 = X.2Ek.A02(r0)
            if (r0 != 0) goto L_0x068d
            if (r1 == 0) goto L_0x067e
            X.0Tu r14 = X.0Tu.A05
            r0 = 36313166804223795(0x8102a200090733, double:3.027931136152748E-306)
            boolean r0 = X.182.A06(r14, r5, r0)
            if (r0 != 0) goto L_0x067e
        L_0x066c:
            r12 = 1
        L_0x066d:
            X.2eb r1 = r6.A0C
            X.Mbz r0 = r7.A09
            X.C69993NvX.A00(r2, r1, r11, r0, r12)
            if (r12 == 0) goto L_0x00d5
            r0 = 1050253722(0x3e99999a, float:0.3)
            r2.setAlpha(r0)
            goto L_0x00d5
        L_0x067e:
            if (r13 == 0) goto L_0x06ad
            X.0Tu r12 = X.0Tu.A06
            r0 = 2342153624806883520(0x20810050000200c0, double:4.057628699319026E-152)
            boolean r0 = X.DbY.A1Z(r12, r5, r0)
            if (r0 != 0) goto L_0x066c
        L_0x068d:
            int r12 = r7.A04
            java.lang.String r1 = r7.A0P
            if (r1 == 0) goto L_0x06b0
            java.lang.String r0 = r5.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x06b0
            r0 = 29
            if (r12 != r0) goto L_0x06b0
            X.0Tu r12 = X.0Tu.A05
            r0 = 36319407397608817(0x81084f00631d71, double:3.0318777125382885E-306)
            boolean r0 = X.182.A06(r12, r5, r0)
            if (r0 == 0) goto L_0x06b0
            goto L_0x066c
        L_0x06ad:
            if (r12 == 0) goto L_0x068d
            goto L_0x066c
        L_0x06b0:
            r12 = 0
            goto L_0x066d
        L_0x06b2:
            r0 = 0
            goto L_0x0052
        L_0x06b5:
            java.lang.String r0 = "Unhandled inbox button state"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x06bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x06c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x06c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67062Mhd.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C66702Mb9.class;
    }

    public C67062Mhd(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, C74512Pw7 pw7, C74398PuE puE, AnonymousClass34Y r6) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A03 = pw7;
        this.A04 = puE;
        this.A05 = r6;
    }
}
