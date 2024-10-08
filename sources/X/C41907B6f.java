package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.B6f  reason: case insensitive filesystem */
public abstract class C41907B6f {
    public static AnonymousClass3UJ parseFromJson(16F r35) {
        String A1P;
        String A1P2;
        String A1P3;
        16F r5 = r35;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            C241263On r14 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            Integer num = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            C270814hL r13 = null;
            String str6 = null;
            Float f = null;
            String str7 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            C266544Zk r12 = null;
            User user = null;
            C270834hN r15 = null;
            String str8 = null;
            Float f2 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("algorithm".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("background_image_url".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                } else if ("caption".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                } else if ("custom_profile_pic_url".equals(A0q)) {
                    r14 = C241253Om.parseFromJson(r5);
                } else if ("followed_by".equals(A0q)) {
                    bool = Boolean.valueOf(r5.A0d());
                } else if ("has_stories".equals(A0q)) {
                    bool2 = Boolean.valueOf(r5.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                } else if ("interest_topic".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r5.A1P();
                    }
                } else if ("is_new_suggestion".equals(A0q)) {
                    bool3 = Boolean.valueOf(r5.A0d());
                } else if ("large_urls".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            if (!(r5.A11() == 16L.A0G || (A1P3 = r5.A1P()) == null)) {
                                arrayList.add(A1P3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("media_count".equals(A0q)) {
                    num = Integer.valueOf(r5.A1D());
                } else if ("media_ids".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            if (!(r5.A11() == 16L.A0G || (A1P2 = r5.A1P()) == null)) {
                                arrayList2.add(A1P2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("media_infos".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            1Xj A00 = 1Xj.A00(r5);
                            if (A00 != null) {
                                arrayList3.add(A00);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("preview_media".equals(A0q)) {
                    r13 = C45604CzG.parseFromJson(r5);
                } else if ("reel_media_id".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r5.A1P();
                    }
                } else if ("score".equals(A0q)) {
                    f = new Float(r5.A0U());
                } else if ("social_context".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r5.A1P();
                    }
                } else if ("social_context_facepile_users".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A002 = 1aC.A00(r5, false);
                            if (A002 != null) {
                                arrayList4.add(A002);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("thumbnail_urls".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList5 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            if (!(r5.A11() == 16L.A0G || (A1P = r5.A1P()) == null)) {
                                arrayList5.add(A1P);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("upsell_invite_card".equals(A0q)) {
                    r12 = C266534Zj.parseFromJson(r5);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user = 1aC.A00(r5, false);
                } else if ("user_story".equals(A0q)) {
                    r15 = C44890Cmg.parseFromJson(r5);
                } else if ("uuid".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r5.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0q)) {
                    f2 = new Float(r5.A0U());
                }
                r5.A0z();
            }
            return new AnonymousClass3UJ(r12, r13, r14, r15, user, bool, bool2, bool3, f, f2, num, str, str2, str3, str4, str5, str6, str7, str8, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
