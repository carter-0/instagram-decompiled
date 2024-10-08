package X;

import android.os.CancellationSignal;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* renamed from: X.4ZP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4ZP implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Vd A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ List A05;

    public /* synthetic */ AnonymousClass4ZP(UserSession userSession, 1Vd r2, Long l, List list, int i, long j) {
        this.A03 = r2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = l;
        this.A05 = list;
        this.A02 = userSession;
    }

    public final Object invoke(Object obj) {
        CancellationSignal cancellationSignal;
        C251983oI r2;
        Callable callable;
        1Vd r4 = this.A03;
        int i = this.A00;
        long j = this.A01;
        Long l = this.A04;
        List list = this.A05;
        UserSession userSession = this.A02;
        AnonymousClass4D7 r14 = (AnonymousClass4D7) obj;
        if (l != null) {
            boolean A06 = 182.A06(0Tu.A05, userSession, 36328525607026065L);
            long longValue = l.longValue();
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            sb.append("    SELECT *");
            sb.append("\n");
            sb.append("    FROM user_feed_items");
            sb.append("\n");
            sb.append("    WHERE stored_age > ");
            sb.append("?");
            sb.append("\n");
            sb.append("      AND media_age > ");
            sb.append("?");
            sb.append("\n");
            sb.append("      AND item_type IN (");
            int size = list.size();
            1wO.A00(sb, size);
            sb.append(")");
            if (A06) {
                sb.append("\n");
                sb.append("    LIMIT ");
                sb.append("?");
                sb.append("\n");
                sb.append("  ");
                String obj2 = sb.toString();
                int i2 = 3;
                int i3 = size + 3;
                TreeMap treeMap = 1WY.A08;
                1WY A002 = 1Wa.A00(obj2, i3);
                A002.ADa(1, j);
                A002.ADa(2, longValue);
                for (Object next : list) {
                    0qQ.A0B(next, 0);
                    A002.ADh(i2, next.toString());
                    i2++;
                }
                A002.ADa(i3, (long) i);
                cancellationSignal = new CancellationSignal();
                r2 = r4.A01;
                callable = new C41339AsM(A002, r4);
            } else {
                sb.append("\n");
                sb.append("    ORDER BY ranking_weight");
                sb.append("\n");
                sb.append("    DESC LIMIT ");
                sb.append("?");
                sb.append("\n");
                sb.append("  ");
                String obj3 = sb.toString();
                int i4 = 3;
                int i5 = size + 3;
                TreeMap treeMap2 = 1WY.A08;
                1WY A003 = 1Wa.A00(obj3, i5);
                A003.ADa(1, j);
                A003.ADa(2, longValue);
                for (Object next2 : list) {
                    0qQ.A0B(next2, 0);
                    A003.ADh(i4, next2.toString());
                    i4++;
                }
                A003.ADa(i5, (long) i);
                cancellationSignal = new CancellationSignal();
                r2 = r4.A01;
                callable = new AnonymousClass4ZQ(A003, r4);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n");
            sb2.append("    SELECT *");
            sb2.append("\n");
            sb2.append("    FROM user_feed_items");
            sb2.append("\n");
            sb2.append("    WHERE stored_age > ");
            sb2.append("?");
            sb2.append("\n");
            sb2.append("    AND item_type IN (");
            int size2 = list.size();
            1wO.A00(sb2, size2);
            sb2.append(")");
            sb2.append("\n");
            sb2.append("LIMIT ");
            sb2.append("?");
            sb2.append("\n");
            sb2.append("  ");
            String obj4 = sb2.toString();
            int i6 = 2;
            int i7 = size2 + 2;
            TreeMap treeMap3 = 1WY.A08;
            1WY A004 = 1Wa.A00(obj4, i7);
            A004.ADa(1, j);
            for (Object next3 : list) {
                0qQ.A0B(next3, 0);
                A004.ADh(i6, next3.toString());
                i6++;
            }
            A004.ADa(i7, (long) i);
            cancellationSignal = new CancellationSignal();
            r2 = r4.A01;
            callable = new AnonymousClass58Q(A004, r4);
        }
        return 1wR.A00(cancellationSignal, r2, callable, r14, false);
    }
}
