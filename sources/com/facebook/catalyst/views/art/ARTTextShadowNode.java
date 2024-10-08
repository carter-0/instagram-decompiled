package com.facebook.catalyst.views.art;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ARTTextShadowNode extends ARTShapeShadowNode {
    public int A00 = 0;
    public ReadableMap A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if ("bold".equals(r4.getString("fontWeight")) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if ("italic".equals(r4.getString("fontStyle")) == false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.graphics.Paint r5, com.facebook.catalyst.views.art.ARTTextShadowNode r6) {
        /*
            int r1 = r6.A00
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x007f
            if (r1 == r0) goto L_0x007c
            if (r1 != r3) goto L_0x000f
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
        L_0x000c:
            r5.setTextAlign(r0)
        L_0x000f:
            com.facebook.react.bridge.ReadableMap r0 = r6.A01
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = "font"
            boolean r0 = r0.hasKey(r1)
            if (r0 == 0) goto L_0x0077
            com.facebook.react.bridge.ReadableMap r0 = r6.A01
            com.facebook.react.bridge.ReadableMap r4 = r0.getMap(r1)
            if (r4 == 0) goto L_0x0077
            r2 = 1094713344(0x41400000, float:12.0)
            java.lang.String r1 = "fontSize"
            boolean r0 = r4.hasKey(r1)
            if (r0 == 0) goto L_0x0032
            double r0 = r4.getDouble(r1)
            float r2 = (float) r0
        L_0x0032:
            float r0 = r6.A02
            float r2 = r2 * r0
            r5.setTextSize(r2)
            java.lang.String r1 = "fontWeight"
            boolean r0 = r4.hasKey(r1)
            if (r0 == 0) goto L_0x004d
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r0 = "bold"
            boolean r0 = r0.equals(r1)
            r2 = 1
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            java.lang.String r1 = "fontStyle"
            boolean r0 = r4.hasKey(r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r0 = "italic"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r2 == 0) goto L_0x0078
            r3 = 1
            if (r0 == 0) goto L_0x006a
            r3 = 3
        L_0x006a:
            java.lang.String r0 = "fontFamily"
            java.lang.String r0 = r4.getString(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            r5.setTypeface(r0)
        L_0x0077:
            return
        L_0x0078:
            if (r0 != 0) goto L_0x006a
            r3 = 0
            goto L_0x006a
        L_0x007c:
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.RIGHT
            goto L_0x000c
        L_0x007f:
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.LEFT
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.views.art.ARTTextShadowNode.A00(android.graphics.Paint, com.facebook.catalyst.views.art.ARTTextShadowNode):void");
    }

    @ReactProp(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.A00 = i;
    }

    @ReactProp(name = "frame")
    public void setFrame(ReadableMap readableMap) {
        this.A01 = readableMap;
    }
}
