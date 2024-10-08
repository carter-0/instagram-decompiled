package X;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.TxZ  reason: case insensitive filesystem */
public final class C14513TxZ extends AnonymousClass6UX {
    public final RecyclerView A00;
    public final C2366034j A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass6UW A04;

    public C14513TxZ(Activity activity, RecyclerView recyclerView, AnonymousClass0iw r11, UserSession userSession, AnonymousClass3BQ r13, C230222pE r14, boolean z) {
        super(activity, r14);
        this.A03 = userSession;
        RecyclerView recyclerView2 = recyclerView;
        this.A00 = recyclerView;
        this.A01 = recyclerView.A0A;
        this.A02 = recyclerView.getContext();
        AnonymousClass0iw r3 = r11;
        this.A04 = new AnonymousClass6UW(activity, recyclerView2, r3, userSession, r13, r14, z);
    }

    public final boolean A07() {
        return true;
    }

    private void A00(Reel reel, boolean z) {
        C241113Nx r2;
        C249703kE A0W = this.A00.A0W(this.A01.CMG(reel));
        if ((A0W instanceof C241113Nx) && (r2 = (C241113Nx) A0W) != null) {
            r2.B8N().setVisibility(JTQ.A00(z ? 1 : 0));
        }
    }

    public final ImageUrl A04(UserSession userSession, Reel reel) {
        UserSession userSession2 = this.A03;
        if (reel.A15(userSession2)) {
            return null;
        }
        C255773uh A09 = reel.A09(userSession2);
        1Xj r1 = A09.A0b;
        if (r1 == null || !r1.A5f()) {
            return A09.A07(this.A02.getResources().getDimensionPixelSize(R.dimen.clips_netego_card_width));
        }
        return new SimpleImageUrl(002.A0R("preview:/", r1.BTL()));
    }

    public final void A05(Reel reel, C255773uh r3) {
        this.A04.A05(reel, r3);
        A00(reel, true);
    }

    public final void A06(Reel reel, C255773uh r8, C305916Kb r9, boolean z, boolean z2) {
        this.A04.A06(reel, r8, r9, z, z2);
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r7) {
        C241113Nx r1;
        C249703kE A0W = this.A00.A0W(this.A01.CMG(reel));
        if (!(A0W instanceof C241113Nx) || (r1 = (C241113Nx) A0W) == null) {
            return AnonymousClass6KT.A00();
        }
        float f = 1.0f;
        if (reel.A16(this.A03)) {
            f = 0.2f;
        }
        AnonymousClass6KT r4 = new AnonymousClass6KT(r1.AeG(), r1.BG0(), false);
        r4.A00 = f;
        return r4;
    }

    public final void A09(Reel reel) {
        this.A04.A09(reel);
    }

    public final void A0A(Reel reel, C255773uh r3) {
        this.A04.A0A(reel, r3);
        A00(reel, false);
    }

    public final void A0B(Reel reel, C255773uh r3) {
        this.A04.A0B(reel, r3);
        A00(reel, true);
    }

    public final void A0C(Reel reel, C255773uh r2) {
    }
}
