package com.facebook.rsys.mediasync.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class MediaSyncContent {
    public static 2LV CONVERTER = C71546Omh.A00(56);
    public static long sMcfTypeId;
    public final FacebookVideoContent facebookVideoContent;
    public final Fallback fallback;
    public final InstagramContent instagramContent;
    public final Placeholder placeholder;

    public static native MediaSyncContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaSyncContent)) {
                return false;
            }
            MediaSyncContent mediaSyncContent = (MediaSyncContent) obj;
            InstagramContent instagramContent2 = this.instagramContent;
            InstagramContent instagramContent3 = mediaSyncContent.instagramContent;
            if (instagramContent2 == null) {
                if (instagramContent3 != null) {
                    return false;
                }
            } else if (!instagramContent2.equals(instagramContent3)) {
                return false;
            }
            FacebookVideoContent facebookVideoContent2 = this.facebookVideoContent;
            FacebookVideoContent facebookVideoContent3 = mediaSyncContent.facebookVideoContent;
            if (facebookVideoContent2 == null) {
                if (facebookVideoContent3 != null) {
                    return false;
                }
            } else if (!facebookVideoContent2.equals(facebookVideoContent3)) {
                return false;
            }
            Placeholder placeholder2 = this.placeholder;
            Placeholder placeholder3 = mediaSyncContent.placeholder;
            if (placeholder2 == null) {
                if (placeholder3 != null) {
                    return false;
                }
            } else if (!placeholder2.equals(placeholder3)) {
                return false;
            }
            Fallback fallback2 = this.fallback;
            Fallback fallback3 = mediaSyncContent.fallback;
            if (fallback2 != null) {
                return fallback2.equals(fallback3);
            }
            if (fallback3 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((C66583MXo.A01(AnonymousClass7TG.A0C(this.instagramContent)) + AnonymousClass7TG.A0C(this.facebookVideoContent)) * 31) + AnonymousClass7TG.A0C(this.placeholder)) * 31) + AnonymousClass7TE.A0L(this.fallback);
    }

    public MediaSyncContent(InstagramContent instagramContent2, FacebookVideoContent facebookVideoContent2, Placeholder placeholder2, Fallback fallback2) {
        this.instagramContent = instagramContent2;
        this.facebookVideoContent = facebookVideoContent2;
        this.placeholder = placeholder2;
        this.fallback = fallback2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaSyncContent{instagramContent=");
        A1A.append(this.instagramContent);
        A1A.append(",facebookVideoContent=");
        A1A.append(this.facebookVideoContent);
        A1A.append(",placeholder=");
        A1A.append(this.placeholder);
        A1A.append(",fallback=");
        return C66582MXn.A0v(this.fallback, A1A);
    }
}
