package X;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.7o3  reason: invalid class name and case insensitive filesystem */
public final class C342107o3 extends FutureTask {
    public final ArrayList A00 = new ArrayList();
    public final UUID A01;
    public final String A02;
    public final /* synthetic */ C340757lm A03;

    private synchronized void A00(boolean z) {
        if (z) {
            0fg.A01(this.A02, -1341607321);
        } else {
            0fg.A00(1731813202);
        }
    }

    public final synchronized void A01(AnonymousClass8GD r7) {
        C340757lm r4;
        UUID uuid;
        C41200Apy apy;
        if (isDone()) {
            try {
                Object obj = get();
                this.A03.A05(new C41200Apy(r7, (Exception) null, obj, true), this.A01);
            } catch (CancellationException e) {
                r4 = this.A03;
                uuid = this.A01;
                apy = new C41200Apy(r7, e, (Object) null, false);
                r4.A05(apy, uuid);
            } catch (InterruptedException | ExecutionException e2) {
                r4 = this.A03;
                uuid = this.A01;
                apy = new C41200Apy(r7, e2, (Object) null, false);
                r4.A05(apy, uuid);
            }
        } else {
            this.A00.add(r7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C342107o3(C340757lm r2, String str, UUID uuid, Callable callable) {
        super(callable);
        this.A03 = r2;
        02V.A03(uuid, 002.A0R("SessionId is null! Attempting to schedule task: ", str));
        this.A01 = uuid;
        02V.A03(str, "OpticFutureTask cannot have a null name.");
        this.A02 = str;
    }

    public final void done() {
        C340757lm r4;
        UUID uuid;
        C343007pW r2;
        UUID uuid2 = C340757lm.A06;
        synchronized (this) {
            ArrayList arrayList = this.A00;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            try {
                Object obj = get();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.A03.A05(new C343007pW((Exception) null, obj, arrayList2, true), this.A01);
            } catch (CancellationException e) {
                r4 = this.A03;
                uuid = this.A01;
                r2 = new C343007pW(e, (Object) null, arrayList2, false);
                r4.A05(r2, uuid);
            } catch (InterruptedException | ExecutionException e2) {
                if (arrayList2.isEmpty()) {
                    Looper looper = this.A03.A04.getLooper();
                    looper.getClass();
                    if (looper.getThread() != Thread.currentThread()) {
                        C340577lU.A00(4, 0, e2);
                    }
                } else {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    r4 = this.A03;
                    uuid = this.A01;
                    r2 = new C343007pW(e2, (Object) null, arrayList2, false);
                    r4.A05(r2, uuid);
                }
            }
        }
        A00(false);
    }

    public final void run() {
        UUID uuid = C340757lm.A06;
        A00(true);
        super.run();
    }

    public final boolean runAndReset() {
        UUID uuid = C340757lm.A06;
        A00(true);
        return super.runAndReset();
    }
}
