package X;

/* renamed from: X.VjK  reason: case insensitive filesystem */
public final class C17982VjK {
    public int A00;
    public final C365358my A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17982VjK) || ((C17982VjK) obj).A01.getTextureId() != this.A01.getTextureId()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.getTextureId();
    }

    public C17982VjK(C365358my r1, String str) {
        this.A02 = str;
        this.A01 = r1;
    }
}
