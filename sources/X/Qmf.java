package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class Qmf extends C10987S3z {
    public final Context A00;
    public final UserSession A01;

    public Qmf(Context context, UserSession userSession, AnonymousClass0eK r3) {
        super(r3);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final Fragment A00(Bundle bundle, String str) {
        String str2;
        switch (str.hashCode()) {
            case -1847017863:
                str2 = "payment_methods";
                break;
            case -1825227990:
                str2 = "bank_account";
                break;
            case -1404556881:
                str2 = "transaction_details_bloks";
                break;
            case -808149289:
                str2 = "connect_fbpay";
                break;
            case -689995158:
                str2 = "promotion_payment";
                break;
            case 3208415:
                str2 = "home";
                break;
            case 598628962:
                str2 = "order_detail";
                break;
            case 756171503:
                str2 = "order_list";
                break;
            case 1082290744:
                str2 = "receipt";
                break;
            case 2138025441:
                str2 = "transaction_details";
                break;
            default:
                return super.A00(bundle, str);
        }
        if (str.equals(str2)) {
            return A01(bundle, str);
        }
        return super.A00(bundle, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a7, code lost:
        if (X.AnonymousClass431.A00(r5) != false) goto L_0x02a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A01(android.os.Bundle r14, java.lang.String r15) {
        /*
            r13 = this;
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            int r6 = r15.hashCode()
            r1 = -1
            switch(r6) {
                case -1847017863: goto L_0x00f0;
                case -1825227990: goto L_0x00fc;
                case -808149289: goto L_0x0107;
                case -689995158: goto L_0x0112;
                case 3208415: goto L_0x011e;
                case 552281614: goto L_0x0129;
                case 598628962: goto L_0x0135;
                case 756171503: goto L_0x0141;
                case 1082290744: goto L_0x014d;
                case 2138025441: goto L_0x015a;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.String r10 = "transaction_id"
            java.lang.String r3 = "IgSessionManager.SESSION_TOKEN_KEY"
            java.lang.String r5 = "sessionId"
            java.lang.String r4 = "logger_data"
            switch(r1) {
                case 0: goto L_0x0215;
                case 1: goto L_0x032e;
                case 2: goto L_0x027a;
                case 3: goto L_0x0437;
                case 4: goto L_0x0290;
                case 5: goto L_0x035a;
                case 6: goto L_0x044a;
                case 7: goto L_0x0378;
                case 8: goto L_0x03a9;
                case 9: goto L_0x0416;
                default: goto L_0x0019;
            }
        L_0x0019:
            r1 = -1
            switch(r6) {
                case -1847017863: goto L_0x0037;
                case -1147692044: goto L_0x0042;
                case -1008770331: goto L_0x004c;
                case -971511398: goto L_0x0057;
                case -846369464: goto L_0x0062;
                case -822067596: goto L_0x006d;
                case -718398288: goto L_0x0077;
                case 3148996: goto L_0x0082;
                case 3208415: goto L_0x008c;
                case 3347807: goto L_0x0097;
                case 563217739: goto L_0x00a4;
                case 756086527: goto L_0x00b1;
                case 1277594989: goto L_0x00be;
                case 1434631203: goto L_0x00ca;
                case 1931669192: goto L_0x00d7;
                case 2072588485: goto L_0x00e3;
                default: goto L_0x001d;
            }
        L_0x001d:
            java.lang.String r2 = "viewmodel_class"
            switch(r1) {
                case 0: goto L_0x018b;
                case 1: goto L_0x019d;
                case 2: goto L_0x01a4;
                case 3: goto L_0x01ab;
                case 4: goto L_0x01b2;
                case 5: goto L_0x01b9;
                case 6: goto L_0x0167;
                case 7: goto L_0x01f9;
                case 8: goto L_0x0170;
                case 9: goto L_0x01cb;
                case 10: goto L_0x0182;
                case 11: goto L_0x01d2;
                case 12: goto L_0x01d9;
                case 13: goto L_0x0179;
                case 14: goto L_0x01e0;
                case 15: goto L_0x01e7;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "{FBPayHubFragmentFactory} Fragment is not found for identifier => "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " with args => "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r14, r0, r1)
            throw r0
        L_0x0037:
            java.lang.String r0 = "payment_methods"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 0
            goto L_0x001d
        L_0x0042:
            java.lang.String r0 = "address"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 1
            goto L_0x001d
        L_0x004c:
            java.lang.String r0 = "orders"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 2
            goto L_0x001d
        L_0x0057:
            java.lang.String r0 = "payout_method"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 3
            goto L_0x001d
        L_0x0062:
            java.lang.String r0 = "transactions_list"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001d
        L_0x006d:
            java.lang.String r0 = "edit_shop_pay"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 5
            goto L_0x001d
        L_0x0077:
            java.lang.String r0 = "web_view"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 6
            goto L_0x001d
        L_0x0082:
            java.lang.String r0 = "form"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 7
            goto L_0x001d
        L_0x008c:
            java.lang.String r0 = "home"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 8
            goto L_0x001d
        L_0x0097:
            java.lang.String r0 = "menu"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 9
            goto L_0x001d
        L_0x00a4:
            java.lang.String r0 = "qr_code"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 10
            goto L_0x001d
        L_0x00b1:
            java.lang.String r0 = "order_info"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 11
            goto L_0x001d
        L_0x00be:
            java.lang.String r0 = "contact_info"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 12
            goto L_0x001d
        L_0x00ca:
            java.lang.String r0 = "settings"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 13
            goto L_0x001d
        L_0x00d7:
            java.lang.String r0 = "edit_paypal"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 14
            goto L_0x001d
        L_0x00e3:
            java.lang.String r0 = "merchant_info"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 15
            goto L_0x001d
        L_0x00f0:
            java.lang.String r0 = "payment_methods"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = 0
            goto L_0x000c
        L_0x00fc:
            java.lang.String r0 = "bank_account"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = 1
            goto L_0x000c
        L_0x0107:
            java.lang.String r0 = "connect_fbpay"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = 2
            goto L_0x000c
        L_0x0112:
            java.lang.String r0 = "promotion_payment"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = 3
            goto L_0x000c
        L_0x011e:
            java.lang.String r0 = "home"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = 4
            goto L_0x000c
        L_0x0129:
            java.lang.String r0 = "merchant_loyalty_list"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = 5
            goto L_0x000c
        L_0x0135:
            java.lang.String r0 = "order_detail"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = 6
            goto L_0x000c
        L_0x0141:
            java.lang.String r0 = "order_list"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = 7
            goto L_0x000c
        L_0x014d:
            java.lang.String r0 = "receipt"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = 8
            goto L_0x000c
        L_0x015a:
            java.lang.String r0 = "transaction_details"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = 9
            goto L_0x000c
        L_0x0167:
            X.QCR r3 = new X.QCR
            r3.<init>()
            r3.setArguments(r14)
            return r3
        L_0x0170:
            X.QCT r3 = new X.QCT
            r3.<init>()
            r3.setArguments(r14)
            return r3
        L_0x0179:
            X.QCX r3 = new X.QCX
            r3.<init>()
            r3.setArguments(r14)
            return r3
        L_0x0182:
            X.QCY r3 = new X.QCY
            r3.<init>()
            r3.setArguments(r14)
            return r3
        L_0x018b:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.QnB> r0 = X.C8269QnB.class
            r1.putSerializable(r2, r0)
            X.Qn3 r3 = new X.Qn3
            r3.<init>()
            r3.setArguments(r1)
            return r3
        L_0x019d:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.Qn8> r0 = X.C8266Qn8.class
            goto L_0x01ed
        L_0x01a4:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.Qn6> r0 = X.C8264Qn6.class
            goto L_0x01ed
        L_0x01ab:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.Qn5> r0 = X.C8263Qn5.class
            goto L_0x01ed
        L_0x01b2:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.QnD> r0 = X.C8271QnD.class
            goto L_0x01ed
        L_0x01b9:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.QnF> r0 = X.C8273QnF.class
            r1.putSerializable(r2, r0)
            X.Qn1 r3 = new X.Qn1
            r3.<init>()
            r3.setArguments(r1)
            return r3
        L_0x01cb:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.Qn9> r0 = X.C8267Qn9.class
            goto L_0x01ed
        L_0x01d2:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.Qn7> r0 = X.C8265Qn7.class
            goto L_0x01ed
        L_0x01d9:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.QnE> r0 = X.C8272QnE.class
            goto L_0x01ed
        L_0x01e0:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.QnA> r0 = X.C8268QnA.class
            goto L_0x01ed
        L_0x01e7:
            android.os.Bundle r1 = X.Pxi.A0C(r14, r14)
            java.lang.Class<X.Qn4> r0 = X.Qn4.class
        L_0x01ed:
            r1.putSerializable(r2, r0)
            X.QCW r3 = new X.QCW
            r3.<init>()
            r3.setArguments(r1)
            return r3
        L_0x01f9:
            r14.getClass()
            java.lang.String r2 = "form_params"
            android.os.Parcelable r1 = r14.getParcelable(r2)
            r1.getClass()
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            r0.putParcelable(r2, r1)
            X.QCS r3 = new X.QCS
            r3.<init>()
            r3.setArguments(r0)
            return r3
        L_0x0215:
            X.AnonymousClass2E0.A0D()
            r14.getClass()
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r14)
            java.lang.String r10 = r0.A00()
            com.instagram.common.session.UserSession r0 = r13.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r9 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r9.<init>((X.0lg) r0)
            android.content.Context r8 = r13.A00
            r0 = 2131969226(0x7f1344ca, float:1.9575369E38)
            java.lang.String r0 = r8.getString(r0)
            r9.A0U = r0
            java.lang.String r7 = "com.bloks.www.fbpay.payment_methods"
            r9.A0R = r7
            r6 = 0
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            r2 = 1
            java.util.BitSet r1 = X.DbS.A0w(r2)
            r10.getClass()
            java.lang.String r0 = "logging_session_id"
            r5.put(r0, r10)
            r0 = 0
            r1.set(r0)
            int r0 = r1.nextClearBit(r0)
            if (r0 < r2) goto L_0x0275
            X.DiU r1 = X.Pxf.A0T(r7, r5, r4)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r6
            r1.A02 = r6
            r1.A04 = r6
            r1.A0H(r3)
            X.3M3 r3 = r1.A0C(r8, r9)
            return r3
        L_0x0275:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x027a:
            if (r14 != 0) goto L_0x0280
            android.os.Bundle r14 = X.AnonymousClass7TE.A0a()
        L_0x0280:
            com.instagram.common.session.UserSession r0 = r13.A01
            java.lang.String r0 = r0.A05
            r14.putString(r3, r0)
            X.E3i r3 = new X.E3i
            r3.<init>()
            r3.setArguments(r14)
            return r3
        L_0x0290:
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            com.instagram.common.session.UserSession r5 = r13.A01
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r5)
            boolean r0 = X.2Ek.A01(r0)
            if (r0 != 0) goto L_0x02a9
            boolean r1 = X.AnonymousClass431.A00(r5)
            r0 = 0
            if (r1 == 0) goto L_0x02aa
        L_0x02a9:
            r0 = 1
        L_0x02aa:
            java.lang.String r1 = java.lang.Boolean.toString(r0)
            java.lang.String r0 = "has_business_tool"
            r3.put(r0, r1)
            if (r14 == 0) goto L_0x0329
            android.os.Parcelable r0 = r14.getParcelable(r4)
            if (r0 == 0) goto L_0x0329
            com.facebookpay.logging.FBPayLoggerData r1 = X.Pxi.A0J(r14)
        L_0x02bf:
            java.lang.String r4 = r1.A00()
            X.SRV r0 = X.AnonymousClass2E0.A0E()
            X.2FO r2 = r0.A05()
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r1)
            java.lang.String r0 = "client_load_fbpayhubhome_init"
            r2.Cgl(r0, r1)
            java.lang.String r0 = "logging_session_id"
            r3.put(r0, r4)
            if (r14 == 0) goto L_0x02ef
            java.lang.String r0 = "referrer"
            java.lang.String r1 = r14.getString(r0)
            if (r1 != 0) goto L_0x02e6
            java.lang.String r1 = ""
        L_0x02e6:
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.put(r0, r1)
        L_0x02ef:
            X.F1e r2 = new X.F1e
            r2.<init>(r5)
            android.content.Context r1 = r13.A00
            r0 = 2131962187(0x7f13294b, float:1.9561092E38)
            java.lang.String r0 = r1.getString(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = r2.A00
            r2.A0U = r0
            r0 = 1
            r2.A0k = r0
            r2.A0l = r0
            boolean r0 = X.C11431STx.A03()
            if (r0 != 0) goto L_0x0315
            r0 = 2131962186(0x7f13294a, float:1.956109E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0T = r0
        L_0x0315:
            r0 = 619(0x26b, float:8.67E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DiU r1 = X.C46649DiU.A04(r0, r3)
            r0 = 110176278(0x6912816, float:5.460184E-35)
            r1.A00 = r0
            X.3M3 r3 = X.C49891FBs.A02(r2, r1)
            return r3
        L_0x0329:
            com.facebookpay.logging.FBPayLoggerData r1 = X.C11249SHj.A00()
            goto L_0x02bf
        L_0x032e:
            r14.getClass()
            java.lang.String r4 = "credentialID"
            java.lang.String r1 = X.DbU.A0l(r14, r4)
            java.lang.String r0 = "title"
            java.lang.String r3 = X.DbU.A0l(r14, r0)
            r2.putString(r4, r1)
            X.1WM r0 = X.1WM.getInstance()
            r0.getFragmentFactory()
            X.1WM.getInstance()
            com.instagram.common.session.UserSession r0 = r13.A01
            X.T8B r1 = new X.T8B
            r1.<init>(r0)
            r1.A07 = r3
            java.lang.String r0 = "IgPaymentsBankAccountSettingsRoute"
            r1.A01(r0)
            goto L_0x0399
        L_0x035a:
            r14.getClass()
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r14)
            java.lang.String r1 = r0.A00()
            com.instagram.common.session.UserSession r0 = r13.A01
            java.lang.String r0 = r0.A05
            r2.putString(r3, r0)
            r2.putString(r5, r1)
            X.R8I r3 = new X.R8I
            r3.<init>()
            r3.setArguments(r2)
            return r3
        L_0x0378:
            r14.getClass()
            java.lang.String r0 = X.DbU.A0l(r14, r5)
            r2.putString(r5, r0)
            X.1WM r0 = X.1WM.getInstance()
            r0.getFragmentFactory()
            X.1WM.getInstance()
            com.instagram.common.session.UserSession r0 = r13.A01
            X.T8B r1 = new X.T8B
            r1.<init>(r0)
            java.lang.String r0 = "IgOrdersRoute"
            X.T8B r1 = r1.A01(r0)
        L_0x0399:
            r1.A00(r2)
            android.os.Bundle r0 = r1.AEV()
            X.R8S r3 = new X.R8S
            r3.<init>()
            r3.setArguments(r0)
            return r3
        L_0x03a9:
            r14.getClass()
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r14)
            java.lang.String r12 = r0.A00()
            java.lang.String r11 = X.DbU.A0l(r14, r10)
            com.instagram.common.session.UserSession r0 = r13.A01
            X.F1e r1 = new X.F1e
            r1.<init>(r0)
            android.content.Context r9 = r13.A00
            r0 = 2131962200(0x7f132958, float:1.9561118E38)
            java.lang.String r0 = r9.getString(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r8 = r1.A00
            r8.A0U = r0
            java.lang.String r7 = "com.bloks.www.fbpay.transaction_details"
            r8.A0R = r7
            r6 = 0
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            r2 = 1
            java.util.BitSet r1 = X.DbS.A0w(r2)
            r12.getClass()
            java.lang.String r0 = X.Py2.A00()
            r5.put(r0, r12)
            r0 = 0
            r1.set(r0)
            r5.put(r10, r11)
            int r0 = r1.nextClearBit(r0)
            if (r0 < r2) goto L_0x0411
            X.DiU r1 = X.Pxf.A0T(r7, r5, r4)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r6
            r1.A02 = r6
            r1.A04 = r6
            r1.A0H(r3)
            X.3M3 r3 = r1.A0C(r9, r8)
            return r3
        L_0x0411:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x0416:
            r14.getClass()
            java.lang.String r4 = X.DbU.A0l(r14, r10)
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r14)
            java.lang.String r3 = r0.A00()
            com.instagram.common.session.UserSession r2 = r13.A01
            android.content.Context r1 = r13.A00
            r0 = 2131969065(0x7f134429, float:1.9575042E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "Instagram"
            X.R8S r3 = X.C324476zN.A06(r2, r1, r4, r3, r0)
            return r3
        L_0x0437:
            r14.getClass()
            X.ERj r1 = new X.ERj
            r1.<init>()
            com.instagram.common.session.UserSession r0 = r13.A01
            java.lang.String r0 = r0.A05
            r14.putString(r3, r0)
            r1.setArguments(r14)
            return r1
        L_0x044a:
            r14.getClass()
            java.lang.String r0 = "order_id"
            java.lang.String r3 = X.DbU.A0l(r14, r0)
            com.instagram.common.session.UserSession r2 = r13.A01
            android.content.Context r1 = r13.A00
            r0 = 2131964514(0x7f133262, float:1.9565812E38)
            java.lang.String r0 = r1.getString(r0)
            X.R8S r0 = X.C324476zN.A05(r2, r0, r3)
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Qmf.A01(android.os.Bundle, java.lang.String):androidx.fragment.app.Fragment");
    }
}
