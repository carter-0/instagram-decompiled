package X;

import java.io.IOException;

/* renamed from: X.JUe  reason: case insensitive filesystem */
public abstract class C59697JUe {
    public static final C272024jy A00(String str) {
        if (str != null) {
            try {
                return C271984ju.parseFromJson(16P.A00(str));
            } catch (IOException e) {
                0kD.A06("CommentPollConverter", "Failed to deserialize Poll from ClipsDraft", e);
            }
        }
        return null;
    }
}
