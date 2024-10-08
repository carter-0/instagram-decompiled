package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6o0  reason: invalid class name and case insensitive filesystem */
public abstract class C317886o0 {
    public static final C317876nz A04(Bitmap bitmap, C318046oG r3, String str, String str2, float f) {
        0qQ.A0B(str2, 1);
        C317966o8 r1 = new C317966o8();
        r1.A0o.add(bitmap);
        r1.A01 = (float) bitmap.getWidth();
        r1.A00 = (float) bitmap.getHeight();
        r1.A02 = f;
        r1.A0S = str2;
        C317876nz r0 = C317876nz.A0a;
        List singletonList = Collections.singletonList(r1);
        0qQ.A07(singletonList);
        return new C317876nz(r3, str, singletonList);
    }

    public static final C317876nz A05(C317966o8 r2, String str) {
        0qQ.A0B(str, 0);
        C317876nz r0 = C317876nz.A0a;
        List singletonList = Collections.singletonList(r2);
        0qQ.A07(singletonList);
        return new C317876nz(C318046oG.GIF, str, singletonList);
    }

    public static final C317876nz A00() {
        ArrayList arrayList = new ArrayList();
        C317966o8 r0 = new C317966o8();
        r0.A0S = "gallery_image_sticker_rounded_corners";
        arrayList.add(r0);
        C317966o8 r1 = new C317966o8();
        r1.A0S = "gallery_image_sticker_normal_corners";
        arrayList.add(r1);
        C317966o8 r12 = new C317966o8();
        r12.A0S = "gallery_image_sticker_circle";
        arrayList.add(r12);
        C317966o8 r13 = new C317966o8();
        r13.A0S = "gallery_image_sticker_square";
        arrayList.add(r13);
        C317966o8 r14 = new C317966o8();
        r14.A0S = "gallery_image_sticker_heart";
        arrayList.add(r14);
        C317966o8 r15 = new C317966o8();
        r15.A0S = "gallery_image_sticker_star";
        arrayList.add(r15);
        return new C317876nz(C318046oG.GALLERY, "gallery_image_sticker_rounded_corners", arrayList);
    }

    public static final C317876nz A01() {
        C317966o8 r2 = new C317966o8();
        r2.A0S = "standalone_fundraiser_sticker_id";
        C317966o8 r1 = new C317966o8();
        r1.A0S = "multiple_avatar_standalone_sticker_id";
        return new C317876nz(C318046oG.BLOKS, "standalone_fundraiser_sticker_id", 0sr.A1P(new C317966o8[]{r2, r1}));
    }

    public static final C317876nz A02(Bitmap bitmap, double d, double d2, double d3) {
        C317966o8 r1 = new C317966o8();
        r1.A0o.add(bitmap);
        r1.A01 = (float) d;
        r1.A00 = (float) d2;
        r1.A02 = (float) d3;
        r1.A0S = "gallery_image_sticker_normal_corners";
        C317876nz r0 = C317876nz.A0a;
        List singletonList = Collections.singletonList(r1);
        0qQ.A07(singletonList);
        return new C317876nz(C318046oG.GALLERY, "gallery_image_sticker_normal_corners", singletonList);
    }

    public static final C317876nz A03(Bitmap bitmap, C318046oG r8, String str, float f) {
        0qQ.A0B(str, 1);
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        C317966o8 r1 = new C317966o8();
        r1.A0S = str;
        r1.A0U = "cutout_photo";
        r1.A0o.add(bitmap);
        r1.A01 = width;
        r1.A00 = height;
        r1.A02 = f;
        r1.A09 = 0;
        C317876nz r0 = C317876nz.A0a;
        List singletonList = Collections.singletonList(r1);
        0qQ.A07(singletonList);
        return new C317876nz(r8, "cut_out_sticker_content_id", singletonList);
    }

    public static final C317876nz A06(C318046oG r2, String str) {
        C317966o8 r0 = new C317966o8();
        r0.A0S = str;
        List singletonList = Collections.singletonList(r0);
        0qQ.A07(singletonList);
        return new C317876nz(r2, str, singletonList);
    }

    public static final C317876nz A07(C318046oG r2, String str, String str2) {
        C317966o8 r1 = new C317966o8();
        r1.A0S = str2;
        C317876nz r0 = C317876nz.A0a;
        List singletonList = Collections.singletonList(r1);
        0qQ.A07(singletonList);
        return new C317876nz(r2, str, singletonList);
    }
}
