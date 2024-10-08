package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Uu4  reason: case insensitive filesystem */
public final class C16387Uu4 extends AnonymousClass2uL implements AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public C15692Ugx A00;
    public C16382Utz A01;
    public AnonymousClass4M3 A02;
    public Runnable A03;
    public boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final AudioManager A07;
    public final Animation A08;
    public final 1vq A09;

    public final void onAudioFocusChange(int i) {
        AnonymousClass4M3 r1;
        float f;
        if (i == -3) {
            r1 = this.A02;
            if (r1 != null) {
                f = 0.5f;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (i == -2) {
            r1 = this.A02;
            if (r1 != null) {
                f = 0.0f;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (i == -1) {
            A02();
            return;
        } else if (i == 1 || i == 2 || i == 3 || i == 4) {
            r1 = this.A02;
            if (r1 != null) {
                f = 1.0f;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            return;
        }
        r1.Eqr(f, 0);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C16382Utz utz;
        0qQ.A0B(keyEvent, 2);
        AnonymousClass4M3 r0 = this.A02;
        if (r0 == null || (utz = this.A01) == null || ((AnonymousClass4M1) r0).A0M != AnonymousClass3OB.PLAYING || keyEvent.getAction() != 0 || !this.A04 || (i != 24 && i != 25)) {
            return false;
        }
        if (utz.A00 || !utz.A00.A02) {
            int i2 = -1;
            if (i == 24) {
                i2 = 1;
            }
            AudioManager audioManager = this.A07;
            if (audioManager != null) {
                audioManager.adjustStreamVolume(3, i2, 1);
                boolean A1Q = AnonymousClass7TF.A1Q(audioManager.getStreamVolume(3));
                1GE.A00(this.A06).A00(!A1Q);
                if (A1Q) {
                    utz.A00 = false;
                    return true;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            A00(this);
        }
        return true;
    }

    public final void onVideoViewPrepared(C263754Nf r3) {
        0qQ.A0B(r3, 0);
        C16382Utz utz = (C16382Utz) r3;
        utz.A02 = true;
        IgProgressImageView igProgressImageView = utz.A01.A01;
        Animation animation = this.A08;
        if (animation != null) {
            igProgressImageView.startAnimation(animation);
            igProgressImageView.setVisibility(4);
            igProgressImageView.A06(R.id.listener_id_for_media_video_binder);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A00(C16387Uu4 uu4) {
        1GE.A00(uu4.A06).A00(true);
        C16382Utz utz = uu4.A01;
        if (utz != null) {
            utz.A00 = true;
        }
        A01(uu4, true);
    }

    public static final void A01(C16387Uu4 uu4, boolean z) {
        AnonymousClass4M3 r2 = uu4.A02;
        if (r2 == null) {
            throw AnonymousClass7TE.A0y();
        } else if (z) {
            r2.Eqr(1.0f, 0);
            uu4.A09.A04(uu4);
        } else {
            r2.Eqr(0.0f, 0);
            uu4.A09.A03(uu4);
        }
    }

    public final void A02() {
        1GE.A00(this.A06).A00(false);
        C16382Utz utz = this.A01;
        if (utz != null) {
            utz.A00 = false;
        }
        A01(this, false);
    }

    public final void onStopVideo(String str, boolean z) {
        C16382Utz utz = this.A01;
        if (utz != null) {
            utz.A02 = false;
            if (z) {
                utz.A01.A01.clearAnimation();
                utz.A01.A01.setVisibility(0);
            }
            this.A09.A03(this);
            C15692Ugx ugx = this.A00;
            if (ugx == null) {
                0qQ.A0F("listener");
                throw AnonymousClass00P.createAndThrow();
            }
            C15436Ucm ucm = utz.A00;
            AnonymousClass4M3 r0 = this.A02;
            if (r0 != null) {
                int currentPositionMs = r0.getCurrentPositionMs();
                0qQ.A0B(ucm, 0);
                ugx.A05.A00(ucm).A01 = currentPositionMs;
                this.A01 = null;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void onStopped(C263754Nf r2, int i) {
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
        }
        this.A03 = null;
    }

    public final void onSurfaceTextureDestroyed() {
        C16382Utz utz = this.A01;
        if (utz != null) {
            utz.A01.A01.clearAnimation();
            utz.A01.A01.setVisibility(0);
            utz.A03 = true;
        }
    }

    public final void onSurfaceTextureUpdated(C263754Nf r4) {
        C16382Utz utz = this.A01;
        if (utz != null && utz.A03) {
            if (utz.A02) {
                IgProgressImageView igProgressImageView = utz.A01.A01;
                Animation animation = this.A08;
                if (animation != null) {
                    igProgressImageView.startAnimation(animation);
                    utz.A01.A01.setVisibility(4);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            utz.A03 = false;
        }
    }

    public final void onVideoPrepared(C263754Nf r2, boolean z) {
        C16382Utz utz;
        if (this.A02 != null && (utz = this.A01) != null) {
            A01(this, utz.A00);
        }
    }

    public C16387Uu4(Context context, UserSession userSession) {
        this.A05 = context;
        this.A06 = userSession;
        this.A08 = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_out);
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.A07 = audioManager;
        this.A09 = new 1vq(audioManager, userSession);
    }
}
