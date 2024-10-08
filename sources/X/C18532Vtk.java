package X;

import android.content.Context;
import android.util.Patterns;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vtk  reason: case insensitive filesystem */
public final class C18532Vtk {
    public static final C18532Vtk A00 = new Object();

    public final boolean A00(Context context, LeadGenFormBaseQuestion leadGenFormBaseQuestion, List list, boolean z, boolean z2) {
        Object obj;
        List list2;
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        String str = leadGenFormBaseQuestion.A00;
        C16644Uyg uyg = (C16644Uyg) EnumHelper.A00(leadGenFormBaseQuestion.A08, C16644Uyg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (uyg != C16644Uyg.EMAIL) {
            V4Q A002 = Ri5.A00(uyg);
            if (A002 == null) {
                switch (leadGenFormBaseQuestion.A03.ordinal()) {
                    case 4:
                    case 23:
                        break;
                    case 5:
                    case 22:
                        if (z2 && context != null) {
                            if (!DbV.A1b(str, Patterns.PHONE)) {
                                return false;
                            }
                            PhoneNumberUtil A01 = PhoneNumberUtil.A01(context);
                            try {
                                C3259474u A0F = A01.A0F(str, (String) null);
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = it.next();
                                        if (PhoneNumberUtil.A01(context).A0A(((C61076JwE) obj).A01) == A0F.A00) {
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                C61076JwE jwE = (C61076JwE) obj;
                                if (!(jwE == null || (list2 = (List) jwE.A00) == null)) {
                                    if (!list2.isEmpty()) {
                                        Iterator it2 = list2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                Object next = it2.next();
                                                if (00p.A0k(String.valueOf(A0F.A02), (String) next, false)) {
                                                    if (next != null) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return A01.A0N(A0F);
                            } catch (C231962sh unused) {
                                return false;
                            }
                        }
                        break;
                    case 13:
                    case 14:
                    case 15:
                        if (!z) {
                            return !0mp.A0A(str);
                        }
                        break;
                    default:
                        return true;
                }
            } else if (A002.A00(str) == AnonymousClass05K.A00) {
                return true;
            } else {
                return false;
            }
            return true;
        }
        return C48946Emk.A00(str);
    }
}
