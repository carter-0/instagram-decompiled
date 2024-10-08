package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.filelogging.gen.LogFile;
import com.facebook.rsys.filelogging.gen.LogFileStats;
import com.facebook.rsys.networktraffic.gen.HttpStats;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficApi;

/* renamed from: X.SmN  reason: case insensitive filesystem */
public final class C12068SmN implements 2LV {
    public final int A00;

    public C12068SmN(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object AJq(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return LogFile.CProxy.createFromMcfType(mcfReference);
            case 1:
                return LogFileStats.createFromMcfType(mcfReference);
            case 2:
                return HttpStats.createFromMcfType(mcfReference);
            default:
                return NetworkTrafficApi.CProxy.createFromMcfType(mcfReference);
        }
    }

    public final Class BTf() {
        switch (this.A00) {
            case 0:
                return LogFile.class;
            case 1:
                return LogFileStats.class;
            case 2:
                return HttpStats.class;
            default:
                return NetworkTrafficApi.class;
        }
    }

    public final long CAr() {
        switch (this.A00) {
            case 0:
                long j = LogFile.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = LogFile.CProxy.nativeGetMcfTypeId();
                LogFile.CProxy.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = LogFileStats.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = LogFileStats.nativeGetMcfTypeId();
                LogFileStats.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = HttpStats.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = HttpStats.nativeGetMcfTypeId();
                HttpStats.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            default:
                long j4 = NetworkTrafficApi.CProxy.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = NetworkTrafficApi.CProxy.nativeGetMcfTypeId();
                NetworkTrafficApi.CProxy.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
        }
    }
}
