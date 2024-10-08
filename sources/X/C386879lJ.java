package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.inputmethod.InputContentInfo;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* renamed from: X.9lJ  reason: invalid class name and case insensitive filesystem */
public final class C386879lJ extends 0ng {
    public final /* synthetic */ AnonymousClass05V A00;
    public final /* synthetic */ AnonymousClass7JA A01;
    public final /* synthetic */ IgAutoCompleteTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386879lJ(AnonymousClass05V r4, AnonymousClass7JA r5, IgAutoCompleteTextView igAutoCompleteTextView) {
        super(120, 3, false, false);
        this.A02 = igAutoCompleteTextView;
        this.A00 = r4;
        this.A01 = r5;
    }

    public final void run() {
        Bitmap createBitmap;
        Context A0S = AnonymousClass7TE.A0S(this.A02);
        AnonymousClass05V r0 = this.A00;
        AnonymousClass7JA r6 = this.A01;
        InputContentInfo inputContentInfo = r0.A00.A00;
        Bitmap A022 = 1MF.A02(A0S, inputContentInfo.getContentUri());
        if (A022 == null) {
            createBitmap = null;
        } else {
            int width = A022.getWidth();
            int height = A022.getHeight();
            Bitmap.Config config = A022.getConfig();
            0qQ.A0A(config);
            createBitmap = Bitmap.createBitmap(width, height, config);
            0qQ.A07(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-1);
            canvas.drawBitmap(A022, 0.0f, 0.0f, (Paint) null);
            A022.recycle();
        }
        inputContentInfo.releasePermission();
        11Z.A02(new M7W(createBitmap, r6));
    }
}
