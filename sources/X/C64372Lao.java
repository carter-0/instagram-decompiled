package X;

import android.app.Dialog;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lao  reason: case insensitive filesystem */
public final class C64372Lao implements CallerContextable {
    public static final CallerContext A0Q = CallerContext.A01(__redex_internal_original_name);
    public static final String __redex_internal_original_name = "StorySharingOptionsDialogController";
    public Dialog A00;
    public String A01;
    public boolean A02;
    public final AnonymousClass818 A03;
    public final AnonymousClass4DH A04;
    public final EtG A05 = new Object();
    public final UserSession A06;
    public final C299935wF A07;
    public final C255773uh A08;
    public final C311316cU A09;
    public final CharSequence A0A;
    public final CharSequence A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final boolean A0O;
    public final boolean A0P;

    public static final void A00(JZY jzy, C64372Lao lao) {
        AnonymousClass818 r6 = lao.A03;
        if (r6 != null) {
            UserSession userSession = lao.A06;
            JZZ jzz = JZZ.STORY;
            0bb r3 = new 0bb();
            int ordinal = jzy.ordinal();
            boolean z = true;
            if (!(ordinal == 2 || ordinal == 4)) {
                z = (ordinal == 3 || ordinal == 5) ? false : lao.A0O;
            }
            r3.A03("is_xpost_enabled", Boolean.valueOf(z));
            JZX.A00(jzy, jzz, r6, r3, userSession);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r11 = this;
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            java.lang.Integer r4 = r11.A0C
            X.4DH r3 = r11.A04
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131961930(0x7f13284a, float:1.956057E38)
            if (r6 != r4) goto L_0x0012
            r0 = 2131961931(0x7f13284b, float:1.9560573E38)
        L_0x0012:
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A0A(r0)
            X.8ab r2 = X.DbW.A0U(r3)
            r2.A05 = r0
            boolean r8 = r11.A0O
            if (r8 == 0) goto L_0x0182
            java.lang.CharSequence r0 = r11.A0B
        L_0x0025:
            r2.A0q(r0)
            com.instagram.common.session.UserSession r1 = r11.A06
            r2.A0l(r3, r1)
            X.Dba.A1M(r2)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.5wF r0 = r11.A07
            java.lang.String r0 = r0.A04
            int r10 = r0.length()
            if (r10 <= 0) goto L_0x014e
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L_0x014e
            boolean r0 = X.C363038ix.A02(r1)
            if (r0 != 0) goto L_0x014e
            boolean r5 = r11.A0P
            if (r8 == 0) goto L_0x013d
            if (r5 == 0) goto L_0x0139
            java.lang.String r0 = r11.A0G
        L_0x0050:
            r3.add(r0)
        L_0x0053:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r0 != r4) goto L_0x005c
            java.lang.String r0 = r11.A0D
        L_0x0059:
            r3.add(r0)
        L_0x005c:
            int r0 = r3.size()
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            java.lang.Object[] r7 = r3.toArray(r0)
            X.0qQ.A07(r7)
            java.lang.CharSequence[] r7 = (java.lang.CharSequence[]) r7
            if (r10 != 0) goto L_0x007c
            X.8sM r6 = X.C368278sM.SUPPRESS
            java.lang.String r4 = "empty_name"
            X.818 r3 = r11.A03
            if (r3 == 0) goto L_0x007c
            X.819 r0 = X.A1F.A00(r5, r8)
            X.JTS.A1H(r3, r6, r0, r1, r4)
        L_0x007c:
            java.lang.String r6 = r11.A01
            if (r6 != 0) goto L_0x008f
            X.8sM r9 = X.C368278sM.SUPPRESS
            java.lang.String r4 = "empty_audience"
            X.818 r3 = r11.A03
            if (r3 == 0) goto L_0x008f
            X.819 r0 = X.A1F.A00(r5, r8)
            X.JTS.A1H(r3, r9, r0, r1, r4)
        L_0x008f:
            int r5 = r7.length
            r4 = 0
        L_0x0091:
            if (r4 >= r5) goto L_0x0186
            r3 = r7[r4]
            java.lang.String r3 = (java.lang.String) r3
            if (r10 <= 0) goto L_0x00e6
            if (r6 == 0) goto L_0x00e6
            boolean r0 = X.C363038ix.A02(r1)
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = r11.A0J
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = r11.A0G
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = r11.A0N
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = r11.A0M
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = r11.A0D
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x00d2
            r0 = 40
        L_0x00cb:
            X.LV2 r0 = X.LV2.A00(r11, r0)
            r2.A0b(r0, r3)
        L_0x00d2:
            int r4 = r4 + 1
            goto L_0x0091
        L_0x00d5:
            r0 = 39
            X.LV2 r8 = X.LV2.A00(r11, r0)
            goto L_0x0128
        L_0x00dc:
            r0 = 38
            X.LV2 r0 = X.LV2.A00(r11, r0)
            r2.A0d(r0, r3)
            goto L_0x00d2
        L_0x00e6:
            java.lang.String r0 = r11.A0H
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = r11.A0I
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = r11.A0N
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = r11.A0K
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = r11.A0F
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = r11.A0L
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = r11.A0E
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x00d2
            r0 = 41
            goto L_0x00cb
        L_0x0121:
            r0 = 10
            X.LV1 r8 = new X.LV1
            r8.<init>((java.lang.String) r3, (java.lang.Object) r11, (int) r0)
        L_0x0128:
            android.content.DialogInterface$OnClickListener r8 = (android.content.DialogInterface.OnClickListener) r8
            r2.A0c(r8, r3)
            goto L_0x00d2
        L_0x012e:
            r8 = 9
            X.LV1 r0 = new X.LV1
            r0.<init>((java.lang.String) r3, (java.lang.Object) r11, (int) r8)
            r2.A0a(r0, r3)
            goto L_0x00d2
        L_0x0139:
            java.lang.String r0 = r11.A0J
            goto L_0x0050
        L_0x013d:
            if (r5 == 0) goto L_0x0143
            java.lang.String r0 = r11.A0M
            goto L_0x0050
        L_0x0143:
            java.lang.String r0 = r11.A0N
            r3.add(r0)
            if (r6 != r4) goto L_0x0053
            java.lang.String r0 = r11.A0D
            goto L_0x0050
        L_0x014e:
            boolean r5 = r11.A0P
            if (r8 == 0) goto L_0x0169
            if (r5 == 0) goto L_0x0166
            java.lang.String r0 = r11.A0H
            r3.add(r0)
            java.lang.String r0 = r11.A0F
        L_0x015b:
            r3.add(r0)
        L_0x015e:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r0 != r4) goto L_0x005c
            java.lang.String r0 = r11.A0E
            goto L_0x0059
        L_0x0166:
            java.lang.String r0 = r11.A0I
            goto L_0x015b
        L_0x0169:
            if (r5 == 0) goto L_0x0173
            java.lang.String r0 = r11.A0H
            r3.add(r0)
            java.lang.String r0 = r11.A0L
            goto L_0x015b
        L_0x0173:
            java.lang.String r0 = r11.A0K
            r3.add(r0)
            java.lang.String r0 = r11.A0N
            r3.add(r0)
            if (r6 != r4) goto L_0x015e
            java.lang.String r0 = r11.A0E
            goto L_0x015b
        L_0x0182:
            java.lang.CharSequence r0 = r11.A0A
            goto L_0x0025
        L_0x0186:
            android.app.Dialog r0 = r2.A02()
            r11.A00 = r0
            X.0qQ.A0A(r0)
            X.AnonymousClass0fN.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64372Lao.A01():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.EtG] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C64372Lao(X.AnonymousClass818 r7, X.AnonymousClass4DH r8, com.instagram.common.session.UserSession r9, X.C255773uh r10, X.C311316cU r11, java.lang.Integer r12, boolean r13, boolean r14) {
        /*
            r6 = this;
            X.AnonymousClass7TG.A1U(r8, r9, r11)
            r6.<init>()
            r6.A04 = r8
            r6.A06 = r9
            r6.A09 = r11
            r6.A0C = r12
            r6.A0P = r13
            r6.A0O = r14
            r6.A08 = r10
            r6.A03 = r7
            android.content.res.Resources r2 = X.JTR.A0R(r8)
            X.EtG r0 = new X.EtG
            r0.<init>()
            r6.A05 = r0
            X.8jd r1 = X.C363388je.A00(r9)
            com.facebook.common.callercontext.CallerContext r0 = A0Q
            X.5wF r1 = r1.A00(r0)
            r6.A07 = r1
            boolean r0 = X.C363388je.A02(r1)
            r6.A02 = r0
            android.content.Context r0 = r8.getContext()
            java.lang.String r5 = X.C367158qH.A00(r0, r9, r1)
            r6.A01 = r5
            X.5wF r0 = r6.A07
            java.lang.String r4 = r0.A04
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x018f
            if (r5 == 0) goto L_0x018f
            com.instagram.common.session.UserSession r3 = r6.A06
            boolean r0 = X.C363038ix.A02(r3)
            if (r0 != 0) goto L_0x018f
            boolean r1 = r6.A0P
            boolean r0 = r6.A02
            if (r1 == 0) goto L_0x0161
            if (r0 == 0) goto L_0x0179
            r1 = 2131961922(0x7f132842, float:1.9560555E38)
        L_0x005c:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
        L_0x0060:
            android.text.Spanned r4 = X.0bC.A00(r2, r0, r1)
            X.4DH r0 = r6.A04
            android.content.Context r1 = r0.requireContext()
            r0 = 2131961909(0x7f132835, float:1.9560528E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 11
            X.Dj8 r1 = new X.Dj8
            r1.<init>(r6, r0)
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r4)
            X.AnonymousClass7AV.A05(r0, r1, r3)
        L_0x007f:
            r6.A0B = r0
            X.5wF r0 = r6.A07
            java.lang.String r4 = r0.A04
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0156
            java.lang.String r3 = r6.A01
            if (r3 == 0) goto L_0x0140
            com.instagram.common.session.UserSession r1 = r6.A06
            boolean r0 = X.C363038ix.A02(r1)
            if (r0 != 0) goto L_0x0140
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x012a
            r1 = 2131961921(0x7f132841, float:1.9560553E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
        L_0x00a2:
            android.text.Spanned r4 = X.0bC.A00(r2, r0, r1)
            X.0qQ.A0A(r4)
            X.4DH r0 = r6.A04
            android.content.Context r1 = r0.requireContext()
            r0 = 2131961909(0x7f132835, float:1.9560528E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 11
            X.Dj8 r1 = new X.Dj8
            r1.<init>(r6, r0)
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r4)
            X.AnonymousClass7AV.A05(r0, r1, r3)
        L_0x00c4:
            r6.A0A = r0
            r0 = 2131961918(0x7f13283e, float:1.9560546E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0K = r0
            r0 = 2131961919(0x7f13283f, float:1.9560549E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0N = r0
            r0 = 2131961920(0x7f132840, float:1.956055E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0L = r0
            r0 = 2131961930(0x7f13284a, float:1.956057E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0M = r0
            r0 = 2131961914(0x7f13283a, float:1.9560538E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0H = r0
            r0 = 2131961915(0x7f13283b, float:1.956054E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0F = r0
            r0 = 2131961933(0x7f13284d, float:1.9560577E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0G = r0
            r0 = 2131961916(0x7f13283c, float:1.9560542E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0I = r0
            r0 = 2131961917(0x7f13283d, float:1.9560544E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0J = r0
            r0 = 2131968513(0x7f134201, float:1.9573923E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0E = r0
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0D = r0
            return
        L_0x012a:
            X.27y r0 = X.27u.A00(r1)
            boolean r0 = r0.A01()
            r1 = 2131961924(0x7f132844, float:1.9560559E38)
            if (r0 == 0) goto L_0x013a
            r1 = 2131961927(0x7f132847, float:1.9560565E38)
        L_0x013a:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r3}
            goto L_0x00a2
        L_0x0140:
            boolean r0 = r6.A02
            r1 = 2131961912(0x7f132838, float:1.9560534E38)
            if (r0 == 0) goto L_0x014a
            r1 = 2131961911(0x7f132837, float:1.9560532E38)
        L_0x014a:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            android.text.Spanned r0 = X.0bC.A00(r2, r0, r1)
            X.0qQ.A0A(r0)
            goto L_0x015d
        L_0x0156:
            r0 = 2131961910(0x7f132836, float:1.956053E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r2, r0)
        L_0x015d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x00c4
        L_0x0161:
            if (r0 == 0) goto L_0x0168
            r1 = 2131961923(0x7f132843, float:1.9560557E38)
            goto L_0x005c
        L_0x0168:
            X.27y r0 = X.27u.A00(r3)
            boolean r0 = r0.A01()
            r1 = 2131961926(0x7f132846, float:1.9560563E38)
            if (r0 == 0) goto L_0x0189
            r1 = 2131961929(0x7f132849, float:1.9560569E38)
            goto L_0x0189
        L_0x0179:
            X.27y r0 = X.27u.A00(r3)
            boolean r0 = r0.A01()
            r1 = 2131961925(0x7f132845, float:1.956056E38)
            if (r0 == 0) goto L_0x0189
            r1 = 2131961928(0x7f132848, float:1.9560567E38)
        L_0x0189:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5}
            goto L_0x0060
        L_0x018f:
            r0 = 2131961913(0x7f132839, float:1.9560536E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r2, r0)
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64372Lao.<init>(X.818, X.4DH, com.instagram.common.session.UserSession, X.3uh, X.6cU, java.lang.Integer, boolean, boolean):void");
    }
}
