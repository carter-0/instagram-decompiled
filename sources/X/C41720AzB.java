package X;

import java.io.File;

/* renamed from: X.AzB  reason: case insensitive filesystem */
public final class C41720AzB extends 0Yg implements 0sP {
    public static final C41720AzB A00 = new C41720AzB();

    public C41720AzB() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        File file = (File) obj;
        0qQ.A0B(file, 0);
        return Long.valueOf(file.length());
    }
}
