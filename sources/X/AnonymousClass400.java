package X;

import com.facebook.odin.model.OdinContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.400  reason: invalid class name */
public final class AnonymousClass400 implements C258943zt {
    public ArrayList A00 = new ArrayList();
    public final C258943zt A01;
    public final ReentrantLock A02 = new ReentrantLock();

    public AnonymousClass400(C258943zt r2) {
        0qQ.A0B(r2, 2);
        this.A01 = r2;
    }

    public final void A00(OdinContext odinContext) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            AnonymousClass40G ATg = this.A01.ATg(odinContext);
            if (ATg.A02) {
                arrayList.addAll((Collection) ATg.A00);
            }
            this.A00 = arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            if (this.A00.isEmpty()) {
                A00(odinContext);
            }
            return new AnonymousClass40G(this.A00, (String) null, true);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String getId() {
        return "CachedAll";
    }
}
