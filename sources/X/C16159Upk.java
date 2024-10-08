package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.common.ui.widget.calendar.CalendarRecyclerView;
import com.instagram.model.reels.Reel;

/* renamed from: X.Upk  reason: case insensitive filesystem */
public final class C16159Upk extends AnonymousClass6UX {
    public final GridLayoutManager A00;
    public final C15849UjZ A01;
    public final CalendarRecyclerView A02;
    public final RectF A03 = new RectF();

    public final void A09(Reel reel) {
    }

    public final void A0A(Reel reel, C255773uh r8) {
        C249703kE A0X;
        C15849UjZ ujZ = this.A01;
        int A022 = ujZ.A02(reel);
        if (A022 != -1) {
            GridLayoutManager gridLayoutManager = this.A00;
            int A1c = gridLayoutManager.A1c();
            int A1d = gridLayoutManager.A1d();
            if (A022 < A1c || A022 > A1d) {
                gridLayoutManager.A1O(A022);
            }
        }
        int A023 = ujZ.A02(reel);
        if (A023 != -1 && (A0X = this.A02.A0X(A023, false)) != null) {
            A0X.itemView.setAlpha(0.0f);
            A0X.itemView.setScaleX(0.7f);
            A0X.itemView.setScaleY(0.7f);
        }
    }

    public final void A0C(Reel reel, C255773uh r6) {
        int A022 = this.A01.A02(reel);
        if (A022 != -1) {
            GridLayoutManager gridLayoutManager = this.A00;
            int A1c = gridLayoutManager.A1c();
            int A1d = gridLayoutManager.A1d();
            if (A022 < A1c || A022 > A1d) {
                gridLayoutManager.A1O(A022);
            }
        }
    }

    public C16159Upk(Activity activity, C15849UjZ ujZ, CalendarRecyclerView calendarRecyclerView, C230222pE r5) {
        super(activity, r5);
        this.A02 = calendarRecyclerView;
        C252553pI r0 = calendarRecyclerView.A0D;
        r0.getClass();
        this.A00 = (GridLayoutManager) r0;
        this.A01 = ujZ;
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r7) {
        C249703kE A0X;
        AnonymousClass6KT A002 = AnonymousClass6KT.A00();
        int A022 = this.A01.A02(reel);
        if (A022 == -1 || (A0X = this.A02.A0X(A022, false)) == null) {
            return A002;
        }
        View view = A0X.itemView;
        RectF rectF = this.A03;
        0nA.A0L(rectF, view);
        rectF.set(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY());
        return AnonymousClass6KT.A03(rectF);
    }

    public final void A0B(Reel reel, C255773uh r6) {
        C249703kE A0X;
        super.A0B(reel, r6);
        C15849UjZ ujZ = this.A01;
        ujZ.A00 = reel.getId();
        int A022 = ujZ.A02(reel);
        if (A022 != -1 && (A0X = this.A02.A0X(A022, false)) != null) {
            A0X.itemView.setVisibility(0);
            View view = A0X.itemView;
            C71392co r0 = C315596kB.A02;
            C294975nL A012 = C294975nL.A01(view, 0);
            A012.A0P(1.0f, -1.0f);
            A012.A0Q(1.0f, -1.0f);
            A012.A0I(1.0f);
            A012.A05 = new C19671WdZ(this, 0);
            A012.A0H();
        }
    }
}
