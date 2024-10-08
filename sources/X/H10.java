package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView;
import com.instagram.user.model.User;

public final class H10 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass0j6, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditCollectionFragment";
    public EditText A00;
    public IgdsListCell A01;
    public SavedCollection A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public View.OnClickListener A08;
    public View A09;
    public View A0A;
    public 2dZ A0B;
    public ImageUrl A0C;
    public IgTextView A0D;
    public RoundedCornerCheckMarkSelectableImageView A0E;
    public boolean A0F;
    public final Handler A0G = new Handler();
    public final AnonymousClass0eM A0H = C227642jf.A02(this);
    public final TextWatcher A0I = new C56722I9i(this, 4);

    public static final void A01(H10 h10) {
        String str;
        h10.A06 = true;
        2dZ r0 = h10.A0B;
        if (r0 != null) {
            r0.setIsLoading(true);
            r0.Eu4(false);
        }
        EditText editText = h10.A00;
        if (editText == null) {
            str = "collectionName";
        } else {
            editText.setEnabled(false);
            IgTextView igTextView = h10.A0D;
            if (igTextView == null) {
                str = "deleteButton";
            } else {
                igTextView.setOnClickListener((View.OnClickListener) null);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbW.A1B(r4, 2131972544);
        ? obj = new Object();
        obj.A02 = DbV.A05(this).getString(2131972544);
        obj.A01 = C56802ICz.A00(this, 37);
        this.A0A = r4.ErM(new C59904JbT(obj));
        r4.setIsLoading(this.A06);
        A00(this);
    }

    public final String getModuleName() {
        return "collection_editor";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        SavedCollection savedCollection = this.A02;
        if (savedCollection == null) {
            0qQ.A0F("collection");
            throw AnonymousClass00P.createAndThrow();
        }
        bundle.putParcelable("collection_to_edit", savedCollection);
        bundle.putBoolean("collection_has_items", this.A0F);
        bundle.putParcelable("cover_media_url", this.A0C);
        bundle.putString("cover_media_id", this.A03);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.requireViewById(R.id.saved_collection_name);
        SavedCollection savedCollection = this.A02;
        String str = "collection";
        if (savedCollection != null) {
            editText.setText(savedCollection.A0G);
            editText.addTextChangedListener(this.A0I);
            this.A00 = editText;
            this.A08 = C56802ICz.A00(this, 40);
            IgTextView A0a = DbT.A0a(view, R.id.delete_collection_button);
            View.OnClickListener onClickListener = this.A08;
            if (onClickListener == null) {
                str = "deleteButtonOnClickListener";
            } else {
                AnonymousClass0fU.A00(onClickListener, A0a);
                A0a.setText(2131972541);
                this.A0D = A0a;
                DbU.A0G(view, R.id.delete_collection_confirmation).setText(2131972542);
                View A0G2 = AnonymousClass7TF.A0G(view, R.id.audience_selector);
                AnonymousClass0eM r2 = this.A0H;
                boolean A012 = I31.A01(AnonymousClass7TE.A0l(r2));
                this.A07 = A012;
                if (A012) {
                    View A0G3 = AnonymousClass7TF.A0G(view, R.id.saved_collection_name_title);
                    A0G3.setPadding(A0G3.getPaddingLeft(), A0G3.getPaddingTop(), A0G3.getPaddingRight(), 0);
                    SavedCollection savedCollection2 = this.A02;
                    if (savedCollection2 != null) {
                        this.A04 = savedCollection2.A06();
                        A0G2.setVisibility(0);
                        IgdsListCell igdsListCell = (IgdsListCell) view.requireViewById(R.id.change_audience);
                        this.A01 = igdsListCell;
                        if (igdsListCell != null) {
                            igdsListCell.A0G(C69349Njo.TYPE_CHEVRON, true);
                        }
                        IgdsListCell igdsListCell2 = this.A01;
                        if (igdsListCell2 != null) {
                            igdsListCell2.A0I(AnonymousClass7TE.A16(requireContext(), 2131972600));
                        }
                        A03(this);
                        SavedCollection savedCollection3 = this.A02;
                        if (savedCollection3 != null) {
                            boolean A1V = AnonymousClass7TF.A1V(savedCollection3.A05);
                            IgdsListCell igdsListCell3 = this.A01;
                            if (A1V) {
                                if (igdsListCell3 != null) {
                                    igdsListCell3.setAlpha(0.5f);
                                }
                                igdsListCell3 = this.A01;
                                if (igdsListCell3 != null) {
                                    i = 38;
                                }
                            } else if (igdsListCell3 != null) {
                                i = 39;
                            }
                            igdsListCell3.A0C(C56802ICz.A00(this, i));
                        }
                    }
                }
                if (this.A0F) {
                    View A0F2 = DbY.A0F(view, R.id.change_cover_photo_stub);
                    C56802ICz.A01(A0F2, 41, this);
                    this.A09 = A0F2;
                    if (A0F2 != null) {
                        RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = (RoundedCornerCheckMarkSelectableImageView) A0F2.requireViewById(R.id.collection_image);
                        ImageUrl imageUrl = this.A0C;
                        if (imageUrl != null) {
                            roundedCornerCheckMarkSelectableImageView.setUrl(imageUrl, this);
                        }
                        this.A0E = roundedCornerCheckMarkSelectableImageView;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                SavedCollection savedCollection4 = this.A02;
                if (savedCollection4 != null) {
                    User user = savedCollection4.A08;
                    if (user != null) {
                        0qQ.A0K(user.getId(), DbU.A0u(r2));
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(H10 h10) {
        View view = h10.A0A;
        if (view != null) {
            EditText editText = h10.A00;
            if (editText == null) {
                0qQ.A0F("collectionName");
                throw AnonymousClass00P.createAndThrow();
            }
            Editable text = editText.getText();
            0qQ.A07(text);
            view.setEnabled(C51966G9m.A1X(text));
        }
    }

    public static final void A03(H10 h10) {
        Context requireContext;
        int i;
        IgdsListCell igdsListCell;
        if (DbX.A0l(AnonymousClass0t1.A01, h10.A0H).A0N() != AnonymousClass05K.A01 || !h10.A04) {
            boolean z = h10.A04;
            IgdsListCell igdsListCell2 = h10.A01;
            if (z) {
                if (igdsListCell2 != null) {
                    igdsListCell2.A0H(AnonymousClass7TE.A16(h10.requireContext(), 2131972618));
                }
                requireContext = h10.requireContext();
                i = R.drawable.instagram_users_pano_outline_24;
            } else {
                if (igdsListCell2 != null) {
                    igdsListCell2.A0H(AnonymousClass7TE.A16(h10.requireContext(), 2131972624));
                }
                requireContext = h10.requireContext();
                i = R.drawable.instagram_lock_pano_outline_24;
            }
        } else {
            IgdsListCell igdsListCell3 = h10.A01;
            if (igdsListCell3 != null) {
                igdsListCell3.A0H(AnonymousClass7TE.A16(h10.requireContext(), 2131972629));
            }
            requireContext = h10.requireContext();
            i = R.drawable.instagram_globe_pano_outline_24;
        }
        Drawable drawable = requireContext.getDrawable(i);
        if (drawable != null && (igdsListCell = h10.A01) != null) {
            igdsListCell.A09(drawable);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0H);
    }

    public final boolean onBackPressed() {
        return this.A06;
    }

    public static final void A02(H10 h10) {
        String str;
        Context context = h10.getContext();
        if (context != null) {
            C49952FGh.A06(context, h10.getString(2131975944), h10.getString(2131961740));
        }
        2dZ r2 = h10.A0B;
        if (r2 != null) {
            r2.setIsLoading(false);
            r2.Eu4(true);
        }
        EditText editText = h10.A00;
        if (editText == null) {
            str = "collectionName";
        } else {
            editText.setEnabled(true);
            IgTextView igTextView = h10.A0D;
            if (igTextView == null) {
                str = "deleteButton";
            } else {
                View.OnClickListener onClickListener = h10.A08;
                if (onClickListener == null) {
                    str = "deleteButtonOnClickListener";
                } else {
                    AnonymousClass0fU.A00(onClickListener, igTextView);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4x() {
        0jB A0k = C51965G9l.A0k();
        A0k.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, DbU.A0u(this.A0H));
        return A0k;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1042) {
            if (intent != null) {
                str = intent.getStringExtra("cover_media_id");
            } else {
                str = null;
            }
            this.A03 = str;
            if (intent != null) {
                ImageUrl imageUrl = (ImageUrl) intent.getParcelableExtra("cover_media_url");
                if (imageUrl != null) {
                    this.A0C = imageUrl;
                    RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = this.A0E;
                    if (roundedCornerCheckMarkSelectableImageView != null) {
                        roundedCornerCheckMarkSelectableImageView.setUrl(imageUrl, this);
                    }
                }
                if (intent.getBooleanExtra("cover_media_is_private", false) && this.A04 && I31.A01(AnonymousClass7TE.A0l(this.A0H))) {
                    C310336ap A0X = DbV.A0X();
                    A0X.A0D = getString(2131970950);
                    A0X.A0I = getString(2131970949);
                    Dbb.A1Q(A0X);
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        ExtendedImageUrl extendedImageUrl;
        int A022 = AnonymousClass0fD.A02(558307275);
        H10.super.onCreate(bundle);
        boolean z = true;
        if (bundle == null || !bundle.containsKey("collection_to_edit")) {
            z = false;
        }
        if (z) {
            Parcelable parcelable = bundle.getParcelable("collection_to_edit");
            if (parcelable != null) {
                this.A02 = (SavedCollection) parcelable;
                this.A0F = bundle.getBoolean("collection_has_items");
                this.A0C = (ImageUrl) bundle.getParcelable("cover_media_url");
                this.A03 = bundle.getString("cover_media_id");
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 423912342;
                AnonymousClass0fD.A09(i, A022);
                throw illegalStateException;
            }
        } else {
            Parcelable parcelable2 = requireArguments().getParcelable("collection_to_edit");
            if (parcelable2 != null) {
                this.A02 = (SavedCollection) parcelable2;
                this.A0F = requireArguments().getBoolean("collection_has_items");
                SavedCollection savedCollection = this.A02;
                if (savedCollection == null) {
                    0qQ.A0F("collection");
                    throw AnonymousClass00P.createAndThrow();
                }
                Context requireContext = requireContext();
                1Xj r0 = savedCollection.A04;
                if (r0 != null) {
                    extendedImageUrl = r0.A1n(requireContext);
                } else {
                    extendedImageUrl = null;
                }
                this.A0C = extendedImageUrl;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 400495648;
                AnonymousClass0fD.A09(i, A022);
                throw illegalStateException;
            }
        }
        AnonymousClass0fD.A09(-1801287594, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1215711900);
        0qQ.A0B(layoutInflater, 0);
        this.A0B = 2dZ.A0t.A03(getActivity());
        View inflate = layoutInflater.inflate(R.layout.edit_collection, viewGroup, false);
        AnonymousClass0fD.A09(1487452715, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(985225486);
        H10.super.onPause();
        DbS.A1D(this);
        AnonymousClass0fD.A09(642066362, A022);
    }
}
