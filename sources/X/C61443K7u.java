package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;

/* renamed from: X.K7u  reason: case insensitive filesystem */
public final class C61443K7u extends C273374mT {
    public static final String __redex_internal_original_name = "LiveTitleEntryBottomSheetFragment";
    public EditText A00;
    public TextView A01;
    public AnonymousClass847 A02;
    public MS4 A03;
    public ArrayList A04 = AnonymousClass7TE.A1C();
    public boolean A05;
    public IgButton A06;
    public final 1wn A07 = C64698LgT.A00(this, 8);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgImageView A0b = DbX.A0b(view, R.id.avatar);
        0eE r1 = AnonymousClass0t1.A01;
        DbU.A1S(this, A0b, r1.A01(getSession()));
        A0b.setContentDescription(DbU.A0n(getSession(), r1));
        this.A00 = (EditText) view.requireViewById(R.id.input);
        IgButton igButton = (IgButton) view.requireViewById(R.id.button_submit);
        this.A06 = igButton;
        String str = "submitButton";
        if (this.A05) {
            if (igButton != null) {
                igButton.setText(2131963843);
                View A0C = JTS.A0C(view, R.id.branded_content_live_entrypoint);
                LY0.A00(A0C, 53, this);
                AnonymousClass7TG.A0R(A0C, R.id.title).setText(2131952278);
                this.A01 = DbU.A0G(A0C, R.id.sub_title);
                if (DbT.A1b(this.A04)) {
                    TextView textView = this.A01;
                    if (textView != null) {
                        textView.setText(((BrandedContentTag) this.A04.get(0)).A02);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                JVF.A02(this, getSession(), AnonymousClass05K.A0F, AnonymousClass05K.A04, AnonymousClass05K.A00);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        EditText editText = this.A00;
        if (editText == null) {
            str = "editText";
        } else {
            LWP.A00(editText, this, 4);
            IgButton igButton2 = this.A06;
            if (igButton2 != null) {
                LY0.A00(igButton2, 54, this);
                A03(this);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final String A00(C61443K7u k7u) {
        EditText editText = k7u.A00;
        if (editText != null) {
            if (editText.getEditableText() == null) {
                return "";
            }
            EditText editText2 = k7u.A00;
            if (editText2 != null) {
                return editText2.getEditableText().toString();
            }
        }
        0qQ.A0F("editText");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C61443K7u k7u) {
        MS4 ms4 = k7u.A03;
        if (ms4 != null) {
            ms4.DNq(A00(k7u), k7u.A04);
            EditText editText = k7u.A00;
            if (editText == null) {
                0qQ.A0F("editText");
                throw AnonymousClass00P.createAndThrow();
            }
            0nA.A0N(editText);
            AnonymousClass37D A022 = AnonymousClass37D.A00.A02(k7u.requireContext());
            if (A022 != null) {
                A022.A0B();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A03(C61443K7u k7u) {
        String A002;
        boolean z = false;
        if (k7u.A04.isEmpty() && ((A002 = A00(k7u)) == null || A002.length() == 0)) {
            z = true;
        }
        IgButton igButton = k7u.A06;
        if (igButton != null) {
            igButton.setEnabled(!z);
            IgButton igButton2 = k7u.A06;
            if (igButton2 != null) {
                float f = 1.0f;
                if (z) {
                    f = 0.5f;
                }
                igButton2.setAlpha(f);
                return;
            }
        }
        0qQ.A0F("submitButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "live_title_composer";
    }

    public static final void A02(C61443K7u k7u) {
        BrandedContentTag brandedContentTag;
        Bundle A0a = AnonymousClass7TE.A0a();
        if (DbT.A1b(k7u.A04)) {
            brandedContentTag = (BrandedContentTag) k7u.A04.get(0);
        } else {
            brandedContentTag = null;
        }
        A0a.putParcelable("BRANDED_CONTENT_TAG", brandedContentTag);
        A0a.putParcelableArrayList(C273654mx.A00(1201), k7u.A04);
        A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "live_composer_details");
        Dba.A0K(k7u.requireActivity(), A0a, k7u.getSession(), ModalActivity.class, C273654mx.A00(2987)).A0D(k7u, 75);
        JVF.A02(k7u, k7u.getSession(), AnonymousClass05K.A0H, AnonymousClass05K.A04, AnonymousClass05K.A00);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 75 && i2 == -1 && intent != null) {
            BrandedContentTag brandedContentTag = (BrandedContentTag) intent.getParcelableExtra("BRANDED_CONTENT_TAG");
            TextView textView = this.A01;
            if (textView != null) {
                if (brandedContentTag == null || (str = brandedContentTag.A02) == null) {
                    this.A04 = AnonymousClass7TE.A1C();
                    textView.setText(2131963975);
                } else {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    this.A04 = A1C;
                    A1C.add(brandedContentTag);
                    DbX.A1F(textView, this, str, 2131974137);
                }
                A03(this);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(526550670);
        C61443K7u.super.onCreate(bundle);
        setModuleNameV2("live_title_composer");
        this.A04 = AnonymousClass7TE.A1C();
        AnonymousClass1Nd.A00(getSession()).A01(this.A07, C64679Lg6.class);
        Activity rootActivity = getRootActivity();
        0qQ.A0A(rootActivity);
        this.A02 = new AnonymousClass847(rootActivity);
        AnonymousClass0fD.A09(629440809, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(29433226);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_iglive_title_entry, false);
        AnonymousClass0fD.A09(-1185602491, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(73844005);
        super.onDestroy();
        AnonymousClass1Nd.A00(getSession()).A02(this.A07, C64679Lg6.class);
        AnonymousClass0fD.A09(1960310882, A022);
    }
}
