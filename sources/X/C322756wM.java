package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6wM  reason: invalid class name and case insensitive filesystem */
public final class C322756wM extends C322736wK {
    public final FragmentActivity A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C3253572b A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C322756wM(X.AnonymousClass4DH r14, X.AnonymousClass0iw r15, com.instagram.common.session.UserSession r16, X.C322186vO r17, X.AnonymousClass4DU r18, X.C322706wH r19, X.C294255m9 r20, com.instagram.profile.fragment.UserDetailFragment r21, X.AnonymousClass32Q r22, java.lang.Integer r23, boolean r24) {
        /*
            r13 = this;
            r0 = 9
            r10 = r22
            X.0qQ.A0B(r10, r0)
            androidx.fragment.app.FragmentActivity r3 = r14.requireActivity()
            r2 = r13
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            r12 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A01 = r14
            r13.A03 = r4
            r13.A02 = r15
            r13.A00 = r3
            X.72b r1 = new X.72b
            r1.<init>()
            r0 = 2131238595(0x7f081ec3, float:1.8093473E38)
            r1.A02 = r0
            r0 = 2131962033(0x7f1328b1, float:1.956078E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B = r0
            r0 = 2131962032(0x7f1328b0, float:1.9560778E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0A = r0
            r0 = 2131962031(0x7f1328af, float:1.9560776E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09 = r0
            X.6wN r0 = new X.6wN
            r0.<init>(r13)
            r1.A06 = r0
            r13.A04 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C322756wM.<init>(X.4DH, X.0iw, com.instagram.common.session.UserSession, X.6vO, X.4DU, X.6wH, X.5m9, com.instagram.profile.fragment.UserDetailFragment, X.32Q, java.lang.Integer, boolean):void");
    }

    public static final void A01(C322756wM r4) {
        User user = r4.A04.A02.A0P.A0J;
        if (user != null) {
            C273004lm A002 = C272994ll.A00(r4.A03);
            String moduleName = r4.A02.getModuleName();
            String id = user.getId();
            0qQ.A0B(moduleName, 0);
            0wc r2 = A002.A00;
            0Aj A003 = r2.A00(r2.A00, "ig_subscriptions_empty_exclusive_profile_tab_impression");
            A003.AAJ("container_module", moduleName);
            A003.A9F("creator_igid", Long.valueOf(Long.parseLong(id)));
            A003.Cgf();
        }
    }
}
