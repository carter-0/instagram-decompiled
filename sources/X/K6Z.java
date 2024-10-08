package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.io.Serializable;
import java.util.AbstractMap;

public final class K6Z extends AnonymousClass4DH implements C252213ok {
    public static final String __redex_internal_original_name = "AltTextInputFragment";
    public IgAutoCompleteTextView A00;
    public ScrollView A01;
    public AnonymousClass3E6 A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "alt_text_input";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("media_path_key");
        float f = requireArguments.getFloat("media_aspect_ratio_key");
        String string2 = requireArguments.getString("media_key");
        Serializable serializable = requireArguments.getSerializable("media_to_caption_key");
        0qQ.A0C(serializable, "null cannot be cast to non-null type java.util.LinkedHashMap<kotlin.String, kotlin.String>");
        AbstractMap abstractMap = (AbstractMap) serializable;
        double A06 = ((double) JTT.A06(this)) * 0.8d;
        Bitmap bitmap = null;
        if (string != null) {
            bitmap = 1MF.A0E(string, (int) A06, (int) (A06 / ((double) f)));
        }
        ImageView A0G = DbS.A0G(view, R.id.alt_image_view);
        A0G.setContentDescription(getString(2131969421));
        A0G.setImageBitmap(bitmap);
        this.A01 = (ScrollView) view.findViewById(R.id.alt_text_scrollview);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A02 = A012;
        A012.A9Y(this);
        IgAutoCompleteTextView igAutoCompleteTextView = (IgAutoCompleteTextView) view.findViewById(R.id.updated_alt_text_view);
        this.A00 = igAutoCompleteTextView;
        if (string2 != null) {
            if (igAutoCompleteTextView != null) {
                DbZ.A14(igAutoCompleteTextView, abstractMap.get(string2));
            }
            0qQ.A0F("textView");
            throw AnonymousClass00P.createAndThrow();
        }
        IgAutoCompleteTextView igAutoCompleteTextView2 = this.A00;
        if (igAutoCompleteTextView2 != null) {
            igAutoCompleteTextView2.requestFocus();
            FragmentActivity requireActivity = requireActivity();
            LXV lxv = new LXV(abstractMap, this, string2, 3);
            Integer num = AnonymousClass05K.A01;
            View requireViewById = requireActivity.requireViewById(R.id.next_button_textview);
            0qQ.A0A(requireViewById);
            JWN.A03(lxv, (TextView) requireViewById, num, true);
            IgAutoCompleteTextView igAutoCompleteTextView3 = this.A00;
            if (igAutoCompleteTextView3 != null) {
                0nA.A0R(igAutoCompleteTextView3);
                return;
            }
        }
        0qQ.A0F("textView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void DMr(int i, boolean z) {
        String str = "scrollView";
        if (AnonymousClass7TF.A1R(i)) {
            int A08 = 0nA.A08(requireContext()) - i;
            IgAutoCompleteTextView igAutoCompleteTextView = this.A00;
            if (igAutoCompleteTextView == null) {
                str = "textView";
            } else {
                int height = (((A08 - igAutoCompleteTextView.getHeight()) - 2Yu.A0G(getContext(), R.attr.actionBarHeight)) - AnonymousClass2uJ.A00) - DbS.A02(requireContext(), 32);
                ScrollView scrollView = this.A01;
                if (scrollView != null) {
                    0nA.A0V(scrollView, height);
                    return;
                }
            }
        } else {
            ScrollView scrollView2 = this.A01;
            if (scrollView2 != null) {
                scrollView2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(558136899);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_alt_text_photo_input, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.View");
        AnonymousClass0fD.A09(1810849310, A022);
        return inflate;
    }

    public final void onPause() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-569950831);
        K6Z.super.onPause();
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(48);
        }
        AnonymousClass3E6 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        AnonymousClass0fD.A09(-2074759379, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1650299104);
        super.onResume();
        AnonymousClass3E6 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        JTP.A17(this, r0);
        AnonymousClass0fD.A09(-1076752400, A022);
    }
}
