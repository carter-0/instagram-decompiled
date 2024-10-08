package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import com.google.common.io.Closeables;
import com.instagram.android.R;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* renamed from: X.MAw  reason: case insensitive filesystem */
public final class C66089MAw implements Callable {
    public final Context A00;
    public final View A01;
    public final ViewGroup A02;
    public final CirclePageIndicator A03;

    public final /* bridge */ /* synthetic */ Object call() {
        int i;
        Context context = this.A00;
        File A002 = 0qc.A00(context, ".png");
        Uri uri = null;
        if (A002 != null) {
            FileOutputStream A0t = JTO.A0t(A002);
            try {
                int A04 = JTR.A04(context);
                int i2 = A04 * 2;
                View view = this.A01;
                if (view != null) {
                    i = view.getHeight();
                } else {
                    i = 0;
                }
                ViewGroup viewGroup = this.A02;
                Bitmap A0B = AnonymousClass7TF.A0B(viewGroup.getWidth(), (viewGroup.getHeight() - i2) - i);
                Canvas A0B2 = JTO.A0B(A0B);
                A0B2.save();
                A0B2.translate(0.0f, -((float) A04));
                CirclePageIndicator circlePageIndicator = this.A03;
                if (circlePageIndicator != null) {
                    circlePageIndicator.setAlpha(0.0f);
                }
                if (view != null) {
                    view.setAlpha(0.0f);
                }
                viewGroup.draw(A0B2);
                if (circlePageIndicator != null) {
                    circlePageIndicator.setAlpha(1.0f);
                }
                if (view != null) {
                    view.setAlpha(1.0f);
                }
                A0B2.restore();
                0fO.A02(Bitmap.CompressFormat.PNG, A0B, A0t, 100);
                A0t.flush();
                uri = FileProvider.A00(context, A002);
            } catch (Exception unused) {
            } catch (Throwable th) {
                Closeables.A00(A0t, false);
                throw th;
            }
            Closeables.A00(A0t, false);
        }
        return uri;
    }

    public C66089MAw(Context context, ViewGroup viewGroup) {
        AnonymousClass7TG.A1O(context, viewGroup);
        this.A00 = context;
        this.A02 = viewGroup;
        this.A03 = (CirclePageIndicator) viewGroup.findViewById(R.id.page_indicator);
        this.A01 = viewGroup.findViewById(R.id.profile_share_card);
    }
}
