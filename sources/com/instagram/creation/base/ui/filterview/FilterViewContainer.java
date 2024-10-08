package com.instagram.creation.base.ui.filterview;

import X.0Tu;
import X.0mE;
import X.0qQ;
import X.182;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.AnonymousClass972;
import X.C226122ff;
import X.C267844cJ;
import X.C3499682q;
import X.C60012JdL;
import X.JTR;
import X.MQ6;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class FilterViewContainer extends MediaFrameLayout implements GestureDetector.OnGestureListener {
    public View A00;
    public ImageView A01;
    public UserSession A02;
    public MQ6 A03;
    public C3499682q A04;
    public boolean A05;
    public boolean A06;
    public GestureDetector A07;
    public final Handler A08 = new C60012JdL(Looper.getMainLooper(), this, 2);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterViewContainer(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
        A00();
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final UserSession getUserSession() {
        return this.A02;
    }

    public final void onMeasure(int i, int i2) {
        UserSession userSession = this.A02;
        if (userSession != null && C226122ff.A03()) {
            0Tu r3 = 0Tu.A05;
            if (182.A06(r3, userSession, 36327812642257626L)) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) (View.MeasureSpec.getSize(i2) - C226122ff.A00())) * (1.0f - ((float) Double.valueOf(182.A00(r3, this.A02, 37172237572506170L)).doubleValue()))), AnonymousClass972.MUTABLE_FLAG_MASK);
            }
        }
        super.onMeasure(i, i2);
    }

    private final void A00() {
        Context context = getContext();
        this.A04 = JTR.A0k(0mE.A01(context, C267844cJ.class));
        this.A07 = new GestureDetector(context, this);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(898253361);
        super.onDetachedFromWindow();
        this.A08.removeCallbacksAndMessages((Object) null);
        AnonymousClass0fD.A0D(-1430928286, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        if (r1 == X.AnonymousClass36W.GROUP_PHOTO) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinishInflate() {
        /*
            r5 = this;
            r0 = 1639287623(0x61b58b47, float:4.186121E20)
            int r3 = X.AnonymousClass0fD.A06(r0)
            super.onFinishInflate()
            r0 = 2131435626(0x7f0b206a, float:1.84931E38)
            android.widget.ImageView r0 = X.DbU.A0F(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
            r5.A01 = r0     // Catch:{ IllegalArgumentException -> 0x0089 }
            r0 = 2131432778(0x7f0b154a, float:1.8487323E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
            r5.A00 = r4     // Catch:{ IllegalArgumentException -> 0x0089 }
            java.lang.Integer r0 = X.AnonymousClass05K.A06     // Catch:{ IllegalArgumentException -> 0x0089 }
            X.2eS.A04(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
            X.82q r0 = r5.A04     // Catch:{ IllegalArgumentException -> 0x0089 }
            r1 = 0
            if (r0 == 0) goto L_0x0037
            X.514 r0 = r0.ANP()     // Catch:{ IllegalArgumentException -> 0x0089 }
            android.content.res.Resources r2 = r5.getResources()     // Catch:{ IllegalArgumentException -> 0x0089 }
            int r0 = r0.A02     // Catch:{ IllegalArgumentException -> 0x0089 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
            X.03v.A0G(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
        L_0x0037:
            android.view.View r2 = X.JTR.A0U(r4)     // Catch:{ IllegalArgumentException -> 0x0089 }
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            X.0nA.A0n(r4, r2, r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
            r2 = 41
            X.LY8 r0 = new X.LY8     // Catch:{ IllegalArgumentException -> 0x0089 }
            r0.<init>(r2, r4, r5)     // Catch:{ IllegalArgumentException -> 0x0089 }
            r4.setOnClickListener(r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
            X.82q r0 = r5.A04     // Catch:{ IllegalArgumentException -> 0x0089 }
            if (r0 == 0) goto L_0x0087
            X.36W r2 = X.JWE.A04(r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
        L_0x0053:
            X.36W r0 = X.AnonymousClass36W.PROFILE_PHOTO     // Catch:{ IllegalArgumentException -> 0x0089 }
            if (r2 == r0) goto L_0x0063
            X.82q r0 = r5.A04     // Catch:{ IllegalArgumentException -> 0x0089 }
            if (r0 == 0) goto L_0x005f
            X.36W r1 = X.JWE.A04(r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
        L_0x005f:
            X.36W r0 = X.AnonymousClass36W.GROUP_PHOTO     // Catch:{ IllegalArgumentException -> 0x0089 }
            if (r1 != r0) goto L_0x0091
        L_0x0063:
            r0 = 2131428461(0x7f0b046d, float:1.8478567E38)
            android.view.View r2 = X.JTS.A0C(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.PunchedOverlayView"
            X.0qQ.A0C(r2, r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r2 = (com.instagram.common.ui.widget.imageview.PunchedOverlayView) r2     // Catch:{ IllegalArgumentException -> 0x0089 }
            android.content.Context r1 = r5.getContext()     // Catch:{ IllegalArgumentException -> 0x0089 }
            r0 = 2130970861(0x7f0408ed, float:1.7550444E38)
            int r0 = X.AnonymousClass7TF.A03(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
            r2.A01 = r0     // Catch:{ IllegalArgumentException -> 0x0089 }
            X.M2G r0 = new X.M2G     // Catch:{ IllegalArgumentException -> 0x0089 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0089 }
            r2.post(r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
            goto L_0x0091
        L_0x0087:
            r2 = r1
            goto L_0x0053
        L_0x0089:
            r2 = move-exception
            java.lang.String r1 = "FilterViewContainer"
            java.lang.String r0 = "Unable to set button views due to missing view ids, this is not necessarily an issue"
            X.0KC.A0G(r1, r0, r2)
        L_0x0091:
            r0 = 934044002(0x37ac6162, float:2.0549345E-5)
            X.AnonymousClass0fD.A0D(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.filterview.FilterViewContainer.onFinishInflate():void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(1564346410);
        0qQ.A0B(motionEvent, 0);
        GestureDetector gestureDetector = this.A07;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.A03 != null) {
                this.A08.sendEmptyMessageDelayed(0, 300);
            }
            View view = this.A00;
            if (this.A05) {
                AnonymousClass7TH.A0R(view);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            motionEvent.getActionMasked();
            this.A08.removeMessages(0);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                if (this.A06 && this.A03 != null) {
                    this.A06 = false;
                }
                View view2 = this.A00;
                if (this.A05 && view2 != null) {
                    view2.setVisibility(0);
                }
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0C(-671123914, A052);
                throw A0y;
            }
        }
        AnonymousClass0fD.A0C(-1904290176, A052);
        return true;
    }

    public final void setCropToggleButtonEnabled(boolean z) {
        this.A05 = z;
    }

    public final void setListener(MQ6 mq6) {
        this.A03 = mq6;
    }

    public final void setUserSession(UserSession userSession) {
        this.A02 = userSession;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
        A00();
    }
}
