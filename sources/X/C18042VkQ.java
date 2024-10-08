package X;

/* renamed from: X.VkQ  reason: case insensitive filesystem */
public final class C18042VkQ {
    public final V4A A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    public C18042VkQ(V4A v4a, Object obj, Throwable th, boolean z) {
        String localizedMessage;
        String str = null;
        if (th != null && ((((localizedMessage = th.getLocalizedMessage()) != null && !localizedMessage.isEmpty()) || (localizedMessage = th.getMessage()) != null) && !localizedMessage.isEmpty())) {
            str = localizedMessage;
        }
        this.A03 = z;
        this.A02 = str;
        this.A01 = obj;
        this.A00 = v4a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C18042VkQ vkQ = (C18042VkQ) obj;
            if (this.A03 == vkQ.A03) {
                String str = this.A02;
                String str2 = vkQ.A02;
                if (str == null ? str2 == null : str.equals(str2)) {
                    return this.A01.equals(vkQ.A01);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, (((this.A03 ? 1 : 0) * true) + JTR.A0G(this.A02)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ViewModelHolder{mValue=");
        sb.append(this.A01);
        sb.append(", mLoading=");
        sb.append(this.A03);
        sb.append(", mErrorMessage='");
        sb.append(this.A02);
        sb.append('\'');
        return Pxg.A0x(sb);
    }
}
