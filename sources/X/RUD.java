package X;

import android.content.Context;
import android.os.BaseBundle;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public abstract class RUD {
    public static void A00(Context context, C11347SOg sOg, C340027ka r8, C340037kb r9, ArrayList arrayList, HashSet hashSet) {
        C11347SOg A02;
        if (r9.canGoBack() || r9.canGoForward()) {
            QK4.A00(sOg, r9);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BaseBundle baseBundle = (BaseBundle) it.next();
            String string = baseBundle.getString("action");
            if (!hashSet.contains(string)) {
                String string2 = baseBundle.getString("KEY_LABEL");
                QLA C8U = ((BrowserLiteFragment) r9).C8U();
                if (C8U == null || !C8U.A0b || C10063Rm0.A00.contains(string)) {
                    int i = baseBundle.getInt("KEY_ICON_RES");
                    if (string != null) {
                        A02 = C11347SOg.A02(string);
                        A02.A03 = string2;
                        if (i > 0) {
                            A02.A00 = i;
                        }
                    } else if (string2.equals("MENU_OPEN_WITH")) {
                        A02 = QK5.A01(context, r8, r9, i);
                        if (A02 == null) {
                        }
                    }
                    if ("ACTION_REPORT".equals(string)) {
                        A02.A01 = R.style.IgDestructiveText;
                    }
                    sOg.A04(A02);
                }
            }
        }
    }
}
