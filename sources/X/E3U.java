package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;

public final class E3U extends AnonymousClass4DH implements AnonymousClass0iw, C273414mX {
    public static final String __redex_internal_original_name = "ChannelsEducationBottomSheetFragment";
    public int A00;
    public C254793t3 A01;
    public RecyclerView A02;
    public AnonymousClass2t9 A03;
    public final String A04 = "channels_education_bottom_sheet";
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C73657PhW(this, 47));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C41655Ay7(this, 0));
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final /* synthetic */ void Cyc() {
    }

    public final /* synthetic */ void Cyf() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        List A002;
        int i3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("channel_education_audience_type", 0);
        } else {
            i = 0;
        }
        this.A00 = i;
        Bundle bundle3 = this.mArguments;
        C254793t3 r0 = null;
        if (bundle3 != null) {
            r0 = OXL.A00(bundle3, "channel_education_thread_id");
        }
        this.A01 = r0;
        RecyclerView A0K = DbX.A0K(view);
        this.A02 = A0K;
        if (A0K != null) {
            DbU.A15(requireContext, A0K, 1, false);
            RecyclerView recyclerView = this.A02;
            if (recyclerView != null) {
                DbT.A16(requireContext(), recyclerView, 2Yu.A02(requireContext));
                AnonymousClass2tC A003 = AnonymousClass2t9.A00(requireContext);
                AnonymousClass0eM r2 = this.A07;
                A003.A01(new C15820Uj3(AnonymousClass7TE.A0l(r2), requireContext));
                A003.A01(new C47781EGs(requireContext));
                A003.A01(new EH4(AnonymousClass7TE.A0l(r2), requireContext));
                A003.A03 = new C71948OtZ(this);
                AnonymousClass2t9 A004 = A003.A00();
                Object value = this.A05.getValue();
                ViewModelListUpdate A0R = DbS.A0R();
                if (value == C69270NiW.ACTIVATION_NUX) {
                    i2 = 2131955036;
                    A002 = A00();
                    i3 = 48;
                } else {
                    i2 = 2131955043;
                    A002 = A00();
                    i3 = 49;
                }
                A0R.A00(new FYD(i2, A002, new C73657PhW(this, i3)));
                A004.A05(A0R);
                this.A03 = A004;
                RecyclerView recyclerView2 = this.A02;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(A004);
                    return;
                }
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public static final List A00() {
        return 0sr.A1P(new N4H[]{new N4H((Integer) 2131955037, (int) R.drawable.instagram_calendar_pano_outline_24, 2131955038), new N4H((Integer) 2131955039, (int) R.drawable.instagram_media_pano_outline_24, 2131955040), new N4H((Integer) 2131955041, (int) R.drawable.instagram_trophy_pano_outline_24, 2131955042)});
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-185805359);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.channel_education_container, viewGroup, false);
        AnonymousClass0fD.A09(-324754305, A022);
        return inflate;
    }
}
