package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51968G9o;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchExternalMediaConfig {
    public final String appSwitchOauthUrl;
    public final String deeplinkUrl;
    public final long hostAppId;

    public static native CowatchExternalMediaConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchExternalMediaConfig)) {
            return false;
        }
        CowatchExternalMediaConfig cowatchExternalMediaConfig = (CowatchExternalMediaConfig) obj;
        return this.hostAppId == cowatchExternalMediaConfig.hostAppId && this.appSwitchOauthUrl.equals(cowatchExternalMediaConfig.appSwitchOauthUrl) && this.deeplinkUrl.equals(cowatchExternalMediaConfig.deeplinkUrl);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.appSwitchOauthUrl, C66583MXo.A01(C51968G9o.A03(this.hostAppId))) + this.deeplinkUrl.hashCode();
    }

    public CowatchExternalMediaConfig(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.hostAppId = j;
        this.appSwitchOauthUrl = str;
        this.deeplinkUrl = str2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchExternalMediaConfig{hostAppId=");
        A1A.append(this.hostAppId);
        A1A.append(",appSwitchOauthUrl=");
        A1A.append(this.appSwitchOauthUrl);
        A1A.append(",deeplinkUrl=");
        return C66584MXp.A0a(this.deeplinkUrl, A1A);
    }
}
