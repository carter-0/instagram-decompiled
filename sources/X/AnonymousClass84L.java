package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.ml.imagecrop.ig.IgSmartImageCropController$predictAsync$2;
import java.util.HashMap;

/* renamed from: X.84L  reason: invalid class name */
public final class AnonymousClass84L {
    public final C3502784a A00;
    public final AnonymousClass84M A01;
    public final HashMap A02 = new HashMap();

    public AnonymousClass84L(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A01 = new AnonymousClass84M(context, userSession);
        this.A00 = new C3502784a(new AnonymousClass84N(context, userSession));
    }

    public final Rect A00(String str) {
        0qQ.A0B(str, 0);
        HashMap hashMap = this.A02;
        if (hashMap.containsKey(str)) {
            return (Rect) hashMap.get(str);
        }
        return null;
    }

    public final void A01(String str, C62320sa r13, int i, int i2, int i3) {
        String str2 = str;
        0qQ.A0B(str, 3);
        C62320sa r7 = r13;
        if (this.A02.containsKey(str)) {
            r13.invoke();
            return;
        }
        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(497892810, 3));
        IgSmartImageCropController$predictAsync$2 igSmartImageCropController$predictAsync$2 = new IgSmartImageCropController$predictAsync$2(this, str2, (AnonymousClass4D7) null, r7, i, i2, i3);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, igSmartImageCropController$predictAsync$2, A022);
    }
}
