package com.instagram.ar.core.discovery.minigallery.services;

import X.02o;
import X.0eS;
import X.0qQ;
import X.0rr;
import X.0sK;
import X.1Hj;
import X.2IS;
import X.AnonymousClass05E;
import X.AnonymousClass05K;
import X.AnonymousClass11O;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass849;
import X.AnonymousClass84A;
import X.AnonymousClass9KF;
import X.AnonymousClass9R8;
import X.C239113Fa;
import X.C239123Fb;
import X.C239793Ih;
import X.C338747iT;
import X.C338757iU;
import X.C343637qX;
import X.C376879Jr;
import X.C60340gF;
import X.C61970qY;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1", f = "MiniGalleryCategoriesService.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ MiniGalleryCategoriesService A03;
    public final /* synthetic */ AnonymousClass849 A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1(MiniGalleryCategoriesService miniGalleryCategoriesService, AnonymousClass849 r3, AnonymousClass4D7 r4, boolean z) {
        super(3, r4);
        this.A03 = miniGalleryCategoriesService;
        this.A04 = r3;
        this.A05 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1 miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1 = new MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1(this.A03, this.A04, (AnonymousClass4D7) obj3, this.A05);
        miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1.A01 = obj;
        miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1.A02 = obj2;
        return miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        0rr r1;
        1Hj r7 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            02o r5 = (02o) this.A01;
            C338747iT r12 = (C338747iT) this.A02;
            if (!r12.A01.isEmpty()) {
                r1 = new 0rr(new C239793Ih(r12));
            } else {
                MiniGalleryCategoriesService miniGalleryCategoriesService = this.A03;
                boolean A0E = C61970qY.A0E(miniGalleryCategoriesService.A01);
                AnonymousClass849 r3 = this.A04;
                if (A0E) {
                    boolean z = this.A05;
                    UserSession userSession = miniGalleryCategoriesService.A03;
                    AnonymousClass84A r2 = r3.A00;
                    0qQ.A0B(r2, 1);
                    2IS r9 = new 2IS();
                    r9.A02("include_flm_effects", Boolean.valueOf(z));
                    r9.A04("product", r2.name());
                    r9.A02("show_green_screen_category_for_reels", false);
                    C239113Fa r0 = new C239113Fa(r9, C338757iU.class, "IGAREffectsGalleryCategoriesQuery", false);
                    C239123Fb r22 = new C239123Fb(userSession);
                    r22.A08(r0);
                    r22.A03 = AnonymousClass05K.A00;
                    r22.A05 = null;
                    r22.A04 = -1L;
                    r1 = new AnonymousClass9R8(miniGalleryCategoriesService, r3, new C343637qX(new C376879Jr(9, (AnonymousClass4D7) null), r22.A06().A04(74970091, 3)));
                } else {
                    r1 = new AnonymousClass05E(new AnonymousClass9KF((Object) r3, (AnonymousClass4D7) null, (Object) miniGalleryCategoriesService, 10));
                }
            }
            this.A00 = 1;
            if (AnonymousClass11O.A02(this, r1, r5) == r7) {
                return r7;
            }
        }
        return C60340gF.A00;
    }
}
