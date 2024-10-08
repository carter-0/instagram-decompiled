package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.2oz  reason: invalid class name and case insensitive filesystem */
public final class C230142oz implements AnonymousClass2p0 {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass2oG A03;
    public final C230152p2 A04 = new AnonymousClass2p1(this);
    public final C230132oy A05;
    public final C230012om A06;
    public final Integer A07;

    public static String A00(C17674Vc5 vc5) {
        HMT hmt;
        String str = vc5.A03;
        if (str == null || (hmt = (HMT) HMT.A01.get(str)) == null) {
            return null;
        }
        return hmt.A00;
    }

    private void A01(C17674Vc5 vc5, String str, String str2, String str3, String str4, int i, int i2, long j) {
        String A002 = C294615mk.A00(this.A07);
        String moduleName = this.A01.getModuleName();
        String str5 = str;
        0qQ.A0B(str5, 2);
        0qQ.A0B(moduleName, 3);
        String A003 = A00(vc5);
        C230012om.A01(this.A06, (Integer) null, Long.valueOf(j), "", moduleName, A003, str3, "", str2, str4, (String) null, (String) null, str5, A002, i, i2);
    }

    public final void A9R(AnonymousClass3O9 r2, C242803Vz r3) {
        AnonymousClass2oG r0 = this.A03;
        if (r0 != null) {
            r0.A9R(r2, r3);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Twa, java.lang.Object] */
    public final void DLD(1UQ r4, AnonymousClass3UH r5) {
        if (r4 == 1UQ.A0p && 1pR.A00 != null) {
            1pR A002 = C14398TvR.A00();
            UserSession userSession = this.A02;
            A002.A00(userSession);
            C309516Yo r1 = new C309516Yo(this.A00, userSession);
            C14398TvR.A00();
            r1.A0E(new Object().A03(userSession));
            r1.A04();
        }
    }

    public final void DLE(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2) {
        Hashtag hashtag = vc5.A00;
        hashtag.getClass();
        if (hashtag.getId() != null) {
            String A002 = C294615mk.A00(this.A07);
            String id = hashtag.getId();
            String moduleName = this.A01.getModuleName();
            0qQ.A0B(id, 2);
            0qQ.A0B(moduleName, 3);
            C230012om.A02(this.A06, moduleName, str, str3, id, A002, i, i2);
            String id2 = hashtag.getId();
            1ES.A03(VEK.A00(this.A02, AnonymousClass05K.A00, id2));
        }
    }

    public final void DLF(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2) {
        Integer num;
        String str4;
        C17674Vc5 vc52 = vc5;
        Hashtag hashtag = vc52.A00;
        hashtag.getClass();
        this.A05.A05(this.A02, this.A04, hashtag, "netego_hashtags");
        Integer B6q = hashtag.B6q();
        if (B6q == null || B6q.intValue() != 1) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        if (hashtag.getId() != null) {
            String A002 = C294615mk.A00(this.A07);
            String id = hashtag.getId();
            String moduleName = this.A01.getModuleName();
            0qQ.A0B(id, 2);
            0qQ.A0B(moduleName, 3);
            if (num.intValue() != 0) {
                str4 = "not_following";
            } else {
                str4 = "following";
            }
            C230012om.A05(this.A06, "", moduleName, A00(vc52), "preview", str4, "", str, str3, (String) null, (String) null, (String) null, id, A002, i, i2);
        }
    }

    public final void DLG(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2) {
        String str4 = str;
        C17674Vc5 vc52 = vc5;
        Hashtag hashtag = vc52.A00;
        hashtag.getClass();
        if (hashtag.getId() != null) {
            String A002 = C294615mk.A00(this.A07);
            String id = hashtag.getId();
            String moduleName = this.A01.getModuleName();
            0qQ.A0B(id, 2);
            0qQ.A0B(moduleName, 3);
            C230012om.A04(this.A06, "", moduleName, A00(vc52), "preview", "", str4, str3, (String) null, (String) null, id, A002, i, i2);
        }
        if (str == null) {
            str4 = "";
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C309516Yo r3 = new C309516Yo(fragmentActivity, userSession);
        Bundle A003 = W0l.A00(hashtag, this.A01.getModuleName(), "recommended_interest");
        A003.putString(AnonymousClass000.A00(2293), str4);
        A003.putString(AnonymousClass000.A00(2292), "preview");
        Fragment A012 = W0l.A01(userSession);
        A012.setArguments(A003);
        r3.A0B((Bundle) null, A012);
        r3.A04();
    }

    public final void DLH(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2, long j) {
        String str4;
        C17674Vc5 vc52 = vc5;
        Hashtag hashtag = vc5.A00;
        hashtag.getClass();
        if (hashtag.getId() != null) {
            str4 = hashtag.getId();
        } else {
            str4 = "";
        }
        A01(vc52, str4, str, "preview", str3, i, i2, j);
    }

    public final void DLI(C17674Vc5 vc5, int i, int i2, int i3) {
        Integer num;
        String str;
        C17674Vc5 vc52 = vc5;
        Hashtag hashtag = vc52.A00;
        hashtag.getClass();
        this.A05.A06(this.A02, this.A04, hashtag, "netego_hashtags");
        Integer B6q = hashtag.B6q();
        if (B6q == null || B6q.intValue() != 1) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        if (hashtag.getId() != null) {
            String A002 = C294615mk.A00(this.A07);
            String id = hashtag.getId();
            String moduleName = this.A01.getModuleName();
            0qQ.A0B(id, 2);
            0qQ.A0B(moduleName, 3);
            if (num.intValue() != 0) {
                str = "not_following";
            } else {
                str = "following";
            }
            C230012om.A06(this.A06, "", moduleName, A00(vc52), (String) null, str, "", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, id, A002, i, i2);
        }
    }

    public final void DLJ(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2, long j) {
        A01(vc5, vc5.A04, str, "topic_card", str3, i, i2, j);
    }

    public final void DLK(1UQ r3) {
        if (1UQ.A0p == r3 && 1pR.A00 != null) {
            C14398TvR.A00().A00(this.A02);
        }
    }

    public final void DLL(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2) {
        User user = vc5.A02;
        user.getClass();
        String A002 = C294615mk.A00(this.A07);
        String id = user.getId();
        String moduleName = this.A01.getModuleName();
        0qQ.A0B(moduleName, 3);
        C230012om.A02(this.A06, moduleName, str, str3, id, A002, i, i2);
        String id2 = user.getId();
        1ES.A03(VEK.A00(this.A02, AnonymousClass05K.A01, id2));
    }

    public final void DLM(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2, int i3) {
        C17674Vc5 vc52 = vc5;
        User user = vc52.A02;
        user.getClass();
        Integer A002 = GTO.A00(user.B6o());
        String A003 = C294615mk.A00(this.A07);
        String id = user.getId();
        String moduleName = this.A01.getModuleName();
        0qQ.A0B(moduleName, 3);
        String A004 = GTN.A00(A002);
        String str4 = "";
        C230012om.A05(this.A06, "", moduleName, A00(vc52), "preview", A004, str4, str, str3, (String) null, C230012om.A00(user), (String) null, id, A003, i, i2);
    }

    public final void DLN(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2, int i3) {
        C17674Vc5 vc52 = vc5;
        User user = vc52.A02;
        user.getClass();
        String A002 = C294615mk.A00(this.A07);
        String id = user.getId();
        AnonymousClass0iw r1 = this.A01;
        String moduleName = r1.getModuleName();
        0qQ.A0B(moduleName, 3);
        String str4 = str;
        String str5 = str3;
        C230012om.A03(this.A06, "", moduleName, A00(vc52), "preview", "", str4, str5, (String) null, (String) null, id, A002, i, i2);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C309516Yo r4 = new C309516Yo(fragmentActivity, userSession);
        1a1 r3 = C46447Df9.A03().A01;
        C46474Dfc A012 = C46548Dgp.A01(userSession, user.getId(), "interest_recommendation_user_item", r1.getModuleName());
        A012.A03 = new UserDetailEntryInfo((String) null, (String) null, (String) null, (String) null, str4, "preview", str5, (String) null, (String) null, (String) null, (String) null, (List) null);
        r4.A0E(r3.A02(userSession, A012.A04()));
        r4.A04();
    }

    public final void DLO(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2, int i3, long j) {
        User user = vc5.A02;
        user.getClass();
        String id = user.getId();
        A01(vc5, id, str, "preview", str3, i, i2, j);
    }

    public final void EBq(View view, AnonymousClass3O9 r3) {
        AnonymousClass2oG r0 = this.A03;
        if (r0 != null) {
            r0.EBq(view, r3);
        }
    }

    public C230142oz(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, AnonymousClass2oG r5, C230132oy r6, Integer num) {
        this.A00 = fragmentActivity;
        this.A05 = r6;
        this.A07 = num;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = r5;
        this.A06 = new C230012om(r3, userSession);
    }
}
