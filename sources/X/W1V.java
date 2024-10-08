package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class W1V {
    public int A00;
    public int A01;
    public C59721JVf A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final FrameLayout A09;
    public final Set A0A;
    public final ConcurrentLinkedQueue A0B = new ConcurrentLinkedQueue();
    public final ULB[] A0C = {new ULB(0, 0, 0.0f), new ULB(0, 0, 0.0f)};
    public final C14711U2w[] A0D;
    public final long A0E;
    public final C19076WKg A0F = new C19076WKg(this);

    public W1V(Context context, long j) {
        this.A0E = j;
        this.A09 = new FrameLayout(context);
        int i = 0;
        C14711U2w[] u2wArr = {new C14711U2w(context, 0), new C14711U2w(context, 1)};
        this.A0D = u2wArr;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        0qQ.A07(newSetFromMap);
        this.A0A = newSetFromMap;
        this.A01 = -1;
        do {
            C14711U2w u2w = u2wArr[i];
            u2w.setPlayerListener(this.A0F);
            u2w.setAlpha(0.0f);
            this.A09.addView(u2w);
            i++;
        } while (i < 2);
    }

    public static final void A02(W1V w1v, String str, boolean z) {
        long j;
        C61062Jw0 jw0;
        w1v.A05 = true;
        if (w1v.A03 != null) {
            for (AnonymousClass7QJ r0 : w1v.A0A) {
                AnonymousClass7QL r1 = r0.A00.A00;
                if (!(r1 == null || (jw0 = (C61062Jw0) r1.A04.get(str)) == null)) {
                    for (AnonymousClass7QV r02 : r1.A06) {
                        C333637Zs r2 = r02.A00;
                        AnonymousClass7I3 r12 = r2.A02;
                        String str2 = (String) r2.A04.invoke();
                        String A002 = r2.A00();
                        0qQ.A0B(A002, 1);
                        0Aj A0e = AnonymousClass7TE.A0e(r12.A01, "ai_agent_embodiment_transition");
                        if (A0e.isSampled()) {
                            AnonymousClass7QP r8 = (AnonymousClass7QP) jw0.A01;
                            AnonymousClass7QP r7 = (AnonymousClass7QP) jw0.A00;
                            A0e.AAJ("transition_trigger", r7.A05);
                            A0e.AAJ("transition_llm_action_name", r7.A00);
                            A0e.AAJ("transition_llm_sentiment_name", r7.A02);
                            A0e.AAJ("transition_llm_intensity_name", r7.A01);
                            A0e.AAJ("transition_previous_state", r8.A03);
                            A0e.AAJ("transition_previous_action", r8.A00);
                            A0e.AAJ("transition_previous_sentiment", r8.A02);
                            A0e.AAJ("transition_previous_intensity", r8.A01);
                            A0e.AAJ(AnonymousClass000.A00(1901), r7.A04);
                            A0e.AAJ("thread_session_id", str2);
                            A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A002);
                            A0e.AAJ("video_id", jw0.A04);
                            A0e.Cgf();
                        }
                    }
                }
            }
        }
        int i = (w1v.A00 + 1) % 2;
        C14711U2w[] u2wArr = w1v.A0D;
        C14711U2w u2w = u2wArr[i];
        A01(w1v, i);
        u2w.A00();
        u2w.bringToFront();
        u2w.setAlpha(0.0f);
        C14711U2w u2w2 = u2wArr[w1v.A00 % 2];
        u2w.clearAnimation();
        u2w2.clearAnimation();
        ViewPropertyAnimator animate = u2w.animate();
        if (z) {
            j = w1v.A0E;
        } else {
            j = 0;
        }
        animate.setDuration(j).alpha(1.0f).withEndAction(new C20162WmM(w1v, u2w2)).start();
    }

    public final void A03() {
        this.A02 = null;
        C14711U2w[] u2wArr = this.A0D;
        int i = 0;
        do {
            C14711U2w u2w = u2wArr[i];
            u2w.A03 = null;
            u2w.A06 = false;
            u2w.A04 = null;
            Surface surface = u2w.A01;
            if (surface != null) {
                surface.release();
            }
            u2w.A01 = null;
            SurfaceTexture surfaceTexture = u2w.getSurfaceTexture();
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            C263634Mt r2 = u2w.A08;
            C263634Mt.A05(r2, "release", new Object[0]);
            Handler handler = r2.A0E;
            handler.sendMessage(handler.obtainMessage(8));
            i++;
        } while (i < 2);
    }

    public final void A04(C59721JVf jVf) {
        AnonymousClass4OI r0;
        AnonymousClass4OI r3 = (AnonymousClass4OI) jVf.A01;
        Number number = (Number) jVf.A00;
        if (number != null) {
            number.intValue();
        }
        if (this.A05) {
            this.A02 = jVf;
            return;
        }
        int intValue = number.intValue();
        if (intValue == 0) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.A0B;
            concurrentLinkedQueue.add(r3);
            if (!this.A06 && !concurrentLinkedQueue.isEmpty() && (r0 = (AnonymousClass4OI) concurrentLinkedQueue.poll()) != null) {
                A00(r0, this, false);
            }
        } else if (intValue == 1) {
            this.A0B.clear();
            A00(r3, this, false);
        } else if (intValue == 2) {
            this.A0B.clear();
            this.A01 = -1;
            A00(r3, this, true);
        } else {
            throw new RuntimeException();
        }
    }

    public static final void A00(AnonymousClass4OI r4, W1V w1v, boolean z) {
        String str = r4.A0K.A0G;
        C14711U2w u2w = w1v.A0D[(w1v.A00 + 1) % 2];
        w1v.A03 = str;
        w1v.A04 = null;
        C263634Mt r2 = u2w.A08;
        C263634Mt.A05(r2, "stop", new Object[0]);
        Handler handler = r2.A0E;
        handler.sendMessage(handler.obtainMessage(37));
        u2w.A02(r4, z);
        w1v.A06 = true;
    }

    public static final void A01(W1V w1v, int i) {
        int height;
        int i2;
        float f;
        if (i == w1v.A00 % 2) {
            ULB ulb = w1v.A0C[i];
            if (ulb.A04) {
                FrameLayout frameLayout = w1v.A09;
                if (frameLayout.getWidth() > 0 && frameLayout.getHeight() > 0 && frameLayout.getParent() != null) {
                    View A0U = JTR.A0U(frameLayout);
                    if (A0U.getWidth() > 0 && A0U.getHeight() > 0) {
                        float A002 = JTP.A00((float) A0U.getWidth(), A0U);
                        float f2 = ulb.A00;
                        float f3 = 0.0f;
                        if (f2 <= A002) {
                            i2 = A0U.getWidth();
                            height = (int) (((float) i2) / f2);
                            f = ((float) (A0U.getHeight() - height)) * 0.0f;
                        } else {
                            height = A0U.getHeight();
                            i2 = (int) (((float) height) * f2);
                            f3 = ((float) (A0U.getWidth() - i2)) * 0.0f;
                            f = 0.0f;
                        }
                        C66580MXl.A1C(frameLayout, i2);
                        C66580MXl.A1B(frameLayout, height);
                        frameLayout.setX(f3);
                        frameLayout.setY(f);
                        frameLayout.requestLayout();
                    }
                }
            }
        }
    }
}
