package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.IxV  reason: case insensitive filesystem */
public final class C58784IxV extends 0Yg implements 0sP {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58784IxV(Object obj, Object obj2, Object obj3, float f, int i, int i2) {
        super(1);
        this.A01 = i2;
        this.A00 = f;
        this.A05 = obj;
        this.A02 = i;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A01 != 0) {
            C336607et r2 = (C336607et) obj2;
            boolean A1Z = C51966G9m.A1Z(r2);
            2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A01, A1Z ? 1 : 0, C51965G9l.A06(C51971G9r.A02(C53917GwN.A0F)));
            float f = this.A00;
            2WX A003 = AnonymousClass9JR.A00(A002, AnonymousClass05K.A00, A1Z, C51965G9l.A06(f));
            C53917GwN gwN = (C53917GwN) this.A05;
            int i = this.A02;
            2WX r5 = (2WX) this.A04;
            2Wb A0S = AnonymousClass7TG.A0S(r2.A00);
            UserSession userSession = gwN.A04;
            C267324bN r6 = gwN.A02;
            C52058GDe gDe = gwN.A03;
            float A022 = C51971G9r.A02(C53917GwN.A0E);
            HK1 hk1 = gwN.A08;
            return C51967G9n.A0N(new C53862GvT(r5, r6, gDe, userSession, (1Xj) this.A03, gwN.A05, gwN.A07, hk1, A022, f, i), A0S, r2, A003);
        }
        SparseArray sparseArray = (SparseArray) obj2;
        0qQ.A0B(sparseArray, 0);
        0sP r52 = (0sP) this.A04;
        int i2 = this.A02;
        float f2 = this.A00;
        ImageUrl imageUrl = (ImageUrl) this.A03;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        int size = sparseArray.size();
        if (size != 0 && size != 1) {
            Bitmap bitmap = (Bitmap) sparseArray.get(0);
            if (size != 2) {
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 10.0f * f2, 29.0f * f2, (Paint) null);
                }
                Bitmap bitmap2 = (Bitmap) sparseArray.get(1);
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, 25.0f * f2, 5.0f * f2, (Paint) null);
                }
                Bitmap bitmap3 = (Bitmap) sparseArray.get(2);
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, 40.0f * f2, f2 * 26.0f, (Paint) null);
                }
            } else {
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 7.0f * f2, 25.0f * f2, (Paint) null);
                }
                Bitmap bitmap4 = (Bitmap) sparseArray.get(1);
                if (bitmap4 != null) {
                    canvas.drawBitmap(bitmap4, 32.0f * f2, f2 * 7.0f, (Paint) null);
                }
            }
        } else if (imageUrl != null) {
            1OO A0J = 1NK.A00().A0J(imageUrl, "ROLL_CALL_FACEPILE");
            A0J.A02(new Lf2(canvas, i2, 0));
            A0J.A01();
        }
        r52.invoke(createBitmap);
        return C60340gF.A00;
    }
}
