package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.NfJ  reason: case insensitive filesystem */
public final class C69138NfJ extends OTZ {
    public float A00;
    public B11 A01;
    public B12 A02;
    public CameraAREffect A03;
    public CameraAREffect A04;
    public OYo A05;
    public OGQ A06;
    public OGR A07;
    public Integer A08;
    public Integer A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final Context A0D;
    public final C357658Zb A0E;
    public final ONT A0F;
    public final AR0 A0G;
    public final UserSession A0H;
    public final C3497481o A0I;
    public final C70753OJz A0J;
    public final O9P A0K;
    public final LEN A0L;
    public final L54 A0M;
    public final OK1 A0N;
    public final OHY A0O;
    public final C70775OKv A0P;
    public final OWA A0Q;
    public final ONG A0R;
    public final Set A0S = DbS.A0y();
    public final Set A0T;
    public final C62320sa A0U;
    public final C62320sa A0V;
    public final 05G A0W;
    public final 05G A0X;
    public final 05G A0Y;
    public final 05G A0Z;

    public static void A09(C69353Njs njs, Integer num, String str, Map map) {
        map.put(njs, new OLD(njs, num, str, (String) null));
        OLD old = (OLD) map.get(njs);
        if (old != null) {
            OTM otm = old.A02;
            otm.A01 = otm.A02.now();
        }
    }

    public static final void A0E(C69138NfJ nfJ, Integer num, Integer num2, String str) {
        int i;
        Integer num3 = num2;
        A0C(nfJ, num2);
        C70775OKv oKv = nfJ.A0P;
        Dba.A0j(1, str, num2);
        Map map = oKv.A02;
        C69353Njs njs = C69353Njs.AVATAR_BACKGROUND;
        Long l = null;
        A09(njs, num2, str, map);
        C68502NKv A002 = OYE.A00(str);
        OWA owa = oKv.A01;
        Integer num4 = AnonymousClass05K.A00;
        String str2 = A002.A01;
        String str3 = A002.A02;
        OLD old = (OLD) map.get(njs);
        if (old != null) {
            l = Long.valueOf(old.A00());
        }
        owa.A02(new PL8(num4, num3, l, str2, str3));
        if (str.equals("simple_gradient_background_0")) {
            nfJ.A0I.A00();
            A0A(nfJ, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, A00(nfJ), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, str, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -4097, false, false, false, false, false, false, false, false, false, false, false, false, false));
            return;
        }
        OHY ohy = nfJ.A0O;
        if (num != null) {
            i = num.intValue();
        } else {
            i = OYE.A00(str).A00;
        }
        Drawable A003 = AnonymousClass2dd.A00(ohy.A02.getResources(), i);
        0qQ.A0C(A003, C273654mx.A00(352));
        ((C262364Dk) A003).A01(new C64864LjQ(str, ohy, 1));
    }

    public final void A0L(Integer num, String str, String str2, String str3, String str4) {
        String str5;
        Integer num2 = num;
        String str6 = str;
        AnonymousClass7TF.A1D(str6, 0, num2);
        if (C51971G9r.A1b(this.A0U)) {
            if (!182.A06(0Tu.A05, this.A0J.A00, 36313927012845886L)) {
                return;
            }
        }
        CameraAREffect cameraAREffect = A00(this).A05;
        if (cameraAREffect != null) {
            str5 = cameraAREffect.A0K;
        } else {
            str5 = null;
        }
        if (!0qQ.A0K(str5, str6)) {
            String str7 = str2;
            String str8 = str4;
            if (str2 == null) {
                LEN len = this.A0L;
                C262224Cq r0 = len.A08;
                if (r0 != null) {
                    AnonymousClass7TE.A1Z(new TTB(num2, len, (String) null, (String) null, str6, str8, (AnonymousClass4D7) null, 3), r0);
                    return;
                }
                return;
            }
            this.A07 = new OGR(num2, str6, str7, str3, str8);
            A0A(this, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, A00(this), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -2097153, false, false, false, false, false, true, false, false, false, false, false, false, false));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69138NfJ(Context context, AR0 ar0, UserSession userSession, C69134NfF nfF, O9R o9r, OWA owa, ONG ong, C62320sa r55) {
        super(o9r);
        Integer num;
        OYo oYo;
        UserSession userSession2 = userSession;
        ONT ont = new ONT(userSession2);
        C70753OJz oJz = new C70753OJz(userSession2);
        Context context2 = context;
        LEN len = new LEN(DbT.A05(context2), userSession2);
        OHY ohy = new OHY(context2, OYE.A00, ont, AnonymousClass12T.A00, userSession2);
        C3497481o r7 = new C3497481o();
        C357658Zb r10 = new C357658Zb(userSession2);
        L54 l54 = new L54(userSession2, context2);
        OWA owa2 = owa;
        C70775OKv oKv = new C70775OKv(owa2);
        OK1 ok1 = new OK1(nfF);
        this.A0D = context2;
        this.A0H = userSession2;
        AR0 ar02 = ar0;
        this.A0G = ar02;
        this.A0Q = owa2;
        this.A0R = ong;
        this.A0F = ont;
        this.A0J = oJz;
        this.A0L = len;
        this.A0O = ohy;
        this.A0I = r7;
        this.A0E = r10;
        this.A0M = l54;
        this.A0P = oKv;
        C62320sa r11 = r55;
        this.A0U = r11;
        this.A0N = ok1;
        Integer num2 = AnonymousClass05K.A00;
        this.A08 = num2;
        O9P o9p = new O9P(this);
        this.A0K = o9p;
        if (!ont.A02() || (oYo = this.A05) == null) {
            num = null;
        } else {
            num = oYo.A01;
        }
        List list = 0sn.A00;
        this.A0W = DbS.A10(new N9P((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, C69378NkI.EFFECT, num2, num2, num2, num, (String) null, "simple_gradient_background_0", (String) null, list, list, list, list, list, 0.0f, false, false, false, false, false, false, false, false, false, false, false, false, C51971G9r.A1b(r11)));
        this.A0X = DbS.A10(C69291Nir.UNSET);
        this.A0Y = C51970G9q.A10(false);
        this.A0Z = DbS.A10(new C66920MfE(3, 5, false));
        this.A0T = DbS.A0y();
        this.A09 = num2;
        this.A0V = C73925Pm5.A01(this, 19);
        len.A00 = new OK0(this);
        ohy.A00 = new O9N(this);
        Om6 om6 = new Om6(this);
        AH3 ah3 = ar02.A08;
        ah3.A03 = om6;
        ah3.A04 = new Om7(this);
        if (ont.A00() instanceof C69146NfV) {
            ah3.A02 = r7;
        }
        ah3.A05 = new O9O(this);
        OYo oYo2 = new OYo();
        this.A05 = oYo2;
        oYo2.A00 = o9p;
    }

    public static final N9P A00(C69138NfJ nfJ) {
        return (N9P) nfJ.A0W.getValue();
    }

    public static final Boolean A01(CameraAREffect cameraAREffect, C69138NfJ nfJ) {
        boolean z;
        UserSession userSession = nfJ.A0J.A00;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 2342156193197262650L) || !182.A06(r2, userSession, 36313381552129959L)) {
            return null;
        }
        if (cameraAREffect == null || (!O2B.A00(cameraAREffect) && cameraAREffect.A0Z.get("peerOutput") == null)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private final void A03() {
        A0A(this, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, A00(this), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 00k.A0S(0sr.A1P(new C68502NKv[]{OYE.A00("simple_gradient_background_1"), OYE.A00("simple_gradient_background_2"), OYE.A00("simple_gradient_background_3"), OYE.A00("simple_gradient_background_4"), OYE.A00("simple_gradient_background_5"), OYE.A00("simple_gradient_background_6"), OYE.A00("simple_gradient_background_7"), OYE.A00("simple_gradient_background_8"), OYE.A00("simple_gradient_background_9"), OYE.A00("simple_gradient_background_10")}), AnonymousClass7TE.A1I(OYE.A00("simple_gradient_background_0"))), (List) null, 0.0f, -65, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }

    public static final void A04(CameraAREffect cameraAREffect, C69138NfJ nfJ, Integer num, String str) {
        C69138NfJ nfJ2 = nfJ;
        if (!C51971G9r.A1b(nfJ2.A0U)) {
            String str2 = str;
            CameraAREffect cameraAREffect2 = cameraAREffect;
            if (!nfJ2.A0J(cameraAREffect, str2)) {
                LEN len = nfJ2.A0L;
                0qQ.A0B(cameraAREffect, 0);
                String A11 = DbT.A11(cameraAREffect.A0K, len.A0E);
                long A082 = C66580MXl.A08(cameraAREffect.A0K);
                Integer num2 = AnonymousClass05K.A01;
                Integer num3 = num;
                if (!(num3 == num2 || num3 == AnonymousClass05K.A0C)) {
                    ONG ong = nfJ2.A0R;
                    String str3 = cameraAREffect2.A0S;
                    String url = cameraAREffect2.A07.getUrl();
                    UserSession userSession = nfJ2.A0H;
                    C71143Odx.A04(ong.A00.A0Z, new C73970Pmo(str3, url, userSession.A06, AnonymousClass7TF.A0Q(userSession).B8Q(), A11, 1, A082));
                }
                nfJ2.A02();
                long A083 = C66580MXl.A08(cameraAREffect2.A0K);
                if (A11 == null && (num3 == num2 || num3 == AnonymousClass05K.A0C || num3 == AnonymousClass05K.A0N)) {
                    nfJ2.A0I(C69378NkI.MULTIPEER, false);
                }
                nfJ2.A07(cameraAREffect2, false);
                if (cameraAREffect2.A0M()) {
                    C70989OVd oVd = nfJ2.A0R.A00;
                    C71143Odx.A04(oVd.A0Z, new GQ2(A083, 16));
                    oVd.A0J.A00.A00();
                }
                if (cameraAREffect2.A0Z.get("participant") != null) {
                    C71143Odx.A04(nfJ2.A0R.A00.A0Z, new GQ2(A083, 15));
                }
                A05(cameraAREffect2, nfJ2, num3, str2, (String) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        if (r4.A0L() != true) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0115, code lost:
        if (r10.A01() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0167, code lost:
        if (r3 == X.C69353Njs.A09) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fb, code lost:
        if (r43 != null) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(com.instagram.camera.effect.models.CameraAREffect r43, X.C69138NfJ r44, java.lang.Integer r45, java.lang.String r46, java.lang.String r47) {
        /*
            r0 = r44
            X.N9P r1 = A00(r0)
            com.instagram.camera.effect.models.CameraAREffect r2 = r1.A05
            r1 = r43
            boolean r2 = X.0qQ.A0K(r1, r2)
            r9 = r47
            if (r2 == 0) goto L_0x0016
            r0.A06(r1, r9)
        L_0x0015:
            return
        L_0x0016:
            r8 = r46
            boolean r2 = r0.A0J(r1, r8)
            if (r2 != 0) goto L_0x0015
            r7 = 1
            r2 = 0
            if (r43 == 0) goto L_0x01ff
            boolean r3 = X.O2B.A00(r1)
            if (r3 != r7) goto L_0x01ff
        L_0x0028:
            X.N9P r3 = A00(r0)
            com.instagram.camera.effect.models.CameraAREffect r4 = r3.A05
            X.N9P r3 = A00(r0)
            boolean r10 = r3.A0L
            if (r43 == 0) goto L_0x01e9
            boolean r3 = r1.A0N()
            if (r3 != r7) goto L_0x01e9
            r0.A03()
            X.05G r5 = r0.A0Y
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            X.0qQ.A0B(r5, r2)
            r5.FIA(r3)
        L_0x004b:
            r12 = 1
            r1.A0N()
        L_0x004f:
            X.05G r11 = r0.A0X
            java.lang.Object r5 = r11.getValue()
            if (r5 != 0) goto L_0x0059
            X.Nir r5 = X.C69291Nir.UNSET
        L_0x0059:
            java.lang.Integer r3 = r0.A08
            java.lang.Integer r6 = X.AnonymousClass05K.A0j
            if (r3 != r6) goto L_0x0063
            X.Nir r3 = X.C69291Nir.ON
            if (r5 != r3) goto L_0x007e
        L_0x0063:
            X.Nir r3 = X.C69291Nir.ON
            if (r5 == r3) goto L_0x006b
            X.Nir r3 = X.C69291Nir.PENDING
            if (r5 != r3) goto L_0x007e
        L_0x006b:
            X.Nir r3 = X.C69291Nir.OFF
            r11.FIA(r3)
            X.OWA r11 = r0.A0Q
            if (r12 == 0) goto L_0x01e5
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
        L_0x0076:
            X.PKZ r3 = new X.PKZ
            r3.<init>(r5)
            r11.A02(r3)
        L_0x007e:
            X.N9P r17 = A00(r0)
            X.LEN r3 = r0.A0L
            java.util.List r3 = r3.A05
            boolean r32 = X.00k.A0u(r3, r1)
            r5 = 0
            r30 = 0
            r31 = -1508993(0xffffffffffe8f97f, float:NaN)
            r12 = r5
            r13 = r5
            r15 = r1
            r16 = r5
            r18 = r5
            r19 = r5
            r20 = r5
            r21 = r5
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r5
            r26 = r5
            r27 = r5
            r28 = r5
            r29 = r5
            r33 = r2
            r34 = r2
            r35 = r2
            r36 = r2
            r37 = r2
            r38 = r2
            r39 = r2
            r40 = r2
            r41 = r2
            r42 = r2
            r43 = r2
            r44 = r2
            r14 = r1
            r11 = r5
            X.N9P r3 = X.N9P.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            A0A(r0, r3)
            r3 = 15
            X.Pm5 r17 = X.C73925Pm5.A01(r0, r3)
            if (r1 == 0) goto L_0x01b2
            boolean r3 = r1.A0N()
            if (r3 != r7) goto L_0x01b2
            if (r10 == 0) goto L_0x01ae
            java.lang.Integer r2 = X.AnonymousClass05K.A1F
        L_0x00e0:
            r0.A09 = r2
            X.ONG r9 = r0.A0R
            java.lang.Boolean r14 = A01(r1, r0)
            X.ONT r10 = r0.A0F
            com.instagram.common.session.UserSession r12 = r10.A00
            X.0Tu r11 = X.0Tu.A05
            r2 = 36310903357964663(0x81009300200177, double:3.0264997236243064E-306)
            boolean r2 = X.182.A06(r11, r12, r2)
            if (r2 == 0) goto L_0x01a8
            if (r4 == 0) goto L_0x0103
            boolean r2 = r4.A0L()
            r18 = 1
            if (r2 == r7) goto L_0x0105
        L_0x0103:
            r18 = 0
        L_0x0105:
            X.0sa r3 = r0.A0V
            X.0sa r2 = r0.A0U
            boolean r2 = X.C51971G9r.A1b(r2)
            if (r2 == 0) goto L_0x0117
            boolean r2 = r10.A01()
            r19 = 1
            if (r2 != 0) goto L_0x0119
        L_0x0117:
            r19 = 0
        L_0x0119:
            r12 = r9
            r13 = r1
            r15 = r5
            r16 = r17
            r17 = r3
            r12.A01(r13, r14, r15, r16, r17, r18, r19)
        L_0x0123:
            r12 = r45
            if (r4 == 0) goto L_0x017f
            if (r1 != 0) goto L_0x012a
            r6 = r12
        L_0x012a:
            X.OKv r11 = r0.A0P
            java.lang.String r9 = r4.A0K
            X.0qQ.A07(r9)
            java.util.Map r7 = r11.A02
            X.Njs r4 = X.C69353Njs.NORMAL_EFFECT
            java.lang.Object r10 = r7.get(r4)
            X.OLD r10 = (X.OLD) r10
            if (r10 == 0) goto L_0x017c
            X.OTM r13 = r10.A02
            long r2 = r13.A01
            r15 = 0
            int r14 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r14 == 0) goto L_0x017c
            X.1FE r2 = r13.A02
            long r2 = r2.now()
            r13.A00 = r2
            X.OWA r11 = r11.A01
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            X.Njs r3 = r10.A01
            java.lang.String r2 = r10.A03
            long r13 = r10.A00()
            java.lang.Long r18 = java.lang.Long.valueOf(r13)
            X.Njs r10 = X.C69353Njs.AVATAR_EFFECT
            if (r3 == r10) goto L_0x0169
            X.Njs r10 = X.C69353Njs.PRESET_AVATAR_EFFECT
            r21 = 0
            if (r3 != r10) goto L_0x016b
        L_0x0169:
            r21 = 1
        L_0x016b:
            X.PLB r13 = new X.PLB
            r14 = r3
            r16 = r5
            r17 = r6
            r19 = r9
            r20 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r11.A02(r13)
        L_0x017c:
            r7.put(r4, r5)
        L_0x017f:
            if (r1 == 0) goto L_0x0015
            X.OKv r0 = r0.A0P
            java.util.Map r4 = r0.A02
            X.Njs r3 = X.C69353Njs.NORMAL_EFFECT
            java.lang.String r2 = r1.A0K
            X.0qQ.A07(r2)
            boolean r0 = r1.A0M()
            if (r0 == 0) goto L_0x019d
            X.Njs r1 = X.C69353Njs.MULTIPEER_EFFECT
        L_0x0194:
            X.OLD r0 = new X.OLD
            r0.<init>(r1, r12, r2, r8)
            r4.put(r3, r0)
            return
        L_0x019d:
            boolean r0 = r1.A0N()
            if (r0 == 0) goto L_0x01a6
            X.Njs r1 = X.C69353Njs.PRESET_AVATAR_EFFECT
            goto L_0x0194
        L_0x01a6:
            r1 = r3
            goto L_0x0194
        L_0x01a8:
            boolean r18 = r1.A0L()
            goto L_0x0105
        L_0x01ae:
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            goto L_0x00e0
        L_0x01b2:
            r3 = 16
            X.Pm5 r16 = X.C73925Pm5.A01(r0, r3)
            r0.A06(r1, r9)
            X.ONG r10 = r0.A0R
            java.lang.Boolean r13 = A01(r1, r0)
            X.0sa r9 = r0.A0V
            X.0sa r3 = r0.A0U
            boolean r20 = X.C51971G9r.A1b(r3)
            X.Pki r7 = X.C73845Pki.A00
            r3 = 4
            X.AnonymousClass7TF.A1E(r7, r3, r9)
            X.OVd r3 = r10.A00
            X.Odx r3 = r3.A0Z
            X.AyI r10 = new X.AyI
            r11 = r1
            r12 = r3
            r14 = r5
            r15 = r7
            r18 = r9
            r19 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.C71143Odx.A04(r3, r10)
            goto L_0x0123
        L_0x01e5:
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            goto L_0x0076
        L_0x01e9:
            X.05G r5 = r0.A0Y
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            X.0qQ.A0B(r5, r2)
            r5.FIA(r3)
            X.81o r3 = r0.A0I
            r3.A00()
            r12 = 0
            if (r43 == 0) goto L_0x004f
            goto L_0x004b
        L_0x01ff:
            r0.A07(r1, r7)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69138NfJ.A05(com.instagram.camera.effect.models.CameraAREffect, X.NfJ, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    private final void A06(CameraAREffect cameraAREffect, String str) {
        String str2;
        if (cameraAREffect != null) {
            str2 = cameraAREffect.A0K;
        } else {
            str2 = null;
        }
        if (0qQ.A0K(str2, String.valueOf(182.A01(0Tu.A05, this.A0J.A00, 36611473757182182L)))) {
            this.A0G.A08.A06.A00(new JSONObject(AnonymousClass7TF.A0w("imageUrl", str)));
        }
    }

    private final void A07(CameraAREffect cameraAREffect, boolean z) {
        A0D(this, AnonymousClass05K.A00);
        CameraAREffect cameraAREffect2 = A00(this).A05;
        if (cameraAREffect2 != null && cameraAREffect2.A0M() && (cameraAREffect == null || !cameraAREffect.A0M())) {
            C71143Odx.A04(this.A0R.A00.A0Z, J4Q.A00);
        }
        CameraAREffect cameraAREffect3 = A00(this).A05;
        if (!(cameraAREffect3 == null || cameraAREffect3.A0Z.get("participant") == null)) {
            C71143Odx.A04(this.A0R.A00.A0Z, J4P.A00);
        }
        if (z) {
            A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 == X.AnonymousClass87I.AVATAR_PRESET) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.AnonymousClass87G r5, X.C69138NfJ r6) {
        /*
            X.87I r1 = r5.A04
            if (r1 != 0) goto L_0x0006
            X.87I r1 = X.AnonymousClass87I.EMPTY
        L_0x0006:
            X.87I r0 = X.AnonymousClass87I.AVATAR_PLACEHOLDER
            if (r1 == r0) goto L_0x0031
            X.N9P r0 = A00(r6)
            boolean r4 = r0.A0L
            X.87I r3 = r5.A04
            X.87I r0 = X.AnonymousClass87I.AVATAR_EFFECT
            if (r3 == r0) goto L_0x001b
            X.87I r0 = X.AnonymousClass87I.AVATAR_PRESET
            r2 = 0
            if (r3 != r0) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            r1 = 0
            if (r2 != 0) goto L_0x002d
            if (r4 == 0) goto L_0x0032
            X.87I r0 = X.AnonymousClass87I.FILTER
            if (r3 == r0) goto L_0x002d
            X.87I r0 = X.AnonymousClass87I.AVATAR_BACKGROUND
            if (r3 == r0) goto L_0x002d
            X.87I r0 = X.AnonymousClass87I.EMPTY_AVATAR_BACKGROUND
            if (r3 != r0) goto L_0x0032
        L_0x002d:
            r0 = 1
        L_0x002e:
            A0H(r6, r0, r1)
        L_0x0031:
            return
        L_0x0032:
            r0 = 0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69138NfJ.A08(X.87G, X.NfJ):void");
    }

    public static final void A0A(C69138NfJ nfJ, N9P n9p) {
        C69138NfJ nfJ2 = nfJ;
        05G r2 = nfJ2.A0W;
        N9P A002 = N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, n9p, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, Integer.MAX_VALUE, false, false, false, false, false, false, false, false, false, false, false, false, C51971G9r.A1b(nfJ2.A0U));
        0qQ.A0B(r2, 0);
        r2.FIA(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r0.A0L() != true) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (r5.A01() == false) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0B(X.C69138NfJ r18, java.lang.Integer r19) {
        /*
            r3 = r18
            X.05G r8 = r3.A0X
            java.lang.Object r0 = r8.getValue()
            X.Nir r9 = X.C69291Nir.ON
            if (r0 == r9) goto L_0x00ee
            com.instagram.camera.effect.models.CameraAREffect r0 = r3.A03
            r2 = 0
            boolean r0 = r3.A0J(r0, r2)
            if (r0 != 0) goto L_0x00ee
            com.instagram.camera.effect.models.CameraAREffect r0 = r3.A03
            r4 = 0
            r7 = 1
            r3.A07(r0, r7)
            java.lang.String r12 = X.AnonymousClass7TG.A0j()
            X.OWA r6 = r3.A0Q
            X.PKY r0 = new X.PKY
            r0.<init>(r12)
            r6.A02(r0)
            java.lang.Object r1 = r8.getValue()
            if (r1 != 0) goto L_0x0032
            X.Nir r1 = X.C69291Nir.UNSET
        L_0x0032:
            java.lang.Integer r0 = r3.A08
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            if (r0 != r5) goto L_0x0100
            if (r1 == r9) goto L_0x005c
            r8.FIA(r9)
            X.05G r1 = r3.A0Y
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.0qQ.A0B(r1, r4)
            r1.FIA(r0)
            com.instagram.camera.effect.models.CameraAREffect r0 = r3.A03
            r4 = 0
            if (r0 == 0) goto L_0x00fd
            java.lang.String r5 = r0.A0K
            java.lang.String r4 = r0.A0M
        L_0x0052:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.PKc r0 = new X.PKc
            r0.<init>(r5, r1, r4)
            r6.A02(r0)
        L_0x005c:
            X.N9P r0 = A00(r3)
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A05
            if (r0 == 0) goto L_0x006b
            boolean r0 = r0.A0L()
            r8 = 1
            if (r0 == r7) goto L_0x006c
        L_0x006b:
            r8 = 0
        L_0x006c:
            com.instagram.camera.effect.models.CameraAREffect r13 = r3.A03
            if (r13 != 0) goto L_0x0076
            X.N9P r0 = A00(r3)
            com.instagram.camera.effect.models.CameraAREffect r13 = r0.A05
        L_0x0076:
            X.N9P r15 = A00(r3)
            X.OYo r0 = r3.A05
            if (r0 == 0) goto L_0x00fb
            java.lang.Integer r0 = r0.A01
        L_0x0080:
            r18 = -1074988545(0xffffffffbfecf9ff, float:-1.8513793)
            r14 = r13
            r17 = r0
            r16 = r2
            X.N9P r0 = X.N9P.A00((com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) null, (com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration) null, (com.instagram.camera.effect.models.CameraAREffect) null, r13, r14, (X.C69378NkI) null, r15, r16, (java.lang.Integer) null, (java.lang.Integer) null, r17, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 0.0f, r18, false, false, false, false, false, false, false, false, false, false, false, false, false)
            A0A(r3, r0)
            r0 = 17
            X.Pm5 r13 = X.C73925Pm5.A01(r3, r0)
            com.instagram.camera.effect.models.CameraAREffect r10 = r3.A03
            if (r10 == 0) goto L_0x00e8
            r4 = r19
            r3.A09 = r4
            X.ONG r9 = r3.A0R
            java.lang.Boolean r11 = A01(r10, r3)
            X.ONT r5 = r3.A0F
            com.instagram.common.session.UserSession r7 = r5.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36310903357964663(0x81009300200177, double:3.0264997236243064E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            r15 = 1
            if (r0 == 0) goto L_0x00b6
            r15 = r8
        L_0x00b6:
            X.0sa r14 = r3.A0V
            X.0sa r0 = r3.A0U
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r5.A01()
            r16 = 1
            if (r0 != 0) goto L_0x00ca
        L_0x00c8:
            r16 = 0
        L_0x00ca:
            r9.A01(r10, r11, r12, r13, r14, r15, r16)
            X.OKv r0 = r3.A0P
            java.util.Map r7 = r0.A02
            X.Njs r6 = X.C69353Njs.NORMAL_EFFECT
            java.lang.String r5 = r10.A0K
            X.0qQ.A07(r5)
            boolean r0 = r10.A0M()
            if (r0 == 0) goto L_0x00ef
            X.Njs r1 = X.C69353Njs.MULTIPEER_EFFECT
        L_0x00e0:
            X.OLD r0 = new X.OLD
            r0.<init>(r1, r4, r5, r2)
            r7.put(r6, r0)
        L_0x00e8:
            A00(r3)
            r3.A03()
        L_0x00ee:
            return
        L_0x00ef:
            boolean r0 = r10.A0N()
            if (r0 == 0) goto L_0x00f8
            X.Njs r1 = X.C69353Njs.PRESET_AVATAR_EFFECT
            goto L_0x00e0
        L_0x00f8:
            X.Njs r1 = X.C69353Njs.AVATAR_EFFECT
            goto L_0x00e0
        L_0x00fb:
            r0 = r2
            goto L_0x0080
        L_0x00fd:
            r5 = r2
            goto L_0x0052
        L_0x0100:
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x0142
            r0 = 3
            if (r1 == r0) goto L_0x012a
            r0 = 4
            if (r1 != r0) goto L_0x011d
            X.OK1 r0 = r3.A0N
            X.NfF r4 = r0.A00
            long r0 = java.lang.System.currentTimeMillis()
            X.C69134NfF.A01(r4, r5, r0)
            X.PKi r0 = X.C72794PKi.A00
        L_0x011a:
            r6.A02(r0)
        L_0x011d:
            java.lang.Integer r1 = r3.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x005c
            X.Nir r0 = X.C69291Nir.PENDING
            r8.FIA(r0)
            goto L_0x005c
        L_0x012a:
            java.lang.Integer r9 = X.AnonymousClass05K.A0u
            X.OK1 r0 = r3.A0N
            X.NfF r5 = r0.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A02
            long r0 = java.lang.System.currentTimeMillis()
            X.C69134NfF.A01(r5, r4, r0)
            X.PKa r0 = new X.PKa
            r0.<init>(r9)
            r6.A02(r0)
            goto L_0x011d
        L_0x0142:
            X.OK1 r0 = r3.A0N
            X.NfF r5 = r0.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A0u
            long r0 = java.lang.System.currentTimeMillis()
            X.C69134NfF.A01(r5, r4, r0)
            X.PKh r0 = X.C72793PKh.A00
            goto L_0x011a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69138NfJ.A0B(X.NfJ, java.lang.Integer):void");
    }

    public static final void A0C(C69138NfJ nfJ, Integer num) {
        Long l;
        C70775OKv oKv = nfJ.A0P;
        String str = A00(nfJ).A0C;
        Integer num2 = num;
        AnonymousClass7TG.A1N(str, num);
        Map map = oKv.A02;
        C69353Njs njs = C69353Njs.AVATAR_BACKGROUND;
        OLD old = (OLD) map.get(njs);
        if (old != null) {
            OTM otm = old.A02;
            otm.A00 = otm.A02.now();
            C68502NKv A002 = OYE.A00(str);
            OWA owa = oKv.A01;
            Integer num3 = AnonymousClass05K.A01;
            String str2 = A002.A01;
            String str3 = A002.A02;
            OLD old2 = (OLD) map.get(njs);
            if (old2 != null) {
                l = Long.valueOf(old2.A00());
            } else {
                l = null;
            }
            owa.A02(new PL8(num3, num2, l, str2, str3));
        }
        map.remove(njs);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0095, code lost:
        if (r18 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0F(X.C69138NfJ r16, java.lang.Integer r17, java.lang.String r18) {
        /*
            r3 = r16
            X.N9P r0 = A00(r3)
            java.lang.String r0 = r0.A0D
            r10 = r18
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x0094
            X.N9P r0 = A00(r3)
            java.lang.String r2 = r0.A0D
            X.N9P r8 = A00(r3)
            r9 = 0
            r4 = 0
            r16 = -2049(0xfffffffffffff7ff, float:NaN)
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            X.N9P r0 = X.N9P.A00((com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) null, (com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (X.C69378NkI) null, r8, (java.lang.Integer) null, r9, (java.lang.Integer) null, (java.lang.Integer) null, r10, (java.lang.String) null, (java.lang.String) null, r11, r12, r13, r14, r15, 0.0f, r16, false, false, false, false, false, false, false, false, false, false, false, false, false)
            A0A(r3, r0)
            X.ONG r0 = r3.A0R
            X.OVd r0 = r0.A00
            X.Odx r0 = r0.A0Z
            X.NCZ r1 = r0.A06
            r13 = r17
            if (r1 == 0) goto L_0x0095
            X.0eM r0 = r1.A0B
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof com.instagram.rtc.rsys.camera.IgLiteCameraProxy
            if (r0 == 0) goto L_0x0095
            X.NCn r1 = X.NCZ.A00(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.rtc.rsys.camera.IgLiteCameraProxy"
            X.0qQ.A0C(r1, r0)
            com.instagram.rtc.rsys.camera.IgLiteCameraProxy r1 = (com.instagram.rtc.rsys.camera.IgLiteCameraProxy) r1
            X.AUb r1 = r1.A03()
            r0 = 1
            X.9g8 r1 = X.C39870ACr.A00(r1, r4)
            if (r1 == 0) goto L_0x0095
            if (r18 != 0) goto L_0x0098
            r1.A01 = r4
        L_0x005a:
            if (r2 == 0) goto L_0x0094
            X.OKv r8 = r3.A0P
            X.N9P r0 = A00(r3)
            boolean r6 = r0.A0L
            java.util.Map r5 = r8.A02
            X.Njs r4 = X.C69353Njs.FILTER_EFFECT
            java.lang.Object r7 = r5.get(r4)
            X.OLD r7 = (X.OLD) r7
            if (r7 == 0) goto L_0x0091
            X.OTM r3 = r7.A02
            X.1FE r0 = r3.A02
            long r0 = r0.now()
            r3.A00 = r0
            X.OWA r3 = r8.A01
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            long r0 = r7.A00()
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            X.PL9 r11 = new X.PL9
            r15 = r2
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r3.A02(r11)
        L_0x0091:
            r5.put(r4, r9)
        L_0x0094:
            return
        L_0x0095:
            if (r18 == 0) goto L_0x005a
            goto L_0x00a1
        L_0x0098:
            r1.A01 = r0
            int r0 = java.lang.Integer.parseInt(r10)
            r1.A00(r0)
        L_0x00a1:
            X.OKv r5 = r3.A0P
            X.N9P r0 = A00(r3)
            boolean r4 = r0.A0L
            java.util.Map r1 = r5.A02
            X.Njs r0 = X.C69353Njs.FILTER_EFFECT
            A09(r0, r13, r10, r1)
            X.OWA r0 = r5.A01
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            X.PL9 r11 = new X.PL9
            r15 = r10
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r0.A02(r11)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69138NfJ.A0F(X.NfJ, java.lang.Integer, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007b, code lost:
        if (r14 != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(X.C69138NfJ r12, java.lang.Integer r13, boolean r14) {
        /*
            X.05G r3 = r12.A0Z
            java.lang.Object r0 = r3.getValue()
            X.MfE r0 = (X.C66920MfE) r0
            boolean r0 = r0.A02
            if (r0 == r14) goto L_0x007a
            java.lang.Object r0 = r3.getValue()
            X.MfE r0 = (X.C66920MfE) r0
            int r1 = r0.A01
            r0 = 5
            X.MfE r2 = new X.MfE
            r2.<init>((int) r1, (boolean) r14, (int) r0)
            r3.FIA(r2)
            X.ONG r1 = r12.A0R
            boolean r0 = r2.A02
            int r3 = r2.A01
            r1.A02(r0, r3)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            if (r13 != r7) goto L_0x007b
            X.L54 r0 = r12.A0M
            X.L2A r0 = r0.A00
            X.0xa r2 = r0.A00
            X.0xY r1 = r2.AR4()
            java.lang.String r0 = "rtc_should_auto_apply_touch_up"
            r1.E5T(r0, r14)
            r1.apply()
            java.lang.String r1 = "rtc_touch_up_toast_display_count"
            r11 = 0
            int r4 = r2.getInt(r1, r11)
            if (r14 == 0) goto L_0x007e
            r0 = 3
            if (r4 >= r0) goto L_0x0061
            X.OK1 r0 = r12.A0N
            X.NfF r0 = r0.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A05
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String[] r8 = new java.lang.String[r11]
            X.N9C r5 = new X.N9C
            r5.<init>(r6, r7, r8, r9, r11)
            r0.A02(r5)
            int r0 = r4 + 1
            X.AnonymousClass7TG.A1M(r2, r1, r0)
        L_0x0061:
            X.OKv r5 = r12.A0P
            java.util.Map r4 = r5.A02
            X.Njs r1 = X.C69353Njs.TOUCHUP_EFFECT
            java.lang.String r0 = "TOUCH_UP_METRIC"
            r2 = 0
            A09(r1, r13, r0, r4)
            X.OWA r1 = r5.A01
            X.PL6 r0 = new X.PL6
            r0.<init>(r7, r13, r2, r2)
            r1.A02(r0)
            r5.A00(r3)
        L_0x007a:
            return
        L_0x007b:
            if (r14 == 0) goto L_0x007e
            goto L_0x0061
        L_0x007e:
            X.OKv r8 = r12.A0P
            java.util.Map r7 = r8.A02
            X.Njs r6 = X.C69353Njs.TOUCHUP_EFFECT
            java.lang.Object r5 = r7.get(r6)
            X.OLD r5 = (X.OLD) r5
            r4 = 0
            if (r5 == 0) goto L_0x00ab
            X.OTM r2 = r5.A02
            X.1FE r0 = r2.A02
            long r0 = r0.now()
            r2.A00 = r0
            X.OWA r3 = r8.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            long r0 = r5.A00()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.PL6 r0 = new X.PL6
            r0.<init>(r2, r13, r1, r4)
            r3.A02(r0)
        L_0x00ab:
            r7.put(r6, r4)
            X.OFX r2 = r8.A00
            X.0ng r1 = r2.A01
            if (r1 == 0) goto L_0x00b9
            X.0no r0 = r2.A02
            r0.A02(r1)
        L_0x00b9:
            r2.A01 = r4
            r0 = -1
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69138NfJ.A0G(X.NfJ, java.lang.Integer, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (r4 != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fb, code lost:
        if (r4 == false) goto L_0x00fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0H(X.C69138NfJ r38, boolean r39, boolean r40) {
        /*
            r5 = r38
            X.N9P r12 = A00(r5)
            r4 = r39
            if (r39 == 0) goto L_0x0113
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
        L_0x000c:
            boolean r2 = r12.A0L
            if (r2 == r4) goto L_0x0050
            r6 = 0
            r27 = 0
            r25 = 0
            r26 = -8193(0xffffffffffffdfff, float:NaN)
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r28 = r4
            r29 = r27
            r30 = r27
            r31 = r27
            r32 = r27
            r33 = r27
            r34 = r27
            r35 = r27
            r36 = r27
            r37 = r27
            r38 = r27
            r39 = r27
            X.N9P r0 = X.N9P.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            A0A(r5, r0)
        L_0x0050:
            if (r40 == 0) goto L_0x0077
            if (r4 == 0) goto L_0x0058
            r0 = 0
            A0F(r5, r3, r0)
        L_0x0058:
            X.05G r0 = r5.A0Z
            java.lang.Object r0 = r0.getValue()
            X.MfE r0 = (X.C66920MfE) r0
            boolean r0 = r0.A02
            r6 = 0
            if (r0 == 0) goto L_0x00fb
            if (r4 == 0) goto L_0x00fd
            A0G(r5, r3, r6)
        L_0x006a:
            if (r2 == 0) goto L_0x0078
            if (r4 != 0) goto L_0x007a
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            A0C(r5, r0)
        L_0x0073:
            r0 = 0
            A05(r0, r5, r3, r0, r0)
        L_0x0077:
            return
        L_0x0078:
            if (r4 == 0) goto L_0x0073
        L_0x007a:
            com.instagram.camera.effect.models.CameraAREffect r0 = r5.A03
            if (r0 != 0) goto L_0x00c4
            java.lang.Integer r1 = r5.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x00c4
            X.N9P r0 = A00(r5)
            java.util.List r0 = r0.A0I
            java.lang.Object r2 = X.00k.A0J(r0)
            com.instagram.camera.effect.models.CameraAREffect r2 = (com.instagram.camera.effect.models.CameraAREffect) r2
            if (r2 == 0) goto L_0x0117
            r0 = 0
            A05(r2, r5, r3, r0, r0)
            X.ONT r0 = r5.A0F
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0077
            X.OYo r3 = r5.A05
            if (r3 == 0) goto L_0x00b1
            r3.A03 = r6
            r1 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.OYo.A01(r3, r0)
            r0 = 10000(0x2710, float:1.4013E-41)
            X.OYo.A00(r3, r1, r0)
        L_0x00b1:
            java.util.Map r1 = r2.A0Z
            r0 = 553(0x229, float:7.75E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = r2.A0D
            if (r0 == 0) goto L_0x00e0
            return
        L_0x00c4:
            A0B(r5, r3)
            X.ONT r0 = r5.A0F
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0077
            X.OYo r3 = r5.A05
            if (r3 == 0) goto L_0x0077
            r3.A03 = r6
            r1 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.OYo.A01(r3, r0)
            r0 = 10000(0x2710, float:1.4013E-41)
            goto L_0x00f7
        L_0x00e0:
            if (r3 == 0) goto L_0x0077
            java.lang.Integer r0 = r3.A01
            if (r0 == 0) goto L_0x0077
            int r1 = r0.intValue()
            r0 = 101(0x65, float:1.42E-43)
            if (r1 >= r0) goto L_0x0077
            r0 = 1
            r3.A03 = r0
            int r0 = 101 - r1
            int r0 = r0 * 104
            int r0 = r0 / 5
        L_0x00f7:
            X.OYo.A00(r3, r1, r0)
            return
        L_0x00fb:
            if (r4 != 0) goto L_0x006a
        L_0x00fd:
            X.L54 r0 = r5.A0M
            X.L2A r0 = r0.A00
            X.0xa r1 = r0.A00
            java.lang.String r0 = "rtc_should_auto_apply_touch_up"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x006a
            r1 = 1
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            A0G(r5, r0, r1)
            goto L_0x006a
        L_0x0113:
            java.lang.Integer r3 = X.AnonymousClass05K.A15
            goto L_0x000c
        L_0x0117:
            A0B(r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69138NfJ.A0H(X.NfJ, boolean, boolean):void");
    }

    private final boolean A0J(CameraAREffect cameraAREffect, String str) {
        CameraAREffect cameraAREffect2 = cameraAREffect;
        if (cameraAREffect != null && cameraAREffect2.A0j) {
            C357658Zb r1 = this.A0E;
            if (!r1.A00()) {
                if (cameraAREffect2.A0M() && !C51966G9m.A1W(this.A0H, str)) {
                    C312716f1 r0 = r1.A00;
                    if (r0 == null) {
                        0qQ.A0F("sparkARFLMConsentManager");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C312746f6 r12 = r0.A04;
                    if (r12 == null) {
                        r12 = C312746f6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                    }
                    if (r12 == C312746f6.WITHDRAWN) {
                        OK1 ok1 = this.A0N;
                        String str2 = cameraAREffect2.A0S;
                        0qQ.A07(str2);
                        String[] strArr = {str2, JTP.A0o(cameraAREffect2.A07)};
                        ok1.A00.A02(new N9C(AnonymousClass05K.A0Q, AnonymousClass05K.A00, strArr, System.currentTimeMillis(), false));
                        this.A0R.A00(C66580MXl.A08(cameraAREffect2.A0K));
                        return true;
                    }
                }
                this.A04 = cameraAREffect2;
                A0A(this, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, A00(this), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -16777217, false, false, false, false, false, false, false, true, false, false, false, false, false));
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: com.instagram.camera.effect.models.CameraAREffect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.instagram.camera.effect.models.CameraAREffect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: com.instagram.camera.effect.models.CameraAREffect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.instagram.camera.effect.models.CameraAREffect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: com.instagram.camera.effect.models.CameraAREffect} */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r5 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011b, code lost:
        if (r1 != true) goto L_0x011d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(X.C74579PxS r18) {
        /*
            r17 = this;
            r3 = r18
            r10 = 0
            X.0qQ.A0B(r3, r10)
            boolean r0 = r3 instanceof X.C72905POp
            r11 = r17
            if (r0 == 0) goto L_0x0017
            X.POp r3 = (X.C72905POp) r3
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0016
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r11.A09 = r0
        L_0x0016:
            return
        L_0x0017:
            boolean r0 = r3 instanceof X.C72914POy
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 1
            A0G(r11, r1, r0)
            return
        L_0x0022:
            boolean r0 = r3 instanceof X.C72910POu
            r2 = 1
            if (r0 == 0) goto L_0x0033
            X.POu r3 = (X.C72910POu) r3
            X.NkI r1 = r3.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r11.A0I(r1, r0)
            return
        L_0x0033:
            boolean r0 = r3 instanceof X.C72913POx
            if (r0 == 0) goto L_0x00ed
            X.POx r3 = (X.C72913POx) r3
            X.87G r4 = r3.A00
            boolean r6 = r3.A02
            java.lang.String r7 = r3.A01
            com.instagram.camera.effect.models.CameraAREffect r5 = r4.A00()
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.87I r1 = r4.A04
            X.87I r0 = X.AnonymousClass87I.AR_EFFECT
            if (r1 != r0) goto L_0x00b3
            if (r6 == 0) goto L_0x00b0
            if (r5 == 0) goto L_0x0096
            X.LEN r8 = r11.A0L
            boolean r0 = r5.A0M()
            if (r0 == 0) goto L_0x009f
            java.util.List r1 = r8.A01
            java.util.List r0 = X.AnonymousClass7TE.A1I(r5)
            java.util.ArrayList r0 = X.00k.A0S(r1, r0)
            java.util.List r0 = X.00k.A0W(r0)
            r8.A01 = r0
        L_0x0067:
            X.OK0 r0 = r8.A00
            if (r0 == 0) goto L_0x007e
            X.NfJ r9 = r0.A00
            X.N9P r8 = A00(r9)
            X.LEN r0 = r9.A0L
            java.util.List r1 = r0.A02
            java.util.List r0 = r0.A01
            X.N9P r0 = X.N9P.A00((com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) null, (com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (X.C69378NkI) null, r8, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r1, (java.util.List) null, r0, (java.util.List) null, (java.util.List) null, 0.0f, -34, false, false, false, false, false, false, false, false, false, false, false, false, false)
            A0A(r9, r0)
        L_0x007e:
            boolean r0 = X.O2B.A00(r5)
            if (r0 != r2) goto L_0x009a
            com.instagram.common.session.UserSession r0 = r11.A0H
            java.lang.String r0 = r0.A06
            A04(r5, r11, r3, r0)
            if (r6 == 0) goto L_0x0096
            X.NkI r1 = X.C69378NkI.MULTIPEER
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r11.A0I(r1, r0)
        L_0x0096:
            A08(r4, r11)
            return
        L_0x009a:
            r0 = 0
            A05(r5, r11, r3, r0, r7)
            goto L_0x0096
        L_0x009f:
            java.util.List r1 = r8.A02
            java.util.List r0 = X.AnonymousClass7TE.A1I(r5)
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            java.util.List r0 = X.00k.A0W(r0)
            r8.A02 = r0
            goto L_0x0067
        L_0x00b0:
            if (r5 == 0) goto L_0x0096
            goto L_0x007e
        L_0x00b3:
            X.87I r0 = X.AnonymousClass87I.FILTER
            if (r1 != r0) goto L_0x00bf
            java.lang.String r0 = r4.getId()
            A0F(r11, r3, r0)
            goto L_0x0096
        L_0x00bf:
            X.87I r0 = X.AnonymousClass87I.AVATAR_PRESET
            if (r1 != r0) goto L_0x00c8
            r0 = 0
            A05(r5, r11, r3, r0, r0)
            goto L_0x0096
        L_0x00c8:
            X.87I r0 = X.AnonymousClass87I.AVATAR_EFFECT
            if (r1 == r0) goto L_0x00e9
            X.87I r0 = X.AnonymousClass87I.AVATAR_PLACEHOLDER
            if (r1 == r0) goto L_0x00e9
            X.87I r0 = X.AnonymousClass87I.AVATAR_BACKGROUND
            if (r1 == r0) goto L_0x00d8
            X.87I r0 = X.AnonymousClass87I.EMPTY_AVATAR_BACKGROUND
            if (r1 != r0) goto L_0x0096
        L_0x00d8:
            java.lang.String r1 = r4.getId()
            X.0qQ.A07(r1)
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            A0E(r11, r0, r3, r1)
            goto L_0x0096
        L_0x00e9:
            A0B(r11, r3)
            goto L_0x0096
        L_0x00ed:
            boolean r0 = r3 instanceof X.PP1
            if (r0 == 0) goto L_0x010a
            X.PP1 r3 = (X.PP1) r3
            boolean r4 = r3.A00
            boolean r2 = r3.A01
            boolean r0 = r3.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r4 != 0) goto L_0x0122
            if (r2 == 0) goto L_0x0104
            r0 = 0
            A0F(r11, r1, r0)
            return
        L_0x0104:
            if (r0 == 0) goto L_0x0016
            A0G(r11, r1, r10)
            return
        L_0x010a:
            boolean r0 = r3 instanceof X.PP0
            if (r0 == 0) goto L_0x0127
            X.N9P r0 = A00(r11)
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A05
            if (r0 == 0) goto L_0x011d
            boolean r1 = r0.A0M()
            r0 = 1
            if (r1 == r2) goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r0 == 0) goto L_0x0016
        L_0x0122:
            r0 = 0
            A05(r0, r11, r1, r0, r0)
            return
        L_0x0127:
            boolean r0 = r3 instanceof X.C72907POr
            if (r0 == 0) goto L_0x01a9
            X.POr r3 = (X.C72907POr) r3
            com.instagram.camera.effect.models.CameraAREffect r5 = r3.A00
            X.LEN r6 = r11.A0L
            X.4Cq r3 = r6.A08
            if (r3 == 0) goto L_0x013e
            r1 = 0
            X.MGf r0 = new X.MGf
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) r1, (int) r2)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x013e:
            boolean r0 = r5.A0M()
            if (r0 == 0) goto L_0x0163
            java.util.List r0 = r6.A01
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x014e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0185
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = r5.A0K
            X.DbY.A1T(r1, r0, r2, r4)
            goto L_0x014e
        L_0x0163:
            java.util.List r0 = r6.A02
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x016d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0182
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = r5.A0K
            X.DbY.A1T(r1, r0, r2, r4)
            goto L_0x016d
        L_0x0182:
            r6.A02 = r4
            goto L_0x0187
        L_0x0185:
            r6.A01 = r4
        L_0x0187:
            X.OK0 r0 = r6.A00
            if (r0 == 0) goto L_0x0016
            X.NfJ r1 = r0.A00
            X.N9P r5 = A00(r1)
            X.LEN r0 = r1.A0L
            java.util.List r6 = r0.A02
            java.util.List r7 = r0.A01
            java.util.List r8 = r0.A05
            r4 = 0
            r9 = -290(0xfffffffffffffede, float:NaN)
            X.N9P r0 = X.N9P.A00(r4, (com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (X.C69378NkI) null, r5, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r6, (java.util.List) null, r7, (java.util.List) null, r8, 0.0f, r9, false, false, false, false, false, false, false, false, false, r10, false, false, false)
            A0A(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            A05(r4, r1, r0, r4, r4)
            return
        L_0x01a9:
            boolean r0 = r3 instanceof X.C72908POs
            if (r0 == 0) goto L_0x01b5
            X.POs r3 = (X.C72908POs) r3
            boolean r0 = r3.A00
            A0H(r11, r0, r2)
            return
        L_0x01b5:
            boolean r0 = r3 instanceof X.C72909POt
            if (r0 == 0) goto L_0x021a
            X.POt r3 = (X.C72909POt) r3
            java.lang.Integer r6 = r3.A00
            X.NkI r3 = X.O2I.A00(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r6 != r0) goto L_0x01fb
            X.L54 r0 = r11.A0M
            X.L2A r0 = r0.A00
            X.0xa r4 = r0.A00
            java.lang.String r1 = "rtc_last_used_effects_tab"
            r0 = 0
            java.lang.String r8 = r4.getString(r1, r0)
            if (r8 == 0) goto L_0x01fb
            r0 = 3
            java.lang.Integer[] r7 = X.AnonymousClass05K.A00(r0)
            int r5 = r7.length
            r4 = 0
        L_0x01db:
            if (r4 >= r5) goto L_0x01fb
            r1 = r7[r4]
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x0214;
                case 2: goto L_0x0217;
                default: goto L_0x01e6;
            }
        L_0x01e6:
            java.lang.String r0 = "EFFECTS_TAB"
        L_0x01e8:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0211
            int r1 = r1.intValue()
            if (r1 == r10) goto L_0x020e
            if (r1 == r2) goto L_0x020b
            r0 = 2
            if (r1 != r0) goto L_0x03a1
            X.NkI r3 = X.C69378NkI.SOLO_BACKGROUNDS
        L_0x01fb:
            X.N9P r2 = A00(r11)
            r1 = 0
            r0 = -67141633(0xfffffffffbff7fff, float:-2.6532635E36)
            X.N9P r0 = X.N9P.A00((com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) null, (com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, r3, r2, (java.lang.Integer) null, (java.lang.Integer) null, r6, (java.lang.Integer) null, (java.lang.String) null, r1, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 0.0f, r0, false, false, false, false, false, false, false, false, false, false, false, false, false)
        L_0x0207:
            A0A(r11, r0)
            return
        L_0x020b:
            X.NkI r3 = X.C69378NkI.MULTIPEER
            goto L_0x01fb
        L_0x020e:
            X.NkI r3 = X.C69378NkI.EFFECT
            goto L_0x01fb
        L_0x0211:
            int r4 = r4 + 1
            goto L_0x01db
        L_0x0214:
            java.lang.String r0 = "GROUP_EFFECTS_TAB"
            goto L_0x01e8
        L_0x0217:
            java.lang.String r0 = "SOLO_BACKGROUNDS_TAB"
            goto L_0x01e8
        L_0x021a:
            boolean r0 = r3 instanceof X.C72911POv
            if (r0 == 0) goto L_0x0254
            X.POv r3 = (X.C72911POv) r3
            boolean r3 = r3.A00
            X.N9P r1 = A00(r11)
            r0 = -2097153(0xffffffffffdfffff, float:NaN)
            X.N9P r0 = X.N9P.A00((com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) null, (com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (X.C69378NkI) null, r1, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 0.0f, r0, false, false, false, false, false, false, false, false, false, false, false, false, false)
            A0A(r11, r0)
            if (r3 == 0) goto L_0x0016
            X.OGR r0 = r11.A07
            if (r0 == 0) goto L_0x0016
            java.lang.String r7 = r0.A02
            java.lang.Integer r3 = r0.A00
            java.lang.String r5 = r0.A01
            java.lang.String r6 = r0.A04
            java.lang.String r8 = r0.A03
            X.LEN r4 = r11.A0L
            X.0qQ.A0B(r3, r2)
            X.4Cq r0 = r4.A08
            if (r0 == 0) goto L_0x0016
            r9 = 0
            r10 = 3
            X.TTB r2 = new X.TTB
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            X.AnonymousClass7TE.A1Z(r2, r0)
            return
        L_0x0254:
            boolean r0 = r3 instanceof X.C72906POq
            if (r0 == 0) goto L_0x02d9
            X.POq r3 = (X.C72906POq) r3
            boolean r2 = r3.A00
            X.N9P r1 = A00(r11)
            r15 = 0
            r0 = -4194305(0xffffffffffbfffff, float:NaN)
            X.N9P r0 = X.N9P.A00((com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) null, (com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (X.C69378NkI) null, r1, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 0.0f, r0, false, false, false, false, false, false, false, false, false, false, false, false, false)
            A0A(r11, r0)
            if (r2 == 0) goto L_0x0016
            X.OGQ r6 = r11.A06
            if (r6 == 0) goto L_0x0016
            java.util.Set r1 = r11.A0S
            java.lang.String r0 = r6.A04
            r1.add(r0)
            java.lang.String r14 = r6.A01
            r5 = 0
            X.N9P r0 = A00(r11)
            if (r14 != 0) goto L_0x02b5
            java.util.List r0 = r0.A0H
            java.util.Iterator r7 = r0.iterator()
        L_0x0287:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r8 = r7.next()
            r0 = r8
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0K
            long r3 = X.C66580MXl.A08(r0)
            java.lang.String r0 = r6.A02
            long r1 = java.lang.Long.parseLong(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0287
        L_0x02a4:
            r5 = r8
        L_0x02a5:
            com.instagram.camera.effect.models.CameraAREffect r5 = (com.instagram.camera.effect.models.CameraAREffect) r5
            if (r5 != 0) goto L_0x03a6
            java.lang.String r13 = r6.A02
            java.lang.String r0 = r6.A03
            java.lang.Integer r12 = r6.A00
            r16 = r0
            r11.A0L(r12, r13, r14, r15, r16)
            return
        L_0x02b5:
            java.util.List r0 = r0.A0G
            java.util.Iterator r7 = r0.iterator()
        L_0x02bb:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r8 = r7.next()
            r0 = r8
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0K
            long r3 = X.C66580MXl.A08(r0)
            java.lang.String r0 = r6.A02
            long r1 = java.lang.Long.parseLong(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x02bb
            goto L_0x02a4
        L_0x02d9:
            boolean r0 = r3 instanceof X.C72915POz
            if (r0 == 0) goto L_0x0304
            X.N9P r1 = A00(r11)
            r3 = 0
            r0 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            X.N9P r0 = X.N9P.A00((com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) null, (com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (X.C69378NkI) null, r1, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 0.0f, r0, false, false, false, false, false, false, false, false, false, false, false, false, false)
            A0A(r11, r0)
            X.8Zb r0 = r11.A0E
            boolean r0 = r0.A00()
            com.instagram.camera.effect.models.CameraAREffect r1 = r11.A04
            if (r0 == 0) goto L_0x0350
            com.instagram.camera.effect.models.CameraAREffect r0 = r11.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x032e
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            A0B(r11, r0)
            return
        L_0x0304:
            boolean r0 = r3 instanceof X.C72904POo
            if (r0 == 0) goto L_0x035e
            X.POo r3 = (X.C72904POo) r3
            int r3 = r3.A00
            X.B12 r0 = r11.A02
            if (r0 == 0) goto L_0x0313
            r0.onPickerItemSelected(r3)
        L_0x0313:
            X.N9P r2 = A00(r11)
            X.N9P r0 = A00(r11)
            com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x032c
            com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration$ItemConfiguration[] r1 = r0.mItems
            com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration r0 = new com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration
            r0.<init>(r3, r1)
        L_0x0326:
            X.N9P r0 = X.N9P.A00((com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) null, r0, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (X.C69378NkI) null, r2, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 0.0f, -65537, false, false, false, false, false, false, false, false, false, false, false, false, false)
            goto L_0x0207
        L_0x032c:
            r0 = 0
            goto L_0x0326
        L_0x032e:
            com.instagram.camera.effect.models.CameraAREffect r0 = r11.A04
            if (r0 == 0) goto L_0x0346
            boolean r0 = X.O2B.A00(r0)
            if (r0 != r2) goto L_0x0346
            com.instagram.camera.effect.models.CameraAREffect r5 = r11.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.camera.effect.models.CameraAREffect"
            X.0qQ.A0C(r5, r0)
            com.instagram.common.session.UserSession r0 = r11.A0H
            java.lang.String r1 = r0.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x03aa
        L_0x0346:
            com.instagram.camera.effect.models.CameraAREffect r1 = r11.A04
            if (r1 == 0) goto L_0x0016
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            A05(r1, r11, r0, r3, r3)
            return
        L_0x0350:
            if (r1 == 0) goto L_0x0016
            X.ONG r2 = r11.A0R
            java.lang.String r0 = r1.A0K
            long r0 = X.C66580MXl.A08(r0)
            r2.A00(r0)
            return
        L_0x035e:
            boolean r0 = r3 instanceof X.C72912POw
            if (r0 == 0) goto L_0x03ae
            X.POw r3 = (X.C72912POw) r3
            float r2 = r3.A00
            boolean r1 = r3.A01
            boolean r0 = r3.A02
            if (r1 == 0) goto L_0x0376
            r11.A00 = r2
            X.B11 r0 = r11.A01
            if (r0 == 0) goto L_0x0016
            r0.onAdjustableValueChanged(r2)
            return
        L_0x0376:
            if (r0 == 0) goto L_0x0016
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r4 = X.AnonymousClass1GB.A01(r2)
            X.05G r3 = r11.A0Z
            java.lang.Object r0 = r3.getValue()
            X.MfE r0 = (X.C66920MfE) r0
            boolean r2 = r0.A02
            r1 = 5
            X.MfE r0 = new X.MfE
            r0.<init>((int) r4, (boolean) r2, (int) r1)
            r3.FIA(r0)
            X.ONG r2 = r11.A0R
            boolean r1 = r0.A02
            int r0 = r0.A01
            r2.A02(r1, r0)
            X.OKv r0 = r11.A0P
            r0.A00(r4)
            return
        L_0x03a1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03a6:
            java.lang.String r1 = r6.A03
            java.lang.Integer r0 = r6.A00
        L_0x03aa:
            A04(r5, r11, r0, r1)
            return
        L_0x03ae:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69138NfJ.A0K(X.PxS):void");
    }

    private final void A02() {
        CameraAREffect cameraAREffect = A00(this).A06;
        if (cameraAREffect != null) {
            C71143Odx.A04(this.A0R.A00.A0Z, new GQ2(C66580MXl.A08(cameraAREffect.A0K), 13));
        }
    }

    public static final void A0D(C69138NfJ nfJ, Integer num) {
        A0A(nfJ, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, A00(nfJ), (Integer) null, num, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -17, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }

    private final void A0I(C69378NkI nkI, Boolean bool) {
        Integer num;
        String str;
        A0A(this, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, nkI, A00(this), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -32769, false, false, false, false, false, false, false, false, false, false, false, false, false));
        if (bool.equals(AnonymousClass7TE.A0v())) {
            L54 l54 = this.A0M;
            int ordinal = nkI.ordinal();
            if (ordinal == 0) {
                num = AnonymousClass05K.A00;
            } else if (ordinal == 2) {
                num = AnonymousClass05K.A01;
            } else if (ordinal == 3) {
                num = AnonymousClass05K.A0C;
            } else {
                return;
            }
            L2A l2a = l54.A00;
            switch (num.intValue()) {
                case 0:
                    str = "EFFECTS_TAB";
                    break;
                case 1:
                    str = "GROUP_EFFECTS_TAB";
                    break;
                default:
                    str = "SOLO_BACKGROUNDS_TAB";
                    break;
            }
            0xY AR4 = l2a.A00.AR4();
            AR4.E5g("rtc_last_used_effects_tab", str);
            AR4.apply();
        }
    }
}
