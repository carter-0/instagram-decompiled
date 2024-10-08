package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

public final class JZB implements C74455PvA {
    public ViewGroup A00;
    public GradientSpinner A01;
    public SlideInAndOutIconView A02;
    public final ViewStub A03;
    public final AnonymousClass4UR A04 = new AnonymousClass4UR();

    public JZB(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A03 = viewStub;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (X.C61670oa.A0B() == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.JZB r5) {
        /*
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = r5.A01
            if (r1 == 0) goto L_0x000c
            r1.A08()
            r0 = 8
            r1.setVisibility(r0)
        L_0x000c:
            X.1QG r1 = X.1QE.A0E()
            X.1QG r0 = X.1QG.A04
            r4 = 0
            if (r1 != r0) goto L_0x001c
            boolean r1 = X.C61670oa.A0B()
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r3 = r5.A02
            if (r3 == 0) goto L_0x003d
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.setIconScale(r2)
            if (r0 == 0) goto L_0x0036
            android.content.Context r1 = r3.getContext()
            r0 = 2131100426(0x7f06030a, float:1.7813233E38)
            int r0 = r1.getColor(r0)
            r3.A02(r0, r0)
        L_0x0036:
            r0 = -1
            r3.setIconColor(r0)
            r3.setBackgroundAlpha(r2)
        L_0x003d:
            android.view.ViewGroup r0 = r5.A00
            if (r0 == 0) goto L_0x0044
            r0.setVisibility(r4)
        L_0x0044:
            X.4UR r1 = r5.A04
            X.4Ki r0 = X.AnonymousClass4Ki.FULLTEXT
            r1.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZB.A00(X.JZB):void");
    }

    public static final void A01(JZB jzb) {
        AnonymousClass4UR r4 = jzb.A04;
        C64194LTc lTc = new C64194LTc(jzb, 7);
        if (r4.A05 == AnonymousClass4Ki.FULLTEXT) {
            float[] A1b = C51965G9l.A1b();
            // fill-array-data instruction
            A1b[0] = 1065353216;
            A1b[1] = 0;
            ValueAnimator duration = ValueAnimator.ofFloat(A1b).setDuration(250);
            r4.A04 = duration;
            C232812uU r2 = C232812uU.SLIDE_OUT;
            duration.addUpdateListener(new LTk(r4));
            r4.A04.addListener(new JUJ(r2, r4));
            r4.A04.addListener(lTc);
            r4.A04.start();
        }
    }

    public final void DOd() {
        this.A04.A01();
        A00(this);
    }

    public final void DQc() {
        this.A04.A01();
        A00(this);
    }

    public final void DOe() {
        A01(this);
    }
}
