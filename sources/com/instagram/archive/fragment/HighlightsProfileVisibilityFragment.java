package com.instagram.archive.fragment;

import X.0eO;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass7TF;
import X.C227642jf;
import X.C60118Jfz;
import X.C69349Njo;
import X.DbS;
import X.DbT;
import X.DbX;
import X.JTS;
import X.LYC;
import X.LZJ;
import X.MG9;
import X.MME;
import X.MMZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class HighlightsProfileVisibilityFragment extends AnonymousClass4DH {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public IgdsBottomButtonLayout bottomButton;
    public IgTextView footerText;
    public IgdsListCell highlightsOnlyToggle;
    public IgdsListCell includeInProfileToggle;

    public final String getModuleName() {
        return "HighlightsProfileVisibilityFragment";
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, com.instagram.archive.fragment.HighlightsProfileVisibilityFragment, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(view, R.id.include_in_profile_toggle);
        0qQ.A0B(igdsListCell, 0);
        this.includeInProfileToggle = igdsListCell;
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TF.A0F(view, R.id.highlights_only_toggle);
        0qQ.A0B(igdsListCell2, 0);
        this.highlightsOnlyToggle = igdsListCell2;
        IgTextView A0Z = DbX.A0Z(view, R.id.footer_text);
        0qQ.A0B(A0Z, 0);
        this.footerText = A0Z;
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(view, R.id.bottom_action_button);
        0qQ.A0B(igdsBottomButtonLayout, 0);
        this.bottomButton = igdsBottomButtonLayout;
        IgdsListCell igdsListCell3 = this.includeInProfileToggle;
        if (igdsListCell3 != null) {
            C69349Njo njo = C69349Njo.TYPE_RADIO;
            igdsListCell3.setTextCellType(njo);
            IgdsListCell igdsListCell4 = this.highlightsOnlyToggle;
            if (igdsListCell4 != null) {
                igdsListCell4.setTextCellType(njo);
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.bottomButton;
                if (igdsBottomButtonLayout2 != null) {
                    igdsBottomButtonLayout2.setPrimaryAction(getString(2131960992), new LYC((Object) this, 32));
                    JTS.A10(this, new MG9(this, (AnonymousClass4D7) null, 8), ((C60118Jfz) this.A00.getValue()).A00);
                    IgdsListCell igdsListCell5 = this.includeInProfileToggle;
                    if (igdsListCell5 != null) {
                        LZJ.A00(igdsListCell5, this, 0);
                        IgdsListCell igdsListCell6 = this.highlightsOnlyToggle;
                        if (igdsListCell6 != null) {
                            LZJ.A00(igdsListCell6, this, 1);
                            return;
                        }
                    }
                } else {
                    str = "bottomButton";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            str = "highlightsOnlyToggle";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "includeInProfileToggle";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public HighlightsProfileVisibilityFragment() {
        MME mme = new MME(this, 4);
        AnonymousClass0eM A002 = MME.A00(new MME(this, 5), 0eO.A02, 6);
        this.A00 = DbS.A0I(new MME(A002, 7), mme, new MMZ(42, (Object) null, (Object) A002), DbS.A0z(C60118Jfz.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1862316909);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_highlights_profile_visibility_fragment, false);
        AnonymousClass0fD.A09(-2050297458, A02);
        return A0D;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(760033387);
        super.onDestroyView();
        HighlightsProfileVisibilityFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-2134287197, A02);
    }
}
