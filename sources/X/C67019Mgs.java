package X;

/* renamed from: X.Mgs  reason: case insensitive filesystem */
public final class C67019Mgs implements C232262tL {
    public final String A00;
    public final String A01;

    public C67019Mgs(String str, String str2) {
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C67019Mgs mgs = (C67019Mgs) obj;
        0qQ.A0B(mgs, 0);
        return 0qQ.A0K(this.A01, mgs.A01);
    }
}
