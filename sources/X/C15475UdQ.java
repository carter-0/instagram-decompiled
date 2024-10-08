package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UdQ  reason: case insensitive filesystem */
public final class C15475UdQ extends 2Ru {
    public int A00;
    public boolean A01;
    public final TwD A02 = new TwD();
    public final C17962Viv A03 = new Object();
    public final Context A04;
    public final C49128Epr A05 = new Object();
    public final C47591E9d A06;
    public final C14200Trf A07;
    public final X4Z A08;
    public final C20910X4b A09;
    public final VWN A0A;
    public final C46437Dez A0B;
    public final EAC A0C;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Viv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Epr] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15475UdQ(Context context, C14200Trf trf, X4Z x4z, C20910X4b x4b, VWN vwn, G6V g6v) {
        super(false);
        AnonymousClass7TG.A1O(context, trf);
        AnonymousClass7TG.A1S(x4z, x4b);
        this.A04 = context;
        this.A07 = trf;
        this.A0A = vwn;
        this.A08 = x4z;
        this.A09 = x4b;
        C46437Dez dez = new C46437Dez(context);
        this.A0B = dez;
        C47591E9d e9d = new C47591E9d(context);
        this.A06 = e9d;
        EAC eac = new EAC(context, g6v);
        this.A0C = eac;
        ArrayList arrayList = new ArrayList(0sr.A1P(new C231642s0[]{vwn.A00, vwn.A02, vwn.A01}));
        arrayList.add(dez);
        arrayList.add(e9d);
        arrayList.add(eac);
        init(arrayList);
    }

    public final void A00() {
        A01();
        notifyDataSetChanged();
    }

    public final void A01() {
        C231642s0 r1;
        clear();
        C14198Trd trd = this.A07.A01;
        List list = trd.A00;
        if (list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                Object obj2 = trd.A01.get(i);
                VWN vwn = this.A0A;
                0qQ.A0B(obj, 0);
                if (C61069Jw7.A00(3, obj)) {
                    r1 = vwn.A02;
                } else if (obj instanceof C66632Ma1) {
                    r1 = vwn.A00;
                } else if (C61069Jw7.A00(2, obj)) {
                    r1 = vwn.A01;
                } else {
                    throw AnonymousClass7TF.A0W("No BinderGroup associate with ", Pxf.A0g(obj));
                }
                0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.common.adapter.bindergroup.BinderGroup<out kotlin.Any, kotlin.Any>");
                addModel(obj, obj2, r1);
            }
        } else if (this.A00 == 0 && !this.A01 && !this.A08.CYJ()) {
            addModel(DbW.A0h(this.A04, this.A09.E4p(), 2131968421), this.A0B);
            return;
        }
        int i2 = this.A00;
        for (int i3 = 0; i3 < i2; i3++) {
            addModel(this.A05, this.A06);
        }
        if (this.A01) {
            addModel(this.A02, this.A03, this.A0C);
        }
    }
}
