package X;

import android.view.View;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.AOm  reason: case insensitive filesystem */
public final class C40030AOm implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ A64 A02;
    public final /* synthetic */ C334657be A03;

    public C40030AOm(AnonymousClass4DH r1, A64 a64, C334657be r3, float f) {
        this.A03 = r3;
        this.A02 = a64;
        this.A00 = f;
        this.A01 = r1;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        C14090Tph A002;
        view.removeOnLayoutChangeListener(this);
        C334657be r1 = this.A03;
        A64 a64 = this.A02;
        float f = this.A00;
        AnonymousClass4DH r3 = this.A01;
        C58188Ins ins = new C58188Ins(37, r3, r1);
        RoundedCornerFrameLayout roundedCornerFrameLayout = a64.A02;
        int height = roundedCornerFrameLayout.getHeight();
        int A04 = (int) 0nA.A04(r3.requireContext(), 12);
        float f2 = ((float) height) + f + ((float) A04);
        int A003 = AnonymousClass0nB.A00(r3.requireContext());
        C355148Ov r0 = r1.A02;
        boolean z = false;
        if (r0 != null) {
            i9 = AnonymousClass7TE.A0M(r0.A00().A01);
        } else {
            i9 = 0;
        }
        boolean A1R = AnonymousClass7TF.A1R(((f2 + ((float) i9)) > ((float) (A003 - 150)) ? 1 : ((f2 + ((float) i9)) == ((float) (A003 - 150)) ? 0 : -1)));
        float A042 = AnonymousClass7TE.A04(r1.A03.invoke());
        if (f < A042) {
            z = true;
        }
        roundedCornerFrameLayout.setTranslationY(f);
        if (A1R) {
            A002 = C334657be.A00(roundedCornerFrameLayout, ins, (float) (A003 - (((height + A04) + i9) + 150)));
        } else if (z) {
            A002 = C334657be.A00(roundedCornerFrameLayout, ins, A042);
        } else {
            ins.invoke();
            return;
        }
        A002.A02();
    }
}
