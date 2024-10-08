package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Qct  reason: case insensitive filesystem */
public final class C7922Qct extends QCA {
    public FrameLayout A00;
    public C13447Taa A01;
    public View A02;
    public Button A03;
    public TextView A04;
    public TextView A05;

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof C13447Taa) {
            this.A01 = (C13447Taa) context;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        0qQ.A0B(view, 0);
        ImageView A012 = SKW.A01(view, R.id.iv_back_button);
        if (this.A00 != null) {
            drawable = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
        } else {
            drawable = null;
        }
        A012.setImageDrawable(drawable);
        C11497SbK.A01(A012, 42, this);
        this.A02 = SKW.A00(view, R.id.help_button);
        this.A00 = (FrameLayout) SKW.A00(view, R.id.fl_overlay_container);
        C11497SbK sbK = new C11497SbK(this, 44);
        View view2 = this.A02;
        if (view2 != null) {
            AnonymousClass0fU.A00(sbK, view2);
        }
        this.A05 = SKW.A02(view, R.id.tv_title);
        this.A04 = SKW.A02(view, R.id.tv_subtitle);
        TextView textView = this.A05;
        0qQ.A0A(textView);
        TextView textView2 = this.A04;
        0qQ.A0A(textView2);
        C9581RdL.A00(textView, textView2);
        Button button = (Button) SKW.A00(view, R.id.btn_retake);
        this.A03 = button;
        if (button != null) {
            C11497SbK.A01(button, 43, this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(55663143);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_selfie_timeout_fragment, viewGroup, false);
        AnonymousClass0fD.A09(917204088, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1670561543);
        C7922Qct.super.onDestroyView();
        this.A05 = null;
        this.A04 = null;
        this.A02 = null;
        this.A00 = null;
        this.A03 = null;
        AnonymousClass0fD.A09(-1014098089, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(1857113316);
        super.onDetach();
        this.A01 = null;
        AnonymousClass0fD.A09(-1092598528, A022);
    }
}
