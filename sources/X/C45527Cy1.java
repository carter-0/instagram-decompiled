package X;

import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import java.io.IOException;

/* renamed from: X.Cy1  reason: case insensitive filesystem */
public abstract class C45527Cy1 {
    public static CommentGiphyMediaInfo parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            CommentGiphyMediaImages commentGiphyMediaImages = null;
            String str = null;
            CommentGiphyMediaImages commentGiphyMediaImages2 = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("first_party_cdn_proxied_images".equals(A17)) {
                    commentGiphyMediaImages = C45526Cy0.parseFromJson(r9);
                } else if ("gif_media_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("images".equals(A17)) {
                    commentGiphyMediaImages2 = C45526Cy0.parseFromJson(r9);
                } else if (C41845B3m.A1P(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if (C41845B3m.A1E(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if (Dbk.A00().equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new CommentGiphyMediaInfo(commentGiphyMediaImages, commentGiphyMediaImages2, bool, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, CommentGiphyMediaInfo commentGiphyMediaInfo) {
        r2.A0c();
        CommentGiphyMediaImages commentGiphyMediaImages = commentGiphyMediaInfo.A00;
        if (commentGiphyMediaImages != null) {
            r2.A0q("first_party_cdn_proxied_images");
            C45526Cy0.A00(r2, commentGiphyMediaImages);
        }
        String str = commentGiphyMediaInfo.A03;
        if (str != null) {
            r2.A0R("gif_media_id", str);
        }
        CommentGiphyMediaImages commentGiphyMediaImages2 = commentGiphyMediaInfo.A01;
        if (commentGiphyMediaImages2 != null) {
            r2.A0q("images");
            C45526Cy0.A00(r2, commentGiphyMediaImages2);
        }
        Boolean bool = commentGiphyMediaInfo.A02;
        if (bool != null) {
            r2.A0S("is_sticker", bool.booleanValue());
        }
        C41846B3n.A10(r2, commentGiphyMediaInfo.A04);
        String str2 = commentGiphyMediaInfo.A05;
        if (str2 != null) {
            r2.A0R(Dbk.A00(), str2);
        }
        r2.A0Z();
    }
}
