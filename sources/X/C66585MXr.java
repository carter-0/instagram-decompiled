package X;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.MXr  reason: case insensitive filesystem */
public final class C66585MXr {
    public static int A00;
    public static Intent A01;
    public static String A02 = "unknown";
    public static String A03 = "unknown";
    public static String A04 = "unknown";
    public static List A05 = AnonymousClass7TE.A1C();
    public static boolean A06;
    public static final C66585MXr A07 = new Object();
    public static final AnonymousClass0eM A08 = AnonymousClass0eN.A01(C66586MXs.A00);

    public static final void A02() {
        A06 = true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.MXr] */
    static {
        C66588MXu.A05(C66587MXt.A00);
    }

    public static final String A00() {
        List<11g> list = A05;
        A05 = null;
        if (list == null) {
            return "[]";
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (11g r3 : list) {
            A0r.add(new JSONObject().put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r3.A03).put("className", r3.A01).put("component", r3.A02).put("action", r3.A00));
        }
        String A0k = C51970G9q.A0k(A0r);
        0qQ.A07(A0k);
        return A0k;
    }

    public static final String A01(Bundle bundle) {
        String str;
        if (bundle == null) {
            return "null";
        }
        JSONArray jSONArray = new JSONArray();
        try {
            Set<String> keySet = bundle.keySet();
            0qQ.A07(keySet);
            ArrayList<Object> A0r = AnonymousClass7TG.A0r(keySet);
            for (String next : keySet) {
                JSONObject jSONObject = new JSONObject();
                if (0qQ.A0K(next, "EXTRAS_SHOULD_WARM_AGAIN")) {
                    str = String.valueOf(bundle.get(next));
                } else {
                    str = "(filtered)";
                }
                A0r.add(jSONObject.put(next, str));
            }
            for (Object put : A0r) {
                jSONArray.put(put);
            }
        } catch (BadParcelableException e) {
            0KC.A0F("ColdStartIntentLogger", "Can't access keyset", e);
        }
        return DbT.A10(jSONArray);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        if (r0 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        if (r15 != null) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.content.Intent r15, java.lang.String r16, java.lang.String r17) {
        /*
            java.lang.String r1 = A04
            java.lang.String r0 = "unknown"
            boolean r3 = X.0qQ.A0K(r1, r0)
            r2 = r16
            r1 = r17
            r0 = r15
            if (r3 == 0) goto L_0x001b
            A01 = r15
            A04 = r17
            A03 = r16
            boolean r3 = A06
            if (r3 == 0) goto L_0x001b
            X.AnonymousClass0eF.A00 = r15
        L_0x001b:
            boolean r3 = A06
            if (r3 == 0) goto L_0x00ce
            if (r15 == 0) goto L_0x00cb
            java.lang.String r4 = r15.getAction()
        L_0x0025:
            java.lang.String r3 = "android.intent.action.MAIN"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ce
            java.lang.String r3 = "android.intent.category.LAUNCHER"
            boolean r3 = r15.hasCategory(r3)
            if (r3 == 0) goto L_0x0037
            X.AnonymousClass0eF.A00 = r15
        L_0x0037:
            r15.getComponent()
            r15.getAction()
            r15.getCategories()
            android.os.Bundle r3 = r15.getExtras()
            if (r3 == 0) goto L_0x0049
            A01(r3)
        L_0x0049:
            X.0rq r11 = X.AnonymousClass0YC.A00
            java.util.concurrent.TimeUnit r16 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r4 = X.0eG.A00(r15)
            java.lang.String r3 = "intent"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r3, r4)
            java.lang.String r3 = "type"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r3, r1)
            java.lang.String r3 = "handling_component"
            X.0eP r7 = X.AnonymousClass7TE.A1L(r3, r2)
            java.lang.String r4 = A02
            java.lang.String r3 = "first_activity"
            X.0eP r8 = X.AnonymousClass7TE.A1L(r3, r4)
            int r3 = A00
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "creation_index"
            X.0eP r9 = X.AnonymousClass7TE.A1L(r3, r4)
            if (r15 == 0) goto L_0x00c9
            android.os.Bundle r3 = r15.getExtras()
        L_0x007d:
            java.lang.String r4 = A01(r3)
            java.lang.String r3 = "extras"
            X.0eP r10 = X.AnonymousClass7TE.A1L(r3, r4)
            X.0eP[] r3 = new X.0eP[]{r5, r6, r7, r8, r9, r10}
            java.util.LinkedHashMap r17 = X.0Yt.A06(r3)
            r12 = 25102708(0x17f0974, float:4.6842885E-38)
            r13 = 467(0x1d3, float:6.54E-43)
            r14 = 0
            r11.markerGenerateWithAnnotations(r12, r13, r14, r16, r17)
            java.util.List r5 = A05
            if (r5 == 0) goto L_0x00be
            int r4 = r5.size()
            r3 = 10
            if (r4 >= r3) goto L_0x00be
            r4 = 0
            if (r0 == 0) goto L_0x00c5
            android.content.ComponentName r3 = r0.getComponent()
            if (r3 == 0) goto L_0x00c5
            java.lang.String r3 = r3.toShortString()
        L_0x00b2:
            java.lang.String r4 = r0.getAction()
        L_0x00b6:
            X.11g r0 = new X.11g
            r0.<init>(r1, r2, r3, r4)
            r5.add(r0)
        L_0x00be:
            int r0 = A00
            int r0 = r0 + 1
            A00 = r0
            return
        L_0x00c5:
            r3 = r4
            if (r0 == 0) goto L_0x00b6
            goto L_0x00b2
        L_0x00c9:
            r3 = 0
            goto L_0x007d
        L_0x00cb:
            r4 = 0
            goto L_0x0025
        L_0x00ce:
            if (r15 == 0) goto L_0x0049
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66585MXr.A03(android.content.Intent, java.lang.String, java.lang.String):void");
    }

    public final void A04() {
        C66590MXw.A03 = (C66589MXv) A08.getValue();
    }

    public final void A05(Intent intent, String str) {
        A02 = str;
        A03(intent, str, "activity");
    }

    public final void A06(Intent intent, String str) {
        A03(intent, str, "receiver");
    }

    public final void A07(Intent intent, String str) {
        A03(intent, str, "service");
    }
}
