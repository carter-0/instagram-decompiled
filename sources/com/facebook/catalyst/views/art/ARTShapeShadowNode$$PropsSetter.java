package com.facebook.catalyst.views.art;

import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import java.util.Map;

public class ARTShapeShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final void Bhz(Map map) {
        map.put("d", "Array");
        map.put("fill", "Array");
        map.put("opacity", "number");
        map.put("stroke", "Array");
        map.put("strokeCap", "number");
        map.put("strokeDash", "Array");
        map.put("strokeJoin", "number");
        map.put("strokeWidth", "number");
        map.put("transform", "Array");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        r4.setTransform(X.C13988Tno.A0I(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
        r4.setFill(X.C13988Tno.A0I(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        r4.setShapePath(X.C13988Tno.A0I(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        r4.setStrokeCap(X.C13991Tnr.A00(1, r5, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        r4.setStrokeJoin(X.C13991Tnr.A00(1, r5, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        r4.setStrokeDash(X.C13988Tno.A0I(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        r4.setStroke(X.C13988Tno.A0I(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void EhL(com.facebook.react.uimanager.ReactShadowNode r4, java.lang.Object r5, java.lang.String r6) {
        /*
            r3 = this;
            com.facebook.catalyst.views.art.ARTShapeShadowNode r4 = (com.facebook.catalyst.views.art.ARTShapeShadowNode) r4
            int r0 = r6.hashCode()
            r2 = 1
            switch(r0) {
                case -1267206133: goto L_0x0016;
                case -891980232: goto L_0x0062;
                case -631243286: goto L_0x0059;
                case -631051390: goto L_0x0050;
                case -20363654: goto L_0x0047;
                case 100: goto L_0x003e;
                case 3143043: goto L_0x0035;
                case 1052666732: goto L_0x002c;
                case 1924065902: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            return
        L_0x000b:
            java.lang.String r0 = "strokeWidth"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 8
            goto L_0x001f
        L_0x0016:
            java.lang.String r0 = "opacity"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 0
        L_0x001f:
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r1) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x009b;
                case 2: goto L_0x0093;
                case 3: goto L_0x008b;
                case 4: goto L_0x0083;
                case 5: goto L_0x007b;
                case 6: goto L_0x0073;
                case 7: goto L_0x006b;
                default: goto L_0x0024;
            }
        L_0x0024:
            float r0 = X.C13989Tnp.A07(r5, r5, r0)
            r4.setStrokeWidth(r0)
            return
        L_0x002c:
            java.lang.String r0 = "transform"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x006b
            return
        L_0x0035:
            java.lang.String r0 = "fill"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0073
            return
        L_0x003e:
            java.lang.String r0 = "d"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x007b
            return
        L_0x0047:
            java.lang.String r0 = "strokeCap"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0083
            return
        L_0x0050:
            java.lang.String r0 = "strokeJoin"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x008b
            return
        L_0x0059:
            java.lang.String r0 = "strokeDash"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0093
            return
        L_0x0062:
            java.lang.String r0 = "stroke"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x009b
            return
        L_0x006b:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r5)
            r4.setTransform(r0)
            return
        L_0x0073:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r5)
            r4.setFill(r0)
            return
        L_0x007b:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r5)
            r4.setShapePath(r0)
            return
        L_0x0083:
            int r0 = X.C13991Tnr.A00(r2, r5, r5)
            r4.setStrokeCap(r0)
            return
        L_0x008b:
            int r0 = X.C13991Tnr.A00(r2, r5, r5)
            r4.setStrokeJoin(r0)
            return
        L_0x0093:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r5)
            r4.setStrokeDash(r0)
            return
        L_0x009b:
            com.facebook.react.bridge.ReadableArray r0 = X.C13988Tno.A0I(r5)
            r4.setStroke(r0)
            return
        L_0x00a3:
            float r0 = X.C13989Tnp.A07(r5, r5, r0)
            r4.setOpacity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.views.art.ARTShapeShadowNode$$PropsSetter.EhL(com.facebook.react.uimanager.ReactShadowNode, java.lang.Object, java.lang.String):void");
    }
}
