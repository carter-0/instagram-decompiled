package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$LIVE;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.video.live.mvvm.model.enums.IgLiveBroadcastType;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import com.instagram.video.live.streaming.common.BroadcastType;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.KfY  reason: case insensitive filesystem */
public final class C62423KfY extends LPE implements MTD {
    public static final long A0k = TimeUnit.SECONDS.toMillis(20);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Bitmap A06;
    public Bitmap A07;
    public SurfaceTexture A08;
    public Surface A09;
    public C21478XcN A0A;
    public C18594Vul A0B;
    public C18014Vjq A0C;
    public XPM A0D = new XPM();
    public C65816M0i A0E;
    public C66537MVr A0F;
    public LSQ A0G;
    public C65819M0l A0H;
    public C22371Y0z A0I;
    public Integer A0J;
    public Integer A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final AnonymousClass07i A0V;
    public final LNr A0W;
    public final C18078Vl7 A0X;
    public final AnonymousClass0iw A0Y;
    public final LGO A0Z;
    public final M0X A0a;
    public final LRP A0b;
    public final LBN A0c;
    public final C63937LDx A0d;
    public final MUT A0e;
    public final 0sP A0f;
    public final 0sJ A0g;
    public final C262224Cq A0h;
    public final boolean A0i;
    public final C63676L2m A0j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62423KfY(Context context, AnonymousClass07i r8, C18078Vl7 vl7, C340307l3 r10, AnonymousClass82X r11, AnonymousClass0iw r12, UserSession userSession, LGO lgo, M0X m0x, LRP lrp, LBN lbn, 0sP r18, 0sJ r19, C262224Cq r20, boolean z) {
        super(context, r10, r11, userSession);
        C51969G9p.A1N(userSession, 2, r11);
        this.A0Y = r12;
        this.A0V = r8;
        this.A0h = r20;
        this.A0a = m0x;
        this.A0b = lrp;
        this.A0c = lbn;
        this.A0U = z;
        this.A0X = vl7;
        this.A0Z = lgo;
        this.A0g = r19;
        this.A0f = r18;
        this.A0i = 182.A06(0Tu.A05, userSession, 36310886175998305L);
        Integer num = AnonymousClass05K.A00;
        this.A0J = num;
        this.A0K = num;
        this.A0O = true;
        this.A0L = 0sn.A00;
        this.A0e = new C65818M0k(userSession, this);
        long j = A0k;
        this.A0d = new C63937LDx(new C65814M0g(this), new MBH(this, 14), j);
        this.A0W = new LNr(new XZP(userSession));
        this.A0d.A00 = true;
        this.A0j = (C63676L2m) C64139LPo.A01(r12, userSession).A02.getValue();
        if (vl7 != null) {
            vl7.A05(new UUj(this, 4), "IgLiveStreamingController");
        }
    }

    public static final C65819M0l A00(C62423KfY kfY) {
        float A0M2;
        float A042;
        C65819M0l m0l = kfY.A0H;
        if (m0l != null) {
            return m0l;
        }
        Context context = kfY.A05;
        UserSession userSession = kfY.A07;
        String str = kfY.A0D.A0C;
        Pair pair = ((C18589Vug) LKG.A00(userSession).A01.getValue()).A07;
        if (pair == null) {
            A0M2 = (float) kfY.A02;
            A042 = (float) kfY.A03;
        } else {
            A0M2 = (float) AnonymousClass7TE.A0M(pair.second);
            Object obj = pair.first;
            0qQ.A06(obj);
            A042 = AnonymousClass7TE.A04(obj);
        }
        float f = (float) kfY.A0D.A0A;
        L5Y l5y = new L5Y(AnonymousClass7TE.A06(f, 0.5f) * 2, AnonymousClass7TE.A06(f * (A0M2 / A042), 0.5f) * 2);
        C340307l3 r6 = kfY.A06;
        C18014Vjq vjq = kfY.A0C;
        if (vjq == null) {
            0qQ.A0F("previewProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        C65819M0l m0l2 = new C65819M0l(context, r6, userSession, vjq, kfY.A0b, kfY.A0e, l5y, str, true);
        m0l2.A05 = kfY.A0D.A0K;
        kfY.A0H = m0l2;
        return m0l2;
    }

    public static final void A03(C21478XcN xcN, C62423KfY kfY, Integer num, String str, boolean z) {
        Integer num2;
        if (kfY.A0K == AnonymousClass05K.A0C) {
            C63937LDx lDx = kfY.A0d;
            if (!lDx.A00) {
                lDx.A00 = true;
                LSQ lsq = kfY.A0G;
                if (lsq != null) {
                    lsq.A04();
                }
                kfY.A04(xcN, z);
                M0X m0x = kfY.A0a;
                m0x.A0L.removeCallbacks(m0x.A0S);
                M0X.A09(m0x);
                int intValue = num.intValue();
                if (intValue == 1) {
                    num2 = AnonymousClass05K.A02;
                } else if (intValue == 2) {
                    num2 = AnonymousClass05K.A0Y;
                } else if (intValue != 4) {
                    num2 = AnonymousClass05K.A00;
                } else {
                    num2 = AnonymousClass05K.A05;
                }
                0qQ.A0B(num2, 0);
                if (num2 == AnonymousClass05K.A05) {
                    m0x.A0Y.incrementAndGet();
                }
                JTT.A1B(M0X.A03(m0x, AnonymousClass05K.A0u), LKE.A00(num2), str);
                kfY.A0L(num);
            }
        }
    }

    public static final void A05(L9N l9n, C62423KfY kfY) {
        W1D w1d = kfY.A09;
        w1d.A09.obtainMessage(2, l9n.A03, l9n.A02, (Object) null).sendToTarget();
        LKG.A00(kfY.A07).A01(new Pair(Integer.valueOf(l9n.A01), Integer.valueOf(l9n.A00)), (Pair) null, (Integer) null);
    }

    public static final void A06(BroadcastType broadcastType, C62423KfY kfY) {
        M0X m0x = kfY.A0a;
        String name = broadcastType.name();
        0qQ.A0B(name, 0);
        m0x.A09 = name;
        LKG.A00(kfY.A07).A00((Pair) null, (Pair) null, (VideoBroadcastVideoStreamingConfig) null, (Double) null, (Integer) null, (Integer) null, (Long) null, name);
        0qQ.A0B(broadcastType.toString(), 1);
    }

    public static final void A07(C62423KfY kfY) {
        Surface surface;
        IgLiveBroadcastType igLiveBroadcastType;
        String str;
        C62423KfY kfY2 = kfY;
        if (kfY2.A0K == AnonymousClass05K.A00) {
            Integer num = AnonymousClass05K.A01;
            kfY2.A0K = num;
            if (kfY2.A0i) {
                igLiveBroadcastType = IgLiveBroadcastType.RTC;
            } else {
                igLiveBroadcastType = IgLiveBroadcastType.RTMP_SWAP_ENABLED;
            }
            int i = kfY2.A03;
            int i2 = kfY2.A02;
            M0X m0x = kfY2.A0a;
            m0x.A01 = SystemClock.elapsedRealtime();
            1Ln A0U2 = C51965G9l.A0U(C51969G9p.A0d(m0x.A0N, "ig_broadcast_waterfall"), 195);
            A0U2.A0R("step", "broadcast_create_attempt");
            String A052 = m0x.A0Q.A05();
            0qQ.A07(A052);
            A0U2.A0R("waterfall_id", A052);
            A0U2.A0R("container_module", m0x.A0O.getModuleName());
            LRy.A02(m0x.A0K, A0U2);
            A0U2.Cgf();
            UserSession userSession = kfY2.A07;
            LBN lbn = kfY2.A0c;
            boolean z = lbn.A0D;
            String str2 = lbn.A0B;
            boolean z2 = lbn.A08;
            String str3 = lbn.A05;
            String str4 = lbn.A04;
            List list = lbn.A06;
            AnonymousClass3NV r11 = lbn.A02;
            boolean z3 = lbn.A09;
            boolean z4 = lbn.A07;
            long j = lbn.A0A;
            String A0g2 = AnonymousClass7TF.A0g(userSession);
            String str5 = lbn.A0C;
            1NY A0M2 = DbU.A0M(userSession);
            A0M2.A08(num);
            A0M2.A0A("live/create/");
            A0M2.A9m("broadcast_type", igLiveBroadcastType.name());
            if (z) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            A0M2.A9m(C273654mx.A00(311), str);
            A0M2.A9m(C273654mx.A00(3144), String.valueOf(i));
            A0M2.A9m(C273654mx.A00(3143), String.valueOf(i2));
            A0M2.A0H("user_pay_enabled", z2);
            A0M2.A9m("should_use_rsys_rtc_infra", "false");
            A0M2.A0C("source_type", 5);
            if (z3) {
                A0M2.A0E(C273654mx.A00(2346), Boolean.valueOf(z3));
            }
            if (str2.length() > 0) {
                A0M2.A9m("creator_geo_gating_info", str2);
            }
            A0M2.A0H("sup_active", z4);
            if (str3 != null) {
                A0M2.A9m(C273654mx.A00(2115), str3);
            }
            if (str4 != null) {
                A0M2.A9m(AnonymousClass000.A00(3199), str4);
            }
            if (!list.isEmpty()) {
                StringWriter A0v = JTO.A0v();
                17W A0e2 = C51970G9q.A0e(A0v);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    BrandedContentTag A0l = JTO.A0l(it);
                    A0l.A04 = false;
                    LJX.A00(A0e2, A0l);
                }
                A0M2.A9m("sponsor_tags", JTS.A0k(A0e2, A0v));
            }
            if (r11 != null) {
                A0M2.A09(r11.A00, "visibility");
            }
            if (j > 0) {
                A0M2.A0D("note_id", j);
            }
            if (str5 != null) {
                A0M2.A0G(AnonymousClass000.A00(1887), str5);
            }
            if (A0g2 != null) {
                A0M2.A9m("camera_session_id", A0g2);
            }
            1OC A0R2 = DbT.A0R((15p) null, A0M2, XPM.class, C21521Xdn.class, true);
            C61500KAf.A00(A0R2, kfY2, 43);
            1ES.A00(kfY2.A05, kfY2.A0V, A0R2);
        }
        if (!(kfY2.A0K == AnonymousClass05K.A0N || (surface = kfY2.A09) == null)) {
            kfY2.A09.A09.obtainMessage(1, surface).sendToTarget();
        }
        if (kfY2.A0G == null) {
            LSQ lsq = new LSQ(kfY2.A05, kfY2.A07, kfY2.A01, kfY2.A00);
            lsq.A0B = kfY2;
            kfY2.A0G = lsq;
        }
    }

    public static final void A08(C62423KfY kfY) {
        kfY.A0a.A0F("stop camera");
        C14693U1s u1s = kfY.A09.A09;
        u1s.sendMessageAtFrontOfQueue(u1s.obtainMessage(5));
        kfY.A08.A01();
    }

    public static final void A09(C62423KfY kfY, Exception exc, String str) {
        0KC.A0F("IgLiveStreamingController", 002.A0R("Rollback Live Swap: ", str), exc);
        M0X m0x = kfY.A0a;
        String message = exc.getMessage();
        0Aj A0d2 = C51969G9p.A0d(m0x.A0N, "ig_broadcast_waterfall");
        DbS.A1H(A0d2, "broadcast_liveswap_connect_to_mws_failed");
        JTS.A18(A0d2, m0x.A0Q);
        C51969G9p.A1A(A0d2, m0x.A0O);
        M0X.A05(A0d2, m0x, (float) m0x.A02);
        C51965G9l.A1I(A0d2, m0x.A0A);
        A0d2.AAJ("reason", str);
        A0d2.AAJ("error", message);
        A0d2.A9F(AnonymousClass000.A00(3878), C51971G9r.A0m());
        A0d2.Cgf();
        LRP lrp = kfY.A0b;
        0xF r4 = new 0xF();
        0xF.A00(r4, str, "info");
        0xF.A00(r4, "live_swap_failed", "eventName");
        0xF.A00(r4, lrp.A02.A06, "multiPartyLiveUserID");
        0xF.A00(r4, "ANDROID_BROADCASTER", "source");
        LRP.A00(r4, lrp, "multi_party_live_failure", "ERROR", "ANDROID_BROADCASTER");
        A06(BroadcastType.LIVESWAP_RTMP, kfY);
        C18594Vul.A01(kfY.A0B, exc);
        kfY.A0B = null;
        kfY.A0P = false;
        A0A(kfY, AnonymousClass05K.A0Y);
        C65819M0l m0l = kfY.A0H;
        if (m0l != null) {
            A01();
            m0l.ECT((C18594Vul) null, false);
            kfY.A0H = null;
        }
    }

    public static final void A0A(C62423KfY kfY, Integer num) {
        C63937LDx lDx = kfY.A0d;
        if ((lDx.A00 || kfY.A0S) && kfY.A0K == AnonymousClass05K.A0C && !kfY.A0Q && !kfY.A0O) {
            lDx.A00 = false;
            kfY.A0S = false;
            C61515KAu kAu = new C61515KAu(3, num, kfY);
            A01();
            C66537MVr mVr = kfY.A0F;
            if (mVr != null) {
                mVr.Eww(new C61515KAu(4, kAu, kfY));
            } else {
                kAu.A03(AnonymousClass7TE.A0z("mCurrentStreamingSession == NULL"));
            }
        }
    }

    public final C63687L2x A0I() {
        return new C63687L2x(AnonymousClass7TF.A1W(this.A0F, this.A0H));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J() {
        /*
            r4 = this;
            java.lang.Integer r0 = r4.A0K
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            if (r0 == r3) goto L_0x0030
            X.LDx r0 = r4.A0d
            android.os.Handler r1 = r0.A02
            java.lang.Runnable r0 = r0.A04
            r1.removeCallbacks(r0)
            boolean r0 = r4.A0T
            if (r0 == 0) goto L_0x0033
            X.LSQ r0 = r4.A0G
            if (r0 == 0) goto L_0x0031
            android.graphics.Bitmap r0 = r0.A04
        L_0x0019:
            r4.A06 = r0
            A08(r4)
        L_0x001e:
            X.LSQ r0 = r4.A0G
            if (r0 == 0) goto L_0x0025
            r0.A04()
        L_0x0025:
            r1 = 1
            X.KAt r0 = new X.KAt
            r0.<init>(r4, r1)
            r4.A04(r0, r1)
            r4.A0K = r3
        L_0x0030:
            return
        L_0x0031:
            r0 = 0
            goto L_0x0019
        L_0x0033:
            int r1 = r4.A03
            int r0 = r4.A01
            if (r1 != r0) goto L_0x0052
            int r1 = r4.A02
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0052
            X.W1D r1 = r4.A09
            r0 = 3
            X.KAw r2 = new X.KAw
            r2.<init>(r4, r0)
            X.U1s r1 = r1.A09
            r0 = 7
            android.os.Message r0 = r1.obtainMessage(r0, r2)
            r0.sendToTarget()
            goto L_0x001e
        L_0x0052:
            android.graphics.Bitmap r0 = r4.A07
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62423KfY.A0J():void");
    }

    public final void A0K(C18594Vul vul) {
        C66537MVr mVr;
        Bitmap bitmap;
        if (this.A0B != null) {
            0wb.A01.Ew0("IgLiveStreamingController", "Only one invite is allowed simultaneously.");
            vul.A03(new Exception("Only one invite is allowed simultaneously."));
            return;
        }
        C63687L2x A0I2 = A0I();
        if (A0I2.A00) {
            vul.A04(A0I2);
            return;
        }
        this.A0B = vul;
        if (this.A0T) {
            LSQ lsq = this.A0G;
            if (lsq != null) {
                bitmap = lsq.A04;
            } else {
                bitmap = null;
            }
            this.A07 = bitmap;
        } else {
            W1D w1d = this.A09;
            w1d.A09.obtainMessage(7, new C61517KAw(this, 5)).sendToTarget();
        }
        DLog.d(DLogTag$LIVE.INSTANCE, "Start LiveSwap", new Object[0]);
        M0X.A0A(this.A0a, AnonymousClass05K.A0V);
        if (!this.A0P && (mVr = this.A0F) != null && 0qQ.A0K(this.A0I, mVr)) {
            this.A0P = true;
            A03(new C61514KAt(this, 4), this, AnonymousClass05K.A0C, (String) null, false);
            A06(BroadcastType.LIVESWAP_TRANSITION_RSYS_INFRA, this);
        }
    }

    public final void A0L(Integer num) {
        M0X m0x;
        String str;
        Integer num2;
        String str2 = "null_reason";
        if (!this.A0d.A00 || this.A0P) {
            11Z.A02(new M5K(this));
            m0x = this.A0a;
            if (num != null) {
                str2 = C63491Kxv.A00(num);
            }
            str = "broadcast resumed";
        } else {
            if (num == null) {
                num2 = AnonymousClass05K.A00;
            } else {
                num2 = num;
            }
            11Z.A02(new M8D(this, num2));
            m0x = this.A0a;
            if (num != null) {
                str2 = C63491Kxv.A00(num);
            }
            str = "broadcast interrupted";
        }
        m0x.A0H(str, str2);
    }

    public final void A0M(boolean z, boolean z2) {
        0Aj A0d2;
        int i;
        if (this.A0T != z || z2) {
            this.A0T = z;
            if (z) {
                LSQ lsq = this.A0G;
                if (lsq != null && lsq.A0E) {
                    lsq.A04();
                }
                LSQ lsq2 = this.A0G;
                if (lsq2 != null) {
                    lsq2.A03 = this.A01;
                    lsq2.A02 = this.A00;
                    lsq2.A0A = (C21028XAh) 00k.A0J(this.A0L);
                    lsq2.A09 = AnonymousClass0t1.A01.A01(lsq2.A0J).A0D();
                    lsq2.A05 = null;
                    lsq2.A08 = null;
                    lsq2.A04 = null;
                }
                this.A08.A01();
                LSQ lsq3 = this.A0G;
                if (lsq3 != null) {
                    lsq3.A05(this.A09);
                }
            } else {
                this.A0S = true;
                LSQ lsq4 = this.A0G;
                if (lsq4 != null) {
                    lsq4.A04();
                }
                C14693U1s u1s = this.A09.A09;
                u1s.sendMessageAtFrontOfQueue(u1s.obtainMessage(4));
                C66537MVr mVr = this.A0F;
                if (mVr != null) {
                    mVr.EyB((C21478XcN) null, false);
                }
                A07(this);
            }
        }
        M0X m0x = this.A0a;
        m0x.A0F = z;
        long j = 0;
        C58840Ae r3 = m0x.A0N;
        if (z) {
            A0d2 = C51969G9p.A0d(r3, "ig_live_broadcast_video_toggled_off");
            i = 228;
        } else {
            A0d2 = C51969G9p.A0d(r3, "ig_live_broadcast_video_toggled_on");
            i = 229;
        }
        1Ln A0U2 = C51965G9l.A0U(A0d2, i);
        A0U2.A0R("view_mode", "host");
        A0U2.A0Q("a_pk", 00y.A0n(10, m0x.A0P.A06));
        String str = m0x.A08;
        if (str != null) {
            j = JTR.A0M(str);
        }
        M0X.A08(A0U2, m0x, j);
        1ES.A03(LTC.A03(this.A07, JTP.A0j(z ? 1 : 0), this.A0D.A0C));
    }

    public final void Cr7(C21028XAh xAh) {
        C66537MVr mVr = this.A0F;
        if (mVr != null) {
            mVr.Cr5(xAh);
        }
    }

    public static final void A01() {
        if (!0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            throw DbT.A0m();
        }
    }

    public static final void A02(LiveStreamingError liveStreamingError, BroadcastFailureType broadcastFailureType, C62423KfY kfY) {
        kfY.A0J();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("endBroadcastWithFailure(");
        A1A.append(broadcastFailureType);
        0KC.A0D("IgLiveStreamingController", AnonymousClass7TG.A0m(liveStreamingError, "): ", A1A));
        M0X m0x = kfY.A0a;
        int i = liveStreamingError.errorCode;
        String str = liveStreamingError.domain;
        if (str == null) {
            str = "";
        }
        m0x.A0C(i, str, liveStreamingError.reason, liveStreamingError.description, liveStreamingError.fullDescription);
        LNr lNr = kfY.A0W;
        LiveStreamingError liveStreamingError2 = liveStreamingError.innerError;
        if (liveStreamingError2 == null) {
            liveStreamingError2 = liveStreamingError;
        }
        lNr.A01("started", "failed", "broadcast_session_failed", 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("error_class", liveStreamingError.domain), AnonymousClass7TE.A1L(TraceFieldType.ErrorCode, String.valueOf(liveStreamingError.errorCode)), AnonymousClass7TE.A1L("error_message", liveStreamingError.reason), AnonymousClass7TE.A1L(Pxd.A00(85), liveStreamingError.fullDescription), AnonymousClass7TE.A1L("inner_error_class", liveStreamingError2.domain), AnonymousClass7TE.A1L("inner_error_code", String.valueOf(liveStreamingError2.errorCode)), AnonymousClass7TE.A1L("inner_error_message", liveStreamingError2.reason), AnonymousClass7TE.A1L("inner_error_trace", liveStreamingError2.fullDescription)}).toString());
        if (!kfY.A0N) {
            kfY.A0N = true;
            11Z.A02(new M9H(liveStreamingError, broadcastFailureType, kfY));
        }
    }

    private final void A04(C21478XcN xcN, boolean z) {
        A01();
        this.A0a.A0F("stop encoding");
        C14693U1s u1s = this.A09.A09;
        u1s.sendMessageAtFrontOfQueue(u1s.obtainMessage(4));
        this.A0A = new C61513KAs(xcN, this, z);
    }

    public final void A0C() {
        super.A0C();
        A0J();
    }
}
