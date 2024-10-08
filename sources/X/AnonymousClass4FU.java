package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4FU  reason: invalid class name */
public final class AnonymousClass4FU implements C242643Vh {
    public static final AnonymousClass34P A07 = new AnonymousClass34P(AnonymousClass4FV.A00);
    public final int A00;
    public final C13997Tnz A01;
    public final 0fA A02;
    public final C242633Vg A03;
    public final AnonymousClass4FT A04;
    public final List A05 = new ArrayList();
    public final Map A06 = new LinkedHashMap();

    public AnonymousClass4FU(C13997Tnz tnz, 0fA r9, AnonymousClass4FT r10, 0sP r11) {
        int i;
        0qQ.A0B(r10, 3);
        this.A01 = tnz;
        this.A02 = r9;
        this.A04 = r10;
        this.A03 = new C242633Vg(tnz);
        int i2 = 0;
        for (Object next : r10.A02) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            this.A05.add(new AnonymousClass4FW(this, next, i2));
            if (i2 > 0) {
                int i4 = i2 - 1;
                ((AnonymousClass4FW) this.A05.get(i4)).A01 = (AnonymousClass4FW) this.A05.get(i2);
                ((AnonymousClass4FW) this.A05.get(i2)).A00 = (AnonymousClass4FW) this.A05.get(i4);
            }
            for (Object next2 : (Iterable) r11.invoke(next)) {
                if (next2 != null) {
                    this.A06.put(next2, this.A05.get(i2));
                }
            }
            i2 = i3;
        }
        if (this.A05.isEmpty()) {
            0f9 AEf = this.A02.AEf("Empty carousel created", 817901863);
            AEf.ABO("param items count", this.A04.A02.size());
            AEf.report();
        }
        if (0 >= this.A05.size()) {
            if (2SP.A01.A05(IgNetworkConsentStorage.MAX_ENTRIES) == 0) {
                0f9 AEf2 = this.A02.AEf("Illegal carousel initial on screen index", 817901863);
                AEf2.ABO("items count", this.A05.size());
                AEf2.ABO("index", 0);
                AEf2.ABO("client_sampling", IgNetworkConsentStorage.MAX_ENTRIES);
                AEf2.report();
            }
            i = this.A05.size() - 1;
        } else {
            i = 0;
        }
        this.A00 = i;
    }

    public final Object AvB() {
        return null;
    }

    public static final Iterable A00(AnonymousClass4FU r7) {
        C242633Vg r2 = r7.A03;
        Iterable iterable = (Iterable) C242633Vg.A00(r2, r2, new AnonymousClass9LM(r2, 27));
        boolean A0t = 00k.A0t(iterable);
        ArrayList arrayList = iterable;
        if (!A0t) {
            List list = r7.A05;
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                if (i >= r7.A00) {
                    arrayList2.add(next);
                }
                i = i2;
            }
            List<Object> A0d = 00k.A0d(arrayList2, r7.A04.A00);
            ArrayList arrayList3 = new ArrayList(0Yv.A1E(A0d, 10));
            for (Object r22 : A0d) {
                arrayList3.add(new 0eP(r22, 0));
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }

    public final boolean DPd(Object obj) {
        Object obj2 = this.A06.get(obj);
        if (obj2 != null) {
            C242633Vg r2 = this.A03;
            C242633Vg.A00(r2, r2, new C377429Lu(3, obj2, r2));
        }
        C242633Vg r22 = this.A03;
        return !((Boolean) C242633Vg.A00(r22, r22, new AnonymousClass9LM(r22, 28))).booleanValue();
    }

    public final void DPe(Object obj) {
        Object obj2 = this.A06.get(obj);
        if (obj2 != null) {
            C242633Vg r2 = this.A03;
            C242633Vg.A00(r2, r2, new C377429Lu(4, obj2, r2));
        }
    }

    public final String toString() {
        return 002.A0c("[ListCarouselNode] ", " carousel items", this.A06.size());
    }

    public final Iterable BVk(C376459Ib r5, AnonymousClass34Q r6, int i) {
        try {
            return A00(this);
        } catch (IndexOutOfBoundsException e) {
            0f9 AEf = this.A02.AEf("Empty carousel iterated", 817901863);
            AEf.ERJ(e);
            AEf.ABO("items count", this.A05.size());
            AEf.report();
            return 0sn.A00;
        }
    }
}
