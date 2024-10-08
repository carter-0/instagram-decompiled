package X;

/* renamed from: X.WRy  reason: case insensitive filesystem */
public final class C19265WRy implements C232262tL {
    public final int A00;
    public final String A01;

    public C19265WRy(int i, String str) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19265WRy wRy = (C19265WRy) obj;
        0qQ.A0B(wRy, 0);
        return 0qQ.A0K(this.A01, wRy.A01);
    }
}
