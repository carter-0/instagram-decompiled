package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.DisplayMetrics;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.lang.ref.WeakReference;

/* renamed from: X.2l3  reason: invalid class name */
public final class AnonymousClass2l3 extends AnonymousClass1GX implements C228242l4, AnonymousClass1MK, C228252l5 {
    public static final 18q A0R = 18m.A00("feed_story_failed");
    public static final 18q A0S = 18m.A00("feed_failed");
    public static final 18q A0T = 18m.A00("media_loading_failed");
    public static final 18q A0U = 18m.A00("media_timeout");
    public static final 18q A0V = 18m.A00("story_failed");
    public static final 18q A0W = 18m.A00("unknown");
    public 0rq A00;
    public Boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Handler A0B = new Handler();
    public final Handler A0C = new Handler(Looper.getMainLooper());
    public final MessageQueue A0D;
    public final 1wn A0E;
    public final UserSession A0F;
    public final C228162kt A0G;
    public final 1Gs A0H;
    public final 18g A0I;
    public final Runnable A0J;
    public final Runnable A0K;
    public final String A0L;
    public final WeakReference A0M;
    public final boolean A0N;
    public volatile Integer A0O;
    public volatile Integer A0P;
    public volatile boolean A0Q;

    public final synchronized void A03() {
        if (this.A0N && this.A0O == AnonymousClass05K.A00) {
            1Gu r4 = this.A0H.A02;
            1H1 r1 = r4.A02;
            r1.A05("FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_SKIPPED", (Long) null);
            SubspanMutableStateFlow A002 = r1.A00();
            1Gx r2 = 1Gx.A06;
            A002.A00(r2);
            AnonymousClass1H2 r12 = r4.A01;
            r12.A05("NETWORK_FEED_UI_RENDER_SKIPPED", (Long) null);
            r12.A00().A00(r2);
            this.A0O = AnonymousClass05K.A0Y;
        }
    }

    public final synchronized void A04(C257183wz r8, String str, String str2, boolean z) {
        this.A0B.removeCallbacks(this.A0K);
        if (z) {
            boolean z2 = this.A02;
            this.A02 = false;
            if (z2) {
                if (182.A06(0Tu.A05, this.A0F, 36324071727181551L)) {
                    1Gs r0 = this.A0H;
                    1Gu r5 = r0.A02;
                    AnonymousClass1H2 r2 = r5.A01;
                    AnonymousClass1H4 r4 = r0.A01;
                    AnonymousClass1H7 r02 = r4.A00;
                    0qQ.A0B(r02, 0);
                    r2.A04(new SubspanMutableStateFlow(r02.A00()));
                    1H1 r22 = r5.A02;
                    AnonymousClass1H6 r03 = r4.A01;
                    0qQ.A0B(r03, 0);
                    r22.A04(new SubspanMutableStateFlow(r03.A00()));
                    r5.A03.A04(new SubspanMutableStateFlow(r4.A00()));
                    r5.A02();
                }
            }
            this.A0I.A0A = true;
            1H1 r23 = this.A0H.A02.A02;
            r23.A05("FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_END", (Long) null);
            r23.A00().A00(1Gx.A08);
            if (str != null) {
                18g.A05(this.A00, "first_media_network_content_image_load_source", str);
            }
            if (r8 != null) {
                18g.A05(this.A00, "first_media_network_content_video_cache_type", r8.name());
            }
            if (this.A0O == AnonymousClass05K.A0C) {
                this.A0O = AnonymousClass05K.A0j;
            } else if (this.A0O == AnonymousClass05K.A1F) {
                this.A0O = AnonymousClass05K.A1I;
            } else {
                this.A03 = true;
            }
        } else {
            1Gs r04 = this.A0H;
            if (str2 == null) {
                str2 = "unknown";
            }
            r04.A02.A02.A06(str2, (Long) null);
        }
        A01(this);
    }

    public final void AJE(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        0qQ.A0B(lightweightQuickPerformanceLogger, 0);
        if (this.A08) {
            this.A00.A01(lightweightQuickPerformanceLogger);
        }
    }

    public final synchronized void CyF(C226952iF r2, AnonymousClass3LX r3) {
        A02(this, "FIRST_MEDIA_LOAD_END");
    }

    public final synchronized void DJx(C226952iF r4, C254673sr r5) {
        A02(this, "FIRST_MEDIA_LOAD_FAILED");
        if (!this.A06) {
            this.A0B.removeCallbacks(this.A0K);
            this.A0O = AnonymousClass05K.A0u;
            this.A0H.A02.A02.A06("image_error", (Long) null);
            A01(this);
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public /* synthetic */ AnonymousClass2l3(Context context, MessageQueue messageQueue, UserSession userSession, C228162kt r7, C228262l7 r8, 18g r9, String str) {
        0rq r1 = new 0rq();
        0qQ.A0B(r9, 3);
        0qQ.A0B(str, 4);
        0qQ.A0B(r7, 5);
        this.A0A = context;
        this.A0F = userSession;
        this.A0I = r9;
        this.A0L = str;
        this.A0G = r7;
        this.A0D = messageQueue;
        this.A00 = r1;
        this.A0N = 182.A06(0Tu.A05, userSession, 36324071727312625L);
        this.A0K = new AnonymousClass2l9(this);
        this.A0J = new C228272lA(this);
        this.A0E = new AnonymousClass2lB(this);
        this.A0M = new WeakReference(r8);
        this.A0H = (1Gs) r9.A0G.getValue();
        Integer num = AnonymousClass05K.A00;
        this.A0O = num;
        this.A0P = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A0F, 36317620688721291L) != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r5.A0P == X.AnonymousClass05K.A1F) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.18q A00() {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.A0O
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            if (r0 != r4) goto L_0x000f
            java.lang.Integer r1 = r5.A0P
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r1 != r0) goto L_0x000f
        L_0x000c:
            X.18q r0 = X.18q.A03
            return r0
        L_0x000f:
            java.lang.Integer r1 = r5.A0O
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            if (r1 != r0) goto L_0x0038
            java.lang.Boolean r1 = r5.A01
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0031
            com.instagram.common.session.UserSession r3 = r5.A0F
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317620688721291(0x8106af003d158b, double:3.030747790643318E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0038
        L_0x0031:
            java.lang.Integer r1 = r5.A0P
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r1 != r0) goto L_0x0038
            goto L_0x000c
        L_0x0038:
            java.lang.Integer r0 = r5.A0O
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            if (r0 != r1) goto L_0x0043
            java.lang.Integer r0 = r5.A0P
            if (r0 != r1) goto L_0x0043
            goto L_0x000c
        L_0x0043:
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x0050
            java.lang.Integer r0 = r5.A0O
            if (r0 != r4) goto L_0x0050
            java.lang.Integer r0 = r5.A0P
            if (r0 != r1) goto L_0x0050
            goto L_0x000c
        L_0x0050:
            java.lang.Integer r1 = r5.A0O
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 != r0) goto L_0x0059
            X.18q r0 = A0T
            return r0
        L_0x0059:
            java.lang.Integer r0 = r5.A0O
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r0 == r2) goto L_0x0066
            java.lang.Integer r0 = r5.A0P
            if (r0 != r2) goto L_0x0066
            X.18q r0 = A0V
            return r0
        L_0x0066:
            java.lang.Integer r1 = r5.A0O
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r1 != r0) goto L_0x006f
            X.18q r0 = A0U
            return r0
        L_0x006f:
            java.lang.Integer r0 = r5.A0O
            if (r0 != r2) goto L_0x007a
            java.lang.Integer r0 = r5.A0P
            if (r0 == r2) goto L_0x007a
            X.18q r0 = A0S
            return r0
        L_0x007a:
            java.lang.Integer r0 = r5.A0O
            if (r0 != r2) goto L_0x0085
            java.lang.Integer r0 = r5.A0P
            if (r0 != r2) goto L_0x0085
            X.18q r0 = A0R
            return r0
        L_0x0085:
            X.18q r0 = A0W
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2l3.A00():X.18q");
    }

    public static final void A01(AnonymousClass2l3 r4) {
        boolean z;
        if (r4.A0O != AnonymousClass05K.A02 ? r4.A0O == AnonymousClass05K.A0N || r4.A0O == AnonymousClass05K.A1I || r4.A0O == AnonymousClass05K.A0u || r4.A0O == AnonymousClass05K.A15 || r4.A0O == AnonymousClass05K.A0Y : r4.A01 != null) {
            if (!(r4.A0P == AnonymousClass05K.A00 || r4.A0P == AnonymousClass05K.A0C || r4.A0P == AnonymousClass05K.A01)) {
                z = true;
                CallerContext callerContext = 2Lk.A08;
                2Lk.A02(2Lo.A00(r4.A0A, r4.A0F), !r4.A00().A01);
                if (!r4.A09 && z) {
                    r4.A0I.A0L(r4.A00, r4.A00(), (Long) null);
                    UserSession userSession = r4.A0F;
                    2I1 A002 = 2Hz.A00(userSession);
                    if (A002 != null) {
                        A002.A04("main_feed_request_end");
                    }
                    IGFOAMessagingReadyLogger A003 = 2Hi.A00(userSession);
                    if (A003 != null) {
                        A003.onLogMainFeedRequestEnd();
                    }
                    C228262l7 r42 = (C228262l7) r4.A0M.get();
                    if (r42 != null) {
                        if (!182.A06(0Tu.A05, r42.A00, 36324071725805280L)) {
                            r42.A02.invoke(r42.A01, AnonymousClass3PG.NETWORK, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (!r4.A09) {
        }
    }

    public static final void A02(AnonymousClass2l3 r2, String str) {
        r2.A0I.A0M(r2.A00, r2, str);
    }

    public final void A05(boolean z, String str) {
        if (z) {
            this.A0P = AnonymousClass05K.A0C;
            1H8 r3 = this.A0H.A04;
            AnonymousClass1H9 r2 = r3.A01;
            r2.A01.A02("STORIES_REQUEST_SUCCEEDED");
            r2.A00().A00(1Gx.A08);
            AnonymousClass1HB r22 = r3.A02;
            r22.A01.A02("NETWORK_STORIES_TRAY_UI_RENDER_START");
            r22.A00().A00(1Gx.A07);
            this.A0D.addIdleHandler(new C241413Pc(this));
            return;
        }
        this.A0P = AnonymousClass05K.A0N;
        1H8 r32 = this.A0H.A04;
        AnonymousClass1H9 r23 = r32.A01;
        r23.A01.A02("STORIES_REQUEST_FAILED");
        r23.A00().A00(1Gx.A03);
        AnonymousClass1HB r24 = r32.A02;
        r24.A01.A02("NETWORK_STORIES_TRAY_UI_RENDER_SKIPPED");
        r24.A00().A00(1Gx.A06);
        if (str != null) {
            18g.A05(this.A00, "stories_request_error", str);
        }
        A01(this);
    }

    public final void CwG(boolean z) {
        this.A08 = z;
        if (!z) {
            this.A00.A01(1Gq.A00(this.A0I.A0C()));
        } else {
            this.A00 = new 0rq();
            this.A09 = false;
        }
        1xC.A01.A02(this.A0E, 1xG.class);
        this.A0G.EBt(this);
    }

    public final void D8V() {
        1xC.A01.A03(this.A0E, 1xG.class);
        this.A0G.FJ2(this);
        if (this.A08) {
            this.A00.A00();
            this.A09 = true;
        }
    }

    public final void E5B(float f, float f2) {
        if (f2 >= 1.0f && !this.A04) {
            A02(this, "FEED_PULL_TO_REFRESH");
            this.A04 = true;
        }
    }

    public final String getDestination() {
        return this.A0L;
    }

    public final void onScroll(C238133Ar r5, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0fD.A03(305418996);
        if (i > 0) {
            A02(this, "FEED_SCROLL_DOWN");
            DisplayMetrics displayMetrics = this.A0A.getResources().getDisplayMetrics();
            0qQ.A07(displayMetrics);
            RectF rectF = 0nA.A01;
            18g.A05(this.A00, "feed_scroll_down_distance", String.valueOf(((float) i5) / displayMetrics.density));
            this.A0G.FJ2(this);
        }
        AnonymousClass0fD.A0A(15423450, A032);
    }
}
