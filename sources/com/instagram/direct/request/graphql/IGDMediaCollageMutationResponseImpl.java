package com.instagram.direct.request.graphql;

import X.AnonymousClass4Kx;
import X.AnonymousClass4LF;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import com.instagram.realtimeclient.RealtimeConstants;

public final class IGDMediaCollageMutationResponseImpl extends C250663lr implements C250673ls {

    public final class XigIgdSendMediaCollage extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(AnonymousClass4LF.A00, RealtimeConstants.SEND_SUCCESS);
        }

        public XigIgdSendMediaCollage() {
            super(1200956054);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(XigIgdSendMediaCollage.class, "xig_igd_send_media_collage(input:$input)", 1200956054);
    }

    public IGDMediaCollageMutationResponseImpl() {
        super(109721225);
    }
}
