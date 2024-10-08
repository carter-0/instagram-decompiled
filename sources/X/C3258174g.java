package X;

/* renamed from: X.74g  reason: invalid class name and case insensitive filesystem */
public final class C3258174g extends AnonymousClass4AA implements C331837So {
    public final String A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3258174g) {
                C3258174g r5 = (C3258174g) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || this.A03 != r5.A03 || !0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long C7Z() {
        return 0;
    }

    public final int getType() {
        return 158;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A02.hashCode() * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((i2 + hashCode) * 31) + this.A01;
    }

    public C3258174g(String str, boolean z, String str2, int i) {
        this.A02 = str;
        this.A03 = z;
        this.A00 = str2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
