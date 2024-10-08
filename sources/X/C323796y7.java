package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.6y7  reason: invalid class name and case insensitive filesystem */
public final class C323796y7 implements C231452rh {
    public final /* synthetic */ C323766y4 A00;

    public final void D1O(int i, int i2, Object obj) {
    }

    public C323796y7(C323766y4 r1) {
        this.A00 = r1;
    }

    public final void DKr(int i, int i2) {
        C323766y4 r3 = this.A00;
        if (r3.A00 != null) {
            int i3 = i2 + i;
            while (i < i3) {
                ViewGroup viewGroup = r3.A07;
                ViewStub viewStub = new ViewStub(viewGroup.getContext());
                viewStub.setTag(C323766y4.A0A);
                viewGroup.addView(viewStub, i);
                i++;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DSU(int i, int i2) {
        ViewGroup viewGroup = this.A00.A07;
        View childAt = viewGroup.getChildAt(i);
        viewGroup.removeViewAt(i);
        viewGroup.addView(childAt, i2);
    }

    public final void Ddf(int i, int i2) {
        try {
            this.A00.A07.removeViews(i, i2);
        } catch (IndexOutOfBoundsException e) {
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            ViewGroup viewGroup = this.A00.A07;
            0KC.A0L("AdapterLinearLayout", "failed to remove views - position=%d count=%d childCount=%d", e, new Object[]{valueOf, valueOf2, Integer.valueOf(viewGroup.getChildCount())});
            throw new IndexOutOfBoundsException(StringFormatUtil.formatStrLocaleSafe("Failed to remove views - position=%d count=%d childCount=%d", valueOf, valueOf2, Integer.valueOf(viewGroup.getChildCount())));
        }
    }
}
