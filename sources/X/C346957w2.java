package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.7w2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C346957w2 implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8BA A00;

    public /* synthetic */ C346957w2(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        AnonymousClass8BA r4 = this.A00;
        C391919tt r9 = (C391919tt) obj;
        if (r4.A1M.CZU()) {
            return;
        }
        if (r9 instanceof C388289na) {
            C352098Br r1 = r4.A1P;
            11Z.A02(new C346947w1(r1));
            C59689JTv.A01(r1.A00, AnonymousClass000.A00(3907), 2131974093, 0);
        } else if (r9 instanceof C388279nZ) {
            C352098Br r7 = r4.A1P;
            C369988ve r12 = ((C388279nZ) r9).A00;
            0qQ.A0B(r12, 0);
            1Av A002 = 1Au.A00(r7.A01);
            if (!A002.A1r() && r12.A09) {
                A002.A5B.Epx(A002, true, 1Av.A8a[311]);
                long currentTimeMillis = System.currentTimeMillis();
                0xY AR4 = A002.A01.AR4();
                AR4.E5c("story_drafts_expiration_nux_seen_timestamp_ms", currentTimeMillis);
                AR4.apply();
                Activity activity = r7.A00;
                C358248ab r2 = new C358248ab((Context) activity);
                r2.A05 = activity.getResources().getString(2131974409);
                r2.A0q(activity.getResources().getString(2131974408));
                r2.A0E(C39947AKn.A00);
                r2.A0i(activity.getDrawable(R.drawable.ig_illustrations_illo_ads_megaphone_refresh));
                r2.A0s(true);
                AnonymousClass0fN.A00(r2.A02());
            }
            C357068Wi r13 = (C357068Wi) r4.A1v.get();
            if (r13 != null) {
                AnonymousClass8WX r42 = r13.A0G;
                if (r42.A01) {
                    if (!182.A06(0Tu.A05, r13.A06, 36321971486730101L)) {
                        r42.A00().A0M(false);
                    }
                }
            }
        }
    }
}
