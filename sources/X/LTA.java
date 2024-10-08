package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

public abstract class LTA {
    public static final void A02(View view) {
        view.setAlpha(0.0f);
        view.setVisibility(0);
        DbY.A0G(view).setDuration(100).setListener((Animator.AnimatorListener) null);
    }

    public static final void A05(RecyclerView recyclerView, CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager, AnonymousClass89v r12, C62320sa r13, int i, boolean z) {
        C380589Yt r1;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = null;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            0kD.A07("ClipsTimelineEditorAnimationUtil", "thumbnail recycler view is null", (Throwable) null);
            return;
        }
        Context context = recyclerView.getContext();
        int A05 = JTR.A05(context);
        int i2 = (AnonymousClass7TF.A0E(context).widthPixels - r12.A02) - (A05 * 2);
        int i3 = i;
        C249703kE A0W = recyclerView2.A0W(i);
        if ((A0W instanceof C380589Yt) && (r1 = (C380589Yt) A0W) != null) {
            r1.A00();
            C252063oV r0 = (C252063oV) r1.A09.getValue();
            if (r0 != null) {
                touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) r0.getView();
            }
        }
        float f = 0.0f;
        float f2 = 1.0f;
        if (z) {
            f2 = 0.0f;
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
        ofFloat.addUpdateListener(new LTs(recyclerView2, recyclerView2, customScrollingLinearLayoutManager, touchInterceptorFrameLayout, i2, i3));
        ofFloat.addListener(new C64195LTd(5, ofFloat, r13));
        ofFloat.start();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.0rk] */
    public static final void A06(RecyclerView recyclerView, AnonymousClass89v r16, C62320sa r17, 0sP r18, int i, int i2, int i3, int i4, boolean z) {
        C380589Yt r9;
        RecyclerView recyclerView2 = recyclerView;
        int A01 = (i2 - (r16.A02 * 2)) - (DbY.A01(recyclerView.getContext()) * 2);
        C249703kE A0W = recyclerView.A0W(i);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = null;
        if (A0W instanceof C380589Yt) {
            r9 = (C380589Yt) A0W;
            if (r9 != null) {
                r9.A00();
                C252063oV r0 = (C252063oV) r9.A09.getValue();
                if (r0 != null) {
                    touchInterceptorFrameLayout = r0.getView();
                }
            }
        } else {
            r9 = null;
        }
        float f = 0.0f;
        float f2 = 1.0f;
        boolean z2 = z;
        if (z) {
            f2 = 0.0f;
            f = 1.0f;
        }
        ? obj = new Object();
        int height = recyclerView.getHeight();
        int i5 = i4;
        0nA.A0V(recyclerView, i5);
        if (r9 != null) {
            int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            View A0c = AnonymousClass7TE.A0c(r9.A0B);
            if (A0c != null) {
                A0c.setVisibility(DbW.A01(z2 ? 1 : 0));
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
        ofFloat.addUpdateListener(new C64204LTu(recyclerView2, touchInterceptorFrameLayout, r9, r18, obj, A01, height, i5, i3, z2));
        ofFloat.addListener(new C64195LTd(3, ofFloat, r17));
        ofFloat.start();
    }

    public static final ValueAnimator A00(C62320sa r12, C62320sa r13, C62320sa r14, float f, int i, int i2) {
        LF9 lf9 = new LF9((float) i);
        LF9 lf92 = new LF9((float) i2);
        LF9 lf93 = new LF9(f);
        LF9 lf94 = new LF9(f);
        0rm A11 = C51965G9l.A11();
        A11.A00 = r13;
        float[] A1b = C51965G9l.A1b();
        // fill-array-data instruction
        A1b[0] = 0;
        A1b[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        ofFloat.addUpdateListener(new LTt(lf9, lf92, lf93, lf94, new C65783Lzb(lf9), r12, r14, A11));
        ofFloat.addListener(new C64194LTc(ofFloat, 6));
        return ofFloat;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [X.MJ3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(androidx.recyclerview.widget.RecyclerView r29, com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager r30, X.AnonymousClass89v r31, X.C62320sa r32, int r33) {
        /*
            r14 = r29
            if (r29 != 0) goto L_0x000d
            java.lang.String r2 = "ClipsTimelineEditorAnimationUtil"
            java.lang.String r1 = "thumbnail recycler view is null"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            return
        L_0x000d:
            r13 = r31
            int r5 = r13.A02
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r14)
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r1)
            int r4 = r0.widthPixels
            int r4 = r4 - r5
            int r0 = X.JTR.A05(r1)
            int r0 = r0 * 2
            int r20 = r4 - r0
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            X.2Rw r0 = r14.A0A
            r2 = 0
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.getItemCount()
        L_0x0032:
            X.2HY r0 = X.C229632nm.A0C(r2, r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x003e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00bb
            r0 = r9
            X.0sh r0 = (X.0sh) r0
            int r7 = r0.A00()
            r11 = r33
            if (r7 != r11) goto L_0x0075
            X.MIZ r8 = new X.MIZ
            r8.<init>(r14, r7, r2)
            r18 = 1065353216(0x3f800000, float:1.0)
            r6 = 19
            X.MJ3 r0 = new X.MJ3
            r0.<init>(r7, r6, r14)
            r12 = 9
            X.Iw7 r10 = new X.Iw7
            r15 = r30
            r10.<init>((int) r11, (int) r12, (java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15)
            r17 = r10
            r16 = r0
            r19 = r4
            r15 = r8
            android.animation.ValueAnimator r0 = A00(r15, r16, r17, r18, r19, r20)
        L_0x0071:
            r1.add(r0)
            goto L_0x003e
        L_0x0075:
            int r0 = r33 + -2
            if (r7 == r0) goto L_0x009b
            int r0 = r33 + 2
            if (r7 == r0) goto L_0x009b
            r0 = 2
            X.MIZ r6 = new X.MIZ
            r6.<init>(r14, r7, r0)
            r27 = 1065353216(0x3f800000, float:1.0)
            r0 = 20
            X.MJ3 r8 = new X.MJ3
            r8.<init>(r7, r0, r14)
            X.MKO r26 = X.MKO.A00
        L_0x008e:
            r24 = r6
            r25 = r8
            r28 = r5
            r29 = r5
            android.animation.ValueAnimator r0 = A00(r24, r25, r26, r27, r28, r29)
            goto L_0x0071
        L_0x009b:
            r0 = 1
            X.MIZ r6 = new X.MIZ
            r6.<init>(r14, r7, r0)
            r27 = 1058642330(0x3f19999a, float:0.6)
            r26 = 5
            X.MJB r8 = new X.MJB
            r21 = r8
            r22 = r14
            r23 = r11
            r24 = r13
            r25 = r7
            r21.<init>(r22, r23, r24, r25, r26)
            X.MKN r26 = X.MKN.A00
            goto L_0x008e
        L_0x00b8:
            r0 = 0
            goto L_0x0032
        L_0x00bb:
            r3.playTogether(r1)
            r1 = 2
            X.LTd r0 = new X.LTd
            r2 = r32
            r0.<init>(r1, r3, r2)
            r3.addListener(r0)
            r3.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTA.A04(androidx.recyclerview.widget.RecyclerView, com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager, X.89v, X.0sa, int):void");
    }

    public static final FilmstripTimelineView A01(RecyclerView recyclerView, int i) {
        C60691Jpc jpc;
        C249703kE A0W = recyclerView.A0W(i);
        if (!(A0W instanceof C60691Jpc) || (jpc = (C60691Jpc) A0W) == null) {
            return null;
        }
        return jpc.A09;
    }

    public static final void A03(View view, int i) {
        C51972G9s.A0I(view).setDuration(100).setListener(new U0E(view, i, 2));
    }
}
