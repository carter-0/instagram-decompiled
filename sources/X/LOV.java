package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class LOV {
    public Bitmap A00;
    public final Context A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final 1ua A04;

    public static String A00(LOV lov) {
        ArrayList A05 = 28K.A00(lov.A03).A05(AnonymousClass05K.A0u);
        Collections.sort(A05, new MAZ((Object) lov, 0));
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            String str = JTO.A0m(it).A33;
            if (!TextUtils.isEmpty(str)) {
                File A0t = AnonymousClass7TE.A0t(str);
                if (A0t.exists() && A0t.canRead()) {
                    return str;
                }
            }
        }
        return null;
    }

    public final Bitmap A01(C62594KiR kiR) {
        this.A00.getClass();
        Drawable drawable = this.A01.getDrawable(kiR.A02);
        float A012 = JTO.A01(this.A00);
        float f = kiR.A00;
        int i = (int) (A012 * f);
        int intrinsicWidth = (int) (((float) (drawable.getIntrinsicWidth() * i)) / ((float) drawable.getIntrinsicHeight()));
        float A013 = JTO.A01(this.A00);
        float f2 = kiR.A01;
        int max = Math.max(this.A00.getWidth(), intrinsicWidth);
        Bitmap createBitmap = Bitmap.createBitmap(max, (int) (A013 * Math.max(f2 + f, 1.0f)), Bitmap.Config.ARGB_8888);
        Canvas A0B = JTO.A0B(createBitmap);
        Path A0C = C51965G9l.A0C();
        A0C.addOval(new RectF(0.0f, 0.0f, JTO.A02(this.A00), JTO.A01(this.A00)), Path.Direction.CW);
        Paint A0D = JTP.A0D();
        A0B.save();
        A0B.translate(((float) (max - this.A00.getWidth())) / 2.0f, 0.0f);
        Bitmap bitmap = this.A00;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        A0D.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        A0B.drawPath(A0C, A0D);
        A0B.restore();
        A0B.save();
        A0B.translate(((float) (max - intrinsicWidth)) / 2.0f, JTO.A01(this.A00) * f2);
        A0D.setShader((Shader) null);
        Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
        bitmap2.getClass();
        A0B.drawBitmap(bitmap2, (Rect) null, new RectF(0.0f, 0.0f, (float) intrinsicWidth, (float) i), A0D);
        A0B.restore();
        return createBitmap;
    }

    public final boolean A02() {
        if (this.A00 != null) {
            return true;
        }
        AnonymousClass16l BVO = DbV.A0k(this.A03).BVO();
        if ((BVO == null || C253833rU.A02(BVO.Bs6())) && TextUtils.isEmpty(A00(this))) {
            return false;
        }
        return true;
    }

    public LOV(Context context, AnonymousClass4DH r3, UserSession userSession) {
        this.A01 = context;
        this.A02 = r3;
        this.A03 = userSession;
        this.A04 = 1ua.A00(context, userSession);
    }
}
