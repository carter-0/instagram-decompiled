package X;

import android.graphics.drawable.Drawable;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.model.shopping.ProductItemWithAR;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7yK  reason: invalid class name and case insensitive filesystem */
public abstract class C348367yK {
    public static AnonymousClass87G A00(CameraAREffect cameraAREffect) {
        CameraAREffect cameraAREffect2 = cameraAREffect;
        if (cameraAREffect == null) {
            0wb.A03("DialElementConverter", "fromAREffect() found null cameraArEffect");
            return AnonymousClass87G.A0T;
        }
        AnonymousClass8YE r1 = new AnonymousClass8YE((Drawable) null, cameraAREffect2, AnonymousClass87I.AR_EFFECT, cameraAREffect.A07, (ProductItemWithAR) null, (AnonymousClass8YF) null, cameraAREffect.A0S, (String) null);
        r1.A09 = false;
        return new AnonymousClass87G(r1);
    }

    public static AnonymousClass87G A01(CameraAREffect cameraAREffect, ProductItemWithAR productItemWithAR) {
        String A00 = C16910VAn.A00(C14502TxO.A00(productItemWithAR.BgJ()), false);
        return new AnonymousClass87G(new AnonymousClass8YE((Drawable) null, cameraAREffect, AnonymousClass87I.AR_EFFECT, cameraAREffect.A07, productItemWithAR, (AnonymousClass8YF) null, A00, (String) null));
    }

    public static ArrayList A02(AnonymousClass87I r13, String str, List list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraAREffect cameraAREffect = (CameraAREffect) it.next();
            if (cameraAREffect == null) {
                0wb.A03("DialElementConverter", "fromAREffects() found null cameraArEffect");
            } else {
                AnonymousClass87I r7 = r13;
                AnonymousClass8YE r4 = new AnonymousClass8YE((Drawable) null, cameraAREffect, r7, cameraAREffect.A07, (ProductItemWithAR) null, (AnonymousClass8YF) null, cameraAREffect.A0S, (String) null);
                r4.A09 = z;
                r4.A0A = cameraAREffect.A0K.equals(str);
                arrayList.add(new AnonymousClass87G(r4));
            }
        }
        return arrayList;
    }
}
