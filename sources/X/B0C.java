package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

public final class B0C extends 0Yg implements 0sI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0C(int i, Object obj, Object obj2, Object obj3) {
        super(5);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.Aeq] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.A00;
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        String str4 = (String) obj4;
        String str5 = (String) obj5;
        boolean A1Z = AnonymousClass7TG.A1Z(str, str2);
        AnonymousClass7TG.A0w(2, str3, str4, str5);
        AnonymousClass6QE r0 = AnonymousClass6QE.A02;
        Uri A032 = 0cp.A03(str4);
        0qQ.A07(A032);
        String obj6 = AnonymousClass6QJ.A01(A032, A1Z).toString();
        if (i != 0) {
            0qQ.A07(obj6);
            C40602Aeq aeq = (C40602Aeq) this.A02;
            aeq.A02 = str;
            aeq.A03 = str2;
            aeq.A04 = str3;
            aeq.A00 = obj6;
            aeq.A01 = str5;
            AnonymousClass8ME r3 = (AnonymousClass8ME) this.A03;
            InteractiveDrawableContainer interactiveDrawableContainer = r3.A1m;
            Drawable drawable = (Drawable) this.A01;
            r3.A0B = interactiveDrawableContainer.A0O(drawable);
            interactiveDrawableContainer.A0S(drawable);
            r3.Dn8(aeq, (String) null);
            return null;
        }
        0qQ.A07(obj6);
        ? obj7 = new Object();
        obj7.A03 = str2;
        obj7.A02 = str;
        obj7.A00 = obj6;
        obj7.A04 = str3;
        obj7.A01 = str5;
        AnonymousClass8ME r4 = (AnonymousClass8ME) this.A03;
        r4.A0y(new KWD(r4.A0f, obj7, r4.A0o.getModuleName()), (C317876nz) this.A02, new C310416b1((C39890ADo) this.A01), (String) null);
        return null;
    }
}
