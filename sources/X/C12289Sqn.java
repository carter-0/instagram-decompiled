package X;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Sqn  reason: case insensitive filesystem */
public final class C12289Sqn implements C13723Tfp {
    public static final String[] A02 = {"base.odex", "base.vdex", "base.art", "base.oat"};
    public static final String[] A03 = {"arm", "arm64", "x86", "x86_64"};
    public final Context A00;
    public final String[] A01;

    public final String CfJ() {
        return IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE;
    }

    public C12289Sqn(Context context, String[] strArr) {
        AnonymousClass7TG.A1O(context, strArr);
        this.A00 = context;
        this.A01 = strArr;
    }

    public final HashMap E4i() {
        File file;
        HashMap A1E = AnonymousClass7TE.A1E();
        Context context = this.A00;
        File A0t = AnonymousClass7TE.A0t(context.getPackageCodePath());
        C7937QdV qdV = new C7937QdV(C258893zo.A01(A0t));
        A1E.put("apk", qdV);
        File parentFile = A0t.getParentFile();
        if (parentFile != null) {
            try {
                file = parentFile.getCanonicalFile();
            } catch (IOException unused) {
                file = parentFile.getAbsoluteFile();
            }
            0qQ.A07(file);
            C7937QdV qdV2 = new C7937QdV(C258893zo.A01(file));
            S1t s1t = new S1t(0, 0, 0);
            File A0s = JTO.A0s(file, "oat");
            String[] strArr = A03;
            for (int i = 0; i < 4; i++) {
                File A0s2 = JTO.A0s(A0s, strArr[i]);
                String[] strArr2 = this.A01;
                for (int i2 = 0; i2 < 4; i2++) {
                    String str = strArr2[i2];
                    try {
                        int length = str.length() - 1;
                        int i3 = 0;
                        boolean z = false;
                        while (i3 <= length) {
                            int i4 = length;
                            if (!z) {
                                i4 = i3;
                            }
                            boolean A1U = Dba.A1U(0qQ.A00(str.charAt(i4), 32));
                            if (!z) {
                                if (!A1U) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            } else if (A1U) {
                                length--;
                            }
                        }
                        S1t A012 = C258893zo.A01(JTO.A0s(A0s2, Dba.A0c(str, length, i3)));
                        if (A012.A02 != 0) {
                            s1t = s1t.A00(A012);
                            A1E.put(002.A0R("<oat_dir>/", str), new C7937QdV(A012));
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            C7937QdV qdV3 = new C7937QdV(s1t);
            A1E.put("extra", qdV3);
            qdV = new C7937QdV(qdV2.A00(qdV3));
        }
        long j = -1;
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(storageStatsManager == null || applicationInfo == null)) {
            try {
                StorageStats queryStatsForUid = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid);
                0qQ.A07(queryStatsForUid);
                j = queryStatsForUid.getAppBytes();
            } catch (IOException | SecurityException unused3) {
            }
        }
        if (j < 0) {
            A1E.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, qdV);
            return A1E;
        }
        A1E.put("bf_measurement", qdV);
        A1E.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, new S1t(j, j, qdV.A01));
        return A1E;
    }
}
