package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;

public final class OU1 {
    public C376649Iu A00;
    public AnonymousClass77X A01;
    public AnonymousClass7FN A02;
    public AnonymousClass7FJ A03;
    public AnonymousClass55L A04;
    public C271374ik A05;
    public C2609947v A06;
    public UVA A07;
    public C70820OMp A08;
    public 1Xj A09;
    public 2FW A0A;
    public AnonymousClass53G A0B;
    public DirectStoreStickerResponseItem A0C;
    public Boolean A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public Map A0I;
    public final 2FW A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;

    public OU1(2FW r9, 2FW r10, Object obj, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A0L = str;
        this.A0E = str2;
        this.A0K = str3;
        this.A0J = r9;
        this.A0M = str4;
        this.A0F = str5;
        this.A0D = Boolean.valueOf(z);
        if (obj != null) {
            try {
                C254943tJ r0 = C254943tJ.$redex_init_class;
                String str7 = str6;
                switch (r9.ordinal()) {
                    case 2:
                        this.A0G = (String) obj;
                        return;
                    case 3:
                        this.A09 = (1Xj) obj;
                        return;
                    case 4:
                        this.A05 = (C271374ik) obj;
                        return;
                    case 11:
                        this.A00 = (C376649Iu) obj;
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        if (obj instanceof DirectAnimatedMedia) {
                            DirectAnimatedMedia directAnimatedMedia = (DirectAnimatedMedia) obj;
                            0qQ.A0B(directAnimatedMedia, 1);
                            String str8 = directAnimatedMedia.A05;
                            this.A0B = new AnonymousClass53G(new AnonymousClass9IE(directAnimatedMedia.A02), directAnimatedMedia.A01, directAnimatedMedia.A04, directAnimatedMedia.A03, str8, directAnimatedMedia.A06);
                            return;
                        } else if (obj instanceof AnonymousClass53G) {
                            this.A0B = (AnonymousClass53G) obj;
                            return;
                        } else {
                            A00(r9, obj, "Unable to process ANIMATED_MEDIA");
                            return;
                        }
                    case 13:
                        if (obj instanceof DirectStoreStickerResponseItem) {
                            this.A0C = (DirectStoreStickerResponseItem) obj;
                            return;
                        } else {
                            A00(r9, obj, "Unable to process STORE_STICKER");
                            return;
                        }
                    case 14:
                        this.A06 = (C2609947v) obj;
                        return;
                    case 22:
                        this.A02 = (AnonymousClass7FN) obj;
                        return;
                    case 28:
                        this.A03 = (AnonymousClass7FJ) obj;
                        return;
                    case 36:
                        this.A04 = (AnonymousClass55L) obj;
                        return;
                    case 45:
                        this.A08 = (C70820OMp) obj;
                        return;
                    case 46:
                        this.A01 = (AnonymousClass77X) obj;
                        return;
                    case 49:
                    case 57:
                    case 81:
                    case 82:
                        break;
                    case 96:
                        if (str6 != null) {
                            this.A0G = str7;
                            break;
                        }
                        break;
                    default:
                        A00(r9, obj, "Encountered unexpected reply type");
                        return;
                }
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() >= 1 && (AnonymousClass7TE.A13(list) instanceof C254873tC)) {
                        this.A0H = list;
                        if (r10 != null && str6 != null) {
                            this.A0A = r10;
                            this.A0G = str7;
                            return;
                        }
                        return;
                    }
                }
                A00(r9, obj, "Unable to process XMA reply");
            } catch (ClassCastException unused) {
                String obj2 = r9.toString();
                String obj3 = obj.getClass().toString();
                0f9 AEf = 0wj.A01.AEf(002.A0R("DirectRepliedToMessage ", "Class cast error when processing reply"), 20134884);
                AEf.ABQ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj2);
                AEf.ABQ("class", obj3);
                AEf.report();
            }
        }
    }

    public static void A00(Object obj, Object obj2, String str) {
        String obj3 = obj.toString();
        String obj4 = obj2.getClass().toString();
        0f9 AEf = 0wj.A01.AEf(002.A0R("DirectRepliedToMessage ", str), 20134884);
        AEf.ABQ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj3);
        AEf.ABQ("class", obj4);
        AEf.report();
    }
}
