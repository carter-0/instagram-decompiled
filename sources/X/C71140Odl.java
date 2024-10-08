package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Odl  reason: case insensitive filesystem */
public final class C71140Odl {
    public String A00;
    public final 0wc A01;
    public final String A02;
    public final UserSession A03;

    public C71140Odl(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = userSession.A06;
        this.A01 = AnonymousClass0kN.A02(userSession);
    }

    public final void A0A(DirectShareTarget directShareTarget, String str, String str2, int i) {
        0qQ.A0B(directShareTarget, 0);
        String A012 = A01(directShareTarget);
        if (A012 != null) {
            String str3 = str;
            A06(this, DbS.A0j(i), directShareTarget.A08(), A012, "inbox", str3, A03(this, directShareTarget), str2.equals("inbox_channel_invitation"));
        }
    }

    public static 0Aj A00(C71140Odl odl) {
        0wc r2 = odl.A01;
        return r2.A00(r2.A00, "igd_channels_client_actions");
    }

    public static final String A01(DirectShareTarget directShareTarget) {
        int i = directShareTarget.A01;
        if (i == 28) {
            return "subscriber_social";
        }
        if (i == 29) {
            CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
            if (creatorBroadcastThreadInfo == null || creatorBroadcastThreadInfo.A00 != 2) {
                return "broadcast";
            }
            return "subscriber_broadcast";
        } else if (i == 32) {
            return "social";
        } else {
            if (i == 61) {
                return "subscriber_social";
            }
            if (i != 62) {
                return null;
            }
            return "social";
        }
    }

    public static final String A02(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 29) {
            return "broadcast";
        }
        if (intValue == 32 || intValue == 62) {
            return "social";
        }
        if (intValue == 28 || intValue == 61) {
            return "subscriber_social";
        }
        return null;
    }

    public static final HashMap A03(C71140Odl odl, DirectShareTarget directShareTarget) {
        String str;
        String str2;
        HashMap hashMap = null;
        if (directShareTarget.A01 == 29) {
            CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
            if (creatorBroadcastThreadInfo != null) {
                str = creatorBroadcastThreadInfo.A03;
            } else {
                str = null;
            }
            User A0j = DbV.A0j(odl.A03, str);
            if (A0j != null) {
                hashMap = AnonymousClass7TE.A1E();
                if (A0j.A29()) {
                    str2 = "True";
                } else {
                    str2 = "False";
                }
                hashMap.put("is_follower", str2);
            }
        }
        return hashMap;
    }

    public static void A04(0Aj r2, C71140Odl odl) {
        r2.AAJ("user_igid", odl.A02);
    }

    public static final void A05(C71140Odl odl, Long l, String str, String str2, String str3, String str4, Map map, boolean z) {
        String str5;
        String str6;
        0Aj A002 = A00(odl);
        if (A002.isSampled()) {
            A04(A002, odl);
            if (z) {
                str5 = "channel_invitation_clicked";
            } else {
                str5 = "channel_suggestion_clicked";
            }
            DbS.A1I(A002, str5);
            DbS.A1M(A002, str3);
            if (z) {
                str6 = "channel_invite_item";
            } else {
                str6 = "channel_suggestion_item";
            }
            Dba.A1B(A002, "source", str6);
            C66580MXl.A1H(A002, odl.A00);
            A002.A9F("suggestion_position", l);
            A002.AAJ("ig_thread_id", str);
            A002.AAJ("channel_type", str2);
            A002.AAJ("ranking_request_id", str4);
            if (map != null) {
                A002.A9H("extra", map);
            }
            A002.Cgf();
        }
    }

    public static final void A06(C71140Odl odl, Long l, String str, String str2, String str3, String str4, Map map, boolean z) {
        String str5;
        String str6;
        0Aj A002 = A00(odl);
        if (A002.isSampled()) {
            A04(A002, odl);
            if (z) {
                str5 = "channel_invitation_impression";
            } else {
                str5 = "channel_suggestion_impression";
            }
            DbS.A1I(A002, str5);
            DbS.A1M(A002, str3);
            if (z) {
                str6 = "channel_invite_item";
            } else {
                str6 = "channel_suggestion_item";
            }
            DbS.A1L(A002, str6);
            DbS.A1J(A002, "impression");
            C66580MXl.A1H(A002, odl.A00);
            A002.AAJ("ig_thread_id", str);
            A002.A9F("suggestion_position", l);
            A002.AAJ("channel_type", str2);
            A002.AAJ("ranking_request_id", str4);
            if (map != null) {
                A002.A9H("extra", map);
            }
            A002.Cgf();
        }
    }

    public final void A07() {
        0Aj A002 = A00(this);
        if (A002.isSampled()) {
            A04(A002, this);
            C66582MXn.A19(A002, "channel_filter_leave");
            Dba.A1B(A002, "source", "channel_filter");
            C66580MXl.A1H(A002, this.A00);
            A002.Cgf();
        }
    }

    public final void A08() {
        0Aj A002 = A00(this);
        if (A002.isSampled()) {
            this.A00 = AnonymousClass7TF.A0b();
            A04(A002, this);
            C66582MXn.A19(A002, "channel_filter_open");
            Dba.A1B(A002, "source", "channel_filter");
            C66580MXl.A1H(A002, this.A00);
            A002.Cgf();
        }
    }

    public final void A09(DirectShareTarget directShareTarget, String str, String str2, int i) {
        String A012 = A01(directShareTarget);
        if (A012 != null) {
            String str3 = str;
            A05(this, DbS.A0j(i), directShareTarget.A08(), A012, "inbox", str3, A03(this, directShareTarget), str2.equals("inbox_channel_invitation"));
        }
    }

    public final void A0B(String str) {
        0Aj A002 = A00(this);
        if (A002.isSampled()) {
            A04(A002, this);
            DbS.A1I(A002, "channel_invites_shown_success");
            DbS.A1M(A002, str);
            DbS.A1L(A002, "channel_invite_item");
            DbS.A1J(A002, "impression");
            C66580MXl.A1H(A002, this.A00);
            A002.Cgf();
        }
    }
}
