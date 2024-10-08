package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51975G9x;
import X.C66579MXk;
import com.google.gson.annotations.SerializedName;

public final class ImagineRawData extends AnonymousClass0T0 {
    @SerializedName("media_type")
    public final String mediaType;
    @SerializedName("prompt")
    public final String prompt;
    @SerializedName("request_id")
    public final String requestId;
    @SerializedName("response_id")
    public final String responseId;
    @SerializedName("temporary_handle")
    public final String temporaryHandle;
    @SerializedName("uri")
    public final String uri;

    public static /* synthetic */ ImagineRawData copy$default(ImagineRawData imagineRawData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str6;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        if ((i & 1) != 0) {
            str12 = imagineRawData.mediaType;
        }
        if ((i & 2) != 0) {
            str11 = imagineRawData.prompt;
        }
        if ((i & 4) != 0) {
            str10 = imagineRawData.uri;
        }
        if ((i & 8) != 0) {
            str9 = imagineRawData.temporaryHandle;
        }
        if ((i & 16) != 0) {
            str8 = imagineRawData.requestId;
        }
        if ((i & 32) != 0) {
            str7 = imagineRawData.responseId;
        }
        return new ImagineRawData(str12, str11, str10, str9, str8, str7);
    }

    public final String component1() {
        return this.mediaType;
    }

    public final String component2() {
        return this.prompt;
    }

    public final String component3() {
        return this.uri;
    }

    public final String component4() {
        return this.temporaryHandle;
    }

    public final String component5() {
        return this.requestId;
    }

    public final String component6() {
        return this.responseId;
    }

    public final ImagineRawData copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ImagineRawData(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImagineRawData) {
                ImagineRawData imagineRawData = (ImagineRawData) obj;
                if (!0qQ.A0K(this.mediaType, imagineRawData.mediaType) || !0qQ.A0K(this.prompt, imagineRawData.prompt) || !0qQ.A0K(this.uri, imagineRawData.uri) || !0qQ.A0K(this.temporaryHandle, imagineRawData.temporaryHandle) || !0qQ.A0K(this.requestId, imagineRawData.requestId) || !0qQ.A0K(this.responseId, imagineRawData.responseId)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getResponseId() {
        return this.responseId;
    }

    public final String getTemporaryHandle() {
        return this.temporaryHandle;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.mediaType) * 31) + AnonymousClass7TG.A0E(this.prompt)) * 31) + AnonymousClass7TG.A0E(this.uri)) * 31) + AnonymousClass7TG.A0E(this.temporaryHandle)) * 31) + AnonymousClass7TG.A0E(this.requestId)) * 31) + C41845B3m.A00(this.responseId);
    }

    public ImagineRawData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.mediaType = str;
        this.prompt = str2;
        this.uri = str3;
        this.temporaryHandle = str4;
        this.requestId = str5;
        this.responseId = str6;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImagineRawData(mediaType=");
        A1A.append(this.mediaType);
        A1A.append(", prompt=");
        A1A.append(this.prompt);
        A1A.append(C66579MXk.A00(83));
        A1A.append(this.uri);
        A1A.append(", temporaryHandle=");
        A1A.append(this.temporaryHandle);
        A1A.append(", requestId=");
        A1A.append(this.requestId);
        A1A.append(", responseId=");
        return C51975G9x.A0i(this.responseId, A1A);
    }
}
