package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel;
import com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel;
import com.instagram.direct.ui.polls.PollMessageVotersView;
import java.util.ArrayList;
import java.util.List;

public final class NO2 extends C232222tE {
    public final OJe A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67942MxS(DbT.A0D(layoutInflater, viewGroup, R.layout.poll_message_option_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        PollMessageOptionViewModel pollMessageOptionViewModel = (PollMessageOptionViewModel) r7;
        C67942MxS mxS = (C67942MxS) r8;
        AnonymousClass7TF.A1H(pollMessageOptionViewModel, mxS);
        IgCheckBox igCheckBox = mxS.A00;
        igCheckBox.setText(pollMessageOptionViewModel.A04);
        igCheckBox.setChecked(pollMessageOptionViewModel.A06);
        igCheckBox.setOnCheckedChangeListener(new C71459Ol0(4, this, pollMessageOptionViewModel));
        List<PollMessageVoterInfoViewModel> list = pollMessageOptionViewModel.A05;
        if (AnonymousClass7TE.A1b(list)) {
            PollMessageVotersView pollMessageVotersView = mxS.A01;
            pollMessageVotersView.setVisibility(0);
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (PollMessageVoterInfoViewModel pollMessageVoterInfoViewModel : list) {
                A0r.add(pollMessageVoterInfoViewModel.A00);
            }
            int i = pollMessageOptionViewModel.A00;
            if (i == 0) {
                i = list.size();
            }
            pollMessageVotersView.A00(A0r, (long) i);
            C71405Ok4.A01(pollMessageVotersView, 51, pollMessageOptionViewModel, this);
            pollMessageVotersView.setContentDescription(pollMessageOptionViewModel.A02);
            return;
        }
        mxS.A01.setVisibility(8);
    }

    public final Class modelClass() {
        return PollMessageOptionViewModel.class;
    }

    public NO2(OJe oJe) {
        this.A00 = oJe;
    }
}
