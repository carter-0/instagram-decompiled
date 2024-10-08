package X;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.979  reason: invalid class name */
public final class AnonymousClass979 {
    public static AnonymousClass979 A01 = new AnonymousClass979();
    public final AtomicReference A00 = new AtomicReference(new AnonymousClass97A(new HashMap(), new HashMap()));

    public final synchronized void A01(AnonymousClass97C r7) {
        AtomicReference atomicReference = this.A00;
        AnonymousClass97A r1 = (AnonymousClass97A) atomicReference.get();
        HashMap hashMap = new HashMap(r1.A00);
        HashMap hashMap2 = new HashMap(r1.A01);
        Class Bfd = r7.Bfd();
        if (hashMap2.containsKey(Bfd)) {
            Object obj = hashMap2.get(Bfd);
            if (!obj.equals(r7) || !r7.equals(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
                sb.append(Bfd);
                throw new GeneralSecurityException(sb.toString());
            }
        } else {
            hashMap2.put(Bfd, r7);
        }
        atomicReference.set(new AnonymousClass97A(hashMap, hashMap2));
    }

    public final synchronized void A02(AnonymousClass97I r7) {
        AtomicReference atomicReference = this.A00;
        AnonymousClass97A r1 = (AnonymousClass97A) atomicReference.get();
        HashMap hashMap = new HashMap(r1.A00);
        HashMap hashMap2 = new HashMap(r1.A01);
        AnonymousClass97J r2 = new AnonymousClass97J(r7.A00, r7.A01);
        if (hashMap.containsKey(r2)) {
            Object obj = hashMap.get(r2);
            if (!obj.equals(r7) || !r7.equals(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
                sb.append(r2);
                throw new GeneralSecurityException(sb.toString());
            }
        } else {
            hashMap.put(r2, r7);
        }
        atomicReference.set(new AnonymousClass97A(hashMap, hashMap2));
    }

    public final Object A00(AnonymousClass97G r4, Class cls) {
        AnonymousClass97J r2 = new AnonymousClass97J(r4.getClass(), cls);
        Map map = ((AnonymousClass97A) this.A00.get()).A00;
        if (map.containsKey(r2)) {
            return ((AnonymousClass97I) map.get(r2)).A02.AJN(r4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No PrimitiveConstructor for ");
        sb.append(r2);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }
}
