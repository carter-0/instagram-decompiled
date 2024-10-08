package X;

import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;

/* renamed from: X.VuW  reason: case insensitive filesystem */
public final class C18580VuW {
    public float A00 = -2.14748365E9f;
    public float A01 = -2.14748365E9f;
    public float A02 = -2.14748365E9f;
    public float A03 = -2.14748365E9f;
    public float A04 = -2.14748365E9f;
    public float A05 = -2.14748365E9f;
    public float A06 = -2.14748365E9f;
    public int A07;
    public LatLng A08;
    public LatLngBounds A09;

    public static void A00(WFU wfu, LatLng latLng, float f) {
        C18580VuW vuW = new C18580VuW();
        vuW.A08 = latLng;
        vuW.A03 = f;
        wfu.A09(vuW, (X29) null, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C51968G9o.A16(this));
        sb.append("{mLatLng=");
        sb.append(this.A08);
        sb.append(", mZoom=");
        sb.append(this.A03);
        sb.append(", mZoomBy=");
        sb.append(this.A04);
        sb.append(", mZoomX=");
        sb.append(this.A05);
        sb.append(", mZoomY=");
        sb.append(this.A06);
        sb.append(", mXPixel=");
        sb.append(this.A01);
        sb.append(", mYPixel=");
        sb.append(this.A02);
        sb.append(", mRotation = ");
        sb.append(this.A00);
        sb.append(", mRendererBounds=");
        sb.append(this.A09);
        sb.append(", mWidth=");
        sb.append(0);
        sb.append(", mHeight=");
        sb.append(0);
        sb.append(", mPadding=");
        sb.append(this.A07);
        return AnonymousClass7TF.A0l("}", sb);
    }
}
