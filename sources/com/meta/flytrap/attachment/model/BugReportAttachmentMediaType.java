package com.meta.flytrap.attachment.model;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C255463uA;
import X.C73892PlT;
import kotlinx.serialization.Serializable;

@Serializable
public enum BugReportAttachmentMediaType {
    NON_MEDIA,
    SCREENSHOT,
    VIDEO;
    
    public static final AnonymousClass0eM A00 = null;
    public static final Companion Companion = null;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) BugReportAttachmentMediaType.A00.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.meta.flytrap.attachment.model.BugReportAttachmentMediaType$Companion, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        BugReportAttachmentMediaType[] bugReportAttachmentMediaTypeArr;
        A01 = 0oU.A00(bugReportAttachmentMediaTypeArr);
        Companion = new Object();
        A00 = AnonymousClass0eN.A00(0eO.A03, C73892PlT.A00);
    }
}
