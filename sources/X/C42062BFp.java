package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BFp  reason: case insensitive filesystem */
public final class C42062BFp extends AnonymousClass0T0 implements DTL {
    public final float A00;
    public final int A01;
    public final String A02;

    public C42062BFp(String str, int i, float f) {
        0qQ.A0B(str, 3);
        this.A01 = i;
        this.A00 = f;
        this.A02 = str;
    }

    public final C42062BFp F7Z() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42062BFp) {
                C42062BFp bFp = (C42062BFp) obj;
                if (!(this.A01 == bFp.A01 && Float.compare(this.A00, bFp.A00) == 0 && 0qQ.A0K(this.A02, bFp.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float B78() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTPollCreateModeStickerTally", CbY.A00(this));
    }

    public final int getCount() {
        return this.A01;
    }

    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, ((this.A01 * 31) + Float.floatToIntBits(this.A00)) * 31);
    }
}
