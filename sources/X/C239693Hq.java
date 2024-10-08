package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3Hq  reason: invalid class name and case insensitive filesystem */
public final class C239693Hq extends AnonymousClass0T0 implements C239703Hr {
    public final C294065ln A00;
    public final C294065ln A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C239693Hq(C294065ln r2, C294065ln r3, String str, String str2, List list) {
        0qQ.A0B(r2, 2);
        this.A04 = list;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = str;
        this.A03 = str2;
    }

    public final C239693Hq FEo() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C239693Hq) {
                C239693Hq r5 = (C239693Hq) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A04;
        int i = 0;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.A00.hashCode()) * 31;
        C294065ln r0 = this.A01;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        String str = this.A02;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final List Ast() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ C294075lo Asx() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C294075lo B8L() {
        return this.A01;
    }

    public final String CCA() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelCoverMediaClientDict", C44883CmZ.A00(this));
    }

    public final String getMediaId() {
        return this.A02;
    }
}
