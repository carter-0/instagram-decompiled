package X;

import com.facebook.wearable.mediastream.events.EventsReceiver$subscribeTo$$inlined$CoroutineExceptionHandler$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class LOU {
    public AnonymousClass4CZ A00;
    public AnonymousClass4CZ A01;
    public final C64108LNn A02;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();

    public final void A01(C66374MPg mPg, 0sL r10) {
        0qQ.A0B(mPg, 0);
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass19G((C262204Co) null).plus(this.A00).plus(new EventsReceiver$subscribeTo$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
        1Er A1L = C51966G9m.A1L(new MHP((Object) this, (Object) mPg, (Object) r10, (AnonymousClass4D7) null, 46), A022);
        ConcurrentHashMap concurrentHashMap = this.A03;
        List A0j = JTQ.A0j((List) concurrentHashMap.get(mPg));
        A0j.add(A1L);
        concurrentHashMap.put(mPg, A0j);
    }

    public /* synthetic */ LOU(C64108LNn lNn) {
        AnonymousClass4CZ r1 = AnonymousClass12W.A00;
        0qQ.A0B(lNn, 1);
        this.A02 = lNn;
        this.A00 = r1;
        this.A01 = r1;
    }

    public final void A00() {
        ConcurrentHashMap concurrentHashMap = this.A03;
        Collection<List> values = concurrentHashMap.values();
        0qQ.A07(values);
        for (List list : values) {
            0qQ.A0A(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JTU.A1O(it);
            }
        }
        concurrentHashMap.clear();
    }

    public LOU() {
        C64108LNn lNn = C64108LNn.A01;
        AnonymousClass4CZ r1 = AnonymousClass12W.A00;
        0qQ.A0B(lNn, 1);
        this.A02 = lNn;
        this.A00 = r1;
        this.A01 = r1;
    }
}
