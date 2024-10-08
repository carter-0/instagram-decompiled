package X;

import android.content.Context;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.IdentityFilter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vd4  reason: case insensitive filesystem */
public final class C17735Vd4 {
    public int A00;
    public int A01;
    public C367508qr A02;
    public C367508qr A03;
    public C17842Vgv A04;
    public C39801A9w A05;
    public boolean A06;
    public final Context A07;
    public final Matrix4 A08 = new Matrix4();
    public final UserSession A09;
    public final IdentityFilter A0A;
    public final X98 A0B;
    public final C282765Eq A0C = new Object();
    public final A91 A0D;
    public final C41799B1e A0E;
    public final List A0F;
    public final Map A0G = new HashMap();

    /* JADX WARNING: type inference failed for: r0v1, types: [X.5Eq, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.B1e] */
    public C17735Vd4(Context context, UserSession userSession, X98 x98, String str, List list) {
        this.A07 = context;
        this.A0F = list;
        this.A09 = userSession;
        this.A0B = x98;
        this.A0E = new Object();
        this.A0D = new A91(context, userSession, str);
        this.A0A = new IdentityFilter();
    }
}
