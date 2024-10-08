package X;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public final class Y1U implements Cloneable {
    public static final List A0Q = SUS.A06(C21987Xos.A06, C21987Xos.A04);
    public static final List A0R = SUS.A06(XRO.HTTP_2, XRO.HTTP_1_1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Proxy A05;
    public final ProxySelector A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final SocketFactory A0B;
    public final HostnameVerifier A0C;
    public final SSLSocketFactory A0D;
    public final YBP A0E;
    public final YBP A0F;
    public final C11358SOu A0G;
    public final XZU A0H;
    public final YBQ A0I;
    public final Xnv A0J;
    public final YBR A0K;
    public final XZV A0L;
    public final C9113RPk A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public Xnv dispatcher() {
        return this.A0J;
    }

    public Y1U(Proxy proxy, ProxySelector proxySelector, List list, List list2, List list3, List list4, SocketFactory socketFactory, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory, YBP ybp, YBP ybp2, C11358SOu sOu, XZU xzu, YBQ ybq, Xnv xnv, YBR ybr, XZV xzv, C9113RPk rPk, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C11358SOu sOu2 = sOu;
        C9113RPk rPk2 = rPk;
        this.A0J = xnv;
        this.A05 = proxy;
        this.A0A = list4;
        this.A07 = list;
        C22023Xt4 xt4 = SUS.A04;
        this.A08 = Collections.unmodifiableList(AnonymousClass7TE.A1D(list2));
        this.A09 = Collections.unmodifiableList(AnonymousClass7TE.A1D(list3));
        this.A0L = xzv;
        this.A06 = proxySelector;
        this.A0I = ybq;
        this.A0B = socketFactory;
        Iterator it = list.iterator();
        loop0:
        while (true) {
            z4 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C21987Xos xos = (C21987Xos) it.next();
                if (z4 || xos.A01) {
                    z4 = true;
                }
            }
        }
        if (sSLSocketFactory != null || !z4) {
            this.A0D = sSLSocketFactory;
        } else {
            X509TrustManager A072 = SUS.A07();
            try {
                SPU spu = SPU.A00;
                SSLContext A0A2 = spu.A0A();
                A0A2.init((KeyManager[]) null, new TrustManager[]{A072}, (SecureRandom) null);
                this.A0D = A0A2.getSocketFactory();
                rPk2 = spu.A0D(A072);
            } catch (GeneralSecurityException unused) {
                throw new AssertionError("No System TLS");
            }
        }
        this.A0M = rPk2;
        SSLSocketFactory sSLSocketFactory2 = this.A0D;
        if (sSLSocketFactory2 != null) {
            SPU.A00.A0C(sSLSocketFactory2);
        }
        this.A0C = hostnameVerifier;
        C9113RPk rPk3 = this.A0M;
        this.A0G = !2Ob.A00(sOu2.A01, rPk3) ? new C11358SOu(sOu2.A00, rPk3) : sOu2;
        this.A0F = ybp2;
        this.A0E = ybp;
        this.A0H = xzu;
        this.A0K = ybr;
        this.A0O = z2;
        this.A0N = z;
        this.A0P = z3;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = i4;
        this.A04 = i5;
        this.A02 = i3;
        if (this.A08.contains((Object) null)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Null interceptor: ");
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(this.A08, A1A));
        } else if (this.A09.contains((Object) null)) {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("Null network interceptor: ");
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(this.A09, A1A2));
        }
    }

    public Y1U(ProxySelector proxySelector, List list, List list2, List list3, List list4, SocketFactory socketFactory, HostnameVerifier hostnameVerifier, YBP ybp, YBP ybp2, C11358SOu sOu, XZU xzu, YBQ ybq, Xnv xnv, YBR ybr, XZV xzv, int i, int i2, int i3) {
        boolean z;
        C9113RPk A0D2;
        this.A0J = xnv;
        this.A05 = null;
        this.A0A = list4;
        this.A07 = list;
        C22023Xt4 xt4 = SUS.A04;
        this.A08 = Collections.unmodifiableList(AnonymousClass7TE.A1D(list2));
        this.A09 = Collections.unmodifiableList(AnonymousClass7TE.A1D(list3));
        this.A0L = xzv;
        this.A06 = proxySelector;
        this.A0I = ybq;
        this.A0B = socketFactory;
        Iterator it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C21987Xos xos = (C21987Xos) it.next();
                if (z || xos.A01) {
                    z = true;
                }
            }
        }
        if (!z) {
            this.A0D = null;
            A0D2 = null;
        } else {
            X509TrustManager A072 = SUS.A07();
            try {
                SPU spu = SPU.A00;
                SSLContext A0A2 = spu.A0A();
                A0A2.init((KeyManager[]) null, new TrustManager[]{A072}, (SecureRandom) null);
                this.A0D = A0A2.getSocketFactory();
                A0D2 = spu.A0D(A072);
            } catch (GeneralSecurityException unused) {
                throw new AssertionError("No System TLS");
            }
        }
        this.A0M = A0D2;
        SSLSocketFactory sSLSocketFactory = this.A0D;
        if (sSLSocketFactory != null) {
            SPU.A00.A0C(sSLSocketFactory);
        }
        this.A0C = hostnameVerifier;
        C9113RPk rPk = this.A0M;
        this.A0G = !2Ob.A00(sOu.A01, rPk) ? new C11358SOu(sOu.A00, rPk) : sOu;
        this.A0F = ybp2;
        this.A0E = ybp;
        this.A0H = xzu;
        this.A0K = ybr;
        this.A0O = true;
        this.A0N = true;
        this.A0P = true;
        this.A00 = 0;
        this.A01 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A02 = 0;
        if (this.A08.contains((Object) null)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Null interceptor: ");
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(this.A08, A1A));
        } else if (this.A09.contains((Object) null)) {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("Null network interceptor: ");
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(this.A09, A1A2));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Y1U() {
        /*
            r20 = this;
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.Xnv r14 = new X.Xnv
            r14.<init>()
            java.util.List r6 = A0R
            java.util.List r3 = A0Q
            X.Xmb r1 = X.C21946Xmb.A00
            X.XZV r0 = new X.XZV
            r0.<init>(r1)
            java.net.ProxySelector r2 = java.net.ProxySelector.getDefault()
            if (r2 != 0) goto L_0x0023
            X.Y5X r2 = new X.Y5X
            r2.<init>()
        L_0x0023:
            X.YBQ r13 = X.YBQ.A00
            javax.net.SocketFactory r7 = javax.net.SocketFactory.getDefault()
            X.TPE r8 = X.TPE.A00
            X.SOu r11 = X.C11358SOu.A02
            X.YBP r9 = X.YBP.A00
            X.XZU r12 = new X.XZU
            r12.<init>()
            X.YBR r15 = X.YBR.A00
            r17 = 10000(0x2710, float:1.4013E-41)
            r1 = r20
            r10 = r9
            r16 = r0
            r18 = r17
            r19 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y1U.<init>():void");
    }
}
