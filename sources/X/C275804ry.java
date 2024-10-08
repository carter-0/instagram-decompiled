package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.model.reels.Reel;

/* renamed from: X.4ry  reason: invalid class name and case insensitive filesystem */
public final class C275804ry extends C249403jg {
    public final C2365934i A00;

    public C275804ry(C2365934i r1) {
        this.A00 = r1;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        View view;
        ViewStub viewStub;
        View inflate;
        View findViewById;
        int A03 = AnonymousClass0fD.A03(-77576915);
        0qQ.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        if (!(recyclerView.A0A == null || recyclerView.getScrollState() == 0)) {
            C252553pI r1 = recyclerView.A0D;
            if (r1 instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r1;
                if (linearLayoutManager != null) {
                    Reel reel = (Reel) this.A00.Bkf(linearLayoutManager.A1b());
                    if (reel != null && reel.A1O && (recyclerView.getParent() instanceof ViewGroup)) {
                        ViewParent parent = recyclerView.getParent();
                        if (!(!(parent instanceof ViewGroup) || (view = (View) parent) == null || (viewStub = (ViewStub) view.findViewById(R.id.highlights_container)) == null || (inflate = viewStub.inflate()) == null || (findViewById = inflate.findViewById(R.id.highlights_label)) == null)) {
                            findViewById.postDelayed(new TE4(findViewById), 3000);
                        }
                        recyclerView.A16(this);
                    }
                } else {
                    i3 = -1252883246;
                    AnonymousClass0fD.A0A(i3, A03);
                }
            }
        }
        i3 = -662970464;
        AnonymousClass0fD.A0A(i3, A03);
    }
}
