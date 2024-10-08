package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LwT  reason: case insensitive filesystem */
public final class C65593LwT implements G6J {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass6Z5 A03;
    public final /* synthetic */ String A04;

    public C65593LwT(Context context, AnonymousClass4DH r2, 1Xj r3, AnonymousClass6Z5 r4, String str) {
        this.A03 = r4;
        this.A04 = str;
        this.A01 = r2;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void Dwj(List list, boolean z) {
        String str;
        AnonymousClass6Z5 r12 = this.A03;
        UserSession userSession = r12.A09;
        if (userSession != null) {
            0xY A0p = AnonymousClass7TE.A0p(1Au.A00(userSession));
            A0p.E5T("has_added_anytime_story_mentions", true);
            A0p.apply();
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DbY.A1W(A0r, it);
            }
            boolean z2 = z;
            C61497KAc kAc = new C61497KAc(6, this.A02, this.A00, r12, z2);
            UserSession userSession2 = r12.A09;
            if (userSession2 != null) {
                C354958Oa A002 = AnonymousClass8OY.A00(userSession2);
                if (AnonymousClass7TE.A1b(list)) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        DbY.A1W(A1C, it2);
                    }
                    A002.A01(this.A04, A1C);
                }
                Fragment fragment = this.A01;
                C228602lw A0I = JTU.A0I(fragment.requireContext(), fragment);
                UserSession userSession3 = r12.A09;
                if (userSession3 != null) {
                    String str2 = this.A04;
                    1NY A0a = AnonymousClass7TG.A0a(userSession3);
                    C51968G9o.A1K(A0a, "media/add_mentioned_users/", str2);
                    A0a.A9m("include_e2ee_mentioned_user_list", "true");
                    try {
                        StringWriter A0v = JTO.A0v();
                        17W A0e = C51970G9q.A0e(A0v);
                        Iterator it3 = A0r.iterator();
                        while (it3.hasNext()) {
                            A0e.A0t(AnonymousClass7TE.A18(it3));
                        }
                        str = JTR.A13(A0e, A0v);
                    } catch (IOException e) {
                        0wb.A06("MentionsApiUtil", C66579MXk.A00(53), e);
                        str = null;
                    }
                    A0a.A9m("user_ids", str);
                    A0a.A0H(AnonymousClass000.A00(5041), z2);
                    1OC A0L = DbW.A0L(A0a, CEG.class, C45595Cz7.class, true);
                    A0L.A00 = kAc;
                    A0I.schedule(A0L);
                    return;
                }
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }
}
