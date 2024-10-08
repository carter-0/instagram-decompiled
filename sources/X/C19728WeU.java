package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.WeU  reason: case insensitive filesystem */
public final class C19728WeU implements AnonymousClass8HH {
    public final /* synthetic */ WUW A00;

    public final /* synthetic */ void DNK(float f, float f2) {
    }

    public final void DiR(float f) {
    }

    public final /* synthetic */ void E0X(float f) {
    }

    public C19728WeU(WUW wuw) {
        this.A00 = wuw;
    }

    private final void A00(float f) {
        WUW wuw = this.A00;
        AnonymousClass7TF.A16(wuw.A03);
        SurfaceTexture surfaceTexture = wuw.A02;
        if (surfaceTexture != null) {
            I09.A00(new TTR(surfaceTexture, wuw.A09, f, wuw.A01, wuw.A00));
        }
    }

    public final void Dsh(boolean z) {
        String str;
        WUW wuw = this.A00;
        AnonymousClass7TH.A0R(wuw.A03);
        I09 i09 = wuw.A09;
        AnonymousClass8HJ r0 = wuw.A0K;
        0qQ.A0B(r0, 0);
        Map map = i09.A04;
        C39735A7b a7b = (C39735A7b) map.get(r0);
        if (a7b != null) {
            FilmstripTimelineView filmstripTimelineView = wuw.A05;
            str = "trimmerTimelineView";
            if (filmstripTimelineView != null) {
                float leftTrimmerPosition = filmstripTimelineView.getLeftTrimmerPosition();
                float rightTrimmerPosition = filmstripTimelineView.getRightTrimmerPosition();
                float f = a7b.A00;
                if (!(f == leftTrimmerPosition && a7b.A01 == rightTrimmerPosition)) {
                    if (f != leftTrimmerPosition) {
                        a7b.A00 = leftTrimmerPosition;
                    }
                    if (a7b.A01 != rightTrimmerPosition) {
                        a7b.A01 = rightTrimmerPosition;
                    }
                    wuw.A0A.A01(AnonymousClass000.A00(2714));
                    FilmstripTimelineView filmstripTimelineView2 = wuw.A05;
                    if (filmstripTimelineView2 != null) {
                        float leftTrimmerPosition2 = filmstripTimelineView2.getLeftTrimmerPosition();
                        float rightTrimmerPosition2 = filmstripTimelineView2.getRightTrimmerPosition();
                        AtomicInteger atomicInteger = i09.A05;
                        if (atomicInteger.get() != 5 && atomicInteger.compareAndSet(0, 5)) {
                            try {
                                String A0B = AnonymousClass457.A0B(AnonymousClass457.A0C((String) null, 0, false));
                                0qQ.A07(A0B);
                                i09.A06.invoke();
                                I09.A00(new C58189Int(i09, A0B, leftTrimmerPosition2, rightTrimmerPosition2));
                            } catch (IOException e) {
                                0KC.A0F(Pxd.A00(52), Pxd.A00(168), e);
                            }
                        }
                        AnonymousClass8HJ r02 = wuw.A0K;
                        0qQ.A0B(r02, 0);
                        C39735A7b a7b2 = (C39735A7b) map.get(r02);
                        if (a7b2 != null) {
                            a7b2.A03++;
                            return;
                        }
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass8HJ r03 = wuw.A0K;
        0qQ.A0B(r03, 0);
        C39735A7b a7b3 = (C39735A7b) map.get(r03);
        if (a7b3 != null) {
            FilmstripTimelineView filmstripTimelineView3 = wuw.A05;
            if (filmstripTimelineView3 == null) {
                str = "trimmerTimelineView";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            filmstripTimelineView3.A01(a7b3.A00, a7b3.A01);
        }
        AnonymousClass7TH.A0R(wuw.A03);
    }

    public final void Dsj(boolean z) {
        WUW wuw = this.A00;
        if (wuw.A03 == null) {
            TextureView textureView = new TextureView(wuw.A06);
            FrameLayout frameLayout = wuw.A04;
            if (frameLayout == null) {
                0qQ.A0F("trimmerPreviewViewHolder");
                throw AnonymousClass00P.createAndThrow();
            }
            frameLayout.addView(textureView);
            textureView.setSurfaceTextureListener(new ALu(wuw, 2));
            textureView.setVisibility(8);
            wuw.A03 = textureView;
        }
    }

    public final void DNM(float f) {
        A00(f);
    }

    public final void Dfu(float f) {
        A00(f);
    }
}
