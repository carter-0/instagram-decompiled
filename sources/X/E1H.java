package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class E1H extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ContentNoteDetailsFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(new MMC(this, 22));
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final AnonymousClass0eM A0E;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        IgImageView A0b = DbX.A0b(view2, R.id.content_note_owner_profile_pic);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("MODULE_NAME_ARGUMENT", "");
        ArrayList A022 = 2Yc.A02(requireArguments, User.class, "LIKERS_LIST_ARGUMENT");
        if (A022 != null) {
            list = 00k.A0a(A022);
        } else {
            list = 0sn.A00;
        }
        ImageUrl imageUrl = (ImageUrl) this.A04.getValue();
        if (imageUrl != null) {
            A0b.setUrl(imageUrl, this);
        }
        TextView A0R = AnonymousClass7TG.A0R(view2, R.id.title);
        String string2 = requireArguments.getString("TEXT_ARGUMENT");
        if (string2 != null) {
            DbT.A1H(A0R);
            FragmentActivity requireActivity = requireActivity();
            UserSession A0l = AnonymousClass7TE.A0l(this.A0D);
            0qQ.A0A(string);
            String A0t = DbS.A0t(this.A05);
            String A0t2 = DbS.A0t(this.A0B);
            String A0t3 = DbS.A0t(this.A09);
            0qQ.A0B(A0t3, 0);
            A0R.setText(C66889MeU.A02(requireActivity, (C70802Vt) null, A0l, (Integer) this.A03.getValue(), AnonymousClass7TE.A10(A0t3), string2, string, A0t, A0t2, DbS.A0t(this.A02)));
        }
        TextView A0R2 = AnonymousClass7TG.A0R(view2, R.id.audience_text);
        AnonymousClass0eM r3 = this.A0D;
        r3.getValue();
        Resources A052 = DbV.A05(this);
        0qQ.A07(A052);
        NoteAudienceItem noteAudienceItem = (NoteAudienceItem) this.A00.getValue();
        boolean A1Y = DbW.A1Y(noteAudienceItem);
        String A0e = AnonymousClass7TF.A0e(A052, C69982NvM.A00(A052, noteAudienceItem), 2131954072);
        0qQ.A07(A0e);
        A0R2.setText(A0e);
        if (AnonymousClass7TE.A1b(list)) {
            ((C70799OLu) this.A0C.getValue()).A00((ViewStub) AnonymousClass7TF.A0G(view2, R.id.note_reactions_layout), requireActivity(), list, new C73669Phi(string, this, 23), A1Y);
        }
        View A0G = AnonymousClass7TF.A0G(view2, R.id.note_action_buttons);
        0qQ.A0A(string);
        07U r13 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH7(viewLifecycleOwner, r13, this, A0G, string, (AnonymousClass4D7) null, 8), AnonymousClass07a.A00(viewLifecycleOwner));
        UserSession A0l2 = AnonymousClass7TE.A0l(r3);
        String A0t4 = DbS.A0t(this.A09);
        String A0t5 = DbS.A0t(this.A05);
        String A0t6 = DbS.A0t(this.A02);
        Number number = (Number) this.A03.getValue();
        0qQ.A0B(A0l2, 0);
        AnonymousClass7TF.A1C(string, A1Y ? 1 : 0, A0t4);
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0l2), "instagram_media_note_replace_sheet_impression_client");
        Long A002 = GPJ.A00(A0l2, A0t4);
        if (A0e2.isSampled() && A002 != null) {
            A0e2.A9F("note_id", A002);
            DbS.A1O(A0e2, string);
            A0e2.AAJ("inventory_source", A0t5);
            A0e2.A9F(C273654mx.A00(66), DbZ.A0c(number));
            A0e2.AAJ(C273654mx.A00(608), A0t6);
            AnonymousClass7TH.A0V(A0e2);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public E1H() {
        0eO r3 = 0eO.A02;
        this.A04 = AnonymousClass0eN.A00(r3, new C51663FyP(this));
        this.A09 = AnonymousClass0eN.A00(r3, new C51803G2m((Object) this, "NOTE_ID_ARGUMENT", "NOTE_ID_ARGUMENT", 25));
        this.A07 = AnonymousClass0eN.A00(r3, new C51803G2m((Object) this, "MEDIA_ID_ARGUMENT", "MEDIA_ID_ARGUMENT", 26));
        this.A06 = AnonymousClass0eN.A00(r3, new C51664FyQ(this));
        this.A01 = AnonymousClass0eN.A00(r3, new C51803G2m((Object) this, "AUDIENCE_ARGUMENT", "AUDIENCE_ARGUMENT", 27));
        this.A00 = AnonymousClass1YB.A00(new MMC(this, 21));
        this.A0B = AnonymousClass0eN.A00(r3, new C51665FyR(this));
        this.A08 = AnonymousClass0eN.A00(r3, new C51666FyS(this));
        this.A02 = AnonymousClass0eN.A00(r3, new C51667FyT(this));
        this.A03 = AnonymousClass0eN.A00(r3, new C51668FyU(this));
        this.A05 = AnonymousClass0eN.A00(r3, new C51669FyV(this));
        this.A0A = AnonymousClass0eN.A00(r3, new C51670FyW(this));
        MMC mmc = new MMC(this, 26);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new MMC(new MMC(this, 23), 24));
        this.A0E = DbS.A0I(new MMC(A002, 25), mmc, new GNG(32, (Object) null, A002), DbS.A0z(C53020GhB.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1851533465);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.content_notes_delete_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(-1507167157, A022);
        return inflate;
    }
}
