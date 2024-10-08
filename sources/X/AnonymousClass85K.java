package X;

import android.graphics.drawable.Drawable;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductItemWithAR;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.85K  reason: invalid class name */
public final class AnonymousClass85K {
    public final UserSession A00;
    public final AnonymousClass856 A01;
    public final C3504784u A02;

    public AnonymousClass85K(UserSession userSession, AnonymousClass856 r3, C3504784u r4) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final C371278xv A00(AnonymousClass27H r26, C3505084z r27) {
        List list;
        ArrayList arrayList;
        AnonymousClass87G r5;
        String str;
        ProductItemWithAR productItemWithAR;
        CameraAREffect cameraAREffect;
        C3505084z r2 = r27;
        0qQ.A0B(r2, 0);
        AnonymousClass27H r19 = r26;
        if (r2 instanceof C348117xu) {
            C3504784u r7 = this.A02;
            if (r7 != null) {
                list = Collections.unmodifiableList(r7.A0I);
                0qQ.A07(list);
            } else {
                list = null;
            }
            AnonymousClass856 r4 = this.A01;
            AnonymousClass85D ALx = r4.ALx();
            C348117xu r22 = (C348117xu) r2;
            ArrayList arrayList2 = new ArrayList();
            CameraAREffect cameraAREffect2 = r22.A00;
            if (cameraAREffect2 != null) {
                arrayList2.add(cameraAREffect2);
            }
            List list2 = r22.A03;
            if (list2 != null) {
                arrayList2.addAll(list2);
            }
            arrayList2.addAll(r22.A04);
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(((CameraAREffect) next).A0K)) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!ALx.CmT((CameraAREffect) next2)) {
                    arrayList4.add(next2);
                }
            }
            if (list != null) {
                arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    CameraAREffect cameraAREffect3 = (CameraAREffect) it3.next();
                    if (cameraAREffect3 != null) {
                        hashMap.put(cameraAREffect3.A0K, cameraAREffect3);
                    }
                }
                if (cameraAREffect2 != null) {
                    hashMap.put(cameraAREffect2.A0K, cameraAREffect2);
                }
                for (int i = 1; i < list.size(); i++) {
                    ProductItemWithAR productItemWithAR2 = (ProductItemWithAR) list.get(i);
                    String str2 = productItemWithAR2.A00.A03;
                    if (!(str2 == null || (cameraAREffect = (CameraAREffect) hashMap.get(str2)) == null)) {
                        arrayList.add(C348367yK.A01(cameraAREffect, productItemWithAR2));
                    }
                }
            } else {
                arrayList = C348367yK.A02(AnonymousClass87I.AR_EFFECT, (String) null, arrayList4, false);
            }
            if (list == null || (productItemWithAR = (ProductItemWithAR) 00k.A0O(list, 0)) == null) {
                if (cameraAREffect2 != null) {
                    if (r7 != null) {
                        str = C16910VAn.A00(r7.A04(), false);
                    } else {
                        str = cameraAREffect2.A0S;
                        0qQ.A07(str);
                    }
                    AnonymousClass8YE r10 = new AnonymousClass8YE((Drawable) null, cameraAREffect2, AnonymousClass87I.AR_EFFECT, cameraAREffect2.A07, (ProductItemWithAR) null, (AnonymousClass8YF) null, str, (String) null);
                    r10.A09 = false;
                    r5 = new AnonymousClass87G(r10);
                }
                r5 = null;
            } else {
                if (cameraAREffect2 != null) {
                    r5 = C348367yK.A01(cameraAREffect2, productItemWithAR);
                }
                r5 = null;
            }
            0eP A002 = C348377yL.A00(r19, r5, r4.C9l(), arrayList, r4.Bu9(), r4.Buj());
            return new C371278xv(r5, (List) A002.A00, ((Number) A002.A01).intValue(), r22.A06, r22.A05, r22.A07);
        }
        0sn r222 = 0sn.A00;
        AnonymousClass856 r0 = this.A01;
        return new C371278xv((AnonymousClass87G) null, (List) C348377yL.A00(r19, (AnonymousClass87G) null, r0.C9l(), r222, r0.Bu9(), false).A00, 0, false, false, false);
    }
}
