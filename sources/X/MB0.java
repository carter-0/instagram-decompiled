package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.FileProvider;
import com.google.common.io.Closeables;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.user.model.User;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

public final class MB0 implements Callable {
    public final Context A00;
    public final UserSession A01;
    public final 1Xj A02;
    public final AnonymousClass3W1 A03;

    public final /* bridge */ /* synthetic */ Object call() {
        String[] strArr = new String[1];
        Integer[] numArr = new Integer[1];
        UserSession userSession = this.A01;
        1Xj r3 = this.A02;
        1OC A002 = FGA.A00(userSession, r3, this.A03, AnonymousClass05K.A0N, "");
        C61499KAe.A00(A002, numArr, strArr, 7);
        1ES.A02(A002);
        Integer num = numArr[0];
        String str = strArr[0];
        if (!(str == null || num == null || num.intValue() <= 0)) {
            User A2A = r3.A2A(userSession);
            if (A2A != null) {
                Context context = this.A00;
                NametagCardView nametagCardView = new NametagCardView(context, (AttributeSet) null);
                int intValue = num.intValue();
                nametagCardView.A01(A2A, intValue);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.call_participant_text_max_width);
                nametagCardView.measure(View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, SN3.MAX_SIGNED_POWER_OF_TWO));
                File A0s = JTO.A0s(JTO.A0s(context.getCacheDir(), "images"), "nametag_with_code.png");
                FileOutputStream A0t = JTO.A0t(A0s);
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    0qQ.A07(createBitmap);
                    Canvas A0B = JTO.A0B(createBitmap);
                    nametagCardView.layout(0, 0, dimensionPixelSize, dimensionPixelSize);
                    nametagCardView.draw(A0B);
                    0fO.A02(Bitmap.CompressFormat.PNG, createBitmap, A0t, 100);
                    A0t.flush();
                    Uri A003 = FileProvider.A00(context, A0s);
                    if (A003 != null) {
                        C55777HnC hnC = new C55777HnC(createBitmap, A003, str, intValue);
                        Closeables.A00(A0t, false);
                        return hnC;
                    }
                } catch (OutOfMemoryError unused) {
                } catch (Throwable th) {
                    Closeables.A00(A0t, false);
                    throw th;
                }
                Closeables.A00(A0t, false);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        throw JTO.A0u("failed to generate nametag screenshot");
    }

    public MB0(Context context, UserSession userSession, 1Xj r3, AnonymousClass3W1 r4) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r4;
    }
}
