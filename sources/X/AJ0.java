package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated(message = "")
public final class AJ0 {
    public static final AJ0 A00 = new Object();

    @Deprecated(message = "")
    public static final List A01(Context context, 0lg r5, String str, String str2, String str3) {
        0lg r1 = r5;
        0qQ.A0B(r5, 1);
        return A03(context, r1, str, str2, str3, 0sc.A06(new C368098s4[]{C368098s4.FACEBOOK}));
    }

    @Deprecated(message = "")
    public static final ArrayList A00(Context context, 0lg r6, String str, String str2, String str3, C368098s4 r10) {
        Integer num;
        Integer num2;
        C368198sE r1 = new C368198sE(r6, str3);
        C368208sF r3 = new C368208sF(r6);
        C368058s0 r0 = new C368058s0();
        r0.A03 = r1;
        r0.A04 = r3;
        C368218sG r2 = new C368218sG(r0);
        if (A04(str, str2, r1)) {
            return C368218sG.A01(context, str, Collections.singletonList(r10), r2);
        }
        String name = r10.name();
        String A03 = 0yU.A03(C63130yM.A00(18861911521099869L));
        if (A03 == null || 00l.A0W(A03)) {
            num = AnonymousClass05K.A04;
        } else {
            num = AnonymousClass05K.A03;
        }
        r3.A08(name, num, "ACTIVE_ACCOUNT");
        String A032 = 0yU.A03(C63130yM.A00(18861911521099869L));
        if (A032 == null || 00l.A0W(A032)) {
            num2 = AnonymousClass05K.A04;
        } else {
            num2 = AnonymousClass05K.A03;
        }
        r3.A08(name, num2, "SAVED_ACCOUNT");
        r2.A04.CtA(str);
        return AnonymousClass7TE.A1C();
    }

    @Deprecated(message = "")
    public static final List A02(Context context, 0lg r7, String str, String str2, String str3) {
        return A03(context, r7, str, str2, str3, 0sc.A06(new C368098s4[]{C368098s4.MESSENGER}));
    }

    @Deprecated(message = "")
    public static final List A03(Context context, 0lg r11, String str, String str2, String str3, Set set) {
        Integer num;
        C368198sE r1 = new C368198sE(r11, str3);
        C368208sF r5 = new C368208sF(r11);
        C368058s0 r0 = new C368058s0();
        r0.A03 = r1;
        r0.A04 = r5;
        C368218sG r9 = new C368218sG(r0);
        String str4 = str;
        if (!A04(str, str2, r1)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String name = ((C368098s4) it.next()).name();
                String A03 = 0yU.A03(C63130yM.A00(18861911521099869L));
                if (A03 == null || 00l.A0W(A03)) {
                    num = AnonymousClass05K.A04;
                } else {
                    num = AnonymousClass05K.A03;
                }
                r5.A08(name, num, "ACTIVE_ACCOUNT");
            }
            r9.A04.CtA(str);
            return 0sn.A00;
        }
        String A0c = AnonymousClass7TF.A0c();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C368148s9 A02 : r9.A06.A00(set)) {
            C368218sG.A02(context, A0c, str4, A1C, A02, r9);
        }
        List unmodifiableList = Collections.unmodifiableList(A1C);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public static final boolean A04(String str, String str2, C368198sE r9) {
        String str3;
        int i;
        if (0yU.A07(C63130yM.A00(18298961567745950L))) {
            if (00l.A0W(str)) {
                return false;
            }
            if (0yU.A07(C63130yM.A00(18298961568139168L))) {
                String A03 = 0yU.A03(C63130yM.A00(18861911521624162L));
                Integer num = AnonymousClass05K.A00;
                0qQ.A0B(A03, 1);
                try {
                    JSONObject jSONObject = C299905wC.A01.A00((C299885wA) null, num, A03, str, str2).getJSONObject(String.valueOf(0));
                    Object obj = (Enum) C299915wD.A02.A00.get(str);
                    if (obj == null) {
                        obj = C299915wD.A3q;
                    }
                    if (jSONObject.has(String.valueOf(((C299915wD) obj).A00))) {
                        return true;
                    }
                } catch (NullPointerException e) {
                    e = e;
                    str3 = "NullPointerException";
                    0KC.A0F("AccessControlRuleV2", str3, e);
                    r9.CtA(str);
                    return false;
                } catch (JSONException e2) {
                    e = e2;
                    i = 2336;
                    str3 = AnonymousClass000.A00(i);
                    0KC.A0F("AccessControlRuleV2", str3, e);
                    r9.CtA(str);
                    return false;
                } catch (Exception e3) {
                    e = e3;
                    i = 2260;
                    str3 = AnonymousClass000.A00(i);
                    0KC.A0F("AccessControlRuleV2", str3, e);
                    r9.CtA(str);
                    return false;
                }
                r9.CtA(str);
                return false;
            }
            String A032 = 0yU.A03(C63130yM.A00(18861911521099869L));
            if (A032 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(A032);
                    int length = jSONArray.length();
                    int i2 = 0;
                    while (i2 < length) {
                        if (!str.equals(jSONArray.getString(i2))) {
                            i2++;
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            r9.CtA(str);
            return false;
        }
        return true;
    }
}
