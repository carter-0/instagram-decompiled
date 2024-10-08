package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.47j  reason: invalid class name and case insensitive filesystem */
public abstract class C2608747j {
    public static C2609147n parseFromJson(16F r21) {
        16F r1 = r21;
        0qQ.A0B(r1, 0);
        try {
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            C2608947l r6 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num = null;
            Boolean bool3 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            Integer num2 = null;
            String str10 = null;
            while (r1.A1J() != 16L.A09) {
                String A0q = r1.A0q();
                r1.A1J();
                if ("creator_broadcast_chat_thread_preview_response".equals(A0q)) {
                    r6 = C2608847k.parseFromJson(r1);
                } else if ("creator_igid".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                } else if ("creator_username".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if ("group_image_background_uri".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("group_image_uri".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("invite_link".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("is_creator_verified".equals(A0q)) {
                    bool = Boolean.valueOf(r1.A0d());
                } else if ("is_member".equals(A0q)) {
                    bool2 = Boolean.valueOf(r1.A0d());
                } else if ("number_of_members".equals(A0q)) {
                    num = Integer.valueOf(r1.A1D());
                } else if ("should_badge_channel".equals(A0q)) {
                    bool3 = Boolean.valueOf(r1.A0d());
                } else if ("social_channel_invite_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("social_context_username".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if ("thread_igid".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if ("thread_subtype".equals(A0q)) {
                    num2 = Integer.valueOf(r1.A1D());
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                }
                r1.A0z();
            }
            if (str9 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("thread_igid", "ChannelsPreviewDictImpl");
            } else if (str10 != null || !(r1 instanceof 0c9)) {
                return new C2609147n(r6, bool, bool2, bool3, num, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
            } else {
                ((0c9) r1).A03.A00(DialogModule.KEY_TITLE, "ChannelsPreviewDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C2609147n r4) {
        r3.A0c();
        C2609047m r1 = r4.A00;
        if (r1 != null) {
            r3.A0q("creator_broadcast_chat_thread_preview_response");
            C2608947l F2G = r1.F2G();
            r3.A0c();
            r3.A0P("audience_type", F2G.A00);
            r3.A0S("is_added_to_inbox", F2G.A05);
            Boolean bool = F2G.A01;
            if (bool != null) {
                r3.A0S("is_collaborator", bool.booleanValue());
            }
            Boolean bool2 = F2G.A02;
            if (bool2 != null) {
                r3.A0S("is_follower", bool2.booleanValue());
            }
            Boolean bool3 = F2G.A03;
            if (bool3 != null) {
                r3.A0S("is_invited_collaborator", bool3.booleanValue());
            }
            Boolean bool4 = F2G.A04;
            if (bool4 != null) {
                r3.A0S("is_subscriber", bool4.booleanValue());
            }
            r3.A0Z();
        }
        String str = r4.A06;
        if (str != null) {
            r3.A0R("creator_igid", str);
        }
        String str2 = r4.A07;
        if (str2 != null) {
            r3.A0R("creator_username", str2);
        }
        String str3 = r4.A08;
        if (str3 != null) {
            r3.A0R("group_image_background_uri", str3);
        }
        String str4 = r4.A09;
        if (str4 != null) {
            r3.A0R("group_image_uri", str4);
        }
        String str5 = r4.A0A;
        if (str5 != null) {
            r3.A0R("invite_link", str5);
        }
        Boolean bool5 = r4.A01;
        if (bool5 != null) {
            r3.A0S("is_creator_verified", bool5.booleanValue());
        }
        Boolean bool6 = r4.A02;
        if (bool6 != null) {
            r3.A0S("is_member", bool6.booleanValue());
        }
        Integer num = r4.A04;
        if (num != null) {
            r3.A0P("number_of_members", num.intValue());
        }
        Boolean bool7 = r4.A03;
        if (bool7 != null) {
            r3.A0S("should_badge_channel", bool7.booleanValue());
        }
        String str6 = r4.A0B;
        if (str6 != null) {
            r3.A0R("social_channel_invite_id", str6);
        }
        String str7 = r4.A0C;
        if (str7 != null) {
            r3.A0R("social_context_username", str7);
        }
        String str8 = r4.A0D;
        if (str8 != null) {
            r3.A0R("subtitle", str8);
        }
        String str9 = r4.A0E;
        if (str9 != null) {
            r3.A0R("thread_igid", str9);
        }
        Integer num2 = r4.A05;
        if (num2 != null) {
            r3.A0P("thread_subtype", num2.intValue());
        }
        String str10 = r4.A0F;
        if (str10 != null) {
            r3.A0R(DialogModule.KEY_TITLE, str10);
        }
        r3.A0Z();
    }
}
