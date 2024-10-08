package X;

import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.7uf  reason: invalid class name and case insensitive filesystem */
public abstract class C346137uf {
    public static final List A00(String str) {
        ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling;
        0qQ.A0B(str, 0);
        if (str.equals("")) {
            return 0sn.A00;
        }
        List<String> A0R = 00l.A0R(str, new String[]{"␞"}, 0);
        ArrayList arrayList = new ArrayList();
        for (String A00 : A0R) {
            try {
                aRCapabilityMinVersionModeling = AnonymousClass55b.parseFromJson(16P.A00(A00));
            } catch (1bD unused) {
                aRCapabilityMinVersionModeling = null;
            }
            if (aRCapabilityMinVersionModeling != null) {
                arrayList.add(aRCapabilityMinVersionModeling);
            }
        }
        return arrayList;
    }

    public static final List A01(String str) {
        C64085LMd lMd;
        if (str == null) {
            return null;
        }
        if (str.equals("")) {
            return 0sn.A00;
        }
        List<String> A0R = 00l.A0R(str, new String[]{"␞"}, 0);
        ArrayList arrayList = new ArrayList();
        for (String A00 : A0R) {
            try {
                lMd = C18176Vmq.parseFromJson(16P.A00(A00));
            } catch (1bD unused) {
                lMd = null;
            }
            if (lMd != null) {
                arrayList.add(lMd);
            }
        }
        return arrayList;
    }

    public static final List A02(String str) {
        C346167ui r0;
        0qQ.A0B(str, 0);
        if (str.equals("")) {
            return 0sn.A00;
        }
        List<String> A0R = 00l.A0R(str, new String[]{"␞"}, 0);
        ArrayList arrayList = new ArrayList();
        for (String A00 : A0R) {
            try {
                r0 = C346157uh.parseFromJson(16P.A00(A00));
            } catch (1bD unused) {
                r0 = null;
            }
            if (r0 != null) {
                arrayList.add(r0);
            }
        }
        return arrayList;
    }

    public static final List A03(String str) {
        0qQ.A0B(str, 0);
        if (str.equals("")) {
            return 0sn.A00;
        }
        return 00l.A0R(str, new String[]{","}, 0);
    }

    public static final Set A04(String str) {
        0qQ.A0B(str, 0);
        if (str.equals("")) {
            return 0sl.A00;
        }
        return new HashSet(00l.A0R(str, new String[]{","}, 0));
    }
}
