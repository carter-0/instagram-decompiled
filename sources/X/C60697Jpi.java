package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jpi  reason: case insensitive filesystem */
public final class C60697Jpi extends C249703kE implements B1G {
    public C361728gh A00 = null;
    public boolean A01;
    public final GradientDrawable A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final ConstraintLayout A06;
    public final UserSession A07;
    public final IgSimpleImageView A08;
    public final IgSimpleImageView A09;
    public final IgImageView A0A;
    public final C361698ge A0B;
    public final C59740JVy A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60697Jpi(ConstraintLayout constraintLayout, AnonymousClass9IV r12, UserSession userSession, C361698ge r14) {
        super(constraintLayout);
        int i;
        0qQ.A0B(constraintLayout, 1);
        this.A06 = constraintLayout;
        this.A0B = r14;
        this.A07 = userSession;
        IgImageView A0b = DbX.A0b(constraintLayout, R.id.gallery_grid_item_thumbnail);
        this.A0A = A0b;
        View requireViewById = constraintLayout.requireViewById(R.id.gallery_grid_item_label);
        TextView textView = (TextView) requireViewById;
        Context A0S = AnonymousClass7TE.A0S(textView);
        Resources resources = textView.getResources();
        textView.setTextSize(0nA.A02(A0S, resources.getDimension(R.dimen.abc_text_size_menu_header_material)));
        textView.setTypeface((Typeface) null, 1);
        textView.setTextColor(resources.getColor(2Yu.A0H(A0S, R.attr.igds_color_secondary_text_on_media), (Resources.Theme) null));
        0qQ.A07(requireViewById);
        this.A05 = textView;
        this.A09 = DbX.A0Y(constraintLayout, R.id.gallery_grid_item_top_left_icon);
        this.A08 = DbX.A0Y(constraintLayout, R.id.gallery_grid_item_bottom_left_icon);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        this.A02 = gradientDrawable;
        C59740JVy jVy = new C59740JVy(AnonymousClass7TE.A0S(constraintLayout));
        this.A0C = jVy;
        View requireViewById2 = constraintLayout.requireViewById(R.id.gallery_grid_item_selection_circle);
        ImageView imageView = (ImageView) requireViewById2;
        imageView.setImageDrawable(jVy);
        0qQ.A07(requireViewById2);
        this.A04 = imageView;
        View A0G = AnonymousClass7TF.A0G(constraintLayout, R.id.gallery_grid_item_selection_overlay);
        this.A03 = A0G;
        C270354gb A0C2 = JTQ.A0C(constraintLayout);
        C376529Ii r2 = (C376529Ii) r12.A01;
        String A042 = AnonymousClass8XE.A04((Integer) r2.A05);
        A0C2.A0F(R.id.background_color, A042);
        A0C2.A0F(R.id.gallery_grid_item_thumbnail, A042);
        A0C2.A0F(R.id.gallery_grid_item_selection_overlay, A042);
        A0C2.A0G(constraintLayout);
        A0b.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int A0M = AnonymousClass7TE.A0M(r2.A01);
        if (A0M == 1) {
            ConstraintLayout constraintLayout2 = this.A06;
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(constraintLayout2);
            A0m.A0C = true;
            A0m.A07 = true;
            A0m.A02 = 0.92f;
            A0m.A04 = new C64850LjC(this, 1);
            A0m.A00();
            AnonymousClass3NG A0m2 = AnonymousClass7TE.A0m(this.A04);
            A0m2.A01(constraintLayout2);
            A0m2.A0C = true;
            A0m2.A07 = true;
            A0m2.A02 = 0.92f;
            A0m2.A04 = new C64850LjC(this, 2);
            A0m2.A00();
        } else if (A0M == 0) {
            ConstraintLayout constraintLayout3 = this.A06;
            LY0.A00(constraintLayout3, 39, this);
            constraintLayout3.setOnLongClickListener(new LYU(this, 2));
        } else {
            throw AnonymousClass7TE.A1K();
        }
        int A0M2 = AnonymousClass7TE.A0M(((C376509Ig) r12.A00).A04);
        if (A0M2 == 1) {
            i = R.color.black_50_transparent;
        } else if (A0M2 == 0) {
            i = R.color.action_bar_semi_transparent_white;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        DbT.A16(A0G.getContext(), A0G, i);
    }

    public final void DSb() {
        this.A01 = true;
    }

    public static final boolean A00(C60697Jpi jpi) {
        MQT mqt;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) jpi.A0A.getDrawable();
        if (bitmapDrawable != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            0qQ.A07(bitmap);
            mqt = new C59787JYg(bitmap);
        } else {
            mqt = C65122Lnk.A00;
        }
        MQT mqt2 = mqt;
        C361728gh r2 = jpi.A00;
        if (r2 == null) {
            return false;
        }
        jpi.A06.post(new C66017M8c(jpi, r2, mqt2));
        return true;
    }
}
