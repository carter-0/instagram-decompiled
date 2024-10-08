package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.FeedItemType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4t1  reason: invalid class name and case insensitive filesystem */
public abstract class C276304t1 {
    public static AnonymousClass3IN parseFromJson(16F r51) {
        0LH r1;
        String str;
        String str2;
        16F r10 = r51;
        0qQ.A0B(r10, 0);
        try {
            Integer num = null;
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            String str3 = null;
            Boolean bool2 = null;
            Long l = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            FeedItemType feedItemType = null;
            Boolean bool7 = null;
            String str4 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            ArrayList arrayList = null;
            String str5 = null;
            String str6 = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("action_text".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if (TraceFieldType.Duration.equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if ("dynamic_width_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r10.A0d());
                } else if ("gradient_animation_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(r10.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    l = Long.valueOf(r10.A0y());
                } else if ("is_unit_dismissable".equals(A0q)) {
                    bool3 = Boolean.valueOf(r10.A0d());
                } else if ("large_profile_pictures_enabled".equals(A0q)) {
                    bool4 = Boolean.valueOf(r10.A0d());
                } else if ("load_animation_enabled".equals(A0q)) {
                    bool5 = Boolean.valueOf(r10.A0d());
                } else if ("multiple_gradients_enabled".equals(A0q)) {
                    bool6 = Boolean.valueOf(r10.A0d());
                } else if ("netego_type".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                    feedItemType = (FeedItemType) FeedItemType.A01.get(str2);
                    if (feedItemType == null) {
                        feedItemType = FeedItemType.A2b;
                    }
                } else if ("no_follow_confirmation".equals(A0q)) {
                    bool7 = Boolean.valueOf(r10.A0d());
                } else if ("ranking_algorithm".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                } else if ("shuffle_enabled".equals(A0q)) {
                    bool8 = Boolean.valueOf(r10.A0d());
                } else if ("smaller_follow_tap_target_enabled".equals(A0q)) {
                    bool9 = Boolean.valueOf(r10.A0d());
                } else if ("suggestions".equals(A0q)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r10.A1J() != 16L.A08) {
                            C241283Op parseFromJson = C241243Ol.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r10.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str3 == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("action_text", "SimpleSuggestedUsersDict");
            } else if (num == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00(TraceFieldType.Duration, "SimpleSuggestedUsersDict");
            } else if (bool == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("dynamic_width_enabled", "SimpleSuggestedUsersDict");
            } else if (bool2 == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("gradient_animation_enabled", "SimpleSuggestedUsersDict");
            } else if (l == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "SimpleSuggestedUsersDict");
            } else if (bool3 == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("is_unit_dismissable", "SimpleSuggestedUsersDict");
            } else if (bool4 == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("large_profile_pictures_enabled", "SimpleSuggestedUsersDict");
            } else if (bool5 == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("load_animation_enabled", "SimpleSuggestedUsersDict");
            } else if (bool6 == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("multiple_gradients_enabled", "SimpleSuggestedUsersDict");
            } else if (feedItemType == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("netego_type", "SimpleSuggestedUsersDict");
            } else if (bool7 != null || !(r10 instanceof 0c9)) {
                if (str4 == null && (r10 instanceof 0c9)) {
                    r1 = ((0c9) r10).A03;
                    str = "ranking_algorithm";
                } else if (bool8 == null && (r10 instanceof 0c9)) {
                    r1 = ((0c9) r10).A03;
                    str = "shuffle_enabled";
                } else if (bool9 == null && (r10 instanceof 0c9)) {
                    r1 = ((0c9) r10).A03;
                    str = "smaller_follow_tap_target_enabled";
                } else if (arrayList == null && (r10 instanceof 0c9)) {
                    r1 = ((0c9) r10).A03;
                    str = "suggestions";
                } else if (str5 == null && (r10 instanceof 0c9)) {
                    r1 = ((0c9) r10).A03;
                    str = DialogModule.KEY_TITLE;
                } else if (str6 != null || !(r10 instanceof 0c9)) {
                    return new AnonymousClass3IN(feedItemType, str3, str4, str5, str6, arrayList, num.intValue(), l.longValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), bool8.booleanValue(), bool9.booleanValue());
                } else {
                    r1 = ((0c9) r10).A03;
                    str = "tracking_token";
                }
                r1.A00(str, "SimpleSuggestedUsersDict");
            } else {
                ((0c9) r10).A03.A00("no_follow_confirmation", "SimpleSuggestedUsersDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
