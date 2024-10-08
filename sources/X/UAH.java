package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import java.util.ArrayList;
import java.util.List;

public final class UAH extends 2Rw {
    public UserSession A00;
    public final List A01 = new ArrayList();
    public final C355638Qt A02 = new C355638Qt(0);
    public final AnonymousClass0iw A03;
    public final XBy A04;
    public final C229122ms A05;
    public final Integer A06;
    public final List A07 = new ArrayList();

    public final void onBindViewHolder(C249703kE r8, int i) {
        C249703kE r4 = r8;
        int i2 = i;
        VTJ vtj = (VTJ) this.A07.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            UDB udb = (UDB) r4;
            C17801VgE vgE = vtj.A00;
            if (vgE != null) {
                C17050VFy.A00(vgE, this.A04, udb, this.A06, i);
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else if (itemViewType == 1) {
            C14883UDl uDl = (C14883UDl) r4;
            C17801VgE vgE2 = vtj.A00;
            if (vgE2 != null) {
                C17049VFx.A00(vgE2, this.A04, uDl, this.A06, i);
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else if (itemViewType != 2) {
            ((C14903UEi) r4).A00.A03(this.A05, (C230682q1) null);
        } else {
            UDA uda = (UDA) r4;
            C17801VgE vgE3 = vtj.A00;
            if (vgE3 != null) {
                XBy xBy = this.A04;
                C17048VFw.A00(this.A03, this.A00, vgE3, xBy, uda, this.A06, i2);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static void A00(UAH uah) {
        List list = uah.A07;
        list.clear();
        for (C17801VgE A002 : uah.A01) {
            list.add(C17045VFt.A00(A002));
        }
        list.add(new VTJ((C17801VgE) null, AnonymousClass05K.A0j));
        uah.notifyDataSetChanged();
    }

    public UAH(AnonymousClass0iw r4, UserSession userSession, XBy xBy, C229122ms r7, Integer num) {
        this.A05 = r7;
        this.A04 = xBy;
        this.A00 = userSession;
        this.A06 = num;
        this.A03 = r4;
        A00(this);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(670645217);
        int size = this.A07.size();
        AnonymousClass0fD.A0A(-1070318273, A032);
        return size;
    }

    public final long getItemId(int i) {
        String str;
        int A032 = AnonymousClass0fD.A03(252738607);
        VTJ vtj = (VTJ) this.A07.get(i);
        int intValue = vtj.A01.intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3) {
            C17801VgE vgE = vtj.A00;
            if (vgE != null) {
                str = vgE.A00.A07;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else if (intValue == 5) {
            str = AnonymousClass000.A00(2318);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unhandled view model type");
            AnonymousClass0fD.A0A(-1854659249, A032);
            throw illegalArgumentException;
        }
        long A002 = this.A02.A00(str);
        AnonymousClass0fD.A0A(-745225818, A032);
        return A002;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(1630774086);
        int intValue = ((VTJ) this.A07.get(i)).A01.intValue();
        int i3 = 1;
        if (intValue == 1) {
            i3 = 0;
            i2 = -545347533;
        } else if (intValue != 2) {
            i3 = 3;
            if (intValue == 3) {
                AnonymousClass0fD.A0A(938801847, A032);
                return 2;
            } else if (intValue == 5) {
                i2 = -469774960;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unhandled View Model Type");
                AnonymousClass0fD.A0A(-1208270400, A032);
                throw illegalArgumentException;
            }
        } else {
            i2 = -315298185;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return i3;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (i == 0) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new UDB(LayoutInflater.from(context).inflate(R.layout.question_response_grid_item, viewGroup, false));
        } else if (i == 1) {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C14883UDl(LayoutInflater.from(context).inflate(R.layout.question_response_grid_item, viewGroup, false));
        } else if (i == 2) {
            int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new UDA(LayoutInflater.from(context).inflate(R.layout.question_response_grid_item, viewGroup, false));
        } else if (i == 3) {
            int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C14903UEi(LoadMoreButton.A00(context, R.layout.question_responses_list_empty_state, viewGroup));
        } else {
            throw new UnsupportedOperationException(002.A0O(AnonymousClass000.A00(1047), i));
        }
    }
}
