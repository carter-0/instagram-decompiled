package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Amh  reason: case insensitive filesystem */
public final /* synthetic */ class C40997Amh implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ Product A01;

    public /* synthetic */ C40997Amh(AnonymousClass8BA r1, Product product) {
        this.A00 = r1;
        this.A01 = product;
    }

    public final void run() {
        AnonymousClass8BA r5 = this.A00;
        Product product = this.A01;
        Context A0T = AnonymousClass7TE.A0T(r5);
        float A002 = ((float) AnonymousClass81W.A00(r5.A0z)) * 0.8f;
        int round = Math.round(A002);
        ImageInfo imageInfo = product.A08;
        imageInfo.getClass();
        ExtendedImageUrl A05 = 1iI.A05(imageInfo, AnonymousClass05K.A0C, round);
        C317876nz r0 = C317876nz.A0a;
        ArrayList A1C = AnonymousClass7TE.A1C();
        float f = (float) round;
        String A003 = C273654mx.A00(89);
        A1C.add(C317966o8.A00(A05, A003, A003, f, f, 0.8f));
        C317876nz r6 = new C317876nz(C318046oG.PRODUCT_SHARE, A003, A1C);
        UserSession userSession = r5.A0v;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = r6.A0O.iterator();
        while (it.hasNext()) {
            it.next();
            A1C2.add(new C369568uy(A0T, A05, product, A002));
        }
        if (!A1C2.isEmpty()) {
            C347017w8 r2 = new C347017w8(A0T, userSession, A1C2);
            C39890ADo A004 = C39890ADo.A00();
            A004.A0Q = false;
            AnonymousClass8BG.A00(r2, r6, r5, A004);
            return;
        }
        throw AnonymousClass7TE.A0w("invalid static sticker configuration");
    }
}
