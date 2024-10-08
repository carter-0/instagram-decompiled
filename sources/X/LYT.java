package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;
import com.instagram.common.ui.widget.draggable.DraggableContainer;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.creation.base.ui.degreelabel.PillDegreeLabelManager;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.creation.capture.quickcapture.sundial.edit.BaselStackedTimelineMiddleActionViewControllerImpl;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.ui.text.ConstrainedEditText;

public final class LYT implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public LYT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.addOnLayoutChangeListener(new LYT(obj, i));
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        PunchedOverlayView punchedOverlayView;
        C62738Klc ki6;
        String str;
        int i9;
        int i10 = i8;
        switch (this.A00) {
            case 0:
                int i11 = i3 / 2;
                int i12 = i4 / 2;
                SelectHighlightsCoverFragment selectHighlightsCoverFragment = (SelectHighlightsCoverFragment) this.A01;
                if (selectHighlightsCoverFragment.A06) {
                    float f = (float) i3;
                    int A002 = (int) C51967G9n.A00((float) i4, 1.3333334f * f);
                    punchedOverlayView = selectHighlightsCoverFragment.mPunchedOverlayView;
                    ki6 = new KI5(new RectF(0.0f, (float) A002, f, (float) (i4 - A002)), AnonymousClass7TE.A01(DbV.A05(selectHighlightsCoverFragment), R.dimen.abc_dialog_padding_material));
                } else {
                    punchedOverlayView = selectHighlightsCoverFragment.mPunchedOverlayView;
                    ki6 = new KI6(i11, i12, (float) i11);
                }
                punchedOverlayView.A00(ki6);
                return;
            case 1:
                0qQ.A0B(view, 0);
                LPC lpc = C63515KyQ.A00;
                DraggableContainer draggableContainer = (DraggableContainer) this.A01;
                float A003 = draggableContainer.getDragCenterX();
                float A012 = draggableContainer.getDragCenterY();
                synchronized (lpc) {
                    LD1 ld1 = lpc.A00;
                    if (ld1 != null) {
                        for (MV0 mv0 : LPC.A00(lpc, ld1.getClass())) {
                            Object obj = ld1.A00().get();
                            if (obj != null) {
                                mv0.DAe((View) obj, A003, A012);
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                    }
                }
                view.removeOnLayoutChangeListener(this);
                return;
            case 2:
                PillDegreeLabelManager pillDegreeLabelManager = (PillDegreeLabelManager) this.A01;
                pillDegreeLabelManager.A02 = true;
                PillDegreeLabelManager.A04(pillDegreeLabelManager);
                float f2 = pillDegreeLabelManager.A00;
                if (!Float.isNaN(f2)) {
                    pillDegreeLabelManager.setDegree(f2);
                    pillDegreeLabelManager.A00 = Float.NaN;
                    return;
                }
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                AnonymousClass0eM r3 = ((K5V) this.A01).A0A;
                ((RecyclerView) AnonymousClass7TE.A14(r3)).A11(new C60450Jli((int) (((float) ((RecyclerView) AnonymousClass7TE.A14(r3)).getMeasuredHeight()) * 0.5625f)));
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                K5V.A01((K5V) this.A01);
                return;
            case 5:
                JTP.A1W(((BaselStackedTimelineMiddleActionViewControllerImpl) this.A01).A03, i4 - i2);
                return;
            case 6:
                if (view.getHeight() != i8 - i6) {
                    KMS kms = ((ClipsStackedTimelineFragment) this.A01).A0E;
                    if (kms == null) {
                        str = "videoTrackViewController";
                        break;
                    } else {
                        kms.A02.A00 = view.getHeight();
                        kms.A0N(JTR.A0K(kms.A0K.A0Y));
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                C353798Jc r1 = ((AOY) this.A01).A00;
                ConstrainedEditText constrainedEditText = r1.A0D;
                constrainedEditText.getClass();
                constrainedEditText.removeOnLayoutChangeListener(this);
                C353798Jc.A04(r1);
                return;
            case 8:
                if (i6 != i2 || i10 != i4) {
                    EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                    editMediaInfoFragment.mCaption.getClass();
                    if (editMediaInfoFragment.mCaption.getVisibility() == 0) {
                        i9 = editMediaInfoFragment.mCaption.getHeight();
                    } else {
                        i9 = 0;
                    }
                    int AYI = ((i4 - i2) + Dba.A0A(editMediaInfoFragment).AYI()) - i9;
                    if (AYI > 0) {
                        C64723Lh0 lh0 = editMediaInfoFragment.A0G;
                        if (lh0 != null) {
                            lh0.A00().setHeight(AYI);
                            return;
                        }
                        editMediaInfoFragment.mCaption.setDropDownHeight(AYI);
                        if (editMediaInfoFragment.mCaption.isPopupShowing()) {
                            editMediaInfoFragment.mCaption.showDropDown();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                view.removeOnLayoutChangeListener(this);
                JTT.A0z(AnonymousClass7TE.A0W(), (TextView) this.A01);
                return;
            case 10:
                float f3 = (float) (i3 - i);
                int A05 = JTO.A05(f3, 0.8f);
                int i13 = i4 / 2;
                int i14 = A05 / 2;
                C61422K6t k6t = (C61422K6t) this.A01;
                RectF rectF = new RectF(0.0f, (float) (i13 - i14), f3, (float) (i13 + i14));
                k6t.A02 = rectF;
                PunchedOverlayView punchedOverlayView2 = k6t.A07;
                if (punchedOverlayView2 == null) {
                    str = "punchedOverlayView";
                    break;
                } else {
                    punchedOverlayView2.A00(new KI5(rectF, 0.0f));
                    GridLinesView gridLinesView = k6t.A09;
                    if (gridLinesView == null) {
                        str = "gridLinesView";
                        break;
                    } else {
                        0nA.A0V(gridLinesView, A05);
                        return;
                    }
                }
            case 11:
                ((C60181Jh0) ((L9Q) this.A01).A04.getValue()).A00 = (float) view.getMeasuredHeight();
                return;
            default:
                LSD lsd = (LSD) this.A01;
                if (lsd.A0B.getBottom() > 0nA.A08(lsd.A04)) {
                    if (LSD.A00(lsd) >= lsd.A07.getMeasuredHeight()) {
                        LSD.A00(lsd);
                    }
                    C270354gb r6 = new C270354gb();
                    ViewParent parent = lsd.A0A.getParent();
                    0qQ.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                    r6.A0I(constraintLayout);
                    r6.A09(R.id.iglive_reactions_extensions, 3);
                    r6.A09(R.id.iglive_reactions_extensions, 4);
                    constraintLayout.getLayoutParams().height = -2;
                    r6.A0C(R.id.iglive_reactions_extensions, 4, R.id.iglive_reactions_composer, 3);
                    C14283TtH.A02(constraintLayout, (C14284TtI) null);
                    r6.A0G(constraintLayout);
                    return;
                }
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
