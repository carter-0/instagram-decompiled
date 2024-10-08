package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.VvE  reason: case insensitive filesystem */
public final class C18621VvE {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final UserSession A02;
    public final C20956X6j A03;
    public final DQw A04;
    public final X8U A05;
    public final C20957X6k A06;
    public final String A07;
    public final Map A08;
    public final boolean A09;

    public static C17658Vbo A00(C18621VvE vvE, Object obj) {
        Object obj2 = vvE.A08.get(obj);
        obj2.getClass();
        return (C17658Vbo) obj2;
    }

    public C18621VvE(Context context, AnonymousClass07i r2, UserSession userSession, C20956X6j x6j, DQw dQw, X8U x8u, C20957X6k x6k, String str, Map map, boolean z) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = userSession;
        this.A07 = str;
        this.A08 = map;
        this.A05 = x8u;
        this.A03 = x6j;
        this.A04 = dQw;
        this.A06 = x6k;
        this.A09 = z;
    }

    public final void A01(C16672Uz8 uz8, boolean z, boolean z2) {
        String str;
        1NY A0N;
        String str2;
        17k.A0F(11Z.A07());
        C17658Vbo A002 = A00(this, uz8);
        VW3 vw3 = new VW3(uz8, this, z);
        C16672Uz8 uz82 = A002.A03;
        int ordinal = uz82.ordinal();
        if (ordinal == 1) {
            str = "ranked";
        } else if (ordinal == 3) {
            str = "recent";
        } else if (ordinal == 4) {
            str = "clips";
        } else if (ordinal == 6) {
            str = "account";
        } else if (ordinal != 0) {
            str = null;
        } else {
            throw DbW.A0c("Location page no URL for tab type: ", uz82.toString());
        }
        C16672Uz8 uz83 = C16672Uz8.ACCOUNT;
        UserSession userSession = A002.A02;
        if (uz82 == uz83) {
            A0N = DbU.A0O(userSession);
            A0N.A0R(UY5.class, C18219Vnj.class);
            A0N.A0A("business/account/get_profile_media/");
            str = A002.A05;
            str2 = CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID;
        } else {
            String str3 = A002.A06;
            A0N = DbU.A0N(userSession);
            A0N.A0R(UY5.class, C18219Vnj.class);
            A0N.A0K("locations/%s/sections/", new Object[]{str3});
            str2 = "tab";
        }
        A0N.A9m(str2, str);
        if (A002.A07) {
            A0N.A9m("exclude_bloks_widgets", "true");
        }
        VW4 vw4 = A002.A00;
        if (!z && vw4 != null) {
            A0N.A9m("page", vw4.A00);
            List list = vw4.A01;
            list.getClass();
            A0N.A9m("next_media_ids", list.toString());
            C3724090s.A06(A0N, A002.A04.A03.A07);
        }
        if (z2) {
            A002.A01 = AnonymousClass7TF.A0b();
        }
        A002.A04.A03(DbT.A0T(A0N, C66654MaN.A00(), A002.A01), new C15958Ula(A002, vw3));
    }

    public final boolean A02(C16672Uz8 uz8) {
        VW4 vw4 = A00(this, uz8).A00;
        if (vw4 == null || !vw4.A02) {
            return false;
        }
        return true;
    }
}
