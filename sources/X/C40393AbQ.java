package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.AbQ  reason: case insensitive filesystem */
public final class C40393AbQ implements MXI {
    public CreationActionBar A00;
    public CreationActionBar A01;
    public IgdsMediaButton A02;
    public IgdsMediaButton A03;
    public IgdsMediaButton A04;
    public final AnonymousClass4DH A05;
    public final UserSession A06;
    public final C3511387s A07;
    public final AnonymousClass8RL A08;
    public final AnonymousClass8RF A09;
    public final C2801950r A0A;

    public C40393AbQ(AnonymousClass4DH r2, UserSession userSession, C3511387s r4, AnonymousClass8RL r5, AnonymousClass8RF r6, C2801950r r7) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r7, 6);
        this.A06 = userSession;
        this.A05 = r2;
        this.A09 = r6;
        this.A08 = r5;
        this.A07 = r4;
        this.A0A = r7;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void ADd(AnonymousClass8YU r1) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void ET9(View.OnClickListener onClickListener) {
    }

    public final void Eft(View.OnClickListener onClickListener) {
    }

    public final void EiY(View.OnClickListener onClickListener) {
    }

    public final void Eib(View.OnClickListener onClickListener) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (view != null) {
            this.A01 = (CreationActionBar) view.requireViewById(R.id.clips_editor_empty_state_action_bar);
            this.A00 = (CreationActionBar) view.requireViewById(R.id.clips_editor_filmstrip_state_action_bar);
            Context A0S = AnonymousClass7TE.A0S(view);
            IgdsMediaButton A002 = AnonymousClass8PT.A00(A0S, (Integer) null);
            A002.setLabel(A002.getResources().getText(2131955435));
            AOX.A00(A002, 19, this);
            this.A02 = A002;
            C3511387s r1 = this.A07;
            String str = "unselectedCreationActionBar";
            if (!r1.A0K()) {
                CreationActionBar creationActionBar = this.A01;
                if (creationActionBar != null) {
                    AnonymousClass9I9 r12 = new AnonymousClass9I9(0, 12, false);
                    IgdsMediaButton igdsMediaButton = this.A02;
                    if (igdsMediaButton != null) {
                        creationActionBar.A0E(r12, new IgdsMediaButton[]{igdsMediaButton});
                    }
                    0qQ.A0F("addMediaButton");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            } else if (AnonymousClass7TE.A0M(r1.A0D.getValue()) != 0) {
                CreationActionBar creationActionBar2 = this.A01;
                if (creationActionBar2 != null) {
                    AnonymousClass9I9 r13 = new AnonymousClass9I9(0, 12, false);
                    IgdsMediaButton igdsMediaButton2 = this.A02;
                    if (igdsMediaButton2 != null) {
                        creationActionBar2.A0E(r13, new IgdsMediaButton[]{igdsMediaButton2});
                    }
                    0qQ.A0F("addMediaButton");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            CreationActionBar creationActionBar3 = this.A01;
            if (creationActionBar3 != null) {
                IgdsMediaButton A0D = creationActionBar3.A0D((Integer) null);
                C296235pj r4 = C296235pj.PRIMARY;
                A0D.setButtonStyle(r4);
                A0D.setLabel(A0D.getResources().getText(2131955521));
                A0D.setEndAddOn(C62567Khx.CHEVRON);
                AOX.A00(A0D, 20, this);
                this.A03 = A0D;
                IgdsMediaButton A003 = AnonymousClass8PT.A00(A0S, (Integer) null);
                A003.setLabel(A003.getResources().getText(2131955450));
                AOX.A00(A003, 21, this);
                this.A04 = A003;
                CreationActionBar creationActionBar4 = this.A00;
                str = "filmstripCreationActionBar";
                if (creationActionBar4 != null) {
                    creationActionBar4.A0E(new AnonymousClass9I9(0, 12, false), new IgdsMediaButton[]{A003});
                    CreationActionBar creationActionBar5 = this.A00;
                    if (creationActionBar5 != null) {
                        IgdsMediaButton A0D2 = creationActionBar5.A0D((Integer) null);
                        A0D2.setButtonStyle(r4);
                        A0D2.setLabel(A0D2.getResources().getText(2131960992));
                        AOX.A00(A0D2, 22, this);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C61860pz r2 = new C61860pz(new C66183MGu(this, (AnonymousClass4D7) null, 41), this.A07.A0D);
        AnonymousClass4DH r14 = this.A05;
        AnonymousClass11O.A03(AnonymousClass07a.A00(r14.getViewLifecycleOwner()), r2);
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r14.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHJ((Object) viewLifecycleOwner, (Object) r6, (Object) this, (AnonymousClass4D7) null, 22), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final /* synthetic */ AnonymousClass8RH AuZ() {
        return null;
    }

    public final int BLy() {
        return R.layout.clips_timeline_template_editor_creation_fragment;
    }
}
