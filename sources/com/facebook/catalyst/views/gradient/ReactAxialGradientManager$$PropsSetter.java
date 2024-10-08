package com.facebook.catalyst.views.gradient;

import X.C13990Tnq;
import X.C13991Tnr;
import X.C13992Tns;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;

public class ReactAxialGradientManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final void Bhz(Map map) {
        String A0R = C13992Tns.A0R(map);
        String A0c = C13990Tnq.A0c(map);
        map.put("borderBottomLeftRadius", "number");
        map.put("borderBottomRightRadius", "number");
        map.put("borderRadius", "number");
        map.put("borderTopLeftRadius", "number");
        map.put("borderTopRightRadius", "number");
        map.put("colors", "ColorArray");
        map.put("elevation", "number");
        map.put("endX", "number");
        C13991Tnr.A1I("endY", "number", map);
        map.put("importantForAccessibility", A0R);
        C13991Tnr.A1H("locations", "Array", A0R, map);
        map.put("onClick", "boolean");
        map.put("onClickCapture", "boolean");
        map.put("onMoveShouldSetResponder", "boolean");
        map.put("onMoveShouldSetResponderCapture", "boolean");
        C13992Tns.A12("boolean", "number", map);
        C13992Tns.A10(A0c, "number", A0R, map);
        C13992Tns.A14(A0R, "number", map);
        map.put("shadowColor", A0c);
        map.put("startX", "number");
        map.put("startY", "number");
        C13992Tns.A11("testID", A0R, "number", map);
        map.put("zIndex", "number");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0244, code lost:
        r11.setMixBlendMode(r10, X.C13988Tno.A0e(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x024b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x024c, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.OVER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0254, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.ENTER_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x025c, code lost:
        r11.setAccessibilityCollectionItem(r10, X.C13988Tno.A0J(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0263, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0264, code lost:
        X.C19057WIj.A00(r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0267, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0268, code lost:
        r11.setAccessibilityCollection(r10, X.C13988Tno.A0J(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x026f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0270, code lost:
        r11.setAccessibilityActions(r10, X.C13988Tno.A0I(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0277, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0288, code lost:
        r11.setBackgroundColor(r10, X.C13989Tnp.A0J(r10, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x028f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0290, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.MOVE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0298, code lost:
        r11.setAccessibilityValue(r10, X.C13988Tno.A0J(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x029f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02a0, code lost:
        r11.setViewState(r10, X.C13988Tno.A0J(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02a8, code lost:
        r11.setAccessibilityLabel(r10, X.C13988Tno.A0e(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02b0, code lost:
        r11.setTransform(r10, X.C13988Tno.A0I(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02b8, code lost:
        r11.setImportantForAccessibility(r10, X.C13988Tno.A0e(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x02d8, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.OUT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x02e0, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.OVER_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x02e8, code lost:
        r11.setAccessibilityLiveRegion(r10, X.C13988Tno.A0e(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x02ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x02f0, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.LEAVE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x02f8, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.ENTER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0300, code lost:
        r11.setRole(r10, X.C13988Tno.A0e(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0307, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0328, code lost:
        r11.setRenderToHardwareTexture(r10, X.C13989Tnp.A1Z(r12, r12, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x032f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0330, code lost:
        r11.setAccessibilityRole(r10, X.C13988Tno.A0e(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0337, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0338, code lost:
        r11.setAccessibilityHint(r10, X.C13988Tno.A0e(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x033f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0340, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.LEAVE_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x034f, code lost:
        r11.setTransformOrigin(r10, X.C13988Tno.A0I(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0356, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0357, code lost:
        r11.setTestId(r10, X.C13988Tno.A0e(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x035e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x037f, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.MOVE_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0386, code lost:
        r11.setLocations(r10, X.C13988Tno.A0I(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x038d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x038e, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.CLICK_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x039d, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.OUT_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x03ac, code lost:
        r11.setFilter(r10, X.C13988Tno.A0I(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x03b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x03b4, code lost:
        r1 = X.C13989Tnp.A1Z(r12, r12, false);
        r0 = X.C16483Uvd.CLICK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x03ba, code lost:
        com.facebook.react.uimanager.BaseViewManager.setPointerEventsFlag(r10, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x03bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x03be, code lost:
        r11.setColors(r10, X.C13988Tno.A0I(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x03c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x03ce, code lost:
        r11.setOutlineStyle(r10, X.C13988Tno.A0e(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x03d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x03d6, code lost:
        X.W3s.A0D(r10, X.C13989Tnp.A0g(r10, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x03dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x03de, code lost:
        r0 = X.C13990Tnq.A09(r10, r12);
        r10.setOutlineAmbientShadowColor(r0);
        r10.setOutlineSpotShadowColor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x03e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f8, code lost:
        r11.setNativeId(r10, X.C13988Tno.A0e(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ff, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void EhM(android.view.View r10, com.facebook.react.uimanager.ViewManager r11, java.lang.Object r12, java.lang.String r13) {
        /*
            r9 = this;
            com.facebook.catalyst.views.gradient.ReactAxialGradientManager r11 = (com.facebook.catalyst.views.gradient.ReactAxialGradientManager) r11
            X.U38 r10 = (X.U38) r10
            int r0 = r13.hashCode()
            r7 = 4
            r6 = 3
            r5 = 2
            r4 = 1
            r3 = 0
            switch(r0) {
                case -2018402664: goto L_0x0100;
                case -1898517556: goto L_0x0109;
                case -1721943862: goto L_0x001d;
                case -1721943861: goto L_0x0028;
                case -1589741021: goto L_0x0112;
                case -1489432511: goto L_0x011b;
                case -1474494833: goto L_0x0124;
                case -1471148380: goto L_0x0033;
                case -1354842768: goto L_0x012d;
                case -1351902487: goto L_0x0136;
                case -1274492040: goto L_0x013f;
                case -1267206133: goto L_0x003f;
                case -1247970794: goto L_0x0148;
                case -1228066334: goto L_0x004b;
                case -1219666915: goto L_0x0151;
                case -1197189282: goto L_0x015a;
                case -1036769289: goto L_0x0163;
                case -908189618: goto L_0x0057;
                case -908189617: goto L_0x0063;
                case -892483530: goto L_0x006f;
                case -892483529: goto L_0x007a;
                case -877170387: goto L_0x016c;
                case -781597262: goto L_0x0175;
                case -731417480: goto L_0x0085;
                case -112141555: goto L_0x017e;
                case -101663499: goto L_0x0187;
                case -101359900: goto L_0x0190;
                case -80891667: goto L_0x0199;
                case -40300674: goto L_0x0090;
                case -4379043: goto L_0x009b;
                case 3117789: goto L_0x00a6;
                case 3117790: goto L_0x00b1;
                case 3506294: goto L_0x01a2;
                case 17941018: goto L_0x01ab;
                case 24119801: goto L_0x01b4;
                case 36255470: goto L_0x01bd;
                case 132353428: goto L_0x01c6;
                case 317346576: goto L_0x01cf;
                case 333432965: goto L_0x00bc;
                case 581268560: goto L_0x00c7;
                case 588239831: goto L_0x00d2;
                case 746986311: goto L_0x01d8;
                case 1052666732: goto L_0x01e1;
                case 1146842694: goto L_0x01ea;
                case 1153872867: goto L_0x01f3;
                case 1156088003: goto L_0x01fc;
                case 1247744079: goto L_0x0205;
                case 1247809874: goto L_0x020e;
                case 1287124693: goto L_0x0217;
                case 1349188574: goto L_0x00e6;
                case 1407295349: goto L_0x0011;
                case 1505602511: goto L_0x0220;
                case 1761903244: goto L_0x0229;
                case 1865277756: goto L_0x0232;
                case 1993034687: goto L_0x023b;
                case 2045685618: goto L_0x00dd;
                default: goto L_0x0010;
            }
        L_0x0010:
            return
        L_0x0011:
            java.lang.String r0 = "outlineOffset"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 61
            goto L_0x00f0
        L_0x001d:
            java.lang.String r0 = "translateX"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 5
            goto L_0x00f0
        L_0x0028:
            java.lang.String r0 = "translateY"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 6
            goto L_0x00f0
        L_0x0033:
            java.lang.String r0 = "outlineWidth"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 10
            goto L_0x00f0
        L_0x003f:
            java.lang.String r0 = "opacity"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 15
            goto L_0x00f0
        L_0x004b:
            java.lang.String r0 = "borderTopLeftRadius"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 17
            goto L_0x00f0
        L_0x0057:
            java.lang.String r0 = "scaleX"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 22
            goto L_0x00f0
        L_0x0063:
            java.lang.String r0 = "scaleY"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 23
            goto L_0x00f0
        L_0x006f:
            java.lang.String r0 = "startX"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 24
            goto L_0x00f0
        L_0x007a:
            java.lang.String r0 = "startY"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 25
            goto L_0x00f0
        L_0x0085:
            java.lang.String r0 = "zIndex"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 28
            goto L_0x00f0
        L_0x0090:
            java.lang.String r0 = "rotation"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 34
            goto L_0x00f0
        L_0x009b:
            java.lang.String r0 = "elevation"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 35
            goto L_0x00f0
        L_0x00a6:
            java.lang.String r0 = "endX"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 36
            goto L_0x00f0
        L_0x00b1:
            java.lang.String r0 = "endY"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 37
            goto L_0x00f0
        L_0x00bc:
            java.lang.String r0 = "borderTopRightRadius"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 45
            goto L_0x00f0
        L_0x00c7:
            java.lang.String r0 = "borderBottomLeftRadius"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 47
            goto L_0x00f0
        L_0x00d2:
            java.lang.String r0 = "borderBottomRightRadius"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 48
            goto L_0x00f0
        L_0x00dd:
            java.lang.String r0 = "nativeID"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x00f8
            return
        L_0x00e6:
            java.lang.String r0 = "borderRadius"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            r8 = 58
        L_0x00f0:
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0 = 0
            switch(r8) {
                case 0: goto L_0x0244;
                case 1: goto L_0x0010;
                case 2: goto L_0x0254;
                case 3: goto L_0x0010;
                case 4: goto L_0x0010;
                case 5: goto L_0x03f1;
                case 6: goto L_0x03e9;
                case 7: goto L_0x03de;
                case 8: goto L_0x03d6;
                case 9: goto L_0x03ce;
                case 10: goto L_0x03c6;
                case 11: goto L_0x03be;
                case 12: goto L_0x03b4;
                case 13: goto L_0x0010;
                case 14: goto L_0x03ac;
                case 15: goto L_0x03a4;
                case 16: goto L_0x039d;
                case 17: goto L_0x0395;
                case 18: goto L_0x038e;
                case 19: goto L_0x0386;
                case 20: goto L_0x0010;
                case 21: goto L_0x037f;
                case 22: goto L_0x0377;
                case 23: goto L_0x036f;
                case 24: goto L_0x0367;
                case 25: goto L_0x035f;
                case 26: goto L_0x0357;
                case 27: goto L_0x034f;
                case 28: goto L_0x0347;
                case 29: goto L_0x0010;
                case 30: goto L_0x0340;
                case 31: goto L_0x0338;
                case 32: goto L_0x0330;
                case 33: goto L_0x0328;
                case 34: goto L_0x0320;
                case 35: goto L_0x0318;
                case 36: goto L_0x0310;
                case 37: goto L_0x0308;
                case 38: goto L_0x0300;
                case 39: goto L_0x02f8;
                case 40: goto L_0x02f0;
                case 41: goto L_0x02e8;
                case 42: goto L_0x02e0;
                case 43: goto L_0x02d8;
                case 44: goto L_0x0010;
                case 45: goto L_0x02d0;
                case 46: goto L_0x0010;
                case 47: goto L_0x02c8;
                case 48: goto L_0x02c0;
                case 49: goto L_0x02b8;
                case 50: goto L_0x02b0;
                case 51: goto L_0x02a8;
                case 52: goto L_0x02a0;
                case 53: goto L_0x0298;
                case 54: goto L_0x0010;
                case 55: goto L_0x0290;
                case 56: goto L_0x024c;
                case 57: goto L_0x0288;
                case 58: goto L_0x0280;
                case 59: goto L_0x0010;
                case 60: goto L_0x0010;
                case 61: goto L_0x0278;
                case 62: goto L_0x0010;
                case 63: goto L_0x0270;
                case 64: goto L_0x0010;
                case 65: goto L_0x0010;
                case 66: goto L_0x0268;
                case 67: goto L_0x0264;
                case 68: goto L_0x0010;
                case 69: goto L_0x025c;
                default: goto L_0x00f8;
            }
        L_0x00f8:
            java.lang.String r0 = X.C13988Tno.A0e(r12)
            r11.setNativeId(r10, r0)
            return
        L_0x0100:
            java.lang.String r0 = "mixBlendMode"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0244
            return
        L_0x0109:
            java.lang.String r0 = "onPointerEnterCapture"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0254
            return
        L_0x0112:
            java.lang.String r0 = "shadowColor"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x03de
            return
        L_0x011b:
            java.lang.String r0 = "outlineColor"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x03d6
            return
        L_0x0124:
            java.lang.String r0 = "outlineStyle"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x03ce
            return
        L_0x012d:
            java.lang.String r0 = "colors"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x03be
            return
        L_0x0136:
            java.lang.String r0 = "onClick"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x03b4
            return
        L_0x013f:
            java.lang.String r0 = "filter"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x03ac
            return
        L_0x0148:
            java.lang.String r0 = "onPointerOutCapture"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x039d
            return
        L_0x0151:
            java.lang.String r0 = "onClickCapture"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x038e
            return
        L_0x015a:
            java.lang.String r0 = "locations"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0386
            return
        L_0x0163:
            java.lang.String r0 = "onPointerMoveCapture"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x037f
            return
        L_0x016c:
            java.lang.String r0 = "testID"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0357
            return
        L_0x0175:
            java.lang.String r0 = "transformOrigin"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x034f
            return
        L_0x017e:
            java.lang.String r0 = "onPointerLeaveCapture"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0340
            return
        L_0x0187:
            java.lang.String r0 = "accessibilityHint"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0338
            return
        L_0x0190:
            java.lang.String r0 = "accessibilityRole"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0330
            return
        L_0x0199:
            java.lang.String r0 = "renderToHardwareTextureAndroid"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0328
            return
        L_0x01a2:
            java.lang.String r0 = "role"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0300
            return
        L_0x01ab:
            java.lang.String r0 = "onPointerEnter"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x02f8
            return
        L_0x01b4:
            java.lang.String r0 = "onPointerLeave"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x02f0
            return
        L_0x01bd:
            java.lang.String r0 = "accessibilityLiveRegion"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x02e8
            return
        L_0x01c6:
            java.lang.String r0 = "onPointerOverCapture"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x02e0
            return
        L_0x01cf:
            java.lang.String r0 = "onPointerOut"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x02d8
            return
        L_0x01d8:
            java.lang.String r0 = "importantForAccessibility"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x02b8
            return
        L_0x01e1:
            java.lang.String r0 = "transform"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x02b0
            return
        L_0x01ea:
            java.lang.String r0 = "accessibilityLabel"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x02a8
            return
        L_0x01f3:
            java.lang.String r0 = "accessibilityState"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x02a0
            return
        L_0x01fc:
            java.lang.String r0 = "accessibilityValue"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0298
            return
        L_0x0205:
            java.lang.String r0 = "onPointerMove"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0290
            return
        L_0x020e:
            java.lang.String r0 = "onPointerOver"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x024c
            return
        L_0x0217:
            java.lang.String r0 = "backgroundColor"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0288
            return
        L_0x0220:
            java.lang.String r0 = "accessibilityActions"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0270
            return
        L_0x0229:
            java.lang.String r0 = "accessibilityCollection"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0268
            return
        L_0x0232:
            java.lang.String r0 = "accessibilityLabelledBy"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0264
            return
        L_0x023b:
            java.lang.String r0 = "accessibilityCollectionItem"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x025c
            return
        L_0x0244:
            java.lang.String r0 = X.C13988Tno.A0e(r12)
            r11.setMixBlendMode(r10, r0)
            return
        L_0x024c:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.OVER
            goto L_0x03ba
        L_0x0254:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.ENTER_CAPTURE
            goto L_0x03ba
        L_0x025c:
            com.facebook.react.bridge.ReadableMap r0 = X.C13988Tno.A0J(r12)
            r11.setAccessibilityCollectionItem(r10, r0)
            return
        L_0x0264:
            X.C19057WIj.A00(r10, r11, r12)
            return
        L_0x0268:
            com.facebook.react.bridge.ReadableMap r0 = X.C13988Tno.A0J(r12)
            r11.setAccessibilityCollection(r10, r0)
            return
        L_0x0270:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r12)
            r11.setAccessibilityActions(r10, r0)
            return
        L_0x0278:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            X.W3s.A05(r10, r0)
            return
        L_0x0280:
            float r0 = X.C13989Tnp.A07(r12, r12, r1)
            r11.setBorderRadius(r10, r3, r0)
            return
        L_0x0288:
            int r0 = X.C13989Tnp.A0J(r10, r12)
            r11.setBackgroundColor(r10, r0)
            return
        L_0x0290:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.MOVE
            goto L_0x03ba
        L_0x0298:
            com.facebook.react.bridge.ReadableMap r0 = X.C13988Tno.A0J(r12)
            r11.setAccessibilityValue(r10, r0)
            return
        L_0x02a0:
            com.facebook.react.bridge.ReadableMap r0 = X.C13988Tno.A0J(r12)
            r11.setViewState(r10, r0)
            return
        L_0x02a8:
            java.lang.String r0 = X.C13988Tno.A0e(r12)
            r11.setAccessibilityLabel(r10, r0)
            return
        L_0x02b0:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r12)
            r11.setTransform(r10, r0)
            return
        L_0x02b8:
            java.lang.String r0 = X.C13988Tno.A0e(r12)
            r11.setImportantForAccessibility(r10, r0)
            return
        L_0x02c0:
            float r0 = X.C13989Tnp.A07(r12, r12, r1)
            r11.setBorderRadius(r10, r6, r0)
            return
        L_0x02c8:
            float r0 = X.C13989Tnp.A07(r12, r12, r1)
            r11.setBorderRadius(r10, r7, r0)
            return
        L_0x02d0:
            float r0 = X.C13989Tnp.A07(r12, r12, r1)
            r11.setBorderRadius(r10, r5, r0)
            return
        L_0x02d8:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.OUT
            goto L_0x03ba
        L_0x02e0:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.OVER_CAPTURE
            goto L_0x03ba
        L_0x02e8:
            java.lang.String r0 = X.C13988Tno.A0e(r12)
            r11.setAccessibilityLiveRegion(r10, r0)
            return
        L_0x02f0:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.LEAVE
            goto L_0x03ba
        L_0x02f8:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.ENTER
            goto L_0x03ba
        L_0x0300:
            java.lang.String r0 = X.C13988Tno.A0e(r12)
            r11.setRole(r10, r0)
            return
        L_0x0308:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            r11.setEndY((X.U38) r10, (float) r0)
            return
        L_0x0310:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            r11.setEndX((X.U38) r10, (float) r0)
            return
        L_0x0318:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            r11.setElevation(r10, r0)
            return
        L_0x0320:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            r10.setRotation(r0)
            return
        L_0x0328:
            boolean r0 = X.C13989Tnp.A1Z(r12, r12, r3)
            r11.setRenderToHardwareTexture(r10, r0)
            return
        L_0x0330:
            java.lang.String r0 = X.C13988Tno.A0e(r12)
            r11.setAccessibilityRole(r10, r0)
            return
        L_0x0338:
            java.lang.String r0 = X.C13988Tno.A0e(r12)
            r11.setAccessibilityHint(r10, r0)
            return
        L_0x0340:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.LEAVE_CAPTURE
            goto L_0x03ba
        L_0x0347:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            r11.setZIndex(r10, r0)
            return
        L_0x034f:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r12)
            r11.setTransformOrigin(r10, r0)
            return
        L_0x0357:
            java.lang.String r0 = X.C13988Tno.A0e(r12)
            r11.setTestId(r10, r0)
            return
        L_0x035f:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            r11.setStartY((X.U38) r10, (float) r0)
            return
        L_0x0367:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            r11.setStartX((X.U38) r10, (float) r0)
            return
        L_0x036f:
            float r0 = X.C13989Tnp.A07(r12, r12, r2)
            r10.setScaleY(r0)
            return
        L_0x0377:
            float r0 = X.C13989Tnp.A07(r12, r12, r2)
            r10.setScaleX(r0)
            return
        L_0x037f:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.MOVE_CAPTURE
            goto L_0x03ba
        L_0x0386:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r12)
            r11.setLocations((X.U38) r10, (com.facebook.react.bridge.ReadableArray) r0)
            return
        L_0x038e:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.CLICK_CAPTURE
            goto L_0x03ba
        L_0x0395:
            float r0 = X.C13989Tnp.A07(r12, r12, r1)
            r11.setBorderRadius(r10, r4, r0)
            return
        L_0x039d:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.OUT_CAPTURE
            goto L_0x03ba
        L_0x03a4:
            float r0 = X.C13989Tnp.A07(r12, r12, r2)
            r11.setOpacity(r10, r0)
            return
        L_0x03ac:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r12)
            r11.setFilter(r10, r0)
            return
        L_0x03b4:
            boolean r1 = X.C13989Tnp.A1Z(r12, r12, r3)
            X.Uvd r0 = X.C16483Uvd.CLICK
        L_0x03ba:
            com.facebook.react.uimanager.BaseViewManager.setPointerEventsFlag(r10, r0, r1)
            return
        L_0x03be:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r12)
            r11.setColors((X.U38) r10, (com.facebook.react.bridge.ReadableArray) r0)
            return
        L_0x03c6:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            X.W3s.A06(r10, r0)
            return
        L_0x03ce:
            java.lang.String r0 = X.C13988Tno.A0e(r12)
            r11.setOutlineStyle(r10, r0)
            return
        L_0x03d6:
            java.lang.Integer r0 = X.C13989Tnp.A0g(r10, r12)
            X.W3s.A0D(r10, r0)
            return
        L_0x03de:
            int r0 = X.C13990Tnq.A09(r10, r12)
            r10.setOutlineAmbientShadowColor(r0)
            r10.setOutlineSpotShadowColor(r0)
            return
        L_0x03e9:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            r11.setTranslateY(r10, r0)
            return
        L_0x03f1:
            float r0 = X.C13989Tnp.A07(r12, r12, r0)
            r11.setTranslateX(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.views.gradient.ReactAxialGradientManager$$PropsSetter.EhM(android.view.View, com.facebook.react.uimanager.ViewManager, java.lang.Object, java.lang.String):void");
    }
}
