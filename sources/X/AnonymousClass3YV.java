package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3YV  reason: invalid class name */
public final class AnonymousClass3YV {
    public static final AnonymousClass3YV A00 = new Object();

    public static final void A01(Context context, UserSession userSession, 1Xj r15) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        AnonymousClass6ST r5 = new AnonymousClass6ST(context, true);
        Activity activity = (Activity) C334957c9.A00(context, Activity.class);
        if (activity != null) {
            r5.setOwnerActivity(activity);
        }
        String string = context.getString(2131952022);
        0qQ.A07(string);
        Class<C43776CCu> cls = C43776CCu.class;
        Class<C45499CxZ> cls2 = C45499CxZ.class;
        1Xj r4 = r15;
        int i = 2131952020;
        if (ProductType.CLIPS == r15.A1v()) {
            i = 2131952021;
        }
        String string2 = context.getString(i);
        0qQ.A07(string2);
        A04(userSession2, r4, r5, cls, cls2, "accept_coauthor_invite/", string, new C377729My(userSession2, r5, r4, string2, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r0 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ef, code lost:
        if (r0 != null) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.content.Context r13, com.instagram.common.session.UserSession r14, X.AnonymousClass4DU r15, java.lang.String r16) {
        /*
            r6 = 1
            r11 = r14
            X.0qQ.A0B(r14, r6)
            r8 = 3
            X.1E7 r1 = X.1E8.A03
            java.lang.String r0 = "CollaborativeMediaHelper"
            r2 = r16
            X.1Xj r12 = r1.A01(r14, r0, r2)
            if (r12 == 0) goto L_0x00d2
            java.lang.String r1 = r12.A2n()
            if (r1 == 0) goto L_0x0124
            r0 = 10
            java.lang.Long r14 = X.00y.A0n(r0, r1)
        L_0x001e:
            X.8ab r2 = new X.8ab
            r10 = r13
            r2.<init>((android.content.Context) r13)
            r0 = 2131952008(0x7f130188, float:1.9540447E38)
            java.lang.String r0 = r13.getString(r0)
            r2.A05 = r0
            X.0t1 r0 = X.0eE.A00(r11)
            com.instagram.user.model.User r0 = r0.A00()
            java.lang.Integer r1 = r0.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r9 = 0
            r3 = 0
            if (r1 != r0) goto L_0x0040
            r3 = 1
        L_0x0040:
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.CLIPS
            com.instagram.model.mediatype.ProductType r0 = r12.A1v()
            r5 = 0
            if (r1 != r0) goto L_0x004a
            r5 = 1
        L_0x004a:
            r4 = 0
            r13 = r15
            if (r3 == 0) goto L_0x0103
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r3 = r10.getString(r0)
            X.0qQ.A07(r3)
            java.util.List r0 = r12.A3a()
            int r1 = r0.size()
            r0 = 0
            if (r1 <= r6) goto L_0x0064
            r0 = 1
        L_0x0064:
            r7 = 2
            if (r5 == 0) goto L_0x00d5
            r5 = 2131952011(0x7f13018b, float:1.9540453E38)
            if (r0 != 0) goto L_0x00f4
            r5 = 2131952019(0x7f130193, float:1.9540469E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.instagram.user.model.User r0 = r12.A2A(r11)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r0.getUsername()
        L_0x007b:
            r1[r9] = r0
            com.instagram.user.model.User r0 = r12.A2A(r11)
            if (r0 == 0) goto L_0x0087
        L_0x0083:
            java.lang.String r4 = r0.getUsername()
        L_0x0087:
            r1[r6] = r4
            r1[r7] = r3
        L_0x008b:
            java.lang.String r0 = r10.getString(r5, r1)
            X.0qQ.A0A(r0)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            X.DjF r0 = new X.DjF
            r0.<init>(r10, r11, r15)
            X.AnonymousClass7AV.A05(r1, r0, r3)
        L_0x009f:
            r2.A0q(r1)
            X.I9L r0 = new X.I9L
            r0.<init>(r11, r15, r14)
            r2.A0g(r0)
            r0 = 2131952003(0x7f130183, float:1.9540436E38)
            X.I8N r9 = new X.I8N
            r9.<init>(r10, r11, r12, r13, r14)
            r2.A0I(r9, r0)
            r0 = 2131957491(0x7f1316f3, float:1.9551567E38)
            X.I8O r9 = new X.I8O
            r9.<init>(r10, r11, r12, r13, r14)
            r2.A0G(r9, r0)
            r1 = 2131968513(0x7f134201, float:1.9573923E38)
            X.I8F r0 = new X.I8F
            r0.<init>(r11, r15, r14)
            r2.A0H(r0, r1)
            android.app.Dialog r0 = r2.A02()
            X.AnonymousClass0fN.A00(r0)
        L_0x00d2:
            return
        L_0x00d3:
            r0 = r4
            goto L_0x007b
        L_0x00d5:
            r5 = 2131952010(0x7f13018a, float:1.954045E38)
            if (r0 != 0) goto L_0x00f4
            r5 = 2131952018(0x7f130192, float:1.9540467E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.instagram.user.model.User r0 = r12.A2A(r11)
            if (r0 == 0) goto L_0x00f2
            java.lang.String r0 = r0.getUsername()
        L_0x00e9:
            r1[r9] = r0
            com.instagram.user.model.User r0 = r12.A2A(r11)
            if (r0 == 0) goto L_0x0087
            goto L_0x0083
        L_0x00f2:
            r0 = r4
            goto L_0x00e9
        L_0x00f4:
            com.instagram.user.model.User r0 = r12.A2A(r11)
            if (r0 == 0) goto L_0x00fe
            java.lang.String r4 = r0.getUsername()
        L_0x00fe:
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r3}
            goto L_0x008b
        L_0x0103:
            r1 = 2131952009(0x7f130189, float:1.9540449E38)
            if (r5 == 0) goto L_0x010b
            r1 = 2131952012(0x7f13018c, float:1.9540455E38)
        L_0x010b:
            com.instagram.user.model.User r0 = r12.A2A(r11)
            if (r0 == 0) goto L_0x0115
            java.lang.String r4 = r0.getUsername()
        L_0x0115:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r0 = r10.getString(r1, r0)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            goto L_0x009f
        L_0x0124:
            r14 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YV.A03(android.content.Context, com.instagram.common.session.UserSession, X.4DU, java.lang.String):void");
    }

    public static final void A04(UserSession userSession, 1Xj r6, AnonymousClass6ST r7, Class cls, Class cls2, String str, String str2, C62320sa r12) {
        r7.setCancelable(false);
        r7.setCanceledOnTouchOutside(false);
        r7.A00(str2);
        AnonymousClass0fN.A00(r7);
        1NY r4 = new 1NY(userSession, -2);
        r4.A08(AnonymousClass05K.A01);
        String A0R = 002.A0R("media/%s_%s/", str);
        String id = r6.getId();
        if (id != null) {
            r4.A0A(0mp.A06(A0R, new Object[]{id, userSession.A06}));
            r4.A0O((15p) null, cls, cls2, false);
            1OC A0M = r4.A0M();
            A0M.A00 = new C385339im(r7, r12);
            1ES.A03(A0M);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final HashMap A00(UserSession userSession, AnonymousClass4DU r5, String str) {
        User A2A;
        HashMap hashMap = new HashMap();
        hashMap.put("media_id", str);
        hashMap.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.A06);
        hashMap.put("analytics_module", r5.getModuleName());
        1Xj A02 = 1E7.A00(userSession).A02(str);
        if (A02 == null || (A2A = A02.A2A(userSession)) == null) {
            return null;
        }
        hashMap.put("media_owner_username", A2A.getUsername());
        hashMap.put(AnonymousClass000.A00(1502), String.valueOf(A02.A5G()));
        return hashMap;
    }

    public static final void A02(Context context, UserSession userSession, 1Xj r5) {
        boolean z = false;
        if (ProductType.CLIPS == r5.A1v()) {
            z = true;
        }
        C358248ab r2 = new C358248ab(context);
        r2.A05 = context.getString(2131964905);
        int i = 2131964906;
        if (z) {
            i = 2131964907;
        }
        r2.A0q(context.getString(i));
        r2.A0K(new C39935AKb(context, userSession, r5), 2131969629);
        r2.A05();
        AnonymousClass0fN.A00(r2.A02());
    }

    public static final boolean A06(UserSession userSession, 1Xj r5) {
        List<User> coauthorProducers = r5.A0C.getCoauthorProducers();
        if (coauthorProducers != null && (!(coauthorProducers instanceof Collection) || !coauthorProducers.isEmpty())) {
            for (User id : coauthorProducers) {
                if (0qQ.A0K(id.getId(), userSession.A06)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void A05(AnonymousClass6ST r2) {
        Activity ownerActivity = r2.getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isDestroyed() && !ownerActivity.isFinishing() && r2.isShowing()) {
            r2.dismiss();
        }
    }

    public static final boolean A07(UserSession userSession, 1Xj r5) {
        List<User> A3a = r5.A3a();
        if (!(A3a instanceof Collection) || !A3a.isEmpty()) {
            for (User id : A3a) {
                if (0qQ.A0K(id.getId(), userSession.A06)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A08(UserSession userSession, 1Xj r3) {
        String str;
        if (A07(userSession, r3)) {
            return true;
        }
        User A2A = r3.A2A(userSession);
        if (A2A != null) {
            str = A2A.getId();
        } else {
            str = null;
        }
        if (!0qQ.A0K(str, userSession.A06) || !(!r3.A3a().isEmpty())) {
            return false;
        }
        return true;
    }
}
