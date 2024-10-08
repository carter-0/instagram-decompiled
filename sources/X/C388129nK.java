package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9nK  reason: invalid class name and case insensitive filesystem */
public final class C388129nK extends AnonymousClass8D8 {
    public static final AIP A0C = new Object();
    public int A00;
    public int A01;
    public Drawable A02;
    public C310416b1 A03;
    public boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final TargetViewSizeProvider A07;
    public final SuperlativeStickerClientModel A08;
    public final List A09 = AnonymousClass7TE.A1C();
    public final List A0A = AnonymousClass7TE.A1C();
    public final Map A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C388129nK(Context context, UserSession userSession, AnonymousClass8BA r42, TargetViewSizeProvider targetViewSizeProvider, SuperlativeStickerClientModel superlativeStickerClientModel) {
        super(r42, (AnonymousClass8BH) null, (Integer) null, 111, false, false);
        Bitmap A002;
        this.A05 = context;
        this.A06 = userSession;
        SuperlativeStickerClientModel superlativeStickerClientModel2 = superlativeStickerClientModel;
        this.A08 = superlativeStickerClientModel2;
        this.A07 = targetViewSizeProvider;
        Medium A032 = C282665Eg.A03(AnonymousClass7TE.A0t(superlativeStickerClientModel2.A02), 1, 0);
        Bitmap decodeFile = BitmapFactory.decodeFile(A032.A0X);
        0qQ.A0A(decodeFile);
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) this.A07;
        int i = nineSixteenLayoutConfigImpl.A06;
        int i2 = nineSixteenLayoutConfigImpl.A04;
        this.A01 = decodeFile.getWidth();
        float height = ((float) this.A01) / ((float) decodeFile.getHeight());
        float f = (float) i;
        float f2 = (float) i2;
        if (height > f / f2) {
            A002 = 0fO.A00(decodeFile, i, (int) (f / height), true);
        } else {
            A002 = 0fO.A00(decodeFile, (int) (f2 * height), i2, true);
        }
        0qQ.A0A(A002);
        Bitmap.Config config = decodeFile.getConfig();
        0qQ.A0A(config);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        0qQ.A07(createBitmap);
        this.A00 = createBitmap.getWidth();
        createBitmap.getHeight();
        new Canvas(createBitmap).drawBitmap(A002, 0.0f, 0.0f, (Paint) null);
        this.A02 = new C369908vW(this.A05, createBitmap, A032, (ImageUrl) null, C354668Mx.RECTANGLE, (Integer) null, i, i2, true, false, false, false);
        this.A03 = new C310416b1((AnonymousClass8BH) new C16336Ut6(new Rect(0, 0, i, i2)), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, false, false, false, false, true, false, false);
        float f3 = ((float) this.A00) / ((float) this.A01);
        this.A09.addAll(AIP.A02(this.A05, this.A06, this.A08.A03, f3));
        this.A0A.addAll(AIP.A01(this.A05, this.A06, this.A07, this.A08.A04));
        this.A0B = 0Yt.A0E();
    }

    public final void A07() {
        if (!this.A04) {
            AnonymousClass8BA r1 = this.A02;
            ArrayList A012 = C317876nz.A1V.A01();
            r1.A0f(this.A02, A03(), this.A03, (String) null, A012);
            A01(this.A09);
            A01(A0C.A03(this.A05, this.A06, this.A07, this.A08.A00));
            A01(this.A0A);
            this.A04 = true;
        }
    }

    private final void A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0eP r0 = (0eP) it.next();
            AnonymousClass8BA r2 = this.A02;
            ArrayList A012 = C317876nz.A1V.A01();
            r2.A0f((Drawable) r0.A00, A03(), (C310416b1) r0.A01, (String) null, A012);
        }
    }
}
