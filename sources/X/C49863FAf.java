package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FAf  reason: case insensitive filesystem */
public final class C49863FAf {
    public final Context A00;
    public final Resources A01;
    public final FragmentActivity A02;
    public final AnonymousClass07i A03;
    public final AnonymousClass0iw A04;
    public final 0wc A05;
    public final UserSession A06;
    public final G7P A07 = new C51029FnL();
    public final F3J A08;
    public final User A09;
    public final G8B A0A = new C51051Fnh(this, 3);
    public final C74489Pvj A0B = new C48057EUb(this, 8);

    public C49863FAf(Context context, Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass07i r6, AnonymousClass0iw r7, 0wc r8, UserSession userSession, User user) {
        0qQ.A0B(userSession, 2);
        AnonymousClass7TF.A1E(r8, 5, r6);
        this.A00 = context;
        this.A06 = userSession;
        this.A02 = fragmentActivity;
        this.A05 = r8;
        this.A04 = r7;
        this.A03 = r6;
        this.A09 = user;
        Resources A052 = DbV.A05(fragment);
        0qQ.A07(A052);
        this.A01 = A052;
        this.A08 = new F3J(fragment, userSession);
    }

    public static final void A00(C49863FAf fAf, boolean z) {
        String str;
        UserSession userSession = fAf.A06;
        C71093OcF A012 = ORV.A01(fAf.A02, fAf.A04, userSession, C14068TpH.IG_SCHOOLS_PAGE, C16677UzD.USER, fAf.A09.getId());
        A012.A07(fAf.A0B);
        if (z) {
            str = "school_block";
        } else {
            str = "";
        }
        A012.A08("nua_action", str);
        A012.A06();
    }
}
