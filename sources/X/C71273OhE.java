package X;

import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: X.OhE  reason: case insensitive filesystem */
public final class C71273OhE implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public C71273OhE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new C71273OhE(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0243, code lost:
        r1 = r4.A01;
        r0 = r4.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0247, code lost:
        if (r0 != null) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0249, code lost:
        r0 = "currentTabAsString";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x024d, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x024f, code lost:
        r4 = X.AnonymousClass79B.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0258, code lost:
        if (X.AnonymousClass48O.A01(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x025a, code lost:
        ((X.C70846ONz) r2.A05.getValue()).A04(r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0265, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0266, code lost:
        r4 = (X.C68449NIn) r8.A01;
        r0 = r4.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x026c, code lost:
        if (r0 == null) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x026e, code lost:
        X.C68449NIn.A05(r9, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0273, code lost:
        if (r4.A0z == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0275, code lost:
        r3 = java.lang.String.valueOf(r9);
        r0 = r4.A0p;
        r2 = X.DbX.A05(r0);
        r1 = X.DbX.A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0287, code lost:
        if (X.0qQ.A0K(r0, r3) != false) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x028b, code lost:
        if ((r2 - r1) != 1) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x028d, code lost:
        r0 = r4.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x028f, code lost:
        if (r0 == null) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0291, code lost:
        r0.getText().clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0298, code lost:
        r4.A0z = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r9 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x029b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x029c, code lost:
        X.0qQ.A0B(r9, 0);
        r3 = (X.C66906Mep) r8.A01;
        X.C66906Mep.A05(r3);
        r1 = !X.00l.A0W(r9);
        r0 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02b0, code lost:
        if (r1 == false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b2, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02b4, code lost:
        r0.A00(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02b8, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ba, code lost:
        r0.A00(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02be, code lost:
        if (r9 != null) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r6 = r9.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c0, code lost:
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c2, code lost:
        r9 = r9;
        X.0qQ.A0C(r9, "null cannot be cast to non-null type android.text.Editable");
        X.C3269778w.A00((android.text.Editable) r9);
        X.NJ4.A00((X.NJ4) r8.A01, r9.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02db, code lost:
        X.0qQ.A0B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e3, code lost:
        if (X.00l.A0W(r9) == false) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e5, code lost:
        r9.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e8, code lost:
        r4 = (X.P1C) r8.A01;
        r3 = r4.A09;
        r2 = r4.A02.getResources();
        r1 = X.00l.A0W(r9);
        r0 = com.instagram.android.R.integer.composer_max_lines;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02fb, code lost:
        if (r1 == false) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02fd, code lost:
        r0 = com.instagram.android.R.integer.direct_composer_hint_max_lines;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0300, code lost:
        r3.setMaxLines(r2.getInteger(r0));
        r2 = r4.A03;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r6 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0316, code lost:
        if (X.DbV.A12(r9.toString()).length() != 0) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0318, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x031a, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x031d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x031e, code lost:
        X.0qQ.A0B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0326, code lost:
        if (X.00l.A0W(r9) == false) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0328, code lost:
        r9.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x032b, code lost:
        r2 = (X.P1D) r8.A01;
        r5 = X.JTQ.A0A(r2.A0C);
        r4 = r2.A03.getResources();
        r1 = X.00l.A0W(r9);
        r0 = com.instagram.android.R.integer.composer_max_lines;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0342, code lost:
        if (r1 == false) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0344, code lost:
        r0 = com.instagram.android.R.integer.direct_composer_hint_max_lines;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0347, code lost:
        r5.setMaxLines(r4.getInteger(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x035a, code lost:
        if (X.DbV.A12(r9.toString()).length() != 0) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x035c, code lost:
        X.AnonymousClass7TH.A06(r2.A0F).animate().withStartAction(new X.PVA(r2)).withEndAction(new X.PVB(r2)).alpha(0.6f).setDuration(400).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0388, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0389, code lost:
        X.AnonymousClass7TH.A06(r2.A0G).setVisibility(8);
        X.JTS.A1W(r2.A0D, 8);
        X.JTS.A1W(r2.A0A, 8);
        X.JTS.A1W(r2.A0F, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a4, code lost:
        r5 = java.lang.String.valueOf(r9);
        X.0qQ.A0B(r5, 0);
        r4 = ((X.C67722Mtb) ((X.NIO) r8.A01).A04.getValue()).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03ba, code lost:
        r3 = r4.getValue();
        r2 = X.C69373NkD.A06;
        r1 = (java.util.List) ((X.C61079JwH) r3).A00;
        X.0qQ.A0B(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03d4, code lost:
        if (r4.AIY(r3, new X.C61079JwH(r2, r5, r1)) == false) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03d6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r3 = (X.C67712MtR) ((X.C68739NUz) r8.A01).A08.getValue();
        r5 = X.AnonymousClass7TE.A1A();
        r4 = r6.length();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03d7, code lost:
        X.C71089Obq.A01((X.C71089Obq) r8.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03df, code lost:
        r2 = (X.NJR) r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03e7, code lost:
        if (r2.A06 != X.AnonymousClass05K.A0C) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03e9, code lost:
        r2.A06 = X.AnonymousClass05K.A0N;
        X.C66582MXn.A16(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03f0, code lost:
        X.NJR.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03f4, code lost:
        if (r9 != null) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03f6, code lost:
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03f8, code lost:
        r9 = r9;
        X.C3269778w.A00((android.text.Editable) r9);
        X.NJL.A03((X.NJL) r8.A01, r9.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r2 >= r4) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x040b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x040c, code lost:
        r2 = java.lang.String.valueOf(r9);
        X.0qQ.A0B(r2, 0);
        ((X.MYL) ((X.NKO) r8.A01).A0B.getValue()).A0R(new X.MYK(r2, 35));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x042a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x042b, code lost:
        X.DbS.A1U(r8.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0430, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0431, code lost:
        r3.A08.A0B("CONFIRM_PIN_WRONG_PIN");
        X.C67716MtV.A00(X.DbS.A0Q(new java.lang.Object[0], 2131961632), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0444, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0449, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x044a, code lost:
        r3.A00 = (java.lang.String) r6.getValue();
        r2 = r3.A08;
        r2.A0B("CREATE_PIN_ENTERED");
        r1 = X.C69261NiN.A02;
        r2.A0B("CONFIRM_PIN_IMPRESSION");
        r5.Epw(r1);
        r6.Epw("");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        r1 = r6.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0468, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0469, code lost:
        r0 = "logger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x046c, code lost:
        r0 = "sendButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x046f, code lost:
        r0 = "noteEditText";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0472, code lost:
        X.0qQ.A0B(r9, 0);
        r6 = (com.instagram.bugreporter.BugReportComposerFragment) r8.A01;
        r5 = new X.OWB();
        r0 = r6.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0481, code lost:
        if (r0 != null) goto L_0x0486;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0483, code lost:
        r0 = "bugReport";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0486, code lost:
        r5.A02(r0);
        r4 = r9.toString();
        r3 = r4.length() - 1;
        r2 = 0;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0495, code lost:
        if (r2 > r3) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0497, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (java.lang.Character.isDigit(r1) == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0498, code lost:
        if (r1 != false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x049a, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x049b, code lost:
        r0 = X.Dbc.A13(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x049f, code lost:
        if (r1 != false) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04a1, code lost:
        if (r0 != false) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04a3, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04a5, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04a8, code lost:
        if (r0 == false) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04aa, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04ad, code lost:
        r0 = X.Dba.A0c(r4, r3, r2);
        X.0qQ.A0B(r0, 0);
        r5.A0A = r0;
        r6.A08 = r5.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r5.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04bd, code lost:
        r2 = (X.NVX) r8.A01;
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04c3, code lost:
        if (r0 != null) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04c5, code lost:
        r0 = "suggestionRecyclerView";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04c8, code lost:
        r0.getView().removeCallbacks(r2.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04d2, code lost:
        r1 = ((X.NK1) r8.A01).A03;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04d9, code lost:
        if (r1 != null) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04db, code lost:
        r0 = "controller";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04e5, code lost:
        if (r9 == null) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04e7, code lost:
        r0 = r9.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04eb, code lost:
        r1.A00 = r0;
        X.P4G.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r1 = X.DbT.A10(r5);
        r2 = r3.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (X.0qQ.A0K(r2.getValue(), r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        r2.Epw(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r1.length() <= 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r3.A0D.FIA((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        r0 = (java.lang.String) r2.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r0.length() != 6) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        r3.A06.A0B("OTC_ENTER_PIN_CODE_ENTERED");
        r3.A0F.FIA(new X.O6C(true));
        r3.A07.A04 = true;
        r2 = X.C72120Owf.A00(r3.A02, r3, 9);
        r1 = r3.A03;
        r0 = X.C73012PSv.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        r3 = (X.C67714MtT) ((X.NV0) r8.A01).A0C.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        if (r9 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        r6 = r9.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        if (r6 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        r5 = X.AnonymousClass7TE.A1A();
        r4 = 0;
        r2 = r6.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d1, code lost:
        if (r4 >= r2) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        r1 = r6.charAt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00db, code lost:
        if (java.lang.Character.isDigit(r1) == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dd, code lost:
        r5.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e3, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e6, code lost:
        r6 = X.DbT.A10(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        r4 = r3.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f5, code lost:
        if (X.0qQ.A0K(r4.getValue(), r6) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        r3.A0N.Epw(X.C69284Nik.A05);
        r3.A0L.Epw(X.DbS.A0Q(new java.lang.Object[0], 2131969475));
        r4.Epw(r6);
        r0 = (java.lang.String) r4.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011c, code lost:
        if (r0.length() != 6) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011e, code lost:
        X.JTR.A1W(r3.A0Q);
        X.C66583MXo.A1O(r3, X.C318116oQ.A00(r3), 29);
        r3.A08.A0B("PIN_RESTORE_ATTEMPT");
        r2 = X.C72120Owf.A00(r3.A03, r3, 10);
        r1 = r3.A04;
        r0 = X.C73014PSx.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013f, code lost:
        r1.A02(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0142, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0143, code lost:
        r3 = (X.C67716MtV) ((X.NV1) r8.A01).A08.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014f, code lost:
        if (r9 == null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0151, code lost:
        r6 = r9.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0155, code lost:
        if (r6 == null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0157, code lost:
        r5 = X.AnonymousClass7TE.A1A();
        r4 = 0;
        r2 = r6.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0160, code lost:
        if (r4 >= r2) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0162, code lost:
        r1 = r6.charAt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016a, code lost:
        if (java.lang.Character.isDigit(r1) == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016c, code lost:
        r5.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016f, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0172, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0175, code lost:
        r1 = X.DbT.A10(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0179, code lost:
        r6 = r3.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0183, code lost:
        if (X.0qQ.A0K(r6.getValue(), r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0185, code lost:
        r6.Epw(r1);
        r3.A0J.Epw((java.lang.Object) null);
        r0 = (java.lang.String) r6.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0194, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019b, code lost:
        if (r0.length() != 6) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019d, code lost:
        r5 = r3.A0M;
        r0 = ((X.C69261NiN) r5.getValue()).ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01aa, code lost:
        if (r0 == 0) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ad, code lost:
        if (r0 != 1) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b9, code lost:
        if (X.0qQ.A0K(r3.A00, r6.getValue()) == false) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01bb, code lost:
        X.AnonymousClass7TF.A1O(r3.A0L, true);
        r3.A09.A02 = true;
        r3.A05.A02(X.1aU.A01(new X.OuU((java.lang.Object) r3, 0), r3.A03, r3.A04), X.C73015PSy.A00);
        X.C66583MXo.A1O(r3, X.C318116oQ.A00(r3), 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e2, code lost:
        if (r9 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e4, code lost:
        X.C3269778w.A00(r9);
        r3 = (X.NKF) r8.A01;
        r1 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ed, code lost:
        if (r1 == null) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ef, code lost:
        r1.setEnabled(X.C51966G9m.A1X(r9));
        r2 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f8, code lost:
        if (r2 == null) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fa, code lost:
        r1 = r3.A01;
        r0 = r3.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ff, code lost:
        if (r9 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0201, code lost:
        X.C3269778w.A00(r9);
        r4 = (X.NKH) r8.A01;
        r0 = r4.A08;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x020b, code lost:
        if (r0 == null) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x020d, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020f, code lost:
        if (r0 == null) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0211, code lost:
        r5 = X.00l.A0C(r0).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0219, code lost:
        r3 = X.00l.A0C(r9.toString()).toString();
        r2 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0227, code lost:
        if (r2 == null) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0229, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0230, code lost:
        if ((!X.00l.A0W(r3)) == false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0236, code lost:
        if (X.0qQ.A0K(r3, r5) != false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0238, code lost:
        r2.setEnabled(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x023d, code lost:
        if (r4.A08 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023f, code lost:
        r2 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0241, code lost:
        if (r2 == null) goto L_0x0469;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0472;
                case 1: goto L_0x0005;
                case 2: goto L_0x0031;
                case 3: goto L_0x00b4;
                case 4: goto L_0x0143;
                case 5: goto L_0x01ff;
                case 6: goto L_0x02be;
                case 7: goto L_0x0005;
                case 8: goto L_0x02db;
                case 9: goto L_0x031e;
                case 10: goto L_0x04bd;
                case 11: goto L_0x01e2;
                case 12: goto L_0x03a4;
                case 13: goto L_0x0005;
                case 14: goto L_0x03d7;
                case 15: goto L_0x04d2;
                case 16: goto L_0x03df;
                case 17: goto L_0x0266;
                case 18: goto L_0x0006;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x03f4;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x040c;
                case 26: goto L_0x029c;
                case 27: goto L_0x042b;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r8.A01
            X.NIn r1 = (X.C68449NIn) r1
            X.MuH r2 = X.C68449NIn.A02(r1)
            com.instagram.common.ui.base.IgEditText r0 = r1.A0I
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "promptEditText"
            goto L_0x04dd
        L_0x0016:
            java.lang.String r1 = X.C68449NIn.A03(r9, r0, r1)
            java.lang.String r0 = r2.A06
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0005
            java.lang.String r0 = r2.A07
            if (r0 != 0) goto L_0x0005
            r2.A06 = r1
            X.C67761MuH.A02(r2)
            java.lang.String r0 = r2.A06
            X.C67761MuH.A03(r2, r0)
            return
        L_0x0031:
            if (r9 == 0) goto L_0x0039
            java.lang.String r6 = r9.toString()
            if (r6 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r6 = ""
        L_0x003b:
            java.lang.Object r0 = r8.A01
            X.NUz r0 = (X.C68739NUz) r0
            X.0eM r0 = r0.A08
            java.lang.Object r3 = r0.getValue()
            X.MtR r3 = (X.C67712MtR) r3
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            int r4 = r6.length()
            r2 = 0
        L_0x0050:
            if (r2 >= r4) goto L_0x0062
            char r1 = r6.charAt(r2)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 == 0) goto L_0x005f
            r5.append(r1)
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x0062:
            java.lang.String r1 = X.DbT.A10(r5)
            X.05G r2 = r3.A0G
            java.lang.Object r0 = r2.getValue()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0005
            r2.Epw(r1)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0081
            X.05G r1 = r3.A0D
            r0 = 0
            r1.FIA(r0)
        L_0x0081:
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0005
            int r1 = r0.length()
            r0 = 6
            if (r1 != r0) goto L_0x0005
            X.NUa r1 = r3.A06
            java.lang.String r0 = "OTC_ENTER_PIN_CODE_ENTERED"
            r1.A0B(r0)
            X.05G r2 = r3.A0F
            r1 = 1
            X.O6C r0 = new X.O6C
            r0.<init>(r1)
            r2.FIA(r0)
            X.OyT r0 = r3.A07
            r0.A04 = r1
            X.1aU r1 = r3.A02
            r0 = 9
            X.1aU r2 = X.C72120Owf.A00(r1, r3, r0)
            X.1a8 r1 = r3.A03
            X.PSv r0 = X.C73012PSv.A00
            goto L_0x013f
        L_0x00b4:
            java.lang.Object r0 = r8.A01
            X.NV0 r0 = (X.NV0) r0
            X.0eM r0 = r0.A0C
            java.lang.Object r3 = r0.getValue()
            X.MtT r3 = (X.C67714MtT) r3
            if (r9 == 0) goto L_0x00e3
            java.lang.String r6 = r9.toString()
            if (r6 == 0) goto L_0x00e3
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            r4 = 0
            int r2 = r6.length()
        L_0x00d1:
            if (r4 >= r2) goto L_0x00e6
            char r1 = r6.charAt(r4)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 == 0) goto L_0x00e0
            r5.append(r1)
        L_0x00e0:
            int r4 = r4 + 1
            goto L_0x00d1
        L_0x00e3:
            java.lang.String r6 = ""
            goto L_0x00ea
        L_0x00e6:
            java.lang.String r6 = X.DbT.A10(r5)
        L_0x00ea:
            r5 = 0
            X.05G r4 = r3.A0P
            java.lang.Object r0 = r4.getValue()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x0005
            X.05G r1 = r3.A0N
            X.Nik r0 = X.C69284Nik.A05
            r1.Epw(r0)
            X.05G r2 = r3.A0L
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131969475(0x7f1345c3, float:1.9575874E38)
            X.GKO r0 = X.DbS.A0Q(r1, r0)
            r2.Epw(r0)
            r4.Epw(r6)
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0005
            int r1 = r0.length()
            r0 = 6
            if (r1 != r0) goto L_0x0005
            X.05G r0 = r3.A0Q
            X.JTR.A1W(r0)
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 29
            X.C66583MXo.A1O(r3, r1, r0)
            X.NUa r1 = r3.A08
            java.lang.String r0 = "PIN_RESTORE_ATTEMPT"
            r1.A0B(r0)
            X.1aU r1 = r3.A03
            r0 = 10
            X.1aU r2 = X.C72120Owf.A00(r1, r3, r0)
            X.1a8 r1 = r3.A04
            X.PSx r0 = X.C73014PSx.A00
        L_0x013f:
            r1.A02(r2, r0)
            return
        L_0x0143:
            java.lang.Object r0 = r8.A01
            X.NV1 r0 = (X.NV1) r0
            X.0eM r0 = r0.A08
            java.lang.Object r3 = r0.getValue()
            X.MtV r3 = (X.C67716MtV) r3
            if (r9 == 0) goto L_0x0172
            java.lang.String r6 = r9.toString()
            if (r6 == 0) goto L_0x0172
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            r4 = 0
            int r2 = r6.length()
        L_0x0160:
            if (r4 >= r2) goto L_0x0175
            char r1 = r6.charAt(r4)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 == 0) goto L_0x016f
            r5.append(r1)
        L_0x016f:
            int r4 = r4 + 1
            goto L_0x0160
        L_0x0172:
            java.lang.String r1 = ""
            goto L_0x0179
        L_0x0175:
            java.lang.String r1 = X.DbT.A10(r5)
        L_0x0179:
            X.05G r6 = r3.A0K
            java.lang.Object r0 = r6.getValue()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0005
            r6.Epw(r1)
            X.05G r1 = r3.A0J
            r0 = 0
            r1.Epw(r0)
            java.lang.Object r0 = r6.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0005
            int r1 = r0.length()
            r0 = 6
            if (r1 != r0) goto L_0x0005
            X.05G r5 = r3.A0M
            java.lang.Object r0 = r5.getValue()
            X.NiN r0 = (X.C69261NiN) r0
            int r0 = r0.ordinal()
            r4 = 0
            if (r0 == r4) goto L_0x044a
            r2 = 1
            if (r0 != r2) goto L_0x0445
            java.lang.String r1 = r3.A00
            java.lang.Object r0 = r6.getValue()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0431
            X.05G r0 = r3.A0L
            X.AnonymousClass7TF.A1O(r0, r2)
            X.OyT r0 = r3.A09
            r0.A02 = r2
            X.1aU r2 = r3.A03
            X.1aU r1 = r3.A04
            X.OuU r0 = new X.OuU
            r0.<init>((java.lang.Object) r3, (int) r4)
            X.1aU r2 = X.1aU.A01(r0, r2, r1)
            X.1a8 r1 = r3.A05
            X.PSy r0 = X.C73015PSy.A00
            r1.A02(r2, r0)
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 32
            X.C66583MXo.A1O(r3, r1, r0)
            return
        L_0x01e2:
            if (r9 == 0) goto L_0x0005
            X.C3269778w.A00(r9)
            java.lang.Object r3 = r8.A01
            X.NKF r3 = (X.NKF) r3
            com.instagram.common.ui.base.IgTextView r1 = r3.A04
            if (r1 == 0) goto L_0x046c
            boolean r0 = X.C51966G9m.A1X(r9)
            r1.setEnabled(r0)
            X.7IQ r2 = r3.A06
            if (r2 == 0) goto L_0x0469
            int r1 = r3.A01
            java.lang.String r0 = r3.A0B
            goto L_0x0247
        L_0x01ff:
            if (r9 == 0) goto L_0x0005
            X.C3269778w.A00(r9)
            java.lang.Object r4 = r8.A01
            X.NKH r4 = (X.NKH) r4
            com.instagram.direct.prompts.DirectEditAddYoursParams r0 = r4.A08
            r5 = 0
            if (r0 == 0) goto L_0x0219
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0219
            java.lang.CharSequence r0 = X.00l.A0C(r0)
            java.lang.String r5 = r0.toString()
        L_0x0219:
            java.lang.String r0 = r9.toString()
            java.lang.CharSequence r0 = X.00l.A0C(r0)
            java.lang.String r3 = r0.toString()
            com.instagram.common.ui.base.IgTextView r2 = r4.A04
            if (r2 == 0) goto L_0x046c
            boolean r0 = X.00l.A0W(r3)
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x024d
            boolean r0 = X.0qQ.A0K(r3, r5)
            if (r0 != 0) goto L_0x024d
        L_0x0238:
            r2.setEnabled(r1)
            com.instagram.direct.prompts.DirectEditAddYoursParams r0 = r4.A08
            if (r0 != 0) goto L_0x0005
            X.7IQ r2 = r4.A05
            if (r2 == 0) goto L_0x0469
            int r1 = r4.A01
            java.lang.String r0 = r4.A0B
        L_0x0247:
            if (r0 != 0) goto L_0x024f
            java.lang.String r0 = "currentTabAsString"
            goto L_0x04dd
        L_0x024d:
            r1 = 0
            goto L_0x0238
        L_0x024f:
            com.instagram.direct.prompts.DirectPromptTypes r4 = X.AnonymousClass79B.A01(r0)
            r3 = 1
            boolean r0 = X.AnonymousClass48O.A01(r1)
            if (r0 == 0) goto L_0x0005
            X.0eM r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.ONz r0 = (X.C70846ONz) r0
            r0.A04(r4, r3)
            return
        L_0x0266:
            java.lang.Object r4 = r8.A01
            X.NIn r4 = (X.C68449NIn) r4
            com.instagram.common.ui.base.IgEditText r0 = r4.A0H
            if (r0 == 0) goto L_0x046f
            X.C68449NIn.A05(r9, r0, r4)
            boolean r0 = r4.A0z
            if (r0 == 0) goto L_0x0005
            java.lang.String r3 = java.lang.String.valueOf(r9)
            java.lang.String r0 = r4.A0p
            int r2 = X.DbX.A05(r0)
            int r1 = X.DbX.A05(r3)
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x0298
            int r2 = r2 - r1
            r0 = 1
            if (r2 != r0) goto L_0x0298
            com.instagram.common.ui.base.IgEditText r0 = r4.A0H
            if (r0 == 0) goto L_0x046f
            android.text.Editable r0 = r0.getText()
            r0.clear()
        L_0x0298:
            r0 = 0
            r4.A0z = r0
            return
        L_0x029c:
            r4 = 0
            X.0qQ.A0B(r9, r4)
            java.lang.Object r3 = r8.A01
            X.Mep r3 = (X.C66906Mep) r3
            X.C66906Mep.A05(r3)
            boolean r0 = X.00l.A0W(r9)
            r2 = 1
            r1 = r0 ^ 1
            X.OLV r0 = r3.A06
            if (r1 == 0) goto L_0x02b8
            if (r0 == 0) goto L_0x0005
            r0.A00(r4)
            return
        L_0x02b8:
            if (r0 == 0) goto L_0x0005
            r0.A00(r2)
            return
        L_0x02be:
            if (r9 != 0) goto L_0x02c2
            java.lang.String r9 = ""
        L_0x02c2:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            java.lang.String r0 = "null cannot be cast to non-null type android.text.Editable"
            X.0qQ.A0C(r9, r0)
            r0 = r9
            android.text.Editable r0 = (android.text.Editable) r0
            X.C3269778w.A00(r0)
            java.lang.Object r1 = r8.A01
            X.NJ4 r1 = (X.NJ4) r1
            int r0 = r9.length()
            X.NJ4.A00(r1, r0)
            return
        L_0x02db:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            boolean r0 = X.00l.A0W(r9)
            if (r0 == 0) goto L_0x02e8
            r9.clear()
        L_0x02e8:
            java.lang.Object r4 = r8.A01
            X.P1C r4 = (X.P1C) r4
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r3 = r4.A09
            android.content.Context r0 = r4.A02
            android.content.res.Resources r2 = r0.getResources()
            boolean r1 = X.00l.A0W(r9)
            r0 = 2131492872(0x7f0c0008, float:1.8609208E38)
            if (r1 == 0) goto L_0x0300
            r0 = 2131492882(0x7f0c0012, float:1.8609228E38)
        L_0x0300:
            int r0 = r2.getInteger(r0)
            r3.setMaxLines(r0)
            android.view.View r2 = r4.A03
            java.lang.String r0 = r9.toString()
            java.lang.String r0 = X.DbV.A12(r0)
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x031a
            r0 = 8
        L_0x031a:
            r2.setVisibility(r0)
            return
        L_0x031e:
            r3 = 0
            X.0qQ.A0B(r9, r3)
            boolean r0 = X.00l.A0W(r9)
            if (r0 == 0) goto L_0x032b
            r9.clear()
        L_0x032b:
            java.lang.Object r2 = r8.A01
            X.P1D r2 = (X.P1D) r2
            X.0eM r0 = r2.A0C
            android.widget.TextView r5 = X.JTQ.A0A(r0)
            android.content.Context r0 = r2.A03
            android.content.res.Resources r4 = r0.getResources()
            boolean r1 = X.00l.A0W(r9)
            r0 = 2131492872(0x7f0c0008, float:1.8609208E38)
            if (r1 == 0) goto L_0x0347
            r0 = 2131492882(0x7f0c0012, float:1.8609228E38)
        L_0x0347:
            int r0 = r4.getInteger(r0)
            r5.setMaxLines(r0)
            java.lang.String r0 = r9.toString()
            java.lang.String r0 = X.DbV.A12(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0389
            X.0eM r0 = r2.A0F
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            android.view.ViewPropertyAnimator r1 = r0.animate()
            X.PVA r0 = new X.PVA
            r0.<init>(r2)
            android.view.ViewPropertyAnimator r1 = r1.withStartAction(r0)
            X.PVB r0 = new X.PVB
            r0.<init>(r2)
            android.view.ViewPropertyAnimator r1 = r1.withEndAction(r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 400(0x190, double:1.976E-321)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
            return
        L_0x0389:
            X.0eM r0 = r2.A0G
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r1 = 8
            r0.setVisibility(r1)
            X.0eM r0 = r2.A0D
            X.JTS.A1W(r0, r1)
            X.0eM r0 = r2.A0A
            X.JTS.A1W(r0, r1)
            X.0eM r0 = r2.A0F
            X.JTS.A1W(r0, r3)
            return
        L_0x03a4:
            java.lang.Object r0 = r8.A01
            X.NIO r0 = (X.NIO) r0
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.Mtb r1 = (X.C67722Mtb) r1
            java.lang.String r5 = java.lang.String.valueOf(r9)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.05G r4 = r1.A00
        L_0x03ba:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JwH r0 = (X.C61079JwH) r0
            X.NkD r2 = X.C69373NkD.CUSTOM
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.JwH r0 = new X.JwH
            r0.<init>((X.C69373NkD) r2, (java.lang.String) r5, (java.util.List) r1)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x03ba
            return
        L_0x03d7:
            java.lang.Object r0 = r8.A01
            X.Obq r0 = (X.C71089Obq) r0
            X.C71089Obq.A01(r0)
            return
        L_0x03df:
            java.lang.Object r2 = r8.A01
            X.NJR r2 = (X.NJR) r2
            java.lang.Integer r1 = r2.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x03f0
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.A06 = r0
            X.C66582MXn.A16(r2)
        L_0x03f0:
            X.NJR.A01(r2)
            return
        L_0x03f4:
            if (r9 != 0) goto L_0x03f8
            java.lang.String r9 = ""
        L_0x03f8:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r0 = r9
            android.text.Editable r0 = (android.text.Editable) r0
            X.C3269778w.A00(r0)
            java.lang.Object r1 = r8.A01
            X.NJL r1 = (X.NJL) r1
            int r0 = r9.length()
            X.NJL.A03(r1, r0)
            return
        L_0x040c:
            java.lang.Object r0 = r8.A01
            X.NKO r0 = (X.NKO) r0
            X.0eM r0 = r0.A0B
            java.lang.Object r3 = r0.getValue()
            X.MYL r3 = (X.MYL) r3
            java.lang.String r2 = java.lang.String.valueOf(r9)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r1 = 35
            X.MYK r0 = new X.MYK
            r0.<init>(r2, r1)
            r3.A0R(r0)
            return
        L_0x042b:
            java.lang.Object r0 = r8.A01
            X.DbS.A1U(r0)
            return
        L_0x0431:
            X.NUN r1 = r3.A08
            java.lang.String r0 = "CONFIRM_PIN_WRONG_PIN"
            r1.A0B(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131961632(0x7f132720, float:1.9559966E38)
            X.GKO r0 = X.DbS.A0Q(r1, r0)
            X.C67716MtV.A00(r0, r3)
            return
        L_0x0445:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x044a:
            java.lang.Object r0 = r6.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.A00 = r0
            X.NUN r2 = r3.A08
            java.lang.String r0 = "CREATE_PIN_ENTERED"
            r2.A0B(r0)
            X.NiN r1 = X.C69261NiN.ConfirmationScreen
            java.lang.String r0 = "CONFIRM_PIN_IMPRESSION"
            r2.A0B(r0)
            r5.Epw(r1)
            java.lang.String r0 = ""
            r6.Epw(r0)
            return
        L_0x0469:
            java.lang.String r0 = "logger"
            goto L_0x04dd
        L_0x046c:
            java.lang.String r0 = "sendButton"
            goto L_0x04dd
        L_0x046f:
            java.lang.String r0 = "noteEditText"
            goto L_0x04dd
        L_0x0472:
            r7 = 0
            X.0qQ.A0B(r9, r7)
            java.lang.Object r6 = r8.A01
            com.instagram.bugreporter.BugReportComposerFragment r6 = (com.instagram.bugreporter.BugReportComposerFragment) r6
            X.OWB r5 = new X.OWB
            r5.<init>()
            com.instagram.bugreporter.model.BugReport r0 = r6.A08
            if (r0 != 0) goto L_0x0486
            java.lang.String r0 = "bugReport"
            goto L_0x04dd
        L_0x0486:
            r5.A02(r0)
            java.lang.String r4 = r9.toString()
            int r3 = r4.length()
            r0 = 1
            int r3 = r3 - r0
            r2 = 0
            r1 = 0
        L_0x0495:
            if (r2 > r3) goto L_0x04ad
            r0 = r3
            if (r1 != 0) goto L_0x049b
            r0 = r2
        L_0x049b:
            boolean r0 = X.Dbc.A13(r4, r0)
            if (r1 != 0) goto L_0x04a8
            if (r0 != 0) goto L_0x04a5
            r1 = 1
            goto L_0x0495
        L_0x04a5:
            int r2 = r2 + 1
            goto L_0x0495
        L_0x04a8:
            if (r0 == 0) goto L_0x04ad
            int r3 = r3 + -1
            goto L_0x0495
        L_0x04ad:
            java.lang.String r0 = X.Dba.A0c(r4, r3, r2)
            X.0qQ.A0B(r0, r7)
            r5.A0A = r0
            com.instagram.bugreporter.model.BugReport r0 = r5.A01()
            r6.A08 = r0
            return
        L_0x04bd:
            java.lang.Object r2 = r8.A01
            X.NVX r2 = (X.NVX) r2
            X.3oV r0 = r2.A01
            if (r0 != 0) goto L_0x04c8
            java.lang.String r0 = "suggestionRecyclerView"
            goto L_0x04dd
        L_0x04c8:
            android.view.View r1 = r0.getView()
            java.lang.Runnable r0 = r2.A04
            r1.removeCallbacks(r0)
            return
        L_0x04d2:
            java.lang.Object r0 = r8.A01
            X.NK1 r0 = (X.NK1) r0
            X.P4G r1 = r0.A03
            r0 = 0
            if (r1 != 0) goto L_0x04e5
            java.lang.String r0 = "controller"
        L_0x04dd:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04e5:
            if (r9 == 0) goto L_0x04eb
            java.lang.String r0 = r9.toString()
        L_0x04eb:
            r1.A00 = r0
            X.P4G.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71273OhE.afterTextChanged(android.text.Editable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (X.00l.A0W(r5) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        if (r0.length() == 0) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x0063;
                case 7: goto L_0x0079;
                case 13: goto L_0x0081;
                case 19: goto L_0x0089;
                case 20: goto L_0x00a2;
                case 21: goto L_0x00ad;
                case 22: goto L_0x0006;
                case 23: goto L_0x0030;
                case 24: goto L_0x004a;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r4.A01
            X.NIj r2 = (X.C68446NIj) r2
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r2.A06
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "editText"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0018:
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r0)
            int r0 = r1.length()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            X.C68446NIj.A00(r2, r0)
            X.OE5 r0 = r2.A05
            if (r0 == 0) goto L_0x0005
            X.Moq r0 = r0.A00
            r0.A03 = r1
            return
        L_0x0030:
            java.lang.Object r2 = r4.A01
            com.instagram.direct.ui.polls.PollMessageOptionView r2 = (com.instagram.direct.ui.polls.PollMessageOptionView) r2
            r1 = 1
            if (r5 == 0) goto L_0x0048
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x0048
        L_0x003d:
            com.instagram.direct.ui.polls.PollMessageOptionView.A00(r2, r1)
            X.PvC r0 = r2.A01
            if (r0 == 0) goto L_0x0005
            r0.Dr0(r2, r5)
            return
        L_0x0048:
            r1 = 0
            goto L_0x003d
        L_0x004a:
            java.lang.Object r0 = r4.A01
            com.instagram.direct.visual.DirectVisualMessageViewerController r0 = (com.instagram.direct.visual.DirectVisualMessageViewerController) r0
            android.view.View r2 = r0.textSendButton
            if (r2 == 0) goto L_0x0005
            java.lang.String r0 = com.instagram.direct.visual.DirectVisualMessageViewerController.A05(r0)
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x005f
            r0 = 8
        L_0x005f:
            r2.setVisibility(r0)
            return
        L_0x0063:
            java.lang.Object r3 = r4.A01
            X.6Uk r3 = (X.C308476Uk) r3
            if (r5 == 0) goto L_0x0070
            boolean r1 = X.00l.A0W(r5)
            r0 = 0
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            r2 = r0 ^ 1
            r1 = 0
            r0 = 0
            r3.A01(r1, r2, r0)
            return
        L_0x0079:
            java.lang.Object r0 = r4.A01
            X.NJ5 r0 = (X.NJ5) r0
            X.NJ5.A00(r0)
            return
        L_0x0081:
            java.lang.Object r0 = r4.A01
            X.NJS r0 = (X.NJS) r0
            X.NJS.A02(r0)
            return
        L_0x0089:
            java.lang.Object r2 = r4.A01
            X.OdL r2 = (X.C71126OdL) r2
            if (r5 == 0) goto L_0x009c
            java.lang.CharSequence r0 = X.00l.A0B(r5)
            if (r0 == 0) goto L_0x009c
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x009d
        L_0x009c:
            r1 = 1
        L_0x009d:
            r0 = 1
            X.C71126OdL.A03(r2, r1, r0)
            return
        L_0x00a2:
            java.lang.Object r1 = r4.A01
            X.UbH r1 = (X.C15364UbH) r1
            java.lang.String r0 = r5.toString()
            r1.A02 = r0
            return
        L_0x00ad:
            java.lang.Object r0 = r4.A01
            X.NJL r0 = (X.NJL) r0
            X.0eM r0 = r0.A0O
            java.lang.Object r2 = r0.getValue()
            X.Mu0 r2 = (X.C67747Mu0) r2
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A01 = r1
            X.C67747Mu0.A00(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71273OhE.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
