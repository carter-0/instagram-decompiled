package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo;
import java.io.IOException;

public abstract class Cj5 {
    public static BroadcastChannelXpostingChannelInfo parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            SimpleImageUrl simpleImageUrl = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("thread_fbid".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("group_image_uri".equals(A17)) {
                    simpleImageUrl = 16h.A00(r15);
                } else if ("is_enabled".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r15);
                } else {
                    bool2 = C41847B3o.A0z(r15, bool2, A17, "is_available");
                }
                r15.A0z();
            }
            if (str == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("thread_fbid", r15, "BroadcastChannelXpostingChannelInfo");
            } else if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r15, "BroadcastChannelXpostingChannelInfo");
            } else if (bool == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_enabled", r15, "BroadcastChannelXpostingChannelInfo");
            } else if (bool2 != null || !(r15 instanceof 0c9)) {
                return new BroadcastChannelXpostingChannelInfo(simpleImageUrl, str, str2, str3, bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_available", r15, "BroadcastChannelXpostingChannelInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
