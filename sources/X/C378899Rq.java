package X;

/* renamed from: X.9Rq  reason: invalid class name and case insensitive filesystem */
public abstract class C378899Rq {
    public static int A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 3551:
                    if (str.equals("on")) {
                        return 1;
                    }
                    break;
                case 109935:
                    if (str.equals("off")) {
                        return 0;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 2;
                    }
                    break;
                case 110547964:
                    if (str.equals("torch")) {
                        return 3;
                    }
                    break;
                case 1081542389:
                    if (str.equals("red-eye")) {
                        return 4;
                    }
                    break;
            }
        }
        return -1;
    }

    public static String A01(int i) {
        if (i == 0) {
            return "off";
        }
        if (i == 1) {
            return "on";
        }
        if (i == 2) {
            return "auto";
        }
        if (i == 3) {
            return "torch";
        }
        if (i != 4) {
            return null;
        }
        return "red-eye";
    }
}
