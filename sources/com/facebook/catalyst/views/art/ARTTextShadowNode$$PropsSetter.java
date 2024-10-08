package com.facebook.catalyst.views.art;

import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import java.util.Map;

public class ARTTextShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final void Bhz(Map map) {
        map.put("alignment", "number");
        map.put("d", "Array");
        map.put("fill", "Array");
        map.put("frame", "Map");
        map.put("opacity", "number");
        map.put("stroke", "Array");
        map.put("strokeCap", "number");
        map.put("strokeDash", "Array");
        map.put("strokeJoin", "number");
        map.put("strokeWidth", "number");
        map.put("transform", "Array");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        r5.A00 = X.C13991Tnr.A00(0, r6, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        r5.setTransform(X.C13988Tno.A0I(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008d, code lost:
        r5.A01 = X.C13988Tno.A0J(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        r5.setFill(X.C13988Tno.A0I(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009c, code lost:
        r5.setShapePath(X.C13988Tno.A0I(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        r5.setStrokeCap(X.C13991Tnr.A00(1, r6, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ac, code lost:
        r5.setStrokeJoin(X.C13991Tnr.A00(1, r6, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b4, code lost:
        r5.setStrokeDash(X.C13988Tno.A0I(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        r5.setStroke(X.C13988Tno.A0I(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void EhL(com.facebook.react.uimanager.ReactShadowNode r5, java.lang.Object r6, java.lang.String r7) {
        /*
            r4 = this;
            com.facebook.catalyst.views.art.ARTTextShadowNode r5 = (com.facebook.catalyst.views.art.ARTTextShadowNode) r5
            int r0 = r7.hashCode()
            r3 = 0
            r2 = 1
            switch(r0) {
                case -1267206133: goto L_0x0017;
                case -891980232: goto L_0x0075;
                case -631243286: goto L_0x006c;
                case -631051390: goto L_0x0063;
                case -20363654: goto L_0x005a;
                case 100: goto L_0x0051;
                case 3143043: goto L_0x0048;
                case 97692013: goto L_0x003f;
                case 1052666732: goto L_0x0036;
                case 1767875043: goto L_0x002d;
                case 1924065902: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            java.lang.String r0 = "strokeWidth"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x000b
            r1 = 10
            goto L_0x0020
        L_0x0017:
            java.lang.String r0 = "opacity"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x000b
            r1 = 0
        L_0x0020:
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r1) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00bc;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00ac;
                case 4: goto L_0x00a4;
                case 5: goto L_0x009c;
                case 6: goto L_0x0094;
                case 7: goto L_0x008d;
                case 8: goto L_0x0085;
                case 9: goto L_0x007e;
                default: goto L_0x0025;
            }
        L_0x0025:
            float r0 = X.C13989Tnp.A07(r6, r6, r0)
            r5.setStrokeWidth(r0)
            return
        L_0x002d:
            java.lang.String r0 = "alignment"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x007e
            return
        L_0x0036:
            java.lang.String r0 = "transform"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0085
            return
        L_0x003f:
            java.lang.String r0 = "frame"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x008d
            return
        L_0x0048:
            java.lang.String r0 = "fill"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0094
            return
        L_0x0051:
            java.lang.String r0 = "d"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x009c
            return
        L_0x005a:
            java.lang.String r0 = "strokeCap"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00a4
            return
        L_0x0063:
            java.lang.String r0 = "strokeJoin"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00ac
            return
        L_0x006c:
            java.lang.String r0 = "strokeDash"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00b4
            return
        L_0x0075:
            java.lang.String r0 = "stroke"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00bc
            return
        L_0x007e:
            int r0 = X.C13991Tnr.A00(r3, r6, r6)
            r5.A00 = r0
            return
        L_0x0085:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r6)
            r5.setTransform(r0)
            return
        L_0x008d:
            com.facebook.react.bridge.ReadableMap r0 = X.C13988Tno.A0J(r6)
            r5.A01 = r0
            return
        L_0x0094:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r6)
            r5.setFill(r0)
            return
        L_0x009c:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r6)
            r5.setShapePath(r0)
            return
        L_0x00a4:
            int r0 = X.C13991Tnr.A00(r2, r6, r6)
            r5.setStrokeCap(r0)
            return
        L_0x00ac:
            int r0 = X.C13991Tnr.A00(r2, r6, r6)
            r5.setStrokeJoin(r0)
            return
        L_0x00b4:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r6)
            r5.setStrokeDash(r0)
            return
        L_0x00bc:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r6)
            r5.setStroke(r0)
            return
        L_0x00c4:
            float r0 = X.C13989Tnp.A07(r6, r6, r0)
            r5.setOpacity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.views.art.ARTTextShadowNode$$PropsSetter.EhL(com.facebook.react.uimanager.ReactShadowNode, java.lang.Object, java.lang.String):void");
    }
}
