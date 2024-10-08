package X;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.97o  reason: invalid class name and case insensitive filesystem */
public final class C3739497o {
    public static final C3739497o A01;
    public final AtomicReference A00;

    public final synchronized void A04(AnonymousClass98B r9) {
        AtomicReference atomicReference = this.A00;
        C3739597p r1 = (C3739597p) atomicReference.get();
        HashMap hashMap = new HashMap(r1.A01);
        HashMap hashMap2 = new HashMap(r1.A00);
        HashMap hashMap3 = new HashMap(r1.A03);
        HashMap hashMap4 = new HashMap(r1.A02);
        AnonymousClass98F r2 = new AnonymousClass98F(r9.A00, C3739997t.class);
        if (hashMap2.containsKey(r2)) {
            Object obj = hashMap2.get(r2);
            if (!obj.equals(r9) || !r9.equals(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attempt to register non-equal parser for already existing object of type: ");
                sb.append(r2);
                throw new GeneralSecurityException(sb.toString());
            }
        } else {
            hashMap2.put(r2, r9);
        }
        atomicReference.set(new C3739597p(hashMap2, hashMap, hashMap4, hashMap3));
    }

    public final synchronized void A05(C3739897s r9) {
        AtomicReference atomicReference = this.A00;
        C3739597p r1 = (C3739597p) atomicReference.get();
        HashMap hashMap = new HashMap(r1.A01);
        HashMap hashMap2 = new HashMap(r1.A00);
        HashMap hashMap3 = new HashMap(r1.A03);
        HashMap hashMap4 = new HashMap(r1.A02);
        C3740197v r2 = new C3740197v(r9.A00, C3739997t.class);
        if (hashMap.containsKey(r2)) {
            Object obj = hashMap.get(r2);
            if (!obj.equals(r9) || !r9.equals(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attempt to register non-equal serializer for already existing object of type: ");
                sb.append(r2);
                throw new GeneralSecurityException(sb.toString());
            }
        } else {
            hashMap.put(r2, r9);
        }
        atomicReference.set(new C3739597p(hashMap2, hashMap, hashMap4, hashMap3));
    }

    public final synchronized void A06(AnonymousClass987 r9) {
        AtomicReference atomicReference = this.A00;
        C3739597p r1 = (C3739597p) atomicReference.get();
        HashMap hashMap = new HashMap(r1.A01);
        HashMap hashMap2 = new HashMap(r1.A00);
        HashMap hashMap3 = new HashMap(r1.A03);
        HashMap hashMap4 = new HashMap(r1.A02);
        AnonymousClass98F r2 = new AnonymousClass98F(r9.A00, AnonymousClass98E.class);
        if (hashMap4.containsKey(r2)) {
            Object obj = hashMap4.get(r2);
            if (!obj.equals(r9) || !r9.equals(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attempt to register non-equal parser for already existing object of type: ");
                sb.append(r2);
                throw new GeneralSecurityException(sb.toString());
            }
        } else {
            hashMap4.put(r2, r9);
        }
        atomicReference.set(new C3739597p(hashMap2, hashMap, hashMap4, hashMap3));
    }

    public final synchronized void A07(AnonymousClass984 r9) {
        AtomicReference atomicReference = this.A00;
        C3739597p r1 = (C3739597p) atomicReference.get();
        HashMap hashMap = new HashMap(r1.A01);
        HashMap hashMap2 = new HashMap(r1.A00);
        HashMap hashMap3 = new HashMap(r1.A03);
        HashMap hashMap4 = new HashMap(r1.A02);
        C3740197v r2 = new C3740197v(r9.A00, AnonymousClass98E.class);
        if (hashMap3.containsKey(r2)) {
            Object obj = hashMap3.get(r2);
            if (!obj.equals(r9) || !r9.equals(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attempt to register non-equal serializer for already existing object of type: ");
                sb.append(r2);
                throw new GeneralSecurityException(sb.toString());
            }
        } else {
            hashMap3.put(r2, r9);
        }
        atomicReference.set(new C3739597p(hashMap2, hashMap, hashMap4, hashMap3));
    }

    static {
        try {
            C3739497o r3 = new C3739497o();
            r3.A05(new C3739897s(new C3739697q(), AnonymousClass97F.class));
            A01 = r3;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final AnonymousClass97G A00(C375049Ca r5, C3740097u r6) {
        AnonymousClass98F r2 = new AnonymousClass98F(r6.BXl(), r6.getClass());
        Map map = ((C3739597p) this.A00.get()).A00;
        if (map.containsKey(r2)) {
            return ((AnonymousClass98B) map.get(r2)).A01.E1r(r5, r6);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No Key Parser for requested key type ");
        sb.append(r2);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final AnonymousClass983 A01(C3740097u r5) {
        AnonymousClass98F r2 = new AnonymousClass98F(r5.BXl(), r5.getClass());
        Map map = ((C3739597p) this.A00.get()).A02;
        if (map.containsKey(r2)) {
            return ((AnonymousClass987) map.get(r2)).A01.E1t(r5);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No Parameters Parser for requested key type ");
        sb.append(r2);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final C3740097u A02(AnonymousClass97G r5, C375049Ca r6) {
        C3740197v r2 = new C3740197v(r5.getClass(), C3739997t.class);
        Map map = ((C3739597p) this.A00.get()).A01;
        if (map.containsKey(r2)) {
            return ((C3739897s) map.get(r2)).A01.ENB(r5, r6);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No Key serializer for ");
        sb.append(r2);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final C3740097u A03(AnonymousClass983 r5) {
        C3740197v r2 = new C3740197v(r5.getClass(), AnonymousClass98E.class);
        Map map = ((C3739597p) this.A00.get()).A03;
        if (map.containsKey(r2)) {
            return ((AnonymousClass984) map.get(r2)).A01.ENC(r5);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No Key Format serializer for ");
        sb.append(r2);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public C3739497o() {
        HashMap hashMap = new HashMap();
        this.A00 = new AtomicReference(new C3739597p(new HashMap(), hashMap, new HashMap(), new HashMap()));
    }
}
