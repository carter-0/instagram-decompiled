package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.View;

public final class K05 extends AnonymousClass8GD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public K05(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void A01(Exception exc) {
        if (this.A00 == 0) {
            0qQ.A0B(exc, 0);
            0KC.A0F("IgLiveCameraCapturer", "Error starting camera preview", exc);
            C64112LOa lOa = (C64112LOa) this.A02;
            if (lOa.A04 != null) {
                C340307l3 r2 = lOa.A08;
                if (r2.Esr()) {
                    r2.Egd((SurfaceTexture) null, 0, 0);
                }
                r2.disconnect();
                lOa.A04 = null;
            }
            C18594Vul vul = (C18594Vul) this.A01;
            if (!lOa.A07) {
                exc = new RuntimeException(exc);
            }
            vul.A03(exc);
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        if (this.A00 != 0) {
            boolean CPy = ((C340307l3) this.A01).CPy();
            C57452Iaw iaw = (C57452Iaw) this.A02;
            if (iaw.A05.isShowing()) {
                View view = iaw.A04;
                Context context = view.getContext();
                int i = 2131974863;
                if (CPy) {
                    i = 2131974847;
                }
                DbU.A12(context, view, i);
                return;
            }
            return;
        }
        C343047pa r5 = (C343047pa) obj;
        0qQ.A0B(r5, 0);
        C64112LOa lOa = (C64112LOa) this.A02;
        lOa.A08.EWw((AnonymousClass8GD) null);
        C64112LOa.A00(r5, (C18594Vul) this.A01, lOa);
    }
}
