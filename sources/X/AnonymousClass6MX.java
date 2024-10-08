package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.Pair;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6MX  reason: invalid class name */
public abstract class AnonymousClass6MX {
    public static final Bitmap A00(Resources resources, int i) {
        0qQ.A0B(resources, 0);
        2eG drawable = resources.getDrawable(i, (Resources.Theme) null);
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            0qQ.A0A(bitmap);
            return bitmap;
        } else if (drawable instanceof C71612eI) {
            2eG r4 = (C71612eI) drawable;
            AnonymousClass2e3 r1 = r4.A00.A0B;
            AtomicReference atomicReference = r1.A03;
            Pair pair = (Pair) atomicReference.get();
            if (pair == null) {
                int A00 = AnonymousClass2eF.A00(resources, (float) r1.A01);
                int A002 = AnonymousClass2eF.A00(resources, (float) r1.A00);
                r4.mutate();
                r4.setBounds(0, 0, A00, A002);
                Pair pair2 = new Pair(Bitmap.createBitmap(A00, A002, Bitmap.Config.ALPHA_8), (Object) null);
                r4.draw(new Canvas((Bitmap) pair2.first));
                if (!1FH.A00((Object) null, pair2, atomicReference)) {
                    Object obj = pair2.second;
                    if (obj != null) {
                        ((C249903kY) obj).close();
                    } else {
                        ((Bitmap) pair2.first).recycle();
                    }
                }
                pair = (Pair) atomicReference.get();
            }
            Bitmap bitmap2 = (Bitmap) pair.first;
            0qQ.A07(bitmap2);
            return bitmap2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected drawable type: ");
            sb.append(drawable);
            throw new RuntimeException(sb.toString());
        }
    }
}
