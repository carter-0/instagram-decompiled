package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.QIz  reason: case insensitive filesystem */
public final class C7556QIz extends 1uY {
    public static 1uY A00;

    public final /* bridge */ /* synthetic */ 1vB A03(Object obj) {
        File file = (File) obj;
        try {
            return new C7555QIy(this, file);
        } catch (IOException e) {
            throw new RuntimeException(AnonymousClass7TG.A0m(file, "Unexpected error, failed to create file: ", AnonymousClass7TE.A1A()), e);
        }
    }
}
