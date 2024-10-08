package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.7HR  reason: invalid class name */
public final class AnonymousClass7HR extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AnonymousClass7HQ A00;
    public final /* synthetic */ AnonymousClass7HQ A01;

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        ImmutableSet A03 = ImmutableSet.A03(this.A01.A01);
        0qQ.A07(A03);
        Iterator it = new HashSet(A03).iterator();
        while (it.hasNext()) {
            C234382xm r1 = (C234382xm) it.next();
            if (r1 instanceof AnonymousClass7HP) {
                ((AnonymousClass7HP) r1).A00(motionEvent, this.A00);
            }
        }
        return false;
    }

    public AnonymousClass7HR(AnonymousClass7HQ r1, AnonymousClass7HQ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        AnonymousClass7HQ r6 = this.A01;
        r6.A01 = true;
        ImmutableSet A03 = ImmutableSet.A03(r6.A01);
        0qQ.A07(A03);
        Iterator it = new HashSet(A03).iterator();
        while (it.hasNext()) {
            C234382xm r7 = (C234382xm) it.next();
            if (r7 instanceof AnonymousClass7HP) {
                AnonymousClass7HQ r4 = this.A00;
                r7.Dgo(r4);
                ImmutableSet A032 = ImmutableSet.A03(r4.A01);
                0qQ.A07(A032);
                Iterator it2 = new HashSet(A032).iterator();
                while (it2.hasNext()) {
                    C234382xm r2 = (C234382xm) it2.next();
                    if (r2 instanceof AnonymousClass7HT) {
                        AnonymousClass7HT r22 = (AnonymousClass7HT) r2;
                        if (r22.A03 <= 1.0f) {
                            r22.A0K.A02();
                            r22.Dgn(r4);
                        } else {
                            r22.A03 = 0.9f;
                        }
                    }
                }
                r7.Dgt(r4);
            }
        }
        r6.A01 = false;
        return true;
    }
}
