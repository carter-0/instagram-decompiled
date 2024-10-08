package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.K2n  reason: case insensitive filesystem */
public final class C61326K2n extends LEL implements C66422MRc {
    public static final void A00(C61326K2n k2n) {
        try {
            ViewGroup viewGroup = k2n.A06;
            Bitmap A0B = AnonymousClass7TF.A0B(viewGroup.getWidth(), (viewGroup.getHeight() - k2n.A01) - k2n.A00);
            Canvas A0B2 = JTO.A0B(A0B);
            A0B2.translate(0.0f, -((float) k2n.A02));
            k2n.A01();
            viewGroup.draw(A0B2);
            View view = k2n.A05;
            if (view != null) {
                view.setVisibility(0);
            }
            CirclePageIndicator circlePageIndicator = k2n.A0B;
            if (circlePageIndicator != null) {
                circlePageIndicator.setVisibility(0);
            }
            View view2 = k2n.A04;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            PdfDocument pdfDocument = new PdfDocument();
            PdfDocument.PageInfo create = new PdfDocument.PageInfo.Builder(A0B.getWidth(), A0B.getHeight(), 1).create();
            0qQ.A07(create);
            PdfDocument.Page startPage = pdfDocument.startPage(create);
            0qQ.A07(startPage);
            startPage.getCanvas().drawBitmap(A0B, 0.0f, 0.0f, (Paint) null);
            pdfDocument.finishPage(startPage);
            C290815g0 A00 = MB7.A00(pdfDocument, k2n, 2);
            A00.A00 = k2n.A0A;
            1ES.A03(A00);
        } catch (Exception unused) {
        }
    }

    public final void FNd() {
        if (Build.VERSION.SDK_INT < 33) {
            Context context = this.A03;
            if (!1DL.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C64729Lh6 lh6 = new C64729Lh6(0, new C66069MAc(this, 2), this);
                JTO.A1Z(context);
                JTP.A11((Activity) context, lh6, "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
        }
        A00(this);
    }
}
