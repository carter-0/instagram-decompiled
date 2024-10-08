package X;

import android.app.Dialog;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.android.R;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class E0N extends C240383Kr {
    public 0lg A00;
    public G6B A01;
    public C46706Djc A02;
    public SearchEditText A03;
    public List A04;

    public final Dialog A0F(Bundle bundle) {
        E0N.super.A0F(bundle);
        FF8 ff8 = new FF8(getContext());
        String upperCase = getString(2131973042).toUpperCase(Locale.getDefault());
        TextView textView = ff8.A0C;
        textView.getClass();
        textView.setText(upperCase);
        View view = ff8.A06;
        view.getClass();
        view.setVisibility(0);
        View A08 = DbU.A08(LayoutInflater.from(getContext()), R.layout.dialog_country_codes);
        AbsListView absListView = (AbsListView) A08.requireViewById(R.id.country_code_list);
        SearchEditText searchEditText = (SearchEditText) A08.requireViewById(R.id.search);
        this.A03 = searchEditText;
        searchEditText.A0C = new C51003Fmq(this);
        ColorFilter A06 = DbV.A06(getContext(), 2Yu.A08(getContext()));
        AnonymousClass7TG.A10(A06, this.A03.getCompoundDrawablesRelative()[0]);
        this.A03.setClearButtonColorFilter(A06);
        C46706Djc djc = new C46706Djc(getContext(), this.A04);
        this.A02 = djc;
        absListView.setAdapter(djc);
        ViewGroup viewGroup = ff8.A07;
        viewGroup.getClass();
        viewGroup.addView(A08);
        viewGroup.setVisibility(0);
        C46659Dig dig = ff8.A0D;
        dig.setCancelable(true);
        dig.setCanceledOnTouchOutside(true);
        C46659Dig A002 = ff8.A00();
        absListView.setOnItemClickListener(new C50126FPq(this, 1));
        return A002;
    }

    public final void onActivityCreated(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1913745824);
        E0N.super.onActivityCreated(bundle);
        this.A01.getWindow().setSoftInputMode(36);
        AnonymousClass0fD.A09(-1897744351, A022);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1698677988);
        E0N.super.onCreate(bundle);
        this.A00 = DbT.A0W(this.mArguments);
        requireContext().getSystemService("phone");
        PhoneNumberUtil A012 = PhoneNumberUtil.A01(getContext());
        this.A04 = AnonymousClass7TE.A1C();
        String language = Locale.getDefault().getLanguage();
        int i = 0;
        String[] iSOCountries = Locale.getISOCountries();
        while (i < iSOCountries.length) {
            Locale locale = new Locale(language, iSOCountries[i]);
            i++;
            int A0A = A012.A0A(locale.getCountry());
            if (A0A != 0) {
                this.A04.add(new CountryCodeData(String.valueOf(A0A), locale.getDisplayCountry(), locale.getCountry()));
            }
        }
        Collections.sort(this.A04);
        AnonymousClass0fD.A09(1129334271, A022);
    }
}
