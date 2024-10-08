package X;

import java.io.File;

/* renamed from: X.AzA  reason: case insensitive filesystem */
public final class C41719AzA extends 0Yg implements 0sP {
    public static final C41719AzA A00 = new C41719AzA();

    public C41719AzA() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        File file = (File) obj;
        0qQ.A0B(file, 0);
        return Boolean.valueOf(file.isFile());
    }
}
