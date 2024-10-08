package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UNW extends AnonymousClass0T0 implements C21040XAt {
    public final Boolean A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final String A07;
    public final String A08;

    public final UNW F9h() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNW) {
                UNW unw = (UNW) obj;
                if (!0qQ.A0K(this.A07, unw.A07) || !0qQ.A0K(this.A01, unw.A01) || !0qQ.A0K(this.A02, unw.A02) || !0qQ.A0K(this.A03, unw.A03) || !0qQ.A0K(this.A00, unw.A00) || !0qQ.A0K(this.A04, unw.A04) || !0qQ.A0K(this.A05, unw.A05) || !0qQ.A0K(this.A06, unw.A06) || !0qQ.A0K(this.A08, unw.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Aej() {
        return this.A07;
    }

    public final Float Aim() {
        return this.A01;
    }

    public final Float Aiz() {
        return this.A02;
    }

    public final Float Aj0() {
        return this.A03;
    }

    public final Float BKM() {
        return this.A04;
    }

    public final Float BKQ() {
        return this.A05;
    }

    public final Float BaA() {
        return this.A06;
    }

    public final String C54() {
        return this.A08;
    }

    public final Boolean CR9() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryChatPartialRenderInfo", V8B.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass7TG.A0E(this.A07) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + C41845B3m.A00(this.A08);
    }

    public UNW(Boolean bool, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, String str, String str2) {
        this.A07 = str;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = bool;
        this.A04 = f4;
        this.A05 = f5;
        this.A06 = f6;
        this.A08 = str2;
    }
}
