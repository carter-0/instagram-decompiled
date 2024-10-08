package X;

import android.view.View;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;

/* renamed from: X.8PG  reason: invalid class name */
public final class AnonymousClass8PG implements AnonymousClass3NL {
    public final /* synthetic */ C355048Oj A00;

    public AnonymousClass8PG(C355048Oj r1) {
        this.A00 = r1;
    }

    public final void DP5(View view) {
        AnonymousClass8BA r3 = this.A00.A0q.A00;
        AnonymousClass89Y r2 = r3.A0D;
        C314676if r1 = r3.A1c;
        if (r2 == r1.get()) {
            AnonymousClass8O4 r32 = (AnonymousClass8O4) r1.get();
            if (AnonymousClass8O4.A08(r32)) {
                GLDrawingView gLDrawingView = AnonymousClass8O4.A00(r32).A00;
                C41092AoE aoE = new C41092AoE(gLDrawingView, (Runnable) null);
                C20565Wui wui = gLDrawingView.A05;
                if (wui != null) {
                    wui.A07(aoE);
                }
                r32.A0E(AnonymousClass05K.A0C);
                return;
            }
            return;
        }
        AnonymousClass89Y r22 = r3.A0D;
        C314676if r12 = r3.A1b;
        if (r22 == r12.get()) {
            C40317AaC aaC = (C40317AaC) r12.get();
            aaC.A03.A04();
            01W r0 = aaC.A08;
            0eP r13 = (0eP) r0.A0P();
            if (r13 != null) {
                r0.clear();
                C40317AaC.A00(aaC);
                if (((Boolean) r13.A01).booleanValue()) {
                    C40317AaC.A02(aaC, false);
                } else {
                    C40317AaC.A01(aaC, (TextColorScheme) r13.A00, false, true);
                }
            }
        }
    }

    public final boolean Dqe(View view) {
        AnonymousClass8BA r3 = this.A00.A0q.A00;
        AnonymousClass89Y r2 = r3.A0D;
        C314676if r1 = r3.A1c;
        if (r2 == r1.get()) {
            ((AnonymousClass8O4) r1.get()).A0B();
            return true;
        }
        AnonymousClass89Y r22 = r3.A0D;
        C314676if r12 = r3.A1b;
        if (r22 != r12.get()) {
            return true;
        }
        C40317AaC aaC = (C40317AaC) r12.get();
        aaC.A03.A04();
        0eP r13 = (0eP) aaC.A08.A0T();
        if (r13 == null) {
            return true;
        }
        C40317AaC.A00(aaC);
        if (((Boolean) r13.A01).booleanValue()) {
            C40317AaC.A02(aaC, false);
            return true;
        }
        C40317AaC.A01(aaC, (TextColorScheme) r13.A00, false, true);
        return true;
    }
}
