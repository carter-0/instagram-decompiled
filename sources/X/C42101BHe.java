package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BHe  reason: case insensitive filesystem */
public final class C42101BHe extends AnonymousClass0T0 implements C46302DUf {
    public final C42102BHf A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C42101BHe(C42102BHf bHf, Integer num, String str, String str2, String str3, List list) {
        0qQ.A0B(str3, 5);
        this.A02 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A01 = num;
        this.A04 = str3;
        this.A00 = bHf;
    }

    public final C42101BHe FC7(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42101BHe) {
                C42101BHe bHe = (C42101BHe) obj;
                if (!0qQ.A0K(this.A02, bHe.A02) || !0qQ.A0K(this.A03, bHe.A03) || !0qQ.A0K(this.A05, bHe.A05) || !0qQ.A0K(this.A01, bHe.A01) || !0qQ.A0K(this.A04, bHe.A04) || !0qQ.A0K(this.A00, bHe.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Alg() {
        return this.A02;
    }

    public final List BZQ() {
        return this.A05;
    }

    public final Integer C44() {
        return this.A01;
    }

    public final String C4Z() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ DUD CCk() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSuperlativeCardData", C44486Cfi.A00(this));
    }

    public final String getMediaId() {
        return this.A03;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A04, ((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public final C46302DUf E9I(1E9 r1) {
        return this;
    }
}
