package X;

import android.util.Log;
import java.util.List;

/* renamed from: X.Qdx  reason: case insensitive filesystem */
public final class C7956Qdx extends C12327SrZ {
    public final /* synthetic */ C66093MBb A00;
    public final /* synthetic */ 0rm A01;
    public final /* synthetic */ 0rm A02;

    public final void D5E(List list) {
        0qQ.A0B(list, 0);
        if (list.size() == 1) {
            this.A02.A00 = ((SRW) list.get(0)).A0N;
            return;
        }
        throw AnonymousClass7TE.A0z("we should have exactly one result");
    }

    public C7956Qdx(C66093MBb mBb, 0rm r2, 0rm r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = mBb;
    }

    public final /* bridge */ /* synthetic */ void DDE(SJL sjl, Object obj) {
        Log.e("MediaTranscodeUtil", AnonymousClass7TG.A0m(obj, "onException - ", C51975G9x.A0l(obj)));
        this.A01.A00 = obj;
    }
}
