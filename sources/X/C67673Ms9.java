package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView;
import java.util.List;

/* renamed from: X.Ms9  reason: case insensitive filesystem */
public final class C67673Ms9 extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C67673Ms9(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        List list;
        switch (this.A00) {
            case 1:
                N4t n4t = (N4t) this.A01;
                if (n4t.A0J) {
                    return true;
                }
                Rect A0W = AnonymousClass7TE.A0W();
                C68053MzK mzK = (C68053MzK) this.A03;
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                mzK.A06.getGlobalVisibleRect(A0W);
                Rect A0W2 = AnonymousClass7TE.A0W();
                IgSimpleImageView igSimpleImageView = mzK.A04;
                igSimpleImageView.getGlobalVisibleRect(A0W2);
                NQC nqc = (NQC) this.A02;
                NJF njf = nqc.A02;
                PointF pointF = new PointF((float) A0W.centerX(), (float) A0W.centerY());
                PointF pointF2 = new PointF(((float) A0W2.left) - ((float) (igSimpleImageView.getWidth() / 2)), ((float) A0W2.top) - ((float) (igSimpleImageView.getHeight() / 2)));
                if (!nqc.A03) {
                    pointF2 = null;
                }
                FriendMapAnimatedLikeView friendMapAnimatedLikeView = njf.A04;
                if (friendMapAnimatedLikeView == null) {
                    0qQ.A0F("animatedLikeView");
                    throw AnonymousClass00P.createAndThrow();
                }
                friendMapAnimatedLikeView.A03(pointF, pointF2, new C58185Inp(15, n4t, njf));
                AnonymousClass2S0.A01.A04();
                return true;
            case 2:
                View view = (View) this.A02;
                if (view != null) {
                    view.setVisibility(0);
                    Context context = view.getContext();
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.profile_note_like_bounce);
                    if (loadAnimator.isRunning()) {
                        loadAnimator.end();
                    }
                    loadAnimator.addListener(new C56673I7c(4, loadAnimator, context, view));
                    loadAnimator.setTarget(view);
                    loadAnimator.start();
                }
                C279864zZ r2 = (C279864zZ) this.A03;
                C300865y4 r0 = r2.A07;
                if (r0 == null || (list = r0.A01) == null || !list.isEmpty()) {
                    return true;
                }
                ((C323296xG) this.A01).DUU(r2);
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                C67969Mxt mxt = (C67969Mxt) this.A03;
                mxt.itemView.performHapticFeedback(0);
                PopupWindow popupWindow = (PopupWindow) this.A01;
                if (popupWindow != null && popupWindow.getContentView() != null && ((C68172N3n) this.A02).A03 != null) {
                    int width = (mxt.itemView.getWidth() / 2) - (mxt.itemView.getWidth() / 4);
                    int measuredHeight = mxt.itemView.getMeasuredHeight();
                    TextView textView = mxt.A00;
                    int measuredHeight2 = (measuredHeight - textView.getMeasuredHeight()) / 2;
                    int A05 = AnonymousClass7TG.A05(DbS.A07(mxt));
                    popupWindow.showAsDropDown(mxt.itemView, width, -(((mxt.itemView.getMeasuredHeight() - textView.getMeasuredHeight()) - measuredHeight2) - A05));
                    return;
                }
                return;
            case 1:
                N4t n4t = (N4t) this.A01;
                if (!n4t.A0J) {
                    ((NQC) this.A02).A01.DUW(C68053MzK.A00(n4t));
                    return;
                }
                return;
            default:
                super.onLongPress(motionEvent);
                return;
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C72369P3i p3i;
        switch (this.A00) {
            case 0:
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                ((C67969Mxt) this.A03).A02.invoke();
                return true;
            case 1:
                N4t n4t = (N4t) this.A01;
                if (!n4t.A0J) {
                    NQC nqc = (NQC) this.A02;
                    UserSession userSession = nqc.A00;
                    if (AnonymousClass3HF.A01(userSession)) {
                        NJF njf = nqc.A02;
                        String str = n4t.A0B;
                        String str2 = n4t.A0A;
                        if (str2 == null) {
                            str2 = n4t.A06.getId();
                        }
                        boolean z = !AnonymousClass7TF.A1V(n4t.A05);
                        Dba.A0j(1, str, str2);
                        if (z) {
                            ((C71144Ody) njf.A0A.getValue()).A0D(str2);
                        }
                        if (!njf.isAdded()) {
                            return true;
                        }
                        C70288O0s.A00(njf.requireActivity(), AnonymousClass7TE.A0l(njf.A0F), AnonymousClass05K.A01, str, str2, C73828PkR.A00, new C59100J6i(njf, 26));
                        return true;
                    } else if (n4t.A05 == null || AnonymousClass3HF.A01(userSession)) {
                        return true;
                    } else {
                        p3i = nqc.A01;
                    }
                } else {
                    boolean A1V = AnonymousClass7TF.A1V(n4t.A05);
                    NQC nqc2 = (NQC) this.A02;
                    if (A1V) {
                        p3i = nqc2.A01;
                    } else {
                        NdA ndA = (NdA) nqc2.A02.A0G.getValue();
                        C68150N2q A0S = ndA.A03.A0S();
                        if (!ndA.A02.A05() || A0S != null) {
                            ndA.A0P(new PGX(new C58185Inp(27, A0S, ndA)));
                        }
                        if (!182.A06(0Tu.A05, ndA.A00, 36321769623987931L)) {
                            return true;
                        }
                        ndA.A0P(new PGY(new C73898PlZ(ndA, 36), new C59100J6i(ndA, 35)));
                        return true;
                    }
                }
                p3i.DUZ(C68053MzK.A00(n4t));
                return true;
            default:
                ((C323296xG) this.A01).DUY((C279864zZ) this.A03, (String) null, (String) null);
                return true;
        }
    }
}
