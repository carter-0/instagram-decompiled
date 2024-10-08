package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Fku  reason: case insensitive filesystem */
public final class C50915Fku implements C20910X4b, X4Z {
    public SearchEditText A00;
    public String A01 = "";
    public boolean A02;
    public final C51916G7k A03;
    public final int A04;

    public C50915Fku(C51916G7k g7k, int i) {
        0qQ.A0B(g7k, 1);
        this.A03 = g7k;
        this.A04 = i;
    }

    public final void A00(SearchEditText searchEditText, boolean z) {
        SearchEditText searchEditText2 = this.A00;
        if (searchEditText2 != null) {
            searchEditText2.A0C = null;
        }
        this.A00 = null;
        this.A00 = searchEditText;
        searchEditText.setSearchIconEnabled(z);
        searchEditText.setText(this.A01);
        searchEditText.setSelection(this.A01.length());
        int i = this.A04;
        if (i != 0) {
            searchEditText.setHint(i);
        }
        searchEditText.A0C = new C51004Fmr(this, 3);
    }

    public final boolean CYJ() {
        return AnonymousClass7TF.A1Q(this.A01.length());
    }

    public final String E4p() {
        return this.A01;
    }
}
