package X;

/* renamed from: X.VkV  reason: case insensitive filesystem */
public final class C18047VkV {
    public final int A00;
    public final V4A A01;
    public final Object A02;
    public final Throwable A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C18047VkV vkV = (C18047VkV) obj;
            if (this.A04 == vkV.A04 && this.A00 == vkV.A00) {
                return this.A02.equals(vkV.A02);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, (((this.A04 ? 1 : 0) * true) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PresenterStateHolder{mValue=");
        sb.append(this.A02);
        sb.append(", mLoading=");
        sb.append(this.A04);
        sb.append(", mError=");
        return Pxg.A0p(this.A03, sb);
    }

    public C18047VkV(V4A v4a, Object obj, Throwable th, boolean z) {
        this.A04 = z;
        this.A03 = th;
        int i = 0;
        if (th != null) {
            i = th.getMessage() != null ? C41845B3m.A01(th.getMessage(), 0) : i;
            if (th.getLocalizedMessage() != null) {
                i = C41845B3m.A01(th.getLocalizedMessage(), i);
            }
        }
        this.A00 = i;
        this.A02 = obj;
        this.A01 = v4a;
    }
}
