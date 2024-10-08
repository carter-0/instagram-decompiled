package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.release.buildinfo.BuildInfoStore;

/* renamed from: X.9FM  reason: invalid class name */
public final class AnonymousClass9FM {
    public final int A00;
    public final 0xa A01;
    public final BuildInfoStore A02;
    public final AnonymousClass9FK A03;
    public final 0b6 A04;

    public AnonymousClass9FM(0b6 r2, 0xa r3, BuildInfoStore buildInfoStore, AnonymousClass9FK r5, int i) {
        0qQ.A0B(buildInfoStore, 1);
        this.A02 = buildInfoStore;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r2;
        this.A00 = i;
    }

    public final void A00(Context context) {
        0qQ.A0B(context, 0);
        AnonymousClass9J7 r4 = this.A02.A01;
        0xY AR4 = this.A01.AR4();
        AR4.E5Z(AnonymousClass000.A00(2428), r4.A01);
        AR4.apply();
        this.A03.A00("direct_download");
        this.A04.A0A().A0G(context, new Intent("android.intent.action.VIEW", 0cp.A03(r4.A03)));
    }

    public final void A01(Context context, boolean z) {
        String str;
        if (z) {
            str = "https://fburl.com/mobile_builds/lns0ufoc";
        } else {
            str = "https://fburl.com/mobile_builds/akmu1kq4";
        }
        this.A03.A00("mobile_builds_deep_link");
        this.A04.A0A().A0G(context, new Intent("android.intent.action.VIEW", 0cp.A03(str)));
    }
}
