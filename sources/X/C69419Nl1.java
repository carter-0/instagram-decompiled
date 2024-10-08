package X;

import java.util.Locale;

/* renamed from: X.Nl1  reason: case insensitive filesystem */
public enum C69419Nl1 {
    TOP_LEFT("top_left"),
    TOP_RIGHT("top_right"),
    BOTTOM_LEFT("bottom_left"),
    BOTTOM_RIGHT("bottom_right");
    
    public final String A00;

    public static C69419Nl1 A00(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case -966253391:
                    if (lowerCase.equals("top_left")) {
                        return TOP_LEFT;
                    }
                    break;
                case -609197669:
                    if (lowerCase.equals("bottom_left")) {
                        return BOTTOM_LEFT;
                    }
                    break;
                case 116576946:
                    if (lowerCase.equals("top_right")) {
                        return TOP_RIGHT;
                    }
                    break;
            }
        }
        return BOTTOM_RIGHT;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C69419Nl1(String str) {
        this.A00 = str;
    }
}
