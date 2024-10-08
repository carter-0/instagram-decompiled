package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

public final class PRQ implements AnonymousClass8Z4 {
    public final /* synthetic */ C67877MwL A00;
    public final /* synthetic */ C49605EzO A01;

    public PRQ(C67877MwL mwL, C49605EzO ezO) {
        this.A00 = mwL;
        this.A01 = ezO;
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        G7N g7n = this.A00.A01;
        if (g7n != null) {
            g7n.searchTextChanged(0mp.A01(str));
        }
        searchEditText.A04();
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        C67877MwL mwL = this.A00;
        if (mwL.A01 != null) {
            C49605EzO ezO = this.A01;
            String charSequence2 = charSequence.toString();
            SearchEditText searchEditText2 = ezO.A00;
            if (searchEditText2 != null) {
                searchEditText2.setText(charSequence2);
            }
            mwL.A01.searchTextChanged(0mp.A01(searchEditText.getSearchString()));
        }
    }
}
