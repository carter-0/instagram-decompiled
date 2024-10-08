package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.LHx  reason: case insensitive filesystem */
public abstract class C63997LHx {
    public static void A00(Fragment fragment, UserSession userSession, C3499582p r12, AnonymousClass3Q2 r13, String str) {
        float A01;
        String str2;
        UserSession userSession2 = userSession;
        if (!r13.A0u()) {
            0xI A00 = C59882Jb5.A00(AnonymousClass05K.A0A);
            if (r13.A12()) {
                str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
            } else {
                str2 = "image";
            }
            A00.A0C("media_type", str2);
            A00.A09("is_draft", true);
            A00.A0C(AnonymousClass000.A00(1145), r13.A3J);
            DbU.A1R(A00, userSession);
        }
        if (r13.A0E() == ShareType.CLIPS_PANAVIDEO) {
            27p.A01(userSession).A1p(r13.A3t);
            String A0g = AnonymousClass7TF.A0g(userSession);
            AnonymousClass8A2 A012 = AnonymousClass8A1.A01(userSession);
            if (A0g == null) {
                A0g = "";
            }
            A012.A0G(A0g);
            27p.A01(userSession);
            HWL.A00(fragment.requireContext(), userSession, AnonymousClass05K.A1F).A02(fragment.getViewLifecycleOwner(), r13.A3t, new MBK(userSession, 3));
            C243473Yx.A04(fragment.requireActivity(), fragment, userSession2, (PendingRecipient) null, r13.A3t, str, false, false);
            return;
        }
        C3499682q A002 = r12.A00();
        CreationSession creationSession = ((JWE) A002).A01;
        creationSession.A06();
        creationSession.A02 = r13.A0K;
        creationSession.A0I = true;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (r13.A0u()) {
            A002.EOM(r13.A35);
            AnonymousClass3Q2 A03 = 28K.A00(userSession).A03(AnonymousClass7TE.A19(r13.A0M(), 0));
            A03.getClass();
            if (A03.A12()) {
                A01 = A03.A02;
            } else {
                A01 = A03.A01();
            }
            creationSession.A00 = A01;
            Iterator it = r13.A0M().iterator();
            while (it.hasNext()) {
                AnonymousClass3Q2 A0M = JTQ.A0M(userSession, AnonymousClass7TE.A18(it));
                if (A0M != null) {
                    A1C.add(A0M);
                }
            }
        } else {
            A1C.add(r13);
        }
        Iterator it2 = A1C.iterator();
        while (it2.hasNext()) {
            AnonymousClass3Q2 A0m = JTO.A0m(it2);
            String str3 = A0m.A3Z;
            if (str3 != null) {
                boolean A12 = A0m.A12();
                String str4 = A0m.A3M;
                if (A12) {
                    creationSession.A07(str3, str4, true);
                    A002.EOx(A0m.A02);
                } else {
                    creationSession.A07(str3, str4, false);
                    A002.ETL(A0m.A06(), A0m.A0H, A0m.A0G);
                    creationSession.A05 = A0m.A15;
                    A002.EVc(A0m.A08);
                }
                A002.EfU(A0m.A35);
            }
        }
        List A05 = creationSession.A05();
        0qQ.A07(A05);
        Iterator it3 = A05.iterator();
        while (it3.hasNext()) {
            JTO.A0Z(it3).EdE(creationSession.A02);
        }
        C59888JbD.A01(userSession, new KPH());
    }

    public static void A01(UserSession userSession, AnonymousClass3Q2 r5) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = r5.A0M().iterator();
        while (it.hasNext()) {
            AnonymousClass3Q2 A0M = JTQ.A0M(userSession, AnonymousClass7TE.A18(it));
            if (A0M != null) {
                String str = A0M.A30;
                if (!TextUtils.isEmpty(str)) {
                    A1C.add(str);
                }
            }
        }
        List list = JWX.A00(userSession).A03;
        list.clear();
        list.addAll(A1C);
    }
}
