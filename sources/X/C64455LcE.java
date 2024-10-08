package X;

import com.instagram.ui.widget.mediapicker.Folder;

/* renamed from: X.LcE  reason: case insensitive filesystem */
public final class C64455LcE implements 1UV {
    public static final C64455LcE A00 = new C64455LcE();

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        Folder folder = (Folder) obj;
        if (folder == null) {
            throw AnonymousClass7TE.A0y();
        } else if (folder.A02 == -5 || folder.A05.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
