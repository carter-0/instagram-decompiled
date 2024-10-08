package X;

import android.content.Context;
import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6jV  reason: invalid class name and case insensitive filesystem */
public final class C315196jV implements C315036jF {
    public AnonymousClass3WT A00;
    public boolean A01;
    public boolean A02;

    public final View C8E(C255773uh r2, C316026kz r3) {
        0qQ.A0B(r3, 0);
        if (this.A01) {
            return r3.C8D();
        }
        if (this.A02) {
            return r3.C8C();
        }
        return null;
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        int i;
        0qQ.A0B(context, 1);
        AnonymousClass3WT r0 = this.A00;
        if (r0 != null) {
            switch (r0.ordinal()) {
                case 8:
                    i = 2131971739;
                    break;
                case 15:
                    i = 2131971741;
                    break;
                case 19:
                    i = 2131971742;
                    break;
                case 21:
                    i = 2131971740;
                    break;
                case 23:
                    i = 2131971743;
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    i = 2131971744;
                    break;
                case 30:
                case 36:
                    i = 2131974948;
                    break;
                default:
                    throw new IllegalArgumentException("current sticker type is not eligible for promote");
            }
            String string = context.getString(i);
            0qQ.A0A(string);
            return new C315476jx((CharSequence) string);
        }
        throw new IllegalStateException("current sticker type should not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        r3.E5T(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f7, code lost:
        r3.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fa, code lost:
        r5.A00 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DsI(android.content.Context r6, X.AnonymousClass0iw r7, com.instagram.common.session.UserSession r8, X.C255773uh r9, X.C250973mM r10) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r8, r4)
            r0 = 3
            X.0qQ.A0B(r9, r0)
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x006a
            X.3WT r0 = r5.A00
            if (r0 == 0) goto L_0x0116
            int r0 = r0.ordinal()
            switch(r0) {
                case 8: goto L_0x005b;
                case 15: goto L_0x003d;
                case 19: goto L_0x002e;
                case 21: goto L_0x0100;
                case 23: goto L_0x004c;
                case 29: goto L_0x001f;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.String r1 = "current sticker type is not eligible for promote"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x001f:
            X.1Av r0 = X.1Au.A00(r8)
            r2 = 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "story_promote_with_poll_sticker_seen_tooltip_v2"
            goto L_0x010d
        L_0x002e:
            X.1Av r0 = X.1Au.A00(r8)
            r2 = 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "story_promote_with_location_sticker_seen_tooltip"
            goto L_0x010d
        L_0x003d:
            X.1Av r0 = X.1Au.A00(r8)
            r2 = 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "story_promote_with_hashtag_sticker_seen_tooltip"
            goto L_0x010d
        L_0x004c:
            X.1Av r0 = X.1Au.A00(r8)
            r2 = 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "story_promote_with_mention_sticker_seen_tooltip"
            goto L_0x010d
        L_0x005b:
            X.1Av r0 = X.1Au.A00(r8)
            r2 = 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "story_promote_with_countdown_sticker_seen_tooltip"
            goto L_0x010d
        L_0x006a:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0118
            X.3WT r0 = r5.A00
            if (r0 == 0) goto L_0x00fd
            int r0 = r0.ordinal()
            switch(r0) {
                case 8: goto L_0x00bf;
                case 15: goto L_0x009d;
                case 19: goto L_0x008f;
                case 21: goto L_0x00cd;
                case 23: goto L_0x00ab;
                case 29: goto L_0x0081;
                case 30: goto L_0x00de;
                case 36: goto L_0x00de;
                default: goto L_0x0079;
            }
        L_0x0079:
            java.lang.String r1 = "current sticker type is not eligible for promote"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0081:
            X.1Av r0 = X.1Au.A00(r8)
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r3 = r0.AR4()
            java.lang.String r0 = "story_promote_with_poll_sticker_seen_tooltip_on_promote_button_v2"
            goto L_0x00da
        L_0x008f:
            X.1Av r0 = X.1Au.A00(r8)
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r3 = r0.AR4()
            java.lang.String r0 = "story_promote_with_location_sticker_seen_tooltip_on_promote_button"
            goto L_0x00da
        L_0x009d:
            X.1Av r0 = X.1Au.A00(r8)
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r3 = r0.AR4()
            java.lang.String r0 = "story_promote_with_hashtag_sticker_seen_tooltip_on_promote_button"
            goto L_0x00da
        L_0x00ab:
            boolean r0 = A00(r8, r9)
            if (r0 == 0) goto L_0x00fa
            X.1Av r0 = X.1Au.A00(r8)
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r3 = r0.AR4()
            java.lang.String r0 = "story_boost_with_mention_sticker_seen_tooltip_on_boost_button"
            goto L_0x00da
        L_0x00bf:
            X.1Av r0 = X.1Au.A00(r8)
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r3 = r0.AR4()
            java.lang.String r0 = "story_promote_with_countdown_sticker_seen_tooltip_on_promote_button"
            goto L_0x00da
        L_0x00cd:
            X.1Av r0 = X.1Au.A00(r8)
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r3 = r0.AR4()
            java.lang.String r0 = "story_promote_with_feed_media_sticker_seen_tooltip_on_promote_button"
        L_0x00da:
            r3.E5T(r0, r1)
            goto L_0x00f7
        L_0x00de:
            X.W3U r3 = X.W3U.A00
            X.0xa r0 = X.W3U.A02(r8, r3)
            java.lang.String r2 = "tag_products_tooltip_story_product_boost_eligible"
            int r1 = r0.getInt(r2, r4)
            X.0xa r0 = X.W3U.A02(r8, r3)
            X.0xY r3 = r0.AR4()
            int r0 = r1 + 1
            r3.E5Z(r2, r0)
        L_0x00f7:
            r3.apply()
        L_0x00fa:
            r0 = 0
            r5.A00 = r0
        L_0x00fd:
            r5.A02 = r4
            return
        L_0x0100:
            X.1Av r0 = X.1Au.A00(r8)
            r2 = 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "story_promote_with_feed_media_sticker_seen_tooltip_on_promote_button"
        L_0x010d:
            r1.E5T(r0, r2)
            r1.apply()
            r0 = 0
            r5.A00 = r0
        L_0x0116:
            r5.A01 = r4
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315196jV.DsI(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.3uh, X.3mM):void");
    }

    public final boolean EtQ(UserSession userSession, C255773uh r6, C250973mM r7, C316026kz r8) {
        AnonymousClass3WT r0;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r8, 3);
        1Xj r2 = r6.A0b;
        if (r2 == null || r2.A3F().size() != 1) {
            r0 = null;
        } else {
            r0 = ((C255783ui) r2.A3F().get(0)).A11;
        }
        this.A00 = r0;
        if (r0 == null) {
            return false;
        }
        this.A01 = A02(userSession, r8);
        this.A02 = A01(userSession, r6, r8);
        if (r2 == null || !C305796Jo.A05(userSession, r2)) {
            return false;
        }
        if ((A02(userSession, r8) || A01(userSession, r6, r8)) && DdM.A00(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A00(UserSession userSession, C255773uh r4) {
        String str;
        C255783ui r0;
        User user;
        1Xj r02 = r4.A0b;
        if (r02 == null || (r0 = (C255783ui) 00k.A0J(r02.A3F())) == null || (user = r0.A1B) == null) {
            str = null;
        } else {
            str = user.getId();
        }
        String str2 = userSession.A06;
        if (str == null || str.equals(str2) || !182.A06(0Tu.A05, userSession, 36320996529021958L)) {
            return false;
        }
        return true;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01(com.instagram.common.session.UserSession r4, X.C255773uh r5, X.C316026kz r6) {
        /*
            r3 = this;
            android.view.View r0 = r6.C8C()
            if (r0 == 0) goto L_0x0011
            X.3WT r0 = r3.A00
            if (r0 == 0) goto L_0x0011
            int r0 = r0.ordinal()
            switch(r0) {
                case 8: goto L_0x003d;
                case 15: goto L_0x0034;
                case 19: goto L_0x002b;
                case 21: goto L_0x0046;
                case 23: goto L_0x0013;
                case 29: goto L_0x0022;
                default: goto L_0x0011;
            }
        L_0x0011:
            r1 = 0
        L_0x0012:
            return r1
        L_0x0013:
            boolean r0 = A00(r4, r5)
            if (r0 == 0) goto L_0x0011
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "story_boost_with_mention_sticker_seen_tooltip_on_boost_button"
            goto L_0x004e
        L_0x0022:
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "story_promote_with_poll_sticker_seen_tooltip_on_promote_button_v2"
            goto L_0x004e
        L_0x002b:
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "story_promote_with_location_sticker_seen_tooltip_on_promote_button"
            goto L_0x004e
        L_0x0034:
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "story_promote_with_hashtag_sticker_seen_tooltip_on_promote_button"
            goto L_0x004e
        L_0x003d:
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "story_promote_with_countdown_sticker_seen_tooltip_on_promote_button"
            goto L_0x004e
        L_0x0046:
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "story_promote_with_feed_media_sticker_seen_tooltip_on_promote_button"
        L_0x004e:
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315196jV.A01(com.instagram.common.session.UserSession, X.3uh, X.6kz):boolean");
    }

    private final boolean A02(UserSession userSession, C316026kz r5) {
        AnonymousClass3WT r0;
        0xa r2;
        String str;
        if (!(r5.C8D() == null || r5.C8C() != null || (r0 = this.A00) == null)) {
            switch (r0.ordinal()) {
                case 8:
                    r2 = 1Au.A00(userSession).A01;
                    str = "story_promote_with_countdown_sticker_seen_tooltip_on_promote_button";
                    break;
                case 15:
                    r2 = 1Au.A00(userSession).A01;
                    str = "story_promote_with_hashtag_sticker_seen_tooltip";
                    break;
                case 19:
                    r2 = 1Au.A00(userSession).A01;
                    str = "story_promote_with_location_sticker_seen_tooltip";
                    break;
                case 21:
                    r2 = 1Au.A00(userSession).A01;
                    str = "story_promote_with_feed_media_sticker_seen_tooltip_on_promote_button";
                    break;
                case 23:
                    r2 = 1Au.A00(userSession).A01;
                    str = "story_promote_with_mention_sticker_seen_tooltip";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    r2 = 1Au.A00(userSession).A01;
                    str = "story_promote_with_poll_sticker_seen_tooltip_v2";
                    break;
            }
            if (r2.getBoolean(str, false)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
