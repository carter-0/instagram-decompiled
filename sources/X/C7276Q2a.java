package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* renamed from: X.Q2a  reason: case insensitive filesystem */
public final class C7276Q2a implements C303636Ad {
    public final /* synthetic */ Q2X A00;
    public final /* synthetic */ Q1l A01;
    public final /* synthetic */ C7271Q1v A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ boolean A05;

    public C7276Q2a(Q2X q2x, Q1l q1l, C7271Q1v q1v, String str, Map map, boolean z) {
        this.A04 = map;
        this.A02 = q1v;
        this.A03 = str;
        this.A01 = q1l;
        this.A05 = z;
        this.A00 = q2x;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.1K2] */
    public final /* bridge */ /* synthetic */ ListenableFuture ABk(Object obj) {
        Object obj2;
        C7263Q1n q1n = (C7263Q1n) obj;
        if (q1n == null) {
            Exception exc = new Exception("fetchAndDecodeImage: ShowreelNativeDocument is null", (Throwable) null);
            ? obj3 = new Object();
            obj3.setException(exc);
            return obj3;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        C249803kO A0J = C66580MXl.A0J(q1n.A01);
        while (true) {
            if (!A0J.hasNext()) {
                break;
            }
            JV7 jv7 = (JV7) A0J.next();
            Map map = this.A04;
            if (map == null || (obj2 = map.get(jv7.A02)) == null) {
                builder.add(jv7);
            } else {
                A0Q.put(jv7.A01, obj2);
            }
        }
        ImmutableList build = builder.build();
        ImmutableMap build2 = A0Q.build();
        if (build2.isEmpty()) {
            C7264Q1o q1o = this.A02.A03;
            String str = this.A03;
            return q1o.A00(this.A00, this.A01, q1n, str, this.A05);
        }
        C7271Q1v q1v = this.A02;
        C7264Q1o q1o2 = q1v.A03;
        String str2 = this.A03;
        Q1l q1l = this.A01;
        0qQ.A0A(build);
        0qQ.A0B(build, 0);
        String str3 = q1n.A04;
        String str4 = q1n.A03;
        return C303646Ae.A01(new C7277Q2c(0, new C74179PqL(build2, 21)), q1o2.A00(this.A00, q1l, new C7263Q1n(q1n.A00, build, q1n.A02, str3, str4), str2, this.A05), q1v.A04);
    }
}
