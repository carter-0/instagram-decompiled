package X;

import java.util.NoSuchElementException;

public final class MPE extends 0Yg implements 0sL {
    public static final MPE A00 = new MPE();

    public MPE() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean z;
        String str = ((F0B) obj).A00;
        String str2 = ((F0B) obj2).A00;
        boolean z2 = false;
        if (str == null) {
            z = false;
        } else if (str.length() == 0) {
            throw new NoSuchElementException(AnonymousClass000.A00(887));
        } else {
            z = Character.isLetter(str.charAt(0));
        }
        if (str2 != null) {
            if (str2.length() == 0) {
                throw new NoSuchElementException(AnonymousClass000.A00(887));
            }
            z2 = Character.isLetter(str2.charAt(0));
        }
        int i = 1;
        if (z == z2) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            i = str.compareToIgnoreCase(str2);
        } else if (z) {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
