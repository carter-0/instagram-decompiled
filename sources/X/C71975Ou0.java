package X;

/* renamed from: X.Ou0  reason: case insensitive filesystem */
public final class C71975Ou0 implements C232262tL {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "spam_folder_row";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C71975Ou0 ou0 = (C71975Ou0) obj;
        0qQ.A0B(ou0, 0);
        if (0qQ.A0K(this.A01, ou0.A01) && this.A00 == ou0.A00 && this.A02 == ou0.A02) {
            return true;
        }
        return false;
    }

    public C71975Ou0(String str, int i, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }
}
