package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.5ql  reason: invalid class name and case insensitive filesystem */
public abstract class C296855ql {
    public static ExploreTopicCluster parseFromJson(16F r8) {
        C296865qm r2;
        Integer num;
        0qQ.A0B(r8, 0);
        try {
            ExploreTopicCluster exploreTopicCluster = new ExploreTopicCluster();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str = r8.A1P();
                    }
                    0qQ.A0B(str, 0);
                    exploreTopicCluster.A06 = str;
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str = r8.A1P();
                    }
                    0qQ.A0B(str, 0);
                    exploreTopicCluster.A0A = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str = r8.A1P();
                    }
                    0qQ.A0B(str, 0);
                    exploreTopicCluster.A09 = str;
                } else if ("cover_media".equals(A0q)) {
                    exploreTopicCluster.A02 = 1Xj.A00(r8);
                } else if ("debug_info".equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str = r8.A1P();
                    }
                    exploreTopicCluster.A05 = str;
                } else if ("ranked_position".equals(A0q)) {
                    exploreTopicCluster.A00 = r8.A1D();
                } else if ("can_mute".equals(A0q)) {
                    exploreTopicCluster.A0B = r8.A0d();
                } else if ("is_muted".equals(A0q)) {
                    exploreTopicCluster.A0C = r8.A0d();
                } else if ("bloks_app_id".equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str = r8.A1P();
                    }
                    exploreTopicCluster.A04 = str;
                } else if ("lat".equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str = r8.A1P();
                    }
                    exploreTopicCluster.A07 = str;
                } else if ("lng".equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str = r8.A1P();
                    }
                    exploreTopicCluster.A08 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    String A1Q = r8.A1Q();
                    0qQ.A0B(A1Q, 0);
                    Integer[] A00 = AnonymousClass05K.A00(11);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            num = AnonymousClass05K.A02;
                            break;
                        }
                        num = A00[i];
                        if (0qQ.A0K(C296875qn.A00(num), A1Q)) {
                            break;
                        }
                        i++;
                    }
                    0qQ.A0B(num, 0);
                    exploreTopicCluster.A03 = num;
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0q)) {
                    int A1D = r8.A1D();
                    C296865qm[] values = C296865qm.values();
                    int length2 = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            r2 = C296865qm.NOT_A_TOPIC;
                            break;
                        }
                        r2 = values[i2];
                        if (r2.A00 == A1D) {
                            break;
                        }
                        i2++;
                    }
                    exploreTopicCluster.A01 = r2;
                }
                r8.A0z();
            }
            return exploreTopicCluster;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
