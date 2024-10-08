package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Kg  reason: invalid class name */
public abstract class AnonymousClass5Kg extends AnonymousClass5Kh {
    public static final String A05(File file) {
        0qQ.A0B(file, 0);
        String name = file.getName();
        0qQ.A07(name);
        return 00l.A0I(name, "", '.');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0067, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(java.io.File r4, java.io.File r5, boolean r6) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x006b
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x002c
            if (r6 == 0) goto L_0x0024
            boolean r0 = r5.delete()
            if (r0 != 0) goto L_0x002c
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            X.Imj r0 = new X.Imj
            r0.<init>(r4, r5, r1)
            throw r0
        L_0x0024:
            java.lang.String r1 = "The destination file already exists."
            X.Imj r0 = new X.Imj
            r0.<init>(r4, r5, r1)
            throw r0
        L_0x002c:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x0040
            boolean r0 = r5.mkdirs()
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = "Failed to create target directory."
            X.RCc r0 = new X.RCc
            r0.<init>(r4, r5, r1)
            throw r0
        L_0x0040:
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto L_0x0049
            r0.mkdirs()
        L_0x0049:
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r4)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0064 }
            r2.<init>(r5)     // Catch:{ all -> 0x0064 }
            X.C11108SAj.A00(r3, r2)     // Catch:{ all -> 0x005d }
            r2.close()     // Catch:{ all -> 0x0064 }
            r3.close()
        L_0x005c:
            return
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        L_0x006b:
            r2 = 0
            java.lang.String r1 = "The source file doesn't exist."
            X.Imk r0 = new X.Imk
            r0.<init>(r4, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Kg.A08(java.io.File, java.io.File, boolean):void");
    }

    public static final boolean A09(File file, File file2) {
        0sn arrayList;
        0sn arrayList2;
        String path = file.getPath();
        0qQ.A0A(path);
        int A04 = C272144kC.A04(path);
        String substring = path.substring(0, A04);
        0qQ.A07(substring);
        String substring2 = path.substring(A04);
        0qQ.A07(substring2);
        if (substring2.length() == 0) {
            arrayList = 0sn.A00;
        } else {
            List<String> A0Q = 00l.A0Q(substring2, new char[]{File.separatorChar}, 0);
            arrayList = new ArrayList(0Yv.A1E(A0Q, 10));
            for (String file3 : A0Q) {
                arrayList.add(new File(file3));
            }
        }
        File file4 = new File(substring);
        String path2 = file2.getPath();
        0qQ.A0A(path2);
        int A042 = C272144kC.A04(path2);
        String substring3 = path2.substring(0, A042);
        0qQ.A07(substring3);
        String substring4 = path2.substring(A042);
        0qQ.A07(substring4);
        if (substring4.length() == 0) {
            arrayList2 = 0sn.A00;
        } else {
            List<String> A0Q2 = 00l.A0Q(substring4, new char[]{File.separatorChar}, 0);
            arrayList2 = new ArrayList(0Yv.A1E(A0Q2, 10));
            for (String file5 : A0Q2) {
                arrayList2.add(new File(file5));
            }
        }
        if (file4.equals(new File(substring3)) && arrayList.size() >= arrayList2.size()) {
            return arrayList.subList(0, arrayList2.size()).equals(arrayList2);
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Iterator, X.Y5z] */
    public static final void A07(File file) {
        ? y5z = new C22480Y5z(new C22444Y4b(file, AnonymousClass05K.A01));
        while (true) {
            boolean z = true;
            while (true) {
                if (y5z.hasNext()) {
                    File file2 = (File) y5z.next();
                    if (file2.delete() || !file2.exists()) {
                        if (z) {
                        }
                    }
                    z = false;
                } else {
                    return;
                }
            }
        }
    }

    public static final String A06(File file) {
        String name = file.getName();
        0qQ.A07(name);
        int A07 = 00l.A07(name, ".", name.length() - 1);
        if (A07 == -1) {
            return name;
        }
        String substring = name.substring(0, A07);
        0qQ.A07(substring);
        return substring;
    }
}
