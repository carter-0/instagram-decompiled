package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Ufz  reason: case insensitive filesystem */
public final class C15633Ufz extends C308096Sr {
    public final /* bridge */ /* synthetic */ Object A00(Context context, View view, Object obj, Object obj2) {
        C15168UTt uTt = (C15168UTt) obj;
        0qQ.A0B(uTt, 2);
        C17752VeR veR = C15168UTt.A06;
        0qQ.A0C(obj2, "null cannot be cast to non-null type com.facebook.rendercore.simplelist.ListLayoutData<com.instagram.common.bloks.component.base.BloksModel>");
        veR.A00((C14539Txz) obj2, uTt);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        C15168UTt uTt = (C15168UTt) obj;
        C15168UTt uTt2 = (C15168UTt) obj2;
        AnonymousClass7TG.A1N(uTt, uTt2);
        if (C276674ti.A00() == null) {
            return !uTt.A02.A0L().equals(uTt2.A02.A0L());
        }
        if (obj3 == null || obj4 == null) {
            return false;
        }
        C14539Txz txz = (C14539Txz) obj3;
        C14539Txz txz2 = (C14539Txz) obj4;
        if (txz.A01 == txz2.A01 && txz.A00 == txz2.A00 && 0qQ.A0K(txz.A02, txz2.A02)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
