package com.instagram.ar.core.discovery.minigallery.services;

import X.02o;
import X.0eS;
import X.0rr;
import X.0sK;
import X.1Hj;
import X.AnonymousClass11O;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass849;
import X.C239793Ih;
import X.C346197ul;
import X.C376519Ih;
import X.C60340gF;
import X.C63758L5q;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1", f = "MiniGalleryService.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ MiniGalleryService A03;
    public final /* synthetic */ AnonymousClass849 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1(MiniGalleryService miniGalleryService, AnonymousClass849 r3, String str, String str2, String str3, AnonymousClass4D7 r7) {
        super(3, r7);
        this.A03 = miniGalleryService;
        this.A07 = str;
        this.A04 = r3;
        this.A06 = str2;
        this.A05 = str3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        MiniGalleryService miniGalleryService = this.A03;
        String str = this.A07;
        MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1 miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1 = new MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1(miniGalleryService, this.A04, str, this.A06, this.A05, (AnonymousClass4D7) obj3);
        miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1.A01 = obj;
        miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1.A02 = obj2;
        return miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        0rr A002;
        1Hj r6 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            02o r5 = (02o) this.A01;
            C346197ul r1 = (C346197ul) this.A02;
            if (r1 == null || !AnonymousClass7TE.A1b((List) ((C376519Ih) r1.A00).A02)) {
                A002 = MiniGalleryService.A00(this.A03, this.A04, this.A07, this.A06, this.A05);
            } else {
                boolean z = r1.A02;
                A002 = new 0rr(new C239793Ih(new C63758L5q(r1.A01, (List) ((C376519Ih) r1.A00).A02, z)));
            }
            this.A00 = 1;
            if (AnonymousClass11O.A02(this, A002, r5) == r6) {
                return r6;
            }
        }
        return C60340gF.A00;
    }
}
