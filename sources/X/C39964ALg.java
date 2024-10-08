package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.User;

/* renamed from: X.ALg  reason: case insensitive filesystem */
public final class C39964ALg implements TextWatcher, View.OnFocusChangeListener, C358538b4, C252213ok, AnonymousClass87E {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public RecyclerView A05;
    public 0ng A06;
    public C317876nz A07;
    public SearchEditText A08;
    public User A09;
    public Integer A0A;
    public C61076JwE[] A0B = new C61076JwE[3];
    public int A0C;
    public final Context A0D;
    public final View.OnTouchListener A0E;
    public final View A0F;
    public final View A0G;
    public final ViewStub A0H;
    public final AnonymousClass07i A0I;
    public final AnonymousClass0iw A0J;
    public final UserSession A0K;
    public final C358548b5 A0L;
    public final AnonymousClass80U A0M;
    public final AnonymousClass8ME A0N;
    public final C337257fy A0O;
    public final int A0P;
    public final int A0Q;
    public final AnonymousClass3E6 A0R;

    public C39964ALg(View view, AnonymousClass07i r6, AnonymousClass0iw r7, UserSession userSession, AnonymousClass3E6 r9, AnonymousClass80U r10, AnonymousClass8ME r11, C337257fy r12, int i) {
        this.A0M = r10;
        this.A0D = AnonymousClass7TE.A0S(view);
        this.A0K = userSession;
        this.A0J = r7;
        this.A0I = r6;
        this.A0N = r11;
        this.A0G = AnonymousClass7TF.A0G(view, R.id.text_overlay_edit_text_container);
        this.A0H = (ViewStub) AnonymousClass7TF.A0F(view, R.id.share_professional_profile_sticker_editor_stub);
        C358548b5 r1 = new C358548b5(r7, userSession, this, r12);
        this.A0L = r1;
        this.A0R = r9;
        this.A0O = r12;
        this.A0F = AnonymousClass7TF.A0G(view, R.id.done_button);
        r1.setHasStableIds(true);
        this.A0E = new AP3(this, 4);
        Resources resources = view.getResources();
        this.A0P = AnonymousClass7TE.A0I(resources);
        this.A0Q = i - (resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material) * 4);
        this.A0A = ProfileStickerModel.A08;
    }

    public final /* synthetic */ void DIL() {
    }

    public final /* synthetic */ void DIN(C387339m3 r1) {
    }

    public final /* synthetic */ void DLf() {
    }

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        if (editable.length() > 0) {
            this.A0L.A02(editable);
        } else {
            this.A0L.A01();
        }
        SearchEditText searchEditText = this.A08;
        if (searchEditText != null) {
            AnonymousClass91M.A06(searchEditText, this.A0P, this.A0Q);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onFocusChange(View view, boolean z) {
        0qQ.A0B(view, 0);
        AnonymousClass3E6 r0 = this.A0R;
        if (z) {
            r0.A9Y(this);
            0nA.A0R(view);
            return;
        }
        r0.EEH(this);
        0nA.A0N(view);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final ProfileStickerModel A00(C39964ALg aLg) {
        C317876nz r2 = aLg.A07;
        if (r2 != null) {
            ProfileStickerModel profileStickerModel = new ProfileStickerModel(r2, (ProfileStickerAiAgentData) null, aLg.A09, aLg.A0A, AnonymousClass05K.A00);
            profileStickerModel.A00 = aLg.A0B;
            return profileStickerModel;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(C39964ALg aLg, User user) {
        aLg.A09 = user;
        C228602lw r3 = new C228602lw(aLg.A0D, aLg.A0I, (Integer) null);
        1NY A0b = AnonymousClass7TG.A0b(aLg.A0K);
        A0b.A9m(AnonymousClass000.A00(3285), user.getId());
        A0b.A0A(AnonymousClass000.A00(2739));
        A0b.A0Q(1XO.class, 1XW.class);
        1OC A0M2 = A0b.A0M();
        A0M2.A00 = new C385459iy(2, user, aLg);
        r3.schedule(A0M2);
    }

    public final void DMr(int i, boolean z) {
        if (this.A0C > i) {
            SearchEditText searchEditText = this.A08;
            if (searchEditText != null) {
                searchEditText.clearFocus();
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        this.A0C = i;
        View view = this.A01;
        if (view != null) {
            if (!z) {
                i = 0;
            }
            0nA.A0X(view, i);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void DRH(User user, int i) {
        A01(this, user);
    }

    public final void Dir(SearchEditText searchEditText, int i, int i2) {
        AnonymousClass7TH.A0S(searchEditText, i, i2);
    }
}
