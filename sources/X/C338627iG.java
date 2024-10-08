package X;

import com.facebook.quicklog.MarkerEditor;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7iG  reason: invalid class name and case insensitive filesystem */
public final class C338627iG {
    public static final AtomicInteger A07 = new AtomicInteger(1);
    public int A00;
    public final 02m A01 = 02m.A0p;
    public final 2TT A02;
    public final C338617iF A03;
    public final C2595542d A04;
    public final C3034568w A05;
    public final boolean A06 = 2Kq.A03;

    public static final void A00(MarkerEditor markerEditor, C3254272i r5, String str) {
        StringBuilder sb;
        String str2;
        Long l = r5.A02;
        if (l != null) {
            markerEditor.point(002.A0R(str, "_start"), l.longValue());
        }
        AnonymousClass9IL r3 = r5.A01;
        if (r3 != null) {
            int intValue = ((Number) r3.A02).intValue();
            if (intValue == 0) {
                sb = new StringBuilder();
                sb.append(str);
                str2 = "_success";
            } else if (intValue == 1) {
                sb = new StringBuilder();
                sb.append(str);
                str2 = "_fail";
            } else if (intValue == 2) {
                sb = new StringBuilder();
                sb.append(str);
                str2 = "_cancel";
            } else {
                return;
            }
            sb.append(str2);
            markerEditor.point(sb.toString(), r3.A01);
        }
    }

    public C338627iG(2TT r2, C338617iF r3, C2595542d r4, C3034568w r5) {
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
    }

    public static final void A01(MarkerEditor markerEditor, String str, String str2, List list) {
        Number number;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            AnonymousClass9IL r0 = ((C3254272i) it.next()).A01;
            if (!(r0 == null || (number = (Number) r0.A02) == null)) {
                int intValue = number.intValue();
                if (intValue == 0) {
                    i++;
                } else if (intValue == 1) {
                    i2++;
                } else if (intValue == 2) {
                    i3++;
                }
            }
        }
        markerEditor.annotate(002.A0R(str, "_total"), list.size());
        markerEditor.annotate(002.A0R(str, "_success"), i);
        markerEditor.annotate(002.A0R(str, "_fail"), i2);
        markerEditor.annotate(002.A0R(str, "_cancel"), i3);
        markerEditor.annotate(str2, i + i3);
    }
}
