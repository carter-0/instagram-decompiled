package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Jeo  reason: case insensitive filesystem */
public final class C60065Jeo extends LinearLayout {
    public Drawable A00;
    public ImageView A01;
    public IgTextView A02;
    public C296235pj A03 = C296235pj.PRIMARY;
    public C62579KiC A04 = C62579KiC.ROUNDED_RECT;
    public Integer A05;

    public final void setButtonStyle(C296235pj r4) {
        String str;
        0qQ.A0B(r4, 0);
        this.A03 = r4;
        int labelColor = getLabelColor();
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            str = "labelTextView";
        } else {
            igTextView.setTextColor(labelColor);
            if (!(this.A05 == null && this.A00 == null)) {
                ImageView imageView = this.A01;
                str = "iconImageView";
                if (imageView != null) {
                    if (imageView.getDrawable() != null) {
                        imageView.getDrawable().setTint(labelColor);
                    }
                }
            }
            A00(this);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setIcon(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        ImageView imageView = this.A01;
        if (imageView == null) {
            0qQ.A0F("iconImageView");
            throw AnonymousClass00P.createAndThrow();
        }
        if (indexOfChild(imageView) == -1) {
            Context A0S = AnonymousClass7TE.A0S(this);
            int ordinal = this.A04.ordinal();
            int i = 14;
            if (ordinal == 4) {
                i = 24;
            }
            int A022 = DbS.A02(A0S, i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A022, A022);
            int i2 = 4;
            if (ordinal == 4) {
                i2 = 0;
            }
            layoutParams.setMargins(0, 0, 0, DbS.A02(A0S, i2));
            layoutParams.gravity = 1;
            addView(imageView, 0, layoutParams);
        }
        this.A00 = drawable;
        int labelColor = getLabelColor();
        drawable.setTint(labelColor);
        setBackgroundColor(labelColor);
        imageView.setImageDrawable(drawable);
    }

    public static final void A00(C60065Jeo jeo) {
        C62579KiC kiC = jeo.A04;
        if (kiC.A01 || kiC == C62579KiC.ICON_COMPACT) {
            jeo.setBackgroundColor(0);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Context context = jeo.getContext();
        C296235pj r0 = jeo.A03;
        0qQ.A07(context);
        gradientDrawable.setColor(context.getColor(r0.A00(context)));
        gradientDrawable.setCornerRadius(kiC.A00);
        jeo.setBackground(gradientDrawable);
    }

    public final void A02() {
        C62579KiC kiC = this.A04;
        int ordinal = kiC.ordinal();
        if (ordinal != 4) {
            int i = 0;
            Context context = getContext();
            if (ordinal != 5) {
                0qQ.A07(context);
                int A022 = DbS.A02(context, 8);
                0nA.A0i(this, A022, A022);
                if (!kiC.A01) {
                    i = DbS.A02(context, 8);
                }
                0nA.A0h(this, i, i);
            } else {
                0qQ.A07(context);
                int A023 = DbS.A02(context, 16);
                0nA.A0i(this, A023, A023);
                IgTextView igTextView = this.A02;
                if (igTextView == null) {
                    0qQ.A0F("labelTextView");
                    throw AnonymousClass00P.createAndThrow();
                }
                CharSequence text = igTextView.getText();
                if (!(text == null || text.length() == 0)) {
                    i = DbS.A02(context, 6);
                }
                igTextView.setCompoundDrawablePadding(i);
                int A024 = DbS.A02(context, 16);
                0nA.A0h(this, A024, A024);
                igTextView.setTextSize(12.0f);
            }
        } else {
            Context A0S = AnonymousClass7TE.A0S(this);
            int A025 = DbS.A02(A0S, 10);
            0nA.A0i(this, A025, A025);
            int A026 = DbS.A02(A0S, 10);
            0nA.A0h(this, A026, A026);
        }
        A00(this);
    }

    public final C62579KiC getButtonType() {
        return this.A04;
    }

    public final void setLabel(CharSequence charSequence) {
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            0qQ.A0F("labelTextView");
            throw AnonymousClass00P.createAndThrow();
        }
        igTextView.setText(charSequence);
        if (charSequence != null && charSequence.length() != 0) {
            CharSequence contentDescription = getContentDescription();
            if (contentDescription == null || contentDescription.length() == 0) {
                setContentDescription(charSequence);
            }
        }
    }

    public C60065Jeo(Context context, C62579KiC kiC) {
        super(context);
        int i;
        Context A0S = AnonymousClass7TE.A0S(this);
        int ordinal = kiC.ordinal();
        int i2 = 48;
        if (ordinal == 2 || ordinal == 3) {
            i = 8;
        } else if (ordinal != 4) {
            i = 48;
            if (ordinal != 1) {
                i = 60;
            }
        } else {
            i = 44;
        }
        setMinimumWidth(DbS.A02(A0S, i));
        setMinimumHeight(DbS.A02(A0S, ordinal == 4 ? 44 : i2));
        setOrientation(1);
        this.A04 = kiC;
        this.A02 = new IgTextView(A0S);
        IgSimpleImageView igSimpleImageView = new IgSimpleImageView(A0S);
        igSimpleImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01 = igSimpleImageView;
        2eS.A01(this);
        IgTextView igTextView = this.A02;
        if (igTextView != null) {
            igTextView.setGravity(49);
            igTextView.setTextAppearance(R.style.igds_emphasized_body_2);
            boolean z = kiC.A01;
            if (z) {
                igTextView.setSingleLine(true);
                igTextView.setMaxLines(1);
                IgTextView igTextView2 = this.A02;
                if (igTextView2 != null) {
                    igTextView2.setAutoSizeTextTypeUniformWithConfiguration(6, 10, 1, 2);
                }
            } else {
                igTextView.setSingleLine();
            }
            igTextView.setEllipsize(TextUtils.TruncateAt.END);
            int i3 = z ? -1 : -2;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            layoutParams.gravity = 17;
            setTextAlignment(4);
            if (kiC != C62579KiC.ICON_ONLY) {
                IgTextView igTextView3 = this.A02;
                if (igTextView3 != null) {
                    addView(igTextView3, layoutParams);
                }
            }
            A02();
            return;
        }
        0qQ.A0F("labelTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    private final float getButtonAlpha() {
        if (isActivated()) {
            return 1.0f;
        }
        return 0.4f;
    }

    private final int getLabelColor() {
        Context context = getContext();
        C296235pj r0 = this.A03;
        0qQ.A07(context);
        return context.getColor(r0.A01(context));
    }

    public final void A01() {
        Drawable mutate;
        setContentDescription("");
        Drawable drawable = getContext().getDrawable(R.drawable.instagram_chevron_left_outline_16);
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            AnonymousClass7TE.A1R(mutate, getLabelColor());
        }
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            0qQ.A0F("labelTextView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void draw(Canvas canvas) {
        int A0D = AnonymousClass7TG.A0D(canvas, -1510444127);
        ImageView imageView = this.A01;
        if (imageView == null) {
            0qQ.A0F("iconImageView");
            throw AnonymousClass00P.createAndThrow();
        }
        imageView.setColorFilter(getLabelColor());
        super.draw(canvas);
        AnonymousClass0fD.A0A(1015854882, A0D);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(getButtonAlpha());
    }

    public final void setIconResId(int i) {
        this.A05 = Integer.valueOf(i);
        ImageView imageView = this.A01;
        if (imageView == null) {
            0qQ.A0F("iconImageView");
            throw AnonymousClass00P.createAndThrow();
        }
        if (indexOfChild(imageView) == -1) {
            Context A0S = AnonymousClass7TE.A0S(this);
            int ordinal = this.A04.ordinal();
            int i2 = 14;
            if (ordinal == 4) {
                i2 = 24;
            }
            int A022 = DbS.A02(A0S, i2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A022, A022);
            int i3 = 4;
            if (ordinal == 4) {
                i3 = 0;
            }
            layoutParams.setMargins(0, 0, 0, DbS.A02(A0S, i3));
            layoutParams.gravity = 1;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            addView(imageView, 0, layoutParams);
        }
        Drawable drawable = getContext().getDrawable(i);
        this.A00 = drawable;
        int labelColor = getLabelColor();
        if (drawable != null) {
            drawable.setTint(labelColor);
        }
        setBackgroundColor(labelColor);
        imageView.setImageDrawable(drawable);
    }

    public void setPressed(boolean z) {
        float buttonAlpha;
        super.setPressed(z);
        if (z) {
            buttonAlpha = 0.7f;
        } else {
            buttonAlpha = getButtonAlpha();
        }
        setAlpha(buttonAlpha);
    }
}
