package X;

import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qdy  reason: case insensitive filesystem */
public final class C7957Qdy extends C12327SrZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C7957Qdy(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void D5E(List list) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(list, 0);
                if (list.size() == 1) {
                    ((Object[]) this.A02)[0] = ((SRW) list.get(0)).A0N.getPath();
                    return;
                }
                throw AnonymousClass7TE.A0z("we should have exactly one result");
            case 1:
                0qQ.A0B(list, 0);
                if (list.size() == 1) {
                    ((0rm) this.A02).A00 = ((SRW) list.get(0)).A0N;
                    return;
                }
                throw AnonymousClass7TE.A0z("we should have exactly one result");
            default:
                0qQ.A0B(list, 0);
                if (list.size() == 1) {
                    ((C13839TiE) this.A01).DtQ(list);
                    return;
                }
                throw AnonymousClass7TE.A0z("we should have exactly one result");
        }
    }

    public final /* bridge */ /* synthetic */ void DDE(SJL sjl, Object obj) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(obj, 0);
                ((Object[]) this.A01)[0] = obj;
                return;
            case 1:
                Log.e("MediaTranscodeUtil", AnonymousClass7TG.A0m(obj, "onException - ", C51975G9x.A0l(obj)));
                ((0rm) this.A01).A00 = obj;
                return;
            default:
                AnonymousClass4ZS r4 = (AnonymousClass4ZS) obj;
                0qQ.A0B(r4, 0);
                ((AtomicReference) this.A02).set(r4);
                ((C13839TiE) this.A01).DtL(r4);
                return;
        }
    }
}
