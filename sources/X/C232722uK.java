package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.2uK  reason: invalid class name and case insensitive filesystem */
public final class C232722uK extends AnonymousClass2uL implements AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public Toast A00;
    public C263744Ne A01;
    public C263744Ne A02;
    public C228232l0 A03;
    public C263784Ni A04;
    public AnonymousClass4M3 A05;
    public Integer A06;
    public Runnable A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Context A0H;
    public final Handler A0I;
    public final 1vq A0J;
    public final UserSession A0K;
    public final C232802uT A0L;
    public final Runnable A0M;
    public final String A0N;
    public final HashSet A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final AudioManager A0X;
    public final AnonymousClass4DU A0Y;
    public final C228412ld A0Z;
    public final 0rQ A0a;
    public final C232822uV A0b;
    public final C232822uV A0c;
    public final Runnable A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;

    public C232722uK(Context context, UserSession userSession, AnonymousClass4DU r15, C228412ld r16, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str2 = str;
        0qQ.A0B(str2, 11);
        this.A0H = context;
        UserSession userSession2 = userSession;
        this.A0K = userSession;
        AnonymousClass4DU r6 = r15;
        this.A0Y = r15;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (systemService != null) {
            AudioManager audioManager = (AudioManager) systemService;
            this.A0X = audioManager;
            this.A0Q = new CopyOnWriteArrayList();
            this.A0O = new HashSet();
            this.A0d = new C232742uN(this);
            this.A0M = new C232752uO(this);
            this.A06 = AnonymousClass05K.A00;
            r15.getModuleName();
            this.A0J = new 1vq(audioManager, userSession);
            this.A0e = z;
            this.A0U = true;
            this.A0P = new CopyOnWriteArrayList();
            this.A0R = new CopyOnWriteArrayList();
            this.A0g = z2;
            this.A0T = z3;
            this.A0a = new 0rQ(userSession);
            this.A0h = 2eO.A00(context);
            this.A0W = z4;
            this.A0E = z5;
            this.A0N = str2;
            0Tu r2 = 0Tu.A05;
            this.A0S = 182.A06(r2, userSession, 36312110242399128L);
            this.A0f = 182.A06(r2, userSession, 36312110242464665L);
            this.A0L = new C232802uT(userSession2, r6, str2, new C232762uP(this), new C232772uQ(this), new C232782uR(this), new C232792uS(this));
            C232812uU r4 = C232812uU.SLIDE_OUT;
            this.A0b = new C232822uV(r4, 0, 5000, false);
            this.A0c = new C232822uV(r4, 0, -1, false);
            this.A0Z = r16;
            this.A0I = new Handler(C64021Cb.A00());
            this.A0V = 182.A06(r2, userSession, 36323345876135011L);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A07(C232722uK r6, String str, boolean z, boolean z2) {
        C256043v8 B5X;
        boolean z3 = true;
        r6.A0B(true);
        AnonymousClass4M3 r5 = r6.A05;
        if (r5 != null) {
            r5.E2q(str, z);
            C263744Ne r4 = r6.A02;
            if (r4 != null) {
                AnonymousClass4M1 r52 = (AnonymousClass4M1) r5;
                if (r52.A0M == AnonymousClass3OB.PLAYING) {
                    AnonymousClass3V3 r2 = r4.A08;
                    if (r2 != null) {
                        AnonymousClass3TN B5Y = r2.B5Y();
                        if (B5Y != null) {
                            B5Y.setVisibility(0);
                        }
                        if (z2 && (B5X = r2.B5X()) != null) {
                            B5X.A02(R.drawable.instagram_play_pano_filled_24);
                        }
                    }
                    r4.A05 = r52.A03;
                    if (!C263734Nd.A00(r6.A0K, A00(r6), r6.A0H()) || !A0F(r6)) {
                        z3 = false;
                    }
                    if (z3 != r4.A00) {
                        r4.A01(z3);
                        A06(r6, -5, r4.A00);
                        1Xj A002 = A00(r6);
                        if (A002 != null) {
                            A03(A002, r6.A0H(), r6);
                        }
                    }
                }
            }
        }
    }

    public final void A0L() {
        FrameLayout A002;
        this.A07 = null;
        A0W(false);
        A0V(false);
        C263744Ne r0 = this.A02;
        if (r0 != null) {
            r0.A0C = false;
            AnonymousClass3V3 r02 = r0.A08;
            if (r02 != null) {
                r02.B5Y();
                AnonymousClass3TS Adf = r02.Adf();
                if (!(Adf == null || (A002 = Adf.A00()) == null)) {
                    A002.setOnClickListener((View.OnClickListener) null);
                }
            }
        }
        this.A01 = null;
        AnonymousClass4M3 r1 = this.A05;
        if (r1 != null) {
            r1.ECP("fragment_paused");
        }
        this.A05 = null;
    }

    public final void A0P(FrameLayout frameLayout, AnonymousClass3W1 r5) {
        AnonymousClass4Lc r0;
        0qQ.A0B(frameLayout, 0);
        if (A0X()) {
            r0 = AnonymousClass4Lc.SOUND_ON;
        } else {
            r0 = AnonymousClass4Lc.SOUND_OFF;
        }
        A05(r0, this);
        Context context = this.A0H;
        int i = 2131963761;
        if (A0X()) {
            i = 2131963762;
        }
        frameLayout.setContentDescription(context.getString(i));
        AnonymousClass0fU.A00(new C263344Ld(frameLayout, r5, this), frameLayout);
    }

    public final void A0Q(1Xj r18, AnonymousClass4DU r19, AnonymousClass3V3 r20, AnonymousClass3W1 r21, C262864Gh r22, int i) {
        1Xj r6;
        1Xj r8 = r18;
        0qQ.A0B(r8, 0);
        AnonymousClass3W1 r1 = r21;
        0qQ.A0B(r1, 1);
        AnonymousClass4DU r9 = r19;
        0qQ.A0B(r9, 4);
        int i2 = r1.A03;
        1Xj A002 = C263434Lz.A00(r8, i2);
        if (A002 instanceof 1Xj) {
            r6 = A002;
        } else {
            r6 = null;
        }
        AnonymousClass4M3 r3 = this.A05;
        if (!A0D(r8, this) || r6 == null || r6.CeS()) {
            C263744Ne r0 = this.A02;
            AnonymousClass3V3 r10 = r20;
            if (r0 == null || r6 == null || !r6.equals(r0.A00())) {
                for (C232702uH Dql : this.A0P) {
                    Dql.Dql(r8, r10, r1);
                }
                A0R(r8, r9, r10, new C263414Lx(false, false, false, C263404Lw.A00(this.A0K)), i, i2, r1.A01(), r1.A22, r1.A2H);
                A0K();
                return;
            } else if (r3 == null) {
                return;
            } else {
                if (!this.A0h) {
                    C262864Gh r11 = r22;
                    if (r22 != null) {
                        if (r8.CcK() || !C243223Xx.A02(r8)) {
                            UserSession userSession = this.A0K;
                            if (C263264Jy.A08(userSession, r8, r9.getModuleName(), true) || C263264Jy.A07(userSession, r8, r9.getModuleName(), true)) {
                                r11.Dx7(r10.BQB(), r8, r9, r1, C263264Jy.A00(userSession, r8, r9.getModuleName(), false));
                                return;
                            }
                        } else {
                            r11.D3j(r10.BQB(), AnonymousClass5OC.VIDEO_TAP, r9, r8, r1);
                            C228232l0 r32 = this.A03;
                            if (r32 != null) {
                                r32.DUE(C301155ye.A00(), C233162v9.VIDEO_TAP, r8, r1);
                                return;
                            }
                            return;
                        }
                    }
                } else if (!r3.isPlaying()) {
                    A07(this, "start", false, true);
                    return;
                } else {
                    A0T("tapped");
                    return;
                }
            }
        }
        A0S(r8, r1, -1);
    }

    public final void A0R(1Xj r21, AnonymousClass4DU r22, AnonymousClass3V3 r23, C263414Lx r24, int i, int i2, int i3, boolean z, boolean z2) {
        1Xj r9;
        1Xj A002;
        String str;
        1Xj r10 = r21;
        0qQ.A0B(r10, 0);
        AnonymousClass4DU r11 = r22;
        0qQ.A0B(r11, 7);
        int i4 = i2;
        1Xj A003 = C263434Lz.A00(r10, i4);
        if (A003 instanceof 1Xj) {
            r9 = A003;
        } else {
            r9 = null;
        }
        if (A0J() != AnonymousClass3OB.STOPPING && r9 != null && !r9.A5f()) {
            UserSession userSession = this.A0K;
            if (r9.A6W(userSession)) {
                this.A07 = null;
                boolean z3 = false;
                this.A0G = false;
                AnonymousClass4M3 r15 = this.A05;
                AnonymousClass4M1 r152 = r15;
                if (r15 == null) {
                    AnonymousClass4M1 A004 = AnonymousClass4M0.A00(this.A0H, userSession, this.A0L, this, r11.getModuleName());
                    A004.A0Z = false;
                    A004.ERk(this.A0A);
                    A004.Ech(this.A0U);
                    Iterator it = this.A0O.iterator();
                    0qQ.A07(it);
                    if (it.hasNext()) {
                        0qQ.A07(it.next());
                        A004.A10.add((Object) null);
                        throw new NullPointerException("onStateChanged");
                    }
                    this.A05 = A004;
                    r152 = A004;
                }
                AnonymousClass4M1 r1 = (AnonymousClass4M1) r152;
                r1.A0W = this.A0g;
                C263744Ne r0 = this.A02;
                int i5 = i;
                if (r0 != null && Math.abs(r0.A01 - i) == 1) {
                    z3 = true;
                }
                A0U("scroll", true, z3);
                boolean z4 = z;
                this.A0D = z4;
                this.A0B = z2;
                C263724Nc r8 = new C263724Nc(r9, r10, r11, r23, this, r24, r152, i5, i4, i3, z4);
                this.A07 = r8;
                if (r1.A0M == AnonymousClass3OB.IDLE) {
                    r8.run();
                    this.A07 = null;
                }
            } else if (!r9.A6W(userSession)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Media ID: ");
                String id = r9.getId();
                if (id == null) {
                    id = "null";
                }
                sb.append(id);
                sb.append(", type: ");
                sb.append(r9.BR7());
                sb.append(", carousel index: ");
                sb.append(i4);
                sb.append(", host media ID: ");
                sb.append(r10.getId());
                sb.append(", host media type: ");
                sb.append(r10.BR7());
                if (r10.A5D()) {
                    sb.append(", children of host media: ");
                    int i6 = 0;
                    int A0o = r10.A0o();
                    while (i6 < A0o) {
                        1Xj A1c = r10.A1c(i6);
                        sb.append("(");
                        if (A1c == null || (str = A1c.getId()) == null) {
                            str = "null";
                        }
                        sb.append(str);
                        sb.append(", ");
                        if (A1c != null) {
                            sb.append(A1c.BR7());
                            sb.append(")");
                            i6++;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                C263744Ne r02 = this.A02;
                if (!(r02 == null || (A002 = r02.A00()) == null)) {
                    sb.append(", current media of video meta data: ");
                    sb.append(A002.getId());
                }
                0f9 AEf = 0wj.A01.AEf("FeedVideoPlayer_PrepareNonVideoMedia", 817899586);
                AEf.ABQ(DialogModule.KEY_MESSAGE, sb.toString());
                AEf.report();
            }
        }
    }

    public final void A0S(1Xj r5, AnonymousClass3W1 r6, int i) {
        C263744Ne r0;
        AnonymousClass3V3 r1;
        int i2;
        boolean z = false;
        if (i == -1) {
            z = true;
        }
        if (A0X()) {
            A0N(i);
            if (A0D(r5, this)) {
                A0T("paused_for_music_audio_off");
            }
        } else if (C263734Nd.A00(this.A0K, r5, r6)) {
            A0O(i);
            if (A0D(r5, this)) {
                A0M();
            }
        } else {
            A01();
        }
        if (z && (r0 = this.A02) != null && (r1 = r0.A08) != null) {
            boolean A002 = C263734Nd.A00(this.A0K, r5, r6);
            boolean z2 = !A0X();
            C256043v8 B5X = r1.B5X();
            if (B5X != null) {
                if (!A002) {
                    i2 = R.drawable.instagram_volume_none_pano_filled_24;
                } else {
                    i2 = R.drawable.instagram_volume_pano_filled_24;
                    if (z2) {
                        i2 = R.drawable.instagram_volume_off_pano_filled_24;
                    }
                }
                B5X.A02(i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if ("bottom_sheet".equals(r5) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 0
            r4.A0B(r3)
            X.4Ne r0 = r4.A02
            if (r0 == 0) goto L_0x0037
            X.3V3 r1 = r0.A08
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "scroll"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "tapped"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "paused_for_music_audio_off"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "long_pressed_persistent_pause"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0037
        L_0x002c:
            X.3TN r1 = r1.B5Y()
            if (r1 == 0) goto L_0x0037
            r0 = 8
            r1.setVisibility(r0)
        L_0x0037:
            X.4M3 r0 = r4.A05
            if (r0 == 0) goto L_0x006d
            r0.E21(r5)
            java.lang.String r0 = "fragment_paused"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "bottom_sheet"
            boolean r0 = r0.equals(r5)
            r2 = 0
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            r2 = 1
        L_0x0050:
            boolean r0 = r4.A0S
            if (r0 == 0) goto L_0x006d
            X.1Xj r0 = A00(r4)
            r1 = 1
            if (r0 == 0) goto L_0x006d
            boolean r0 = r0.CcK()
            if (r0 != r1) goto L_0x006d
            if (r2 == 0) goto L_0x006d
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x006a
            r4.A02()
        L_0x006a:
            r4.A0V(r3)
        L_0x006d:
            X.1vq r0 = r4.A0J
            r0.A03(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232722uK.A0T(java.lang.String):void");
    }

    public final void onAudioFocusChange(int i) {
        float f;
        if (i == -3) {
            f = 0.5f;
        } else if (i == -2) {
            f = 0.0f;
        } else if (i == -1) {
            A0N(0);
            return;
        } else if (i == 1 || i == 2 || i == 3 || i == 4) {
            f = 1.0f;
        } else {
            return;
        }
        AnonymousClass4M3 r1 = this.A05;
        if (r1 != null) {
            if (this.A0E) {
                f = 0.0f;
            }
            r1.Eqr(f, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r1.getStreamVolume(3) > 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        if (r10 == 24) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKey(android.view.View r9, int r10, android.view.KeyEvent r11) {
        /*
            r8 = this;
            r0 = 2
            X.0qQ.A0B(r11, r0)
            X.4M3 r0 = r8.A05
            if (r0 == 0) goto L_0x0026
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.3OB r1 = r0.A0M
        L_0x000c:
            X.3OB r0 = X.AnonymousClass3OB.PLAYING
            r4 = 0
            if (r1 != r0) goto L_0x0025
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x0025
            X.4Ne r0 = r8.A02
            if (r0 == 0) goto L_0x0025
            boolean r5 = r0.A00
            r6 = 24
            r7 = 25
            if (r10 == r7) goto L_0x0028
            if (r10 == r6) goto L_0x0028
        L_0x0025:
            return r4
        L_0x0026:
            r1 = 0
            goto L_0x000c
        L_0x0028:
            X.1Xj r2 = r0.A00()
            if (r2 == 0) goto L_0x0039
            X.4Fr r1 = X.AnonymousClass4Fr.A00
            com.instagram.common.session.UserSession r0 = r8.A0K
            boolean r0 = r1.A02(r0, r2)
            if (r0 == 0) goto L_0x0039
            return r4
        L_0x0039:
            r3 = 1
            if (r5 == 0) goto L_0x0042
            if (r10 != r7) goto L_0x0078
            r5 = 1
            r4 = 1
        L_0x0040:
            r2 = -1
            goto L_0x007d
        L_0x0042:
            X.1Xj r1 = A00(r8)
            X.3W1 r0 = r8.A0H()
            com.instagram.common.session.UserSession r5 = r8.A0K
            boolean r0 = X.C263734Nd.A00(r5, r1, r0)
            if (r0 == 0) goto L_0x0075
            if (r10 != r7) goto L_0x0071
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328916448722606(0x8110f500003eae, double:3.037891274752524E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0065
            r5 = 0
            goto L_0x0040
        L_0x0065:
            android.media.AudioManager r1 = r8.A0X
            X.0qQ.A0B(r1, r4)
            r0 = 3
            int r0 = r1.getStreamVolume(r0)
            if (r0 <= 0) goto L_0x0078
        L_0x0071:
            r8.A0O(r10)
            goto L_0x0078
        L_0x0075:
            r8.A01()
        L_0x0078:
            r5 = 1
            r2 = 1
            if (r10 == r6) goto L_0x007d
            goto L_0x0040
        L_0x007d:
            android.media.AudioManager r1 = r8.A0X     // Catch:{ SecurityException -> 0x0084 }
            r0 = 3
            r1.adjustStreamVolume(r0, r2, r3)     // Catch:{ SecurityException -> 0x0084 }
            goto L_0x0092
        L_0x0084:
            X.0wj r2 = X.0wj.A01
            r1 = 817890849(0x30c00621, float:1.3971581E-9)
            java.lang.String r0 = "feed_video_crash_when_adjusting_volume"
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.report()
        L_0x0092:
            if (r4 == 0) goto L_0x00a4
            android.media.AudioManager r1 = r8.A0X
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 3
            int r0 = r1.getStreamVolume(r0)
            if (r0 != 0) goto L_0x00a4
            r8.A0N(r10)
        L_0x00a4:
            boolean r0 = r8.A0e
            if (r0 == 0) goto L_0x00ac
            if (r5 == 0) goto L_0x00ac
            r8.A0G = r3
        L_0x00ac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232722uK.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    public static final 1Xj A00(C232722uK r0) {
        C263744Ne r02 = r0.A02;
        if (r02 != null) {
            return (1Xj) r02.A03;
        }
        return null;
    }

    private final void A02() {
        AnonymousClass4M3 r0;
        1Xj A002;
        int i;
        C263744Ne r1 = this.A02;
        if (r1 != null && (r0 = this.A05) != null && (A002 = A00(this)) != null) {
            UserSession userSession = this.A0K;
            Context context = this.A0H;
            int currentPositionMs = r0.getCurrentPositionMs();
            int i2 = r1.A07;
            int AzN = r0.AzN();
            int i3 = r1.A01;
            int i4 = r1.A0D;
            C263814Nl r02 = ((AnonymousClass4M1) r0).A0O;
            if (r02 == null) {
                i = -1;
            } else {
                i = r02.A01;
            }
            boolean z = r1.A00;
            C296625qN.A01(context, userSession, A002, r1.A0E, currentPositionMs, i2, AzN, i3, i4, i - r1.A06, z);
        }
    }

    public static final void A03(1Xj r2, AnonymousClass3W1 r3, C232722uK r4) {
        C263744Ne r1;
        C232822uV r22;
        if (!C263734Nd.A00(r4.A0K, r2, r3)) {
            r4.A01();
        } else if (r4.A05 != null && (r1 = r4.A02) != null) {
            if (A0E(r2, r4)) {
                r22 = r4.A0c;
            } else {
                r22 = r4.A0b;
            }
            if (r1.A00) {
                r4.A0A(r22, R.drawable.instagram_volume_pano_filled_24, false);
                A05(AnonymousClass4Lc.SOUND_ON, r4);
                return;
            }
            r4.A09(r22);
        }
    }

    public static final void A05(AnonymousClass4Lc r2, C232722uK r3) {
        for (JOJ Cwn : r3.A0Q) {
            Cwn.Cwn(r2);
        }
    }

    public static final void A06(C232722uK r3, int i, boolean z) {
        if (z) {
            float f = 1.0f;
            AnonymousClass4M3 r1 = r3.A05;
            if (r1 != null) {
                if (r3.A0E) {
                    f = 0.0f;
                }
                r1.Eqr(f, i);
            }
            r3.A0J.A04(r3);
            return;
        }
        AnonymousClass4M3 r0 = r3.A05;
        if (r0 != null) {
            r0.Eqr(0.0f, i);
        }
        r3.A0J.A03(r3);
    }

    public static final void A08(C232722uK r4, C62320sa r5, 0sL r6) {
        C247233fz r2;
        C263744Ne r3 = r4.A02;
        if (r3 != null) {
            AnonymousClass3V3 r0 = r3.A08;
            if (r0 != null) {
                r2 = r0.BQv();
            } else {
                r2 = null;
            }
            if (((Boolean) r6.invoke(r4.A0G(), Boolean.valueOf(r3.A00))).booleanValue()) {
                if (r2 != null) {
                    r2.Eqk(true);
                }
                if (r5 != null) {
                    r5.invoke();
                }
            } else if (r2 != null) {
                r2.Eqk(false);
            }
        }
    }

    private final void A0A(C232822uV r7, int i, boolean z) {
        AnonymousClass3V3 r0;
        AnonymousClass3TS Adf;
        SlideInAndOutIconView A012;
        float f;
        C263744Ne r02 = this.A02;
        if (r02 != null && (r0 = r02.A08) != null && (Adf = r0.Adf()) != null && (A012 = Adf.A01()) != null) {
            Resources resources = A012.getContext().getResources();
            A012.setTextSize((float) resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
            TitleTextView titleTextView = A012.A0C;
            int lineHeight = titleTextView.getLineHeight() + (resources.getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
            int lineHeight2 = (titleTextView.getLineHeight() - resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
            Context context = this.A0H;
            if (z) {
                AnonymousClass61R A002 = C303756Aq.A00(context, i);
                if (A002 != null) {
                    A002.EFK();
                    A002.E2p();
                }
                A012.A03(A002, lineHeight, lineHeight);
                f = 1.0f;
            } else {
                A012.A03(context.getDrawable(i), lineHeight, lineHeight);
                A012.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
                A012.setIconColor(context.getColor(R.color.design_dark_default_color_on_background));
                f = 0.5f;
            }
            A012.setIconScale(f);
            A012.setIconColor(context.getColor(R.color.design_dark_default_color_on_background));
            AnonymousClass3W1 A0H2 = A0H();
            if (A0H2 != null) {
                A0H2.A0H((C266444Yx) null, r7, i);
            }
        }
    }

    private final void A0B(boolean z) {
        AnonymousClass3V3 r1;
        AnonymousClass3W1 A0H2;
        AnonymousClass3W1 A0H3;
        AnonymousClass3TS Adf;
        float f;
        float f2;
        C263744Ne r0 = this.A02;
        if (r0 != null) {
            r1 = r0.A08;
        } else {
            r1 = null;
        }
        if (!(!A0C() || r1 == null || (Adf = r1.Adf()) == null)) {
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            if (Adf.A01().getAlpha() != f) {
                Adf.A01().setAlpha(f2);
                Adf.A01().animate().alpha(f).setDuration(200).start();
            }
        }
        if (!(!A0C() || (A0H3 = A0H()) == null || A0H3.A1x == z)) {
            A0H3.A1x = z;
            AnonymousClass3W1.A00(A0H3, 40);
        }
        if (A0C()) {
            A08(this, (C62320sa) null, new J73(15, this, z));
        }
        if (A0C() && (A0H2 = A0H()) != null && A0H2.A1v != z) {
            A0H2.A1v = z;
            AnonymousClass3W1.A00(A0H2, 51);
        }
    }

    public static final boolean A0D(1Xj r2, C232722uK r3) {
        if (r2 != null) {
            UserSession userSession = r3.A0K;
            if ((C243223Xx.A01(userSession, r2) || C243223Xx.A00(userSession, r2)) && r2.CEL().A0U) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A00, 36322839069993478L) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (X.C243223Xx.A02(r6) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0E(X.1Xj r6, X.C232722uK r7) {
        /*
            if (r6 == 0) goto L_0x000f
            boolean r0 = r6.CcK()
            if (r0 != 0) goto L_0x000f
            boolean r1 = X.C243223Xx.A02(r6)
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0068
            X.4DU r2 = r7.A0Y
            java.lang.String r0 = r2.getModuleName()
            com.instagram.common.session.UserSession r1 = r7.A0K
            boolean r0 = X.C263264Jy.A07(r1, r6, r0, r3)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = r2.getModuleName()
            boolean r0 = X.C263264Jy.A08(r1, r6, r0, r3)
            if (r0 != 0) goto L_0x0068
            boolean r0 = A0D(r6, r7)
            if (r0 != 0) goto L_0x0068
            if (r6 == 0) goto L_0x0069
            boolean r0 = r6.CcK()
            if (r0 != r4) goto L_0x0069
            X.0rQ r5 = r7.A0a
            boolean r0 = r6.A5o()
            if (r0 != 0) goto L_0x0051
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322839069993478(0x810b6e00002a06, double:3.034047915972584E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0068
        L_0x0051:
            com.instagram.api.schemas.IGPostTriggerExperience r0 = com.instagram.api.schemas.IGPostTriggerExperience.IG_POST_TRIGGER_EXPERIENCE_FEED_VIDEO_AD_TO_REELS_CHAIN
            boolean r0 = r6.A6P(r0)
            if (r0 != 0) goto L_0x0068
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321992961959817(0x810aa900082789, double:3.033512833845093E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0069
        L_0x0068:
            return r4
        L_0x0069:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232722uK.A0E(X.1Xj, X.2uK):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r4.A08 != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0F(X.C232722uK r4) {
        /*
            boolean r0 = r4.A0e
            r3 = 0
            if (r0 != 0) goto L_0x000e
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x000e
            boolean r0 = r4.A08
            r2 = 0
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r2 = 1
        L_0x000f:
            com.instagram.common.session.UserSession r1 = r4.A0K
            X.1GF r0 = X.1GE.A00(r1)
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L_0x001d
            boolean r2 = r0.booleanValue()
        L_0x001d:
            if (r2 == 0) goto L_0x002e
            X.5ju r0 = X.C293015jt.A00(r1)
            X.7Pg r0 = r0.A00
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232722uK.A0F(X.2uK):boolean");
    }

    public final AnonymousClass3W1 A0H() {
        AnonymousClass3V3 r0;
        C263744Ne r02 = this.A02;
        if (r02 == null || (r0 = r02.A08) == null) {
            return null;
        }
        return r0.BQq();
    }

    public final AnonymousClass3OB A0J() {
        AnonymousClass3OB r0;
        AnonymousClass4M3 r02 = this.A05;
        if (r02 == null || (r0 = ((AnonymousClass4M1) r02).A0M) == null) {
            return AnonymousClass3OB.IDLE;
        }
        return r0;
    }

    public final void A0K() {
        AnonymousClass4Lc r0;
        AnonymousClass4UR r3;
        if (!this.A0C && this.A02 != null) {
            if (A0X()) {
                r0 = AnonymousClass4Lc.SOUND_ON;
            } else {
                r0 = AnonymousClass4Lc.SOUND_OFF;
            }
            A05(r0, this);
            this.A0C = true;
            AnonymousClass3W1 A0H2 = A0H();
            if (A0H2 != null && A0H2.A30 && (r3 = A0H2.A0s) != null) {
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(250);
                r3.A03 = duration;
                duration.setStartDelay(0);
                ValueAnimator valueAnimator = r3.A03;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = r3.A01;
                if (animatorUpdateListener == null) {
                    animatorUpdateListener = new C64199LTl(r3);
                    r3.A01 = animatorUpdateListener;
                }
                valueAnimator.addUpdateListener(animatorUpdateListener);
                ValueAnimator valueAnimator2 = r3.A03;
                AnonymousClass4HM r02 = r3.A06;
                if (r02 == null) {
                    r02 = new C62148Kb1(r3);
                    r3.A06 = r02;
                }
                valueAnimator2.addListener(r02);
                r3.A03.start();
            }
        }
    }

    public final void A0M() {
        A07(this, "start", false, false);
    }

    public final void A0N(int i) {
        C232822uV r0;
        C263744Ne r02 = this.A02;
        if (r02 != null) {
            r02.A01(false);
        }
        if (!(i == -5 || i == -7)) {
            1GE.A00(this.A0K).A00(false);
        }
        A06(this, i, false);
        if (A0E(A00(this), this)) {
            r0 = C232822uV.A0C;
        } else {
            r0 = C232822uV.A0B;
        }
        0qQ.A0A(r0);
        A09(r0);
        AnonymousClass3W1 A0H2 = A0H();
        if (A0H2 != null) {
            A0H2.A31 = false;
        }
    }

    public final void A0O(int i) {
        C232822uV r2;
        UserSession userSession = this.A0K;
        C293015jt.A00(userSession).A02(true);
        C263744Ne r0 = this.A02;
        if (r0 != null) {
            r0.A01(true);
        }
        if (!(i == -5 || i == -7)) {
            1GE.A00(userSession).A00(true);
        }
        A06(this, i, true);
        AnonymousClass3W1 A0H2 = A0H();
        if (A0H2 != null) {
            A0H2.A31 = true;
        }
        if (A0E(A00(this), this)) {
            r2 = C232822uV.A0C;
        } else {
            r2 = C232822uV.A0B;
        }
        0qQ.A0A(r2);
        A0A(r2, R.drawable.instagram_volume_pano_filled_24, false);
        A05(AnonymousClass4Lc.SOUND_ON, this);
    }

    public final void A0U(String str, boolean z, boolean z2) {
        int i;
        C263744Ne r1 = this.A02;
        if (r1 != null) {
            if (str.equals("scroll")) {
                11Z.A02(new C292565jA(r1));
            }
            r1.A0C = z2;
            1Xj A002 = A00(this);
            AnonymousClass4M3 r4 = this.A05;
            if (A002 != null && A002.CcK() && this.A0D && r4 != null) {
                AnonymousClass4M1 r3 = (AnonymousClass4M1) r4;
                if (AnonymousClass4M1.A1M.contains(r3.A0M)) {
                    int currentPositionMs = r4.getCurrentPositionMs();
                    int AzN = r4.AzN();
                    C263814Nl r0 = r3.A0O;
                    if (r0 == null) {
                        i = -1;
                    } else {
                        i = r0.A01;
                    }
                    int i2 = i - r1.A02;
                    boolean z3 = r1.A00;
                    UserSession userSession = this.A0K;
                    Context context = this.A0H;
                    int i3 = r1.A07;
                    int i4 = r1.A01;
                    int i5 = r1.A0D;
                    AnonymousClass4DU r6 = r1.A0E;
                    C296625qN.A01(context, userSession, A002, r6, currentPositionMs, i3, AzN, i4, i5, i2, z3);
                    C296625qN.A00(context, userSession, A002, r6, currentPositionMs, r1.A03, AzN, i4, i5, i2, z3);
                }
            }
        }
        AnonymousClass4M3 r12 = this.A05;
        if (r12 != null) {
            11Z.A02(new AnonymousClass4La(r12, str, z));
        }
    }

    public final void A0V(boolean z) {
        AnonymousClass4M3 r2;
        int i;
        AnonymousClass4M3 r0;
        1Xj A002;
        int i2;
        C263744Ne r3 = this.A02;
        if (!(r3 == null || (r2 = this.A05) == null)) {
            1Xj A003 = A00(this);
            if (A003 != null && A003.CcK() && this.A0B && !z && AnonymousClass4M1.A1M.contains(((AnonymousClass4M1) r2).A0M)) {
                C263744Ne r1 = this.A02;
                if (!(r1 == null || (r0 = this.A05) == null || (A002 = A00(this)) == null)) {
                    UserSession userSession = this.A0K;
                    Context context = this.A0H;
                    int currentPositionMs = r0.getCurrentPositionMs();
                    int i3 = r1.A03;
                    int AzN = r0.AzN();
                    int i4 = r1.A01;
                    int i5 = r1.A0D;
                    C263814Nl r02 = ((AnonymousClass4M1) r0).A0O;
                    if (r02 == null) {
                        i2 = -1;
                    } else {
                        i2 = r02.A01;
                    }
                    boolean z2 = r1.A00;
                    C296625qN.A00(context, userSession, A002, r1.A0E, currentPositionMs, i3, AzN, i4, i5, i2 - r1.A02, z2);
                }
            } else if (!this.A0B && z) {
                r3.A03 = r2.getCurrentPositionMs();
                C263814Nl r03 = ((AnonymousClass4M1) r2).A0O;
                if (r03 == null) {
                    i = -1;
                } else {
                    i = r03.A01;
                }
                r3.A02 = i;
            }
        }
        this.A0B = z;
    }

    public final void A0W(boolean z) {
        AnonymousClass4M3 r4;
        boolean contains;
        int i;
        C263744Ne r3 = this.A02;
        if (!(r3 == null || (r4 = this.A05) == null)) {
            if (this.A0f) {
                contains = r4.isPlaying();
            } else {
                contains = AnonymousClass4M1.A1M.contains(((AnonymousClass4M1) r4).A0M);
            }
            1Xj A002 = A00(this);
            if (A002 != null && A002.CcK() && this.A0D && !z && contains) {
                A02();
            } else if (!this.A0D && z) {
                r3.A07 = r4.getCurrentPositionMs();
                C263814Nl r0 = ((AnonymousClass4M1) r4).A0O;
                if (r0 == null) {
                    i = -1;
                } else {
                    i = r0.A01;
                }
                r3.A06 = i;
            }
        }
        this.A0D = z;
    }

    public final boolean A0X() {
        C263744Ne r0 = this.A02;
        if (r0 == null || !r0.A00) {
            return false;
        }
        return true;
    }

    public final boolean A0Y() {
        if (!AnonymousClass3OE.A00(this.A0K).A00() || 2eO.A00(this.A0H)) {
            return true;
        }
        return false;
    }

    public final boolean A0Z(1Xj r3) {
        if (r3 == null) {
            return false;
        }
        0rQ r1 = this.A0a;
        this.A0L.A00.getModuleName();
        if (r1.A05(r3) || A0D(r3, this)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r4 = this;
            X.3W1 r0 = r4.A0H()
            if (r0 == 0) goto L_0x0061
            X.4UR r0 = r0.A0s
            if (r0 == 0) goto L_0x005e
            X.4Ki r1 = r0.A05
            X.0qQ.A0A(r1)
        L_0x000f:
            X.4Ki r0 = X.AnonymousClass4Ki.STOPPED
            if (r1 == r0) goto L_0x0061
            android.widget.Toast r0 = r4.A00
            if (r0 != 0) goto L_0x0061
            X.1Xj r0 = A00(r4)
            com.instagram.common.session.UserSession r1 = r4.A0K
            boolean r0 = X.AnonymousClass3ZJ.A0D(r1, r0)
            if (r0 == 0) goto L_0x0054
            X.1Xj r0 = A00(r4)
            java.lang.String r3 = X.AnonymousClass3ZJ.A05(r1, r0)
        L_0x002b:
            android.content.Context r2 = r4.A0H
            r1 = 0
            r0 = 0
            android.widget.Toast r0 = X.C59689JTv.A00(r2, r3, r1, r0)
        L_0x0033:
            r4.A00 = r0
            r2 = 2131238991(0x7f08204f, float:1.8094276E38)
            X.1Xj r0 = A00(r4)
            boolean r0 = A0E(r0, r4)
            if (r0 == 0) goto L_0x0051
            X.2uV r1 = X.C232822uV.A08
        L_0x0044:
            X.0qQ.A0A(r1)
            r0 = 0
            r4.A0A(r1, r2, r0)
            X.4Lc r0 = X.AnonymousClass4Lc.NO_SOUND
            A05(r0, r4)
            return
        L_0x0051:
            X.2uV r1 = X.C232822uV.A07
            goto L_0x0044
        L_0x0054:
            android.content.Context r1 = r4.A0H
            r0 = 2131968723(0x7f1342d3, float:1.9574349E38)
            java.lang.String r3 = r1.getString(r0)
            goto L_0x002b
        L_0x005e:
            X.4Ki r1 = X.AnonymousClass4Ki.STOPPED
            goto L_0x000f
        L_0x0061:
            android.widget.Toast r0 = r4.A00
            if (r0 == 0) goto L_0x0068
            r0.cancel()
        L_0x0068:
            r0 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232722uK.A01():void");
    }

    public static final void A04(1Xj r0, C232722uK r1, AnonymousClass3TN r2, AnonymousClass3TO r3) {
        if (!r1.A0Z(r0) || r3 == AnonymousClass3TO.RETRY) {
            r2.setVideoIconState(r3);
        } else {
            r2.setVideoIconState(AnonymousClass3TO.HIDDEN);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0K, 36327683793107567L) != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r0 == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A09(X.C232822uV r7) {
        /*
            r6 = this;
            X.1Xj r0 = A00(r6)
            r5 = 1
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.A5o()
            if (r0 != r5) goto L_0x0036
        L_0x000d:
            r4 = 2131238997(0x7f082055, float:1.8094288E38)
        L_0x0010:
            X.1Xj r0 = A00(r6)
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.A5o()
            if (r0 != r5) goto L_0x0026
        L_0x001c:
            r5 = 0
        L_0x001d:
            r6.A0A(r7, r4, r5)
            X.4Lc r0 = X.AnonymousClass4Lc.SOUND_OFF
            A05(r0, r6)
            return
        L_0x0026:
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327683793107567(0x810fd600003a6f, double:3.037111738378068E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x001c
            goto L_0x001d
        L_0x0036:
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327683793107567(0x810fd600003a6f, double:3.037111738378068E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 2131886082(0x7f120002, float:1.9406733E38)
            if (r0 != 0) goto L_0x0010
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232722uK.A09(X.2uV):void");
    }

    private final boolean A0C() {
        1Xj A0G2 = A0G();
        if (A0G2 == null || !this.A0a.A06(A0G2, this.A0L.A00.getModuleName())) {
            return false;
        }
        return true;
    }

    public final 1Xj A0G() {
        Object obj;
        C263744Ne r0;
        AnonymousClass0Ud A002 = AnonymousClass3OC.A00();
        if (A002 != null) {
            obj = A002.getValue();
        } else {
            obj = null;
        }
        if (obj == AnonymousClass3OD.FREE || (r0 = this.A02) == null) {
            return null;
        }
        return r0.A00();
    }

    public final AnonymousClass3TO A0I(1Xj r4) {
        1Xj r0;
        if (!r4.CeS()) {
            return AnonymousClass3TO.GONE;
        }
        if (!A0Z(r4)) {
            AnonymousClass4M3 r2 = this.A05;
            C263744Ne r02 = this.A02;
            if (r02 != null) {
                r0 = r02.A00();
            } else {
                r0 = null;
            }
            if (!r4.equals(r0)) {
                if (r2 != null && r2.isPlaying()) {
                    return AnonymousClass3TO.PLAY;
                }
                if (this.A0W) {
                    return AnonymousClass3TO.AUTOPLAY_USING_TIMER;
                }
                return AnonymousClass3TO.AUTOPLAY;
            } else if (r2 == null || !AnonymousClass4M1.A1M.contains(((AnonymousClass4M1) r2).A0M)) {
                if (this.A0W) {
                    return AnonymousClass3TO.LOADING_ANIMATE_TIMER;
                }
                return AnonymousClass3TO.LOADING;
            } else if (r4.A5G() && !r4.CcK() && C243223Xx.A02(r4)) {
                return AnonymousClass3TO.CLIPS;
            }
        }
        return AnonymousClass3TO.HIDDEN;
    }
}
