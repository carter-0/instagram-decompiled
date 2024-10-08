package X;

import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.6f4  reason: invalid class name and case insensitive filesystem */
public final class C312726f4 {
    public final ARDFileCache A00;
    public final C312696ey A01;
    public final 0Gb A02;
    public final C312716f1 A03;
    public final 1vo A04;

    public final void A00(C312746f6 r7) {
        0xY AR4;
        C312746f6 r1 = C312746f6.WITHDRAWN;
        C312696ey r0 = this.A01;
        if (r7 != r1) {
            AR4 = r0.A00.AR4();
            AR4.ED3("flmEffectsDeleted");
        } else {
            0xa r2 = r0.A00;
            if (!r2.getBoolean("flmEffectsDeleted", false)) {
                Set allKeys = this.A00.getAllKeys();
                0qQ.A07(allKeys);
                if (allKeys.isEmpty()) {
                    AR4 = r2.AR4();
                    AR4.E5T("flmEffectsDeleted", true);
                } else {
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) allKeys);
                    0qQ.A07(copyOf);
                    try {
                        C40133ASy aSy = (C40133ASy) AAE.class.getMethod("create", new Class[0]).invoke((Object) null, new Object[0]);
                        aSy.A00.A05("effect_ids", copyOf);
                        aSy.A02 = true;
                        1Ef build = aSy.build();
                        0qQ.A07(build);
                        build.setMaxToleratedCacheAgeMs(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                        build.setFreshCacheAgeMs(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                        this.A04.ATL(new ASY(this), new C40129ASu(this, allKeys), build);
                        return;
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                return;
            }
        }
        AR4.apply();
    }

    public C312726f4(C312716f1 r3, ARDFileCache aRDFileCache, C312696ey r5, 0Gb r6, 1vo r7) {
        this.A03 = r3;
        this.A01 = r5;
        this.A04 = r7;
        this.A00 = aRDFileCache;
        this.A02 = r6;
        r3.A01.add(new C312736f5(this));
        C312746f6 r1 = r3.A04;
        r1 = r1 == null ? C312746f6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE : r1;
        if (r1 == C312746f6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) {
            r3.A00();
        } else {
            A00(r1);
        }
    }
}
