package X;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.WhT  reason: case insensitive filesystem */
public final class C19898WhT implements Runnable {
    public final /* synthetic */ SearchView.SearchAutoComplete A00;

    public C19898WhT(SearchView.SearchAutoComplete searchAutoComplete) {
        this.A00 = searchAutoComplete;
    }

    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.A00;
        if (searchAutoComplete.A01) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.A01 = false;
        }
    }
}
