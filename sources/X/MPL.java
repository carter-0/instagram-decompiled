package X;

import com.instagram.common.gallery.Medium;

public final class MPL extends 0Yg implements 0sL {
    public static final MPL A00 = new MPL();

    public MPL() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C361408gB r0;
        float f;
        Medium medium = (Medium) obj;
        Medium medium2 = (Medium) obj2;
        int i = 1;
        if (medium.CeS()) {
            i = -1;
        } else if (!medium2.CeS()) {
            float A002 = medium.A00();
            float A003 = medium2.A00();
            if (!(A002 == A003 || (r0 = medium.A0F) == null)) {
                float f2 = r0.A00;
                if (f2 > 0.0f) {
                    C361408gB r02 = medium2.A0F;
                    if (r02 != null) {
                        f = r02.A00;
                    } else {
                        f = 0.0f;
                    }
                    i = Float.compare(f, f2);
                }
            }
            i = Float.compare(AnonymousClass7TE.A00(0.5625f, A002), AnonymousClass7TE.A00(0.5625f, A003));
        }
        return Integer.valueOf(i);
    }
}
