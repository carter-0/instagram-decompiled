package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.DemarcatorActionType;
import com.instagram.api.schemas.DemarcatorStyleEnum;
import com.instagram.api.schemas.FeedItemType;
import java.io.IOException;

/* renamed from: X.4ZC  reason: invalid class name */
public abstract class AnonymousClass4ZC {
    public static AnonymousClass4ZE parseFromJson(16F r20) {
        String str;
        String str2;
        String str3;
        String str4;
        16F r2 = r20;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            C272704lE r10 = null;
            C272714lF r9 = null;
            String str5 = null;
            Boolean bool = null;
            C250533lb r8 = null;
            Boolean bool2 = null;
            String str6 = null;
            DemarcatorActionType demarcatorActionType = null;
            String str7 = null;
            DemarcatorActionType demarcatorActionType2 = null;
            DemarcatorStyleEnum demarcatorStyleEnum = null;
            String str8 = null;
            String str9 = null;
            FeedItemType feedItemType = null;
            Integer num3 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("brs_severity".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                } else if ("global_position".equals(A0q)) {
                    num2 = Integer.valueOf(r2.A1D());
                } else if ("group".equals(A0q)) {
                    r10 = C272694lD.parseFromJson(r2);
                } else if ("group_set".equals(A0q)) {
                    r9 = C272684lC.parseFromJson(r2);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("is_pause".equals(A0q)) {
                    bool = Boolean.valueOf(r2.A0d());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    r8 = C250523la.parseFromJson(r2);
                } else if ("pause".equals(A0q)) {
                    bool2 = Boolean.valueOf(r2.A0d());
                } else if ("primary_action_text".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("primary_action_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                    demarcatorActionType = (DemarcatorActionType) DemarcatorActionType.A01.get(str4);
                    if (demarcatorActionType == null) {
                        demarcatorActionType = DemarcatorActionType.UNRECOGNIZED;
                    }
                } else if ("secondary_action_text".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("secondary_action_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                    demarcatorActionType2 = (DemarcatorActionType) DemarcatorActionType.A01.get(str3);
                    if (demarcatorActionType2 == null) {
                        demarcatorActionType2 = DemarcatorActionType.UNRECOGNIZED;
                    }
                } else if ("style".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                    demarcatorStyleEnum = (DemarcatorStyleEnum) DemarcatorStyleEnum.A01.get(str2);
                    if (demarcatorStyleEnum == null) {
                        demarcatorStyleEnum = DemarcatorStyleEnum.UNRECOGNIZED;
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                } else if ("uplift_item_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    feedItemType = (FeedItemType) FeedItemType.A01.get(str);
                    if (feedItemType == null) {
                        feedItemType = FeedItemType.A2b;
                    }
                } else if ("view_state_item_type".equals(A0q)) {
                    num3 = Integer.valueOf(r2.A1D());
                }
                r2.A0z();
            }
            return new AnonymousClass4ZE(demarcatorActionType, demarcatorActionType2, demarcatorStyleEnum, feedItemType, r8, r9, r10, bool, bool2, num, num2, num3, str5, str6, str7, str8, str9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
