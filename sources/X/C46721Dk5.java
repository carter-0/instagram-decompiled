package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.Dk5  reason: case insensitive filesystem */
public final class C46721Dk5 extends LinearLayout implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IgdsPrismMegaphone";
    public View A00;
    public IgSimpleImageView A01;
    public IgSimpleImageView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public CircularImageView A06;
    public CircularImageView A07;
    public IgImageView A08;
    public IgImageView A09;
    public IgdsButton A0A;
    public IgdsButton A0B;
    public IgdsMediaButton A0C;
    public C62320sa A0D = C51786G1v.A00;

    /* JADX WARNING: type inference failed for: r0v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v21, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public C46721Dk5(Context context) {
        super(context, (AttributeSet) null, 0);
        View inflate = View.inflate(context, R.layout.igds_megaphone_layout, this);
        this.A00 = inflate;
        IgImageView findViewById = inflate.findViewById(R.id.cancel_button);
        this.A09 = findViewById;
        findViewById.setOnClickListener(FP1.A00(this, 53));
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) this.A00.findViewById(R.id.cancel_button_full_bleed);
        this.A0C = igdsMediaButton;
        igdsMediaButton.setOnClickListener(FP1.A00(this, 54));
        ? r0 = (CircularImageView) this.A00.findViewById(R.id.igds_megaphone_profile_image);
        this.A06 = r0;
        r0.setVisibility(8);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) this.A00.findViewById(R.id.igds_megaphone_simple_image);
        this.A01 = igSimpleImageView;
        igSimpleImageView.setVisibility(8);
        IgImageView findViewById2 = this.A00.findViewById(R.id.igds_megaphone_full_bleed_image);
        this.A08 = findViewById2;
        findViewById2.setVisibility(8);
        this.A07 = (CircularImageView) this.A00.findViewById(R.id.igds_megaphone_profile_image_right);
        this.A06.setVisibility(8);
        this.A02 = (IgSimpleImageView) this.A00.findViewById(R.id.igds_megaphone_simple_image_right);
        this.A01.setVisibility(8);
        this.A04 = this.A00.findViewById(R.id.igds_megaphone_headline);
        IgTextView findViewById3 = this.A00.findViewById(R.id.igds_megaphone_body);
        this.A03 = findViewById3;
        findViewById3.setVisibility(8);
        IgTextView findViewById4 = this.A00.findViewById(R.id.igds_megaphone_supporting_text);
        this.A05 = findViewById4;
        findViewById4.setVisibility(8);
        this.A0A = (IgdsButton) this.A00.findViewById(R.id.igds_megaphone_primary_button);
        IgdsButton igdsButton = (IgdsButton) this.A00.findViewById(R.id.igds_megaphone_secondary_button);
        this.A0B = igdsButton;
        igdsButton.setVisibility(8);
    }

    public String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void setBody(String str) {
        0qQ.A0B(str, 0);
        IgTextView igTextView = this.A03;
        igTextView.setText(str);
        igTextView.setVisibility(0);
    }

    public final void setDismissListener(C62320sa r2) {
        0qQ.A0B(r2, 0);
        this.A0D = r2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.5n1] */
    public final void setFullBleedImage(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        IgImageView igImageView = this.A08;
        igImageView.setVisibility(0);
        igImageView.setImageDrawable(drawable);
        this.A09.setVisibility(8);
        IgdsMediaButton igdsMediaButton = this.A0C;
        igdsMediaButton.setVisibility(0);
        ? obj = new Object();
        obj.A00 = R.drawable.instagram_x_pano_outline_12;
        igdsMediaButton.setStartAddOn(obj, getContext().getString(2131965985));
    }

    public final void setHeadline(String str) {
        0qQ.A0B(str, 0);
        this.A04.setText(str);
    }

    public final void setIllustrationDrawable(Drawable drawable, EV1 ev1, EVB evb) {
        IgSimpleImageView igSimpleImageView;
        Resources resources;
        int i;
        int dimensionPixelSize;
        0qQ.A0B(drawable, 0);
        if (ev1 == EV1.RIGHT) {
            igSimpleImageView = this.A02;
        } else {
            igSimpleImageView = this.A01;
        }
        igSimpleImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        igSimpleImageView.setImageDrawable(drawable);
        igSimpleImageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        if (!(layoutParams == null || evb == null)) {
            int ordinal = evb.ordinal();
            if (ordinal == 0) {
                resources = getResources();
                i = R.dimen.container_height;
                dimensionPixelSize = resources.getDimensionPixelSize(i);
                layoutParams.width = dimensionPixelSize;
            } else if (ordinal == 1) {
                resources = getResources();
                i = R.dimen.achievements_achievement_image_size;
                dimensionPixelSize = resources.getDimensionPixelSize(i);
                layoutParams.width = dimensionPixelSize;
            } else if (ordinal == 2) {
                Resources resources2 = getResources();
                layoutParams.width = resources2.getDimensionPixelSize(R.dimen.avatar_size_coin_flip_expanded_view);
                dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.achievements_achievement_image_size);
            }
            layoutParams.height = dimensionPixelSize;
            igSimpleImageView.setLayoutParams(layoutParams);
        }
        igSimpleImageView.setAdjustViewBounds(true);
    }

    public final void setPrimaryButton(String str, View.OnClickListener onClickListener) {
        0qQ.A0B(str, 0);
        IgdsButton igdsButton = this.A0A;
        igdsButton.setText(str);
        igdsButton.setOnClickListener(onClickListener);
    }

    public final void setProfileImage(ImageUrl imageUrl) {
        0qQ.A0B(imageUrl, 0);
        setProfileImage(imageUrl, (AnonymousClass0iw) null, EV1.TOP);
    }

    public final void setSecondaryButton(String str, View.OnClickListener onClickListener) {
        0qQ.A0B(str, 0);
        IgdsButton igdsButton = this.A0B;
        igdsButton.setText(str);
        igdsButton.setOnClickListener(onClickListener);
        igdsButton.setVisibility(0);
    }

    public final void setSupportingText(String str, String str2, View.OnClickListener onClickListener) {
        IgTextView igTextView;
        0qQ.A0B(str, 0);
        if (str2 == null || onClickListener == null) {
            igTextView = this.A05;
            igTextView.setText(str);
        } else {
            SpannableStringBuilder A0C2 = DbS.A0C(str);
            AnonymousClass7AV.A05(A0C2, new ESx(onClickListener, AnonymousClass7TF.A03(getContext(), R.attr.igds_color_link)), str2);
            igTextView = this.A05;
            igTextView.setText(A0C2, TextView.BufferType.SPANNABLE);
            igTextView.setMovementMethod(AnonymousClass6LK.A00);
        }
        igTextView.setVisibility(0);
    }

    public static /* synthetic */ void setIllustrationDrawable$default(C46721Dk5 dk5, Drawable drawable, EV1 ev1, EVB evb, int i, Object obj) {
        if ((i & 2) != 0) {
            ev1 = EV1.TOP;
        }
        if ((i & 4) != 0) {
            evb = EVB.SMALL;
        }
        dk5.setIllustrationDrawable(drawable, ev1, evb);
    }

    public static /* synthetic */ void setProfileImage$default(C46721Dk5 dk5, ImageUrl imageUrl, AnonymousClass0iw r3, EV1 ev1, int i, Object obj) {
        if ((i & 2) != 0) {
            r3 = null;
        }
        if ((i & 4) != 0) {
            ev1 = EV1.TOP;
        }
        dk5.setProfileImage(imageUrl, r3, ev1);
    }

    public static /* synthetic */ void setSupportingText$default(C46721Dk5 dk5, String str, String str2, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            onClickListener = null;
        }
        dk5.setSupportingText(str, str2, onClickListener);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setProfileImage(com.instagram.common.typedurl.ImageUrl r5, X.AnonymousClass0iw r6, X.EV1 r7) {
        /*
            r4 = this;
            r1 = 0
            X.0qQ.A0B(r5, r1)
            X.EV1 r0 = X.EV1.RIGHT
            if (r7 != r0) goto L_0x0035
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = r4.A07
        L_0x000a:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r3.setScaleType(r0)
            r3.setVisibility(r1)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 == 0) goto L_0x002a
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165229(0x7f07002d, float:1.794467E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.width = r0
            r2.height = r0
            r3.setLayoutParams(r2)
        L_0x002a:
            if (r6 != 0) goto L_0x002d
            r6 = r4
        L_0x002d:
            r3.setUrl(r5, r6)
            r0 = 1
            r3.setAdjustViewBounds(r0)
            return
        L_0x0035:
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = r4.A06
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46721Dk5.setProfileImage(com.instagram.common.typedurl.ImageUrl, X.0iw, X.EV1):void");
    }

    public final void setProfileImage(ImageUrl imageUrl, AnonymousClass0iw r3) {
        0qQ.A0B(imageUrl, 0);
        setProfileImage(imageUrl, r3, EV1.TOP);
    }
}
