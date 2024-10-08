package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gzg  reason: case insensitive filesystem */
public final class C54111Gzg extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AudioTranslationsOptionsLanguageSelectorFragment";
    public C54133H0c A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return "audio_translations_options_language_selector_fragment";
    }

    /* JADX WARNING: type inference failed for: r0v29, types: [java.lang.Object, X.JtT] */
    public final void onViewCreated(View view, Bundle bundle) {
        IgdsListCell igdsListCell;
        boolean A1a;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0I = DbX.A0I(view, R.id.audio_translations_enabled_group);
        AnonymousClass0eM r2 = this.A01;
        UserSession A0S = DbW.A0S(r2, 0);
        ArrayList A1C = AnonymousClass7TE.A1C();
        List A1P = 0sr.A1P(new String[]{"eng", "spa"});
        0Tu r3 = 0Tu.A05;
        String A04 = 182.A04(r3, A0S, 36886106851508918L);
        if (A04.length() != 0) {
            A1P = DbX.A0x(A04);
        }
        Iterator it = A1P.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            String A012 = AnonymousClass3WS.A01(A18);
            0qQ.A0B(A18, 1);
            ? obj = new Object();
            obj.A01 = A18;
            obj.A00 = A012;
            A1C.add(obj);
        }
        Iterator it2 = A1C.iterator();
        while (it2.hasNext()) {
            C60909JtT jtT = (C60909JtT) it2.next();
            View inflate = DbV.A0D(A0I).inflate(R.layout.audio_translations_language_selector_row, A0I, false);
            if ((inflate instanceof IgdsListCell) && (igdsListCell = (IgdsListCell) inflate) != null) {
                igdsListCell.setTextCellType(C69349Njo.TYPE_CHECKBOX);
                igdsListCell.A0I(jtT.A00);
                List A002 = ((C60253JiA) this.A02.getValue()).A00();
                if (AnonymousClass7TE.A1b(A002)) {
                    A1a = A002.contains(jtT);
                } else {
                    A1a = C51966G9m.A1a(jtT.A01, AnonymousClass1Q2.A03().getISO3Language());
                }
                igdsListCell.setChecked(A1a);
                igdsListCell.A0D(new IEA(4, jtT, igdsListCell, this));
                A0I.addView(igdsListCell);
            }
        }
        if (182.A06(r3, DbT.A0X(r2), 36323156897901478L)) {
            Context A0S2 = AnonymousClass7TE.A0S(view);
            IgTextView igTextView = new IgTextView(A0S2);
            DbT.A18(A0S2, igTextView, 2131955266);
            igTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            DbT.A17(A0S2, igTextView, R.color.igds_secondary_text);
            igTextView.setPadding(A0S2.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), 0, AnonymousClass7TF.A02(A0S2, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), C51972G9s.A08(A0S2));
            A0I.addView(igTextView);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C54111Gzg() {
        0Yh A0z = DbS.A0z(C60253JiA.class);
        this.A02 = DbS.A0I(new C58709IwI(this, 25), new C58709IwI(this, 26), new C58693Iw2(4, this, (Object) null), A0z);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(530498174);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.audio_translations_enabled_bottomsheet, false);
        AnonymousClass0fD.A09(-823333988, A022);
        return A0D;
    }
}
