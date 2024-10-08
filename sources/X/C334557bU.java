package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.7bU  reason: invalid class name and case insensitive filesystem */
public final class C334557bU implements 1wn {
    public final /* synthetic */ C334537bS A00;

    public C334557bU(C334537bS r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int i;
        int A03 = AnonymousClass0fD.A03(1730657867);
        C240323Kl r14 = (C240323Kl) obj;
        int A032 = AnonymousClass0fD.A03(1699658660);
        0qQ.A0B(r14, 0);
        1Xj r5 = r14.A02;
        String str2 = r14.A03;
        boolean z = r14.A04;
        C334537bS r7 = this.A00;
        UserSession userSession = r7.A0E;
        AnonymousClass4DU r8 = r7.A0G;
        I6Q.A03(userSession, r5, r8, str2, z);
        Fragment fragment = r7.A01;
        I6Q.A00(fragment, userSession, r5);
        Bundle bundle = new Bundle();
        bundle.putParcelable(C66579MXk.A00(30), C281965Ag.A00(str2));
        bundle.putString(AnonymousClass000.A00(447), r8.getModuleName());
        if (z) {
            str = "caption";
        } else {
            str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
        }
        bundle.putString(AnonymousClass000.A00(956), str);
        AnonymousClass6W8 r72 = new AnonymousClass6W8(r7.A02, bundle, userSession, ModalActivity.class, AnonymousClass000.A00(3238));
        if (z) {
            i = 3558;
        } else {
            i = 3559;
        }
        r72.A05 = AnonymousClass000.A00(i);
        r72.A0D = false;
        r72.A0C(fragment.requireContext());
        AnonymousClass0fD.A0A(1303033928, A032);
        AnonymousClass0fD.A0A(-1678094000, A03);
    }
}
