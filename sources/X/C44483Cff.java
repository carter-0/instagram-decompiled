package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cff  reason: case insensitive filesystem */
public abstract class C44483Cff {
    public static C47217Dt4 parseFromJson(16F r24) {
        16F r4 = r24;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str5 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            User user = null;
            String str6 = null;
            Float f = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("algorithm".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                } else if ("caption".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                } else if ("followed_by".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("interest_topic".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("is_new_suggestion".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r4);
                } else if ("large_urls".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("media_ids".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("media_infos".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("social_context".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                } else if ("social_context_facepile_users".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList4 = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList4);
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("thumbnail_urls".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList5 = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList5);
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if (C41845B3m.A1B(A17)) {
                    user = C41845B3m.A0a(r4, false);
                } else if ("uuid".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r4.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    f = C41846B3n.A0f(r4);
                }
                r4.A0z();
            }
            return new C47217Dt4(user, bool, bool2, f, str, str2, str3, str4, str5, str6, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
