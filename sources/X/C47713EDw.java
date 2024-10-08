package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.EDw  reason: case insensitive filesystem */
public final class C47713EDw extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r7, C276544tV r8, Object obj) {
        Hashtag hashtag;
        HashtagFollowButton hashtagFollowButton = (HashtagFollowButton) view;
        UserSession A01 = 0Gl.A01(C308206Td.A0A(r7));
        String A00 = C273654mx.A00(1277);
        if (A01 == null) {
            1Kn.A02(A00, "Attempt to render hashtag follow button component outside a logged in user context.");
            return null;
        }
        EtK etK = (EtK) C276544tV.A00(r8, 35);
        if (etK == null || (hashtag = etK.A00) == null) {
            1Kn.A02(A00, C273654mx.A00(1276));
        } else {
            hashtagFollowButton.A01(C308206Td.A07(r7), new C50467FcF(this, r7, r8, A01), hashtag);
        }
        hashtagFollowButton.A00 = new C19391WXi(this, r7, r8);
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r3, C276544tV r4, Object obj, Object obj2) {
        ((HashtagFollowButton) view).A00 = null;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return new HashtagFollowButton(context, (AttributeSet) null, R.attr.updatableButtonStyle);
    }

    public C47713EDw(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
