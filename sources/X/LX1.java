package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.TransparentModalActivity;

public final class LX1 implements View.OnClickListener {
    public final /* synthetic */ K7O A00;

    public LX1(K7O k7o) {
        this.A00 = k7o;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1537242073);
        K7O k7o = this.A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("camera_entry_point", 28D.A4n);
        A0a.putBoolean(C273654mx.A00(593), true);
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(k7o.requireActivity(), A0a, DbT.A0X(k7o.A01), TransparentModalActivity.class, "attribution_quick_camera_fragment");
        Dbc.A0y(A02);
        DbT.A1L(k7o, A02);
        AnonymousClass0fD.A0C(-1789833250, A05);
    }
}
