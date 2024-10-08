package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7JI  reason: invalid class name */
public final class AnonymousClass7JI extends GestureDetector.SimpleOnGestureListener implements AnonymousClass7JJ {
    public int A00;
    public int A01;
    public long A02;
    public RectF A03;
    public RectF A04;
    public RectF A05;
    public GestureDetector A06;
    public View A07;
    public View A08;
    public Chronometer A09;
    public ImageView A0A;
    public ImageView A0B;
    public TextView A0C;
    public VoiceVisualizer A0D;
    public Integer A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public AnonymousClass0eM A0J;
    public final int A0K;
    public final Context A0L;
    public final Handler A0M = new Handler(Looper.getMainLooper());
    public final View.OnClickListener A0N;
    public final UserSession A0O;
    public final AnonymousClass7JO A0P;
    public final AnonymousClass7JG A0Q;
    public final AnonymousClass7JE A0R;
    public final AnonymousClass7GP A0S;
    public final C301265yp A0T;
    public final Integer A0U;
    public final AnonymousClass0eM A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final float A0Z;
    public final View.OnTouchListener A0a;
    public final C254783t2 A0b;
    public final Runnable A0c;

    public static final void A0A(AnonymousClass7JI r11, C63822L8d l8d) {
        boolean z;
        boolean z2 = false;
        Long l = null;
        String str = null;
        r11.A0Q.EN6(l8d, r11.A0F);
        AnonymousClass7GP r10 = r11.A0S;
        long seconds = TimeUnit.MILLISECONDS.toSeconds((long) l8d.A00);
        C254783t2 r3 = r11.A0b;
        if (r3 == null) {
            z = false;
        } else {
            str = AnonymousClass4KK.A02(r3);
            l = AnonymousClass4KK.A01(r3);
            z2 = r3 instanceof AnonymousClass9HR;
            z = true;
        }
        0wc r5 = r10.A00;
        1Ln r52 = new 1Ln(r5.A00(r5.A00, "audio_clips_send"), 4);
        if (r52.A00.isSampled()) {
            r52.A0Q(TraceFieldType.Duration, Long.valueOf(seconds));
            r52.A0O("with_captions", false);
            if (z) {
                r52.A0R("open_thread_id", str);
                r52.A0Q("occamadillo_thread_id", l);
                r52.A0O("is_e2ee", Boolean.valueOf(z2));
            }
            r52.A0O("has_avatar", false);
            r52.Cgf();
        }
    }

    public final void Dc1(boolean z) {
        Integer num;
        if (z) {
            AnonymousClass7JE r3 = this.A0R;
            r3.A05.A03(0);
            A06(this);
            Chronometer chronometer = this.A09;
            if (chronometer != null) {
                chronometer.setBase(SystemClock.elapsedRealtime());
            }
            Chronometer chronometer2 = this.A09;
            if (chronometer2 != null) {
                chronometer2.start();
            }
            this.A0Q.Dzo(this.A0H);
            if (this.A0H) {
                num = AnonymousClass05K.A0C;
            } else {
                num = AnonymousClass05K.A0Y;
            }
            boolean z2 = false;
            if (this.A0E != num) {
                z2 = true;
                this.A0E = num;
            }
            A04(this);
            if (z2 && (r3.A04.A00 != null || this.A0W)) {
                A08(this);
            }
            if (!this.A0H) {
                TextView textView = this.A0C;
                if (textView != null) {
                    textView.setText(2131960733);
                }
                A07(this);
                Chronometer chronometer3 = this.A09;
                if (chronometer3 != null) {
                    chronometer3.setKeepScreenOn(true);
                    return;
                }
                return;
            }
            return;
        }
        C59689JTv.A01(this.A0L, "direct_voice_failed_to_start", 2131960715, 0);
        this.A0E = AnonymousClass05K.A01;
    }

    public static final View A00(AnonymousClass7JI r1) {
        View view = r1.A0R.A00;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final AnonymousClass7OK A01(AnonymousClass7JI r1) {
        AnonymousClass0eM r0 = r1.A0J;
        if (r0 != null) {
            return (AnonymousClass7OK) r0.getValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02() {
        View view;
        if (!this.A0W && (view = this.A0R.A01) != null) {
            C294975nL A012 = C294975nL.A01(view, 0);
            A012.A0G();
            A012.A04 = 0;
            A012.A0K((float) (-this.A0L.getResources().getDimensionPixelOffset(R.dimen.activation_card_icon_container_width)));
            A012.A05 = new PQM(view, this);
            A012.A0H();
        }
    }

    public static final void A04(AnonymousClass7JI r12) {
        View view;
        float f;
        float x;
        View view2;
        RectF rectF = r12.A05;
        if (rectF != null && (view = r12.A08) != null) {
            A01(r12);
            Integer num = AnonymousClass05K.A00;
            C294975nL A012 = C294975nL.A01(view, 0);
            A012.A0G();
            A012.A0U(0.0f, 1.0f, rectF.centerX() / 2.0f);
            A012.A0V(0.9f, 1.0f, (float) (view.getHeight() / 2));
            A012.A0F(true).A0H();
            ImageView imageView = r12.A0B;
            if (imageView != null) {
                C294975nL A013 = C294975nL.A01(imageView, 0);
                A013.A0G();
                A013.A0U(0.0f, 1.0f, -1.0f);
                A013.A0V(0.0f, 1.0f, -1.0f);
                A013.A0F(true).A0H();
                if (r12.A0U == num && (view2 = r12.A07) != null) {
                    view2.setAlpha(1.0f);
                }
                if (r12.A0E == AnonymousClass05K.A0C) {
                    AnonymousClass7JE r4 = r12.A0R;
                    View A014 = r4.A04.A01();
                    0qQ.A07(A014);
                    boolean z = r12.A0W;
                    if (z) {
                        f = A00(r12).getY();
                    } else {
                        f = (float) r12.A01;
                    }
                    A014.setY(f);
                    if (z) {
                        x = ((float) 0nA.A09(r12.A0L)) / 2.0f;
                    } else {
                        x = A00(r12).getX();
                    }
                    A014.setX(x);
                    C294975nL A015 = C294975nL.A01(A014, 0);
                    A015.A0G();
                    A015.A04 = 0;
                    A015.A0V(0.0f, 0.8f, -1.0f);
                    A015.A0U(0.0f, 0.8f, -1.0f);
                    A015.A0H();
                    if (!r12.A0Y) {
                        return;
                    }
                    if (r4.A01 != null) {
                        r12.A02();
                        return;
                    }
                    TextView textView = r12.A0C;
                    if (textView != null) {
                        textView.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A05(AnonymousClass7JI r5) {
        Integer num;
        C69475NmJ nmJ;
        if (r5.A0E != AnonymousClass05K.A0j && r5.A0R.A02.getVisibility() == 0) {
            1X9 A002 = AnonymousClass38W.A00();
            UserSession userSession = r5.A0O;
            Context context = r5.A0L;
            if (A002.A02(context, userSession)) {
                C59689JTv.A07(context, 2131960725);
                return;
            }
            String A003 = AnonymousClass000.A00(1089);
            if (1DL.A07(context, A003)) {
                AnonymousClass7GP r2 = r5.A0S;
                if (r5.A0H) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A0C;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    nmJ = C69475NmJ.LONG_CLICK;
                } else if (intValue != 1) {
                    nmJ = C69475NmJ.CLICK;
                } else {
                    nmJ = C69475NmJ.LOCK;
                }
                0wc r22 = r2.A00;
                0Aj A004 = r22.A00(r22.A00, "audio_clips_start_recording_click");
                if (A004.isSampled()) {
                    A004.A8M(nmJ, "source_click_category");
                    A004.Cgf();
                }
                ((C74493Pvn) r5.A0V.getValue()).Cng();
                return;
            }
            Class<Activity> cls = Activity.class;
            Object A005 = 0mE.A00(context, cls);
            if (A005 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (1DL.A05((Activity) A005, A003)) {
                C358248ab r23 = new C358248ab(context);
                r23.A09(2131960728);
                r23.A08(2131960726);
                r23.A0I(new LU4(r5), 2131960727);
                r23.A0H(C71239Og4.A00, 2131968513);
                AnonymousClass0fN.A00(r23.A02());
            } else {
                Object A006 = 0mE.A00(context, cls);
                if (A006 != null) {
                    1DL.A04((Activity) A006, new C64726Lh3(r5), new String[]{A003});
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public static final void A07(AnonymousClass7JI r3) {
        View view = r3.A08;
        if (view != null) {
            view.setOnTouchListener(r3.A0a);
        }
        ImageView imageView = r3.A0A;
        if (imageView != null) {
            C294975nL A012 = C294975nL.A01(imageView, 0);
            A012.A0G();
            A012.A04 = 0;
            A012.A0U(0.0f, 1.0f, -1.0f);
            A012.A0V(0.0f, 1.0f, -1.0f);
            A012.A0H();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A08(AnonymousClass7JI r5) {
        C294975nL r1;
        float f;
        C71662eb r2 = r5.A0R.A04;
        View A012 = r2.A01();
        0qQ.A07(A012);
        ImageView imageView = (ImageView) A012;
        AnonymousClass7OK A013 = A01(r5);
        switch (r5.A0E.intValue()) {
            case 0:
            case 1:
            case 5:
                break;
            case 2:
                imageView.setImageResource(R.drawable.direct_voice_lock_unlocked);
                imageView.setBackground(A013.A06);
                imageView.setColorFilter(A013.A03);
                TextView textView = r5.A0C;
                if (textView != null) {
                    int i = 2131960731;
                    if (r5.A0X) {
                        i = 2131960732;
                    }
                    textView.setText(i);
                }
                r1 = C294975nL.A01(imageView, 0);
                r1.A0G();
                r1.A04 = 0;
                f = 0.8f;
                break;
            case 3:
                imageView.setImageResource(R.drawable.direct_voice_lock_locked);
                imageView.setBackground(A013.A05);
                imageView.setColorFilter(A013.A01);
                TextView textView2 = r5.A0C;
                if (textView2 != null) {
                    textView2.setText(2131960730);
                }
                r1 = C294975nL.A01(imageView, 0);
                r1.A0G();
                r1.A04 = 0;
                f = 1.0f;
                break;
            case 4:
                r2.A02();
                break;
            default:
                throw new RuntimeException();
        }
        r1.A0P(f, -1.0f);
        r1.A0Q(f, -1.0f);
        r1.A0H();
        TextView textView3 = r5.A0C;
        if (textView3 != null) {
            textView3.announceForAccessibility(textView3.getText());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(X.AnonymousClass7JI r7, X.C63822L8d r8) {
        /*
            android.widget.Chronometer r4 = r7.A09
            if (r4 == 0) goto L_0x0094
            java.util.List r0 = r8.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0094
            long r2 = r7.A02
            long r0 = r4.getBase()
            long r2 = r2 - r0
            int r1 = (int) r2
            r0 = 750(0x2ee, float:1.051E-42)
            if (r1 < r0) goto L_0x0095
            r8.A00 = r1
            boolean r0 = r7.A0H
            if (r0 != 0) goto L_0x0090
            X.7JO r6 = r7.A0P
            if (r6 == 0) goto L_0x0090
            X.5yp r0 = r7.A0T
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323642229075290(0x810c2900032d5a, double:3.0345558370099836E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0090
            android.content.Context r1 = r7.A0L
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r5 = X.0mE.A00(r1, r0)
            if (r5 == 0) goto L_0x0119
            android.app.Activity r5 = (android.app.Activity) r5
            X.7JE r0 = r7.A0R
            android.widget.FrameLayout r0 = r0.A03
            if (r0 == 0) goto L_0x008e
            int r4 = r0.getTop()
        L_0x0049:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r6.A05 = r0
            int r0 = r8.A00
            r6.A01 = r0
            r6.A04 = r8
            X.NIm r3 = new X.NIm
            r3.<init>()
            r6.A03 = r3
            com.instagram.common.session.UserSession r2 = r6.A07
            X.5yp r1 = r6.A0B
            r0 = 1
            X.0qQ.A0B(r1, r0)
            r3.A01 = r2
            r3.A03 = r1
            r3.A00 = r4
            r3.A02 = r6
            X.7Pu r1 = r6.A0C
            X.NIm r0 = r6.A03
            if (r0 == 0) goto L_0x0111
            r1.A02(r5, r0)
            X.7GP r0 = r6.A0A
            X.0wc r2 = r0.A00
            java.lang.String r1 = "audio_clips_recording_preview_open"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x008a
            r1.Cgf()
        L_0x008a:
            r0 = 0
            r7.A0F = r0
            return
        L_0x008e:
            r4 = 0
            goto L_0x0049
        L_0x0090:
            A0A(r7, r8)
            goto L_0x008a
        L_0x0094:
            r1 = 0
        L_0x0095:
            java.lang.String r2 = r8.A01
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r0.delete()
            if (r1 != 0) goto L_0x008a
            if (r4 != 0) goto L_0x0103
            java.lang.String r2 = "chronometer not started"
        L_0x00a5:
            java.lang.String r1 = "Send recording failed because "
            r0 = 46
            java.lang.String r5 = X.002.A0S(r1, r2, r0)
            X.0eM r1 = r7.A0V
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r0 instanceof X.C40695AhF
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r4 = r1.getValue()
            X.Pvn r4 = (X.C74493Pvn) r4
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.voice.common.IGDOneCameraVoiceRecorder"
            X.0qQ.A0C(r4, r0)
            X.AhF r4 = (X.C40695AhF) r4
            java.lang.String r3 = " RecordingController state: "
            X.7nI r0 = r4.A06
            X.7nG r0 = r0.A04
            java.lang.Integer r0 = r0.A04
            java.lang.String r2 = X.C378729Qz.A00(r0)
            java.lang.String r1 = " / AudioRecorder state: "
            X.Xss r0 = r4.A01
            if (r0 == 0) goto L_0x0101
            java.lang.Integer r0 = r0.A0F
            if (r0 == 0) goto L_0x0101
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x00fb;
                case 2: goto L_0x00fe;
                default: goto L_0x00e1;
            }
        L_0x00e1:
            java.lang.String r0 = "STOPPED"
        L_0x00e3:
            java.lang.String r0 = X.002.A0u(r3, r2, r1, r0)
            java.lang.String r5 = X.002.A0R(r5, r0)
        L_0x00eb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r5)
            X.7GP r0 = r7.A0S
            r0.A01(r1)
            X.7JG r0 = r7.A0Q
            r0.Dzm(r1)
            goto L_0x008a
        L_0x00fb:
            java.lang.String r0 = "PREPARED"
            goto L_0x00e3
        L_0x00fe:
            java.lang.String r0 = "STARTED"
            goto L_0x00e3
        L_0x0101:
            r0 = 0
            goto L_0x00e3
        L_0x0103:
            java.util.List r0 = r8.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x010e
            java.lang.String r2 = "empty waveForm"
            goto L_0x00a5
        L_0x010e:
            java.lang.String r2 = "chronometer reported 0ms duration"
            goto L_0x00a5
        L_0x0111:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0119:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JI.A09(X.7JI, X.L8d):void");
    }

    public static final void A0B(AnonymousClass7JI r7, boolean z, boolean z2) {
        TextView textView;
        Chronometer chronometer = r7.A09;
        if (chronometer != null) {
            int base = (int) (r7.A02 - chronometer.getBase());
            r7.A0Q.Dzn(z, base);
            AnonymousClass7JE r6 = r7.A0R;
            C71662eb r1 = r6.A05;
            if (r1.A00 != null) {
                VoiceVisualizer voiceVisualizer = r7.A0D;
                if (voiceVisualizer != null) {
                    voiceVisualizer.A0E.clear();
                    r1.A01().setVisibility(8);
                    boolean z3 = true;
                    if (!r7.A0Y || (textView = r7.A0C) == null || textView.getVisibility() != 0 || r7.A0U != AnonymousClass05K.A00) {
                        z3 = false;
                    }
                    A06(r7);
                    if (z3) {
                        View view = r6.A01;
                        if (view != null) {
                            view.setTranslationY((float) (-r7.A0L.getResources().getDimensionPixelOffset(R.dimen.activation_card_icon_container_width)));
                            C294975nL A012 = C294975nL.A01(view, 0);
                            A012.A0G();
                            A012.A04 = 0;
                            A012.A0K(0.0f);
                            A012.A05 = new PQE(r7);
                            A012.A0H();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            r7.A0G = false;
            Integer num = AnonymousClass05K.A00;
            if (r7.A0E != num) {
                r7.A0E = num;
            }
            Chronometer chronometer2 = r7.A09;
            if (chronometer2 != null) {
                chronometer2.setKeepScreenOn(false);
            }
            if (z) {
                if (base > 0 && !z2) {
                    AnonymousClass7GP r5 = r7.A0S;
                    long seconds = TimeUnit.MILLISECONDS.toSeconds((long) base);
                    0wc r2 = r5.A00;
                    0Aj A002 = r2.A00(r2.A00, "audio_clips_cancelled_by_user");
                    if (A002.isSampled()) {
                        A002.A9F(TraceFieldType.Duration, Long.valueOf(seconds));
                        A002.Cgf();
                    }
                }
                ((C74493Pvn) r7.A0V.getValue()).AHp();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r8 >= (r5.bottom - r1)) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0C(X.AnonymousClass7JI r6, float r7, float r8) {
        /*
            android.graphics.RectF r5 = r6.A03
            r4 = 0
            if (r5 == 0) goto L_0x0028
            boolean r0 = r6.A0X
            if (r0 == 0) goto L_0x0029
            float r0 = r5.left
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0030
        L_0x000f:
            r3 = 1
        L_0x0010:
            float r2 = r5.top
            int r0 = r6.A00
            float r1 = (float) r0
            float r2 = r2 - r1
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            float r0 = r5.bottom
            float r0 = r0 - r1
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r3 == 0) goto L_0x0028
            if (r0 == 0) goto L_0x0028
            r4 = 1
        L_0x0028:
            return r4
        L_0x0029:
            float r0 = r5.right
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            goto L_0x000f
        L_0x0030:
            r3 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JI.A0C(X.7JI, float, float):boolean");
    }

    public final void A0D() {
        AnonymousClass0eM r2 = this.A0V;
        if (((C74493Pvn) r2.getValue()).isRecording()) {
            this.A0Q.Dzp();
            ((C74493Pvn) r2.getValue()).EyI(true);
            return;
        }
        A0B(this, true, false);
    }

    public final void A0E() {
        ((C74493Pvn) this.A0V.getValue()).release();
    }

    public final void A0F() {
        ImageView imageView = this.A0B;
        if (imageView != null) {
            RectF A0F2 = 0nA.A0F(imageView);
            A0F2.offset(0.0f, (float) this.A00);
            RectF rectF = new RectF(A0F2);
            float f = -this.A0Z;
            rectF.inset(f, f);
            if (this.A0X) {
                rectF.left = A0F2.left - A0F2.width();
            } else {
                rectF.right = A0F2.right + A0F2.width();
            }
            View view = this.A08;
            if (view != null) {
                view.setPivotX(rectF.centerX() / 2.0f);
            }
            this.A05 = A0F2;
            this.A03 = rectF;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0G(AnonymousClass0eM r4) {
        this.A0J = r4;
        this.A01 = A01(this).A04;
        AnonymousClass7JE r2 = this.A0R;
        r2.A04.A02 = new AnonymousClass7OL(this);
        r2.A05.A02 = new AnonymousClass7OM(this);
    }

    public final void DCn(Exception exc) {
        this.A0Q.Dzm(exc);
        this.A0S.A01(exc);
        this.A02 = SystemClock.elapsedRealtime();
        Chronometer chronometer = this.A09;
        if (chronometer != null) {
            chronometer.stop();
        }
        A0B(this, true, true);
        this.A0E = AnonymousClass05K.A01;
    }

    public final void DPg() {
        Chronometer chronometer = this.A09;
        if (chronometer != null) {
            chronometer.setBase(SystemClock.elapsedRealtime() - ((long) this.A0K));
        }
        this.A0R.A04.A02();
        this.A0M.postDelayed(C57990Ijj.A00, 215);
        TextView textView = this.A0C;
        if (textView != null) {
            textView.setText(2131960716);
        }
        this.A02 = SystemClock.elapsedRealtime();
        Chronometer chronometer2 = this.A09;
        if (chronometer2 != null) {
            chronometer2.stop();
        }
        if (this.A0E == AnonymousClass05K.A0Y) {
            A02();
        }
        TextView textView2 = this.A0C;
        if (textView2 != null) {
            textView2.announceForAccessibility(textView2.getText());
        }
        A07(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r4 == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dc3() {
        /*
            r5 = this;
            X.7JG r0 = r5.A0Q
            r0.Dzq()
            X.0eM r0 = r5.A0V
            java.lang.Object r0 = r0.getValue()
            X.Pvn r0 = (X.C74493Pvn) r0
            X.L8d r4 = r0.AuR()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A02 = r0
            android.widget.Chronometer r0 = r5.A09
            if (r0 == 0) goto L_0x001e
            r0.stop()
        L_0x001e:
            boolean r0 = r5.A0G
            if (r0 != 0) goto L_0x0027
            if (r4 == 0) goto L_0x0027
            A09(r5, r4)
        L_0x0027:
            android.widget.Chronometer r1 = r5.A09
            boolean r0 = r5.A0G
            if (r0 != 0) goto L_0x003e
            if (r1 == 0) goto L_0x003e
            long r2 = r5.A02
            long r0 = r1.getBase()
            long r2 = r2 - r0
            int r1 = (int) r2
            r0 = 750(0x2ee, float:1.051E-42)
            if (r1 < r0) goto L_0x003e
            r1 = 0
            if (r4 != 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            r0 = 0
            A0B(r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JI.Dc3():void");
    }

    public final void E0F(long j, double d) {
        VoiceVisualizer voiceVisualizer = this.A0D;
        if (voiceVisualizer != null) {
            voiceVisualizer.A02((float) d);
        }
    }

    public AnonymousClass7JI(Context context, UserSession userSession, C331037Pg r12, AnonymousClass7JG r13, AnonymousClass7JE r14, C254783t2 r15, boolean z, boolean z2) {
        long A012;
        AnonymousClass7JO r3;
        UserSession userSession2 = userSession;
        this.A0O = userSession;
        this.A0L = context;
        this.A0Y = z;
        this.A0b = r15;
        this.A0R = r14;
        this.A0Q = r13;
        this.A0W = z2;
        this.A0X = 0mk.A02(context);
        this.A0N = new AnonymousClass7JK(this);
        this.A0a = new AnonymousClass7JL(this);
        this.A0c = new AnonymousClass7JM(this);
        C301265yp r8 = new C301265yp(userSession);
        this.A0T = r8;
        if (AnonymousClass1A9.A00()) {
            A012 = 3000;
        } else {
            A012 = 182.A01(0Tu.A05, r8.A00, 36605117206107323L);
        }
        this.A0K = (int) A012;
        this.A0V = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LI(this, 14));
        Integer num = AnonymousClass05K.A00;
        this.A0E = num;
        AnonymousClass7GP r7 = new AnonymousClass7GP(userSession);
        this.A0S = r7;
        this.A0U = r14.A01 == null ? AnonymousClass05K.A01 : num;
        this.A0Z = 0nA.A04(context, 16);
        C331037Pg r5 = r12;
        if (r12 != null) {
            r3 = new AnonymousClass7JO(userSession2, r5, new AnonymousClass7JN(this), r7, r8);
        } else {
            r3 = null;
        }
        this.A0P = r3;
    }

    public static final void A03(IgSimpleImageView igSimpleImageView, AnonymousClass7JI r3) {
        RectF A0F2 = 0nA.A0F(igSimpleImageView);
        r3.A04 = A0F2;
        float f = -r3.A0Z;
        A0F2.inset(f, f);
        RectF rectF = r3.A04;
        if (rectF != null) {
            rectF.offset(0.0f, (float) r3.A00);
        }
    }

    public static final void A06(AnonymousClass7JI r5) {
        View view;
        AnonymousClass7OK A012 = A01(r5);
        ImageView imageView = r5.A0B;
        if (imageView != null) {
            imageView.setBackground(A012.A07);
            imageView.setColorFilter(AnonymousClass37O.A00(A012.A03));
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            imageView.setRotation(0.0f);
        }
        View view2 = r5.A08;
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view2.getLayoutParams());
            layoutParams.setMargins(0, 0, 0, 0);
            view2.setLayoutParams(layoutParams);
            view2.setOnClickListener((View.OnClickListener) null);
        }
        if (r5.A0U == AnonymousClass05K.A00 && (view = r5.A07) != null) {
            view.setAlpha(1.0f);
        }
        TextView textView = r5.A0C;
        if (textView != null) {
            int i = 2131960731;
            if (r5.A0X) {
                i = 2131960732;
            }
            textView.setText(i);
        }
        TextView textView2 = r5.A0C;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ImageView imageView2 = r5.A0A;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            AnonymousClass7JE r1 = r5.A0R;
            View view3 = r1.A01;
            if (view3 != null) {
                view3.setTranslationY(0.0f);
            }
            r1.A04.A03(8);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean onDown(MotionEvent motionEvent) {
        A00(this).postDelayed(this.A0c, (long) ViewConfiguration.getLongPressTimeout());
        this.A0I = true;
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        A00(this).performClick();
        return true;
    }
}
