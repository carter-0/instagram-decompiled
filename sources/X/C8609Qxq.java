package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.form.view.BaseAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.android.R;

/* renamed from: X.Qxq  reason: case insensitive filesystem */
public abstract class C8609Qxq extends TextInputLayout {
    public int A00;
    public GradientDrawable A01;
    public ImageView A02;
    public ProgressBar A03;
    public BaseAutoCompleteTextView A04;
    public int A05;
    public boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8609Qxq(Context context) {
        super(new ContextThemeWrapper(context, R.style.InputFieldContainerStyle), (AttributeSet) null, 0);
        AnonymousClass2E0.A0E();
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(R.layout.fbpay_edit_text_input_layout, this);
        setInputText((BaseAutoCompleteTextView) requireViewById(R.id.auto_complete_edit_text));
        setIcon(DbU.A0F(this, R.id.icon));
        ProgressBar progressBar = (ProgressBar) requireViewById(R.id.spinner_icon);
        this.A03 = progressBar;
        GradientDrawable gradientDrawable = null;
        if (progressBar == null) {
            0qQ.A0F("loadingSpinnerIcon");
            throw AnonymousClass00P.createAndThrow();
        }
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            AnonymousClass2E0.A0A();
            0qQ.A07(context2);
            indeterminateDrawable.setColorFilter(new PorterDuffColorFilter(context2.getColor(R.color.igds_secondary_icon), PorterDuff.Mode.MULTIPLY));
        }
        getInputText().setTextAlignment(5);
        BaseAutoCompleteTextView inputText = getInputText();
        0qQ.A07(context2);
        inputText.setTextSize(0, C9676Reu.A00(context2, R.attr.fbpay_input_field_text_size));
        A0X(false, false);
        setOrientation(0);
        getInputText().setBackground((Drawable) null);
        getInputText().setTextColor(new ColorStateList(new int[][]{Pxh.A1Y(16842910), Pxh.A1Y(-16842910)}, new int[]{Pxj.A0J(context2, R.attr.fbpay_primary_text_color).data, Pxj.A0J(context2, R.attr.fbpay_disabled_text_color).data}));
        getInputText().setPadding(0, (int) C9676Reu.A00(context2, R.attr.fbpay_input_field_text_top_padding), 0, 0);
        setBackgroundResource(Pxj.A0J(context2, R.attr.fbpay_input_field_background).resourceId);
        if (getBackground() instanceof GradientDrawable) {
            Drawable background = getBackground();
            0qQ.A0C(background, C273654mx.A00(0));
            gradientDrawable = (GradientDrawable) background;
        }
        this.A01 = gradientDrawable;
        this.A00 = (int) C9676Reu.A00(context2, R.attr.fbpay_input_field_border_stroke);
        A0W(C8919RFm.A06, false);
        int A002 = (int) C9676Reu.A00(context2, R.attr.fbpay_input_field_bottom_padding);
        int A003 = (int) C9676Reu.A00(context2, R.attr.fbpay_input_field_top_padding);
        int A004 = (int) C9676Reu.A00(context2, R.attr.fbpay_input_field_horizontal_padding);
        setPadding(A004, A003, A004, A002);
    }

    public final void A0V(Drawable drawable, View.OnClickListener onClickListener, Integer num) {
        0qQ.A0B(drawable, 0);
        ProgressBar progressBar = this.A03;
        if (progressBar == null) {
            0qQ.A0F("loadingSpinnerIcon");
            throw AnonymousClass00P.createAndThrow();
        }
        progressBar.setVisibility(8);
        getIcon().setImageDrawable(drawable);
        getIcon().setOnClickListener(onClickListener);
        if (num != null) {
            ViewGroup.LayoutParams layoutParams = getIcon().getLayoutParams();
            layoutParams.height = getResources().getDimensionPixelSize(num.intValue());
            getIcon().setLayoutParams(layoutParams);
        }
        getIcon().setVisibility(0);
    }

    public final void setIcon(ImageView imageView) {
        0qQ.A0B(imageView, 0);
        this.A02 = imageView;
    }

    public final void setInputText(BaseAutoCompleteTextView baseAutoCompleteTextView) {
        0qQ.A0B(baseAutoCompleteTextView, 0);
        this.A04 = baseAutoCompleteTextView;
    }

    public final void setStyle(C8919RFm rFm) {
        0qQ.A0B(rFm, 0);
        A0W(rFm, true);
    }

    public final void A0W(C8919RFm rFm, boolean z) {
        int i;
        int i2;
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
            if (rFm == C8919RFm.A05) {
                i2 = this.A05;
            } else {
                i2 = this.A00;
            }
            Context A0S = AnonymousClass7TE.A0S(this);
            int i3 = rFm.A00;
            0qQ.A0B(A0S, 0);
            gradientDrawable.setStroke(i2, Pxj.A0J(A0S, i3).data);
        }
        if (z) {
            Integer num = rFm.A02;
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = rFm.A01;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 33;
                }
                A0V(AnonymousClass2E0.A0A().A05(AnonymousClass7TE.A0S(this), intValue, i), (View.OnClickListener) null, Integer.valueOf(R.dimen.abc_select_dialog_padding_start_material));
                return;
            }
            getIcon().setVisibility(8);
        }
    }

    public final ImageView getIcon() {
        ImageView imageView = this.A02;
        if (imageView != null) {
            return imageView;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        throw AnonymousClass00P.createAndThrow();
    }

    public final BaseAutoCompleteTextView getInputText() {
        BaseAutoCompleteTextView baseAutoCompleteTextView = this.A04;
        if (baseAutoCompleteTextView != null) {
            return baseAutoCompleteTextView;
        }
        0qQ.A0F("inputText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setShowLoadingSpinner(boolean z) {
        if (z) {
            getIcon().setVisibility(8);
            ProgressBar progressBar = this.A03;
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
        } else {
            ProgressBar progressBar2 = this.A03;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
                return;
            }
        }
        0qQ.A0F("loadingSpinnerIcon");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0U() {
        GradientDrawable gradientDrawable;
        Context A0S = AnonymousClass7TE.A0S(this);
        0qQ.A0B(A0S, 0);
        setBackgroundResource(Pxj.A0J(A0S, R.attr.fbpay_box_input_field_background).resourceId);
        if (getBackground() instanceof GradientDrawable) {
            Drawable background = getBackground();
            0qQ.A0C(background, C273654mx.A00(0));
            gradientDrawable = (GradientDrawable) background;
        } else {
            gradientDrawable = null;
        }
        this.A01 = gradientDrawable;
        this.A00 = (int) C9676Reu.A00(A0S, R.attr.fbpay_box_input_field_border_stroke);
        this.A05 = (int) C9676Reu.A00(A0S, R.attr.fbpay_box_input_field_focus_border_stroke);
        A0W(C8919RFm.A06, false);
    }

    public final void A0X(boolean z, boolean z2) {
        int i;
        int[][] iArr = {Pxh.A1Y(16842910), Pxh.A1Y(-16842910)};
        Context A0S = AnonymousClass7TE.A0S(this);
        if (z) {
            i = R.attr.fbpay_error_text_color;
        } else if (z2) {
            boolean z3 = this.A06;
            i = R.attr.fbpay_focus_color;
            if (z3) {
                i = R.attr.fbpay_box_input_focus_color;
            }
        } else {
            i = R.attr.fbpay_hint_text_color;
        }
        0qQ.A0B(A0S, 0);
        setDefaultHintTextColor(new ColorStateList(iArr, new int[]{Pxj.A0J(A0S, i).data, Pxj.A0J(A0S, R.attr.fbpay_disabled_text_color).data}));
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            0qQ.A0C(layoutParams, AnonymousClass000.A00(18));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = marginLayoutParams.leftMargin;
            Context A0S = AnonymousClass7TE.A0S(this);
            boolean z = this.A06;
            int i4 = R.attr.fbpay_input_field_margin_top;
            if (z) {
                i4 = R.attr.fbpay_box_input_field_margin_top;
            }
            int A002 = (int) C9676Reu.A00(A0S, i4);
            int i5 = marginLayoutParams.rightMargin;
            boolean z2 = this.A06;
            int i6 = R.attr.fbpay_input_field_margin_bottom;
            if (z2) {
                i6 = R.attr.fbpay_box_input_field_margin_bottom;
            }
            marginLayoutParams.setMargins(i3, A002, i5, (int) C9676Reu.A00(A0S, i6));
        }
        if (getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            0qQ.A0C(layoutParams2, AnonymousClass000.A00(6));
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
    }

    public void setId(int i) {
        super.setId(i);
        getInputText().setDropDownAnchor(i);
    }
}
