package X;

import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$getSearchResults$$inlined$map$1$2;

/* renamed from: X.Aux  reason: case insensitive filesystem */
public final class C41499Aux implements AnonymousClass0r6 {
    public final /* synthetic */ MiniGalleryService A00;
    public final /* synthetic */ AnonymousClass849 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ AnonymousClass0r6 A04;

    public C41499Aux(MiniGalleryService miniGalleryService, AnonymousClass849 r2, String str, String str2, AnonymousClass0r6 r5) {
        this.A04 = r5;
        this.A00 = miniGalleryService;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = str2;
    }

    public final Object collect(02o r8, AnonymousClass4D7 r9) {
        return AnonymousClass7TG.A0i(r9, this.A04, new MiniGalleryService$getSearchResults$$inlined$map$1$2(this.A00, this.A01, this.A03, this.A02, r8));
    }
}
