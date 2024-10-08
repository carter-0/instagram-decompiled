package X;

import android.content.Context;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.WKi  reason: case insensitive filesystem */
public final class C19078WKi implements C20883X2n {
    public final /* synthetic */ C255653uU A00;
    public final /* synthetic */ HeroPlayerSetting A01;

    public C19078WKi(C255653uU r1, HeroPlayerSetting heroPlayerSetting) {
        this.A00 = r1;
        this.A01 = heroPlayerSetting;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C256793wM A02;
        List list;
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        0qQ.A0B(abstractCollection, 0);
        C255653uU r8 = this.A00;
        HeroPlayerSetting heroPlayerSetting = this.A01;
        Context context = C60960kU.A00;
        boolean z = W14.A04;
        HashSet hashSet = new HashSet();
        C255623uR r1 = r8.A07;
        if (r1 == C255623uR.DASH_VOD || r1 == C255623uR.DASH_LIVE) {
            try {
                C256633w6 A022 = C256373vf.A02(r8.A05, new C256343vc(context, heroPlayerSetting, r8.A0G, false), r8.A09);
                List<C256773wK> list2 = 0sn.A00;
                if (!(A022 == null || (A02 = A022.A02(0)) == null || (list = A02.A03) == null)) {
                    list2 = list;
                }
                for (C256773wK r0 : list2) {
                    if (r0 != null) {
                        int i = r0.A01;
                        if (Integer.valueOf(i) != null) {
                            if (i == 1) {
                                hashSet.add(C16529UwZ.HAS_AUDIO);
                            } else if (i == 2) {
                                hashSet.add(C16529UwZ.HAS_VIDEO);
                            }
                        }
                    }
                }
            } catch (AnonymousClass2A6 unused) {
            }
        } else {
            hashSet.add(C16529UwZ.HAS_AUDIO);
            hashSet.add(C16529UwZ.HAS_VIDEO);
        }
        abstractCollection.addAll(hashSet);
    }
}
