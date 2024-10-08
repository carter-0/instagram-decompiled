package X;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* renamed from: X.Mqo  reason: case insensitive filesystem */
public final class C67616Mqo extends C64337LaC {
    public Object A00;
    public final int A01;

    public C67616Mqo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean DLA(MotionEvent motionEvent, RecyclerView recyclerView) {
        DirectVisualMessageViewerController directVisualMessageViewerController;
        C68050MzH A02;
        NR1 A002;
        NR1 A003;
        Integer num;
        switch (this.A01) {
            case 0:
                0qQ.A0B(motionEvent, 1);
                if (motionEvent.getAction() == 0) {
                    C72970PRd pRd = (C72970PRd) this.A00;
                    pRd.A04 = true;
                    pRd.A09.A0l();
                    OW9 ow9 = pRd.A0C.A00;
                    C68445NIi.A01(ow9.A0C.A00);
                    if (ow9.A04) {
                        return false;
                    }
                    ow9.A04 = true;
                    C72970PRd pRd2 = ow9.A03;
                    if (pRd2 == null) {
                        0qQ.A0F("directVisualTimelineScrollController");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    pRd2.A05 = true;
                    C68445NIi nIi = ow9.A0B.A00;
                    C68463NJb A0R = nIi.getChildFragmentManager().A0R(nIi.A06);
                    if (!(A0R == null || !A0R.isResumed() || (directVisualMessageViewerController = A0R.A01) == null)) {
                        directVisualMessageViewerController.A0Z = false;
                    }
                    OW9.A00(ow9);
                    return false;
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    C72970PRd pRd3 = (C72970PRd) this.A00;
                    pRd3.A04 = false;
                    C72970PRd.A03(pRd3);
                    C70484O8j o8j = pRd3.A0C;
                    if (pRd3.A01 == -1) {
                        return false;
                    }
                    o8j.A00.A0C.A00();
                    return false;
                }
            case 1:
                0qQ.A0B(motionEvent, 1);
                if (motionEvent.getAction() == 0) {
                    ((C55889HpA) this.A00).A00 = true;
                    return false;
                } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return false;
                } else {
                    ((C55889HpA) this.A00).A00 = false;
                    return false;
                }
            case 2:
                0qQ.A0B(recyclerView, 0);
                0qQ.A0B(motionEvent, 1);
                if (motionEvent.getActionMasked() == 0) {
                    C68050MzH A022 = C68478NJv.A02((C68478NJv) this.A00);
                    if (A022 == null || (A003 = A022.A00()) == null) {
                        return false;
                    }
                    ValueAnimator valueAnimator = A003.A08;
                    if (!valueAnimator.isRunning()) {
                        return false;
                    }
                    valueAnimator.pause();
                    return false;
                } else if (motionEvent.getActionMasked() != 1) {
                    return false;
                } else {
                    C68478NJv nJv = (C68478NJv) this.A00;
                    if (!C68478NJv.A03(nJv).A00 || (A02 = C68478NJv.A02(nJv)) == null || (A002 = A02.A00()) == null) {
                        return false;
                    }
                    A002.A0H();
                    return false;
                }
            default:
                0qQ.A0B(motionEvent, 1);
                int actionMasked = motionEvent.getActionMasked();
                boolean z = false;
                if (actionMasked != 0) {
                    num = null;
                    if (actionMasked != 1) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                return false;
                            }
                            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                            Number number = (Number) this.A00;
                            if (number == null || pointerId != number.intValue()) {
                                return true;
                            }
                        }
                    } else if (this.A00 == null) {
                        z = true;
                    }
                } else {
                    num = Integer.valueOf(motionEvent.getPointerId(0));
                }
                this.A00 = num;
                return z;
        }
    }

    public C67616Mqo() {
        this.A01 = 3;
    }
}
