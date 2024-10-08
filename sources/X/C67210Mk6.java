package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Mk6  reason: case insensitive filesystem */
public final class C67210Mk6 implements AnonymousClass0lh, C74341PtH {
    public String A00;
    public String A01;
    public String A02;
    public ScheduledFuture A03;
    public boolean A04;
    public final 0wc A05;
    public final UserSession A06;
    public final ScheduledExecutorService A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final 2Dm A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public static final int A00(int i, boolean z) {
        if (i == 6) {
            return z ? 1 : 3;
        }
        if (i == 38) {
            return 17;
        }
        if (i == 43) {
            return 18;
        }
        switch (i) {
            case 11:
            case 15:
                return z ? 2 : 5;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 14:
            case 16:
                return 4;
            case 13:
            case 17:
                return 6;
            default:
                switch (i) {
                    case 33:
                        return 11;
                    case 34:
                        return z ? 10 : 12;
                    case 35:
                        return 15;
                    case 36:
                        return 16;
                    default:
                        return 8;
                }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C254923tH r10, java.lang.Boolean r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.String r14, java.lang.String r15, java.util.Set r16) {
        /*
            r9 = this;
            r2 = 0
            r6 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            boolean r0 = X.0qQ.A0K(r11, r5)
            if (r0 != 0) goto L_0x0011
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x0011
            r6 = 0
        L_0x0011:
            if (r6 == 0) goto L_0x0018
            boolean r0 = r9.A0D
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            java.lang.String r7 = r9.A02
            r4 = 0
            if (r7 == 0) goto L_0x0107
            X.0wc r1 = r9.A05
            java.lang.String r0 = "omnipicker_search_end"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0107
            X.C66580MXl.A1I(r3, r7)
            if (r6 != 0) goto L_0x00cd
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x00c9
            int r0 = r12.intValue()
            switch(r0) {
                case 0: goto L_0x00c9;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00b4;
                default: goto L_0x003b;
            }
        L_0x003b:
            X.Nmd r0 = X.C69495Nmd.INVITE_CONTACT
        L_0x003d:
            java.lang.String r1 = "end_action"
            r3.A8M(r0, r1)
            r8 = 1
            r7 = r16
            if (r14 == 0) goto L_0x00ad
            if (r16 == 0) goto L_0x00ad
            boolean r0 = X.C66580MXl.A1b(r7)
            if (r0 == 0) goto L_0x00ad
            X.Nmn r1 = X.C69505Nmn.A05
        L_0x0051:
            java.lang.String r0 = "result_type"
            r3.A8M(r1, r0)
            if (r13 == 0) goto L_0x00ab
            java.lang.String r1 = X.O19.A00(r13)
            java.lang.String r0 = "ig"
            boolean r0 = X.00l.A0d(r1, r0, r2)
            java.lang.Boolean r1 = X.DbT.A0l(r0)
        L_0x0066:
            java.lang.String r0 = "is_interop_thread"
            r3.A7p(r0, r1)
        L_0x006b:
            if (r10 == 0) goto L_0x0083
            boolean r0 = r9.A0G
            if (r0 != 0) goto L_0x0073
            if (r6 != 0) goto L_0x0083
        L_0x0073:
            int r1 = r10.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x00a8
            if (r1 == r8) goto L_0x00a5
            X.NmF r1 = X.C69471NmF.IG_DJANGO
        L_0x007e:
            java.lang.String r0 = "transport_type"
            r3.A8M(r1, r0)
        L_0x0083:
            java.lang.String r0 = r9.A0C
            if (r16 == 0) goto L_0x00d1
            java.util.LinkedHashSet r0 = X.094.A01(r0, r7)
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0093:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = X.AnonymousClass7TE.A18(r7)
            long r0 = A02(r0)
            X.AnonymousClass7TE.A1Y(r8, r0)
            goto L_0x0093
        L_0x00a5:
            X.NmF r1 = X.C69471NmF.IG_MESSENGER_INFRA
            goto L_0x007e
        L_0x00a8:
            X.NmF r1 = X.C69471NmF.IG_ADVANCED_CRYPTO_TRANSPORT
            goto L_0x007e
        L_0x00ab:
            r1 = r4
            goto L_0x0066
        L_0x00ad:
            if (r13 == 0) goto L_0x006b
            X.Nmn r1 = A03(r13, r4)
            goto L_0x0051
        L_0x00b4:
            X.Nmd r0 = X.C69495Nmd.CREATE_PUBLIC_FLOW_CHAT
            goto L_0x003d
        L_0x00b7:
            X.Nmd r0 = X.C69495Nmd.CREATE_BROADCAST_FLOW_CHAT
            goto L_0x003d
        L_0x00ba:
            X.Nmd r0 = X.C69495Nmd.CREATE_GROUP_FROM_ADDING_GROUP_MEMBER
            goto L_0x003d
        L_0x00bd:
            X.Nmd r0 = X.C69495Nmd.CREATE_GROUP
            goto L_0x003d
        L_0x00c1:
            X.Nmd r0 = X.C69495Nmd.ADD_GROUP_MEMBER
            goto L_0x003d
        L_0x00c5:
            X.Nmd r0 = X.C69495Nmd.ABANDON
            goto L_0x003d
        L_0x00c9:
            X.Nmd r0 = X.C69495Nmd.DWELL
            goto L_0x003d
        L_0x00cd:
            X.Nmd r0 = X.C69495Nmd.SUCCESS
            goto L_0x003d
        L_0x00d1:
            long r0 = A02(r0)
            java.util.List r8 = X.C66582MXn.A10(r0)
        L_0x00d9:
            java.lang.String r0 = "recipient_ids"
            r3.AAe(r0, r8)
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x00e5
            X.C66581MXm.A1G(r3, r6)
        L_0x00e5:
            if (r14 == 0) goto L_0x00f8
            java.lang.String r0 = "is_group_named"
            r3.A7p(r0, r5)
            r1 = 3
            java.lang.String r0 = "search_mode"
            X.AnonymousClass7TE.A1W(r3, r0, r1)
            r1 = 2
            java.lang.String r0 = "entry_point"
            X.AnonymousClass7TE.A1W(r3, r0, r1)
        L_0x00f8:
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x0104
            X.3tH r0 = X.C254923tH.DJANGO
            if (r10 == r0) goto L_0x0101
            r15 = r4
        L_0x0101:
            X.C66580MXl.A1J(r3, r15)
        L_0x0104:
            r3.Cgf()
        L_0x0107:
            r9.A02 = r4
            r9.A04 = r2
            com.instagram.common.session.UserSession r3 = r9.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328508426894718(0x81109600013d7e, double:3.037633240105596E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0017
            r9.A00 = r4
            r9.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67210Mk6.A09(X.3tH, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.util.Set):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r14.length() == 0) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0131, code lost:
        if (r4.A0B != null) goto L_0x0122;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C68273N8k r19, java.util.List r20) {
        /*
            r18 = this;
            r2 = 0
            r6 = 1
            r7 = r20
            X.0qQ.A0B(r7, r6)
            r5 = r18
            java.lang.String r12 = r5.A02
            if (r12 == 0) goto L_0x012e
            X.0wc r1 = r5.A05
            java.lang.String r0 = "omnipicker_search_result_selected"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x012e
            X.N0w r13 = new X.N0w
            r13.<init>()
            r10 = r19
            java.lang.Integer r11 = r10.A04
            com.instagram.model.direct.DirectSearchResult r4 = r10.A03
            boolean r9 = r4 instanceof com.instagram.model.direct.DirectShareTarget
            r8 = 0
            if (r9 == 0) goto L_0x0143
            r0 = r4
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = r0.A0L
        L_0x0032:
            X.Nmn r1 = A03(r11, r0)
            java.lang.String r0 = "result_type"
            r13.A01(r1, r0)
            java.lang.String r14 = r10.A06
            java.lang.String r0 = "query_string"
            r13.A06(r0, r14)
            long r0 = r10.A01
            r16 = 0
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 >= 0) goto L_0x013d
            r1 = r8
        L_0x004b:
            java.lang.String r0 = "result_index"
            r13.A05(r0, r1)
            java.lang.String r0 = "search_result"
            r3.AAK(r13, r0)
            int r13 = A01(r10)
            if (r14 == 0) goto L_0x0062
            int r1 = r14.length()
            r0 = 0
            if (r1 != 0) goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            int r1 = A00(r13, r0)
            java.lang.String r0 = "ui_section"
            X.AnonymousClass7TE.A1W(r3, r0, r1)
            X.C66580MXl.A1I(r3, r12)
            java.util.List r1 = A05(r10)
            java.lang.String r0 = "data_sources"
            r3.AAe(r0, r1)
            java.lang.String r1 = X.O19.A00(r11)
            java.lang.String r0 = "ig"
            boolean r0 = X.00l.A0d(r1, r0, r2)
            java.lang.Boolean r1 = X.DbT.A0l(r0)
            java.lang.String r0 = "is_interop_thread"
            r3.A7p(r0, r1)
            java.util.List r1 = A07(r7)
            java.lang.String r0 = "preselected_items"
            r3.AAe(r0, r1)
            long r0 = r10.A02
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 >= 0) goto L_0x0137
            r1 = r8
        L_0x009b:
            java.lang.String r0 = "ui_section_index"
            r3.A9F(r0, r1)
            com.instagram.common.session.UserSession r12 = r5.A06
            X.0Tu r11 = X.0Tu.A05
            r0 = 36328508426894718(0x81109600013d7e, double:3.037633240105596E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x00b8
            java.lang.String r1 = r5.A00
            java.lang.String r0 = "query_session_id"
            r3.AAJ(r0, r1)
            r5.A01 = r8
        L_0x00b8:
            if (r9 == 0) goto L_0x012b
            java.lang.String r0 = r10.A05
            if (r0 == 0) goto L_0x00e9
            X.N1H r8 = new X.N1H
            r8.<init>()
            java.lang.String r1 = X.C71112Od3.A04(r0)
            java.lang.String r0 = "request_id"
            r8.A06(r0, r1)
            r0 = r4
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            com.instagram.model.direct.DirectShareTargetLoggingInfo r0 = r0.A08
            if (r0 == 0) goto L_0x0134
            java.lang.Double r0 = r0.A01
            if (r0 == 0) goto L_0x0134
            double r0 = r0.doubleValue()
        L_0x00db:
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "final_score"
            r8.A04(r0, r1)
            java.lang.String r0 = "mnet_request"
            r3.AAK(r8, r0)
        L_0x00e9:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0111
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            java.lang.String r2 = "is_epd"
            r3.A7p(r2, r0)
            java.util.Iterator r1 = r7.iterator()
        L_0x00fa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0111
            com.instagram.model.direct.DirectShareTarget r0 = X.DbT.A0f(r1)
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x00fa
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r3.A7p(r2, r0)
        L_0x0111:
            boolean r0 = r5.A0F
            com.instagram.model.direct.DirectShareTarget r4 = (com.instagram.model.direct.DirectShareTarget) r4
            if (r0 == 0) goto L_0x012f
            X.3t2 r0 = X.DbS.A0c(r4)
            java.lang.String r0 = r5.A04(r0)
            X.C66580MXl.A1J(r3, r0)
        L_0x0122:
            java.util.List r1 = r5.A06(r4)
            java.lang.String r0 = "recipient_ids"
            r3.AAe(r0, r1)
        L_0x012b:
            r3.Cgf()
        L_0x012e:
            return
        L_0x012f:
            java.lang.Boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x012b
            goto L_0x0122
        L_0x0134:
            r0 = 0
            goto L_0x00db
        L_0x0137:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x009b
        L_0x013d:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x004b
        L_0x0143:
            r0 = r8
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67210Mk6.A0A(X.N8k, java.util.List):void");
    }

    public final void onSessionWillEnd() {
        this.A02 = null;
        this.A04 = false;
        A08();
    }

    public static final int A01(C68273N8k n8k) {
        DirectShareTarget directShareTarget;
        int i = n8k.A00;
        DirectSearchResult directSearchResult = n8k.A03;
        if (!(directSearchResult instanceof DirectShareTarget) || (directShareTarget = (DirectShareTarget) directSearchResult) == null || directShareTarget.A0B == null || i != 6) {
            return i;
        }
        return 34;
    }

    private final String A04(C254783t2 r4) {
        C254783t2 r0;
        if (r4 instanceof C254763t0) {
            return ((C254763t0) r4).A00;
        }
        if (r4 instanceof C291175gg) {
            AnonymousClass3U9 B35 = this.A0B.B35(((C291175gg) r4).A00);
            if (B35 != null) {
                return B35.C6C();
            }
            return null;
        }
        if (r4 instanceof C69042Ndc) {
            r0 = ((C69042Ndc) r4).A00;
        } else if (r4 instanceof C333417Yw) {
            r0 = ((C333417Yw) r4).A00;
        } else if (r4 instanceof MsysThreadId) {
            return String.valueOf(((MsysThreadId) r4).A00);
        } else {
            return null;
        }
        return A04(r0);
    }

    public static final List A05(C68273N8k n8k) {
        C69456Nm0 nm0;
        DirectShareTarget directShareTarget;
        DirectShareTargetLoggingInfo directShareTargetLoggingInfo;
        DirectSearchResult directSearchResult = n8k.A03;
        Boolean bool = null;
        if (!(!(directSearchResult instanceof DirectShareTarget) || (directShareTarget = (DirectShareTarget) directSearchResult) == null || (directShareTargetLoggingInfo = directShareTarget.A08) == null)) {
            bool = directShareTargetLoggingInfo.A00;
        }
        if (DbX.A1a(bool)) {
            nm0 = C69456Nm0.SERVER;
        } else if (AnonymousClass7TF.A1Y(bool, false)) {
            nm0 = C69456Nm0.LOCAL;
        } else if (bool == null) {
            return 0sn.A00;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return AnonymousClass7TE.A1I(nm0);
    }

    private final List A06(DirectShareTarget directShareTarget) {
        if (DbX.A1a(directShareTarget.A0B)) {
            List list = directShareTarget.A0P;
            if (list == null) {
                return 0sn.A00;
            }
            return list;
        }
        ArrayList A0B2 = directShareTarget.A0B();
        ArrayList A0r = AnonymousClass7TG.A0r(A0B2);
        Iterator it = A0B2.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            0qQ.A0A(A18);
            AnonymousClass7TE.A1Y(A0r, A02(A18));
        }
        return A0r;
    }

    public final void A08() {
        ScheduledFuture scheduledFuture = this.A03;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.A03 = null;
        this.A04 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (r3.length() == 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011b, code lost:
        if (X.AnonymousClass7TF.A1Y(r3.A0B, true) != false) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cit(X.OHD r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r7 = r8.A02
            if (r7 == 0) goto L_0x0114
            java.lang.Object r3 = r9.A05
            r6 = r3
            X.N8k r6 = (X.C68273N8k) r6
            if (r6 == 0) goto L_0x0114
            X.0wc r1 = r8.A05
            java.lang.String r0 = "omnipicker_search_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0114
            java.lang.Integer r5 = r6.A04
            X.N0v r4 = new X.N0v
            r4.<init>()
            boolean r1 = r3 instanceof X.C68273N8k
            r0 = 0
            if (r1 == 0) goto L_0x0033
            X.N8k r3 = (X.C68273N8k) r3
            com.instagram.model.direct.DirectSearchResult r3 = r3.A03
            boolean r1 = r3 instanceof com.instagram.model.direct.DirectShareTarget
            if (r1 == 0) goto L_0x0033
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            if (r3 == 0) goto L_0x0033
            java.lang.String r0 = r3.A0L
        L_0x0033:
            X.Nmn r1 = A03(r5, r0)
            java.lang.String r0 = "result_type"
            r4.A01(r1, r0)
            long r0 = r6.A01
            X.C66583MXo.A1A(r4, r0)
            java.lang.String r3 = r6.A06
            java.lang.String r0 = "query_string"
            r4.A06(r0, r3)
            java.lang.String r0 = "search_result"
            r2.AAK(r4, r0)
            int r4 = A01(r6)
            if (r3 == 0) goto L_0x005a
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x005b
        L_0x005a:
            r0 = 1
        L_0x005b:
            int r1 = A00(r4, r0)
            java.lang.String r0 = "ui_section"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            X.C66580MXl.A1I(r2, r7)
            java.util.List r0 = A05(r6)
            X.C66584MXp.A0y(r2, r0, r10)
            long r0 = r6.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ui_section_index"
            r2.A9F(r0, r1)
            r4 = 1
            if (r3 == 0) goto L_0x0098
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0098
            com.instagram.common.session.UserSession r7 = r8.A06
            X.0Tu r3 = X.0Tu.A05
            r0 = 36328508426894718(0x81109600013d7e, double:3.037633240105596E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "query_session_id"
            r2.AAJ(r0, r1)
        L_0x0098:
            com.instagram.model.direct.DirectSearchResult r3 = r6.A03
            boolean r0 = r3 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 == 0) goto L_0x0111
            java.util.List r1 = r6.A07
            if (r1 == 0) goto L_0x00a7
            java.lang.String r0 = "preselected_items"
            r2.AAe(r0, r1)
        L_0x00a7:
            java.lang.String r0 = r6.A05
            if (r0 == 0) goto L_0x00d6
            X.N1H r6 = new X.N1H
            r6.<init>()
            java.lang.String r1 = X.C71112Od3.A04(r0)
            java.lang.String r0 = "request_id"
            r6.A06(r0, r1)
            r0 = r3
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            com.instagram.model.direct.DirectShareTargetLoggingInfo r0 = r0.A08
            if (r0 == 0) goto L_0x011e
            java.lang.Double r0 = r0.A01
            if (r0 == 0) goto L_0x011e
            double r0 = r0.doubleValue()
        L_0x00c8:
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "final_score"
            r6.A04(r0, r1)
            java.lang.String r0 = "mnet_request"
            r2.AAK(r6, r0)
        L_0x00d6:
            java.lang.String r1 = X.O19.A00(r5)
            java.lang.String r0 = "ig"
            boolean r0 = X.DbU.A1a(r1, r0)
            java.lang.Boolean r1 = X.DbT.A0l(r0)
            java.lang.String r0 = "is_interop_thread"
            r2.A7p(r0, r1)
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x00f7
            r0 = r3
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            boolean r0 = r0.A0E()
            X.C66581MXm.A1G(r2, r0)
        L_0x00f7:
            boolean r0 = r8.A0F
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            if (r0 == 0) goto L_0x0115
            X.3t2 r0 = X.DbS.A0c(r3)
            java.lang.String r0 = r8.A04(r0)
            X.C66580MXl.A1J(r2, r0)
        L_0x0108:
            java.util.List r1 = r8.A06(r3)
            java.lang.String r0 = "recipient_ids"
            r2.AAe(r0, r1)
        L_0x0111:
            r2.Cgf()
        L_0x0114:
            return
        L_0x0115:
            java.lang.Boolean r0 = r3.A0B
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == 0) goto L_0x0111
            goto L_0x0108
        L_0x011e:
            r0 = 0
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67210Mk6.Cit(X.OHD, boolean):void");
    }

    public C67210Mk6(UserSession userSession, boolean z) {
        this.A06 = userSession;
        this.A08 = z;
        this.A05 = DbW.A0J(userSession, "direct_omnipicker_search");
        0Tu r2 = 0Tu.A05;
        this.A0G = 182.A06(r2, userSession, 36313471746443287L);
        this.A0D = 182.A06(r2, userSession, 36313471746508824L);
        this.A0A = 182.A06(r2, userSession, 36320416709484953L);
        this.A09 = 182.A06(r2, userSession, 36314811776895795L);
        this.A0F = 182.A06(r2, userSession, 36315958532837195L);
        this.A0E = 182.A06(r2, userSession, 36323526264761585L);
        this.A0C = userSession.A06;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
        0qQ.A07(scheduledThreadPoolExecutor);
        this.A07 = scheduledThreadPoolExecutor;
        this.A0B = 2L2.A00(userSession);
    }

    public static final long A02(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            0KC.A0N("UnifiedSearchOmnipickerLogger", "Unable to convert item's id[%s] to long", e, new Object[]{str});
            return 0;
        }
    }

    public static final C69505Nmn A03(Integer num, String str) {
        switch (num.intValue()) {
            case 0:
            case 17:
                return C69505Nmn.A03;
            case 1:
                return C69505Nmn.A0G;
            case 4:
                return C69505Nmn.A0O;
            case 5:
                return C69505Nmn.A0Q;
            case 6:
                return C69505Nmn.A06;
            case 7:
                return C69505Nmn.A0P;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                if (0qQ.A0K(str, "most_engaged_followers")) {
                    return C69505Nmn.A0E;
                }
                if (0qQ.A0K(str, "most_recent_followers")) {
                    return C69505Nmn.A0F;
                }
                break;
            case 19:
                return C69505Nmn.A02;
            case 21:
                return C69505Nmn.A04;
        }
        return C69505Nmn.A0H;
    }

    public static final List A07(List list) {
        LinkedHashSet A0y = DbS.A0y();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(it);
            if (DbX.A1a(A0f.A0B)) {
                List list2 = A0f.A0P;
                if (list2 != null) {
                    A0y.addAll(list2);
                }
            } else {
                String A092 = A0f.A09();
                0qQ.A07(A092);
                A0y.add(Long.valueOf(A02(A092)));
            }
        }
        return 00k.A0a(A0y);
    }
}
