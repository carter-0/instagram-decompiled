package X;

import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.ar.core.effectcollection.EffectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2;

/* renamed from: X.9PS  reason: invalid class name */
public final class AnonymousClass9PS implements AnonymousClass0r6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass9PS(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj4;
        this.A01 = obj3;
        this.A04 = obj2;
        this.A02 = obj;
    }

    public final Object collect(02o r11, AnonymousClass4D7 r12) {
        AnonymousClass0r6 r3;
        02o effectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2;
        02o r8 = r11;
        if (this.A00 != 0) {
            r3 = (AnonymousClass0r6) this.A02;
            Object obj = this.A01;
            effectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2 = new C58032IkP(5, this.A04, this.A03, r8, obj);
        } else {
            r3 = (AnonymousClass0r6) this.A03;
            EffectCollectionService effectCollectionService = (EffectCollectionService) this.A04;
            effectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2 = new EffectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2((C349177zi) this.A02, effectCollectionService, (C346077uZ) this.A01, r11);
        }
        return AnonymousClass7TG.A0i(r12, r3, effectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2);
    }
}
