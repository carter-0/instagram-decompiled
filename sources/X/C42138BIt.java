package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BIt  reason: case insensitive filesystem */
public final class C42138BIt extends AnonymousClass0T0 implements DUZ {
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public C42138BIt(List list, boolean z, String str, String str2) {
        AnonymousClass7TF.A1D(str2, 3, list);
        this.A00 = str;
        this.A03 = z;
        this.A01 = str2;
        this.A02 = list;
    }

    public final C42138BIt FGM(1E9 r1) {
        return this;
    }

    public final C42138BIt FGN(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42138BIt) {
                C42138BIt bIt = (C42138BIt) obj;
                if (!0qQ.A0K(this.A00, bIt.A00) || this.A03 != bIt.A03 || !0qQ.A0K(this.A01, bIt.A01) || !0qQ.A0K(this.A02, bIt.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BP8() {
        return this.A00;
    }

    public final boolean BU8() {
        return this.A03;
    }

    public final List CG0() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryPollVoterInfo", C44985CoO.A00(this));
    }

    public final String getPollId() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A09(this.A03, AnonymousClass7TG.A0E(this.A00) * 31)));
    }

    public final DUZ EAO(1E9 r1) {
        return this;
    }
}
