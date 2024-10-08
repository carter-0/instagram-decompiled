package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public final class ECQ extends 1P0 {
    public final WeakReference A00;

    public ECQ(C49707F2s f2s) {
        this.A00 = new WeakReference(f2s);
    }

    public final void onFail(C268654dm r8) {
        String A16;
        int A0D = AnonymousClass7TG.A0D(r8, -530379758);
        ECQ.super.onFail(r8);
        C49707F2s f2s = (C49707F2s) this.A00.get();
        if (f2s != null) {
            C49607EzQ ezQ = f2s.A04;
            ezQ.A03 = true;
            ezQ.A00 = null;
            C47438E2k e2k = f2s.A08;
            e2k.A00(f2s.A06.A00(ezQ, DbU.A0K(f2s.A07.A00)));
            Context context = f2s.A02;
            AnonymousClass1XT A0L = DbT.A0L(r8);
            if (A0L == null || (A16 = A0L.getErrorMessage()) == null || A16.length() <= 0) {
                A16 = AnonymousClass7TE.A16(context, 2131968258);
            }
            if (e2k.isAdded()) {
                C59689JTv.A03(e2k.getActivity(), A16, "GlobalBlocksContract onFetchFailed", 1);
            }
        }
        AnonymousClass0fD.A0A(828163269, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1241410313);
        ECQ.super.onFinish();
        C49707F2s f2s = (C49707F2s) this.A00.get();
        if (f2s != null) {
            C49607EzQ ezQ = f2s.A04;
            ezQ.A02 = false;
            ezQ.A00 = null;
        }
        AnonymousClass0fD.A0A(-1315353771, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1538295923);
        Dw0 dw0 = (Dw0) obj;
        int A032 = AnonymousClass0fD.A03(-1150406050);
        0qQ.A0B(dw0, 0);
        ECQ.super.onSuccess(dw0);
        C49707F2s f2s = (C49707F2s) this.A00.get();
        if (f2s != null) {
            C49607EzQ ezQ = f2s.A04;
            boolean z = false;
            ezQ.A03 = false;
            ezQ.A00 = null;
            String str = dw0.A01;
            if (str != null) {
                z = true;
            }
            ezQ.A01 = z;
            ezQ.A00 = null;
            f2s.A00 = str;
            FAH fah = f2s.A07;
            Iterator A0o = DbY.A0o(dw0.A02);
            while (A0o.hasNext()) {
                C47326Dut dut = (C47326Dut) A0o.next();
                fah.A00.add(dut);
                fah.A01.put(dut.A04, dut);
            }
            FAH.A00(fah);
        }
        AnonymousClass0fD.A0A(-786776784, A032);
        AnonymousClass0fD.A0A(426376440, A03);
    }
}
