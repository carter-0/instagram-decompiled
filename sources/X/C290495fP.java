package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5fP  reason: invalid class name and case insensitive filesystem */
public abstract class C290495fP {
    public YAA A00;
    public Collection A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final Uri A06;
    public final Handler A07;
    public final 28X A08;
    public final C257173wy A09;
    public final VpsEventCallback A0A;
    public final C257063wn A0B;
    public final C22299Xz9 A0C;
    public final 28Y A0D;
    public final Object A0E = new Object();
    public final String A0F;
    public final AtomicInteger A0G = new AtomicInteger(0);
    public final AnonymousClass27J A0H;
    public final boolean A0I;
    public final boolean A0J;
    public volatile Integer A0K = AnonymousClass05K.A0j;
    public volatile boolean A0L = true;
    public volatile boolean A0M;

    public C290495fP(Context context, Uri uri, Handler handler, 28X r34, AnonymousClass27J r35, VpsEventCallback vpsEventCallback, C257063wn r37, 28Y r38, HeroPlayerSetting heroPlayerSetting, String str, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int i2;
        int i3;
        int i4 = i;
        this.A0J = z2;
        HeroPlayerSetting heroPlayerSetting2 = heroPlayerSetting;
        String str2 = str;
        C257063wn r10 = r37;
        VpsEventCallback vpsEventCallback2 = vpsEventCallback;
        boolean z7 = z3;
        long j2 = j;
        AtomicBoolean atomicBoolean3 = atomicBoolean2;
        C257173wy r5 = new C257173wy((28m) null, vpsEventCallback2, C252463p9.LIVE_MANIFEST, new C257153ww(), r10, (AnonymousClass27W) null, (String) null, str2, 28N.A00.A01(), (String) null, (String) null, atomicBoolean, atomicBoolean3, j2, false, false, false, z7, z4, z5, false, heroPlayerSetting2.A2U, z6);
        this.A09 = r5;
        r5.A16 = heroPlayerSetting2.A3B;
        this.A0C = new C22299Xz9(r5);
        this.A05 = context;
        this.A0B = r10;
        this.A0F = str2;
        this.A06 = uri;
        this.A0I = z;
        this.A02 = i <= 0 ? heroPlayerSetting2.A0J : i4;
        Map map2 = map;
        if (map2.containsKey("dash.live_num_segments_prefetch")) {
            i2 = Integer.parseInt((String) map2.get("dash.live_num_segments_prefetch"));
        } else {
            i2 = 3;
        }
        this.A04 = i2;
        this.A0D = r38;
        this.A01 = null;
        this.A0A = vpsEventCallback2;
        this.A07 = handler;
        if (map2.containsKey("dash.live_prefetch_max_retries")) {
            i3 = Integer.parseInt((String) map2.get("dash.live_prefetch_max_retries"));
        } else {
            i3 = 0;
        }
        this.A03 = i3;
        this.A08 = r34;
        this.A0H = r35;
    }

    public final void A00() {
        boolean z;
        boolean z2;
        Collection collection;
        if (this.A0J) {
            synchronized (this) {
                z = false;
                if (!this.A0M) {
                    Integer num = this.A0K;
                    Integer num2 = AnonymousClass05K.A01;
                    boolean z3 = false;
                    if (num == num2 && (collection = this.A01) != null) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C21467Xbz) it.next()).A01 != num2) {
                                    break;
                                }
                            } else {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    if (z3) {
                        this.A0M = true;
                        z = true;
                    } else {
                        Integer num3 = this.A0K;
                        Integer num4 = AnonymousClass05K.A0C;
                        if (num3 == num4 || this.A0K == AnonymousClass05K.A0Y) {
                            this.A0M = true;
                        } else {
                            Collection collection2 = this.A01;
                            if (collection2 != null) {
                                Iterator it2 = collection2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((C21467Xbz) it2.next()).A01 == num4) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    z2 = z;
                    z = this.A0M;
                } else {
                    z2 = false;
                }
            }
            if (z) {
                this.A0A.callback(new C257323xD(this.A0B.A07, z2));
            }
        }
    }

    public final void A01(Integer num) {
        synchronized (this.A0E) {
            this.A0K = num;
        }
        A00();
    }

    public final void A02(boolean z) {
        C290485fO r2 = (C290485fO) this;
        synchronized (r2.A0E) {
            Integer num = r2.A0K;
            Integer num2 = AnonymousClass05K.A00;
            if (num != num2 && r2.A0K != AnonymousClass05K.A01) {
                r2.A0K = num2;
                Uri uri = r2.A06;
                27B.A01("Exo2DashLiveManifestFetcher", "Manifest single load requested, uri=%s", new Object[]{uri});
                C257063wn r4 = r2.A0B;
                C257223x3 r7 = new C257223x3(r4.A03, z, r4.A04);
                C257263x7 r42 = C257263x7.A0B;
                C257263x7 r41 = new C257263x7(uri, new C257253x6(C257243x5.A02, r7, "", (String) null, (String) null, (String) null, "", "", (String) null, (Map) null, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, false, false, false, false, false), (String) null, Collections.emptyMap(), (byte[]) null, 1, 0, 0, 0, -1);
                r2.A04.A01(r2.A05.getMainLooper(), r2, new Xz7(r2.A03.ALo(), new C257263x7(uri, 1, 0), r2.A02, 4), 1);
                r2.A0C.A00(r41);
            }
        }
    }
}
