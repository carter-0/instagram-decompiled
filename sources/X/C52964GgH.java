package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GgH  reason: case insensitive filesystem */
public final class C52964GgH extends C361478gI {
    public final OpalAudienceSelectorRepository A00;
    public final Map A01 = AnonymousClass7TE.A1H();
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final UserSession A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52964GgH(Application application, UserSession userSession, OpalAudienceSelectorRepository opalAudienceSelectorRepository) {
        super(application);
        AnonymousClass7TG.A1P(userSession, application);
        this.A04 = userSession;
        this.A00 = opalAudienceSelectorRepository;
        02z A10 = DbS.A10(new C53378Gn8());
        this.A02 = A10;
        this.A03 = A10;
        AnonymousClass7TE.A1Z(new C51647Fy6((Object) this, (AnonymousClass4D7) null, 0), C318116oQ.A00(this));
    }

    public static final List A00(C52964GgH ggH, Integer num, List list) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        boolean z = true;
        if (num != AnonymousClass05K.A00) {
            z = false;
            Map map = ggH.A01;
            if ((!map.isEmpty()) || !(00k.A0J(list) instanceof C53554GqP)) {
                C53554GqP gqP = new C53554GqP(AnonymousClass05K.A01, false);
                A1H.put(gqP.getId(), gqP);
            }
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A1H.put(A1J.getKey(), new C53553GqO((OpalAudienceSelectorRepository.OpalAudience) A1J.getValue()));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JOQ joq = (JOQ) it.next();
            if (joq instanceof C53554GqP) {
                C53554GqP gqP2 = (C53554GqP) joq;
                if (gqP2.A01) {
                    A1H.put(gqP2.getId(), joq);
                }
            } else if (!(joq instanceof C53553GqO)) {
                throw AnonymousClass7TE.A1K();
            } else if (z || !ggH.A01.containsKey(((C53553GqO) joq).A00.A01)) {
                OpalAudienceSelectorRepository.OpalAudience opalAudience = ((C53553GqO) joq).A00;
                Map map2 = ggH.A01;
                String str = opalAudience.A01;
                OpalAudienceSelectorRepository.OpalAudience opalAudience2 = (OpalAudienceSelectorRepository.OpalAudience) map2.get(str);
                if (opalAudience2 == null) {
                    opalAudience2 = opalAudience;
                }
                boolean z2 = opalAudience2.A05;
                String str2 = opalAudience.A03;
                boolean z3 = opalAudience.A06;
                String str3 = opalAudience.A00;
                String str4 = opalAudience.A02;
                boolean z4 = opalAudience.A04;
                AnonymousClass7TG.A1N(str, str2);
                A1H.put(str, new C53553GqO(new OpalAudienceSelectorRepository.OpalAudience(str, str2, str3, str4, z2, z3, z4)));
            }
        }
        JOQ joq2 = (JOQ) 00k.A0C(A1H.values());
        if (joq2 instanceof C53554GqP) {
            A1H.remove(((C53554GqP) joq2).getId());
        }
        return 00k.A0a(A1H.values());
    }
}
