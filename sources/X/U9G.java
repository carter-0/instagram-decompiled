package X;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class U9G extends C14762U7t {
    public Set A00 = new HashSet();
    public boolean A01;
    public CharSequence[] A02;
    public CharSequence[] A03;

    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArray;
        int A022 = AnonymousClass0fD.A02(-247075498);
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A0G();
            CharSequence[] charSequenceArr = multiSelectListPreference.A01;
            if (charSequenceArr == null || (charSequenceArray = multiSelectListPreference.A02) == null) {
                IllegalStateException illegalStateException = new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
                AnonymousClass0fD.A09(1842221797, A022);
                throw illegalStateException;
            }
            Set set = this.A00;
            set.clear();
            set.addAll(multiSelectListPreference.A00);
            this.A01 = false;
            this.A02 = charSequenceArr;
        } else {
            Set set2 = this.A00;
            set2.clear();
            set2.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.A01 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.A02 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            charSequenceArray = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
        }
        this.A03 = charSequenceArray;
        AnonymousClass0fD.A09(-1143505891, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.A00));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.A01);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.A02);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.A03);
    }
}
