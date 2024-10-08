package X;

import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.Arrays;

/* renamed from: X.6ck  reason: invalid class name and case insensitive filesystem */
public final class C311476ck extends C252233om implements C252293os, C311486cl, C311216cK {
    public C311486cl A00;
    public final UserSession A01;
    public final C311496cm A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass343 A04;
    public final AnonymousClass3BQ A05;
    public final C310016aI A06;
    public final C270414gh A07;
    public final String A08;
    public final boolean A09;
    public final Fragment A0A;
    public final ReelViewerFragment A0B;

    public C311476ck(Fragment fragment, AnonymousClass0iw r6, UserSession userSession, AnonymousClass4DU r8, AnonymousClass3BQ r9, C310016aI r10, C270414gh r11, ReelViewerFragment reelViewerFragment, String str) {
        AnonymousClass343 r0;
        0qQ.A0B(r11, 3);
        0qQ.A0B(r10, 4);
        0qQ.A0B(userSession, 5);
        0qQ.A0B(r9, 6);
        this.A0A = fragment;
        this.A0B = reelViewerFragment;
        this.A07 = r11;
        this.A06 = r10;
        this.A01 = userSession;
        this.A05 = r9;
        this.A03 = r8;
        this.A08 = str;
        boolean A062 = 182.A06(0Tu.A05, userSession, 2342155007786943326L);
        this.A09 = A062;
        if (A062) {
            r0 = null;
        } else {
            r0 = new AnonymousClass343((AnonymousClass340) new C57220ITh(userSession, r11), (AnonymousClass342) new C57221ITi(fragment, reelViewerFragment), Arrays.asList(new C2355130d[]{new HB9(userSession, this, r11)}));
        }
        this.A04 = r0;
        this.A02 = new C311496cm(r6, userSession);
    }

    public final void DMC(C250603lj r2, C255773uh r3, AnonymousClass6YY r4) {
        0qQ.A0B(r3, 1);
        A00(r3);
    }

    public final void DMD(C255773uh r2) {
        0qQ.A0B(r2, 0);
        if (!this.A09) {
            A00(r2);
        }
    }

    public final void DMT(C250603lj r11, C255773uh r12, AnonymousClass6YY r13) {
        User user;
        0qQ.A0B(r12, 1);
        0qQ.A0B(r13, 2);
        int i = r13.A02.A0I;
        C250973mM r6 = r13.A00;
        C309426Yf Bz3 = ((C310566bG) this.A07).A0B.Bz3(r12);
        if (r12.A0e == C250963mL.EMPTY_STORIES_STATE_CONTACT_IMPORT) {
            0xa r3 = 1Au.A00(this.A01).A01;
            int i2 = r3.getInt("empty_story_state_impression_count", 0) + 1;
            0xY AR4 = r3.AR4();
            AR4.E5Z("empty_story_state_impression_count", i2);
            AR4.apply();
            this.A02.A01(false, Integer.valueOf(i), EX9.EMPTY_STORIES_STATE_CI_UPSELL.toString());
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Bz3.A0P = uptimeMillis;
        if (Bz3.A0O < 0) {
            Bz3.A0O = uptimeMillis;
        }
        if (Bz3.A0N < 0 || uptimeMillis == -1) {
            Bz3.A0N = uptimeMillis;
        }
        1Xj r8 = r12.A0b;
        C270194gL r7 = r12.A0c;
        if (r8 != null && r8.A5f()) {
            C310016aI r0 = this.A06;
            AnonymousClass4DU r2 = this.A03;
            0qQ.A0B(r2, 1);
            I2F.A02(r8, r2, r0.A06, AnonymousClass05K.A0C);
        } else if (r7 != null) {
            r7.A03();
            if (!AnonymousClass0t1.A01.A01(this.A01).equals(r7.A03()) && r7.A08()) {
                C310016aI r02 = this.A06;
                AnonymousClass4DU r22 = this.A03;
                0qQ.A0B(r22, 1);
                I2F.A02(r7, r22, r02.A06, AnonymousClass05K.A0N);
            }
        }
        if (this.A09) {
            this.A06.A0I(r6, Bz3, i);
            C14164Tr2.A00.A03(this.A01, r12, this.A05);
        }
        UserSession userSession = this.A01;
        boolean z = false;
        0qQ.A0B(userSession, 0);
        Oy0 oy0 = (Oy0) userSession.A01(Oy0.class, new C73927Pm7(userSession, 19));
        AnonymousClass3BQ r23 = this.A05;
        String str = this.A08;
        0qQ.A0B(r23, 0);
        boolean z2 = false;
        if (r23 == AnonymousClass3BQ.MAIN_FEED_TRAY || (r23 == AnonymousClass3BQ.PUSH_NOTIFICATION && "story_daily_digest".equals(str))) {
            z = true;
        }
        if (!r12.CcK() && !r12.A1P() && (((user = r12.A0i) == null || !user.equals(AnonymousClass0t1.A01.A01(oy0.A01))) && !r12.A0R && r12.CWu())) {
            z2 = true;
        }
        if (z && z2) {
            oy0.A00 = System.currentTimeMillis();
        }
        C311486cl r03 = this.A00;
        if (r03 != null) {
            r03.DMU(r12, i);
        }
    }

    public final void DMU(C255773uh r4, int i) {
        0qQ.A0B(r4, 0);
        if (!this.A09) {
            C270414gh r0 = this.A07;
            C250973mM Bky = r0.Bky(i);
            C309426Yf Bz3 = ((C310566bG) r0).A0B.Bz3(r4);
            if (Bky != null) {
                this.A06.A0I(Bky, Bz3, i);
                C14164Tr2.A00.A03(this.A01, r4, this.A05);
            }
        }
    }

    public final void DW9(int i, int i2, boolean z) {
    }

    public final void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        if (r0.A00 == 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        if (r0 == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        if (r2.isResumed() == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0139, code lost:
        if (r9 != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0144, code lost:
        if (r7 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0057, code lost:
        if (X.1sd.A00(r4).A05(r1) == false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C255773uh r13) {
        /*
            r12 = this;
            X.4gh r7 = r12.A07
            r0 = r7
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r8 = r0.A0B
            X.6Yf r6 = r8.Bz3(r13)
            long r4 = android.os.SystemClock.uptimeMillis()
            long r2 = r6.A0P
            long r4 = r4 - r2
            double r0 = (double) r4
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r4
            r6.A00 = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r2
            double r2 = (double) r0
            com.instagram.common.session.UserSession r4 = r12.A01
            X.0Tu r5 = X.0Tu.A06
            r0 = 36603605377291203(0x820ac9000313c3, double:3.2116056592628396E-306)
            long r0 = X.182.A01(r5, r4, r0)
            int r5 = (int) r0
            double r0 = (double) r5
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x0037
            r0 = 1
            r6.A0n = r0
        L_0x0037:
            X.6YW r0 = X.AnonymousClass6YW.A00(r4)
            java.lang.String r3 = r13.A0k
            X.0xa r0 = r0.A01
            r9 = 0
            boolean r11 = r0.getBoolean(r3, r9)
            boolean r2 = r13.CWu()
            if (r2 == 0) goto L_0x0059
            X.1Xj r1 = r13.A0b
            if (r1 == 0) goto L_0x0059
            X.1se r0 = X.1sd.A00(r4)
            boolean r0 = r0.A05(r1)
            r10 = 1
            if (r0 != 0) goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            if (r2 == 0) goto L_0x0065
            X.1Xj r0 = r13.A0b
            if (r0 == 0) goto L_0x0065
            int r0 = r0.A00
            r5 = 1
            if (r0 != 0) goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            androidx.fragment.app.Fragment r2 = r12.A0A
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L_0x0092
            boolean r0 = r13.A1Y()
            if (r0 == 0) goto L_0x0092
            X.4gK r0 = r13.A0d
            r0.getClass()
            X.3Q2 r1 = r0.A00
            X.0qQ.A07(r1)
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r4)
            java.lang.String r1 = r1.A35
            X.0qQ.A0B(r1, r9)
            java.util.Map r0 = r0.A06
            boolean r0 = r0.containsKey(r1)
            r0 = r0 ^ 1
            r1 = 1
            if (r0 != 0) goto L_0x0093
        L_0x0092:
            r1 = 0
        L_0x0093:
            if (r10 != 0) goto L_0x014d
            if (r11 != 0) goto L_0x014d
            if (r5 == 0) goto L_0x0147
            java.lang.Integer r0 = X.AnonymousClass05K.A03
        L_0x009b:
            r6.A0W = r0
        L_0x009d:
            instagram.features.stories.fragment.ReelViewerFragment r0 = r12.A0B
            X.6fm r9 = r0.mViewPager
            r5 = 0
            if (r9 == 0) goto L_0x00bb
            r0 = r9
            X.6fl r0 = (X.C313046fl) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            int r1 = r0.A08
            int r0 = r8.A00()
            if (r1 >= r0) goto L_0x00bb
            X.6fl r9 = (X.C313046fl) r9
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r9.A04
            int r0 = r0.A08
            X.3mM r5 = r7.Bky(r0)
        L_0x00bb:
            X.3mM r7 = r7.Bl0(r3)
            boolean r0 = X.0qQ.A0K(r7, r5)
            r5 = r0 ^ 1
            if (r5 == 0) goto L_0x00cb
            r0 = -1
            r6.A0N = r0
        L_0x00cb:
            if (r7 == 0) goto L_0x013c
            com.instagram.model.reels.Reel r7 = r7.A0H
        L_0x00cf:
            X.6aI r8 = r12.A06
            if (r5 != 0) goto L_0x00da
            boolean r0 = r2.isResumed()
            r9 = 0
            if (r0 != 0) goto L_0x00db
        L_0x00da:
            r9 = 1
        L_0x00db:
            boolean r0 = r13.A1N()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0131
            X.6aL r5 = r8.A0B
            boolean r0 = r5.A01(r13, r6)
            if (r0 == 0) goto L_0x0131
            java.util.Map r1 = r8.A0I
            java.lang.String r0 = r13.CFY()
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0131
            boolean r0 = r13.A1P()
            if (r0 != 0) goto L_0x0139
            X.2pp r4 = r8.A07
            r2 = -1
            r4.A03(r13, r2)
            r4.A02(r13, r2)
            boolean r0 = r13.CcK()
            if (r0 == 0) goto L_0x0115
            java.lang.String r1 = "viewport"
            X.57G r0 = r4.A01
            if (r0 == 0) goto L_0x0115
            r0.A02(r13, r1)
        L_0x0115:
            if (r9 == 0) goto L_0x0131
            r4.A02(r7, r2)
        L_0x011a:
            java.util.Set r1 = r8.A0K
            java.lang.String r0 = r7.getId()
            r1.remove(r0)
            java.util.Map r1 = r8.A0J
            java.lang.String r0 = r7.getId()
            r1.remove(r0)
            java.util.Map r0 = r5.A00
            r0.remove(r3)
        L_0x0131:
            X.6cl r0 = r12.A00
            if (r0 == 0) goto L_0x0138
            r0.DMD(r13)
        L_0x0138:
            return
        L_0x0139:
            if (r9 == 0) goto L_0x0131
            goto L_0x011a
        L_0x013c:
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r4)
            com.instagram.model.reels.Reel r7 = r0.A0M(r3)
            if (r7 == 0) goto L_0x0131
            goto L_0x00cf
        L_0x0147:
            if (r1 == 0) goto L_0x009d
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            goto L_0x009b
        L_0x014d:
            boolean r0 = r13.CcK()
            if (r0 == 0) goto L_0x0157
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            goto L_0x009b
        L_0x0157:
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311476ck.A00(X.3uh):void");
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final void DVx(int i, int i2) {
        Integer num;
        if (i < i2) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A0C;
        }
        C270414gh r3 = this.A07;
        C250973mM Bky = r3.Bky(i2);
        if (Bky != null) {
            C255773uh A082 = Bky.A08(this.A01);
            if (r3.Bz3(A082).A0W == AnonymousClass05K.A15) {
                C309426Yf Bz3 = r3.Bz3(A082);
                Bz3.A0W = num;
                if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N) {
                    Bz3.A0q = true;
                }
            }
        }
    }

    public final void DhK(AnonymousClass3TF r2, float f, float f2) {
        AnonymousClass343 r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final void Dpz(int i, int i2) {
        if (i2 > i && i >= 0) {
            C270414gh r1 = this.A07;
            if (i < ((C310566bG) r1).A0B.A00() && r1.getItem(i) != null) {
                C250973mM r0 = (C250973mM) r1.getItem(i);
                0qQ.A0A(r0);
                Reel reel = r0.A0H;
                UserSession userSession = this.A01;
                if (!reel.A16(userSession)) {
                    if (reel.A1P) {
                        this.A06.A0C.A06.put("nux_story", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                    } else {
                        int size = reel.A0O(userSession).size();
                        for (int A032 = reel.A03(userSession); A032 < size; A032++) {
                            C255773uh A0A2 = reel.A0A(userSession, A032);
                            0qQ.A07(A0A2);
                            if (A0A2.CWu() && A0A2.A0b != null) {
                                C230262pI r12 = this.A06.A0C;
                                String id = reel.getId();
                                1Xj r02 = A0A2.A0b;
                                0qQ.A0A(r02);
                                String id2 = r02.getId();
                                C230262pI.A02(r02.A2A(userSession), id, id2, r12.A05, r02.A1A());
                            }
                        }
                    }
                    if (this.A05 == AnonymousClass3BQ.MAIN_FEED_TRAY) {
                        if (!182.A06(0Tu.A05, 1NM.A00(userSession).A00, 36317517609702653L)) {
                            reel.A1V = true;
                            System.currentTimeMillis();
                        }
                    }
                }
            }
        }
    }

    public final void onPause() {
        AnonymousClass343 r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final void onResume() {
        AnonymousClass343 r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
    }
}
