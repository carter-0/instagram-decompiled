package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Sto  reason: case insensitive filesystem */
public final class C12411Sto implements 2FO {
    public final C58840Ae A00;
    public final QuickPerformanceLogger A01;

    public C12411Sto(C58840Ae r2, QuickPerformanceLogger quickPerformanceLogger) {
        0qQ.A0B(quickPerformanceLogger, 2);
        this.A00 = r2;
        this.A01 = quickPerformanceLogger;
    }

    public static C58840Ae A00(C12411Sto sto, Object obj) {
        0qQ.A0B(obj, 1);
        return sto.A00;
    }

    public static final void A03(AnonymousClass0Ag r1, LoggingContext loggingContext, 0sP r3) {
        if (DbT.A1Y((0Ak) r1) && !loggingContext.A05) {
            AnonymousClass2M6.A00 = loggingContext.A02;
            AnonymousClass2MQ.A00(2M7.A02);
            ((AnonymousClass0Ai) r3.invoke(r1)).Cgf();
        }
    }

    public final void A0D(C21267XRm xRm, LoggingContext loggingContext, Long l, String str, Map map) {
        LoggingContext loggingContext2 = loggingContext;
        Long l2 = l;
        Map map2 = map;
        A03(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_credential_success"), 47), loggingContext, new C73963Pmh(l2, loggingContext2, map2, xRm, str, 2));
    }

    public final void A0E(C21267XRm xRm, LoggingContext loggingContext, String str, List list, List list2, Map map, long j) {
        C51972G9s.A1C(xRm, list);
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_submit_ecppaymentcontainer_init"), 122), loggingContext, new C58803Ixo(xRm, loggingContext, str, list2, list, map, j));
        this.A01.markerPoint(223884226, "CONTAINER_SUBMISSION_INIT");
    }

    public final void A0F(C21267XRm xRm, LoggingContext loggingContext, String str, List list, List list2, Map map, long j) {
        C51974G9v.A1M(xRm, str, list);
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_submit_ecppaymentcontainer_success"), 123), loggingContext, new C58803Ixo(xRm, loggingContext, str, list2, list, map, j));
        this.A01.markerPoint(223884226, "CONTAINER_SUBMISSION_SUCCESS");
    }

    public final void A0G(C21267XRm xRm, LoggingContext loggingContext, Map map, long j) {
        0qQ.A0B(xRm, 2);
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_add_ecppaymentcontainer_fail"), 18), loggingContext, new C58752Iwz(xRm, loggingContext, map, j));
    }

    public final void A0I(LoggingContext loggingContext, Long l, String str, Map map) {
        A03(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_contact_success"), 44), loggingContext, new C74189PqV(loggingContext, l, str, map, 11));
    }

    public final void A0J(LoggingContext loggingContext, Long l, String str, Map map) {
        A03(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_shippingaddress_success"), 96), loggingContext, new C74189PqV(loggingContext, l, str, map, 14));
    }

    public final void A0P(LoggingContext loggingContext, String str, String str2, Map map) {
        A03(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_shippingoption_fail"), 98), loggingContext, new C74192PqY((Object) loggingContext, (Object) map, str, str2, 9));
    }

    public final void A0R(LoggingContext loggingContext, String str, String str2, Map map) {
        A03(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_shippingoption_success"), 100), loggingContext, new C74192PqY((Object) loggingContext, (Object) map, str, str2, 11));
    }

    public final void A0S(LoggingContext loggingContext, String str, List list, List list2) {
        0qQ.A0B(list, 1);
        List list3 = list2;
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_add_incentives_fail"), 24), loggingContext, new C73963Pmh(list3, loggingContext, list, (Object) null, str, 1));
    }

    public final void A0f(LoggingContext loggingContext, String str, Map map, boolean z) {
        A03(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_ecpotc_success"), 71), loggingContext, new C58771IxI(loggingContext, map, str, 6, z));
    }

    public final void A0g(LoggingContext loggingContext, List list, List list2) {
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_add_incentives_success"), 26), loggingContext, new C58769IxG(15, (Object) null, loggingContext, list, list2));
    }

    public final void A0h(LoggingContext loggingContext, List list, List list2) {
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_remove_incentives_success"), 114), loggingContext, new C58769IxG(18, (Object) null, loggingContext, list, list2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0452, code lost:
        r2.A05(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0459, code lost:
        if (X.DbT.A1Y(r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        throw X.AnonymousClass7TF.A0W("Invalid event name: ", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07b8, code lost:
        r3.A0N(r2, "event_payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07c1, code lost:
        if (X.SUU.A0E(r5) == false) goto L_0x07ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07c3, code lost:
        r3.A0x(X.SUU.A09(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x07ca, code lost:
        r3.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x08f0, code lost:
        if (X.0qQ.A0K(r2, r0) == false) goto L_0x08f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x08f2, code lost:
        A09(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08f9, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x08fb, code lost:
        X.Pxe.A1Q(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0902, code lost:
        if (X.SUU.A0E(r5) == false) goto L_0x090d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0904, code lost:
        r3.A9H("extra_data", X.SUU.A09(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x090d, code lost:
        X.Pxk.A0V(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0910, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e2, code lost:
        r2 = X.SUU.A06(r5);
        r1 = new X.0bb();
        X.SQ1.A03(r1, r10);
        A05(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        if (X.0qQ.A0K(r2, "edit_email") != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ff, code lost:
        if (X.0qQ.A0K(r2, "edit_phone") == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        A09(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0108, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        A04(r3, r1, r5);
        X.Pxk.A0V(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cgl(java.lang.String r21, java.util.Map r22) {
        /*
            r20 = this;
            r2 = 0
            r3 = r21
            X.0qQ.A0B(r3, r2)
            r1 = r22
            if (r22 == 0) goto L_0x0a64
            java.lang.String r0 = "logging_context"
            java.lang.Object r10 = r1.get(r0)
            com.facebookpay.logging.LoggingContext r10 = (com.facebookpay.logging.LoggingContext) r10
            if (r10 == 0) goto L_0x0a63
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x0a63
            java.util.Set r0 = r10.A03
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0a63
            java.lang.String r6 = r10.A02
            X.AnonymousClass2M6.A00 = r6
            X.2M7 r4 = X.2M7.A02
            X.AnonymousClass2MQ.A00(r4)
            java.util.Set r9 = r10.A04
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r8 = X.AnonymousClass7TF.A0u(r1)
        L_0x0033:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0055
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r8)
            java.lang.Object r7 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r9.contains(r7)
            if (r0 == 0) goto L_0x0051
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0033
            java.lang.String r1 = ""
        L_0x0051:
            r5.put(r7, r1)
            goto L_0x0033
        L_0x0055:
            int r0 = r3.hashCode()
            r1 = r20
            switch(r0) {
                case -2082718594: goto L_0x0065;
                case -2010088065: goto L_0x0072;
                case -1952555357: goto L_0x00d6;
                case -1908011720: goto L_0x0111;
                case -1780133084: goto L_0x0136;
                case -1535326856: goto L_0x015d;
                case -1436325711: goto L_0x0191;
                case -1402887998: goto L_0x01c1;
                case -1227870331: goto L_0x01e9;
                case -1222211672: goto L_0x01f3;
                case -1163521053: goto L_0x0250;
                case -1087737056: goto L_0x027c;
                case -1029748718: goto L_0x02a8;
                case -859606767: goto L_0x02cf;
                case -611547970: goto L_0x0319;
                case -573578433: goto L_0x0345;
                case -545346713: goto L_0x036f;
                case -471261953: goto L_0x0398;
                case -448490126: goto L_0x03cb;
                case -423810144: goto L_0x03f7;
                case -277602436: goto L_0x045d;
                case -277500562: goto L_0x04e8;
                case -158857220: goto L_0x054d;
                case -133110930: goto L_0x057f;
                case -110730897: goto L_0x05a7;
                case -85271377: goto L_0x05ce;
                case -64452579: goto L_0x05ff;
                case 292863669: goto L_0x062a;
                case 491541880: goto L_0x0654;
                case 680865129: goto L_0x0688;
                case 738211679: goto L_0x06b1;
                case 903681348: goto L_0x06eb;
                case 1011441652: goto L_0x0716;
                case 1130110473: goto L_0x0739;
                case 1190396159: goto L_0x0760;
                case 1272361701: goto L_0x07ce;
                case 1317866292: goto L_0x0833;
                case 1419293762: goto L_0x086d;
                case 1493876315: goto L_0x0897;
                case 1520567506: goto L_0x08c7;
                case 1530986045: goto L_0x0911;
                case 1807001853: goto L_0x0938;
                case 1833286085: goto L_0x0964;
                case 1882193773: goto L_0x0996;
                case 1970065401: goto L_0x09c6;
                case 2044086485: goto L_0x09f1;
                case 2128639703: goto L_0x0a29;
                default: goto L_0x005e;
            }
        L_0x005e:
            java.lang.String r0 = "Invalid event name: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r3)
            throw r0
        L_0x0065:
            java.lang.String r2 = "client_edit_contact_fail"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
            goto L_0x00e2
        L_0x0072:
            java.lang.String r2 = "client_load_contact_success"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r1 = A01(r1, r2)
            r0 = 44
            X.1Ln r3 = X.C51965G9l.A0U(r1, r0)
            java.lang.String r6 = X.SUU.A06(r5)
            X.QHy r2 = new X.QHy
            r2.<init>()
            X.SQ1.A03(r2, r10)
            X.Pxe.A1S(r2, r6)
            java.lang.String r4 = "selected_contact"
            boolean r0 = X.0qQ.A0K(r6, r4)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "nux_contact"
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r1 = X.SUU.A04(r6)
            java.lang.String r0 = "contact_type"
            r2.A06(r0, r1)
        L_0x00ae:
            java.lang.String r0 = "edit_email"
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "edit_phone"
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 != 0) goto L_0x00c4
            boolean r0 = X.0qQ.A0K(r6, r4)
            if (r0 == 0) goto L_0x0455
        L_0x00c4:
            boolean r0 = X.SUU.A0D(r5)
            if (r0 == 0) goto L_0x0455
            long r0 = X.SUU.A00(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "contact_id"
            goto L_0x0452
        L_0x00d6:
            java.lang.String r2 = "client_edit_contact_success"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
        L_0x00e2:
            java.lang.String r2 = X.SUU.A06(r5)
            X.QHy r1 = new X.QHy
            r1.<init>()
            X.SQ1.A03(r1, r10)
            A05(r1, r2)
            java.lang.String r0 = "edit_email"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "edit_phone"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0104
        L_0x0101:
            A09(r1, r5)
        L_0x0104:
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r3, r1, r5)
            X.Pxk.A0V(r3)
            return
        L_0x0111:
            java.lang.String r2 = "client_add_contactdetails_success"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QHx r0 = new X.QHx
            r0.<init>()
            X.C51971G9r.A1B(r0, r10)
            A08(r0, r5)
            X.C66582MXn.A1B(r0, r10)
            X.Pxe.A1Q(r3, r0)
            goto L_0x08fe
        L_0x0136:
            java.lang.String r2 = "client_add_credentialdetails_fail"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r1 = A01(r1, r2)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QHz r0 = new X.QHz
            r0.<init>()
            X.C51971G9r.A1B(r0, r10)
            A08(r0, r5)
            X.C66582MXn.A1B(r0, r10)
            A04(r1, r0, r5)
            X.Pxk.A0V(r1)
            return
        L_0x015d:
            java.lang.String r2 = "user_edit_contact_submit"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a63
            java.lang.String r2 = X.SUU.A05(r5)
            X.QHy r1 = new X.QHy
            r1.<init>()
            X.SQ1.A03(r1, r10)
            A06(r1, r2)
            java.lang.String r0 = "edit_name_save"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x018a
            A09(r1, r5)
        L_0x018a:
            A04(r3, r1, r5)
            X.Pxk.A0V(r3)
            return
        L_0x0191:
            java.lang.String r0 = "client_add_credentialdetails_atomic"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_click_credentialdetails_atomic"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QHz r1 = new X.QHz
            r1.<init>()
            X.C51971G9r.A1B(r1, r10)
            java.lang.String r0 = X.SUU.A05(r5)
            X.Pxe.A1T(r1, r0)
            X.C66582MXn.A1B(r1, r10)
            A04(r2, r1, r5)
            X.Pxk.A0V(r2)
            return
        L_0x01c1:
            java.lang.String r2 = "user_add_credential_enter"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r2 = A01(r1, r2)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QI0 r1 = A02(r5)
            X.SQ1.A03(r1, r10)
            java.lang.String r0 = X.SUU.A05(r5)
            X.Pxe.A1T(r1, r0)
            A04(r2, r1, r5)
            X.Pxk.A0V(r2)
            return
        L_0x01e9:
            java.lang.String r0 = "user_focus_fbpayui_atomic"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            return
        L_0x01f3:
            java.lang.String r2 = "user_click_credential_atomic"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
            java.lang.String r4 = X.SUU.A05(r5)
            X.QI0 r2 = new X.QI0
            r2.<init>()
            java.lang.String r0 = "CREDENTIAL_TYPE"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof X.C21267XRm
            if (r0 == 0) goto L_0x0217
            X.XRm r1 = (X.C21267XRm) r1
            if (r1 != 0) goto L_0x0219
        L_0x0217:
            X.XRm r1 = X.C21267XRm.A03
        L_0x0219:
            X.XST r1 = X.SUU.A01(r1)
            java.lang.String r0 = "credential_type"
            r2.A01(r1, r0)
            X.SQ1.A03(r2, r10)
            X.Pxe.A1T(r2, r4)
            java.lang.String r0 = "add_payment_info"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x0243
            boolean r0 = X.SUU.A0D(r5)
            if (r0 == 0) goto L_0x0243
            long r0 = X.SUU.A00(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "credential_id"
            r2.A05(r0, r1)
        L_0x0243:
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r3, r2, r5)
            X.Pxk.A0V(r3)
            return
        L_0x0250:
            java.lang.String r2 = "user_click_shippingaddressdetails_atomic"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r2 = A01(r1, r2)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QIo r1 = new X.QIo
            r1.<init>()
            X.C51971G9r.A1B(r1, r10)
            java.lang.String r0 = X.SUU.A05(r5)
            X.Pxe.A1T(r1, r0)
            X.C66582MXn.A1B(r1, r10)
            A04(r2, r1, r5)
            X.Pxk.A0V(r2)
            return
        L_0x027c:
            java.lang.String r2 = "user_remove_contact_cancel"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r2 = A01(r1, r2)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0a63
            java.lang.String r1 = X.SUU.A05(r5)
            X.QHy r0 = new X.QHy
            r0.<init>()
            X.SQ1.A03(r0, r10)
            A06(r0, r1)
            A09(r0, r5)
            A04(r2, r0, r5)
            X.Pxk.A0V(r2)
            return
        L_0x02a8:
            java.lang.String r2 = "client_add_shippingaddressdetails_success"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r1 = A01(r1, r2)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QIo r0 = new X.QIo
            r0.<init>()
            X.C51971G9r.A1B(r0, r10)
            A08(r0, r5)
            X.C66582MXn.A1B(r0, r10)
            A04(r1, r0, r5)
            X.Pxk.A0V(r1)
            return
        L_0x02cf:
            java.lang.String r7 = "user_edit_credential_enter"
            boolean r0 = r3.equals(r7)
            if (r0 == 0) goto L_0x005e
            X.QI0 r3 = new X.QI0
            r3.<init>()
            X.XST r2 = X.XST.A02
            java.lang.String r0 = "credential_type"
            r3.A01(r2, r0)
            X.SQ1.A03(r3, r10)
            java.lang.String r2 = X.SUU.A05(r5)
            java.lang.String r0 = "target_name"
            A07(r3, r0, r2, r5)
            X.0Aj r2 = A01(r1, r7)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0a63
            java.lang.String r0 = X.Py7.A00()
            X.59v r0 = X.Pxg.A0P(r4, r2, r0, r6)
            X.JTU.A0t(r0, r2, r3)
            boolean r0 = X.SUU.A0E(r5)
            if (r0 == 0) goto L_0x0315
            java.util.Map r1 = X.SUU.A09(r5)
            java.lang.String r0 = "extra_data"
            r2.A9H(r0, r1)
        L_0x0315:
            r2.Cgf()
            return
        L_0x0319:
            java.lang.String r2 = "user_remove_contact_submit"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r2 = A01(r1, r2)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0a63
            java.lang.String r1 = X.SUU.A05(r5)
            X.QHy r0 = new X.QHy
            r0.<init>()
            X.SQ1.A03(r0, r10)
            A06(r0, r1)
            A09(r0, r5)
            A04(r2, r0, r5)
            X.Pxk.A0V(r2)
            return
        L_0x0345:
            java.lang.String r4 = "client_remove_credential_fail"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x005e
            X.QI0 r3 = A02(r5)
            X.SQ1.A03(r3, r10)
            java.lang.String r2 = X.SUU.A06(r5)
            java.lang.String r0 = "view_name"
            A07(r3, r0, r2, r5)
            X.0Aj r1 = A01(r1, r4)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r1, r3, r5)
            X.Pxk.A0V(r1)
            return
        L_0x036f:
            java.lang.String r2 = "user_add_contact_enter"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r2 = A01(r1, r2)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0a63
            java.lang.String r1 = X.SUU.A05(r5)
            X.QHy r0 = new X.QHy
            r0.<init>()
            X.SQ1.A03(r0, r10)
            A06(r0, r1)
            A04(r2, r0, r5)
            X.Pxk.A0V(r2)
            return
        L_0x0398:
            java.lang.String r4 = "user_edit_credential_submit"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x005e
            X.QI0 r3 = new X.QI0
            r3.<init>()
            X.XST r2 = X.XST.A02
            java.lang.String r0 = "credential_type"
            r3.A01(r2, r0)
            X.SQ1.A03(r3, r10)
            java.lang.String r2 = X.SUU.A05(r5)
            java.lang.String r0 = "target_name"
            A07(r3, r0, r2, r5)
            X.0Aj r1 = A01(r1, r4)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r1, r3, r5)
            X.Pxk.A0V(r1)
            return
        L_0x03cb:
            java.lang.String r4 = "user_remove_contact_enter"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.SUU.A05(r5)
            X.QHy r2 = new X.QHy
            r2.<init>()
            X.SQ1.A03(r2, r10)
            A06(r2, r0)
            A09(r2, r5)
            X.0Aj r1 = A01(r1, r4)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r1, r2, r5)
            X.Pxk.A0V(r1)
            return
        L_0x03f7:
            java.lang.String r2 = "client_load_credential_success"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r1 = A01(r1, r2)
            r0 = 47
            X.1Ln r3 = X.C51965G9l.A0U(r1, r0)
            java.lang.String r4 = X.SUU.A06(r5)
            X.QI0 r2 = new X.QI0
            r2.<init>()
            java.lang.String r0 = "CREDENTIAL_TYPE"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof X.C21267XRm
            if (r0 == 0) goto L_0x0420
            X.XRm r1 = (X.C21267XRm) r1
            if (r1 != 0) goto L_0x0422
        L_0x0420:
            X.XRm r1 = X.C21267XRm.A03
        L_0x0422:
            X.XST r1 = X.SUU.A01(r1)
            java.lang.String r0 = "credential_type"
            r2.A01(r1, r0)
            X.SQ1.A03(r2, r10)
            X.Pxe.A1S(r2, r4)
            java.lang.String r0 = "edit_card"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x0442
            java.lang.String r0 = "selected_credential"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x0455
        L_0x0442:
            boolean r0 = X.SUU.A0D(r5)
            if (r0 == 0) goto L_0x0455
            long r0 = X.SUU.A00(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "credential_id"
        L_0x0452:
            r2.A05(r0, r1)
        L_0x0455:
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x0a63
            goto L_0x07b8
        L_0x045d:
            java.lang.String r0 = "submit_payment_container_fail"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "CREDENTIAL_ID"
            java.lang.Object r6 = r5.get(r0)
            boolean r0 = r6 instanceof java.lang.Long
            r15 = 0
            if (r0 == 0) goto L_0x04e6
            java.lang.Number r6 = (java.lang.Number) r6
        L_0x0473:
            java.lang.String r0 = "CREDENTIAL_TYPE"
            java.lang.Object r11 = r5.get(r0)
            boolean r0 = r11 instanceof X.C21267XRm
            if (r0 != 0) goto L_0x047e
            r11 = r15
        L_0x047e:
            java.lang.String r0 = "APPLIED_DISCOUNTS"
            java.lang.Object r13 = r5.get(r0)
            boolean r0 = r13 instanceof java.util.List
            if (r0 == 0) goto L_0x048a
            if (r13 != 0) goto L_0x048c
        L_0x048a:
            X.0sn r13 = X.0sn.A00
        L_0x048c:
            java.lang.String r0 = "CONTAINER_IDS"
            java.lang.Object r12 = r5.get(r0)
            boolean r0 = r12 instanceof java.util.List
            if (r0 != 0) goto L_0x0497
            r12 = r15
        L_0x0497:
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r3 = r5.get(r0)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x04e4
            java.lang.String r3 = (java.lang.String) r3
        L_0x04a7:
            java.lang.String r0 = "VIEW_NAME"
            java.lang.Object r4 = r5.get(r0)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x04b4
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
        L_0x04b4:
            if (r11 == 0) goto L_0x0a63
            if (r6 == 0) goto L_0x0a63
            if (r3 == 0) goto L_0x0a63
            if (r15 == 0) goto L_0x0a63
            long r18 = r6.longValue()
            r14 = 0
            r0 = 4
            X.0qQ.A0B(r13, r0)
            X.0Ae r1 = r1.A00
            r0 = 713(0x2c9, float:9.99E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 121(0x79, float:1.7E-43)
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            X.Pmx r9 = new X.Pmx
            r17 = r2
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            A03(r0, r10, r9)
            return
        L_0x04e4:
            r3 = r15
            goto L_0x04a7
        L_0x04e6:
            r6 = r15
            goto L_0x0473
        L_0x04e8:
            java.lang.String r0 = "submit_payment_container_init"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "CREDENTIAL_ID"
            java.lang.Object r8 = r5.get(r0)
            boolean r0 = r8 instanceof java.lang.Long
            r7 = 0
            if (r0 == 0) goto L_0x054b
            java.lang.Number r8 = (java.lang.Number) r8
        L_0x04fe:
            java.lang.String r0 = "CREDENTIAL_TYPE"
            java.lang.Object r6 = r5.get(r0)
            boolean r0 = r6 instanceof X.C21267XRm
            if (r0 == 0) goto L_0x0549
            X.XRm r6 = (X.C21267XRm) r6
        L_0x050a:
            java.lang.String r0 = "APPLIED_DISCOUNTS"
            java.lang.Object r4 = r5.get(r0)
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L_0x0518
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x051a
        L_0x0518:
            X.0sn r4 = X.0sn.A00
        L_0x051a:
            java.lang.String r0 = "CONTAINER_IDS"
            java.lang.Object r3 = r5.get(r0)
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L_0x0547
            java.util.List r3 = (java.util.List) r3
        L_0x0526:
            java.lang.String r0 = "VIEW_NAME"
            java.lang.Object r2 = r5.get(r0)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0533
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x0533:
            if (r6 == 0) goto L_0x0a63
            if (r8 == 0) goto L_0x0a63
            if (r7 == 0) goto L_0x0a63
            long r15 = r8.longValue()
            r14 = 0
            r8 = r1
            r9 = r6
            r11 = r7
            r12 = r4
            r13 = r3
            r8.A0E(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0547:
            r3 = r7
            goto L_0x0526
        L_0x0549:
            r6 = r7
            goto L_0x050a
        L_0x054b:
            r8 = r7
            goto L_0x04fe
        L_0x054d:
            java.lang.String r4 = "client_edit_credential_success"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x005e
            X.QI0 r3 = new X.QI0
            r3.<init>()
            X.XST r2 = X.XST.A02
            java.lang.String r0 = "credential_type"
            r3.A01(r2, r0)
            X.SQ1.A03(r3, r10)
            java.lang.String r2 = X.SUU.A06(r5)
            java.lang.String r0 = "view_name"
            A07(r3, r0, r2, r5)
            X.0Aj r1 = A01(r1, r4)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r1, r3, r5)
            X.Pxk.A0V(r1)
            return
        L_0x057f:
            java.lang.String r2 = "user_add_credential_submit"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r2 = A01(r1, r2)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QI0 r1 = A02(r5)
            X.SQ1.A03(r1, r10)
            java.lang.String r0 = X.SUU.A05(r5)
            X.Pxe.A1T(r1, r0)
            A04(r2, r1, r5)
            X.Pxk.A0V(r2)
            return
        L_0x05a7:
            java.lang.String r2 = "client_add_shippingaddressdetails_fail"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r1 = A01(r1, r2)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QIo r0 = new X.QIo
            r0.<init>()
            X.C51971G9r.A1B(r0, r10)
            A08(r0, r5)
            X.C66582MXn.A1B(r0, r10)
            A04(r1, r0, r5)
            X.Pxk.A0V(r1)
            return
        L_0x05ce:
            java.lang.String r2 = "client_add_contact_fail"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QHy r2 = new X.QHy
            r2.<init>()
            X.SQ1.A03(r2, r10)
            A08(r2, r5)
            java.lang.String r0 = X.SUU.A06(r5)
            java.lang.String r1 = X.SUU.A04(r0)
            java.lang.String r0 = "contact_type"
            r2.A06(r0, r1)
            A04(r3, r2, r5)
            X.Pxk.A0V(r3)
            return
        L_0x05ff:
            java.lang.String r4 = "client_remove_contact_success"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.SUU.A06(r5)
            X.QHy r2 = new X.QHy
            r2.<init>()
            X.SQ1.A03(r2, r10)
            A05(r2, r0)
            A09(r2, r5)
            X.0Aj r1 = A01(r1, r4)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r1, r2, r5)
            X.Pxk.A0V(r1)
            return
        L_0x062a:
            java.lang.String r2 = "user_click_contact_atomic"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
            java.lang.String r2 = X.SUU.A05(r5)
            X.QHy r1 = new X.QHy
            r1.<init>()
            X.SQ1.A03(r1, r10)
            X.Pxe.A1T(r1, r2)
            java.lang.String r0 = "select_existing_email"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x08f2
            java.lang.String r0 = "select_existing_phone"
            goto L_0x08ec
        L_0x0654:
            java.lang.String r2 = "user_edit_contact_enter"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a63
            java.lang.String r2 = X.SUU.A05(r5)
            X.QHy r1 = new X.QHy
            r1.<init>()
            X.SQ1.A03(r1, r10)
            A06(r1, r2)
            java.lang.String r0 = "edit_name"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0681
            A09(r1, r5)
        L_0x0681:
            A04(r3, r1, r5)
            X.Pxk.A0V(r3)
            return
        L_0x0688:
            java.lang.String r2 = "user_add_contact_submit"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r2 = A01(r1, r2)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0a63
            java.lang.String r1 = X.SUU.A05(r5)
            X.QHy r0 = new X.QHy
            r0.<init>()
            X.SQ1.A03(r0, r10)
            A06(r0, r1)
            A04(r2, r0, r5)
            X.Pxk.A0V(r2)
            return
        L_0x06b1:
            java.lang.String r2 = "client_load_fbpayui_success"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r4 = A01(r1, r2)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0a63
            java.lang.String r0 = "component_logging_data"
            java.lang.Object r3 = r5.get(r0)
            if (r3 == 0) goto L_0x0a54
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r3 = (com.facebookpay.expresscheckout.logging.ComponentLoggingData) r3
            X.QIL r2 = new X.QIL
            r2.<init>()
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "context_component_name"
            r2.A06(r0, r1)
            X.SQ1.A03(r2, r10)
            java.lang.String r0 = r3.A01
            X.Pxe.A1S(r2, r0)
            X.Pxe.A1T(r2, r0)
            A04(r4, r2, r5)
            X.Pxk.A0V(r4)
            return
        L_0x06eb:
            java.lang.String r4 = "client_remove_contact_fail"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.SUU.A06(r5)
            X.QHy r2 = new X.QHy
            r2.<init>()
            X.SQ1.A03(r2, r10)
            A05(r2, r0)
            A09(r2, r5)
            X.0Aj r1 = A01(r1, r4)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r1, r2, r5)
            X.Pxk.A0V(r1)
            return
        L_0x0716:
            java.lang.String r2 = "client_add_credential_fail"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r1 = A01(r1, r2)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QI0 r0 = A02(r5)
            X.SQ1.A03(r0, r10)
            A08(r0, r5)
            A04(r1, r0, r5)
            X.Pxk.A0V(r1)
            return
        L_0x0739:
            java.lang.String r2 = "client_add_contactdetails_fail"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r1 = A01(r1, r2)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QHx r0 = new X.QHx
            r0.<init>()
            X.C51971G9r.A1B(r0, r10)
            A08(r0, r5)
            X.C66582MXn.A1B(r0, r10)
            A04(r1, r0, r5)
            X.Pxk.A0V(r1)
            return
        L_0x0760:
            java.lang.String r2 = "user_click_ecpentry_atomic"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r1 = A01(r1, r2)
            r0 = 397(0x18d, float:5.56E-43)
            X.1Ln r3 = X.C51965G9l.A0U(r1, r0)
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x0a63
            r3.A0v(r6)
            java.lang.String r0 = "product_type"
            r3.A0M(r4, r0)
            java.lang.String r2 = "platform"
            java.lang.Object r1 = r5.get(r2)
            boolean r0 = r1 instanceof X.C2818559v
            if (r0 == 0) goto L_0x0791
            X.59v r1 = (X.C2818559v) r1
            if (r1 != 0) goto L_0x0793
        L_0x0791:
            X.59v r1 = X.C2818559v.ANDROID
        L_0x0793:
            java.lang.String r0 = r1.name()
            java.lang.String r0 = X.DbY.A0k(r0)
            X.59v r0 = X.C2818559v.valueOf(r0)
            r3.A0M(r0, r2)
            java.lang.Long r1 = X.C51968G9o.A0u()
            java.lang.String r0 = "actual_event_time"
            r3.A0Q(r0, r1)
            X.QIG r2 = new X.QIG
            r2.<init>()
            X.SQ1.A03(r2, r10)
            java.lang.String r0 = "ecp_checkout"
            X.Pxe.A1T(r2, r0)
        L_0x07b8:
            java.lang.String r0 = "event_payload"
            r3.A0N(r2, r0)
            boolean r0 = X.SUU.A0E(r5)
            if (r0 == 0) goto L_0x07ca
            java.util.Map r0 = X.SUU.A09(r5)
            r3.A0x(r0)
        L_0x07ca:
            r3.Cgf()
            return
        L_0x07ce:
            java.lang.String r0 = "submit_payment_container_success"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "CREDENTIAL_ID"
            java.lang.Object r8 = r5.get(r0)
            boolean r0 = r8 instanceof java.lang.Long
            r7 = 0
            if (r0 == 0) goto L_0x0831
            java.lang.Number r8 = (java.lang.Number) r8
        L_0x07e4:
            java.lang.String r0 = "CREDENTIAL_TYPE"
            java.lang.Object r6 = r5.get(r0)
            boolean r0 = r6 instanceof X.C21267XRm
            if (r0 == 0) goto L_0x082f
            X.XRm r6 = (X.C21267XRm) r6
        L_0x07f0:
            java.lang.String r0 = "APPLIED_DISCOUNTS"
            java.lang.Object r4 = r5.get(r0)
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L_0x07fe
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0800
        L_0x07fe:
            X.0sn r4 = X.0sn.A00
        L_0x0800:
            java.lang.String r0 = "CONTAINER_IDS"
            java.lang.Object r3 = r5.get(r0)
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L_0x082d
            java.util.List r3 = (java.util.List) r3
        L_0x080c:
            java.lang.String r0 = "VIEW_NAME"
            java.lang.Object r2 = r5.get(r0)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0819
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x0819:
            if (r6 == 0) goto L_0x0a63
            if (r8 == 0) goto L_0x0a63
            if (r7 == 0) goto L_0x0a63
            long r15 = r8.longValue()
            r14 = 0
            r8 = r1
            r9 = r6
            r11 = r7
            r12 = r4
            r13 = r3
            r8.A0F(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x082d:
            r3 = r7
            goto L_0x080c
        L_0x082f:
            r6 = r7
            goto L_0x07f0
        L_0x0831:
            r8 = r7
            goto L_0x07e4
        L_0x0833:
            java.lang.String r2 = "client_load_fbpayui_init"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r4 = A01(r1, r2)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0a63
            java.lang.String r0 = "component_logging_data"
            java.lang.Object r3 = r5.get(r0)
            if (r3 == 0) goto L_0x0a59
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r3 = (com.facebookpay.expresscheckout.logging.ComponentLoggingData) r3
            X.QIL r2 = new X.QIL
            r2.<init>()
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "context_component_name"
            r2.A06(r0, r1)
            X.SQ1.A03(r2, r10)
            java.lang.String r0 = r3.A01
            X.Pxe.A1S(r2, r0)
            X.Pxe.A1T(r2, r0)
            A04(r4, r2, r5)
            X.Pxk.A0V(r4)
            return
        L_0x086d:
            java.lang.String r4 = "client_remove_credential_success"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x005e
            X.QI0 r3 = A02(r5)
            X.SQ1.A03(r3, r10)
            java.lang.String r2 = X.SUU.A06(r5)
            java.lang.String r0 = "view_name"
            A07(r3, r0, r2, r5)
            X.0Aj r1 = A01(r1, r4)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r1, r3, r5)
            X.Pxk.A0V(r1)
            return
        L_0x0897:
            java.lang.String r0 = "user_remove_credential_cancel"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_remove_credential_exit"
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QI0 r2 = A02(r5)
            X.SQ1.A03(r2, r10)
            java.lang.String r1 = X.SUU.A05(r5)
            java.lang.String r0 = "target_name"
            A07(r2, r0, r1, r5)
            A04(r3, r2, r5)
            X.Pxk.A0V(r3)
            return
        L_0x08c7:
            java.lang.String r2 = "client_add_contact_success"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
            java.lang.String r2 = X.SUU.A06(r5)
            X.QHy r1 = new X.QHy
            r1.<init>()
            X.SQ1.A03(r1, r10)
            A05(r1, r2)
            java.lang.String r0 = "add_email"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x08f2
            java.lang.String r0 = "add_phone"
        L_0x08ec:
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x08f5
        L_0x08f2:
            A09(r1, r5)
        L_0x08f5:
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.Pxe.A1Q(r3, r1)
        L_0x08fe:
            boolean r0 = X.SUU.A0E(r5)
            if (r0 == 0) goto L_0x090d
            java.util.Map r1 = X.SUU.A09(r5)
            java.lang.String r0 = "extra_data"
            r3.A9H(r0, r1)
        L_0x090d:
            X.Pxk.A0V(r3)
            return
        L_0x0911:
            java.lang.String r2 = "client_add_credentialdetails_success"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r1 = A01(r1, r2)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QHz r0 = new X.QHz
            r0.<init>()
            X.C51971G9r.A1B(r0, r10)
            A08(r0, r5)
            X.C66582MXn.A1B(r0, r10)
            A04(r1, r0, r5)
            X.Pxk.A0V(r1)
            return
        L_0x0938:
            java.lang.String r2 = "user_click_contactdetails_atomic"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r2 = A01(r1, r2)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QHx r1 = new X.QHx
            r1.<init>()
            X.C51971G9r.A1B(r1, r10)
            java.lang.String r0 = X.SUU.A05(r5)
            X.Pxe.A1T(r1, r0)
            X.C66582MXn.A1B(r1, r10)
            A04(r2, r1, r5)
            X.Pxk.A0V(r2)
            return
        L_0x0964:
            java.lang.String r4 = "client_edit_credential_fail"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x005e
            X.QI0 r3 = new X.QI0
            r3.<init>()
            X.XST r2 = X.XST.A02
            java.lang.String r0 = "credential_type"
            r3.A01(r2, r0)
            X.SQ1.A03(r3, r10)
            java.lang.String r2 = X.SUU.A06(r5)
            java.lang.String r0 = "view_name"
            A07(r3, r0, r2, r5)
            X.0Aj r1 = A01(r1, r4)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r1, r3, r5)
            X.Pxk.A0V(r1)
            return
        L_0x0996:
            java.lang.String r2 = "client_add_credential_success"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QI0 r2 = A02(r5)
            X.SQ1.A03(r2, r10)
            A08(r2, r5)
            long r0 = X.SUU.A00(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "credential_id"
            r2.A05(r0, r1)
            A04(r3, r2, r5)
            X.Pxk.A0V(r3)
            return
        L_0x09c6:
            java.lang.String r2 = "user_remove_credential_submit"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x005e
            X.0Aj r3 = A01(r1, r2)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a63
            X.QI0 r2 = A02(r5)
            X.SQ1.A03(r2, r10)
            java.lang.String r1 = X.SUU.A05(r5)
            java.lang.String r0 = "target_name"
            A07(r2, r0, r1, r5)
            A04(r3, r2, r5)
            X.Pxk.A0V(r3)
            return
        L_0x09f1:
            java.lang.String r6 = "user_click_fbpayui_atomic"
            boolean r0 = r3.equals(r6)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "component_logging_data"
            java.lang.Object r4 = r5.get(r0)
            if (r4 == 0) goto L_0x0a5e
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r4 = (com.facebookpay.expresscheckout.logging.ComponentLoggingData) r4
            X.QIL r3 = new X.QIL
            r3.<init>()
            java.lang.String r2 = r4.A00
            java.lang.String r0 = "context_component_name"
            r3.A06(r0, r2)
            X.SQ1.A03(r3, r10)
            java.lang.String r0 = r4.A01
            X.Pxe.A1T(r3, r0)
            X.0Aj r1 = A01(r1, r6)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r1, r3, r5)
            X.Pxk.A0V(r1)
            return
        L_0x0a29:
            java.lang.String r4 = "user_remove_credential_enter"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x005e
            X.QI0 r3 = A02(r5)
            X.SQ1.A03(r3, r10)
            java.lang.String r2 = X.SUU.A05(r5)
            java.lang.String r0 = "target_name"
            A07(r3, r0, r2, r5)
            X.0Aj r1 = A01(r1, r4)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0a63
            A04(r1, r3, r5)
            X.Pxk.A0V(r1)
            return
        L_0x0a54:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a59:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a63:
            return
        L_0x0a64:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12411Sto.Cgl(java.lang.String, java.util.Map):void");
    }

    public static 0Aj A01(C12411Sto sto, String str) {
        0wc r1 = sto.A00;
        return r1.A00(r1.A00, str);
    }

    public static QI0 A02(Map map) {
        C21267XRm xRm;
        0bb r2 = new 0bb();
        Object obj = map.get("CREDENTIAL_TYPE");
        if (!(obj instanceof C21267XRm) || (xRm = (C21267XRm) obj) == null) {
            xRm = C21267XRm.A03;
        }
        r2.A01(SUU.A01(xRm), "credential_type");
        return r2;
    }

    public static void A04(0Aj r2, 0bb r3, Map map) {
        r2.AAK(r3, "event_payload");
        if (SUU.A0E(map)) {
            r2.A9H("extra_data", SUU.A09(map));
        }
    }

    public final void A0H(LoggingContext loggingContext, Long l, String str, Map map) {
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "user_click_shippingaddress_atomic"), 404), loggingContext, new C74189PqV(loggingContext, l, str, map, 6));
    }

    public final void A0O(LoggingContext loggingContext, String str, long j) {
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "user_click_ecppaypalconversion_atomic"), ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI), loggingContext, new TWM(loggingContext, str, 0, j));
    }

    public final void A0Q(LoggingContext loggingContext, String str, String str2, Map map) {
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_load_shippingoption_init"), 99), loggingContext, new C74192PqY((Object) loggingContext, (Object) map, str, str2, 10));
    }

    public final void A0T(LoggingContext loggingContext, String str, List list, Map map, boolean z) {
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_load_ecpcheckoutcomponent_init"), 59), loggingContext, new TWQ(list, loggingContext, map, str, "checkout", 2, z));
    }

    public final void A0U(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(this.A00, "user_click_ecpcheckout_exit"), 394), loggingContext, map, str, 9);
    }

    public final void A0V(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(this.A00, "user_click_ordersummary_atomic"), 403), loggingContext, map, str, 13);
    }

    public final void A0Y(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_load_ecpcheckout_fail"), 55), loggingContext, map, str, 23);
    }

    public final void A0Z(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_load_ecpcheckout_init"), 56), loggingContext, map, str, 24);
    }

    public final void A0c(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_load_entityitems_fail"), 73), loggingContext, map, str, 32);
    }

    public final void A0e(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_load_shippingaddress_init"), 95), loggingContext, map, str, 47);
    }

    public static void A05(0bb r2, String str) {
        r2.A06("view_name", str);
        r2.A06("contact_type", SUU.A04(str));
    }

    public static void A06(0bb r2, String str) {
        r2.A06("target_name", str);
        r2.A06("contact_type", SUU.A03(str));
    }

    public static void A07(0bb r2, String str, String str2, Map map) {
        r2.A06(str, str2);
        if (SUU.A0D(map)) {
            r2.A05("credential_id", Long.valueOf(SUU.A00(map)));
        }
    }

    public static void A08(0bb r2, Map map) {
        r2.A06("view_name", SUU.A06(map));
    }

    public static void A09(0bb r2, Map map) {
        if (SUU.A0D(map)) {
            r2.A05("contact_id", Long.valueOf(SUU.A00(map)));
        }
    }

    public static void A0A(C12411Sto sto, Object obj, Object obj2, String str, Map map) {
        map.put(obj, obj2);
        ImmutableMap copyOf = ImmutableMap.copyOf(map);
        0qQ.A07(copyOf);
        sto.Cgl(str, copyOf);
    }

    public final void A0B(RIb rIb, LoggingContext loggingContext, Map map) {
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "user_click_ecpautofill_atomic"), 392), loggingContext, new C74189PqV((Object) rIb, (Object) loggingContext, (Object) map, "shipping_address_suggestion", 5));
    }

    public final void A0C(RIb rIb, LoggingContext loggingContext, Map map) {
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "client_load_ecpautofill_success"), 52), loggingContext, new C74189PqV((Object) rIb, (Object) loggingContext, (Object) map, "nux_checkout", 13));
    }

    public final void A0K(LoggingContext loggingContext, Long l, Map map) {
        0qQ.A0B(loggingContext, 0);
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "user_remove_shippingaddress_cancel"), 409), loggingContext, new C74189PqV(loggingContext, l, "remove_shipping_address_cancel", map, 15));
    }

    public final void A0L(LoggingContext loggingContext, Long l, Map map) {
        0qQ.A0B(loggingContext, 0);
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "user_remove_shippingaddress_enter"), 410), loggingContext, new C74189PqV(loggingContext, l, "remove_shipping_address", map, 16));
    }

    public final void A0M(LoggingContext loggingContext, Long l, Map map) {
        0qQ.A0B(loggingContext, 0);
        A03(C51965G9l.A0U(C51969G9p.A0d(this.A00, "user_remove_shippingaddress_submit"), 411), loggingContext, new C74189PqV(loggingContext, l, "remove_shipping_address_save", map, 18));
    }

    public final void A0N(LoggingContext loggingContext, String str) {
        0Aj A0d = C51969G9p.A0d(A00(this, str), "client_add_debug_atomic");
        if (A0d.isSampled()) {
            A0d.AAJ(Py7.A00(), loggingContext.A02);
            Pxh.A18(2M7.A02, A0d);
            0bb r1 = new 0bb();
            r1.A06("debug_step", str);
            Pxe.A1Q(A0d, r1);
            A0d.A9H("extra_data", 0Yt.A0E());
            A0d.Cgf();
        }
    }

    public final void A0W(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_contact_fail"), 42), loggingContext, map, str, 15);
    }

    public final void A0X(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_credential_fail"), 45), loggingContext, map, str, 17);
    }

    public final void A0a(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_ecpotc_fail"), 69), loggingContext, map, str, 30);
    }

    public final void A0b(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_ecpotc_init"), 70), loggingContext, map, str, 31);
    }

    public final void A0d(LoggingContext loggingContext, String str, Map map) {
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A00(this, str), "client_load_shippingaddress_fail"), 94), loggingContext, map, str, 46);
    }
}
