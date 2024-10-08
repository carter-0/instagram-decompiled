package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4Ws  reason: invalid class name and case insensitive filesystem */
public abstract class C265894Ws {
    public static boolean A03(C19471WaJ waJ) {
        int A00;
        List<C21026XAf> list;
        if (waJ == null || (A00 = waJ.A00()) == -1 || (list = waJ.A02.A0B) == null || A00 >= list.size()) {
            return false;
        }
        int i = 0;
        for (C21026XAf text : list) {
            if (!TextUtils.isEmpty(text.getText())) {
                i++;
            }
        }
        return i >= 2;
    }

    public static C255783ui A00(C249693kD r1) {
        List Bkd = r1.Bkd(AnonymousClass3WT.QUIZ);
        if (Bkd == null || Bkd.isEmpty()) {
            return null;
        }
        return (C255783ui) Bkd.get(0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.Cvy] */
    public static void A02(UserSession userSession, C19471WaJ waJ, String str, String str2, String str3, String str4, int i) {
        String str5 = waJ.A02.A08;
        if (str5 == null) {
            str5 = "";
        }
        ? obj = new Object();
        obj.A03 = str;
        obj.A04 = str5;
        obj.A00 = i;
        obj.A01 = System.currentTimeMillis();
        obj.A05 = str2;
        obj.A02 = str3;
        obj.A06 = str4;
        C225952fD A00 = C225952fD.A00(userSession);
        A00.A0D(C225952fD.A01(obj), obj);
        1OC A002 = C44997Coa.A00(userSession, obj);
        A002.A00 = new C15580Uf8(obj, A00);
        1ES.A03(A002);
    }

    public static C19471WaJ A01(C249693kD r1) {
        UNZ unz;
        C255783ui A00 = A00(r1);
        if (A00 == null || (unz = A00.A0a) == null) {
            return null;
        }
        return new C19471WaJ(unz);
    }
}
