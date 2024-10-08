package X;

/* renamed from: X.8i7  reason: invalid class name and case insensitive filesystem */
public final class C362568i7 extends AnonymousClass4AA {
    public final boolean A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Boolean bool;
        C362568i7 r4 = (C362568i7) obj;
        Boolean valueOf = Boolean.valueOf(this.A01);
        Boolean bool2 = null;
        if (r4 != null) {
            bool = Boolean.valueOf(r4.A01);
        } else {
            bool = null;
        }
        if (2PP.A00(valueOf, bool)) {
            Boolean valueOf2 = Boolean.valueOf(this.A00);
            if (r4 != null) {
                bool2 = Boolean.valueOf(r4.A00);
            }
            if (!2PP.A00(valueOf2, bool2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C362568i7(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
