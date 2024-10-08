package com.facebook.rsys.livevideo.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class LiveVideoCreationParameters {
    public static 2LV CONVERTER = C22180Xwq.A00(60);
    public static long sMcfTypeId;
    public final int audience;
    public final boolean autoStart;
    public final ArrayList friendsList;
    public final String funnelSessionId;
    public final ArrayList shareSurfaces;
    public final int target;
    public final String targetId;
    public final String title;

    public static native LiveVideoCreationParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveVideoCreationParameters)) {
                return false;
            }
            LiveVideoCreationParameters liveVideoCreationParameters = (LiveVideoCreationParameters) obj;
            if (this.audience != liveVideoCreationParameters.audience || this.target != liveVideoCreationParameters.target || !this.targetId.equals(liveVideoCreationParameters.targetId)) {
                return false;
            }
            ArrayList arrayList = this.friendsList;
            ArrayList arrayList2 = liveVideoCreationParameters.friendsList;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            String str = this.title;
            String str2 = liveVideoCreationParameters.title;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.funnelSessionId.equals(liveVideoCreationParameters.funnelSessionId) || this.autoStart != liveVideoCreationParameters.autoStart) {
                return false;
            }
            ArrayList arrayList3 = this.shareSurfaces;
            ArrayList arrayList4 = liveVideoCreationParameters.shareSurfaces;
            if (arrayList3 != null) {
                return arrayList3.equals(arrayList4);
            }
            if (arrayList4 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        String str = this.targetId;
        return ((AnonymousClass7TF.A08(this.funnelSessionId, (((AnonymousClass7TF.A08(str, (C66583MXo.A01(this.audience) + this.target) * 31) + AnonymousClass7TG.A0C(this.friendsList)) * 31) + AnonymousClass7TG.A0E(this.title)) * 31) + (this.autoStart ? 1 : 0)) * 31) + AnonymousClass7TE.A0L(this.shareSurfaces);
    }

    public LiveVideoCreationParameters(int i, int i2, String str, ArrayList arrayList, String str2, String str3, boolean z, ArrayList arrayList2) {
        str.getClass();
        str3.getClass();
        this.audience = i;
        this.target = i2;
        this.targetId = str;
        this.friendsList = arrayList;
        this.title = str2;
        this.funnelSessionId = str3;
        this.autoStart = z;
        this.shareSurfaces = arrayList2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LiveVideoCreationParameters{audience=");
        A1A.append(this.audience);
        A1A.append(",target=");
        A1A.append(this.target);
        A1A.append(",targetId=");
        A1A.append(this.targetId);
        A1A.append(",friendsList=");
        A1A.append(this.friendsList);
        A1A.append(",title=");
        A1A.append(this.title);
        A1A.append(",funnelSessionId=");
        A1A.append(this.funnelSessionId);
        A1A.append(",autoStart=");
        A1A.append(this.autoStart);
        A1A.append(",shareSurfaces=");
        return C66582MXn.A0v(this.shareSurfaces, A1A);
    }
}
