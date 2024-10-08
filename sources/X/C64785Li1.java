package X;

/* renamed from: X.Li1  reason: case insensitive filesystem */
public final class C64785Li1 implements C232262tL {
    public final int A00;
    public final C262364Dk A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64785Li1 li1 = (C64785Li1) obj;
        0qQ.A0B(li1, 0);
        return 0qQ.A0K(this.A02, li1.A02);
    }

    public C64785Li1(C262364Dk r1, String str, int i) {
        AnonymousClass7TG.A1Q(str, r1);
        this.A00 = i;
        this.A02 = str;
        this.A01 = r1;
    }
}
