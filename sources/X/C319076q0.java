package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* renamed from: X.6q0  reason: invalid class name and case insensitive filesystem */
public abstract class C319076q0 {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (X.DcE.A01(r11) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(com.instagram.common.session.UserSession r11) {
        /*
            r8 = 1
            r9 = 0
            X.0qQ.A0B(r11, r9)
            X.6nx r7 = X.C317846nw.A01
            X.6ny r6 = X.C317866ny.PROFILE
            boolean r0 = X.DcE.A00(r11)
            if (r0 == 0) goto L_0x006e
            X.6nw r0 = X.C317846nw.COIN_FLIP_FRAME_POP_ANIMATED_AVATAR_STICKERS_440_400
        L_0x0011:
            r10 = 0
            java.lang.String r5 = r7.A00(r0, r6, r11, r9)
            boolean r0 = X.DcE.A06(r11, r8)
            if (r0 == 0) goto L_0x0023
            boolean r1 = X.DcE.A01(r11)
            r0 = 1
            if (r1 != 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r4 = 0
            if (r0 != 0) goto L_0x0028
            r5 = r10
        L_0x0028:
            X.6nw r0 = X.C317846nw.COIN_FLIP_ANIMATED_AVATAR_STICKERS
            java.lang.String r3 = r7.A00(r0, r6, r11, r9)
            boolean r0 = X.DcE.A06(r11, r8)
            if (r0 == 0) goto L_0x006c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315937057935049(0x81052700060ec9, double:3.0296830557546614E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x006c
            boolean r0 = X.DcE.A01(r11)
            if (r0 != 0) goto L_0x006c
        L_0x0047:
            boolean r0 = X.DcE.A00(r11)
            if (r0 == 0) goto L_0x0069
            X.6nw r0 = X.C317846nw.COIN_FLIP_CUSTOMIZATION_POSES_440_400
        L_0x004f:
            java.lang.String r1 = r7.A00(r0, r6, r11, r9)
            boolean r0 = X.DcE.A06(r11, r8)
            if (r0 == 0) goto L_0x0060
            boolean r0 = X.DcE.A04(r11)
            if (r0 == 0) goto L_0x0060
            r4 = r1
        L_0x0060:
            java.lang.String[] r0 = new java.lang.String[]{r5, r3, r4}
            java.util.List r0 = X.0sr.A1Q(r0)
            return r0
        L_0x0069:
            X.6nw r0 = X.C317846nw.COIN_FLIP_CUSTOMIZATION_ALL_POSES
            goto L_0x004f
        L_0x006c:
            r3 = r10
            goto L_0x0047
        L_0x006e:
            X.6nw r0 = X.C317846nw.COIN_FLIP_FRAME_POP_ANIMATED_AVATAR_STICKERS
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C319076q0.A00(com.instagram.common.session.UserSession):java.util.List");
    }

    public static final void A01(Context context, Intent intent, UserSession userSession, C62320sa r8, C62320sa r9, 0sJ r10) {
        0qQ.A0B(userSession, 1);
        if (intent != null && DcE.A04(userSession)) {
            if (intent.hasExtra("coin_flip_disabled")) {
                r10.invoke(false, (Object) null, (Object) null, "ig_coin_flip_customization_sheet");
                1xC r2 = 1xC.A01;
                C310336ap r1 = new C310336ap();
                r1.A04();
                r1.A0D = context.getString(2131956219);
                r1.A06();
                String string = context.getString(2131975851);
                0qQ.A07(string);
                r1.A0G = string;
                r1.A0L = true;
                r1.A0A(new IVM(r10));
                r2.A00(new AnonymousClass3GP(r1.A00()));
            }
            if (intent.hasExtra("avatar_updated")) {
                r8.invoke();
            }
            if (intent.hasExtra("background_updated") || (DcE.A04(userSession) && intent.hasExtra("pose_updated"))) {
                r10.invoke(true, intent.getStringExtra("background_updated"), intent.getStringExtra("pose_updated"), "ig_coin_flip_customization_sheet");
            }
            if (intent.hasExtra("avatar_deleted")) {
                r9.invoke();
            }
        }
    }

    public static final void A02(Context context, AnonymousClass07Z r12, AnonymousClass36O r13, AnonymousClass2kB r14, UserSession userSession, C318956po r16, String str, C62320sa r18, C62320sa r19, 0sL r20, 0sK r21) {
        0qQ.A0B(r14, 0);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r13, 4);
        Context context2 = context;
        r14.A00.A06(r12, new C319096q2(new C319086q1(context2, r13, userSession, r16, str, r18, r19, r20, r21)));
    }
}
