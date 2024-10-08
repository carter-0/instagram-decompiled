package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Ib9  reason: case insensitive filesystem */
public final class C57465Ib9 implements C331117Pq, AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public C57466IbA A00;
    public final int A01;
    public final int A02;
    public final C54189H2j A03;
    public final C267324bN A04;
    public final C52058GDe A05;
    public final C56625I5d A06;
    public final C56625I5d A07;
    public final JQR A08;
    public final Context A09;
    public final UserSession A0A;
    public final C55558Hje A0B;

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxx(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        C57466IbA ibA = this.A00;
        if (ibA != null) {
            ibA.Dxx(r2);
        }
    }

    public final void Dxy(C263754Nf r1) {
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCompletion() {
    }

    public final void onCues(List list) {
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onStopVideo(String str, boolean z) {
        0qQ.A0B(str, 0);
        C57466IbA ibA = this.A00;
        if (ibA != null) {
            ibA.onStopVideo(str, z);
        }
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final /* synthetic */ void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public final void A00() {
        C57610Idb idb;
        C57466IbA ibA = this.A00;
        if (ibA != null) {
            C14044Tol tol = ibA.A00;
            if (tol != null) {
                tol.A0B("out_of_playback_range");
            }
            ibA.A00 = null;
        } else {
            JQR jqr = this.A08;
            if ((jqr instanceof C57610Idb) && (idb = (C57610Idb) jqr) != null) {
                C55975Hqg hqg = idb.A00;
                if (hqg == null) {
                    0qQ.A0F("photoDelegate");
                    throw AnonymousClass00P.createAndThrow();
                }
                Animator animator = hqg.A00;
                if (animator != null) {
                    animator.end();
                }
                View view = hqg.A02;
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
        }
        this.A00 = null;
    }

    public final void A01() {
        String str;
        C57610Idb idb;
        C57466IbA ibA = this.A00;
        if (ibA != null) {
            C14044Tol tol = ibA.A00;
            if (tol != null) {
                tol.A05(0, false);
            }
            C14044Tol tol2 = ibA.A00;
            if (tol2 == null || tol2.A06.getCurrentPositionMs() != 0) {
                C54508HGu hGu = ibA.A01;
                if (hGu != null) {
                    IgImageView igImageView = hGu.A03.A00;
                    if (igImageView != null) {
                        igImageView.setVisibility(4);
                    }
                    str = "imagePlaceholder";
                }
            } else {
                C54508HGu hGu2 = ibA.A01;
                if (hGu2 != null) {
                    IgImageView igImageView2 = hGu2.A03.A00;
                    if (igImageView2 != null) {
                        igImageView2.startAnimation(ibA.A03);
                    }
                    str = "imagePlaceholder";
                }
            }
            C14044Tol tol3 = ibA.A00;
            if (tol3 != null) {
                tol3.A0C("resume", false);
            }
            Boolean bool = 1GE.A00(ibA.A06).A01;
            if (bool == null || bool.booleanValue()) {
                ibA.A04.A04(ibA);
                C14044Tol tol4 = ibA.A00;
                if (tol4 != null) {
                    tol4.A03(1.0f, 0);
                    return;
                }
                return;
            }
            return;
        }
        JQR jqr = this.A08;
        if ((jqr instanceof C57610Idb) && (idb = (C57610Idb) jqr) != null) {
            C55975Hqg hqg = idb.A00;
            if (hqg == null) {
                str = "photoDelegate";
            } else {
                UserSession userSession = hqg.A03;
                if (182.A06(C51968G9o.A0b(userSession), userSession, 36319239888051235L)) {
                    Animator animator = hqg.A00;
                    if (animator != null) {
                        animator.end();
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(hqg.A00(1.15f, hqg.A01));
                    animatorSet.start();
                    hqg.A00 = animatorSet;
                    return;
                }
                return;
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onAudioFocusChange(int i) {
        C57466IbA ibA = this.A00;
        if (ibA != null) {
            ibA.onAudioFocusChange(i);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C57466IbA ibA = this.A00;
        if (ibA != null) {
            return ibA.onKey(view, i, keyEvent);
        }
        return false;
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        C57466IbA ibA = this.A00;
        if (ibA != null) {
            ibA.onProgressUpdate(i, i2, z);
        }
    }

    public C57465Ib9(Context context, C54189H2j h2j, C267324bN r5, C52058GDe gDe, AnonymousClass0iw r7, UserSession userSession, C56625I5d i5d, C56625I5d i5d2, JQR jqr, int i, int i2) {
        C57466IbA ibA;
        C51974G9v.A1N(i5d, i5d2, jqr);
        this.A09 = context;
        this.A0A = userSession;
        this.A01 = i;
        this.A06 = i5d;
        this.A07 = i5d2;
        this.A08 = jqr;
        this.A04 = r5;
        this.A05 = gDe;
        this.A02 = i2;
        this.A03 = h2j;
        if (jqr.CAl() == AnonymousClass05K.A01) {
            ibA = new C57466IbA(context, r7, userSession, i5d);
        } else {
            ibA = null;
        }
        this.A00 = ibA;
        C55558Hje hje = new C55558Hje(this);
        this.A0B = hje;
        jqr.Ed2(hje);
    }
}
