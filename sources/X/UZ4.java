package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.List;

public final class UZ4 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SuggestedHiddenWordsFragment";
    public final String A00 = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C20610Wvr(this, 23));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C20610Wvr(this, 24));
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C20610Wvr(this, 25));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C20610Wvr(this, 29));
    public final AnonymousClass0eM A06;

    public final String getModuleName() {
        return "suggested_hidden_words_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> arrayList;
        Integer num;
        C54660HMr hMr;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (arrayList = bundle2.getStringArrayList(AnonymousClass000.A00(3483))) == null) {
            arrayList = 0sn.A00;
        }
        String str = (String) 00k.A0J(arrayList);
        if (str == null) {
            A00(this);
            return;
        }
        AnonymousClass0eM r1 = this.A06;
        r1.getValue();
        UserSession A0l = AnonymousClass7TE.A0l(this.A04);
        List A1I = AnonymousClass7TE.A1I(str);
        AnonymousClass0eM r4 = this.A02;
        boolean A1Z = AnonymousClass7TF.A1Z(r4);
        0qQ.A0B(A0l, 0);
        if (A1Z) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A0C;
        }
        C56529I0a.A00.A00(A0l, num, AnonymousClass05K.A01, (String) null, A1I, arrayList);
        r1.getValue();
        C56058Hs7 hs7 = (C56058Hs7) this.A05.getValue();
        String str2 = this.A00;
        boolean A1Z2 = AnonymousClass7TF.A1Z(r4);
        AnonymousClass7TF.A1H(hs7, str2);
        if (A1Z2) {
            hMr = C54660HMr.COMMENT_SUGGESTED_HIDDEN_WORDS_V2;
        } else {
            hMr = C54660HMr.COMMENT_SUGGESTED_HIDDEN_WORDS;
        }
        hs7.A01("upsell_bottom_sheet", str2, hMr.A00);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.suggested_hidden_words_upsell);
        int i = 2131974688;
        if (AnonymousClass7TF.A1Z(r4)) {
            i = 2131974689;
        }
        String string = getString(i);
        0qQ.A0A(string);
        igdsHeadline.setBody((CharSequence) string);
        View findViewById = view.findViewById(R.id.suggested_hidden_words_word_tv);
        TextView textView = (TextView) findViewById;
        Context context = view.getContext();
        textView.setCompoundDrawablePadding(C51972G9s.A08(context));
        Drawable A012 = AnonymousClass4Ed.A01(context, R.drawable.instagram_eye_off_pano_outline_24, 2Yu.A0B(getContext()));
        RectF rectF = 0nA.A01;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(A012, (Drawable) null, (Drawable) null, (Drawable) null);
        0qQ.A07(findViewById);
        AnonymousClass0fU.A00(new W9h(str, textView, 9), textView);
        AnonymousClass0fU.A00(new W9h(str, this, 10), AnonymousClass7TE.A0b(view, R.id.suggested_hidden_words_cta));
        WB0.A00(AnonymousClass7TE.A0b(view, R.id.suggested_hidden_words_dismiss), 62, this);
    }

    public static final void A00(UZ4 uz4) {
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(uz4.getActivity());
        if (AnonymousClass7TF.A1Z(uz4.A01)) {
            C331157Pu A002 = C48943Emh.A00(A012);
            if (A002 != null) {
                A002.A0T();
            }
        } else if (A012 != null) {
            A012.A0B();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public UZ4() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20610Wvr(new C20610Wvr(this, 26), 27));
        0Yh r4 = new 0Yh(U8L.class);
        this.A06 = new C227862kA(new C20610Wvr(A002, 28), new MJ6(34, A002, this), new MJ6(33, (Object) null, A002), r4);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1961851838);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.suggested_hidden_words_bottom_sheet, false);
        AnonymousClass0fD.A09(54716387, A022);
        return A0D;
    }
}
