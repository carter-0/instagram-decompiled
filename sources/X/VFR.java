package X;

import android.os.Bundle;

public abstract class VFR {
    public static C15289UZu A00(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        C15289UZu uZu = new C15289UZu();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_TITLE_STRING_RES_ID", i6);
        bundle.putInt("EXTRA_SUBTITLE_STRING_RES_ID", i5);
        bundle.putInt("EXTRA_HINT_STRING_RES_ID", i);
        bundle.putString("EXTRA_CONTENT", str);
        if (i4 == -1) {
            i4 = 2131968361;
        }
        bundle.putInt("EXTRA_PROGRESS_BUTTON_LABEL_STRING_RES_ID", i4);
        bundle.putInt("EXTRA_INPUT_MAX_LINES", i3);
        bundle.putInt("EXTRA_INPUT_MAX_CHARACTERS", 150);
        bundle.putInt("EXTRA_INPUT_IME_ACTION", i2);
        uZu.setArguments(bundle);
        return uZu;
    }
}
