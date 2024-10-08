package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.StickerPack;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.DFa  reason: case insensitive filesystem */
public final class C45920DFa implements AnonymousClass2Kv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ OBW A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ boolean A05;

    public C45920DFa(OBW obw, 0sP r2, 0sP r3, int i, int i2, boolean z) {
        this.A02 = obw;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A04 = r2;
        this.A03 = r3;
    }

    public final void invoke(AnonymousClass3JD r16) {
        C250663lr optionalTreeField;
        String optionalStringField;
        ArrayList arrayList;
        ImmutableList requiredCompactedTreeListField;
        0qQ.A0A(r16);
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A05;
        C250663lr A0U = C41845B3m.A0U(r16);
        if (A0U == null || (optionalTreeField = A0U.getOptionalTreeField(0, "fetch__XIGStickerStorePack(id:$id)", C42756Bhr.class, -1832187948)) == null || (optionalStringField = optionalTreeField.getOptionalStringField(0, "strong_id__")) == null) {
            this.A03.invoke(new Throwable("Sticker pack is null"));
            return;
        }
        C250663lr optionalTreeField2 = optionalTreeField.getOptionalTreeField(5, "stickers", C42755Bhq.class, 695599951);
        if (optionalTreeField2 == null || (requiredCompactedTreeListField = optionalTreeField2.getRequiredCompactedTreeListField(1, "nodes", C42754Bhp.class, 1319341)) == null) {
            arrayList = 0sn.A00;
        } else {
            arrayList = AnonymousClass7TE.A1C();
            Iterator it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                DirectStoreSticker A002 = C45892D9v.A00((C42753Bho) C41845B3m.A0V(it).reinterpretRequired(0, C42753Bho.class, -1559682641), optionalStringField, i, i2, z);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
        }
        String A08 = optionalTreeField.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (A08 == null) {
            A08 = "";
        }
        this.A04.invoke(new StickerPack(optionalStringField, A08, optionalTreeField.A09(DevServerEntity.COLUMN_DESCRIPTION), optionalTreeField.A0B("preview_image(height:$pack_icon_size,width:$pack_icon_size)"), arrayList));
    }
}
