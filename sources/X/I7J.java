package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.music.common.config.MusicAttributionConfig;
import java.util.List;

public abstract class I7J {
    public static final EffectPreviewIntf A02(1Xj r4) {
        CreativeConfigIntf A0r;
        List B02;
        if (r4 == null || (A0r = C51966G9m.A0r(r4)) == null || (B02 = A0r.B02()) == null || B02.size() != 1) {
            return null;
        }
        return (EffectPreviewIntf) 00k.A0O(B02, 0);
    }

    public static final MusicAttributionConfig A03(1Xj r2) {
        C67231sQ A0n;
        C67231sQ A0n2;
        if (r2 == null) {
            return null;
        }
        C67231sQ A0n3 = C51966G9m.A0n(r2);
        if (((A0n3 == null || A0n3.BUr() == null) && ((A0n2 = C51966G9m.A0n(r2)) == null || A0n2.BZB() == null)) || (A0n = C51966G9m.A0n(r2)) == null) {
            return null;
        }
        return C291335gz.A03(A0n);
    }

    public static final Boolean A05(C267324bN r2) {
        1Xj r0;
        if (r2 != null) {
            r0 = r2.A02;
        } else {
            r0 = null;
        }
        EffectPreviewIntf A02 = A02(r0);
        if (A02 != null) {
            return Boolean.valueOf(DDx.A04(A02));
        }
        return null;
    }

    public static final AnonymousClass8JL A00(UserSession userSession, String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return AnonymousClass8JL.AUDIO_AND_EFFECT;
            }
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36316654317146671L)) {
                return AnonymousClass8JL.TEMPLATE_BROWSER;
            }
            if (182.A06(r2, userSession, 36316654317081134L)) {
                return AnonymousClass8JL.TEMPLATE;
            }
            return AnonymousClass8JL.AUDIO;
        } else if (str2 != null) {
            return AnonymousClass8JL.EFFECT;
        } else {
            return AnonymousClass8JL.NONE;
        }
    }

    public static final String A0A(UserSession userSession, 1Xj r3) {
        C67231sQ A0n;
        C2606046i A01;
        if (r3 == null || (A0n = C51966G9m.A0n(r3)) == null || (A01 = C291335gz.A01(A0n)) == null || !A01.CZi(userSession.A06)) {
            return null;
        }
        return A01.getAssetId();
    }

    public static final ImageUrl A01(C267324bN r2) {
        1Xj r0;
        if (DbX.A1a(A05(r2))) {
            return null;
        }
        if (r2 != null) {
            r0 = r2.A02;
        } else {
            r0 = null;
        }
        EffectPreviewIntf A02 = A02(r0);
        if (A02 != null) {
            return DDx.A00(A02);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C56044Hrt A04(X.28D r7, X.C267324bN r8, com.instagram.common.session.UserSession r9) {
        /*
            X.DbY.A1S(r9, r7)
            if (r8 == 0) goto L_0x0015
            X.1Xj r0 = r8.A02
        L_0x0007:
            java.lang.String r4 = A0A(r9, r0)
            java.lang.String r3 = A08(r8)
            r1 = 0
            if (r4 != 0) goto L_0x0017
            if (r3 != 0) goto L_0x006a
            return r1
        L_0x0015:
            r0 = 0
            goto L_0x0007
        L_0x0017:
            if (r3 != 0) goto L_0x006a
            r3 = r1
            r6 = r1
            r5 = r1
            r0 = r1
        L_0x001d:
            X.Hrt r2 = X.C250563lf.A0C(r7)
            r2.A0G = r4
            r2.A0Q = r3
            r2.A0R = r6
            r2.A0P = r5
            r2.A02 = r0
            if (r8 == 0) goto L_0x0068
            X.1Xj r0 = r8.A02
        L_0x002f:
            com.instagram.music.common.config.MusicAttributionConfig r0 = A03(r0)
            r2.A08 = r0
            if (r8 == 0) goto L_0x0066
            com.instagram.user.model.User r0 = r8.A08(r9)
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r0.getUsername()
        L_0x0041:
            r2.A0e = r0
            if (r8 == 0) goto L_0x004d
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x004d
            java.lang.String r1 = r0.getId()
        L_0x004d:
            r2.A0d = r1
            X.8JL r1 = A00(r9, r4, r3)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A01 = r1
            java.lang.Boolean r0 = A06(r8)
            r2.A0E = r0
            java.lang.String r0 = A07(r8)
            r2.A0O = r0
            return r2
        L_0x0066:
            r0 = 0
            goto L_0x0041
        L_0x0068:
            r0 = 0
            goto L_0x002f
        L_0x006a:
            java.lang.String r6 = A09(r8)
            java.lang.Boolean r0 = A05(r8)
            boolean r0 = X.DbX.A1a(r0)
            r5 = 0
            if (r0 != 0) goto L_0x008d
            if (r8 == 0) goto L_0x0092
            X.1Xj r0 = r8.A02
        L_0x007d:
            com.instagram.feed.media.EffectPreviewIntf r0 = A02(r0)
            if (r0 == 0) goto L_0x008d
            com.instagram.api.schemas.AttributionUser r0 = r0.AdD()
            if (r0 == 0) goto L_0x008d
            java.lang.String r5 = r0.getUsername()
        L_0x008d:
            com.instagram.common.typedurl.ImageUrl r0 = A01(r8)
            goto L_0x001d
        L_0x0092:
            r0 = r1
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7J.A04(X.28D, X.4bN, com.instagram.common.session.UserSession):X.Hrt");
    }

    public static final Boolean A06(C267324bN r2) {
        1Xj r0;
        if (DbX.A1a(A05(r2))) {
            return null;
        }
        if (r2 != null) {
            r0 = r2.A02;
        } else {
            r0 = null;
        }
        EffectPreviewIntf A02 = A02(r0);
        if (A02 != null) {
            return DbT.A0l(MessageAvailabilityResponseId$Companion.NOT_SUPPORTED.equals(A02.getSaveStatus()));
        }
        return null;
    }

    public static final String A07(C267324bN r2) {
        1Xj r0;
        if (DbX.A1a(A05(r2))) {
            return null;
        }
        if (r2 != null) {
            r0 = r2.A02;
        } else {
            r0 = null;
        }
        EffectPreviewIntf A02 = A02(r0);
        if (A02 != null) {
            return DDx.A02(A02);
        }
        return null;
    }

    public static final String A08(C267324bN r2) {
        1Xj r0;
        if (DbX.A1a(A05(r2))) {
            return null;
        }
        if (r2 != null) {
            r0 = r2.A02;
        } else {
            r0 = null;
        }
        EffectPreviewIntf A02 = A02(r0);
        if (A02 != null) {
            return A02.getId();
        }
        return null;
    }

    public static final String A09(C267324bN r2) {
        1Xj r0;
        if (DbX.A1a(A05(r2))) {
            return null;
        }
        if (r2 != null) {
            r0 = r2.A02;
        } else {
            r0 = null;
        }
        EffectPreviewIntf A02 = A02(r0);
        if (A02 != null) {
            return A02.getName();
        }
        return null;
    }
}
