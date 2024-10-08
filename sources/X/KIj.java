package X;

import android.content.Context;
import com.google.common.io.Closeables;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class KIj extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIj(Context context, String str) {
        super(103, 4, false, false);
        this.A01 = str;
        this.A00 = context;
    }

    public final void run() {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(this.A01);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            } catch (IOException | IllegalArgumentException | NullPointerException e) {
                e = e;
                bufferedInputStream = null;
                try {
                    0KC.A0H("FollowersShareFragment", "Gallery save error", e);
                    Closeables.A01(fileInputStream);
                    Closeables.A01(bufferedInputStream);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    Closeables.A01(fileInputStream2);
                    Closeables.A01(bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
                fileInputStream2 = fileInputStream;
                Closeables.A01(fileInputStream2);
                Closeables.A01(bufferedInputStream);
                throw th;
            }
            try {
                Context context = this.A00;
                File A002 = 0qc.A00(context, ".jpg");
                if (A002 != null) {
                    0mb.A09(A002, bufferedInputStream);
                    C59730JVo.A08(context, A002);
                }
            } catch (IOException | IllegalArgumentException | NullPointerException e2) {
                e = e2;
                0KC.A0H("FollowersShareFragment", "Gallery save error", e);
                Closeables.A01(fileInputStream);
                Closeables.A01(bufferedInputStream);
            }
        } catch (IOException | IllegalArgumentException | NullPointerException e3) {
            e = e3;
            bufferedInputStream = null;
            fileInputStream = null;
            0KC.A0H("FollowersShareFragment", "Gallery save error", e);
            Closeables.A01(fileInputStream);
            Closeables.A01(bufferedInputStream);
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            Closeables.A01(fileInputStream2);
            Closeables.A01(bufferedInputStream);
            throw th;
        }
        Closeables.A01(fileInputStream);
        Closeables.A01(bufferedInputStream);
    }
}
