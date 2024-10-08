package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class E21 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ReportTranslationsBottomSheetFragment";
    public Context A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return "report_translations_bottomsheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0I = DbX.A0I(view, R.id.report_translations_bottomsheet_layout);
        Context context = this.A00;
        if (context != null) {
            IgdsListCell igdsListCell = new IgdsListCell(context, (AttributeSet) null);
            Context context2 = this.A00;
            if (context2 != null) {
                igdsListCell.A0H(AnonymousClass7TE.A16(context2, 2131972218));
                A0I.addView(igdsListCell);
                if (this.A03) {
                    Context context3 = this.A00;
                    if (context3 != null) {
                        A00(A0I, this, AnonymousClass7TE.A16(context3, 2131972211), 23);
                    }
                }
                if (this.A04) {
                    Context context4 = this.A00;
                    if (context4 != null) {
                        A00(A0I, this, AnonymousClass7TE.A16(context4, 2131972219), 24);
                        Context context5 = this.A00;
                        if (context5 != null) {
                            A00(A0I, this, AnonymousClass7TE.A16(context5, 2131972209), 25);
                            Context context6 = this.A00;
                            if (context6 != null) {
                                A00(A0I, this, AnonymousClass7TE.A16(context6, 2131972210), 26);
                                Context context7 = this.A00;
                                if (context7 != null) {
                                    A00(A0I, this, AnonymousClass7TE.A16(context7, 2131972192), 27);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F("context");
        throw AnonymousClass00P.createAndThrow();
    }

    public static void A00(ViewGroup viewGroup, E21 e21, CharSequence charSequence, int i) {
        FP5 fp5 = new FP5(e21, i);
        Context context = e21.A00;
        if (context == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        IgdsListCell igdsListCell = new IgdsListCell(context, (AttributeSet) null);
        igdsListCell.A0I(charSequence);
        igdsListCell.A0G(C69349Njo.TYPE_UNKNOWN, true);
        AnonymousClass0fU.A00(fp5, igdsListCell);
        viewGroup.addView(igdsListCell);
    }

    public static final void A01(C48134EZc eZc, EZW ezw, E21 e21) {
        Long A10;
        String str = e21.A01;
        if (!(str == null || (A10 = AnonymousClass7TE.A10(str)) == null)) {
            0Aj A0e = AnonymousClass7TE.A0e(DbX.A0P(e21, e21.A05), "instagram_reels_translations_error_report");
            if (A0e.isSampled()) {
                A0e.A8M(ezw, "translation_type");
                A0e.A8M(eZc, "error_type");
                A0e.A9F("media_id", A10);
                A0e.AAJ("containermodule", "report_translations_bottomsheet_fragment");
                A0e.AAJ("locale", AnonymousClass1Q2.A02().getLanguage());
                A0e.Cgf();
            }
        }
        DbW.A1K(C48943Emh.A00(DbX.A0i(e21)));
        C310336ap A0a = DbS.A0a();
        Context context = e21.A00;
        if (context == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        DbS.A19(context, A0a, 2131972216);
        A0a.A02();
        A0a.A07(R.drawable.instagram_circle_check_pano_outline_24);
        DbY.A1N(A0a);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(38725653);
        E21.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("show_text_translations_error_rows");
        this.A04 = requireArguments.getBoolean("show_voice_translations_error_rows");
        this.A01 = requireArguments.getString("translation_error_media_id");
        this.A02 = requireArguments.getBoolean("has_closed_caption_translations");
        this.A00 = requireContext();
        AnonymousClass0fD.A09(-689297240, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-250799817);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.report_translations_bottomsheet, false);
        AnonymousClass0fD.A09(1534086398, A022);
        return A0D;
    }
}
