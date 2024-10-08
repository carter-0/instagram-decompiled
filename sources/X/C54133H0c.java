package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.H0c  reason: case insensitive filesystem */
public final class C54133H0c extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AudioTranslationsOptionsFragment";
    public int A00;
    public ViewStub A01;
    public IgdsListCell A02;
    public IgdsListCell A03;
    public IgdsListCell A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final AnonymousClass0eM A0D;
    public final String A0E = "audio_translations_option_fragment";

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbW.A1B(r3, 2131955272);
        r3.AA9(C56801ICy.A00(this, 35), 2131960992);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51969G9p.A15(getViewLifecycleOwner(), ((ClipsSharingDraftViewModel) DbS.A0I(new C58709IwI(this, 20), new C58709IwI(this, 21), new C58693Iw2(2, this, (Object) null), DbS.A0z(ClipsSharingDraftViewModel.class)).getValue()).A00, J6R.A00(this, view, 15), 25);
    }

    public static final void A00(C54133H0c h0c) {
        String str;
        ((C60253JiA) h0c.A0B.getValue()).A01(false);
        IgdsListCell igdsListCell = h0c.A02;
        if (igdsListCell == null) {
            str = "audioTranslationOptInToggle";
        } else {
            igdsListCell.setChecked(false);
            IgdsListCell igdsListCell2 = h0c.A03;
            if (igdsListCell2 == null) {
                str = "audioTranslationsLanguageSelector";
            } else {
                igdsListCell2.setVisibility(8);
                DbZ.A15(h0c);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C54133H0c h0c, boolean z) {
        String str;
        IgdsListCell igdsListCell = h0c.A03;
        if (igdsListCell == null) {
            str = "audioTranslationsLanguageSelector";
        } else {
            int i = 0;
            igdsListCell.setVisibility(DbW.A01(z ? 1 : 0));
            ViewStub viewStub = h0c.A01;
            if (viewStub == null) {
                str = "lipSyncOptInToggleStub";
            } else {
                if (!z || !h0c.A07) {
                    i = 8;
                }
                viewStub.setVisibility(i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return this.A0E;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public C54133H0c() {
        0Yh A0z = DbS.A0z(C60253JiA.class);
        this.A0B = DbS.A0I(new C58709IwI(this, 22), new C58709IwI(this, 23), new C58693Iw2(3, this, (Object) null), A0z);
        this.A0D = C58709IwI.A01(this, 24);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(173233630);
        C54133H0c.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A05 = C320236s2.A01(requireArguments, AnonymousClass000.A00(2810));
        this.A09 = requireArguments.getBoolean(AnonymousClass000.A00(2802), false);
        this.A08 = requireArguments.getBoolean(AnonymousClass000.A00(2801), false);
        this.A00 = requireArguments.getInt(AnonymousClass000.A00(2809), 0);
        AnonymousClass0fD.A09(1161237862, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2101953834);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_audio_translations_options_fragment, false);
        AnonymousClass0fD.A09(-1885140476, A022);
        return A0D2;
    }
}
