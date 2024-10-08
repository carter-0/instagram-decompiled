package X;

import android.content.ContentProviderClient;
import android.database.Cursor;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.8s2  reason: invalid class name and case insensitive filesystem */
public final class C368078s2 {
    public static final Map A00 = Collections.unmodifiableMap(new C368088s3());

    public final ArrayList A01(ContentProviderClient contentProviderClient, String str, String str2, C368148s9 r22, C368238sI r23, C368188sD r24) {
        String str3 = str2;
        0qQ.A0B(str3, 5);
        C368148s9 r10 = r22;
        C368238sI r6 = r23;
        C368188sD r11 = r24;
        Cursor A002 = A00(contentProviderClient, r6, AnonymousClass05K.A00, str, str3, r10, r11);
        if (A002 != null) {
            ArrayList arrayList = new ArrayList();
            C368098s4 r3 = r10.A04;
            C376069Gk r2 = (C376069Gk) C376039Gh.A00.get(r3);
            if (r2 == null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't find corresponding transformer for SsoSource =");
                    sb.append(r3);
                    throw new RuntimeException(sb.toString());
                } catch (C369078tn e) {
                    r11.A03(AnonymousClass05K.A1I, C368228sH.A00(r3).name(), r6.name(), r11.A01("resolver_name", "LEGACY_PROVIDER", TraceFieldType.FailureReason, e.getMessage(), "instance_key", str3));
                    A002.close();
                } catch (Throwable th) {
                    A002.close();
                    throw th;
                }
            } else {
                while (A002.moveToNext()) {
                    C376119Gp FHh = r2.FHh(A002);
                    if (FHh != null) {
                        arrayList.add(new C376139Gr(r10, FHh));
                    }
                }
                A002.close();
                return arrayList;
            }
        }
        return new ArrayList();
    }

    public final ArrayList A02(ContentProviderClient contentProviderClient, String str, C368148s9 r21, C368238sI r22, C368188sD r23) {
        String str2 = str;
        0qQ.A0B(str2, 5);
        C368148s9 r10 = r21;
        C368238sI r6 = r22;
        C368188sD r11 = r23;
        Cursor A002 = A00(contentProviderClient, r6, AnonymousClass05K.A00, (String) null, str2, r10, r11);
        if (A002 != null) {
            ArrayList arrayList = new ArrayList();
            C368098s4 r2 = r10.A04;
            C376069Gk r1 = (C376069Gk) C376039Gh.A00.get(r2);
            if (r1 == null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't find corresponding transformer for SsoSource =");
                    sb.append(r2);
                    throw new RuntimeException(sb.toString());
                } catch (C369078tn e) {
                    r11.A03(AnonymousClass05K.A1I, C368228sH.A00(r2).name(), r6.name(), r11.A01("resolver_name", "LEGACY_PROVIDER", TraceFieldType.FailureReason, e.getMessage(), "instance_key", str2));
                    A002.close();
                } catch (Throwable th) {
                    A002.close();
                    throw th;
                }
            } else {
                while (A002.moveToNext()) {
                    F3S FHl = r1.FHl(A002, r6);
                    if (FHl != null) {
                        arrayList.add(FHl);
                    }
                }
                A002.close();
                return arrayList;
            }
        }
        return new ArrayList();
    }

    public static final Cursor A00(ContentProviderClient contentProviderClient, Enum enumR, Integer num, String str, String str2, C368148s9 r19, C368188sD r20) {
        String str3;
        C368148s9 r1 = r19;
        C368128s7 r0 = r1.A03;
        if (r0 != null) {
            String str4 = str2;
            try {
                return contentProviderClient.query(r1.A00, r0.A02, r0.A01, new String[]{str, str4}, (String) null);
            } catch (IllegalArgumentException | NullPointerException | UnsupportedOperationException e) {
                if (enumR instanceof C368238sI) {
                    String name = C368228sH.A00(r1.A04).name();
                    String name2 = ((C368238sI) enumR).name();
                    Integer num2 = AnonymousClass05K.A02;
                    if (num.intValue() != 0) {
                        str3 = "LITE_PROVIDER";
                    } else {
                        str3 = "LEGACY_PROVIDER";
                    }
                    C368188sD r4 = r20;
                    r4.A03(num2, name, name2, r4.A01("resolver_name", str3, TraceFieldType.FailureReason, e.getMessage(), "instance_key", str4));
                    return null;
                }
            }
        }
        return null;
    }
}
