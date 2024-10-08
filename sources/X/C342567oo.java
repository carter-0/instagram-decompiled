package X;

import com.instagram.api.schemas.AudienceGroup;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7oo  reason: invalid class name and case insensitive filesystem */
public final class C342567oo {
    public List A00;
    public final UserSession A01;

    public C342567oo(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final List A00() {
        AnonymousClass3NV r0;
        List<AudienceGroup> list = this.A00;
        if (list != null) {
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (AudienceGroup audienceGroup : list) {
                switch (audienceGroup.ordinal()) {
                    case 1:
                        r0 = AnonymousClass3NV.A04;
                        break;
                    case 2:
                        r0 = AnonymousClass3NV.A05;
                        break;
                    case 3:
                        r0 = AnonymousClass3NV.A06;
                        break;
                    case 4:
                        r0 = AnonymousClass3NV.A07;
                        break;
                    case 5:
                        r0 = AnonymousClass3NV.A08;
                        break;
                    case 6:
                        r0 = AnonymousClass3NV.A09;
                        break;
                    case 7:
                        r0 = AnonymousClass3NV.A0A;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown audience group ");
                        sb.append(audienceGroup);
                        throw new UnsupportedOperationException(sb.toString());
                }
                arrayList.add(r0);
            }
            return arrayList;
        }
        List singletonList = Collections.singletonList(AnonymousClass3NV.A08);
        0qQ.A07(singletonList);
        return singletonList;
    }
}
