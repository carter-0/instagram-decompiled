package X;

import com.facebook.msys.mca.MailboxCallback;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.5z4  reason: invalid class name and case insensitive filesystem */
public class C301365z4 {
    public final LinkedHashMap A00 = new LinkedHashMap();
    public final Executor A01;

    public final synchronized void A00() {
        this.A00.clear();
        if (this instanceof C301355z3) {
            ((C301355z3) this).A00 = null;
        }
    }

    public final synchronized void A01(MailboxCallback mailboxCallback, C295025nR r5, Object obj, Executor executor, boolean z) {
        synchronized (this) {
            LinkedHashMap linkedHashMap = this.A00;
            boolean containsKey = linkedHashMap.containsKey(mailboxCallback);
            linkedHashMap.put(mailboxCallback, executor);
            if (!containsKey && z) {
                C294915nF r0 = new C294915nF(mailboxCallback, r5, obj);
                if (executor == null) {
                    executor = this.A01;
                }
                executor.execute(r0);
                linkedHashMap.remove(mailboxCallback);
                if (this instanceof C301355z3) {
                    ((C301355z3) this).A00 = null;
                }
            }
        }
    }

    public final synchronized void A02(C295025nR r5, Object obj) {
        Iterable<Map.Entry> entrySet;
        LinkedHashMap linkedHashMap = this.A00;
        if (linkedHashMap.size() > 1) {
            entrySet = new ArrayList<>(linkedHashMap.entrySet());
        } else {
            entrySet = linkedHashMap.entrySet();
        }
        for (Map.Entry entry : entrySet) {
            MailboxCallback mailboxCallback = (MailboxCallback) entry.getKey();
            mailboxCallback.getClass();
            Executor executor = (Executor) entry.getValue();
            C294915nF r0 = new C294915nF(mailboxCallback, r5, obj);
            if (executor == null) {
                executor = this.A01;
            }
            executor.execute(r0);
        }
        A00();
    }

    public C301365z4(Executor executor) {
        this.A01 = executor;
    }
}
