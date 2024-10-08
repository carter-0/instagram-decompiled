package X;

import android.graphics.Canvas;
import com.facebook.android.maps.model.CameraPosition;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UH0 extends C14633Tzf implements X2A {
    public static final AnonymousClass2R4 A0E;
    public VL7 A00;
    public VL7 A01;
    public X8E A02;
    public VOW A03;
    public Map A04;
    public CameraPosition A05;
    public boolean A06 = false;
    public final C17552Va5 A07;
    public final AnonymousClass2R4 A08 = new Object();
    public final ArrayList A09 = new ArrayList(10);
    public final List A0A = new ArrayList();
    public final Set A0B = new HashSet();
    public final AnonymousClass2R4 A0C = new Object();
    public final double[] A0D = new double[2];

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2R4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.2R4, java.lang.Object] */
    public UH0(X8E x8e, WFU wfu) {
        super(wfu);
        this.A02 = x8e;
        this.A04 = new HashMap();
        this.A07 = new C17552Va5(this);
        wfu.A0N.add(this);
    }

    public final void A0H() {
        VL7 vl7 = this.A00;
        if (vl7 != null) {
            vl7.A00.A07();
        }
        this.A00 = null;
        Iterator A16 = DbV.A16(this.A04);
        while (A16.hasNext()) {
            A16.next();
        }
        this.A07.A03 = null;
        this.A06 = true;
        A05();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2R4, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.A01 = 0.0d;
        obj.A03 = 0.0d;
        obj.A02 = 1.0d;
        obj.A00 = 1.0d;
        A0E = obj;
    }

    public static void A00(UH0 uh0, Set set) {
        C14955UGt uGt;
        VL7 ALc;
        int size;
        Map map = uh0.A04;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            C19879Wh8 wh8 = (C19879Wh8) A1J.getValue();
            double[] dArr = uh0.A0D;
            wh8.AmS(dArr);
            if (!uh0.A08.A00(dArr[0], dArr[1]) || !set.remove(wh8)) {
                A0u.remove();
                uh0.A02.EDS(wh8);
                VL7 vl7 = uh0.A00;
                if (key == vl7) {
                    if (vl7 != null) {
                        vl7.A00.A07();
                    }
                    uh0.A00 = null;
                }
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C19879Wh8 wh82 = (C19879Wh8) it.next();
            double[] dArr2 = uh0.A0D;
            wh82.AmS(dArr2);
            double d = dArr2[0];
            double d2 = dArr2[1];
            if (wh82.A03 != 0 && uh0.A08.A00(d, d2)) {
                X8E x8e = uh0.A02;
                ArrayList arrayList = uh0.A09;
                if (arrayList.isEmpty() || (size = arrayList.size() - 1) < 0) {
                    ALc = x8e.ALc(wh82, 1);
                } else {
                    ALc = (VL7) arrayList.get(size);
                    arrayList.remove(size);
                }
                x8e.ADW(wh82, ALc);
                C14633Tzf tzf = ALc.A00;
                wh82.A05 = tzf;
                map.put(ALc, wh82);
                tzf.A06();
            }
        }
        VOW vow = uh0.A03;
        if (vow != null) {
            C18016Vjs vjs = vow.A00;
            vjs.A00++;
            X8W x8w = vjs.A07;
            XCL BfZ = x8w.BfZ();
            if (BfZ != null) {
                Reference reference = (Reference) vjs.A08.A01.get(BfZ.getId());
                if (reference != null && (uGt = (C14955UGt) reference.get()) != null) {
                    x8w.EF0(vjs, uGt);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(uGt);
                    vjs.A01(linkedHashSet);
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    linkedHashSet2.add(BfZ);
                    Iterator it2 = vjs.A00(linkedHashSet2).iterator();
                    while (it2.hasNext()) {
                        x8w.EEz(vjs, (C14955UGt) it2.next());
                    }
                }
            }
        }
    }

    public final void A0D(Canvas canvas) {
        C20368Wq8 uhd;
        long j;
        if (this.A06) {
            this.A06 = false;
            float f = this.A07.A02().A02;
            W2R w2r = this.A08;
            AnonymousClass2R4 r2 = this.A0C;
            w2r.A05(r2);
            C17552Va5 va5 = this.A07;
            Float f2 = va5.A03;
            if (f2 == null || f2.floatValue() != f || !this.A08.A01(r2)) {
                if (f <= 5.0f) {
                    AnonymousClass2R4 r3 = this.A08;
                    AnonymousClass2R4 r22 = A0E;
                    r3.A00 = r22.A00;
                    r3.A03 = r22.A03;
                    r3.A01 = r22.A01;
                    r3.A02 = r22.A02;
                } else {
                    double d = r2.A02;
                    double d2 = r2.A01;
                    double d3 = r2.A00;
                    double d4 = r2.A03;
                    double d5 = d3 - d4;
                    double d6 = (d - d2) / 2.0d;
                    double d7 = d2 - d6;
                    double d8 = d + d6;
                    int i = ((d8 - d7) > 1.0d ? 1 : ((d8 - d7) == 1.0d ? 0 : -1));
                    AnonymousClass2R4 r12 = this.A08;
                    if (i >= 0) {
                        r12.A01 = 0.0d;
                        r12.A02 = 1.0d;
                    } else {
                        r12.A01 = C19879Wh8.A00(d7);
                        r12.A02 = C19879Wh8.A00(d8);
                    }
                    double d9 = d5 / 2.0d;
                    r12.A03 = Math.max(0.0d, d4 - d9);
                    r12.A00 = Math.min(1.0d, d3 + d9);
                }
                Float f3 = va5.A03;
                if (f3 == null || f <= f3.floatValue()) {
                    C14635Tzh tzh = va5.A04.A01;
                    if (tzh != null) {
                        tzh.A03();
                    }
                    C20368Wq8 wq8 = va5.A00;
                    if (wq8 != null) {
                        C18796W2e.A01.removeCallbacks(wq8);
                        va5.A00 = null;
                    }
                    if (va5.A01 == null) {
                        uhd = new UHD(va5, f);
                        va5.A01 = uhd;
                        j = 150;
                    }
                } else {
                    C20368Wq8 wq82 = va5.A01;
                    if (wq82 != null) {
                        C18796W2e.A01.removeCallbacks(wq82);
                        va5.A01 = null;
                    }
                    if (va5.A04.A01 == null && va5.A00 == null) {
                        uhd = new UH8(va5);
                        va5.A00 = uhd;
                        C17369VSw vSw = va5.A02;
                        if (vSw == null) {
                            j = 400;
                        } else if (System.currentTimeMillis() - vSw.A00 < 1000) {
                            j = 0;
                        } else {
                            j = 300;
                        }
                    }
                }
                C18796W2e.A01.postDelayed(uhd, j);
            }
        }
        Canvas canvas2 = canvas;
        if (this instanceof C14956UGu) {
            C14956UGu uGu = (C14956UGu) this;
            Set<VL7> keySet = uGu.A04.keySet();
            TreeMap treeMap = new TreeMap();
            for (VL7 vl7 : keySet) {
                Integer valueOf = Integer.valueOf(uGu.A00.A01.BOy(vl7.A00));
                Set set = (Set) treeMap.get(valueOf);
                if (set == null) {
                    set = new HashSet();
                    treeMap.put(valueOf, set);
                }
                set.add(vl7);
            }
            Iterator A0t = AnonymousClass7TF.A0t(treeMap);
            while (A0t.hasNext()) {
                for (VL7 vl72 : (Set) A0t.next()) {
                    if (vl72 != uGu.A00) {
                        Set set2 = uGu.A01;
                        C14633Tzf tzf = vl72.A00;
                        if (!set2.contains(tzf) && tzf.A04) {
                            tzf.A0D(canvas2);
                        }
                    }
                }
            }
            VL7 vl73 = uGu.A00;
            if (vl73 != null && !uGu.A01.contains(vl73.A00)) {
                C14633Tzf tzf2 = uGu.A00.A00;
                if (tzf2.A04) {
                    tzf2.A0D(canvas2);
                }
            }
            for (C14633Tzf tzf3 : uGu.A01) {
                if (tzf3.A04) {
                    tzf3.A0D(canvas2);
                }
            }
            return;
        }
        Iterator A16 = DbV.A16(this.A04);
        while (A16.hasNext()) {
            VL7 vl74 = (VL7) A16.next();
            if (vl74 != this.A00) {
                C14633Tzf tzf4 = vl74.A00;
                if (tzf4.A04) {
                    tzf4.A0D(canvas2);
                }
            }
        }
        VL7 vl75 = this.A00;
        if (vl75 != null) {
            C14633Tzf tzf5 = vl75.A00;
            if (tzf5.A04) {
                tzf5.A0D(canvas2);
            }
        }
    }

    public final void D02(CameraPosition cameraPosition) {
        if (!cameraPosition.equals(this.A05)) {
            this.A06 = true;
        }
        this.A05 = cameraPosition;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2R4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.2R4, java.lang.Object] */
    public UH0(V31 v31, WFU wfu) {
        super(wfu);
        this.A02 = v31.A00;
        this.A04 = new HashMap();
        this.A07 = new C17552Va5(this);
        wfu.A0N.add(this);
    }
}
