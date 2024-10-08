package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.8XJ  reason: invalid class name */
public final class AnonymousClass8XJ implements C252203oj {
    public int A00;
    public Drawable A01;
    public final C252063oV A02;
    public final C3498081w A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C377269Le(this, 7));
    public final AnonymousClass8XG A05;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r4) {
        0qQ.A0B(r4, 0);
        if (0qQ.A0K(r4.A05, C39618A2i.A01)) {
            r4.A09(C39618A2i.A00);
            r4.A06 = true;
            r4.A08(0.5d, true);
            r4.A06(1.0d);
            return;
        }
        this.A02.setVisibility(8);
        AnonymousClass8XG r2 = this.A05;
        Drawable drawable = this.A01;
        if (drawable == null) {
            0qQ.A0F("thumbnailDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.A0A.EZd(drawable);
        r2.A00();
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r14) {
        View view;
        float A042;
        0qQ.A0B(r14, 0);
        double d = r14.A09.A00;
        if (0qQ.A0K(r14.A05, C39618A2i.A01)) {
            float A043 = (float) AnonymousClass37Q.A04(d, 0.0d, 0.5d, 0.0d, 1.0d);
            view = this.A02.getView();
            view.setScaleX(A043);
            view.setScaleY(A043);
            A042 = -((float) this.A00);
        } else {
            view = this.A02.getView();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A042 = (float) AnonymousClass37Q.A04(d, 0.5d, 1.0d, -((double) this.A00), 0.0d);
        }
        view.setTranslationY(A042);
    }

    public AnonymousClass8XJ(ViewGroup viewGroup, C3498081w r5, AnonymousClass8XG r6) {
        this.A03 = r5;
        this.A05 = r6;
        C252063oV A012 = 2b1.A01(viewGroup.requireViewById(R.id.gallery_button_save_popout_image_stub), false, false);
        this.A02 = A012;
        A012.EeU(new AnonymousClass8XK(this));
    }
}
