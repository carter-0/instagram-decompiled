package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.5eD  reason: invalid class name and case insensitive filesystem */
public final class C289795eD implements Runnable {
    public final /* synthetic */ C252103oZ A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ Map A02;

    public C289795eD(C252103oZ r1, List list, Map map) {
        this.A00 = r1;
        this.A01 = list;
        this.A02 = map;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        C252103oZ r8 = this.A00;
        C252143od r9 = r8.A05;
        List list = this.A01;
        C251983oI r6 = r9.A01;
        r6.assertNotSuspendingTransaction();
        r6.beginTransaction();
        try {
            r9.A00.insert(list);
            r6.setTransactionSuccessful();
            r6.endTransaction();
            for (Map.Entry entry : this.A02.entrySet()) {
                r8.A07.put(entry.getKey(), C252113oa.A00((Collection) entry.getValue()));
            }
            Map map = r8.A07;
            if (map.size() > r8.A00 * 2) {
                try {
                    long max = Math.max(r8.A03, System.currentTimeMillis() - r8.A02);
                    int i = r8.A01;
                    r6.assertNotSuspendingTransaction();
                    1Vg r4 = r9.A02;
                    AnonymousClass1WV acquire = r4.acquire();
                    acquire.ADa(1, max);
                    acquire.ADa(2, (long) i);
                    try {
                        r6.beginTransaction();
                        int ATQ = acquire.ATQ();
                        r6.setTransactionSuccessful();
                        r6.endTransaction();
                        r4.release(acquire);
                        if (ATQ > 0) {
                            map.clear();
                            map.putAll(r8.A00());
                        }
                    } catch (Throwable th) {
                        r4.release(acquire);
                        throw th;
                    }
                } catch (Exception e) {
                    0KC.A0F("UserReelMediasRoom", "Failed to prune room", e);
                    0wb.A03("UserReelMediasRoom", 002.A0R("Failed to prune room ", e.getMessage()));
                }
            }
        } catch (Throwable th2) {
            r6.endTransaction();
            throw th2;
        }
    }
}
