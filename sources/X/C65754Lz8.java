package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Lz8  reason: case insensitive filesystem */
public final class C65754Lz8 implements C262944Gp {
    public final int A00;
    public final Object A01;

    public C65754Lz8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void Cv6(float f) {
        switch (this.A00) {
            case 1:
                C68467NJf.A01((C68467NJf) this.A01);
                return;
            case 3:
                AnonymousClass6ZA r0 = ((C46498Dg1) this.A01).A03;
                if (r0 != null) {
                    r0.CtS();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void D4N() {
    }

    public final void D9d() {
        switch (this.A00) {
            case 0:
                ((Runnable) this.A01).run();
                return;
            case 2:
                C51967G9n.A0w(-1, (0sP) this.A01);
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void DHB(Integer num) {
        FragmentActivity fragmentActivity;
        if (4 - this.A00 == 0) {
            0qQ.A0B(num, 0);
            AnonymousClass37E r1 = AnonymousClass37D.A00;
            C331157Pu r0 = ((C64839Lj1) this.A01).A01;
            if (r0 != null) {
                fragmentActivity = r0.A03.getActivity();
            } else {
                fragmentActivity = null;
            }
            AnonymousClass37D A012 = r1.A01(fragmentActivity);
            if (A012 != null) {
                ((AnonymousClass37F) A012).A0N = true;
            }
        }
    }

    public final /* synthetic */ void DYG(int i, int i2) {
        if (2 - this.A00 == 0) {
            C51967G9n.A0w(i, (0sP) this.A01);
        }
    }

    public final /* synthetic */ void D4O(Integer num) {
    }

    public final /* synthetic */ void Dx6(C61065Jw3 jw3) {
    }

    public final /* synthetic */ void Cv7(Integer num, float f) {
    }
}
