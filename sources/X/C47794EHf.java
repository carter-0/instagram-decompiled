package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.EHf  reason: case insensitive filesystem */
public final class C47794EHf extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;

    public C47794EHf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DP5(View view) {
        switch (this.A00) {
            case 3:
            case 6:
                return;
            default:
                super.DP5(view);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v40, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final boolean Dqe(View view) {
        0sP r1;
        Object obj;
        AnonymousClass6VJ r0;
        View view2 = view;
        switch (this.A00) {
            case 0:
                C47247DtY dtY = (C47247DtY) this.A01;
                r1 = dtY.A01;
                obj = dtY.A00;
                break;
            case 1:
                C47248DtZ dtZ = (C47248DtZ) this.A01;
                r1 = dtZ.A01;
                obj = dtZ.A00;
                break;
            case 2:
                return false;
            case 3:
                F1A f1a = (F1A) this.A01;
                String str = f1a.A02;
                C49546Exh exh = f1a.A00;
                if (exh == null || str == null) {
                    return false;
                }
                exh.A02.DcJ(exh.A01, str, exh.A00);
                return true;
            case 4:
                0qQ.A0B(view2, 0);
                if (!view2.isEnabled()) {
                    return false;
                }
                view2.performHapticFeedback(3);
                E1G e1g = (E1G) this.A01;
                Bundle A0A = DbS.A0A(0);
                AnonymousClass6W8 A02 = AnonymousClass6W8.A02(e1g.getActivity(), A0A, DbT.A0X(e1g.A08), TransparentModalActivity.class, "quick_snap_camera");
                A02.A07();
                DbT.A1M(e1g, A02);
                return true;
            case 5:
                0qQ.A0B(view2, 0);
                if (!view2.isEnabled()) {
                    return false;
                }
                view2.performHapticFeedback(3);
                C68478NJv nJv = (C68478NJv) this.A01;
                AnonymousClass0eM r02 = nJv.A0L;
                NKM A002 = C70139Nxt.A00(AnonymousClass7TE.A0l(r02), (String) null, (String) null, AnonymousClass7TE.A1C(), -2, 0, 0, 0, true, false);
                C331127Pr A0f = DbX.A0f(r02);
                DbS.A1S(A0f, true);
                A0f.A0T = new C65738Lys(nJv, 6);
                C331157Pu A003 = A0f.A00();
                A002.A01 = new FbH(view2, A003, nJv);
                DbU.A1I(nJv, A002, A003);
                C68478NJv.A03(nJv).A03(false);
                return true;
            case 6:
                C50900Fkf fkf = (C50900Fkf) this.A01;
                String str2 = fkf.A03;
                C49525Ex5 ex5 = fkf.A02;
                if (ex5 == null || str2 == null) {
                    return false;
                }
                E6a e6a = ex5.A01;
                C50900Fkf fkf2 = ex5.A00;
                AnonymousClass0eM r2 = e6a.A07;
                Reel A0L = Dba.A0L(AnonymousClass7TE.A0l(r2), str2);
                if (A0L == null) {
                    return true;
                }
                AnonymousClass6VJ r12 = e6a.A01;
                if (r12 != null) {
                    r12.A05(AnonymousClass05K.A0Y);
                }
                ArrayList A14 = DbV.A14(A0L);
                AnonymousClass32A r4 = e6a.A00;
                if (r4 == null) {
                    r4 = new AnonymousClass32A(e6a, AnonymousClass7TE.A0l(r2), DbV.A0f(e6a));
                    e6a.A00 = r4;
                }
                r4.A0C = e6a.A06;
                C50896Fkb.A00(e6a.getRootActivity(), 0nA.A0F(fkf2.A0B), r4, e6a, 13);
                r4.A05(A0L, E6a.A08, fkf2, (List) null, A14, A14);
                AnonymousClass32A r03 = e6a.A00;
                if (r03 != null) {
                    r0 = r03.A07;
                } else {
                    r0 = null;
                }
                e6a.A01 = r0;
                fkf2.A01 = r0;
                return true;
            default:
                return super.Dqe(view2);
        }
        r1.invoke(obj);
        return true;
    }
}
