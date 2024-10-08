package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4Gz  reason: invalid class name and case insensitive filesystem */
public abstract class C263044Gz {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36320279273611463L) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d2, code lost:
        if (((int) X.182.A01(r7, r8, 36601754248155460L)) == 1) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C376449Ia A01(android.content.Context r25, X.1Xj r26, X.1Xj r27, X.AnonymousClass4DU r28, X.AnonymousClass3W1 r29) {
        /*
            r24 = this;
            r4 = 0
            r15 = r25
            X.0qQ.A0B(r15, r4)
            r0 = 1
            r11 = r26
            X.0qQ.A0B(r11, r0)
            r5 = 2
            r2 = r27
            X.0qQ.A0B(r2, r5)
            r0 = 3
            r10 = r29
            X.0qQ.A0B(r10, r0)
            r0 = 4
            r13 = r28
            X.0qQ.A0B(r13, r0)
            X.2kQ r19 = X.C227942kP.A00(r13)
            r9 = r24
            r7 = r9
            boolean r3 = r9 instanceof X.AnonymousClass4H0
            if (r3 == 0) goto L_0x0099
            X.4H0 r7 = (X.AnonymousClass4H0) r7
            boolean r0 = r2.A5m()
            r22 = 1
            if (r0 == 0) goto L_0x00d5
            X.1Xy r0 = r2.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x00d5
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            if (r1 == 0) goto L_0x00d5
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r7 = r7.A00
            com.instagram.user.model.User r0 = r0.A01(r7)
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d5
            X.0Tu r6 = X.0Tu.A05
            r0 = 36320279273611463(0x81091a003f20c7, double:3.032429090433125E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x00d5
        L_0x0060:
            com.instagram.common.session.UserSession r1 = r9.A00
            X.0q2 r0 = X.0q2.A00(r1)
            boolean r23 = r0.A0N(r2)
            X.3eW r14 = X.C246393eW.A00
            if (r3 == 0) goto L_0x0096
            X.3VA r21 = X.AnonymousClass3VA.OPEN_CAROUSEL_THANK
        L_0x0070:
            r20 = r10
            r18 = r2
            r17 = r11
            r16 = r1
            X.4Fv r20 = r14.A00(r15, r16, r17, r18, r19, r20, r21)
            X.9MQ r6 = new X.9MQ
            r8 = r15
            r10 = r13
            r11 = r2
            r7 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r1 = 13
            X.9IE r0 = new X.9IE
            r0.<init>((java.lang.Object) r6, (int) r1)
            X.9Ia r18 = new X.9Ia
            r21 = r4
            r19 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            return r18
        L_0x0096:
            X.3VA r21 = X.AnonymousClass3VA.PER_MEDIA_LIKE
            goto L_0x0070
        L_0x0099:
            X.4Gy r7 = (X.C263034Gy) r7
            r6 = 1
            boolean r0 = r11.A6H()
            r22 = 1
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r2.A5m()
            if (r0 != 0) goto L_0x00d5
            java.lang.String r1 = r2.getId()
            if (r1 == 0) goto L_0x00d5
            java.lang.String r0 = "open_carousel_prompt"
            boolean r0 = X.00p.A0i(r1, r0, r4)
            if (r0 != 0) goto L_0x00d5
            com.instagram.common.session.UserSession r8 = r7.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36601754250121549(0x82091a003c114d, double:3.2104349989868596E-306)
            long r0 = X.182.A01(r7, r8, r0)
            int r12 = (int) r0
            if (r12 == 0) goto L_0x00d5
            r0 = 36601754248155460(0x82091a001e1144, double:3.210434997743497E-306)
            long r0 = X.182.A01(r7, r8, r0)
            int r7 = (int) r0
            if (r7 != r6) goto L_0x00d5
            goto L_0x0060
        L_0x00d5:
            r22 = 0
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263044Gz.A01(android.content.Context, X.1Xj, X.1Xj, X.4DU, X.3W1):X.9Ia");
    }

    public static final void A00(Context context, C263044Gz r7, 1Xj r8, AnonymousClass3V9 r9) {
        AnonymousClass3VA r1;
        int i;
        String str;
        Integer num;
        if (r7 instanceof AnonymousClass4H0) {
            r1 = AnonymousClass3VA.OPEN_CAROUSEL_THANK;
        } else {
            r1 = AnonymousClass3VA.PER_MEDIA_LIKE;
        }
        boolean z = false;
        boolean z2 = false;
        if (r1 == AnonymousClass3VA.OPEN_CAROUSEL_THANK) {
            z2 = true;
        }
        UserSession userSession = r7.A00;
        boolean A0N = 0q2.A00(userSession).A0N(r8);
        if (r8.A0v() == 0 || (r8.A0v() == 1 && A0N)) {
            z = true;
        }
        if (!z2 && z) {
            if (!A0N) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            r9.A0G(num);
        }
        0qQ.A0B(context, 1);
        if (A0N) {
            i = 2Yu.A0H(context, R.attr.feedLikeActiveColor);
        } else {
            i = R.color.igds_icon_on_color;
        }
        int color = context.getColor(i);
        AnonymousClass3V9.A07(r9);
        C247753gr r0 = r9.A06;
        if (r0 != null) {
            r0.A02.setColorFilter(color);
        }
        boolean A0N2 = 0q2.A00(userSession).A0N(r8);
        int i2 = R.drawable.instagram_heart_pano_outline_24;
        if (A0N2) {
            i2 = R.drawable.instagram_heart_pano_filled_24;
        }
        Drawable drawable = context.getDrawable(i2);
        if (drawable != null) {
            r9.A0F(drawable);
        }
        if (z2 || r8.A0v() <= 0) {
            str = "";
        } else {
            str = String.valueOf(r8.A0v());
        }
        r9.A0H(str);
    }

    public final Integer A02() {
        if (this instanceof AnonymousClass4H0) {
            return AnonymousClass05K.A1F;
        }
        return AnonymousClass05K.A0u;
    }

    public C263044Gz(UserSession userSession) {
        this.A00 = userSession;
    }
}
