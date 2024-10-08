package X;

import android.view.View;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Oil  reason: case insensitive filesystem */
public final /* synthetic */ class C71336Oil implements View.OnClickListener {
    public final /* synthetic */ C329067Hl A00;
    public final /* synthetic */ C70830ONc A01;
    public final /* synthetic */ DirectThreadKey A02;

    public /* synthetic */ C71336Oil(C329067Hl r1, C70830ONc oNc, DirectThreadKey directThreadKey) {
        this.A00 = r1;
        this.A02 = directThreadKey;
        this.A01 = oNc;
    }

    public final void onClick(View view) {
        C329067Hl r0 = this.A00;
        DirectThreadKey directThreadKey = this.A02;
        C70981OUg.A00.A00(r0.A1Z, r0.A0W, this.A01, directThreadKey);
    }
}
