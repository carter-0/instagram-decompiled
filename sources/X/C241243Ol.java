package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3Ol  reason: invalid class name and case insensitive filesystem */
public abstract class C241243Ol {
    public static C241283Op parseFromJson(16F r35) {
        String A1P;
        String A1P2;
        String A1P3;
        16F r0 = r35;
        0qQ.A0B(r0, 0);
        try {
            if (r0.A11() != 16L.A0D) {
                r0.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            C241263On r17 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str4 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            Integer num = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            C270814hL r16 = null;
            Float f = null;
            String str5 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            User user = null;
            String str6 = null;
            Float f2 = null;
            while (r0.A1J() != 16L.A09) {
                String A0q = r0.A0q();
                r0.A1J();
                if ("algorithm".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r0.A1P();
                    }
                } else if ("background_image_url".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r0.A1P();
                    }
                } else if ("caption".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r0.A1P();
                    }
                } else if ("custom_profile_pic_url".equals(A0q)) {
                    r17 = C241253Om.parseFromJson(r0);
                } else if ("followed_by".equals(A0q)) {
                    bool = Boolean.valueOf(r0.A0d());
                } else if ("has_stories".equals(A0q)) {
                    bool2 = Boolean.valueOf(r0.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r0.A1P();
                    }
                } else if ("is_new_suggestion".equals(A0q)) {
                    bool3 = Boolean.valueOf(r0.A0d());
                } else if ("large_urls".equals(A0q)) {
                    if (r0.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r0.A1J() != 16L.A08) {
                            if (!(r0.A11() == 16L.A0G || (A1P3 = r0.A1P()) == null)) {
                                arrayList.add(A1P3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("media_count".equals(A0q)) {
                    num = Integer.valueOf(r0.A1D());
                } else if ("media_ids".equals(A0q)) {
                    if (r0.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r0.A1J() != 16L.A08) {
                            if (!(r0.A11() == 16L.A0G || (A1P2 = r0.A1P()) == null)) {
                                arrayList2.add(A1P2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("media_infos".equals(A0q)) {
                    if (r0.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r0.A1J() != 16L.A08) {
                            1Xj A00 = 1Xj.A00(r0);
                            if (A00 != null) {
                                arrayList3.add(A00);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("preview_media".equals(A0q)) {
                    r16 = C45604CzG.parseFromJson(r0);
                } else if ("score".equals(A0q)) {
                    f = new Float(r0.A0U());
                } else if ("social_context".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r0.A1P();
                    }
                } else if ("social_context_facepile_users".equals(A0q)) {
                    if (r0.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r0.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A002 = 1aC.A00(r0, false);
                            if (A002 != null) {
                                arrayList4.add(A002);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("thumbnail_urls".equals(A0q)) {
                    if (r0.A11() == 16L.A0C) {
                        arrayList5 = new ArrayList();
                        while (r0.A1J() != 16L.A08) {
                            if (!(r0.A11() == 16L.A0G || (A1P = r0.A1P()) == null)) {
                                arrayList5.add(A1P);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user = 1aC.A00(r0, false);
                } else if ("uuid".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r0.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0q)) {
                    f2 = new Float(r0.A0U());
                }
                r0.A0z();
            }
            if (str == null && (r0 instanceof 0c9)) {
                ((0c9) r0).A03.A00("algorithm", "SuggestedUserDict");
            } else if (str5 == null && (r0 instanceof 0c9)) {
                ((0c9) r0).A03.A00("social_context", "SuggestedUserDict");
            } else if (user != null || !(r0 instanceof 0c9)) {
                return new C241283Op(r16, r17, user, bool, bool2, bool3, f, f2, num, str, str2, str3, str4, str5, str6, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            } else {
                ((0c9) r0).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_USER, "SuggestedUserDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
