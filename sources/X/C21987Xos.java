package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: X.Xos  reason: case insensitive filesystem */
public final class C21987Xos {
    public static final C21987Xos A04;
    public static final C21987Xos A05;
    public static final C21987Xos A06;
    public static final C21987Xos A07;
    public static final C22015Xr8[] A08;
    public static final C22015Xr8[] A09;
    public final boolean A00;
    public final boolean A01;
    public final String[] A02;
    public final String[] A03;

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.XU4] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.XU4] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.XU4] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Object, X.XU4] */
    static {
        C22015Xr8 xr8 = C22015Xr8.A04;
        C22015Xr8 xr82 = C22015Xr8.A05;
        C22015Xr8 xr83 = C22015Xr8.A06;
        C22015Xr8 xr84 = C22015Xr8.A0i;
        C22015Xr8 xr85 = C22015Xr8.A0v;
        C22015Xr8 xr86 = C22015Xr8.A0l;
        C22015Xr8 xr87 = C22015Xr8.A0y;
        C22015Xr8 xr88 = C22015Xr8.A0m;
        C22015Xr8 xr89 = C22015Xr8.A0z;
        C22015Xr8[] xr8Arr = {xr8, xr82, xr83, xr84, xr85, xr86, xr87, xr88, xr89};
        A09 = xr8Arr;
        C22015Xr8[] xr8Arr2 = {xr8, xr82, xr83, xr84, xr85, xr86, xr87, xr88, xr89, C22015Xr8.A0t, C22015Xr8.A0w, C22015Xr8.A1k, C22015Xr8.A1n, C22015Xr8.A1i, C22015Xr8.A1l, C22015Xr8.A1h};
        A08 = xr8Arr2;
        ? obj = new Object();
        obj.A01 = true;
        obj.A02(xr8Arr);
        C21256XRb xRb = C21256XRb.TLS_1_3;
        C21256XRb xRb2 = C21256XRb.TLS_1_2;
        obj.A03(xRb, xRb2);
        if (obj.A01) {
            obj.A00 = true;
            A07 = new C21987Xos(obj);
            ? obj2 = new Object();
            obj2.A01 = true;
            obj2.A02(xr8Arr2);
            obj2.A03(xRb, xRb2);
            if (obj2.A01) {
                obj2.A00 = true;
                A06 = new C21987Xos(obj2);
                ? obj3 = new Object();
                obj3.A01 = true;
                obj3.A02(xr8Arr2);
                obj3.A03(xRb, xRb2, C21256XRb.TLS_1_1, C21256XRb.TLS_1_0);
                if (obj3.A01) {
                    obj3.A00 = true;
                    A05 = new C21987Xos(obj3);
                    ? obj4 = new Object();
                    obj4.A01 = false;
                    A04 = new C21987Xos(obj4);
                    return;
                }
                throw AnonymousClass7TE.A0z("no TLS extensions for cleartext connections");
            }
            throw AnonymousClass7TE.A0z("no TLS extensions for cleartext connections");
        }
        throw AnonymousClass7TE.A0z("no TLS extensions for cleartext connections");
    }

    public final boolean A00(SSLSocket sSLSocket) {
        int length;
        int length2;
        int length3;
        int length4;
        if (!this.A01) {
            return false;
        }
        String[] strArr = this.A03;
        if (strArr != null) {
            Comparator comparator = SUS.A01;
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (enabledProtocols == null || (length3 = strArr.length) == 0 || (length4 = enabledProtocols.length) == 0) {
                return false;
            }
            int i = 0;
            do {
                String str = strArr[i];
                int i2 = 0;
                while (comparator.compare(str, enabledProtocols[i2]) != 0) {
                    i2++;
                    if (i2 >= length4) {
                        i++;
                    }
                }
            } while (i < length3);
            return false;
        }
        String[] strArr2 = this.A02;
        if (strArr2 != null) {
            Comparator comparator2 = C22015Xr8.A01;
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            C22023Xt4 xt4 = SUS.A04;
            if (enabledCipherSuites == null || (length = strArr2.length) == 0 || (length2 = enabledCipherSuites.length) == 0) {
                return false;
            }
            int i3 = 0;
            do {
                String str2 = strArr2[i3];
                int i4 = 0;
                while (comparator2.compare(str2, enabledCipherSuites[i4]) != 0) {
                    i4++;
                    if (i4 >= length2) {
                        i3++;
                    }
                }
            } while (i3 < length);
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21987Xos) {
            if (obj != this) {
                C21987Xos xos = (C21987Xos) obj;
                boolean z = this.A01;
                if (z != xos.A01 || (z && (!Arrays.equals(this.A02, xos.A02) || !Arrays.equals(this.A03, xos.A03) || this.A00 != xos.A00))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A01) {
            return ((((527 + Arrays.hashCode(this.A02)) * 31) + Arrays.hashCode(this.A03)) * 31) + (this.A00 ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List list;
        List list2;
        if (!this.A01) {
            return "ConnectionSpec()";
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ConnectionSpec(cipherSuites=");
        String[] strArr = this.A02;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(r3);
            for (String A012 : strArr) {
                arrayList.add(C22015Xr8.A01(A012));
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        String str = "[all enabled]";
        String str2 = str;
        if (list != null) {
            str2 = list.toString();
        }
        A1A.append(str2);
        A1A.append(", tlsVersions=");
        String[] strArr2 = this.A03;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(r3);
            for (String A002 : strArr2) {
                arrayList2.add(C21256XRb.A00(A002));
            }
            list2 = Collections.unmodifiableList(arrayList2);
        } else {
            list2 = null;
        }
        if (list2 != null) {
            str = list2.toString();
        }
        A1A.append(str);
        A1A.append(", supportsTlsExtensions=");
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l(")", A1A);
    }

    public C21987Xos(XU4 xu4) {
        this.A01 = xu4.A01;
        this.A02 = xu4.A02;
        this.A03 = xu4.A03;
        this.A00 = xu4.A00;
    }
}
