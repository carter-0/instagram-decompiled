package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import java.util.List;

/* renamed from: X.4EQ  reason: invalid class name */
public abstract class AnonymousClass4EQ {
    public static final C71392co A00 = C71392co.A04(60.0d, 5.0d);

    public static final int A02(Context context) {
        0qQ.A0B(context, 0);
        return (AnonymousClass0nB.A00(context) - AnonymousClass2uJ.A00) - A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r1 == 0) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A03(com.instagram.common.session.UserSession r6, X.C255773uh r7, X.C250973mM r8, float r9) {
        /*
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 1
            X.0qQ.A0B(r6, r0)
            boolean r0 = A0E(r6, r8)
            if (r0 == 0) goto L_0x001a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36598992585887056(0x82069700380d50, double:3.208688511404637E-306)
            long r5 = X.182.A01(r2, r6, r0)
            return r5
        L_0x001a:
            boolean r5 = r7.A1B()
            if (r5 == 0) goto L_0x0026
            X.3mL r1 = r7.A0e
            X.3mL r0 = X.C250963mL.EMPTY_STORIES_STATE_SUGGESTED_USERS
            if (r1 == r0) goto L_0x0055
        L_0x0026:
            boolean r0 = r7.A1U()
            if (r0 != 0) goto L_0x0055
            boolean r0 = r7.A1T()
            if (r0 == 0) goto L_0x003d
            r1 = 0
            java.lang.String r0 = "Suggested products unit is missing suggested products model"
        L_0x0035:
            X.17k.A07(r1, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003d:
            X.3mL r2 = r7.A0e
            X.3mL r0 = X.C250963mL.NETEGO_VISIT_THESE_SHOPS_AGAIN
            if (r2 != r0) goto L_0x0047
            r1 = 0
            java.lang.String r0 = "Suggested shops unit is missing suggested shops model"
            goto L_0x0035
        L_0x0047:
            boolean r0 = r7.A1S()
            if (r0 == 0) goto L_0x0065
            r1 = 0
            r0 = 1391(0x56f, float:1.949E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x0035
        L_0x0055:
            X.4g9 r1 = r7.A09
            java.lang.String r0 = "SU unit is missing suggested users model"
            X.17k.A07(r1, r0)
            X.3IN r0 = r1.A00
            int r1 = r0.A00
            int r0 = r1 * 1000
            if (r1 != 0) goto L_0x0074
            goto L_0x0072
        L_0x0065:
            boolean r0 = r7.A1Q()
            if (r0 == 0) goto L_0x0076
            X.4gA r1 = r7.A07
            java.lang.String r0 = "Trending in story unit is missing prompt in story model"
            X.17k.A07(r1, r0)
        L_0x0072:
            r0 = 15000(0x3a98, float:2.102E-41)
        L_0x0074:
            long r5 = (long) r0
            return r5
        L_0x0076:
            boolean r0 = r7.A1V()
            if (r0 == 0) goto L_0x007f
            r5 = 15000(0x3a98, double:7.411E-320)
            return r5
        L_0x007f:
            X.3mL r0 = X.C250963mL.NETEGO_BLOKS
            if (r2 != r0) goto L_0x0093
            X.4gB r1 = r7.A0A
            java.lang.String r0 = "Bloks netego model is missing bloks model."
            X.17k.A07(r1, r0)
            X.3Hj r0 = r1.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0074
            r0 = 5000(0x1388, float:7.006E-42)
            goto L_0x0074
        L_0x0093:
            X.3mL r1 = X.C250963mL.STORY_INTERSTITIAL_CHAINING
            r0 = 0
            if (r2 != r1) goto L_0x0099
            r0 = 1
        L_0x0099:
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x00b1
            if (r5 != 0) goto L_0x00b1
            X.3mL r0 = X.C250963mL.STORY_INTERSTITIAL_POG_GARDEN_CHAINING
            if (r2 != r0) goto L_0x00b4
            X.0Tu r2 = X.0Tu.A06
            r0 = 37172452321198652(0x8410260009023c, double:3.5713467571526996E-306)
            double r0 = X.182.A00(r2, r6, r0)
            long r5 = (long) r0
        L_0x00af:
            long r5 = r5 * r3
            return r5
        L_0x00b1:
            r5 = 10
            goto L_0x00af
        L_0x00b4:
            X.3mL r0 = X.C250963mL.NETEGO_META_GALLERY_STORIES
            if (r2 != r0) goto L_0x00c2
            X.4gE r1 = r7.A0C
            java.lang.String r0 = "Meta Gallery Stories Netego is missing data in story model"
            X.17k.A07(r1, r0)
            int r0 = r1.A00
            goto L_0x0074
        L_0x00c2:
            long r5 = (long) r9
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4EQ.A03(com.instagram.common.session.UserSession, X.3uh, X.3mM, float):long");
    }

    public static final AndroidLink A04(Context context, UserSession userSession, C255773uh r8) {
        ReelCTAIntf reelCTAIntf;
        List BN4;
        int ordinal = r8.A0e.ordinal();
        if (ordinal == 1) {
            1Xj r1 = r8.A0b;
            if (r1 != null) {
                AndroidLink A01 = AnonymousClass47K.A01(context, userSession, r1, r1.A3h(), false);
                if (A01 == null && r8.A0r()) {
                    A01 = AnonymousClass47K.A01(context, userSession, r1, r1.A3P(), false);
                }
                if (A01 != null || !r8.A0r()) {
                    return A01;
                }
                for (AndroidLink androidLink : r1.A3P()) {
                    String Avj = androidLink.Avj();
                    if (Avj != null && 00p.A0k(Avj, AnonymousClass000.A00(3357), true)) {
                        return androidLink;
                    }
                }
                return null;
            }
            throw new IllegalStateException("Reel item is of MEDIA type but doesn't have a media!");
        } else if (ordinal != 0) {
            return null;
        } else {
            C270184gK r0 = r8.A0d;
            if (r0 != null) {
                List list = r0.A00.A4Z;
                if (list == null || (reelCTAIntf = (ReelCTAIntf) 00k.A0O(list, 0)) == null || (BN4 = reelCTAIntf.BN4()) == null) {
                    return null;
                }
                return (AndroidLink) BN4.get(0);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0227, code lost:
        if (X.C267044ar.A01(r8, r9) != true) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0275, code lost:
        if (r0 == null) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0150, code lost:
        if (r0 != null) goto L_0x0152;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence A06(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C255773uh r10, java.lang.Boolean r11, java.lang.Integer r12, java.lang.String r13) {
        /*
            r3 = 0
            r2 = 1
            X.0qQ.A0B(r8, r2)
            X.1Xj r4 = r10.A0b
            if (r4 == 0) goto L_0x0020
            X.1Xy r0 = r4.A0C
            java.util.List r0 = r0.C0M()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.feed.media.ReelCTAIntf r0 = (com.instagram.feed.media.ReelCTAIntf) r0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.AtL()
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            return r0
        L_0x0020:
            boolean r0 = r10.A0o()
            if (r0 == 0) goto L_0x0031
            r0 = 2131964013(0x7f13306d, float:1.9564796E38)
        L_0x0029:
            java.lang.String r0 = r8.getString(r0)
        L_0x002d:
            X.0qQ.A07(r0)
            return r0
        L_0x0031:
            boolean r0 = r10.A0g()
            if (r0 == 0) goto L_0x003b
            r0 = 2131976633(0x7f1361b9, float:1.9590392E38)
            goto L_0x0029
        L_0x003b:
            boolean r0 = r10.A1h()
            if (r0 == 0) goto L_0x0045
            r0 = 2131976670(0x7f1361de, float:1.9590467E38)
            goto L_0x0029
        L_0x0045:
            boolean r0 = r10.A0y()
            if (r0 == 0) goto L_0x004f
            r0 = 2131970068(0x7f134814, float:1.9577077E38)
            goto L_0x0029
        L_0x004f:
            boolean r0 = r10.A0p()
            if (r0 == 0) goto L_0x0059
            r0 = 2131964371(0x7f1331d3, float:1.9565522E38)
            goto L_0x0029
        L_0x0059:
            boolean r0 = r10.A0w()
            if (r0 == 0) goto L_0x0063
            r0 = 2131969796(0x7f134704, float:1.9576525E38)
            goto L_0x0029
        L_0x0063:
            boolean r0 = r10.A1E()
            if (r0 == 0) goto L_0x006d
            r0 = 2131974595(0x7f1359c3, float:1.9586258E38)
            goto L_0x0029
        L_0x006d:
            boolean r0 = r10.A0x()
            if (r0 != 0) goto L_0x025f
            boolean r0 = r10.A0t()
            if (r0 != 0) goto L_0x025f
            boolean r0 = r10.A0l()
            if (r0 == 0) goto L_0x0086
            r10.A0A()
            r0 = 2131953104(0x7f1305d0, float:1.954267E38)
            goto L_0x0029
        L_0x0086:
            X.3mL r1 = r10.A0e
            X.3mL r0 = X.C250963mL.NETEGO_BLOKS
            if (r1 == r0) goto L_0x0094
            if (r9 == 0) goto L_0x0099
            boolean r0 = r10.A1W()
            if (r0 == 0) goto L_0x0099
        L_0x0094:
            java.lang.String r0 = r10.A0T()
            goto L_0x002d
        L_0x0099:
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x01f8
            if (r4 == 0) goto L_0x01f8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.0qQ.A0K(r11, r0)
            java.lang.String r6 = "..."
            if (r0 == 0) goto L_0x0103
            java.util.ArrayList r7 = r4.A3K(r2)
            if (r7 == 0) goto L_0x0103
            int r0 = r7.size()
            if (r0 != r2) goto L_0x00ef
            java.lang.Object r0 = r7.get(r3)
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r5 = r0.A0J
        L_0x00bf:
            if (r5 == 0) goto L_0x0103
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r7 = r5.toUpperCase(r0)
            X.0qQ.A07(r7)
            int r5 = r7.length()
            if (r5 == 0) goto L_0x0103
            r0 = 29
            if (r5 <= r0) goto L_0x0282
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = 26
            java.lang.String r0 = r7.substring(r3, r0)
            X.0qQ.A07(r0)
        L_0x00e4:
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x00ef:
            r5 = 2131973779(0x7f135693, float:1.9584603E38)
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r5 = r8.getString(r5, r0)
            goto L_0x00bf
        L_0x0103:
            X.1Xy r0 = r4.A0C
            java.lang.String r5 = r0.BMq()
            if (r5 == 0) goto L_0x01f8
            int r0 = r5.length()
            if (r0 == 0) goto L_0x01f8
            if (r9 == 0) goto L_0x01f8
            com.instagram.model.androidlink.AndroidLink r0 = A04(r8, r9, r10)
            if (r0 == 0) goto L_0x0133
            X.47L r1 = X.AnonymousClass47L.AD_DESTINATION_PROFILE_VISIT
            X.47L r0 = X.C271714jT.A01(r0)
            if (r1 != r0) goto L_0x0133
            X.0Tu r7 = X.0Tu.A05
            r0 = 36329603643687128(0x811195000340d8, double:3.0383258596152E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x0133
            r0 = 2131976696(0x7f1361f8, float:1.959052E38)
            goto L_0x0029
        L_0x0133:
            boolean r0 = X.C247643gg.A06(r9, r4)
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = X.C247643gg.A01(r8, r9, r4, r2)
            if (r0 == 0) goto L_0x0140
            return r0
        L_0x0140:
            com.instagram.model.androidlink.AndroidLink r0 = A04(r8, r9, r10)
            boolean r0 = X.C270804hK.A02(r0)
            if (r0 == 0) goto L_0x0155
            X.1Xy r0 = r4.A0C
            java.lang.String r0 = r0.Ate()
            if (r0 == 0) goto L_0x0155
        L_0x0152:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
        L_0x0155:
            boolean r0 = X.C282845Ez.A02(r9, r4)
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = X.C282845Ez.A01(r9, r4)
            return r0
        L_0x0160:
            boolean r0 = X.C247643gg.A0C(r4)
            if (r0 == 0) goto L_0x016b
            r0 = 2131962299(0x7f1329bb, float:1.956132E38)
            goto L_0x0029
        L_0x016b:
            boolean r0 = X.1sx.A0J(r4)
            if (r0 == 0) goto L_0x01bf
            X.1Xy r0 = r4.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x026f
            X.3l8 r0 = r0.Ata()
            if (r0 == 0) goto L_0x026f
            java.lang.String r6 = r0.Amm()
            if (r6 == 0) goto L_0x026f
            X.0Tu r5 = X.0Tu.A05
            r0 = 36608896776804105(0x820f9900001709, double:3.2149519616215544E-306)
            long r3 = X.182.A01(r5, r9, r0)
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0277
            int r0 = r6.length()
            long r3 = (long) r0
            r0 = 36608896776869642(0x820f990001170a, double:3.214951961663E-306)
            long r1 = X.182.A01(r5, r9, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b7
            r1 = 2131955155(0x7f130dd3, float:1.954683E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            java.lang.String r0 = r8.getString(r1, r0)
        L_0x01b3:
            X.0qQ.A0A(r0)
            return r0
        L_0x01b7:
            r0 = 2131955154(0x7f130dd2, float:1.9546827E38)
            java.lang.String r0 = r8.getString(r0)
            goto L_0x01b3
        L_0x01bf:
            if (r13 == 0) goto L_0x0233
            boolean r0 = X.00l.A0W(r13)
            r0 = r0 ^ 1
            if (r0 != r2) goto L_0x0233
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r5)
            r1 = 2131974012(0x7f13577c, float:1.9585076E38)
            java.lang.String r1 = r8.getString(r1)
            r0.append(r1)
            r0.append(r13)
            if (r12 == 0) goto L_0x0152
            int r2 = r0.length()
            int r1 = r12.intValue()
            if (r2 <= r1) goto L_0x0152
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r1 = r1 + -3
            java.lang.CharSequence r0 = r0.subSequence(r3, r1)
            java.lang.String r0 = r0.toString()
            goto L_0x00e4
        L_0x01f8:
            X.3mL r0 = X.C250963mL.NETEGO_IG_ADS_CONSENT_GROWTH
            if (r1 == r0) goto L_0x0094
            boolean r0 = r10.A1Q()
            if (r0 == 0) goto L_0x0207
            r0 = 2131971576(0x7f134df8, float:1.9580135E38)
            goto L_0x0029
        L_0x0207:
            X.3mL r0 = X.C250963mL.NETEGO_META_GALLERY_STORIES
            if (r1 == r0) goto L_0x0094
            boolean r0 = r10.A1V()
            if (r0 != 0) goto L_0x0094
            X.3mL r0 = X.C250963mL.EMPTY_STORIES_STATE_SUGGESTED_USERS
            if (r1 != r0) goto L_0x021a
            r0 = 2131973882(0x7f1356fa, float:1.9584812E38)
            goto L_0x0029
        L_0x021a:
            X.3mL r0 = X.C250963mL.EMPTY_STORIES_STATE_CONTACT_IMPORT
            if (r1 != r0) goto L_0x0234
            if (r9 == 0) goto L_0x0229
            boolean r1 = X.C267044ar.A01(r8, r9)
            r0 = 2131974912(0x7f135b00, float:1.9586901E38)
            if (r1 == r2) goto L_0x022c
        L_0x0229:
            r0 = 2131956705(0x7f1313e1, float:1.9549973E38)
        L_0x022c:
            java.lang.String r5 = r8.getString(r0)
            X.0qQ.A07(r5)
        L_0x0233:
            return r5
        L_0x0234:
            boolean r0 = r10.A0r()
            if (r0 == 0) goto L_0x025a
            if (r4 == 0) goto L_0x025a
            r4.A3P()
            java.util.List r0 = r4.A3P()
            int r0 = r0.size()
            if (r0 != r2) goto L_0x025a
            java.util.List r0 = r4.A3P()
            java.lang.Object r0 = r0.get(r3)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            java.lang.String r0 = r0.AjY()
            if (r0 == 0) goto L_0x025a
            return r0
        L_0x025a:
            r0 = 2131973000(0x7f135388, float:1.9583023E38)
            goto L_0x0029
        L_0x025f:
            if (r4 == 0) goto L_0x026a
            X.1Xy r0 = r4.A0C
            java.lang.String r0 = r0.BMq()
            if (r0 == 0) goto L_0x026a
            return r0
        L_0x026a:
            r0 = 2131969805(0x7f13470d, float:1.9576543E38)
            goto L_0x0029
        L_0x026f:
            X.1Xy r0 = r4.A0C
            java.lang.String r0 = r0.BMq()
            if (r0 != 0) goto L_0x001f
        L_0x0277:
            r0 = 2131955154(0x7f130dd2, float:1.9546827E38)
            java.lang.String r0 = r8.getString(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x0282:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4EQ.A06(android.content.Context, com.instagram.common.session.UserSession, X.3uh, java.lang.Boolean, java.lang.Integer, java.lang.String):java.lang.CharSequence");
    }

    public static final String A07(Context context, UserSession userSession, C255773uh r12) {
        Object[] objArr;
        int i;
        Object A06;
        List C0M;
        ReelCTAIntf reelCTAIntf;
        Context context2 = context;
        0qQ.A0B(context, 1);
        C255773uh r8 = r12;
        if (r12 == null) {
            return null;
        }
        1Xj r0 = r12.A0b;
        if (r0 != null && (C0M = r0.A0C.C0M()) != null && (reelCTAIntf = (ReelCTAIntf) 00k.A0J(C0M)) != null && reelCTAIntf.AtK() != null) {
            return reelCTAIntf.AtK();
        }
        if (r12.A0o()) {
            objArr = new Object[1];
            i = 2131971651;
        } else if (r12.A0y()) {
            objArr = new Object[1];
            i = 2131971656;
        } else if (r12.A0p()) {
            objArr = new Object[1];
            i = 2131971652;
        } else if (r12.A0w()) {
            objArr = new Object[1];
            i = 2131971654;
        } else if (r12.A0x() || r12.A0t()) {
            objArr = new Object[1];
            i = 2131971655;
        } else if (r12.A0l()) {
            objArr = new Object[1];
            i = 2131971650;
        } else {
            UserSession userSession2 = userSession;
            AndroidLink A04 = A04(context2, userSession, r12);
            if (A04 != null) {
                String C4A = A04.C4A();
                if (C4A != null && C4A.length() != 0) {
                    return C4A;
                }
                AnonymousClass47L A01 = C271714jT.A01(A04);
                if (A01 == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (A01 == AnonymousClass47L.AD_DESTINATION_WEB) {
                    objArr = new Object[1];
                    i = 2131971657;
                }
            }
            objArr = new Object[1];
            A06 = A06(context2, userSession2, r8, false, (Integer) null, (String) null);
            objArr[0] = A06;
            return context2.getString(2131971653, objArr);
        }
        A06 = context2.getString(i);
        objArr[0] = A06;
        return context2.getString(2131971653, objArr);
    }

    public static final void A09(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
            view.animate().cancel();
            view.setAlpha(1.0f);
            return;
        }
        view.animate().alpha(0.0f).setDuration(200).start();
    }

    public static final boolean A0A(UserSession userSession, C255773uh r3) {
        0qQ.A0B(userSession, 0);
        if (r3.CWu() || r3.A12() || r3.A0e == C250963mL.BROADCAST_ARCHIVE || r3.A1q(userSession) || r3.A1k()) {
            return true;
        }
        return false;
    }

    public static final boolean A0B(UserSession userSession, C255773uh r4) {
        0qQ.A0B(r4, 1);
        if (0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), r4.A0i) && r4.A0e == C250963mL.MEDIA && (r4.A01() > 0 || 182.A06(0Tu.A05, userSession, 36317268497404883L))) {
            1Xj r0 = r4.A0b;
            r0.getClass();
            if (!r0.A4X()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0C(UserSession userSession, C255773uh r4) {
        1Xj r0;
        DSJ BGV;
        0qQ.A0B(userSession, 0);
        if (!r4.CWu() || (r0 = r4.A0b) == null || (BGV = r0.A0C.BGV()) == null || BGV.Bc0() == null) {
            return false;
        }
        if ((!0qQ.A0K(0eE.A00(userSession).A00(), r4.A0i) || !182.A06(0Tu.A05, userSession, 36323689474239886L)) && !182.A06(0Tu.A05, userSession, 36323689473518983L)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (A0G(r7) == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0D(com.instagram.common.session.UserSession r6, X.C255773uh r7, X.AnonymousClass3BQ r8) {
        /*
            r5 = 0
            if (r7 == 0) goto L_0x001f
            boolean r0 = r7.CWu()
            if (r0 == 0) goto L_0x0010
            boolean r0 = A0G(r7)
            r2 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            boolean r1 = r7.A1W()
            boolean r0 = r7.A1h()
            if (r2 != 0) goto L_0x0020
            if (r1 != 0) goto L_0x0020
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            return r5
        L_0x0020:
            com.instagram.user.model.User r1 = r7.A0i
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r6)
            boolean r0 = X.0qQ.A0K(r1, r0)
            r4 = r0 ^ 1
            X.3BQ r3 = X.AnonymousClass3BQ.PUSH_NOTIFICATION
            X.3BQ r2 = X.AnonymousClass3BQ.ACTIVITY_FEED
            X.3BQ r1 = X.AnonymousClass3BQ.ACTIVITY_FEED_USER_MENTIONED_IN_AD_NOTIF
            X.3BQ r0 = X.AnonymousClass3BQ.ACTIVITY_FEED_USER_CONTENT_RESHARED_IN_AD_NOTIF
            X.3BQ[] r0 = new X.AnonymousClass3BQ[]{r3, r2, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            boolean r0 = r0.contains(r8)
            if (r4 != 0) goto L_0x004a
            if (r0 != 0) goto L_0x004a
            X.4g8 r0 = r7.A0f
            if (r0 == 0) goto L_0x001f
        L_0x004a:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4EQ.A0D(com.instagram.common.session.UserSession, X.3uh, X.3BQ):boolean");
    }

    public static final boolean A0E(UserSession userSession, C250973mM r2) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(userSession, 1);
        if (!C250973mM.A00(userSession, r2).isEmpty() || !r2.A0H.A1X) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r1 == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0F(com.instagram.common.session.UserSession r6, X.C250973mM r7, X.AnonymousClass3BQ r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r4 = 1
            X.0qQ.A0B(r6, r4)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            int r5 = r7.A01
            com.instagram.model.reels.Reel r2 = r7.A0H
            int r0 = r2.A00
            r3 = 0
            r1 = 0
            if (r5 != r0) goto L_0x0017
            r1 = 1
        L_0x0017:
            boolean r0 = r8.A01()
            if (r0 == 0) goto L_0x002a
            boolean r0 = r2.A17(r6)
            if (r0 == 0) goto L_0x002a
            boolean r0 = r7.A07
            if (r0 != 0) goto L_0x002a
            r2 = 1
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            java.util.List r0 = X.C250973mM.A00(r6, r7)
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0044
            int r1 = r7.A01
            java.util.List r0 = X.C250973mM.A00(r6, r7)
            int r0 = r0.size()
            int r0 = r0 - r4
            if (r1 == r0) goto L_0x0044
            if (r2 == 0) goto L_0x0045
        L_0x0044:
            r3 = 1
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4EQ.A0F(com.instagram.common.session.UserSession, X.3mM, X.3BQ):boolean");
    }

    public static final float A00(Context context) {
        Resources resources;
        Configuration configuration;
        if (!(context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null)) {
            int i = configuration.screenWidthDp;
            if (Integer.valueOf(i) == null || !2Y9.A02(AnonymousClass2YH.A00(i))) {
                return 0.2f;
            }
            return 0.35f;
        }
        return 0.2f;
    }

    public static final CharSequence A05(Context context, UserSession userSession, C255773uh r7) {
        return A06(context, userSession, r7, Boolean.FALSE, (Integer) null, (String) null);
    }

    public static final int A01() {
        int i = 0;
        if (!C61290mR.A07()) {
            return 0;
        }
        int A01 = C61290mR.A01();
        if (C226122ff.A03()) {
            i = C226122ff.A01();
        }
        return Math.max(A01, i);
    }

    public static final void A08(Activity activity, float f) {
        if (!AnonymousClass3HA.A00(activity) && 2db.A0A(activity)) {
            2db.A02(activity, 0nH.A02(f, -16777216, -1));
            boolean z = false;
            if (((double) f) > 0.6d) {
                z = true;
            }
            2db.A06(activity, z);
        }
    }

    public static final boolean A0G(C255773uh r1) {
        if (A0H(r1) || r1.A0g()) {
            return true;
        }
        if (!r1.A1E() || r1.A0Q || r1.A0S) {
            return false;
        }
        return true;
    }

    public static final boolean A0H(C255773uh r1) {
        if (r1.A0o() || r1.A0y() || r1.A0p() || r1.A0w() || r1.A0x() || r1.A0t() || r1.A0l() || r1.A0r()) {
            return true;
        }
        return false;
    }
}
