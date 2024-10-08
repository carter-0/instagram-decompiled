package X;

import android.os.SystemClock;
import java.util.AbstractList;

/* renamed from: X.5HO  reason: invalid class name */
public final class AnonymousClass5HO implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ String A01;

    public AnonymousClass5HO(String str, long j) {
        this.A01 = str;
        this.A00 = j;
    }

    public final void run() {
        Object obj = C2807553x.A01.get();
        obj.getClass();
        AbstractList abstractList = (AbstractList) obj;
        SystemClock.currentThreadTimeMillis();
        Object obj2 = new Object();
        int size = abstractList.size() - 1;
        if (size >= 0) {
            ((C2807553x) abstractList.get(size)).A00.add(obj2);
        }
    }
}
