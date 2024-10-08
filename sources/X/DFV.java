package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.StickerPackResponseItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class DFV implements AnonymousClass2Kv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ OF0 A02;
    public final /* synthetic */ boolean A03;

    public DFV(OF0 of0, int i, int i2, boolean z) {
        this.A02 = of0;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    public final void invoke(AnonymousClass3JD r16) {
        C250663lr A0U;
        C250663lr A032;
        ImmutableList requiredCompactedTreeListField;
        OF0 of0 = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A03;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (!(r16 == null || (A0U = C41845B3m.A0U(r16)) == null || (A032 = A0U.A03(C42761Bhw.class, "ig_sticker_pack_root_query(first:$number_of_sticker_packs)", -728301347)) == null || (requiredCompactedTreeListField = A032.getRequiredCompactedTreeListField(1, "nodes", C42760Bhv.class, 1042045914)) == null)) {
            Iterator it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                C250663lr A0V = C41845B3m.A0V(it);
                String A0k = C41845B3m.A0k(A0V);
                if (A0k != null) {
                    String A08 = A0V.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    if (A08 == null) {
                        A08 = "";
                    }
                    StickerPackResponseItem stickerPackResponseItem = new StickerPackResponseItem(A0k, A08, A0V.A0A("preview_image(height:$pack_icon_size,width:$pack_icon_size)"), "image/webp");
                    C250663lr optionalTreeField = A0V.getOptionalTreeField(4, "stickers(first:$stickers_per_pack)", C42759Bhu.class, 585193735);
                    if (optionalTreeField != null) {
                        ImmutableList A0X = C41845B3m.A0X(optionalTreeField, C42758Bht.class, "nodes", 1, -1265666345);
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        Iterator it2 = A0X.iterator();
                        while (it2.hasNext()) {
                            C42753Bho bho = (C42753Bho) C41845B3m.A0V(it2).A01(C42753Bho.class, -1559682641);
                            0qQ.A07(bho);
                            DirectStoreSticker A002 = C45892D9v.A00(bho, A0k, i, i2, z);
                            if (A002 != null) {
                                A1C.add(A002);
                            }
                        }
                        A1H.put(stickerPackResponseItem, A1C);
                    }
                }
            }
        }
        of0.A03.invoke(A1H);
    }
}
