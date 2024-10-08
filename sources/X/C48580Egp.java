package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;
import com.instagram.user.model.User;

/* renamed from: X.Egp  reason: case insensitive filesystem */
public abstract class C48580Egp {
    public static final Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        User user;
        C276544tV A0M = DbW.A0M(r13, 0);
        0qQ.A0C(r13.A02(), "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        if (A0M != null) {
            String A0D = A0M.A0D();
            String A0I = A0M.A0I();
            EtL etL = (EtL) C276544tV.A00(A0M, 40);
            String A0G = A0M.A0G();
            String A0J = A0M.A0J();
            if (!(etL == null || (user = etL.A00) == null || A0I == null || A0D == null)) {
                FundraiserSharedToLive fundraiserSharedToLive = new FundraiserSharedToLive(user, A0D, A0I, A0G, A0J);
                FragmentActivity A04 = C308206Td.A04(r12);
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putParcelable(C273654mx.A00(22), C358098aM.A00(AnonymousClass80L.A00, new C358088aL[0]));
                A0a.putSerializable("camera_entry_point", 28D.A2t);
                A0a.putParcelable(AnonymousClass000.A00(4034), fundraiserSharedToLive);
                Dba.A0l(A04, A0a, C308206Td.A0B(r12), "attribution_quick_camera_fragment");
            }
        }
        return null;
    }
}
