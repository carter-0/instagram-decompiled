package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.Rgu  reason: case insensitive filesystem */
public abstract class C9798Rgu {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        C276544tV r1;
        List list = r9.A00;
        if (list.size() == 2 && (r1 = (C276544tV) AnonymousClass7TE.A13(list)) != null) {
            Fragment A0H = DbU.A0H(r8);
            Context requireContext = A0H.requireContext();
            C277014uI A0A = r1.A0A(41);
            C277014uI A08 = r1.A08();
            String A0G = r1.A0G();
            if (A0G == null || A0G.equals("take_photo")) {
                SFS sfs = new SFS(requireContext, A0H, new C10621RvF(r8, A08, A0A), r8);
                0lg A0R = DbW.A0R(r8);
                Context context = sfs.A03;
                if (1DL.A07(context, "android.permission.CAMERA")) {
                    SFS.A00(sfs);
                    return null;
                }
                JTP.A11((Activity) context, new C64729Lh6(11, sfs, A0R), "android.permission.CAMERA");
                return null;
            }
            SFH sfh = new SFH(requireContext, A0H, new C10620RvE(r8, A08, A0A), r8);
            Context context2 = sfh.A02;
            if (C2604245p.A03(context2)) {
                SFH.A00(sfh);
            } else {
                C2604245p.A01((Activity) context2, new C64727Lh4(sfh, 7));
                return null;
            }
        }
        return null;
    }
}
