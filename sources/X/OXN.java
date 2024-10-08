package X;

import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.io.IOException;
import java.io.StringWriter;

public abstract class OXN {
    public static DirectMessagesInteropOptionsViewModel parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = new DirectMessagesInteropOptionsViewModel();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("ig_followers".equals(A17)) {
                    directMessagesInteropOptionsViewModel.A05 = A00(r3);
                } else if ("fb_friends".equals(A17)) {
                    directMessagesInteropOptionsViewModel.A00 = A00(r3);
                } else if ("fb_friends_of_friends".equals(A17)) {
                    directMessagesInteropOptionsViewModel.A01 = A00(r3);
                } else if ("people_with_your_phone_number".equals(A17)) {
                    directMessagesInteropOptionsViewModel.A09 = A00(r3);
                } else if ("others_on_ig".equals(A17)) {
                    directMessagesInteropOptionsViewModel.A08 = A00(r3);
                } else if ("others_on_fb".equals(A17)) {
                    directMessagesInteropOptionsViewModel.A07 = A00(r3);
                } else if ("fb_messaged_your_page".equals(A17)) {
                    directMessagesInteropOptionsViewModel.A03 = A00(r3);
                } else if ("fb_liked_or_followed_your_page".equals(A17)) {
                    directMessagesInteropOptionsViewModel.A02 = A00(r3);
                } else if ("group_message_setting".equals(A17)) {
                    directMessagesInteropOptionsViewModel.A04 = A00(r3);
                } else if ("ig_verified".equals(A17)) {
                    directMessagesInteropOptionsViewModel.A06 = A00(r3);
                }
                r3.A0z();
            }
            return directMessagesInteropOptionsViewModel;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static DirectMessageInteropReachabilityOptions A00(16F r0) {
        return C70330O2i.A00(r0.A1P());
    }

    public static String A01(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel) {
        StringWriter A0v = JTO.A0v();
        17W A0K = AnonymousClass7TF.A0K(A0v);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A05;
        if (directMessageInteropReachabilityOptions != null) {
            A0K.A0R("ig_followers", directMessageInteropReachabilityOptions.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = directMessagesInteropOptionsViewModel.A00;
        if (directMessageInteropReachabilityOptions2 != null) {
            A0K.A0R("fb_friends", directMessageInteropReachabilityOptions2.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = directMessagesInteropOptionsViewModel.A01;
        if (directMessageInteropReachabilityOptions3 != null) {
            A0K.A0R("fb_friends_of_friends", directMessageInteropReachabilityOptions3.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4 = directMessagesInteropOptionsViewModel.A09;
        if (directMessageInteropReachabilityOptions4 != null) {
            A0K.A0R("people_with_your_phone_number", directMessageInteropReachabilityOptions4.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5 = directMessagesInteropOptionsViewModel.A08;
        if (directMessageInteropReachabilityOptions5 != null) {
            A0K.A0R("others_on_ig", directMessageInteropReachabilityOptions5.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6 = directMessagesInteropOptionsViewModel.A07;
        if (directMessageInteropReachabilityOptions6 != null) {
            A0K.A0R("others_on_fb", directMessageInteropReachabilityOptions6.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7 = directMessagesInteropOptionsViewModel.A03;
        if (directMessageInteropReachabilityOptions7 != null) {
            A0K.A0R("fb_messaged_your_page", directMessageInteropReachabilityOptions7.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8 = directMessagesInteropOptionsViewModel.A02;
        if (directMessageInteropReachabilityOptions8 != null) {
            A0K.A0R("fb_liked_or_followed_your_page", directMessageInteropReachabilityOptions8.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9 = directMessagesInteropOptionsViewModel.A04;
        if (directMessageInteropReachabilityOptions9 != null) {
            A0K.A0R("group_message_setting", directMessageInteropReachabilityOptions9.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions10 = directMessagesInteropOptionsViewModel.A06;
        if (directMessageInteropReachabilityOptions10 != null) {
            A0K.A0R("ig_verified", directMessageInteropReachabilityOptions10.A03);
        }
        return AnonymousClass7TG.A0k(A0K, A0v);
    }
}
