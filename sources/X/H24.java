package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class H24 extends C273374mT implements AnonymousClass4DU, AnonymousClass0j6, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreateCollectionFragment";
    public int A00;
    public View A01;
    public View A02;
    public EditText A03;
    public UserSession A04;
    public IgdsListCell A05;
    public boolean A06;
    public boolean A07;
    public final TextWatcher A08 = new C56722I9i(this, 2);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        ? obj = new Object();
        obj.A02 = DbV.A05(this).getString(2131972539);
        obj.A01 = C56802ICz.A00(this, 32);
        this.A02 = r4.ErM(new C59904JbT(obj));
    }

    public final String getModuleName() {
        return "collection_create";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (EditText) view.requireViewById(R.id.saved_collection_name);
        this.A01 = view.requireViewById(R.id.audience_selector);
        UserSession userSession = this.A04;
        if (userSession == null) {
            str = "userSession";
        } else {
            this.A07 = I31.A01(userSession);
            this.A05 = (IgdsListCell) view.requireViewById(R.id.change_audience);
            if (this.A07) {
                View view2 = this.A01;
                if (view2 == null) {
                    str = "audienceSelector";
                } else {
                    view2.setVisibility(0);
                    IgdsListCell igdsListCell = this.A05;
                    str = "changeAudienceForPublicCollection";
                    if (igdsListCell != null) {
                        igdsListCell.A0G(C69349Njo.TYPE_CHEVRON, true);
                        IgdsListCell igdsListCell2 = this.A05;
                        if (igdsListCell2 != null) {
                            igdsListCell2.A0I(AnonymousClass7TE.A16(requireContext(), 2131972600));
                            A01(this);
                            IgdsListCell igdsListCell3 = this.A05;
                            if (igdsListCell3 != null) {
                                igdsListCell3.A0C(C56802ICz.A00(this, 33));
                            }
                        }
                    }
                }
            }
            EditText editText = this.A03;
            if (editText != null) {
                editText.addTextChangedListener(this.A08);
            }
            EditText editText2 = this.A03;
            if (editText2 != null) {
                editText2.setEnabled(true);
            }
            EditText editText3 = this.A03;
            if (editText3 != null) {
                editText3.requestFocus();
                return;
            }
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(H24 h24) {
        String str;
        Context requireContext;
        int i;
        UserSession userSession = h24.A04;
        if (userSession == null) {
            str = "userSession";
        } else {
            str = "changeAudienceForPublicCollection";
            if (!AnonymousClass7TF.A1W(AnonymousClass7TF.A0Q(userSession).A0N(), AnonymousClass05K.A01) || !h24.A06) {
                boolean z = h24.A06;
                IgdsListCell igdsListCell = h24.A05;
                if (z) {
                    if (igdsListCell != null) {
                        igdsListCell.A0H(AnonymousClass7TE.A16(h24.requireContext(), 2131972618));
                        requireContext = h24.requireContext();
                        i = R.drawable.instagram_users_pano_outline_24;
                    }
                } else if (igdsListCell != null) {
                    igdsListCell.A0H(AnonymousClass7TE.A16(h24.requireContext(), 2131972624));
                    requireContext = h24.requireContext();
                    i = R.drawable.instagram_lock_pano_outline_24;
                }
            } else {
                IgdsListCell igdsListCell2 = h24.A05;
                if (igdsListCell2 != null) {
                    igdsListCell2.A0H(AnonymousClass7TE.A16(h24.requireContext(), 2131972629));
                    requireContext = h24.requireContext();
                    i = R.drawable.instagram_globe_pano_outline_24;
                }
            }
            Drawable drawable = requireContext.getDrawable(i);
            if (drawable != null) {
                IgdsListCell igdsListCell3 = h24.A05;
                if (igdsListCell3 != null) {
                    igdsListCell3.A09(drawable);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(H24 h24) {
        2dZ A002 = 2dY.A00(h24.getActivity());
        if (A002 != null) {
            A002.setIsLoading(false);
        }
        EditText editText = h24.A03;
        if (editText != null) {
            editText.setEnabled(true);
        }
        C59689JTv.A0C(h24.getContext(), "create_collection_failed");
    }

    public final 0jB E4x() {
        0jB A0k = C51965G9l.A0k();
        A0k.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, getSession().A06);
        return A0k;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1585587730);
        H24.super.onCreate(bundle);
        this.A00 = requireArguments().getInt("ARGUMENT_NUM_MEDIA_COLLECTIONS");
        this.A04 = DbX.A0U(this);
        AnonymousClass0fD.A09(-306290596, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-509078041);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.create_collection, viewGroup, false);
        AnonymousClass0fD.A09(-206742117, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1828887184);
        H24.super.onPause();
        DbS.A1D(this);
        AnonymousClass0fD.A09(-1337811374, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1488192947);
        super.onResume();
        EditText editText = this.A03;
        if (editText != null) {
            editText.requestFocus();
            0nA.A0M(editText);
        }
        AnonymousClass0fD.A09(1006247921, A022);
    }
}
