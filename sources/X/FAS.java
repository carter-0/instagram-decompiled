package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This logger is only used for the old thread details. For new end channel logging use SocialChannelsLogHelper, BroadcastChatLogHelper or CreatorSubscriberChatLogger")
public final class FAS {
    public final 0wc A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public FAS(UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(str2, 3);
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = C273654mx.A00(669);
        this.A00 = r1.A00();
    }

    public static final void A00(FAS fas, String str, String str2, String str3) {
        try {
            1Ln A0F = 1Ln.A0F(fas.A00);
            if (DbT.A1Y(A0F)) {
                Dbb.A1G(A0F, fas.A01);
                A0F.A0l(str);
                A0F.A0k(str2);
                A0F.A0p("end_chat_dialog");
                Dba.A1E(A0F, str3);
                A0F.A0v(fas.A02);
                A0F.A0s(fas.A03);
                A0F.A0i(AnonymousClass7TE.A10(fas.A04));
                A0F.Cgf();
            }
        } catch (NumberFormatException e) {
            0wb.A06("EndChannelLogger", "Failed to convert String to Long", e);
        }
    }
}
