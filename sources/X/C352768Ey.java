package X;

import android.content.SharedPreferences;
import com.facebook.stash.core.FileStash;

/* renamed from: X.8Ey  reason: invalid class name and case insensitive filesystem */
public final class C352768Ey extends 1LQ {
    public long A00;
    public final AnonymousClass1LB A01;
    public final String A02;

    public final synchronized void A00() {
        SharedPreferences sharedPreferences;
        long sizeBytes = this.A00.getSizeBytes();
        this.A00 = sizeBytes;
        AnonymousClass1LB r6 = this.A01;
        String str = this.A02;
        synchronized (r6) {
            sharedPreferences = r6.A00;
            if (sharedPreferences == null) {
                sharedPreferences = C60960kU.A00.getSharedPreferences("stash", 0);
                r6.A00 = sharedPreferences;
            }
        }
        sharedPreferences.edit().putLong(002.A0R(str, "/total_size"), sizeBytes).apply();
    }

    public final synchronized long getSizeBytes() {
        long j;
        SharedPreferences sharedPreferences;
        j = this.A00;
        if (j <= 0) {
            AnonymousClass1LB r5 = this.A01;
            String str = this.A02;
            synchronized (r5) {
                sharedPreferences = r5.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = C60960kU.A00.getSharedPreferences("stash", 0);
                    r5.A00 = sharedPreferences;
                }
            }
            j = sharedPreferences.getLong(002.A0R(str, "/total_size"), -1);
            this.A00 = j;
            if (j <= 0) {
                A00();
                j = this.A00;
            }
        }
        return j;
    }

    public C352768Ey(FileStash fileStash, AnonymousClass1LB r2, String str) {
        super(fileStash);
        this.A02 = str;
        this.A01 = r2;
    }
}
