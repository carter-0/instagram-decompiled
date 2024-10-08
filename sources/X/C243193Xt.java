package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.sponsored.AdTag;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Xt  reason: invalid class name and case insensitive filesystem */
public abstract class C243193Xt {
    public static final Drawable A00(Context context, UserSession userSession, 1Xj r5, AnonymousClass3VA r6) {
        int i;
        String BE9;
        Drawable A02;
        0qQ.A0B(context, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(userSession, 3);
        int i2 = R.color.design_dark_default_color_on_background;
        switch (r6.ordinal()) {
            case 1:
            case 2:
                i = R.drawable.instagram_user_pano_filled_24;
                break;
            case 3:
            case 4:
                i = R.drawable.instagram_shopping_bag_pano_filled_24;
                break;
            case 5:
                i = R.drawable.instagram_reels_filled_12;
                break;
            case 6:
                i = R.drawable.instagram_camera_filled_16;
                break;
            case 7:
                i = R.drawable.instagram_calendar_pano_filled_24;
                break;
            case 8:
                i = R.drawable.instagram_donations_filled_12;
                break;
            case 9:
                i = R.drawable.instagram_star_pano_filled_24;
                i2 = R.color.igds_active_badge;
                break;
            case 10:
                C51956G8z B5H = r5.A0C.B5H();
                if (B5H == null || (BE9 = B5H.BE9()) == null || (A02 = C14091Tpi.A02(context, BE9)) == null) {
                    i = R.drawable.instagram_compass_pano_filled_24;
                    break;
                } else {
                    TypedValue typedValue = AnonymousClass4Ed.A00;
                    int color = context.getColor(R.color.design_dark_default_color_on_background);
                    Drawable mutate = A02.mutate();
                    0qQ.A07(mutate);
                    mutate.setColorFilter(AnonymousClass37O.A00(color));
                    return mutate;
                }
                break;
            case 11:
                i = R.drawable.instagram_story_highlight_pano_outline_24;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = R.drawable.instagram_add_pano_filled_24;
                break;
            case 13:
                i = R.drawable.instagram_content_note_add_pano_outline_24;
                break;
            case 14:
            case 15:
                boolean A0N = 0q2.A00(userSession).A0N(r5);
                i = R.drawable.instagram_heart_pano_outline_24;
                if (A0N) {
                    i = R.drawable.instagram_heart_pano_filled_24;
                    break;
                }
                break;
            case 16:
                i = R.drawable.instagram_app_horizon_pano_filled_24;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(AnonymousClass000.A00(486));
                sb.append(r6);
                throw new IllegalStateException(sb.toString());
        }
        return AnonymousClass4Ed.A01(context, i, i2);
    }

    public static final AnonymousClass3VA A01(AnonymousClass0iw r1, UserSession userSession, 1Xj r3) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r1, 2);
        return A02(userSession, r3, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a9, code lost:
        r1 = r2.getString(r0);
        X.0qQ.A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b0, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(android.content.Context r2, com.instagram.common.session.UserSession r3, X.1Xj r4, X.AnonymousClass3VA r5) {
        /*
            r0 = 1
            X.0qQ.A0B(r5, r0)
            int r0 = r5.ordinal()
            java.lang.String r1 = ""
            switch(r0) {
                case 1: goto L_0x0060;
                case 2: goto L_0x0060;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                case 5: goto L_0x009a;
                case 6: goto L_0x0096;
                case 7: goto L_0x0028;
                case 8: goto L_0x009e;
                case 9: goto L_0x0092;
                case 10: goto L_0x0061;
                case 11: goto L_0x0043;
                case 12: goto L_0x00a2;
                case 13: goto L_0x00a6;
                case 14: goto L_0x007a;
                case 15: goto L_0x0060;
                case 16: goto L_0x008e;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 486(0x1e6, float:6.81E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0028:
            com.instagram.user.model.UpcomingEvent r1 = r4.A27(r3)
            if (r1 == 0) goto L_0x003b
            X.0nE r0 = X.C61410nE.A00
            X.Vkq r1 = X.C17116VIm.A00(r3, r0, r1)
            X.Uy1 r0 = X.Uy1.A09
            java.lang.String r0 = r1.A00(r2, r0)
            return r0
        L_0x003b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0043:
            X.1Xy r0 = r4.A0C
            X.50l r0 = r0.BDc()
            if (r0 == 0) goto L_0x0060
            java.util.List r0 = r0.AZX()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = X.00k.A0J(r0)
            X.50j r0 = (X.C2801550j) r0
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r0.getTitle()
            if (r0 != 0) goto L_0x0088
            return r1
        L_0x0060:
            return r1
        L_0x0061:
            X.1Xy r0 = r4.A0C
            X.G8z r0 = r0.B5H()
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = r0.getText()
            if (r0 != 0) goto L_0x0088
        L_0x006f:
            r0 = 2131957527(0x7f131717, float:1.955164E38)
            java.lang.String r0 = r2.getString(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x007a:
            int r0 = r4.A0v()
            if (r0 <= 0) goto L_0x0089
            int r0 = r4.A0v()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0088:
            return r0
        L_0x0089:
            return r1
        L_0x008a:
            r0 = 2131976659(0x7f1361d3, float:1.9590445E38)
            goto L_0x00a9
        L_0x008e:
            r0 = 2131963522(0x7f132e82, float:1.95638E38)
            goto L_0x00a9
        L_0x0092:
            r0 = 2131956100(0x7f131184, float:1.9548746E38)
            goto L_0x00a9
        L_0x0096:
            r0 = 2131976217(0x7f136019, float:1.9589548E38)
            goto L_0x00a9
        L_0x009a:
            r0 = 2131976794(0x7f13625a, float:1.9590719E38)
            goto L_0x00a9
        L_0x009e:
            r0 = 2131960988(0x7f13249c, float:1.955866E38)
            goto L_0x00a9
        L_0x00a2:
            r0 = 2131968935(0x7f1343a7, float:1.9574779E38)
            goto L_0x00a9
        L_0x00a6:
            r0 = 2131955186(0x7f130df2, float:1.9546892E38)
        L_0x00a9:
            java.lang.String r1 = r2.getString(r0)
            X.0qQ.A07(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243193Xt.A03(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, X.3VA):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, com.instagram.model.sponsored.AdTag$AdTagModel] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, com.instagram.model.sponsored.AdTag$AdTagModel] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, com.instagram.model.barcelonashare.BarcelonaTag$BarcelonaTagModel] */
    /* JADX WARNING: type inference failed for: r0v34, types: [com.instagram.model.barcelonashare.BarcelonaTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    public static final ArrayList A04(UserSession userSession, 1Xj r34, AnonymousClass3W1 r35) {
        String str;
        ArrayList A3G;
        PointF pointF;
        AdTag adTag;
        List list;
        GQ0 gq0;
        ArrayList A3I;
        1Xj r3 = r34;
        0qQ.A0B(r3, 0);
        UserSession userSession2 = userSession;
        User A2A = r3.A2A(userSession2);
        if (A2A != null) {
            str = A2A.getId();
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList A3E = r3.A3E();
        if (A3E != null) {
            arrayList.addAll(A3E);
        }
        if (r3.A1e(userSession2).CcK()) {
            A3G = AnonymousClass595.A02(r3);
        } else {
            A3G = r3.A3G();
        }
        if (A3G != null) {
            arrayList.addAll(A3G);
        }
        ArrayList A3I2 = r3.A3I();
        if (A3I2 != null && !A3I2.isEmpty() && (A3I = r3.A3I()) != null && !A3I.isEmpty() && LOQ.A00.A01(userSession2, str, r3.A5G())) {
            arrayList.addAll(A3I);
        }
        AnonymousClass3W1 r15 = r35;
        if (A3E == null && r3.A6J() && 182.A06(0Tu.A06, userSession2, 36325970101482929L) && (gq0 = r15.A0k) != null) {
            PointF pointF2 = new PointF(gq0.A04 / ((float) gq0.A06), gq0.A05 / ((float) gq0.A07));
            ? obj = new Object();
            ? obj2 = new Object();
            obj2.A00 = obj;
            obj2.A00 = pointF2;
            arrayList.add(obj2);
        }
        if (arrayList.isEmpty() && C247073fj.A00(userSession2, r3)) {
            GQ0 gq02 = r15.A0k;
            if (r3.A5S()) {
                DUW B5U = r3.A0C.B5U();
                if (B5U != null) {
                    list = B5U.BGH();
                } else {
                    list = null;
                }
                if (!(gq02 == null || list == null || list.isEmpty())) {
                    int i = gq02.A06;
                    int i2 = 2;
                    int i3 = gq02.A07;
                    double d = (double) i;
                    double d2 = d * 0.03d;
                    double d3 = d2 / 2.0d;
                    double d4 = (double) (i / 2);
                    double d5 = d4 - d3;
                    double d6 = (double) (i3 / 2);
                    double d7 = d6 - d3;
                    if (C247073fj.A01(gq02, d2, d2, d5, d7)) {
                        i2 = 0;
                    } else {
                        double d8 = d4 + d3;
                        double d9 = d - d2;
                        if (C247073fj.A01(gq02, d8, d2, d9, d7)) {
                            i2 = 1;
                        } else {
                            double d10 = d6 + d3;
                            double d11 = ((double) i3) - d2;
                            if (!C247073fj.A01(gq02, d2, d10, d5, d11)) {
                                if (C247073fj.A01(gq02, d8, d10, d9, d11)) {
                                    i2 = 3;
                                } else {
                                    r15.A0k(false);
                                    return arrayList;
                                }
                            }
                        }
                    }
                    C257563xb r1 = (C257563xb) list.get(i2);
                    0qQ.A0B(r1, 1);
                    ? obj3 = new Object();
                    obj3.A00 = r1;
                    adTag = new AdTag(new PointF(gq02.A04 / ((float) i), gq02.A05 / ((float) i3)), obj3, Integer.valueOf(i2));
                }
            } else {
                C257563xb A1G = r3.A1G();
                if (A1G != null) {
                    if (gq02 == null) {
                        pointF = new PointF(0.5f, 0.5f);
                    } else {
                        pointF = new PointF(gq02.A04 / ((float) gq02.A06), gq02.A05 / ((float) gq02.A07));
                    }
                    ? obj4 = new Object();
                    obj4.A00 = A1G;
                    adTag = new AdTag(pointF, obj4, (Integer) null);
                }
            }
            arrayList.add(adTag);
        }
        return arrayList;
    }

    public static final boolean A05(AnonymousClass0iw r2, UserSession userSession, 1Xj r4, 1Xj r5, AnonymousClass3VA r6) {
        boolean A02;
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r2, 3);
        if (r6 != null) {
            C246413eY.A00(userSession);
            A02 = AnonymousClass3eZ.A00(r2, r4, r6);
        } else {
            A02 = C246413eY.A00(userSession).A02(r2, r4, r5);
        }
        if (!A02 || r4.A5f()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (new X.AnonymousClass5F3(r4).A01(r5) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r5.A0v() > 0) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A08(com.instagram.common.session.UserSession r4, X.1Xj r5, X.AnonymousClass3VA r6) {
        /*
            r2 = 0
            r1 = 1
            int r0 = r6.ordinal()
            switch(r0) {
                case 1: goto L_0x0035;
                case 2: goto L_0x0035;
                case 3: goto L_0x0036;
                case 7: goto L_0x000a;
                case 14: goto L_0x002c;
                case 15: goto L_0x0035;
                default: goto L_0x0009;
            }
        L_0x0009:
            return r2
        L_0x000a:
            com.instagram.user.model.UpcomingEvent r3 = r5.A27(r4)
            if (r3 == 0) goto L_0x0033
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = X.C18810W3l.A0D(r3, r0)
            if (r0 != 0) goto L_0x0033
            boolean r0 = X.C243213Xw.A08(r5)
            if (r0 == 0) goto L_0x0033
            X.5F3 r0 = new X.5F3
            r0.<init>(r4)
            boolean r0 = r0.A01(r5)
            if (r0 != 0) goto L_0x0033
            goto L_0x0032
        L_0x002c:
            int r0 = r5.A0v()
            if (r0 <= 0) goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            r1 = r2 ^ 1
        L_0x0035:
            return r1
        L_0x0036:
            boolean r1 = X.AnonymousClass3YF.A00(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243193Xt.A08(com.instagram.common.session.UserSession, X.1Xj, X.3VA):boolean");
    }

    public static final AnonymousClass3VA A02(UserSession userSession, 1Xj r4, 1Xj r5) {
        String str;
        String str2;
        if (r4.A6a(userSession) && 182.A06(0Tu.A05, userSession, 36329083952578332L)) {
            return AnonymousClass3VA.ICONIC_ENTRYPOINTS;
        }
        if (C243203Xv.A00(userSession, r4)) {
            return AnonymousClass3VA.UPCOMING_EVENT;
        }
        if (r4.A1e(userSession).A63()) {
            return AnonymousClass3VA.SHOPPING_ADS;
        }
        if (r5.A4g()) {
            C277994w4 BQf = r5.BQf();
            if (BQf != null) {
                str2 = BQf.getOverlayType();
            } else {
                str2 = null;
            }
            if (!(!0qQ.A0K(str2, "MISINFORMATION"))) {
                return AnonymousClass3VA.FUNDRAISER;
            }
        }
        if (!C243223Xx.A02(r4) && (r4.A5G() || r4.A5I())) {
            return AnonymousClass3VA.CLIPS;
        }
        User A2A = r4.A2A(userSession);
        if (A2A != null) {
            str = A2A.getId();
        } else {
            str = null;
        }
        if (C243233Xy.A02(r4)) {
            return AnonymousClass3VA.PRODUCTS;
        }
        ArrayList A3I = r4.A3I();
        if (A3I != null && !A3I.isEmpty() && LOQ.A00.A01(userSession, str, r4.A5G())) {
            return AnonymousClass3VA.FB_USER;
        }
        if (r4.A4s() || r4.A28() != null) {
            return AnonymousClass3VA.PEOPLE;
        }
        return AnonymousClass3VA.A09;
    }

    public static final boolean A06(UserSession userSession, 1Xj r3) {
        if ((r3.BR7() == 1iA.A0Q || r3.BR7() == 1iA.A0U || r3.BR7() == 1iA.A0a) && A07(userSession, r3)) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, 1Xj r4) {
        String str;
        boolean A4u;
        User A2A = r4.A2A(userSession);
        if (A2A != null) {
            str = A2A.getId();
        } else {
            str = null;
        }
        if (r4.A4s()) {
            return true;
        }
        if (r4.A1e(userSession).CcK()) {
            A4u = AnonymousClass595.A03(r4);
        } else {
            A4u = r4.A4u();
        }
        if (A4u || C247073fj.A00(userSession, r4)) {
            return true;
        }
        ArrayList A3I = r4.A3I();
        if (A3I != null && !A3I.isEmpty() && LOQ.A00.A01(userSession, str, r4.A5G())) {
            return true;
        }
        if (!r4.A6J() || !182.A06(0Tu.A06, userSession, 36325970101482929L)) {
            return false;
        }
        return true;
    }
}
