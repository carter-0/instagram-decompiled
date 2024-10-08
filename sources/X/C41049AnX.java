package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.io.IOException;

/* renamed from: X.AnX  reason: case insensitive filesystem */
public final class C41049AnX implements Runnable {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ AnonymousClass51N A01;

    public C41049AnX(C353498Hw r1, AnonymousClass51N r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        ADA ada;
        C353498Hw r0 = this.A00;
        if (C353498Hw.A1U(r0)) {
            C71662eb r3 = r0.A1E;
            View A012 = r3.A01();
            0qQ.A07(A012);
            A012.setOutlineProvider((ViewOutlineProvider) null);
            A012.setClipToOutline(false);
            int width = r3.A01().getWidth();
            int height = r3.A01().getHeight();
            AnonymousClass804 r4 = (AnonymousClass804) r0.A1x.A03.A02();
            AnonymousClass88F r1 = r0.A1w;
            if (!(r1 == null || r4 == null)) {
                C388689oE r5 = r1.A0K;
                if (r4 instanceof C339987kV) {
                    ada = new ADA(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 207, true, true);
                } else if (r4 instanceof AnonymousClass803) {
                    int ordinal = ((AnonymousClass803) r4).A00.ordinal();
                    if (ordinal == 0) {
                        ada = new ADA(((float) width) / 4.0f, 0.0f, 0.5f, 0.5f, 0.0f, 242, false, false);
                    } else if (ordinal == 1) {
                        ada = C394899ys.A00(r5.A01, height);
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                } else if (r4 instanceof C340007kX) {
                    if (((C340007kX) r4).A00.ordinal() == 0) {
                        ada = new ADA(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 207, true, true);
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                }
                View A013 = r3.A01();
                0qQ.A07(A013);
                AnonymousClass81W r7 = ((NineSixteenLayoutConfigImpl) r0.A1H).A0K;
                float f = ada.A00;
                0nA.A0V(A013, (int) (((float) r7.getHeight()) * f));
                r3.A01().setTranslationX(ada.A01);
                r3.A01().setTranslationY(ada.A02);
                if (f < 1.0f) {
                    r3.A01().setTranslationY(((float) r7.getHeight()) * f);
                }
                r3.A01().setScaleY(ada.A03);
                r3.A01().setScaleX(ada.A04);
                boolean z = ada.A05;
                if (z && ada.A06) {
                    View A014 = r3.A01();
                    0qQ.A07(A014);
                    AnonymousClass8LZ.A00(A014);
                } else if (z) {
                    View A015 = r3.A01();
                    0qQ.A07(A015);
                    float A06 = (float) AnonymousClass7TG.A06(A015.getContext());
                    AnonymousClass8LZ.A01(A015, A06, (int) (1.0f - A06));
                }
            }
        } else {
            C353498Hw.A0l(r0);
        }
        try {
            AnonymousClass8A5 r8 = r0.A1c;
            AnonymousClass51M r6 = (AnonymousClass51M) this.A01;
            String A0E = r6.A0E();
            int abs = (int) (((float) r6.A08) * Math.abs(r6.A00));
            C71662eb r42 = r0.A1E;
            r42.A01().getWidth();
            int height2 = r42.A01().getHeight();
            0qQ.A0B(A0E, 0);
            boolean exists = AnonymousClass8A5.A00(new C378989Rz(height2), r8, LIO.A00(A0E), abs).exists();
            String A0E2 = r6.A0E();
            if (exists) {
                int width2 = r42.A01().getWidth();
                int height3 = r42.A01().getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                C65068Lmm lmm = new C65068Lmm(r0, 0);
                0qQ.A0B(A0E2, 0);
                AnonymousClass51M A002 = LIO.A00(A0E2);
                0qQ.A0B(A002, 0);
                AnonymousClass8A5.A01(config, lmm, r8, A002, (int) (((float) A002.A08) * Math.abs(A002.A00)), width2, height3, false);
                return;
            }
            AnonymousClass81W r12 = ((NineSixteenLayoutConfigImpl) r0.A1H).A0K;
            AnonymousClass8A5 r52 = r8;
            r52.A03(Bitmap.Config.ARGB_8888, new C65068Lmm(r0, 0), A0E2, r12.getWidth(), r12.getHeight());
        } catch (IOException e) {
            0kD.A07("ClipsCaptureControllerImpl", "Fail to get frame file for last segment", e);
        }
    }
}
