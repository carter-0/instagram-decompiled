package X;

import java.util.Arrays;

public abstract class Dbq {
    public static byte[] A00 = {-91, -74, -85, -61, -89, -84, -91, -78, -85, -83, -78, -85, -61, -72, -69, -77, -61, -86, -91, -89, -61, -76, -84, -77, -78, -87, -61, -78, -71, -79, -90, -87, -74, -101, -99, -99, -87, -81, -88, -82, -83, 105, -97, -88, -101, -100, -90, -97, -103, -82, -87, -82, -86, -103, -82, -79, -87, -103, -96, -101, -99, -82, -87, -84, 105, 117, 119, 119, -125, -119, -126, -120, -121, 67, 123, 121, -126, 121, -122, 117, -120, 121, 115, -120, -117, -125, 115, 122, 117, 119, -120, -125, -122, 115, -120, -125, -120, -124, 115, Byte.MAX_VALUE, 121, -115, 67, -34, -32, -32, -20, -14, -21, -15, -16, -84, -17, -30, -22, -20, -13, -30, -36, -15, -17, -14, -16, -15, -30, -31, -36, -31, -30, -13, -26, -32, -30, -84, -46, -34, -36, -99, -45, -28, -34, -30, -44, -46, -28, -31, -40, -29, -24, -99, -45, -28, -34, -36, -34, -47, -40, -37, -44, -29, -17, -19, -82, -25, -17, -17, -25, -20, -27, -82, -31, -18, -28, -14, -17, -23, -28, -82, -31, -16, -16, -13, -82, -31, -11, -12, -24, -27, -18, -12, -23, -29, -31, -12, -17, -14, -78, 120, 121, -118, 125, 119, 121, 115, 123, -119, 125, 120, 122, 123, -116, Byte.MAX_VALUE, 121, 123, 117, Byte.MAX_VALUE, 122, -97, -85, -85, -89, -86, 113, 102, 102, -97, -100, -93, -89, 101, -96, -91, -86, -85, -104, -98, -87, -104, -92, 101, -102, -90, -92, 102, 108, 109, 109, 111, 104, 103, 104, 103, 109, 111, 103, 111, 104, 107, 108, 118, -87, -100, -99, 116, -96, -98, -104, -89, -89, -92, -80, -80, -84, -81, 118, 107, 107, -84, -82, -91, -78, -99, -97, -75, -97, -95, -86, -80, -95, -82, 106, -91, -86, -81, -80, -99, -93, -82, -99, -87, 106, -97, -85, -87, 107, -84, -85, -88, -91, -97, -75, -42, -37, -29, -50, -39, -42, -47, -50, -31, -46, -52, -40, -46, -26, -32, -44, -34, -65, -30, -38, -79, -52, -50, -80, -39, -52, -51, -41, -48, -49, -113, -103, -123, -99, -117, -120, -123, -118, -117, -100, -113, -119, -117, -41, -46, -52, -44, -41, -54, -42, -50, -61, -69, -62, -63, -72, -78, -63, -56, -64, -75, -72, -59, -100, -114, -100, -100, -110, -104, -105, -120, -110, -115, -125, 126, -125, Byte.MAX_VALUE, 110, 122, 116, -120, 110, 125, 120, 114, 122, 125, 112, 124, 116, -50, -55, -50, -54, -71, -51, -65, -65, -66, -71, -61, -66, -34, -31, -39, -80, -53, -51, -74, -45, -35, -38, -29, -83, -53, -42, -42, -52, -53, -51, -43, -68, -49, -37, -33, -49, -35, -34, -90, -87, -95, -111, -104, -109, -107, -25, -22, -30, -46, -39, -44, -42, -46, -42, -37, -30, -30, -26, -40, -46, -26, -40, -42, -24, -27, -36, -25, -20, -46, -32, -40, -25, -37, -30, -41, -46, -26, -25, -44, -25, -40, -46, -31, -44, -32, -40, -113, -110, -118, 122, -127, 124, 126, 122, -120, -112, -121, -113, -124, -117, -121, Byte.MIN_VALUE, 122, -113, -118, -113, -117, 122, -114, -113, 124, -115, -113, 122, -114, -113, 124, -113, Byte.MIN_VALUE, 122, -119, 124, -120, Byte.MIN_VALUE, -108, -105, -113, Byte.MAX_VALUE, -122, -127, -125, Byte.MAX_VALUE, -109, -108, -127, -110, -108, Byte.MAX_VALUE, -109, -108, -127, -108, -123, Byte.MAX_VALUE, -114, -127, -115, -123, -21, -18, -26, -42, -35, -40, -38, -21, -26, -23, -90, -40, -37, -37, -42, -30, -36, -16, -42, -21, -26, -21, -25, -42, -21, -18, -26, -42, -35, -40, -38, -21, -26, -23, -90, -41, -38, -46, -62, -55, -60, -58, -41, -46, -43, -110, -57, -56, -49, -56, -41, -56, -62, -50, -56, -36, -62, -41, -46, -41, -45, -62, -41, -38, -46, -62, -55, -60, -58, -41, -46, -43, -110, -11, -8, -16, -32, -25, -30, -28, -11, -16, -13, -80, -27, -22, -12, -30, -29, -19, -26, -32, -8, -23, -30, -11, -12, -30, -15, -15, -32, -11, -8, -16, -32, -25, -30, -28, -11, -16, -13, -80, Byte.MIN_VALUE, -125, 123, 107, 114, 109, 111, Byte.MIN_VALUE, 123, 126, 59, 113, 122, 109, 110, 120, 113, 107, -125, 116, 109, Byte.MIN_VALUE, Byte.MAX_VALUE, 109, 124, 124, 107, Byte.MIN_VALUE, -125, 123, 107, 114, 109, 111, Byte.MIN_VALUE, 123, 126, 59, -55, -52, -60, -76, -69, -74, -72, -55, -60, -57, -124, -57, -70, -61, -74, -62, -70, -76, -64, -70, -50, -76, -55, -60, -55, -59, -76, -55, -52, -60, -76, -69, -74, -72, -55, -60, -57, -124, -81, -78, -86, -102, -95, -100, -98, -81, -86, -83, 106, -82, -96, -87, -97, -102, -81, -78, -86, -102, -95, -100, -98, -81, -86, -83, -102, -89, -86, -94, -92, -87, -102, -78, -93, -100, -81, -82, -100, -85, -85, 106, -116, -113, -121, 119, 126, 121, 123, -116, -121, -118, 119, -127, 124, 125, -122, -116, -127, 126, -127, 125, -118, -79, -81, -95, -82, -86, -99, -87, -95, -89, -106, -93, -102, -105, -102, -108, -110, -91, -102, -96, -97, -112, -108, -96, -107, -106};

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 6);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A05(362, 12, 77);
    }

    public static String A01() {
        return A05(374, 10, 35);
    }

    public static String A02() {
        return A05(439, 7, 44);
    }

    public static String A03() {
        return A05(800, 8, 54);
    }

    public static String A04() {
        return A05(208, 9, 16);
    }
}
