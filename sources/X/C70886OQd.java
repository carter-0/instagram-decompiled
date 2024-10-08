package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OQd  reason: case insensitive filesystem */
public abstract class C70886OQd {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (X.C66582MXn.A1Q(r11) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r9, androidx.fragment.app.FragmentActivity r10, com.instagram.common.session.UserSession r11, X.C74419PuZ r12, java.lang.String r13) {
        /*
            r4 = 1
            r6 = r9
            X.8ab r2 = X.DbS.A0Y(r9)
            r2.A05 = r13
            r2.A0r(r4)
            r2.A0s(r4)
            X.Oen r0 = new X.Oen
            r8 = r12
            r0.<init>(r12, r4)
            r2.A0B(r0)
            r7 = r11
            com.instagram.api.schemas.BizUserInboxState r1 = X.C66582MXn.A0L(r11)
            com.instagram.api.schemas.BizUserInboxState r0 = com.instagram.api.schemas.BizUserInboxState.GENERAL_FOLDER_THROTTLED
            if (r1 != r0) goto L_0x0027
            boolean r0 = X.C66582MXn.A1Q(r11)
            r9 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r9 = 0
        L_0x0028:
            X.2EU r0 = X.AnonymousClass2EU.A00
            java.lang.String r1 = X.C66786McX.A00(r6, r11, r0)
            r0 = 67
            X.OgE r0 = X.C71249OgE.A00(r12, r0)
            r2.A0d(r0, r1)
            X.2EL r0 = X.AnonymousClass2EL.A00
            java.lang.String r0 = X.C66786McX.A00(r6, r11, r0)
            X.FIg r3 = new X.FIg
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.A0a(r3, r0)
            X.DbT.A1V(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70886OQd.A00(android.content.Context, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.PuZ, java.lang.String):void");
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, 2EM r9, C74419PuZ puZ) {
        Integer num;
        String str;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        boolean A1X = DbW.A1X(fragmentActivity);
        if (r9.A01 == 2EN.A05) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A0N;
        }
        NIP nip = new NIP();
        Bundle A0a = AnonymousClass7TE.A0a();
        if (2 - num.intValue() != 0) {
            str = "accept_request";
        } else {
            str = "move_thread";
        }
        A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        nip.setArguments(A0a);
        nip.A02 = r9;
        nip.A03 = new C74185PqR(48, (Object) fragmentActivity2, (Object) puZ);
        1Ng A00 = AnonymousClass1Nd.A00(userSession);
        A00.A04("MOVE_THREADS_TO_NEW_FOLDER_LISTENER_TAG");
        A00.A03(C71932OtG.A00(puZ, 36), C71899Osh.class, "MOVE_THREADS_TO_NEW_FOLDER_LISTENER_TAG");
        List A0E = 2L2.A00(userSession).A0C.A0E();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0E) {
            if (next instanceof 2Ej) {
                A1C.add(next);
            }
        }
        boolean A1T = AnonymousClass7TF.A1T(A1C.size(), 5);
        C331127Pr A0W = DbS.A0W(userSession);
        DbZ.A0z(fragmentActivity2, A0W, 2131964253);
        C331137Ps A0h = C51971G9r.A0h(A1X ? 1 : 0);
        A0h.A02 = R.drawable.plus_24;
        A0h.A05 = new C71355OjA(4, fragmentActivity2, num, userSession, A1T);
        A0W.A07(A0h.A00());
        DbU.A0y(fragmentActivity2, nip, A0W);
    }
}
