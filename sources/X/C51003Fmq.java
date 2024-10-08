package X;

import android.text.TextUtils;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Fmq  reason: case insensitive filesystem */
public final class C51003Fmq implements AnonymousClass8Z4 {
    public final /* synthetic */ E0N A00;

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
    }

    public C51003Fmq(E0N e0n) {
        this.A00 = e0n;
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String A01 = 0mp.A01(charSequence);
        C46706Djc djc = this.A00.A02;
        String lowerCase = A01.toLowerCase(Locale.getDefault());
        List list = djc.A01;
        list.clear();
        boolean isEmpty = TextUtils.isEmpty(lowerCase);
        ArrayList arrayList = djc.A00;
        if (isEmpty) {
            list.addAll(arrayList);
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CountryCodeData countryCodeData = (CountryCodeData) it.next();
                if (0mp.A0I(countryCodeData.A01(), lowerCase, 0) || 0mp.A0I(countryCodeData.A01, lowerCase, 0) || 0mp.A0I(countryCodeData.A00(), lowerCase, 0)) {
                    list.add(countryCodeData);
                }
            }
        }
        0fE.A00(djc, -1075342464);
    }
}
