package X;

/* renamed from: X.OuK  reason: case insensitive filesystem */
public abstract class C71986OuK implements C232262tL, C328627Fn, AnonymousClass7FW {
    public final C328607Fl A00;
    public final C328687Ft A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public C71986OuK(C328607Fl r1, C328687Ft r2, String str) {
        AnonymousClass7TG.A1Q(r2, r1);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
