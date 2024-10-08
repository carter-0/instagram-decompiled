package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class NOY extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C294875nB A03;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r16, C249703kE r17) {
        ArrayList arrayList;
        NPF npf = (NPF) r16;
        C67934MxK mxK = (C67934MxK) r17.itemView.getTag();
        if (mxK != null) {
            ArrayList arrayList2 = npf.A07;
            List<C267324bN> list = npf.A08;
            List list2 = npf.A09;
            String str = npf.A06;
            String str2 = npf.A05;
            int i = npf.A00;
            int i2 = npf.A01;
            int i3 = npf.A03;
            int i4 = npf.A02;
            C294875nB r7 = this.A03;
            C67792Muw muw = mxK.A00.A0A;
            if (muw != null) {
                muw.A0A = str;
                muw.A09 = str2;
                muw.A07 = r7;
                muw.A0D = arrayList2;
                muw.A0B = list;
                AnonymousClass3Y6 r11 = new AnonymousClass3Y6();
                r11.A0H = "0";
                if (list != null) {
                    arrayList = AnonymousClass7TE.A1C();
                    for (C267324bN A002 : list) {
                        C276014sL A003 = C295325ny.A00(A002);
                        if (A003 != null) {
                            arrayList.add(A003);
                        }
                    }
                } else {
                    arrayList = 0sn.A00;
                }
                0qQ.A0B(arrayList, 0);
                r11.A0M = arrayList;
                C298855u9 A004 = C276114sa.A00.A00(AnonymousClass7TF.A1V(muw.A09));
                A004.A00 = muw.A09;
                r11.A04 = A004.A00();
                r11.A03 = ClipsIFUType.DIRECT_SEARCH;
                C292795jX r12 = new C292795jX();
                String str3 = muw.A0A;
                0qQ.A0B(str3, 0);
                r12.A03 = str3;
                String str4 = muw.A09;
                r12.A02 = str4;
                C294575mg r0 = muw.A08;
                if (r0 == null) {
                    UserSession userSession = muw.A06;
                    muw.A08 = new C294575mg(new C231702s8(muw.A05, userSession), userSession, muw.A07, r11, r12, (AnonymousClass2xS) null, new C229332nD(userSession, muw.A04));
                } else {
                    r0.A00 = r11;
                    C292795jX r02 = r0.A02;
                    r02.A03 = str3;
                    r02.A02 = str4;
                }
                muw.notifyDataSetChanged();
                muw.A0C = list2;
                muw.A00 = i;
                muw.A01 = i2;
                muw.A03 = i3;
                muw.A02 = i4;
            }
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass0iw r5 = this.A01;
        View inflate = layoutInflater.inflate(R.layout.direct_inbox_search_reshared_content_layout, viewGroup, false);
        C67934MxK mxK = new C67934MxK(inflate);
        RecyclerView recyclerView = mxK.A00;
        DbV.A1A(context, recyclerView);
        2Rw r1 = new 2Rw();
        r1.A04 = context;
        r1.A06 = userSession;
        r1.A05 = r5;
        r1.A0A = "";
        recyclerView.setAdapter(r1);
        inflate.setTag(mxK);
        return new C67934MxK(inflate);
    }

    public final Class modelClass() {
        return NPF.class;
    }

    public NOY(Context context, AnonymousClass0iw r2, UserSession userSession, C294875nB r4) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = r2;
    }
}
