package X;

import android.graphics.drawable.Drawable;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: X.FAb  reason: case insensitive filesystem */
public final class C49861FAb {
    public Drawable A00;
    public Scene A01;
    public Scene A02;
    public Transition A03;
    public TransitionSet A04;
    public ViewGroup A05;
    public Runnable A06;
    public Runnable A07;
    public final AnonymousClass0iw A08;

    public static final void A00(Scene scene, Transition transition, ViewGroup viewGroup, int... iArr) {
        ArrayList A0v = DbS.A0v(2);
        int i = 0;
        do {
            View findViewById = viewGroup.findViewById(iArr[i]);
            if (findViewById != null) {
                ViewPropertyAnimator duration = findViewById.animate().alpha(0.0f).setDuration(150);
                0qQ.A07(duration);
                A0v.add(duration);
            }
            i++;
        } while (i < 2);
        int size = A0v.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == size - 1) {
                ((ViewPropertyAnimator) A0v.get(i2)).withEndAction(new C51379FtB(scene, transition));
            }
            ((ViewPropertyAnimator) A0v.get(0)).start();
        }
    }

    public C49861FAb(AnonymousClass0iw r1) {
        this.A08 = r1;
    }
}
