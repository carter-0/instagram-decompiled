package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;

/* renamed from: X.6YB  reason: invalid class name */
public abstract class AnonymousClass6YB {
    public static void A00(C250973mM r5, C316946mT r6, C317266mz r7) {
        View requireViewById;
        View.OnClickListener iax;
        0lp A00 = 0lq.A00("ReelSuggestedHighlightFooterViewBinder.bindView");
        try {
            Reel reel = r5.A0H;
            if (reel.A0t()) {
                r6.A00.A02();
            } else if (!reel.A0p() || r5.A0D) {
                r6.A00.A03(8);
            } else {
                C71662eb r1 = r6.A00;
                r1.A03(0);
                View A01 = r1.A01();
                ReelType reelType = reel.A0P;
                if (reelType == ReelType.A0J) {
                    requireViewById = A01.requireViewById(R.id.reel_viewer_publish_suggested_highlights_button);
                    iax = new IAU(r7);
                } else if (reelType == ReelType.A0D) {
                    requireViewById = A01.requireViewById(R.id.reel_viewer_birthday_highlight_next_button);
                    iax = new IAV(r7);
                } else {
                    AnonymousClass0fU.A00(new IAW(r7), A01.requireViewById(R.id.reel_viewer_edit_suggested_highlights_button));
                    requireViewById = A01.requireViewById(R.id.reel_viewer_publish_suggested_highlights_button);
                    iax = new IAX(r7);
                }
                AnonymousClass0fU.A00(iax, requireViewById);
            }
            A00.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
