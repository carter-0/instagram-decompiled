package X;

import android.os.Build;
import android.os.Bundle;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.InZ  reason: case insensitive filesystem */
public final class C58169InZ extends 0Yg implements C62320sa {
    public final /* synthetic */ H0Z A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58169InZ(H0Z h0z) {
        super(0);
        this.A00 = h0z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.A00.mArguments;
        if (i >= 33) {
            if (bundle != null) {
                return bundle.getParcelableArrayList("earnedAchievementTierList", Badge.AchievementBadge.class);
            }
            return null;
        } else if (bundle != null) {
            return bundle.getParcelableArrayList("earnedAchievementTierList");
        } else {
            return null;
        }
    }
}
