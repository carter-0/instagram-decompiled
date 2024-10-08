package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.77w  reason: invalid class name and case insensitive filesystem */
public final class C3267177w {
    public static final C3267177w A00 = new Object();

    public final boolean A03(C254703su r7) {
        AnonymousClass9JH A0F;
        List list;
        Object obj;
        Boolean bool;
        String A01 = A01(r7);
        if (A01 == null || (A0F = r7.A0F()) == null || (list = (List) A0F.A00) == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            GSY gsy = (GSY) obj;
            if (0qQ.A0K(gsy.A03, A01) && gsy.A02 != null) {
                break;
            }
        }
        GSY gsy2 = (GSY) obj;
        if (gsy2 == null || (bool = (Boolean) gsy2.A00) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean A04(C254703su r7) {
        AnonymousClass9JH A0F;
        List list;
        Object obj;
        Boolean bool;
        String A01 = A01(r7);
        if (A01 == null || (A0F = r7.A0F()) == null || (list = (List) A0F.A00) == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            GSY gsy = (GSY) obj;
            if (0qQ.A0K(gsy.A03, A01) && gsy.A02 != null) {
                break;
            }
        }
        GSY gsy2 = (GSY) obj;
        if (gsy2 == null || (bool = (Boolean) gsy2.A01) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final String A00(Context context, C254703su r4) {
        Object obj;
        C254873tC r1;
        ExtendedImageUrl extendedImageUrl;
        List list;
        String A35;
        1Xj r0 = r4.A0s;
        if (r0 != null && (A35 = r0.A35(context)) != null) {
            return A35;
        }
        Object obj2 = r4.A1T;
        if (!(obj2 instanceof List) || (list = (List) obj2) == null) {
            obj = null;
        } else {
            obj = 00k.A0J(list);
        }
        if (!(obj instanceof C254873tC) || (r1 = (C254873tC) obj) == null || (extendedImageUrl = r1.A0X) == null) {
            return null;
        }
        return extendedImageUrl.A0A;
    }

    public static final String A01(C254703su r4) {
        Object obj;
        C254873tC r1;
        List list;
        1Xj r3 = r4.A0s;
        if (r3 != null) {
            if (r3.BR7() == 1iA.A0Q) {
                return r3.getId();
            }
            return null;
        } else if (r4.A10 != 2FW.A0y) {
            return null;
        } else {
            Object obj2 = r4.A1T;
            if (!(obj2 instanceof List) || (list = (List) obj2) == null) {
                obj = null;
            } else {
                obj = 00k.A0J(list);
            }
            if ((obj instanceof C254873tC) && (r1 = (C254873tC) obj) != null && !r1.A1i && r1.A08 == 0 && r1.A0Z == null && r1.A1N == null && r1.A1L == null) {
                return String.valueOf(r1.A0K);
            }
            return null;
        }
    }

    public static final String A02(C254703su r3, String str) {
        List list;
        Object obj;
        AnonymousClass9JH A0F = r3.A0F();
        if (A0F == null || (list = (List) A0F.A00) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((GSY) obj).A03, str)) {
                break;
            }
        }
        GSY gsy = (GSY) obj;
        if (gsy != null) {
            return gsy.A02;
        }
        return null;
    }
}
