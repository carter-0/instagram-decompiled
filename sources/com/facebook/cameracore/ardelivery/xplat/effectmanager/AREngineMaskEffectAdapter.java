package com.facebook.cameracore.ardelivery.xplat.effectmanager;

import X.0qQ;
import X.AnonymousClass80A;
import X.C371458yK;
import X.C371508yW;
import X.C371528yY;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import java.io.File;

public final class AREngineMaskEffectAdapter implements AREngineEffectAdapter {
    public C371458yK toAREngineEffect(File file, XplatModelPaths xplatModelPaths, C371508yW r12, ARRequestAsset aRRequestAsset, String str, String str2) {
        0qQ.A0B(file, 0);
        0qQ.A0B(xplatModelPaths, 1);
        0qQ.A0B(r12, 2);
        0qQ.A0B(aRRequestAsset, 3);
        0qQ.A0B(str, 4);
        0qQ.A0B(str2, 5);
        C371458yK r2 = new C371458yK(xplatModelPaths.aRModelPaths, r12);
        AnonymousClass80A r1 = aRRequestAsset.A02;
        String str3 = r1.A09;
        String str4 = r1.A0A;
        String absolutePath = file.getAbsolutePath();
        if (!TextUtils.isEmpty(absolutePath) && str3 != null) {
            r2.A05.add(new C371528yY(aRRequestAsset.A04, str3, str4, r1.A0B, absolutePath));
        }
        r2.A01 = str;
        r2.A02 = str2;
        return r2;
    }
}
