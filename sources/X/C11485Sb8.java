package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.Sb8  reason: case insensitive filesystem */
public final class C11485Sb8 implements View.OnClickListener {
    public Context A00;
    public Method A01;
    public final View A02;
    public final String A03;

    public C11485Sb8(View view, String str) {
        this.A02 = view;
        this.A03 = str;
    }

    public final void onClick(View view) {
        IllegalStateException illegalStateException;
        int i;
        String A0g;
        int A05 = AnonymousClass0fD.A05(-1856024572);
        Method method = this.A01;
        if (method == null) {
            View view2 = this.A02;
            Context context = view2.getContext();
            for (Context context2 = context; context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
                try {
                    if (!context2.isRestricted() && (method = context2.getClass().getMethod(this.A03, new Class[]{View.class})) != null) {
                        this.A01 = method;
                        this.A00 = context2;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
            }
            int id = view2.getId();
            if (id == -1) {
                A0g = "";
            } else {
                A0g = 002.A0g(" with id '", context.getResources().getResourceEntryName(id), "'");
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Could not find method ");
            A1A.append(this.A03);
            Pxg.A1R(A1A, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ", view2);
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(A0g, A1A));
        }
        try {
            method.invoke(this.A00, new Object[]{view});
            AnonymousClass0fD.A0C(-677595971, A05);
        } catch (IllegalAccessException e) {
            illegalStateException = Pxe.A0j("Could not execute non-public method for android:onClick", e);
            i = 318258167;
            AnonymousClass0fD.A0C(i, A05);
            throw illegalStateException;
        } catch (InvocationTargetException e2) {
            illegalStateException = Pxe.A0j("Could not execute method for android:onClick", e2);
            i = -1849108503;
            AnonymousClass0fD.A0C(i, A05);
            throw illegalStateException;
        }
    }
}
