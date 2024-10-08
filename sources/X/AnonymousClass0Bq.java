package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;

/* renamed from: X.0Bq  reason: invalid class name */
public final class AnonymousClass0Bq {
    public char A00;
    public char A01;
    public int A02;
    public int A03 = -1;
    public RandomAccessFile A04;
    public boolean A05 = true;
    public boolean A06 = false;
    public final byte[] A07 = new byte[512];

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0Bq.A02():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A02() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0Bq.A02():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Bq.A02():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0Bq.A03():boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final boolean A03() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0Bq.A03():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Bq.A03():boolean");
    }

    public final void A01() {
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.A04 = null;
                throw th;
            }
            this.A04 = null;
        }
    }

    public static void A00(AnonymousClass0Bq r2) {
        if (r2.A03()) {
            int i = r2.A03 + 1;
            r2.A03 = i;
            r2.A01 = r2.A00;
            r2.A00 = (char) r2.A07[i];
            r2.A06 = false;
            return;
        }
        throw new NoSuchElementException();
    }

    public final void finalize() {
        A01();
    }
}
