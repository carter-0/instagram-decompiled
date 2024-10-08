package X;

/* renamed from: X.Rih  reason: case insensitive filesystem */
public abstract class C9868Rih {
    public static final C8912RFf A00(String str) {
        switch (str.hashCode()) {
            case -1298290464:
                if (str.equals("Litho.Resolve.ComponentRendered")) {
                    return C8912RFf.A05;
                }
                return null;
            case 238438621:
                if (str.equals("RenderCore.RenderUnit.Mounted")) {
                    return C8912RFf.A04;
                }
                return null;
            case 542663853:
                if (str.equals("Litho.ComponentTree.Layout")) {
                    return C8912RFf.A06;
                }
                return null;
            case 781732041:
                if (str.equals("Litho.ComponentTree.Resolve")) {
                    return C8912RFf.A07;
                }
                return null;
            default:
                return null;
        }
    }
}
