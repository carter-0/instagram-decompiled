package X;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Sqm  reason: case insensitive filesystem */
public final class C12288Sqm implements C13723Tfp {
    public final Context A00;

    public C12288Sqm(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    public final String CfJ() {
        return "sm";
    }

    public final HashMap E4i() {
        ApplicationInfo applicationInfo;
        HashMap A1E = AnonymousClass7TE.A1E();
        Context context = this.A00;
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
        if (storageStatsManager == null || (applicationInfo = context.getApplicationInfo()) == null) {
            return null;
        }
        try {
            StorageStats queryStatsForUid = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid);
            0qQ.A07(queryStatsForUid);
            A1E.put("ustats", new C12286Sqk(this, queryStatsForUid.getAppBytes(), queryStatsForUid.getDataBytes(), queryStatsForUid.getCacheBytes()));
        } catch (IOException unused) {
        }
        return A1E;
    }
}
