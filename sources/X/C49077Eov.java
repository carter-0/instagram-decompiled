package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.profile.intf.UserDetailEntryInfo;
import java.util.List;

/* renamed from: X.Eov  reason: case insensitive filesystem */
public abstract class C49077Eov {
    public static final UserDetailEntryInfo A00(Hashtag hashtag) {
        return new UserDetailEntryInfo(hashtag.getId(), hashtag.getName(), C281965Ag.A02(hashtag), "hashtag", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null);
    }
}
