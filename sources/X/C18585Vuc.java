package X;

import com.facebook.android.maps.model.CameraPosition;

/* renamed from: X.Vuc  reason: case insensitive filesystem */
public final class C18585Vuc {
    public float A00 = 21.0f;
    public float A01 = 2.0f;
    public int A02 = 1;
    public C69419Nl1 A03 = C69419Nl1.BOTTOM_RIGHT;
    public CameraPosition A04;
    public String A05 = "FacebookMapOptions.java";
    public String A06;
    public boolean A07;
    public boolean A08 = false;
    public boolean A09;
    public boolean A0A = true;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = true;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r10 == false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C18585Vuc A00(android.util.AttributeSet r11) {
        /*
            X.Vuc r2 = new X.Vuc
            r2.<init>()
            java.lang.String r3 = "http://schemas.android.com/apk/facebook"
            r9 = 1
            java.lang.String r0 = "cameraBearing"
            java.lang.String r0 = r11.getAttributeValue(r3, r0)     // Catch:{ Exception -> 0x0014 }
            float r8 = java.lang.Float.parseFloat(r0)     // Catch:{ Exception -> 0x0014 }
            r10 = 1
            goto L_0x0016
        L_0x0014:
            r10 = 0
            r8 = 1
        L_0x0016:
            r7 = 0
            java.lang.String r0 = "cameraTargetLat"
            java.lang.String r0 = r11.getAttributeValue(r3, r0)     // Catch:{ Exception -> 0x0032 }
            double r4 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "cameraTargetLng"
            java.lang.String r0 = r11.getAttributeValue(r3, r0)     // Catch:{ Exception -> 0x0032 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x0032 }
            com.facebook.android.maps.model.LatLng r6 = new com.facebook.android.maps.model.LatLng     // Catch:{ Exception -> 0x0032 }
            r6.<init>(r4, r0)     // Catch:{ Exception -> 0x0032 }
            r10 = 1
            goto L_0x0033
        L_0x0032:
            r6 = r7
        L_0x0033:
            java.lang.String r0 = "cameraTilt"
            java.lang.String r0 = r11.getAttributeValue(r3, r0)     // Catch:{ Exception -> 0x003f }
            float r1 = java.lang.Float.parseFloat(r0)     // Catch:{ Exception -> 0x003f }
            r10 = 1
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            java.lang.String r0 = "cameraZoom"
            java.lang.String r0 = r11.getAttributeValue(r3, r0)     // Catch:{ Exception -> 0x004b }
            float r9 = java.lang.Float.parseFloat(r0)     // Catch:{ Exception -> 0x004b }
            goto L_0x004d
        L_0x004b:
            if (r10 == 0) goto L_0x0052
        L_0x004d:
            com.facebook.android.maps.model.CameraPosition r7 = new com.facebook.android.maps.model.CameraPosition
            r7.<init>(r6, r9, r1, r8)
        L_0x0052:
            r2.A04 = r7
            boolean r1 = r2.A07
            java.lang.String r0 = "uiCompass"
            boolean r0 = r11.getAttributeBooleanValue(r3, r0, r1)
            r2.A07 = r0
            java.lang.String r0 = "mapType"
            java.lang.String r1 = r11.getAttributeValue(r3, r0)
            java.lang.String r0 = "satellite"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00e6
            r0 = 2
        L_0x006d:
            r2.A02 = r0
        L_0x006f:
            boolean r1 = r2.A09
            java.lang.String r0 = "uiRotateGestures"
            boolean r0 = r11.getAttributeBooleanValue(r3, r0, r1)
            r2.A09 = r0
            boolean r1 = r2.A0A
            java.lang.String r0 = "uiScrollGestures"
            boolean r0 = r11.getAttributeBooleanValue(r3, r0, r1)
            r2.A0A = r0
            boolean r1 = r2.A0B
            java.lang.String r0 = "uiTiltGestures"
            boolean r0 = r11.getAttributeBooleanValue(r3, r0, r1)
            r2.A0B = r0
            boolean r1 = r2.A0C
            java.lang.String r0 = "mUseViewLifecycleInFragment"
            boolean r0 = r11.getAttributeBooleanValue(r3, r0, r1)
            r2.A0C = r0
            boolean r1 = r2.A0D
            java.lang.String r0 = "zOrderOnTop"
            boolean r0 = r11.getAttributeBooleanValue(r3, r0, r1)
            r2.A0D = r0
            boolean r1 = r2.A0E
            java.lang.String r0 = "uiZoomGestures"
            boolean r0 = r11.getAttributeBooleanValue(r3, r0, r1)
            r2.A0E = r0
            float r1 = r2.A00
            java.lang.String r0 = "maxZoomLevel"
            float r0 = r11.getAttributeFloatValue(r3, r0, r1)
            r2.A00 = r0
            float r1 = r2.A01
            java.lang.String r0 = "minZoomLevel"
            float r0 = r11.getAttributeFloatValue(r3, r0, r1)
            r2.A01 = r0
            java.lang.String r0 = "entryPoint"
            java.lang.String r0 = r11.getAttributeValue(r3, r0)
            r2.A05 = r0
            java.lang.String r0 = "surface"
            java.lang.String r0 = r11.getAttributeValue(r3, r0)
            r2.A06 = r0
            java.lang.String r0 = "info_button_position"
            java.lang.String r0 = r11.getAttributeValue(r3, r0)
            X.Nl1 r0 = X.C69419Nl1.A00(r0)
            r2.A03 = r0
            boolean r1 = r2.A08
            java.lang.String r0 = "darkMode"
            boolean r0 = r11.getAttributeBooleanValue(r3, r0, r1)
            r2.A08 = r0
            return r2
        L_0x00e6:
            java.lang.String r0 = "terrain"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00f1
            r0 = 3
            goto L_0x006d
        L_0x00f1:
            java.lang.String r0 = "hybrid"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00fc
            r0 = 4
            goto L_0x006d
        L_0x00fc:
            java.lang.String r0 = "live"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 5
            goto L_0x006d
        L_0x0107:
            java.lang.String r0 = "crowdsourcing_osm"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x006f
            r0 = 6
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18585Vuc.A00(android.util.AttributeSet):X.Vuc");
    }

    public final void A01(String str) {
        if (str != null && str.length() > 0) {
            this.A05 = str;
        }
    }
}
