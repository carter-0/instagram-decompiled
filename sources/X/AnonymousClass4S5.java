package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4S5  reason: invalid class name */
public final class AnonymousClass4S5 implements AnonymousClass4S6 {
    public static final List A01 = new ArrayList(50);
    public final Handler A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.4SD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.4SD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.4SD} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4SD A00() {
        /*
            java.util.List r1 = A01
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0010
            X.4SD r0 = new X.4SD     // Catch:{ all -> 0x001e }
            r0.<init>()     // Catch:{ all -> 0x001e }
        L_0x000e:
            monitor-exit(r1)     // Catch:{ all -> 0x001e }
            goto L_0x001d
        L_0x0010:
            int r0 = r1.size()     // Catch:{ all -> 0x001e }
            int r0 = r0 + -1
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x001e }
            X.4SD r0 = (X.AnonymousClass4SD) r0     // Catch:{ all -> 0x001e }
            goto L_0x000e
        L_0x001d:
            return r0
        L_0x001e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4S5.A00():X.4SD");
    }

    public AnonymousClass4S5(Handler handler) {
        this.A00 = handler;
    }

    public final AnonymousClass4SD CsT(int i, int i2, int i3) {
        AnonymousClass4SD A002 = A00();
        A002.A00 = this.A00.obtainMessage(i, i2, i3);
        A002.A01 = this;
        return A002;
    }

    public final AnonymousClass4SD CsU(Object obj, int i) {
        AnonymousClass4SD A002 = A00();
        A002.A00 = this.A00.obtainMessage(i, obj);
        A002.A01 = this;
        return A002;
    }
}
