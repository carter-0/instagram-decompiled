package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;

/* renamed from: X.Lau  reason: case insensitive filesystem */
public abstract class C64378Lau implements C317516nO {
    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        String str;
        if (this instanceof KMR) {
            KMR kmr = (KMR) this;
            0qQ.A0B(motionEvent, 0);
            ClipsStackedTimelineFragment clipsStackedTimelineFragment = kmr.A01;
            clipsStackedTimelineFragment.A0p = false;
            kmr.A00 = false;
            C60108Jfo jfo = clipsStackedTimelineFragment.A0h;
            if (jfo == null) {
                str = "stackedTimelineViewModel";
            } else {
                C62517Kh8 kh8 = C62517Kh8.A03;
                0qQ.A0B(kh8, 0);
                jfo.A0K.A01();
                MHN.A03(kh8, jfo, C318116oQ.A00(jfo), 10);
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
                if (clipsStackedTimelineViewController == null) {
                    str = "viewController";
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (clipsStackedTimelineViewController.A0J) {
                        return false;
                    }
                    Rect A0W = AnonymousClass7TE.A0W();
                    clipsStackedTimelineViewController.A0O().getHitRect(A0W);
                    return A0W.contains((int) x, (int) y);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } else if (!(this instanceof KMP)) {
            return false;
        } else {
            KMP kmp = (KMP) this;
            C60108Jfo jfo2 = kmp.A01;
            C62517Kh8 A0B = kmp.A00.A0B();
            0qQ.A0B(A0B, 0);
            jfo2.A0K.A01();
            MHN.A03(A0B, jfo2, C318116oQ.A00(jfo2), 10);
            return false;
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!(this instanceof KMR)) {
            return false;
        }
        KMR kmr = (KMR) this;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = kmr.A01;
        if (clipsStackedTimelineFragment.A0p) {
            return true;
        }
        kmr.A00 = false;
        C60108Jfo jfo = clipsStackedTimelineFragment.A0h;
        if (jfo == null) {
            0qQ.A0F("stackedTimelineViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        jfo.A0K.A01();
        C318136oS A00 = C318116oQ.A00(jfo);
        AnonymousClass7TE.A1Z(new MGI(C62517Kh8.A03, jfo, (AnonymousClass4D7) null, -((int) f), -1, 1), A00);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!(this instanceof KMR)) {
            return false;
        }
        KMR kmr = (KMR) this;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = kmr.A01;
        if (clipsStackedTimelineFragment.A0p) {
            return false;
        }
        if (Math.abs(f) < Math.abs(f2) && !kmr.A00) {
            return false;
        }
        kmr.A00 = true;
        C60108Jfo jfo = clipsStackedTimelineFragment.A0h;
        if (jfo == null) {
            0qQ.A0F("stackedTimelineViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        jfo.A0S(C62517Kh8.A03, (int) f, -1);
        return true;
    }
}
