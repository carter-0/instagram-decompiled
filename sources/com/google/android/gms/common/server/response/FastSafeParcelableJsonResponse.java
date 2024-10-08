package com.google.android.gms.common.server.response;

import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.SA1;
import X.SJO;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

public abstract class FastSafeParcelableJsonResponse extends SJO implements SafeParcelable {
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (getClass().isInstance(obj)) {
                    SJO sjo = (SJO) obj;
                    Iterator A0v = AnonymousClass7TF.A0v(A05());
                    while (A0v.hasNext()) {
                        FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) A0v.next();
                        boolean A06 = A06(fastJsonResponse$Field);
                        boolean A062 = sjo.A06(fastJsonResponse$Field);
                        if (A06) {
                            if (A062 && SA1.A01(A04(fastJsonResponse$Field), sjo.A04(fastJsonResponse$Field))) {
                            }
                        } else if (A062) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator A0v = AnonymousClass7TF.A0v(A05());
        int i = 0;
        while (A0v.hasNext()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) A0v.next();
            if (A06(fastJsonResponse$Field)) {
                Object A04 = A04(fastJsonResponse$Field);
                AnonymousClass3Qk.A02(A04);
                i = AnonymousClass7TE.A0N(A04, i * 31);
            }
        }
        return i;
    }
}
