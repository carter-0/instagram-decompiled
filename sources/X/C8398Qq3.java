package X;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbs;
import com.google.android.gms.internal.p002authapi.zba;

/* renamed from: X.Qq3  reason: case insensitive filesystem */
public final class C8398Qq3 extends AnonymousClass645 {
    public final GoogleSignInOptions A00;

    public final String A05() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean E57() {
        return true;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8398Qq3(android.content.Context r13, android.os.Looper r14, com.google.android.gms.auth.api.signin.GoogleSignInOptions r15, X.AnonymousClass63y r16, X.AnonymousClass640 r17, X.AnonymousClass643 r18) {
        /*
            r12 = this;
            r11 = 91
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r16
            r9 = r17
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.SHp r4 = new X.SHp
            if (r15 == 0) goto L_0x0041
            r4.<init>(r15)
        L_0x0015:
            java.lang.String r0 = X.C11139SBu.A00()
            r4.A01 = r0
            java.util.Set r1 = r10.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0045
            java.util.Iterator r3 = r1.iterator()
        L_0x0027:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r2 = r3.next()
            r0 = 0
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.util.Set r1 = r4.A02
            r1.add(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            goto L_0x0027
        L_0x0041:
            r4.<init>()
            goto L_0x0015
        L_0x0045:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r4.A00()
            r12.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8398Qq3.<init>(android.content.Context, android.os.Looper, com.google.android.gms.auth.api.signin.GoogleSignInOptions, X.63y, X.640, X.643):void");
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zbs) {
            return queryLocalInterface;
        }
        zba zba = new zba("com.google.android.gms.auth.api.signin.internal.ISignInService", iBinder);
        AnonymousClass0fD.A0A(-681929767, AnonymousClass0fD.A03(-1295379807));
        return zba;
    }

    public final Intent BwH() {
        return SQR.A00(this.A0F, this.A00);
    }
}
