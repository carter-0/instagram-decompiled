package X;

import android.content.Context;
import com.instagram.api.schemas.OneTapLinkedProfileInfoImpl;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

public final class EDT extends 1P0 {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final User A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    private final boolean A00(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        Iterator A0n = DbY.A0n(this.A02);
        while (A0n.hasNext()) {
            C319646qx r1 = (C319646qx) A0n.next();
            if (str.equals(r1.A06)) {
                return !0qQ.A0K(r1.A05, str2);
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        Boolean valueOf;
        String str;
        int i2;
        int A032 = AnonymousClass0fD.A03(1040896501);
        C47362Dvw dvw = (C47362Dvw) obj;
        int A033 = AnonymousClass0fD.A03(1475888847);
        0qQ.A0B(dvw, 0);
        if (this.A05) {
            Context context = this.A00;
            if (context != null && 1AW.A06(0Tu.A05, 18312950276307298L)) {
                AnonymousClass9EJ.A00(context, this.A02, AnonymousClass000.A00(3535), "save_one_tap_user_profile_nonce_fetch");
            }
            if (!1AW.A06(0Tu.A05, 2324155959490066787L)) {
                i = -392312804;
                AnonymousClass0fD.A0A(i, A033);
                AnonymousClass0fD.A0A(1344756495, A032);
            }
        }
        User user = this.A03;
        boolean A002 = A00(user.getId(), dvw.A00);
        if (A002) {
            C319646qx r8 = new C319646qx(user, dvw.A00);
            UserSession userSession = this.A02;
            if (C319606qt.A01(userSession).A04(user.getId()).booleanValue()) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(C319606qt.A01(userSession).A0J(user.getId()));
            }
            C319606qt.A01(userSession);
            if (valueOf == null) {
                i2 = 1188;
            } else if (valueOf.booleanValue()) {
                i2 = 1189;
            } else {
                str = "APP_LEVEL_SPI_NO";
                r8.A04 = str;
                C319606qt.A01(userSession).A0E(r8);
            }
            str = C273654mx.A00(i2);
            r8.A04 = str;
            C319606qt.A01(userSession).A0E(r8);
        }
        if (!dvw.A01.isEmpty()) {
            for (OneTapLinkedProfileInfoImpl oneTapLinkedProfileInfoImpl : dvw.A01) {
                String str2 = oneTapLinkedProfileInfoImpl.A02;
                String str3 = oneTapLinkedProfileInfoImpl.A00;
                if (A00(str2, str3)) {
                    C63040xi r1 = 0tS.A4E;
                    if ((!00k.A0u(r1.A00().A09(), str2) && !00k.A0u(r1.A00().A09(), oneTapLinkedProfileInfoImpl.A03)) || this.A06) {
                        C319646qx r12 = new C319646qx(DbS.A0V(oneTapLinkedProfileInfoImpl.A01), str2, oneTapLinkedProfileInfoImpl.A03, str3);
                        UserSession userSession2 = this.A02;
                        C319606qt.A01(userSession2).A0E(r12);
                        C319606qt A012 = C319606qt.A01(userSession2);
                        String str4 = r12.A06;
                        if (str4 != null) {
                            UserSession userSession3 = userSession2;
                            A012.A08(this.A00, DbS.A0O("one_tap_login_nonce_callback"), userSession3, true, false, AnonymousClass05K.A06, str4, true);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                }
            }
        }
        if (dvw.A02) {
            UserSession userSession4 = this.A02;
            Iterator A0n = DbY.A0n(userSession4);
            while (true) {
                if (!A0n.hasNext()) {
                    break;
                }
                C319646qx r2 = (C319646qx) A0n.next();
                if (0qQ.A0K(user.getId(), r2.A06)) {
                    r2.A03 = this.A04;
                    r2.A00 = System.currentTimeMillis();
                    C319606qt.A01(userSession4).A0E(r2);
                    break;
                }
            }
        }
        UserSession userSession5 = this.A02;
        0xI A003 = 0xI.A00(this.A01, "ig_onetap_nonce_received");
        A003.A09("multi_tap_enabled", true);
        A003.A0C("guid", DbV.A0t());
        A003.A09("updated", Boolean.valueOf(A002));
        DbU.A1R(A003, userSession5);
        i = 659778682;
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(1344756495, A032);
    }

    public EDT(Context context, AnonymousClass0iw r3, UserSession userSession, String str, boolean z, boolean z2) {
        this.A00 = context;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = userSession;
        this.A03 = AnonymousClass7TF.A0Q(userSession);
        this.A01 = r3;
        this.A04 = str;
    }

    public final void onFailInBackground(C268654dm r7) {
        int A032 = AnonymousClass0fD.A03(-2050824323);
        UserSession userSession = this.A02;
        0xI A002 = 0xI.A00(this.A01, "ig_onetap_nonce_response_failed");
        A002.A09("multi_tap_enabled", AnonymousClass7TE.A0v());
        A002.A0C("guid", DbV.A0t());
        DbU.A1R(A002, userSession);
        String Bsr = this.A03.A03.Bsr();
        if (Bsr != null) {
            0no.A00().A01(new EIF(this, userSession.A06, Bsr, 0), 3600000);
        }
        AnonymousClass0fD.A0A(494012616, A032);
    }
}
