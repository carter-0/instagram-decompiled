package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4vF  reason: invalid class name and case insensitive filesystem */
public final class C277484vF extends AnonymousClass0T0 implements C277494vG {
    public final boolean A00;
    public final boolean A01;

    public final C277484vF F4N() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C277484vF) {
                C277484vF r5 = (C277484vF) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean Adt() {
        return this.A00;
    }

    public final boolean CEV() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveAudioVideoToggle", CZ2.A00(this));
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public C277484vF(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
