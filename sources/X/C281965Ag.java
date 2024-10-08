package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagFollowStatus;
import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.5Ag  reason: invalid class name and case insensitive filesystem */
public abstract class C281965Ag {
    public static final HashtagImpl A00(String str) {
        String str2 = str;
        0qQ.A0B(str2, 0);
        return new HashtagImpl((ImageUrl) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, str2, (String) null, (String) null);
    }

    public static final HashtagImpl A01(String str, String str2) {
        return new HashtagImpl((ImageUrl) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (String) null, str, str2, (String) null, (String) null);
    }

    public static final boolean A03(Hashtag hashtag) {
        Integer B6q;
        if (hashtag == null || hashtag.B6q() == null || (B6q = hashtag.B6q()) == null || B6q.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final String A02(Hashtag hashtag) {
        HashtagFollowStatus hashtagFollowStatus;
        if (A03(hashtag)) {
            hashtagFollowStatus = HashtagFollowStatus.FOLLOWING;
        } else {
            hashtagFollowStatus = HashtagFollowStatus.NOT_FOLLOWING;
        }
        return hashtagFollowStatus.A00;
    }
}
