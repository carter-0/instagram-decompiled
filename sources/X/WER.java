package X;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

public final class WER implements C20873X1z {
    public static WER A00;

    public final /* bridge */ /* synthetic */ CharSequence E54(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.A0N())) {
            return listPreference.A0a.getString(2131968524);
        }
        return listPreference.A0N();
    }
}
