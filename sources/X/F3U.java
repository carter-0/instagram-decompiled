package X;

import android.app.Activity;
import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;

public final class F3U {
    public C49398Ev0 A00;
    public final Activity A01;
    public final Context A02;
    public final CompoundButton.OnCheckedChangeListener A03 = new FQO(this, 26);
    public final Fragment A04;
    public final UserSession A05;
    public final C49882FBg A06;
    public final List A07;
    public final Set A08;
    public final boolean A09;
    public final 0hq A0A;
    public final AnonymousClass07i A0B;

    public final void A00(C49398Ev0 ev0) {
        this.A00 = ev0;
        EQT eqt = new EQT(this.A0A, this, ev0, 0);
        Context context = this.A02;
        AnonymousClass07i r2 = this.A0B;
        1OC A002 = F7X.A00(this.A05, "notifications");
        A002.A00 = eqt;
        1ES.A00(context, r2, A002);
    }

    public final void A01(Boolean bool) {
        for (Object next : this.A08) {
            if (next instanceof C50989Fmc) {
                ((C50989Fmc) next).A0A = !bool.booleanValue();
            }
            if (next instanceof UsO) {
                ((PR9) next).A0D = bool.booleanValue();
            }
        }
        C49398Ev0 ev0 = this.A00;
        ev0.getClass();
        ev0.A00.setItems(this.A07);
    }

    public F3U(Fragment fragment, UserSession userSession, C49882FBg fBg, boolean z) {
        this.A04 = fragment;
        this.A0B = AnonymousClass07i.A00(fragment);
        this.A0A = fragment.mFragmentManager;
        this.A02 = fragment.requireContext();
        this.A01 = fragment.requireActivity();
        this.A05 = userSession;
        this.A06 = fBg;
        this.A09 = z;
        this.A07 = AnonymousClass7TE.A1C();
        this.A08 = AnonymousClass7TE.A1F();
    }
}
