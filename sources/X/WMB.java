package X;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class WMB implements C265114Sp {
    public int A00;
    public Handler A01;
    public Looper A02;
    public WM9 A03;
    public C21005X9c A04;
    public C264894Rs A05;
    public final long A06 = 300000;
    public final WM6 A07 = new WM6(this);
    public final List A08 = new ArrayList();
    public final Set A09 = Collections.newSetFromMap(new IdentityHashMap());
    public final Set A0A = Collections.newSetFromMap(new IdentityHashMap());
    public final UUID A0B;
    public final int[] A0C;
    public final WM7 A0D = new WM7(this);
    public final X30 A0E;
    public final C13460Tan A0F;
    public final C265084Sm A0G;
    public final String A0H;
    public final HashMap A0I;
    public volatile C14690U1p A0J;

    public final C290325f8 A7H(C256683wB r4, C265184Sw r5) {
        boolean z = false;
        A04(false);
        if (this.A00 > 0) {
            z = true;
        }
        C256703wD.A04(z);
        Looper looper = this.A02;
        C256703wD.A01(looper);
        return A01(looper, r4, this, r5, true);
    }

    public final int At6(C256683wB r7) {
        A04(false);
        C21005X9c x9c = this.A04;
        x9c.getClass();
        int At5 = x9c.At5();
        DrmInitData drmInitData = r7.A0O;
        if (drmInitData == null) {
            2Kn.A00(r7.A0W);
            return 0;
        }
        UUID uuid = this.A0B;
        if (A02(drmInitData, uuid, true).isEmpty()) {
            if (drmInitData.A01 == 1 && drmInitData.A03[0].A00(AnonymousClass4T7.A01)) {
                2AG.A04("DefaultDrmSessionMgr", AnonymousClass7TG.A0m(uuid, "DrmInitData only contains common PSSH SchemeData. Assuming support for: ", new StringBuilder()));
            }
            return 1;
        }
        String str = drmInitData.A02;
        if (str == null || "cenc".equals(str) || "cbcs".equals(str)) {
            return At5;
        }
        if ("cbc1".equals(str) || "cens".equals(str)) {
            return 1;
        }
        return At5;
    }

    public final void E3m() {
        A04(true);
        int i = this.A00;
        this.A00 = i + 1;
        if (i != 0) {
            return;
        }
        if (this.A04 == null) {
            C21005X9c A7F = this.A0E.A7F(this.A0B);
            this.A04 = A7F;
            A7F.EeO(new WMC(this));
            if (!2BY.A02(2BQ.A1H)) {
                String str = this.A0H;
                if (!str.isEmpty()) {
                    try {
                        this.A04.EhO("securityLevel", str);
                    } catch (Exception unused) {
                        2AG.A03("DefaultDrmSessionMgr", "Failed to set securityLevel property for defaultDrmSessionManager");
                    }
                }
            }
        } else if (this.A06 != -9223372036854775807L) {
            int i2 = 0;
            while (true) {
                List list = this.A08;
                if (i2 < list.size()) {
                    ((WM9) list.get(i2)).A7C((C265184Sw) null);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void Eg4(Looper looper, C264894Rs r4) {
        synchronized (this) {
            Looper looper2 = this.A02;
            if (looper2 == null) {
                this.A02 = looper;
                this.A01 = new Handler(looper);
            } else {
                C256703wD.A04(AnonymousClass7TF.A1W(looper2, looper));
                this.A01.getClass();
            }
        }
        this.A05 = r4;
    }

    public final void release() {
        A04(true);
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            if (this.A06 != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.A08);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((WM9) arrayList.get(i2)).ECN((C265184Sw) null);
                }
            }
            C249803kO it = ImmutableSet.A03(this.A0A).iterator();
            while (it.hasNext()) {
                ((WMA) it.next()).release();
            }
            A03(this);
        }
    }

    private WM9 A00(C265184Sw r18, List list) {
        this.A04.getClass();
        UUID uuid = this.A0B;
        C21005X9c x9c = this.A04;
        WM6 wm6 = this.A07;
        WM7 wm7 = this.A0D;
        HashMap hashMap = this.A0I;
        C13460Tan tan = this.A0F;
        Looper looper = this.A02;
        looper.getClass();
        C265084Sm r13 = this.A0G;
        C264894Rs r8 = this.A05;
        r8.getClass();
        WM9 wm9 = new WM9(looper, r8, wm6, wm7, x9c, tan, r13, hashMap, list, uuid);
        wm9.A7C(r18);
        if (this.A06 != -9223372036854775807L) {
            wm9.A7C((C265184Sw) null);
        }
        return wm9;
    }

    public static C290325f8 A01(Looper looper, C256683wB r7, WMB wmb, C265184Sw r9, boolean z) {
        if (wmb.A0J == null) {
            wmb.A0J = new C14690U1p(looper, wmb);
        }
        DrmInitData drmInitData = r7.A0O;
        if (drmInitData == null) {
            2Kn.A00(r7.A0W);
            wmb.A04.getClass();
            return null;
        }
        UUID uuid = wmb.A0B;
        ArrayList A022 = A02(drmInitData, uuid, false);
        if (A022.isEmpty()) {
            Exception exc = new Exception(AnonymousClass7TG.A0m(uuid, "Media does not support uuid: ", new StringBuilder()));
            2AG.A05("DefaultDrmSessionMgr", "DRM error", exc);
            if (r9 != null) {
                r9.A04(exc);
            }
            return new WM8(new AnonymousClass5OP(6003, exc));
        }
        WM9 wm9 = wmb.A03;
        if (wm9 == null) {
            WM9 A002 = wmb.A00(r9, A022);
            WM9.A00(A002);
            if (A002.A00 == 1) {
                AnonymousClass5OP B27 = A002.B27();
                B27.getClass();
                if (B27.getCause() instanceof ResourceBusyException) {
                    Set set = wmb.A09;
                    if (!set.isEmpty()) {
                        C249803kO it = ImmutableSet.A03(set).iterator();
                        while (it.hasNext()) {
                            ((C290325f8) it.next()).ECN((C265184Sw) null);
                        }
                        A002.ECN(r9);
                        if (wmb.A06 != -9223372036854775807L) {
                            A002.ECN((C265184Sw) null);
                        }
                        A002 = wmb.A00(r9, A022);
                    }
                }
            }
            WM9.A00(A002);
            if (A002.A00 == 1) {
                AnonymousClass5OP B272 = A002.B27();
                B272.getClass();
                if ((B272.getCause() instanceof ResourceBusyException) && z) {
                    Set set2 = wmb.A0A;
                    if (!set2.isEmpty()) {
                        C249803kO it2 = ImmutableSet.A03(set2).iterator();
                        while (it2.hasNext()) {
                            ((WMA) it2.next()).release();
                        }
                        Set set3 = wmb.A09;
                        if (!set3.isEmpty()) {
                            C249803kO it3 = ImmutableSet.A03(set3).iterator();
                            while (it3.hasNext()) {
                                ((C290325f8) it3.next()).ECN((C265184Sw) null);
                            }
                        }
                        A002.ECN(r9);
                        if (wmb.A06 != -9223372036854775807L) {
                            A002.ECN((C265184Sw) null);
                        }
                        A002 = wmb.A00(r9, A022);
                    }
                }
            }
            wmb.A03 = A002;
            wmb.A08.add(A002);
            return A002;
        }
        wm9.A7C(r9);
        return wm9;
    }

    public static ArrayList A02(DrmInitData drmInitData, UUID uuid, boolean z) {
        int i = drmInitData.A01;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            DrmInitData.SchemeData schemeData = drmInitData.A03[i2];
            if ((schemeData.A00(uuid) || (AnonymousClass4T7.A00.equals(uuid) && schemeData.A00(AnonymousClass4T7.A01))) && (schemeData.A04 != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    public static void A03(WMB wmb) {
        if (wmb.A04 != null && wmb.A00 == 0 && wmb.A08.isEmpty() && wmb.A0A.isEmpty()) {
            C21005X9c x9c = wmb.A04;
            x9c.getClass();
            x9c.release();
            wmb.A04 = null;
        }
    }

    private void A04(boolean z) {
        if (!z || this.A02 != null) {
            Thread currentThread = Thread.currentThread();
            Looper looper = this.A02;
            looper.getClass();
            if (currentThread != looper.getThread()) {
                2AG.A06("DefaultDrmSessionMgr", 002.A0u("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ", currentThread.getName(), "\nExpected thread: ", this.A02.getThread().getName()), new IllegalStateException());
                return;
            }
            return;
        }
        2AG.A06("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
    }

    public final AnonymousClass4YX E3S(C256683wB r4, C265184Sw r5) {
        C256703wD.A04(AnonymousClass7TF.A1R(this.A00));
        C256703wD.A01(this.A02);
        WMA wma = new WMA(this, r5);
        Handler handler = wma.A03.A01;
        handler.getClass();
        handler.post(new C20176Wma(r4, wma));
        return wma;
    }

    public WMB(X30 x30, C13460Tan tan, C265084Sm r7, String str, HashMap hashMap, UUID uuid, int[] iArr) {
        uuid.getClass();
        C256703wD.A05(!AnonymousClass4T7.A01.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.A0B = uuid;
        this.A0E = x30;
        this.A0F = tan;
        this.A0I = hashMap;
        this.A0C = iArr;
        this.A0G = r7;
        this.A0H = str;
    }
}
