package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.2sb  reason: invalid class name and case insensitive filesystem */
public final class C231902sb extends C231632rz {
    public C270374gd A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C230792qH A04;

    public final String getBinderGroupName() {
        return "FeedMegaphone";
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.C232672uC r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            r2 = this;
            X.4gd r4 = (X.C270374gd) r4
            r2.A00 = r4
            X.Uli r0 = r4.A02
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "v3"
            boolean r1 = r0.equalsIgnoreCase(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.A7U(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231902sb.buildRowViewTypes(X.2uC, java.lang.Object, java.lang.Object):void");
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((C270374gd) obj).A00.A00.hashCode();
    }

    public C231902sb(Context context, AnonymousClass0iw r2, UserSession userSession, C230792qH r4) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r2;
        this.A04 = r4;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(1416017342);
        C18685Vwj.A02(this.A01, view, this.A02, this.A04, (C270374gd) obj);
        AnonymousClass0fD.A0A(-1574240663, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(2029693650);
        LinearLayout A012 = C18685Vwj.A01(this.A01, this.A00);
        AnonymousClass0fD.A0A(897800622, A032);
        return A012;
    }
}
