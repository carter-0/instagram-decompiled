package X;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.9Bj  reason: invalid class name and case insensitive filesystem */
public final class C374929Bj extends 157 {
    public final Context A00;

    public final int A00() {
        return 3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.SmM[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.SmM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.SmM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.SmM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.SmM} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.14s A01(X.AnonymousClass15J r7, int r8) {
        /*
            r6 = this;
            android.content.Context r5 = r6.A00
            if (r7 == 0) goto L_0x0030
            int r0 = r7.A00
        L_0x0006:
            X.QQ2 r4 = new X.QQ2
            r4.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = X.QQ2.A00
            r0 = 0
            r3 = 1
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 == 0) goto L_0x002f
            r2 = 5
            X.Tgi r1 = X.C10122Rmy.A00
            r0 = 0
            r1.setUpHook(r5, r0)
            X.SmM[] r1 = X.C10122Rmy.A02
            r0 = r1[r2]
            if (r0 != 0) goto L_0x0029
            X.SmM r0 = new X.SmM
            r0.<init>()
            r1[r2] = r0
        L_0x0029:
            r0.A00 = r3
            r0.A01 = r3
            r0.A02 = r3
        L_0x002f:
            return r4
        L_0x0030:
            r0 = 5000(0x1388, float:7.006E-42)
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C374929Bj.A01(X.15J, int):X.14s");
    }

    public final AnonymousClass15J A02(JSONObject jSONObject, int i) {
        int optInt = jSONObject.optInt("timeoutInMillis");
        AnonymousClass15J r0 = new AnonymousClass15J();
        r0.A00 = optInt;
        return r0;
    }

    public C374929Bj(Context context) {
        this.A00 = context;
    }
}
