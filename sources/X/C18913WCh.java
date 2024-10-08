package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.ListPreference;
import com.facebook.react.uimanager.UIManagerHelper;

/* renamed from: X.WCh  reason: case insensitive filesystem */
public final class C18913WCh implements AdapterView.OnItemSelectedListener {
    public final int A00;
    public final Object A01;

    public C18913WCh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        U5Q u5q;
        switch (this.A00) {
            case 0:
                if (i != -1 && (u5q = ((WDV) this.A01).A0A) != null) {
                    u5q.A07 = false;
                    return;
                }
                return;
            case 1:
                ((SearchView) this.A01).A0E(i);
                return;
            case 2:
                if (i >= 0) {
                    ListPreference listPreference = (ListPreference) this.A01;
                    String charSequence = listPreference.A02[i].toString();
                    if (!charSequence.equals(listPreference.A00)) {
                        listPreference.A0O(charSequence);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                AnonymousClass2Fj r2 = ((C7419QCi) this.A01).A05;
                if (adapterView != null) {
                    obj = adapterView.getItemAtPosition(i);
                } else {
                    obj = null;
                }
                0qQ.A0C(obj, "null cannot be cast to non-null type com.fbpay.w3c.CardDetails");
                r2.A0A(obj);
                return;
            default:
                X0R x0r = ((U6E) this.A01).A00;
                if (x0r != null) {
                    WH7 wh7 = (WH7) x0r;
                    C20877X2e x2e = wh7.A01;
                    U6E u6e = wh7.A00;
                    x2e.APe(new UTG(UIManagerHelper.A01(u6e), u6e.getId(), i));
                    return;
                }
                return;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        X0R x0r;
        if (4 - this.A00 == 0 && (x0r = ((U6E) this.A01).A00) != null) {
            WH7 wh7 = (WH7) x0r;
            C20877X2e x2e = wh7.A01;
            U6E u6e = wh7.A00;
            x2e.APe(new UTG(UIManagerHelper.A01(u6e), u6e.getId(), -1));
        }
    }
}
