package X;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.PBl  reason: case insensitive filesystem */
public final class C72580PBl implements C328007Db, AnonymousClass7PN {
    public int A00;
    public DirectMessageIdentifier A01;
    public final LayoutInflater A02;
    public final ViewGroup A03;
    public final C67829MvX A04;
    public final HorizontalRecyclerPager A05;

    public C72580PBl(LayoutInflater layoutInflater, View view, ViewGroup viewGroup, C67829MvX mvX) {
        0qQ.A0B(view, 1);
        this.A04 = mvX;
        this.A05 = (HorizontalRecyclerPager) AnonymousClass7TF.A0F(view, R.id.horizontal_scroll_view);
        this.A03 = viewGroup;
        this.A02 = layoutInflater;
    }

    public final void APf(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A05.onTouchEvent(motionEvent);
    }

    public final void DAV(float f, float f2) {
    }

    public final boolean EsS(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        HorizontalRecyclerPager horizontalRecyclerPager = this.A05;
        if (!horizontalRecyclerPager.onInterceptTouchEvent(motionEvent) || this.A00 <= 1 || !0nA.A0F(horizontalRecyclerPager).contains(motionEvent.getRawX(), motionEvent.getRawY())) {
            return false;
        }
        return true;
    }

    public final boolean Esh() {
        return true;
    }

    public final View BJd() {
        return this.A05;
    }
}
