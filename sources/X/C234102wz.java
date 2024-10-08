package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.2wz  reason: invalid class name and case insensitive filesystem */
public final class C234102wz implements 27S {
    public final /* synthetic */ C234042wt A00;

    public C234102wz(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C240323Kl r4 = (C240323Kl) obj;
        0qQ.A0B(r4, 0);
        C234042wt r2 = this.A00;
        if (C234042wt.A01(r4.A02, r2, r4.A04) || C234042wt.A03(r2)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int i;
        int A03 = AnonymousClass0fD.A03(-729129568);
        C240323Kl r15 = (C240323Kl) obj;
        int A032 = AnonymousClass0fD.A03(1460222098);
        0qQ.A0B(r15, 0);
        1Xj r10 = r15.A02;
        String str2 = r15.A03;
        boolean z = r15.A04;
        C234042wt r6 = this.A00;
        UserSession userSession = r6.A0B;
        AnonymousClass4DU r8 = r6.A0S;
        I6Q.A03(userSession, r10, r8, str2, z);
        I6Q.A05(r10, r6.A00, C301155ye.A00(), r6.A02, C233162v9.HASHTAG_CLICK);
        Fragment fragment = r6.A07;
        I6Q.A00(fragment, userSession, r10);
        C71342cb.A00(userSession).A0A = r10.A2n();
        if (r6.A06) {
            FragmentActivity requireActivity = fragment.requireActivity();
            AnonymousClass6W8 r82 = new AnonymousClass6W8(requireActivity, W0l.A00(C281965Ag.A00(str2), r8.getModuleName(), "DEFAULT"), userSession, ModalActivity.class, "hashtag_feed");
            r82.A08();
            r82.A0C(requireActivity);
        } else {
            HashtagImpl A002 = C281965Ag.A00(str2);
            String moduleName = r8.getModuleName();
            if (z) {
                str = "caption";
            } else {
                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
            }
            Fragment A01 = W0l.A01(userSession);
            A01.setArguments(W0l.A00(A002, moduleName, str));
            if (z) {
                i = 3558;
            } else {
                i = 3559;
            }
            C234042wt.A00(A01, userSession, r6, AnonymousClass000.A00(i));
        }
        AnonymousClass0fD.A0A(-425134405, A032);
        AnonymousClass0fD.A0A(907140509, A03);
    }
}
