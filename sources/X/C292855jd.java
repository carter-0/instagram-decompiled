package X;

import android.os.Process;

/* renamed from: X.5jd  reason: invalid class name and case insensitive filesystem */
public final class C292855jd extends 1NT {
    public final int A00;

    /* renamed from: A01 */
    public final 1XU then(2ZL r5) {
        0qQ.A0B(r5, 0);
        int i = this.A00;
        boolean z = false;
        if (i > -20) {
            z = true;
        }
        int threadPriority = Process.getThreadPriority(Process.myTid());
        if (z) {
            Process.setThreadPriority(i);
        }
        1XU A002 = C292855jd.super.A00(r5);
        1Fn A01 = r5.A01("X-IG-ANDROID-FROM-DISK-CACHE");
        if (A01 != null) {
            String str = A01.A01;
            0qQ.A06(str);
            A002.EQG(Long.parseLong(str));
        }
        Process.setThreadPriority(threadPriority);
        return A002;
    }

    public C292855jd(15p r3, 1FX r4, int i) {
        super(r3, r4, AnonymousClass1Fh.class, true);
        this.A00 = i;
    }
}
