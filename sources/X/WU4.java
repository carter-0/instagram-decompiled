package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.LinkedHashSet;
import java.util.Set;

public final class WU4 implements C250603lj {
    public final Set A00 = new LinkedHashSet();
    public final C56524Hzv A01;

    public WU4(C56524Hzv hzv) {
        this.A01 = hzv;
    }

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        boolean A1Z = AnonymousClass7TG.A1Z(r8, r9);
        if (r9.CEk(r8) == AnonymousClass05K.A00 && this.A00.add("map_tile_with_pins")) {
            C56524Hzv hzv = this.A01;
            Object obj = r8.A04;
            0qQ.A06(obj);
            Hashtag hashtag = (Hashtag) obj;
            0qQ.A0B(hashtag, A1Z ? 1 : 0);
            UserSession userSession = hzv.A01;
            AnonymousClass0iw r6 = hzv.A00;
            String str = hzv.A03;
            0qQ.A0A(str);
            String id = hashtag.getId();
            String str2 = "";
            if (id == null) {
                id = str2;
            }
            String name = hashtag.getName();
            if (name != null) {
                str2 = name;
            }
            1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "ig_discovery_map"), 214);
            r2.A0k("instagram_map_entry_point_impression");
            r2.A0R("container_module", r6.getModuleName());
            r2.A0R("map_session_id", str);
            r2.A0R("search_id", id);
            r2.A0R("search_type", C16614UyA.HASHTAG.toString());
            r2.A0R("search_query", 002.A0R("#", str2));
            r2.Cgf();
        }
    }
}
