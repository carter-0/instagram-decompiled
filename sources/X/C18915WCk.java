package X;

import android.widget.CompoundButton;
import com.facebook.react.uimanager.UIManagerHelper;

/* renamed from: X.WCk  reason: case insensitive filesystem */
public final class C18915WCk implements CompoundButton.OnCheckedChangeListener {
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Q6H q6h = (Q6H) compoundButton.getContext();
        int id = compoundButton.getId();
        C20877X2e A05 = UIManagerHelper.A05(q6h, id);
        if (A05 != null) {
            A05.APe(new UTI(UIManagerHelper.A00(q6h), id, z));
        }
    }
}
