package X;

import android.content.Context;
import android.view.View;

public final /* synthetic */ class IBX implements View.OnClickListener {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C55835HoI A02;

    public /* synthetic */ IBX(1P0 r1, 1Xj r2, C55835HoI hoI) {
        this.A02 = hoI;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        C55835HoI hoI = this.A02;
        1Xj r5 = this.A01;
        1P0 r6 = this.A00;
        Context requireContext = hoI.A00.requireContext();
        C358248ab A0Y = DbS.A0Y(requireContext);
        A0Y.A04();
        A0Y.A09(2131971984);
        A0Y.A08(2131971982);
        A0Y.A0I(new I90(6, (Object) requireContext, (Object) r5, (Object) r6, (Object) hoI), 2131971983);
        DbX.A16(C56719I8z.A00(hoI, 32), A0Y);
    }
}
