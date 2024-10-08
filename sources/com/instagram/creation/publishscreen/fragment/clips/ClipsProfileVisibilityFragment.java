package com.instagram.creation.publishscreen.fragment.clips;

import X.0eO;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass3QO;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass7TG;
import X.C227642jf;
import X.C318996ps;
import X.C51967G9n;
import X.C59917Jbg;
import X.C60124Jg5;
import X.C69349Njo;
import X.DbS;
import X.DbT;
import X.JTR;
import X.JTS;
import X.LYF;
import X.LZJ;
import X.MFU;
import X.MMY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class ClipsProfileVisibilityFragment extends AnonymousClass4DH {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public IgdsBottomButtonLayout bottomButton;
    public IgdsListCell clipsOnlyToggle;
    public IgTextView footerText;
    public IgdsListCell includeInProfileToggle;

    public final String getModuleName() {
        return "ClipsProfileVisibilityFragment";
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        boolean z = false;
        if (AnonymousClass3QO.A01.get(requireArguments().getString("AUDIENCE")) == AnonymousClass3QO.OPAL) {
            z = true;
            if (C318996ps.A01()) {
                TextView A0R = AnonymousClass7TG.A0R(view, R.id.clips_profile_visibility_subtitle);
                C51967G9n.A0v();
                A0R.setText(2131968846);
            }
        }
        IgdsListCell igdsListCell = (IgdsListCell) view.requireViewById(R.id.include_in_profile_toggle);
        0qQ.A0B(igdsListCell, 0);
        this.includeInProfileToggle = igdsListCell;
        IgdsListCell igdsListCell2 = (IgdsListCell) view.requireViewById(R.id.clips_only_toggle);
        0qQ.A0B(igdsListCell2, 0);
        this.clipsOnlyToggle = igdsListCell2;
        this.footerText = JTR.A0h(view, R.id.footer_text);
        IgdsBottomButtonLayout A0c = DbT.A0c(view, R.id.bottom_action_button);
        0qQ.A0B(A0c, 0);
        this.bottomButton = A0c;
        IgdsListCell igdsListCell3 = this.includeInProfileToggle;
        if (igdsListCell3 != null) {
            C69349Njo njo = C69349Njo.TYPE_RADIO;
            igdsListCell3.setTextCellType(njo);
            IgdsListCell igdsListCell4 = this.clipsOnlyToggle;
            if (igdsListCell4 != null) {
                igdsListCell4.setTextCellType(njo);
                IgdsBottomButtonLayout igdsBottomButtonLayout = this.bottomButton;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryAction(getString(2131960992), new LYF((Object) this, 49));
                    JTS.A10(this, new MFU(this, (AnonymousClass4D7) null, 4, z), ((C60124Jg5) this.A00.getValue()).A00);
                    IgdsListCell igdsListCell5 = this.includeInProfileToggle;
                    if (igdsListCell5 != null) {
                        LZJ.A00(igdsListCell5, this, 8);
                        IgdsListCell igdsListCell6 = this.clipsOnlyToggle;
                        if (igdsListCell6 != null) {
                            LZJ.A00(igdsListCell6, this, 9);
                            return;
                        }
                    }
                } else {
                    str = "bottomButton";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            str = "clipsOnlyToggle";
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

    public ClipsProfileVisibilityFragment() {
        C59917Jbg A002 = C59917Jbg.A00(this, 43);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C59917Jbg.A00(C59917Jbg.A00(this, 44), 45));
        this.A00 = DbS.A0I(C59917Jbg.A00(A003, 46), A002, MMY.A00(A003, (Object) null, 5), DbS.A0z(C60124Jg5.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1012886251);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_profile_visibility_fragment, false);
        AnonymousClass0fD.A09(-1768111340, A02);
        return A0D;
    }
}
