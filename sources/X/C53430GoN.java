package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import java.util.List;

/* renamed from: X.GoN  reason: case insensitive filesystem */
public final class C53430GoN extends AnonymousClass0T0 implements C269894fr {
    public final C275524qU A00;
    public final REPETITION_UI_TYPE A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final C53430GoN F0L() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53430GoN) {
                C53430GoN goN = (C53430GoN) obj;
                if (!0qQ.A0K(this.A02, goN.A02) || !0qQ.A0K(this.A04, goN.A04) || this.A01 != goN.A01 || !0qQ.A0K(this.A03, goN.A03) || !0qQ.A0K(this.A00, goN.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ay0() {
        return this.A02;
    }

    public final List Bip() {
        return this.A04;
    }

    public final REPETITION_UI_TYPE Blk() {
        return this.A01;
    }

    public final String Bm4() {
        return this.A03;
    }

    public final C275524qU CBM() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAfiFeedRepetitionInfo", HTG.A00(this));
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C53430GoN(C275524qU r1, REPETITION_UI_TYPE repetition_ui_type, String str, String str2, List list) {
        this.A02 = str;
        this.A04 = list;
        this.A01 = repetition_ui_type;
        this.A03 = str2;
        this.A00 = r1;
    }
}
