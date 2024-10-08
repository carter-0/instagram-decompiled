package X;

import android.graphics.RuntimeShader;
import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnSizeChangedModifier;

public abstract class HYZ {
    public static final void A00(boolean z, C286575Wy r21, int i) {
        int i2;
        C286575Wy r12 = r21;
        r12.ExV(282906954);
        int i3 = i;
        boolean z2 = z;
        if ((i & 14) == 0) {
            i2 = G9t.A0Y(r12, z2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1582085380, "com.instagram.creation.genai.themes.ui.AiThemesDynamicBackground (AiThemesDynamicBackground.kt:112)");
            }
            Modifier A0O = C51968G9o.A0O();
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A0E, false);
            int A002 = C287425a7.A00(r12);
            C286565Wx r0 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r0);
            Modifier A01 = C287435a8.A01(r12, A0O);
            C51973G9u.A0y(r12, r0);
            C51971G9r.A12(r12, A00, A04);
            0sL r5 = C287485aD.A02;
            if (r0.A0K || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r5, A002);
            }
            C51965G9l.A18(r12, A01);
            r12.ExS(-1660835046);
            if (Build.VERSION.SDK_INT >= 33) {
                Object A0m = C51967G9n.A0m(r12, -1660833680);
                Object obj = AnonymousClass5XT.A00;
                if (A0m == obj) {
                    A0m = new RuntimeShader("\n  uniform float2 iResolution;\n  uniform float iTime;\n  uniform shader composable;\n  \n  // Create a 2x2 rotation matrix for a given angle a (in radians).\n  mat2 RotationMatrix(float a)\n  {\n      float s = sin(a);\n      float c = cos(a);\n      return mat2(c, -s, s, c);\n  }\n  // Generate a pseudo-random hash value from a 2D point p.\n  vec2 hash( vec2 p )\n  {\n      // sine function and a large constant to ensure a wide range.\n      p = vec2( dot(p,vec2(2127.1,81.17)), dot(p,vec2(1269.5,283.37)) );\n    return fract(sin(p)*78642.2211);\n  }\n  // Compute Perlin-like noise at point p.\n  float noise( in vec2 p )\n  {\n      vec2 i = floor( p );\n      vec2 f = fract( p );\n  \n    vec2 u = f*f*(3.0-2.0*f);\n      float n = mix( mix( dot( -1.0+2.0*hash( i + vec2(0.0,0.0) ), f - vec2(0.0,0.0) ),\n                          dot( -1.0+2.0*hash( i + vec2(1.0,0.0) ), f - vec2(1.0,0.0) ), u.x),\n                     mix( dot( -1.0+2.0*hash( i + vec2(0.0,1.0) ), f - vec2(0.0,1.0) ),\n                          dot( -1.0+2.0*hash( i + vec2(1.0,1.0) ), f - vec2(1.0,1.0) ), u.x), u.y);\n    return 0.5 + 0.5*n;\n  }\n  // Generate a comp with sin/cos based \"folds\". i value increases sharpness\n  vec3 glossyFolds(vec2 fragCoord) {\n      float minRes = min(iResolution.x, iResolution.y);\n      vec2 uv = (fragCoord * 2.0 - iResolution.xy) / minRes;\n      float d = -iTime * 0.4;\n      float a = 0.0;\n      for (float i = 0.0; i < 4.0; ++i) {\n          a += cos(i - d - a * uv.y);\n          d += sin(uv.x * i + a);\n      }\n      d += iTime;\n      vec3 col = vec3(cos(uv * noise(vec2(d, a))) * 0.4 + 0.6, cos(a + d) * 0.6 + 0.4);\n      col = cos(col * cos(vec3(d, a, 4.5)) * 0.6 + 0.4);\n      return col;\n  }\n  half4 main(vec2 fragCoord)\n  {\n      // Coordinate Normalization and Aspect Ratio Adjustment\n      vec2 uv = fragCoord/iResolution.xy;\n      float ratio = iResolution.x / iResolution.y;\n      vec2 tuv = uv;\n      tuv -= .5;\n  \n      // PROCESSING STATE CHANGE\n      float processing = smoothstep(0.0, 1.0, iTime * 0.5); //animate the processing value from 0-1 over .5s\n      float rotationCoefficient = processing * 0.08 + (1.0 - processing) * 0.02; //this is 0.02 in idle state, and 0.08 when proccessing\n  \n      // Rotate with noise\n      float degree = noise(vec2(iTime*.1, tuv.x*tuv.y))+iTime*rotationCoefficient;\n      tuv.y *= 1./ratio;\n      tuv *= RotationMatrix(radians((degree-.5)*720.+180.));\n    tuv.y *= ratio;\n  \n      // Defining mix colors\n      vec3 colorBlue = vec3(0, .474, .925);\n      vec3 colorGreen = vec3(.372, .980, .756);\n      vec3 colorPink = vec3(.988, .568, .854);\n      vec3 colorPurple = vec3(0.278, 0, .866);\n  \n      vec3 foldsComp = glossyFolds(fragCoord);\n  \n      //trying different mixes of folds and colors\n      vec3 layer1 = mix(colorPurple, colorGreen, smoothstep(-.3, .2, (tuv*RotationMatrix(radians(-5.))).x));\n      vec3 layer2 = mix(colorPink, colorBlue, smoothstep(-.3, .2, (tuv*RotationMatrix(radians(-5.))).x));\n  \n      vec3 colorComp = mix(layer1, layer2, smoothstep(.5, -.3, tuv.y));\n  \n      // final mix\n      vec3 finalComp = mix(foldsComp,colorComp, smoothstep(-.5, .2, (tuv*RotationMatrix(radians(-5.))).x));\n  \n      return half4(finalComp,1.0);\n  }\n");
                    r12.FLL(A0m);
                }
                RuntimeShader runtimeShader = (RuntimeShader) A0m;
                C286565Wx.A0L(r0, false);
                Object A0m2 = C51967G9n.A0m(r12, -1660831769);
                if (A0m2 == obj) {
                    A0m2 = G9t.A0o(r12, C51967G9n.A0g());
                }
                C284945Oz A0J = C51965G9l.A0J(r0, A0m2, false);
                C286645Xf.A04(r12, C60340gF.A00, new MGX(((AnonymousClass6FV) C51974G9v.A0Y(r12, r12.ECw(), obj)).A00, A0J, (AnonymousClass4D7) null, 14));
                Modifier A0X = C51970G9q.A0X(A0O.Ezh(new OnSizeChangedModifier(new C58720IwT(runtimeShader))), new C58721IwU(runtimeShader, A0J));
                int i4 = 234;
                int i5 = 243;
                int i6 = 254;
                if (z) {
                    i4 = 17;
                    i5 = 41;
                    i6 = 61;
                }
                C304846Fl.A01((C304806Fh) null, r12, A0X, (AnonymousClass5S2) null, C45186Cro.A00, 0.0f, 1572864, 58, C51965G9l.A08((long) (((i4 & 255) << 16) | -16777216 | ((i5 & 255) << 8) | (i6 & 255))), 0);
            }
            if (C51971G9r.A1S(r12, r0, false)) {
                0fL.A00(-1182900927);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J70(z2, i3, 1);
        }
    }
}
