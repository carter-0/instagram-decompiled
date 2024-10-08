package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.rtc.statemodel.RtcSettingsParticipant;

public final class NQH extends C232232tF {
    public static final NQH A00 = new Object();

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        String str;
        C68190N5f n5f = (C68190N5f) r6;
        C68030Myw myw = (C68030Myw) r7;
        AnonymousClass7TG.A1N(n5f, myw);
        myw.A00 = n5f;
        RtcSettingsParticipant rtcSettingsParticipant = n5f.A00;
        IgTextView igTextView = myw.A04;
        igTextView.setVisibility(0);
        IgTextView igTextView2 = myw.A03;
        0qQ.A0B(rtcSettingsParticipant, 0);
        String str2 = rtcSettingsParticipant.A03;
        int length = str2.length();
        if (length == 0) {
            str2 = rtcSettingsParticipant.A06;
        }
        igTextView2.setText(str2);
        if (length == 0) {
            str = "";
        } else {
            str = rtcSettingsParticipant.A06;
        }
        int i = 8;
        if (str.length() > 0) {
            i = 0;
        }
        igTextView.setVisibility(i);
        igTextView.setText(str);
        myw.A05.setUrl(rtcSettingsParticipant.A01, myw.A02);
        myw.A01.setVisibility(8);
    }

    public final Class modelClass() {
        return C68190N5f.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        return new C68030Myw(layoutInflater, viewGroup);
    }
}
