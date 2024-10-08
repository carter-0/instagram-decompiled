package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.58L  reason: invalid class name */
public final class AnonymousClass58L extends AnonymousClass0T0 implements AnonymousClass58M {
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final String A03;

    public AnonymousClass58L(Integer num, String str, long j, long j2) {
        0qQ.A0B(str, 3);
        this.A00 = j;
        this.A02 = num;
        this.A03 = str;
        this.A01 = j2;
    }

    public final AnonymousClass58L F1m() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass58L) {
                AnonymousClass58L r8 = (AnonymousClass58L) obj;
                if (this.A00 != r8.A00 || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03) || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BGr() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateTransitionEffectInfo", C44097CVo.A00(this));
    }

    public final long getDurationInMs() {
        return this.A00;
    }

    public final String getName() {
        return this.A03;
    }

    public final long getStartTimeInMs() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Integer num = this.A02;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j2 = this.A01;
        return ((((i + hashCode) * 31) + this.A03.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
