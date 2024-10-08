package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.8i1  reason: invalid class name and case insensitive filesystem */
public final class C362508i1 extends C232222tE {
    public final AnonymousClass9IV A00;
    public final C348297yD A01;
    public final C355608Qq A02;
    public final UserSession A03;
    public final C343317q1 A04;
    public final C361698ge A05;
    public final C62320sa A06;

    public C362508i1(AnonymousClass9IV r2, C348297yD r3, C355608Qq r4, UserSession userSession, C361698ge r6, String str, C62320sa r8) {
        C343317q1 r0;
        0qQ.A0B(r2, 2);
        this.A03 = userSession;
        this.A00 = r2;
        this.A05 = r6;
        this.A02 = r4;
        this.A06 = r8;
        this.A01 = r3;
        if (str != null) {
            r0 = new C343317q1(str);
        } else {
            r0 = null;
        }
        this.A04 = r0;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int dimensionPixelSize;
        int i;
        int i2;
        int color;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 0);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 1);
        UserSession userSession = this.A03;
        AnonymousClass9IV r6 = this.A00;
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r6, 3);
        View inflate = layoutInflater2.inflate(R.layout.gallery_grid_item, viewGroup2, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        C270354gb r2 = new C270354gb();
        r2.A0I(constraintLayout);
        String A042 = AnonymousClass8XE.A04((Integer) ((C376529Ii) r6.A01).A05);
        r2.A0F(R.id.background_color, A042);
        r2.A0F(R.id.gallery_grid_item_thumbnail, A042);
        r2.A0F(R.id.gallery_grid_item_selection_overlay, A042);
        r2.A0G(constraintLayout);
        C376509Ig r22 = (C376509Ig) r6.A00;
        0qQ.A0B(constraintLayout, 0);
        0qQ.A0B(r22, 2);
        Context context = constraintLayout.getContext();
        0qQ.A07(context);
        Resources resources = context.getResources();
        C59740JVy jVy = new C59740JVy(context);
        int intValue = ((Number) r22.A03).intValue();
        if (intValue == 1) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
            i = R.dimen.action_bar_item_spacing_right;
        } else if (intValue == 0) {
            i = R.dimen.account_discovery_bottom_gap;
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        } else {
            throw new RuntimeException();
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
        jVy.A02 = dimensionPixelSize;
        jVy.A01 = dimensionPixelSize2;
        jVy.invalidateSelf();
        View requireViewById = constraintLayout.requireViewById(R.id.gallery_grid_item_selection_circle);
        ImageView imageView = (ImageView) requireViewById;
        imageView.setImageDrawable(jVy);
        0qQ.A07(requireViewById);
        Resources resources2 = imageView.getContext().getResources();
        if (intValue != 1) {
            int dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.abc_star_medium);
            0nA.A0f(imageView, dimensionPixelSize3);
            0nA.A0V(imageView, dimensionPixelSize3);
            i2 = R.dimen.abc_button_inset_vertical_material;
        } else {
            int dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            0nA.A0f(imageView, dimensionPixelSize4);
            0nA.A0V(imageView, dimensionPixelSize4);
            i2 = R.dimen.abc_edit_text_inset_bottom_material;
        }
        int dimensionPixelSize5 = resources2.getDimensionPixelSize(i2);
        imageView.setPadding(dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5);
        IgTextView requireViewById2 = constraintLayout.requireViewById(R.id.gallery_grid_item_label);
        0qQ.A07(requireViewById2);
        IgTextView igTextView = requireViewById2;
        int intValue2 = ((Number) r22.A02).intValue();
        if (intValue2 == 0) {
            Context context2 = igTextView.getContext();
            0qQ.A07(context2);
            igTextView.setTextSize(0nA.A02(context2, igTextView.getResources().getDimension(R.dimen.abc_text_size_menu_header_material)));
            igTextView.setTypeface((Typeface) null, 1);
            color = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_secondary_text_on_media));
        } else if (intValue2 == 1) {
            Context context3 = igTextView.getContext();
            0qQ.A07(context3);
            igTextView.setTextSize(0nA.A02(context3, igTextView.getResources().getDimension(R.dimen.button_text_size)));
            igTextView.setTypeface((Typeface) null, 0);
            color = -1;
        } else {
            throw new RuntimeException();
        }
        igTextView.setTextColor(color);
        C252063oV A012 = 2b1.A01(constraintLayout.requireViewById(R.id.gallery_grid_item_calendar_header_stub), false, false);
        A012.EeU(AnonymousClass9QQ.A00);
        View requireViewById3 = constraintLayout.requireViewById(R.id.gallery_grid_item_selection_overlay);
        0qQ.A07(requireViewById3);
        View requireViewById4 = constraintLayout.requireViewById(R.id.gallery_grid_item_bottom_container);
        0qQ.A07(requireViewById4);
        C378479Py r8 = new C378479Py(requireViewById3, requireViewById4, imageView, igTextView, 2b1.A01(constraintLayout.requireViewById(R.id.gallery_grid_item_favorite_view_stub), false, false), 2b1.A01(constraintLayout.requireViewById(R.id.gallery_grid_item_ml_data_stub), false, false), A012, 2b1.A01(constraintLayout.requireViewById(R.id.gallery_grid_item_motion_photo_view_stub), false, false), 2b1.A01(constraintLayout.requireViewById(R.id.gallery_grid_item_glasses_capture_view_stub), false, false), jVy);
        r8.A09.EeU(new C378489Pz(r8));
        Number number = (Number) r22.A01;
        if (number != null && number.intValue() == 24) {
            ((ImageView) r8.A08.getView()).setImageResource(R.drawable.instagram_boomerang_pano_outline_24);
        }
        int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        IgImageView requireViewById5 = constraintLayout.requireViewById(R.id.gallery_grid_item_thumbnail);
        0qQ.A07(requireViewById5);
        return new C59739JVx(constraintLayout, r8, new C59738JVw((ColorFilter) null, requireViewById5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0221, code lost:
        if (r32.A00 == -1) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0271, code lost:
        if (r1 == null) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0295, code lost:
        if (r1.equals(true) == false) goto L_0x0297;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0576  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0592  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r42, X.C249703kE r43) {
        /*
            r41 = this;
            r11 = r43
            r2 = r42
            X.8gg r2 = (X.C361718gg) r2
            X.JVx r11 = (X.C59739JVx) r11
            r10 = 0
            X.0qQ.A0B(r2, r10)
            r9 = 1
            X.0qQ.A0B(r11, r9)
            r12 = r41
            X.9IV r0 = r12.A00
            r33 = r0
            com.instagram.common.session.UserSession r8 = r12.A03
            X.8ge r0 = r12.A05
            r40 = r0
            X.8Qq r0 = r12.A02
            r17 = r0
            X.7yD r0 = r12.A01
            r16 = r0
            X.7q1 r0 = r12.A04
            r39 = r0
            r0 = r33
            X.0qQ.A0B(r0, r9)
            r31 = 2
            r0 = 3
            X.0qQ.A0B(r8, r0)
            r1 = 4
            r0 = r40
            X.0qQ.A0B(r0, r1)
            r1 = 5
            r0 = r17
            X.0qQ.A0B(r0, r1)
            X.MQB r0 = r11.A02
            r19 = r0
            boolean r0 = r0 instanceof X.C378479Py
            r20 = r0
            if (r0 == 0) goto L_0x04e0
            r7 = r19
            X.9Py r7 = (X.C378479Py) r7
            if (r7 == 0) goto L_0x04e0
            com.instagram.common.gallery.Medium r1 = r11.A00
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r0 = r2.A01
            com.instagram.common.gallery.Medium r6 = r0.A00
            X.8in r13 = r2.A02
            X.9I9 r0 = r2.A00
            r32 = r0
            X.02m r3 = X.02m.A0p
            r2 = 18949957(0x1212745, float:2.9599204E-38)
            int r0 = r6.A05
            r3.markerStart(r2, r0)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r11.A01
            r5.setVisibility(r10)
            r11.A00 = r6
            X.JVw r14 = r11.A03
            android.view.View$OnLayoutChangeListener r2 = r14.A02
            if (r2 == 0) goto L_0x0077
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r14.A07
            r0.removeOnLayoutChangeListener(r2)
        L_0x0077:
            r0 = r33
            java.lang.Object r4 = r0.A01
            X.9Ii r4 = (X.C376529Ii) r4
            java.lang.Object r2 = r4.A03
            java.lang.Integer r30 = X.AnonymousClass05K.A01
            r0 = r30
            if (r2 != r0) goto L_0x024e
            android.graphics.drawable.GradientDrawable r15 = r14.A01
            if (r15 != 0) goto L_0x0098
            android.graphics.drawable.GradientDrawable r15 = new android.graphics.drawable.GradientDrawable
            r15.<init>()
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r15.setOrientation(r0)
            r15.setDither(r9)
            r14.A01 = r15
        L_0x0098:
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r14.A07
            android.content.Context r2 = r3.getContext()
            r0 = 2130970189(0x7f04064d, float:1.7549081E38)
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = r2.getColor(r0)
            r15.setColor(r0)
            r3.setBackground(r15)
        L_0x00af:
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setScaleX(r0)
            r3.setScaleY(r0)
            r5.setScaleX(r0)
            r5.setScaleY(r0)
            X.JwJ r0 = r14.A03
            if (r1 == 0) goto L_0x024a
            if (r0 == 0) goto L_0x024a
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0246
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r6.A0X
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0246
            r1 = r30
        L_0x00d5:
            java.lang.Object r0 = r4.A02
            r38 = r0
            r15 = r0
            r0 = r30
            if (r15 != r0) goto L_0x00e7
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00e7
            r0 = r16
            X.JX8.A01(r4, r0, r11)
        L_0x00e7:
            java.lang.Integer r29 = X.AnonymousClass05K.A00
            r0 = r29
            if (r1 == r0) goto L_0x00fe
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x00fe
            X.0Tu r15 = X.0Tu.A05
            r0 = 36321060954055721(0x8109d000082429, double:3.032923428293648E-306)
            boolean r0 = X.182.A06(r15, r8, r0)
            if (r0 != 0) goto L_0x0123
        L_0x00fe:
            X.7y9 r1 = r14.A05
            if (r1 != 0) goto L_0x010b
            X.JW5 r1 = new X.JW5
            r0 = r39
            r1.<init>(r4, r8, r11, r0)
            r14.A05 = r1
        L_0x010b:
            X.7yA r0 = r14.A04
            r26 = 0
            r21 = r17
            r22 = r16
            r23 = r0
            r24 = r6
            r25 = r1
            r27 = r26
            r28 = r26
            X.7yA r0 = r21.AGH(r22, r23, r24, r25, r26, r27, r28)
            r14.A04 = r0
        L_0x0123:
            boolean r28 = r6.CeS()
            boolean r0 = r6.A0f
            r27 = r0
            android.content.res.Resources r14 = r3.getResources()
            r0 = 2131969421(0x7f13458d, float:1.9575764E38)
            if (r28 == 0) goto L_0x0137
            r0 = 2131976521(0x7f136149, float:1.9590165E38)
        L_0x0137:
            java.lang.String r22 = r14.getString(r0)
            X.0qQ.A07(r22)
            r21 = 2131965983(0x7f13381f, float:1.9568791E38)
            long r0 = r6.A0C
            r17 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r17
            java.lang.String r15 = "MMMM d, yyyy"
            java.lang.String r16 = X.C14240TsN.A04(r15, r0)
            r15 = 32
            java.lang.String r1 = X.C14240TsN.A01(r2, r0)
            r0 = r16
            java.lang.String r1 = X.002.A0T(r0, r1, r15)
            r0 = r22
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            r0 = r21
            java.lang.String r26 = r14.getString(r0, r1)
            X.0qQ.A07(r26)
            r0 = r32
            int r0 = r0.A00
            if (r0 >= 0) goto L_0x0233
            r0 = 2131975999(0x7f135f3f, float:1.9589106E38)
            java.lang.String r1 = r14.getString(r0)
        L_0x0175:
            X.0qQ.A0A(r1)
            boolean r0 = r13.A06
            r25 = r0
            if (r0 == 0) goto L_0x0184
            r0 = r26
            java.lang.String r26 = X.002.A0R(r1, r0)
        L_0x0184:
            r0 = r33
            java.lang.Object r15 = r0.A00
            X.9Ig r15 = (X.C376509Ig) r15
            boolean r14 = r13.A08
            boolean r0 = r13.A07
            r24 = r0
            boolean r0 = r13.A02
            r23 = r0
            boolean r0 = r13.A05
            r22 = r0
            java.lang.String r1 = r6.A0X
            boolean r0 = r13.A04
            r16 = r0
            r0 = r31
            X.0qQ.A0B(r15, r0)
            r21 = 4
            X.JVy r13 = r7.A0D
            r0 = r32
            int r0 = r0.A00
            r13.A00(r0)
            android.widget.ImageView r0 = r7.A06
            r37 = r0
            r13 = r31
            r0.setImportantForAccessibility(r13)
            r7.A02 = r1
            if (r25 != 0) goto L_0x0228
            if (r14 != 0) goto L_0x0228
            boolean r1 = r7.A03
            android.view.View[] r0 = new android.view.View[]{r37}
            X.C294975nL.A05(r0, r1)
        L_0x01c6:
            java.lang.Object r0 = r15.A04
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r9) goto L_0x0219
            if (r0 != r10) goto L_0x029d
            r0 = r32
            boolean r14 = r0.A04
            r13 = 2131099669(0x7f060015, float:1.7811698E38)
        L_0x01d9:
            android.view.View r1 = r7.A05
            android.content.Context r0 = r1.getContext()
            int r0 = r0.getColor(r13)
            r1.setBackgroundColor(r0)
            boolean r0 = r7.A03
            android.view.View[] r1 = new android.view.View[]{r1}
            if (r14 == 0) goto L_0x0215
            r13 = 0
            X.C294975nL.A04(r13, r1, r0)
        L_0x01f2:
            X.3oV r13 = r7.A08
            if (r24 == 0) goto L_0x0297
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x0297
            java.lang.Boolean r1 = r6.A0I
            if (r1 != 0) goto L_0x028c
            int r14 = r6.hashCode()
            X.0Tu r15 = X.0Tu.A05
            r0 = 36320605687259803(0x8109660004229b, double:3.032635515738697E-306)
            boolean r0 = X.182.A06(r15, r8, r0)
            if (r0 == 0) goto L_0x0273
            X.9Ql r15 = X.C378599Ql.A01
            monitor-enter(r15)
            goto L_0x0260
        L_0x0215:
            X.C294975nL.A05(r1, r0)
            goto L_0x01f2
        L_0x0219:
            if (r25 == 0) goto L_0x0223
            r0 = r32
            int r1 = r0.A00
            r0 = -1
            r14 = 1
            if (r1 != r0) goto L_0x0224
        L_0x0223:
            r14 = 0
        L_0x0224:
            r13 = 2131099788(0x7f06008c, float:1.781194E38)
            goto L_0x01d9
        L_0x0228:
            boolean r13 = r7.A03
            android.view.View[] r1 = new android.view.View[]{r37}
            r0 = 0
            X.C294975nL.A04(r0, r1, r13)
            goto L_0x01c6
        L_0x0233:
            r1 = 2131973049(0x7f1353b9, float:1.9583123E38)
            int r0 = r0 + 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = r14.getString(r1, r0)
            goto L_0x0175
        L_0x0246:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x00d5
        L_0x024a:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x00d5
        L_0x024e:
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r14.A07
            android.content.Context r2 = r3.getContext()
            r0 = 2131099734(0x7f060056, float:1.781183E38)
            int r0 = r2.getColor(r0)
            r3.setBackgroundColor(r0)
            goto L_0x00af
        L_0x0260:
            android.util.LruCache r1 = X.C378599Ql.A00     // Catch:{ all -> 0x026d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x026d }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x026d }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x026d }
            goto L_0x0270
        L_0x026d:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0270:
            monitor-exit(r15)
            if (r1 != 0) goto L_0x028c
        L_0x0273:
            java.lang.String r15 = r6.A0X
            r0 = 28
            X.MMv r1 = new X.MMv
            r1.<init>(r0, r13, r6)
            X.0qQ.A0B(r15, r10)
            X.0nO r13 = X.0nY.A00()     // Catch:{ OutOfMemoryError -> 0x02a3 }
            X.JXV r0 = new X.JXV     // Catch:{ OutOfMemoryError -> 0x02a3 }
            r0.<init>(r8, r15, r1, r14)     // Catch:{ OutOfMemoryError -> 0x02a3 }
            r13.ATE(r0)     // Catch:{ OutOfMemoryError -> 0x02a3 }
            goto L_0x02aa
        L_0x028c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0299
        L_0x0297:
            r0 = 8
        L_0x0299:
            r13.setVisibility(r0)
            goto L_0x02aa
        L_0x029d:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x02a3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1.invoke(r0)
        L_0x02aa:
            X.3oV r13 = r7.A0B
            java.lang.String r14 = r7.A02
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r6.A0G
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x0586
            if (r16 == 0) goto L_0x0586
            X.0Tu r15 = X.0Tu.A05
            r0 = 36329285816041433(0x81114b00023fd9, double:3.038124864132273E-306)
            boolean r0 = X.182.A06(r15, r8, r0)
            if (r0 == 0) goto L_0x0586
            r36 = 30
            X.PqV r0 = new X.PqV
            r31 = r0
            r32 = r13
            r33 = r8
            r34 = r6
            r35 = r14
            r31.<init>((java.lang.Object) r32, (java.lang.Object) r33, (java.lang.Object) r34, (java.lang.String) r35, (int) r36)
            X.C59737JVv.A05(r6, r8, r0)
        L_0x02d7:
            r7.A03 = r10
            r16 = 8
            if (r23 == 0) goto L_0x057d
            long r0 = r6.A0C
            long r0 = r0 * r17
            java.util.Date r13 = new java.util.Date
            r13.<init>(r0)
            X.3oV r0 = r7.A09
            r0.setVisibility(r10)
            android.widget.TextView r14 = r7.A00
            if (r14 == 0) goto L_0x0306
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = "d"
            java.text.SimpleDateFormat r15 = new java.text.SimpleDateFormat
            r15.<init>(r0, r1)
            java.util.TimeZone r0 = X.C14240TsN.A03
            r15.setTimeZone(r0)
            java.lang.String r0 = r15.format(r13)
            r14.setText(r0)
        L_0x0306:
            android.widget.TextView r14 = r7.A01
            if (r14 == 0) goto L_0x0321
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = "MMM"
            java.text.SimpleDateFormat r15 = new java.text.SimpleDateFormat
            r15.<init>(r0, r1)
            java.util.TimeZone r0 = X.C14240TsN.A03
            r15.setTimeZone(r0)
            java.lang.String r0 = r15.format(r13)
            r14.setText(r0)
        L_0x0321:
            com.instagram.common.ui.base.IgTextView r1 = r7.A07
            if (r28 == 0) goto L_0x0576
            r1.setVisibility(r10)
            java.lang.String r0 = r6.B8E()
            r1.setText(r0)
        L_0x032f:
            X.3oV r1 = r7.A0A
            if (r27 == 0) goto L_0x056f
            r1.setVisibility(r10)
        L_0x0336:
            if (r28 != 0) goto L_0x0568
            if (r27 != 0) goto L_0x0568
            android.view.View r1 = r7.A04
            r0 = r16
            r1.setVisibility(r0)
        L_0x0341:
            if (r22 == 0) goto L_0x0451
            X.3oV r1 = r7.A0C
            r1.setVisibility(r10)
            X.8gB r15 = r6.A0F
            java.lang.String r14 = ""
            if (r15 == 0) goto L_0x0431
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r14)
            java.lang.String r0 = "Aesthetic: "
            r13.append(r0)
            float r0 = r15.A00
            r13.append(r0)
            r14 = 10
            r13.append(r14)
            java.lang.String r0 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r0 = "People: "
            r13.append(r0)
            float r0 = r15.A08
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r0 = "Pet: "
            r13.append(r0)
            float r0 = r15.A09
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r0 = "Food: "
            r13.append(r0)
            float r0 = r15.A04
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r0 = "Nature: "
            r13.append(r0)
            float r0 = r15.A05
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r0 = "Nudity: "
            r13.append(r0)
            float r0 = r15.A06
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r0 = "Violence: "
            r13.append(r0)
            float r0 = r15.A0A
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r0 = "Blurry: "
            r13.append(r0)
            float r0 = r15.A01
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r0 = "Document: "
            r13.append(r0)
            float r0 = r15.A02
            r13.append(r0)
            r13.append(r14)
            java.lang.String r14 = r13.toString()
        L_0x0431:
            android.view.View r0 = r1.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r14)
            android.view.View r14 = r1.getView()
            android.view.View r0 = r1.getView()
            android.content.res.Resources r13 = r0.getResources()
            r1 = 0
            r0 = 2131100406(0x7f0602f6, float:1.7813193E38)
            android.graphics.drawable.Drawable r0 = r13.getDrawable(r0, r1)
            r14.setBackground(r0)
        L_0x0451:
            r0 = r26
            r3.setContentDescription(r0)
            r0 = r29
            X.2eS.A04(r3, r0)
            r1 = 2131955479(0x7f130f17, float:1.9547487E38)
            int r0 = r6.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            r3.setTransitionName(r0)
            java.lang.Object r0 = r4.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r9) goto L_0x0529
            if (r0 != r10) goto L_0x0598
            X.9Vw r0 = new X.9Vw
            r13 = r0
            r14 = r6
            r15 = r7
            r16 = r11
            r17 = r40
            r18 = r25
            r13.<init>(r14, r15, r16, r17, r18)
            X.AnonymousClass0fU.A00(r0, r5)
            X.Jbr r1 = new X.Jbr
            r0 = r40
            r1.<init>(r6, r11, r0)
            r5.setOnLongClickListener(r1)
            X.9Vv r1 = new X.9Vv
            r1.<init>(r6, r11, r0)
            r0 = r37
            X.AnonymousClass0fU.A00(r1, r0)
        L_0x04a0:
            r0 = r30
            X.2eS.A04(r3, r0)
            r1 = r38
            r0 = r29
            if (r1 != r0) goto L_0x04fe
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321060954973239(0x8109d000162437, double:3.03292342887389E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x04fe
            X.2el r3 = X.AnonymousClass2hM.A00(r5)
            if (r3 == 0) goto L_0x04e0
            X.JW4 r2 = new X.JW4
            r2.<init>(r6)
            X.0gF r1 = X.C60340gF.A00
            int r0 = r6.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.30a r2 = X.AnonymousClass30Y.A00(r2, r1, r0)
            X.JW3 r1 = new X.JW3
            r0 = r39
            r1.<init>(r5, r8, r7, r0)
        L_0x04d6:
            r2.A00(r1)
            X.30Y r0 = r2.A01()
            r3.A05(r5, r0)
        L_0x04e0:
            if (r20 == 0) goto L_0x04fd
            android.view.View r1 = r11.itemView
            r0 = r19
            X.9Py r0 = (X.C378479Py) r0
            com.instagram.common.ui.base.IgTextView r0 = r0.A07
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            X.0sa r0 = r12.A06
            java.lang.Object r0 = r0.invoke()
            X.7kJ r0 = (X.C339877kJ) r0
            X.C339887kK.A00(r11, r0, r1)
        L_0x04fd:
            return
        L_0x04fe:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r8)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r11)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r6)
            X.Jbs r2 = new X.Jbs
            r0 = r39
            r2.<init>(r0, r4, r3, r1)
            X.2el r3 = X.AnonymousClass2hM.A00(r5)
            if (r3 == 0) goto L_0x04e0
            X.0gF r1 = X.C60340gF.A00
            int r0 = r6.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.30a r2 = X.AnonymousClass30Y.A00(r2, r1, r0)
            X.Jbu r1 = X.C59931Jbu.A00
            goto L_0x04d6
        L_0x0529:
            X.3NG r2 = new X.3NG
            r2.<init>(r5)
            r2.A0C = r9
            r2.A07 = r9
            r1 = 1064011039(0x3f6b851f, float:0.92)
            r2.A02 = r1
            X.JW2 r0 = new X.JW2
            r13 = r0
            r14 = r6
            r15 = r7
            r16 = r11
            r17 = r40
            r18 = r25
            r13.<init>(r14, r15, r16, r17, r18)
            r2.A04 = r0
            r2.A00()
            X.3NG r2 = new X.3NG
            r0 = r37
            r2.<init>(r0)
            r2.A01(r5)
            r2.A0C = r9
            r2.A07 = r9
            r2.A02 = r1
            X.9Pv r1 = new X.9Pv
            r0 = r40
            r1.<init>(r6, r11, r0)
            r2.A04 = r1
            r2.A00()
            goto L_0x04a0
        L_0x0568:
            android.view.View r0 = r7.A04
            r0.setVisibility(r10)
            goto L_0x0341
        L_0x056f:
            r0 = r16
            r1.setVisibility(r0)
            goto L_0x0336
        L_0x0576:
            r0 = r21
            r1.setVisibility(r0)
            goto L_0x032f
        L_0x057d:
            X.3oV r1 = r7.A09
            r0 = r16
            r1.setVisibility(r0)
            goto L_0x0321
        L_0x0586:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r6.A0G
            java.lang.String r0 = r0.A03
            boolean r1 = X.C59737JVv.A06(r8, r0)
            r0 = 8
            if (r1 == 0) goto L_0x0593
            r0 = 0
        L_0x0593:
            r13.setVisibility(r0)
            goto L_0x02d7
        L_0x0598:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362508i1.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C361718gg.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r6) {
        C59739JVx jVx = (C59739JVx) r6;
        if (jVx != null) {
            UserSession userSession = this.A03;
            C376529Ii r3 = (C376529Ii) this.A00.A01;
            C348297yD r1 = this.A01;
            MQB mqb = jVx.A02;
            0qQ.A0C(mqb, "null cannot be cast to non-null type com.instagram.creation.capture.adapter.model.GalleryGridThumbnailOverlayViewHolder.GalleryGridMediaOverlayViewHolder");
            C378479Py r2 = (C378479Py) mqb;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(r3, 1);
            0qQ.A0B(r2, 4);
            JX8.A01(r3, r1, jVx);
            ConstraintLayout constraintLayout = jVx.A01;
            2el A002 = AnonymousClass2hM.A00(constraintLayout);
            if (A002 != null) {
                A002.A04(constraintLayout);
            }
            r2.A0B.setVisibility(8);
        }
    }
}
