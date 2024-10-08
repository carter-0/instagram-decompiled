package com.facebook.common.locale;

import X.002;
import X.C11179SEf;
import X.C376409Hw;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

public class Country extends LocaleMember {
    public static final Country A00 = A00((Country) null, "IN");
    public static final Country A01 = A00((Country) null, "US");
    public static final C11179SEf A02 = new C11179SEf();
    public static final Parcelable.Creator CREATOR = new C376409Hw(25);

    public static Country A00(Country country, String str) {
        IllegalArgumentException illegalArgumentException;
        LocaleMember localeMember;
        try {
            C11179SEf sEf = A02;
            if (str != null) {
                int length = str.length();
                if (length == 2) {
                    localeMember = C11179SEf.A00(sEf, str);
                } else if (length == 3) {
                    Object obj = sEf.A00.get();
                    obj.getClass();
                    localeMember = (LocaleMember) ((ImmutableMap) obj).get(str);
                    if (localeMember == null) {
                        illegalArgumentException = new IllegalArgumentException(002.A0R("Not a legal code: ", str));
                        throw illegalArgumentException;
                    }
                }
                return (Country) localeMember;
            }
            illegalArgumentException = new IllegalArgumentException(002.A0R("Not a legal code: ", str));
            throw illegalArgumentException;
        } catch (IllegalArgumentException e) {
            if (country != null) {
                return country;
            }
            throw e;
        }
    }
}
