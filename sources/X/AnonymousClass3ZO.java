package X;

import com.instagram.api.schemas.OnFeedMessagesIntf;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3ZO  reason: invalid class name */
public abstract class AnonymousClass3ZO {
    public static final int A00(OnFeedMessagesIntf onFeedMessagesIntf) {
        Integer Awj;
        if (onFeedMessagesIntf == null || (Awj = onFeedMessagesIntf.Awj()) == null) {
            return -1;
        }
        return Awj.intValue();
    }

    public static final List A01(OnFeedMessagesIntf onFeedMessagesIntf) {
        List emptyList;
        if (onFeedMessagesIntf == null || onFeedMessagesIntf.BE6() == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.unmodifiableList(onFeedMessagesIntf.BE6());
        }
        0qQ.A0A(emptyList);
        return emptyList;
    }
}
