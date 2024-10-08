package X;

import android.content.Context;
import android.util.SparseIntArray;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3je  reason: invalid class name and case insensitive filesystem */
public abstract class C249383je extends C249393jf implements AbsListView.OnScrollListener {
    public static final int DEFAULT_FIRST_VISIBLE_ITEM_POSITION = 0;
    public static SparseIntArray LV_MAPPINGS = null;
    public static SparseIntArray RV_MAPPINGS = null;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_INVALID = -1;
    public static final int STATE_SETTLING = 2;
    public int mCumulativeDy;
    public int mCurrentScrollStateLV;
    public int mOnScrollDyThreshold;
    public Runnable mScrollIdleDebouncer;

    private void onScrolledInternal(RecyclerView recyclerView, int i, int i2, boolean z) {
        int i3 = i;
        int i4 = i2;
        super.onScrolled(recyclerView, i, i2);
        if (z || !skipOnScroll(i2)) {
            boolean z2 = false;
            if (this.mOnScrollDyThreshold > 0) {
                z2 = true;
            }
            if (z2) {
                i4 = this.mCumulativeDy;
                this.mCumulativeDy = 0;
            }
            2Rw r1 = recyclerView.A0A;
            C252553pI r0 = recyclerView.A0D;
            if (r1 != null && r0 != null) {
                int itemCount = r1.getItemCount();
                int A01 = C240113Jq.A01(r0);
                int A02 = C240113Jq.A02(r0);
                int i5 = 0;
                if (A01 > -1) {
                    i5 = (A02 - A01) + 1;
                }
                onScroll(C238103Ao.A00(recyclerView), Math.max(A01, 0), i5, itemCount, i3, i4);
            }
        }
    }

    public abstract void onScroll(C238133Ar r1, int i, int i2, int i3, int i4, int i5);

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        RV_MAPPINGS = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        LV_MAPPINGS = sparseIntArray2;
        sparseIntArray2.put(0, 0);
        sparseIntArray2.put(1, 1);
        sparseIntArray2.put(2, 2);
    }

    private boolean shouldSkipToDebounceIdleStateForLV(AbsListView absListView, int i) {
        if (this.mCurrentScrollStateLV == 2 && i == 0 && this.mScrollIdleDebouncer == null) {
            C20235WnZ wnZ = new C20235WnZ(absListView, this);
            this.mScrollIdleDebouncer = wnZ;
            absListView.postOnAnimation(wnZ);
            this.mCurrentScrollStateLV = i;
            return true;
        }
        Runnable runnable = this.mScrollIdleDebouncer;
        if (runnable != null) {
            absListView.removeCallbacks(runnable);
            this.mScrollIdleDebouncer = null;
        }
        this.mCurrentScrollStateLV = i;
        return false;
    }

    private boolean skipOnScroll(int i) {
        int i2 = this.mOnScrollDyThreshold;
        if (i2 > 0) {
            int i3 = this.mCumulativeDy;
            if (i3 * i < 0) {
                this.mCumulativeDy = i;
            } else {
                int i4 = i3 + i;
                this.mCumulativeDy = i4;
                if (Math.abs(i4) > i2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = AnonymousClass0fD.A03(-1610399148);
        onScroll(C238103Ao.A00(absListView), i, i2, i3, 0, 0);
        AnonymousClass0fD.A0A(1341363251, A03);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(1417106028);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            int i2 = this.mCumulativeDy;
            if (i2 > 0) {
                onScrolledInternal(recyclerView, 0, i2, true);
            }
            this.mCumulativeDy = 0;
        }
        int i3 = RV_MAPPINGS.get(i, -1);
        if (i3 != -1) {
            onScrollStateChanged(C238103Ao.A00(recyclerView), i3);
            AnonymousClass0fD.A0A(-2089996579, A03);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(002.A0O("Unknown RecyclerView State:", i));
        AnonymousClass0fD.A0A(-1980651712, A03);
        throw illegalStateException;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(-1960086385);
        boolean z = false;
        if (i2 == 0) {
            z = true;
        }
        onScrolledInternal(recyclerView, i, i2, z);
        AnonymousClass0fD.A0A(1057555355, A03);
    }

    public void setOnScrollDyThreshold(Context context, int i) {
        this.mOnScrollDyThreshold = (int) 0nA.A04(context, i);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int i2;
        int A03 = AnonymousClass0fD.A03(-1769682703);
        if (shouldSkipToDebounceIdleStateForLV(absListView, i)) {
            i2 = -881998776;
        } else {
            int i3 = LV_MAPPINGS.get(i, -1);
            if (i3 != -1) {
                onScrollStateChanged(C238103Ao.A00(absListView), i3);
                i2 = -2008374745;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException(002.A0O("Unknown AbsListView State:", i));
                AnonymousClass0fD.A0A(669395920, A03);
                throw illegalStateException;
            }
        }
        AnonymousClass0fD.A0A(i2, A03);
    }

    public void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(1681701111, AnonymousClass0fD.A03(-1552294235));
    }
}
