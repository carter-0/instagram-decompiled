package X;

import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import androidx.appcompat.widget.SearchView;
import androidx.preference.SeekBarPreference;

public final class WBP implements View.OnKeyListener {
    public final int A00;
    public final Object A01;

    public WBP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        switch (this.A00) {
            case 0:
                SearchView searchView = (SearchView) this.A01;
                if (searchView.A00 == null) {
                    return false;
                }
                SearchView.SearchAutoComplete searchAutoComplete = searchView.A0d;
                if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                    if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                        return false;
                    }
                    view.cancelLongPress();
                    searchView.A0G(AnonymousClass7TF.A0f(searchAutoComplete));
                    return true;
                } else if (searchView.A00 == null || searchView.A05 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                } else {
                    if (i == 66 || i == 84 || i == 61) {
                        searchView.A0D(searchAutoComplete.getListSelection());
                        return true;
                    }
                    if (i == 21) {
                        i2 = 0;
                    } else if (i == 22) {
                        i2 = searchAutoComplete.length();
                    } else if (i != 19) {
                        return false;
                    } else {
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                    searchAutoComplete.setSelection(i2);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.A00();
                    return true;
                }
            case 1:
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.A01;
                if ((!seekBarPreference.A06 && (i == 21 || i == 22)) || i == 23 || i == 66) {
                    return false;
                }
                SeekBar seekBar = seekBarPreference.A04;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            case 2:
                0qQ.A0B(keyEvent, 2);
                if (keyEvent.getAction() == 0 && i == 66) {
                    C8066QgI qgI = (C8066QgI) this.A01;
                    C8041Qfl qfl = qgI.A04;
                    if (qfl != null) {
                        if (qfl.A0K()) {
                            return true;
                        }
                        C8041Qfl qfl2 = qgI.A04;
                        if (qfl2 != null) {
                            qfl2.A06.A0B(AnonymousClass7TE.A0v());
                            return true;
                        }
                    }
                    0qQ.A0F("viewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
            default:
                if (i == 67) {
                    EditText editText = (EditText) this.A01;
                    if (0qQ.A0K(AnonymousClass7TF.A0f(editText), editText.getContext().getString(2131955073))) {
                        editText.getText().clear();
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
