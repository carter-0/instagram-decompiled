package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.9qz  reason: invalid class name and case insensitive filesystem */
public final class C390259qz extends C15291UZw {
    public static final String __redex_internal_original_name = "FanClubQuestionStoryFragment";
    public final AnonymousClass0eM A00;

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
        A003.A0h = new C50344FZb(A0Q);
        A003.A28 = AnonymousClass05K.A15;
        return A003;
    }

    public final String getModuleName() {
        return C273654mx.A00(687);
    }

    public C390259qz() {
        0eO r3 = 0eO.A02;
        String A002 = AnonymousClass000.A00(2096);
        this.A00 = AnonymousClass0eN.A00(r3, new C51804G2n((Object) this, A002, A002, 49));
    }
}
