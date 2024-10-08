package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.53r  reason: invalid class name */
public final class AnonymousClass53r implements 0xY {
    public final Object A00 = new Object();
    public final Map A01 = new HashMap();
    public final /* synthetic */ 1CV A02;

    public final boolean commit() {
        HashMap hashMap;
        Set keySet;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        1CV r8 = this.A02;
        Map map = 1CV.A09;
        synchronized (r8.A06) {
            synchronized (this.A00) {
                hashMap = new HashMap(this.A01);
            }
            A01(hashMap);
            HashMap hashMap2 = new HashMap(r8.A02);
            keySet = hashMap.keySet();
            r8.A04.schedule(new C40278AYt(this, hashMap2, countDownLatch, atomicBoolean));
        }
        try {
            if (!countDownLatch.await(5, TimeUnit.SECONDS)) {
                0wb.A03("EncryptedSharedPrefs_commit_timedOut", "Timed out waiting for commit to complete.");
                return false;
            }
            boolean z = atomicBoolean.get();
            if (z) {
                keySet.getClass();
                if (!keySet.isEmpty()) {
                    A00(this, keySet);
                }
            }
            return z;
        } catch (InterruptedException e) {
            0wb.A07("EncryptedSharedPrefs_commit_interrupted", e);
            return false;
        }
    }

    public AnonymousClass53r(1CV r2) {
        this.A02 = r2;
    }

    public final 0xY AHM() {
        synchronized (this.A00) {
            1CV r1 = this.A02;
            Map map = 1CV.A09;
            synchronized (r1.A06) {
                for (String put : r1.A02.keySet()) {
                    this.A01.put(put, (Object) null);
                }
            }
        }
        return this;
    }

    public final 0xY E5T(String str, boolean z) {
        synchronized (this.A00) {
            this.A01.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    public final 0xY E5W(String str, float f) {
        synchronized (this.A00) {
            this.A01.put(str, Float.valueOf(f));
        }
        return this;
    }

    public final 0xY E5Z(String str, int i) {
        synchronized (this.A00) {
            this.A01.put(str, Integer.valueOf(i));
        }
        return this;
    }

    public final 0xY E5c(String str, long j) {
        synchronized (this.A00) {
            this.A01.put(str, Long.valueOf(j));
        }
        return this;
    }

    public final 0xY E5g(String str, String str2) {
        synchronized (this.A00) {
            this.A01.put(str, str2);
        }
        return this;
    }

    public final 0xY E5h(String str, Set set) {
        synchronized (this.A00) {
            this.A01.put(str, set);
        }
        return this;
    }

    public final 0xY ED3(String str) {
        synchronized (this.A00) {
            this.A01.put(str, (Object) null);
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.53s, X.11X] */
    public final void apply() {
        HashMap hashMap;
        1CV r5 = this.A02;
        Map map = 1CV.A09;
        synchronized (r5.A06) {
            synchronized (this.A00) {
                hashMap = new HashMap(this.A01);
            }
            A01(hashMap);
            r5.A04.schedule(new C2807353s(this, new HashMap(r5.A02), hashMap.keySet()));
        }
    }

    public static void A00(AnonymousClass53r r5, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            1CV r2 = r5.A02;
            Map map = 1CV.A09;
            Iterator it2 = r2.A07.iterator();
            while (it2.hasNext()) {
                ((0xZ) it2.next()).onChanged(r2, str);
            }
        }
    }

    private void A01(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            1CV r1 = this.A02;
            Map map = 1CV.A09;
            Map map2 = r1.A02;
            if (value == null) {
                map2.remove(key);
            } else {
                map2.put(key, value);
            }
        }
    }
}
