package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Om  reason: invalid class name and case insensitive filesystem */
public final class C355078Om extends 2Rw {
    public static Integer A06;
    public List A00 = new ArrayList();
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final 0sL A04;
    public final UserSession A05;

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        C60065Jeo jeo = new C60065Jeo(context, C62579KiC.ICON_ONLY);
        Context context2 = jeo.getContext();
        0qQ.A07(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) 0nA.A04(context2, 44), (int) 0nA.A04(context2, 44));
        layoutParams.setMargins(0, (int) 0nA.A04(context2, 20), 0, 0);
        jeo.setLayoutParams(layoutParams);
        return new C60685JpW(jeo, this.A05, jeo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0188, code lost:
        if (r3.A02 == false) goto L_0x018a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r20, int r21) {
        /*
            r19 = this;
            r8 = r20
            r6 = 0
            X.0qQ.A0B(r8, r6)
            boolean r0 = r8 instanceof X.C60685JpW
            if (r0 == 0) goto L_0x01c6
            r4 = r19
            java.util.List r0 = r4.A00
            r7 = r21
            java.lang.Object r3 = r0.get(r7)
            X.9IQ r3 = (X.AnonymousClass9IQ) r3
            android.view.View r0 = r8.itemView
            android.content.Context r2 = r0.getContext()
            X.0qQ.A07(r2)
            java.lang.Object r1 = r3.A00
            X.KjH r1 = (X.C62636KjH) r1
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L_0x00c3;
                case 1: goto L_0x00bf;
                case 2: goto L_0x00bb;
                case 3: goto L_0x00b3;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00af;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00a7;
                case 8: goto L_0x00a3;
                case 9: goto L_0x009f;
                case 10: goto L_0x009b;
                case 11: goto L_0x0097;
                case 12: goto L_0x0093;
                case 13: goto L_0x008f;
                case 14: goto L_0x0083;
                case 15: goto L_0x007f;
                case 16: goto L_0x008b;
                case 17: goto L_0x007b;
                case 18: goto L_0x007f;
                case 19: goto L_0x0077;
                case 20: goto L_0x0073;
                case 21: goto L_0x0073;
                case 22: goto L_0x0068;
                case 23: goto L_0x006c;
                case 24: goto L_0x0064;
                case 25: goto L_0x00c3;
                case 26: goto L_0x0060;
                case 27: goto L_0x007f;
                case 28: goto L_0x0087;
                case 29: goto L_0x005c;
                case 30: goto L_0x0058;
                case 31: goto L_0x0054;
                case 32: goto L_0x0050;
                case 33: goto L_0x004c;
                case 34: goto L_0x004c;
                case 35: goto L_0x0048;
                case 36: goto L_0x0093;
                case 37: goto L_0x0044;
                case 38: goto L_0x003f;
                case 39: goto L_0x0035;
                case 40: goto L_0x003a;
                case 41: goto L_0x0030;
                default: goto L_0x002a;
            }
        L_0x002a:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0030:
            r0 = 2131955960(0x7f1310f8, float:1.9548462E38)
            goto L_0x00c6
        L_0x0035:
            r0 = 2131956161(0x7f1311c1, float:1.954887E38)
            goto L_0x00c6
        L_0x003a:
            r0 = 2131955957(0x7f1310f5, float:1.9548456E38)
            goto L_0x00c6
        L_0x003f:
            r0 = 2131955708(0x7f130ffc, float:1.9547951E38)
            goto L_0x00c6
        L_0x0044:
            r0 = 2131955931(0x7f1310db, float:1.9548403E38)
            goto L_0x00c6
        L_0x0048:
            r0 = 2131955940(0x7f1310e4, float:1.9548422E38)
            goto L_0x00c6
        L_0x004c:
            r0 = 2131955721(0x7f131009, float:1.9547977E38)
            goto L_0x00c6
        L_0x0050:
            r0 = 2131955776(0x7f131040, float:1.954809E38)
            goto L_0x00c6
        L_0x0054:
            r0 = 2131955766(0x7f131036, float:1.9548069E38)
            goto L_0x00c6
        L_0x0058:
            r0 = 2131955923(0x7f1310d3, float:1.9548387E38)
            goto L_0x00c6
        L_0x005c:
            r0 = 2131955843(0x7f131083, float:1.9548225E38)
            goto L_0x00c6
        L_0x0060:
            r0 = 2131955919(0x7f1310cf, float:1.954838E38)
            goto L_0x00c6
        L_0x0064:
            r0 = 2131955841(0x7f131081, float:1.954822E38)
            goto L_0x00c6
        L_0x0068:
            r0 = 2131955448(0x7f130ef8, float:1.9547424E38)
            goto L_0x00c6
        L_0x006c:
            r0 = 2338(0x922, float:3.276E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            goto L_0x00cd
        L_0x0073:
            r0 = 2131955916(0x7f1310cc, float:1.9548373E38)
            goto L_0x00c6
        L_0x0077:
            r0 = 2131955915(0x7f1310cb, float:1.954837E38)
            goto L_0x00c6
        L_0x007b:
            r0 = 2131960790(0x7f1323d6, float:1.9558259E38)
            goto L_0x00c6
        L_0x007f:
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
            goto L_0x00c6
        L_0x0083:
            r0 = 2131955918(0x7f1310ce, float:1.9548377E38)
            goto L_0x00c6
        L_0x0087:
            r0 = 2131955922(0x7f1310d2, float:1.9548385E38)
            goto L_0x00c6
        L_0x008b:
            r0 = 2131955211(0x7f130e0b, float:1.9546943E38)
            goto L_0x00c6
        L_0x008f:
            r0 = 2131955912(0x7f1310c8, float:1.9548365E38)
            goto L_0x00c6
        L_0x0093:
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            goto L_0x00c6
        L_0x0097:
            r0 = 2131953555(0x7f130793, float:1.9543584E38)
            goto L_0x00c6
        L_0x009b:
            r0 = 2131955920(0x7f1310d0, float:1.9548381E38)
            goto L_0x00c6
        L_0x009f:
            r0 = 2131955441(0x7f130ef1, float:1.954741E38)
            goto L_0x00c6
        L_0x00a3:
            r0 = 2131955909(0x7f1310c5, float:1.9548359E38)
            goto L_0x00c6
        L_0x00a7:
            r0 = 2131955905(0x7f1310c1, float:1.954835E38)
            goto L_0x00c6
        L_0x00ab:
            r0 = 2131955440(0x7f130ef0, float:1.9547408E38)
            goto L_0x00c6
        L_0x00af:
            r0 = 2131955439(0x7f130eef, float:1.9547406E38)
            goto L_0x00c6
        L_0x00b3:
            r0 = 2131955436(0x7f130eec, float:1.95474E38)
            goto L_0x00c6
        L_0x00b7:
            r0 = 2131955438(0x7f130eee, float:1.9547403E38)
            goto L_0x00c6
        L_0x00bb:
            r0 = 2131955434(0x7f130eea, float:1.9547395E38)
            goto L_0x00c6
        L_0x00bf:
            r0 = 2131955437(0x7f130eed, float:1.9547401E38)
            goto L_0x00c6
        L_0x00c3:
            r0 = 2131955432(0x7f130ee8, float:1.9547391E38)
        L_0x00c6:
            java.lang.CharSequence r14 = r2.getText(r0)
            X.0qQ.A07(r14)
        L_0x00cd:
            android.view.View r0 = r8.itemView
            r0.setContentDescription(r14)
            r9 = 0
            int r2 = r1.ordinal()
            switch(r2) {
                case 0: goto L_0x0140;
                case 1: goto L_0x015c;
                case 2: goto L_0x013c;
                case 3: goto L_0x0154;
                case 4: goto L_0x0158;
                case 5: goto L_0x0173;
                case 6: goto L_0x0150;
                case 7: goto L_0x0138;
                case 8: goto L_0x0134;
                case 9: goto L_0x0130;
                case 10: goto L_0x012c;
                case 11: goto L_0x0128;
                case 12: goto L_0x0173;
                case 13: goto L_0x014c;
                case 14: goto L_0x0120;
                case 15: goto L_0x0173;
                case 16: goto L_0x0124;
                case 17: goto L_0x011c;
                case 18: goto L_0x0173;
                case 19: goto L_0x0118;
                case 20: goto L_0x0114;
                case 21: goto L_0x0110;
                case 22: goto L_0x00fc;
                case 23: goto L_0x0110;
                case 24: goto L_0x010c;
                case 25: goto L_0x0108;
                case 26: goto L_0x0104;
                case 27: goto L_0x0173;
                case 28: goto L_0x0173;
                case 29: goto L_0x0100;
                case 30: goto L_0x0148;
                case 31: goto L_0x00f8;
                case 32: goto L_0x00f4;
                case 33: goto L_0x00f0;
                case 34: goto L_0x00f0;
                case 35: goto L_0x00ec;
                case 36: goto L_0x0173;
                case 37: goto L_0x00e8;
                case 38: goto L_0x012c;
                case 39: goto L_0x0144;
                case 40: goto L_0x00e4;
                case 41: goto L_0x00e0;
                default: goto L_0x00da;
            }
        L_0x00da:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00e0:
            r0 = 2131238802(0x7f081f92, float:1.8093893E38)
            goto L_0x015f
        L_0x00e4:
            r0 = 2131238809(0x7f081f99, float:1.8093907E38)
            goto L_0x015f
        L_0x00e8:
            r0 = 2131238903(0x7f081ff7, float:1.8094098E38)
            goto L_0x015f
        L_0x00ec:
            r0 = 2131238301(0x7f081d9d, float:1.8092877E38)
            goto L_0x015f
        L_0x00f0:
            r0 = 2131238832(0x7f081fb0, float:1.8093954E38)
            goto L_0x015f
        L_0x00f4:
            r0 = 2131238828(0x7f081fac, float:1.8093946E38)
            goto L_0x015f
        L_0x00f8:
            r0 = 2131237851(0x7f081bdb, float:1.8091964E38)
            goto L_0x015f
        L_0x00fc:
            r0 = 2131238226(0x7f081d52, float:1.8092725E38)
            goto L_0x015f
        L_0x0100:
            r0 = 2131238128(0x7f081cf0, float:1.8092526E38)
            goto L_0x015f
        L_0x0104:
            r0 = 2131237912(0x7f081c18, float:1.8092088E38)
            goto L_0x015f
        L_0x0108:
            r0 = 2131238581(0x7f081eb5, float:1.8093445E38)
            goto L_0x015f
        L_0x010c:
            r0 = 2131238520(0x7f081e78, float:1.8093321E38)
            goto L_0x015f
        L_0x0110:
            r0 = 2131238742(0x7f081f56, float:1.8093771E38)
            goto L_0x015f
        L_0x0114:
            r0 = 2131238244(0x7f081d64, float:1.8092761E38)
            goto L_0x015f
        L_0x0118:
            r0 = 2131238162(0x7f081d12, float:1.8092595E38)
            goto L_0x015f
        L_0x011c:
            r0 = 2131238194(0x7f081d32, float:1.809266E38)
            goto L_0x015f
        L_0x0120:
            r0 = 2131238610(0x7f081ed2, float:1.8093504E38)
            goto L_0x015f
        L_0x0124:
            r0 = 2131238539(0x7f081e8b, float:1.809336E38)
            goto L_0x015f
        L_0x0128:
            r0 = 2131238081(0x7f081cc1, float:1.809243E38)
            goto L_0x015f
        L_0x012c:
            r0 = 2131238706(0x7f081f32, float:1.8093698E38)
            goto L_0x015f
        L_0x0130:
            r0 = 2131238579(0x7f081eb3, float:1.809344E38)
            goto L_0x015f
        L_0x0134:
            r0 = 2131238574(0x7f081eae, float:1.809343E38)
            goto L_0x015f
        L_0x0138:
            r0 = 2131237938(0x7f081c32, float:1.809214E38)
            goto L_0x015f
        L_0x013c:
            r0 = 2131238320(0x7f081db0, float:1.8092915E38)
            goto L_0x015f
        L_0x0140:
            r0 = 2131238571(0x7f081eab, float:1.8093424E38)
            goto L_0x015f
        L_0x0144:
            r0 = 2131238551(0x7f081e97, float:1.8093384E38)
            goto L_0x015f
        L_0x0148:
            r0 = 2131238227(0x7f081d53, float:1.8092727E38)
            goto L_0x015f
        L_0x014c:
            r0 = 2131238137(0x7f081cf9, float:1.8092544E38)
            goto L_0x015f
        L_0x0150:
            r0 = 2131238252(0x7f081d6c, float:1.8092777E38)
            goto L_0x015f
        L_0x0154:
            r0 = 2131238850(0x7f081fc2, float:1.809399E38)
            goto L_0x015f
        L_0x0158:
            r0 = 2131238899(0x7f081ff3, float:1.809409E38)
            goto L_0x015f
        L_0x015c:
            r0 = 2131238127(0x7f081cef, float:1.8092524E38)
        L_0x015f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0173
            int r1 = r0.intValue()
            android.view.View r0 = r8.itemView
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r9 = r0.getDrawable(r1)
        L_0x0173:
            android.view.View r1 = r8.itemView
            switch(r2) {
                case 0: goto L_0x02a3;
                case 1: goto L_0x029e;
                case 2: goto L_0x0299;
                case 3: goto L_0x028f;
                case 4: goto L_0x0294;
                case 5: goto L_0x028a;
                case 6: goto L_0x0285;
                case 7: goto L_0x0280;
                case 8: goto L_0x027b;
                case 9: goto L_0x0276;
                case 10: goto L_0x0271;
                case 11: goto L_0x026c;
                case 12: goto L_0x0267;
                case 13: goto L_0x0262;
                case 14: goto L_0x0253;
                case 15: goto L_0x024e;
                case 16: goto L_0x0178;
                case 17: goto L_0x0249;
                case 18: goto L_0x0244;
                case 19: goto L_0x023f;
                case 20: goto L_0x023a;
                case 21: goto L_0x0235;
                case 22: goto L_0x022b;
                case 23: goto L_0x0230;
                case 24: goto L_0x0226;
                case 25: goto L_0x0178;
                case 26: goto L_0x0221;
                case 27: goto L_0x021c;
                case 28: goto L_0x0258;
                case 29: goto L_0x0217;
                case 30: goto L_0x0212;
                case 31: goto L_0x020d;
                case 32: goto L_0x0208;
                case 33: goto L_0x0203;
                case 34: goto L_0x01fe;
                case 35: goto L_0x0253;
                case 36: goto L_0x025d;
                case 37: goto L_0x01f9;
                case 38: goto L_0x01f5;
                case 39: goto L_0x01ed;
                case 40: goto L_0x01f1;
                default: goto L_0x0178;
            }
        L_0x0178:
            r0 = 2131430021(0x7f0b0a85, float:1.8481731E38)
        L_0x017b:
            r1.setId(r0)
            X.5pj r11 = X.C296235pj.SECONDARY
            boolean r2 = r3.A01
            if (r2 == 0) goto L_0x018a
            boolean r0 = r3.A02
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x018d
        L_0x018a:
            r15 = 1050253722(0x3e99999a, float:0.3)
        L_0x018d:
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r21 != 0) goto L_0x01c7
            android.view.View r0 = r8.itemView
            r0.getLayoutParams()
            android.view.View r0 = r8.itemView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x01b2
            android.view.View r0 = r8.itemView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0qQ.A0C(r0, r5)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
        L_0x01ab:
            r0.rightMargin = r6
        L_0x01ad:
            android.view.View r0 = r8.itemView
            r0.requestLayout()
        L_0x01b2:
            X.JpW r8 = (X.C60685JpW) r8
            r12 = 0
            r16 = 1
            boolean r0 = r3.A02
            X.ANJ r10 = new X.ANJ
            r10.<init>(r3, r4)
            r13 = r12
            r17 = r0
            r18 = r2
            r8.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x01c6:
            return
        L_0x01c7:
            int r1 = r4.getItemCount()
            android.view.View r0 = r8.itemView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r7 != r1) goto L_0x01e5
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x01b2
            android.view.View r0 = r8.itemView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0qQ.A0C(r0, r5)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.leftMargin = r6
            goto L_0x01ad
        L_0x01e5:
            X.0qQ.A0C(r0, r5)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.leftMargin = r6
            goto L_0x01ab
        L_0x01ed:
            r0 = 2131430020(0x7f0b0a84, float:1.848173E38)
            goto L_0x017b
        L_0x01f1:
            r0 = 2131430019(0x7f0b0a83, float:1.8481727E38)
            goto L_0x017b
        L_0x01f5:
            r0 = 2131430018(0x7f0b0a82, float:1.8481725E38)
            goto L_0x017b
        L_0x01f9:
            r0 = 2131430016(0x7f0b0a80, float:1.8481721E38)
            goto L_0x017b
        L_0x01fe:
            r0 = 2131430015(0x7f0b0a7f, float:1.848172E38)
            goto L_0x017b
        L_0x0203:
            r0 = 2131430014(0x7f0b0a7e, float:1.8481717E38)
            goto L_0x017b
        L_0x0208:
            r0 = 2131430013(0x7f0b0a7d, float:1.8481715E38)
            goto L_0x017b
        L_0x020d:
            r0 = 2131430012(0x7f0b0a7c, float:1.8481713E38)
            goto L_0x017b
        L_0x0212:
            r0 = 2131430011(0x7f0b0a7b, float:1.848171E38)
            goto L_0x017b
        L_0x0217:
            r0 = 2131430010(0x7f0b0a7a, float:1.8481709E38)
            goto L_0x017b
        L_0x021c:
            r0 = 2131430008(0x7f0b0a78, float:1.8481705E38)
            goto L_0x017b
        L_0x0221:
            r0 = 2131430007(0x7f0b0a77, float:1.8481703E38)
            goto L_0x017b
        L_0x0226:
            r0 = 2131430005(0x7f0b0a75, float:1.8481699E38)
            goto L_0x017b
        L_0x022b:
            r0 = 2131430003(0x7f0b0a73, float:1.8481695E38)
            goto L_0x017b
        L_0x0230:
            r0 = 2131430004(0x7f0b0a74, float:1.8481697E38)
            goto L_0x017b
        L_0x0235:
            r0 = 2131430001(0x7f0b0a71, float:1.848169E38)
            goto L_0x017b
        L_0x023a:
            r0 = 2131430000(0x7f0b0a70, float:1.8481689E38)
            goto L_0x017b
        L_0x023f:
            r0 = 2131429999(0x7f0b0a6f, float:1.8481687E38)
            goto L_0x017b
        L_0x0244:
            r0 = 2131429998(0x7f0b0a6e, float:1.8481685E38)
            goto L_0x017b
        L_0x0249:
            r0 = 2131429997(0x7f0b0a6d, float:1.8481683E38)
            goto L_0x017b
        L_0x024e:
            r0 = 2131429995(0x7f0b0a6b, float:1.8481678E38)
            goto L_0x017b
        L_0x0253:
            r0 = 2131430002(0x7f0b0a72, float:1.8481693E38)
            goto L_0x017b
        L_0x0258:
            r0 = 2131430009(0x7f0b0a79, float:1.8481707E38)
            goto L_0x017b
        L_0x025d:
            r0 = 2131430017(0x7f0b0a81, float:1.8481723E38)
            goto L_0x017b
        L_0x0262:
            r0 = 2131429994(0x7f0b0a6a, float:1.8481676E38)
            goto L_0x017b
        L_0x0267:
            r0 = 2131429993(0x7f0b0a69, float:1.8481674E38)
            goto L_0x017b
        L_0x026c:
            r0 = 2131429992(0x7f0b0a68, float:1.8481672E38)
            goto L_0x017b
        L_0x0271:
            r0 = 2131429991(0x7f0b0a67, float:1.848167E38)
            goto L_0x017b
        L_0x0276:
            r0 = 2131429990(0x7f0b0a66, float:1.8481668E38)
            goto L_0x017b
        L_0x027b:
            r0 = 2131429989(0x7f0b0a65, float:1.8481666E38)
            goto L_0x017b
        L_0x0280:
            r0 = 2131429988(0x7f0b0a64, float:1.8481664E38)
            goto L_0x017b
        L_0x0285:
            r0 = 2131429987(0x7f0b0a63, float:1.8481662E38)
            goto L_0x017b
        L_0x028a:
            r0 = 2131429986(0x7f0b0a62, float:1.848166E38)
            goto L_0x017b
        L_0x028f:
            r0 = 2131429984(0x7f0b0a60, float:1.8481656E38)
            goto L_0x017b
        L_0x0294:
            r0 = 2131429985(0x7f0b0a61, float:1.8481658E38)
            goto L_0x017b
        L_0x0299:
            r0 = 2131429982(0x7f0b0a5e, float:1.8481652E38)
            goto L_0x017b
        L_0x029e:
            r0 = 2131429981(0x7f0b0a5d, float:1.848165E38)
            goto L_0x017b
        L_0x02a3:
            r0 = 2131429983(0x7f0b0a5f, float:1.8481654E38)
            goto L_0x017b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355078Om.onBindViewHolder(X.3kE, int):void");
    }

    public C355078Om(Context context, UserSession userSession, 0sL r4, int i) {
        this.A03 = context;
        this.A05 = userSession;
        this.A02 = i;
        this.A04 = r4;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(502547414);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(594946763, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(-489064083, AnonymousClass0fD.A03(424853329));
        return 0;
    }
}
