package X;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.VlE  reason: case insensitive filesystem */
public abstract class C18084VlE {
    public static void A01(SearchView.SearchAutoComplete searchAutoComplete) {
        searchAutoComplete.setInputMethodMode(1);
    }

    public static void A00(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }
}
