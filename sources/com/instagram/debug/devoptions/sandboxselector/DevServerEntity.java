package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51968G9o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DevServerEntity extends AnonymousClass0T0 {
    public static final String COLUMN_CACHE_TIMESTAMP = "cache_timestamp";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_HOST_TYPE = "host_type";
    public static final String COLUMN_SUPPORTS_VPNLESS = "supports_vpnless";
    public static final String COLUMN_URL = "url";
    public static final Companion Companion = new Object();
    public static final String TABLE_NAME = "internal_dev_servers";
    public final long cacheTimestamp;
    public final String description;
    public final String hostType;
    public final boolean supportsVpnless;
    public final String url;

    public static /* synthetic */ DevServerEntity copy$default(DevServerEntity devServerEntity, String str, String str2, String str3, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = devServerEntity.url;
        }
        if ((i & 2) != 0) {
            str2 = devServerEntity.hostType;
        }
        if ((i & 4) != 0) {
            str3 = devServerEntity.description;
        }
        if ((i & 8) != 0) {
            z = devServerEntity.supportsVpnless;
        }
        if ((i & 16) != 0) {
            j = devServerEntity.cacheTimestamp;
        }
        return devServerEntity.copy(str, str2, str3, z, j);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.hostType;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.supportsVpnless;
    }

    public final long component5() {
        return this.cacheTimestamp;
    }

    public final DevServerEntity copy(String str, String str2, String str3, boolean z, long j) {
        AnonymousClass7TG.A1T(str, str2, str3);
        return new DevServerEntity(str, str2, str3, z, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevServerEntity) {
                DevServerEntity devServerEntity = (DevServerEntity) obj;
                if (!0qQ.A0K(this.url, devServerEntity.url) || !0qQ.A0K(this.hostType, devServerEntity.hostType) || !0qQ.A0K(this.description, devServerEntity.description) || this.supportsVpnless != devServerEntity.supportsVpnless || this.cacheTimestamp != devServerEntity.cacheTimestamp) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final long getCacheTimestamp() {
        return this.cacheTimestamp;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHostType() {
        return this.hostType;
    }

    public final boolean getSupportsVpnless() {
        return this.supportsVpnless;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass7TF.A09(this.supportsVpnless, AnonymousClass7TF.A08(this.description, AnonymousClass7TF.A08(this.hostType, AnonymousClass7TE.A0O(this.url)))) + C51968G9o.A03(this.cacheTimestamp);
    }

    public DevServerEntity(String str, String str2, String str3, boolean z, long j) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.url = str;
        this.hostType = str2;
        this.description = str3;
        this.supportsVpnless = z;
        this.cacheTimestamp = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DevServerEntity(String str, String str2, String str3, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, (i & 16) != 0 ? AnonymousClass7TG.A0I() : j);
    }
}
