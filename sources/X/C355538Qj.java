package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.8Qj  reason: invalid class name and case insensitive filesystem */
public abstract class C355538Qj {
    public static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    public static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
    public static final int RELATIVE_DIR_FLAGS = 3158064;
    public static final Interpolator sDragScrollInterpolator = new C355548Qk();
    public static final Interpolator sDragViewScrollCapInterpolator = new C355558Ql();
    public int mCachedMaxScrollSpeed = -1;

    public static int convertToRelativeDirection(int i, int i2) {
        int i3 = i & ABS_HORIZONTAL_DIR_FLAGS;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (i3 ^ -1);
        int i5 = i3 << 2;
        if (i2 != 0) {
            int i6 = i3 << 1;
            i4 |= -789517 & i6;
            i5 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
        }
        return i4 | i5;
    }

    public boolean canDropOver(RecyclerView recyclerView, C249703kE r3, C249703kE r4) {
        return true;
    }

    public int convertToAbsoluteDirection(int i, int i2) {
        int i3 = i & RELATIVE_DIR_FLAGS;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (i3 ^ -1);
        int i5 = i3 >> 2;
        if (i2 != 0) {
            int i6 = i3 >> 1;
            i4 |= -3158065 & i6;
            i5 = (i6 & RELATIVE_DIR_FLAGS) >> 2;
        }
        return i4 | i5;
    }

    public int getBoundingBoxMargin() {
        return 0;
    }

    public float getMoveThreshold(C249703kE r2) {
        return 0.5f;
    }

    public abstract int getMovementFlags(RecyclerView recyclerView, C249703kE r2);

    public float getSwipeEscapeVelocity(float f) {
        return f;
    }

    public float getSwipeThreshold(C249703kE r2) {
        return 0.5f;
    }

    public float getSwipeVelocityThreshold(float f) {
        return f;
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return true;
    }

    public abstract boolean onMove(RecyclerView recyclerView, C249703kE r2, C249703kE r3);

    public abstract void onSwiped(C249703kE r1, int i);

    private int getMaxDragScroll(RecyclerView recyclerView) {
        int i = this.mCachedMaxScrollSpeed;
        if (i != -1) {
            return i;
        }
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        this.mCachedMaxScrollSpeed = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static int makeMovementFlags(int i, int i2) {
        return (i << 16) | (i2 << 8) | ((i2 | i) << 0);
    }

    public C249703kE chooseDropTarget(C249703kE r13, List list, int i, int i2) {
        int left;
        int bottom;
        int width = i + r13.itemView.getWidth();
        int height = i2 + r13.itemView.getHeight();
        int left2 = i - r13.itemView.getLeft();
        int top = i2 - r13.itemView.getTop();
        int size = list.size();
        C249703kE r7 = null;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C249703kE r2 = (C249703kE) list.get(i4);
            if (left2 <= 0 ? !(left2 >= 0 || (left = r2.itemView.getLeft() - i) <= 0 || r2.itemView.getLeft() >= r13.itemView.getLeft()) : !((left = r2.itemView.getRight() - width) >= 0 || r2.itemView.getRight() <= r13.itemView.getRight())) {
                int abs = Math.abs(left);
                if (abs > i3) {
                    r7 = r2;
                    i3 = abs;
                }
            }
            if (top >= 0 ? !(top <= 0 || (bottom = r2.itemView.getBottom() - height) >= 0 || r2.itemView.getBottom() <= r13.itemView.getBottom()) : !((bottom = r2.itemView.getTop() - i2) <= 0 || r2.itemView.getTop() >= r13.itemView.getTop())) {
                int abs2 = Math.abs(bottom);
                if (abs2 > i3) {
                    r7 = r2;
                    i3 = abs2;
                }
            }
        }
        return r7;
    }

    public void clearView(RecyclerView recyclerView, C249703kE r6) {
        View view = r6.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            view.setElevation(((Number) tag).floatValue());
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
        AnonymousClass3AS r1 = recyclerView.A0C;
        if (r1 == null) {
            if (i == 8) {
                return 200;
            }
            return 250;
        } else if (i == 8) {
            return r1.A08();
        } else {
            return r1.A09();
        }
    }

    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, C249703kE r12, float f, float f2, int i, boolean z) {
        View view = r12.itemView;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C249703kE r18, List list, int i, float f, float f2) {
        Canvas canvas2;
        RecyclerView recyclerView2;
        float f3;
        float f4;
        List list2 = list;
        int size = list2.size();
        int i2 = 0;
        while (true) {
            canvas2 = canvas;
            recyclerView2 = recyclerView;
            if (i2 >= size) {
                break;
            }
            AJN ajn = (AJN) list2.get(i2);
            float f5 = ajn.A06;
            float f6 = ajn.A08;
            if (f5 == f6) {
                f3 = ajn.A0C.itemView.getTranslationX();
            } else {
                f3 = f5 + (ajn.A00 * (f6 - f5));
            }
            ajn.A01 = f3;
            float f7 = ajn.A07;
            float f8 = ajn.A09;
            if (f7 == f8) {
                f4 = ajn.A0C.itemView.getTranslationY();
            } else {
                f4 = f7 + (ajn.A00 * (f8 - f7));
            }
            ajn.A02 = f4;
            int save = canvas2.save();
            onChildDraw(canvas2, recyclerView2, ajn.A0C, ajn.A01, ajn.A02, ajn.A0A, false);
            canvas2.restoreToCount(save);
            i2++;
        }
        C249703kE r10 = r18;
        if (r18 != null) {
            int save2 = canvas2.save();
            onChildDraw(canvas2, recyclerView2, r10, f, f2, i, true);
            canvas2.restoreToCount(save2);
        }
    }

    public void onMoved(RecyclerView recyclerView, C249703kE r10, int i, C249703kE r12, int i2, int i3, int i4) {
        int A08;
        int A0B;
        int A0D;
        C252553pI r3 = recyclerView.A0D;
        if (r3 instanceof C252573pK) {
            View view = r10.itemView;
            View view2 = r12.itemView;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((C252573pK) r3);
            linearLayoutManager.A1G("Cannot drop a view during a scroll or layout calculation");
            linearLayoutManager.A1n();
            LinearLayoutManager.A0P(linearLayoutManager);
            int A06 = C252553pI.A06(view);
            int A062 = C252553pI.A06(view2);
            char c = 65535;
            if (A06 < A062) {
                c = 1;
            }
            if (linearLayoutManager.A09) {
                A08 = linearLayoutManager.A06.A03();
                AnonymousClass3BB r0 = linearLayoutManager.A06;
                if (c == 1) {
                    A0B = r0.A0D(view2) + linearLayoutManager.A06.A0B(view);
                } else {
                    A0B = r0.A08(view2);
                }
            } else {
                AnonymousClass3BB r02 = linearLayoutManager.A06;
                if (c == 65535) {
                    A0D = r02.A0D(view2);
                    linearLayoutManager.A1p(A062, A0D);
                    return;
                }
                A08 = r02.A08(view2);
                A0B = linearLayoutManager.A06.A0B(view);
            }
            A0D = A08 - A0B;
            linearLayoutManager.A1p(A062, A0D);
            return;
        }
        if (r3.A1X()) {
            View view3 = r12.itemView;
            if (view3.getLeft() - C252553pI.A05(view3) <= recyclerView.getPaddingLeft()) {
                recyclerView.A0o(i2);
            }
            View view4 = r12.itemView;
            if (view4.getRight() + C252553pI.A07(view4) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.A0o(i2);
            }
        }
        if (r3.A1Y()) {
            if (r3.A0W(r12.itemView) <= recyclerView.getPaddingTop()) {
                recyclerView.A0o(i2);
            }
            if (r3.A0V(r12.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.A0o(i2);
            }
        }
    }

    public final int getAbsoluteMovementFlags(RecyclerView recyclerView, C249703kE r4) {
        return convertToAbsoluteDirection(getMovementFlags(recyclerView, r4), recyclerView.getLayoutDirection());
    }

    public boolean hasDragFlag(RecyclerView recyclerView, C249703kE r4) {
        if ((getAbsoluteMovementFlags(recyclerView, r4) & 16711680) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasSwipeFlag(RecyclerView recyclerView, C249703kE r4) {
        if ((getAbsoluteMovementFlags(recyclerView, r4) & 65280) != 0) {
            return true;
        }
        return false;
    }

    public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        int maxDragScroll = getMaxDragScroll(recyclerView);
        int abs = Math.abs(i2);
        float f = (float) abs;
        float f2 = 1.0f;
        int signum = (int) (((float) (((int) Math.signum((float) i2)) * maxDragScroll)) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (f * 1.0f) / ((float) i))));
        if (j <= 2000) {
            f2 = ((float) j) / 2000.0f;
        }
        int interpolation = (int) (((float) signum) * sDragScrollInterpolator.getInterpolation(f2));
        if (interpolation != 0) {
            return interpolation;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C249703kE r7, List list, int i, float f, float f2) {
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2);
            canvas.restoreToCount(canvas.save());
        }
        if (r7 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            AJN ajn = (AJN) list.get(i3);
            if (ajn.A05 && !ajn.A03) {
                list.remove(i3);
            } else if (!ajn.A05) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public void onSelectedChanged(C249703kE r1, int i) {
    }

    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, C249703kE r3, float f, float f2, int i, boolean z) {
    }
}
