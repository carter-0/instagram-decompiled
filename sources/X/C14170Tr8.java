package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.Tr8  reason: case insensitive filesystem */
public final class C14170Tr8 implements C273424mY, C273444ma {
    public float A00 = 1.0f;
    public final View A01;
    public final View A02;
    public final C14187TrR A03;
    public final Activity A04;
    public final Context A05;
    public final UserSession A06;
    public final C14172TrA A07;
    public final UserDetailFragment A08;

    public C14170Tr8(Activity activity, Context context, View view, View view2, UserSession userSession, C14187TrR trR, C14172TrA trA, UserDetailFragment userDetailFragment) {
        DbW.A1N(context, 2, view2);
        this.A04 = activity;
        this.A05 = context;
        this.A06 = userSession;
        this.A01 = view;
        this.A02 = view2;
        this.A08 = userDetailFragment;
        this.A03 = trR;
        this.A07 = trA;
    }

    public final boolean DAA(C317396nC r2, float f, float f2) {
        0qQ.A0B(r2, 0);
        return r2.A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007e, code lost:
        if (r0 < 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008e, code lost:
        if (r5 < 0.0f) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DAZ(X.C317396nC r8, float r9, float r10, float r11, float r12, float r13) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            float r1 = r7.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
            android.view.View r2 = r7.A01
            float r1 = r2.getX()
            int r0 = r2.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r1 = r1 + r0
            float r9 = r9 / r1
            float r1 = r2.getY()
            int r0 = r2.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r1 = r1 + r0
            float r10 = r10 / r1
            float r1 = java.lang.Math.abs(r9)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0046
            float r1 = java.lang.Math.abs(r10)
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0046
            r7.A00(r8)
        L_0x0040:
            X.TrR r0 = r7.A03
            r0.A01()
        L_0x0045:
            return
        L_0x0046:
            com.instagram.profile.fragment.UserDetailFragment r0 = r7.A08
            r0.A0q()
            goto L_0x0040
        L_0x004c:
            android.view.View r4 = r7.A01
            float r3 = r4.getTranslationX()
            float r6 = r4.getTranslationY()
            float r2 = r4.getX()
            int r0 = r4.getWidth()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r2 + r0
            float r5 = r4.getY()
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r1
            float r5 = r5 + r0
            float r2 = r2 + r3
            android.view.View r1 = r7.A02
            int r0 = r1.getWidth()
            float r0 = (float) r0
            r3 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0080
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L_0x0081
        L_0x0080:
            r2 = 1
        L_0x0081:
            float r5 = r5 + r6
            int r0 = r1.getHeight()
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0090
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0091
        L_0x0090:
            r0 = 1
        L_0x0091:
            if (r2 != 0) goto L_0x0095
            if (r0 == 0) goto L_0x0045
        L_0x0095:
            r4.setTranslationY(r3)
            r4.setTranslationX(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14170Tr8.DAZ(X.6nC, float, float, float, float, float):void");
    }

    public final boolean DlG(C317396nC r2, float f, float f2) {
        return false;
    }

    public final void DvA(C317396nC r1) {
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        A00((C317396nC) null);
        boolean z = !AnonymousClass7TF.A1Q((this.A00 > 1.0f ? 1 : (this.A00 == 1.0f ? 0 : -1)));
        C14187TrR trR = this.A03;
        if (z) {
            trR.A00();
        } else {
            trR.A01();
        }
        View view = this.A01;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.A00 = 1.0f;
        C14172TrA trA = this.A07;
        if (trA != null && trA.A00) {
            UserSession userSession = trA.A03;
            AnonymousClass0iw r2 = trA.A02;
            User user = trA.A04;
            C319976rX.A06(r2, userSession, C319976rX.A00(userSession, user), "profile_photo_zoom_end", user.getId(), "expanded_profile_photo");
            trA.A01 = true;
            trA.A00 = false;
        }
    }

    public final void A00(C317396nC r8) {
        if (this.A00 == 1.0f) {
            View view = this.A01;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f});
            ofFloat.setDuration(100);
            ofFloat.start();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f});
            ofFloat2.setDuration(100);
            ofFloat2.start();
            if (r8 != null) {
                r8.EHq(0.0f, 0.0f);
            }
        }
    }

    public final void DAS(C317396nC r2, float f, float f2, float f3, boolean z) {
        View view = this.A01;
        view.setTranslationY(f2 * 1.0f);
        view.setTranslationX(f * 1.0f);
    }

    public final boolean DAg(C317396nC r2, float f, float f2, float f3, float f4, boolean z) {
        this.A03.A00();
        return true;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = this.A00 * scaleGestureDetector.getScaleFactor();
        this.A00 = scaleFactor;
        float A012 = Pxi.A01(scaleFactor, 5.0f, 1.0f);
        this.A00 = A012;
        View view = this.A01;
        view.setScaleX(A012);
        view.setScaleY(this.A00);
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A03.A00();
        C14172TrA trA = this.A07;
        if (trA == null || !trA.A01) {
            return true;
        }
        UserSession userSession = trA.A03;
        AnonymousClass0iw r2 = trA.A02;
        User user = trA.A04;
        C319976rX.A06(r2, userSession, C319976rX.A00(userSession, user), "profile_photo_zoom_start", user.getId(), "expanded_profile_photo");
        trA.A01 = false;
        trA.A00 = true;
        return true;
    }
}
