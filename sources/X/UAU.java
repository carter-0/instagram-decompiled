package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.OnLifecycleEvent;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponsesModel;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.List;

public final class UAU extends 2Rw implements 1wn, AnonymousClass07Y {
    public QuestionResponsesModel A00;
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();
    public final int A03;
    public final AnonymousClass07V A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final ReelDashboardFragment A07;
    public final Integer A08;

    public final void onBindViewHolder(C249703kE r11, int i) {
        int i2 = i;
        C249703kE r7 = r11;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            C17801VgE vgE = ((VTJ) this.A01.get(i)).A00;
            if (vgE != null) {
                C17050VFy.A00(vgE, this.A07, (UDB) r7, this.A08, i);
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else if (itemViewType == 1) {
            C17801VgE vgE2 = ((VTJ) this.A01.get(i)).A00;
            if (vgE2 != null) {
                C17049VFx.A00(vgE2, this.A07, (C14883UDl) r7, this.A08, i);
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else if (itemViewType != 2) {
            C14884UDm uDm = (C14884UDm) r7;
            QuestionResponsesModel questionResponsesModel = this.A00;
            questionResponsesModel.getClass();
            ReelDashboardFragment reelDashboardFragment = this.A07;
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            View view = uDm.A01;
            Context context = view.getContext();
            C13989Tnp.A0M(view).setColor(0nH.A05(Color.parseColor(questionResponsesModel.A05)));
            int parseColor = Color.parseColor(questionResponsesModel.A09);
            DbX.A13(context, uDm.A02, String.valueOf(questionResponsesModel.A00), 2131971813);
            uDm.A04.setColorFilter(parseColor);
            uDm.A03.A02();
            uDm.A00 = new WBD(30, (Object) questionResponsesModel, (Object) reelDashboardFragment);
        } else {
            C17801VgE vgE3 = ((VTJ) this.A01.get(i)).A00;
            if (vgE3 != null) {
                ReelDashboardFragment reelDashboardFragment2 = this.A07;
                UserSession userSession = this.A06;
                Integer num = this.A08;
                C17048VFw.A00(this.A05, userSession, vgE3, reelDashboardFragment2, (UDA) r7, num, i2);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new UDB(JTP.A0G(viewGroup).inflate(R.layout.question_response_item, viewGroup, false));
        }
        if (i == 1) {
            return new C14883UDl(JTP.A0G(viewGroup).inflate(R.layout.question_response_item, viewGroup, false));
        }
        if (i == 2) {
            return new UDA(JTP.A0G(viewGroup).inflate(R.layout.question_response_item, viewGroup, false));
        }
        if (i == 3) {
            return new C14884UDm(DbV.A0D(viewGroup).inflate(R.layout.question_response_see_all_card, viewGroup, false));
        }
        throw DbW.A0a(C273654mx.A00(3450), i);
    }

    public static void A00(UAU uau) {
        int i;
        List list;
        uau.A00.getClass();
        List list2 = uau.A01;
        list2.clear();
        int i2 = 0;
        while (true) {
            i = uau.A03;
            list = uau.A02;
            if (i2 >= Math.min(i, list.size())) {
                break;
            }
            list2.add(C17045VFt.A00(new C17801VgE((QuestionResponseModel) list.get(i2), uau.A00)));
            i2++;
        }
        if (uau.A00.A0B || list.size() > i) {
            list2.add(new VTJ((C17801VgE) null, AnonymousClass05K.A0Y));
        }
        uau.notifyDataSetChanged();
    }

    @OnLifecycleEvent(07T.ON_DESTROY)
    public void removeEventListener() {
        AnonymousClass1Nd.A00(this.A06).A02(this, WQF.class);
        this.A04.A0A(this);
    }

    public UAU(AnonymousClass07V r3, AnonymousClass0iw r4, UserSession userSession, ReelDashboardFragment reelDashboardFragment, Integer num) {
        int i;
        this.A04 = r3;
        this.A06 = userSession;
        this.A07 = reelDashboardFragment;
        this.A08 = num;
        if (1 - num.intValue() != 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = 16;
        }
        this.A03 = i;
        this.A05 = r4;
        r3.A09(this);
        AnonymousClass1Nd.A00(userSession).A01(this, WQF.class);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1417874254);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(1114874868, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(2013441994);
        int intValue = ((VTJ) this.A01.get(i)).A01.intValue();
        int i3 = 1;
        if (intValue == 1) {
            i3 = 0;
            i2 = -1360387355;
        } else if (intValue != 2) {
            i3 = 3;
            if (intValue == 3) {
                AnonymousClass0fD.A0A(1358838802, A032);
                return 2;
            } else if (intValue == 4) {
                i2 = -1488931045;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected QuestionResponseCardViewModel type");
                AnonymousClass0fD.A0A(741117178, A032);
                throw illegalArgumentException;
            }
        } else {
            i2 = 697727653;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return i3;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(1750439625);
        int A033 = AnonymousClass0fD.A03(-634383512);
        this.A02.remove(((WQF) obj).A00);
        A00(this);
        AnonymousClass0fD.A0A(1005267752, A033);
        AnonymousClass0fD.A0A(1970033358, A032);
    }
}
