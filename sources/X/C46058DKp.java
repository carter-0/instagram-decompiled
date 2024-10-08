package X;

import com.instagram.api.schemas.IABPostClickEligibleExperienceTypes;

/* renamed from: X.DKp  reason: case insensitive filesystem */
public final class C46058DKp extends 0Yg implements 0sP {
    public static final C46058DKp A00 = new C46058DKp();

    public C46058DKp() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        Object obj2 = IABPostClickEligibleExperienceTypes.A01.get(obj);
        if (obj2 == null) {
            return IABPostClickEligibleExperienceTypes.UNRECOGNIZED;
        }
        return obj2;
    }
}
