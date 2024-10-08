package X;

import android.content.Context;
import instagram.features.stories.fragment.ReelViewerFragment;

public final class EC4 extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ AnonymousClass6Z5 A02;
    public final /* synthetic */ boolean A03;

    public EC4(Context context, 1P0 r2, AnonymousClass6Z5 r3, boolean z) {
        this.A02 = r3;
        this.A00 = context;
        this.A03 = z;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, -1224932423);
        EC4.super.onFail(r4);
        if (!((ReelViewerFragment) this.A02.A17).A2q) {
            C59689JTv.A0E(this.A00, "onEffectSaveStateChanged_network_error");
            this.A01.onFail(r4);
        }
        AnonymousClass0fD.A0A(719247336, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1122018956);
        int A0D = AnonymousClass7TG.A0D(obj, 646415108);
        EC4.super.onSuccess(obj);
        if (!((ReelViewerFragment) this.A02.A17).A2q) {
            Context context = this.A00;
            int i = 2131972138;
            if (this.A03) {
                i = 2131972637;
            }
            C59689JTv.A07(context, i);
            this.A01.onSuccess(obj);
        }
        AnonymousClass0fD.A0A(-1734946373, A0D);
        AnonymousClass0fD.A0A(-358050151, A032);
    }
}
