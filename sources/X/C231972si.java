package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.2si  reason: invalid class name and case insensitive filesystem */
public final class C231972si implements C231932se {
    public static final void A00(2bv r5, AnonymousClass4UC r6, C254083ru r7, Map map) {
        C229382nI r4;
        0qQ.A0B(r7, 0);
        if ((r5 instanceof C231002qi) && (r4 = (C229382nI) ((C231002qi) r5).A02.getValue()) != null) {
            Context context = r7.A01.getContext();
            0qQ.A07(context);
            r4.A01.put(R.id.bloks_action_listener, new C49599EzI(context, r4, r5, r6, r7, map));
        }
    }

    /* renamed from: A01 */
    public final void ADo(2bv r2, AnonymousClass4UC r3, C254083ru r4) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 2);
        A00(r2, r3, r4, (Map) null);
    }

    public final View CrT(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_megaphone, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        inflate.setTag(new C254083ru(inflate));
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void ADr(C249703kE r1, 2bv r2, AnonymousClass4UC r3, Map map) {
        A00(r2, r3, (C254083ru) r1, map);
    }
}
