package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import java.util.Map;

public final class ER3 extends C46676Dj5 {
    public final /* synthetic */ E4A A00;

    public ER3(E4A e4a) {
        this.A00 = e4a;
    }

    public final void onClick(View view) {
        E4A e4a = this.A00;
        0lg A0X = DbT.A0X(e4a.A01);
        0qQ.A0B(A0X, 1);
        String A002 = C273654mx.A00(132);
        String A16 = AnonymousClass7TE.A16(e4a.requireContext(), 2131952193);
        Bundle A0a = AnonymousClass7TE.A0a();
        IgBloksScreenConfig A0N = DbS.A0N(A0X);
        A0N.A0U = A16;
        IgBloksScreenConfig.A04(A0a, A0N, false);
        C46645DiQ.A02(A0a, new C46645DiQ((SparseArray) null, (Object) null, A002, (String) null, (String) null, (HashMap) null, AnonymousClass7TE.A1C(), (Map) null, (Map) null, (Map) null, 0, false), false);
        DbU.A1K(e4a, Dba.A0K(e4a.requireActivity(), A0a, A0X, ModalActivity.class, "bloks"));
    }
}
