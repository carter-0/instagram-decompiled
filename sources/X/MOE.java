package X;

import com.instagram.common.gallery.Medium;

public final class MOE extends 0Yg implements 0sP {
    public static final MOE A00 = new MOE();

    public MOE() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        Medium medium = (Medium) obj;
        0qQ.A0B(medium, 0);
        String str = medium.A0O;
        if (str == null || (!Medium.A0j.matcher(str).matches() && !"0".equals(medium.A0O))) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
