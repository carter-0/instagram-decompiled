package X;

/* renamed from: X.38D  reason: invalid class name */
public final class AnonymousClass38D {
    public int A00 = -1;
    public Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final 0sK A05;
    public final 0sK A06;
    public final /* synthetic */ 1Wm A07;

    public AnonymousClass38D(Object obj, Object obj2, Object obj3, 0sK r5, 0sK r6, 1Wm r7) {
        this.A07 = r7;
        this.A03 = obj;
        this.A06 = r5;
        this.A05 = r6;
        this.A04 = obj2;
        this.A02 = obj3;
    }

    public final void A00() {
        AnonymousClass19L r4;
        Object obj = this.A01;
        1Wm r3 = this.A07;
        if (obj instanceof 139) {
            ((139) obj).A06((Throwable) null, r3.A04, this.A00);
        } else if ((obj instanceof AnonymousClass19L) && (r4 = (AnonymousClass19L) obj) != null) {
            r4.dispose();
        }
    }
}
