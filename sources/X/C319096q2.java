package X;

/* renamed from: X.6q2  reason: invalid class name and case insensitive filesystem */
public final class C319096q2 implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass2gO A00;

    public C319096q2(AnonymousClass2gO r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass88W r3 = (AnonymousClass88W) obj;
        if (r3 != null && !r3.A00) {
            r3.A00 = true;
            Object obj2 = r3.A01;
            if (obj2 != null) {
                this.A00.onChanged(obj2);
            }
        }
    }
}
