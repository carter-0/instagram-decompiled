package X;

import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel;
import java.util.Collection;
import java.util.List;

public final class PRL implements C229122ms {
    public final int A00;
    public final Object A01;

    public PRL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean CJz() {
        boolean z;
        List list;
        switch (this.A00) {
            case 0:
                z = ((C59811JZf) this.A01).A0G.A05.isEmpty();
                break;
            case 1:
                if (((MYR) this.A01).getAdapter().getItemCount() > 1) {
                    return true;
                }
                return false;
            case 2:
                list = ((OBP) ((BroadcastChannelActivityFeedV2ViewModel) this.A01).A08.getValue()).A01;
                break;
            case 3:
                list = ((OBR) ((C68494NKn) this.A01).A0D().A09().getValue()).A01;
                break;
            case 4:
                list = ((C68488NKh) this.A01).A0E;
                break;
            case 5:
                if (((NJ6) this.A01).A02 == null) {
                    return false;
                }
                return true;
            case 6:
                z = ((Collection) ((C67743Mtw) this.A01).A03.A0A.getValue()).isEmpty();
                break;
            case 7:
                list = ((C47571E8j) this.A01).A06;
                break;
            case 8:
                z = ((C68483NKa) this.A01).A0G;
                break;
            default:
                C14074TpO tpO = ((C15286UZq) this.A01).A06;
                if (tpO != null) {
                    return tpO.A0A();
                }
                0qQ.A0F("grid");
                throw AnonymousClass00P.createAndThrow();
        }
        z = list.isEmpty();
        return !z;
    }

    public final boolean CKB() {
        switch (this.A00) {
            case 0:
                return ((C59811JZf) this.A01).A0G.A01;
            case 1:
                return ((C68495NKo) this.A01).A0E().A0E();
            case 2:
                return ((BroadcastChannelActivityFeedV2ViewModel) this.A01).A03();
            case 3:
                return ((C68494NKn) this.A01).A0D().A0C();
            case 4:
                C74544Pwd pwd = ((C68488NKh) this.A01).A04;
                if (pwd == null || pwd.Bz7() != AnonymousClass05K.A0Y) {
                    return false;
                }
                return true;
            case 5:
                OLT olt = ((NJ6) this.A01).A02;
                if (olt == null || olt.A02.equals("MINCURSOR")) {
                    return false;
                }
                return true;
            case 6:
                if (((C67743Mtw) this.A01).A03.A09.getValue() != null) {
                    return true;
                }
                return false;
            case 7:
                return false;
            case 8:
                return ((C68483NKa) this.A01).A0E;
            default:
                return 0qQ.A0K(((C15286UZq) this.A01).A07().A04.A02(), Ng0.A00);
        }
    }

    public final boolean CT5() {
        Boolean bool;
        switch (this.A00) {
            case 1:
                N3R A002 = C67759MuF.A00(((C68495NKo) this.A01).A0E());
                if (!(A002 == null || (bool = A002.A07) == null)) {
                    return bool.booleanValue();
                }
            case 4:
                C74544Pwd pwd = ((C68488NKh) this.A01).A04;
                if (pwd == null || pwd.Bz7() != AnonymousClass05K.A0C) {
                    return false;
                }
                return true;
            case 5:
                return ((NJ6) this.A01).A08;
            case 9:
                return 0qQ.A0K(((C15286UZq) this.A01).A07().A04.A02(), C69175Nfy.A00);
        }
        return false;
    }

    public final boolean CWV() {
        boolean z;
        switch (this.A00) {
            case 4:
                C74544Pwd pwd = ((C68488NKh) this.A01).A04;
                if (pwd == null || pwd.Bz7() != AnonymousClass05K.A01) {
                    return false;
                }
                return true;
            case 7:
                return ((C47571E8j) this.A01).A01;
            case 8:
                C68483NKa nKa = (C68483NKa) this.A01;
                if (nKa.A0E) {
                    z = nKa.A0D;
                    break;
                } else {
                    return false;
                }
            case 9:
                if (!isLoading()) {
                    z = CJz();
                    break;
                } else {
                    return false;
                }
            default:
                return true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final void CgO() {
        switch (this.A00) {
            case 0:
                ((C59811JZf) this.A01).ACw();
                return;
            case 1:
                ((C68495NKo) this.A01).A0E().A07();
                return;
            case 2:
                ((BroadcastChannelActivityFeedV2ViewModel) this.A01).A02();
                return;
            case 3:
                ((C68494NKn) this.A01).A0D().A0A();
                return;
            case 5:
                NJ6.A01((NJ6) this.A01);
                return;
            case 6:
                ((C67743Mtw) this.A01).A01(false, false);
                return;
            case 9:
                ((C15286UZq) this.A01).A07().A05();
                return;
            default:
                return;
        }
    }

    public final boolean isLoading() {
        Object obj;
        Object obj2;
        C68269N8g n8g;
        switch (this.A00) {
            case 0:
                return ((C59811JZf) this.A01).A0G.A02;
            case 1:
                N3R A002 = C67759MuF.A00(((C68495NKo) this.A01).A0E());
                if (A002 != null) {
                    obj = A002.A03;
                } else {
                    obj = null;
                }
                obj2 = C69285Nil.LOADING_NEXT_PAGE;
                break;
            case 2:
                obj = ((OBP) ((BroadcastChannelActivityFeedV2ViewModel) this.A01).A08.getValue()).A00;
                obj2 = C62509Kgz.PAGINATION_LOAD;
                break;
            case 3:
                obj = ((OBR) ((C68494NKn) this.A01).A0D().A09().getValue()).A00;
                obj2 = C62510Kh0.PAGINATION_LOAD;
                break;
            case 4:
                C74544Pwd pwd = ((C68488NKh) this.A01).A04;
                if (pwd != null) {
                    obj = pwd.Bz7();
                    obj2 = AnonymousClass05K.A01;
                    break;
                } else {
                    return false;
                }
            case 5:
                return ((NJ6) this.A01).A06;
            case 6:
                Object value = ((C67743Mtw) this.A01).A09.getValue();
                if (!(value instanceof C68269N8g) || (n8g = (C68269N8g) value) == null) {
                    return false;
                }
                return n8g.A06;
            case 7:
                return ((C47571E8j) this.A01).A01;
            case 8:
                return ((C68483NKa) this.A01).A0D;
            default:
                return 0qQ.A0K(((C15286UZq) this.A01).A07().A04.A02(), C69176Nfz.A00);
        }
        if (obj != obj2) {
            return false;
        }
        return true;
    }
}
