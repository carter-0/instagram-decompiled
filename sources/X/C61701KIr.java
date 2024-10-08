package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.stickersearch.AvatarStickerInteractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KIr  reason: case insensitive filesystem */
public final class C61701KIr extends 0ng {
    public final /* synthetic */ AvatarStickerInteractor A00;
    public final /* synthetic */ C61294K1h A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61701KIr(AvatarStickerInteractor avatarStickerInteractor, C61294K1h k1h) {
        super(957285725, 3, false, false);
        this.A01 = k1h;
        this.A00 = avatarStickerInteractor;
    }

    public final void run() {
        C61294K1h k1h = this.A01;
        List list = k1h.A08;
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ImageUrl imageUrl = JTO.A0a(it).A0H;
                0qQ.A07(imageUrl);
                Long A002 = C63449KxE.A00(imageUrl);
                if (A002 != null) {
                    A1C.add(A002);
                }
            }
            Number number = (Number) 00k.A06(A1C);
            if (number != null) {
                AvatarStickerInteractor avatarStickerInteractor = this.A00;
                long longValue = number.longValue();
                C318056oJ r0 = avatarStickerInteractor.A03;
                String str = k1h.A07;
                if (str == null) {
                    str = "";
                }
                0xY AR4 = r0.A01.A00.AR4();
                AR4.E5c(002.A0R("KEY_AVATAR_CDN_EXPIRY", str), longValue);
                AR4.apply();
            }
        }
    }
}
