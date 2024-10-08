package X;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import java.util.HashMap;

/* renamed from: X.90H  reason: invalid class name */
public final class AnonymousClass90H implements C328007Db, C74455PvA, C328017Dc, C328027Dd {
    public C70762OKi A00;
    public C66819MdB A01;
    public C328087Dj A02;
    public final View A03;
    public final FrameLayout A04;
    public final ImageView A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C252063oV A08;
    public final C252063oV A09;
    public final IgProgressImageView A0A;
    public final IgProgressImageViewProgressBar A0B;
    public final AnonymousClass9HC A0C;
    public final AnonymousClass7RY A0D;

    public AnonymousClass90H(View view, AnonymousClass0iw r6, UserSession userSession, AnonymousClass9HC r8, AnonymousClass7RY r9) {
        0qQ.A0B(view, 1);
        this.A07 = userSession;
        this.A06 = r6;
        View requireViewById = view.requireViewById(R.id.message_content_visual_thumbnail_bubble_container);
        0qQ.A07(requireViewById);
        FrameLayout frameLayout = (FrameLayout) requireViewById;
        this.A04 = frameLayout;
        View requireViewById2 = view.requireViewById(R.id.pending_overlay);
        0qQ.A07(requireViewById2);
        this.A03 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.image);
        0qQ.A07(requireViewById3);
        this.A0A = (IgProgressImageView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.upload_progress_indicator);
        0qQ.A07(requireViewById4);
        this.A0B = (IgProgressImageViewProgressBar) requireViewById4;
        View findViewById = view.findViewById(R.id.direct_expired_tombstone_text_stub);
        if (findViewById != null) {
            C252063oV A012 = 2b1.A01(findViewById, false, false);
            this.A08 = A012;
            View requireViewById5 = view.requireViewById(R.id.direct_unseen_indicator);
            0qQ.A07(requireViewById5);
            this.A05 = (ImageView) requireViewById5;
            A012.EeU(new AZY(this));
            this.A09 = 2b1.A01(frameLayout.requireViewById(R.id.privacy_visual_overlay_stub), false, false);
            this.A0C = r8;
            this.A0D = r9;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final View BJd() {
        return this.A04;
    }

    public final C328087Dj BY0() {
        return this.A02;
    }

    public final void DOd() {
        this.A0B.setVisibility(8);
        AnonymousClass7RY r1 = this.A0D;
        HashMap hashMap = r1.A05;
        if (hashMap.containsKey(this)) {
            C332967Xd r12 = (C332967Xd) r1.A02;
            Object obj = hashMap.get(this);
            if (obj != null) {
                r12.DQa(((AnonymousClass7FV) obj).BSG().A01);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void DOe() {
        IgProgressImageViewProgressBar igProgressImageViewProgressBar = this.A0B;
        igProgressImageViewProgressBar.setVisibility(8);
        igProgressImageViewProgressBar.setIndeterminate(true);
        igProgressImageViewProgressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        igProgressImageViewProgressBar.setVisibility(0);
    }

    public final void DQc() {
        this.A05.setVisibility(8);
    }

    public final void FHQ(int i) {
        AnonymousClass7PT.A00(this.A05.getDrawable(), i + (this.A0A.getHeight() / 2));
    }

    public final void EeT(C328087Dj r1) {
        this.A02 = r1;
    }
}
