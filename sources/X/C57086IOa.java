package X;

import java.util.Arrays;

/* renamed from: X.IOa  reason: case insensitive filesystem */
public abstract class C57086IOa implements C232262tL {
    public final C53504Gpa A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C58511It6.A00);

    public boolean equals(Object obj) {
        if (!(obj instanceof C57086IOa) || !0qQ.A0K(this.A00, ((C57086IOa) obj).A00)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass7TE.A14(this.A01);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public C57086IOa(C53504Gpa gpa) {
        this.A00 = gpa;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
