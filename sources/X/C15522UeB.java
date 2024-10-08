package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.UeB  reason: case insensitive filesystem */
public final class C15522UeB extends C231632rz {
    public final VWH A00;
    public final Context A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        C20959X6m x6m = (C20959X6m) obj;
        r5.A7U(0);
        VWH vwh = this.A00;
        vwh.A01.A01(DbU.A0a(vwh.A02, AnonymousClass30Y.A00(x6m, (Object) null, x6m.BK1())), x6m.BK1());
    }

    public C15522UeB(Context context, VWH vwh) {
        this.A01 = context;
        this.A00 = vwh;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1278575642);
        VWH vwh = this.A00;
        vwh.A00.A05(view, vwh.A01.A00(((C20959X6m) obj).BK1()));
        AnonymousClass0fD.A0A(1089584078, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1090611179);
        IgView igView = new IgView(this.A01);
        C66581MXm.A1B(igView, -1, 1);
        AnonymousClass0fD.A0A(-817234828, A03);
        return igView;
    }
}
