package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.8bA  reason: invalid class name and case insensitive filesystem */
public final class C358598bA {
    public final UserSession A00;
    public final IgdsSwitch A01;

    public C358598bA(View view, UserSession userSession, int i) {
        0qQ.A0B(view, 2);
        this.A00 = userSession;
        view.setVisibility(0);
        View requireViewById = view.requireViewById(R.id.sticker_setting_toggle_text);
        0qQ.A07(requireViewById);
        ((TextView) requireViewById).setText(i);
        IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.sticker_setting_toggle);
        this.A01 = igdsSwitch;
        igdsSwitch.A07 = new C358608bB(this);
    }
}
