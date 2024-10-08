package com.instagram.direct.stella.api;

import X.0oU;
import X.AnonymousClass05K;

public enum IpcConstants$RequestAction {
    SEND_MESSAGE_ACTION(AnonymousClass05K.A0P),
    MARK_MESSAGE_SEEN_ACTION(AnonymousClass05K.A0G),
    FETCH_INSTAGRAM_CONTACTS(AnonymousClass05K.A1F),
    FETCH_UNSEEN_MESSAGES(AnonymousClass05K.A0E),
    OPT_OUT_INSTAGRAM(AnonymousClass05K.A0K),
    SHARE_MEDIA_PRIVATE(AnonymousClass05K.A0Q),
    SHARE_MEDIA_STORY_PUBLISH(r2),
    SHARE_MEDIA_STORY_DRAFT(r2),
    PENDING_IMPORTS(AnonymousClass05K.A0M),
    FETCH_PENDING_MEDIA(AnonymousClass05K.A0Z),
    START_CALL_ACTION(AnonymousClass05K.A0U),
    FETCH_LOGS_ACTION(AnonymousClass05K.A02),
    CONNECTED_USER_ACTIVE(AnonymousClass05K.A0W),
    IMPORT_MEDIA_ITEM(AnonymousClass05K.A0a),
    MEDIA_ITEM_IMPORT_STATUS(AnonymousClass05K.A0b),
    ANSWER_CALL_ACTION(AnonymousClass05K.A00),
    END_CALL_ACTION(AnonymousClass05K.A0u),
    DECLINE_CALL_ACTION(AnonymousClass05K.A15);
    
    public final Integer A00;

    /* access modifiers changed from: public */
    static {
        IpcConstants$RequestAction[] ipcConstants$RequestActionArr;
        A01 = 0oU.A00(ipcConstants$RequestActionArr);
    }

    /* access modifiers changed from: public */
    IpcConstants$RequestAction(Integer num) {
        this.A00 = num;
    }
}
