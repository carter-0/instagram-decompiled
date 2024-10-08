package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.H4o  reason: case insensitive filesystem */
public final class C54245H4o extends 1P0 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C54245H4o(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
    }

    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(1661466631);
                C46521DgO.A04((C46521DgO) this.A02, (C283155Gi) this.A03, AnonymousClass000.A00(1758), this.A01);
                i2 = 287859178;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1925472430);
                FragmentActivity fragmentActivity = ((C56561I1p) this.A02).A00;
                I6V.A01(fragmentActivity, fragmentActivity.getString(2131972557), true);
                i2 = -18855140;
                break;
            case 3:
                i = AnonymousClass0fD.A03(2048785735);
                int i3 = this.A01;
                C49915FEp.A00((C358278ae) this.A03, (C49915FEp) this.A02, i3);
                i2 = -1046167776;
                break;
            default:
                C54245H4o.super.onFail(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        if (3 - this.A00 != 0) {
            C54245H4o.super.onFinish();
            return;
        }
        int A032 = AnonymousClass0fD.A03(1773088300);
        C54245H4o.super.onFinish();
        C49915FEp fEp = (C49915FEp) this.A02;
        FragmentActivity fragmentActivity = fEp.A01;
        2dY r3 = 2dZ.A0t;
        r3.A03(fragmentActivity).Ett((View.OnClickListener) null, false);
        r3.A03(fragmentActivity).setIsLoading(false);
        fEp.A00 = false;
        AnonymousClass0fD.A0A(-1196260523, A032);
    }

    public final void onStart() {
        if (3 - this.A00 != 0) {
            C54245H4o.super.onStart();
            return;
        }
        int A032 = AnonymousClass0fD.A03(-960743603);
        C54245H4o.super.onStart();
        C49915FEp fEp = (C49915FEp) this.A02;
        fEp.A00 = true;
        FragmentActivity fragmentActivity = fEp.A01;
        2dY r2 = 2dZ.A0t;
        r2.A03(fragmentActivity).Ett((View.OnClickListener) null, true);
        r2.A03(fragmentActivity).setIsLoading(true);
        AnonymousClass0fD.A0A(-1065723934, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(-1737219725);
                int A033 = AnonymousClass0fD.A03(-1862282638);
                AnonymousClass0eM r9 = ((H1P) this.A03).A0M;
                for (SavedCollection A07 : C55124HcX.A00(AnonymousClass7TE.A0l(r9)).A02(AnonymousClass7TE.A1I(C54665HMw.PRODUCT_AUTO_COLLECTION), (List) null)) {
                    I7Q.A07(AnonymousClass7TE.A0l(r9), (1Xj) this.A02, A07, AnonymousClass05K.A01, this.A01);
                }
                AnonymousClass0fD.A0A(-89369474, A033);
                i = 1370391021;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(2130392656);
                int A034 = AnonymousClass0fD.A03(-267387270);
                C283155Gi r2 = (C283155Gi) this.A03;
                C46521DgO.A04((C46521DgO) this.A02, r2, "remove_tag_success", this.A01);
                r2.A0E = true;
                AnonymousClass0fD.A0A(1564975399, A034);
                i = 1701428156;
                break;
            case 2:
                A032 = AnonymousClass0fD.A03(1401042841);
                int A035 = AnonymousClass0fD.A03(1291450024);
                C54665HMw hMw = C54665HMw.PRODUCT_AUTO_COLLECTION;
                String str = hMw.A01;
                C56561I1p i1p = (C56561I1p) this.A02;
                FragmentActivity fragmentActivity = i1p.A00;
                SavedCollection savedCollection = new SavedCollection(hMw, str, fragmentActivity.getString(2131972557));
                UserSession userSession = i1p.A02;
                1Xj r3 = (1Xj) this.A03;
                I7Q.A07(userSession, r3, savedCollection, AnonymousClass05K.A00, this.A01);
                C55124HcX.A00(userSession).A04(savedCollection);
                C57276IVl iVl = new C57276IVl(this, 8);
                I6V.A00(fragmentActivity, r3.A1n(fragmentActivity), iVl, savedCollection.A07, fragmentActivity.getString(2131972558), fragmentActivity.getString(2131952148), true, true, false);
                AnonymousClass0fD.A0A(-716804011, A035);
                i = 97676241;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-1005569457);
                C47313Dug dug = (C47313Dug) obj2;
                int A036 = AnonymousClass0fD.A03(1641846749);
                int i2 = this.A01;
                C49915FEp fEp = (C49915FEp) this.A02;
                UserSession userSession2 = fEp.A07;
                FanClubInfoDict B3v = DbV.A0k(userSession2).B3v();
                0Tu r0 = 0Tu.A05;
                boolean A06 = 182.A06(r0, userSession2, 36330896428647242L);
                if (!182.A06(r0, userSession2, 36328980873232076L) || B3v == null || B3v.getFanClubId() == null) {
                    EtC etC = dug.A00;
                    if (etC == null) {
                        C41845B3m.A0v();
                        throw AnonymousClass00P.createAndThrow();
                    } else if (etC.A00) {
                        i2 = 2131974851;
                        if (A06) {
                            i2 = 2131974849;
                        }
                    }
                } else {
                    i2 = 2131974852;
                    if (A06) {
                        i2 = 2131974850;
                    }
                }
                C49915FEp.A00((C358278ae) this.A03, fEp, i2);
                AnonymousClass0fD.A0A(-1394009601, A036);
                i = -1185736415;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
