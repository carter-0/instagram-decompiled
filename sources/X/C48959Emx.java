package X;

import com.instagram.api.schemas.XIGIGBoostCallToAction;

/* renamed from: X.Emx  reason: case insensitive filesystem */
public abstract class C48959Emx {
    public static final int A00(XIGIGBoostCallToAction xIGIGBoostCallToAction) {
        int A02 = DbU.A02(xIGIGBoostCallToAction, 1);
        if (A02 == 17) {
            return 2131970572;
        }
        if (A02 == 22) {
            return 2131970757;
        }
        if (A02 == 1) {
            return 2131970175;
        }
        if (A02 == 14) {
            return 2131970554;
        }
        if (A02 == 23) {
            return 2131970796;
        }
        throw AnonymousClass7TE.A15("Unimplemented XIGIGBoostCallToAction.UNRECOGNIZED, would have crashed anyway.");
    }
}
