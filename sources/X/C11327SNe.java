package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.SNe  reason: case insensitive filesystem */
public final class C11327SNe {
    public static final C11327SNe A06 = new C11327SNe();
    public Context A00;
    public C10181Rnw A01;
    public String A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final Thread A04 = new TR0(this);
    public final Thread A05 = new TR1(this);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C11327SNe r4) {
        /*
            android.content.Context r0 = r4.A00     // Catch:{  }
            X.0qQ.A0A(r0)     // Catch:{  }
            java.util.HashSet r3 = X.S8A.A00()     // Catch:{  }
            boolean r0 = r3.isEmpty()     // Catch:{  }
            if (r0 != 0) goto L_0x004e
            X.Rnw r0 = r4.A01     // Catch:{  }
            X.0qQ.A0A(r0)     // Catch:{  }
            java.io.File r1 = r0.A00     // Catch:{  }
            java.io.File r0 = r1.getParentFile()     // Catch:{  }
            if (r0 == 0) goto L_0x0049
            r0.mkdirs()     // Catch:{  }
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ NoClassDefFoundError -> 0x004e }
            r0.<init>(r1)     // Catch:{ NoClassDefFoundError -> 0x004e }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ NoClassDefFoundError -> 0x004e }
            r2.<init>(r0)     // Catch:{ NoClassDefFoundError -> 0x004e }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0042 }
        L_0x002d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)     // Catch:{ all -> 0x0042 }
            r2.write(r0)     // Catch:{ all -> 0x0042 }
            r2.newLine()     // Catch:{ all -> 0x0042 }
            goto L_0x002d
        L_0x003e:
            r2.close()     // Catch:{ NoClassDefFoundError -> 0x004e }
            return
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ NoClassDefFoundError -> 0x004e }
            throw r0     // Catch:{ NoClassDefFoundError -> 0x004e }
        L_0x0049:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11327SNe.A00(X.SNe):void");
    }
}
