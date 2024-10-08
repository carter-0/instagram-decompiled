package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Iterator;
import java.util.List;

public final class H03 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "TranslatedAudioSelectionFragment";
    public C52875Ge9 A00;
    public C59565JOl A01;
    public String A02;
    public String A03;
    public List A04 = 0sn.A00;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = DbS.A0I(new C58709IwI(this, 27), new C58709IwI(this, 28), new C58693Iw2(5, this, (Object) null), DbS.A0z(GIY.class));

    public final String getModuleName() {
        return "translated_audio_selection_fragment";
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.LinearLayout, android.view.View, java.lang.Object, X.Ge9, android.view.ViewGroup] */
    public final void onViewCreated(View view, Bundle bundle) {
        String A0p;
        IgTextView igTextView;
        IgTextView igTextView2;
        IgTextView igTextView3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0I = DbX.A0I(view, R.id.audio_translations_enabled_group);
        List list = this.A04;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                Context A0S = AnonymousClass7TE.A0S(view);
                View view2 = null;
                ? linearLayout = new LinearLayout(A0S, (AttributeSet) null);
                View inflate = DbV.A0D(linearLayout).inflate(R.layout.audio_translations_enabled_row, linearLayout);
                IgImageView igImageView = null;
                if ((inflate instanceof ViewGroup) && inflate != null) {
                    IgTextView requireViewById = inflate.requireViewById(R.id.language_name);
                    if (requireViewById instanceof IgTextView) {
                        igTextView = requireViewById;
                    } else {
                        igTextView = null;
                    }
                    linearLayout.A00 = igTextView;
                    IgTextView requireViewById2 = inflate.requireViewById(R.id.now_playing_separator);
                    if (requireViewById2 instanceof IgTextView) {
                        igTextView2 = requireViewById2;
                    } else {
                        igTextView2 = null;
                    }
                    linearLayout.A02 = igTextView2;
                    IgTextView requireViewById3 = inflate.requireViewById(R.id.now_playing_text);
                    if (requireViewById3 instanceof IgTextView) {
                        igTextView3 = requireViewById3;
                    } else {
                        igTextView3 = null;
                    }
                    linearLayout.A01 = igTextView3;
                    IgImageView requireViewById4 = inflate.requireViewById(R.id.language_play_icon);
                    if (requireViewById4 instanceof IgImageView) {
                        igImageView = requireViewById4;
                    }
                    linearLayout.A03 = igImageView;
                }
                if (A18 == null || A18.length() == 0) {
                    A0p = C51967G9n.A0p(A0S, 2131971895);
                } else {
                    A0p = AnonymousClass3WS.A01(A18);
                }
                linearLayout.setLanguageName(A0p);
                String str = this.A03;
                boolean z = false;
                if (((A18 == null || A18.length() == 0) && (str == null || str.length() == 0)) || 0qQ.A0K(A18, str)) {
                    z = true;
                }
                linearLayout.setIsPlaying(z);
                if (z) {
                    this.A00 = linearLayout;
                }
                AnonymousClass0fU.A00(new C56762IBl(linearLayout, this, A18, 1), linearLayout);
                View requireViewById5 = linearLayout.requireViewById(R.id.language_more_button);
                if (requireViewById5 instanceof IgImageView) {
                    view2 = requireViewById5;
                }
                if (A18 == null || A18.length() == 0 || !this.A05) {
                    linearLayout.setIconPadding(DbZ.A02(this));
                } else {
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    Context context = getContext();
                    if (!(context == null || view2 == null)) {
                        AnonymousClass0fU.A00(new C56762IBl(context, this, A18, 3), view2);
                    }
                }
                A0I.addView(linearLayout);
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2048465687);
        H03.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getString("selected_audio_language_key");
            this.A04 = bundle2.getStringArrayList("available_audio_languages_key");
            this.A02 = bundle2.getString("media_id");
            this.A05 = bundle2.getBoolean("is_self_view");
        }
        AnonymousClass0fD.A09(-178759734, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-351658141);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.audio_translations_enabled_bottomsheet, false);
        AnonymousClass0fD.A09(1567522518, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1164798358);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(944206290, A022);
    }
}
