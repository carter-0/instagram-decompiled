package X;

import android.view.View;

/* renamed from: X.Ljd  reason: case insensitive filesystem */
public final class C64877Ljd implements C252293os {
    public final /* synthetic */ AnonymousClass07Z A00;
    public final /* synthetic */ C313056fm A01;
    public final /* synthetic */ AnonymousClass6SX A02;

    public final boolean CsC() {
        return true;
    }

    public final /* synthetic */ void DW9(int i, int i2, boolean z) {
    }

    public final /* synthetic */ void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final /* synthetic */ void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final /* synthetic */ void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final /* synthetic */ void DzE(View view) {
    }

    public C64877Ljd(AnonymousClass07Z r1, C313056fm r2, AnonymousClass6SX r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void DVx(int i, int i2) {
        C316026kz r2;
        C313056fm r1 = this.A01;
        View A0D = ((C313046fl) r1).A04.A0D(i);
        if (A0D != null) {
            AnonymousClass07Z r0 = this.A00;
            C64311LZl lZl = new C64311LZl(r0, r1, i);
            AnonymousClass07V lifecycle = r0.getLifecycle();
            0h9 r5 = lZl.A00;
            0qQ.A0B(lifecycle, 0);
            VX9 A002 = C64072LLq.A00(lifecycle);
            int hashCode = r5.hashCode();
            C64072LLq.A00.put(Integer.valueOf(hashCode), A002);
            r5.A09(new LZY(hashCode));
            AnonymousClass6SX r12 = this.A02;
            Object tag = A0D.getTag();
            if (tag instanceof C316026kz) {
                r2 = (C316026kz) tag;
            } else {
                r2 = null;
            }
            if (!0qQ.A0K(r2, r12.A00)) {
                r12.A00 = r2;
                for (0sL invoke : r12.A02.A00) {
                    invoke.invoke(lZl, r2);
                }
            }
        }
    }
}
