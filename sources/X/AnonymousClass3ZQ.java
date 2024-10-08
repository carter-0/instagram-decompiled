package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.3ZQ  reason: invalid class name */
public abstract class AnonymousClass3ZQ {
    public static final void A01(Context context, C8956RIv rIv, 0lg r15, String str, String str2) {
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(r15);
        igBloksScreenConfig.A0R = "com.bloks.www.ig.transparency_treatment";
        long parseLong = Long.parseLong(str);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        BitSet bitSet = new BitSet(3);
        hashMap.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, Long.valueOf(parseLong));
        bitSet.set(2);
        hashMap.put("product", str2);
        bitSet.set(0);
        hashMap.put("surface", A00(rIv));
        bitSet.set(1);
        if (bitSet.nextClearBit(0) >= 3) {
            C46649DiU A06 = C46649DiU.A06("com.bloks.www.ig.transparency_treatment", C359608dC.A01(hashMap), hashMap2);
            A06.A00 = 719983200;
            A06.A05 = null;
            A06.A01 = 0;
            A06.A06 = null;
            A06.A03 = null;
            A06.A02 = null;
            A06.A04 = null;
            A06.A0H(hashMap3);
            A06.A0E(context, igBloksScreenConfig);
            return;
        }
        throw new IllegalStateException("Missing Required Props");
    }

    public static final void A02(Context context, C8956RIv rIv, 0lg r16, String str, String str2) {
        0lg r0 = r16;
        0qQ.A0B(r0, 0);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(r0);
        igBloksScreenConfig.A0R = "com.bloks.www.ig.transparency_treatment";
        long parseLong = Long.parseLong(str);
        HashMap hashMap = new HashMap();
        BitSet bitSet = new BitSet(3);
        hashMap.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, Long.valueOf(parseLong));
        bitSet.set(2);
        hashMap.put("product", str2);
        bitSet.set(0);
        hashMap.put("surface", A00(rIv));
        bitSet.set(1);
        C359618dD A05 = igBloksScreenConfig.A05();
        if (bitSet.nextClearBit(0) >= 3) {
            C359638dF.A03(context, A05, "com.bloks.www.ig.transparency_treatment", (String) null, C359608dC.A01(hashMap), 3600);
            return;
        }
        throw new IllegalStateException("Missing Required Props");
    }

    public static final boolean A03(User user) {
        String C9f;
        String C9e;
        Boolean C9g = user.A03.C9g();
        if (C9g == null || !C9g.booleanValue() || (C9f = user.A03.C9f()) == null || C9f.length() == 0 || (C9e = user.A03.C9e()) == null || C9e.length() == 0) {
            return false;
        }
        return true;
    }

    public static final String A00(C8956RIv rIv) {
        int ordinal = rIv.ordinal();
        if (ordinal == 11) {
            return "feed";
        }
        if (ordinal == 12 || ordinal == 13) {
            return "profile";
        }
        if (ordinal == 17) {
            return "reels";
        }
        if (ordinal != 16) {
            return "unknown";
        }
        return "stories";
    }
}
