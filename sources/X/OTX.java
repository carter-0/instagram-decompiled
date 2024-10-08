package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class OTX {
    public final UserSession A00;
    public final OL8 A01;
    public final 2Dm A02;
    public final C70808OMd A03;

    public static final List A00(AnonymousClass2Ep r23, OTX otx, String str, int i, int i2, long j, long j2) {
        Object obj;
        String id;
        Object ncB;
        AnonymousClass2Ep r5 = r23;
        String C6C = r5.C6C();
        if (C6C != null) {
            0eE r2 = AnonymousClass0t1.A01;
            OTX otx2 = otx;
            UserSession userSession = otx2.A00;
            Long A0r = C66581MXm.A0r(userSession, r2);
            C70621ODs oDs = null;
            if (A0r == null || A0r.longValue() != j) {
                Iterator it = r5.BRZ().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Long BST = ((User) obj).BST();
                    if (BST != null && BST.longValue() == j) {
                        break;
                    }
                }
                User user = (User) obj;
                if (user != null) {
                    id = user.getId();
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                id = userSession.A06;
            }
            int i3 = i;
            if (i3 == 1) {
                oDs = C70875OPo.A00();
            } else if (i3 == 2) {
                oDs = C70875OPo.A01(Long.valueOf(SandboxRepository.CACHE_TTL), (Long) null);
            }
            boolean A0O = C308556Us.A0O(userSession, r5);
            long longValue = r5.C6I().longValue();
            Boolean valueOf = Boolean.valueOf(A0O);
            String str2 = str;
            String A04 = C2611348j.A04(str2, j2);
            OIH oih = new OIH(oDs, valueOf, AnonymousClass05K.A0j, A04, str2, C6C, id, (String) null, (String) null, (String) null, longValue, C2611348j.A01(A04), false, false, false);
            int i4 = i2;
            if (otx2.A02.BRy(r5.BJy(), oih.A05) == null) {
                ncB = new C68978Nc9(OWL.A00.A00(userSession, oih, i4), r5);
            } else {
                String str3 = oih.A06;
                C70808OMd oMd = otx2.A03;
                oMd.A00(str3, C66582MXn.A10((long) i4), 7101, 0);
                oMd.A01(str3, false);
                ncB = new C68980NcB("Existing placeholder found");
            }
            return AnonymousClass7TE.A1I(ncB);
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public OTX(UserSession userSession, OL8 ol8, 2Dm r3, C70808OMd oMd) {
        AnonymousClass7TG.A1U(userSession, r3, oMd);
        this.A00 = userSession;
        this.A02 = r3;
        this.A03 = oMd;
        this.A01 = ol8;
    }
}
