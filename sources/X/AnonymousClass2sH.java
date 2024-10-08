package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.2sH  reason: invalid class name */
public final class AnonymousClass2sH extends C231632rz {
    public C2363633l A00;
    public C229802oH A01;
    public final AnonymousClass2p6 A02;
    public final Context A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;

    public final String getBinderGroupName() {
        return "SimpleAction";
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        C270054g7 r3 = (C270054g7) obj;
        C57250IUl iUl = (C57250IUl) obj2;
        if (iUl.CdP()) {
            r2.A7U(1);
            return;
        }
        r2.A7U(0);
        C229802oH r0 = this.A01;
        r0.getClass();
        r0.A9R(r3, iUl);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((C270054g7) obj).getId().hashCode();
    }

    public AnonymousClass2sH(Context context, AnonymousClass0iw r2, UserSession userSession, AnonymousClass2p6 r4) {
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = r2;
        this.A02 = r4;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-1328533330);
        C270054g7 r7 = (C270054g7) obj;
        C57250IUl iUl = (C57250IUl) obj2;
        if (i == 0) {
            Object tag = view.getTag();
            tag.getClass();
            C18200VnN.A01(this.A04, this.A02, (C14897UDz) tag, iUl, r7);
            C229802oH r0 = this.A01;
            r0.getClass();
            r0.EBq(view, r7);
        } else if (i == 1) {
            C2363633l r1 = this.A00;
            r1.getClass();
            r1.A01(view, this.A05, r7, iUl);
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0fD.A0A(1811840482, A032);
            throw unsupportedOperationException;
        }
        AnonymousClass0fD.A0A(-1339605983, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A002;
        int i2;
        int A032 = AnonymousClass0fD.A03(1237737987);
        if (i == 0) {
            A002 = C18200VnN.A00(this.A03, viewGroup);
            i2 = -2091136143;
        } else if (i == 1) {
            A002 = C2363733m.A00(this.A03, viewGroup, "v1", 1);
            i2 = 608029114;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0fD.A0A(94120912, A032);
            throw unsupportedOperationException;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return A002;
    }
}
