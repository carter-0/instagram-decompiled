package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

/* renamed from: X.I5b  reason: case insensitive filesystem */
public final class C56623I5b {
    public static final C56623I5b A00 = new Object();

    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder, 1Xj r11, C243683Zu r12, C242813Wa r13, AnonymousClass3W1 r14, User user, boolean z) {
        int A08;
        User user2 = user;
        if (user != null && (A08 = 00l.A08(spannableStringBuilder, user.getUsername(), 0, false)) != -1) {
            String username = user.getUsername();
            Pattern pattern = 0mp.A00;
            int length = A08 + username.length();
            if (user.isVerified()) {
                C244273av.A03(context, spannableStringBuilder, length);
            }
            if (z) {
                spannableStringBuilder.setSpan(new C52829GdL(r11, r12, r13, r14, user2), A08, length, 33);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008f, code lost:
        if (r5 != 2) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005e, code lost:
        if (r10 != null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61067Jw5 A02(android.content.Context r26, com.instagram.common.session.UserSession r27, X.1Xj r28, X.C242813Wa r29, X.AnonymousClass3W1 r30, boolean r31) {
        /*
            r25 = this;
            r1 = 0
            r14 = 1
            r7 = 4
            r9 = r27
            r8 = r28
            com.instagram.user.model.User r17 = r8.A2A(r9)
            if (r17 == 0) goto L_0x00ab
            X.1Xy r0 = r8.A0C
            java.util.List r10 = r0.Aay()
            r2 = 31
            X.J6K r0 = new X.J6K
            r12 = r29
            r0.<init>(r12, r2)
            X.Ixj r6 = new X.Ixj
            r11 = r30
            r13 = r31
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.Iw8 r22 = X.C58699Iw8.A00(r12, r11, r9, r8, r1)
            r2 = r26
            X.Iw8 r21 = X.C58699Iw8.A00(r2, r11, r9, r8, r14)
            X.JK4 r13 = new X.JK4
            r15 = r10
            r18 = r9
            r19 = r8
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r19 = 7
            X.GnX r2 = new X.GnX
            r18 = r2
            r20 = r13
            r23 = r0
            r24 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)
            boolean r0 = r8.A5m()
            if (r0 != 0) goto L_0x009b
            if (r10 == 0) goto L_0x0058
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0060
        L_0x0058:
            boolean r0 = r8.A6V(r9)
            if (r0 == 0) goto L_0x009b
            if (r10 == 0) goto L_0x0098
        L_0x0060:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0098
            com.instagram.user.model.User[] r0 = new com.instagram.user.model.User[]{r17}
            java.util.ArrayList r7 = X.0sr.A1M(r0)
            r7.addAll(r10)
        L_0x0071:
            X.4Gw r0 = X.C263014Gw.A00
            boolean r0 = r0.A02(r9, r8)
            if (r0 == 0) goto L_0x0091
            X.0Tu r3 = X.0Tu.A05
            r0 = 36601754248286533(0x82091a00201145, double:3.210434997826388E-306)
            long r5 = X.182.A01(r3, r9, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            if (r0 == 0) goto L_0x0091
            r3 = 2
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            X.Jw5 r3 = new X.Jw5
            r3.<init>((X.C53400GnX) r2, (java.util.List) r7, (boolean) r14, (boolean) r1)
            return r3
        L_0x0098:
            X.0sn r7 = X.0sn.A00
            goto L_0x0071
        L_0x009b:
            boolean r0 = r8.A5m()
            if (r0 == 0) goto L_0x00a9
            X.0sn r0 = X.0sn.A00
            X.Jw5 r3 = new X.Jw5
            r3.<init>((X.C53400GnX) r2, (java.util.List) r0, (boolean) r1, (boolean) r1)
            return r3
        L_0x00a9:
            r3 = 0
            return r3
        L_0x00ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56623I5b.A02(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, X.3Wa, X.3W1, boolean):X.Jw5");
    }

    public static final SpannableStringBuilder A00(Context context, 1Xj r22, C243683Zu r23, C242813Wa r24, C243503Za r25, User user, User user2) {
        User user3 = user2;
        String A0t = C51971G9r.A0t(user3);
        SpannableStringBuilder A0E = C51965G9l.A0E();
        Context context2 = context;
        Resources resources = context2.getResources();
        int i = 1;
        if (A0t != null) {
            i = 2;
        }
        User user4 = user;
        String username = user4.getUsername();
        if (A0t == null) {
            A0t = "";
        }
        SpannableStringBuilder append = A0E.append(0bC.A02(resources, new String[]{username, A0t}, R.plurals.open_carousel_media_user_name_header_v2_with_contributor, i));
        0qQ.A0A(append);
        AnonymousClass3W1 r11 = r25.A0D;
        1Xj r8 = r22;
        C243683Zu r9 = r23;
        C242813Wa r10 = r24;
        A01(context2, append, r8, r9, r10, r11, user4, true);
        A01(context2, append, r8, r9, r10, r11, user3, true);
        return append;
    }
}
