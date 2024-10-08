package X;

import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;

public final class SEK {
    public final long A00;
    public final byte[] A01;

    public SEK(RandomAccessFile randomAccessFile) {
        long filePointer = randomAccessFile.getFilePointer();
        this.A00 = filePointer;
        long readInt = (long) randomAccessFile.readInt();
        if (readInt == 0) {
            readInt = randomAccessFile.length() - filePointer;
        } else if (readInt == 1) {
            readInt = randomAccessFile.readLong();
        }
        byte[] bArr = new byte[4];
        this.A01 = bArr;
        randomAccessFile.readFully(bArr);
        randomAccessFile.seek(filePointer + readInt);
    }

    public static SEK A00(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.getFilePointer() >= randomAccessFile.length() - 8) {
            return null;
        }
        byte[] bArr = new byte[4];
        randomAccessFile.skipBytes(4);
        randomAccessFile.readFully(bArr);
        String str = new String(bArr);
        randomAccessFile.seek(randomAccessFile.getFilePointer() - 8);
        Package packageR = SEK.class.getPackage();
        packageR.getClass();
        try {
            return (SEK) Class.forName(002.A0g(packageR.getName(), ".", str.toUpperCase())).getConstructor(new Class[]{RandomAccessFile.class}).newInstance(new Object[]{randomAccessFile});
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return new SEK(randomAccessFile);
        }
    }
}
