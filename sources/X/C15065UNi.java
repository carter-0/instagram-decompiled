package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppTextFragmentType;

/* renamed from: X.UNi  reason: case insensitive filesystem */
public final class C15065UNi extends AnonymousClass0T0 implements C21037XAq {
    public final XAJ A00;
    public final XAR A01;
    public final C51955G8y A02;
    public final XAK A03;
    public final TextAppTextFragmentType A04;
    public final String A05;

    public final C15065UNi FCW(1E9 r1) {
        return this;
    }

    public final C15065UNi FCX(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15065UNi) {
                C15065UNi uNi = (C15065UNi) obj;
                if (!0qQ.A0K(this.A00, uNi.A00) || this.A04 != uNi.A04 || !0qQ.A0K(this.A01, uNi.A01) || !0qQ.A0K(this.A02, uNi.A02) || !0qQ.A0K(this.A05, uNi.A05) || !0qQ.A0K(this.A03, uNi.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final XAJ B53() {
        return this.A00;
    }

    public final TextAppTextFragmentType B7y() {
        return this.A04;
    }

    public final XAR BMl() {
        return this.A01;
    }

    public final C51955G8y BRe() {
        return this.A02;
    }

    public final String Bcv() {
        return this.A05;
    }

    public final XAK C3t() {
        return this.A03;
    }

    public final C21037XAq E9O(1E9 r1) {
        return this;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextAppTextFragment", V8U.A00(this));
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public C15065UNi(XAJ xaj, XAR xar, C51955G8y g8y, XAK xak, TextAppTextFragmentType textAppTextFragmentType, String str) {
        this.A00 = xaj;
        this.A04 = textAppTextFragmentType;
        this.A01 = xar;
        this.A02 = g8y;
        this.A05 = str;
        this.A03 = xak;
    }
}
