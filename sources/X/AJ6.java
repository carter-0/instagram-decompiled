package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class AJ6 {
    public final Map A00 = AnonymousClass7TE.A1E();
    public final InstagramFilterFactoryProvider A01 = new Object();

    public static void A05(TypedParameterMap typedParameterMap, ValueMapFilterModel valueMapFilterModel) {
        valueMapFilterModel.A02("hasOutline", false);
        typedParameterMap.A00.put("hasOutline", false);
        valueMapFilterModel.A00("renderFrameTimeSeconds", Float.NaN);
    }

    public final void A08(String str, Object obj, String str2) {
        C366548pF r0;
        FilterModel B5t;
        0qQ.A0B(str2, 2);
        0qQ.A0B(obj, 0);
        Map map = this.A00;
        if (map.containsKey(obj) && (r0 = (C366548pF) map.get(obj)) != null && (B5t = r0.B5t()) != null) {
            A03(B5t, str, str2);
        }
    }

    public static TypedParameterMap A00(ValueMapFilterModel valueMapFilterModel) {
        valueMapFilterModel.A00("strength", 1.0f);
        valueMapFilterModel.A00("fontSize", 16.0f);
        Float valueOf = Float.valueOf(16.0f);
        TypedParameterMap typedParameterMap = valueMapFilterModel.A01;
        Map map = typedParameterMap.A02;
        map.put("fontSize", valueOf);
        valueMapFilterModel.A00("fontThickness", 0.5f);
        map.put("fontThickness", Float.valueOf(0.5f));
        return typedParameterMap;
    }

    public static ValueMapFilterModel A01(Integer num, String str) {
        return C369418uZ.A00(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), str, (float[]) null, 46);
    }

    public static final C366548pF A02(AJ6 aj6, String str, HashMap hashMap) {
        String str2 = str;
        AJ6 aj62 = aj6;
        if (str2.equals("text_neon")) {
            float[] fArr = new float[4];
            ValueMapFilterModel A012 = A01(AnonymousClass05K.A0C, "text_neon");
            TypedParameterMap A002 = A00(A012);
            A012.A03("textColor", fArr);
            A002.A01.put("textColor", fArr);
            A05(A002, A012);
            C369428uk r2 = new C369428uk(aj6.A01, A012);
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                A04(A012, A0s);
            }
            return r2;
        }
        Integer num = AnonymousClass05K.A00;
        if (str2.equals("sparkle")) {
            float[] fArr2 = new float[4];
            ValueMapFilterModel A013 = A01(AnonymousClass05K.A0C, "sparkle");
            TypedParameterMap A003 = A00(A013);
            A013.A03("textColor", fArr2);
            Map map = A003.A01;
            map.put("textColor", fArr2);
            A05(A003, A013);
            A013.A01("numSparkles", 1);
            A013.A03("sparklePosX", new float[16]);
            A013.A03("sparklePosY", new float[16]);
            A06("sparklePosX", map, 0.5f, 0);
            A06("sparklePosY", map, 0.5f, 0);
            A06("sparkleAlpha", map, 1.0f, 0);
            C369428uk r22 = new C369428uk(aj6.A01, A013);
            Iterator A0s2 = AnonymousClass7TF.A0s(hashMap);
            while (A0s2.hasNext()) {
                A04(A013, A0s2);
            }
            return r22;
        }
        Integer num2 = AnonymousClass05K.A0C;
        if (str2.equals("text_shimmer")) {
            float[] fArr3 = new float[4];
            ValueMapFilterModel A014 = A01(num2, "text_shimmer");
            TypedParameterMap A004 = A00(A014);
            A014.A03("textColor", fArr3);
            A004.A01.put("textColor", fArr3);
            A05(A004, A014);
            C369428uk r23 = new C369428uk(aj6.A01, A014);
            Iterator A0s3 = AnonymousClass7TF.A0s(hashMap);
            while (A0s3.hasNext()) {
                A04(A014, A0s3);
            }
            return r23;
        } else if (str2.equals("text_pixel")) {
            float[] fArr4 = new float[4];
            ValueMapFilterModel A015 = A01(num2, "text_pixel");
            TypedParameterMap A005 = A00(A015);
            A015.A03("textColor", fArr4);
            A005.A01.put("textColor", fArr4);
            A05(A005, A015);
            C369428uk r24 = new C369428uk(aj6.A01, A015);
            Iterator A0s4 = AnonymousClass7TF.A0s(hashMap);
            while (A0s4.hasNext()) {
                A04(A015, A0s4);
            }
            return r24;
        } else if (str2.equals("VintageFilter")) {
            ColorFilter colorFilter = new ColorFilter("VintageFilter");
            C367548rA r25 = new C367548rA(aj6.A01, colorFilter);
            colorFilter.A00 = 0.8f;
            return r25;
        } else if (str2.equals("TestSingle")) {
            HashMap A02 = 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("strength", Double.valueOf(1.0d))});
            DataDrivenFilter dataDrivenFilter = new DataDrivenFilter(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), AnonymousClass000.A00(2972), "\n          varying vec2 sourceTextureCoordinate;\n          uniform vec2 uInputImageSize;\n          uniform float strength;\n\n          varying vec2 vTexCoord;\n\n          void main() {\n            vec4 firstColor = vec4(1.0,0.0,0.0,1.0); //red\n            vec4 middleColor = vec4(0.0,1.0,0.0,1.0); // green\n            vec4 endColor = vec4(0.0,0.0,1.0,1.0); // blue\n\n            vec2 uv = sourceTextureCoordinate;\n            vec4 sampleColor = sampleInput(uv);\n\n            float h = 0.5;\n            vec4 color = mix(mix(firstColor, middleColor, uv.x/h), mix(middleColor, endColor, (uv.x - h)/(1.0 - h)), step(h, uv.x));\n\n            gl_FragColor = toOutputFormat(sampleColor*color);\n          }\n        ", A02, C366498p3.A00(), C366498p3.A00(), true);
            InstagramFilterFactoryProvider instagramFilterFactoryProvider = aj62.A01;
            0qQ.A0B(instagramFilterFactoryProvider, 2);
            return new C367538r5(instagramFilterFactoryProvider, dataDrivenFilter);
        } else if (!str2.equals("TestGraph")) {
            return null;
        } else {
            HashMap A022 = 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("finalOut", 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("strength", Double.valueOf(1.2d))}))});
            DataDrivenGraphFilter dataDrivenGraphFilter = new DataDrivenGraphFilter(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), AnonymousClass000.A00(2973), "\n    {\n      \"name\" : \"Lo-Res v2\",\n      \"passes\" : [\n        {\n          \"name\" : \"scaleDown\",\n          \"igid\" : \"bicubic\",\n          \"scale\" : [ 0.5, 0.5 ],\n          \"inputs\" : [\"default\"],\n          \"uniforms\" : {\"scale\" : {\"min\" : 0, \"max\" : 10, \"value\" : 3.35}}\n        },\n        {\n          \"name\" : \"sharpen\",\n          \"igid\" : \"normal\",\n          \"inputs\" : [\"scaleDown\"],\n          \"scale\" : [ 0.5, 0.5 ],\n          \"uniforms\" : {\"sharpenAmt\" : {\"min\" : 0, \"max\" : 10, \"value\" : 0.4}}\n        },\n        {\n          \"name\" : \"scaleUp\",\n          \"igid\" : \"normal\",\n          \"inputs\" : [\"sharpen\"],\n          \"uniforms\" : {\n            \"scale\" :\n                {\"display\" : false, \"constant\" : true, \"min\" : -10, \"max\" : 10, \"value\" : 0.25}\n          }\n        },\n        {\n          \"name\" : \"jpeg\",\n          \"igid\" : \"normal\",\n          \"inputs\" : [\"scaleUp\"],\n          \"scale\" : [ 0.5, 0.5 ],\n          \"uniforms\" : {\n            \"scaleFactor\" : {\"constant\" : true, \"min\" : 50, \"max\" : 400, \"value\" : 230},\n            \"posterization\" : {\"constant\" : true, \"min\" : 2, \"max\" : 176, \"value\" : 64},\n            \"brightness\" : {\"min\" : -1, \"max\" : 1, \"value\" : 0.07}\n          }\n        },\n        {\n          \"name\" : \"finalOut\",\n          \"glsl\" : \"varying vec2 sourceTextureCoordinate;\n          uniform vec2 uInputImageSize;\n          uniform float strength;\n          uniform sampler2D auxSampler1;\n\n          varying vec2 vTexCoord;\n          void main() {\n          vec4 firstColor = vec4(1.0,0.0,0.0,1.0);\n          vec4 middleColor = vec4(0.0,1.0,0.0,1.0);\n          vec4 endColor = vec4(0.0,0.0,1.0,1.0);\n\n          vec2 uv = sourceTextureCoordinate;\n          vec4 sampleColor = sampleInput(uv);\n          vec4 sampleColor2 = texture2D(auxSampler1, uv);\n\n          float h = 0.5;\n          vec4 color = sampleColor2 * mix(mix(firstColor, middleColor, uv.x/h), mix(middleColor, endColor, (uv.x - h)/(1.0 - h)), step(h, uv.x));\n          vec4 newColor = vec4(strength,strength,color.b, 1.0);\n          gl_FragColor = toOutputFormat(sampleColor*color);\n          }\",\n          \"inputs\" : [\"default\",\"jpeg\"],\n          \"scale\" : [ 1.0, 1.0 ],\n          \"uniforms\" : {\n            \"scale\" :\n                {\"display\" : false, \"constant\" : true, \"min\" : -10, \"max\" : 10, \"value\" : 0.25}\n          }\n        }\n      ]\n    }\n    ", A022, C366498p3.A00(), C366498p3.A00(), true);
            InstagramFilterFactoryProvider instagramFilterFactoryProvider2 = aj62.A01;
            0qQ.A0B(instagramFilterFactoryProvider2, 2);
            return new C367538r5(instagramFilterFactoryProvider2, dataDrivenGraphFilter);
        }
    }

    public final Integer A07(Object obj) {
        FilterModel B5t;
        String filterName;
        C366548pF r0 = (C366548pF) this.A00.get(obj);
        if (!(r0 == null || (B5t = r0.B5t()) == null || (filterName = B5t.getFilterName()) == null)) {
            switch (filterName.hashCode()) {
                case -2103499532:
                    if (filterName.equals("text_pixel")) {
                        return AnonymousClass05K.A0N;
                    }
                    break;
                case -2011710186:
                    if (filterName.equals("sparkle")) {
                        return AnonymousClass05K.A00;
                    }
                    break;
                case -1037749848:
                    if (filterName.equals("text_neon")) {
                        return AnonymousClass05K.A01;
                    }
                    break;
                case -208149521:
                    if (filterName.equals("text_shimmer")) {
                        return AnonymousClass05K.A0C;
                    }
                    break;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (r10.equals("fontThickness") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        r1 = X.012.A0q(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        X.0qQ.A0B(r9, 0);
        r9.A01.A02.put("fontThickness", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        if (r10.equals("hasOutline") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        r1 = X.00l.A0A(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cd, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cf, code lost:
        X.0qQ.A0B(r9, 0);
        r9.A01.A00.put("hasOutline", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00de, code lost:
        if (r10.equals("fontSize") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        r1 = X.012.A0q(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e6, code lost:
        X.0qQ.A0B(r9, 0);
        r9.A01.A02.put("fontSize", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f5, code lost:
        if (r10.equals("timeOffsets") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r1 = X.00k.A0w(X.A1M.A00(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        if (r1.length == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
        X.0qQ.A0B(r9, 0);
        r9.A01.A01.put("timeOffsets", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0111, code lost:
        if (r10.equals("textColor") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0113, code lost:
        r6 = X.0nH.A0C(r11, -1);
        r1 = X.00k.A0w(X.0sr.A1P(new java.lang.Float[]{java.lang.Float.valueOf(((float) android.graphics.Color.red(r6)) / 255.0f), java.lang.Float.valueOf(((float) android.graphics.Color.green(r6)) / 255.0f), java.lang.Float.valueOf(((float) android.graphics.Color.blue(r6)) / 255.0f), java.lang.Float.valueOf(((float) android.graphics.Color.alpha(r6)) / 255.0f)}));
        X.AnonymousClass7TF.A1H(r9, r1);
        r9.A01.A01.put("textColor", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0157, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r9, java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r8 = r9.getFilterName()
            int r0 = r8.hashCode()
            r1 = -1
            java.lang.String r7 = "fontThickness"
            java.lang.String r6 = "hasOutline"
            java.lang.String r5 = "fontSize"
            java.lang.String r4 = "timeOffsets"
            java.lang.String r3 = "textColor"
            r2 = 0
            switch(r0) {
                case -2103499532: goto L_0x009a;
                case -2011710186: goto L_0x001f;
                case -1037749848: goto L_0x001c;
                case -208149521: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            return
        L_0x0018:
            java.lang.String r0 = "text_shimmer"
            goto L_0x009c
        L_0x001c:
            java.lang.String r0 = "text_neon"
            goto L_0x009c
        L_0x001f:
            java.lang.String r0 = "sparkle"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0017
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r9
            int r0 = r10.hashCode()
            switch(r0) {
                case -1063571914: goto L_0x010d;
                case -844619085: goto L_0x00f1;
                case 365601008: goto L_0x00da;
                case 926141512: goto L_0x00c3;
                case 1160475621: goto L_0x00ac;
                case 1924913339: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            return
        L_0x0031:
            java.lang.String r0 = "sparkle_positions_and_alphas"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.util.List r6 = X.A1M.A00(r11)
            int r0 = r6.size()
            int r5 = r0 / 3
            java.lang.String r0 = "numSparkles"
            r9.A01(r0, r5)
        L_0x0048:
            if (r2 >= r5) goto L_0x0017
            int r4 = r2 * 3
            java.lang.Object r3 = X.00k.A0O(r6, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r4 + 1
            java.lang.Object r1 = X.00k.A0O(r6, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r4 + 2
            java.lang.Object r7 = X.00k.A0O(r6, r0)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r3 == 0) goto L_0x0097
            if (r1 == 0) goto L_0x0097
            if (r7 == 0) goto L_0x0097
            float r4 = r3.floatValue()
            float r3 = r1.floatValue()
            if (r2 < 0) goto L_0x0084
            r0 = 16
            if (r0 <= r2) goto L_0x0084
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r0 = r9.A01
            java.util.Map r1 = r0.A01
            java.lang.String r0 = "sparklePosX"
            A06(r0, r1, r4, r2)
            java.lang.String r0 = "sparklePosY"
            A06(r0, r1, r3, r2)
        L_0x0084:
            float r3 = r7.floatValue()
            if (r2 < 0) goto L_0x0097
            r0 = 16
            if (r0 <= r2) goto L_0x0097
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r0 = r9.A01
            java.util.Map r1 = r0.A01
            java.lang.String r0 = "sparkleAlpha"
            A06(r0, r1, r3, r2)
        L_0x0097:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x009a:
            java.lang.String r0 = "text_pixel"
        L_0x009c:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0017
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r9
            int r0 = r10.hashCode()
            switch(r0) {
                case -1063571914: goto L_0x010d;
                case -844619085: goto L_0x00f1;
                case 365601008: goto L_0x00da;
                case 926141512: goto L_0x00c3;
                case 1160475621: goto L_0x00ac;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            return
        L_0x00ac:
            boolean r0 = r10.equals(r7)
            if (r0 == 0) goto L_0x0017
            java.lang.Float r1 = X.012.A0q(r11)
            if (r1 == 0) goto L_0x0017
            X.0qQ.A0B(r9, r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r0 = r9.A01
            java.util.Map r0 = r0.A02
            r0.put(r7, r1)
            return
        L_0x00c3:
            boolean r0 = r10.equals(r6)
            if (r0 == 0) goto L_0x0017
            java.lang.Boolean r1 = X.00l.A0A(r11)
            if (r1 == 0) goto L_0x0017
            X.0qQ.A0B(r9, r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r0 = r9.A01
            java.util.Map r0 = r0.A00
            r0.put(r6, r1)
            return
        L_0x00da:
            boolean r0 = r10.equals(r5)
            if (r0 == 0) goto L_0x0017
            java.lang.Float r1 = X.012.A0q(r11)
            if (r1 == 0) goto L_0x0017
            X.0qQ.A0B(r9, r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r0 = r9.A01
            java.util.Map r0 = r0.A02
            r0.put(r5, r1)
            return
        L_0x00f1:
            boolean r0 = r10.equals(r4)
            if (r0 == 0) goto L_0x0017
            java.util.List r0 = X.A1M.A00(r11)
            float[] r1 = X.00k.A0w(r0)
            int r0 = r1.length
            if (r0 == 0) goto L_0x0017
            X.0qQ.A0B(r9, r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r0 = r9.A01
            java.util.Map r0 = r0.A01
            r0.put(r4, r1)
            return
        L_0x010d:
            boolean r0 = r10.equals(r3)
            if (r0 == 0) goto L_0x0017
            int r6 = X.0nH.A0C(r11, r1)
            int r0 = android.graphics.Color.red(r6)
            float r0 = (float) r0
            r5 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r5
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            int r0 = android.graphics.Color.green(r6)
            float r0 = (float) r0
            float r0 = r0 / r5
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            int r0 = android.graphics.Color.blue(r6)
            float r0 = (float) r0
            float r0 = r0 / r5
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            int r0 = android.graphics.Color.alpha(r6)
            float r0 = (float) r0
            float r0 = r0 / r5
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Float[] r0 = new java.lang.Float[]{r4, r2, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            float[] r1 = X.00k.A0w(r0)
            X.AnonymousClass7TF.A1H(r9, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r0 = r9.A01
            java.util.Map r0 = r0.A01
            r0.put(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJ6.A03(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel, java.lang.String, java.lang.String):void");
    }

    public static void A04(FilterModel filterModel, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        A03(filterModel, (String) entry.getKey(), (String) entry.getValue());
    }

    public static void A06(Object obj, Map map, float f, int i) {
        float[] fArr = (float[]) map.get(obj);
        if (fArr != null) {
            fArr[i] = f;
        }
    }
}
