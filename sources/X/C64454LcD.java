package X;

import com.instagram.ui.widget.mediapicker.Folder;

/* renamed from: X.LcD  reason: case insensitive filesystem */
public final class C64454LcD implements 1UV {
    public static final C64454LcD A00 = new C64454LcD();

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        Folder folder = (Folder) obj;
        if (folder == null || folder.A02 == -5 || folder.A05.isEmpty()) {
            return false;
        }
        return true;
    }
}
