package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import java.util.List;
import java.util.Map;

/* renamed from: X.NhZ  reason: case insensitive filesystem */
public final class C69219NhZ extends C252323ov {
    public final UserSession A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69219NhZ(UserSession userSession, AnonymousClass4DU r4) {
        super(r4, (String) null);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass4OR A05(Object obj) {
        String obj2;
        String str;
        String str2;
        AnonymousClass4OQ valueOf;
        OI0 oi0 = (OI0) obj;
        0qQ.A0B(oi0, 0);
        String str3 = oi0.A07;
        0bb r3 = new 0bb();
        AnonymousClass4OU r7 = AnonymousClass4OT.A00;
        r3.A05("media_id", Long.valueOf(r7.A01(str3)));
        C66582MXn.A18(AnonymousClass4OQ.A02, r3, this);
        r3.A06("tracking_token", (String) null);
        r3.A06("author_id", (String) null);
        r3.A06("pre_processing_media_id", str3);
        Map map = oi0.A08;
        if (map != null) {
            Object obj3 = map.get("m_pk");
            if (obj3 instanceof String) {
                obj2 = (String) obj3;
            } else {
                if (obj3 instanceof Number) {
                    obj2 = obj3.toString();
                }
                Object obj4 = map.get("a_i");
                if ((obj4 instanceof String) && (valueOf = AnonymousClass4OQ.valueOf((String) obj4)) != null) {
                    r3.A01(valueOf, "tracking_type");
                }
                Object obj5 = map.get("tracking_token");
                if ((obj5 instanceof String) && (str2 = (String) obj5) != null) {
                    r3.A06("tracking_token", str2);
                }
                Object obj6 = map.get("a_pk");
                if ((obj6 instanceof String) && (str = (String) obj6) != null) {
                    r3.A06("author_id", str);
                }
            }
            if (obj2 != null) {
                r7.A01(obj2);
            }
            Object obj42 = map.get("a_i");
            r3.A01(valueOf, "tracking_type");
            Object obj52 = map.get("tracking_token");
            r3.A06("tracking_token", str2);
            Object obj62 = map.get("a_pk");
            r3.A06("author_id", str);
        }
        return r3;
    }

    public final /* bridge */ /* synthetic */ C263844No A07(Object obj) {
        String obj2;
        String str;
        String str2;
        AnonymousClass4OQ valueOf;
        OI0 oi0 = (OI0) obj;
        0qQ.A0B(oi0, 0);
        String str3 = oi0.A07;
        AnonymousClass3QO r4 = AnonymousClass3QO.DEFAULT;
        boolean z = false;
        String str4 = null;
        String str5 = str3;
        String str6 = this.A00.A06;
        AnonymousClass3WR r7 = oi0.A05;
        Map map = oi0.A08;
        if (map != null) {
            Object obj3 = map.get("m_pk");
            if (obj3 instanceof String) {
                obj2 = (String) obj3;
            } else {
                if (obj3 instanceof Number) {
                    obj2 = obj3.toString();
                }
                Object obj4 = map.get("a_i");
                if ((obj4 instanceof String) && (valueOf = AnonymousClass4OQ.valueOf((String) obj4)) != null) {
                    z = AnonymousClass7TF.A1W(valueOf, AnonymousClass4OQ.ORGANIC);
                }
                Object obj5 = map.get("tracking_token");
                if ((obj5 instanceof String) && (str2 = (String) obj5) != null) {
                    str4 = str2;
                }
                Object obj6 = map.get("a_pk");
                if ((obj6 instanceof String) && (str = (String) obj6) != null) {
                    str6 = str;
                }
            }
            if (obj2 != null) {
                str5 = obj2;
            }
            Object obj42 = map.get("a_i");
            z = AnonymousClass7TF.A1W(valueOf, AnonymousClass4OQ.ORGANIC);
            Object obj52 = map.get("tracking_token");
            str4 = str2;
            Object obj62 = map.get("a_pk");
            str6 = str;
        }
        return new C263844No(r4, (1iA) null, (FollowStatus) null, r7, (Boolean) null, str3, (String) null, str5, str4, str6, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, false, z, false, false, false);
    }

    public final Integer A08() {
        return AnonymousClass05K.A0u;
    }
}
