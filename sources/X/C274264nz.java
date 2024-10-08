package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.FeedItemType;
import com.instagram.api.schemas.TIXUDesignTypeEnum;
import com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4nz  reason: invalid class name and case insensitive filesystem */
public abstract class C274264nz {
    public static C274584oc parseFromJson(16F r21) {
        String str;
        String str2;
        String A1P;
        String str3;
        16F r4 = r21;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C274514oU r8 = null;
            C274564oa r10 = null;
            FeedItemType feedItemType = null;
            Integer num = null;
            C274514oU r9 = null;
            String str4 = null;
            C250533lb r7 = null;
            ArrayList arrayList = null;
            String str5 = null;
            ArrayList arrayList2 = null;
            String str6 = null;
            ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum = null;
            String str7 = null;
            String str8 = null;
            TIXUDesignTypeEnum tIXUDesignTypeEnum = null;
            Integer num2 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("end_card_destination".equals(A0q)) {
                    r8 = C274474oP.parseFromJson(r4);
                } else if ("feature_flags".equals(A0q)) {
                    r10 = C274554oZ.parseFromJson(r4);
                } else if ("feed_item_type".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                    feedItemType = (FeedItemType) FeedItemType.A01.get(str3);
                    if (feedItemType == null) {
                        feedItemType = FeedItemType.A2b;
                    }
                } else if ("global_position".equals(A0q)) {
                    num = Integer.valueOf(r4.A1D());
                } else if ("header_cta_destination".equals(A0q)) {
                    r9 = C274474oP.parseFromJson(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A0q)) {
                    r7 = C250523la.parseFromJson(r4);
                } else if ("media_dicts".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            1Xj A00 = 1Xj.A00(r4);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("netego_id".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                } else if ("profile_pic_uris_for_facepile".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            if (!(r4.A11() == 16L.A0G || (A1P = r4.A1P()) == null)) {
                                arrayList2.add(A1P);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("quick_promotion_id".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r4.A1P();
                    }
                } else if ("tifu_type".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                    threadsInFeedUnitTypeEnum = (ThreadsInFeedUnitTypeEnum) ThreadsInFeedUnitTypeEnum.A01.get(str2);
                    if (threadsInFeedUnitTypeEnum == null) {
                        threadsInFeedUnitTypeEnum = ThreadsInFeedUnitTypeEnum.UNRECOGNIZED;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r4.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r4.A1P();
                    }
                } else if ("unit_design_type".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    tIXUDesignTypeEnum = (TIXUDesignTypeEnum) TIXUDesignTypeEnum.A01.get(str);
                    if (tIXUDesignTypeEnum == null) {
                        tIXUDesignTypeEnum = TIXUDesignTypeEnum.UNRECOGNIZED;
                    }
                } else if ("view_state_item_type".equals(A0q)) {
                    num2 = Integer.valueOf(r4.A1D());
                }
                r4.A0z();
            }
            return new C274584oc(feedItemType, r7, r8, r9, r10, tIXUDesignTypeEnum, threadsInFeedUnitTypeEnum, num, num2, str4, str5, str6, str7, str8, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
