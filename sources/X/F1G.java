package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class F1G {
    public final FR8 A00(FragmentActivity fragmentActivity) {
        HashMap hashMap;
        FR8 fr8;
        08Y r5 = fragmentActivity.savedStateRegistryController.A01;
        AnonymousClass08X A01 = r5.A01("bloks.nav.tracker.key");
        if ((A01 instanceof FR8) && (fr8 = (FR8) A01) != null) {
            return fr8;
        }
        Bundle A00 = r5.A00("bloks.nav.tracker.key");
        if (A00 != null) {
            Set<String> keySet = A00.keySet();
            0qQ.A07(keySet);
            ArrayList A0r = AnonymousClass7TG.A0r(keySet);
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                0qQ.A0A(A18);
                AnonymousClass7TF.A1I(Integer.valueOf(Integer.parseInt(A18)), Integer.valueOf(A00.getInt(A18, -1)), A0r);
            }
            0eP[] r1 = (0eP[]) A0r.toArray(new 0eP[0]);
            hashMap = 0Yt.A02((0eP[]) Arrays.copyOf(r1, r1.length));
        } else {
            hashMap = AnonymousClass7TE.A1E();
        }
        FR8 fr82 = new FR8(hashMap);
        r5.A03(fr82, "bloks.nav.tracker.key");
        return fr82;
    }
}
