package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

public final class AGw {
    public static final AGw A00 = new Object();

    public final Dialog A01(Context context, Bitmap bitmap, UserSession userSession, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C2801950r r16, PendingRecipient pendingRecipient, C62320sa r18) {
        Context context2;
        UserSession userSession2 = userSession;
        ClipsCreationDraftViewModel clipsCreationDraftViewModel2 = clipsCreationDraftViewModel;
        AnonymousClass7TG.A1P(userSession, clipsCreationDraftViewModel);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36323547739598079L)) {
            context2 = 2Yn.A01(context);
        } else {
            context2 = context;
        }
        C358248ab r2 = new C358248ab(context2);
        r2.A09(2131955334);
        r2.A0r(false);
        r2.A08(2131955335);
        r2.A0J(new AKK(r18, 8), 2131955331);
        r2.A0O(new I90(0, (Object) r16, (Object) pendingRecipient, (Object) userSession2, (Object) clipsCreationDraftViewModel2), C358278ae.DEFAULT, 2131955333);
        if (182.A06(r3, userSession, 36324600006586546L)) {
            r2.A0i(A00(context, bitmap));
        }
        return r2.A02();
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [X.8DV, X.8DU] */
    public static final AnonymousClass8DU A00(Context context, Bitmap bitmap) {
        int i;
        int width;
        if (bitmap == null) {
            return null;
        }
        int width2 = bitmap.getWidth();
        int height = bitmap.getHeight();
        float dimension = context.getResources().getDimension(R.dimen.appreciation_reels_grid_item_width);
        if (width2 > height) {
            width = (int) dimension;
            i = (bitmap.getHeight() * width) / bitmap.getWidth();
        } else {
            i = (int) dimension;
            width = (bitmap.getWidth() * i) / bitmap.getHeight();
        }
        ? r2 = new AnonymousClass8DV(context.getResources(), 0fO.A00(bitmap, width, i, true));
        r2.A02(context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material));
        return r2;
    }
}
