package X;

import android.content.Context;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImagesImpl;
import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.OOm  reason: case insensitive filesystem */
public abstract class C70857OOm {
    public static final CommentGiphyMediaInfo A00(C68137N2b n2b) {
        String str;
        0qQ.A0B(n2b, 0);
        DirectAnimatedMedia directAnimatedMedia = n2b.A01;
        CommentGiphyMediaImages commentGiphyMediaImages = null;
        CommentGiphyMediaImages commentGiphyMediaImages2 = new CommentGiphyMediaInfo((CommentGiphyMediaImages) null, (CommentGiphyMediaImages) null, (Boolean) null, (String) null, (String) null, (String) null).A00;
        String str2 = directAnimatedMedia.A05;
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        CommentGiphyMediaImages commentGiphyMediaImages3 = new CommentGiphyMediaImages(new CommentGiphyMediaFixedHeightImagesImpl(C66581MXm.A0p(gifUrlImpl.A02), (Integer) null, (Integer) null, (Integer) null, C66581MXm.A0p(gifUrlImpl.A03), (String) null, gifUrlImpl.A09, gifUrlImpl.A0A));
        Boolean valueOf = Boolean.valueOf(directAnimatedMedia.A06);
        DirectAnimatedMediaUser directAnimatedMediaUser = directAnimatedMedia.A01;
        if (directAnimatedMediaUser != null) {
            str = directAnimatedMediaUser.A00;
        } else {
            str = null;
        }
        if (commentGiphyMediaImages2 != null) {
            commentGiphyMediaImages = commentGiphyMediaImages2.F1w();
        }
        return new CommentGiphyMediaInfo(commentGiphyMediaImages, commentGiphyMediaImages3, valueOf, str2, (String) null, str);
    }

    public static final void A01(Context context, UserSession userSession, C69319NjK njK, String str, 0sP r16) {
        AnonymousClass37D A02;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        String str2 = str;
        0sP r1 = r16;
        C51972G9s.A1C(str, r1);
        if (context != null && (A02 = AnonymousClass37D.A00.A02(context)) != null) {
            C331157Pu A00 = C48943Emh.A00(A02);
            P47 p47 = new P47(A00, A02, r1);
            boolean A1V = AnonymousClass7TF.A1V(A00);
            0sn r10 = 0sn.A00;
            0qQ.A0B(r10, 23);
            C68464NJc A01 = OPG.A01(userSession2, p47, njK, str2, r10, A1V);
            if (A00 != null) {
                BottomSheetFragment A09 = A02.A09();
                if (A09 != null) {
                    A09.A0T(0);
                }
                C331127Pr A0W = DbS.A0W(userSession);
                A0W.A11 = true;
                DbZ.A0z(context, A0W, 2131963067);
                DbS.A1S(A0W, true);
                A0W.A03 = 0.7f;
                0qQ.A0A(A01);
                A00.A0F(A01, A0W);
                return;
            }
            0qQ.A0A(A01);
            A02.A0J(A01);
        }
    }
}
