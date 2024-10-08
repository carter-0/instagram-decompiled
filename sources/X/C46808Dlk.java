package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dlk  reason: case insensitive filesystem */
public final class C46808Dlk extends U9W {
    public float A00;
    public boolean A01;
    public boolean A02 = true;
    public final float A03;
    public final Context A04;
    public final UserSession A05;
    public final C2365134a A06;

    public C46808Dlk(Context context, UserSession userSession, C2365134a r6) {
        super(0, 8);
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = r6;
        this.A03 = context.getResources().getDimension(R.dimen.action_bar_immersive_gradient_height);
        this.A01 = r6.A0A();
    }

    public final int getMovementFlags(RecyclerView recyclerView, C249703kE r6) {
        0qQ.A0B(r6, 1);
        if (r6.itemView.getTag() instanceof C240733Ma) {
            Object tag = r6.itemView.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.ui.ReelFeedTrayViewBinder.Holder");
            View childAt = ((C240733Ma) tag).A00.getChildAt(0);
            if (0qQ.A0K(childAt.getContentDescription(), "reels_tray_container")) {
                C252553pI r1 = ((RecyclerView) childAt).A0D;
                0qQ.A0C(r1, C273654mx.A00(7));
                if (((LinearLayoutManager) r1).A1c() == 0) {
                    return (8 << 8) | (8 << 0);
                }
            }
        }
        return 0;
    }

    public final float getSwipeThreshold(C249703kE r2) {
        return 0.2f;
    }

    public final boolean isLongPressDragEnabled() {
        return false;
    }

    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C249703kE r8, float f, float f2, int i, boolean z) {
        0qQ.A0B(canvas, 0);
        AnonymousClass7TF.A1B(recyclerView, 1, r8);
        this.A00 = f;
        View view = r8.itemView;
        0qQ.A06(view);
        if (Build.VERSION.SDK_INT >= 30) {
            if (this.A00 < this.A03) {
                this.A02 = true;
            } else if (this.A02) {
                view.performHapticFeedback(16);
                this.A02 = false;
            }
        }
        super.onChildDraw(canvas, recyclerView, r8, f, f2, i, z);
    }

    public final boolean onMove(RecyclerView recyclerView, C249703kE r3, C249703kE r4) {
        return false;
    }

    public final void onSwiped(C249703kE r3, int i) {
        boolean z = !this.A01;
        this.A01 = z;
        this.A06.A08(z);
    }
}
