package X;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: X.Shh  reason: case insensitive filesystem */
public final class C11855Shh implements C13892TjF {
    public int A00;
    public final int A01;
    public final int A02;
    public final C13892TjF A03;
    public final C11856Shi A04;
    public final Class A05;
    public final Class A06;
    public final Object A07;
    public final Map A08;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11855Shh)) {
            return false;
        }
        C11855Shh shh = (C11855Shh) obj;
        if (!this.A07.equals(shh.A07) || !this.A03.equals(shh.A03) || this.A01 != shh.A01 || this.A02 != shh.A02 || !this.A08.equals(shh.A08) || !this.A05.equals(shh.A05) || !this.A06.equals(shh.A06)) {
            return false;
        }
        return Pxi.A1W(this.A04, shh.A04);
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = this.A07.hashCode();
        this.A00 = hashCode;
        int hashCode2 = (((((hashCode * 31) + this.A03.hashCode()) * 31) + this.A02) * 31) + this.A01;
        this.A00 = hashCode2;
        int hashCode3 = (hashCode2 * 31) + this.A08.hashCode();
        this.A00 = hashCode3;
        int A0N = AnonymousClass7TE.A0N(this.A05, hashCode3 * 31);
        this.A00 = A0N;
        int A0N2 = AnonymousClass7TE.A0N(this.A06, A0N * 31);
        this.A00 = A0N2;
        int A0N3 = AnonymousClass7TE.A0N(this.A04, A0N2 * 31);
        this.A00 = A0N3;
        return A0N3;
    }

    public C11855Shh(C13892TjF tjF, C11856Shi shi, Class cls, Class cls2, Object obj, Map map, int i, int i2) {
        C9217RTu.A00(obj);
        this.A07 = obj;
        if (tjF != null) {
            this.A03 = tjF;
            this.A02 = i;
            this.A01 = i2;
            C9217RTu.A00(map);
            this.A08 = map;
            if (cls != null) {
                this.A05 = cls;
                if (cls2 != null) {
                    this.A06 = cls2;
                    C9217RTu.A00(shi);
                    this.A04 = shi;
                    return;
                }
                throw AnonymousClass7TE.A11("Transcode class must not be null");
            }
            throw AnonymousClass7TE.A11("Resource class must not be null");
        }
        throw AnonymousClass7TE.A11("Signature must not be null");
    }

    public final void FK7(MessageDigest messageDigest) {
        throw C66580MXl.A11();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EngineKey{model=");
        A1A.append(this.A07);
        A1A.append(", width=");
        A1A.append(this.A02);
        A1A.append(", height=");
        A1A.append(this.A01);
        A1A.append(", resourceClass=");
        A1A.append(this.A05);
        A1A.append(", transcodeClass=");
        A1A.append(this.A06);
        A1A.append(", signature=");
        A1A.append(this.A03);
        A1A.append(", hashCode=");
        A1A.append(this.A00);
        A1A.append(", transformations=");
        A1A.append(this.A08);
        A1A.append(", options=");
        return Pxg.A0p(this.A04, A1A);
    }
}
