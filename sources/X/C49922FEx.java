package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.FEx  reason: case insensitive filesystem */
public final class C49922FEx {
    public final Bundle A00 = AnonymousClass7TE.A0a();

    public final void A02() {
        this.A00.putBoolean(DbX.A0s(C48071EUp.A0C), true);
    }

    public static C49922FEx A00(Bundle bundle) {
        C49922FEx fEx = new C49922FEx();
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                C48071EUp[] values = C48071EUp.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C48071EUp eUp = values[i];
                    if (eUp.name().equals(A18.toUpperCase(Locale.US))) {
                        Class<List> cls = eUp.A00;
                        if (cls == String.class) {
                            Bundle bundle2 = fEx.A00;
                            String A0s = DbX.A0s(eUp);
                            bundle2.putString(A0s, bundle.getString(A0s));
                        } else if (cls == Boolean.class) {
                            Bundle bundle3 = fEx.A00;
                            String A0s2 = DbX.A0s(eUp);
                            bundle3.putBoolean(A0s2, bundle.getBoolean(A0s2));
                        } else if (cls == Integer.class) {
                            Bundle bundle4 = fEx.A00;
                            String A0s3 = DbX.A0s(eUp);
                            bundle4.putInt(A0s3, bundle.getInt(A0s3));
                        } else if (cls == List.class) {
                            Bundle bundle5 = fEx.A00;
                            String A0s4 = DbX.A0s(eUp);
                            bundle5.putStringArrayList(A0s4, bundle.getStringArrayList(A0s4));
                        } else {
                            throw AnonymousClass7TE.A0z("Attempted to add an extra value of an unrecognizable type.");
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        return fEx;
    }

    public static void A01(0Aj r2, C47476E4a e4a) {
        r2.AAe("cp_recovery_options", e4a.A0A);
        r2.AAJ("cp_type_given", e4a.A06.A00.getString(C48071EUp.A06.A00()));
        r2.A9F("cps_available_to_choose", Long.valueOf((long) e4a.A0A.size()));
    }

    public final void A03(0xI r10) {
        Bundle bundle = this.A00;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            C48071EUp[] values = C48071EUp.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C48071EUp eUp = values[i];
                if (eUp.name().equals(A18.toUpperCase(Locale.US))) {
                    Class<List> cls = eUp.A00;
                    if (cls == String.class) {
                        String A0s = DbX.A0s(eUp);
                        r10.A0C(A0s, bundle.getString(A0s));
                    } else if (cls == Boolean.class) {
                        String A0s2 = DbX.A0s(eUp);
                        r10.A09(A0s2, DbU.A0g(bundle, A0s2));
                    } else if (cls == Integer.class) {
                        String A0s3 = DbX.A0s(eUp);
                        r10.A08(DbV.A0o(bundle, A0s3), A0s3);
                    } else if (cls == List.class) {
                        String A0s4 = DbX.A0s(eUp);
                        r10.A0D(A0s4, bundle.getStringArrayList(A0s4));
                    } else {
                        throw AnonymousClass7TE.A0z("Attempted to add an extra value of an unrecognizable type.");
                    }
                } else {
                    i++;
                }
            }
        }
    }
}
