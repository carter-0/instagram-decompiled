package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.IyR  reason: case insensitive filesystem */
public final class C58840IyR extends 0Yg implements 0sP {
    public static final C58840IyR A00 = new C58840IyR();

    public C58840IyR() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewParent parent = C51969G9p.A0O(obj).getParent();
        if (parent instanceof View) {
            return parent;
        }
        return null;
    }
}
