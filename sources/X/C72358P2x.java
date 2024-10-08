package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import java.util.List;

/* renamed from: X.P2x  reason: case insensitive filesystem */
public final class C72358P2x implements C74394PuA {
    public C331157Pu A00;
    public final Fragment A01;
    public final UserSession A02;
    public final O7J A03;
    public final Q2C A04;
    public final C270264gS A05;
    public final N4P A06;
    public final C62320sa A07;

    public static final void A00(C72358P2x p2x, boolean z) {
        UserSession userSession = p2x.A02;
        Number number = (Number) DcK.A00(userSession).A04.getValue();
        long A012 = 182.A01(0Tu.A06, userSession, 36602377016709755L);
        Long valueOf = Long.valueOf(A012);
        if (!z || number == null || ((long) number.intValue()) < A012) {
            p2x.A04.A00(p2x.A01, new P4I(p2x, z), z);
            return;
        }
        Fragment fragment = p2x.A01;
        C358248ab A0V = DbW.A0V(fragment);
        A0V.A09(2131963808);
        A0V.A0q(DbV.A0z(fragment, valueOf, 2131963796));
        Dba.A1L(A0V);
        String A032 = N4P.A03(p2x.A06);
        0Aj A0B = C66584MXp.A0B(userSession);
        if (A0B.isSampled()) {
            C66584MXp.A0x(A0B, "show_locked_chat_full", "thread_details_page", A032);
        }
    }

    public final List getItems() {
        SpannableStringBuilder A0C;
        UserSession userSession = this.A02;
        N4P n4p = this.A06;
        String A032 = N4P.A03(n4p);
        0Aj A0B = C66584MXp.A0B(userSession);
        if (A0B.isSampled()) {
            C66584MXp.A0x(A0B, "show_locked_chat_toggle", "thread_details_page", A032);
        }
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) C71467OlB.A00, (C358618bC) new C72739PHt(this, 12), 2131963805, AnonymousClass7TF.A1S(n4p.A02, 1));
        Fragment fragment = this.A01;
        String A0m = DbU.A0m(fragment, 2131963803);
        String A0m2 = DbU.A0m(fragment, 2131963804);
        Context requireContext = fragment.requireContext();
        if (182.A06(0Tu.A06, userSession, 36320902040134593L)) {
            A0C = DbS.A0C(C66580MXl.A10(A0m, A0m2));
            AnonymousClass7AV.A05(A0C, new C48053ESw(requireContext, this, DbV.A02(requireContext)), A0m2);
        } else {
            A0C = DbS.A0C(A0m);
        }
        FGF fgf = new FGF(A0C);
        fgf.A01 = R.style.LockedChatDescription;
        return 0sr.A1P(new Object[]{pr9, fgf});
    }

    public final boolean isEnabled() {
        N4P n4p = this.A06;
        if (((n4p.A08() instanceof DirectThreadKey) || (n4p.A08() instanceof DirectMsysMixedThreadKey)) && this.A04.A02() && !C66640Ma9.A03(n4p) && LockedChatKillSwitch.isLockedChatEnabled(this.A02, true)) {
            return true;
        }
        return false;
    }

    public C72358P2x(Fragment fragment, UserSession userSession, Q2C q2c, N4P n4p, C62320sa r6) {
        C51972G9s.A1B(userSession, q2c);
        this.A02 = userSession;
        this.A06 = n4p;
        this.A01 = fragment;
        this.A04 = q2c;
        this.A07 = r6;
        this.A03 = new O7J(userSession);
        this.A05 = AnonymousClass7MX.A00(userSession);
    }
}
