package X;

import android.view.View;

/* renamed from: X.7BJ  reason: invalid class name */
public final class AnonymousClass7BJ implements AnonymousClass7BK {
    public final /* synthetic */ AnonymousClass7UC A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ C62320sa A02;

    public AnonymousClass7BJ(AnonymousClass7UC r1, C62320sa r2, C62320sa r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void DNH() {
        AnonymousClass782 r0;
        AnonymousClass7UC r1 = this.A00;
        View view = (View) r1.A04.invoke();
        if (view != null) {
            view.postDelayed(new C40872Akg(r1), 0);
        }
        if (((Boolean) this.A02.invoke()).booleanValue() && (r0 = (AnonymousClass782) this.A01.invoke()) != null) {
            r0.A01();
        }
    }
}
