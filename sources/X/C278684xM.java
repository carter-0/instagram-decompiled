package X;

import java.util.concurrent.Callable;

/* renamed from: X.4xM  reason: invalid class name and case insensitive filesystem */
public final class C278684xM implements Callable {
    public final /* synthetic */ AnonymousClass2Or A00;

    public C278684xM(AnonymousClass2Or r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        AnonymousClass2PL r7 = AnonymousClass2PL.A06;
        if (r7 == null) {
            return null;
        }
        synchronized (r7) {
            StringBuilder sb = new StringBuilder();
            sb.append("cur:");
            sb.append(r7.A03.A01);
            sb.append(",");
            for (AnonymousClass2PQ r5 : r7.A04.values()) {
                long j = r5.A01;
                if (j > 0) {
                    sb.append(r5.A02);
                    sb.append(":");
                    sb.append(j);
                    sb.append(",");
                }
            }
            if (sb.length() == 0) {
                str = null;
            } else {
                str = sb.toString();
            }
        }
        return str;
    }
}
