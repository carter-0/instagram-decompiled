package X;

import android.view.View;

/* renamed from: X.Ihs  reason: case insensitive filesystem */
public final class C57875Ihs implements Runnable {
    public final /* synthetic */ AnonymousClass3Y5 A00;
    public final /* synthetic */ GG4 A01;

    public C57875Ihs(AnonymousClass3Y5 r1, GG4 gg4) {
        this.A00 = r1;
        this.A01 = gg4;
    }

    public final void run() {
        Integer num;
        2V1 r3 = this.A00.A05;
        View A03 = r3.A03("clips_media_info_parent_component");
        Integer num2 = null;
        if (A03 != null) {
            num = Integer.valueOf(A03.getHeight());
        } else {
            num = null;
        }
        View A032 = r3.A03("clips_lithoview_parent_component");
        if (A032 != null) {
            num2 = Integer.valueOf(A032.getHeight());
        }
        if (num != null && num2 != null && num.intValue() >= num2.intValue() / 2) {
            GG4 gg4 = this.A01;
            C243533Zd r0 = GG4.A09;
            AnonymousClass3W1 r2 = gg4.A01;
            C51966G9m.A1N(r2.A3T, r2, false);
        }
    }
}
