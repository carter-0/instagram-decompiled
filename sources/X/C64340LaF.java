package X;

import android.content.ClipData;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.LaF  reason: case insensitive filesystem */
public final class C64340LaF implements C331097Pn {
    public Integer A00 = AnonymousClass05K.A00;
    public boolean A01 = true;
    public final GestureDetector A02;
    public final MVk A03;
    public final boolean A04;
    public final boolean A05;

    public C64340LaF(RecyclerView recyclerView, MVk mVk, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = mVk;
        this.A05 = z2;
        this.A02 = new GestureDetector(recyclerView.getContext(), new C60800JrV(recyclerView, this));
    }

    public final void A01(MotionEvent motionEvent, RecyclerView recyclerView) {
        int A032;
        View A0B = JTS.A0B(motionEvent, recyclerView);
        if (A0B != null && (A032 = RecyclerView.A03(A0B)) >= 0) {
            A0B.startDrag(ClipData.newPlainText("original_position", String.valueOf(A032)), new C60038Jdr(A0B), A0B, 0);
            this.A03.DrT(A032);
        }
    }

    public final boolean DLA(MotionEvent motionEvent, RecyclerView recyclerView) {
        boolean A1U = AnonymousClass7TF.A1U(0, recyclerView, motionEvent);
        if (JTS.A0B(motionEvent, recyclerView) != null) {
            this.A02.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == A1U) {
            this.A03.DsO();
        }
        if (motionEvent.getAction() == 3) {
            this.A03.DsO();
        }
        return false;
    }

    public final void DeF(boolean z) {
    }

    public final void DsW(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public static final Integer[] A00(MotionEvent motionEvent, RecyclerView recyclerView, C64340LaF laF) {
        2Rw r0;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ArrayList A1C = AnonymousClass7TE.A1C();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            float translationX = childAt.getTranslationX();
            float translationY = childAt.getTranslationY();
            if (x >= ((float) childAt.getLeft()) + translationX && x <= ((float) childAt.getRight()) + translationX && y >= ((float) childAt.getTop()) + translationY && y <= ((float) childAt.getBottom()) + translationY) {
                A1C.add(childAt);
            }
        }
        Iterator it = A1C.iterator();
        int i2 = -1;
        int i3 = -1;
        while (it.hasNext()) {
            View A0H = JTO.A0H(it);
            int A032 = RecyclerView.A03(A0H);
            if (A0H.getVisibility() == 0 && (r0 = recyclerView.A0A) != null && A032 > 0 && A032 < r0.getItemCount() - 1) {
                if (!laF.A05) {
                    if (laF.A04) {
                        int i4 = A032 % 2;
                        if (i4 != 1) {
                            if (i4 != 0) {
                            }
                        }
                    } else {
                        int i5 = A032 % 2;
                        if (i5 != 0) {
                            if (i5 != 1) {
                            }
                        }
                    }
                    i2 = A032;
                }
                i3 = A032;
            }
        }
        return new Integer[]{Integer.valueOf(i2), Integer.valueOf(i3)};
    }
}
