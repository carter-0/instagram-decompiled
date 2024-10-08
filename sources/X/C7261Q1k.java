package X;

import java.util.Comparator;

/* renamed from: X.Q1k  reason: case insensitive filesystem */
public final /* synthetic */ class C7261Q1k implements Comparator {
    public final int compare(Object obj, Object obj2) {
        C264654Qt r2;
        C264654Qt A01;
        C264654Qt r0;
        AnonymousClass4XG r7 = (AnonymousClass4XG) obj;
        AnonymousClass4XG r8 = (AnonymousClass4XG) obj2;
        if (!r7.A0B || !r7.A0D) {
            r2 = C264614Qo.A04;
            A01 = r2.A01();
        } else {
            r2 = C264614Qo.A04;
            A01 = r2;
        }
        C7280Q2f q2f = C7280Q2f.A00;
        Integer valueOf = Integer.valueOf(r7.A00);
        Integer valueOf2 = Integer.valueOf(r8.A00);
        if (r7.A08.A0O) {
            r0 = r2.A01();
        } else {
            r0 = C264614Qo.A05;
        }
        return q2f.A02(valueOf, valueOf2, r0).A02(Integer.valueOf(r7.A02), Integer.valueOf(r8.A02), A01).A02(valueOf, valueOf2, A01).A00();
    }
}
