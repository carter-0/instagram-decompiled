package X;

import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.Qys  reason: case insensitive filesystem */
public final class C8655Qys extends C368338sS {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C10805RyR A01;
    public final /* synthetic */ C10964S2w A02;
    public final /* synthetic */ C10209RoQ A03;
    public final /* synthetic */ AnonymousClass4MQ A04;
    public final /* synthetic */ Executor A05;

    public C8655Qys(C10805RyR ryR, C10964S2w s2w, C10209RoQ roQ, AnonymousClass4MQ r4, Executor executor, long j) {
        this.A01 = ryR;
        this.A02 = s2w;
        this.A03 = roQ;
        this.A04 = r4;
        this.A00 = j;
        this.A05 = executor;
    }

    public final /* bridge */ /* synthetic */ Object A01(Object obj) {
        Object remove;
        String str = (String) obj;
        0qQ.A0B(str, 0);
        C10805RyR ryR = this.A01;
        Map map = ryR.A06;
        synchronized (map) {
            remove = map.remove(str);
        }
        C10402Rre rre = (C10402Rre) remove;
        if (rre != null) {
            long j = this.A00;
            AnonymousClass4MQ r4 = this.A04;
            long j2 = rre.A00;
            if (j2 + j < r4.A00()) {
                ArrayList arrayList = ryR.A05;
                synchronized (arrayList) {
                    arrayList.add(str);
                }
            }
            synchronized (ryR.A04) {
                ryR.A01 = AnonymousClass05K.A0u;
            }
            ryR.A00 = j2;
            return rre.A01;
        }
        C10964S2w s2w = this.A02;
        ArrayList A002 = s2w.A00(str);
        synchronized (ryR.A04) {
            ryR.A01 = s2w.A00;
        }
        C10209RoQ roQ = this.A03;
        String A003 = C9253RVe.A00(this.A04.A00(), A002);
        0qQ.A0B(A003, 1);
        SharedPreferences sharedPreferences = roQ.A00.getSharedPreferences("act_dns_cache", 0);
        0qQ.A07(sharedPreferences);
        Pxf.A13(sharedPreferences.edit(), str, A003);
        return A002;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture A00(Object obj, Object obj2) {
        String A1E = C41847B3o.A1E(obj);
        C13270TSl tSl = new C13270TSl(new C13154TNm(this.A01, this.A04, this.A02, this.A03, A1E, 1));
        this.A05.execute(tSl);
        return tSl;
    }
}
