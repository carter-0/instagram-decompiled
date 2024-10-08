package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;

/* renamed from: X.7Ou  reason: invalid class name and case insensitive filesystem */
public abstract class C330927Ou {
    public static PendingRecipient parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            PendingRecipient pendingRecipient = new PendingRecipient();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                String str = null;
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q) || "pk".equals(A0q) || PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r7.A11() != 16L.A0G) {
                        str = r7.A1P();
                    }
                    pendingRecipient.A0B = str;
                } else if (Dbm.A02(19, 8, 63).equals(A0q)) {
                    if (r7.A11() != 16L.A0G) {
                        str = r7.A1P();
                    }
                    0qQ.A0B(str, 0);
                    pendingRecipient.A0C = str;
                } else if ("full_name".equals(A0q)) {
                    if (r7.A11() != 16L.A0G) {
                        str = r7.A1P();
                    }
                    0qQ.A0B(str, 0);
                    pendingRecipient.A0A = str;
                } else if ("profilepic_url".equals(A0q) || "profile_pic_url".equals(A0q)) {
                    SimpleImageUrl A00 = 16h.A00(r7);
                    0qQ.A0B(A00, 0);
                    pendingRecipient.A03 = A00;
                } else if ("is_verified".equals(A0q)) {
                    pendingRecipient.A0b = r7.A0d();
                } else if ("is_restricted".equals(A0q)) {
                    pendingRecipient.A0Z = r7.A0d();
                } else if ("is_blocking".equals(A0q)) {
                    pendingRecipient.A0J = r7.A0d();
                } else if ("is_group_creation_reachable".equals(A0q)) {
                    pendingRecipient.A0P = r7.A0d();
                } else if ("is_messaging_blocking".equals(A0q)) {
                    pendingRecipient.A0V = r7.A0d();
                } else if (AnonymousClass000.A00(1518).equals(A0q)) {
                    pendingRecipient.A0W = r7.A0d();
                } else if (AnonymousClass000.A00(185).equals(A0q)) {
                    pendingRecipient.A07 = Integer.valueOf(r7.A1D());
                } else if ("is_unavailable".equals(A0q)) {
                    pendingRecipient.A0a = r7.A0d();
                } else if (AnonymousClass000.A00(3471).equals(A0q)) {
                    pendingRecipient.A05 = Boolean.valueOf(r7.A0d());
                } else if ("is_business".equals(A0q)) {
                    pendingRecipient.A0K = r7.A0d();
                } else if ("is_connected".equals(A0q)) {
                    pendingRecipient.A0L = r7.A0d();
                } else if ("interop_user_type".equals(A0q)) {
                    pendingRecipient.A01 = r7.A1D();
                } else if ("is_facebook_friend_with_current_user".equals(A0q)) {
                    pendingRecipient.A0N = r7.A0d();
                } else if ("is_interop_eligible".equals(A0q)) {
                    pendingRecipient.A0U = r7.A0c();
                } else if ("context_line".equals(A0q)) {
                    if (r7.A11() == 16L.A0J) {
                        str = r7.A1P();
                    }
                    pendingRecipient.A09 = str;
                } else if ("interop_messaging_user_id".equals(A0q)) {
                    pendingRecipient.A08 = Long.valueOf(r7.A0y());
                } else if ("restriction_type".equals(A0q)) {
                    pendingRecipient.A02 = r7.A1D();
                } else if (AnonymousClass000.A00(675).equals(A0q)) {
                    pendingRecipient.A0S = r7.A0d();
                } else if (AnonymousClass000.A00(1515).equals(A0q)) {
                    pendingRecipient.A0R = r7.A0d();
                } else if ("wa_addressable".equals(A0q)) {
                    pendingRecipient.A0d = r7.A0d();
                } else if ("wa_eligibility".equals(A0q)) {
                    pendingRecipient.A00 = r7.A1D();
                } else if ("is_following_viewer".equals(A0q)) {
                    pendingRecipient.A0O = r7.A0d();
                } else if ("account_type".equals(A0q)) {
                    pendingRecipient.A06 = Integer.valueOf(r7.A1D());
                } else if ("is_group_profile".equals(A0q)) {
                    pendingRecipient.A0Q = r7.A0d();
                } else if (AnonymousClass000.A00(667).equals(A0q)) {
                    pendingRecipient.A0I = r7.A0d();
                } else if ("is_viewer_unconnected".equals(A0q)) {
                    pendingRecipient.A0c = r7.A0d();
                } else if (AnonymousClass000.A00(4079).equals(A0q)) {
                    pendingRecipient.A0e = r7.A0d();
                } else if ("has_cutover_thread".equals(A0q)) {
                    pendingRecipient.A0G = r7.A0d();
                } else if ("default_e2ee_thread".equals(A0q)) {
                    pendingRecipient.A0D = r7.A0d();
                } else if (AnonymousClass000.A00(2982).equals(A0q)) {
                    pendingRecipient.A0E = r7.A0d();
                } else if ("is_ai_agent".equals(A0q)) {
                    pendingRecipient.A0H = r7.A0d();
                } else if ("is_opal".equals(A0q)) {
                    pendingRecipient.A0Y = r7.A0d();
                } else if ("has_ai_embodiment".equals(A0q)) {
                    pendingRecipient.A0F = r7.A0d();
                } else if ("is_meta_ai_bot".equals(A0q)) {
                    pendingRecipient.A0X = r7.A0d();
                } else if (AnonymousClass000.A00(670).equals(A0q)) {
                    pendingRecipient.A0M = r7.A0d();
                } else if (AnonymousClass000.A00(3436).equals(A0q)) {
                    pendingRecipient.A0T = r7.A0d();
                }
                r7.A0z();
            }
            return pendingRecipient;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, PendingRecipient pendingRecipient) {
        r4.A0c();
        String str = pendingRecipient.A0B;
        if (str != null) {
            r4.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        }
        r4.A0R(Dbm.A02(19, 8, 63), pendingRecipient.A0C);
        r4.A0R("full_name", pendingRecipient.A0A);
        r4.A0q("profilepic_url");
        16h.A01(r4, pendingRecipient.A03);
        r4.A0S("is_verified", pendingRecipient.A0b);
        r4.A0S("is_restricted", pendingRecipient.A0Z);
        r4.A0S("is_blocking", pendingRecipient.A0J);
        r4.A0S("is_group_creation_reachable", pendingRecipient.A0P);
        r4.A0S("is_messaging_blocking", pendingRecipient.A0V);
        r4.A0S(AnonymousClass000.A00(1518), pendingRecipient.A0W);
        Integer num = pendingRecipient.A07;
        if (num != null) {
            r4.A0P(AnonymousClass000.A00(185), num.intValue());
        }
        r4.A0S("is_unavailable", pendingRecipient.A0a);
        Boolean bool = pendingRecipient.A05;
        if (bool != null) {
            r4.A0S(AnonymousClass000.A00(3471), bool.booleanValue());
        }
        r4.A0S("is_business", pendingRecipient.A0K);
        r4.A0S("is_connected", pendingRecipient.A0L);
        r4.A0P("interop_user_type", pendingRecipient.A01);
        r4.A0S("is_facebook_friend_with_current_user", pendingRecipient.A0N);
        r4.A0S("is_interop_eligible", pendingRecipient.A0U);
        String str2 = pendingRecipient.A09;
        if (str2 != null) {
            r4.A0R("context_line", str2);
        }
        Long l = pendingRecipient.A08;
        if (l != null) {
            r4.A0Q("interop_messaging_user_id", l.longValue());
        }
        r4.A0P("restriction_type", pendingRecipient.A02);
        r4.A0S(AnonymousClass000.A00(675), pendingRecipient.A0S);
        r4.A0S(AnonymousClass000.A00(1515), pendingRecipient.A0R);
        r4.A0S("wa_addressable", pendingRecipient.A0d);
        r4.A0P("wa_eligibility", pendingRecipient.A00);
        r4.A0S("is_following_viewer", pendingRecipient.A0O);
        Integer num2 = pendingRecipient.A06;
        if (num2 != null) {
            r4.A0P("account_type", num2.intValue());
        }
        r4.A0S("is_group_profile", pendingRecipient.A0Q);
        r4.A0S(AnonymousClass000.A00(667), pendingRecipient.A0I);
        r4.A0S("is_viewer_unconnected", pendingRecipient.A0c);
        r4.A0S(AnonymousClass000.A00(4079), pendingRecipient.A0e);
        r4.A0S("has_cutover_thread", pendingRecipient.A0G);
        r4.A0S("default_e2ee_thread", pendingRecipient.A0D);
        r4.A0S(AnonymousClass000.A00(2982), pendingRecipient.A0E);
        r4.A0S("is_ai_agent", pendingRecipient.A0H);
        r4.A0S("is_opal", pendingRecipient.A0Y);
        r4.A0S("has_ai_embodiment", pendingRecipient.A0F);
        r4.A0S("is_meta_ai_bot", pendingRecipient.A0X);
        r4.A0S(AnonymousClass000.A00(670), pendingRecipient.A0M);
        r4.A0S(AnonymousClass000.A00(3436), pendingRecipient.A0T);
        r4.A0Z();
    }
}
