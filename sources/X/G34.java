package X;

import com.instagram.api.schemas.DayOfTheWeek;

public final class G34 extends 0Yg implements 0sP {
    public static final G34 A00 = new G34();

    public G34() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        Object obj2 = DayOfTheWeek.A01.get(obj);
        if (obj2 == null) {
            return DayOfTheWeek.UNRECOGNIZED;
        }
        return obj2;
    }
}
