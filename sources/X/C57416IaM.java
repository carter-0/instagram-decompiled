package X;

import android.widget.Adapter;

/* renamed from: X.IaM  reason: case insensitive filesystem */
public final class C57416IaM implements C230682q1 {
    public final /* synthetic */ C52469GTv A00;

    public final void DjS() {
    }

    public C57416IaM(C52469GTv gTv) {
        this.A00 = gTv;
    }

    public final void DOM(String str) {
        String str2;
        C52469GTv gTv = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C55937Hq1 hq1 = gTv.A0J;
        C52477GUf gUf = hq1.A01;
        I4C i4c = gUf.A08;
        if (i4c == null) {
            0qQ.A0F("chainingLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        C238133Ar r0 = i4c.A01;
        if (r0 != null && r0.BLQ() >= 0) {
            int A002 = I4C.A00(i4c);
            Adapter adapter = i4c.A04;
            if (A002 >= adapter.getCount() || (str2 = C51971G9r.A0s(C231122qu.A04(adapter.getItem(A002)))) == null) {
                str2 = i4c.A0A;
                A002 = 0;
            }
            0Aj A0e = AnonymousClass7TE.A0e(i4c.A07, "chaining_feed_load_more_button_show");
            C51965G9l.A1R(A0e, i4c.A0B);
            C51971G9r.A17(A0e, I4C.A01(i4c, A002));
            C51965G9l.A1J(A0e, str2);
            A0e.AAJ("view_type", str);
            A0e.A9F("time_spent_ms", Long.valueOf(i4c.A05.now() - i4c.A00));
            A0e.Cgf();
        }
        AnonymousClass2mA r02 = gUf.A0D;
        if (r02 != null) {
            r02.A01();
        }
        if (gUf.A0O) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - hq1.A00 > 1000) {
                hq1.A00 = currentTimeMillis;
                C52477GUf.A01(gUf);
            }
        }
    }
}
