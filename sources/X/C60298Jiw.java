package X;

import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jiw  reason: case insensitive filesystem */
public final class C60298Jiw extends 2YL {
    public String A00;
    public C262204Co A01;
    public C262204Co A02;
    public int A03;
    public final AnonymousClass2Fj A04 = JTO.A0K();
    public final AnonymousClass85D A05;
    public final MiniGalleryService A06;
    public final AnonymousClass86D A07;
    public final UserSession A08;
    public final String A09;
    public final String A0A;

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, X.Koz] */
    public static final void A01(C60298Jiw jiw, C239803Ii r15, String str, boolean z) {
        int i;
        C239803Ii r1 = r15;
        C60298Jiw jiw2 = jiw;
        if (r15 instanceof C239793Ih) {
            String str2 = str;
            if (!(str == null || str2.length() == 0)) {
                C264074Om A002 = C264044Oj.A00(jiw.A08);
                String str3 = jiw.A09;
                String str4 = jiw.A0A;
                0sn r10 = 0sn.A00;
                List<CameraAREffect> list = ((C63758L5q) ((C239793Ih) r15).A00).A01;
                ArrayList A0p = AnonymousClass7TF.A0p(list);
                for (CameraAREffect cameraAREffect : list) {
                    A0p.add(cameraAREffect.A0K);
                }
                A002.Chp(AnonymousClass903.A00(jiw.A07.A03), C17169VKy.A04, str2, str3, str4, r10, A0p);
            }
            C63758L5q l5q = (C63758L5q) ((C239793Ih) r1).A00;
            List list2 = l5q.A01;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list2) {
                if (!jiw.A05.CmT((CameraAREffect) next)) {
                    A1C.add(next);
                }
            }
            ArrayList A0p2 = AnonymousClass7TF.A0p(A1C);
            int i2 = 0;
            for (Object next2 : A1C) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                CameraAREffect cameraAREffect2 = (CameraAREffect) next2;
                String str5 = cameraAREffect2.A0K;
                String str6 = cameraAREffect2.A0S;
                SimpleImageUrl simpleImageUrl = new SimpleImageUrl(cameraAREffect2.A07);
                ImageUrl imageUrl = cameraAREffect2.A06;
                AnonymousClass86D r0 = jiw2.A07;
                String str7 = cameraAREffect2.A0K;
                0qQ.A07(str7);
                boolean A022 = r0.A04.A02(str7);
                String str8 = cameraAREffect2.A0N;
                String str9 = cameraAREffect2.A0O;
                boolean equals = "INSTAGRAM_CAMERA".equals(cameraAREffect2.A0E);
                ? obj = new Object();
                obj.A09 = false;
                obj.A05 = str5;
                obj.A06 = str6;
                obj.A04 = null;
                obj.A01 = simpleImageUrl;
                obj.A02 = imageUrl;
                obj.A03 = null;
                obj.A0B = A022;
                obj.A00 = i2;
                obj.A07 = str8;
                obj.A08 = str9;
                obj.A0A = equals;
                A0p2.add(new LQR((C62947Koz) obj));
                i2 = i3;
            }
            C63795L7b l7b = new C63795L7b(l5q.A00, A0p2, z, l5q.A02);
            jiw2.A03 = DbT.A01(l7b.A01, jiw2.A03);
            jiw2.A04.A0B(l7b);
        } else if (r15 instanceof C297815sO) {
            boolean z2 = ((C297815sO) r1).A00 instanceof C384739ho;
            AnonymousClass85G r12 = jiw.A07.A0F;
            if (z2) {
                i = 2131964410;
            } else {
                i = 2131968258;
            }
            JTP.A19(r12, i);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public static final AnonymousClass0r6 A00(C60298Jiw jiw, String str, String str2) {
        MiniGalleryService miniGalleryService = jiw.A06;
        String str3 = jiw.A0A;
        AnonymousClass86D r0 = jiw.A07;
        AnonymousClass849 r2 = r0.A03;
        boolean z = r0.A0M.get();
        String str4 = str;
        AnonymousClass7TF.A1B(r2, 1, str4);
        C359218cI A012 = C359218cI.A03.A01(r2.A00, "search");
        String str5 = str2;
        if (str2 != null || !str4.equals(miniGalleryService.A00) || z) {
            return MiniGalleryService.A00(miniGalleryService, r2, str3, str4, str5);
        }
        return 10q.A02(new MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1(miniGalleryService, r2, str3, str4, str5, (AnonymousClass4D7) null), new AnonymousClass05E(new AnonymousClass9KF((Object) new C349177zi(A012, (Integer) null, str5, 3, false, true, false, true, false), (AnonymousClass4D7) null, (Object) miniGalleryService.A02, 11)));
    }

    public /* synthetic */ C60298Jiw(MiniGalleryService miniGalleryService, AnonymousClass86D r4, UserSession userSession, String str, String str2) {
        C348347yI A042 = r4.A04();
        C51972G9s.A1D(userSession, miniGalleryService);
        0qQ.A0B(A042, 6);
        this.A09 = str;
        this.A0A = str2;
        this.A08 = userSession;
        this.A06 = miniGalleryService;
        this.A07 = r4;
        this.A05 = A042;
    }
}
