package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4aJ  reason: invalid class name and case insensitive filesystem */
public final class C266764aJ {
    public static final AtomicInteger A08 = new AtomicInteger();
    public final long A00;
    public final C266714aE A01;
    public final String A02;
    public final HashMap A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r7.A02(r5) < 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C266724aF r7, float r8) {
        /*
            r6 = this;
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x001d
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r7.A03(r5)
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x002e
            long r1 = r7.A02(r5)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
        L_0x001d:
            r1 = 1
        L_0x001e:
            java.lang.String r0 = "Not supported"
            X.C266784aL.A06(r1, r0)
            java.util.List r1 = r6.A07
            X.4aK r0 = new X.4aK
            r0.<init>(r7, r8)
            r1.add(r0)
            return
        L_0x002e:
            r1 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C266764aJ.A01(X.4aF, float):void");
    }

    public C266764aJ(C266714aE r4) {
        this(r4, "", 0);
    }

    public final void A00(float f) {
        this.A07.add(new C266774aK(new C266724aF(TimeUnit.SECONDS, -1, -1), f));
    }

    public final void A02(C266754aI r2) {
        this.A04.add(r2);
    }

    public final void A03(SIO sio) {
        try {
            this.A05.add(sio);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    public C266764aJ(C266714aE r2, String str, long j) {
        this.A01 = r2;
        this.A04 = new ArrayList();
        this.A06 = new ArrayList();
        this.A07 = new ArrayList();
        this.A00 = j;
        this.A02 = TextUtils.isEmpty(str) ? Integer.toString(A08.getAndIncrement()) : str;
        this.A05 = new ArrayList();
        this.A03 = new HashMap();
    }
}
