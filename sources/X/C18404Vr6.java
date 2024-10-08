package X;

import android.app.Activity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Vr6  reason: case insensitive filesystem */
public abstract class C18404Vr6 {
    public static final Map A00;
    public static final Map A01;

    static {
        Integer A0R = C13988Tno.A0R();
        0eP r3 = new 0eP(A0R, "android.permission.GET_ACCOUNTS");
        Integer A0q = C66580MXl.A0q();
        A01 = DbY.A0q(3, "android.permission.READ_PHONE_STATE", r3, new 0eP(A0q, "android.permission.READ_CONTACTS"));
        A00 = 0Yt.A06(AnonymousClass7TH.A0h(4, "android.permission.READ_PHONE_NUMBERS", new 0eP(A0R, "android.permission.GET_ACCOUNTS"), new 0eP(A0q, "android.permission.READ_CONTACTS"), new 0eP(3, "android.permission.READ_PHONE_STATE")));
    }

    public static final Boolean A00(C307896Rx r6, AnonymousClass6Tm r7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) r7.A03(0)).iterator();
        while (it.hasNext()) {
            Object A10 = C51968G9o.A10(A00, AnonymousClass7TG.A0F(it));
            if (A10 != null) {
                arrayList.add(A10);
            }
        }
        String[] A1a = Pxf.A1a(arrayList, 0);
        C277014uI r3 = ((C280064zw) r7.A02()).A00;
        C307786Rm r0 = r6.A03;
        if (r0 == null) {
            return false;
        }
        Activity activity = (Activity) r0.A00;
        Activity parent = activity.getParent();
        if (parent != null) {
            activity = parent;
        }
        C13990Tnq.A0k(activity, new C19254WRn(0, r6, r3, new ArrayList()), A1a, A1a.length);
        return null;
    }
}
