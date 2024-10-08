package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class E26 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BirthdayEffectsSettingsFragment";
    public Bitmap A00;
    public Uri A01;
    public 2dZ A02;
    public C2355930l A03;
    public CircularImageView A04;
    public CircularImageView A05;
    public IgdsBottomButtonLayout A06;
    public C46819Dlv A07;
    public F27 A08;
    public C3726091o A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public RecyclerView A0E;
    public IgSimpleImageView A0F;
    public IgSimpleImageView A0G;
    public CircularImageView A0H;
    public CircularImageView A0I;
    public CircularImageView A0J;
    public CircularImageView A0K;
    public Dc2 A0L;
    public AnonymousClass6ST A0M;
    public final AnonymousClass0eM A0N = C227642jf.A02(this);
    public final AnonymousClass0eM A0O;

    public final String getModuleName() {
        return "birthday_effects_visibility_fragment";
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass2ZP r1;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Activity rootActivity = getRootActivity();
        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
            r1.Enj(8);
        }
        2dZ A012 = 2dY.A01(new FP9((Object) this, 51), DbX.A0I(requireView(), R.id.birthday_effects_settings_action_bar));
        this.A02 = A012;
        A012.A0X(new FTS(this, 5));
        DbV.A1F(getViewLifecycleOwner(), ((C46749Dkc) this.A0O.getValue()).A01, new C20705Wxc(this, 22), 44);
        CircularImageView circularImageView = this.A04;
        String str = "profilePicImageView";
        if (circularImageView != null) {
            DbU.A1S(this, circularImageView, DbX.A0l(AnonymousClass0t1.A01, this.A0N));
            A06(this, true);
            ? r2 = this.A04;
            if (r2 != 0) {
                AnonymousClass0fU.A00(new FP9((Object) this, 49), r2);
                ? r22 = this.A05;
                if (r22 == 0) {
                    str = "selfieCameraImageView";
                } else {
                    AnonymousClass0fU.A00(new FP9((Object) this, 50), r22);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A06;
                    str = "bottomButtonsView";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setPrimaryActionOnClickListener(new FP9((Object) this, 47));
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A06;
                        if (igdsBottomButtonLayout2 != null) {
                            igdsBottomButtonLayout2.setSecondaryActionOnClickListener(new FP9((Object) this, 48));
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(E26 e26) {
        Dc2 dc2 = e26.A0L;
        if (dc2 != null) {
            DbX.A1R(dc2);
            e26.A0L = null;
        }
    }

    public static final void A02(E26 e26) {
        AnonymousClass6ST r0 = e26.A0M;
        if (r0 != null) {
            r0.dismiss();
        }
        e26.A0M = null;
    }

    public static final void A04(E26 e26, String str, int i) {
        0lg A0X = DbT.A0X(e26.A0N);
        Integer valueOf = Integer.valueOf(i);
        0qQ.A0B(A0X, 0);
        1NY A052 = Dbc.A05(A0X);
        if (valueOf != null) {
            A052.A0C("visibility_status", valueOf.intValue());
        }
        A052.A9m(C273654mx.A00(2305), "true");
        if (str != null) {
            A052.A9m("birthday_selfie_upload_id", str);
        }
        1OC A0T = DbT.A0T(A052, "surface", "qp");
        0qQ.A0C(A0T, C273654mx.A00(351));
        A0T.A00 = new B5C(e26, str, i, 1);
        e26.schedule(A0T);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v12, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v14, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.E26 r7, boolean r8) {
        /*
            java.lang.String r6 = "selfieCameraImageViewOverlay"
            java.lang.String r5 = "selfieImageviewSelectCheckMark"
            java.lang.String r4 = "profilePicImageViewOverlay"
            java.lang.String r3 = "profilePicImageviewSelectCheckMark"
            r2 = 8
            r1 = 0
            com.instagram.common.ui.base.IgSimpleImageView r0 = r7.A0F
            if (r8 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x007b
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0I
            if (r0 == 0) goto L_0x0077
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0H
            if (r0 == 0) goto L_0x0022
            r0.setVisibility(r1)
        L_0x0022:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r7.A0G
            if (r0 == 0) goto L_0x0073
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0J
            if (r0 == 0) goto L_0x007f
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0K
            if (r0 == 0) goto L_0x0037
            r0.setVisibility(r2)
        L_0x0037:
            r7.A0D = r1
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0H
        L_0x003b:
            if (r0 == 0) goto L_0x0044
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            X.C240943Ng.A01(r0)
        L_0x0044:
            return
        L_0x0045:
            if (r0 == 0) goto L_0x007b
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0I
            if (r0 == 0) goto L_0x0077
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0H
            if (r0 == 0) goto L_0x0058
            r0.setVisibility(r2)
        L_0x0058:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r7.A0G
            if (r0 == 0) goto L_0x0073
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0J
            if (r0 == 0) goto L_0x007f
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0K
            if (r0 == 0) goto L_0x006d
            r0.setVisibility(r1)
        L_0x006d:
            r0 = 1
            r7.A0D = r0
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0K
            goto L_0x003b
        L_0x0073:
            X.0qQ.A0F(r5)
            goto L_0x0082
        L_0x0077:
            X.0qQ.A0F(r4)
            goto L_0x0082
        L_0x007b:
            X.0qQ.A0F(r3)
            goto L_0x0082
        L_0x007f:
            X.0qQ.A0F(r6)
        L_0x0082:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E26.A06(X.E26, boolean):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0N);
    }

    public E26() {
        C46573DhF dhF = new C46573DhF(this, 12);
        AnonymousClass0eM A002 = C46573DhF.A00(new C46573DhF(this, 9), 0eO.A02, 10);
        this.A0O = DbS.A0I(new C46573DhF(A002, 11), dhF, new C58691Iw0(49, (Object) null, A002), DbS.A0z(C46749Dkc.class));
    }

    public static final void A00(E26 e26) {
        A03(e26);
        1NY A0M2 = DbZ.A0M(DbT.A0X(e26.A0N));
        A0M2.A02();
        A0M2.A0A("api/v1/users/get_birthday_visibility_setting/");
        1OC A0S = DbU.A0S(A0M2, C47295DuO.class, F47.class);
        0qQ.A0C(A0S, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayVisibilitySettingResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayVisibilitySettingResponse>>");
        C47696EDf.A00(e26, A0S, 32);
    }

    public static final void A03(E26 e26) {
        AnonymousClass6ST A0h = DbV.A0h(e26.requireContext());
        DbU.A1L(e26, A0h, 2131965491);
        A0h.setCancelable(false);
        AnonymousClass0fN.A00(A0h);
        e26.A0M = A0h;
    }

    public static final void A05(E26 e26, C62320sa r5) {
        Context context = e26.getContext();
        if (context != null) {
            A01(e26);
            C72738PHs pHs = new C72738PHs(r5, 2);
            C310336ap A0X = DbV.A0X();
            int i = 2131968398;
            if (C61970qY.A0F(context)) {
                i = 2131974093;
            }
            DbS.A1E(e26, A0X, i);
            A0X.A01 = -1;
            A0X.A0G = DbU.A0m(e26, 2131972371);
            A0X.A0L = true;
            FdH.A00(A0X, pHs, 8);
            Dc2 A002 = A0X.A00();
            DbX.A1S(A002);
            e26.A0L = A002;
        }
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == 7766) {
            if (i2 != -1) {
                z = !this.A0D;
            } else if (intent != null && intent.getData() != null) {
                C3726091o r2 = this.A09;
                ContentResolver contentResolver = null;
                if (r2 == null) {
                    str = "birthdayLogger";
                } else {
                    AnonymousClass0eM r0 = this.A0N;
                    long A082 = Dbb.A08(r0);
                    long A083 = Dbb.A08(r0);
                    if (this.A00 == null || !this.A0C) {
                        str2 = "take";
                    } else {
                        str2 = "retake";
                    }
                    r2.A02("qp", "birthday_selfie_camera", str2, A082, A083);
                    Context context = getContext();
                    if (context != null) {
                        contentResolver = context.getContentResolver();
                    }
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, intent.getData());
                    this.A00 = bitmap;
                    ? r02 = this.A05;
                    if (r02 == 0) {
                        str = "selfieCameraImageView";
                    } else if (bitmap == null) {
                        str = "birthdaySelfieBitmap";
                    } else {
                        r02.setImageBitmap(bitmap);
                        this.A0C = true;
                        z = false;
                    }
                }
            } else {
                return;
            }
            A06(this, z);
            return;
        } else if (i == 2002) {
            List list = this.A0A;
            str = "audiences";
            if (list != null) {
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((F00) it.next()).A03 == EWN.CLOSE_FRIENDS) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                List list2 = this.A0A;
                if (list2 != null) {
                    F00 f00 = (F00) list2.get(i3);
                    F27 f27 = this.A08;
                    if (f27 == null) {
                        str = "settingsUtils";
                    } else {
                        f00.A00 = f27.A00();
                        C46819Dlv dlv = this.A07;
                        if (dlv == null) {
                            str = "audienceAdapter";
                        } else {
                            dlv.notifyItemChanged(i3);
                            return;
                        }
                    }
                }
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.E26] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2067516711);
        E26.super.onCreate(bundle);
        AnonymousClass0eM r0 = this.A0N;
        this.A09 = new C3726091o(this, AnonymousClass7TE.A0l(r0));
        AnonymousClass00O.A00(requireActivity().getOnBackPressedDispatcher(), this, new C20705Wxc(this, 23));
        F27 f27 = new F27(this, AnonymousClass7TE.A0l(r0));
        this.A08 = f27;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Fragment fragment = f27.A00;
        Drawable drawable = fragment.requireContext().getDrawable(R.drawable.instagram_users_outline_96);
        if (drawable != null) {
            DbU.A10(fragment.requireContext(), drawable, 2Yu.A0B(fragment.requireContext()));
        }
        A1C.add(new F00(drawable, EWN.RECIPROCAL_FOLLOWS, AnonymousClass7TF.A0d(DbV.A05(fragment), 2131953800), (String) null, true));
        A1C.add(new F00(C346697vb.A00(fragment.requireContext()), EWN.CLOSE_FRIENDS, AnonymousClass7TF.A0d(DbV.A05(fragment), 2131953798), f27.A00(), false));
        List A0a = 00k.A0a(A1C);
        this.A0A = A0a;
        this.A07 = new C46819Dlv(this, A0a);
        this.A03 = new C2355930l(requireActivity(), AnonymousClass7TE.A0l(r0));
        A00(this);
        AnonymousClass0fD.A09(2058990963, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(878406718);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.birthday_effects_settings_fragment, viewGroup, false);
        this.A04 = (CircularImageView) inflate.findViewById(R.id.birthday_effects_profile_pic_imageview);
        this.A05 = (CircularImageView) inflate.findViewById(R.id.birthday_effects_take_selfie_imageview);
        CircularImageView circularImageView = (CircularImageView) inflate.findViewById(R.id.profile_birthday_confetti_circular_imageview);
        this.A0H = circularImageView;
        if (circularImageView != null) {
            C240943Ng.A00(requireContext(), circularImageView);
        }
        CircularImageView circularImageView2 = (CircularImageView) inflate.findViewById(R.id.selfie_birthday_confetti_circular_imageview);
        this.A0K = circularImageView2;
        if (circularImageView2 != null) {
            C240943Ng.A00(requireContext(), circularImageView2);
        }
        this.A0F = (IgSimpleImageView) inflate.findViewById(R.id.birthday_effects_profile_pic_imageview_select_check_mark);
        this.A0G = (IgSimpleImageView) inflate.findViewById(R.id.birthday_effects_take_selfie_imageview_select_check_mark);
        this.A0I = (CircularImageView) inflate.findViewById(R.id.birthday_effects_profile_pic_imageview_overlay);
        this.A0J = (CircularImageView) inflate.findViewById(R.id.birthday_effects_take_selfie_imageview_overlay);
        RecyclerView A0F2 = DbZ.A0F(inflate, R.id.birthday_effects_audience_recycler_view);
        this.A0E = A0F2;
        if (A0F2 != null) {
            C46819Dlv dlv = this.A07;
            if (dlv == null) {
                0qQ.A0F("audienceAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            A0F2.setAdapter(dlv);
        }
        RecyclerView recyclerView = this.A0E;
        if (recyclerView != null) {
            DbY.A15(this, recyclerView);
        }
        this.A06 = (IgdsBottomButtonLayout) inflate.findViewById(R.id.birthday_effects_settings_bottom_buttons);
        AnonymousClass0fD.A09(-572476435, A022);
        return inflate;
    }

    public final void onDestroyView() {
        AnonymousClass2ZP r1;
        int A022 = AnonymousClass0fD.A02(1499844088);
        super.onDestroyView();
        this.A0E = null;
        this.A0H = null;
        this.A0K = null;
        A02(this);
        A01(this);
        Activity rootActivity = getRootActivity();
        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
            r1.Enj(0);
        }
        AnonymousClass0fD.A09(-1149845300, A022);
    }
}
