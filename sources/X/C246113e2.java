package X;

import android.content.Context;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import java.util.Collections;

/* renamed from: X.3e2  reason: invalid class name and case insensitive filesystem */
public final class C246113e2 {
    public C70682Ty A00;
    public RenderTreeNode A01;
    public boolean A02;
    public final C246123e3 A03 = new Object();
    public final Object A04;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3e3, java.lang.Object] */
    public C246113e2(RenderTreeNode renderTreeNode, Object obj) {
        0qQ.A0B(renderTreeNode, 1);
        0qQ.A0B(obj, 2);
        this.A04 = obj;
        this.A01 = renderTreeNode;
    }

    public final void A00(Context context) {
        2Ue A002;
        String str;
        Class cls;
        C251273mq A0I = this.A01.A06.A0I();
        Object obj = this.A04;
        0qQ.A0B(A0I, 1);
        if (AnonymousClass2SY.A03 && (obj instanceof C70682Ty)) {
            ((C70682Ty) obj).A0I();
        }
        if (A0I.Bdg().A01 && (A002 = AnonymousClass2Vc.A00(context, A0I, A0I.E2z())) != null) {
            if (AnonymousClass2Vc.A00 != null && (obj instanceof View)) {
                Object Bdd = A0I.Bdd();
                if (!(Bdd instanceof Class) || (cls = (Class) Bdd) == null || (str = cls.getSimpleName()) == null) {
                    str = Bdd.toString();
                }
                0qQ.A07(Collections.singletonList(str));
            }
            A002.ECR(obj);
        }
    }
}
