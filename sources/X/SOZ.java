package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import java.util.Iterator;
import java.util.List;

public final class SOZ {
    public static final SOZ A00 = new Object();

    public static final void A00(Exception exc, String str) {
        0qQ.A0B(str, 1);
        0f9 AEf = 0wj.A01.AEf(str, 817899803);
        if (exc != null) {
            AEf.ERJ(exc);
        }
        AEf.report();
    }

    public final FeatureData A01(String str, List list) {
        List list2 = list;
        0qQ.A0B(list2, 1);
        String str2 = str;
        if (list2.isEmpty()) {
            A00((Exception) null, 002.A0R("Empty list for calculating average value of signals, featureId: ", str2));
            return new FeatureData((Type) null, (String) null, (String) null, (List) null, 0.0d, 16383, 0);
        }
        Type type = Type.DOUBLE;
        Iterator it = list2.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += Pxg.A0H(it);
        }
        return new FeatureData(type, str2, (String) null, (List) null, ((double) j) / ((double) list2.size()), 16372, 0);
    }

    public final FeatureData A02(String str, List list, int i) {
        String str2;
        List list2 = list;
        0qQ.A0B(list2, 2);
        String str3 = str;
        int i2 = i;
        if (!list2.isEmpty()) {
            List A0Z = 00k.A0Z(list2);
            return new FeatureData(Type.LONG, str3, (String) null, (List) null, 0.0d, 16376, Pxg.A0I(A0Z, Pxh.A0C(A0Z, (double) i2) - 1));
        }
        boolean isEmpty = list2.isEmpty();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (isEmpty) {
            str2 = "Empty list for getting value at percentile of signals, featureId: ";
        } else {
            A1A.append("Invalid percentile ");
            A1A.append(i2);
            str2 = ", featureId: ";
        }
        A00((Exception) null, Pxg.A0s(str2, str, A1A));
        return new FeatureData((Type) null, (String) null, (String) null, (List) null, 0.0d, 16383, 0);
    }
}
