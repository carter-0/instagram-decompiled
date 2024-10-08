package com.google.common.io;

import X.17k;
import X.1W7;
import X.C227852k8;
import X.C227882kF;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;

public abstract class Files {
    public static void A00(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create parent directories of ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }
    }

    public static void A01(File file, File file2) {
        Throwable cast;
        17k.A09(file, file2, "Source %s and destination %s must be different", !file.equals(file2));
        ImmutableSet A04 = ImmutableSet.A04(new FileWriteMode[0]);
        C227882kF r4 = C227852k8.A00;
        ArrayDeque arrayDeque = new ArrayDeque(4);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, A04.contains(FileWriteMode.A01));
            arrayDeque.addFirst(fileOutputStream);
            1W7.A00(fileInputStream, fileOutputStream);
            C227852k8.A00(r4, (Throwable) null, arrayDeque);
        } catch (Throwable th) {
            C227852k8.A00(r4, th, arrayDeque);
            throw th;
        }
    }

    public static void A02(File file, File file2) {
        file.getClass();
        17k.A09(file, file2, "Source %s and destination %s must be different", !file.equals(file2));
        if (!file.renameTo(file2)) {
            A01(file, file2);
            if (!file.delete()) {
                boolean delete = file2.delete();
                StringBuilder sb = new StringBuilder();
                if (!delete) {
                    sb.append("Unable to delete ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
                sb.append("Unable to delete ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }
    }
}
