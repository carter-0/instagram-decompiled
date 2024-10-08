package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7SG  reason: invalid class name */
public final class AnonymousClass7SG implements AnonymousClass7SH {
    public boolean A00;
    public final int A01;
    public final UserSession A02;
    public final AnonymousClass7SE A03;
    public final AnonymousClass2Es A04;
    public final Map A05 = new LinkedHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02a3, code lost:
        X.1Au.A00(r7).A11(r8, r0.A01.getLong(r8, r4) + 1);
        X.1Au.A00(r7).A11(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0300, code lost:
        r5.A0M(r2, "thread_type");
        r5.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0308, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0430, code lost:
        if (r0.CUG() == true) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04f5, code lost:
        if (r0.CUG() == true) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x054e, code lost:
        if (r0.CUG() == true) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0572, code lost:
        if (r0.CUG() == true) goto L_0x0574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x057d, code lost:
        X.1Au.A00(r5).A0z(r2, r0.A01.getInt(r2, r6) + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x058c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05fa, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05fb, code lost:
        r0 = r3.getInt(r2, r1);
        r4 = r3.AR4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x067f, code lost:
        r4.E5c(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06be, code lost:
        r0 = r1.getInt(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x06c3, code lost:
        r4.E5Z(r2, r0 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x06c8, code lost:
        r4.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x06cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020d, code lost:
        if (r0.CUG() == true) goto L_0x020f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CM8(X.C327627Bo r13, X.C254703su r14) {
        /*
            r12 = this;
            r4 = 1
            X.7AG r0 = r14.A0Q
            if (r0 == 0) goto L_0x000c
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = r0.A02
            if (r1 != r0) goto L_0x000c
        L_0x000b:
            return
        L_0x000c:
            java.lang.String r0 = r14.A0g()
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r14.A0g()
            X.2FW r0 = r14.A10
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x002b
            java.util.Map r0 = r12.A05
            r0.put(r1, r13)
        L_0x002b:
            int r0 = r13.ordinal()
            switch(r0) {
                case 4: goto L_0x0657;
                case 5: goto L_0x062e;
                case 6: goto L_0x0608;
                case 7: goto L_0x0032;
                case 8: goto L_0x05e4;
                case 9: goto L_0x06b0;
                case 10: goto L_0x06a1;
                case 11: goto L_0x05d9;
                case 12: goto L_0x0032;
                case 13: goto L_0x0683;
                case 14: goto L_0x03a5;
                case 15: goto L_0x0310;
                case 16: goto L_0x01c4;
                case 17: goto L_0x05ce;
                case 18: goto L_0x02c2;
                case 19: goto L_0x0032;
                case 20: goto L_0x023d;
                case 21: goto L_0x00bb;
                case 22: goto L_0x0033;
                case 23: goto L_0x046e;
                case 24: goto L_0x018c;
                case 25: goto L_0x0032;
                case 26: goto L_0x0032;
                case 27: goto L_0x0692;
                case 28: goto L_0x05c3;
                case 29: goto L_0x0032;
                case 30: goto L_0x05b7;
                case 31: goto L_0x055d;
                case 32: goto L_0x041b;
                case 33: goto L_0x0539;
                case 34: goto L_0x01f9;
                case 35: goto L_0x0143;
                case 36: goto L_0x04e1;
                case 37: goto L_0x0590;
                default: goto L_0x0032;
            }
        L_0x0032:
            return
        L_0x0033:
            com.instagram.common.session.UserSession r7 = r12.A02
            X.2Es r2 = r12.A04
            boolean r6 = X.C331227Qb.A02(r7)
            r1 = 1
            if (r2 == 0) goto L_0x00b1
            boolean r0 = r2.CUG()
            if (r0 != r4) goto L_0x00b1
        L_0x0044:
            X.7I3 r0 = new X.7I3
            r0.<init>(r7)
            if (r2 == 0) goto L_0x00af
            java.lang.String r5 = r2.C6k()
        L_0x004f:
            X.0wc r0 = r0.A01
            X.1Ln r3 = X.1Ln.A0J(r0)
            if (r1 == 0) goto L_0x00ac
            X.XSV r2 = X.XSV.A05
        L_0x0059:
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x007f
            r0 = 8
            r3.A0Z(r0)
            r3.A0X(r4)
            if (r6 == 0) goto L_0x00a9
            java.lang.String r1 = "imagine_create_an_image_mustache"
        L_0x006d:
            java.lang.String r0 = "selected_item"
            r3.A0R(r0, r1)
            java.lang.String r0 = "thread_id"
            r3.A0R(r0, r5)
            java.lang.String r0 = "thread_type"
            r3.A0M(r2, r0)
            r3.Cgf()
        L_0x007f:
            long r2 = java.lang.System.currentTimeMillis()
            X.1Av r0 = X.1Au.A00(r7)
            java.lang.String r6 = "try_imagine_impression_time_ms"
            r4 = 0
            X.0xa r0 = r0.A01
            long r10 = r0.getLong(r6, r4)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36608518819944149(0x820f41000416d5, double:3.214712940181408E-306)
            long r8 = X.182.A01(r8, r7, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00b3
            long r8 = r8 + r10
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b3
            return
        L_0x00a9:
            java.lang.String r1 = "imagine_try_it_mustache"
            goto L_0x006d
        L_0x00ac:
            X.XSV r2 = X.XSV.A06
            goto L_0x0059
        L_0x00af:
            r5 = 0
            goto L_0x004f
        L_0x00b1:
            r1 = 0
            goto L_0x0044
        L_0x00b3:
            X.1Av r0 = X.1Au.A00(r7)
            java.lang.String r8 = "try_imagine_impression_count"
            goto L_0x02a3
        L_0x00bb:
            com.instagram.common.session.UserSession r7 = r12.A02
            X.2Es r2 = r12.A04
            boolean r6 = X.C331227Qb.A02(r7)
            r1 = 1
            if (r2 == 0) goto L_0x0139
            boolean r0 = r2.CUG()
            if (r0 != r4) goto L_0x0139
        L_0x00cc:
            X.7I3 r0 = new X.7I3
            r0.<init>(r7)
            if (r2 == 0) goto L_0x0137
            java.lang.String r5 = r2.C6k()
        L_0x00d7:
            X.0wc r0 = r0.A01
            X.1Ln r3 = X.1Ln.A0J(r0)
            if (r1 == 0) goto L_0x0134
            X.XSV r2 = X.XSV.A05
        L_0x00e1:
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0107
            r0 = 8
            r3.A0Z(r0)
            r3.A0X(r4)
            if (r6 == 0) goto L_0x0131
            java.lang.String r1 = "ask_meta_ai_mustache"
        L_0x00f5:
            java.lang.String r0 = "selected_item"
            r3.A0R(r0, r1)
            java.lang.String r0 = "thread_id"
            r3.A0R(r0, r5)
            java.lang.String r0 = "thread_type"
            r3.A0M(r2, r0)
            r3.Cgf()
        L_0x0107:
            long r2 = java.lang.System.currentTimeMillis()
            X.1Av r0 = X.1Au.A00(r7)
            java.lang.String r6 = "try_meta_ai_impression_time_ms"
            r4 = 0
            X.0xa r0 = r0.A01
            long r10 = r0.getLong(r6, r4)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36608518820009686(0x820f41000516d6, double:3.214712940222854E-306)
            long r8 = X.182.A01(r8, r7, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x013b
            long r8 = r8 + r10
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x013b
            return
        L_0x0131:
            java.lang.String r1 = "try_it_mustache"
            goto L_0x00f5
        L_0x0134:
            X.XSV r2 = X.XSV.A06
            goto L_0x00e1
        L_0x0137:
            r5 = 0
            goto L_0x00d7
        L_0x0139:
            r1 = 0
            goto L_0x00cc
        L_0x013b:
            X.1Av r0 = X.1Au.A00(r7)
            java.lang.String r8 = "try_meta_ai_impression_count"
            goto L_0x02a3
        L_0x0143:
            com.instagram.common.session.UserSession r6 = r12.A02
            X.2Es r0 = r12.A04
            r2 = 0
            if (r0 == 0) goto L_0x000b
            java.lang.String r4 = r0.C6C()
            if (r4 == 0) goto L_0x000b
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r1 = r0.A01
            java.lang.String r3 = "has_seen_xposting_creation_upsell_mustache_nux"
            java.lang.String r0 = X.002.A0R(r3, r4)
            int r1 = r1.getInt(r0, r2)
            X.1Av r0 = X.1Au.A00(r6)
            int r2 = r1 + 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = X.002.A0R(r3, r4)
            r1.E5Z(r0, r2)
            r1.apply()
            X.818 r5 = X.AnonymousClass818.IG_CHANNELS_XPOSTING_MESSAGE_FOOTER
            X.819 r4 = X.AnonymousClass819.MESSAGE_FOOTER_XPOSTING_CHANNELS
            X.8sM r3 = X.C368278sM.VIEW
            X.81A r2 = new X.81A
            r2.<init>()
            java.lang.String r1 = "create_channel"
            java.lang.String r0 = "subvariant"
            r2.A06(r0, r1)
            X.C368288sN.A00(r5, r3, r4, r2, r6)
            return
        L_0x018c:
            com.instagram.common.session.UserSession r7 = r12.A02
            X.2Es r0 = r12.A04
            r6 = 0
            r5 = 0
            if (r0 == 0) goto L_0x000b
            java.lang.String r4 = r0.C6C()
            if (r4 == 0) goto L_0x000b
            X.1Av r0 = X.1Au.A00(r7)
            X.0xa r3 = r0.A01
            X.0xY r2 = r3.AR4()
            java.lang.String r0 = "has_seen_xposting_upsell_mustache_nux"
            java.lang.String r1 = X.002.A0R(r0, r4)
            java.lang.String r0 = X.002.A0R(r0, r4)
            int r0 = r3.getInt(r0, r6)
            int r0 = r0 + 1
            r2.E5Z(r1, r0)
            r2.apply()
            X.818 r2 = X.AnonymousClass818.IG_CHANNELS_XPOSTING_MESSAGE_FOOTER
            X.819 r1 = X.AnonymousClass819.MESSAGE_FOOTER_XPOSTING_CHANNELS
            X.8sM r0 = X.C368278sM.VIEW
            X.C368288sN.A00(r2, r0, r1, r5, r7)
            return
        L_0x01c4:
            com.instagram.common.session.UserSession r0 = r12.A02
            r1 = 0
            java.lang.String r4 = r14.A0g()
            if (r4 == 0) goto L_0x000b
            X.4kA r3 = X.AnonymousClass4k9.A00(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            java.lang.String r2 = "direct_tag_channel_to_post_nux"
            java.util.Set r0 = X.AnonymousClass4kA.A00(r3, r2, r0)
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x000b
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            java.util.Set r1 = X.AnonymousClass4kA.A00(r3, r2, r0)
            r1.add(r4)
            X.0xa r0 = r3.A00
            X.0xY r4 = r0.AR4()
            r4.E5h(r2, r1)
            goto L_0x06c8
        L_0x01f9:
            com.instagram.common.session.UserSession r1 = r12.A02
            X.2Es r0 = r12.A04
            X.7I3 r2 = new X.7I3
            r2.<init>(r1)
            if (r0 == 0) goto L_0x023a
            java.lang.String r3 = r0.C6k()
            r1 = 1
            boolean r0 = r0.CUG()
            if (r0 != r4) goto L_0x023b
        L_0x020f:
            X.0wc r0 = r2.A01
            X.1Ln r5 = X.1Ln.A0J(r0)
            if (r1 == 0) goto L_0x0237
            X.XSV r2 = X.XSV.A05
        L_0x0219:
            X.0Aj r0 = r5.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x000b
            r0 = 8
            r5.A0Z(r0)
            r5.A0X(r4)
            java.lang.String r1 = "edit_with_ai"
            java.lang.String r0 = "selected_item"
            r5.A0R(r0, r1)
            java.lang.String r0 = "thread_id"
            r5.A0R(r0, r3)
            goto L_0x0300
        L_0x0237:
            X.XSV r2 = X.XSV.A06
            goto L_0x0219
        L_0x023a:
            r3 = 0
        L_0x023b:
            r1 = 0
            goto L_0x020f
        L_0x023d:
            com.instagram.common.session.UserSession r7 = r12.A02
            X.2Es r1 = r12.A04
            r5 = 1
            if (r1 == 0) goto L_0x02c0
            boolean r0 = r1.CUG()
            if (r0 != r4) goto L_0x02c0
        L_0x024a:
            X.7I3 r0 = new X.7I3
            r0.<init>(r7)
            if (r1 == 0) goto L_0x02be
            java.lang.String r3 = r1.C6k()
        L_0x0255:
            X.0wc r0 = r0.A01
            X.1Ln r2 = X.1Ln.A0J(r0)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0283
            r0 = 8
            r2.A0Z(r0)
            r2.A0X(r4)
            java.lang.String r1 = "try_it_mustache"
            java.lang.String r0 = "selected_item"
            r2.A0R(r0, r1)
            java.lang.String r0 = "thread_id"
            r2.A0R(r0, r3)
            if (r5 == 0) goto L_0x02bb
            X.XSV r1 = X.XSV.A05
        L_0x027b:
            java.lang.String r0 = "thread_type"
            r2.A0M(r1, r0)
            r2.Cgf()
        L_0x0283:
            long r2 = java.lang.System.currentTimeMillis()
            X.1Av r0 = X.1Au.A00(r7)
            java.lang.String r6 = "try_it_impression_time_ms"
            r4 = 0
            X.0xa r0 = r0.A01
            long r8 = r0.getLong(r6, r4)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 + r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x000b
            X.1Av r0 = X.1Au.A00(r7)
            java.lang.String r8 = "try_it_impression_count"
        L_0x02a3:
            X.0xa r0 = r0.A01
            long r4 = r0.getLong(r8, r4)
            r0 = 1
            long r4 = r4 + r0
            X.1Av r0 = X.1Au.A00(r7)
            r0.A11(r8, r4)
            X.1Av r0 = X.1Au.A00(r7)
            r0.A11(r6, r2)
            return
        L_0x02bb:
            X.XSV r1 = X.XSV.A06
            goto L_0x027b
        L_0x02be:
            r3 = 0
            goto L_0x0255
        L_0x02c0:
            r5 = 0
            goto L_0x024a
        L_0x02c2:
            com.instagram.common.session.UserSession r2 = r12.A02
            X.2Es r1 = r12.A04
            r3 = 1
            if (r1 == 0) goto L_0x030e
            boolean r0 = r1.CUG()
            if (r0 != r4) goto L_0x030e
        L_0x02cf:
            X.7I3 r0 = new X.7I3
            r0.<init>(r2)
            if (r1 == 0) goto L_0x030c
            java.lang.String r2 = r1.C6k()
        L_0x02da:
            X.0wc r0 = r0.A01
            X.1Ln r5 = X.1Ln.A0J(r0)
            X.0Aj r0 = r5.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x000b
            r0 = 8
            r5.A0Z(r0)
            r5.A0X(r4)
            java.lang.String r1 = "request_access_mustache"
            java.lang.String r0 = "selected_item"
            r5.A0R(r0, r1)
            java.lang.String r0 = "thread_id"
            r5.A0R(r0, r2)
            if (r3 == 0) goto L_0x0309
            X.XSV r2 = X.XSV.A05
        L_0x0300:
            java.lang.String r0 = "thread_type"
            r5.A0M(r2, r0)
            r5.Cgf()
            return
        L_0x0309:
            X.XSV r2 = X.XSV.A06
            goto L_0x0300
        L_0x030c:
            r2 = 0
            goto L_0x02da
        L_0x030e:
            r3 = 0
            goto L_0x02cf
        L_0x0310:
            com.instagram.common.session.UserSession r3 = r12.A02
            X.2Es r2 = r12.A04
            int r1 = r12.A01
            if (r2 == 0) goto L_0x000b
            r0 = 29
            if (r1 != r0) goto L_0x000b
            X.6gx r4 = X.C313746gw.A00(r3)
            r0 = r2
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x03a3
            int r7 = r0.A00
        L_0x032b:
            java.lang.String r6 = r2.C6C()
            java.lang.String r5 = r2.C6k()
            X.0wc r0 = r4.A03
            X.1Ln r2 = X.1Ln.A0E(r0)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x037f
            long r0 = r4.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0h(r0)
            java.lang.String r0 = "translation_footer_nux_rendered"
            r2.A0l(r0)
            java.lang.String r0 = "impression"
            r2.A0k(r0)
            java.lang.String r0 = "translation_footer_nux"
            r2.A0p(r0)
            java.lang.String r0 = "thread_view"
            r2.A0q(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = X.C313746gw.A01(r0)
            r2.A0o(r0)
            r2.A0s(r6)
            if (r5 == 0) goto L_0x03a1
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r5)
        L_0x0374:
            r2.A0i(r0)
            java.lang.String r0 = r4.A01
            r2.A0v(r0)
            r2.Cgf()
        L_0x037f:
            X.4kA r4 = X.AnonymousClass4k9.A00(r3)
            X.0s0 r3 = r4.A05
            X.0YZ[] r2 = X.AnonymousClass4kA.A0c
            r1 = 21
            r0 = r2[r1]
            java.lang.Object r0 = r3.CDM(r4, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            r1 = r2[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.Epx(r4, r0, r1)
            return
        L_0x03a1:
            r0 = 0
            goto L_0x0374
        L_0x03a3:
            r7 = 0
            goto L_0x032b
        L_0x03a5:
            com.instagram.common.session.UserSession r3 = r12.A02
            X.2Es r2 = r12.A04
            if (r2 == 0) goto L_0x000b
            X.6gx r1 = X.C313746gw.A00(r3)
            r0 = r2
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x0419
            int r6 = r0.A00
        L_0x03ba:
            java.lang.String r5 = r2.C6C()
            java.lang.String r4 = r2.C6k()
            X.0wc r0 = r1.A03
            X.1Ln r2 = X.1Ln.A0E(r0)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0409
            long r0 = r1.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0h(r0)
            java.lang.String r0 = "comments_mustache_text_rendered"
            r2.A0l(r0)
            java.lang.String r0 = "impression"
            r2.A0k(r0)
            java.lang.String r0 = "comments_mustache_text"
            r2.A0p(r0)
            java.lang.String r0 = "thread_view"
            r2.A0q(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = X.C313746gw.A01(r0)
            r2.A0o(r0)
            r2.A0s(r5)
            if (r4 == 0) goto L_0x0417
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r4)
        L_0x0403:
            r2.A0i(r0)
            r2.Cgf()
        L_0x0409:
            X.4kA r0 = X.AnonymousClass4k9.A00(r3)
            X.0xa r1 = r0.A00
            X.0xY r4 = r1.AR4()
            java.lang.String r2 = "direct_channel_member_reply_nux_count"
            goto L_0x06be
        L_0x0417:
            r0 = 0
            goto L_0x0403
        L_0x0419:
            r6 = 0
            goto L_0x03ba
        L_0x041b:
            com.instagram.common.session.UserSession r5 = r12.A02
            X.2Es r0 = r12.A04
            r6 = 0
            X.7I3 r2 = new X.7I3
            r2.<init>(r5)
            if (r0 == 0) goto L_0x046b
            java.lang.String r7 = r0.C6C()
            r1 = 1
            boolean r0 = r0.CUG()
            if (r0 != r4) goto L_0x046c
        L_0x0432:
            X.0wc r0 = r2.A01
            X.1Ln r3 = X.1Ln.A0J(r0)
            if (r1 == 0) goto L_0x0468
            X.XSV r2 = X.XSV.A05
        L_0x043c:
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0460
            r0 = 8
            r3.A0Z(r0)
            r3.A0X(r4)
            java.lang.String r1 = "memu_in_feed_mustache"
            java.lang.String r0 = "selected_item"
            r3.A0R(r0, r1)
            java.lang.String r0 = "thread_id"
            r3.A0R(r0, r7)
            java.lang.String r0 = "thread_type"
            r3.A0M(r2, r0)
            r3.Cgf()
        L_0x0460:
            X.1Av r0 = X.1Au.A00(r5)
            java.lang.String r2 = "memu_in_feed_imagine_yourself_impression_count_key"
            goto L_0x057d
        L_0x0468:
            X.XSV r2 = X.XSV.A06
            goto L_0x043c
        L_0x046b:
            r7 = 0
        L_0x046c:
            r1 = 0
            goto L_0x0432
        L_0x046e:
            com.instagram.common.session.UserSession r5 = r12.A02
            X.2Es r2 = r12.A04
            r1 = 1
            if (r2 == 0) goto L_0x04df
            boolean r0 = r2.CUG()
            if (r0 != r4) goto L_0x04df
        L_0x047b:
            X.7I3 r0 = new X.7I3
            r0.<init>(r5)
            if (r2 == 0) goto L_0x04dd
            java.lang.String r6 = r2.C6k()
        L_0x0486:
            X.0wc r0 = r0.A01
            X.1Ln r3 = X.1Ln.A0J(r0)
            if (r1 == 0) goto L_0x04da
            X.XSV r2 = X.XSV.A05
        L_0x0490:
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x04b4
            r0 = 8
            r3.A0Z(r0)
            r3.A0X(r4)
            java.lang.String r1 = "imagine_animate_mustache"
            java.lang.String r0 = "selected_item"
            r3.A0R(r0, r1)
            java.lang.String r0 = "thread_id"
            r3.A0R(r0, r6)
            java.lang.String r0 = "thread_type"
            r3.A0M(r2, r0)
            r3.Cgf()
        L_0x04b4:
            X.1Av r0 = X.1Au.A00(r5)
            java.lang.String r4 = "imagine_animate_impression_count"
            r1 = 0
            X.0xa r0 = r0.A01
            long r2 = r0.getLong(r4, r1)
            r0 = 1
            long r2 = r2 + r0
            X.1Av r0 = X.1Au.A00(r5)
            r0.A11(r4, r2)
            long r2 = java.lang.System.currentTimeMillis()
            X.1Av r1 = X.1Au.A00(r5)
            java.lang.String r0 = "imagine_animate_impression_time_ms"
            r1.A11(r0, r2)
            return
        L_0x04da:
            X.XSV r2 = X.XSV.A06
            goto L_0x0490
        L_0x04dd:
            r6 = 0
            goto L_0x0486
        L_0x04df:
            r1 = 0
            goto L_0x047b
        L_0x04e1:
            com.instagram.common.session.UserSession r6 = r12.A02
            X.2Es r0 = r12.A04
            X.7I3 r2 = new X.7I3
            r2.<init>(r6)
            if (r0 == 0) goto L_0x0536
            java.lang.String r5 = r0.C6k()
            r1 = 1
            boolean r0 = r0.CUG()
            if (r0 != r4) goto L_0x0537
        L_0x04f7:
            X.0wc r0 = r2.A01
            X.1Ln r3 = X.1Ln.A0J(r0)
            if (r1 == 0) goto L_0x0533
            X.XSV r2 = X.XSV.A05
        L_0x0501:
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0525
            r0 = 8
            r3.A0Z(r0)
            r3.A0X(r4)
            java.lang.String r1 = "retake_photo_for_imagine_me_mustache"
            java.lang.String r0 = "selected_item"
            r3.A0R(r0, r1)
            java.lang.String r0 = "thread_id"
            r3.A0R(r0, r5)
            java.lang.String r0 = "thread_type"
            r3.A0M(r2, r0)
            r3.Cgf()
        L_0x0525:
            X.1Av r3 = X.1Au.A00(r6)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "retake_photo_for_imagine_me_mustache_impression_last_seen_ms"
            r3.A11(r0, r1)
            return
        L_0x0533:
            X.XSV r2 = X.XSV.A06
            goto L_0x0501
        L_0x0536:
            r5 = 0
        L_0x0537:
            r1 = 0
            goto L_0x04f7
        L_0x0539:
            com.instagram.common.session.UserSession r5 = r12.A02
            X.2Es r0 = r12.A04
            r6 = 0
            X.7I3 r3 = new X.7I3
            r3.<init>(r5)
            if (r0 == 0) goto L_0x055a
            java.lang.String r2 = r0.C6k()
            r1 = 1
            boolean r0 = r0.CUG()
            if (r0 != r4) goto L_0x055b
        L_0x0550:
            r3.A0F(r2, r1, r6)
            X.1Av r0 = X.1Au.A00(r5)
            java.lang.String r2 = "imagine_create_impression_count"
            goto L_0x057d
        L_0x055a:
            r2 = 0
        L_0x055b:
            r1 = 0
            goto L_0x0550
        L_0x055d:
            com.instagram.common.session.UserSession r5 = r12.A02
            X.2Es r0 = r12.A04
            r6 = 0
            X.7I3 r3 = new X.7I3
            r3.<init>(r5)
            if (r0 == 0) goto L_0x058d
            java.lang.String r2 = r0.C6k()
            r1 = 1
            boolean r0 = r0.CUG()
            if (r0 != r4) goto L_0x058e
        L_0x0574:
            r3.A0F(r2, r1, r4)
            X.1Av r0 = X.1Au.A00(r5)
            java.lang.String r2 = "imagine_me_impression_count"
        L_0x057d:
            X.0xa r0 = r0.A01
            int r0 = r0.getInt(r2, r6)
            int r1 = r0 + 1
            X.1Av r0 = X.1Au.A00(r5)
            r0.A0z(r2, r1)
            return
        L_0x058d:
            r2 = 0
        L_0x058e:
            r1 = 0
            goto L_0x0574
        L_0x0590:
            com.instagram.common.session.UserSession r0 = r12.A02
            r1 = 0
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r3 = r0.A00
            java.lang.String r2 = "preference_direct_tap_and_hold_to_reply_meta_ai_message_nux_count"
            int r0 = r3.getInt(r2, r1)
            X.0xY r1 = r3.AR4()
            int r0 = r0 + 1
            r1.E5Z(r2, r0)
            r1.apply()
            long r1 = java.lang.System.currentTimeMillis()
            X.0xY r4 = r3.AR4()
            java.lang.String r0 = "preference_direct_tap_and_hold_to_reply_meta_ai_message_last_time_seen"
            goto L_0x067f
        L_0x05b7:
            com.instagram.common.session.UserSession r0 = r12.A02
            r1 = 0
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r3 = r0.A00
            java.lang.String r2 = "preference_direct_regenerate_ai_message_nux_count"
            goto L_0x05fb
        L_0x05c3:
            com.instagram.common.session.UserSession r0 = r12.A02
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r3 = r0.A00
            java.lang.String r2 = "direct_add_reactions_nux_count"
            goto L_0x05fa
        L_0x05ce:
            com.instagram.common.session.UserSession r0 = r12.A02
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r3 = r0.A00
            java.lang.String r2 = "direct_threads_upsell_nux_count"
            goto L_0x05fa
        L_0x05d9:
            com.instagram.common.session.UserSession r0 = r12.A02
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r3 = r0.A00
            java.lang.String r2 = "direct_collab_collection_nux_impression_count"
            goto L_0x05fa
        L_0x05e4:
            com.instagram.common.session.UserSession r2 = r12.A02
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r2)
            boolean r1 = X.2Ek.A01(r0)
            X.4kA r0 = X.AnonymousClass4k9.A00(r2)
            X.0xa r3 = r0.A00
            if (r1 == 0) goto L_0x0605
            java.lang.String r2 = "direct_saved_reply_nux_impression_count_creator"
        L_0x05fa:
            r1 = 0
        L_0x05fb:
            int r0 = r3.getInt(r2, r1)
            X.0xY r4 = r3.AR4()
            goto L_0x06c3
        L_0x0605:
            java.lang.String r2 = "direct_saved_reply_nux_impression_count"
            goto L_0x05fa
        L_0x0608:
            com.instagram.common.session.UserSession r0 = r12.A02
            X.4kA r3 = X.AnonymousClass4k9.A00(r0)
            X.0xa r0 = r3.A00
            X.0xY r4 = r0.AR4()
            X.0s0 r2 = r3.A09
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 5
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 + 1
            java.lang.String r0 = "direct_gift_message_nux_count"
            r4.E5Z(r0, r1)
            goto L_0x06c8
        L_0x062e:
            com.instagram.common.session.UserSession r0 = r12.A02
            X.1Av r1 = X.1Au.A00(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0xa r3 = r1.A01
            X.0xY r2 = r3.AR4()
            java.lang.String r1 = "direct_reply_nux_count"
            int r0 = r3.getInt(r1, r0)
            int r0 = r0 + 1
            r2.E5Z(r1, r0)
            r2.apply()
            X.0xY r4 = r3.AR4()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "direct_reply_nux_seen_timestamp"
            goto L_0x067f
        L_0x0657:
            com.instagram.common.session.UserSession r0 = r12.A02
            X.1Av r1 = X.1Au.A00(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0xa r3 = r1.A01
            X.0xY r2 = r3.AR4()
            java.lang.String r1 = "direct_forwarding_nux_count"
            int r0 = r3.getInt(r1, r0)
            int r0 = r0 + 1
            r2.E5Z(r1, r0)
            r2.apply()
            X.0xY r4 = r3.AR4()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "direct_forwarding_seen_timestamp"
        L_0x067f:
            r4.E5c(r0, r1)
            goto L_0x06c8
        L_0x0683:
            com.instagram.common.session.UserSession r0 = r12.A02
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r1 = r0.A00
            X.0xY r4 = r1.AR4()
            java.lang.String r2 = "direct_share_message_nux_count"
            goto L_0x06be
        L_0x0692:
            com.instagram.common.session.UserSession r0 = r12.A02
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r1 = r0.A00
            X.0xY r4 = r1.AR4()
            java.lang.String r2 = "direct_avatar_update_nux_count"
            goto L_0x06be
        L_0x06a1:
            com.instagram.common.session.UserSession r0 = r12.A02
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r1 = r0.A00
            X.0xY r4 = r1.AR4()
            java.lang.String r2 = "direct_avatar_sticker_nux_count"
            goto L_0x06be
        L_0x06b0:
            com.instagram.common.session.UserSession r0 = r12.A02
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r1 = r0.A00
            X.0xY r4 = r1.AR4()
            java.lang.String r2 = "direct_create_you_avatar_nux_count"
        L_0x06be:
            r0 = 0
            int r0 = r1.getInt(r2, r0)
        L_0x06c3:
            int r0 = r0 + 1
            r4.E5Z(r2, r0)
        L_0x06c8:
            r4.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7SG.CM8(X.7Bo, X.3su):void");
    }

    public final boolean EtE(C327627Bo r4, String str) {
        if (!(r4 == C327627Bo.NUX_TYPE_CHANNEL_MESSAGE_XPOSTED_HINT || r4 == C327627Bo.NUX_TYPE_AI_AGENT_REGENERATE || r4 == C327627Bo.NUX_TYPE_LONG_PRESS_REPLY_TO_AI || r4 == C327627Bo.NUX_TYPE_TRY_IMAGINE || r4 == C327627Bo.NUX_TYPE_TRY_META_AI_TEXT || r4 == C327627Bo.NUX_TYPE_SAVED_REPLY || r4 == C327627Bo.NUX_TYPE_EDIT_WITH_AI || r4 == C327627Bo.NUX_TYPE_ONE_CLICK_UPSELL_ICEBREAKER)) {
            if (this.A00 || r4 == C327627Bo.NUX_TYPE_NONE) {
                return false;
            }
            this.A00 = true;
        }
        return true;
    }

    public final AnonymousClass4UC Biq() {
        return this.A03.A02;
    }

    public AnonymousClass7SG(UserSession userSession, AnonymousClass7SE r3, AnonymousClass2Es r4, int i) {
        this.A02 = userSession;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = i;
    }

    public final C327627Bo AjO(C254703su r3) {
        Integer valueOf;
        if (r3.A0g() == null || (valueOf = Integer.valueOf(Arrays.hashCode(new Object[]{r3.A0g(), r3.A10}))) == null) {
            return null;
        }
        return (C327627Bo) this.A05.get(valueOf);
    }
}
