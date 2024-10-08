package com.instagram.ui.widget.editphonenumber;

import X.002;
import X.0Tu;
import X.0hq;
import X.0nA;
import X.182;
import X.2Yu;
import X.AnonymousClass0fD;
import X.AnonymousClass4v0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C16305UsY;
import X.C3270479e;
import X.C48055ESz;
import X.C50106FOw;
import X.C51293Frm;
import X.C71382cm;
import X.DbT;
import X.DbU;
import X.Dbc;
import X.EVZ;
import X.FP4;
import X.FPK;
import X.FQe;
import X.G6B;
import X.G86;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

public class EditPhoneNumberView extends LinearLayout {
    public ViewGroup A00;
    public EditText A01;
    public ImageView A02;
    public ImageView A03;
    public CountryCodeTextView A04;
    public InlineErrorMessageView A05;
    public boolean A06 = false;
    public UserSession A07;
    public boolean A08;
    public final PhoneNumberUtil A09 = PhoneNumberUtil.A01(getContext());
    public final Runnable A0A = new C51293Frm(this);

    public static void A01(Fragment fragment, 0hq r10, UserSession userSession, EVZ evz, G6B g6b, G86 g86, EditPhoneNumberView editPhoneNumberView) {
        UserSession userSession2 = userSession;
        editPhoneNumberView.A07 = userSession;
        CountryCodeData A002 = C3270479e.A00(editPhoneNumberView.getContext());
        String str = editPhoneNumberView.A04.A00;
        if (str == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            if ("+1".equals(A002.A00()) || !182.A06(0Tu.A05, userSession, 2342155458757788790L)) {
                editPhoneNumberView.A04.setCountryCodeWithPlus("+1");
            } else {
                editPhoneNumberView.setCountryCodeWithPlus(A002);
            }
        }
        C50106FOw fOw = new C50106FOw(7, userSession2, g86, r10, fragment, g6b);
        editPhoneNumberView.A04.setOnClickListener(fOw);
        editPhoneNumberView.A03.setOnClickListener(fOw);
        if (editPhoneNumberView.A08) {
            editPhoneNumberView.A02.setOnClickListener(FP4.A00(editPhoneNumberView, 29));
        }
        editPhoneNumberView.A01.setOnFocusChangeListener(new FPK(1, editPhoneNumberView, g86));
        FQe.A00(editPhoneNumberView.A01, g86, 18);
        editPhoneNumberView.A01.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        editPhoneNumberView.A01.addTextChangedListener(new C48055ESz(evz, g86, editPhoneNumberView));
        editPhoneNumberView.A04.addTextChangedListener(new C16305UsY(3, editPhoneNumberView, g86));
        editPhoneNumberView.A01.addTextChangedListener(AnonymousClass4v0.A00(editPhoneNumberView.A07));
    }

    public final void clearFocus() {
        this.A01.clearFocus();
        0nA.A0N(this.A01);
    }

    public String getCountryCode() {
        String str = this.A04.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public TextView getCountryCodeTextView() {
        return this.A04;
    }

    public String getCountryCodeWithoutPlus() {
        return this.A04.getCountryCodeWithoutPlus();
    }

    public EditText getNumberEditText() {
        return this.A01;
    }

    public String getPhone() {
        return AnonymousClass7TF.A0f(this.A01);
    }

    public String getPhoneNumber() {
        String str = this.A04.A00;
        if (str == null) {
            str = "";
        }
        String stripSeparators = PhoneNumberUtils.stripSeparators(002.A0g(str, " ", AnonymousClass7TF.A0f(this.A01)));
        stripSeparators.getClass();
        return stripSeparators;
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.A01.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setCountryCodeWithCountryPrefix(CountryCodeData countryCodeData) {
        this.A04.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    public void setCountryCodeWithPlus(CountryCodeData countryCodeData) {
        this.A04.setCountryCodeWithPlus(countryCodeData);
        this.A01.postDelayed(this.A0A, 200);
    }

    public void setHint(int i) {
        this.A01.setHint(i);
    }

    public void setupEditPhoneNumberView(CountryCodeData countryCodeData, String str) {
        this.A04.setCountryCodeWithCountryPrefix(countryCodeData);
        if (str != null && !str.isEmpty()) {
            this.A01.setText(Dbc.A0E(str));
        }
    }

    public EditPhoneNumberView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        Context context2 = getContext();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context2).inflate(R.layout.layout_edit_phone_view, this);
        this.A00 = viewGroup;
        this.A04 = (CountryCodeTextView) viewGroup.requireViewById(R.id.country_code_picker);
        this.A01 = DbU.A0E(this.A00, R.id.phone_number);
        this.A02 = DbU.A0F(this.A00, R.id.clear_button);
        this.A03 = DbU.A0F(this.A00, R.id.country_code_drop_down);
        this.A05 = (InlineErrorMessageView) this.A00.requireViewById(R.id.phone_inline_error);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0T);
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                this.A04.setCompoundDrawablesWithIntrinsicBounds(R.drawable.instagram_device_phone_pano_outline_24, 0, 0, 0);
                AnonymousClass7TE.A1R(this.A04.getCompoundDrawables()[0].mutate(), 2Yu.A01(context2));
                if (obtainStyledAttributes.hasValue(5)) {
                    this.A04.setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(5, R.dimen.abc_button_padding_horizontal_material));
                }
            }
            if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.getBoolean(2, false)) {
                this.A04.setTypeface((Typeface) null, 1);
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.A04.setTextColor(obtainStyledAttributes.getColor(3, 0));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.A08 = obtainStyledAttributes.getBoolean(0, false);
            }
            if (obtainStyledAttributes.hasValue(6)) {
                i = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            } else {
                i = 0;
            }
            if (obtainStyledAttributes.hasValue(7)) {
                i2 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            } else {
                i2 = 0;
            }
            if (obtainStyledAttributes.hasValue(8)) {
                i3 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            } else {
                i3 = 0;
            }
            this.A04.setPadding(i2, 0, i, 0);
            this.A01.setPadding(i, 0, i3, 0);
            if (obtainStyledAttributes.hasValue(10)) {
                float dimension = obtainStyledAttributes.getDimension(10, 0.0f);
                this.A04.setTextSize(0, dimension);
                this.A01.setTextSize(0, dimension);
            }
            boolean z = obtainStyledAttributes.getBoolean(1, false);
            this.A06 = z;
            if (z) {
                Resources resources = getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                this.A00.requireViewById(R.id.phone_number_container).setBackgroundResource(2Yu.A0H(context, R.attr.textEditBackground));
                this.A00.requireViewById(R.id.phone_number_container).setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                DbT.A1B(resources, this.A00.requireViewById(R.id.phone_number_container).getLayoutParams(), R.dimen.container_height);
                this.A00.requireViewById(R.id.phone_number_container).requestLayout();
                this.A03.setVisibility(0);
                this.A01.setPadding(resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0, 0, 0);
                this.A03.setBackgroundResource(R.drawable.container_divider);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1312548448);
        super.onDetachedFromWindow();
        this.A01.removeCallbacks(this.A0A);
        UserSession userSession = this.A07;
        if (userSession != null) {
            this.A01.removeTextChangedListener(AnonymousClass4v0.A00(userSession));
        }
        AnonymousClass0fD.A0D(-656689200, A062);
    }

    public EditPhoneNumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public void setHint(String str) {
        this.A01.setHint(str);
    }

    public void setupEditPhoneNumberView(String str, String str2) {
        this.A04.setCountryCodeWithPlus(str);
        if (str2 != null && !str2.isEmpty()) {
            this.A01.setText(Dbc.A0E(str2));
        }
    }
}
