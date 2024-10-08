package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;

/* renamed from: X.Upm  reason: case insensitive filesystem */
public final class C16161Upm extends AnonymousClass6UX {
    public final Activity A00;
    public final RecyclerView A01;
    public final C322126vI A02;
    public final C230222pE A03;

    public final AnonymousClass6KT A08(Reel reel, C255773uh r4) {
        View view;
        0qQ.A0B(reel, 0);
        C249703kE A002 = A00(reel);
        if (A002 == null || (view = A002.itemView) == null) {
            return AnonymousClass6KT.A02();
        }
        RectF rectF = 0nA.A01;
        RectF rectF2 = new RectF();
        0nA.A0L(rectF2, view);
        return AnonymousClass6KT.A03(rectF2);
    }

    public final void A09(Reel reel) {
        0qQ.A0B(reel, 0);
        this.A01.A0o(this.A02.A02(reel.getId()));
    }

    public final void A0A(Reel reel, C255773uh r4) {
        View view;
        0qQ.A0B(reel, 0);
        C249703kE A002 = A00(reel);
        if (A002 != null && (view = A002.itemView) != null) {
            view.setVisibility(4);
            view.setAlpha(0.0f);
            view.setScaleX(0.95f);
            view.setScaleY(0.95f);
        }
    }

    public final void A0B(Reel reel, C255773uh r5) {
        View view;
        AnonymousClass7TF.A1H(reel, r5);
        super.A0B(reel, r5);
        C249703kE A002 = A00(reel);
        if (A002 != null && (view = A002.itemView) != null) {
            view.setVisibility(0);
            C71392co r0 = C315596kB.A02;
            C294975nL A012 = C294975nL.A01(view, 0);
            A012.A0P(1.0f, -1.0f);
            A012.A0Q(1.0f, -1.0f);
            A012.A0I(1.0f);
            A012.A0H();
        }
    }

    public final void A0C(Reel reel, C255773uh r5) {
        0qQ.A0B(reel, 0);
        this.A01.A0o(this.A02.A02(reel.getId()));
    }

    private final C249703kE A00(Reel reel) {
        int A022 = this.A02.A02(reel.getId());
        if (A022 == -1) {
            return null;
        }
        return this.A01.A0X(A022, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16161Upm(Activity activity, RecyclerView recyclerView, C322126vI r3, C230222pE r4) {
        super(activity, r4);
        C51972G9s.A1B(activity, r3);
        this.A00 = activity;
        this.A03 = r4;
        this.A01 = recyclerView;
        this.A02 = r3;
    }
}
