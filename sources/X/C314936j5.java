package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6j5  reason: invalid class name and case insensitive filesystem */
public final class C314936j5 implements C314016hW {
    public final UserSession A00;
    public final C273384mU A01;

    public C314936j5(UserSession userSession, C273384mU r3) {
        0qQ.A0B(userSession, 2);
        this.A01 = r3;
        this.A00 = userSession;
    }

    public final boolean Cn1(C255773uh r2, C250973mM r3, C309426Yf r4, float f) {
        return false;
    }

    public final void DaV(C255773uh r8, C250973mM r9, C309426Yf r10, float f) {
        User CCd;
        C316006kx r1;
        C316136lA r0;
        View view;
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 2);
        1Ns r02 = r9.A0H.A0W;
        if (r02 != null && (CCd = r02.CCd()) != null && ((double) f) >= 0.02d && !r10.A14) {
            UserSession userSession = this.A00;
            if (AnonymousClass6YU.A00(userSession, CCd)) {
                r10.A14 = true;
                C313056fm r03 = ((ReelViewerFragment) this.A01).mViewPager;
                Object obj = null;
                if (!(r03 == null || (view = ((C313046fl) r03).A04.A0F) == null)) {
                    obj = view.getTag();
                }
                if ((obj instanceof C316006kx) && (r1 = (C316006kx) obj) != null && (r0 = r1.A1e) != null) {
                    C252063oV r3 = r0.A1a;
                    if (r3.CVM()) {
                        C52369GPq.A03(new C52369GPq(userSession, "story-reply-sparkle"), 00y.A0n(10, CCd.getId()), "story_reply_message_ai_impression");
                        ImageView imageView = (ImageView) r3.getView();
                        C58695Iw4 iw4 = new C58695Iw4(45, (Object) CCd, (Object) this, (Object) r10);
                        0qQ.A0B(imageView, 0);
                        AnonymousClass61R A002 = C303756Aq.A00(imageView.getContext(), R.raw.story_reply_sparkle_animation);
                        imageView.setImageDrawable(A002);
                        if (A002 != null) {
                            A002.A8s(new U0B(iw4));
                            A002.E2p();
                        }
                    }
                }
            }
        }
    }
}
