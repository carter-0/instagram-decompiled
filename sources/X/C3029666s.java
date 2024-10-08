package X;

/* renamed from: X.66s  reason: invalid class name and case insensitive filesystem */
public final class C3029666s extends 0Yz<String> {
    public final /* synthetic */ C291265gs A00;

    public C3029666s(C291265gs r1) {
        this.A00 = r1;
    }

    public final int A08() {
        return this.A00.A01.groupCount() + 1;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return C3029666s.super.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        String group = this.A00.A01.group(i);
        if (group == null) {
            return "";
        }
        return group;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return C3029666s.super.indexOf(obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return C3029666s.super.lastIndexOf(obj);
    }
}
