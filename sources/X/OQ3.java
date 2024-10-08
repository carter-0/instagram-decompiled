package X;

import android.content.res.Resources;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class OQ3 {
    public static final ImmutableList A00(N3F n3f) {
        0qQ.A0B(n3f, 0);
        0sm r0 = n3f.A08;
        if (r0 == null) {
            r0 = 0Yt.A0E();
        }
        ArrayList A0f = JTQ.A0f(r0);
        Iterator A0u = AnonymousClass7TF.A0u(r0);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            A0f.add(new DirectCountBasedReaction(A13, C66582MXn.A08(A1J), 0qQ.A0K(A13, n3f.A07)));
        }
        return DbU.A0K(A0f);
    }

    public static final C68955Nbe A01(Resources resources, ImmutableList immutableList, UserSession userSession, AnonymousClass9HC r20, C329967Kx r21, 2FW r22, Long l, String str, String str2, String str3, String str4, String str5, boolean z) {
        Object obj;
        String str6;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        ImmutableList immutableList2 = immutableList;
        MessageIdentifier messageIdentifier = null;
        AnonymousClass9HC r8 = r20;
        C329967Kx r9 = r21;
        2FW r10 = r22;
        Long l2 = l;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str5;
        boolean z2 = z;
        if (AnonymousClass7TF.A1P(immutableList2.isEmpty() ? 1 : 0)) {
            List list = 0sn.A00;
            0sm A0E = 0Yt.A0E();
            if (str5 != null) {
                messageIdentifier = C66580MXl.A0i(str10, (String) null);
            }
            return new C68955Nbe(userSession2, r8, r9, r10, messageIdentifier, l2, "", str7, str8, str9, str4, (String) null, list, list, A0E, 0, z2);
        }
        int size = immutableList2.size();
        if (size > 3) {
            size = 3;
        }
        Iterator it = immutableList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((DirectCountBasedReaction) it.next()).A00;
        }
        ImmutableList A01 = C66850Mdj.A01(immutableList2, size);
        ArrayList A0r = AnonymousClass7TG.A0r(A01);
        Iterator it2 = A01.iterator();
        while (it2.hasNext()) {
            A0r.add(((DirectCountBasedReaction) it2.next()).A01);
        }
        ImmutableList A0K = DbU.A0K(A0r);
        String A04 = C253673rC.A04(resources, Integer.valueOf(i), IgNetworkConsentStorage.MAX_ENTRIES, true, false);
        0sn r202 = 0sn.A00;
        String str11 = userSession2.A06;
        0sm A0E2 = 0Yt.A0E();
        Iterator it3 = immutableList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (((DirectCountBasedReaction) obj).A02) {
                break;
            }
        }
        DirectCountBasedReaction directCountBasedReaction = (DirectCountBasedReaction) obj;
        if (directCountBasedReaction != null) {
            str6 = directCountBasedReaction.A01;
        } else {
            str6 = null;
        }
        if (str5 != null) {
            messageIdentifier = C66580MXl.A0i(str10, (String) null);
        }
        return new C68955Nbe(userSession2, r8, r9, r10, messageIdentifier, l2, A04, str7, str8, str9, str11, str6, A0K, r202, A0E2, i, z2);
    }
}
