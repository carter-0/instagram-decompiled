package X;

import com.facebookpay.logging.LoggingContext;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.PqV  reason: case insensitive filesystem */
public final class C74189PqV extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74189PqV(LoggingContext loggingContext, Long l, String str, Map map, int i) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 14:
            case 15:
            case 16:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
                this.A02 = loggingContext;
                this.A04 = str;
                this.A03 = l;
                this.A01 = map;
                break;
            default:
                this.A03 = loggingContext;
                this.A04 = str;
                this.A01 = l;
                this.A02 = map;
                break;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0422, code lost:
        X.Dbb.A0k(r3, r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0534, code lost:
        X.C51965G9l.A1W(r0.A02, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a2, code lost:
        if (X.0qQ.A0K(r2, "add_shipping_info") == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00db, code lost:
        r4.A06(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0814, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00de, code lost:
        r8.A0N(r4, "event_payload");
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        r3.A06(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r2 = (java.lang.Long) r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r2 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x026a, code lost:
        if (X.SUj.A0S(r8) != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r3.A05(X.Pxd.A00(269), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        r8.A0N(r3, "event_payload");
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        X.C51969G9p.A1G(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03f6, code lost:
        r4.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r8 = r25
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x00e7;
                case 1: goto L_0x0102;
                case 2: goto L_0x011b;
                case 3: goto L_0x003b;
                case 4: goto L_0x0009;
                case 5: goto L_0x0065;
                case 6: goto L_0x0084;
                case 7: goto L_0x00a6;
                case 8: goto L_0x0009;
                case 9: goto L_0x00a6;
                case 10: goto L_0x0009;
                case 11: goto L_0x0152;
                case 12: goto L_0x00bd;
                case 13: goto L_0x00bd;
                case 14: goto L_0x0009;
                case 15: goto L_0x00a6;
                case 16: goto L_0x00a6;
                case 17: goto L_0x0009;
                case 18: goto L_0x00a6;
                case 19: goto L_0x0009;
                case 20: goto L_0x01bf;
                case 21: goto L_0x0211;
                case 22: goto L_0x026d;
                case 23: goto L_0x0292;
                case 24: goto L_0x02ba;
                case 25: goto L_0x02cf;
                case 26: goto L_0x0360;
                case 27: goto L_0x0378;
                case 28: goto L_0x0360;
                case 29: goto L_0x0399;
                case 30: goto L_0x03b7;
                case 31: goto L_0x03e0;
                case 32: goto L_0x0404;
                case 33: goto L_0x0427;
                case 34: goto L_0x0446;
                case 35: goto L_0x0470;
                case 36: goto L_0x0506;
                case 37: goto L_0x0543;
                case 38: goto L_0x0561;
                case 39: goto L_0x058d;
                case 40: goto L_0x05b4;
                case 41: goto L_0x05df;
                case 42: goto L_0x060d;
                case 43: goto L_0x0661;
                case 44: goto L_0x06a0;
                case 45: goto L_0x06d2;
                case 46: goto L_0x0729;
                case 47: goto L_0x077e;
                case 48: goto L_0x07a5;
                case 49: goto L_0x07ec;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Ln r8 = (X.1Ln) r8
            X.QIp r3 = new X.QIp
            r3.<init>()
            java.lang.Object r1 = r0.A02
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            X.C51971G9r.A1B(r3, r1)
            X.C66582MXn.A1B(r3, r1)
            java.lang.String r2 = r0.A04
            java.lang.String r1 = "view_name"
        L_0x001e:
            r3.A06(r1, r2)
        L_0x0021:
            java.lang.Object r2 = r0.A03
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0030
            r1 = 269(0x10d, float:3.77E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            r3.A05(r1, r2)
        L_0x0030:
            java.lang.String r1 = "event_payload"
            r8.A0N(r3, r1)
            java.lang.Object r0 = r0.A01
        L_0x0037:
            X.C51969G9p.A1G(r8, r0)
            return r8
        L_0x003b:
            X.1Ln r8 = (X.1Ln) r8
            X.N17 r4 = new X.N17
            r4.<init>()
            java.lang.Object r3 = r0.A03
            com.facebookpay.logging.LoggingContext r3 = (com.facebookpay.logging.LoggingContext) r3
            X.C51971G9r.A1B(r4, r3)
            java.lang.String r2 = r0.A04
            java.lang.String r1 = "view_name"
            r4.A06(r1, r2)
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "address_fields"
            r4.A07(r1, r2)
            X.GkD r2 = X.SQ1.A00(r3)
            if (r2 == 0) goto L_0x00de
            java.lang.String r1 = "logging_policy"
            r4.A02(r2, r1)
            goto L_0x00de
        L_0x0065:
            X.1Ln r8 = (X.1Ln) r8
            X.N14 r4 = new X.N14
            r4.<init>()
            java.lang.Object r3 = r0.A03
            com.facebookpay.logging.LoggingContext r3 = (com.facebookpay.logging.LoggingContext) r3
            X.C51971G9r.A1B(r4, r3)
            java.lang.Object r2 = r0.A01
            X.RIb r2 = (X.RIb) r2
            java.lang.String r1 = "autofill_data_type"
            r4.A01(r2, r1)
            X.C66582MXn.A1B(r4, r3)
            java.lang.String r2 = r0.A04
            java.lang.String r1 = "target_name"
            goto L_0x00db
        L_0x0084:
            X.1Ln r8 = (X.1Ln) r8
            X.QIp r3 = new X.QIp
            r3.<init>()
            java.lang.Object r1 = r0.A02
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            X.C51971G9r.A1B(r3, r1)
            X.C66582MXn.A1B(r3, r1)
            java.lang.String r2 = r0.A04
            java.lang.String r1 = "target_name"
            r3.A06(r1, r2)
            java.lang.String r1 = "add_shipping_info"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x0030
            goto L_0x0021
        L_0x00a6:
            X.1Ln r8 = (X.1Ln) r8
            X.QIp r3 = new X.QIp
            r3.<init>()
            java.lang.Object r1 = r0.A02
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            X.C51971G9r.A1B(r3, r1)
            X.C66582MXn.A1B(r3, r1)
            java.lang.String r2 = r0.A04
            java.lang.String r1 = "target_name"
            goto L_0x001e
        L_0x00bd:
            X.1Ln r8 = (X.1Ln) r8
            X.N14 r4 = new X.N14
            r4.<init>()
            java.lang.Object r3 = r0.A03
            com.facebookpay.logging.LoggingContext r3 = (com.facebookpay.logging.LoggingContext) r3
            X.C51971G9r.A1B(r4, r3)
            java.lang.Object r2 = r0.A01
            X.RIb r2 = (X.RIb) r2
            java.lang.String r1 = "autofill_data_type"
            r4.A01(r2, r1)
            X.C66582MXn.A1B(r4, r3)
            java.lang.String r2 = r0.A04
            java.lang.String r1 = "view_name"
        L_0x00db:
            r4.A06(r1, r2)
        L_0x00de:
            java.lang.String r1 = "event_payload"
            r8.A0N(r4, r1)
            java.lang.Object r0 = r0.A02
            goto L_0x0037
        L_0x00e7:
            java.lang.Object r1 = r0.A03
            X.SNi r1 = (X.C11329SNi) r1
            X.S7S r1 = r1.A04
            r1.A02()
            r1.A01()
            java.lang.Object r2 = r0.A01
            X.RqJ r2 = (X.C10321RqJ) r2
            java.lang.String r1 = r0.A04
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            X.C11329SNi.A01(r2, r1, r0)
            goto L_0x0812
        L_0x0102:
            r13 = 0
            X.0qQ.A0B(r8, r13)
            java.lang.Object r1 = r0.A01
            X.4Cq r1 = (X.C262224Cq) r1
            java.lang.Object r9 = r0.A02
            java.lang.String r11 = r0.A04
            java.lang.Object r10 = r0.A03
            r12 = 0
            X.MH7 r7 = new X.MH7
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.String) r11, (X.AnonymousClass4D7) r12, (int) r13)
            X.AnonymousClass7TE.A1Z(r7, r1)
            goto L_0x0812
        L_0x011b:
            X.SUj r8 = (X.SUj) r8
            boolean r1 = X.SUj.A0S(r8)
            if (r1 == 0) goto L_0x0812
            java.lang.Throwable r1 = r8.A02
            boolean r1 = r1 instanceof X.C8284QnQ
            if (r1 != 0) goto L_0x0812
            java.lang.Object r1 = r0.A02
            X.DbS.A1U(r1)
            java.lang.Object r3 = r0.A03
            X.QCy r3 = (X.C7433QCy) r3
            java.lang.String r1 = r0.A04
            java.lang.Object r2 = r0.A01
            androidx.core.app.ComponentActivity r2 = (androidx.core.app.ComponentActivity) r2
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.util.Map r0 = r3.A01
            java.lang.Object r1 = r0.remove(r1)
            X.OB9 r1 = (X.OB9) r1
            if (r1 == 0) goto L_0x0812
            X.2Fj r0 = r1.A01
            r0.A05(r2)
            X.2Fk r0 = r1.A00
            r0.A05(r2)
            goto L_0x0812
        L_0x0152:
            X.1Ln r8 = (X.1Ln) r8
            X.QHy r3 = new X.QHy
            r3.<init>()
            java.lang.Object r1 = r0.A03
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            X.C51971G9r.A1B(r3, r1)
            X.C66582MXn.A1B(r3, r1)
            java.lang.String r5 = r0.A04
            java.lang.String r1 = "view_name"
            r3.A06(r1, r5)
            r1 = 871(0x367, float:1.22E-42)
            java.lang.String r4 = X.Pxd.A00(r1)
            boolean r1 = X.0qQ.A0K(r5, r4)
            if (r1 != 0) goto L_0x0193
            java.lang.String r1 = "nux_contact"
            boolean r1 = X.0qQ.A0K(r5, r1)
            if (r1 != 0) goto L_0x0193
            java.lang.String r1 = "partial_pux"
            boolean r1 = X.0qQ.A0K(r5, r1)
            if (r1 != 0) goto L_0x0193
            java.lang.String r2 = X.SUU.A04(r5)
            r1 = 696(0x2b8, float:9.75E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            r3.A06(r1, r2)
        L_0x0193:
            java.lang.String r1 = "edit_email"
            boolean r1 = X.0qQ.A0K(r5, r1)
            if (r1 != 0) goto L_0x01a9
            java.lang.String r1 = "edit_phone"
            boolean r1 = X.0qQ.A0K(r5, r1)
            if (r1 != 0) goto L_0x01a9
            boolean r1 = X.0qQ.A0K(r5, r4)
            if (r1 == 0) goto L_0x01b4
        L_0x01a9:
            java.lang.Object r2 = r0.A01
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x01b4
            java.lang.String r1 = "contact_id"
            r3.A05(r1, r2)
        L_0x01b4:
            java.lang.String r1 = "event_payload"
            r8.A0N(r3, r1)
            java.lang.Object r0 = r0.A02
            X.C51969G9p.A1G(r8, r0)
            return r8
        L_0x01bf:
            r3 = 0
            X.0qQ.A0B(r8, r3)
            X.Sto r2 = X.C51965G9l.A0g()
            java.lang.Object r5 = r0.A02
            com.facebookpay.logging.LoggingContext r5 = (com.facebookpay.logging.LoggingContext) r5
            java.lang.Object r1 = r0.A01
            java.util.List r4 = X.AnonymousClass7TE.A1I(r1)
            java.lang.String r7 = r0.A04
            r1 = 162(0xa2, float:2.27E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            boolean r10 = X.0qQ.A0K(r7, r1)
            java.lang.Object r0 = r0.A03
            X.SEB r0 = (X.SEB) r0
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            if (r0 == 0) goto L_0x01ea
            X.SUU.A0A(r0, r6)
        L_0x01ea:
            java.lang.String r0 = "error_message"
            r6.put(r0, r8)
            java.lang.String r8 = "checkout"
            X.0qQ.A0B(r5, r3)
            boolean r9 = X.DbW.A1Z(r7)
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "client_load_ecpcheckoutcomponent_fail"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            r1 = 58
            X.1Ln r0 = new X.1Ln
            r0.<init>(r2, r1)
            X.TWQ r3 = new X.TWQ
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.C12411Sto.A03(r0, r5, r3)
            goto L_0x0812
        L_0x0211:
            X.SUj r8 = (X.SUj) r8
            boolean r1 = X.SUj.A0V(r8)
            if (r1 == 0) goto L_0x0266
            java.lang.Object r1 = r8.A01
            r1.getClass()
            X.O5o r1 = (X.C70411O5o) r1
            X.QXc r1 = r1.A00
            if (r1 == 0) goto L_0x022a
            X.QVK r1 = r1.A0E()
            if (r1 != 0) goto L_0x0259
        L_0x022a:
            java.lang.Object r4 = r0.A02
            X.2gB r4 = (X.AnonymousClass2gB) r4
            java.lang.Object r1 = r4.A02()
            X.SUj r1 = (X.SUj) r1
            boolean r1 = X.SUj.A0V(r1)
            if (r1 == 0) goto L_0x0259
            java.lang.Object r1 = r4.A02()
            X.SUj r1 = (X.SUj) r1
            java.lang.Object r1 = r1.A01
            r1.getClass()
            X.Rua r1 = (X.C10580Rua) r1
            java.util.List r3 = r1.A02
            java.lang.String r2 = r0.A04
            X.TYV r1 = X.TYV.A00
            java.util.List r3 = X.C11296SKe.A01(r2, r3, r1)
            java.lang.Object r2 = r0.A03
            X.Stb r2 = (X.Stb) r2
            r1 = 0
            X.Stb.A00(r4, r2, r1, r3)
        L_0x0259:
            java.lang.Object r1 = r0.A02
            X.2gB r1 = (X.AnonymousClass2gB) r1
            java.lang.Object r0 = r0.A01
            X.2Fk r0 = (X.2Fk) r0
            r1.A0D(r0)
            goto L_0x0812
        L_0x0266:
            boolean r1 = X.SUj.A0S(r8)
            if (r1 == 0) goto L_0x0812
            goto L_0x0259
        L_0x026d:
            java.lang.String r8 = X.C41847B3o.A1E(r8)
            java.lang.Object r3 = r0.A01
            X.5Oz r3 = (X.C284945Oz) r3
            int r2 = r8.length()
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            int r1 = X.LST.A00(r1)
            if (r2 <= r1) goto L_0x028f
            java.lang.String r2 = r0.A04
            X.Gpg r1 = new X.Gpg
            r1.<init>(r2)
        L_0x028a:
            r3.Epw(r1)
            goto L_0x0534
        L_0x028f:
            X.IPY r1 = X.IPY.A00
            goto L_0x028a
        L_0x0292:
            int r3 = X.AnonymousClass7TE.A0M(r8)
            java.lang.Object r2 = r0.A01
            X.5Tq r2 = (X.C286025Tq) r2
            java.lang.String r1 = "learn_more_span"
            java.util.List r1 = r2.A06(r1, r3, r3)
            java.lang.Object r1 = X.00k.A0J(r1)
            X.62b r1 = (X.C3022062b) r1
            if (r1 == 0) goto L_0x0812
            java.lang.Object r1 = r1.A02
            if (r1 == 0) goto L_0x0812
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = r0.A04
            X.2EG r0 = X.2EG.A1V
            goto L_0x0422
        L_0x02ba:
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.String r2 = r0.A04
            X.NjK r1 = X.C69319NjK.COMMENT_CREATOR_SEARCH
            java.lang.Object r0 = r0.A02
            X.0sP r0 = (X.0sP) r0
            X.C70857OOm.A01(r4, r3, r1, r2, r0)
            goto L_0x0812
        L_0x02cf:
            X.7ft r8 = (X.C337207ft) r8
            r3 = 0
            X.0qQ.A0B(r8, r3)
            java.lang.Integer r2 = r8.A01
            if (r2 == 0) goto L_0x0812
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r1 != r2) goto L_0x031e
            java.lang.Object r5 = r0.A03
            X.GgO r5 = (X.C52971GgO) r5
            X.7a0 r1 = r5.A0C
            java.lang.String r4 = r0.A04
            X.0qQ.A0B(r4, r3)
            X.0wc r3 = r1.A01
            java.lang.String r2 = "impression"
            java.lang.String r1 = "comment_create"
            X.AIG.A01(r3, r2, r1, r4)
            X.05G r3 = r5.A0P
            java.lang.Object r1 = r0.A01
            X.GlX r1 = (X.C53285GlX) r1
            java.lang.String r2 = r1.A03
            X.7ci r1 = new X.7ci
            r1.<init>(r8, r2)
            r3.Epw(r1)
            java.lang.Object r0 = r0.A02
            X.7cr r0 = (X.C335377cr) r0
            if (r0 == 0) goto L_0x0812
            X.7a3 r1 = r5.A09
            java.lang.String r4 = r0.A02
            java.lang.String r5 = r0.A03
            java.lang.String r6 = r0.A04
            com.instagram.user.model.User r2 = r0.A00
            java.lang.Long r3 = r0.A01
            boolean r7 = r0.A05
            boolean r8 = r0.A07
            boolean r9 = r0.A06
            r1.A03(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0812
        L_0x031e:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r1 != r2) goto L_0x0812
            java.lang.Object r0 = r0.A03
            X.GgO r0 = (X.C52971GgO) r0
            X.7a0 r0 = r0.A0C
            X.0wc r2 = r0.A01
            java.lang.String r6 = "comment_create"
            java.lang.String r5 = r8.A02
            r4 = 1
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = X.DbS.A0k()
            java.lang.String r0 = "nav_chain"
            r3.put(r0, r1)
            java.lang.String r0 = "instagram_wellbeing_warning_system_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r0 = "source_of_action"
            r2.AAJ(r0, r6)
            java.lang.String r0 = "text_language"
            java.lang.Boolean r1 = X.JTP.A0g(r2, r0, r5, r4)
            java.lang.String r0 = "is_offensive"
            r2.A7p(r0, r1)
            r0 = 1333(0x535, float:1.868E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9H(r0, r3)
            r2.Cgf()
            goto L_0x0812
        L_0x0360:
            X.6Gb r5 = X.C51968G9o.A0L(r8)
            java.lang.Object r4 = r0.A01
            X.0sP r4 = (X.0sP) r4
            java.lang.Object r3 = r0.A02
            X.HLV r3 = (X.HLV) r3
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A03
            X.0sL r1 = (X.0sL) r1
            X.I11 r0 = new X.I11
            r0.<init>(r5, r3, r2, r1)
            goto L_0x03f6
        L_0x0378:
            int r4 = X.AnonymousClass7TE.A0M(r8)
            java.lang.Object r3 = r0.A03
            X.I11 r3 = (X.I11) r3
            java.lang.Object r2 = r0.A01
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r4)
            java.lang.Object r1 = r2.invoke(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r0.A04
            java.lang.String r8 = X.I11.A00(r3, r1, r0, r4)
            return r8
        L_0x0399:
            java.io.File r8 = (java.io.File) r8
            if (r8 == 0) goto L_0x0812
            java.lang.Object r4 = r0.A03
            X.8hG r4 = (X.C362048hG) r4
            java.lang.Object r1 = r0.A02
            com.instagram.common.gallery.RemoteMedia r1 = (com.instagram.common.gallery.RemoteMedia) r1
            java.lang.Object r3 = r0.A01
            com.instagram.common.gallery.model.GalleryItem r3 = (com.instagram.common.gallery.model.GalleryItem) r3
            java.lang.String r2 = r0.A04
            com.instagram.common.gallery.Medium r1 = X.C362048hG.A00(r1, r3, r4, r8)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r1.A0G
            r0.A01 = r2
            r3.A00 = r1
            goto L_0x0812
        L_0x03b7:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.A02
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r2.A0G
            r1.A03 = r8
            java.lang.String r2 = r2.A0X
            java.lang.String r1 = r0.A04
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0812
            java.lang.Object r1 = r0.A01
            X.3oV r1 = (X.C252063oV) r1
            java.lang.Object r0 = r0.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.C59737JVv.A06(r0, r8)
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            goto L_0x0812
        L_0x03e0:
            X.Gln r8 = (X.C53301Gln) r8
            r3 = 0
            X.0qQ.A0B(r8, r3)
            java.lang.Object r1 = r0.A01
            X.DbS.A1U(r1)
            int r2 = r8.A00
            r1 = 1
            if (r2 != r1) goto L_0x03fb
            java.lang.Object r4 = r0.A02
            X.0sP r4 = (X.0sP) r4
            java.lang.String r0 = r0.A04
        L_0x03f6:
            r4.invoke(r0)
            goto L_0x0812
        L_0x03fb:
            if (r2 != r3) goto L_0x0812
            java.lang.Object r0 = r0.A03
            X.DbS.A1U(r0)
            goto L_0x0812
        L_0x0404:
            int r2 = X.AnonymousClass7TE.A0M(r8)
            java.lang.Object r1 = r0.A01
            X.5Tq r1 = (X.C286025Tq) r1
            java.util.List r1 = r1.A03(r2, r2)
            java.lang.Object r1 = X.00k.A0J(r1)
            if (r1 == 0) goto L_0x0812
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = r0.A04
            X.2EG r0 = X.2EG.A1u
        L_0x0422:
            X.Dbb.A0k(r3, r2, r0, r1)
            goto L_0x0812
        L_0x0427:
            X.6Gb r2 = X.C51968G9o.A0L(r8)
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A03
            java.lang.Object r6 = r0.A02
            java.lang.String r7 = r0.A04
            r8 = 2
            X.JGw r3 = new X.JGw
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 72858990(0x457bd6e, float:2.536011E-36)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r3, r0)
            r0 = 0
            r2.Cf4(r0, r1)
            goto L_0x0812
        L_0x0446:
            X.NAY r8 = (X.NAY) r8
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.lang.Object r6 = r0.A02
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r7 = r0.A03
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r10 = r0.A04
            java.lang.Object r1 = r0.A01
            r0 = 33
            X.Opg r1 = X.C71722Opg.A00(r1, r0)
            X.68L r0 = X.C66581MXm.A0I(r8)
            com.facebook.msys.mca.MailboxFutureImpl r9 = X.C66581MXm.A0J(r0, r1)
            X.Ooc r5 = new X.Ooc
            r5.<init>(r6, r7, r8, r9, r10)
            X.C66582MXn.A1E(r0, r5, r9)
            goto L_0x0812
        L_0x0470:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x04f7
            int r1 = r8.length()
            if (r1 == 0) goto L_0x04f7
            java.lang.Object r5 = r0.A03
            X.Ocj r5 = (X.C71105Ocj) r5
            X.0eM r1 = X.C71105Ocj.A05
            X.OyP r2 = r5.A02
            java.lang.Object r3 = r0.A02
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r3 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r3
            r1 = 0
            X.0qQ.A0B(r3, r1)
            java.lang.String r1 = X.C71042OaK.A02(r3)
            X.Ni4 r2 = X.OyP.A00(r2, r1)
            java.io.File r1 = r2.getParentFile()
            if (r1 == 0) goto L_0x049b
            r1.mkdirs()
        L_0x049b:
            android.net.Uri r10 = android.net.Uri.fromFile(r2)
            int r1 = r3.bitField0_
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x04f5
            java.lang.String r1 = r3.mimetype_
        L_0x04a7:
            java.lang.Integer r12 = X.C66834MdS.A04(r1)
            java.lang.String r2 = r0.A04
            X.0qQ.A0A(r10)
            java.lang.Object r4 = r0.A01
            X.Pty r4 = (X.C74383Pty) r4
            com.instagram.common.session.UserSession r1 = r5.A01
            java.lang.String r0 = r3.fileSha256_
            X.0qQ.A07(r0)
            r5 = 2
            byte[] r14 = android.util.Base64.decode(r0, r5)
            X.0qQ.A07(r14)
            java.lang.String r0 = r3.fileEncSha256_
            X.0qQ.A07(r0)
            byte[] r15 = android.util.Base64.decode(r0, r5)
            X.0qQ.A07(r15)
            java.lang.String r0 = r3.mediaKey_
            X.0qQ.A07(r0)
            byte[] r16 = android.util.Base64.decode(r0, r5)
            X.0qQ.A07(r16)
            java.lang.String r0 = r3.mediaKeyTimestamp_
            long r17 = X.C66580MXl.A08(r0)
            X.ODP r11 = new X.ODP
            r11.<init>(r4, r3, r2)
            r0 = 1
            X.AnonymousClass7TF.A1E(r12, r0, r10)
            X.Pmp r9 = new X.Pmp
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            X.OXH.A02(r9, r1)
            goto L_0x0812
        L_0x04f5:
            r1 = 0
            goto L_0x04a7
        L_0x04f7:
            java.lang.Object r3 = r0.A01
            X.Pty r3 = (X.C74383Pty) r3
            r2 = 20001(0x4e21, float:2.8027E-41)
            java.lang.String r1 = "CDN url restoration error"
            java.lang.String r0 = "ArmadilloExpressMediaStore"
            r3.DCq(r1, r2, r0)
            goto L_0x0812
        L_0x0506:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x053b
            int r1 = r8.length()
            if (r1 == 0) goto L_0x053b
            java.lang.Object r2 = r0.A03
            X.Ocj r2 = (X.C71105Ocj) r2
            X.0eM r1 = X.C71105Ocj.A05
            java.util.Map r2 = r2.A03
            X.0qQ.A07(r2)
            java.lang.String r1 = r0.A04
            r2.put(r1, r8)
        L_0x0520:
            java.lang.Object r1 = r0.A01
            java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1
            r1.countDown()
            java.lang.Object r2 = r0.A03
            X.Ocj r2 = (X.C71105Ocj) r2
            X.0eM r1 = X.C71105Ocj.A05
            java.util.concurrent.ConcurrentHashMap r2 = r2.A04
            java.lang.String r1 = r0.A04
            r2.remove(r1)
        L_0x0534:
            java.lang.Object r0 = r0.A02
            X.C51965G9l.A1W(r0, r8)
            goto L_0x0812
        L_0x053b:
            java.lang.String r2 = "ArmadilloExpressMediaStore"
            java.lang.String r1 = "Failed to get restore url"
            X.0KC.A0C(r2, r1)
            goto L_0x0520
        L_0x0543:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r0.A01
            X.OOB r1 = (X.OOB) r1
            X.0qQ.A0A(r8)
            X.ObS r5 = r1.A07(r8)
            java.lang.Object r4 = r0.A02
            java.lang.Object r3 = r0.A03
            java.lang.String r2 = r0.A04
            r1 = 1
            X.OmM r0 = new X.OmM
            r0.<init>(r4, r3, r2, r1)
            r5.A04(r0)
            goto L_0x0812
        L_0x0561:
            com.instagram.model.reels.Reel r8 = (com.instagram.model.reels.Reel) r8
            java.lang.Object r1 = r0.A01
            X.OMU r1 = (X.OMU) r1
            if (r1 == 0) goto L_0x056c
            r1.A00()
        L_0x056c:
            java.lang.Object r1 = r0.A03
            X.P9F r1 = (X.P9F) r1
            if (r8 == 0) goto L_0x057b
            java.lang.Object r0 = r0.A02
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            X.P9F.A00(r0, r1, r8)
            goto L_0x0812
        L_0x057b:
            X.7Xk r1 = r1.A03
            java.lang.Object r2 = r0.A02
            android.graphics.RectF r2 = (android.graphics.RectF) r2
            X.28D r3 = X.28D.A2E
            r4 = 0
            java.lang.String r6 = r0.A04
            r7 = 0
            r5 = r4
            r1.Cpd(r2, r3, r4, r5, r6, r7)
            goto L_0x0812
        L_0x058d:
            X.3t2 r8 = (X.C254783t2) r8
            java.lang.Object r4 = r0.A02
            com.instagram.model.direct.DirectShareTarget r4 = (com.instagram.model.direct.DirectShareTarget) r4
            boolean r1 = r8 instanceof X.AnonymousClass9HR
            r3 = 0
            if (r1 == 0) goto L_0x05a1
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = X.DbY.A0W(r4, r3)
            com.instagram.model.direct.DirectShareTarget r4 = new com.instagram.model.direct.DirectShareTarget
            r4.<init>((X.C254783t2) r8, (com.instagram.pendingmedia.model.recipients.PendingRecipient) r1)
        L_0x05a1:
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.7Z7 r2 = X.OXC.A01(r1, r4)
            java.lang.Object r1 = r0.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.String r0 = r0.A04
            r2.ELT(r1, r4, r0, r3)
            goto L_0x0812
        L_0x05b4:
            X.3t2 r8 = (X.C254783t2) r8
            boolean r1 = r8 instanceof X.AnonymousClass9HR
            r4 = 0
            if (r1 == 0) goto L_0x05c8
            java.lang.Object r1 = r0.A02
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = X.DbY.A0W(r1, r4)
            com.instagram.model.direct.DirectShareTarget r1 = new com.instagram.model.direct.DirectShareTarget
            r1.<init>((X.C254783t2) r8, (com.instagram.pendingmedia.model.recipients.PendingRecipient) r2)
        L_0x05c8:
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r3 = r0.A02
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            X.7Z7 r2 = X.OXC.A01(r1, r3)
            java.lang.Object r1 = r0.A01
            X.3gp r1 = (X.C247733gp) r1
            java.lang.String r0 = r0.A04
            r2.ELX(r1, r3, r0, r4)
            goto L_0x0812
        L_0x05df:
            X.3t2 r8 = (X.C254783t2) r8
            java.lang.Object r3 = r0.A02
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            boolean r1 = r8 instanceof X.AnonymousClass9HR
            if (r1 == 0) goto L_0x05f8
            java.util.List r1 = X.DbT.A14(r3)
            java.lang.Object r1 = X.AnonymousClass7TE.A13(r1)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r1
            com.instagram.model.direct.DirectShareTarget r3 = new com.instagram.model.direct.DirectShareTarget
            r3.<init>((X.C254783t2) r8, (com.instagram.pendingmedia.model.recipients.PendingRecipient) r1)
        L_0x05f8:
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.7Z7 r1 = X.OXC.A01(r1, r3)
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r4 = r0.A04
            r5 = 0
            r6 = r5
            r1.ELi(r2, r3, r4, r5, r6)
            goto L_0x0812
        L_0x060d:
            java.lang.Object r10 = r0.A02
            com.instagram.pendingmedia.model.ClipInfo r10 = (com.instagram.pendingmedia.model.ClipInfo) r10
            java.lang.String r2 = r10.A0F
            java.lang.String r9 = "Required value was null."
            if (r2 == 0) goto L_0x065c
            java.lang.Object r1 = r0.A03
            X.OKR r1 = (X.OKR) r1
            com.instagram.common.session.UserSession r8 = r1.A00
            r7 = 0
            r6 = 0
            com.facebook.msys.mca.MailboxFutureImpl r1 = X.C71031OZi.A00(r8, r2, r7)
            com.google.common.util.concurrent.ListenableFuture r5 = X.C303606Aa.A00(r1)
            java.lang.String r4 = r0.A04
            android.content.Context r3 = X.C51966G9m.A0P(r8)
            int r2 = r10.A09
            int r1 = r10.A06
            java.io.File r1 = X.C64188LSv.A00(r3, r10, r4, r2, r1)
            if (r1 == 0) goto L_0x0657
            java.lang.String r1 = X.JTP.A0t(r1)
            com.facebook.msys.mca.MailboxFutureImpl r1 = X.C71031OZi.A00(r8, r1, r7)
            com.google.common.util.concurrent.ListenableFuture r1 = X.C303606Aa.A00(r1)
            java.lang.Object r0 = r0.A01
            com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0
            com.google.common.util.concurrent.ListenableFuture[] r1 = new com.google.common.util.concurrent.ListenableFuture[]{r0, r1, r5}
            X.1K8 r0 = X.1L8.A03
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.lang.Object[]) r1)
            X.MmO r8 = new X.MmO
            r8.<init>(r0, r6)
            return r8
        L_0x0657:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x065c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0661:
            com.instagram.model.direct.DirectShareTarget r8 = (com.instagram.model.direct.DirectShareTarget) r8
            r14 = 0
            X.0qQ.A0B(r8, r14)
            java.lang.Object r1 = r0.A03
            X.OVL r1 = (X.OVL) r1
            com.instagram.common.session.UserSession r2 = r1.A01
            android.content.Context r6 = r1.A00
            java.lang.Object r1 = r0.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r17 = r1.getWidth()
            int r18 = r1.getHeight()
            long r19 = java.lang.System.currentTimeMillis()
            long r21 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r0.A04
            java.io.File r16 = X.AnonymousClass7TE.A0t(r0)
            X.8Cl r10 = new X.8Cl
            r15 = r10
            r23 = r14
            r15.<init>(r16, r17, r18, r19, r21, r23)
            java.lang.String r12 = "video_call"
            X.7Z6 r5 = X.AnonymousClass7Z6.A00(r2)
            r7 = 0
            r9 = r7
            r11 = r7
            r13 = r7
            r5.EMI(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0812
        L_0x06a0:
            com.instagram.model.direct.DirectShareTarget r8 = (com.instagram.model.direct.DirectShareTarget) r8
            r3 = 0
            X.0qQ.A0B(r8, r3)
            java.lang.Object r2 = r0.A03
            X.OVL r2 = (X.OVL) r2
            com.instagram.common.session.UserSession r1 = r2.A01
            android.content.Context r5 = r2.A00
            java.lang.Object r9 = r0.A01
            com.instagram.pendingmedia.model.ClipInfo r9 = (com.instagram.pendingmedia.model.ClipInfo) r9
            java.lang.String r12 = r0.A04
            java.lang.String r14 = "direct_video_call_send_attribution_photobooth"
            r6 = 0
            X.AnonymousClass7TG.A1Q(r9, r12)
            X.7Z6 r4 = X.AnonymousClass7Z6.A00(r1)
            r7 = r6
            r10 = r6
            r11 = r6
            r13 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r3
            r19 = r3
            r20 = r3
            r4.EN0(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0812
        L_0x06d2:
            X.1Xj r8 = (X.1Xj) r8
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.lang.Object r6 = r0.A01
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r6 = (com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus) r6
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.DECLINED
            java.lang.Object r3 = r0.A03
            X.Uqz r3 = (X.C16236Uqz) r3
            if (r6 != r1) goto L_0x0725
            X.C16236Uqz.A00(r8, r3)
        L_0x06e7:
            java.lang.Object r1 = r0.A02
            X.N8v r1 = (X.C68282N8v) r1
            java.lang.Long r2 = r1.A02
            java.lang.String r1 = java.lang.String.valueOf(r2)
            X.1Xj r5 = X.C254423sS.A02(r8, r1)
            X.326 r4 = r3.A03
            java.lang.String r7 = java.lang.String.valueOf(r2)
            X.X9C r2 = r3.A04
            X.Vuf r1 = r2.Bz5()
            com.instagram.user.model.Product r1 = r1.A08
            X.0qQ.A0A(r1)
            java.lang.String r8 = r1.A0H
            X.Vuf r1 = r2.Bz5()
            com.instagram.user.model.Product r1 = r1.A08
            X.0qQ.A0A(r1)
            com.instagram.user.model.User r1 = r1.A0B
            if (r1 == 0) goto L_0x0723
            java.lang.String r9 = X.AnonymousClass3ZA.A00(r1)
        L_0x0719:
            X.0qQ.A0A(r9)
            java.lang.String r10 = r0.A04
            r4.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x0812
        L_0x0723:
            r9 = 0
            goto L_0x0719
        L_0x0725:
            X.C16236Uqz.A02(r3)
            goto L_0x06e7
        L_0x0729:
            java.lang.Object r3 = r0.A03
            X.325 r3 = (X.AnonymousClass325) r3
            androidx.fragment.app.Fragment r1 = r3.A00
            android.content.Context r2 = r1.requireContext()
            r1 = 2131962259(0x7f132993, float:1.9561238E38)
            X.C59689JTv.A07(r2, r1)
            X.326 r4 = r3.A04
            java.lang.Object r5 = r0.A02
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r3 = r0.A01
            X.DTv r3 = (X.C46292DTv) r3
            X.Pwf r1 = r3.Bbg()
            if (r1 == 0) goto L_0x077c
            java.lang.Long r1 = r1.BEY()
        L_0x074d:
            java.lang.String r7 = java.lang.String.valueOf(r1)
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r6 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.CANCELED
            com.instagram.user.model.ProductDetailsProductItemDictIntf r1 = r3.Bfu()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0761
            java.lang.String r8 = r1.getProductId()
            if (r8 != 0) goto L_0x0762
        L_0x0761:
            r8 = r2
        L_0x0762:
            com.instagram.user.model.ProductDetailsProductItemDictIntf r1 = r3.Bfu()
            if (r1 == 0) goto L_0x0774
            com.instagram.user.model.User r1 = r1.BRo()
            if (r1 == 0) goto L_0x0774
            java.lang.String r9 = X.AnonymousClass3ZA.A00(r1)
            if (r9 != 0) goto L_0x0775
        L_0x0774:
            r9 = r2
        L_0x0775:
            java.lang.String r10 = r0.A04
            r4.A01(r5, r6, r7, r8, r9, r10)
            goto L_0x0812
        L_0x077c:
            r1 = 0
            goto L_0x074d
        L_0x077e:
            android.text.SpannableStringBuilder r8 = (android.text.SpannableStringBuilder) r8
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A03
            java.lang.String r2 = r0.A04
            r1 = 36
            X.Phm r3 = new X.Phm
            r3.<init>(r5, r4, r2, r1)
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            X.Gy0 r1 = new X.Gy0
            r1.<init>(r3)
            int r0 = r8.length()
            r2.invoke(r8)
            X.C66582MXn.A12(r8, r1, r0)
            goto L_0x0812
        L_0x07a5:
            X.F3q r8 = (X.C49726F3q) r8
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.lang.Object r5 = r0.A03
            X.I0l r5 = (X.C56536I0l) r5
            X.HtS r7 = r5.A00
            if (r7 != 0) goto L_0x07ce
            java.lang.String r11 = r0.A04
            java.lang.Object r9 = r0.A01
            X.I4X r9 = (X.I4X) r9
            X.0sP r12 = r5.A06
            X.HjY r10 = new X.HjY
            r10.<init>()
            X.HtS r7 = new X.HtS
            r7.<init>(r8, r9, r10, r11, r12)
            r5.A00 = r7
            X.0sP r2 = r5.A05
            X.HjY r1 = r7.A03
            r2.invoke(r1)
        L_0x07ce:
            X.3XT r2 = X.C70392O4t.A00
            X.HjY r1 = r7.A03
            X.0eP[] r4 = X.DbW.A1b(r2, r1)
            java.lang.Object r3 = r0.A02
            X.0sP r3 = (X.0sP) r3
            X.0Ud r2 = r5.A07
            X.HtS r0 = X.C56536I0l.A00(r5)
            X.Gsx r1 = new X.Gsx
            r1.<init>(r0, r3, r2)
            r0 = 0
            X.9d7 r8 = new X.9d7
            r8.<init>(r1, r0, r4)
            return r8
        L_0x07ec:
            android.text.SpannableStringBuilder r8 = (android.text.SpannableStringBuilder) r8
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A03
            java.lang.String r2 = r0.A04
            r1 = 38
            X.Phm r3 = new X.Phm
            r3.<init>(r5, r4, r2, r1)
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            X.Gy0 r1 = new X.Gy0
            r1.<init>(r3)
            int r0 = r8.length()
            r2.invoke(r8)
            X.C66582MXn.A12(r8, r1, r0)
        L_0x0812:
            X.0gF r8 = X.C60340gF.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74189PqV.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74189PqV(Object obj, Object obj2, Object obj3, String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = str;
        this.A02 = obj3;
    }
}
