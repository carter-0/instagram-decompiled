package X;

import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.List;

/* renamed from: X.UTq  reason: case insensitive filesystem */
public final class C15165UTq extends C232922uf {
    public final int A00;
    public final Object A01;

    public C15165UTq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DmC(2cs r13) {
        switch (this.A00) {
            case 0:
                Dialog dialog = ((C11508SbV) this.A01).A02.A01;
                if (dialog != null) {
                    dialog.cancel();
                    return;
                }
                return;
            case 2:
                int i = (r13.A09.A00 > 1.0d ? 1 : (r13.A09.A00 == 1.0d ? 0 : -1));
                C15695Uh1 uh1 = (C15695Uh1) this.A01;
                if (i != 0) {
                    C15695Uh1.A01(r13, uh1);
                    return;
                } else if (uh1.A0A == AnonymousClass05K.A0C) {
                    uh1.A0A = AnonymousClass05K.A0N;
                    C289875eN r0 = uh1.A05;
                    if (r0 != null) {
                        r0.DWX();
                    }
                    JTR.A1B(uh1.A06.A05);
                    AnonymousClass1Po.A00.A00();
                    if (C15695Uh1.A00(uh1.A04, uh1.A00).CeS()) {
                        AnonymousClass3W1 BQr = uh1.BQr(uh1.A04);
                        boolean z = BQr.A2H;
                        uh1.A0M.A0R(uh1.A04, uh1, uh1.A06.A09, new C263414Lx(), uh1.A01, uh1.A00, BQr.A01(), true, z);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 3:
                ((C18561VuD) this.A01).A01.CvD();
                return;
            case 4:
                C15690Ugv ugv = (C15690Ugv) this.A01;
                List list = C15690Ugv.A0U;
                if (ugv.A09 == AnonymousClass05K.A0Y) {
                    C15690Ugv.A00(ugv);
                    return;
                }
                return;
            default:
                super.DmC(r13);
                return;
        }
    }

    public final void DmE(2cs r8) {
        switch (this.A00) {
            case 1:
                float A002 = 0mi.A00((float) r8.A09.A00, 0.0f, 1.0f);
                C19204WPk wPk = (C19204WPk) this.A01;
                View view = wPk.A0A;
                view.setAlpha(A002);
                int i = 0;
                view.setVisibility(JTQ.A01((A002 > 0.0f ? 1 : (A002 == 0.0f ? 0 : -1))));
                float f = 1.0f - A002;
                View view2 = wPk.A0B;
                view2.setAlpha(f);
                int i2 = 4;
                if (f > 0.0f) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                FrameLayout frameLayout = wPk.A0D;
                frameLayout.setAlpha(f);
                if (f <= 0.0f) {
                    i = 4;
                }
                frameLayout.setVisibility(i);
                return;
            case 2:
                C15695Uh1 uh1 = (C15695Uh1) this.A01;
                double d = r8.A09.A00;
                Integer num = uh1.A0A;
                if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0C) {
                    LinearLayout linearLayout = uh1.A06.A05;
                    float f2 = (float) d;
                    uh1.A02.setAlpha(f2);
                    float f3 = (f2 * 0.19999999f) + 0.8f;
                    linearLayout.setScaleX(f3);
                    linearLayout.setScaleY(f3);
                    uh1.A02.setVisibility(0);
                    return;
                }
                return;
            case 4:
                0qQ.A0B(r8, 0);
                C15690Ugv.A02((C15690Ugv) this.A01, r8.A09.A00);
                return;
            default:
                super.DmE(r8);
                return;
        }
    }
}
