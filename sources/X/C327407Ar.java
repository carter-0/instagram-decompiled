package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.7Ar  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327407Ar implements C327387Ao {
    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r8, AnonymousClass7LQ r9, AnonymousClass7L2 r10) {
        C254703su r2 = r9.A0e;
        DirectStoreSticker directStoreSticker = (DirectStoreSticker) r2.A1T;
        if (directStoreSticker != null) {
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            0qQ.A0B(context, 0);
            0qQ.A0B(userSession, 1);
            0qQ.A0B(r8, 4);
            return new NYT(AnonymousClass7FG.A00(context, userSession, r8, r9, r2.A10), directStoreSticker.A00, directStoreSticker.A02, false);
        }
        0wb.A03("store_sticker_reply", "Got a store sticker reply type without media information");
        throw new IllegalStateException("Got a store sticker reply type without media information");
    }
}
