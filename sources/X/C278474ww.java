package X;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4ww  reason: invalid class name and case insensitive filesystem */
public abstract class C278474ww {
    public static Pair A00(UserSession userSession) {
        String string = AnonymousClass0xl.A00(C61170le.A00).A00.getString("preference_supported_ar_capabilities_as_json", (String) null);
        if (string == null) {
            string = A03(userSession).toString();
        }
        return new Pair("supported_capabilities_new", string);
    }

    public static String A02(String str) {
        if (str.startsWith("etc")) {
            return "ETC";
        }
        if (str.startsWith("pvr")) {
            return "PVR";
        }
        if (str.startsWith("astc")) {
            return "ASTC";
        }
        0kD.A01("ArEffectSupportedCapabilities", "Unsupported texture compression.");
        return "";
    }

    public static JSONArray A03(UserSession userSession) {
        Map A00 = C278484wx.A00();
        Map A03 = C278514x0.A03(C60960kU.A00, new C278504wz(userSession), A00);
        String join = TextUtils.join(",", Arrays.asList(C278564x7.A01));
        String join2 = TextUtils.join(",", Arrays.asList(C278564x7.A00));
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "SUPPORTED_SDK_VERSIONS");
            jSONObject.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, join);
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "SUPPORTED_BETA_SDK_VERSIONS");
            jSONObject2.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, join2);
            jSONArray.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "FACE_TRACKER_VERSION");
            jSONObject3.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, String.valueOf(14));
            jSONArray.put(jSONObject3);
            if ("segmentation_enabled".equals(A03.get("segmentation"))) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "segmentation");
                jSONObject4.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "segmentation_enabled");
                jSONArray.put(jSONObject4);
            }
            for (String upperCase : A00.keySet()) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "COMPRESSION");
                jSONObject5.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, upperCase.toUpperCase(Locale.US));
                jSONArray.put(jSONObject5);
            }
            if ("world_tracker_enabled".equals(A03.get("world_tracker"))) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "world_tracker");
                jSONObject6.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "world_tracker_enabled");
                jSONArray.put(jSONObject6);
            }
            if ("gyroscope_enabled".equals(A03.get("gyroscope"))) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "gyroscope");
                jSONObject7.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "gyroscope_enabled");
                jSONArray.put(jSONObject7);
            }
            return jSONArray;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean A05() {
        String str;
        C278544x5 r1 = C278544x5.A06;
        C278544x5.A00(r1, true);
        if (!r1.A02 || (str = Build.CPU_ABI) == null || !str.toLowerCase().contains("arm64")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        if (r1.contains("GL_KHR_texture_compression_astc_hdr") == false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.2IV A01(com.instagram.common.session.UserSession r9) {
        /*
            java.util.Map r8 = X.C278484wx.A00()
            X.4wz r1 = new X.4wz
            r1.<init>(r9)
            X.2IV r4 = new X.2IV
            r4.<init>()
            android.content.Context r0 = X.C60960kU.A00
            java.util.ArrayList r1 = X.C278514x0.A02(r0, r1)
            java.lang.String r0 = "manifest_capabilities"
            r4.A05(r0, r1)
            java.lang.String r0 = "UNCOMPRESSED"
            java.lang.String r5 = "texture_compression"
            r4.A09(r0, r5)
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0028:
            boolean r0 = r2.hasNext()
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = A02(r0)
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0028
            r4.A09(r1, r5)
        L_0x0043:
            r5 = 0
            r6 = 0
            java.util.List r1 = X.C278484wx.A02
            java.lang.String r0 = android.os.Build.MODEL
            boolean r0 = r1.contains(r0)
            r7 = 0
            if (r0 == 0) goto L_0x007a
            r0 = 0
        L_0x0051:
            if (r0 == 0) goto L_0x0115
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0060:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = A02(r0)
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0060
            r5.add(r1)
            goto L_0x0060
        L_0x007a:
            X.3xP r0 = X.C278484wx.A00
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x00f9
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()     // Catch:{ all -> 0x00f9 }
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0     // Catch:{ all -> 0x00f9 }
            javax.microedition.khronos.egl.EGLContext r1 = r0.eglGetCurrentContext()     // Catch:{ all -> 0x00f9 }
            javax.microedition.khronos.egl.EGLContext r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ all -> 0x00f9 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            X.4wy r6 = new X.4wy     // Catch:{ all -> 0x00f9 }
            r6.<init>()     // Catch:{ all -> 0x00f9 }
            android.opengl.EGLSurface r5 = r6.A00()     // Catch:{ all -> 0x00f9 }
            android.opengl.EGLDisplay r1 = r6.A02     // Catch:{ all -> 0x00f9 }
            android.opengl.EGLContext r0 = r6.A01     // Catch:{ all -> 0x00f9 }
            boolean r0 = android.opengl.EGL14.eglMakeCurrent(r1, r5, r5, r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00f1
            r2 = 1
            goto L_0x00aa
        L_0x00a9:
            r2 = 0
        L_0x00aa:
            r0 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r1 = android.opengl.GLES10.glGetString(r0)     // Catch:{ all -> 0x00f9 }
            if (r1 == 0) goto L_0x00c3
            java.lang.String r0 = "GL_KHR_texture_compression_astc_ldr"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = "GL_KHR_texture_compression_astc_hdr"
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x00f9 }
            r0 = 1
            if (r1 != 0) goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00f9 }
            r1.getClass()     // Catch:{ all -> 0x00f9 }
            X.3xQ r0 = new X.3xQ     // Catch:{ all -> 0x00f9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f9 }
            X.C278484wx.A00 = r0     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x00f9
            android.opengl.EGLDisplay r2 = r6.A02     // Catch:{ all -> 0x00f9 }
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x00f9 }
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ all -> 0x00f9 }
            boolean r0 = android.opengl.EGL14.eglMakeCurrent(r2, r1, r1, r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00e9
            android.opengl.EGLDisplay r0 = r6.A02     // Catch:{ all -> 0x00f9 }
            android.opengl.EGL14.eglDestroySurface(r0, r5)     // Catch:{ all -> 0x00f9 }
            r6.A01()     // Catch:{ all -> 0x00f9 }
            goto L_0x00f9
        L_0x00e9:
            java.lang.String r0 = "eglMakeCurrent failed"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00f9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x00f8
        L_0x00f1:
            java.lang.String r0 = "eglMakeCurrent failed"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00f9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00f9 }
        L_0x00f8:
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            X.3xP r1 = X.C278484wx.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            java.lang.Object r0 = r1.A05(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0051
        L_0x010b:
            java.lang.String r0 = "ASTC"
            r5.add(r0)
            java.lang.String r0 = "supported_texture_formats"
            r4.A05(r0, r5)
        L_0x0115:
            android.util.Pair r1 = X.C278514x0.A01()
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Object r0 = r1.first
            java.lang.String r5 = "min_version"
            X.0Df r2 = r6.A02()
            X.0Df.A00(r2, r0, r5)
            java.lang.Object r0 = r1.second
            java.lang.String r3 = "max_version"
            X.0Df.A00(r2, r0, r3)
            java.lang.String r1 = "supported_sdk_versions"
            X.0Df r0 = r4.A02()
            r0.A0E(r2, r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325729582986406(0x810e0f000034a6, double:3.035875888028473E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x015e
            android.util.Pair r1 = X.C278514x0.A00()
            java.lang.Object r0 = r1.first
            X.0Df r2 = r6.A02()
            X.0Df.A00(r2, r0, r5)
            java.lang.Object r0 = r1.second
            X.0Df.A00(r2, r0, r3)
            java.lang.String r1 = "supported_beta_sdk_versions"
            X.0Df r0 = r4.A02()
            r0.A0E(r2, r1)
        L_0x015e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278474ww.A01(com.instagram.common.session.UserSession):X.2IV");
    }

    public static JSONObject A04(UserSession userSession) {
        2IV A01 = A01(userSession);
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A01(A01.A00, A01, treeMap);
        return new JSONObject(treeMap);
    }
}
