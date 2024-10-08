package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.text.BulletAwareTextView;
import com.instagram.feed.ui.text.IgLikeTextView;

/* renamed from: X.3ro  reason: invalid class name and case insensitive filesystem */
public final class C254023ro extends C249703kE implements AnonymousClass2xU {
    public TextView A00;
    public AnonymousClass3W1 A01;
    public BulletAwareTextView A02;
    public BulletAwareTextView A03;
    public String A04;
    public final ViewGroup A05;
    public final ViewStub A06;
    public final UserSession A07;
    public final C252063oV A08;
    public final AnonymousClass41O A09;
    public final 0Pl A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 49));
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final C252063oV A0E;
    public final C248533i9 A0F;
    public final String A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C254023ro(View view, UserSession userSession, C248533i9 r9, 0Pl r10, String str) {
        super(view);
        0qQ.A0B(view, 1);
        this.A0G = str;
        this.A0A = r10;
        this.A07 = userSession;
        this.A0F = r9;
        View requireViewById = view.requireViewById(R.id.row_feed_media_feedback_content);
        0qQ.A07(requireViewById);
        ViewGroup viewGroup = (ViewGroup) requireViewById;
        this.A05 = viewGroup;
        View requireViewById2 = view.requireViewById(R.id.row_feed_textview_app_attribution_stub);
        0qQ.A07(requireViewById2);
        this.A06 = (ViewStub) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.event_attribution_stub);
        0qQ.A07(requireViewById3);
        this.A0C = (ViewStub) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.political_context_stub);
        0qQ.A07(requireViewById4);
        this.A0D = (ViewStub) requireViewById4;
        C252063oV A012 = 2b1.A01(view.requireViewById(R.id.row_feed_like_more_info_stub), false, false);
        this.A0E = A012;
        View requireViewById5 = view.requireViewById(R.id.row_feed_textview_likes);
        0qQ.A07(requireViewById5);
        View requireViewById6 = view.requireViewById(R.id.like_row_container);
        0qQ.A07(requireViewById6);
        this.A09 = new AnonymousClass41O(requireViewById6, viewGroup, A012, (IgLikeTextView) requireViewById5);
        this.A08 = 2b1.A01(view.requireViewById(R.id.disclaimer_stub), false, false);
    }

    public final void DQp(AnonymousClass3W1 r8, int i) {
        AnonymousClass3W1 r4 = r8;
        0qQ.A0B(r8, 0);
        if (i == 12) {
            String str = this.A04;
            if (str != null) {
                1Xj A012 = 1E8.A03.A01(this.A07, "MediaFeedbackViewBinder.Holder", str);
                if (A012 != null) {
                    this.A0A.A0K(A012);
                    C255903uu.A01(this.A09, ((C247633gf) this.A0B.getValue()).A01(A012, (AnonymousClass4DU) null, r4, this.A0G, false), (Integer) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final TextView A00() {
        TextView textView = this.A00;
        if (textView == null) {
            View inflate = this.A0D.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate;
            this.A00 = textView;
            if (textView == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return textView;
    }

    public final BulletAwareTextView A01() {
        BulletAwareTextView bulletAwareTextView = this.A03;
        if (bulletAwareTextView == null) {
            View inflate = this.A0C.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.feed.ui.text.BulletAwareTextView");
            bulletAwareTextView = (BulletAwareTextView) inflate;
            this.A03 = bulletAwareTextView;
            if (bulletAwareTextView == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return bulletAwareTextView;
    }
}
