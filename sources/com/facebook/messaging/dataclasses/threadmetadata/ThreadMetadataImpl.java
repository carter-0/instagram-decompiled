package com.facebook.messaging.dataclasses.threadmetadata;

import X.AnonymousClass4Kr;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass69U;
import X.AnonymousClass7TE;
import X.BY9;
import X.BYA;
import X.BYB;
import X.BYC;
import X.BYD;
import X.C250663lr;
import X.C41845B3m;

public final class ThreadMetadataImpl extends C250663lr implements ThreadMetadata {
    public AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass69U r4 = AnonymousClass69U.A00;
        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r4, "theme_fbid");
        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "cannot_reply_reason");
        AnonymousClass4L8 r5 = AnonymousClass4L8.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, AnonymousClass7TE.A0f(r5, "message_sound"), C41845B3m.A0A(AnonymousClass4Ks.A00(), BY9.class, "magic_words", 1012943950), AnonymousClass7TE.A0f(r5, "is_typing_indicator_disabled"), C41845B3m.A0A(AnonymousClass4Ks.A00(), BYC.class, "pinned_messages", 677957164), C41845B3m.A0C(BYD.class, "ttlc_message_type", -709565677), AnonymousClass7TE.A0f(r4, "call_link_id"), C41845B3m.A0C(BYA.class, "marketplace_trust_signal_data", -803034252), C41845B3m.A0C(BYB.class, "message_ephemerality_setting", 899890693)});
    }

    public ThreadMetadataImpl(int i) {
        super(i);
    }

    public ThreadMetadataImpl() {
        super(-1932172617);
    }
}
