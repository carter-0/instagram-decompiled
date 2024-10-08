package X;

import android.os.Bundle;

/* renamed from: X.3RZ  reason: invalid class name */
public abstract class AnonymousClass3RZ {
    public static final AnonymousClass3RZ A00 = new C241763Rc();
    public static final AnonymousClass3RZ A01 = new C241753Rb();
    public static final AnonymousClass3RZ A02 = new C241773Rd();
    public static final AnonymousClass3RZ A03 = new C241743Ra();

    public final void A01(Bundle bundle, C13849TiS tiS, String str, String str2) {
        Object string;
        try {
            if (this instanceof C241773Rd) {
                string = Long.valueOf(bundle.getLong(str, Long.MAX_VALUE));
            } else if (this instanceof C241763Rc) {
                string = Boolean.valueOf(bundle.getBoolean(str, false));
            } else if (this instanceof C241753Rb) {
                string = Integer.valueOf(bundle.getInt(str, 0));
            } else {
                string = bundle.getString(str, (String) null);
            }
            A03(tiS, string, str2);
        } catch (ClassCastException e) {
            0KC.A0F(Pxd.A00(522), "bundleToPreferences got ClassCastException", e);
        }
    }

    public Class A00() {
        return Long.class;
    }

    public void A02(Bundle bundle, Object obj, String str) {
        bundle.putLong(str, ((Number) obj).longValue());
    }

    public final void A03(C13849TiS tiS, Object obj, String str) {
        if (this instanceof C241773Rd) {
            tiS.E5a(str, ((Number) obj).longValue());
        } else if (this instanceof C241763Rc) {
            tiS.E5R(str, ((Boolean) obj).booleanValue());
        } else if (this instanceof C241753Rb) {
            tiS.E5X(str, ((Number) obj).intValue());
        } else {
            tiS.E5e(str, (String) obj);
        }
    }

    public final void A04(C13574Tcz tcz, AnonymousClass45J r5, Object obj, String str) {
        Object string;
        int intValue;
        boolean booleanValue;
        long longValue;
        if (this instanceof C241773Rd) {
            Number number = (Number) obj;
            if (number == null) {
                longValue = Long.MAX_VALUE;
            } else {
                longValue = number.longValue();
            }
            0qQ.A0B(str, 0);
            string = Long.valueOf(((AnonymousClass45I) r5).getLong(str, longValue));
        } else if (this instanceof C241763Rc) {
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            0qQ.A0B(str, 0);
            string = Boolean.valueOf(((AnonymousClass45I) r5).getBoolean(str, booleanValue));
        } else if (this instanceof C241753Rb) {
            Number number2 = (Number) obj;
            if (number2 == null) {
                intValue = 0;
            } else {
                intValue = number2.intValue();
            }
            0qQ.A0B(str, 0);
            string = Integer.valueOf(((AnonymousClass45I) r5).getInt(str, intValue));
        } else {
            String str2 = (String) obj;
            0qQ.A0B(str, 0);
            0qQ.A0B(str2, 1);
            string = ((AnonymousClass45I) r5).getString(str, str2);
        }
        tcz.onResult(string);
    }
}
