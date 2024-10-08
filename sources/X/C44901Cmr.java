package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cmr  reason: case insensitive filesystem */
public abstract class C44901Cmr {
    public static C306876Nw parseFromJson(16F r33) {
        16F r1 = r33;
        0qQ.A0B(r1, 0);
        try {
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            C241263On r15 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str4 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            Integer num = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            C270814hL r14 = null;
            Float f = null;
            String str5 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            User user = null;
            String str6 = null;
            Float f2 = null;
            while (r1.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r1);
                if ("algorithm".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                } else if ("background_image_url".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if ("caption".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("custom_profile_pic_url".equals(A17)) {
                    r15 = C241253Om.parseFromJson(r1);
                } else if ("followed_by".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r1);
                } else if ("has_stories".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r1);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("is_new_suggestion".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r1);
                } else if ("large_urls".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r1, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("media_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r1);
                } else if ("media_ids".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r1, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("media_infos".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            C41846B3n.A1D(r1, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("preview_media".equals(A17)) {
                    r14 = C45604CzG.parseFromJson(r1);
                } else if ("score".equals(A17)) {
                    f = C41846B3n.A0f(r1);
                } else if ("social_context".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("social_context_facepile_users".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList4 = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            C41846B3n.A1E(r1, arrayList4);
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("thumbnail_urls".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList5 = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r1, arrayList5);
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    user = C41845B3m.A0a(r1, false);
                } else if ("uuid".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    f2 = C41846B3n.A0f(r1);
                }
                r1.A0z();
            }
            if (str == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("algorithm", r1, "SuggestedUserItem");
            } else if (str5 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("social_context", r1, "SuggestedUserItem");
            } else if (user != null || !(r1 instanceof 0c9)) {
                return new C306876Nw(r14, r15, user, bool, bool2, bool3, f, f2, num, str, str2, str3, str4, str5, str6, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r1, "SuggestedUserItem");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
