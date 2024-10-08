package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;

/* renamed from: X.Vci  reason: case insensitive filesystem */
public final class C17713Vci {
    public Dc2 A00;
    public boolean A01 = false;
    public final Fragment A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C231112qt A05;
    public final C231142qw A06;
    public final WishListFeedFragment A07;
    public final X56 A08;
    public final C18617VvA A09;
    public final W27 A0A;
    public final String A0B;
    public final String A0C;

    public C17713Vci(Fragment fragment, UserSession userSession, AnonymousClass4DU r9, C231112qt r10, WishListFeedFragment wishListFeedFragment, X56 x56, C18617VvA vvA, String str, String str2) {
        this.A04 = r9;
        this.A02 = fragment;
        this.A03 = userSession;
        this.A0C = str;
        this.A0B = str2;
        FragmentActivity requireActivity = fragment.requireActivity();
        Context requireContext = fragment.requireContext();
        this.A06 = C231132qv.A01(requireContext, requireActivity, userSession, r9, str2, str);
        this.A07 = wishListFeedFragment;
        this.A08 = x56;
        this.A09 = vvA;
        this.A05 = r10;
        this.A0A = new W27(fragment.requireActivity(), userSession);
    }
}
