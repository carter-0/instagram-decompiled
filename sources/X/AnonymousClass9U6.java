package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Collection;

/* renamed from: X.9U6  reason: invalid class name */
public final class AnonymousClass9U6 implements C13819Thn {
    public final FileStash A00;

    public final long Cf8(String str) {
        return 0;
    }

    public final long[] getItemInformation(String str) {
        FileStash fileStash = this.A00;
        return new long[]{0, fileStash.lastAccessTime(str), fileStash.getItemSizeBytes(str)};
    }

    public final Collection Aav() {
        return this.A00.getAllKeys();
    }

    public final boolean Cdx(String str) {
        File filePath = this.A00.getFilePath(str);
        if (!filePath.exists() || filePath.canExecute()) {
            return false;
        }
        return true;
    }

    public final boolean remove(String str) {
        return this.A00.remove(str);
    }

    public AnonymousClass9U6(FileStash fileStash) {
        this.A00 = fileStash;
    }
}
