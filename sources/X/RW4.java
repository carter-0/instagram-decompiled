package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.RegularImmutableSet;

public abstract class RW4 {
    public static C10549Ru3 A00(PackageManager packageManager) {
        CompactHashMap compactHashMap = new CompactHashMap();
        Signature[] signatureArr = C10115Rmr.A02;
        int i = 0;
        do {
            Signature signature = signatureArr[i];
            Pxh.A0u("com.facebook.services", signature, compactHashMap).add(signature);
            i++;
        } while (i < 2);
        return new C10549Ru3(packageManager, ImmutableSetMultimap.A00(compactHashMap.entrySet()), RegularImmutableSet.A03);
    }
}
