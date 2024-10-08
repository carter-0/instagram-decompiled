package X;

public final class NPG extends AnonymousClass4AA {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NPG) && 0qQ.A0K(this.A00, ((NPG) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        NPG npg = (NPG) obj;
        String str2 = this.A00;
        if (npg != null) {
            str = npg.A00;
        } else {
            str = null;
        }
        return 0qQ.A0K(str2, str);
    }

    public NPG(String str) {
        this.A00 = str;
    }
}
