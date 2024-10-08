package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.8bD  reason: invalid class name and case insensitive filesystem */
public final class C358628bD {
    public int A00;
    public boolean A01;
    public final View A02;
    public final UserSession A03;
    public final C358458aw A04;
    public final IgdsSwitch A05;

    public C358628bD(View view, AnonymousClass0iw r5, UserSession userSession) {
        0qQ.A0B(view, 2);
        this.A03 = userSession;
        this.A02 = view;
        this.A04 = new C358458aw(r5, userSession);
        ((TextView) view.requireViewById(R.id.sticker_setting_toggle_text)).setText(182.A06(0Tu.A05, userSession, 36321743853528744L) ? 2131966121 : 2131966120);
        IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.sticker_setting_toggle);
        this.A05 = igdsSwitch;
        igdsSwitch.A07 = new C358638bE(this);
        03v.A0B(view, new C358648bF());
        view.setClickable(false);
        view.setOnTouchListener(C358658bG.A00);
    }

    public final void A00(boolean z, boolean z2) {
        String str;
        this.A05.setChecked(z);
        1Av A002 = 1Au.A00(this.A03);
        A002.A0B.Epx(A002, Boolean.valueOf(z), 1Av.A8a[234]);
        this.A01 = z2;
        C358458aw r2 = this.A04;
        if (z2) {
            0wc r22 = r2.A00;
            0Aj A003 = r22.A00(r22.A00, "direct_group_story_mention_nux");
            if (A003.isSampled()) {
                if (z) {
                    str = "continue";
                } else {
                    str = "not now";
                }
                A003.AAJ("nux_selection", str);
                A003.Cgf();
                return;
            }
            return;
        }
        r2.A00(z, false, this.A00);
    }
}
