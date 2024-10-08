package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7gX  reason: invalid class name and case insensitive filesystem */
public final class C337557gX extends 2V1 {
    public 2Sg A00;
    public C337747gq A01;
    public C337657gh A02;
    public WeakReference A03;
    public final C337567gY A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C337557gX(X.2V1 r10) {
        /*
            r9 = this;
            r0 = 1
            X.0qQ.A0B(r10, r0)
            android.content.Context r2 = r10.A0C
            X.0qQ.A07(r2)
            X.3X5 r3 = r10.A02
            X.2VJ r0 = r10.A07
            if (r0 != 0) goto L_0x0020
            r6 = 0
        L_0x0010:
            r4 = 0
            r1 = r9
            r5 = r4
            r7 = r4
            r8 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.7gY r0 = new X.7gY
            r0.<init>()
            r9.A04 = r0
            return
        L_0x0020:
            X.2VJ r6 = X.AnonymousClass3XP.A00(r0)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337557gX.<init>(X.2V1):void");
    }

    public final String A08() {
        C337587ga r0;
        WeakReference weakReference = this.A03;
        if (weakReference == null || (r0 = (C337587ga) weakReference.get()) == null) {
            throw new IllegalStateException("getGlobalKey cannot be accessed from a SectionContext without a scope");
        }
        String str = r0.A03;
        0qQ.A07(str);
        return str;
    }

    public final void A0A(C294145lv r4) {
        C337587ga r0;
        C337657gh r2 = this.A02;
        WeakReference weakReference = this.A03;
        if (weakReference != null && (r0 = (C337587ga) weakReference.get()) != null && r2 != null) {
            String str = r0.A03;
            synchronized (r2) {
                C337657gh.A05(r4, r2, str, true);
            }
        }
    }

    public final void A0B(C294145lv r6, String str) {
        C337587ga A0E = A0E();
        C337657gh r3 = this.A02;
        if (A0E != null && r3 != null) {
            if (C338337hn.A00) {
                r3.hashCode();
            }
            String str2 = A0E.A03;
            synchronized (r3) {
                C337717gn r1 = r3.A0B;
                r1.A01();
                C337657gh.A05(r6, r3, str2, false);
                r1.A02("updateState:RootBloksComponent.onNewTree", 3);
                C243133Xn.A0C.addAndGet(1);
            }
        }
    }

    public final void A0C(C294145lv r5, String str) {
        C337587ga r1;
        WeakReference weakReference = this.A03;
        if (weakReference != null) {
            r1 = (C337587ga) weakReference.get();
        } else {
            r1 = null;
        }
        C337657gh r3 = this.A02;
        if (r1 != null && r3 != null) {
            if (C338337hn.A00) {
                r3.hashCode();
            }
            String str2 = r1.A03;
            synchronized (r3) {
                C337717gn r12 = r3.A0A;
                r12.A01();
                C337657gh.A05(r5, r3, str2, false);
                r12.A02(str, 2);
                C243133Xn.A0D.addAndGet(1);
            }
        }
    }

    public final C337587ga A0E() {
        WeakReference weakReference = this.A03;
        if (weakReference != null) {
            return (C337587ga) weakReference.get();
        }
        return null;
    }
}
