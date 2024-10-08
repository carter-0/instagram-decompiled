package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.5ET  reason: invalid class name */
public abstract class AnonymousClass5ET {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r5, X.1Xg r6, X.AnonymousClass4DU r7, java.lang.String r8) {
        /*
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r0 = 3
            X.0qQ.A0B(r6, r0)
            X.1UQ r4 = r6.A06
            X.1UQ r3 = X.1UQ.A0r
            r2 = 0
            if (r4 == r3) goto L_0x0017
            X.1UQ r0 = X.1UQ.A0s
            if (r4 != r0) goto L_0x002a
        L_0x0017:
            X.1Xn r1 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedUsers"
            X.0qQ.A0C(r1, r0)
            X.3UH r1 = (X.AnonymousClass3UH) r1
            if (r1 == 0) goto L_0x002a
            java.util.List r0 = r1.A04()
            if (r0 == 0) goto L_0x0091
            java.lang.String r2 = "preview"
        L_0x002a:
            if (r4 == r3) goto L_0x0030
            X.1UQ r0 = X.1UQ.A0s
            if (r4 != r0) goto L_0x008f
        L_0x0030:
            X.1Xn r1 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedUsers"
            X.0qQ.A0C(r1, r0)
            X.3UH r1 = (X.AnonymousClass3UH) r1
            if (r1 == 0) goto L_0x008f
            java.lang.String r1 = r1.A0C
        L_0x003d:
            X.0jB r4 = new X.0jB
            r4.<init>()
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = "insertion_context"
            r4.A0A(r0, r1)
        L_0x0049:
            if (r2 == 0) goto L_0x0050
            java.lang.String r0 = "format"
            r4.A0A(r0, r2)
        L_0x0050:
            r3 = 0
            X.1Xn r2 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.base.NetegoItem"
            X.0qQ.A0C(r2, r0)
            java.lang.String r0 = "instagram_netego_delivery"
            X.3sc r1 = new X.3sc
            r1.<init>(r3, r7, r0)
            r1.A6t = r8
            java.lang.String r0 = r2.getId()
            if (r0 == 0) goto L_0x0098
            r1.A66 = r0
            java.lang.String r0 = r2.C9L()
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = ""
        L_0x0071:
            r1.A67 = r0
            r1.A0E(r4)
            X.1UQ r0 = r2.B5J()
            java.lang.String r0 = r0.toString()
            r1.A68 = r0
            java.lang.String r0 = r6.A09
            r1.A66 = r0
            r1.A5d = r0
            X.0qQ.A0A(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C233822wX.A0I(r5, r1, r7, r0)
            return
        L_0x008f:
            r1 = 0
            goto L_0x003d
        L_0x0091:
            java.util.List r0 = r1.A0M
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = "profile"
            goto L_0x002a
        L_0x0098:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ET.A00(com.instagram.common.session.UserSession, X.1Xg, X.4DU, java.lang.String):void");
    }

    public static final void A01(UserSession userSession, AnonymousClass3O9 r5, AnonymousClass4DU r6, String str, int i) {
        0qQ.A0B(userSession, 2);
        0wc A01 = AnonymousClass0kN.A01(r6, userSession);
        0Aj A00 = A01.A00(A01.A00, "instagram_netego_hide");
        String id = r5.getId();
        if (id != null) {
            A00.AAJ("netego_id", id);
            A00.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5.B5J().toString());
            A00.A9F("m_ix", Long.valueOf((long) i));
            A00.AAJ(Dbf.A00(), str);
            A00.AAJ("tracking_token", r5.C9L());
            A00.A9F(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, 00y.A0n(10, userSession.A06));
            A00.AAJ("m_pk", (String) null);
            A00.Cgf();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
