package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.NKw  reason: case insensitive filesystem */
public final class C68503NKw extends C47567E8f {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68503NKw(04x r1, Integer num, Object obj, String str, int i, int i2) {
        super(r1, num, str, i);
        this.A00 = i2;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        Context requireContext;
        UserSession A02;
        2EG r1;
        String str;
        if (this.A00 != 0) {
            NJH njh = (NJH) this.A01;
            requireContext = njh.requireContext();
            A02 = AnonymousClass7TE.A0l(njh.A04);
            r1 = 2EG.A1V;
            str = "https://help.instagram.com/179379842258600";
        } else {
            NKF nkf = (NKF) this.A01;
            requireContext = nkf.requireContext();
            A02 = nkf.getSession();
            r1 = 2EG.A1V;
            str = "https://help.instagram.com/477434105621119/?helpref=hc_fnav";
        }
        Dbb.A0k(requireContext, A02, r1, str);
    }
}
