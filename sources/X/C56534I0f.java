package X;

import com.facebook.location.platform.api.Location;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;

/* renamed from: X.I0f  reason: case insensitive filesystem */
public final class C56534I0f {
    public final UserSession A00;
    public final DirectCollectionArguments A01;
    public final AnonymousClass4DU A02;

    public static final void A00(C56534I0f i0f, String str, boolean z) {
        UserSession userSession = i0f.A00;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_collections");
        if (A0e.isSampled()) {
            DirectCollectionArguments directCollectionArguments = i0f.A01;
            A0e.AAJ("module_name", C70864OPd.A00(directCollectionArguments.A03));
            DbS.A1I(A0e, str);
            DbS.A1N(A0e, directCollectionArguments.A07);
            A0e.A7p(C66579MXk.A00(140), directCollectionArguments.A02);
            A0e.A7p("is_saved", Boolean.valueOf(z));
            User A0j = DbT.A0j(userSession);
            0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(625), String.valueOf(A0j.A03.BBu()));
            A0e.A9H(Location.EXTRAS, DbY.A0p(AnonymousClass000.A00(623), String.valueOf(A0j.A03.BAo()), A1L));
            A0e.Cgf();
        }
    }

    public final void A01(SavedCollection savedCollection, boolean z) {
        String A002;
        if (z) {
            A002 = "instagram_organic_add_to_collection";
        } else {
            A002 = AnonymousClass000.A00(4891);
        }
        DirectCollectionArguments directCollectionArguments = this.A01;
        String str = directCollectionArguments.A04;
        if (str == null) {
            str = directCollectionArguments.A05;
        }
        AnonymousClass4DU r3 = this.A02;
        C254523sc A0n = C51965G9l.A0n(r3, A002);
        A0n.A5u = str;
        A0n.A4l = savedCollection.A0F;
        A0n.A4n = savedCollection.A02();
        A0n.A65 = DbS.A0k();
        A0n.A6q = savedCollection.A0G;
        UserSession userSession = this.A00;
        if (!C271764jY.A00(userSession, A0n, r3, AnonymousClass05K.A01)) {
            DbU.A1R(A0n.A00(), userSession);
        }
    }

    public C56534I0f(UserSession userSession, DirectCollectionArguments directCollectionArguments, AnonymousClass4DU r3) {
        AnonymousClass7TG.A1P(userSession, directCollectionArguments);
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = directCollectionArguments;
    }
}
