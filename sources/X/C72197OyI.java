package X;

import android.widget.Toast;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.io.IOException;
import java.util.Set;

/* renamed from: X.OyI  reason: case insensitive filesystem */
public final class C72197OyI implements AnonymousClass0lh {
    public Toast A00;
    public 1P0 A01;
    public 1OC A02;
    public 1OC A03;
    public NMJ A04;
    public String A05;
    public final 1Av A06;
    public final Set A07 = AnonymousClass7TE.A1F();
    public final Set A08 = AnonymousClass7TE.A1F();
    public final 1P0 A09 = new NMI((Object) this, 29);
    public final UserSession A0A;
    public final C70333O2l A0B;

    public final synchronized void A01(OVB ovb, boolean z) {
        if (this.A02 == null) {
            this.A01 = new NMG(8, ovb, this, z);
            UserSession userSession = this.A0A;
            String str = ovb.A01;
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("accounts/set_linked_page_ig_direct_message_access/");
            A0a.A9m("setting_enabled_for_linked_page_ig_dm_access", String.valueOf(z));
            A0a.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            1OC A0S = DbU.A0S(A0a, NHA.class, ORC.class);
            this.A02 = A0S;
            1P0 r1 = this.A01;
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.common.api.base.ApiCallback<com.instagram.settings.privacy.messages.api.FbsMessageAccessSettingResponse, com.instagram.api.response.IgResponse>");
            A0S.A00 = r1;
            1OC r0 = this.A02;
            if (r0 != null) {
                1ES.A03(r0);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final synchronized void A02(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        this.A05 = str;
        try {
            1Av r4 = this.A06;
            DbS.A1a(r4, OXN.A01(directMessagesInteropOptionsViewModel), r4.A5x, 1Av.A8a, 301);
        } catch (IOException e) {
            0wb.A06("DirectMessagesOptionChooserController", "Error while serializing DirectMessagesInteropOptionsViewModel", e);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A05;
        String str11 = null;
        if (directMessageInteropReachabilityOptions != null) {
            str2 = directMessageInteropReachabilityOptions.A03;
        } else {
            str2 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = directMessagesInteropOptionsViewModel.A08;
        if (directMessageInteropReachabilityOptions2 != null) {
            str3 = directMessageInteropReachabilityOptions2.A03;
        } else {
            str3 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = directMessagesInteropOptionsViewModel.A00;
        if (directMessageInteropReachabilityOptions3 != null) {
            str4 = directMessageInteropReachabilityOptions3.A03;
        } else {
            str4 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4 = directMessagesInteropOptionsViewModel.A01;
        if (directMessageInteropReachabilityOptions4 != null) {
            str5 = directMessageInteropReachabilityOptions4.A03;
        } else {
            str5 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5 = directMessagesInteropOptionsViewModel.A09;
        if (directMessageInteropReachabilityOptions5 != null) {
            str6 = directMessageInteropReachabilityOptions5.A03;
        } else {
            str6 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6 = directMessagesInteropOptionsViewModel.A07;
        if (directMessageInteropReachabilityOptions6 != null) {
            str7 = directMessageInteropReachabilityOptions6.A03;
        } else {
            str7 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7 = directMessagesInteropOptionsViewModel.A03;
        if (directMessageInteropReachabilityOptions7 != null) {
            str8 = directMessageInteropReachabilityOptions7.A03;
        } else {
            str8 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8 = directMessagesInteropOptionsViewModel.A02;
        if (directMessageInteropReachabilityOptions8 != null) {
            str9 = directMessageInteropReachabilityOptions8.A03;
        } else {
            str9 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9 = directMessagesInteropOptionsViewModel.A04;
        if (directMessageInteropReachabilityOptions9 != null) {
            str10 = directMessageInteropReachabilityOptions9.A03;
        } else {
            str10 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions10 = directMessagesInteropOptionsViewModel.A06;
        if (directMessageInteropReachabilityOptions10 != null) {
            str11 = directMessageInteropReachabilityOptions10.A03;
        }
        1NY A0a = AnonymousClass7TG.A0a(this.A0A);
        A0a.A0A("users/set_message_settings_v2/");
        A0a.A0G("ig_followers", str2);
        A0a.A0G("others_on_ig", str3);
        A0a.A0G("fb_friends", str4);
        A0a.A0G("fb_friends_of_friends", str5);
        A0a.A0G("people_with_your_phone_number", str6);
        A0a.A0G("others_on_fb", str7);
        A0a.A0G("fb_messaged_your_page", str8);
        A0a.A0G("fb_liked_or_followed_your_page", str9);
        A0a.A0G("group_message_setting", str10);
        A0a.A0G("ig_verified", str11);
        1OC A0S = DbU.A0S(A0a, NHB.class, ORE.class);
        this.A03 = A0S;
        A0S.A00 = this.A09;
        1ES.A03(A0S);
    }

    public final synchronized void onSessionWillEnd() {
        this.A08.clear();
    }

    public static final synchronized void A00(C72197OyI oyI, NHB nhb) {
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel;
        C72197OyI oyI2 = oyI;
        synchronized (oyI2) {
            try {
                1Av r6 = oyI2.A06;
                0xa r5 = r6.A01;
                String string = r5.getString("interop_reachability_setting", "");
                0qQ.A07(string);
                DirectMessagesInteropOptionsViewModel parseFromJson = OXN.parseFromJson(16P.A00(string));
                String A13 = DbV.A13(r6, r6.A5x, 1Av.A8a, 301);
                if (A13 != null) {
                    directMessagesInteropOptionsViewModel = OXN.parseFromJson(16P.A00(A13));
                } else {
                    directMessagesInteropOptionsViewModel = new DirectMessagesInteropOptionsViewModel((DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null);
                }
                0xY AR4 = r5.AR4();
                AR4.ED3("interop_reachability_setting_PENDING");
                AR4.apply();
                for (OAI oai : oyI2.A07) {
                    NMJ nmj = oai.A00;
                    OR9.A00(nmj.A05);
                    NMJ.A00(nmj);
                }
                for (C74430Puk FKM : oyI2.A08) {
                    String str = oyI2.A05;
                    0qQ.A0A(directMessagesInteropOptionsViewModel);
                    FKM.FKM(parseFromJson, directMessagesInteropOptionsViewModel, nhb, str);
                }
            } catch (IOException e) {
                0wb.A06("DirectMessagesInteropOptionsUpdateHelper", "Error while parsing DirectMessagesInteropOptionsViewModel", e);
            }
        }
        return;
    }

    public C72197OyI(UserSession userSession, 1Av r4, C70333O2l o2l) {
        AnonymousClass7TG.A1U(userSession, o2l, r4);
        this.A0A = userSession;
        this.A0B = o2l;
        this.A06 = r4;
    }
}
