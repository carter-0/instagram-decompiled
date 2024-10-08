package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;

/* renamed from: X.JdM  reason: case insensitive filesystem */
public final class C60013JdM extends ClickableSpan {
    public final /* synthetic */ ReelMoreOptionsFragment A00;

    public C60013JdM(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        this.A00 = reelMoreOptionsFragment;
    }

    public final void onClick(View view) {
        Integer num = AnonymousClass05K.A00;
        ReelMoreOptionsFragment reelMoreOptionsFragment = this.A00;
        Integer num2 = reelMoreOptionsFragment.A0C;
        if (num.equals(num2)) {
            String str = reelMoreOptionsFragment.A07.A00;
            if (TextUtils.isEmpty(str.trim())) {
                C59689JTv.A03(reelMoreOptionsFragment.getContext(), reelMoreOptionsFragment.requireContext().getString(2131976821), "weblink_empty_link_error", 0);
                return;
            }
            SUL sul = new SUL(reelMoreOptionsFragment.requireActivity(), reelMoreOptionsFragment.A02, 2EG.A3B, LIL.A01(str));
            sul.A0S = "reel_more_options";
            sul.A0A();
        } else if (AnonymousClass05K.A01.equals(num2)) {
            Context requireContext = reelMoreOptionsFragment.requireContext();
            FragmentActivity requireActivity = reelMoreOptionsFragment.requireActivity();
            UserSession userSession = reelMoreOptionsFragment.A02;
            0eE r0 = AnonymousClass0t1.A01;
            User A01 = r0.A01(userSession);
            UserSession userSession2 = reelMoreOptionsFragment.A02;
            String B4Q = DbS.A0h(userSession2, r0).B4Q();
            B4Q.getClass();
            RhP.A00(requireActivity, requireContext, userSession2, 2EG.A38, A01, LIL.A01(B4Q), "reel_more_options");
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
