package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3oW  reason: invalid class name and case insensitive filesystem */
public final class C252073oW extends 1LQ {
    public final List A00 = new LinkedList();
    public final List A01 = new LinkedList();
    public final List A02 = new LinkedList();

    private void A00(String str, int i) {
        for (AnonymousClass4CJ DHs : this.A00) {
            DHs.DHs(str, i, (Map) null);
        }
    }

    private void A01(String str, int i) {
        for (AnonymousClass4CJ DKq : this.A01) {
            DKq.DKq(str, i, (Map) null);
        }
    }

    public final boolean A02(String str, int i) {
        List<AnonymousClass4CJ> list = this.A02;
        boolean isEmpty = list.isEmpty();
        boolean remove = this.A00.remove(str, i);
        if (!isEmpty) {
            int i2 = 1;
            if (remove) {
                i2 = 2;
            }
            for (AnonymousClass4CJ DdH : list) {
                DdH.DdH(i, i2, str, (Map) null);
            }
        }
        return remove;
    }

    public final boolean remove(String str) {
        return A02(str, 0);
    }

    public final File getFile(String str) {
        if (this.A00.isEmpty()) {
            return this.A00.getFile(str);
        }
        int i = 0;
        try {
            FileStash fileStash = this.A00;
            File file = fileStash.getFile(str);
            boolean hasKey = fileStash.hasKey(str);
            int i2 = 1;
            if (hasKey) {
                i2 = 6;
            }
            return file;
        } finally {
            A00(str, i);
        }
    }

    public final File insertFile(String str) {
        boolean isEmpty = this.A01.isEmpty();
        FileStash fileStash = this.A00;
        if (isEmpty) {
            return fileStash.insertFile(str);
        }
        int i = 0;
        if (fileStash.hasKey(str)) {
            i = 8;
        }
        try {
            return fileStash.insertFile(str);
        } finally {
            A01(str, i | 4 | 2);
        }
    }

    public final InputStream read(String str) {
        if (this.A00.isEmpty()) {
            return this.A00.read(str);
        }
        int i = 0;
        try {
            InputStream read = this.A00.read(str);
            int i2 = 1;
            if (read != null) {
                i2 = 6;
            }
            return read;
        } finally {
            A00(str, i);
        }
    }

    public final byte[] readResourceToMemory(String str) {
        int i;
        if (this.A00.isEmpty()) {
            return this.A00.readResourceToMemory(str);
        }
        i = 0;
        int i2 = 1;
        try {
            byte[] readResourceToMemory = this.A00.readResourceToMemory(str);
            if (readResourceToMemory != null) {
                i2 = 2;
            }
            A00(str, i2);
            return readResourceToMemory;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            th = th;
            i = 1;
        }
        A00(str, i);
        throw th;
    }

    public final OutputStream write(String str) {
        int i;
        if (this.A01.isEmpty()) {
            return this.A00.write(str);
        }
        int i2 = 1;
        i = 0;
        try {
            FileStash fileStash = this.A00;
            if (fileStash.hasKey(str)) {
                i = 8;
            }
            OutputStream write = fileStash.write(str);
            if (write != null) {
                i2 = i | 4 | 2;
            }
            A01(str, i2);
            return write;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            th = th;
            i = 1;
        }
        A01(str, i);
        throw th;
    }

    public C252073oW(FileStash fileStash, List list) {
        super(fileStash);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass4CK r1 = (AnonymousClass4CK) it.next();
            r1.A00 = new AnonymousClass4CL(this);
            this.A01.add(r1);
            this.A00.add(r1);
            this.A02.add(r1);
        }
    }

    public final boolean remove(String str, int i) {
        return A02(str, i);
    }

    public final void write(String str, byte[] bArr) {
        int i;
        boolean isEmpty = this.A01.isEmpty();
        FileStash fileStash = this.A00;
        if (isEmpty) {
            fileStash.write(str, bArr);
            return;
        }
        int i2 = 0;
        if (fileStash.hasKey(str)) {
            i2 = 8;
        }
        try {
            fileStash.write(str, bArr);
            A01(str, i2 | 2);
        } catch (IOException e) {
            i = i2 | 1;
            throw e;
        } catch (Throwable th) {
            A01(str, i);
            throw th;
        }
    }
}
