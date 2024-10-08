package X;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* renamed from: X.5tk  reason: invalid class name and case insensitive filesystem */
public abstract class C298615tk {
    public static final Bitmap A00(C3018260f r1) {
        if (r1 instanceof C3018360g) {
            return ((C3018360g) r1).A00;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final C3018360g A01(C285385Rc r22, int i, int i2, int i3) {
        Bitmap.Config config;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        if (i3 == 0) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ALPHA_8;
        }
        C285385Rc r0 = r22;
        if (!0qQ.A0K(r0, AnonymousClass5RX.A0G)) {
            if (0qQ.A0K(r0, AnonymousClass5RX.A03)) {
                named = ColorSpace.Named.ACES;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A04)) {
                named = ColorSpace.Named.ACESCG;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A05)) {
                named = ColorSpace.Named.ADOBE_RGB;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A06)) {
                named = ColorSpace.Named.BT2020;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A07)) {
                named = ColorSpace.Named.BT709;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A00)) {
                named = ColorSpace.Named.CIE_LAB;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A01)) {
                named = ColorSpace.Named.CIE_XYZ;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A08)) {
                named = ColorSpace.Named.DCI_P3;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A09)) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A0A)) {
                named = ColorSpace.Named.EXTENDED_SRGB;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A0B)) {
                named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A0C)) {
                named = ColorSpace.Named.LINEAR_SRGB;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A0D)) {
                named = ColorSpace.Named.NTSC_1953;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A0E)) {
                named = ColorSpace.Named.PRO_PHOTO_RGB;
            } else if (0qQ.A0K(r0, AnonymousClass5RX.A0F)) {
                named = ColorSpace.Named.SMPTE_C;
            } else if (r0 instanceof C285375Rb) {
                C285375Rb r1 = (C285375Rb) r0;
                float[] A00 = r1.A07.A00();
                AnonymousClass5RY r2 = r1.A06;
                if (r2 != null) {
                    colorSpace = new ColorSpace.Rgb(r0.A02, r1.A0C, A00, new ColorSpace.Rgb.TransferParameters(r2.A00, r2.A01, r2.A02, r2.A03, 0.0d, 0.0d, r2.A04));
                } else {
                    String str = r0.A02;
                    float[] fArr = r1.A0C;
                    DIB dib = new DIB(r1.A09);
                    colorSpace = new ColorSpace.Rgb(str, fArr, A00, dib, new DIC(r1.A08), r0.A01(0), r0.A00(0));
                }
                return new C3018360g(Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace));
            }
            colorSpace = ColorSpace.get(named);
            return new C3018360g(Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace));
        }
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        return new C3018360g(Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace));
    }
}
