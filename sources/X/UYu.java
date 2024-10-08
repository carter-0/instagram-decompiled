package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class UYu extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LeadGenCreateFormMediaPickerFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public RecyclerView A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C20696WxS(this, 41));
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = new C227862kA(new C20696WxS(this, 42), new C20696WxS(this, 43), new C73666Phf(49, (Object) null, this), new 0Yh(C60247Ji4.class));

    public final String getModuleName() {
        return "lead_gen_create_form_media_picker";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r3 = this.A07;
        C60247Ji4 ji4 = (C60247Ji4) r3.getValue();
        if (ji4.A00 == 0) {
            ji4.A00();
        }
        this.A03 = view.findViewById(R.id.loading_spinner);
        this.A00 = view.findViewById(R.id.media_picker_empty_state_icon);
        this.A02 = view.findViewById(R.id.media_picker_empty_state_title);
        this.A01 = view.findViewById(R.id.media_picker_empty_state_subtitle);
        RecyclerView A0F = DbZ.A0F(view, R.id.media_container);
        this.A04 = A0F;
        if (A0F != null) {
            A0F.setLayoutManager(new GridLayoutManager(getActivity(), 3));
            A0F.A11(new C60455Jln(A0F.getResources().getDimensionPixelOffset(R.dimen.account_recs_header_image_margin), 3));
            A0F.setAdapter((2Rw) AnonymousClass7TE.A14(this.A05));
            A0F.setItemAnimator((AnonymousClass3AS) null);
            JTQ.A0y(A0F.A0D, A0F, new WWL(this, 1), C3251771i.A07);
        }
        DbV.A1F(getViewLifecycleOwner(), ((C60247Ji4) r3.getValue()).A03, new C20786Wyx(this, 7), 5);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1830990148);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_create_form_media_picker, viewGroup, false);
        AnonymousClass0fD.A09(-2134119029, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2145061037);
        super.onDestroyView();
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-1480309062, A022);
    }
}
