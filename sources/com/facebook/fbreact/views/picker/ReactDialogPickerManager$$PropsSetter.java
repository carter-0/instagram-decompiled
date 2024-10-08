package com.facebook.fbreact.views.picker;

import X.C13990Tnq;
import X.C13991Tnr;
import X.C13992Tns;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;

public class ReactDialogPickerManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final void Bhz(Map map) {
        String A0R = C13992Tns.A0R(map);
        String A0c = C13990Tnq.A0c(map);
        map.put("color", A0c);
        map.put("elevation", "number");
        C13991Tnr.A1I("enabled", "boolean", map);
        map.put("importantForAccessibility", A0R);
        C13991Tnr.A1H(DialogModule.KEY_ITEMS, "Array", A0R, map);
        C13992Tns.A1B(map);
        C13992Tns.A12("boolean", "number", map);
        C13992Tns.A10(A0c, "number", A0R, map);
        map.put("prompt", A0R);
        C13992Tns.A14(A0R, "number", map);
        map.put("selected", "number");
        map.put("shadowColor", A0c);
        C13992Tns.A11("testID", A0R, "number", map);
        map.put("zIndex", "number");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01ef, code lost:
        r7.setMixBlendMode(r6, X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x01f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x01f7, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.OVER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x01ff, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.ENTER_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0207, code lost:
        r7.setAccessibilityCollectionItem(r6, X.C13988Tno.A0J(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x020e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x020f, code lost:
        X.C19057WIj.A00(r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0212, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0213, code lost:
        r7.setAccessibilityCollection(r6, X.C13988Tno.A0J(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x021a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x021b, code lost:
        r7.setAccessibilityActions(r6, X.C13988Tno.A0I(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0222, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x022b, code lost:
        r7.setBackgroundColor(r6, X.C13989Tnp.A0J(r6, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0232, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0233, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.MOVE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x023b, code lost:
        r6.setStagedSelection(X.C13991Tnr.A00(0, r8, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0242, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0243, code lost:
        r7.setAccessibilityValue(r6, X.C13988Tno.A0J(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x024a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x024b, code lost:
        r7.setViewState(r6, X.C13988Tno.A0J(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0252, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0253, code lost:
        r7.setAccessibilityLabel(r6, X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x025a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x025b, code lost:
        r7.setTransform(r6, X.C13988Tno.A0I(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0262, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0263, code lost:
        r7.setImportantForAccessibility(r6, X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x026a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x026b, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.OUT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0273, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.OVER_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x027b, code lost:
        r7.setItems(r6, X.C13988Tno.A0I(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0282, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0283, code lost:
        r6.A02 = X.C13989Tnp.A0g(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0289, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x028a, code lost:
        r7.setAccessibilityLiveRegion(r6, X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0291, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0292, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.LEAVE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x029a, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.ENTER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02a2, code lost:
        r7.setRole(r6, X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02ba, code lost:
        r7.setRenderToHardwareTexture(r6, X.C13989Tnp.A1Z(r8, r8, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02c2, code lost:
        r7.setAccessibilityRole(r6, X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x02c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x02ca, code lost:
        r7.setAccessibilityHint(r6, X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x02d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x02d2, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.LEAVE_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x02e1, code lost:
        r7.setTransformOrigin(r6, X.C13988Tno.A0I(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x02e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x02e9, code lost:
        r7.setTestId(r6, X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x02f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0301, code lost:
        r6.setPrompt(X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0308, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0309, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.MOVE_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0310, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.CLICK_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0317, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.OUT_CAPTURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0326, code lost:
        r7.setFilter(r6, X.C13988Tno.A0I(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x032d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x032e, code lost:
        r1 = X.C13989Tnp.A1Z(r8, r8, false);
        r0 = X.C16483Uvd.CLICK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0334, code lost:
        com.facebook.react.uimanager.BaseViewManager.setPointerEventsFlag(r6, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0337, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0340, code lost:
        r7.setOutlineStyle(r6, X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0347, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0348, code lost:
        X.W3s.A0D(r6, X.C13989Tnp.A0g(r6, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x034f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0350, code lost:
        r0 = X.C13990Tnq.A09(r6, r8);
        r6.setOutlineAmbientShadowColor(r0);
        r6.setOutlineSpotShadowColor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x035a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x035b, code lost:
        r6.setEnabled(X.C13989Tnp.A1Z(r8, r8, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0362, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        r7.setNativeId(r6, X.C13988Tno.A0e(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void EhM(android.view.View r6, com.facebook.react.uimanager.ViewManager r7, java.lang.Object r8, java.lang.String r9) {
        /*
            r5 = this;
            com.facebook.fbreact.views.picker.ReactPickerManager r7 = (com.facebook.fbreact.views.picker.ReactPickerManager) r7
            X.U6E r6 = (X.U6E) r6
            int r0 = r9.hashCode()
            r3 = 1
            r2 = 0
            switch(r0) {
                case -2018402664: goto L_0x0090;
                case -1898517556: goto L_0x0099;
                case -1721943862: goto L_0x0019;
                case -1721943861: goto L_0x0023;
                case -1609594047: goto L_0x00a2;
                case -1589741021: goto L_0x00ab;
                case -1489432511: goto L_0x00b4;
                case -1474494833: goto L_0x00bd;
                case -1471148380: goto L_0x002d;
                case -1351902487: goto L_0x00c6;
                case -1274492040: goto L_0x00cf;
                case -1267206133: goto L_0x0038;
                case -1247970794: goto L_0x00d8;
                case -1219666915: goto L_0x00e1;
                case -1036769289: goto L_0x00ea;
                case -979805852: goto L_0x00f3;
                case -908189618: goto L_0x0043;
                case -908189617: goto L_0x004e;
                case -877170387: goto L_0x00fc;
                case -781597262: goto L_0x0105;
                case -731417480: goto L_0x0059;
                case -112141555: goto L_0x010e;
                case -101663499: goto L_0x0117;
                case -101359900: goto L_0x0120;
                case -80891667: goto L_0x0129;
                case -40300674: goto L_0x0064;
                case -4379043: goto L_0x0078;
                case 3506294: goto L_0x0132;
                case 17941018: goto L_0x013b;
                case 24119801: goto L_0x0144;
                case 36255470: goto L_0x014d;
                case 94842723: goto L_0x0156;
                case 100526016: goto L_0x015f;
                case 132353428: goto L_0x0168;
                case 317346576: goto L_0x0171;
                case 746986311: goto L_0x017a;
                case 1052666732: goto L_0x0183;
                case 1146842694: goto L_0x018c;
                case 1153872867: goto L_0x0195;
                case 1156088003: goto L_0x019e;
                case 1191572123: goto L_0x01a7;
                case 1247744079: goto L_0x01b0;
                case 1247809874: goto L_0x01b9;
                case 1287124693: goto L_0x01c2;
                case 1407295349: goto L_0x000e;
                case 1505602511: goto L_0x01cb;
                case 1761903244: goto L_0x01d4;
                case 1865277756: goto L_0x01dd;
                case 1993034687: goto L_0x01e6;
                case 2045685618: goto L_0x006f;
                default: goto L_0x000d;
            }
        L_0x000d:
            return
        L_0x000e:
            java.lang.String r0 = "outlineOffset"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000d
            r4 = 55
            goto L_0x0082
        L_0x0019:
            java.lang.String r0 = "translateX"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000d
            r4 = 5
            goto L_0x0082
        L_0x0023:
            java.lang.String r0 = "translateY"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000d
            r4 = 6
            goto L_0x0082
        L_0x002d:
            java.lang.String r0 = "outlineWidth"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000d
            r4 = 11
            goto L_0x0082
        L_0x0038:
            java.lang.String r0 = "opacity"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000d
            r4 = 15
            goto L_0x0082
        L_0x0043:
            java.lang.String r0 = "scaleX"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000d
            r4 = 21
            goto L_0x0082
        L_0x004e:
            java.lang.String r0 = "scaleY"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000d
            r4 = 22
            goto L_0x0082
        L_0x0059:
            java.lang.String r0 = "zIndex"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000d
            r4 = 25
            goto L_0x0082
        L_0x0064:
            java.lang.String r0 = "rotation"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000d
            r4 = 31
            goto L_0x0082
        L_0x006f:
            java.lang.String r0 = "nativeID"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0088
            return
        L_0x0078:
            java.lang.String r0 = "elevation"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000d
            r4 = 32
        L_0x0082:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            switch(r4) {
                case 0: goto L_0x01ef;
                case 1: goto L_0x000d;
                case 2: goto L_0x01ff;
                case 3: goto L_0x000d;
                case 4: goto L_0x000d;
                case 5: goto L_0x036b;
                case 6: goto L_0x0363;
                case 7: goto L_0x035b;
                case 8: goto L_0x0350;
                case 9: goto L_0x0348;
                case 10: goto L_0x0340;
                case 11: goto L_0x0338;
                case 12: goto L_0x032e;
                case 13: goto L_0x000d;
                case 14: goto L_0x0326;
                case 15: goto L_0x031e;
                case 16: goto L_0x0317;
                case 17: goto L_0x0310;
                case 18: goto L_0x000d;
                case 19: goto L_0x0309;
                case 20: goto L_0x0301;
                case 21: goto L_0x02f9;
                case 22: goto L_0x02f1;
                case 23: goto L_0x02e9;
                case 24: goto L_0x02e1;
                case 25: goto L_0x02d9;
                case 26: goto L_0x000d;
                case 27: goto L_0x02d2;
                case 28: goto L_0x02ca;
                case 29: goto L_0x02c2;
                case 30: goto L_0x02ba;
                case 31: goto L_0x02b2;
                case 32: goto L_0x02aa;
                case 33: goto L_0x02a2;
                case 34: goto L_0x029a;
                case 35: goto L_0x0292;
                case 36: goto L_0x028a;
                case 37: goto L_0x0283;
                case 38: goto L_0x027b;
                case 39: goto L_0x0273;
                case 40: goto L_0x026b;
                case 41: goto L_0x000d;
                case 42: goto L_0x000d;
                case 43: goto L_0x0263;
                case 44: goto L_0x025b;
                case 45: goto L_0x0253;
                case 46: goto L_0x024b;
                case 47: goto L_0x0243;
                case 48: goto L_0x023b;
                case 49: goto L_0x000d;
                case 50: goto L_0x0233;
                case 51: goto L_0x01f7;
                case 52: goto L_0x022b;
                case 53: goto L_0x000d;
                case 54: goto L_0x000d;
                case 55: goto L_0x0223;
                case 56: goto L_0x000d;
                case 57: goto L_0x021b;
                case 58: goto L_0x000d;
                case 59: goto L_0x000d;
                case 60: goto L_0x0213;
                case 61: goto L_0x020f;
                case 62: goto L_0x000d;
                case 63: goto L_0x0207;
                default: goto L_0x0088;
            }
        L_0x0088:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r7.setNativeId(r6, r0)
            return
        L_0x0090:
            java.lang.String r0 = "mixBlendMode"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x01ef
            return
        L_0x0099:
            java.lang.String r0 = "onPointerEnterCapture"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x01ff
            return
        L_0x00a2:
            java.lang.String r0 = "enabled"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x035b
            return
        L_0x00ab:
            java.lang.String r0 = "shadowColor"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0350
            return
        L_0x00b4:
            java.lang.String r0 = "outlineColor"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0348
            return
        L_0x00bd:
            java.lang.String r0 = "outlineStyle"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0340
            return
        L_0x00c6:
            java.lang.String r0 = "onClick"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x032e
            return
        L_0x00cf:
            java.lang.String r0 = "filter"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0326
            return
        L_0x00d8:
            java.lang.String r0 = "onPointerOutCapture"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0317
            return
        L_0x00e1:
            java.lang.String r0 = "onClickCapture"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0310
            return
        L_0x00ea:
            java.lang.String r0 = "onPointerMoveCapture"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0309
            return
        L_0x00f3:
            java.lang.String r0 = "prompt"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0301
            return
        L_0x00fc:
            java.lang.String r0 = "testID"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x02e9
            return
        L_0x0105:
            java.lang.String r0 = "transformOrigin"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x02e1
            return
        L_0x010e:
            java.lang.String r0 = "onPointerLeaveCapture"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x02d2
            return
        L_0x0117:
            java.lang.String r0 = "accessibilityHint"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x02ca
            return
        L_0x0120:
            java.lang.String r0 = "accessibilityRole"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x02c2
            return
        L_0x0129:
            java.lang.String r0 = "renderToHardwareTextureAndroid"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x02ba
            return
        L_0x0132:
            java.lang.String r0 = "role"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x02a2
            return
        L_0x013b:
            java.lang.String r0 = "onPointerEnter"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x029a
            return
        L_0x0144:
            java.lang.String r0 = "onPointerLeave"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0292
            return
        L_0x014d:
            java.lang.String r0 = "accessibilityLiveRegion"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x028a
            return
        L_0x0156:
            java.lang.String r0 = "color"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0283
            return
        L_0x015f:
            java.lang.String r0 = "items"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x027b
            return
        L_0x0168:
            java.lang.String r0 = "onPointerOverCapture"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0273
            return
        L_0x0171:
            java.lang.String r0 = "onPointerOut"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x026b
            return
        L_0x017a:
            java.lang.String r0 = "importantForAccessibility"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0263
            return
        L_0x0183:
            java.lang.String r0 = "transform"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x025b
            return
        L_0x018c:
            java.lang.String r0 = "accessibilityLabel"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0253
            return
        L_0x0195:
            java.lang.String r0 = "accessibilityState"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x024b
            return
        L_0x019e:
            java.lang.String r0 = "accessibilityValue"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0243
            return
        L_0x01a7:
            java.lang.String r0 = "selected"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x023b
            return
        L_0x01b0:
            java.lang.String r0 = "onPointerMove"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0233
            return
        L_0x01b9:
            java.lang.String r0 = "onPointerOver"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x01f7
            return
        L_0x01c2:
            java.lang.String r0 = "backgroundColor"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x022b
            return
        L_0x01cb:
            java.lang.String r0 = "accessibilityActions"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x021b
            return
        L_0x01d4:
            java.lang.String r0 = "accessibilityCollection"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0213
            return
        L_0x01dd:
            java.lang.String r0 = "accessibilityLabelledBy"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x020f
            return
        L_0x01e6:
            java.lang.String r0 = "accessibilityCollectionItem"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0207
            return
        L_0x01ef:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r7.setMixBlendMode(r6, r0)
            return
        L_0x01f7:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.OVER
            goto L_0x0334
        L_0x01ff:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.ENTER_CAPTURE
            goto L_0x0334
        L_0x0207:
            com.facebook.react.bridge.ReadableMap r0 = X.C13988Tno.A0J(r8)
            r7.setAccessibilityCollectionItem(r6, r0)
            return
        L_0x020f:
            X.C19057WIj.A00(r6, r7, r8)
            return
        L_0x0213:
            com.facebook.react.bridge.ReadableMap r0 = X.C13988Tno.A0J(r8)
            r7.setAccessibilityCollection(r6, r0)
            return
        L_0x021b:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r8)
            r7.setAccessibilityActions(r6, r0)
            return
        L_0x0223:
            float r0 = X.C13989Tnp.A07(r8, r8, r0)
            X.W3s.A05(r6, r0)
            return
        L_0x022b:
            int r0 = X.C13989Tnp.A0J(r6, r8)
            r7.setBackgroundColor(r6, r0)
            return
        L_0x0233:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.MOVE
            goto L_0x0334
        L_0x023b:
            int r0 = X.C13991Tnr.A00(r2, r8, r8)
            r6.setStagedSelection(r0)
            return
        L_0x0243:
            com.facebook.react.bridge.ReadableMap r0 = X.C13988Tno.A0J(r8)
            r7.setAccessibilityValue(r6, r0)
            return
        L_0x024b:
            com.facebook.react.bridge.ReadableMap r0 = X.C13988Tno.A0J(r8)
            r7.setViewState(r6, r0)
            return
        L_0x0253:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r7.setAccessibilityLabel(r6, r0)
            return
        L_0x025b:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r8)
            r7.setTransform(r6, r0)
            return
        L_0x0263:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r7.setImportantForAccessibility(r6, r0)
            return
        L_0x026b:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.OUT
            goto L_0x0334
        L_0x0273:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.OVER_CAPTURE
            goto L_0x0334
        L_0x027b:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r8)
            r7.setItems(r6, r0)
            return
        L_0x0283:
            java.lang.Integer r0 = X.C13989Tnp.A0g(r6, r8)
            r6.A02 = r0
            return
        L_0x028a:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r7.setAccessibilityLiveRegion(r6, r0)
            return
        L_0x0292:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.LEAVE
            goto L_0x0334
        L_0x029a:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.ENTER
            goto L_0x0334
        L_0x02a2:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r7.setRole(r6, r0)
            return
        L_0x02aa:
            float r0 = X.C13989Tnp.A07(r8, r8, r0)
            r7.setElevation(r6, r0)
            return
        L_0x02b2:
            float r0 = X.C13989Tnp.A07(r8, r8, r0)
            r6.setRotation(r0)
            return
        L_0x02ba:
            boolean r0 = X.C13989Tnp.A1Z(r8, r8, r2)
            r7.setRenderToHardwareTexture(r6, r0)
            return
        L_0x02c2:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r7.setAccessibilityRole(r6, r0)
            return
        L_0x02ca:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r7.setAccessibilityHint(r6, r0)
            return
        L_0x02d2:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.LEAVE_CAPTURE
            goto L_0x0334
        L_0x02d9:
            float r0 = X.C13989Tnp.A07(r8, r8, r0)
            r7.setZIndex(r6, r0)
            return
        L_0x02e1:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r8)
            r7.setTransformOrigin(r6, r0)
            return
        L_0x02e9:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r7.setTestId(r6, r0)
            return
        L_0x02f1:
            float r0 = X.C13989Tnp.A07(r8, r8, r1)
            r6.setScaleY(r0)
            return
        L_0x02f9:
            float r0 = X.C13989Tnp.A07(r8, r8, r1)
            r6.setScaleX(r0)
            return
        L_0x0301:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r6.setPrompt(r0)
            return
        L_0x0309:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.MOVE_CAPTURE
            goto L_0x0334
        L_0x0310:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.CLICK_CAPTURE
            goto L_0x0334
        L_0x0317:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.OUT_CAPTURE
            goto L_0x0334
        L_0x031e:
            float r0 = X.C13989Tnp.A07(r8, r8, r1)
            r7.setOpacity(r6, r0)
            return
        L_0x0326:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r8)
            r7.setFilter(r6, r0)
            return
        L_0x032e:
            boolean r1 = X.C13989Tnp.A1Z(r8, r8, r2)
            X.Uvd r0 = X.C16483Uvd.CLICK
        L_0x0334:
            com.facebook.react.uimanager.BaseViewManager.setPointerEventsFlag(r6, r0, r1)
            return
        L_0x0338:
            float r0 = X.C13989Tnp.A07(r8, r8, r0)
            X.W3s.A06(r6, r0)
            return
        L_0x0340:
            java.lang.String r0 = X.C13988Tno.A0e(r8)
            r7.setOutlineStyle(r6, r0)
            return
        L_0x0348:
            java.lang.Integer r0 = X.C13989Tnp.A0g(r6, r8)
            X.W3s.A0D(r6, r0)
            return
        L_0x0350:
            int r0 = X.C13990Tnq.A09(r6, r8)
            r6.setOutlineAmbientShadowColor(r0)
            r6.setOutlineSpotShadowColor(r0)
            return
        L_0x035b:
            boolean r0 = X.C13989Tnp.A1Z(r8, r8, r3)
            r6.setEnabled(r0)
            return
        L_0x0363:
            float r0 = X.C13989Tnp.A07(r8, r8, r0)
            r7.setTranslateY(r6, r0)
            return
        L_0x036b:
            float r0 = X.C13989Tnp.A07(r8, r8, r0)
            r7.setTranslateX(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbreact.views.picker.ReactDialogPickerManager$$PropsSetter.EhM(android.view.View, com.facebook.react.uimanager.ViewManager, java.lang.Object, java.lang.String):void");
    }
}
