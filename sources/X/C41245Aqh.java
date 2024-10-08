package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Aqh  reason: case insensitive filesystem */
public final class C41245Aqh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C39782A9b A02;
    public final /* synthetic */ AnonymousClass8G7 A03;
    public final /* synthetic */ AnonymousClass9QO A04;
    public final /* synthetic */ ShutterButton A05;

    public C41245Aqh(C39782A9b a9b, AnonymousClass8G7 r2, AnonymousClass9QO r3, ShutterButton shutterButton, int i, int i2) {
        this.A05 = shutterButton;
        this.A04 = r3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = a9b;
        this.A03 = r2;
    }

    public final void run() {
        C378529Qd r3;
        MS7 ab3;
        ShutterButton shutterButton = this.A05;
        boolean z = shutterButton.A0i.A0A;
        AnonymousClass9QO r4 = this.A04;
        if (z) {
            if (182.A06(0Tu.A05, r4.A02, 36318578462431538L)) {
                r3 = r4.A03;
                ab3 = new C40369Ab2(r4, shutterButton);
            } else {
                return;
            }
        } else {
            r3 = r4.A03;
            ab3 = new C40370Ab3(this.A03, shutterButton);
        }
        r3.A02 = ab3;
        r4.A04.set(true);
        int i = this.A01;
        int i2 = this.A00;
        C39782A9b a9b = this.A02;
        Rect A0W = AnonymousClass7TE.A0W();
        RectF rectF = a9b.A00;
        float f = (float) i;
        A0W.left = (int) ((rectF.left / 448.0f) * f);
        float f2 = (float) i2;
        A0W.top = (int) ((rectF.top / 448.0f) * f2);
        A0W.right = (int) ((rectF.right / 448.0f) * f);
        A0W.bottom = (int) ((rectF.bottom / 448.0f) * f2);
        ViewGroup viewGroup = r3.A03;
        r3.A01 = (ImageView) viewGroup.findViewById(R.id.hand_indicator_keyframe_view);
        int width = A0W.width();
        int height = A0W.height();
        if (width < height) {
            width = height;
        }
        int i3 = (int) (((float) width) * 1.5f * r3.A00);
        ImageView imageView = r3.A01;
        if (imageView != null) {
            0nA.A0f(imageView, i3);
            ImageView imageView2 = r3.A01;
            if (imageView2 != null) {
                0nA.A0V(imageView2, i3);
                ImageView imageView3 = r3.A01;
                if (imageView3 != null) {
                    AnonymousClass61R r42 = r3.A04;
                    imageView3.setImageDrawable(r42);
                    ImageView imageView4 = r3.A01;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                        int width2 = (i3 - ((int) (((float) A0W.width()) * r3.A00))) / 2;
                        float f3 = r3.A00;
                        int height2 = (i3 - ((int) (((float) A0W.height()) * f3))) / 2;
                        ImageView imageView5 = r3.A01;
                        if (imageView5 != null) {
                            imageView5.setX(((((float) A0W.left) * f3) - ((float) width2)) + ((float) ((int) ((AnonymousClass7TE.A02(viewGroup) - (AnonymousClass7TE.A02(viewGroup) * r3.A00)) / 2.0f))));
                            ImageView imageView6 = r3.A01;
                            if (imageView6 != null) {
                                imageView6.setY((((float) A0W.top) * r3.A00) - ((float) height2));
                                ImageView imageView7 = r3.A01;
                                if (imageView7 != null) {
                                    imageView7.setVisibility(0);
                                    if (r42 != null) {
                                        r42.E2p();
                                        r42.A8s(new C64194LTc(r3, 5));
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("animationView");
        throw AnonymousClass00P.createAndThrow();
    }
}
