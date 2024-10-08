package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public final class U37 extends View {
    public final ArrayList A00;
    public final /* synthetic */ C17564VaI A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U37(Context context, C17564VaI vaI, ArrayList arrayList) {
        super(context);
        this.A01 = vaI;
        this.A00 = arrayList;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C17724Vct vct = (C17724Vct) it.next();
            Matrix matrix = vct.A0D;
            matrix.reset();
            matrix.postTranslate(vct.A02, vct.A03);
            Paint paint = vct.A0E;
            paint.setAlpha(vct.A08);
            canvas.drawBitmap(vct.A0C, matrix, paint);
        }
    }
}
