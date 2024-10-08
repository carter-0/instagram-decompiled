package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.EnableAudioParameters;
import com.instagram.api.schemas.ProductTaggingFeedComponentType;
import com.instagram.model.shopping.ProductSource;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.PqT  reason: case insensitive filesystem */
public final class C74187PqT extends 0Yg implements 0sP {
    public final int A00;
    public final String A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74187PqT(String str, boolean z, int i) {
        super(1);
        this.A00 = i;
        this.A01 = str;
        this.A02 = z;
    }

    public static void A00(C71143Odx odx, Object obj) {
        C71143Odx.A04(odx, new C74187PqT((String) null, ((C72813PLb) obj).A00, 3));
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C251243mn r6 = (C251243mn) obj2;
                0qQ.A0B(r6, 0);
                r6.EER(this.A01, this.A02);
                break;
            case 1:
                C333867aH r62 = (C333867aH) obj2;
                0qQ.A0B(r62, 0);
                String str = this.A01;
                boolean z = this.A02;
                0qQ.A0B(str, 1);
                return C335067cK.A08(r62, str, new GL4(z, 5));
            case 2:
                C333867aH r63 = (C333867aH) obj2;
                0qQ.A0B(r63, 0);
                return C335067cK.A06(r63, this.A01, (String) null, new GL4(this.A02, 2));
            case 3:
                NCZ A0j = C66581MXm.A0j(obj2);
                boolean z2 = this.A02;
                String str2 = this.A01;
                AudioApi audioApi = A0j.A01.A09.A00;
                if (audioApi != null) {
                    audioApi.enableAudio(0sr.A1L(new EnableAudioParameters[]{new EnableAudioParameters(str2, 1, z2)}));
                    break;
                } else {
                    throw AnonymousClass7TE.A0z("setApi must be called");
                }
            case 4:
                C14087Tpd tpd = (C14087Tpd) obj2;
                0qQ.A0B(tpd, 0);
                return C14087Tpd.A00((ProductSource) null, tpd, this.A01, (String) null, (List) null, (List) null, (Set) null, (Set) null, 3646, true, false, false, this.A02);
            default:
                ULE ule = (ULE) obj2;
                0qQ.A0B(ule, 0);
                String str3 = this.A01;
                boolean z3 = this.A02;
                0qQ.A0B(str3, 1);
                List list = ule.A04;
                C68169N3k n3k = new C68169N3k((C15055ULy) null, (ProductTaggingFeedComponentType) null, (String) null, (DefaultConstructorMarker) null, 0, 15);
                ProductTaggingFeedComponentType productTaggingFeedComponentType = ProductTaggingFeedComponentType.UNRECOGNIZED;
                0qQ.A0B(productTaggingFeedComponentType, 0);
                n3k.A02 = productTaggingFeedComponentType;
                n3k.A03 = "spinner/default";
                C15055ULy uLy = new C15055ULy((C61079JwH) null, 511);
                uLy.A06 = new C61046Jvk(str3, z3, 14);
                n3k.A01 = uLy;
                ArrayList A0T = 00k.A0T(n3k, list);
                ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = ule.A01;
                return ULE.A00(ule.A00, shoppingTaggingFeedHeader, ule.A02, A0T, ule.A03, ule.A05);
        }
        return C60340gF.A00;
    }
}
