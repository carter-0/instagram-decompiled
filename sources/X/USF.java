package X;

import android.view.View;
import android.widget.Spinner;
import com.facebook.fbreact.views.picker.ReactDropdownPickerManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.dialog.DialogModule;

public final class USF extends C19068WIz {
    public final void EhN(View view, Object obj, String str) {
        Integer valueOf;
        String str2;
        int i = 0;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    view.setEnabled(Pxi.A1Y(obj, true));
                    return;
                }
                break;
            case -979805852:
                if (str.equals("prompt")) {
                    if (obj == null) {
                        str2 = "";
                    } else {
                        str2 = (String) obj;
                    }
                    ((Spinner) view).setPrompt(str2);
                    return;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    if (obj == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(AnonymousClass7TE.A0M(obj));
                    }
                    ((U6E) view).A02 = valueOf;
                    return;
                }
                break;
            case 100526016:
                if (str.equals(DialogModule.KEY_ITEMS)) {
                    ((ReactDropdownPickerManager) this.A00).setItems(view, (ReadableArray) obj);
                    return;
                }
                break;
            case 1191572123:
                if (str.equals("selected")) {
                    if (obj != null) {
                        i = AnonymousClass7TE.A0M(obj);
                    }
                    ((U6E) view).setStagedSelection(i);
                    return;
                }
                break;
        }
        super.EhN(view, obj, str);
    }
}
