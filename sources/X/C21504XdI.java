package X;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.XdI  reason: case insensitive filesystem */
public final class C21504XdI {
    public final Proxy A00;
    public final ProxySelector A01;
    public final List A02;
    public final List A03;
    public final SocketFactory A04;
    public final HostnameVerifier A05;
    public final SSLSocketFactory A06;
    public final YBP A07;
    public final C11358SOu A08;
    public final YBR A09;
    public final C11427STm A0A;

    public final boolean A00(C21504XdI xdI) {
        if (!this.A09.equals(xdI.A09) || !this.A07.equals(xdI.A07) || !this.A03.equals(xdI.A03) || !this.A02.equals(xdI.A02) || !this.A01.equals(xdI.A01) || !2Ob.A00(this.A00, xdI.A00) || !2Ob.A00(this.A06, xdI.A06) || !2Ob.A00(this.A05, xdI.A05) || !2Ob.A00(this.A08, xdI.A08) || this.A0A.A00 != xdI.A0A.A00) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21504XdI) {
            C21504XdI xdI = (C21504XdI) obj;
            if (!this.A0A.equals(xdI.A0A) || !A00(xdI)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A09, C21056XCh.A01(this.A0A));
        return ((((((AnonymousClass7TF.A07(this.A01, (((AnonymousClass7TF.A07(this.A07, A072) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A08);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Address{");
        C11427STm sTm = this.A0A;
        A1A.append(sTm.A02);
        A1A.append(":");
        A1A.append(sTm.A00);
        Object obj = this.A00;
        if (obj != null) {
            A1A.append(", proxy=");
        } else {
            A1A.append(", proxySelector=");
            obj = this.A01;
        }
        return C66582MXn.A0v(obj, A1A);
    }

    public C21504XdI(String str, Proxy proxy, ProxySelector proxySelector, List list, List list2, SocketFactory socketFactory, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory, YBP ybp, C11358SOu sOu, YBR ybr, int i) {
        String str2;
        S73 s73 = new S73();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        String str3 = "http";
        if (!str2.equalsIgnoreCase(str3)) {
            str3 = "https";
            if (!str2.equalsIgnoreCase(str3)) {
                throw AnonymousClass7TF.A0W("unexpected scheme: ", str2);
            }
        }
        s73.A05 = str3;
        if (str != null) {
            String A032 = SUS.A03(C11427STm.A01(str, 0, str.length(), false));
            if (A032 != null) {
                s73.A04 = A032;
                int i2 = i;
                if (i <= 0 || i2 > 65535) {
                    throw DbW.A0a("unexpected port: ", i2);
                }
                s73.A00 = i2;
                this.A0A = s73.A00();
                if (ybr != null) {
                    this.A09 = ybr;
                    if (socketFactory != null) {
                        this.A04 = socketFactory;
                        if (ybp != null) {
                            this.A07 = ybp;
                            if (list != null) {
                                this.A03 = Collections.unmodifiableList(AnonymousClass7TE.A1D(list));
                                if (list2 != null) {
                                    this.A02 = Collections.unmodifiableList(AnonymousClass7TE.A1D(list2));
                                    if (proxySelector != null) {
                                        this.A01 = proxySelector;
                                        this.A00 = proxy;
                                        this.A06 = sSLSocketFactory;
                                        this.A05 = hostnameVerifier;
                                        this.A08 = sOu;
                                        return;
                                    }
                                    throw AnonymousClass7TE.A11("proxySelector == null");
                                }
                                throw AnonymousClass7TE.A11("connectionSpecs == null");
                            }
                            throw AnonymousClass7TE.A11("protocols == null");
                        }
                        throw AnonymousClass7TE.A11("proxyAuthenticator == null");
                    }
                    throw AnonymousClass7TE.A11("socketFactory == null");
                }
                throw AnonymousClass7TE.A11("dns == null");
            }
            throw AnonymousClass7TF.A0W("unexpected host: ", str);
        }
        throw AnonymousClass7TE.A11(Pxd.A00(757));
    }
}
