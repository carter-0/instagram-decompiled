package X;

import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* renamed from: X.Shl  reason: case insensitive filesystem */
public final class C11859Shl implements C13892TjF {
    public String A00;
    public URL A01;
    public int A02;
    public final C74539PwY A03;
    public final String A04;
    public final URL A05;
    public volatile byte[] A06;

    public C11859Shl(String str) {
        C74539PwY pwY = C74539PwY.A00;
        this.A05 = null;
        if (!TextUtils.isEmpty(str)) {
            this.A04 = str;
            C9217RTu.A00(pwY);
            this.A03 = pwY;
            return;
        }
        throw AnonymousClass7TE.A0w("Must not be null or empty");
    }

    public static String A00(C11859Shl shl) {
        String str = shl.A04;
        if (str != null) {
            return str;
        }
        URL url = shl.A05;
        C9217RTu.A00(url);
        return url.toString();
    }

    public final void FK7(MessageDigest messageDigest) {
        if (this.A06 == null) {
            this.A06 = A00(this).getBytes(C13892TjF.A00);
        }
        messageDigest.update(this.A06);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11859Shl)) {
            return false;
        }
        C11859Shl shl = (C11859Shl) obj;
        if (A00(this).equals(A00(shl))) {
            return Pxi.A1W(this.A03, shl.A03);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A02;
        if (i != 0) {
            return i;
        }
        int hashCode = A00(this).hashCode();
        this.A02 = hashCode;
        int A0N = AnonymousClass7TE.A0N(this.A03, hashCode * 31);
        this.A02 = A0N;
        return A0N;
    }

    public final String toString() {
        return A00(this);
    }

    public C11859Shl(URL url) {
        C74539PwY pwY = C74539PwY.A00;
        C9217RTu.A00(url);
        this.A05 = url;
        this.A04 = null;
        C9217RTu.A00(pwY);
        this.A03 = pwY;
    }
}
