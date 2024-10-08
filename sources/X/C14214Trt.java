package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Trt  reason: case insensitive filesystem */
public final class C14214Trt implements C46211DQo {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C231332rR A02;
    public final String A03;
    public final Fragment A04;
    public final AnonymousClass32N A05;

    public C14214Trt(Fragment fragment, UserSession userSession, AnonymousClass4DU r4, C231332rR r5, AnonymousClass32N r6, String str) {
        0qQ.A0B(r6, 4);
        this.A00 = userSession;
        this.A01 = r4;
        this.A04 = fragment;
        this.A05 = r6;
        this.A02 = r5;
        this.A03 = str;
    }

    public final void DkI(1Xj r28, AnonymousClass3W1 r29) {
        UserSession userSession = this.A00;
        AnonymousClass4DU r7 = this.A01;
        1Xj r6 = r28;
        AnonymousClass3W1 r8 = r29;
        W3r.A06(userSession, r6, r7, r8, C16944VBw.A00(AnonymousClass3YA.A00(userSession, r6, r7)), this.A03, (String) null, (String) null, (List) null, false);
        if (VKH.A00.A04(userSession, r6)) {
            Context context = this.A04.getContext();
            if (context != null) {
                AnonymousClass3KE.A00();
                AnonymousClass3KD.A00(context, userSession, r6, new C19567Wbr(1, this, r6), "cta_bar");
            }
        } else {
            HashMap hashMap = AnonymousClass3KD.A05;
            String A2n = r6.A2n();
            if (A2n != null) {
                hashMap.put(A2n, (Object) null);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        AnonymousClass3YH r4 = VKF.A00;
        if (r4.A04(r6).size() > 1) {
            Context context2 = this.A04.getContext();
            if (context2 != null) {
                C331127Pr r1 = new C331127Pr(userSession);
                DbZ.A0z(context2, r1, 2131973746);
                C331157Pu A002 = r1.A00();
                W3Y A0T = C249713kF.A00.A0T();
                ArrayList arrayList = new ArrayList(r4.A04(r6));
                UserSession userSession2 = userSession;
                A002.A03(context2, A0T.A0G(userSession2, new C16255UrI(0, this, r6, r8, A002), (User) null, r7.getModuleName(), "cta_bar", r6.getId(), r6.C9L(), arrayList));
                return;
            }
            return;
        }
        User user = (User) 00k.A0J(r4.A04(r6));
        if (user != null) {
            A00(this, r6, r8, user, "cta_bar");
        }
    }

    public static final void A00(C14214Trt trt, 1Xj r9, AnonymousClass3W1 r10, User user, String str) {
        W2P A0O;
        FragmentActivity activity = trt.A04.getActivity();
        if (activity != null && (A0O = C249713kF.A00.A0O(activity, trt.A00, r9, trt.A01, r10, user, str, trt.A03)) != null) {
            A0O.A05();
        }
    }

    public final void EC4(View view, 1Xj r3) {
        this.A05.A00(view, r3);
    }
}
