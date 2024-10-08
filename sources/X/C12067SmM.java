package X;

/* renamed from: X.SmM  reason: case insensitive filesystem */
public final class C12067SmM implements C13419Ta0 {
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[ ");
        A1A.append(C51968G9o.A16(this));
        A1A.append(" dontSuspendDuringScroll: ");
        A1A.append(this.A00);
        A1A.append(" ignoreNativeAllocs: ");
        A1A.append(this.A02);
        A1A.append(" ignoreBackgroundGcs: ");
        A1A.append(this.A01);
        return AnonymousClass7TF.A0l(" ]", A1A);
    }
}
