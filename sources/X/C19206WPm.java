package X;

import com.facebook.pando.TreeJNI;
import java.util.Map;

/* renamed from: X.WPm  reason: case insensitive filesystem */
public final class C19206WPm implements C299065uW {
    public final /* synthetic */ AnonymousClass6RY A00;
    public final /* synthetic */ String A01;

    public C19206WPm(AnonymousClass6RY r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void D4y(Map map, int i) {
        Object obj = map.get(this.A01);
        if (obj instanceof TreeJNI) {
            ((TreeJNI) obj).maybeUpdateActiveFields();
        }
    }
}
