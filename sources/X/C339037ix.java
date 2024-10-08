package X;

import android.graphics.Bitmap;
import android.view.View;
import java.util.List;

/* renamed from: X.7ix  reason: invalid class name and case insensitive filesystem */
public final class C339037ix extends AnonymousClass3NK {
    public final /* synthetic */ C362048hG A00;
    public final /* synthetic */ boolean A01;

    public C339037ix(C362048hG r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void DP5(View view) {
        if (this.A01) {
            C362048hG r6 = this.A00;
            C362488hz r5 = r6.A0m;
            List Brk = r5.A08.A0H.Brk();
            int size = Brk.size();
            for (int i = 0; i < size; i++) {
                r5.A01(((AnonymousClass9SZ) 00k.A0I(Brk)).A01, (Bitmap) null);
            }
            r6.A0z.clear();
        }
        AnonymousClass2S0.A01.A05(10);
    }

    public final boolean Dqe(View view) {
        C362048hG r1 = this.A00;
        if (r1.A0m.A08.A0A) {
            r1.A0X();
        }
        r1.A10.A00();
        27p.A01(r1.A0c).A1Q(C59725JVj.PRE_CAPTURE, "GALLERY_MULTI_SELECT_BUTTON");
        return true;
    }
}
