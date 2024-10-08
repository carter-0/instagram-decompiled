package com.instagram.igds.components.form;

import X.002;
import X.0mk;
import X.0nA;
import X.0qQ;
import X.2Yu;
import X.2eO;
import X.2eQ;
import X.2eS;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass4v0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13989Tnp;
import X.C17921ViC;
import X.C273654mx;
import X.C51966G9m;
import X.C61670oa;
import X.C71382cm;
import X.C71622eP;
import X.C71662eb;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbY;
import X.JTP;
import X.W0n;
import X.W6E;
import X.W7b;
import X.W7n;
import X.WB9;
import X.WBI;
import X.X4E;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Strings;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Deprecated;

public class IgFormField extends ConstraintLayout {
    public int A00;
    public int A01;
    public int A02 = -1;
    public View A03;
    public View A04;
    public View A05;
    public EditText A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public IgImageView A0C;
    public C71662eb A0D;
    public W7n A0E;
    public C17921ViC A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public View.OnTouchListener A0K;
    public View A0L;
    public IgTextView A0M;
    public boolean A0N;
    public final TextWatcher A0O = new W7b(this, 10);

    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new W6E(72);
        public int A00;

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgFormField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A0I || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = new Object[0];
        if (parcelable != null) {
            0qQ.A0C(parcelable, "null cannot be cast to non-null type com.instagram.igds.components.form.IgFormField.SavedState");
            SavedState savedState = (SavedState) parcelable;
            getMEditText().setId(savedState.A00);
            super.onRestoreInstanceState(savedState.getSuperState());
            return;
        }
        throw new NullPointerException(Strings.A00("state is null", objArr));
    }

    public void setAutofillHints(String... strArr) {
        0qQ.A0B(strArr, 0);
        getMEditText().setAutofillHints((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void setBottomDivider(View view) {
        0qQ.A0B(view, 0);
        this.A03 = view;
    }

    public final void setBottomSubtitleErrorView(TextView textView) {
        0qQ.A0B(textView, 0);
        this.A07 = textView;
    }

    public final void setBottomSubtitleInfoView(TextView textView) {
        0qQ.A0B(textView, 0);
        this.A08 = textView;
    }

    public final void setComboFieldText(String str) {
        setComboFieldText(str, (String) null);
    }

    public final void setEditTextOnTouchListener(View.OnTouchListener onTouchListener) {
        0qQ.A0B(onTouchListener, 0);
        this.A0K = onTouchListener;
        getMEditText().setOnTouchListener(onTouchListener);
    }

    public final void setInPickerMode(View.OnClickListener onClickListener) {
        String str;
        this.A0H = false;
        this.A0I = true;
        W7n w7n = this.A0E;
        if (w7n != null) {
            w7n.A05 = true;
            getMEditText().setEnabled(false);
            getMEditText().setFocusable(false);
            setOnClickListener(onClickListener);
            if (this.A0J) {
                W7n w7n2 = this.A0E;
                if (w7n2 != null) {
                    W0n.A03(this, C51966G9m.A1a(w7n2.A0A.A01, "valid"), true);
                }
            } else {
                setBackgroundResource(R.drawable.bg_simple_row);
            }
            C71662eb r0 = this.A0D;
            str = "pickerIconViewStub";
            if (r0 != null) {
                ImageView imageView = (ImageView) r0.A01();
                boolean z = this.A0J;
                int i = R.drawable.instagram_chevron_right_outline_rtl_16;
                if (z) {
                    i = R.drawable.instagram_chevron_down_outline_16;
                }
                imageView.setImageResource(i);
                C71662eb r02 = this.A0D;
                if (r02 != null) {
                    ImageView imageView2 = (ImageView) r02.A01();
                    Context context = getContext();
                    boolean z2 = this.A0J;
                    int i2 = R.attr.igds_color_secondary_text;
                    if (z2) {
                        i2 = R.attr.igds_color_form_field_list_icon_color;
                    }
                    DbU.A14(context, imageView2, 2Yu.A0H(context, i2));
                    C71662eb r03 = this.A0D;
                    if (r03 != null) {
                        r03.A03(0);
                        View view = this.A04;
                        str = "prismComboPicker";
                        if (view != null) {
                            view.setVisibility(8);
                            View view2 = this.A04;
                            if (view2 != null) {
                                view2.setOnClickListener((View.OnClickListener) null);
                                2eS.A01(this);
                                return;
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "ruleManager";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setInlineLabel(TextView textView) {
        0qQ.A0B(textView, 0);
        this.A09 = textView;
    }

    public final void setMEditText(EditText editText) {
        0qQ.A0B(editText, 0);
        this.A06 = editText;
    }

    public final void setPrismFormFieldContainer(View view) {
        0qQ.A0B(view, 0);
        this.A05 = view;
    }

    public final void setStateView(IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        this.A0C = igImageView;
    }

    public final void setText(CharSequence charSequence) {
        String str;
        0qQ.A0B(charSequence, 0);
        getMEditText().setText(charSequence);
        getMEditText().setSelection(charSequence.length());
        boolean A1Q = AnonymousClass7TF.A1Q(charSequence.length());
        TextView inlineLabel = getInlineLabel();
        int i = 4;
        if (A1Q) {
            i = 0;
        }
        inlineLabel.setVisibility(i);
        C17921ViC viC = this.A0F;
        if (viC == null) {
            0qQ.A0F("labelAnimationHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        if (A1Q) {
            str = "inline";
        } else {
            str = "top";
        }
        viC.A00(str, false);
    }

    public final void setTextProperty(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        setText(charSequence);
    }

    public final void setTopLabel(TextView textView) {
        0qQ.A0B(textView, 0);
        this.A0B = textView;
    }

    public final void A0D() {
        if (this.A02 != -1 && this.A0J) {
            this.A0G = true;
            getMEditText().addTextChangedListener(this.A0O);
            TextView textView = this.A0A;
            if (textView == null) {
                0qQ.A0F("textLimitView");
                throw AnonymousClass00P.createAndThrow();
            }
            String A0g = 002.A0g(C13989Tnp.A0m(this.A02), "/", NumberFormat.getInstance(Locale.getDefault()).format((long) this.A02));
            0qQ.A07(A0g);
            textView.setText(A0g);
        }
    }

    public final void A0E() {
        W7n w7n = this.A0E;
        if (w7n == null) {
            0qQ.A0F("ruleManager");
            throw AnonymousClass00P.createAndThrow();
        } else {
            w7n.A00(true);
        }
    }

    public final View getBottomDivider() {
        View view = this.A03;
        if (view != null) {
            return view;
        }
        0qQ.A0F("bottomDivider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView getBottomSubtitleErrorView() {
        TextView textView = this.A07;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("bottomSubtitleErrorView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView getBottomSubtitleInfoView() {
        TextView textView = this.A08;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("bottomSubtitleInfoView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final CharSequence getComboFieldText() {
        IgTextView igTextView = this.A0M;
        if (igTextView != null) {
            return igTextView.getText();
        }
        0qQ.A0F("prismComboPickerTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView getInlineLabel() {
        TextView textView = this.A09;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("inlineLabel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final EditText getMEditText() {
        EditText editText = this.A06;
        if (editText != null) {
            return editText;
        }
        0qQ.A0F("mEditText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View getPrismFormFieldContainer() {
        View view = this.A05;
        if (view != null) {
            return view;
        }
        0qQ.A0F("prismFormFieldContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getStateType$fbandroid_java_com_instagram_igds_components_form_form() {
        W7n w7n = this.A0E;
        if (w7n != null) {
            return w7n.A0A.A01;
        }
        0qQ.A0F("ruleManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgImageView getStateView() {
        IgImageView igImageView = this.A0C;
        if (igImageView != null) {
            return igImageView;
        }
        0qQ.A0F("stateView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView getTopLabel() {
        TextView textView = this.A0B;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("topLabel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setInComboMode(View.OnClickListener onClickListener) {
        String str;
        if (this.A0J) {
            this.A0H = true;
            this.A0I = false;
            W7n w7n = this.A0E;
            if (w7n == null) {
                str = "ruleManager";
            } else {
                w7n.A05 = false;
                View view = this.A04;
                str = "prismComboPicker";
                if (view != null) {
                    view.setVisibility(0);
                    View view2 = this.A04;
                    if (view2 != null) {
                        view2.setOnClickListener(onClickListener);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void setLabelText(String str) {
        W7n w7n = this.A0E;
        String str2 = "ruleManager";
        if (w7n != null) {
            w7n.A04 = str;
            View view = this.A0L;
            if (view == null) {
                str2 = "emptyAccessibilityView";
            } else {
                view.setContentDescription(str);
                W7n w7n2 = this.A0E;
                if (w7n2 != null) {
                    if (0qQ.A0K(w7n2.A0A.A01, "valid") || this.A0J) {
                        getInlineLabel().setText(str);
                        getTopLabel().setText(str);
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setMaxLength(int i) {
        if (i > 0) {
            this.A02 = i;
            getMEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    public final void setPrismMode(boolean z) {
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        this.A0J = z;
        getBottomDivider().setVisibility(DbW.A01(this.A0J ^ true ? 1 : 0));
        W0n.A03(this, false, false);
        if (this.A0J) {
            i = AnonymousClass7TE.A0B(getResources());
        } else {
            i = 0;
        }
        getPrismFormFieldContainer().setPadding(i, 0, i, 0);
        ViewGroup.LayoutParams layoutParams = getPrismFormFieldContainer().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i5 = i / 2;
            marginLayoutParams2.setMargins(0, i5, 0, i5);
            getPrismFormFieldContainer().setLayoutParams(marginLayoutParams2);
        }
        boolean z2 = this.A0J;
        int i6 = R.dimen.add_payment_bottom_sheet_row_subtitle_size;
        if (z2) {
            i6 = R.dimen.abc_text_size_menu_header_material;
        }
        getTopLabel().setTextSize(0, getResources().getDimension(i6));
        ViewGroup.LayoutParams layoutParams2 = getTopLabel().getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            if (this.A0J) {
                i4 = this.A00;
            } else {
                i4 = this.A01;
            }
            marginLayoutParams.setMargins(0, i4, 0, 0);
            getTopLabel().setLayoutParams(marginLayoutParams);
        }
        W0n.A01(this);
        if (this.A0J) {
            i2 = this.A00;
            i3 = 0;
        } else {
            i2 = this.A01;
            i3 = i2;
        }
        getMEditText().setPadding(0, i3, 0, i2);
        EditText mEditText = getMEditText();
        Context A0S = AnonymousClass7TE.A0S(this);
        DbY.A12(mEditText, A0S);
        DbY.A11(getInlineLabel(), A0S);
    }

    public final void setRuleChecker(X4E x4e) {
        W7n w7n = this.A0E;
        if (w7n == null) {
            0qQ.A0F("ruleManager");
            throw AnonymousClass00P.createAndThrow();
        } else {
            w7n.A03 = x4e;
        }
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        View.inflate(context, R.layout.form_field_layout, this);
        Resources resources = getResources();
        this.A01 = AnonymousClass7TE.A0D(resources);
        this.A00 = AnonymousClass7TE.A0E(resources);
        setPrismFormFieldContainer(requireViewById(R.id.prism_form_field_container));
        setStateView(DbT.A0b(this, R.id.state_icon));
        setBottomDivider(requireViewById(R.id.form_field_bottom_divider));
        setBottomSubtitleErrorView(DbU.A0G(this, R.id.prism_form_field_bottom_error_text));
        setBottomSubtitleInfoView(DbU.A0G(this, R.id.prism_form_field_bottom_info_text));
        this.A0A = DbU.A0G(this, R.id.form_field_limit_text);
        this.A04 = requireViewById(R.id.combo_picker_field);
        this.A0M = DbT.A0a(this, R.id.combo_picker_text);
        setMEditText(DbU.A0E(this, R.id.form_field_edit_text));
        getMEditText().setOnFocusChangeListener(new WBI(this, 7));
        getMEditText().addTextChangedListener(new W7b(this, 9));
        int generateViewId = View.generateViewId();
        getMEditText().setId(generateViewId);
        setInlineLabel(DbU.A0G(this, R.id.form_field_label_inline));
        setTopLabel(DbU.A0G(this, R.id.form_field_label_top));
        getTopLabel().setVisibility(4);
        this.A0L = requireViewById(R.id.empty_view_for_accessibility);
        if (2eO.A00(getMEditText().getContext())) {
            getTopLabel().setImportantForAccessibility(2);
            getInlineLabel().setImportantForAccessibility(2);
            View view = this.A0L;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.A0L;
                if (view2 != null) {
                    view2.setLabelFor(generateViewId);
                }
            }
            0qQ.A0F("emptyAccessibilityView");
            throw AnonymousClass00P.createAndThrow();
        }
        2eQ.A03(getTopLabel());
        int A022 = AnonymousClass7TG.A02(context);
        0nA.A0h(this, A022, A022);
        this.A0D = DbY.A0S(this, R.id.form_field_picker_icon);
        View findViewById = findViewById(R.id.form_field_end_loading_view);
        0qQ.A0C(findViewById, C273654mx.A00(15));
        C71662eb r2 = new C71662eb((ViewStub) findViewById);
        View view3 = this.A0L;
        if (view3 != null) {
            this.A0E = new W7n(view3, r2, this);
            this.A0F = new C17921ViC(getInlineLabel(), getTopLabel());
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A18, 0, 0);
            0qQ.A07(obtainStyledAttributes);
            String A002 = C71622eP.A00(context, obtainStyledAttributes, 0);
            if (!(A002 == null || A002.length() == 0)) {
                setLabelText(A002);
            }
            getPrismFormFieldContainer().setOnClickListener(new WB9((Object) this, 35));
            obtainStyledAttributes.recycle();
            setPrismMode(C61670oa.A09());
            return;
        }
        0qQ.A0F("emptyAccessibilityView");
        throw AnonymousClass00P.createAndThrow();
    }

    private final AnonymousClass4v0 getInteractionLogger() {
        Context context = getContext();
        if (context instanceof IgFragmentActivity) {
            return ((IgFragmentActivity) context).getInteractionLogger();
        }
        return null;
    }

    public final void A0F() {
        getMEditText().setEnabled(false);
        getPrismFormFieldContainer().setEnabled(false);
        DbY.A11(getMEditText(), getContext());
    }

    public final void A0G(TextWatcher textWatcher) {
        getMEditText().addTextChangedListener(textWatcher);
    }

    public final void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(z);
        if (this.A0I) {
            getPrismFormFieldContainer().setPressed(z);
        }
    }

    @Deprecated(message = "")
    public final EditText getEditText() {
        return getMEditText();
    }

    public final CharSequence getText() {
        Editable text = getMEditText().getText();
        0qQ.A07(text);
        return text;
    }

    public final CharSequence getTextProperty() {
        return getText();
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(836914370);
        super.onAttachedToWindow();
        AnonymousClass4v0 interactionLogger = getInteractionLogger();
        if (interactionLogger != null) {
            getMEditText().addTextChangedListener(interactionLogger);
        }
        getMEditText().setOnTouchListener(this.A0K);
        EditText mEditText = getMEditText();
        W7n w7n = this.A0E;
        if (w7n == null) {
            0qQ.A0F("ruleManager");
            throw AnonymousClass00P.createAndThrow();
        }
        mEditText.addTextChangedListener(w7n);
        AnonymousClass0fD.A0D(1112322413, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1947562244);
        AnonymousClass4v0 interactionLogger = getInteractionLogger();
        if (interactionLogger != null) {
            DbU.A1E(interactionLogger, this);
        }
        EditText mEditText = getMEditText();
        W7n w7n = this.A0E;
        if (w7n == null) {
            0qQ.A0F("ruleManager");
            throw AnonymousClass00P.createAndThrow();
        }
        mEditText.removeTextChangedListener(w7n);
        getMEditText().setOnTouchListener((View.OnTouchListener) null);
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(-621327316, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float A002;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A0N) {
            this.A0N = true;
            C17921ViC viC = this.A0F;
            if (viC == null) {
                0qQ.A0F("labelAnimationHelper");
                throw AnonymousClass00P.createAndThrow();
            }
            viC.A04 = true;
            TextView textView = viC.A06;
            float f = 0.0f;
            if (textView.getHeight() == 0) {
                A002 = 0.0f;
            } else {
                A002 = JTP.A00((float) viC.A07.getHeight(), textView);
            }
            viC.A00 = A002;
            viC.A01 = (int) (viC.A07.getY() - textView.getY());
            if (0mk.A02(textView.getContext())) {
                textView.setPivotX((float) textView.getWidth());
                f = (float) textView.getHeight();
            } else {
                textView.setPivotX(0.0f);
            }
            textView.setPivotY(f);
            String str = viC.A03;
            if (str != null) {
                viC.A00(str, viC.A05);
                viC.A03 = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.instagram.igds.components.form.IgFormField$SavedState] */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Object[] objArr = new Object[0];
        if (onSaveInstanceState != null) {
            ? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
            baseSavedState.A00 = getMEditText().getId();
            return baseSavedState;
        }
        throw new NullPointerException(Strings.A00("superState is null", objArr));
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        getMEditText().setFilters(inputFilterArr);
    }

    public final void setImeOptions(int i) {
        getMEditText().setImeOptions(i);
    }

    public final void setInputType(int i) {
        getMEditText().setInputType(i);
    }

    public final void setSelection(int i) {
        getMEditText().setSelection(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgFormField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    public final void setComboFieldText(String str, String str2) {
        String str3;
        if (this.A0H) {
            IgTextView igTextView = this.A0M;
            if (igTextView == null) {
                str3 = "prismComboPickerTextView";
            } else {
                igTextView.setText(str);
                if (str2 != null) {
                    View view = this.A04;
                    if (view == null) {
                        str3 = "prismComboPicker";
                    } else {
                        view.setContentDescription(str2);
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgFormField(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context, (AttributeSet) null);
    }
}
