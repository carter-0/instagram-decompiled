package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.List;

/* renamed from: X.9cj  reason: invalid class name and case insensitive filesystem */
public final class C381879cj extends AnonymousClass0T0 implements C248923io {
    public final boolean A00;
    public final C248923io A01;

    public final A9H AKY() {
        return this.A01.AKY();
    }

    public final ClipsTextAlignment Aah() {
        return this.A01.Aah();
    }

    public final List Ap5() {
        return this.A01.Ap5();
    }

    public final float B1g() {
        return this.A01.B1g();
    }

    public final float B78() {
        return this.A01.B78();
    }

    public final float BCs() {
        return this.A01.BCs();
    }

    public final float BXs() {
        return this.A01.BXs();
    }

    public final float BXu() {
        return this.A01.BXu();
    }

    public final float Bog() {
        return this.A01.Bog();
    }

    public final float BpU() {
        return this.A01.BpU();
    }

    public final float Byr() {
        return this.A01.Byr();
    }

    public final ClipsTextEmphasisMode C56() {
        return this.A01.C56();
    }

    public final ClipsTextFormatType C5D() {
        return this.A01.C5D();
    }

    public final float CGW() {
        return this.A01.CGW();
    }

    public final C248883ik FDp() {
        return this.A01.FDp();
    }

    public final TreeUpdaterJNI FHC() {
        return this.A01.FHC();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381879cj) {
                C381879cj r5 = (C381879cj) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getId() {
        return this.A01.getId();
    }

    public final String getText() {
        return this.A01.getText();
    }

    public final int getZIndex() {
        return this.A01.getZIndex();
    }

    public final int isAnimated() {
        return this.A01.isAnimated();
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return A0K + i;
    }

    public C381879cj(C248923io r1, boolean z) {
        this.A01 = r1;
        this.A00 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClipsTextInfoExt(item=");
        A1A.append(this.A01);
        A1A.append(", isTimedSticker=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
