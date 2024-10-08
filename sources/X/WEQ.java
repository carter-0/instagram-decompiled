package X;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;

public final class WEQ implements C20873X1z {
    public static WEQ A00;

    public final /* bridge */ /* synthetic */ CharSequence E54(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.A00)) {
            return editTextPreference.A0a.getString(2131968524);
        }
        return editTextPreference.A00;
    }
}
