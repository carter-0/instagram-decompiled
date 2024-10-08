package X;

public final class NPH extends AnonymousClass4AA {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NPH) && 0qQ.A0K(this.A00, ((NPH) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        NPH nph = (NPH) obj;
        String str2 = this.A00;
        if (nph != null) {
            str = nph.A00;
        } else {
            str = null;
        }
        return 0qQ.A0K(str2, str);
    }

    public NPH(String str) {
        this.A00 = str;
    }
}
