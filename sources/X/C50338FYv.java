package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.HashMap;

/* renamed from: X.FYv  reason: case insensitive filesystem */
public final class C50338FYv implements AnonymousClass0lh {
    public String A00;
    public final long A01;
    public final 0wc A02;
    public final UserSession A03;

    public static 1Ln A00(C50338FYv fYv) {
        return 1Ln.A0F(fYv.A02);
    }

    public static final String A01(ChannelCreationSource channelCreationSource) {
        switch (channelCreationSource.ordinal()) {
            case 0:
            case 5:
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(channelCreationSource);
                throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(" is not a valid surface for social channel", A1A));
            case 1:
            case 6:
                return "profile";
            case 2:
            case 3:
            case 4:
            case 7:
                return "dm_creation_omnipicker";
            case 8:
            case 9:
            case 10:
            case 11:
                return "create_channel";
            default:
                throw AnonymousClass7TE.A1K();
        }
    }

    public static void A04(1Ln r2, C50338FYv fYv) {
        r2.A0h(Long.valueOf(fYv.A01));
    }

    public final void onSessionWillEnd() {
        this.A03.A03(C50338FYv.class);
    }

    public C50338FYv(UserSession userSession) {
        long j;
        this.A03 = userSession;
        Long A10 = AnonymousClass7TE.A10(userSession.A06);
        if (A10 != null) {
            j = A10.longValue();
        } else {
            j = -1;
        }
        this.A01 = j;
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "igd_public_chats_actions";
        this.A02 = r1.A00();
    }

    public static final String A02(C69318NjJ njJ) {
        int ordinal = njJ.ordinal();
        if (ordinal == 0) {
            return "story";
        }
        if (ordinal == 3) {
            return "inbox_search";
        }
        if (ordinal == 10) {
            return C66579MXk.A00(779);
        }
        if (ordinal == 12) {
            return "profile";
        }
        if (ordinal != 7) {
            return null;
        }
        return "group_link_xma";
    }

    public static final HashMap A03(F0V f0v, C50338FYv fYv) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("chat_type", "public");
        String str5 = f0v.A06;
        if (str5 != null) {
            A1E.put("chat_creation_source", str5);
        }
        Boolean bool = f0v.A00;
        if (bool != null) {
            if (bool.booleanValue()) {
                str4 = "True";
            } else {
                str4 = "False";
            }
            A1E.put("has_thread_photo", str4);
        }
        Boolean bool2 = f0v.A02;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                str3 = "True";
            } else {
                str3 = "False";
            }
            A1E.put("limited_to_subscribers", str3);
        }
        Boolean bool3 = f0v.A03;
        if (bool3 != null) {
            if (bool3.booleanValue()) {
                str2 = "True";
            } else {
                str2 = "False";
            }
            A1E.put("show_on_profile", str2);
        }
        Boolean bool4 = f0v.A01;
        if (bool4 != null) {
            if (bool4.booleanValue()) {
                str = "True";
            } else {
                str = "False";
            }
            A1E.put("categories_selected", str);
        }
        Integer num2 = f0v.A04;
        if (num2 != null) {
            A1E.put("number_invited", String.valueOf(num2.intValue()));
        }
        if (182.A06(0Tu.A05, fYv.A03, 36327615073892919L) && (num = f0v.A05) != null) {
            A1E.put("chat_duration_seconds", String.valueOf(num.intValue()));
        }
        return A1E;
    }

    public static void A05(1Ln r1, C50338FYv fYv, String str) {
        r1.A0q(str);
        r1.A0o("instagram");
        r1.A0v(fYv.A00);
    }

    public final void A06(ChannelCreationSource channelCreationSource) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            this.A00 = AnonymousClass7TF.A0b();
            A04(A002, this);
            Dba.A1D(A002, C273654mx.A00(2152));
            String str = "omnipicker_view";
            switch (channelCreationSource.ordinal()) {
                case 4:
                    break;
                case 5:
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append(channelCreationSource);
                    throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(" is not a valid source for social channel ", A1A));
                default:
                    str = "profile_view";
                    break;
            }
            A002.A0p(str);
            A05(A002, this, A01(channelCreationSource));
            A002.Cgf();
        }
    }

    public final void A07(F0V f0v) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A04(A002, this);
            DbV.A1M(A002, "thread_create_attempt");
            A002.A0p("create_public_chat_button");
            A05(A002, this, "invite_people");
            A002.A0w(A03(f0v, this));
            A002.Cgf();
        }
    }

    public final void A08(String str, String str2, boolean z, String str3) {
        String str4;
        int i;
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            HashMap A1E = AnonymousClass7TE.A1E();
            if (z) {
                str4 = "True";
            } else {
                str4 = "False";
            }
            A1E.put("is_chat_creator", str4);
            A04(A002, this);
            DbV.A1M(A002, "story_camera_rendered_public_jcs");
            String A003 = C66579MXk.A00(403);
            boolean equals = str3.equals(A003);
            if (equals) {
                i = 3326;
            } else {
                i = 3325;
            }
            A002.A0p(C273654mx.A00(i));
            if (!equals) {
                A003 = "thread_view";
            }
            Dba.A1E(A002, A003);
            A002.A0s(str);
            A002.A0i(DbZ.A0d(str2));
            A002.A0w(A1E);
            A002.Cgf();
        }
    }
}
