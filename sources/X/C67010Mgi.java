package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameracountdown.CountdownView;
import java.lang.ref.WeakReference;

/* renamed from: X.Mgi  reason: case insensitive filesystem */
public final class C67010Mgi implements AnonymousClass8JF {
    public int A00;
    public long A01 = -1;
    public CountDownTimer A02;
    public C265674Vs A03;
    public AnonymousClass61R A04;
    public AnonymousClass61R A05;
    public WeakReference A06;
    public Runnable A07;
    public final View A08;
    public final ImageView A09;
    public final TextView A0A;
    public final AnonymousClass61R A0B;
    public final AnonymousClass61R A0C;
    public final AnonymousClass61R A0D;
    public final UserSession A0E;
    public final CountdownView A0F;
    public final Runnable A0G = new C67011Mgj(this);
    public final Context A0H;
    public final ImageView A0I;
    public final Guideline A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static void A00(ImageView imageView, AnonymousClass61R r16, C74309Psj psj, C67010Mgi mgi, Integer num, Integer num2, long j, boolean z, boolean z2) {
        long j2;
        Integer num3 = num;
        View view = imageView;
        C67010Mgi mgi2 = mgi;
        mgi2.A04();
        if (imageView != null) {
            TextView textView = mgi2.A0A;
            boolean z3 = false;
            if (!(num2 == null || textView == null)) {
                textView.setText(num2.intValue());
                textView.setVisibility(0);
            }
            boolean z4 = mgi2.A0L;
            if (z4) {
                view = mgi2.A0F;
                num3 = AnonymousClass05K.A00;
            }
            view.setVisibility(0);
            mgi2.A03();
            if (mgi2.A02 == null) {
                z3 = true;
            }
            17k.A0F(z3);
            if (num3.intValue() != 0) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000;
            }
            C67661Mrr mrr = new C67661Mrr(view, psj, mgi2, num3, j, j2, z2, z);
            mgi2.A02 = mrr;
            mgi2.A01 = SystemClock.elapsedRealtime();
            if (z4) {
                mrr.start();
                ImageView imageView2 = mgi2.A09;
                Runnable runnable = mgi2.A0G;
                imageView2.removeCallbacks(runnable);
                imageView2.postOnAnimation(runnable);
                return;
            }
            C73290Pa8 pa8 = new C73290Pa8(view, r16, mgi2);
            mgi2.A07 = pa8;
            11Z.A04(pa8, 0);
        }
    }

    public static void A01(C67010Mgi mgi) {
        AnonymousClass61R r0 = mgi.A0C;
        if (r0 != null) {
            r0.stop();
        }
        AnonymousClass61R r02 = mgi.A0B;
        if (r02 != null) {
            r02.stop();
        }
        AnonymousClass61R r03 = mgi.A0D;
        if (r03 != null) {
            r03.stop();
        }
        AnonymousClass61R r04 = mgi.A04;
        if (r04 != null) {
            r04.stop();
        }
        AnonymousClass61R r05 = mgi.A05;
        if (r05 != null) {
            r05.stop();
        }
        ImageView imageView = mgi.A09;
        imageView.removeCallbacks(mgi.A0G);
        mgi.A0F.setVisibility(8);
        imageView.setImageDrawable((Drawable) null);
        imageView.setVisibility(8);
        ImageView imageView2 = mgi.A0I;
        imageView2.setImageDrawable((Drawable) null);
        imageView2.setVisibility(8);
    }

    public static void A02(C67010Mgi mgi, int i) {
        if (mgi.A0K) {
            try {
                MediaPlayer create = MediaPlayer.create(mgi.A0H, i);
                if (create != null) {
                    create.setVolume(1.0f, 1.0f);
                    create.start();
                    create.setOnCompletionListener(new LVC(mgi, 1));
                }
            } catch (Exception e) {
                0kD.A0H("CountdownController", e);
            }
        }
    }

    public final void A03() {
        Guideline guideline;
        C265674Vs r0 = this.A03;
        if (r0 != null && (guideline = this.A0J) != null) {
            AnonymousClass88T A012 = AnonymousClass4W7.A01(r0);
            float f = 1.0f;
            if (A012 == AnonymousClass88T.TABLE_TOP) {
                f = 0.5f;
            }
            guideline.setGuidelinePercent(f);
        }
    }

    public final void A04() {
        Runnable runnable = this.A07;
        if (runnable != null) {
            11Z.A01(runnable);
            this.A07 = null;
        }
        this.A01 = -1;
        CountDownTimer countDownTimer = this.A02;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A02 = null;
        }
        A01(this);
        this.A0F.setVisibility(8);
        this.A09.setVisibility(8);
        this.A0I.setVisibility(8);
        this.A08.setVisibility(8);
    }

    public final void D6P(int i) {
        AnonymousClass8JF r0;
        this.A00 = i;
        WeakReference weakReference = this.A06;
        if (weakReference != null && (r0 = (AnonymousClass8JF) weakReference.get()) != null) {
            r0.D6P(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006d, code lost:
        if (r1 == null) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67010Mgi(android.content.Context r4, android.view.ViewGroup r5, com.instagram.common.session.UserSession r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.A01 = r0
            X.Mgj r0 = new X.Mgj
            r0.<init>(r3)
            r3.A0G = r0
            r3.A0H = r4
            r3.A0E = r6
            r3.A0K = r7
            r0 = 2131429422(0x7f0b082e, float:1.8480516E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r0 != 0) goto L_0x0027
            r0 = 2131438065(0x7f0b29f1, float:1.8498046E38)
            android.view.ViewStub r0 = X.DbU.A0D(r5, r0)
            r0.inflate()
        L_0x0027:
            r0 = 2131430867(0x7f0b0dd3, float:1.8483447E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.creation.capture.quickcapture.cameracountdown.CountdownView r0 = (com.instagram.creation.capture.quickcapture.cameracountdown.CountdownView) r0
            r3.A0F = r0
            r0 = 2131430848(0x7f0b0dc0, float:1.8483409E38)
            android.widget.ImageView r0 = X.DbU.A0F(r5, r0)
            r3.A09 = r0
            r0 = 2131430842(0x7f0b0dba, float:1.8483396E38)
            android.view.View r0 = r5.requireViewById(r0)
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            r3.A0J = r0
            r0 = 2131436378(0x7f0b235a, float:1.8494625E38)
            android.widget.ImageView r0 = X.DbU.A0F(r5, r0)
            r3.A0I = r0
            r0 = 2131886100(0x7f120014, float:1.940677E38)
            X.61R r2 = X.C303756Aq.A00(r4, r0)
            r3.A0C = r2
            r0 = 2131886098(0x7f120012, float:1.9406765E38)
            X.61R r0 = X.C303756Aq.A00(r4, r0)
            r3.A0B = r0
            r0 = 2131886102(0x7f120016, float:1.9406773E38)
            X.61R r1 = X.C303756Aq.A00(r4, r0)
            r3.A0D = r1
            if (r2 == 0) goto L_0x006f
            r0 = 0
            if (r1 != 0) goto L_0x0070
        L_0x006f:
            r0 = 1
        L_0x0070:
            r3.A0L = r0
            r0 = 2131430846(0x7f0b0dbe, float:1.8483404E38)
            android.view.View r0 = r5.requireViewById(r0)
            r3.A08 = r0
            int r0 = X.C353608Ij.A00(r6)
            r3.A00 = r0
            r0 = 2131430834(0x7f0b0db2, float:1.848338E38)
            android.widget.TextView r0 = X.DbU.A0G(r5, r0)
            r3.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67010Mgi.<init>(android.content.Context, android.view.ViewGroup, com.instagram.common.session.UserSession, boolean):void");
    }
}
