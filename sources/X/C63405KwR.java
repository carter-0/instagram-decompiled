package X;

import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.KwR  reason: case insensitive filesystem */
public abstract class C63405KwR {
    public static final void A00(AnonymousClass3Q2 r9, IllegalStateException illegalStateException) {
        UserStoryTarget userStoryTarget;
        String str;
        Iterator it = r9.A0K((1UV) null, 1us.class).iterator();
        String str2 = "[";
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                AnonymousClass5IC r2 = (1us) it.next();
                boolean z2 = r2 instanceof AnonymousClass5IC;
                if (z2) {
                    userStoryTarget = r2.A01();
                } else {
                    userStoryTarget = null;
                }
                Integer valueOf = Integer.valueOf(r2.C2A());
                String str3 = "N/A";
                if (r2.BtR() != null) {
                    ShareType BtR = r2.BtR();
                    0qQ.A0A(BtR);
                    str = BtR.name();
                } else {
                    str = str3;
                }
                Boolean valueOf2 = Boolean.valueOf(z2);
                if (userStoryTarget == null) {
                    z = false;
                }
                Boolean valueOf3 = Boolean.valueOf(z);
                if (userStoryTarget != null) {
                    str3 = userStoryTarget.CAh();
                }
                String format = String.format("{subShareId: %s, shareType: %s, isMultiConfigStoryTarget: %s, hasUserStoryTarget: %s, UserStoryTargetType: %s}", Arrays.copyOf(new Object[]{valueOf, str, valueOf2, valueOf3, str3}, 5));
                0qQ.A07(format);
                str2 = 002.A0R(str2, format);
            } else {
                String format2 = String.format("LegacyReelShareMapper#mapUserReelShares Exception: %s, ShareTargetList for PendingMedia: %s", Arrays.copyOf(new Object[]{illegalStateException.getMessage(), 002.A0C(str2, ']')}, 2));
                0qQ.A07(format2);
                0wb.A03("LegacyReelShareMapper#mapUserReelShares", format2);
                return;
            }
        }
    }
}
