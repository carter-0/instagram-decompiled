package X;

import android.media.Image;
import java.util.function.Consumer;

/* renamed from: X.Asy  reason: case insensitive filesystem */
public final class C41377Asy implements Consumer {
    public final /* synthetic */ Image A00;
    public final /* synthetic */ AnonymousClass80G A01;

    public C41377Asy(Image image, AnonymousClass80G r2) {
        this.A00 = image;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        this.A00.close();
        AnonymousClass80G.A01(this.A01);
    }
}
