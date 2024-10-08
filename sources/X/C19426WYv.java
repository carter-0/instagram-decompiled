package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.WYv  reason: case insensitive filesystem */
public final class C19426WYv implements C66494MTx {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ U92 A01;

    public final void DWl(C346927vz r11) {
        Object value;
        ULF ulf;
        C346927vz r0 = C346927vz.GRANTED;
        U92 u92 = this.A01;
        if (r11 == r0) {
            U92.A02(this.A00, u92);
            return;
        }
        05G r2 = u92.A02.A04;
        do {
            value = r2.getValue();
            ulf = (ULF) value;
        } while (!r2.AIY(value, ULF.A00(ulf.A03, ulf.A02, ulf.A05, ulf.A04, ulf.A00, ulf.A01, false)));
    }

    public final boolean Eso() {
        return true;
    }

    public C19426WYv(FragmentActivity fragmentActivity, U92 u92) {
        this.A01 = u92;
        this.A00 = fragmentActivity;
    }
}
