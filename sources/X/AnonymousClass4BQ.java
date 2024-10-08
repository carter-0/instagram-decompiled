package X;

import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4BQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4BQ implements 1aV {
    public final /* synthetic */ C255653uU A00;

    public /* synthetic */ AnonymousClass4BQ(C255653uU r1) {
        this.A00 = r1;
    }

    public final void accept(Object obj) {
        C256793wM A02;
        List list;
        C255653uU r6 = this.A00;
        Set set = (Set) obj;
        HashSet hashSet = new HashSet();
        C255623uR r1 = r6.A07;
        if (r1 == C255623uR.DASH_VOD || r1 == C255623uR.DASH_LIVE) {
            try {
                C256343vc r2 = new C256343vc();
                Uri uri = r6.A05;
                if (uri == null) {
                    uri = Uri.parse("");
                }
                C256633w6 A022 = C256373vf.A02(uri, r2, r6.A09);
                List<C256773wK> emptyList = Collections.emptyList();
                if (!(A022 == null || (A02 = A022.A02(0)) == null || (list = A02.A03) == null)) {
                    emptyList = list;
                }
                for (C256773wK r0 : emptyList) {
                    int i = r0.A01;
                    if (i == 1) {
                        hashSet.add(C256803wN.HAS_AUDIO);
                    } else if (i == 2) {
                        hashSet.add(C256803wN.HAS_VIDEO);
                    }
                }
            } catch (AnonymousClass2A6 unused) {
            }
        } else {
            hashSet.add(C256803wN.HAS_AUDIO);
            hashSet.add(C256803wN.HAS_VIDEO);
        }
        set.addAll(hashSet);
    }
}
