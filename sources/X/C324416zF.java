package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.6zF  reason: invalid class name and case insensitive filesystem */
public final class C324416zF {
    /* JADX WARNING: type inference failed for: r3v16, types: [X.G0f] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011f, code lost:
        if (r0 != 5) goto L_0x0121;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(android.app.Activity r25, android.content.Context r26, X.0hq r27, X.AnonymousClass07i r28, X.AnonymousClass0iw r29, com.instagram.common.session.UserSession r30, X.AnonymousClass4DU r31, X.C324416zF r32, com.instagram.profile.fragment.UserDetailFragment r33, com.instagram.user.model.User r34) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.0Tu r5 = X.0Tu.A05
            r2 = 36327520584743408(0x810fb0000639f0, double:3.037008524751386E-306)
            r14 = r30
            boolean r0 = X.182.A06(r5, r14, r2)
            r7 = 4
            r6 = 3
            r9 = r25
            r12 = r31
            r2 = r33
            r11 = r34
            if (r0 == 0) goto L_0x004c
            com.instagram.user.model.FollowStatus r3 = r11.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r3 != r0) goto L_0x00de
            boolean r0 = X.C3250570w.A03(r14, r11)
            if (r0 == 0) goto L_0x004c
            android.content.res.Resources r3 = r26.getResources()
            r0 = 2131966184(0x7f1338e8, float:1.9569199E38)
            java.lang.String r8 = r3.getString(r0)
            X.0qQ.A07(r8)
            r6 = 2131237893(0x7f081c05, float:1.809205E38)
            r0 = 15
            X.G0f r3 = new X.G0f
            r3.<init>(r2, r0)
        L_0x0044:
            X.9Iw r0 = new X.9Iw
            r0.<init>((X.C62320sa) r3, (java.lang.String) r8, (int) r6)
            r1.add(r0)
        L_0x004c:
            android.content.res.Resources r3 = r26.getResources()
            r0 = 2131973504(0x7f135580, float:1.9584046E38)
            java.lang.String r4 = r3.getString(r0)
            X.0qQ.A07(r4)
            r3 = 2131238210(0x7f081d42, float:1.8092692E38)
            r20 = 14
            X.9Ma r0 = new X.9Ma
            r18 = r29
            r19 = r0
            r21 = r9
            r22 = r11
            r23 = r14
            r24 = r18
            r25 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.9Iw r6 = new X.9Iw
            r6.<init>((X.C62320sa) r0, (java.lang.String) r4, (int) r3)
            android.content.res.Resources r3 = r26.getResources()
            r0 = 2131956748(0x7f13140c, float:1.955006E38)
            java.lang.String r4 = r3.getString(r0)
            X.0qQ.A07(r4)
            r3 = 2131238496(0x7f081e60, float:1.8093272E38)
            r8 = 7
            X.9Md r7 = new X.9Md
            r10 = r27
            r13 = r28
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            X.9Iw r0 = new X.9Iw
            r0.<init>((X.C62320sa) r7, (java.lang.String) r4, (int) r3)
            X.9Iw[] r0 = new X.C376669Iw[]{r6, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r1.addAll(r0)
            r3 = 36327426096118196(0x810f9a001039b4, double:3.036948769764327E-306)
            boolean r0 = X.182.A06(r5, r14, r3)
            if (r0 != 0) goto L_0x00b3
            boolean r0 = X.C322606w6.A02(r14)
            if (r0 != 0) goto L_0x00dd
        L_0x00b3:
            android.content.res.Resources r3 = r26.getResources()
            r0 = 2131971012(0x7f134bc4, float:1.9578991E38)
            java.lang.String r4 = r3.getString(r0)
            X.0qQ.A07(r4)
            r3 = 2131238741(0x7f081f55, float:1.809377E38)
            r16 = 8
            X.9Md r15 = new X.9Md
            r22 = r32
            r17 = r9
            r19 = r14
            r20 = r2
            r21 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            X.9Iw r0 = new X.9Iw
            r0.<init>((X.C62320sa) r15, (java.lang.String) r4, (int) r3)
            r1.add(r0)
        L_0x00dd:
            return r1
        L_0x00de:
            boolean r0 = r11.CPV()
            r4 = 5
            if (r0 == 0) goto L_0x0129
            android.content.res.Resources r3 = r26.getResources()
            r0 = 2131962628(0x7f132b04, float:1.9561987E38)
        L_0x00ec:
            java.lang.String r8 = r3.getString(r0)
            X.0qQ.A0A(r8)
            boolean r0 = r11.CPV()
            if (r0 == 0) goto L_0x0110
            r6 = 2131238102(0x7f081cd6, float:1.8092473E38)
        L_0x00fc:
            r16 = 29
            X.IoM r3 = new X.IoM
            r15 = r3
            r17 = r9
            r18 = r2
            r19 = r14
            r20 = r11
            r21 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21)
            goto L_0x0044
        L_0x0110:
            com.instagram.user.model.FollowStatus r0 = r11.B6o()
            int r0 = r0.ordinal()
            if (r0 == r7) goto L_0x0125
            if (r0 == r6) goto L_0x0121
            r6 = 2131238959(0x7f08202f, float:1.8094211E38)
            if (r0 == r4) goto L_0x00fc
        L_0x0121:
            r6 = 2131238947(0x7f082023, float:1.8094187E38)
            goto L_0x00fc
        L_0x0125:
            r6 = 2131238950(0x7f082026, float:1.8094193E38)
            goto L_0x00fc
        L_0x0129:
            com.instagram.user.model.FollowStatus r0 = r11.B6o()
            int r0 = r0.ordinal()
            if (r0 == r7) goto L_0x0147
            if (r0 == r6) goto L_0x013f
            if (r0 != r4) goto L_0x013f
            android.content.res.Resources r3 = r26.getResources()
            r0 = 2131962625(0x7f132b01, float:1.956198E38)
            goto L_0x00ec
        L_0x013f:
            android.content.res.Resources r3 = r26.getResources()
            r0 = 2131962530(0x7f132aa2, float:1.9561788E38)
            goto L_0x00ec
        L_0x0147:
            android.content.res.Resources r3 = r26.getResources()
            r0 = 2131962616(0x7f132af8, float:1.9561962E38)
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324416zF.A00(android.app.Activity, android.content.Context, X.0hq, X.07i, X.0iw, com.instagram.common.session.UserSession, X.4DU, X.6zF, com.instagram.profile.fragment.UserDetailFragment, com.instagram.user.model.User):java.util.ArrayList");
    }

    public static final ArrayList A01(Activity activity, Context context, 0hq r19, AnonymousClass07i r20, AnonymousClass0iw r21, UserSession userSession, AnonymousClass4DU r23, C324416zF r24, UserDetailFragment userDetailFragment, User user) {
        String string = context.getResources().getString(2131973504);
        0qQ.A07(string);
        Activity activity2 = activity;
        AnonymousClass0iw r5 = r21;
        UserSession userSession2 = userSession;
        C324416zF r9 = r24;
        UserDetailFragment userDetailFragment2 = userDetailFragment;
        User user2 = user;
        C376669Iw r3 = new C376669Iw((C62320sa) new C377519Md(10, activity2, r5, userSession2, userDetailFragment2, user2, r9), string, (int) R.drawable.instagram_direct_pano_outline_24);
        String string2 = context.getResources().getString(2131956748);
        0qQ.A07(string2);
        Activity activity3 = activity2;
        User user3 = user2;
        ArrayList A1M = 0sr.A1M(new C376669Iw[]{r3, new C376669Iw((C62320sa) new C377519Md(11, activity3, r19, user3, r23, r20, userSession2), string2, (int) R.drawable.instagram_link_pano_outline_24)});
        if (182.A06(0Tu.A05, userSession2, 36327426096118196L) || !C322606w6.A02(userSession2)) {
            String string3 = context.getResources().getString(2131971012);
            0qQ.A07(string3);
            A1M.add(new C376669Iw((C62320sa) new C377519Md(9, activity3, r5, userSession2, userDetailFragment2, user2, r9), string3, (int) R.drawable.instagram_scan_qr_pano_outline_24));
        }
        return A1M;
    }
}
