package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.UgS  reason: case insensitive filesystem */
public final class C15662UgS extends C14097Tpp {
    public final /* synthetic */ C17565VaJ A00;
    public final /* synthetic */ UserSession A01;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        FollowButton followButton = new FollowButton(context, (AttributeSet) null, R.attr.updatableButtonStyle);
        followButton.setBaseStyle(C243923aK.MEDIUM);
        return followButton;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15662UgS(C17565VaJ vaJ, C307786Rm r2, C276544tV r3, UserSession userSession) {
        super(r2, r3);
        this.A00 = vaJ;
        this.A01 = userSession;
    }
}
