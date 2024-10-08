package X;

import android.graphics.Bitmap;

/* renamed from: X.Lrc  reason: case insensitive filesystem */
public final class C65337Lrc implements C66490MTt {
    public final Object AWg(L1Y l1y, AnonymousClass4D7 r20) {
        char c;
        C53376Gn6[] gn6Arr;
        C53376Gn6 gn6;
        Bitmap bitmap;
        BBV bbv;
        String str;
        L1Y l1y2 = l1y;
        if (l1y2 instanceof KS5) {
            KS5 ks5 = (KS5) l1y2;
            bitmap = (Bitmap) ks5.A03.A00;
            bbv = ks5.A01;
        } else if (l1y2 instanceof KS3) {
            bitmap = (Bitmap) ((KS3) l1y2).A02.A00;
            str = "";
            gn6Arr = new C53376Gn6[1];
            c = 0;
            gn6 = new C53376Gn6(bitmap, (C61078JwG) null, str, "contentId", "requestid", "responseId", (String) null, 96);
            gn6Arr[c] = gn6;
            return C41845B3m.A0d(new C61078JwG(AnonymousClass62Q.A04(gn6Arr), 25));
        } else if (l1y2 instanceof KS4) {
            KS4 ks4 = (KS4) l1y2;
            bitmap = (Bitmap) ks4.A02.A00;
            bbv = ks4.A01;
        } else if (l1y2 instanceof KS2) {
            Bitmap bitmap2 = (Bitmap) ((KS2) l1y2).A00.A00;
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            Bitmap A0B = AnonymousClass7TF.A0B(width, height);
            c = 0;
            for (int i = 0; i < width; i++) {
                for (int i2 = 0; i2 < height; i2++) {
                    int i3 = i2 - (height / 2);
                    if (((float) Math.sqrt((double) ((((float) (i - (width / 2))) * (((float) i) - (((float) width) / 2.0f))) + ((float) (i3 * i3))))) < 450.0f) {
                        A0B.setPixel(i, i2, -1);
                    }
                }
            }
            gn6Arr = new C53376Gn6[1];
            gn6 = new C53376Gn6(A0B, new C61078JwG(AnonymousClass7TE.A1I(new C66787McY(AnonymousClass05K.A00, "111:222:333", 255, true)), 27), (String) null, "contentId", "requestid", "responseId", (String) null, 64);
            gn6Arr[c] = gn6;
            return C41845B3m.A0d(new C61078JwG(AnonymousClass62Q.A04(gn6Arr), 25));
        } else {
            throw AnonymousClass7TE.A1K();
        }
        str = bbv.A00;
        gn6Arr = new C53376Gn6[1];
        c = 0;
        gn6 = new C53376Gn6(bitmap, (C61078JwG) null, str, "contentId", "requestid", "responseId", (String) null, 96);
        gn6Arr[c] = gn6;
        return C41845B3m.A0d(new C61078JwG(AnonymousClass62Q.A04(gn6Arr), 25));
    }

    public final Object FMY(C61078JwG jwG, AnonymousClass4D7 r4) {
        return new KS7("mockHandle");
    }
}
