package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.AYw  reason: case insensitive filesystem */
public final class C40281AYw implements C41815B1v {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C40281AYw(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void DOX() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass8QN) this.A01).A07((AnonymousClass8QZ) this.A02);
                return;
            case 1:
                ((C321016tR) this.A01).A08();
                ((C62320sa) this.A02).invoke();
                return;
            case 2:
                ((AnonymousClass4D7) this.A01).resumeWith(this.A02);
                return;
            default:
                0rm r2 = (0rm) this.A02;
                C11099SAa.A00((Drawable) r2.A00, (C13499TbQ) this.A01);
                ((C268684dp) r2.A00).EE1(this);
                return;
        }
    }

    public final void DXr() {
    }
}
