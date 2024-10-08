package X;

import android.content.Context;
import android.os.Looper;
import android.widget.AbsListView;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6VJ  reason: invalid class name */
public final class AnonymousClass6VJ extends AnonymousClass1GX implements AbsListView.OnScrollListener, AnonymousClass1MK, AnonymousClass3PN, AnonymousClass2hC {
    public static final long A0H;
    public static final long A0I;
    public long A00;
    public 1NW A01;
    public C2366434n A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public final UserSession A0C;
    public final Reel A0D;
    public final AnonymousClass6VI A0E;
    public final AnonymousClass3PP A0F;
    public final Context A0G;

    public static void A02(AnonymousClass6VJ r5) {
        boolean z = true;
        r5.A08 = true;
        UserSession userSession = r5.A0C;
        if (!182.A06(0Tu.A05, userSession, 36329732492771625L) || !r5.A03.equals("feed_timeline")) {
            z = false;
        }
        AnonymousClass6W5 r1 = new AnonymousClass6W5(r5);
        0qQ.A0B(userSession, 0);
        C227912kJ.A01(userSession, (Long) null, (C62320sa) null, r1, z);
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(2);
        A0I = timeUnit.toMillis(5);
        A0H = timeUnit.toMillis(20);
    }

    private void A00() {
        C255773uh A092;
        Reel reel = this.A0D;
        UserSession userSession = this.A0C;
        if (!reel.A15(userSession) && (A092 = new C250973mM(userSession, reel).A09(userSession)) != null && A092.A1m()) {
            AnonymousClass3WR A0M = A092.A0M(userSession);
            Context context = this.A0G;
            if (A0M != null && context != null) {
                AnonymousClass4U8 r1 = new AnonymousClass4U8(context, userSession, A0M, this.A03);
                r1.A02 = true;
                AnonymousClass4UA.A00(r1.A00());
            }
        }
    }

    public static void A01(AnonymousClass6VJ r6) {
        String str;
        if (r6.A07) {
            UserSession userSession = r6.A0C;
            if (!182.A06(0Tu.A05, userSession, 36317517606950112L) || !2Ob.A00(r6.A03, "feed_timeline")) {
                str = r6.A03;
            } else {
                str = "reel_feed_timeline";
            }
            0qQ.A0B(userSession, 0);
            AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
            r0.A01 = str;
            1Ln A0D2 = 1Ln.A0D(r0.A00());
            if (A0D2.A00.isSampled()) {
                A0D2.A0R(DatePickerDialogModule.ARG_MODE, "story_viewer_fetch");
                A0D2.A0Q("time_elapsed", Long.valueOf(System.currentTimeMillis() - r6.A00));
                A0D2.A0n(str);
                A0D2.A0Q("version", 4L);
                A0D2.A0Q("spinner_position", Long.valueOf((long) r6.A0B));
                A0D2.Cgf();
            }
        }
        r6.A07 = false;
        r6.A01.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        if (r2.startsWith(r1) != false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(boolean r11) {
        /*
            r10 = this;
            com.instagram.model.reels.Reel r7 = r10.A0D
            com.instagram.common.session.UserSession r4 = r10.A0C
            boolean r0 = r7.A15(r4)
            r6 = 0
            if (r0 == 0) goto L_0x001c
            boolean r0 = r7.A0z(r4)
            if (r0 == 0) goto L_0x001c
            android.content.Context r1 = r10.A0G
            java.lang.String r0 = "preloadFirstImage_error"
            X.C59689JTv.A0A(r1, r0)
            r7.A0R(r4)
        L_0x001b:
            return
        L_0x001c:
            X.3mM r0 = new X.3mM
            r0.<init>(r4, r7)
            X.3uh r9 = r0.A09(r4)
            X.34n r1 = r10.A02
            r1.A02(r7, r9, r11)
            boolean r0 = r10.A08
            if (r0 != 0) goto L_0x0044
            boolean r0 = r9.A16()
            if (r0 != 0) goto L_0x0040
            boolean r0 = r9.A17()
            if (r0 != 0) goto L_0x0040
            boolean r0 = r7.A18(r4)
            if (r0 == 0) goto L_0x0044
        L_0x0040:
            A02(r10)
            return
        L_0x0044:
            android.content.Context r0 = r10.A0G
            com.instagram.common.typedurl.ImageUrl r5 = r9.A08(r0)
            if (r5 != 0) goto L_0x0066
            X.0wj r2 = X.0wj.A01
            r1 = 817899688(0x30c028a8, float:1.3981394E-9)
            java.lang.String r0 = "ReelPreloadLauncher"
            X.0f9 r2 = r2.AEf(r0, r1)
            X.3mL r0 = r9.A0e
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "reel_preload_first_image_unexpected_reel_type"
            r2.ABQ(r0, r1)
            r2.report()
            goto L_0x0040
        L_0x0066:
            r8 = 1
            r10.A09 = r8
            X.34o r0 = r1.A01
            X.34p r1 = r0.A04
            r0 = 0
            r1.A08(r0)
            X.6VC r0 = X.AnonymousClass6VB.A00(r4)
            r0.A0C(r9, r8)
            X.1NK r3 = X.1NK.A00()
            java.lang.String r2 = r10.A03
            java.lang.String r1 = "feed_timeline"
            boolean r0 = r2.startsWith(r1)
            if (r0 != 0) goto L_0x008e
            java.lang.String r1 = "search"
            boolean r0 = r2.startsWith(r1)
            if (r0 == 0) goto L_0x008f
        L_0x008e:
            r2 = r1
        L_0x008f:
            X.1OO r5 = r3.A0J(r5, r2)
            r9.A02()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36612470189660499(0x8212d900011953, double:3.2172118023009166E-306)
            long r3 = X.182.A01(r2, r4, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a8
            r8 = 0
        L_0x00a8:
            r5.A0M = r8
            r5.A0I = r6
            r5.A02(r10)
            java.lang.String r0 = r7.getId()
            r5.A08 = r0
            r5.A01()
            boolean r0 = r10.A08
            if (r0 != 0) goto L_0x001b
            r10.A09 = r6
            X.6VI r0 = r10.A0E
            r0.onStart()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VJ.A03(boolean):void");
    }

    public final /* bridge */ /* synthetic */ void A04() {
        UserSession userSession;
        if (!this.A07) {
            this.A07 = true;
            this.A00 = System.currentTimeMillis();
            Reel reel = this.A0D;
            if (reel.A0d()) {
                C270194gL r0 = reel.A0H;
                r0.getClass();
                UserSession userSession2 = this.A0C;
                AnonymousClass3WR A042 = r0.A04(userSession2);
                if (A042 != null) {
                    C255593uO.A00(userSession2).A01(new C256203vO(A042, this.A03));
                }
            }
            1NW r6 = this.A01;
            long j = A0I;
            r6.A02(new AnonymousClass6VK(this, j), 736949603, j);
            long j2 = A0H;
            r6.A02(new AnonymousClass6VK(this, j2), 736949603, j2);
            if (!this.A06) {
                userSession = this.A0C;
                if (AnonymousClass3PQ.A05(userSession, reel, this.A04)) {
                    this.A02.A01.A03.A08((String) null);
                    A03(true);
                    A00();
                    r6.A02(new AnonymousClass6VL(this), 736949603, 182.A01(0Tu.A05, userSession, 36612470189594962L));
                }
            }
            HashMap hashMap = new HashMap();
            this.A02.A01.A03.A08((String) null);
            userSession = this.A0C;
            AnonymousClass6VC A002 = AnonymousClass6VB.A00(userSession);
            String id = reel.getId();
            0qQ.A0B(id, 0);
            Long A012 = AnonymousClass6VC.A01(A002, id, (String) null);
            if (A012 != null) {
                A002.A00.flowMarkPoint(A012.longValue(), "json_early_fetch_start");
            }
            String str = this.A04;
            if (str != null) {
                hashMap.put("media_id", str);
            }
            if (this.A06) {
                hashMap.put("force_load_from_network", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            if (this.A0A) {
                hashMap.put("obfuscate_request", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            this.A0E.onStart();
            AnonymousClass3PP r3 = this.A0F;
            r3.A02(AnonymousClass3BU.ON_TAP, reel.getId(), this.A03, hashMap);
            r3.A05(this, reel.getId(), this.A04, this.A06);
            r6.A02(new AnonymousClass6VL(this), 736949603, 182.A01(0Tu.A05, userSession, 36612470189594962L));
        }
    }

    public final void A05(Integer num) {
        int A032;
        String str;
        if (this.A07) {
            C2366434n r1 = this.A02;
            Reel reel = this.A0D;
            r1.A04(reel, C70304O1i.A00(num));
            AnonymousClass6VC A002 = AnonymousClass6VB.A00(this.A0C);
            0qQ.A0B(reel, 0);
            UserSession userSession = A002.A01;
            if (reel.A0O(userSession).isEmpty()) {
                A032 = -1;
            } else {
                A032 = reel.A03(userSession);
            }
            C255773uh A0B2 = reel.A0B(userSession, A032);
            String id = reel.getId();
            0qQ.A07(id);
            if (A0B2 != null) {
                str = AnonymousClass6VC.A02(A0B2);
            } else {
                str = null;
            }
            Long A012 = AnonymousClass6VC.A01(A002, id, str);
            if (A012 != null) {
                A002.A00.flowEndCancel(A012.longValue(), C70304O1i.A00(num));
            }
        }
        this.A05 = true;
        A01(this);
        this.A0E.onCancel();
        this.A0F.A04(this, this.A0D.getId());
    }

    public final void CyF(C226952iF r7, AnonymousClass3LX r8) {
        C255773uh A092;
        if (!this.A05) {
            UserSession userSession = this.A0C;
            Reel reel = this.A0D;
            C250973mM r1 = new C250973mM(userSession, reel);
            if (!r1.A0E(userSession) && (A092 = r1.A09(userSession)) != null) {
                AnonymousClass6VB.A00(userSession).A0D(A092, true);
            }
            C2366434n r4 = this.A02;
            boolean z = this.A09;
            0qQ.A0B(reel, 0);
            MarkerEditor withMarker = r4.A00.withMarker(17301505, reel.getId().hashCode());
            withMarker.annotate("media_loaded_from_cache", String.valueOf(z));
            withMarker.point("REEL_MEDIA_RECEIVED");
            withMarker.markerEditingCompleted();
            C2366534o r0 = r4.A01;
            r0.A0K("media_loaded_from_cache", z);
            C2366634p r02 = r0.A04;
            if (z) {
                r02.A02();
            } else {
                r02.A05();
            }
            if (!this.A08) {
                A02(this);
            }
        }
    }

    public final void DJx(C226952iF r7, C254673sr r8) {
        C255773uh A092;
        if (!this.A05) {
            UserSession userSession = this.A0C;
            C250973mM r1 = new C250973mM(userSession, this.A0D);
            if (!r1.A0E(userSession) && (A092 = r1.A09(userSession)) != null) {
                AnonymousClass6VC A002 = AnonymousClass6VB.A00(userSession);
                String str = A092.A0k;
                0qQ.A07(str);
                Long A012 = AnonymousClass6VC.A01(A002, str, AnonymousClass6VC.A02(A092));
                if (A012 != null) {
                    long longValue = A012.longValue();
                    1QP r12 = A002.A00;
                    r12.flowMarkPoint(longValue, "media_early_fetch_fail");
                    r12.flowAnnotate(longValue, TraceFieldType.FailureReason, "media_early_fetch_fail");
                }
            }
            A01(this);
            this.A0E.DEU(this.A00);
        }
    }

    public final void DK4(C226952iF r9, int i) {
        UserSession userSession = this.A0C;
        long A012 = 182.A01(0Tu.A06, userSession, 36612470189660499L);
        if (!this.A05 && !this.A08 && A012 >= 0 && ((long) i) >= A012) {
            182.A01(0Tu.A05, userSession, 36612470189660499L);
            A02(this);
        }
    }

    public final void DOW(String str, boolean z) {
        if (!this.A05) {
            Reel reel = this.A0D;
            UserSession userSession = this.A0C;
            boolean A15 = reel.A15(userSession);
            AnonymousClass6VC A002 = AnonymousClass6VB.A00(userSession);
            String id = reel.getId();
            0qQ.A0B(id, 0);
            Long A012 = AnonymousClass6VC.A01(A002, id, (String) null);
            if (A15) {
                if (A012 != null) {
                    long longValue = A012.longValue();
                    1QP r1 = A002.A00;
                    r1.flowMarkPoint(longValue, "json_early_fetch_fail");
                    r1.flowAnnotate(longValue, TraceFieldType.FailureReason, "json_early_fetch_fail");
                }
                A01(this);
                this.A0E.DEU(this.A00);
                return;
            }
            if (A012 != null) {
                A002.A00.flowMarkPoint(A012.longValue(), "json_early_fetch_success");
            }
            A03(z);
            A00();
        }
    }

    public final void DS7(C226952iF r2, AnonymousClass3LX r3) {
        if (!this.A08 && !this.A05) {
            A02(this);
        }
    }

    public AnonymousClass6VJ(Context context, UserSession userSession, Reel reel, AnonymousClass6VI r6, AnonymousClass3PP r7, String str, int i) {
        this.A0G = context;
        this.A0F = r7;
        this.A0D = reel;
        this.A0C = userSession;
        this.A0E = r6;
        this.A03 = str;
        this.A0B = i;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.A01 = new 1NW(myLooper);
        this.A02 = C2366334m.A00(userSession);
    }

    public final void DOJ(String str) {
        A01(this);
        if (!this.A05) {
            AnonymousClass6VC A002 = AnonymousClass6VB.A00(this.A0C);
            String id = this.A0D.getId();
            0qQ.A0B(id, 0);
            Long A012 = AnonymousClass6VC.A01(A002, id, (String) null);
            if (A012 != null) {
                long longValue = A012.longValue();
                1QP r1 = A002.A00;
                r1.flowMarkPoint(longValue, "json_early_fetch_fail");
                r1.flowAnnotate(longValue, TraceFieldType.FailureReason, "json_early_fetch_fail");
            }
            this.A0E.DEU(this.A00);
        }
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int A032 = AnonymousClass0fD.A03(659361416);
        A05(AnonymousClass05K.A00);
        AnonymousClass0fD.A0A(2106717625, A032);
    }
}
