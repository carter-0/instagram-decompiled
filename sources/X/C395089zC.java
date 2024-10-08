package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.9zC  reason: invalid class name and case insensitive filesystem */
public abstract class C395089zC {
    public static final C321016tR A00(View view, CommentGiphyMediaInfo commentGiphyMediaInfo, UserSession userSession) {
        CommentGiphyMediaImages commentGiphyMediaImages;
        CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages;
        Float f;
        Float f2;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(view, userSession);
        String str = commentGiphyMediaInfo.A03;
        if (str == null || (commentGiphyMediaImages = commentGiphyMediaInfo.A01) == null || (commentGiphyMediaFixedHeightImages = commentGiphyMediaImages.A00) == null) {
            return null;
        }
        String url = commentGiphyMediaFixedHeightImages.getUrl();
        String CGK = commentGiphyMediaFixedHeightImages.CGK();
        Integer CGY = commentGiphyMediaFixedHeightImages.CGY();
        if (CGY != null) {
            f = Float.valueOf((float) CGY.intValue());
        } else {
            f = null;
        }
        Integer BCu = commentGiphyMediaFixedHeightImages.BCu();
        if (BCu != null) {
            f2 = Float.valueOf((float) BCu.intValue());
        } else {
            f2 = null;
        }
        if (url == null || f == null || f2 == null) {
            return null;
        }
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        GifUrlImpl gifUrlImpl = new GifUrlImpl(url, CGK, floatValue, floatValue2);
        Context A0S = AnonymousClass7TE.A0S(view);
        float A00 = C61380mr.A00(A0S, 1.0f);
        float f3 = floatValue / floatValue2;
        int A01 = C61380mr.A01(A0S, view.getHeight());
        float f4 = (float) A01;
        C321076tX A002 = C321066tW.A00(f3, A01, (int) (f4 / f3), -1);
        C321076tX A003 = C321066tW.A00(f3, (int) (f4 * f3), A01, -1);
        if (f3 >= 1.0f) {
            A002 = A003;
        }
        return new C321016tR(A0S, userSession2, A002, gifUrlImpl, AnonymousClass05K.A00, str, A00, AnonymousClass7TF.A03(A0S, R.attr.stickerLoadingStartColor), AnonymousClass7TF.A03(A0S, R.attr.stickerLoadingEndColor));
    }
}
