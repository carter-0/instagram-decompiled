package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4ye  reason: invalid class name and case insensitive filesystem */
public final class C279444ye extends AnonymousClass0T0 implements C279454yf {
    public final long A00;
    public final Integer A01;
    public final Integer A02;

    public final C279444ye F1l() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279444ye) {
                C279444ye r8 = (C279444ye) obj;
                if (this.A00 != r8.A00 || !0qQ.A0K(this.A01, r8.A01) || !0qQ.A0K(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BoC() {
        return this.A01;
    }

    public final Integer BoD() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateSegmentInfo", B6d.A00(this));
    }

    public final long getDurationInMs() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Integer num = this.A01;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Integer num2 = this.A02;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return i3 + i2;
    }

    public C279444ye(Integer num, Integer num2, long j) {
        this.A00 = j;
        this.A01 = num;
        this.A02 = num2;
    }
}
