package X;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/* renamed from: X.6u1  reason: invalid class name and case insensitive filesystem */
public final class C321376u1 implements Runnable {
    public final /* synthetic */ 1JG A00;
    public final /* synthetic */ C331897Sw A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C321376u1(1JG r1, C331897Sw r2, Runnable runnable, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A04 = str;
        this.A00 = r1;
        this.A03 = str2;
        this.A01 = r2;
        this.A02 = runnable;
        this.A06 = z;
        this.A05 = z2;
        this.A07 = z3;
    }

    public final void run() {
        String str = this.A04;
        Uri A032 = 0cp.A03(str);
        0qQ.A07(A032);
        1JG r8 = this.A00;
        String str2 = this.A03;
        if (r8.CJV(str2)) {
            C331897Sw.A01(r8, this.A01, this.A02, str, str2, this.A06, this.A05);
        } else if ("content".equals(A032.getScheme())) {
            C331897Sw r9 = this.A01;
            Runnable runnable = this.A02;
            boolean z = this.A06;
            C331897Sw r0 = C331897Sw.A0A;
            Uri A033 = 0cp.A03(str);
            0qQ.A07(A033);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                InputStream openInputStream = r9.A00.getContentResolver().openInputStream(A033);
                if (openInputStream != null) {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    openInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    0qQ.A07(byteArray);
                    if (C331917Sy.A01(r8, str2, byteArray)) {
                        C331897Sw.A01(r8, r9, runnable, str, str2, z, false);
                    } else {
                        runnable.run();
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } catch (IOException unused) {
                runnable.run();
            }
        } else if ("file".equals(A032.getScheme())) {
            C331897Sw r4 = this.A01;
            File file = new File(A032.getPath());
            Runnable runnable2 = this.A02;
            boolean z2 = this.A06;
            boolean z3 = this.A05;
            C331897Sw r02 = C331897Sw.A0A;
            r4.A06.execute(new C20352Wpr(r4, file, runnable2, str, str2, z2, z3));
        } else {
            C331897Sw r92 = this.A01;
            Runnable runnable3 = this.A02;
            boolean z4 = this.A06;
            boolean z5 = this.A05;
            boolean z6 = this.A07;
            C331897Sw r03 = C331897Sw.A0A;
            AnonymousClass1T9 A062 = 14G.A03().A06(new AnonymousClass6u2(r8, r92, new ByteArrayOutputStream(), runnable3, str2, str, z4, z5), C331897Sw.A0B, AnonymousClass2hY.A09.E1h(str), (0lg) null);
            0qQ.A07(A062);
            if (z6) {
                LinkedList linkedList = r92.A04;
                linkedList.add(A062);
                while (linkedList.size() > 12) {
                    AnonymousClass1TA r04 = (AnonymousClass1TA) linkedList.pollFirst();
                    if (r04 != null) {
                        r04.cancel();
                    }
                }
            }
        }
    }
}
