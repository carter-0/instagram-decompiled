package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;

/* renamed from: X.UdB  reason: case insensitive filesystem */
public final class C15460UdB extends C331047Ph implements C231302rO {
    public V3V A00;
    public VNC A01;
    public final VOS A02;
    public final Context A03;
    public final AnonymousClass2s2 A04;
    public final UserSession A05;
    public final C14338TuL A06 = new C14338TuL();
    public final C15519Ue8 A07;
    public final C15568Uew A08;
    public final C15570Uey A09;
    public final C15260UXv A0A;
    public final C47625EAl A0B;
    public final NLP A0C;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.V3V] */
    /* JADX WARNING: type inference failed for: r11v0, types: [X.2s0, X.2s2, java.lang.Object] */
    public C15460UdB(Context context, AnonymousClass0iw r19, UserSession userSession, C15260UXv uXv, VOS vos, C18420VrP vrP) {
        C295745oq r0;
        Context context2 = context;
        this.A03 = context2;
        UserSession userSession2 = userSession;
        this.A05 = userSession2;
        C15260UXv uXv2 = uXv;
        this.A0A = uXv2;
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = uXv2.A01;
        ? obj = new Object();
        obj.A00 = locationPageInfoPageOperationHourResponse;
        obj.A01 = false;
        this.A00 = obj;
        this.A02 = vos;
        ? obj2 = new Object();
        this.A04 = obj2;
        C15568Uew uew = new C15568Uew(context2, new VOR(this));
        this.A08 = uew;
        C15519Ue8 ue8 = new C15519Ue8(context2, new WBA((Object) this, 51));
        this.A07 = ue8;
        C47625EAl eAl = new C47625EAl(context2);
        this.A0B = eAl;
        C17362VSp vSp = uXv2.A00;
        if (!(vSp == null || (r0 = vSp.A00) == null)) {
            this.A01 = C16939VBr.A00(r0);
        }
        C15570Uey uey = new C15570Uey(context2, r19, userSession2, new VNA(), new VOQ(this), vrP);
        this.A09 = uey;
        NLP nlp = new NLP(context2);
        this.A0C = nlp;
        A0B(obj2, uew, ue8, eAl, uey, nlp);
    }

    public final void EZ4(int i) {
        this.A04.A03 = i;
        A0C();
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Object, X.V3U] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r2.A01 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r8 = this;
            r8.A06()
            X.2s2 r1 = r8.A04
            r0 = 0
            r8.A08(r1, r0)
            X.UXv r5 = r8.A0A
            X.VSp r2 = r5.A00
            if (r2 == 0) goto L_0x0014
            com.instagram.user.model.User r1 = r2.A01
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0043
            X.VNC r6 = r8.A01
            com.instagram.user.model.User r0 = r2.A01
            X.V3U r3 = new X.V3U
            r3.<init>()
            r3.A00 = r6
            r3.A01 = r0
            X.6u8 r1 = new X.6u8
            r1.<init>()
            if (r6 == 0) goto L_0x003e
            X.TuL r2 = r8.A06
            X.71g r0 = r6.A00
            java.lang.String r1 = X.AnonymousClass7TF.A0h(r0)
            java.util.Map r0 = r2.A00
            X.6u8 r1 = X.C13991Tnr.A0P(r1, r0)
            r1.A00(r7, r4)
        L_0x003e:
            X.Uey r0 = r8.A09
            r8.A09(r0, r3, r1)
        L_0x0043:
            java.lang.String r0 = r5.A05
            boolean r0 = X.C13990Tnq.A1a(r0)
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = r5.A05
            java.lang.String r6 = r0.trim()
            java.lang.String r3 = "\n"
            java.lang.String r2 = r5.A07
            java.lang.String r1 = " "
            java.lang.String r0 = r5.A0B
            java.lang.String r3 = X.002.A11(r6, r3, r2, r1, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            android.content.Context r1 = r8.A03
            r0 = 2131952470(0x7f130356, float:1.9541384E38)
            java.lang.String r0 = r1.getString(r0)
            X.VYA r1 = new X.VYA
            r1.<init>(r3, r2, r0, r4)
            X.Uew r0 = r8.A08
            r8.A08(r0, r1)
        L_0x0072:
            java.lang.String r0 = r5.A06
            boolean r0 = X.C13990Tnq.A1a(r0)
            if (r0 == 0) goto L_0x00a3
            X.DhA r1 = X.C46568DhA.WITH_LEFT_RIGHT_PADDING
            X.EAl r0 = r8.A0B
            r8.A08(r0, r1)
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            android.content.Context r0 = r8.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131954815(0x7f130c7f, float:1.954614E38)
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r2 = r5.A06
            java.lang.String r1 = ""
            X.0eM r0 = X.0mp.A09
            if (r2 != 0) goto L_0x0099
            r2 = r1
        L_0x0099:
            X.VYA r1 = new X.VYA
            r1.<init>(r2, r6, r3, r7)
            X.Uew r0 = r8.A08
            r8.A08(r0, r1)
        L_0x00a3:
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r0 = r5.A01
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bd
            X.DhA r1 = X.C46568DhA.WITH_LEFT_RIGHT_PADDING
            X.EAl r0 = r8.A0B
            r8.A08(r0, r1)
            X.V3V r1 = r8.A00
            X.Ue8 r0 = r8.A07
            r8.A08(r0, r1)
        L_0x00bd:
            java.lang.Integer r0 = r5.A03
            if (r0 == 0) goto L_0x00f3
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x00f3
            X.DhA r1 = X.C46568DhA.WITH_LEFT_RIGHT_PADDING
            X.EAl r0 = r8.A0B
            r8.A08(r0, r1)
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            android.content.Context r3 = r8.A03
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131969737(0x7f1346c9, float:1.9576405E38)
            java.lang.String r2 = r1.getString(r0)
            com.instagram.common.session.UserSession r1 = r8.A05
            java.lang.Integer r0 = r5.A03
            int r0 = X.C13988Tno.A0D(r0)
            android.text.SpannableString r0 = X.C18792W1y.A00(r3, r1, r0)
            X.VYA r1 = new X.VYA
            r1.<init>(r0, r6, r2, r7)
            X.Uew r0 = r8.A08
            r8.A08(r0, r1)
        L_0x00f3:
            java.lang.String r0 = r5.A0A
            boolean r0 = X.C13990Tnq.A1a(r0)
            if (r0 == 0) goto L_0x0124
            X.DhA r1 = X.C46568DhA.WITH_LEFT_RIGHT_PADDING
            X.EAl r0 = r8.A0B
            r8.A08(r0, r1)
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            android.content.Context r0 = r8.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131976824(0x7f136278, float:1.959078E38)
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = r5.A0A
            r0.getClass()
            java.lang.String r0 = r0.trim()
            X.VYA r1 = new X.VYA
            r1.<init>(r0, r3, r2, r4)
            X.Uew r0 = r8.A08
            r8.A08(r0, r1)
        L_0x0124:
            java.lang.String r0 = r5.A09
            boolean r0 = X.C13990Tnq.A1a(r0)
            if (r0 == 0) goto L_0x0155
            X.DhA r1 = X.C46568DhA.WITH_LEFT_RIGHT_PADDING
            X.EAl r0 = r8.A0B
            r8.A08(r0, r1)
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            android.content.Context r0 = r8.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131954428(0x7f130afc, float:1.9545355E38)
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = r5.A09
            r0.getClass()
            java.lang.String r0 = r0.trim()
            X.VYA r1 = new X.VYA
            r1.<init>(r0, r3, r2, r4)
            X.Uew r0 = r8.A08
            r8.A08(r0, r1)
        L_0x0155:
            r8.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15460UdB.A0C():void");
    }
}
