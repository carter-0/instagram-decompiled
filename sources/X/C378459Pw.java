package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Pw  reason: invalid class name and case insensitive filesystem */
public abstract class C378459Pw implements SurfaceTexture.OnFrameAvailableListener {
    public static C41843B2y A0E = new C378469Px();
    public int A00;
    public Handler A01 = new Handler();
    public C379139Sq A02;
    public C359318cb A03;
    public C41838B2t A04;
    public C41843B2y A05;
    public AnonymousClass9T2 A06;
    public C39888ADk A07;
    public ClipInfo A08;
    public AnonymousClass3Q2 A09;
    public Set A0A;
    public boolean A0B = true;
    public final Object A0C = new Object();
    public volatile boolean A0D = false;

    public final int A07() {
        long j;
        if (this instanceof C378809Rh) {
            C378809Rh r3 = (C378809Rh) this;
            int i = -1;
            if (!r3.A0G) {
                Object obj = r3.A0C;
                0qQ.A06(obj);
                synchronized (obj) {
                    if (r3.A0D) {
                        AnonymousClass4MM r0 = r3.A04;
                        if (r0 != null) {
                            i = r0.getCurrentPosition();
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                }
                return i;
            } else if (!r3.A0D) {
                return -1;
            } else {
                AnonymousClass4MM r02 = r3.A04;
                if (r02 != null) {
                    return r02.getCurrentPosition();
                }
                throw AnonymousClass7TE.A0y();
            }
        } else {
            STU stu = ((C388789oO) this).A05;
            if (stu == null) {
                return 0;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            C13862Tii tii = stu.A04;
            if (tii != null) {
                j = tii.AuJ();
            } else {
                j = 0;
            }
            return (int) timeUnit.toMillis(j);
        }
    }

    public final AnonymousClass9T0 A08() {
        if (this instanceof C388789oO) {
            return ((C388789oO) this).A06;
        }
        return ((C378809Rh) this).A0E;
    }

    public final void A09() {
        if (this instanceof C378809Rh) {
            C378809Rh.A01((C378809Rh) this);
            return;
        }
        STU stu = ((C388789oO) this).A05;
        if (stu != null) {
            stu.A08(0.0f);
        }
    }

    public final void A0A() {
        AnonymousClass4MM r1;
        SlideInAndOutIconView slideInAndOutIconView;
        SlideInAndOutIconView slideInAndOutIconView2;
        if (this instanceof C388789oO) {
            C388789oO r0 = (C388789oO) this;
            STU stu = r0.A05;
            if (stu != null) {
                stu.A08(r0.A00);
                return;
            }
            return;
        }
        C378809Rh r5 = (C378809Rh) this;
        Object obj = r5.A0C;
        0qQ.A06(obj);
        synchronized (obj) {
            if (r5.A0D && (r1 = r5.A04) != null) {
                AnonymousClass3Q2 r3 = r5.A09;
                if (r3 == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (!r3.A5F) {
                    r5.A07 = true;
                    r1.Eqq(r5.A00);
                    C39888ADk aDk = r5.A07;
                    if (!(aDk == null || (slideInAndOutIconView2 = aDk.A05) == null)) {
                        C39888ADk.A00(slideInAndOutIconView2.getContext().getDrawable(R.drawable.soundon), aDk, C232822uV.A0B, (String) null);
                    }
                } else if (!r3.A5C || !AnonymousClass30D.A0K(r5.A0D, true, r3.A12())) {
                    C39888ADk aDk2 = r5.A07;
                    if (!(aDk2 == null || (slideInAndOutIconView = aDk2.A05) == null)) {
                        C39888ADk.A00(slideInAndOutIconView.getContext().getDrawable(R.drawable.soundoff), aDk2, C232822uV.A07, aDk2.A05.getResources().getString(2131968723));
                    }
                }
            }
        }
        if (!r5.A0A) {
            r5.A0A = true;
            0xa A0q = AnonymousClass7TE.A0q(r5.A0D);
            AnonymousClass7TG.A1M(A0q, "creation_audio_toggle_nux_countdown", A0q.getInt("creation_audio_toggle_nux_countdown", 25) - 1);
        }
    }

    public final void A0B() {
        if (this instanceof C388789oO) {
            throw AnonymousClass7TE.A1B(AnonymousClass000.A00(115));
        }
        C378809Rh r2 = (C378809Rh) this;
        r2.A05 = AnonymousClass05K.A01;
        ClipInfo clipInfo = r2.A08;
        if (clipInfo != null) {
            C378809Rh.A04(r2, clipInfo.A05, true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0C() {
        if (this instanceof C378809Rh) {
            C378809Rh r2 = (C378809Rh) this;
            r2.A05 = AnonymousClass05K.A01;
            C378809Rh.A04(r2, C378809Rh.A00(r2), true);
            return;
        }
        STU stu = ((C388789oO) this).A05;
        if (stu != null) {
            stu.A09(0);
        }
    }

    public final void A0D() {
        C39888ADk aDk;
        SlideInAndOutIconView slideInAndOutIconView;
        if (this instanceof C388789oO) {
            C388789oO r1 = (C388789oO) this;
            r1.A08 = true;
            STU stu = r1.A05;
            if (stu != null) {
                stu.A06();
                C41838B2t b2t = r1.A04;
                if (b2t != null) {
                    b2t.DyQ();
                    return;
                }
                return;
            }
            r1.A0A = false;
            return;
        }
        C378809Rh r4 = (C378809Rh) this;
        AnonymousClass4MM r12 = r4.A04;
        if (r12 != null) {
            r4.A09 = false;
            r4.A00 = 0;
            r12.start();
            r4.A05 = AnonymousClass05K.A00;
            if (!r4.A06 || r4.A07) {
                r12.Eqq(r4.A00);
            } else {
                r12.Eqq(0.0f);
                if (!(AnonymousClass7TE.A0q(r4.A0D).getInt("creation_audio_toggle_nux_countdown", 25) <= 0 || (aDk = r4.A07) == null || (slideInAndOutIconView = aDk.A05) == null)) {
                    C39888ADk.A00(slideInAndOutIconView.getContext().getDrawable(R.drawable.soundoff), aDk, C232822uV.A09, aDk.A05.getResources().getString(2131968710));
                }
            }
            C41838B2t b2t2 = r4.A04;
            if (b2t2 != null) {
                b2t2.DyQ();
            }
            AnonymousClass3Q2 r0 = r4.A09;
            if (r0 == null) {
                throw AnonymousClass7TE.A0y();
            } else if (r0.A5F) {
                C378809Rh.A01(r4);
            }
        }
    }

    public final void A0E() {
        View view;
        C39888ADk aDk = this.A07;
        if (aDk != null && (view = aDk.A00) != null) {
            view.clearAnimation();
            aDk.A00.setVisibility(4);
        }
    }

    public final void A0F() {
        C39888ADk aDk = this.A07;
        if (aDk != null) {
            SlideInAndOutIconView slideInAndOutIconView = aDk.A05;
            if (slideInAndOutIconView != null) {
                slideInAndOutIconView.A01();
            }
            AnonymousClass4UR r0 = aDk.A04;
            if (r0 != null) {
                r0.A01();
            }
        }
    }

    public final void A0G(float f) {
        if (this instanceof C388789oO) {
            C388789oO r1 = (C388789oO) this;
            STU stu = r1.A05;
            if (stu != null) {
                stu.A08(f);
            }
            r1.A00 = f;
            return;
        }
        C378809Rh r12 = (C378809Rh) this;
        AnonymousClass4MM r0 = r12.A04;
        if (r0 != null) {
            r12.A00 = f;
            r0.Eqq(f);
        }
    }

    public final void A0H(int i) {
        if (this instanceof C388789oO) {
            STU stu = ((C388789oO) this).A05;
            if (stu != null) {
                stu.A09(i);
                return;
            }
            return;
        }
        C378809Rh r1 = (C378809Rh) this;
        r1.A05 = AnonymousClass05K.A01;
        r1.A02 = i;
        AnonymousClass4MM r0 = r1.A04;
        if (r0 != null) {
            r0.seekTo(i);
        }
    }

    public final void A0I(int i, int i2) {
        STU stu;
        if ((this instanceof C388789oO) && (stu = ((C388789oO) this).A05) != null) {
            stu.A03 = i;
            stu.A02 = i2;
            C13862Tii tii = stu.A04;
            if (tii != null) {
                tii.Efv(new C266724aF(TimeUnit.MILLISECONDS, (long) i, (long) i2));
            }
        }
    }

    public void A0J(UserSession userSession, AnonymousClass3Q2 r5, int i) {
        this.A09 = r5;
        if (r5.A1N == null) {
            0f9 AEf = 0wj.A01.AEf("MediaDecoderManager", 817901174);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "mPendingMedia.getStitchedClipInfo() is null in com.instagram.creation.video.compat.MediaDecoderManager.setPendingMedia");
            AEf.ERJ(AnonymousClass7TE.A11("mPendingMedia.getStitchedClipInfo() is null com.instagram.creation.video.compat.MediaDecoderManager.setPendingMedia"));
            AEf.report();
        }
        this.A08 = this.A09.A1N;
        this.A00 = i;
    }

    public final void A0K(boolean z) {
        if (this instanceof C388789oO) {
            ((C388789oO) this).A07 = z;
        } else {
            ((C378809Rh) this).A06 = z;
        }
    }

    public final void A0L(boolean z) {
        if (this instanceof C388789oO) {
            C388789oO r0 = (C388789oO) this;
            r0.A0B = z;
            STU stu = r0.A05;
            if (stu != null) {
                stu.A09 = z;
                C13862Tii tii = stu.A04;
                if (tii != null) {
                    tii.Eka(z);
                    return;
                }
                return;
            }
            return;
        }
        this.A0B = z;
    }

    public final void A0M(boolean z) {
        if (this instanceof C378809Rh) {
            C378809Rh r1 = (C378809Rh) this;
            AnonymousClass4MM r0 = r1.A04;
            if (r0 != null && r0.A09.A0I.A0J()) {
                AnonymousClass4MM r02 = r1.A04;
                if (r02 != null) {
                    r02.pause();
                }
                if (r1.A06) {
                    r1.A0F();
                }
                C378809Rh.A05(r1, z);
                r1.A0E();
                return;
            }
            return;
        }
        C388789oO r2 = (C388789oO) this;
        r2.A08 = false;
        STU stu = r2.A05;
        if (stu != null) {
            stu.A05();
            if (z) {
                stu.A09(0);
            }
            r2.A0A = false;
        }
        C41838B2t b2t = r2.A04;
        if (b2t != null) {
            b2t.DyY();
        }
    }

    public final boolean A0N() {
        C13862Tii tii;
        boolean z;
        if (this instanceof C378809Rh) {
            C378809Rh r2 = (C378809Rh) this;
            Object obj = r2.A0C;
            0qQ.A06(obj);
            synchronized (obj) {
                if (!r2.A0D) {
                    z = false;
                } else {
                    AnonymousClass4MM r0 = r2.A04;
                    if (r0 != null) {
                        z = r0.A09.A0I.A0J();
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            return z;
        }
        STU stu = ((C388789oO) this).A05;
        if (stu == null || (tii = stu.A04) == null) {
            return false;
        }
        return tii.isPlaying();
    }

    public final boolean A0O() {
        boolean z;
        View view;
        if (this instanceof C388789oO) {
            C388789oO r1 = (C388789oO) this;
            STU stu = r1.A05;
            z = true;
            if (stu == null) {
                return false;
            }
            C13862Tii tii = stu.A04;
            if ((tii != null && tii.isPlaying()) || r1.A0A) {
                return false;
            }
            r1.A0A = true;
            r1.A0D();
        } else {
            C378809Rh r2 = (C378809Rh) this;
            if (!r2.A09) {
                return false;
            }
            z = true;
            if (r2.A08) {
                r2.A0D();
                C39888ADk aDk = r2.A07;
                if (!(aDk == null || (view = aDk.A00) == null || view.getVisibility() != 0)) {
                    aDk.A00.clearAnimation();
                    View view2 = aDk.A00;
                    Animation animation = aDk.A03;
                    animation.getClass();
                    view2.startAnimation(animation);
                    return true;
                }
            } else {
                C39888ADk aDk2 = r2.A07;
                if (aDk2 != null) {
                    AnonymousClass7TF.A16(aDk2.A01);
                }
                r2.A0E();
                if (r2.A02 < 0) {
                    r2.A05 = AnonymousClass05K.A0C;
                    C378809Rh.A04(r2, C378809Rh.A00(r2), false);
                }
                r2.A0C = true;
                return true;
            }
        }
        return z;
    }

    public C378459Pw(UserSession userSession, C41843B2y b2y, C39888ADk aDk) {
        Set A1F;
        this.A07 = aDk;
        this.A05 = b2y;
        if (182.A06(0Tu.A05, userSession, 36319424571252116L)) {
            A1F = new CopyOnWriteArraySet();
        } else {
            A1F = AnonymousClass7TE.A1F();
        }
        this.A0A = A1F;
    }
}
