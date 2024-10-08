package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;
import java.util.AbstractMap;
import java.util.Collection;

/* renamed from: X.Oey  reason: case insensitive filesystem */
public final class C71182Oey implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C71182Oey(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C71111Ocu ocu;
        boolean z;
        switch (this.A00) {
            case 1:
                HighlightsMigrationFragment highlightsMigrationFragment = (HighlightsMigrationFragment) this.A01;
                HighlightsMigrationFragment.A02(highlightsMigrationFragment, "h2g_management_modal_removal_all_confirm_tap", (String) null);
                C15476UdR A04 = highlightsMigrationFragment.A04();
                A04.A01.replaceAll(new C73447Pcp(new C59109J6r(false, 1)));
                A04.A01(false);
                highlightsMigrationFragment.A03().setPrimaryActionIsLoading(true);
                UserSession A0l = AnonymousClass7TE.A0l(highlightsMigrationFragment.A0C);
                C72746PId pId = new C72746PId(highlightsMigrationFragment, 1);
                0qQ.A0B(A0l, 0);
                1vm.A01(A0l).A01((2Kw) null, new C45926DFg(pId, 25), new PandoGraphQLRequest(C41845B3m.A05(), "IGProfileUnshareAllHighlightsFromMainGridQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43574C1a.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_unshare_all_highlights_from_main_grid", AnonymousClass7TE.A1C()));
                return;
            case 2:
                Collection values = ((AbstractMap) this.A01).values();
                0qQ.A07(values);
                int i2 = i;
                C62320sa r0 = (C62320sa) 00k.A0O(00k.A0a(values), i2);
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                throw AnonymousClass7TE.A0w(002.A0c("The dialog option index ", " is not supported", i2));
            case 3:
                ocu = ((C70506O9f) this.A01).A00.A0H;
                z = true;
                break;
            case 4:
                ocu = ((C70506O9f) this.A01).A00.A0H;
                z = false;
                break;
            case 6:
                ((PM3) this.A01).A01.A0M();
                return;
            case 7:
                DbX.A1I((Fragment) this.A01);
                return;
            case 8:
                ((C74429Puj) this.A01).D0f();
                return;
            case 9:
                dialogInterface.dismiss();
                return;
            default:
                DbS.A1U(this.A01);
                return;
        }
        ocu.A03(new C72906POq(z));
    }
}
