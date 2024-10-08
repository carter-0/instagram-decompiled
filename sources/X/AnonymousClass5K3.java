package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;

/* renamed from: X.5K3  reason: invalid class name */
public abstract class AnonymousClass5K3 {
    public static final AnonymousClass4UC A00(QuickPromotionSurface quickPromotionSurface, AnonymousClass4V7 r6, AnonymousClass5Jm r7, AnonymousClass4VB r8, String str, int i, long j, long j2, long j3, boolean z, boolean z2) {
        0qQ.A0B(quickPromotionSurface, 3);
        AnonymousClass5K4 r0 = AnonymousClass5K4.$redex_init_class;
        int ordinal = quickPromotionSurface.ordinal();
        if (ordinal == 1) {
            return new C300555xO(quickPromotionSurface, r6, r7, r8, str, i, j, j2, j3, z, z2);
        }
        if (ordinal == 0 || ordinal == 11) {
            return new AnonymousClass4UC(quickPromotionSurface, r6, r7, r8, str, i, j, j2, j3, z, z2);
        }
        if (ordinal != 2) {
            return new AnonymousClass4UC(quickPromotionSurface, r6, r7, r8, str, i, j, j2, j3, z, z2);
        }
        return new AnonymousClass4UC(quickPromotionSurface, r6, r7, r8, str, i, j, j2, j3, z, z2);
    }

    public static final AnonymousClass4UC A01(QuickPromotionSurface quickPromotionSurface, AnonymousClass4V7 r15, AnonymousClass5Jm r16, AnonymousClass4VB r17, String str, int i, long j, boolean z) {
        0qQ.A0B(r15, 1);
        QuickPromotionSurface quickPromotionSurface2 = quickPromotionSurface;
        0qQ.A0B(quickPromotionSurface, 3);
        return A00(quickPromotionSurface2, r15, r16, r17, str, i, 0, j, 0, false, z);
    }
}
