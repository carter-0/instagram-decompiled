package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.E1m  reason: case insensitive filesystem */
public abstract class C47418E1m extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AvatarStickerUpsellBottomSheetFragment";
    public int A00 = 2131953534;
    public int A01 = 2131953535;
    public int A02 = 2131953536;
    public int A03 = R.drawable.ig_avatar_assets_avatar_class_photo;
    public Resources A04;
    public View A05;
    public TextView A06;
    public TextView A07;
    public IgImageView A08;
    public C252063oV A09;
    public IgdsButton A0A;
    public SpinnerImageView A0B;
    public final int A0C = R.drawable.ig_avatar_assets_avatar_class_photo;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A00(0eO.A02, C51801G2k.A00(this, 37));
    public final AnonymousClass0eM A0E = C227642jf.A02(this);

    public void A07() {
        ImageUrl imageUrl;
        if ((this instanceof DxF) || (this instanceof DxD) || (this instanceof DxC) || !(this instanceof DxG) || (imageUrl = ((DxG) this).A05) == null) {
            DbU.A13(requireContext(), A03(), A02());
            return;
        }
        A03().setUrl(imageUrl, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x028f, code lost:
        r6 = (X.DxF) r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r3 = 0
            X.0qQ.A0B(r11, r3)
            super.onViewCreated(r11, r12)
            android.content.res.Resources r0 = X.DbV.A05(r10)
            r10.A04 = r0
            r0 = 2131428502(0x7f0b0496, float:1.847865E38)
            android.widget.TextView r0 = X.DbU.A0G(r11, r0)
            r10.A07 = r0
            r0 = 2131428501(0x7f0b0495, float:1.8478648E38)
            android.widget.TextView r0 = X.DbU.A0G(r11, r0)
            r10.A06 = r0
            r0 = 2131428494(0x7f0b048e, float:1.8478634E38)
            com.instagram.igds.components.button.IgdsButton r0 = X.DbU.A0b(r11, r0)
            r10.A0A = r0
            r0 = 2131428496(0x7f0b0490, float:1.8478638E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r11, r0)
            X.0qQ.A0B(r0, r3)
            r10.A08 = r0
            r0 = 2131428500(0x7f0b0494, float:1.8478646E38)
            X.3oV r0 = X.DbU.A0Y(r11, r0)
            r10.A09 = r0
            r0 = 2131428493(0x7f0b048d, float:1.8478632E38)
            android.view.View r0 = r11.requireViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            X.0qQ.A0B(r0, r3)
            r10.A0B = r0
            X.0eM r5 = r10.A0E
            X.0lg r4 = X.AnonymousClass7TF.A0L(r5, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325351626650524(0x810db7000c339c, double:3.035636866919753E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x031d
            r2 = 2131237506(0x7f081a82, float:1.8091264E38)
        L_0x0061:
            r1 = r10
            boolean r0 = r10 instanceof X.DxD
            if (r0 == 0) goto L_0x0305
            X.DxD r1 = (X.DxD) r1
            r1.A00 = r2
        L_0x006a:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A03()
            boolean r7 = r10 instanceof X.DxG
            if (r7 == 0) goto L_0x008f
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x008f
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L_0x008f
            r0 = -2
            r2.width = r0
            r2.height = r0
            android.content.Context r1 = r10.requireContext()
            r0 = 8
            int r0 = X.DbS.A02(r1, r0)
            r2.bottomMargin = r0
        L_0x008f:
            r6 = r10
            boolean r8 = r10 instanceof X.DxF
            if (r8 == 0) goto L_0x0112
            r0 = r6
            X.DxF r0 = (X.DxF) r0
            X.0eM r0 = r0.A0P
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.avatars.store.AvatarStore r0 = X.25x.A00(r0)
            X.27E r0 = r0.A01
            X.27H r1 = r0.A00
            X.5vi r0 = X.C299715vi.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x00ab:
            if (r0 == 0) goto L_0x0122
            if (r8 == 0) goto L_0x0246
            r9 = r6
            X.DxF r9 = (X.DxF) r9
            boolean r0 = r9.A0J
            if (r0 == 0) goto L_0x0246
            android.widget.TextView r2 = r10.A07
            if (r2 != 0) goto L_0x00c4
            java.lang.String r0 = "titleView"
        L_0x00bc:
            X.0qQ.A0F(r0)
        L_0x00bf:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c4:
            android.content.res.Resources r1 = r10.A04
            java.lang.String r6 = "contextResources"
            if (r1 == 0) goto L_0x010e
            java.lang.Integer r0 = r9.A0E
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x0334
            int r0 = r0.intValue()
            X.DbU.A1A(r1, r2, r0)
            android.widget.TextView r2 = r10.A06
            if (r2 != 0) goto L_0x00de
            java.lang.String r0 = "subtitleView"
            goto L_0x00bc
        L_0x00de:
            android.content.res.Resources r1 = r10.A04
            if (r1 == 0) goto L_0x010e
            java.lang.Integer r0 = r9.A0D
            if (r0 == 0) goto L_0x032f
            int r0 = r0.intValue()
            X.DbU.A1A(r1, r2, r0)
            com.instagram.igds.components.button.IgdsButton r4 = r10.A0A
            java.lang.String r2 = "primaryCtaButton"
            if (r4 == 0) goto L_0x0300
            android.content.res.Resources r1 = r10.A04
            if (r1 == 0) goto L_0x010e
            java.lang.Integer r0 = r9.A0C
            if (r0 == 0) goto L_0x032a
            int r0 = r0.intValue()
            java.lang.String r0 = r1.getString(r0)
            r4.setText((java.lang.String) r0)
            com.instagram.igds.components.button.IgdsButton r1 = r10.A0A
            if (r1 == 0) goto L_0x0300
            r0 = 25
            goto L_0x02c1
        L_0x010e:
            X.0qQ.A0F(r6)
            goto L_0x00bf
        L_0x0112:
            boolean r0 = r10 instanceof X.DxD
            if (r0 != 0) goto L_0x0122
            boolean r0 = r10 instanceof X.DxC
            if (r0 != 0) goto L_0x0122
            if (r7 == 0) goto L_0x0122
            r0 = r6
            X.DxG r0 = (X.DxG) r0
            boolean r0 = r0.A09
            goto L_0x00ab
        L_0x0122:
            android.widget.TextView r2 = r10.A07
            if (r2 == 0) goto L_0x02fb
            android.content.res.Resources r1 = r10.A04
            java.lang.String r9 = "contextResources"
            if (r1 == 0) goto L_0x02f6
            if (r8 == 0) goto L_0x021d
            r0 = r6
            X.DxF r0 = (X.DxF) r0
            int r0 = r0.A05
        L_0x0133:
            X.DbU.A1A(r1, r2, r0)
            android.widget.TextView r2 = r10.A06
            if (r2 == 0) goto L_0x02fe
            android.content.res.Resources r1 = r10.A04
            if (r1 == 0) goto L_0x02f6
            if (r8 == 0) goto L_0x01f4
            r0 = r6
            X.DxF r0 = (X.DxF) r0
            int r0 = r0.A04
        L_0x0145:
            X.DbU.A1A(r1, r2, r0)
            com.instagram.igds.components.button.IgdsButton r4 = r10.A0A
            java.lang.String r2 = "primaryCtaButton"
            if (r4 == 0) goto L_0x0300
            android.content.res.Resources r1 = r10.A04
            if (r1 == 0) goto L_0x02f6
            if (r8 == 0) goto L_0x01cd
            X.DxF r6 = (X.DxF) r6
            int r0 = r6.A03
        L_0x0158:
            java.lang.String r0 = r1.getString(r0)
            r4.setText((java.lang.String) r0)
            com.instagram.igds.components.button.IgdsButton r1 = r10.A0A
            if (r1 == 0) goto L_0x0300
            r0 = 24
            X.FP6.A00(r1, r0, r10)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A03()
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.content.res.Resources r2 = X.DbV.A05(r10)
            X.0eM r6 = r10.A0D
            boolean r1 = X.AnonymousClass7TF.A1Z(r6)
            r0 = 2131165325(0x7f07008d, float:1.7944864E38)
            if (r1 == 0) goto L_0x0182
            r0 = 2131165328(0x7f070090, float:1.794487E38)
        L_0x0182:
            X.DbT.A1B(r2, r4, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A03()
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.content.res.Resources r2 = X.DbV.A05(r10)
            boolean r1 = X.AnonymousClass7TF.A1Z(r6)
            r0 = 2131165326(0x7f07008e, float:1.7944866E38)
            if (r1 == 0) goto L_0x019d
            r0 = 2131165329(0x7f070091, float:1.7944872E38)
        L_0x019d:
            int r0 = r2.getDimensionPixelSize(r0)
            r4.width = r0
            int r1 = r10.A02()
            int r0 = r10.A0C
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r10.A03()
            if (r1 == r0) goto L_0x01c0
            android.content.Context r1 = r10.requireContext()
            int r0 = r10.A02()
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
        L_0x01bb:
            r2.setImageDrawable(r0)
            goto L_0x02c7
        L_0x01c0:
            android.content.Context r1 = r10.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            android.graphics.drawable.Drawable r0 = X.C48369EdQ.A00(r1, r0)
            goto L_0x01bb
        L_0x01cd:
            boolean r0 = r10 instanceof X.DxD
            if (r0 == 0) goto L_0x01d5
            r0 = 2131953474(0x7f130742, float:1.954342E38)
            goto L_0x0158
        L_0x01d5:
            boolean r0 = r10 instanceof X.DxC
            if (r0 == 0) goto L_0x01de
            r0 = 2131953528(0x7f130778, float:1.954353E38)
            goto L_0x0158
        L_0x01de:
            if (r7 == 0) goto L_0x01e5
            r0 = 2131971343(0x7f134d0f, float:1.9579663E38)
            goto L_0x0158
        L_0x01e5:
            boolean r0 = r10 instanceof X.DxB
            if (r0 == 0) goto L_0x01ee
            r0 = 2131953489(0x7f130751, float:1.954345E38)
            goto L_0x0158
        L_0x01ee:
            X.DxE r6 = (X.DxE) r6
            int r0 = r6.A00
            goto L_0x0158
        L_0x01f4:
            boolean r0 = r10 instanceof X.DxD
            if (r0 == 0) goto L_0x01fd
            r0 = 2131953475(0x7f130743, float:1.9543422E38)
            goto L_0x0145
        L_0x01fd:
            boolean r0 = r10 instanceof X.DxC
            if (r0 == 0) goto L_0x0206
            r0 = 2131953530(0x7f13077a, float:1.9543534E38)
            goto L_0x0145
        L_0x0206:
            if (r7 == 0) goto L_0x020d
            r0 = 2131971344(0x7f134d10, float:1.9579665E38)
            goto L_0x0145
        L_0x020d:
            boolean r0 = r10 instanceof X.DxB
            if (r0 == 0) goto L_0x0216
            r0 = 2131953490(0x7f130752, float:1.9543452E38)
            goto L_0x0145
        L_0x0216:
            r0 = r6
            X.DxE r0 = (X.DxE) r0
            int r0 = r0.A01
            goto L_0x0145
        L_0x021d:
            boolean r0 = r10 instanceof X.DxD
            if (r0 == 0) goto L_0x0226
            r0 = 2131953476(0x7f130744, float:1.9543424E38)
            goto L_0x0133
        L_0x0226:
            boolean r0 = r10 instanceof X.DxC
            if (r0 == 0) goto L_0x022f
            r0 = 2131953532(0x7f13077c, float:1.9543538E38)
            goto L_0x0133
        L_0x022f:
            if (r7 == 0) goto L_0x0236
            r0 = 2131971345(0x7f134d11, float:1.9579667E38)
            goto L_0x0133
        L_0x0236:
            boolean r0 = r10 instanceof X.DxB
            if (r0 == 0) goto L_0x023f
            r0 = 2131953491(0x7f130753, float:1.9543454E38)
            goto L_0x0133
        L_0x023f:
            r0 = r6
            X.DxE r0 = (X.DxE) r0
            int r0 = r0.A02
            goto L_0x0133
        L_0x0246:
            android.widget.TextView r2 = r10.A07
            if (r2 == 0) goto L_0x02fb
            android.content.res.Resources r1 = r10.A04
            java.lang.String r9 = "contextResources"
            if (r1 == 0) goto L_0x02f6
            r5 = r10
            if (r8 == 0) goto L_0x02e9
            r0 = r5
            X.DxF r0 = (X.DxF) r0
            int r0 = r0.A02
        L_0x0258:
            X.DbU.A1A(r1, r2, r0)
            android.widget.TextView r2 = r10.A06
            if (r2 == 0) goto L_0x02fe
            android.content.res.Resources r1 = r10.A04
            if (r1 == 0) goto L_0x02f6
            if (r8 == 0) goto L_0x02de
            r0 = r5
            X.DxF r0 = (X.DxF) r0
            int r0 = r0.A01
        L_0x026a:
            X.DbU.A1A(r1, r2, r0)
            com.instagram.igds.components.button.IgdsButton r4 = r10.A0A
            java.lang.String r2 = "primaryCtaButton"
            if (r4 == 0) goto L_0x0300
            android.content.res.Resources r1 = r10.A04
            if (r1 == 0) goto L_0x02f6
            if (r8 == 0) goto L_0x02d4
            X.DxF r5 = (X.DxF) r5
            int r0 = r5.A00
        L_0x027d:
            java.lang.String r0 = r1.getString(r0)
            r4.setText((java.lang.String) r0)
            com.instagram.igds.components.button.IgdsButton r1 = r10.A0A
            if (r1 == 0) goto L_0x0300
            r0 = 22
            X.FP6.A00(r1, r0, r10)
            if (r8 == 0) goto L_0x02c4
            X.DxF r6 = (X.DxF) r6
            java.lang.Integer r0 = r6.A0F
            if (r0 == 0) goto L_0x02c4
            int r4 = r0.intValue()
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x02c4
            X.3oV r0 = r10.A09
            java.lang.String r2 = "secondaryButtonHolder"
            if (r0 == 0) goto L_0x0300
            r0.setVisibility(r3)
            X.3oV r0 = r10.A09
            if (r0 == 0) goto L_0x0300
            android.view.View r1 = r0.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.res.Resources r0 = r10.A04
            if (r0 == 0) goto L_0x02f6
            X.DbU.A1A(r0, r1, r4)
            X.3oV r0 = r10.A09
            if (r0 == 0) goto L_0x0300
            android.view.View r1 = r0.getView()
            r0 = 23
        L_0x02c1:
            X.FP6.A00(r1, r0, r10)
        L_0x02c4:
            r10.A07()
        L_0x02c7:
            r0 = 2131428967(0x7f0b0667, float:1.8479593E38)
            android.view.View r0 = r11.findViewById(r0)
            X.0qQ.A0B(r0, r3)
            r10.A05 = r0
            return
        L_0x02d4:
            if (r7 == 0) goto L_0x02db
            X.DxG r5 = (X.DxG) r5
            int r0 = r5.A00
            goto L_0x027d
        L_0x02db:
            int r0 = r10.A00
            goto L_0x027d
        L_0x02de:
            if (r7 == 0) goto L_0x02e6
            r0 = r5
            X.DxG r0 = (X.DxG) r0
            int r0 = r0.A01
            goto L_0x026a
        L_0x02e6:
            int r0 = r10.A01
            goto L_0x026a
        L_0x02e9:
            if (r7 == 0) goto L_0x02f2
            r0 = r5
            X.DxG r0 = (X.DxG) r0
            int r0 = r0.A02
            goto L_0x0258
        L_0x02f2:
            int r0 = r10.A02
            goto L_0x0258
        L_0x02f6:
            X.0qQ.A0F(r9)
            goto L_0x00bf
        L_0x02fb:
            java.lang.String r2 = "titleView"
            goto L_0x0300
        L_0x02fe:
            java.lang.String r2 = "subtitleView"
        L_0x0300:
            X.0qQ.A0F(r2)
            goto L_0x00bf
        L_0x0305:
            boolean r0 = r10 instanceof X.DxG
            if (r0 == 0) goto L_0x030f
            X.DxG r1 = (X.DxG) r1
            r1.A03 = r2
            goto L_0x006a
        L_0x030f:
            boolean r0 = r10 instanceof X.DxE
            if (r0 == 0) goto L_0x0319
            X.DxE r1 = (X.DxE) r1
            r1.A03 = r2
            goto L_0x006a
        L_0x0319:
            r10.A03 = r2
            goto L_0x006a
        L_0x031d:
            X.0eM r0 = r10.A0D
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x006a
            r2 = 2131237502(0x7f081a7e, float:1.8091256E38)
            goto L_0x0061
        L_0x032a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x032f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0334:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47418E1m.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final int A02() {
        if (this instanceof DxD) {
            return ((DxD) this).A00;
        }
        if (this instanceof DxG) {
            return ((DxG) this).A03;
        }
        if (this instanceof DxE) {
            return ((DxE) this).A03;
        }
        return this.A03;
    }

    public final IgImageView A03() {
        IgImageView igImageView = this.A08;
        if (igImageView != null) {
            return igImageView;
        }
        0qQ.A0F("upsellImage");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A04() {
        String str;
        if (this instanceof DxF) {
            str = ((DxF) this).A0G;
        } else if (this instanceof DxD) {
            str = ((DxD) this).A03;
        } else if (this instanceof DxC) {
            str = ((DxC) this).A01;
        } else if (this instanceof DxG) {
            str = ((DxG) this).A06;
        } else if (this instanceof DxB) {
            str = ((DxB) this).A01;
        } else {
            str = ((DxE) this).A07;
        }
        if (str != null) {
            return str;
        }
        0qQ.A0F("editorLoggingMechanism");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A05() {
        String str;
        if (this instanceof DxF) {
            str = ((DxF) this).A0H;
        } else if (this instanceof DxD) {
            str = ((DxD) this).A04;
        } else if (this instanceof DxC) {
            str = ((DxC) this).A02;
        } else if (this instanceof DxG) {
            str = ((DxG) this).A07;
        } else if (this instanceof DxB) {
            str = ((DxB) this).A02;
        } else {
            str = ((DxE) this).A08;
        }
        if (str != null) {
            return str;
        }
        0qQ.A0F("editorLoggingSurface");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A06(C267624bv r2) {
        if (!(this instanceof DxF)) {
            if (this instanceof DxD) {
                ((DxD) this).A01 = r2;
                return;
            } else if (this instanceof DxC) {
                ((DxC) this).A00 = r2;
                return;
            } else if (this instanceof DxG) {
                ((DxG) this).A04 = r2;
                return;
            } else if (this instanceof DxB) {
                ((DxB) this).A00 = r2;
                return;
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public void A08() {
        Dbc.A0m(this, C63556Kz5.A01);
    }

    public void A09() {
        Dbc.A0m(this, C63556Kz5.A01);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(108591137);
        C47418E1m.super.onCreate(bundle);
        requireArguments();
        AnonymousClass0fD.A09(-785185396, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1928022888);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_sticker_upsell_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(72019535, A022);
        return inflate;
    }
}
