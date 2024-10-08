package X;

import android.content.Context;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ONj  reason: case insensitive filesystem */
public final class C70837ONj {
    public Integer A00;
    public final Context A01;
    public final UserSession A02;
    public final C74311Psn A03;
    public final O66 A04;
    public final ODT A05;
    public final C242373Tu A06;
    public final C272964li A07;
    public final String A08;
    public final List A09 = AnonymousClass7TE.A1C();
    public final boolean A0A;
    public final boolean A0B;

    public /* synthetic */ C70837ONj(Context context, UserSession userSession, C74311Psn psn, ODT odt, C242373Tu r7, C272964li r8, String str, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        O66 o66 = (O66) userSession.A01(O66.class, new C41655Ay7(userSession, 33));
        AnonymousClass7TF.A1G(str, 3, o66);
        this.A02 = userSession;
        this.A01 = context;
        this.A08 = str;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = odt;
        this.A0A = z;
        this.A0B = z2;
        this.A04 = o66;
        this.A03 = psn;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A[LOOP:1: B:55:0x0113->B:58:0x0121, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(boolean r15, boolean r16) {
        /*
            r14 = this;
            r6 = -1
            r3 = 0
            X.4li r2 = r14.A07
            if (r15 == 0) goto L_0x014d
            if (r2 == 0) goto L_0x014a
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x014a
            int r0 = r0.intValue()
        L_0x0010:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L_0x0147
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x0147
            int r0 = r0.intValue()
        L_0x001e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0022:
            r5 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0033
            int r2 = r1.intValue()
            boolean r1 = X.C51970G9q.A1W(r2, r6)
            X.ODT r3 = new X.ODT
            r3.<init>(r0, r2, r1)
        L_0x0033:
            android.content.Context r8 = r14.A01
            com.instagram.common.session.UserSession r10 = r14.A02
            X.3Tu r1 = r14.A06
            boolean r0 = r14.A0A
            if (r0 == 0) goto L_0x0141
            java.util.List r7 = X.C71103Och.A01(r10)
        L_0x0041:
            if (r3 == 0) goto L_0x006f
            int r9 = r3.A01
            if (r9 > r6) goto L_0x004b
            int r0 = r3.A00
            if (r0 > r6) goto L_0x004d
        L_0x004b:
            if (r9 <= r6) goto L_0x006f
        L_0x004d:
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0125
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0125
        L_0x0057:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r3)
            java.util.ArrayList r0 = X.00k.A0S(r0, r7)
            java.util.List r3 = X.00k.A0X(r0)
            X.Pqe r2 = X.C74198Pqe.A00
            r1 = 4
            X.PcS r0 = new X.PcS
            r0.<init>((X.0sL) r2, (int) r1)
            java.util.List r7 = X.00k.A0g(r3, r0)
        L_0x006f:
            r9 = 2
            X.0qQ.A0B(r7, r9)
            android.content.res.Resources r3 = r8.getResources()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L_0x010f
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x010f
        L_0x0085:
            if (r15 == 0) goto L_0x00a2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            X.ODT r0 = new X.ODT
            r0.<init>(r1, r6, r5)
            int r1 = r0.A01
            r0 = 58
            java.lang.String r1 = X.002.A01(r0, r1, r6)
            r0 = 2131960947(0x7f132473, float:1.9558577E38)
            java.lang.String r0 = r3.getString(r0)
            X.DbV.A1V(r1, r0, r8)
        L_0x00a2:
            java.util.Iterator r13 = r7.iterator()
        L_0x00a6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0159
            java.lang.Object r0 = r13.next()
            X.ODT r0 = (X.ODT) r0
            int r7 = r0.A01
            int r11 = r0.A00
            r0 = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            if (r7 <= r6) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r0 = r7
        L_0x00c0:
            java.lang.Integer r1 = X.C71103Och.A00(r10, r0)
            int r1 = r1.intValue()
            if (r1 == r5) goto L_0x010a
            if (r1 == r4) goto L_0x00ff
            if (r1 == r9) goto L_0x00f4
            r2 = 2131821017(0x7f1101d9, float:1.9274765E38)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r0
            long r0 = r12.toDays(r0)
        L_0x00d8:
            if (r7 != 0) goto L_0x00ee
            r0 = 2131960946(0x7f132472, float:1.9558575E38)
            java.lang.String r1 = r3.getString(r0)
        L_0x00e1:
            X.0qQ.A0A(r1)
            r0 = 58
            java.lang.String r0 = X.002.A01(r0, r7, r11)
            X.DbV.A1V(r0, r1, r8)
            goto L_0x00a6
        L_0x00ee:
            int r12 = (int) r0
            java.lang.String r1 = X.DbY.A0d(r3, r12, r2)
            goto L_0x00e1
        L_0x00f4:
            r2 = 2131821020(0x7f1101dc, float:1.9274771E38)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r0
            long r0 = r12.toHours(r0)
            goto L_0x00d8
        L_0x00ff:
            r2 = 2131821023(0x7f1101df, float:1.9274777E38)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r0
            long r0 = r12.toMinutes(r0)
            goto L_0x00d8
        L_0x010a:
            r2 = 2131821031(0x7f1101e7, float:1.9274794E38)
            long r0 = (long) r0
            goto L_0x00d8
        L_0x010f:
            java.util.Iterator r1 = r7.iterator()
        L_0x0113:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r1.next()
            X.ODT r0 = (X.ODT) r0
            int r0 = r0.A01
            if (r0 == r6) goto L_0x0113
            goto L_0x0085
        L_0x0125:
            java.util.Iterator r11 = r7.iterator()
        L_0x0129:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r2 = r11.next()
            X.ODT r2 = (X.ODT) r2
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0129
            int r0 = r2.A01
            if (r0 != r9) goto L_0x0129
            goto L_0x006f
        L_0x0141:
            java.util.List r7 = X.C71103Och.A02(r10, r1)
            goto L_0x0041
        L_0x0147:
            r0 = -1
            goto L_0x001e
        L_0x014a:
            r0 = -1
            goto L_0x0010
        L_0x014d:
            if (r2 == 0) goto L_0x0155
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = r2.A03
            goto L_0x0022
        L_0x0155:
            r1 = r3
            r0 = r3
            goto L_0x0022
        L_0x0159:
            java.util.List r6 = X.00k.A0a(r8)
            X.ODT r3 = r14.A05
            int r2 = r3.A01
            r1 = 58
            int r0 = r3.A00
            java.lang.String r2 = X.002.A01(r1, r2, r0)
            X.OlH r0 = new X.OlH
            r0.<init>(r4, r14, r6)
            X.OTj r1 = new X.OTj
            r1.<init>(r0, r2, r6, r4)
            if (r16 != 0) goto L_0x0179
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x017a
        L_0x0179:
            r5 = 1
        L_0x017a:
            r1.A03 = r5
            r1.A02 = r5
            java.util.List r0 = r14.A09
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70837ONj.A02(boolean, boolean):void");
    }

    public final void A00(int i) {
        boolean z;
        int i2;
        Integer valueOf;
        ODT odt = this.A05;
        int i3 = odt.A00;
        if (i3 != -1) {
            z = true;
        } else {
            z = false;
            i3 = C308556Us.A00(this.A02, this.A06);
        }
        if (!this.A0A) {
            valueOf = null;
        } else {
            if (z) {
                i2 = odt.A01;
            } else {
                i2 = 86400;
            }
            valueOf = Integer.valueOf(i2);
        }
        this.A09.add(new PR9((CompoundButton.OnCheckedChangeListener) new C71461Ol2(this, valueOf, i3), i, odt.A02));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (X.C331057Pi.A02(r3) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r7, int r8) {
        /*
            r6 = this;
            r0 = 2131960966(0x7f132486, float:1.9558616E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r7, r0)
            X.O66 r5 = r6.A04
            X.3Tu r3 = r6.A06
            com.instagram.common.session.UserSession r1 = r6.A02
            boolean r0 = r6.A0B
            boolean r0 = X.C308556Us.A0L(r1, r3, r0)
            if (r0 != 0) goto L_0x001c
            boolean r0 = X.C331057Pi.A02(r3)
            r2 = 0
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            com.instagram.common.session.UserSession r1 = r5.A00
            boolean r0 = X.C308556Us.A0E(r1, r3)
            if (r0 == 0) goto L_0x0052
            if (r2 == 0) goto L_0x004f
            java.lang.String r2 = "https://help.instagram.com/1542029589953210"
        L_0x0029:
            java.lang.String r1 = " <a href=\"%s\">"
            java.lang.String r0 = "</a>"
            java.lang.String r0 = X.002.A0g(r1, r4, r0)
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r2)
            java.lang.String r0 = X.DbW.A0h(r7, r0, r8)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = ""
        L_0x003d:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            X.0qQ.A07(r0)
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r0)
            java.util.List r0 = r6.A09
            r0.add(r1)
            return
        L_0x004f:
            java.lang.String r2 = "https://help.instagram.com/708011878194232"
            goto L_0x0029
        L_0x0052:
            boolean r0 = X.C308556Us.A0F(r1, r3)
            if (r0 == 0) goto L_0x0060
            if (r2 == 0) goto L_0x005d
            java.lang.String r2 = "https://help.instagram.com/357971383742482"
            goto L_0x0029
        L_0x005d:
            java.lang.String r2 = "https://help.instagram.com/388729843706740"
            goto L_0x0029
        L_0x0060:
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = "https://help.instagram.com/222917327258991"
            goto L_0x0029
        L_0x0065:
            java.lang.String r2 = "https://help.instagram.com/207402298436653"
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70837ONj.A01(android.content.Context, int):void");
    }
}
