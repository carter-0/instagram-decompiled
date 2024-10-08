package X;

import android.os.Bundle;

/* renamed from: X.Eqr  reason: case insensitive filesystem */
public abstract class C49186Eqr {
    public static final C47519E6d A00(String str, String str2, String str3, boolean z) {
        AnonymousClass7TG.A1T(str, str2, str3);
        C47519E6d e6d = new C47519E6d();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("CommentPollVotersListFragment.SOURCE_MODULE", str);
        A0a.putString("CommentPollVotersListFragment.MEDIA_ID", str2);
        A0a.putString("CommentPollVotersListFragment.POLL_ID", str3);
        A0a.putBoolean("CommentPollVotersListFragment.SHOULD_SHOW_EMPTY_STATE", z);
        e6d.setArguments(A0a);
        return e6d;
    }
}
