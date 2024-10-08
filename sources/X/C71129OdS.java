package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.OdS  reason: case insensitive filesystem */
public abstract class C71129OdS {
    public static final AnonymousClass2Ep A00(UserSession userSession, ThreadFetchReason threadFetchReason, Integer num, String str, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        String A0j = AnonymousClass7TG.A0j();
        String str2 = str;
        0eP A02 = A02(userSession2, threadFetchReason, str2, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0j, false);
        AnonymousClass7BV r3 = (AnonymousClass7BV) A02.A01;
        Integer num2 = num;
        C68437NHw nHw = new C68437NHw(userSession2, r3, (AnonymousClass43S) A02.A00, (C74484Pve) null, num2, str2, (List) null, z);
        C66716MbN A0H = DirectThreadApi.A0H(userSession2, r3, (Integer) null, num2, (Long) null, str2, (String) null, (String) null, A0j);
        A0H.A00(nHw);
        1ES.A02(A0H);
        return nHw.A00.A05;
    }

    public static final AnonymousClass2Ep A01(UserSession userSession, ThreadFetchReason threadFetchReason, List list) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        List list2 = list;
        AnonymousClass3U9 B33 = 1bJ.A00(userSession2).B33(new DirectThreadKey((String) null, list2));
        boolean z = false;
        if (B33 != null && B33.BMT() == AnonymousClass05K.A0N) {
            z = true;
        }
        if (z) {
            return B33;
        }
        String A0j = AnonymousClass7TG.A0j();
        UserSession userSession3 = userSession2;
        0eP A02 = A02(userSession3, threadFetchReason, (String) null, "participants", A0j, true);
        AnonymousClass7BV r5 = (AnonymousClass7BV) A02.A01;
        C68437NHw nHw = new C68437NHw(userSession2, r5, (AnonymousClass43S) A02.A00, (C74484Pve) null, (Integer) null, (String) null, list2, false);
        try {
            C66716MbN A0I = DirectThreadApi.A0I(userSession3, r5, (Integer) null, (Long) null, A0j, list2, false);
            A0I.A00(nHw);
            1ES.A02(A0I);
        } catch (NullPointerException e) {
            0KC.A0J("DirectThreadLoader", "thread fetch by recipients failed", e);
        }
        return nHw.A00.A05;
    }

    public static final 0eP A02(UserSession userSession, ThreadFetchReason threadFetchReason, String str, String str2, String str3, boolean z) {
        AnonymousClass43Q A00 = AnonymousClass43P.A00(userSession);
        AnonymousClass43S r3 = (AnonymousClass43S) userSession.A01(AnonymousClass43S.class, C73911Plm.A00(userSession, 45));
        return AnonymousClass7TE.A1L(r3, r3.A0E(userSession, threadFetchReason, (Long) null, str, str2, "DirectThreadLoader", str3, A00.A00(), 2Aj.A02(userSession), z));
    }

    public static final void A03(UserSession userSession, ThreadFetchReason threadFetchReason, C74484Pve pve, Integer num, String str, boolean z) {
        AnonymousClass3U9 A0d;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        ThreadFetchReason threadFetchReason2 = threadFetchReason;
        String str2 = str;
        C51972G9s.A1B(str2, threadFetchReason);
        C74484Pve pve2 = pve;
        if (z || (A0d = C66580MXl.A0d(1bJ.A00(userSession), str2)) == null || A0d.BMT() != AnonymousClass05K.A0N) {
            0eP A02 = A02(userSession, threadFetchReason2, str2, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, AnonymousClass7TG.A0j(), false);
            AnonymousClass7BV r6 = (AnonymousClass7BV) A02.A01;
            Integer num2 = num;
            C66716MbN A0H = DirectThreadApi.A0H(userSession2, r6, (Integer) null, num2, (Long) null, str2, (String) null, (String) null, AnonymousClass7TG.A0j());
            A0H.A00(new C68437NHw(userSession2, r6, (AnonymousClass43S) A02.A00, pve2, num2, str2, (List) null, false));
            1ES.A03(A0H);
        } else if (pve != null) {
            pve2.onSuccess(A0d);
            pve2.onSuccessInBackground(A0d);
        }
    }

    public static final void A05(UserSession userSession, ThreadFetchReason threadFetchReason, C74484Pve pve, List list, boolean z, boolean z2) {
        AnonymousClass3U9 B33;
        UserSession userSession2 = userSession;
        C74484Pve pve2 = pve;
        List list2 = list;
        if (z || (B33 = 1bJ.A00(userSession).B33(new DirectThreadKey((String) null, list2))) == null || B33.BMT() != AnonymousClass05K.A0N) {
            String A0j = AnonymousClass7TG.A0j();
            UserSession userSession3 = userSession2;
            0eP A02 = A02(userSession3, threadFetchReason, (String) null, "participants", A0j, true);
            AnonymousClass7BV r5 = (AnonymousClass7BV) A02.A01;
            0qQ.A0B(list2, 1);
            C66716MbN A0I = DirectThreadApi.A0I(userSession3, r5, (Integer) null, (Long) null, A0j, list2, z2);
            A0I.A00(new C68437NHw(userSession2, r5, (AnonymousClass43S) A02.A00, pve2, (Integer) null, (String) null, list2, false));
            1ES.A03(A0I);
            return;
        }
        pve.onSuccess(B33);
        pve.onSuccessInBackground(B33);
    }

    public static final void A06(UserSession userSession, Integer num, String str, String str2) {
        0qQ.A0B(str, 1);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0K("direct_v2/threads/%s/noncritical/", new Object[]{str});
        A0b.A0Q(C43794CDm.class, C45540CyE.class);
        A0b.A09(num, "limit");
        A0b.A0G("prev_cursor", str2);
        1OC A0M = A0b.A0M();
        NMI.A00(A0M, userSession, 23);
        1ES.A03(A0M);
    }

    public static void A04(UserSession userSession, ThreadFetchReason threadFetchReason, C74484Pve pve, String str, boolean z) {
        A03(userSession, threadFetchReason, pve, 20, str, z);
    }
}
