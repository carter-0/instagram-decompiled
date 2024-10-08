package X;

import android.content.Context;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.6gE  reason: invalid class name and case insensitive filesystem */
public final class C313306gE {
    public C234462xu A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final C313316gF A06;
    public final C273454mb A07;
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new C377209Ky(this, 48));
    public final UserSession A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public static final void A00(C313306gE r5, String str) {
        r5.A04 = true;
        C313316gF r3 = r5.A06;
        C17509VYn vYn = (C17509VYn) r3.A04.A02.get(str);
        if (vYn != null) {
            C234502xy r1 = vYn.A01;
            if (r1.CKF()) {
                if (!r3.A00) {
                    r3.A00 = true;
                    vYn.A03.CiQ();
                }
                r1.E2p();
            }
        }
    }

    public final void A01() {
        C17509VYn vYn;
        if (this.A04) {
            this.A04 = false;
            String str = this.A01;
            if (str != null && (vYn = (C17509VYn) this.A06.A04.A02.get(str)) != null) {
                C234502xy r1 = vYn.A01;
                if (r1.CKF()) {
                    r1.pause();
                }
            }
        }
    }

    public final void A02() {
        C313316gF r6 = this.A06;
        C313326gG r5 = r6.A04;
        Map map = r5.A02;
        for (String str : 00k.A0a(map.keySet())) {
            0qQ.A0B(str, 0);
            C17509VYn vYn = (C17509VYn) map.get(str);
            if (vYn != null) {
                r5.A01(str);
                vYn.A03.CiI();
                r6.A00 = false;
            }
        }
        r5.A00();
    }

    public final void A03() {
        C313326gG r2 = this.A06.A04;
        for (String A012 : 00k.A0a(r2.A02.keySet())) {
            r2.A01(A012);
        }
    }

    public final void A04() {
        if (this.A03) {
            A01();
            String str = this.A01;
            if (str != null) {
                C313316gF r3 = this.A06;
                C313326gG r1 = r3.A04;
                C17509VYn vYn = (C17509VYn) r1.A02.get(str);
                if (vYn != null) {
                    r1.A01(str);
                    vYn.A03.CiI();
                    r3.A00 = false;
                }
            }
            this.A01 = null;
            this.A03 = false;
        }
    }

    public final void A05(float f) {
        String str = this.A01;
        if (str != null) {
            C313316gF r2 = this.A06;
            C17509VYn vYn = (C17509VYn) r2.A04.A02.get(str);
            if (vYn != null) {
                C234502xy r1 = vYn.A01;
                if (r1.CKF()) {
                    if (r2.A08) {
                        f = 0.0f;
                    }
                    r1.Eqq(f);
                }
            }
        }
    }

    public final void A06(int i) {
        C17509VYn vYn;
        String str = this.A01;
        if (str != null && (vYn = (C17509VYn) this.A06.A04.A02.get(str)) != null) {
            C234502xy r1 = vYn.A01;
            if (r1.CKF()) {
                r1.seekTo(i);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [X.V3Z, java.lang.Object] */
    public final void A07(XB5 xb5, C315536k3 r47, String str, boolean z) {
        int i;
        long j;
        String str2;
        C17273VPa vPa;
        Long A0n;
        Long A0n2;
        C273454mb r10 = this.A07;
        boolean Erz = r10.Erz();
        Long Bz0 = xb5.Bz0();
        if (Bz0 != null) {
            i = (int) Bz0.longValue();
        } else {
            i = 0;
        }
        if (Erz) {
            i *= IgNetworkConsentStorage.MAX_ENTRIES;
        }
        UserSession userSession = this.A09;
        String str3 = this.A0B;
        Context context = this.A05;
        C234462xu r3 = this.A00;
        long j2 = 0;
        String str4 = str;
        if (str == null || (A0n2 = 00y.A0n(10, str4)) == null) {
            j = 0;
        } else {
            j = A0n2.longValue();
        }
        String str5 = this.A0A;
        String id = xb5.getId();
        if (!(id == null || (A0n = 00y.A0n(10, id)) == null)) {
            j2 = A0n.longValue();
        }
        boolean z2 = false;
        if (xb5.BhY() != null) {
            z2 = true;
        }
        Long AzI = xb5.AzI();
        0sn Afe = xb5.Afe();
        if (Afe == null) {
            Afe = 0sn.A00;
        }
        boolean z3 = this.A0C;
        MusicDataSource A002 = C55162HdE.A00(xb5);
        C313316gF r5 = this.A06;
        C313326gG r7 = r5.A04;
        Map map = r7.A01;
        if (map.isEmpty()) {
            C234502xy A012 = C234472xv.A01(context, userSession, (AnonymousClass4DU) null, r3, "PlayerPoolHandler", true, z3, false, false);
            String obj = UUID.randomUUID().toString();
            0qQ.A07(obj);
            map.put(obj, A012);
        }
        if (!(!map.isEmpty()) || (str2 = (String) 00k.A0A(map.keySet())) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C234502xy r4 = (C234502xy) map.remove(str2);
        if (r4 != null) {
            Long valueOf = Long.valueOf(j);
            String str6 = userSession.A06;
            Long valueOf2 = Long.valueOf(j2);
            Long valueOf3 = Long.valueOf(((long) i) / 1000);
            0Tu r9 = 0Tu.A05;
            UserSession userSession2 = userSession;
            C21044XAx A003 = C55161HdD.A00(userSession2, valueOf, valueOf2, AzI, valueOf3, str6, str5, str3, Afe, z2, 182.A06(r9, userSession, 36314721581927183L));
            if (182.A06(r9, userSession, 36320541262881355L)) {
                vPa = new C17273VPa(r4);
            } else {
                vPa = null;
            }
            ? obj2 = new Object();
            obj2.A00 = vPa;
            obj2.A01 = new GVI(new C19827Wg8(obj2, A003, r10), 100);
            r7.A02.put(str2, new C17509VYn(r4, obj2, A003, AnonymousClass05K.A00));
        }
        boolean z4 = this.A02;
        C17509VYn vYn = (C17509VYn) r7.A02.get(str2);
        if (vYn != null) {
            C234502xy r12 = vYn.A01;
            C21044XAx xAx = vYn.A03;
            boolean A004 = C255613uQ.A00(r5.A03, (Integer) null, z4, false);
            xAx.EP8(A004);
            xAx.CiP();
            float f = 0.0f;
            if (A004) {
                f = 1.0f;
            }
            r12.Eqq(f);
            r12.ETw(A002, new WZF(r47, vYn), (String) null, i, -1, (int) r5.A02, false, r5.A07);
            xAx.CiG();
        }
        this.A03 = true;
        this.A01 = str2;
        if (z) {
            A00(this, str2);
        }
    }

    public final boolean A08() {
        C17509VYn vYn;
        String str = this.A01;
        if (str == null || (vYn = (C17509VYn) this.A06.A04.A02.get(str)) == null) {
            return false;
        }
        return vYn.A01.isPlaying();
    }

    public C313306gE(Context context, UserSession userSession, C273454mb r6, String str, String str2) {
        this.A09 = userSession;
        this.A05 = context;
        this.A0B = str;
        this.A07 = r6;
        this.A0A = str2;
        this.A06 = new C313316gF(userSession);
        this.A00 = new C234462xu(context, userSession);
        this.A0C = 182.A06(0Tu.A05, userSession, 36320541263536723L);
    }
}
