package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.HrP  reason: case insensitive filesystem */
public final class C56017HrP {
    public final H0Z A00(String str, String str2, List list, List list2) {
        AnonymousClass7TG.A1N(str, list);
        H0Z h0z = new H0Z();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("entryPoint", str2);
        A0a.putString("achievementTitle", str);
        A0a.putParcelableArrayList("earnedAchievementTierList", AnonymousClass7TE.A1D(list));
        A0a.putParcelableArrayList("unearnedAchievementTierList", AnonymousClass7TE.A1D(list2));
        h0z.setArguments(A0a);
        return h0z;
    }

    public final H0Y A01(String str, List list) {
        AnonymousClass7TG.A1N(str, list);
        H0Y h0y = new H0Y();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("challengeTitle", str);
        A0a.putParcelableArrayList("challengeTierList", AnonymousClass7TE.A1D(list));
        h0y.setArguments(A0a);
        return h0y;
    }
}
