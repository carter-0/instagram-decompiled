package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;

public final class FI4 implements DialogInterface.OnClickListener {
    public final Resources A00;
    public final Ey3 A01;

    public FI4(Resources resources, Ey3 ey3) {
        this.A00 = resources;
        this.A01 = ey3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DbW.A0r(dialogInterface);
        Resources resources = this.A00;
        CharSequence charSequence = new CharSequence[]{resources.getString(2131976694), resources.getString(2131972074)}[i];
        if (0qQ.A0K(resources.getString(2131976694), charSequence)) {
            Ey3 ey3 = this.A01;
            C50672FgX fgX = ey3.A01;
            UserSession userSession = fgX.A02;
            String str = userSession.A06;
            String id = ey3.A02.getId();
            UserDetailFragment userDetailFragment = fgX.A04;
            AnonymousClass0xN A002 = C60510iO.A00(userSession);
            0xI A003 = 0xI.A00(userDetailFragment, "profile_tagging_tap_your_profile_visit_click");
            A003.A0C("self_user_id", str);
            A003.A0C(AnonymousClass000.A00(750), id);
            A002.EFq(A003);
            C255233tn CCb = ey3.A00.CCb();
            if (CCb != null) {
                Fragment A02 = C46447Df9.A02().A02(userSession, C46474Dfc.A01(userSession, CCb.getId(), "self_profile_bio_text_entity", fgX.A03.getModuleName()));
                C323246xB r1 = fgX.A05;
                r1.A03(A02, "profile", true);
                r1.A00();
            }
        } else if (0qQ.A0K(resources.getString(2131972074), charSequence)) {
            Ey3 ey32 = this.A01;
            C50672FgX fgX2 = ey32.A01;
            Context requireContext = fgX2.A04.requireContext();
            Ey2 ey2 = new Ey2(ey32.A00, fgX2, ey32.A02);
            C358248ab A0Y = DbS.A0Y(requireContext);
            A0Y.A09(2131972076);
            A0Y.A08(2131972075);
            C50021FJg.A01(A0Y, ey2, 60, 2131972074);
            DbX.A16(C50021FJg.A00(ey2, 61), A0Y);
        }
    }
}
