package X;

import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import java.io.IOException;

public abstract class Cb1 {
    public static AnonymousClass60C parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            NotePogImageDict notePogImageDict = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            NotePogVideoDict notePogVideoDict = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("image_dict".equals(A17)) {
                    notePogImageDict = C44238Caz.parseFromJson(r4);
                } else if ("video_dict".equals(A17)) {
                    notePogVideoDict = Cb0.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new AnonymousClass60C(notePogImageDict, notePogVideoDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
