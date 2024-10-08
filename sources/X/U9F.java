package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.ListPreference;

public final class U9F extends C14762U7t {
    public int A00;
    public CharSequence[] A01;
    public CharSequence[] A02;

    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArray;
        int i;
        int A022 = AnonymousClass0fD.A02(-462119098);
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) A0G();
            CharSequence[] charSequenceArr = listPreference.A01;
            if (charSequenceArr == null || (charSequenceArray = listPreference.A02) == null) {
                IllegalStateException illegalStateException = new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
                AnonymousClass0fD.A09(-1702170337, A022);
                throw illegalStateException;
            }
            String str = listPreference.A00;
            if (str != null) {
                i = charSequenceArray.length;
                while (true) {
                    i--;
                    if (i >= 0) {
                        if (TextUtils.equals(charSequenceArray[i].toString(), str)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.A00 = i;
                this.A01 = charSequenceArr;
            }
            i = -1;
            this.A00 = i;
            this.A01 = charSequenceArr;
        } else {
            this.A00 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.A01 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            charSequenceArray = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
        }
        this.A02 = charSequenceArray;
        AnonymousClass0fD.A09(1921414605, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.A00);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.A01);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.A02);
    }
}
