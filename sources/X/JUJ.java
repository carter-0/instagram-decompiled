package X;

import android.animation.Animator;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.Reference;

public final class JUJ extends AnonymousClass4HM {
    public final /* synthetic */ C232812uU A00;
    public final /* synthetic */ AnonymousClass4UR A01;

    public JUJ(C232812uU r1, AnonymousClass4UR r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        AnonymousClass4Ki r0;
        AnonymousClass4UR r4 = this.A01;
        for (Reference reference : r4.A07) {
            C242213Tb r2 = (C242213Tb) reference.get();
            if (r2 != null) {
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) r2;
                if (this.A00 != C232812uU.SLIDE_IN) {
                    slideInAndOutIconView.A0C.setVisibility(8);
                    slideInAndOutIconView.A0B.setTranslationX(0.0f);
                }
            }
        }
        if (this.A00 == C232812uU.SLIDE_IN) {
            r0 = AnonymousClass4Ki.FULLTEXT;
        } else {
            r0 = AnonymousClass4Ki.ICON;
        }
        r4.A05 = r0;
    }

    public final void onAnimationStart(Animator animator) {
        float f;
        AnonymousClass4UR r1 = this.A01;
        r1.A05 = AnonymousClass4Ki.FULLTEXT;
        for (Reference reference : r1.A07) {
            C242213Tb r4 = (C242213Tb) reference.get();
            if (r4 != null) {
                C232812uU r3 = this.A00;
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) r4;
                float height = slideInAndOutIconView.A0A.height();
                TitleTextView titleTextView = slideInAndOutIconView.A0C;
                slideInAndOutIconView.A00 = height + ((float) titleTextView.getWidth());
                if (r3 != C232812uU.SLIDE_IN) {
                    titleTextView.setPivotY((float) (titleTextView.getMeasuredHeight() / 2));
                    C242233Td r12 = slideInAndOutIconView.A03;
                    if ((r12 != C242233Td.START || slideInAndOutIconView.A05) && (r12 != C242233Td.END || !slideInAndOutIconView.A05)) {
                        f = (float) titleTextView.getWidth();
                    } else {
                        f = 0.0f;
                    }
                    titleTextView.setPivotX(f);
                }
            }
        }
    }
}
