package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView;
import java.util.ArrayList;

public final class H25 extends C273374mT implements AnonymousClass4DU, AnonymousClass0j6, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreateCollectionFromSelectedFragment";
    public int A00;
    public EditText A01;
    public UserSession A02;
    public IgdsListCell A03;
    public HMU A04;
    public String A05;
    public ArrayList A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public View A09;
    public RoundedCornerCheckMarkSelectableImageView A0A;
    public final TextWatcher A0B = new C56722I9i(this, 3);
    public final View.OnClickListener A0C = C56802ICz.A00(this, 34);

    public final String getModuleName() {
        return "collection_create";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    private void A00(1Xj r3) {
        if (r3 == null) {
            this.A05 = null;
            this.A0A.A02();
            return;
        }
        this.A05 = r3.getId();
        RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = this.A0A;
        ImageUrl A1Q = r3.A1Q();
        A1Q.getClass();
        roundedCornerCheckMarkSelectableImageView.setUrl(A1Q, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (android.text.TextUtils.isEmpty(X.AnonymousClass7TF.A0f(r0).trim()) != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.H25 r3) {
        /*
            android.widget.EditText r0 = r3.A01
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r0 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            android.view.View r0 = r3.A09
            r0.getClass()
            r0.setEnabled(r2)
            android.view.View r1 = r3.A09
            float r0 = X.C51970G9q.A00(r2)
            r1.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H25.A01(X.H25):void");
    }

    public static void A02(H25 h25) {
        IgdsListCell igdsListCell;
        Context requireContext;
        int i;
        if (h25.A03 != null) {
            if (DbT.A0j(h25.A02).A0N() != AnonymousClass05K.A01 || !h25.A07) {
                boolean z = h25.A07;
                IgdsListCell igdsListCell2 = h25.A03;
                Context requireContext2 = h25.requireContext();
                if (z) {
                    igdsListCell2.A0H(requireContext2.getString(2131972618));
                    igdsListCell = h25.A03;
                    requireContext = h25.requireContext();
                    i = R.drawable.instagram_users_pano_outline_24;
                } else {
                    igdsListCell2.A0H(requireContext2.getString(2131972624));
                    igdsListCell = h25.A03;
                    requireContext = h25.requireContext();
                    i = R.drawable.instagram_lock_pano_outline_24;
                }
            } else {
                h25.A03.A0H(h25.requireContext().getString(2131972629));
                igdsListCell = h25.A03;
                requireContext = h25.requireContext();
                i = R.drawable.instagram_globe_pano_outline_24;
            }
            igdsListCell.A09(requireContext.getDrawable(i));
        }
    }

    public final 0jB E4x() {
        0jB A0k = C51965G9l.A0k();
        A0k.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, getSession().A06);
        return A0k;
    }

    public final void configureActionBar(2da r4) {
        if (isAdded()) {
            r4.Eu4(true);
            int i = 2131972539;
            if (this.A04 == HMU.A04) {
                i = 2131972540;
            }
            r4.Eom(i);
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A0K = getString(2131952258);
            A0K.A0G = C56802ICz.A00(this, 35);
            this.A09 = C51970G9q.A0P(A0K, r4);
            A01(this);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1042 && i2 == -1) {
            1E8 A002 = 1E7.A00(getSession());
            intent.getClass();
            A00(A002.A02(intent.getStringExtra("cover_media_id")));
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1624894954);
        H25.super.onCreate(bundle);
        this.A00 = requireArguments().getInt("ARGUMENT_NUM_MEDIA_COLLECTIONS");
        UserSession A0U = DbX.A0U(this);
        this.A02 = A0U;
        this.A08 = I31.A01(A0U);
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList("SaveFragment.ARGUMENT_SAVED_ITEM_IDS");
        if (stringArrayList == null) {
            stringArrayList = AnonymousClass7TE.A1C();
        }
        this.A06 = stringArrayList;
        this.A04 = (HMU) HMU.A01.get(requireArguments().getString("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION_SUBTYPE"));
        AnonymousClass0fD.A09(914073460, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int i;
        int A022 = AnonymousClass0fD.A02(-1131755595);
        if (this.A08) {
            inflate = layoutInflater.inflate(R.layout.create_collection_from_selected_public, viewGroup, false);
            i = -677120227;
        } else {
            inflate = layoutInflater.inflate(R.layout.create_collection_from_selected, viewGroup, false);
            i = 898170972;
        }
        AnonymousClass0fD.A09(i, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1681081790);
        super.onDestroyView();
        this.A09 = null;
        this.A0A = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-46819289, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1732546269);
        H25.super.onPause();
        DbS.A1D(this);
        Window window = requireActivity().getWindow();
        window.getClass();
        window.setSoftInputMode(0);
        AnonymousClass0fD.A09(-1378293522, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-761123476);
        super.onResume();
        this.A01.requestFocus();
        Window window = requireActivity().getWindow();
        window.getClass();
        window.setSoftInputMode(32);
        if (!this.A08) {
            0nA.A0M(this.A01);
        }
        AnonymousClass0fD.A09(801877921, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.A08) {
            this.A03 = (IgdsListCell) view.requireViewById(R.id.change_audience);
            DbS.A1D(this);
            IgdsListCell igdsListCell = this.A03;
            if (igdsListCell != null) {
                igdsListCell.A0G(C69349Njo.TYPE_CHEVRON, true);
                this.A03.A0I(requireContext().getString(2131972600));
                A02(this);
                this.A03.A0C(C56802ICz.A00(this, 36));
            }
        }
        EditText editText = (EditText) view.requireViewById(R.id.saved_collection_name);
        this.A01 = editText;
        int i = 2131972538;
        if (this.A04 == HMU.A04) {
            i = 2131972546;
        }
        editText.setHint(i);
        this.A01.addTextChangedListener(this.A0B);
        this.A01.setEnabled(true);
        this.A01.requestFocus();
        View requireViewById = view.requireViewById(R.id.edit_cover_text);
        View.OnClickListener onClickListener = this.A0C;
        AnonymousClass0fU.A00(onClickListener, requireViewById);
        RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = (RoundedCornerCheckMarkSelectableImageView) view.requireViewById(R.id.collection_image);
        this.A0A = roundedCornerCheckMarkSelectableImageView;
        AnonymousClass0fU.A00(onClickListener, roundedCornerCheckMarkSelectableImageView);
        requireViewById.setEnabled(DbT.A1b(this.A06));
        if (this.A06.isEmpty()) {
            this.A0A.A02();
        } else {
            A00(1E7.A00(getSession()).A02((String) this.A06.get(0)));
        }
    }
}
