package X;

import android.net.Uri;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7CR  reason: invalid class name */
public final class AnonymousClass7CR {
    public final boolean A03(C254703su r5) {
        ImmutableList A0H = r5.A0H();
        if (A0H == null || A0H.isEmpty()) {
            A00();
        } else {
            String str = ((C254873tC) 00k.A0I(A0H)).A0u;
            if (str != null) {
                Uri A03 = 0cp.A03(str);
                0qQ.A07(A03);
                String queryParameter = A03.getQueryParameter("collection_type");
                if (0qQ.A0K(queryParameter, "challenges") || (0qQ.A0K(queryParameter, "daily_prompt") && ((C254873tC) 00k.A0I(A0H)).A02 == 8)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean A04(C254703su r5) {
        ImmutableList A0H = r5.A0H();
        if (A0H == null || A0H.isEmpty()) {
            A00();
            return false;
        } else if (((C254873tC) A0H.get(0)).A02 == 8) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A05(C254703su r6) {
        ImmutableList A0H = r6.A0H();
        if (A0H == null || A0H.isEmpty()) {
            A00();
            return false;
        } else if (((C254873tC) A0H.get(0)).A02 != 11 || C254873tC.A00((C254873tC) A0H.get(0))) {
            return false;
        } else {
            return true;
        }
    }

    public static final void A00() {
        0wj.A01.AEf("Xma items should not be null", 20134884).report();
    }

    public static final boolean A01(C254703su r3) {
        ImmutableList A0H = r3.A0H();
        if (A0H == null || A0H.isEmpty()) {
            A00();
            return false;
        } else if (((C254873tC) A0H.get(0)).A02 == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean A02(C254703su r5) {
        ImmutableList A0H = r5.A0H();
        if (A0H == null || A0H.isEmpty()) {
            A00();
            return false;
        } else if ((A0H.size() == 1 || ((C254873tC) A0H.get(0)).A02 == 9 || C254873tC.A00((C254873tC) A0H.get(0))) && !r5.CRd()) {
            return true;
        } else {
            return false;
        }
    }
}
