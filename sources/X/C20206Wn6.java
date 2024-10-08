package X;

import java.util.List;

/* renamed from: X.Wn6  reason: case insensitive filesystem */
public final class C20206Wn6 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C17925ViG A01;

    public C20206Wn6(C17925ViG viG, long j) {
        this.A00 = j;
        this.A01 = viG;
    }

    public final void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("prefetch still not done after ");
        sb.append(this.A00);
        sb.append(". We still are waiting on ");
        C17925ViG viG = this.A01;
        List list = viG.A08;
        sb.append(list.size());
        sb.append(" video callbacks and ");
        List list2 = viG.A07;
        sb.append(list2.size());
        String A0l = AnonymousClass7TF.A0l(" image callbacks - finishing job", sb);
        list.clear();
        list2.clear();
        C278774xV r1 = viG.A06;
        0qQ.A0B(A0l, 1);
        if (C278774xV.A00(r1)) {
            r1.A01.flowEndFail(r1.A00, "PREFETCH_MEDIAS_TIMEOUT", A0l);
        }
        viG.A04.AVX(C273654mx.A00(141));
    }
}
