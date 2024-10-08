package X;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: X.JFf  reason: case insensitive filesystem */
public final class C59327JFf extends 0Yg implements 0sL {
    public static final C59327JFf A00 = new C59327JFf();

    public C59327JFf() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        ComponentTree componentTree = (ComponentTree) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(context, componentTree);
        LithoView lithoView = new LithoView(new 2V1(context), (AttributeSet) null);
        lithoView.A0k(componentTree, A1Z);
        return lithoView;
    }
}
