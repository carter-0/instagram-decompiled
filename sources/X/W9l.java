package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;

public final class W9l implements View.OnClickListener {
    public final /* synthetic */ WWP A00;
    public final /* synthetic */ C230192p8 A01;
    public final /* synthetic */ C57251IUm A02;

    public W9l(WWP wwp, C230192p8 r2, C57251IUm iUm) {
        this.A01 = r2;
        this.A00 = wwp;
        this.A02 = iUm;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-684742364);
        C230192p8 r8 = this.A01;
        WWP wwp = this.A00;
        C57251IUm iUm = this.A02;
        C18496Vsr vsr = new C18496Vsr(r8.A02, r8.A03, wwp, r8.A04);
        vsr.A00 = new C17429VVi(wwp, r8, iUm);
        Fragment fragment = vsr.A02;
        Context context = fragment.getContext();
        if (context != null) {
            C358248ab r2 = new C358248ab(context);
            r2.A0l(fragment, vsr.A03);
            r2.A0e(new C18816W4d(vsr), C18496Vsr.A00(vsr));
            AnonymousClass7TH.A0a(r2, true);
        }
        AnonymousClass0fD.A0C(2136269720, A05);
    }
}
