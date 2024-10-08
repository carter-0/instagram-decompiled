package X;

import com.facebook.papaya.hash.DefaultHasher;
import com.facebook.papaya.mldw.DataValue;
import com.facebook.papaya.mldw.Host;
import com.google.common.collect.ImmutableMap;

public final class SNQ {
    public final Host A00;
    public final ImmutableMap A01;
    public final 1sY A02;

    public SNQ(Host host, ImmutableMap immutableMap, 1sY r4) {
        0qQ.A0B(immutableMap, 2);
        this.A00 = host;
        this.A01 = immutableMap;
        this.A02 = r4;
        RWC rwc = DefaultHasher.Companion;
    }

    public static final void A00(SNQ snq, String str, String str2, String str3) {
        1sY r1 = snq.A02;
        if (r1.A01()) {
            r1.A00().Cgo(1, str, str2, str3, true);
        }
    }

    public static final void A01(ImmutableMap.Builder builder, Object obj, String str, String str2) {
        long A0k;
        Long valueOf;
        DataValue dataValue;
        Float f;
        if (obj instanceof String) {
            dataValue = new DataValue((String) obj);
        } else {
            if (obj instanceof Double) {
                DataValue dataValue2 = DataValue.$redex_init_class;
                f = Float.valueOf((float) JTO.A00(obj));
            } else if (obj instanceof Float) {
                f = (Float) obj;
            } else {
                if (obj instanceof Long) {
                    valueOf = (Long) obj;
                } else {
                    if (obj instanceof Integer) {
                        DataValue dataValue3 = DataValue.$redex_init_class;
                        A0k = (long) AnonymousClass7TE.A0M(obj);
                    } else if (obj instanceof Boolean) {
                        DataValue dataValue4 = DataValue.$redex_init_class;
                        A0k = G9t.A0k(AnonymousClass7TE.A1a(obj) ? 1 : 0);
                    } else {
                        0KC.A0O("MldwFederatedAnalyticsLogger", "Event %s has an unsupported property %s", new Object[]{str, str2});
                        return;
                    }
                    valueOf = Long.valueOf(A0k);
                }
                dataValue = new DataValue(valueOf);
            }
            dataValue = new DataValue(f);
        }
        builder.put(str2, dataValue);
    }
}
