package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.WdW  reason: case insensitive filesystem */
public final class C19668WdW implements X59 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass80D A01;

    public C19668WdW(View view, AnonymousClass80D r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void Dba(C18078Vl7 vl7) {
        0qQ.A0B(vl7, 0);
        AnonymousClass80D r2 = this.A01;
        UserSession userSession = r2.A0S;
        0qQ.A07(userSession);
        0Tu r5 = 0Tu.A05;
        vl7.A0B.EUu((int) 182.A01(r5, userSession, 36597716980730769L));
        UserSession userSession2 = r2.A0S;
        0qQ.A07(userSession2);
        vl7.A0B.Eph(182.A06(r5, userSession2, 36316242003759262L));
        1pd A002 = C362988ir.A00();
        0qQ.A07(r2.A0S);
        C20984X7z x7z = A002.A01;
        if (x7z != null) {
            W2Q Boy = x7z.Boy();
            vl7.A09 = Boy;
            vl7.A0B.EVx(Boy);
        }
        1pd A003 = C362988ir.A00();
        0qQ.A07(r2.A0S);
        X74 x74 = A003.A02;
        if (x74 != null) {
            X8J Boz = x74.Boz();
            vl7.A0A = Boz;
            vl7.A0B.EfY(Boz);
        }
        1pd A004 = C362988ir.A00();
        0qQ.A07(r2.A0S);
        X73 x73 = A004.A00;
        if (x73 != null) {
            C20994X8r Box = x73.Box();
            vl7.A08 = Box;
            vl7.A0B.ESq(Box);
        }
        C63040xi r4 = 0tS.A4E;
        if (r4.A00().A0e()) {
            C66532MVm mVm = C362988ir.A00().A03;
            if (mVm != null) {
                UserSession userSession3 = r2.A0S;
                0qQ.A07(userSession3);
                C20845X0w CrI = mVm.CrI(this.A00, userSession3, R.id.sup_camera_capture_debug_stub);
                vl7.A07 = CrI;
                XBm xBm = vl7.A0B;
                xBm.FJG();
                xBm.Elu(CrI);
                0tS A005 = r4.A00();
                vl7.A0B.ARg(AnonymousClass7TG.A1a(A005, A005.A1t, 0tS.A4G, 227));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
