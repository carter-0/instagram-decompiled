package X;

import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.GIFNoteResponseInfoImpl;
import java.io.IOException;

/* renamed from: X.CXx  reason: case insensitive filesystem */
public abstract class C44158CXx {
    public static GIFNoteResponseInfoImpl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            CommentGiphyMediaInfo commentGiphyMediaInfo = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("gif_info".equals(AnonymousClass7TE.A17(r3))) {
                    commentGiphyMediaInfo = C45527Cy1.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new GIFNoteResponseInfoImpl(commentGiphyMediaInfo);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
