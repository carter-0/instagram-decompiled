package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MusicStatusStyleResponseInfo;
import com.instagram.api.schemas.MusicStatusStyleResponseInfoImpl;
import com.instagram.api.schemas.StatusStyleResponseInfoImpl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.D0z  reason: case insensitive filesystem */
public abstract class C45674D0z {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.OMp, java.lang.Object] */
    public static C70820OMp parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            ? obj = new Object();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("reply".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r7);
                } else if ("reply_type".equals(A17)) {
                    String A1Q = r7.A1Q();
                    Integer[] A00 = AnonymousClass05K.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (i < length) {
                        Integer num = A00[i];
                        if (C70081Nwx.A00(num).equals(A1Q)) {
                            obj.A03 = num;
                        } else {
                            i++;
                        }
                    }
                    throw AnonymousClass7TE.A15(002.A0R("Invalid server value for reply_type: ", A1Q));
                } else if ("reaction".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r7);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    obj.A00 = Cj4.parseFromJson(r7);
                } else if ("animated_media".equals(A17)) {
                    obj.A02 = AnonymousClass53A.parseFromJson(r7);
                }
                r7.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, C70820OMp oMp) {
        r3.A0c();
        String str = oMp.A05;
        if (str != null) {
            r3.A0R("reply", str);
        }
        Integer num = oMp.A03;
        if (num != null) {
            r3.A0R("reply_type", C70081Nwx.A00(num));
        }
        String str2 = oMp.A04;
        if (str2 != null) {
            r3.A0R("reaction", str2);
        }
        if (oMp.A00 != null) {
            r3.A0q(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
            C45398Cve cve = oMp.A00;
            r3.A0c();
            r3.A0R("emoji", cve.A01);
            r3.A0R("text", cve.A04);
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, cve.A02);
            r3.A0R("status_key", cve.A03);
            StatusStyleResponseInfoImpl statusStyleResponseInfoImpl = cve.A00;
            if (statusStyleResponseInfoImpl != null) {
                r3.A0q("style_response_info");
                r3.A0c();
                MusicStatusStyleResponseInfo musicStatusStyleResponseInfo = statusStyleResponseInfoImpl.A00;
                if (musicStatusStyleResponseInfo != null) {
                    r3.A0q("music_response_info");
                    MusicStatusStyleResponseInfoImpl F6a = musicStatusStyleResponseInfo.F6a();
                    r3.A0c();
                    String str3 = F6a.A00;
                    if (str3 != null) {
                        r3.A0R("audio_cluster_id", str3);
                    }
                    String str4 = F6a.A01;
                    if (str4 != null) {
                        r3.A0R("display_artist", str4);
                    }
                    String str5 = F6a.A02;
                    if (str5 != null) {
                        r3.A0R("music_title", str5);
                    }
                    r3.A0Z();
                }
                r3.A0Z();
            }
            r3.A0Z();
        }
        if (oMp.A02 != null) {
            r3.A0q("animated_media");
            AnonymousClass53A.A00(r3, oMp.A02);
        }
        r3.A0Z();
    }
}
