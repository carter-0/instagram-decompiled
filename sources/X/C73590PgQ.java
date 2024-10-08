package X;

import android.view.ActionMode;

/* renamed from: X.PgQ  reason: case insensitive filesystem */
public final /* synthetic */ class C73590PgQ extends 03J implements 0sP {
    public C73590PgQ(Object obj) {
        super(1, obj, C327797Cf.class, "onClick", "onClick(Landroid/view/ActionMode;)Z", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ActionMode actionMode = (ActionMode) obj;
        0qQ.A0B(actionMode, 0);
        C327797Cf r7 = (C327797Cf) this.receiver;
        C62320sa r10 = r7.A06;
        long length = (long) ((CharSequence) r10.invoke()).length();
        AnonymousClass7I3 r0 = r7.A04;
        boolean z = r7.A09;
        boolean z2 = r7.A08;
        String str = r7.A05;
        1Ln A0J = 1Ln.A0J(r0.A01);
        XSV A00 = AnonymousClass7I3.A00(z2, z);
        if (DbT.A1Y(A0J)) {
            A0J.A0Z(24);
            C66580MXl.A1L(A0J, C273654mx.A00(3492));
            A0J.A0X(0);
            A0J.A0Q(Pxd.A00(42), Long.valueOf(length));
            C66584MXp.A0o(A00, A0J, str, z2);
            A0J.Cgf();
        }
        r7.A00((String) r10.invoke(), r7.A07, false);
        actionMode.finish();
        return AnonymousClass7TE.A0v();
    }
}
