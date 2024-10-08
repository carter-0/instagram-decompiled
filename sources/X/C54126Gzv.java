package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Gzv  reason: case insensitive filesystem */
public final class C54126Gzv extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AudioPickerFragment";
    public RecyclerView A00;
    public C60439JlX A01;
    public String A02;
    public final C53099GiX A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = C58679Ivo.A00(this, 18);
    public final AnonymousClass0eM A07;

    public final String getModuleName() {
        return "clips_audition";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (view instanceof ConstraintLayout) {
            this.A02 = C320236s2.A01(requireArguments(), AnonymousClass000.A00(172));
            this.A00 = DbT.A0I(view, R.id.audio_picker_list);
            UserSession A0l = AnonymousClass7TE.A0l(this.A07);
            String str2 = this.A02;
            if (str2 == null) {
                str = "musicBrowseSessionId";
            } else {
                ArrayList A1C = AnonymousClass7TE.A1C();
                C63897LBb lBb = C60466Jly.A01;
                Context requireContext = requireContext();
                Integer num = AnonymousClass05K.A00;
                C60439JlX jlX = new C60439JlX((C3515589i) null, A0l, new IQU(this), num, str2, A1C, lBb.A00(requireContext, num));
                this.A01 = jlX;
                jlX.setHasStableIds(true);
                RecyclerView recyclerView = this.A00;
                str = "auditionAudioList";
                if (recyclerView != null) {
                    C60439JlX jlX2 = this.A01;
                    if (jlX2 == null) {
                        str = "audioListAdapter";
                    } else {
                        recyclerView.setAdapter(jlX2);
                        RecyclerView recyclerView2 = this.A00;
                        if (recyclerView2 != null) {
                            DbV.A1A(requireContext(), recyclerView2);
                            RecyclerView recyclerView3 = this.A00;
                            if (recyclerView3 != null) {
                                recyclerView3.A11(new C60466Jly(requireContext(), num));
                                RecyclerView recyclerView4 = this.A00;
                                if (recyclerView4 != null) {
                                    recyclerView4.setItemAnimator(new U05());
                                    DbT.A18(requireContext(), AnonymousClass7TG.A0R(view, R.id.audio_picker_subtitle), 2131974666);
                                    C60297Jiv jiv = (C60297Jiv) this.A05.getValue();
                                    DbZ.A1C(this, C58103ImP.A01(this, (AnonymousClass4D7) null, 31), jiv.A04);
                                    DbZ.A1C(this, C58103ImP.A01(this, (AnonymousClass4D7) null, 32), jiv.A05);
                                    DbZ.A1C(this, C58103ImP.A01(this, (AnonymousClass4D7) null, 33), ((C52974GgR) this.A06.getValue()).A0V);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0z("Clips Audio Selector Fragment view should be ConstraintLayout");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C54126Gzv() {
        C58679Ivo ivo = new C58679Ivo(this, 17);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58679Ivo(new C58679Ivo(this, 19), 20));
        this.A05 = DbS.A0I(new C58679Ivo(A002, 21), ivo, C58688Ivx.A00((Object) null, A002, 48), DbS.A0z(C60297Jiv.class));
        this.A04 = C58679Ivo.A00(this, 16);
        this.A03 = new C53099GiX();
        this.A07 = C227642jf.A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-264862289);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_audition_audio_picker_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1397904826, A022);
        return inflate;
    }
}
