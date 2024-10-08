package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.Ngw  reason: case insensitive filesystem */
public final class C69198Ngw extends C2806552w {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69198Ngw(NIU niu, String str, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = niu;
        this.A02 = str;
    }

    public final void onClick(View view) {
        Context context;
        UserSession userSession;
        String str;
        2EG r0;
        switch (this.A00) {
            case 0:
                NIU niu = (NIU) this.A01;
                context = niu.requireContext();
                userSession = AnonymousClass7TE.A0l(niu.A02);
                str = this.A02;
                r0 = 2EG.A3L;
                break;
            case 1:
                NIU niu2 = (NIU) this.A01;
                context = niu2.requireContext();
                userSession = AnonymousClass7TE.A0l(niu2.A02);
                str = this.A02;
                r0 = 2EG.A2s;
                break;
            case 2:
                NIU niu3 = (NIU) this.A01;
                context = niu3.requireContext();
                userSession = AnonymousClass7TE.A0l(niu3.A02);
                str = this.A02;
                r0 = 2EG.A3D;
                break;
            case 3:
                NIU niu4 = (NIU) this.A01;
                context = niu4.requireContext();
                userSession = AnonymousClass7TE.A0l(niu4.A02);
                str = this.A02;
                r0 = 2EG.A2f;
                break;
            case 4:
                NIU niu5 = (NIU) this.A01;
                context = niu5.requireContext();
                userSession = AnonymousClass7TE.A0l(niu5.A02);
                str = this.A02;
                r0 = 2EG.A0L;
                break;
            default:
                C49906FEe fEe = SimpleWebViewActivity.A02;
                C68458NIw nIw = (C68458NIw) this.A01;
                C49906FEe.A01(nIw.requireContext(), DbT.A0X(nIw.A08), fEe, new C11225SFz("https://about.meta.com/actions/safety/topics/safety-basics/tools/stay-safe"), this.A02);
                return;
        }
        Dbb.A0k(context, userSession, r0, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69198Ngw(C68458NIw nIw, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = nIw;
        this.A02 = str;
    }
}
