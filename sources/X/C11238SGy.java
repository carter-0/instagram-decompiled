package X;

import android.content.Context;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SGy  reason: case insensitive filesystem */
public final class C11238SGy {
    public static final SI1 A02 = new Object();
    public final Context A00;
    public final String A01;

    public C11238SGy(Context context, String str) {
        0qQ.A0B(str, 2);
        this.A00 = context;
        this.A01 = str;
    }

    public final ArrayList A00(Map map) {
        StringBuilder A16;
        Object obj;
        HashMap A0r = Pxf.A0r(map, 0);
        Iterator A15 = Pxg.A15(TelephoneAutofillData.A01);
        while (A15.hasNext()) {
            Object next = A15.next();
            0sn A13 = C66580MXl.A13(next, map);
            if (A13 == null) {
                A13 = 0sn.A00;
            }
            if (A13.isEmpty()) {
                obj = null;
            } else {
                obj = A13.get(0);
            }
            if (obj != null) {
                A0r.put(next, obj);
            }
        }
        String A0r2 = DbS.A0r("tel", A0r);
        if (A0r2 == null) {
            String A0r3 = DbS.A0r("tel-country-code", A0r);
            if (A0r3 == null) {
                A16 = AnonymousClass7TE.A1A();
            } else {
                String A012 = new 11S("0*").A01(A0r3, "");
                if (A012.length() != 0 && !C66580MXl.A1a("+", 1, A012)) {
                    A012 = 002.A0D(A012, '+');
                }
                A16 = Pxe.A16(A012);
            }
            String A0r4 = DbS.A0r("tel-national", A0r);
            if (A0r4 == null) {
                String A0r5 = DbS.A0r("tel-area-code", A0r);
                A0r4 = DbS.A0r("tel-local", A0r);
                if (A0r5 == null || A0r4 == null) {
                    String A0r6 = DbS.A0r("tel-local-prefix", A0r);
                    A0r4 = DbS.A0r("tel-local-suffix", A0r);
                    if (!(A0r5 == null || A0r6 == null || A0r4 == null)) {
                        A16.append(A0r5);
                        A16.append(A0r6);
                    }
                    A0r2 = DbT.A10(A16);
                } else {
                    A16.append(A0r5);
                }
            }
            A16.append(A0r4);
            A0r2 = DbT.A10(A16);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        PhoneNumberUtil A013 = PhoneNumberUtil.A01(this.A00);
        0qQ.A07(A013);
        String str = this.A01;
        TelephoneAutofillData telephoneAutofillData = null;
        if (!AnonymousClass7TF.A1Q(A0r2.length())) {
            try {
                C3259474u A0F = A013.A0F(A0r2, str);
                HashMap A1E = AnonymousClass7TE.A1E();
                String A0I = A013.A0I(A0F, AnonymousClass05K.A00);
                String valueOf = String.valueOf(A0F.A02);
                A1E.put("tel", A0I);
                A1E.put("tel-country-code", String.valueOf(A0F.A00));
                A1E.put("tel-national", valueOf);
                if (!(!str.equals(A013.A00.A01(A0F.A00)))) {
                    A0I = valueOf;
                }
                telephoneAutofillData = new TelephoneAutofillData(A1E, A0I);
            } catch (C231962sh unused) {
            }
        }
        if (telephoneAutofillData != null) {
            A1C.add(telephoneAutofillData);
        }
        return A1C;
    }
}
