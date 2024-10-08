package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6s0  reason: invalid class name and case insensitive filesystem */
public abstract class C320216s0 {
    public final C320226s1 A00;
    public final C293005js A01;
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();
    public final AnonymousClass0iw A04;
    public final C230012om A05;
    public final Set A06 = new HashSet();

    public Hashtag A00(Hashtag hashtag, int i) {
        C18023Vjz vjz = new C18023Vjz(hashtag);
        vjz.A08 = 1;
        return vjz.A00();
    }

    public void A0B(AnonymousClass3UL r6, int i) {
        0qQ.A0B(r6, 1);
        C230012om r4 = this.A05;
        AnonymousClass6KM r1 = new AnonymousClass6KM("self_profile_chaining", r6.getId(), this.A04.getModuleName());
        r1.A04 = r6.A04;
        r1.A0B = r6.A05;
        String str = r6.A08;
        if (str != null) {
            r1.A07 = str;
        }
        r4.A0B(new AnonymousClass6KN(r1));
    }

    public void A0C(AnonymousClass3UL r6, int i) {
        0qQ.A0B(r6, 1);
        C230012om r4 = this.A05;
        AnonymousClass6KM r1 = new AnonymousClass6KM("self_profile_chaining", r6.getId(), this.A04.getModuleName());
        r1.A04 = r6.A04;
        r1.A0B = r6.A05;
        String str = r6.A08;
        if (str != null) {
            r1.A07 = str;
        }
        r4.A07(new AnonymousClass6KN(r1));
    }

    public void A0D(AnonymousClass3UL r6, int i) {
        0qQ.A0B(r6, 1);
        C230012om r4 = this.A05;
        AnonymousClass6KM r1 = new AnonymousClass6KM("self_profile_chaining", r6.getId(), this.A04.getModuleName());
        r1.A04 = r6.A04;
        r1.A0B = r6.A05;
        String str = r6.A08;
        if (str != null) {
            r1.A07 = str;
        }
        r1.A0A = C230012om.A00(r6.A03);
        r4.A08(new AnonymousClass6KN(r1));
    }

    public final void A0E(AnonymousClass3UL r6, long j) {
        0qQ.A0B(r6, 1);
        if (this.A06.add(r6.getId())) {
            C230012om r4 = this.A05;
            AnonymousClass6KM r1 = new AnonymousClass6KM("self_profile_chaining", r6.getId(), this.A04.getModuleName());
            r1.A04 = r6.A04;
            r1.A0B = r6.A05;
            String str = r6.A08;
            if (str != null) {
                r1.A07 = str;
            }
            r1.A03 = Long.valueOf(j);
            r4.A09(new AnonymousClass6KN(r1));
        }
    }

    public C320216s0(AnonymousClass0iw r13, UserSession userSession, User user, String str) {
        this.A04 = r13;
        String str2 = str;
        this.A00 = new C320226s1(r13, userSession, str2, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "profile", (Map) null);
        this.A01 = new C293005js(r13, userSession, user, str2, "profile");
        this.A05 = new C230012om(r13, userSession);
    }

    public Hashtag A01(Hashtag hashtag, int i) {
        C18023Vjz vjz = new C18023Vjz(hashtag);
        vjz.A08 = 0;
        return vjz.A00();
    }

    public void A02() {
        C320226s1 r2 = this.A00;
        AnonymousClass0iw r0 = r2.A01;
        UserSession userSession = r2.A02;
        String str = r2.A03;
        String str2 = r2.A04;
        Map map = r2.A00;
        0xI A002 = 0xI.A00(r0, "similar_user_suggestions_closed");
        if (str != null) {
            A002.A0C("uid_based_on", str);
        }
        A002.A0C("view", str2);
        A002.A0F(map);
        C60510iO.A00(userSession).EFq(A002);
    }

    public void A03() {
        this.A02.clear();
        this.A06.clear();
        this.A03.clear();
    }

    public final void A04() {
        if (this instanceof C320206rz) {
            ((C320206rz) this).A00.Dbx();
        }
    }

    public void A05(View view, User user, int i) {
        C293005js r2 = this.A01;
        String id = user.getId();
        String A0P = user.A0P();
        String BxN = user.A03.BxN();
        String str = r2.A02;
        if (str != null) {
            String str2 = r2.A03;
            if (str2 != null) {
                r2.A03(id, str, str2, A0P, BxN, i);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A06(EX9 ex9) {
        if (this instanceof C320206rz) {
            ((C320206rz) this).A00.D5y(ex9);
        }
    }

    public void A07(Hashtag hashtag, int i) {
        this.A00.A00(hashtag, "similar_entity_tapped", i);
    }

    public void A08(User user, int i) {
        C293005js r2 = this.A01;
        String id = user.getId();
        String A0P = user.A0P();
        String BxN = user.A03.BxN();
        String str = r2.A02;
        if (str != null) {
            String str2 = r2.A03;
            if (str2 != null) {
                r2.A01(id, str, str2, A0P, BxN, i);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0A(User user, int i) {
        if (this.A02.add(user.getId())) {
            this.A01.A00(0, user.getId(), i, user.A0P(), user.A03.BxN());
        }
    }

    public final void A0F(String str) {
        C293005js r1 = this.A01;
        if (r1.A04) {
            0wc r2 = r1.A06;
            0Aj A002 = r2.A00(r2.A00, "suggestions_see_all_impression");
            A002.AAJ("view_module", str);
            A002.Cgf();
        }
    }

    public void A0G(boolean z, String str) {
        if (z) {
            C293005js r3 = this.A01;
            if (r3.A04) {
                0wc r2 = r3.A06;
                0Aj A002 = r2.A00(r2.A00, "recommended_user_see_all_tapped");
                A002.AAJ("view_module", str);
                A002.AAJ("module", r3.A00.getModuleName());
                A002.Cgf();
            }
        }
    }

    public void A09(User user, int i) {
        String A0P = user.A0P();
        C293005js r2 = this.A01;
        String id = user.getId();
        String BxN = user.A03.BxN();
        String str = r2.A02;
        if (str != null) {
            String str2 = r2.A03;
            if (str2 != null) {
                r2.A02(id, str, str2, A0P, BxN, i);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C320216s0(AnonymousClass0iw r13, 0xF r14, UserSession userSession, String str, String str2, String str3) {
        HashMap A032;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        AnonymousClass0iw r1 = r13;
        this.A04 = r13;
        if (r14 == null) {
            A032 = new HashMap();
        } else {
            A032 = 0j8.A03(r14);
        }
        String str4 = str;
        String str5 = str3;
        this.A00 = new C320226s1(r1, userSession2, str4, str2, str5, A032);
        this.A01 = new C293005js(r13, userSession, (User) null, str4, str5);
        this.A05 = new C230012om(r13, userSession);
    }
}
