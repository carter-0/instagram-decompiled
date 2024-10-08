package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.9r5  reason: invalid class name and case insensitive filesystem */
public final class C390319r5 extends C15291UZw {
    public static final String __redex_internal_original_name = "FanClubWelcomeStoryFragment";
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new C58173Ind(this, 1));

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        AnonymousClass802 A002 = AnonymousClass802.A00(this, new C353818Jf(), new int[]{requireActivity().getColor(R.color.fan_club_purple), requireActivity().getColor(R.color.fan_club_pink)});
        User A0Q = AnonymousClass7TF.A0Q(AnonymousClass7TE.A0k(this));
        AnonymousClass80D A003 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A003, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A003, this);
        A003.A09 = viewGroup;
        AnonymousClass80D.A07(28D.A5J, this, A003);
        A003.A3H = true;
        AnonymousClass80D.A0A(A003);
        A003.A3y = true;
        AnonymousClass80D.A0E(A003, A002, (String) this.A00.getValue());
        AnonymousClass80D.A06(this, A003, A0Q);
        A003.A0h = new C50345FZc(A0Q);
        A003.A28 = AnonymousClass05K.A15;
        return A003;
    }

    public final String getModuleName() {
        return C273654mx.A00(688);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(341969704);
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        C358248ab r1 = new C358248ab((Activity) requireActivity);
        r1.A09(2131962051);
        r1.A08(2131962050);
        r1.A06();
        r1.A0j(requireActivity.getDrawable(R.drawable.ig_illustrations_illo_subscriber_crown_badge_refresh));
        AnonymousClass0fN.A00(r1.A02());
        AnonymousClass0fD.A09(-308573836, A02);
    }
}
