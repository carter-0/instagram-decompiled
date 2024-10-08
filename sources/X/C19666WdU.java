package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.WdU  reason: case insensitive filesystem */
public final class C19666WdU implements X58 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C17806VgJ A02;
    public final /* synthetic */ X59 A03;

    public C19666WdU(Context context, UserSession userSession, C17806VgJ vgJ, X59 x59) {
        this.A02 = vgJ;
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = x59;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Vl7, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void Dbb(Object obj) {
        Integer num;
        XR2 xr2;
        XBm xBm = (XBm) obj;
        0qQ.A0B(xBm, 0);
        C17806VgJ vgJ = this.A02;
        C18078Vl7 vl7 = vgJ.A00;
        C18078Vl7 vl72 = vl7;
        if (vl7 == null) {
            UserSession userSession = this.A01;
            0Tu r1 = 0Tu.A05;
            C18746Vzg.A00 = AnonymousClass7TF.A0R(r1, userSession, 36316242004611236L);
            C18746Vzg.A00(false);
            C18746Vzg.A02 = 182.A04(r1, userSession, 36879191957897468L);
            C18746Vzg.A01 = 182.A04(r1, userSession, 36879191957963005L);
            C18746Vzg.A03 = 182.A04(r1, userSession, 36879191958094078L);
            Context context = this.A00;
            xBm.ESn(context.getApplicationContext());
            xBm.EiJ(true);
            xBm.EOl(1);
            UUX uux = new UUX(userSession);
            xBm.EPh(uux);
            xBm.EqA(uux.A02());
            String A04 = 182.A04(r1, userSession, 36879191954882805L);
            if (A04.equals("TCP")) {
                num = AnonymousClass05K.A00;
            } else if (A04.equals("BLE")) {
                num = AnonymousClass05K.A01;
            } else if (A04.equals("BTC")) {
                num = AnonymousClass05K.A0C;
            } else if (A04.equals("LINK_SWITCH")) {
                num = AnonymousClass05K.A0N;
            } else if (A04.equals("MWA_BTC")) {
                num = AnonymousClass05K.A0Y;
            } else {
                throw new IllegalArgumentException(A04);
            }
            xBm.EnJ(num);
            xBm.Enf((int) 182.A01(r1, userSession, 36597716979616650L));
            int i = R.drawable.notification_icon;
            int A0H = 2Yu.A0H(context, R.attr.defaultNotificationIcon);
            if (A0H != 0) {
                i = A0H;
            }
            xBm.EeD(Integer.valueOf(i));
            xBm.EXd(182.A06(r1, userSession, 36316242004414627L));
            xBm.ES5(182.A06(r1, userSession, 36316242004742309L));
            xBm.EgP(182.A06(r1, userSession, 2342159251217977506L));
            xBm.Eat(182.A00(r1, userSession, 37160666934476930L));
            xBm.Ecv((int) 182.A01(r1, userSession, 36597716981582738L));
            if (182.A06(r1, userSession, 2342159251215683738L)) {
                LN0 ln0 = new LN0(182.A01(r1, userSession, 36597716979944333L), 182.A01(r1, userSession, 36597716980009870L));
                xBm.Eau(ln0);
                ULY A022 = uux.A02();
                long A012 = 182.A01(r1, userSession, 36597716978764675L);
                double A002 = 182.A00(r1, userSession, 37160666932445310L);
                int A013 = (int) 182.A01(r1, userSession, 36597716978961285L);
                int A014 = (int) 182.A01(r1, userSession, 36597716978895748L);
                int A015 = (int) 182.A01(r1, userSession, 36597716979747723L);
                String A042 = 182.A04(r1, userSession, 36879191955800313L);
                String A043 = 182.A04(r1, userSession, 36879191955538168L);
                double A003 = 182.A00(r1, userSession, 37160666933493888L);
                int A016 = (int) 182.A01(r1, userSession, 36597716980140943L);
                LN0 ln02 = ln0;
                xBm.ENx(new LNB(A022, ln02, A042, A043, C20720Wxt.A00, A002, A003, 182.A00(r1, userSession, 37160666933690497L), A013, A014, A015, A016, (int) 182.A01(r1, userSession, 36597716980206480L), A012));
            }
            C16712V2v.A00 = (int) 182.A01(r1, userSession, 36597716979485576L);
            C16712V2v.A01 = (int) 182.A01(r1, userSession, 36597716979551113L);
            C16708V2r.A00 = 182.A06(r1, userSession, 36316242004807846L);
            182.A04(r1, userSession, 36879191955079414L);
            182.A04(r1, userSession, 36879191955144951L);
            C16716V2z.A01 = 182.A00(r1, userSession, 37160666931986556L);
            C16716V2z.A00 = 182.A00(r1, userSession, 37160666932052093L);
            C16716V2z.A02 = (int) 182.A01(r1, userSession, 36597716979223430L);
            C16716V2z.A03 = (int) 182.A01(r1, userSession, 36597716979288967L);
            xBm.EVT(new LQY(182.A01(r1, userSession, 36607840214914687L), 182.A01(r1, userSession, 36607840214980224L), 182.A01(r1, userSession, 36607840215045761L), 182.A06(r1, userSession, 36326365238146796L), (int) 182.A01(r1, userSession, 36607840215111298L)));
            Integer num2 = AnonymousClass05K.A00;
            Integer num3 = num2;
            int i2 = 1;
            if (XXs.A00(userSession)) {
                i2 = 2;
            }
            if (182.A06(r1, userSession, 36311603435537027L)) {
                xr2 = XR2.HE;
            } else {
                xr2 = XR2.LC;
            }
            if (xr2.ordinal() != 0) {
                num2 = AnonymousClass05K.A01;
            }
            xBm.EP9(new UL4(num3, num2, (int) 182.A01(r1, userSession, 36593078412444588L), ((int) 182.A01(r1, userSession, 36593078412510125L)) * i2, i2));
            boolean A1W = AnonymousClass7TF.A1W(uux.A04(), num3);
            ? obj2 = new Object();
            obj2.A0B = xBm;
            obj2.A0L = A1W;
            obj2.A0K = true;
            C16709V2s.A00 = obj2;
            obj2.A05 = 720;
            obj2.A04 = 1280;
            obj2.A0E = new WKr(obj2);
            WKq wKq = new WKq();
            obj2.A0C = wKq;
            obj2.A0D = wKq;
            obj2.A0F = new C19088WKv();
            vgJ.A00 = obj2;
            vl72 = obj2;
        }
        this.A03.Dba(vl72);
    }
}
