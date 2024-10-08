package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;
import java.util.List;

/* renamed from: X.VvJ  reason: case insensitive filesystem */
public final class C18626VvJ {
    public 2el A00;
    public 1Xj A01;
    public AnonymousClass57K A02;
    public WishListFeedFragment A03;
    public X52 A04;
    public X56 A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public List A0G = 0sn.A00;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J = true;
    public final Fragment A0K;
    public final UserSession A0L;
    public final AnonymousClass4DU A0M;
    public final C16675UzB A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final AnonymousClass0eM A0R = C20693WxP.A00(this, 20);

    public C18626VvJ(Fragment fragment, UserSession userSession, AnonymousClass4DU r5, C16675UzB uzB, String str, String str2, String str3) {
        DbZ.A0t(1, fragment, userSession, r5);
        0qQ.A0B(uzB, 7);
        this.A0K = fragment;
        this.A0L = userSession;
        this.A0M = r5;
        this.A0Q = str;
        this.A0O = str2;
        this.A0P = str3;
        this.A0N = uzB;
    }

    public static final C231112qt A00(C18626VvJ vvJ) {
        String str;
        UserSession userSession = vvJ.A0L;
        AnonymousClass4DU r1 = vvJ.A0M;
        String str2 = vvJ.A0Q;
        String str3 = vvJ.A0O;
        String str4 = vvJ.A0P;
        String str5 = vvJ.A0A;
        AnonymousClass57K r0 = vvJ.A02;
        if (r0 == null || (str = r0.toString()) == null) {
            str = vvJ.A0N.toString();
        }
        return new C231112qt(r1, userSession, str2, str5, str, str3, str4, (String) null, (String) null, vvJ.A0D, vvJ.A0E, vvJ.A0F, vvJ.A09, -1);
    }

    public final C17931ViM A01() {
        Fragment fragment = this.A0K;
        UserSession userSession = this.A0L;
        AnonymousClass4DU r6 = this.A0M;
        String str = this.A0Q;
        String str2 = this.A0O;
        C231142qw r0 = (C231142qw) this.A0R.getValue();
        2el r5 = this.A00;
        if (r5 != null) {
            String str3 = this.A0A;
            String str4 = this.A0B;
            String str5 = str2;
            if (str2 == null) {
                str5 = "";
            }
            return new C17931ViM(fragment, userSession, r6, A00(this), r0, this.A05, new C231052qn(userSession, r5, r6, str, str3, str4, str5, this.A0P, (String) null, (String) null, -1), str, str2);
        }
        throw new IllegalStateException("viewpointManager must not be null");
    }

    public final C18661VwI A02() {
        C18617VvA vvA;
        boolean z = this.A0J;
        2el r1 = this.A00;
        if (z) {
            if (r1 == null) {
                throw new IllegalStateException("You must either provide a ViewpointManager or explicitly disable Viewpoint on your surface");
            }
        } else if (r1 != null) {
            throw new IllegalStateException("Viewpoint has been disabled, so the ViewpointManager should be null.");
        } else if (AnonymousClass7TE.A1b(this.A0G)) {
            throw new IllegalStateException("Viewpoint has been disabled, so the product card viewpoint actions should be empty.");
        }
        C231112qt A002 = A00(this);
        2el r8 = this.A00;
        if (r8 != null) {
            UserSession userSession = this.A0L;
            AnonymousClass4DU r6 = this.A0M;
            C16675UzB uzB = this.A0N;
            String str = this.A0Q;
            String str2 = this.A0O;
            String str3 = this.A0P;
            AnonymousClass57K r12 = this.A02;
            if (r12 == null || r12.toString() == null) {
                uzB.toString();
            }
            UserSession userSession2 = userSession;
            2el r30 = r8;
            AnonymousClass4DU r31 = r6;
            vvA = new C18617VvA(userSession2, r30, r31, A002, str, str2, str3, this.A0A, this.A0G);
        } else {
            vvA = null;
        }
        Fragment fragment = this.A0K;
        UserSession userSession3 = this.A0L;
        AnonymousClass4DU r22 = this.A0M;
        String str4 = this.A0Q;
        String str5 = this.A0O;
        String str6 = this.A0P;
        String str7 = this.A0D;
        AnonymousClass57K r18 = this.A02;
        Long l = this.A06;
        C16675UzB uzB2 = this.A0N;
        X56 x56 = this.A05;
        X52 x52 = this.A04;
        boolean z2 = this.A0I;
        String str8 = this.A0B;
        String str9 = this.A0C;
        1Xj r82 = this.A01;
        String str10 = this.A0A;
        String str11 = this.A0F;
        String str12 = this.A0E;
        boolean z3 = this.A0H;
        Long l2 = this.A07;
        2el r2 = this.A00;
        String str13 = this.A09;
        AnonymousClass4DU r21 = r22;
        AnonymousClass57K r222 = r18;
        Long l3 = l;
        return new C18661VwI(fragment, userSession3, r2, r82, r21, r222, uzB2, A002, (C231142qw) this.A0R.getValue(), x52, x56, vvA, l3, l2, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, this.A08, z2, z3);
    }
}
