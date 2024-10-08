package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.AVe  reason: case insensitive filesystem */
public final class C40190AVe implements C13589TdH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass833 A01;
    public final /* synthetic */ 2Nn A02;

    public C40190AVe(Context context, AnonymousClass833 r2, 2Nn r3) {
        this.A01 = r2;
        this.A00 = context;
        this.A02 = r3;
    }

    public final File createTempFile(String str, String str2) {
        0qQ.A0B(str, 0);
        if (182.A06(0Tu.A05, this.A01.A00, 36312041522332545L)) {
            return File.createTempFile(str, str2, this.A00.getCacheDir());
        }
        File createTempFile = File.createTempFile(str, str2, this.A02.C4W());
        0qQ.A07(createTempFile);
        return createTempFile;
    }
}
