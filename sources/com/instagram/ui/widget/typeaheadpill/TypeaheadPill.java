package com.instagram.ui.widget.typeaheadpill;

import X.0mp;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass000;
import X.AnonymousClass61Z;
import X.AnonymousClass61a;
import X.C3020061b;
import X.C71382cm;
import X.G6Y;
import X.Pxd;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;
import java.util.regex.Pattern;

public final class TypeaheadPill extends FrameLayout {
    public G6Y A00;
    public String A01;
    public String A02;
    public final TextView A03;
    public final SearchWithDeleteEditText A04;
    public final TextWatcher A05;
    public final ForegroundColorSpan A06;
    public final ForegroundColorSpan A07;
    public final View.OnClickListener A08;
    public final TextView.OnEditorActionListener A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TypeaheadPill(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public static final void A00(Editable editable, TypeaheadPill typeaheadPill) {
        int i;
        int length;
        int i2;
        String str = typeaheadPill.A01;
        Pattern pattern = 0mp.A00;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        String str2 = typeaheadPill.A02;
        if (str2 != null && (length = str2.length()) != 0 && i > 0 && i <= length) {
            String substring = str2.substring(0, i);
            0qQ.A07(substring);
            String str3 = typeaheadPill.A01;
            if (str3 != null && str3.equalsIgnoreCase(substring)) {
                SpannableString spannableString = new SpannableString(typeaheadPill.A02);
                spannableString.setSpan(typeaheadPill.A06, 0, i, 33);
                ForegroundColorSpan foregroundColorSpan = typeaheadPill.A07;
                String str4 = typeaheadPill.A02;
                if (str4 != null) {
                    i2 = str4.length();
                } else {
                    i2 = 0;
                }
                spannableString.setSpan(foregroundColorSpan, i, i2, 33);
                TextView textView = typeaheadPill.A03;
                textView.setText(spannableString);
                textView.setVisibility(0);
                SearchWithDeleteEditText searchWithDeleteEditText = typeaheadPill.A04;
                searchWithDeleteEditText.setTextColor(0);
                if (!typeaheadPill.A01.equals(substring)) {
                    typeaheadPill.A01 = substring;
                    Editable editable2 = editable;
                    if (editable.length() > 0) {
                        TextWatcher textWatcher = typeaheadPill.A05;
                        searchWithDeleteEditText.removeTextChangedListener(textWatcher);
                        editable2.replace(0, editable.length(), substring, 0, i);
                        searchWithDeleteEditText.addTextChangedListener(textWatcher);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        typeaheadPill.A01();
    }

    public final boolean A02(String str) {
        int length;
        int length2;
        String str2 = this.A01;
        if (!(str2 == null || (length = str2.length()) == 0 || str == null || (length2 = str.length()) == 0)) {
            Pattern pattern = 0mp.A00;
            if (length <= length2) {
                String substring = str.substring(0, length);
                0qQ.A07(substring);
                if (str2.equalsIgnoreCase(substring)) {
                    this.A02 = str;
                    Editable editableText = this.A04.getEditableText();
                    0qQ.A07(editableText);
                    A00(editableText, this);
                    return true;
                }
            }
        }
        return false;
    }

    public final SearchWithDeleteEditText getSearchEditText() {
        return this.A04;
    }

    public final void A01() {
        Context context = getContext();
        0qQ.A07(context);
        this.A04.setTextColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text)));
        this.A03.setVisibility(8);
        this.A02 = null;
    }

    public final void setDelegate(G6Y g6y) {
        this.A00 = g6y;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeaheadPill(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A01 = "";
        AnonymousClass61Z r6 = new AnonymousClass61Z(this);
        this.A05 = r6;
        AnonymousClass61a r5 = new AnonymousClass61a(this);
        this.A09 = r5;
        C3020061b r7 = new C3020061b(this);
        this.A08 = r7;
        Object systemService = context.getSystemService(AnonymousClass000.A00(318));
        0qQ.A0C(systemService, Pxd.A00(247));
        ((LayoutInflater) systemService).inflate(R.layout.typeahead_pill, this, true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A2P, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        Context context2 = getContext();
        this.A06 = new ForegroundColorSpan(context2.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text)));
        this.A07 = new ForegroundColorSpan(context2.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_text)));
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        TextView textView = (TextView) requireViewById(R.id.search_text_typeahead);
        this.A03 = textView;
        SearchWithDeleteEditText searchWithDeleteEditText = (SearchWithDeleteEditText) requireViewById(R.id.search_edit_text);
        this.A04 = searchWithDeleteEditText;
        textView.setVisibility(8);
        textView.setOnClickListener(r7);
        textView.setHeight((int) dimension);
        searchWithDeleteEditText.setClearButtonEnabled(false);
        searchWithDeleteEditText.addTextChangedListener(r6);
        searchWithDeleteEditText.setOnEditorActionListener(r5);
        searchWithDeleteEditText.setImeOptions(2);
    }
}
