package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.actionbar.ActionButton;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.android.R;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import com.instagram.user.model.User;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Dib  reason: case insensitive filesystem */
public final class C46656Dib extends AnonymousClass4DH implements G8A, AnonymousClass36P, AnonymousClass4DS, C267674c0, CallerContextable {
    public static final AnonymousClass36X A1a = AnonymousClass36X.IG_EDIT_PROFILE;
    public static final String __redex_internal_original_name = "EditProfileFragment";
    public Uri A00 = null;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewStub A05;
    public ViewStub A06;
    public ViewStub A07;
    public ViewStub A08;
    public ViewStub A09;
    public ViewStub A0A;
    public ViewStub A0B;
    public ListView A0C;
    public ScrollView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public ActionButton A0N;
    public AnonymousClass36O A0O;
    public AnonymousClass2kB A0P;
    public C321266tq A0Q;
    public AvatarCoinFlipConfig A0R;
    public ProfileCoinFlipView A0S;
    public C49935FFo A0T;
    public C46478Dfh A0U = null;
    public UserSession A0V;
    public TitleTextView A0W;
    public CircularImageView A0X;
    public IgImageView A0Y;
    public C71662eb A0Z;
    public C252063oV A0a;
    public C252063oV A0b;
    public AnonymousClass36V A0c;
    public AnonymousClass5Gv A0d;
    public F1D A0e;
    public JVM A0f = null;
    public C46765Dks A0g;
    public DdZ A0h;
    public C47582E8u A0i;
    public EditProfileFieldsController A0j;
    public C49504Ewj A0k;
    public C318956po A0l;
    public C322326ve A0m;
    public C231002qi A0n;
    public C230882qT A0o;
    public ImageWithTitleTextView A0p;
    public User A0q;
    public LCQ A0r;
    public Boolean A0s;
    public String A0t;
    public List A0u;
    public boolean A0v = false;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y = false;
    public boolean A0z;
    public boolean A10;
    public boolean A11 = false;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public Bundle A18;
    public ViewStub A19;
    public ViewStub A1A;
    public ViewStub A1B;
    public ViewStub A1C;
    public ViewStub A1D;
    public TextView A1E;
    public ConstraintLayout A1F;
    public BusinessFlowAnalyticsLogger A1G;
    public IgFrameLayout A1H;
    public C71662eb A1I;
    public IgFormField A1J;
    public ImageWithTitleTextView A1K;
    public ImageWithTitleTextView A1L;
    public final C50677Fgc A1M = new C50677Fgc(this);
    public final MUW A1N = new C51073Fo3(this);
    public final ArrayList A1O = AnonymousClass7TE.A1C();
    public final View.OnClickListener A1P = new FPC(this, 3);
    public final ViewTreeObserver.OnScrollChangedListener A1Q = new LZ5(this, 4);
    public final 27S A1R = FX1.A00(this, 22);
    public final 1wn A1S = FX1.A00(this, 15);
    public final 1wn A1T = FX1.A00(this, 17);
    public final 1wn A1U = FX1.A00(this, 20);
    public final 1wn A1V = FX1.A00(this, 16);
    public final 1wn A1W = FX1.A00(this, 14);
    public final 1wn A1X = FX1.A00(this, 18);
    public final 1wn A1Y = FX1.A00(this, 19);
    public final 1wn A1Z = FX1.A00(this, 21);

    public final boolean CIy() {
        return false;
    }

    public final /* synthetic */ void CJ6(Intent intent) {
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final /* synthetic */ void Ewk(File file, int i) {
    }

    public final String getModuleName() {
        return "edit_profile";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r9 == 11) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            r3 = r11
            super.onActivityResult(r9, r10, r11)
            boolean r0 = r8.A16
            r2 = 11
            if (r0 != 0) goto L_0x000d
            r1 = 0
            if (r9 != r2) goto L_0x000e
        L_0x000d:
            r1 = 1
        L_0x000e:
            X.36O r0 = r8.A0O
            r0.A08(r11, r9, r10, r1)
            r1 = 1111(0x457, float:1.557E-42)
            r0 = -1
            if (r9 != r1) goto L_0x0038
            if (r10 != r0) goto L_0x0037
            android.content.Context r2 = r8.requireContext()
            com.instagram.common.session.UserSession r4 = r8.A0V
            r0 = 2
            X.Fwi r7 = new X.Fwi
            r7.<init>(r8, r0)
            r0 = 9
            X.Fwa r5 = new X.Fwa
            r5.<init>(r8, r0)
            r0 = 13
            X.Fwa r6 = new X.Fwa
            r6.<init>(r8, r0)
            X.C319076q0.A01(r2, r3, r4, r5, r6, r7)
        L_0x0037:
            return
        L_0x0038:
            if (r9 != r2) goto L_0x0037
            if (r0 != r10) goto L_0x0037
            X.DbT.A1I(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46656Dib.onActivityResult(int, int, android.content.Intent):void");
    }

    public static ProfileCoinFlipView A00(C46656Dib dib) {
        ProfileCoinFlipView profileCoinFlipView;
        if (dib.A0l == null || dib.A1F == null || (profileCoinFlipView = dib.A0S) == null || dib.A0R == null) {
            return null;
        }
        C320966tM.A03(profileCoinFlipView.getContext(), profileCoinFlipView, dib.A0V, (Integer) null, R.dimen.action_button_min_width);
        dib.A0S.setProfilePicUrl(dib.A0q.Bh3(), dib);
        dib.A0S.setAvatarDrawables(dib.A0l.A01(dib.A0R));
        ProfileCoinFlipView profileCoinFlipView2 = dib.A0S;
        C320966tM.A01(profileCoinFlipView2.getContext(), dib.A0R, profileCoinFlipView2, dib, dib.A0V);
        if (!DcE.A01(dib.A0V)) {
            ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(dib.A0S);
            A0D2.topMargin = DbU.A05(dib.A0S).getDimensionPixelSize(R.dimen.edit_profile_frame_pop_offset);
            dib.A0S.setLayoutParams(A0D2);
        }
        dib.A0Q = new C321266tq(dib.A1F, C320946tJ.PROFILE_PICTURE, dib.A0S, (List) null, new C51585FwZ(1), new C51586Fwa(dib, 14), new C51586Fwa(dib, 15), new C51585FwZ(2), DcE.A01(dib.A0V), true, false);
        return dib.A0S;
    }

    public static C318956po A01(C46656Dib dib) {
        C46656Dib dib2 = dib;
        C252063oV r0 = dib2.A0b;
        if (r0 == null) {
            r0 = DbU.A0Z(dib2.A03, R.id.avatar_view_stub);
            dib2.A0b = r0;
        }
        ProfileCoinFlipView profileCoinFlipView = (ProfileCoinFlipView) r0.getView().requireViewById(R.id.avatar_view);
        03v.A0B(profileCoinFlipView, new U7M(dib2, 9));
        UserSession userSession = dib2.A0V;
        Context requireContext = dib2.requireContext();
        WeakReference weakReference = new WeakReference(dib2.requireActivity());
        WeakReference weakReference2 = new WeakReference(dib2);
        ConstraintLayout constraintLayout = dib2.A1F;
        C252063oV r9 = dib2.A0a;
        if (r9 == null) {
            C252063oV r02 = dib2.A0b;
            if (r02 == null) {
                r02 = DbU.A0Z(dib2.A03, R.id.avatar_view_stub);
                dib2.A0b = r02;
            }
            r9 = DbU.A0Z(r02.getView(), R.id.avatar_new_badge_view_stub);
            dib2.A0a = r9;
        }
        ConstraintLayout constraintLayout2 = dib2.A1F;
        IgFrameLayout igFrameLayout = dib2.A1H;
        C252063oV r03 = dib2.A0b;
        if (r03 == null) {
            r03 = DbU.A0Z(dib2.A03, R.id.avatar_view_stub);
            dib2.A0b = r03;
        }
        C319656qy r10 = new C319656qy(igFrameLayout, r03.getView(), constraintLayout2);
        C51586Fwa fwa = new C51586Fwa(dib2, 5);
        C51586Fwa fwa2 = new C51586Fwa(dib2, 6);
        0sP fwb = new C51587Fwb(dib2, 4);
        C318956po r3 = new C318956po(requireContext, constraintLayout, profileCoinFlipView, dib2, userSession, r9, r10, weakReference, weakReference2, fwa, fwa2, new C51586Fwa(dib2, 13), new C51586Fwa(dib2, 7), new C51586Fwa(dib2, 8), fwb);
        dib2.requireActivity().getLifecycle().A09(r3);
        return r3;
    }

    private void A04() {
        DbV.A0O(this.A0V).AUs(new AnonymousClass9JK(CallerContext.A00(C46656Dib.class), C273654mx.A00(302), "ig_edit_profile", "edit_profile", "loading"), AnonymousClass9F1.A00, new C50205FTl(this, 0));
    }

    public static void A05(View view, C46656Dib dib) {
        if (dib.A0y) {
            view.setAlpha(0.3f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r4.A0O().isEmpty() == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r4.A03.getProfilePicId() != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r4.getFullName().isEmpty() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (r4.A0O().isEmpty() == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C46656Dib r5) {
        /*
            android.view.View r1 = r5.A03
            r0 = 2131432903(0x7f0b15c7, float:1.8487577E38)
            android.view.View r2 = r1.findViewById(r0)
            com.instagram.common.session.UserSession r0 = r5.A0V
            com.instagram.user.model.User r4 = X.DbT.A0j(r0)
            if (r2 == 0) goto L_0x004c
            com.instagram.common.session.UserSession r5 = r5.A0V
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324466862731372(0x810ce90002306c, double:3.035077338654623E-306)
            boolean r3 = X.DbY.A1Y(r3, r5, r0)
            r1 = 1
            java.lang.String r0 = r4.getFullName()
            if (r3 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r4.getFullName()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = r4.A0O()
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r4.A0O()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004d
        L_0x0041:
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.getProfilePicId()
            if (r0 == 0) goto L_0x004d
        L_0x0049:
            r2.setEnabled(r1)
        L_0x004c:
            return
        L_0x004d:
            r1 = 0
            goto L_0x0049
        L_0x004f:
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r4.getFullName()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0049
        L_0x005b:
            java.lang.String r0 = r4.A0O()
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r4.A0O()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0049
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46656Dib.A06(X.Dib):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r1 == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C46656Dib r2) {
        /*
            X.F1D r1 = r2.A0e
            if (r1 == 0) goto L_0x003a
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r1.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.widget.TextView r1 = r2.A0L
            if (r0 == 0) goto L_0x003b
            X.DbS.A1C(r1)
            android.widget.TextView r1 = r2.A0L
            r0 = 2131952297(0x7f1302a9, float:1.9541033E38)
        L_0x001a:
            r1.setHint(r0)
            X.F1D r0 = r2.A0e
            java.lang.Boolean r0 = r0.A07
            if (r0 == 0) goto L_0x002a
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            com.instagram.ui.widget.textview.ImageWithTitleTextView r1 = r2.A1K
            if (r0 == 0) goto L_0x0048
            r0 = 0
            r1.setVisibility(r0)
            com.instagram.ui.widget.textview.ImageWithTitleTextView r1 = r2.A1K
            r0 = 14
            X.FPC.A02(r1, r2, r0)
        L_0x003a:
            return
        L_0x003b:
            X.F1D r0 = r2.A0e
            java.lang.String r0 = r0.A0D
            r1.setText(r0)
            android.widget.TextView r1 = r2.A0L
            r0 = 2131961447(0x7f132667, float:1.9559591E38)
            goto L_0x001a
        L_0x0048:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46656Dib.A07(X.Dib):void");
    }

    public static void A08(C46656Dib dib) {
        TextView textView;
        int i;
        F1D f1d = dib.A0e;
        if (f1d != null && dib.mView != null) {
            if (TextUtils.isEmpty(f1d.A0M) || !dib.A0e.A0Z) {
                dib.A1L.setVisibility(8);
            } else {
                int color = dib.requireContext().getColor(R.color.design_dark_default_color_on_background);
                Drawable drawable = dib.A1L.A01;
                if (drawable != null) {
                    AnonymousClass7TE.A1R(drawable.mutate(), color);
                }
                dib.A1L.setVisibility(0);
                FPC.A02(dib.A1L, dib, 15);
            }
            boolean isEmpty = TextUtils.isEmpty(dib.A0e.A0M);
            TextView textView2 = dib.A0M;
            if (!isEmpty) {
                textView2.setText(dib.A0e.A0M);
                textView = dib.A0M;
                i = 2131961469;
            } else {
                DbS.A1C(textView2);
                textView = dib.A0M;
                i = 2131952331;
            }
            textView.setHint(i);
        }
    }

    public static void A09(C46656Dib dib) {
        IgFormField igFormField;
        Context requireContext;
        int i;
        String str;
        if (dib.A0e != null && dib.mView != null && DbY.A1a(dib.A0V)) {
            dib.A1J.setVisibility(DbW.A00(dib.A11 ? 1 : 0));
            dib.A1J.getMEditText().setFocusableInTouchMode(false);
            dib.requireContext().getString(2131963025);
            dib.A1J.setInPickerMode(new FPD(dib, 67));
            A05(dib.A1J, dib);
            C50677Fgc fgc = dib.A1M;
            fgc.A00 = false;
            F1D f1d = dib.A0e;
            int i2 = f1d.A00;
            if (i2 == 1) {
                igFormField = dib.A1J;
                requireContext = dib.requireContext();
                i = 2131963024;
            } else if (i2 != 2) {
                igFormField = dib.A1J;
                if (i2 != 4) {
                    requireContext = dib.requireContext();
                    i = 2131963027;
                } else {
                    str = f1d.A0C;
                    str.getClass();
                    igFormField.setText(str);
                    fgc.A00 = true;
                }
            } else {
                igFormField = dib.A1J;
                requireContext = dib.requireContext();
                i = 2131963023;
            }
            str = requireContext.getString(i);
            igFormField.setText(str);
            fgc.A00 = true;
        }
    }

    public static void A0A(C46656Dib dib) {
        if (Boolean.TRUE.equals(Boolean.valueOf(AnonymousClass7TG.A1X(DbV.A0k(dib.A0V).B2W())))) {
            View requireView = dib.requireView();
            TextView A0G2 = DbU.A0G(requireView, R.id.personal_information_entry_point);
            if (A0G2 != null) {
                2eS.A01(A0G2);
            }
            A0G2.setVisibility(DbW.A00(dib.A11 ? 1 : 0));
            boolean z = 1QE.A0E().A00;
            Context requireContext = dib.requireContext();
            DbT.A17(requireContext, A0G2, DbZ.A00(requireContext, dib, z ? 1 : 0));
            A05(A0G2, dib);
            AnonymousClass0fU.A00(new FPG((AnonymousClass4DH) dib, dib, 25), A0G2);
            DbT.A1F(requireView, R.id.edit_profile_personal_information_fields, 8);
        }
    }

    public static void A0C(C46656Dib dib) {
        if (!dib.A13) {
            dib.A04();
            C47691EDa.A00(dib, C318486p2.A06(dib.A0V), 25);
        }
    }

    public static void A0D(C46656Dib dib) {
        View view;
        int i;
        String string;
        if (!dib.A11 && dib.A0e != null && AnonymousClass30D.A0A(dib.A0V)) {
            if (2Ek.A03(dib.A0q)) {
                dib.A1C.setVisibility(0);
                view = dib.A03;
                i = R.id.professional_profile_music_settings_stub;
            } else {
                dib.A1B.setVisibility(0);
                view = dib.A03;
                i = R.id.personal_profile_music_settings_stub;
            }
            View requireViewById = view.requireViewById(i);
            requireViewById.setContentDescription(dib.getString(2131967856));
            DbU.A0G(requireViewById, R.id.contact_text).setText(2131967856);
            TextView A0G2 = DbU.A0G(requireViewById, R.id.contact_summary);
            A0G2.setMaxLines(1);
            A0G2.setEllipsize(TextUtils.TruncateAt.END);
            Context requireContext = dib.requireContext();
            JVM jvm = dib.A0f;
            if (jvm != null) {
                MusicAssetModel musicAssetModel = jvm.A02;
                Object[] objArr = {musicAssetModel.A0D, musicAssetModel.A0I};
                string = String.format(Locale.getDefault(), AnonymousClass000.A00(1991), objArr);
            } else {
                string = requireContext.getString(2131967790);
            }
            A0G2.setText(string);
            AnonymousClass0fU.A00(new C64273LXz(dib, 23), requireViewById);
        }
    }

    public static void A0E(C46656Dib dib) {
        String string;
        String A002;
        boolean z;
        if (dib.A0e != null) {
            UserSession userSession = dib.A0V;
            if (182.A06(DbS.A0J(userSession, 0), userSession, 36324750330638679L)) {
                F1D f1d = dib.A0e;
                C298895uD r0 = f1d.A03;
                if (r0 != null) {
                    string = C49127Epq.A00(r0);
                    A002 = C273654mx.A00(3282);
                    z = true;
                } else if (f1d.A0S) {
                    string = DbV.A05(dib).getString(2131972723);
                    A002 = C273654mx.A00(387);
                    z = false;
                } else {
                    return;
                }
                dib.A1D.setVisibility(0);
                View requireViewById = dib.A03.requireViewById(R.id.school_settings_stub);
                requireViewById.setContentDescription(dib.getString(2131972724));
                DbU.A0G(requireViewById, R.id.contact_text).setText(2131972724);
                TextView A0G2 = DbU.A0G(requireViewById, R.id.contact_summary);
                A0G2.setMaxLines(1);
                A0G2.setEllipsize(TextUtils.TruncateAt.END);
                A0G2.setText(string);
                if (z) {
                    DbT.A17(dib.requireContext(), A0G2, 2Yu.A07(dib.requireContext()));
                }
                AnonymousClass0fU.A00(new C50101FOr(A002, (Object) dib, 18), requireViewById);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static void A0F(C46656Dib dib) {
        ViewGroup.LayoutParams layoutParams;
        AnonymousClass37D A0i2;
        if (dib.A0l != null && dib.A0S != null && dib.A0Y != null && dib.A1H != null && dib.A0b != null && dib.A0h != null) {
            FragmentActivity activity = dib.getActivity();
            if (!(activity == null || (A0i2 = DbT.A0i(activity)) == null || ((AnonymousClass37F) A0i2).A0b)) {
                A0i2.A0B();
            }
            dib.A0S.setVisibility(8);
            dib.A0Y.setVisibility(0);
            if (dib.A0X != null) {
                if (C240943Ng.A02(dib.A0V, dib.A0q)) {
                    dib.A0X.setVisibility(0);
                }
            }
            dib.A1H.setVisibility(0);
            View view = dib.A0b.getView();
            view.setScaleX(Math.abs(view.getScaleX()));
            view.setVisibility(0);
            C318956po r1 = dib.A0l;
            View view2 = r1.A05;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                Context context = r1.A04;
                layoutParams.width = (context.getResources().getDimensionPixelOffset(R.dimen.action_button_min_width) * 2) + context.getResources().getDimensionPixelOffset(R.dimen.abc_dialog_padding_top_material);
            }
        }
    }

    public static void A0G(C46656Dib dib) {
        DdZ ddZ;
        AvatarCoinFlipConfig avatarCoinFlipConfig;
        if (dib.A0y) {
            A0K(dib, C273654mx.A00(145));
            return;
        }
        if (!DcE.A05(dib.A0V) && 25x.A00(dib.A0V).A01.A00 == C299715vi.A00) {
            UserSession userSession = dib.A0V;
            0qQ.A0B(userSession, 1);
            if (DcE.A06(userSession, true) && (ddZ = dib.A0h) != null && (avatarCoinFlipConfig = dib.A0R) != null && !avatarCoinFlipConfig.A08) {
                if (!ddZ.A0A.A00.A00.getBoolean(002.A0R("KEY_HAS_SEEN_COIN_FLIP_NUX_BOTTOM_SHEET", dib.A0V.A06), false)) {
                    DbW.A0T(dib.A0V).A02(dib.requireActivity(), C48373EdU.A00(dib.A0R, "edit_profile"));
                    DdZ ddZ2 = dib.A0h;
                    DbX.A1T(ddZ2.A0A.A00.A00.AR4(), "KEY_HAS_SEEN_COIN_FLIP_NUX_BOTTOM_SHEET", dib.A0V.A06, true);
                    AnonymousClass36X r1 = A1a;
                    AnonymousClass36O.A0B = r1;
                    UserSession userSession2 = dib.A0V;
                    Long.parseLong(userSession2.A06);
                    C46653DiY.A00(r1, userSession2, "change_profile_photo_button_clicked", "photo_editing", (String) null, (String) null, (Map) null);
                }
            }
        }
        if (!dib.A0P()) {
            A0B(dib);
            AnonymousClass36X r12 = A1a;
            AnonymousClass36O.A0B = r12;
            UserSession userSession22 = dib.A0V;
            Long.parseLong(userSession22.A06);
            C46653DiY.A00(r12, userSession22, "change_profile_photo_button_clicked", "photo_editing", (String) null, (String) null, (Map) null);
        }
    }

    public static void A0H(C46656Dib dib) {
        E38 A052;
        C48243EbO ebO;
        dib.A0e.getClass();
        C48231EbC ebC = dib.A0e.A06;
        if (ebC == null || (ebO = ebC.A00) == null) {
            A052 = C46447Df9.A02().A05(dib.A0q, dib.A0e.A0F, "", "", false, false);
        } else {
            1a1 A022 = C46447Df9.A02();
            String str = dib.A0e.A0F;
            boolean z = ebO.A02;
            boolean z2 = ebO.A03;
            A052 = A022.A05(dib.A0q, str, ebO.A00, ebO.A01, z, z2);
        }
        FragmentActivity activity = dib.getActivity();
        if (activity != null) {
            Dbb.A12(A052, activity, dib.A0V);
        }
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x027b, code lost:
        if (r1.equals("variant_get_a_verified_badge") != false) goto L_0x027d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0I(X.C46656Dib r9) {
        /*
            android.view.View r0 = r9.mView
            if (r0 == 0) goto L_0x023c
            X.F1D r0 = r9.A0e
            if (r0 == 0) goto L_0x023c
            r9.A03()
            boolean r0 = r9.A0O()
            if (r0 == 0) goto L_0x002b
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = r9.A0j
            com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController r0 = r0.A03
            if (r0 == 0) goto L_0x001e
            com.instagram.igds.components.form.IgFormField r0 = r0.nameField
            if (r0 == 0) goto L_0x001e
            r0.A0F()
        L_0x001e:
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = r9.A0j
            com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController r0 = r0.A03
            if (r0 == 0) goto L_0x002b
            com.instagram.igds.components.form.IgFormField r0 = r0.usernameField
            if (r0 == 0) goto L_0x002b
            r0.A0F()
        L_0x002b:
            boolean r0 = r9.A0P()
            if (r0 == 0) goto L_0x005f
            X.6po r0 = r9.A0l
            r2 = 0
            if (r0 == 0) goto L_0x0038
            r0.A02 = r2
        L_0x0038:
            com.instagram.common.session.UserSession r0 = r9.A0V
            boolean r0 = X.DcE.A05(r0)
            com.instagram.common.ui.text.TitleTextView r1 = r9.A0W
            if (r0 == 0) goto L_0x0282
            r1.setEnabled(r2)
            com.instagram.common.ui.text.TitleTextView r3 = r9.A0W
            android.content.Context r2 = r9.requireContext()
            android.content.Context r1 = r9.requireContext()
            r0 = 2130970278(0x7f0406a6, float:1.7549262E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A17(r2, r3, r0)
            com.instagram.common.ui.text.TitleTextView r1 = r9.A0W
            r0 = 0
            r1.setOnClickListener(r0)
        L_0x005f:
            A07(r9)
            A08(r9)
            A09(r9)
            X.F1D r0 = r9.A0e
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = r0.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007e
            X.F1D r0 = r9.A0e
            java.lang.String r0 = r0.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00de
        L_0x007e:
            android.content.Context r7 = r9.requireContext()
            com.instagram.common.session.UserSession r3 = r9.A0V
            r6 = 1
            X.0qQ.A0B(r3, r6)
            X.FV8 r0 = X.FV8.A00()
            java.lang.String r2 = "ig_android_growth_fx_access_fb_ig_prefill_contact_point"
            java.lang.String r1 = "FBFirstPartyPrefillHelper"
            boolean r0 = r0.A04(r3, r2, r1)
            if (r0 == 0) goto L_0x00d7
            X.FV8 r0 = X.FV8.A00()
            java.lang.String r5 = r0.A02(r3, r2, r1)
            if (r5 == 0) goto L_0x00d7
            X.1NY r4 = X.AnonymousClass7TG.A0a(r3)
            java.lang.String r0 = "accounts/contact_point_prefill/"
            r4.A0A(r0)
            java.lang.String r1 = "usage"
            java.lang.String r0 = "fb_prefill"
            r4.A9m(r1, r0)
            java.lang.String r0 = "big_blue_token"
            java.lang.String r3 = X.DbT.A0u(r7, r4, r0, r5)
            r2 = 0
            r1 = 9
            r0 = 14
            java.lang.String r0 = X.Dbm.A02(r2, r1, r0)
            r4.A9m(r0, r3)
            java.lang.Class<X.Dw1> r1 = X.Dw1.class
            java.lang.Class<X.F8O> r0 = X.F8O.class
            r4.A0R(r1, r0)
            X.1OC r1 = X.DbT.A0U(r4, r6)
            X.EB9 r0 = new X.EB9
            r0.<init>(r5)
            r1.A00 = r0
            X.1ES.A03(r1)
        L_0x00d7:
            com.instagram.common.session.UserSession r1 = r9.A0V
            java.lang.String r0 = "edit_profile"
            X.C49315Esy.A00(r1, r0, r0)
        L_0x00de:
            A0A(r9)
            com.instagram.user.model.User r0 = r9.A0q
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.COh()
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x010d
            android.view.View r1 = r9.requireView()
            r0 = 2131433262(0x7f0b172e, float:1.8488305E38)
            android.view.View r2 = X.DbU.A0B(r1, r0)
            X.2eS.A01(r2)
            r0 = 0
            r2.setVisibility(r0)
            r1 = 42
            X.FPH r0 = new X.FPH
            r0.<init>((int) r1, (java.lang.Object) r9, (java.lang.Object) r9, (java.lang.Object) r9)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x010d:
            com.instagram.common.session.UserSession r2 = r9.A0V
            X.0Tu r6 = X.0Tu.A05
            r0 = 36328624390946279(0x8110b100003de7, double:3.037706576238753E-306)
            boolean r0 = X.DbY.A1Y(r6, r2, r0)
            if (r0 == 0) goto L_0x014c
            r0 = 2131969939(0x7f134793, float:1.9576815E38)
            java.lang.String r7 = r9.getString(r0)
            r0 = 2131969932(0x7f13478c, float:1.95768E38)
            r5 = 0
            java.lang.String r4 = X.DbV.A0z(r9, r7, r0)
            android.widget.TextView r3 = r9.A0I
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            int r0 = X.2Yu.A06(r0)
            java.lang.Integer r2 = X.DbV.A0n(r1, r0)
            r1 = 46
            X.ESx r0 = new X.ESx
            r0.<init>((java.lang.Integer) r2, (java.lang.Object) r9, (int) r1)
            X.AnonymousClass7AV.A07(r0, r3, r7, r4)
            android.widget.TextView r0 = r9.A0I
            r0.setVisibility(r5)
        L_0x014c:
            X.F1D r0 = r9.A0e
            if (r0 == 0) goto L_0x01e2
            boolean r0 = r0.A0V
            if (r0 != 0) goto L_0x01e2
            com.instagram.common.session.UserSession r2 = r9.A0V
            r0 = 36317427412309114(0x8106820011147a, double:3.0306255618619955E-306)
            boolean r0 = X.DbY.A1Y(r6, r2, r0)
            if (r0 == 0) goto L_0x01e2
            android.view.View r1 = r9.requireView()
            r0 = 2131436302(0x7f0b230e, float:1.849447E38)
            android.view.View r5 = r1.requireViewById(r0)
            if (r5 == 0) goto L_0x0171
            X.2eS.A01(r5)
        L_0x0171:
            r4 = 0
            r5.setVisibility(r4)
            r0 = 2131436303(0x7f0b230f, float:1.8494473E38)
            android.widget.TextView r3 = X.DbU.A0G(r1, r0)
            r2 = 2131966454(0x7f1339f6, float:1.9569747E38)
            com.instagram.common.session.UserSession r8 = r9.A0V
            r7 = 0
            X.0qQ.A0B(r8, r4)
            r0 = 36317427414275205(0x810682002f1485, double:3.0306255631053593E-306)
            boolean r0 = X.182.A06(r6, r8, r0)
            com.instagram.common.session.UserSession r8 = r9.A0V
            if (r0 == 0) goto L_0x023d
            X.0qQ.A0B(r8, r4)
            r0 = 36880377367560516(0x830682002d0144, double:3.386637380380504E-306)
            java.lang.String r1 = X.182.A04(r6, r8, r0)
            java.lang.String r0 = "variant_verify_your_business"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0275
            r2 = 2131966458(0x7f1339fa, float:1.9569755E38)
        L_0x01a9:
            android.content.Context r0 = r9.requireContext()
            X.DbT.A18(r0, r3, r2)
            r3.setVisibility(r4)
            boolean r0 = r9.A11
            if (r0 == 0) goto L_0x01b9
            r4 = 8
        L_0x01b9:
            r5.setVisibility(r4)
            com.instagram.common.session.UserSession r1 = r9.A0V
            X.0qQ.A0B(r1, r7)
            r0 = 0
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r0 = "ig_native_meta_verified_edit_profile_impression"
            X.DbZ.A1R(r1, r0)
            A05(r3, r9)
            com.instagram.common.session.UserSession r2 = r9.A0V
            r0 = 36317427413816448(0x81068200281480, double:3.0306255628152396E-306)
            boolean r1 = X.DbY.A1Y(r6, r2, r0)
            r0 = 17
            if (r1 == 0) goto L_0x01df
            r0 = 16
        L_0x01df:
            X.FPC.A02(r5, r9, r0)
        L_0x01e2:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r9.A0Y
            X.F1D r0 = r9.A0e
            com.instagram.common.typedurl.ImageUrl r0 = r0.A05
            r1.setUrl(r0, r9)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r9.A0X
            if (r0 == 0) goto L_0x020b
            com.instagram.user.model.User r1 = r9.A0q
            com.instagram.common.session.UserSession r0 = r9.A0V
            boolean r0 = X.C240943Ng.A02(r0, r1)
            if (r0 == 0) goto L_0x020b
            android.content.Context r1 = r9.requireContext()
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r9.A0X
            X.C240943Ng.A00(r1, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r9.A0X
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            X.C240943Ng.A01(r0)
        L_0x020b:
            X.Fgc r4 = r9.A1M
            r0 = 0
            r4.A00 = r0
            com.instagram.profile.edit.controller.EditProfileFieldsController r3 = r9.A0j
            android.os.Bundle r2 = r9.A18
            X.F1D r1 = r9.A0e
            com.instagram.user.model.User r0 = r9.A0q
            r3.A0B(r2, r1, r0)
            android.os.Bundle r1 = r9.A18
            if (r1 == 0) goto L_0x0239
            java.lang.String r0 = "bundle_phone_field"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x022c
            android.widget.TextView r0 = r9.A0M
            r0.setText(r1)
        L_0x022c:
            android.os.Bundle r1 = r9.A18
            java.lang.String r0 = "bundle_saved_change"
            boolean r0 = r1.getBoolean(r0)
            r9.A10 = r0
            r0 = 0
            r9.A18 = r0
        L_0x0239:
            r0 = 1
            r4.A00 = r0
        L_0x023c:
            return
        L_0x023d:
            X.0qQ.A0B(r8, r4)
            r0 = 36317427413947522(0x810682002a1482, double:3.030625562898131E-306)
            boolean r0 = X.182.A06(r6, r8, r0)
            if (r0 == 0) goto L_0x0250
            r2 = 2131966455(0x7f1339f7, float:1.9569749E38)
            goto L_0x01a9
        L_0x0250:
            com.instagram.common.session.UserSession r8 = r9.A0V
            X.0qQ.A0B(r8, r4)
            r0 = 36317427413881985(0x81068200291481, double:3.0306255628566854E-306)
            boolean r0 = X.182.A06(r6, r8, r0)
            if (r0 != 0) goto L_0x027d
            com.instagram.common.session.UserSession r8 = r9.A0V
            X.0qQ.A0B(r8, r4)
            r0 = 36317427414013059(0x810682002b1483, double:3.030625562939577E-306)
            boolean r0 = X.182.A06(r6, r8, r0)
            if (r0 == 0) goto L_0x01a9
            r2 = 2131966457(0x7f1339f9, float:1.9569753E38)
            goto L_0x01a9
        L_0x0275:
            java.lang.String r0 = "variant_get_a_verified_badge"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01a9
        L_0x027d:
            r2 = 2131966456(0x7f1339f8, float:1.956975E38)
            goto L_0x01a9
        L_0x0282:
            r0 = 2131961430(0x7f132656, float:1.9559557E38)
            r1.setText(r0)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46656Dib.A0I(X.Dib):void");
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, androidx.fragment.app.Fragment, X.Dib, java.lang.Object, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0373, code lost:
        if (X.2Ek.A00(r11.A0q) != false) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011f, code lost:
        if (r0.booleanValue() != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0159, code lost:
        if (r0.booleanValue() == false) goto L_0x015b;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0J(X.C46656Dib r11) {
        /*
            com.instagram.user.model.User r0 = r11.A0q
            boolean r0 = X.2Ek.A01(r0)
            if (r0 != 0) goto L_0x0018
            com.instagram.common.session.UserSession r0 = r11.A0V
            boolean r0 = X.AnonymousClass431.A00(r0)
            if (r0 != 0) goto L_0x0018
            android.widget.TextView r1 = r11.A0F
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0018:
            X.2IS r4 = X.C41845B3m.A04()
            java.lang.Class<X.Dqg> r2 = X.C47104Dqg.class
            java.lang.String r0 = "IGFetchLDPTransactionToolSelectorApps"
            r3 = 0
            X.3Fa r1 = new X.3Fa
            r1.<init>(r4, r2, r0, r3)
            com.instagram.common.session.UserSession r0 = r11.A0V
            X.1OC r2 = X.C46479Dfi.A00(r1, r0)
            r1 = 23
            X.EDa r0 = new X.EDa
            r0.<init>(r11, r1)
            r2.A00 = r0
            android.content.Context r1 = r11.getContext()
            if (r1 == 0) goto L_0x0042
            X.0gy r0 = X.AnonymousClass07i.A00(r11)
            X.1ES.A00(r1, r0, r2)
        L_0x0042:
            com.instagram.user.model.User r0 = r11.A0q
            boolean r0 = X.2Ek.A00(r0)
            if (r0 == 0) goto L_0x0052
            android.widget.TextView r1 = r11.A0F
            r0 = 2131970936(0x7f134b78, float:1.9578837E38)
            r1.setText(r0)
        L_0x0052:
            android.widget.TextView r0 = r11.A0F
            r0.setVisibility(r3)
            android.view.ViewStub r0 = r11.A19
            r0.setVisibility(r3)
            android.view.View r1 = r11.A03
            r0 = 2131429732(0x7f0b0964, float:1.8481145E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r11.A1E = r0
            if (r0 == 0) goto L_0x006c
            X.2eS.A01(r0)
        L_0x006c:
            android.widget.TextView r1 = r11.A1E
            com.instagram.user.model.User r0 = r11.A0q
            X.4Cl r0 = r0.A03
            java.lang.String r0 = r0.getCategory()
            r1.setText(r0)
            android.view.View r0 = r11.A03
            r5 = 2131429247(0x7f0b077f, float:1.8480161E38)
            android.view.View r0 = r0.requireViewById(r5)
            r4 = 8
            X.FPC.A02(r0, r11, r4)
            com.instagram.common.session.UserSession r1 = r11.A0V
            X.F1D r0 = r11.A0e
            X.0qQ.A0B(r1, r3)
            java.lang.Integer r1 = X.C49020Enw.A00(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00b7
            android.view.View r1 = r11.A03
            r0 = 2131429728(0x7f0b0960, float:1.8481137E38)
            android.widget.TextView r2 = X.DbU.A0G(r1, r0)
            android.content.Context r1 = r11.requireContext()
            android.content.Context r0 = r11.requireContext()
            int r0 = X.2Yu.A08(r0)
            X.DbT.A17(r1, r2, r0)
            android.view.View r0 = r11.A03
            android.view.View r0 = r0.requireViewById(r5)
            r0.setEnabled(r3)
        L_0x00b7:
            com.instagram.common.session.UserSession r5 = r11.A0V
            X.0Tu r2 = X.DbS.A0J(r5, r3)
            r0 = 36318926354782973(0x8107df00001afd, double:3.031573499118221E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x013a
            android.view.ViewStub r0 = r11.A1A
            r0.setVisibility(r3)
            android.view.View r1 = r11.A03
            r0 = 2131430377(0x7f0b0be9, float:1.8482453E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r11.A0H = r0
            if (r0 == 0) goto L_0x00dd
            X.2eS.A01(r0)
        L_0x00dd:
            com.instagram.user.model.User r1 = r11.A0q
            com.instagram.common.session.UserSession r0 = r11.A0V
            boolean r7 = X.AnonymousClass7TF.A1U(r3, r1, r0)
            X.6qV r9 = X.C319386qV.A00
            java.lang.Class<X.6qW> r5 = X.C319396qW.class
            java.lang.Object r0 = r0.A01(r5, r9)
            X.6qW r0 = (X.C319396qW) r0
            java.lang.String r1 = r1.getId()
            android.util.LruCache r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x03b2
            android.widget.TextView r6 = r11.A0H
            com.instagram.user.model.User r8 = r11.A0q
            com.instagram.common.session.UserSession r0 = r11.A0V
            X.0qQ.A0B(r8, r3)
            X.0qQ.A0B(r0, r7)
            java.lang.Object r1 = r0.A01(r5, r9)
            X.6qW r1 = (X.C319396qW) r1
            java.lang.String r0 = r8.getId()
            android.util.LruCache r5 = r1.A00
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x038d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03ad
        L_0x0121:
            r0 = 2131968777(0x7f134309, float:1.9574458E38)
        L_0x0124:
            r6.setText(r0)
        L_0x0127:
            android.view.View r1 = r11.A03
            r0 = 2131430372(0x7f0b0be4, float:1.8482443E38)
            android.view.View r5 = r1.requireViewById(r0)
            r1 = 68
            X.FPD r0 = new X.FPD
            r0.<init>((X.C46656Dib) r11, (int) r1)
            X.AnonymousClass0fU.A00(r0, r5)
        L_0x013a:
            com.instagram.user.model.User r0 = r11.A0q
            boolean r0 = r0.CPm()
            if (r0 != 0) goto L_0x014a
            com.instagram.user.model.User r0 = r11.A0q
            boolean r0 = X.2Ek.A00(r0)
            if (r0 == 0) goto L_0x015b
        L_0x014a:
            com.instagram.user.model.User r0 = r11.A0q
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.CRw()
            if (r0 == 0) goto L_0x015b
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x015c
        L_0x015b:
            r1 = 0
        L_0x015c:
            android.view.ViewStub r0 = r11.A0A
            if (r1 == 0) goto L_0x0388
            r0.setVisibility(r3)
            android.view.View r1 = r11.A03
            r0 = 2131429255(0x7f0b0787, float:1.8480178E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r11.A0K = r0
            r11.A0z = r3
            if (r0 == 0) goto L_0x0175
            X.2eS.A01(r0)
        L_0x0175:
            X.C66631pj.A00()
            com.instagram.common.session.UserSession r1 = r11.A0V
            com.instagram.user.model.User r0 = r11.A0q
            java.lang.String r7 = r0.getId()
            X.MUW r5 = r11.A1N
            X.AnonymousClass7TF.A1B(r1, r3, r5)
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r6 = X.C63496Ky2.A00(r1)
            X.4Cq r0 = r6.A02
            r8 = 0
            r9 = 33
            X.MGk r4 = new X.MGk
            r4.<init>(r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r4, r0)
            android.view.View r1 = r11.A03
            r0 = 2131431951(0x7f0b120f, float:1.8485646E38)
            android.view.View r4 = r1.requireViewById(r0)
            r1 = 26
            X.FPG r0 = new X.FPG
            r0.<init>((X.AnonymousClass4DH) r11, (X.C46656Dib) r11, (int) r1)
            X.AnonymousClass0fU.A00(r0, r4)
        L_0x01a9:
            com.instagram.common.session.UserSession r4 = r11.A0V
            r0 = 36321722378495647(0x810a6a0000269f, double:3.0333417157727996E-306)
            boolean r0 = X.DbY.A1Y(r2, r4, r0)
            if (r0 != 0) goto L_0x0264
            android.view.ViewStub r0 = r11.A06
            r0.setVisibility(r3)
            android.view.View r0 = r11.A03
            r6 = 2131429251(0x7f0b0783, float:1.848017E38)
            android.view.View r7 = r0.requireViewById(r6)
            r0 = 2131430661(0x7f0b0d05, float:1.848303E38)
            android.widget.TextView r8 = X.DbU.A0G(r7, r0)
            android.content.Context r5 = r11.requireContext()
            com.instagram.user.model.User r1 = r11.A0q
            com.instagram.common.session.UserSession r10 = r11.A0V
            X.4Cl r0 = r1.A03
            java.lang.String r9 = r0.AZg()
            X.4Cl r0 = r1.A03
            java.lang.String r4 = r0.CHc()
            X.4Cl r0 = r1.A03
            java.lang.String r0 = r0.AnQ()
            java.lang.String r4 = X.AnonymousClass703.A05(r5, r9, r4, r0)
            X.4Cl r0 = r1.A03
            java.lang.String r0 = r0.BiE()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r9 = ""
            if (r0 != 0) goto L_0x01fe
            r0 = 2131974890(0x7f135aea, float:1.9586857E38)
            java.lang.String r9 = A02(r5, r9, r0)
        L_0x01fe:
            X.4Cl r0 = r1.A03
            java.lang.String r0 = r0.BiH()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0211
            r0 = 2131974898(0x7f135af2, float:1.9586873E38)
            java.lang.String r9 = A02(r5, r9, r0)
        L_0x0211:
            boolean r0 = X.2Ek.A01(r1)
            if (r0 != 0) goto L_0x0224
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0224
            r0 = 2131952470(0x7f130356, float:1.9541384E38)
            java.lang.String r9 = A02(r5, r9, r0)
        L_0x0224:
            boolean r0 = r1.A1d()
            if (r0 == 0) goto L_0x0231
            r0 = 2131974909(0x7f135afd, float:1.9586895E38)
            java.lang.String r9 = A02(r5, r9, r0)
        L_0x0231:
            boolean r0 = r1.A2M()
            if (r0 == 0) goto L_0x0251
            X.0Tu r4 = X.0Tu.A06
            r0 = 36314609912646370(0x8103f200000ae2, double:3.0288437637301157E-306)
            boolean r0 = X.182.A06(r4, r10, r0)
            if (r0 == 0) goto L_0x0251
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x037f
            r0 = 2131974895(0x7f135aef, float:1.9586867E38)
            java.lang.String r9 = r5.getString(r0)
        L_0x0251:
            r8.setText(r9)
            r0 = 9
            X.FPC.A02(r7, r11, r0)
            android.view.View r0 = r11.A03
            android.view.View r0 = r0.findViewById(r6)
            if (r0 == 0) goto L_0x0264
            X.2eS.A01(r0)
        L_0x0264:
            com.instagram.common.session.UserSession r5 = r11.A0V
            com.instagram.user.model.User r4 = r11.A0q
            r9 = 1
            X.0qQ.A0B(r4, r9)
            boolean r0 = X.2Ek.A00(r4)
            if (r0 == 0) goto L_0x027d
            r0 = 36310791686783278(0x8100790001012e, double:3.026429102319535E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x029c
        L_0x027d:
            boolean r0 = X.2Ek.A01(r4)
            if (r0 == 0) goto L_0x02da
            X.4Cl r0 = r4.A03
            java.lang.Boolean r0 = r0.CSL()
            if (r0 == 0) goto L_0x02da
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02da
            r0 = 36310791686783278(0x8100790001012e, double:3.026429102319535E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x02da
        L_0x029c:
            android.view.ViewStub r0 = r11.A09
            r0.setVisibility(r3)
            android.content.Context r2 = r11.requireContext()
            com.instagram.common.session.UserSession r0 = r11.A0V
            X.4Cl r0 = X.DbV.A0k(r0)
            X.4os r1 = r0.AyK()
            if (r1 == 0) goto L_0x0376
            java.lang.String r0 = r1.Ay3()
            if (r0 == 0) goto L_0x0376
            java.lang.String r2 = r1.Ay3()
        L_0x02bb:
            android.view.View r1 = r11.A03
            r0 = 2131435526(0x7f0b2006, float:1.8492897E38)
            X.DbX.A1E(r1, r2, r0)
            android.view.View r1 = r11.A03
            r0 = 2131429282(0x7f0b07a2, float:1.8480232E38)
            android.view.View r0 = r1.requireViewById(r0)
            r11.A04 = r0
            if (r0 == 0) goto L_0x02d3
            X.2eS.A01(r0)
        L_0x02d3:
            android.view.View r1 = r11.A04
            r0 = 11
            X.FPC.A02(r1, r11, r0)
        L_0x02da:
            com.instagram.user.model.User r0 = r11.A0q
            boolean r0 = X.2Ek.A01(r0)
            if (r0 == 0) goto L_0x036d
            android.view.View r1 = r11.A03
            r0 = 2131438241(0x7f0b2aa1, float:1.8498403E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            r0 = 2131952472(0x7f130358, float:1.9541388E38)
            r1.setText(r0)
            android.widget.TextView r0 = r11.A0F
            r0.setVisibility(r3)
        L_0x02f6:
            android.view.ViewStub r0 = r11.A08
            r0.setVisibility(r3)
            android.view.View r1 = r11.A03
            r0 = 2131429277(0x7f0b079d, float:1.8480222E38)
            android.view.View r7 = r1.requireViewById(r0)
            if (r7 == 0) goto L_0x0309
            X.2eS.A01(r7)
        L_0x0309:
            r0 = 2131430665(0x7f0b0d09, float:1.8483037E38)
            android.widget.TextView r1 = X.DbU.A0G(r7, r0)
            r0 = 2131969941(0x7f134795, float:1.957682E38)
            r1.setText(r0)
            r0 = 2131430661(0x7f0b0d05, float:1.848303E38)
            android.widget.TextView r8 = X.DbU.A0G(r7, r0)
            android.content.Context r6 = r11.requireContext()
            com.instagram.common.session.UserSession r1 = r11.A0V
            com.instagram.user.model.User r5 = r11.A0q
            X.4Cl r0 = r5.A03
            java.lang.Boolean r0 = r0.Ca6()
            if (r0 == 0) goto L_0x033e
            java.lang.String r0 = ""
        L_0x032f:
            r8.setText(r0)
            r0 = 10
            X.FPC.A02(r7, r11, r0)
        L_0x0337:
            A0D(r11)
            A0E(r11)
            return
        L_0x033e:
            boolean r4 = r5.A1f()
            r2 = 1
            int r0 = X.AnonymousClass703.A00(r6, r1, r5, r9, r3)
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            boolean r0 = r5.A1g()
            if (r0 == 0) goto L_0x036b
            if (r1 == 0) goto L_0x036b
        L_0x0353:
            if (r4 != 0) goto L_0x0362
            r0 = 2131969944(0x7f134798, float:1.9576825E38)
            if (r2 != 0) goto L_0x035d
            r0 = 2131969943(0x7f134797, float:1.9576823E38)
        L_0x035d:
            java.lang.String r0 = r6.getString(r0)
            goto L_0x032f
        L_0x0362:
            r0 = 2131969947(0x7f13479b, float:1.9576831E38)
            if (r2 != 0) goto L_0x035d
            r0 = 2131969945(0x7f134799, float:1.9576827E38)
            goto L_0x035d
        L_0x036b:
            r2 = 0
            goto L_0x0353
        L_0x036d:
            com.instagram.user.model.User r0 = r11.A0q
            boolean r0 = X.2Ek.A00(r0)
            if (r0 == 0) goto L_0x0337
            goto L_0x02f6
        L_0x0376:
            r0 = 2131954403(0x7f130ae3, float:1.9545304E38)
            java.lang.String r2 = r2.getString(r0)
            goto L_0x02bb
        L_0x037f:
            r0 = 2131974893(0x7f135aed, float:1.9586863E38)
            java.lang.String r9 = A02(r5, r9, r0)
            goto L_0x0251
        L_0x0388:
            r0.setVisibility(r4)
            goto L_0x01a9
        L_0x038d:
            X.4Cl r0 = r8.A03
            java.util.List r1 = r0.AXq()
            if (r1 == 0) goto L_0x03ad
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r1 = r8.getId()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r5.put(r1, r0)
            goto L_0x0121
        L_0x03ad:
            r0 = 2131968751(0x7f1342ef, float:1.9574405E38)
            goto L_0x0124
        L_0x03b2:
            com.instagram.common.session.UserSession r0 = r11.A0V
            X.0qQ.A0B(r0, r3)
            X.1NY r0 = X.DbU.A0M(r0)
            X.1OC r1 = X.C48319Ecc.A00(r0)
            r0 = 24
            X.C47691EDa.A00(r11, r1, r0)
            goto L_0x0127
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46656Dib.A0J(X.Dib):void");
    }

    public static void A0L(C46656Dib dib, String str) {
        C59921Jbk jbk;
        C318956po r4 = dib.A0l;
        if (r4 != null) {
            0qQ.A0B(str, 0);
            ProfileCoinFlipView profileCoinFlipView = r4.A06;
            if (profileCoinFlipView != null) {
                Drawable drawable = profileCoinFlipView.A03.getDrawable();
                String str2 = null;
                if ((drawable instanceof C59921Jbk) && (jbk = (C59921Jbk) drawable) != null) {
                    str2 = jbk.A0D;
                }
                if (!str.equals(str2)) {
                    DbS.A0G(profileCoinFlipView, R.id.avatar).setScaleType(ImageView.ScaleType.FIT_XY);
                    profileCoinFlipView.setAvatarImageDrawable(C318956po.A00(r4, str, 0.0f));
                    DbU.A12(r4.A04, profileCoinFlipView, 2131961430);
                }
            }
        }
    }

    public static void A0M(C46656Dib dib, String str, String str2, Map map) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = dib.A1G;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl(str, "edit_profile", str2, (String) null, (String) null, map, (Map) null, (Map) null));
        }
    }

    public static void A0N(C46656Dib dib, boolean z) {
        View view = dib.mView;
        if (view != null) {
            int i = 0;
            view.requireViewById(R.id.edit_profile_fields).setVisibility(DbW.A01(z ? 1 : 0));
            View requireViewById = dib.mView.requireViewById(R.id.loading_spinner);
            if (z) {
                i = 8;
            }
            requireViewById.setVisibility(i);
        }
    }

    private boolean A0O() {
        F1D f1d = this.A0e;
        if (f1d == null || C49020Enw.A00(this.A0V, f1d) == AnonymousClass05K.A00) {
            return false;
        }
        return true;
    }

    private boolean A0P() {
        F1D f1d = this.A0e;
        if (f1d == null || C49020Enw.A00(this.A0V, f1d) != AnonymousClass05K.A01) {
            return false;
        }
        return true;
    }

    public static boolean A0Q(C46656Dib dib) {
        C46478Dfh dfh = dib.A0U;
        if (dfh == null || !TextUtils.isEmpty(dfh.A02) || !dib.A0q.A2K()) {
            return false;
        }
        return true;
    }

    public final AiStudioProfileBannerModel Aaa() {
        C46765Dks dks = this.A0g;
        if (dks == null) {
            return null;
        }
        return (AiStudioProfileBannerModel) DbT.A0G(dks.A02).A02();
    }

    public final View.OnClickListener B8P() {
        return new FPC(this, 18);
    }

    public final /* bridge */ /* synthetic */ G98 Bgm() {
        return this.A1M;
    }

    public final View.OnClickListener CD3() {
        return this.A1P;
    }

    public final void afterOnViewCreated() {
        if (this.A0h != null) {
            UserSession userSession = this.A0V;
            0qQ.A0B(userSession, 1);
            if (DcE.A06(userSession, true)) {
                DdZ ddZ = this.A0h;
                C51647Fy6.A02(ddZ, C318116oQ.A00(ddZ), 45);
            }
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A0V;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        DbZ.A1P(this, 8);
        super.onConfigurationChanged(configuration);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A03 = view;
        ScrollView scrollView = (ScrollView) view.requireViewById(R.id.edit_profile_fields);
        this.A0D = scrollView;
        if (this.A11) {
            scrollView.setFillViewport(true);
        }
        this.A1F = (ConstraintLayout) view.requireViewById(R.id.profile_pic_and_avatar_container);
        this.A0Y = DbT.A0b(view, R.id.profile_pic_imageview);
        this.A0X = DbU.A0X(view, R.id.profile_pic_birthday_confetti_imageview);
        this.A1H = (IgFrameLayout) view.requireViewById(R.id.profile_pic_wrapper);
        this.A1F.setVisibility(DbW.A00(this.A11 ? 1 : 0));
        AnonymousClass3NG r5 = new AnonymousClass3NG(this.A0Y);
        r5.A0C = true;
        r5.A07 = true;
        r5.A04 = new C64850LjC(this, 5);
        r5.A00();
        TitleTextView titleTextView = (TitleTextView) view.requireViewById(R.id.change_avatar_button);
        this.A0W = titleTextView;
        2eS.A01(titleTextView);
        TitleTextView titleTextView2 = this.A0W;
        Context requireContext = requireContext();
        int i = 2131961498;
        if (DcE.A05(this.A0V)) {
            i = 2131954991;
        }
        titleTextView2.setText(requireContext.getText(i));
        this.A0W.setTextAppearance(requireContext(), R.style.igds_emphasized_body_1);
        TitleTextView titleTextView3 = this.A0W;
        boolean z = 1QE.A0E().A00;
        Context requireContext2 = requireContext();
        DbT.A17(requireContext2, titleTextView3, DbZ.A00(requireContext2, this, z ? 1 : 0));
        this.A0W.setVisibility(DbW.A00(this.A11 ? 1 : 0));
        A05(this.A0W, this);
        FPC.A02(this.A0W, this, 4);
        this.A0L = DbU.A0G(view, R.id.email);
        this.A0M = DbU.A0G(view, R.id.phone);
        this.A1J = DbT.A0d(view, R.id.gender);
        View requireViewById = view.requireViewById(R.id.edit_personal_ads_link);
        this.A02 = requireViewById;
        requireViewById.setVisibility(8);
        this.A05 = DbU.A0D(view, R.id.account_category_stub);
        this.A0B = DbU.A0D(view, R.id.featured_accounts_stub);
        this.A19 = DbU.A0D(view, R.id.business_category_stub);
        this.A1A = DbU.A0D(view, R.id.collab_status_stub);
        this.A0A = DbU.A0D(view, R.id.diversity_info_stub);
        this.A06 = DbU.A0D(view, R.id.business_contact_stub);
        this.A08 = DbU.A0D(view, R.id.business_profile_display_stub);
        this.A1C = DbU.A0D(view, R.id.professional_profile_music_settings_stub);
        this.A1B = DbU.A0D(view, R.id.personal_profile_music_settings_stub);
        this.A1D = DbU.A0D(view, R.id.school_settings_stub);
        this.A01 = view.requireViewById(R.id.business_conversion_section);
        this.A07 = DbU.A0D(view, R.id.business_page_stub);
        TextView A0G2 = DbU.A0G(view, R.id.business_header);
        this.A0F = A0G2;
        2eQ.A03(A0G2);
        this.A09 = DbU.A0D(view, R.id.business_support_links_stub);
        this.A1K = (ImageWithTitleTextView) view.requireViewById(R.id.confirm_your_email);
        this.A1L = (ImageWithTitleTextView) view.requireViewById(R.id.confirm_your_phone_number);
        this.A0I = DbU.A0G(view, R.id.profile_data_transparency);
        FPC.A02(this.A0L, this, 5);
        FPC.A02(this.A0M, this, 6);
        if (this.A0e != null) {
            A0I(this);
            A0N(this, true);
        } else {
            A0N(this, false);
        }
        if (FFT.A03(this.A0V, this.A0q)) {
            UserSession userSession = this.A0V;
            C47691EDa.A00(this, C318486p2.A08(userSession, userSession.A06), 22);
            this.A0B.setVisibility(0);
            this.A0u = AnonymousClass7TE.A1C();
            ListView listView = (ListView) this.A03.requireViewById(R.id.featured_accounts_list_view);
            this.A0C = listView;
            listView.setAdapter(this.A0i);
            W11.A00(this.A0C);
        }
        String AXr = this.A0q.A03.AXr();
        if (!(AXr == null || AXr.length() == 0)) {
            this.A05.setVisibility(0);
            View requireViewById2 = this.A03.requireViewById(R.id.account_category);
            TextView A0G3 = DbU.A0G(requireViewById2, R.id.account_category_text);
            this.A0E = A0G3;
            A0G3.setText(this.A0q.A03.AXr());
            FPC.A02(requireViewById2, this, 12);
        }
        if (!DcE.A05(this.A0V)) {
            this.A0h = new 2YN(new C46455DfJ(this.A0V, "edit_profile"), requireActivity()).A00(DdZ.class);
        }
        this.A0P = DbW.A0F(this).A00(AnonymousClass2kB.class);
        if (!DcE.A05(this.A0V)) {
            C252063oV r3 = this.A0b;
            if (r3 == null) {
                r3 = DbU.A0Z(this.A03, R.id.avatar_view_stub);
                this.A0b = r3;
            }
            this.A0b = r3;
            r3.setVisibility(0);
            UserSession userSession2 = this.A0V;
            if (182.A06(DbS.A0J(userSession2, 0), userSession2, 36315937058393805L)) {
                ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(this.A0b.getView());
                A0D2.topMargin -= DbU.A05(this.A0b.getView()).getDimensionPixelSize(R.dimen.edit_profile_frame_pop_offset);
                this.A0b.getView().setLayoutParams(A0D2);
            }
        }
        this.A0l = A01(this);
        if (DcE.A05(this.A0V)) {
            C252063oV r32 = this.A0b;
            if (r32 != null) {
                r32.getView().setVisibility(8);
            }
        } else {
            this.A0l.A02();
            UserSession userSession3 = this.A0l.A09;
            if (!0qQ.A0K(25x.A00(userSession3).A01.A00, C299715vi.A00) && !26G.A00(userSession3).A00.getBoolean("has_seen_avatar_upsell_dialog_in_edit_profile", false) && !C324536zU.A00(userSession3)) {
                C318956po r52 = this.A0l;
                Activity activity = (Activity) r52.A0C.get();
                if (activity != null) {
                    C48368EdP.A00(activity, (DialogInterface.OnClickListener) null, (DialogInterface.OnDismissListener) null, r52.A07, r52.A09, "ig_edit_profile", AnonymousClass000.A00(638), 2131956847);
                }
                DbX.A1V(26G.A00(r52.A09).A00, "has_seen_avatar_upsell_dialog_in_edit_profile", true);
            }
        }
        if (!DcE.A05(this.A0V)) {
            UserSession userSession4 = this.A0V;
            0qQ.A0B(userSession4, 1);
            if (DcE.A06(userSession4, true)) {
                this.A0S = (ProfileCoinFlipView) DbY.A0S(this.A03, R.id.profile_coin_flip_view_stub).A01().findViewById(R.id.profile_coin_flip_view);
            }
            DdZ ddZ = this.A0h;
            if (ddZ != null) {
                C50139FQw.A01(getViewLifecycleOwner(), ddZ.A02, this, 35);
            }
            DdZ ddZ2 = this.A0h;
            if (ddZ2 != null) {
                C50139FQw.A01(getViewLifecycleOwner(), ddZ2.A00, this, 34);
            }
        }
        AnonymousClass2kB r6 = this.A0P;
        r6.getClass();
        Context requireContext3 = requireContext();
        UserSession userSession5 = this.A0V;
        C319076q0.A02(requireContext3, getViewLifecycleOwner(), this.A0O, r6, userSession5, A01(this), "ig_edit_profile", new C51586Fwa(this, 10), new C51586Fwa(this, 11), new C51592Fwg(this, 1), new C51593Fwh(this, 1));
        C46765Dks dks = this.A0g;
        UserSession userSession6 = this.A0V;
        if (182.A06(DbS.A0J(userSession6, 0), userSession6, 36325145467630208L) && dks != null) {
            dks.A00();
            C50139FQw.A01(getViewLifecycleOwner(), DbT.A0G(dks.A02), this, 33);
        }
        0qQ.A0B(this.A0V, 0);
        C50215FTv fTv = new C50215FTv(this, 2);
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getSupportFragmentManager().A0v(new C50129FQm(fTv, 3), requireActivity, "page_linking_request");
        A03();
        if (this.A11) {
            DbX.A1D(this.A03, R.id.edit_profile_divider, 8);
            DbX.A1D(this.A03, R.id.edit_profile_fields_bottom_divider, 8);
            View view2 = DbV.A0T(this.A03, R.id.complete_your_profile_headline_stubs, false).getView();
            IgdsHeadline igdsHeadline = (IgdsHeadline) view2.findViewById(R.id.complete_your_profile_headline_title);
            if (igdsHeadline != null) {
                igdsHeadline.setHeadline(2131956473);
                igdsHeadline.setBody(2131956472);
                igdsHeadline.setCircularImageUrl(DbX.A0X(this.A0V), (String) null);
            }
            View findViewById = view2.findViewById(R.id.take_photo_button);
            if (findViewById != null) {
                AnonymousClass0fU.A00(new FPD(this, 69), findViewById);
            }
            View findViewById2 = view2.findViewById(R.id.camera_roll_button);
            if (findViewById2 != null) {
                AnonymousClass0fU.A00(new FPD(this, 70), findViewById2);
            }
            view2.setVisibility(0);
            View view3 = DbV.A0T(this.A03, R.id.complete_your_profile_bottom_buttons_stubs, false).getView();
            View findViewById3 = view3.findViewById(R.id.finish_button);
            if (findViewById3 != null) {
                FPC.A02(findViewById3, this, 19);
            }
            A06(this);
            View findViewById4 = view3.findViewById(R.id.skip_button);
            if (findViewById4 != null) {
                FPC.A02(findViewById4, this, 19);
            }
            view3.setVisibility(0);
        }
    }

    public static String A02(Context context, CharSequence charSequence, int i) {
        String string = context.getString(i);
        if (TextUtils.isEmpty(charSequence)) {
            return string;
        }
        return StringFormatUtil.formatStrLocaleSafe("%s, %s", charSequence, string);
    }

    private void A03() {
        C71662eb r0;
        int i;
        int i2;
        if ((A0O() || A0P()) && this.mView != null) {
            i = 0;
            if (this.A1I == null) {
                C71662eb A0S2 = DbY.A0S(this.A03, R.id.open_ac_profile_detail_stub);
                this.A1I = A0S2;
                IgdsBanner igdsBanner = (IgdsBanner) A0S2.A01();
                int intValue = C49020Enw.A00(this.A0V, this.A0e).intValue();
                if (intValue != 2) {
                    if (intValue == 1) {
                        igdsBanner.setBody(2131968926);
                        i2 = 2131968922;
                    }
                    igdsBanner.A00 = new C50468FcG(this, 8);
                    C319976rX.A0B(DbS.A0O("nme_profile_editing_banner"), this.A0V, false);
                } else {
                    int i3 = 2131968924;
                    if (DbY.A1Y(0Tu.A05, this.A0V, 36321627889215077L)) {
                        i3 = 2131968925;
                    }
                    igdsBanner.setBody(i3);
                    i2 = 2131968923;
                }
                igdsBanner.setAction(i2);
                igdsBanner.A00 = new C50468FcG(this, 8);
                C319976rX.A0B(DbS.A0O("nme_profile_editing_banner"), this.A0V, false);
            }
            r0 = this.A1I;
            if (r0 == null) {
                return;
            }
        } else {
            r0 = this.A1I;
            if (r0 != null) {
                i = 8;
            } else {
                return;
            }
        }
        r0.A03(i);
    }

    public static void A0B(C46656Dib dib) {
        C318956po r0;
        if ((dib.A0P() && DcE.A05(dib.A0V)) || (r0 = dib.A0l) == null) {
            return;
        }
        if (r0.A06()) {
            dib.A0l.A04(dib.requireActivity());
            return;
        }
        UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB;
        UserSession userSession = dib.A0V;
        0qQ.A0B(userSession, 1);
        C46655Dia A002 = C48367EdO.A00(updateProfilePicturePagerAdapter$UpdateProfileTabType, userSession, "ig_edit_profile", dib.A0v, !dib.A0P(), true);
        C331127Pr A0W2 = DbS.A0W(dib.A0V);
        A0W2.A0f = C46655Dia.__redex_internal_original_name;
        DbY.A13(dib, A002, A0W2);
    }

    public static void A0K(C46656Dib dib, String str) {
        FFO.A02(dib.requireContext(), dib.A0V, str);
    }

    public final boolean CRf() {
        return !A0O();
    }

    public final boolean CRi() {
        return !A0O();
    }

    public final void ExB(Intent intent, int i) {
        if (getContext() != null && C250563lf.A0o(getContext(), intent)) {
            0kR.A05(this, intent, i);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r5) {
        String string;
        if (getActivity() != null) {
            ? obj = new Object();
            if (this.A11) {
                string = "";
            } else {
                string = DbV.A05(this).getString(2131961474);
            }
            obj.A02 = string;
            this.A0N = C59904JbT.A00(new FPC(this, 0), r5, obj);
            if (!this.A11) {
                r5.Eu4(true);
                DbX.A1A(new FPC(this, 19), DbV.A0K(), r5);
            } else {
                r5.Eu4(false);
                AnonymousClass3JR A0K2 = DbS.A0K();
                A0K2.A0F = new AnonymousClass3JS(requireContext(), R.drawable.instagram_settings_pano_outline_24);
                A0K2.A05 = 2131966173;
                DbX.A19(new FPC(this, 13), A0K2, r5);
            }
            if (this.A0e == null) {
                r5.setIsLoading(this.A13);
                this.A0N.setBackground((Drawable) null);
                this.A0N.setButtonResource(R.drawable.instagram_arrow_cw_pano_outline_24);
            }
            this.A0N.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: X.0iw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r0 = -2085351862(0xffffffff83b40e4a, float:-1.058273E-36)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r0 = r22
            r3 = r23
            X.C46656Dib.super.onCreate(r3)
            android.os.Bundle r4 = r0.requireArguments()
            com.instagram.common.session.UserSession r2 = X.DbX.A0U(r0)
            r0.A0V = r2
            java.lang.String r2 = "edit_profile_entry"
            java.lang.String r2 = X.DbU.A0l(r4, r2)
            r0.A0t = r2
            java.lang.String r2 = "is_complete_your_profile"
            r12 = 0
            boolean r2 = r4.getBoolean(r2, r12)
            r0.A11 = r2
            com.instagram.common.session.UserSession r6 = r0.A0V
            X.0gy r5 = X.AnonymousClass07i.A00(r0)
            boolean r4 = r0.A11
            com.instagram.profile.edit.controller.EditProfileFieldsController r2 = new com.instagram.profile.edit.controller.EditProfileFieldsController
            r2.<init>(r5, r6, r4)
            r0.A0j = r2
            r0.registerLifecycleListener(r2)
            com.instagram.common.session.UserSession r2 = r0.A0V
            com.instagram.user.model.User r2 = X.DbT.A0j(r2)
            r0.A0q = r2
            com.instagram.common.session.UserSession r2 = r0.A0V
            X.9F7 r4 = X.DbV.A0O(r2)
            java.lang.Class<X.Dib> r2 = X.C46656Dib.class
            com.facebook.common.callercontext.CallerContext r6 = com.facebook.common.callercontext.CallerContext.A00(r2)
            r2 = 302(0x12e, float:4.23E-43)
            java.lang.String r7 = X.C273654mx.A00(r2)
            java.lang.String r8 = "ig_edit_profile"
            java.lang.String r9 = "edit_profile"
            java.lang.String r10 = "loading"
            X.9JK r5 = new X.9JK
            r5.<init>((com.facebook.common.callercontext.CallerContext) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10)
            java.lang.Object r2 = r4.Au3(r5)
            X.Dfh r2 = (X.C46478Dfh) r2
            r0.A0U = r2
            X.DbY.A0t()
            com.instagram.common.session.UserSession r5 = r0.A0V
            X.6qr r4 = X.C319586qr.EDIT_PROFILE
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = X.C319596qs.A00(r4, r0, r5, r2)
            r0.A1G = r2
            com.instagram.common.session.UserSession r2 = r0.A0V
            X.6ve r2 = X.C322316vd.A00(r2)
            r0.A0m = r2
            r7 = 1
            r0.setRetainInstance(r7)
            boolean r2 = X.AnonymousClass36O.A0G
            com.instagram.common.session.UserSession r10 = r0.A0V
            X.0hq r9 = X.DbV.A0I(r0)
            com.instagram.user.model.User r8 = r0.A0q
            r2 = 2
            X.FTY r5 = new X.FTY
            r5.<init>(r0, r2)
            java.lang.Integer r20 = X.AnonymousClass05K.A0s
            r2 = 4
            X.Fwb r4 = new X.Fwb
            r4.<init>(r0, r2)
            int r6 = X.DbW.A03(r7, r10, r9)
            X.0qQ.A0B(r8, r2)
            r13 = 0
            X.36O r2 = new X.36O
            r17 = r5
            r18 = r10
            r19 = r8
            r21 = r4
            r14 = r2
            r15 = r0
            r16 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r0.A0O = r2
            com.instagram.common.session.UserSession r5 = r0.A0V
            android.content.Context r4 = r0.requireContext()
            X.Ewj r2 = new X.Ewj
            r2.<init>(r5, r4)
            r0.A0k = r2
            if (r23 == 0) goto L_0x00d1
            java.lang.String r2 = "bundle_request_business_pages_from_ux_flow"
            boolean r2 = r3.getBoolean(r2, r12)
            r0.A16 = r2
            r0.A18 = r3
        L_0x00d1:
            android.content.Context r3 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = r0.A0V
            X.36U r2 = X.AnonymousClass36R.A00(r3, r2, r0)
            r0.A0c = r2
            A0C(r0)
            X.1YN r8 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r5 = r0.A0V
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            com.instagram.quickpromotion.intf.QPTooltipAnchor r3 = com.instagram.quickpromotion.intf.QPTooltipAnchor.PROFILE_ACTIONS_ROW
            X.Fhf r2 = new X.Fhf
            r2.<init>()
            r4.put(r3, r2)
            X.2qT r4 = r8.A04(r5, r4)
            r0.A0o = r4
            X.1YN r14 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r3 = r0.A0V
            com.instagram.quickpromotion.intf.QuickPromotionSlot r19 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0Q
            X.AnonymousClass2bO.A00()
            X.IWV r2 = new X.IWV
            r2.<init>(r0, r7)
            X.2bW r18 = X.2bV.A06(r2, r4)
            r16 = r0
            r17 = r3
            X.2qi r2 = r14.A01(r15, r16, r17, r18, r19)
            r0.A0n = r2
            com.instagram.common.session.UserSession r5 = r0.A0V
            java.lang.String r4 = X.AnonymousClass7TF.A0b()
            java.lang.String r3 = r0.A0t
            X.FFo r2 = new X.FFo
            r2.<init>(r0, r5, r4, r3)
            r0.A0T = r2
            X.E8u r2 = new X.E8u
            r2.<init>(r0, r0)
            r0.A0i = r2
            com.instagram.common.session.UserSession r3 = r0.A0V
            com.instagram.user.model.User r2 = r0.A0q
            java.util.ArrayList r8 = X.FFT.A01(r3, r2)
            X.E8u r7 = r0.A0i
            java.util.List r5 = r7.A00
            r5.clear()
            java.util.Iterator r4 = r8.iterator()
        L_0x0141:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0154
            com.instagram.user.model.User r3 = X.DbT.A0k(r4)
            X.Ewi r2 = new X.Ewi
            r2.<init>(r3)
            r5.add(r2)
            goto L_0x0141
        L_0x0154:
            X.C47582E8u.A00(r7)
            com.instagram.common.session.UserSession r3 = r0.A0V
            com.instagram.user.model.User r2 = r0.A0q
            boolean r2 = X.FFT.A03(r3, r2)
            if (r2 == 0) goto L_0x016f
            com.instagram.common.session.UserSession r2 = r0.A0V
            X.0qQ.A0B(r2, r12)
            X.1OC r3 = X.C320126ro.A03(r2, r8)
            r2 = 21
            X.C47691EDa.A00(r0, r3, r2)
        L_0x016f:
            com.instagram.common.session.UserSession r2 = r0.A0V
            com.instagram.music.profile.musiconprofile.MusicOnProfileProvider r2 = X.C322306va.A00(r2)
            X.2Fj r3 = r2.A01
            r2 = 32
            X.C50139FQw.A00(r0, r3, r2)
            com.instagram.common.session.UserSession r2 = r0.A0V
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r2)
            java.lang.Class<X.FWV> r3 = X.FWV.class
            X.1wn r2 = r0.A1S
            r4.A01(r2, r3)
            java.lang.Class<X.FWX> r3 = X.FWX.class
            X.1wn r2 = r0.A1V
            r4.A01(r2, r3)
            java.lang.Class<X.3DP> r3 = X.AnonymousClass3DP.class
            X.1wn r2 = r0.A1W
            r4.A01(r2, r3)
            java.lang.Class<X.FWe> r3 = X.C50273FWe.class
            X.1wn r2 = r0.A1T
            r4.A01(r2, r3)
            java.lang.Class<X.FWP> r3 = X.FWP.class
            X.1wn r2 = r0.A1X
            r4.A01(r2, r3)
            java.lang.Class<X.INe> r3 = X.C57064INe.class
            X.1wn r2 = r0.A1Y
            r4.A01(r2, r3)
            java.lang.Class<X.2Cy> r3 = X.2Cy.class
            X.1wn r2 = r0.A1Z
            r4.A01(r2, r3)
            java.lang.Class<X.FWb> r3 = X.C50270FWb.class
            X.27S r2 = r0.A1R
            r4.A01(r2, r3)
            java.lang.Class<X.FWW> r3 = X.FWW.class
            X.1wn r2 = r0.A1U
            r4.A01(r2, r3)
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            android.content.Context r3 = r0.requireContext()
            android.content.Context r2 = r0.requireContext()
            int r2 = X.2Yu.A0C(r2)
            int r2 = r3.getColor(r2)
            X.AnonymousClass2uJ.A04(r4, r2)
            com.instagram.common.session.UserSession r5 = r0.A0V
            X.DE2.A00 = r13
            X.EZm r3 = X.C48144EZm.EDIT_PHOTO_REMINDER
            r2 = 3876(0xf24, float:5.431E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.FGS.A02(r3, r5, r2)
            X.CH5 r4 = new X.CH5
            r4.<init>(r6)
            X.0Tu r6 = X.0Tu.A05
            r2 = 36314485361412706(0x8103d5002b0a62, double:3.028764997028419E-306)
            boolean r2 = X.182.A06(r6, r5, r2)
            if (r2 == 0) goto L_0x0277
            X.2IS r3 = X.C41845B3m.A04()
            X.2IS r2 = X.C41845B3m.A04()
            X.1vR r7 = X.C41845B3m.A05()
            java.util.Map r9 = r3.getParamsCopy()
            java.util.Map r10 = r2.getParamsCopy()
            java.lang.Class<X.CCb> r11 = X.C43757CCb.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGFxIdentityManagementQuery"
            java.lang.String r16 = "business_presence"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.DbZ.A1M(r6, r4, r5)
        L_0x0221:
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.Class<X.DqT> r4 = X.C47092DqT.class
            java.lang.String r2 = "FxSettingsPersonalDetailsShouldShowInAc"
            X.3Fa r3 = new X.3Fa
            r3.<init>(r5, r4, r2, r12)
            com.instagram.common.session.UserSession r2 = r0.A0V
            X.1OC r3 = X.C46479Dfi.A00(r3, r2)
            r2 = 27
            X.C47691EDa.A00(r0, r3, r2)
            java.lang.String r2 = "contact_point_update"
            X.0xG r6 = X.DbS.A0O(r2)
            X.1pZ r5 = X.AnonymousClass1pc.A00()
            com.instagram.common.session.UserSession r4 = r0.A0V
            android.content.Context r3 = r0.requireContext()
            X.HMr r2 = X.C54660HMr.EDIT_PROFILE
            r5.CnQ(r3, r6, r4, r2)
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            com.instagram.common.session.UserSession r3 = r0.A0V
            X.EEm r2 = new X.EEm
            r2.<init>(r3)
            X.2YN r3 = new X.2YN
            r3.<init>(r2, r4)
            java.lang.Class<X.Dks> r2 = X.C46765Dks.class
            X.2YL r2 = r3.A00(r2)
            X.Dks r2 = (X.C46765Dks) r2
            r0.A0g = r2
            com.instagram.common.session.UserSession r2 = r0.A0V
            boolean r2 = X.C324536zU.A00(r2)
            r0.A0y = r2
            r0 = 1757777248(0x68c58d60, float:7.463313E24)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x0277:
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.Class<X.BAC> r6 = X.BAC.class
            java.lang.String r2 = "IGFxIdentityManagementQuery"
            X.3Fa r3 = new X.3Fa
            r3.<init>(r7, r6, r2, r12)
            X.3Fb r2 = X.C46479Dfi.A01(r5)
            r2.A08(r3)
            X.1OC r2 = r2.A06()
            r2.A00 = r4
            X.1ES.A03(r2)
            goto L_0x0221
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46656Dib.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-371930103);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_edit_profile);
        ViewStub A0D2 = DbU.A0D(A0C2, R.id.edit_profile_fields_stub);
        A0D2.setLayoutResource(R.layout.edit_profile_fields);
        registerLifecycleListener(this.A0o);
        this.A0j.A0C(A0D2.inflate(), requireActivity(), getViewLifecycleOwner(), this, this.A0q, true, true);
        AnonymousClass0fD.A09(-1519778800, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-2106841943);
        1Ng A002 = AnonymousClass1Nd.A00(this.A0V);
        A002.A02(this.A1S, FWV.class);
        A002.A02(this.A1V, FWX.class);
        A002.A02(this.A1W, AnonymousClass3DP.class);
        A002.A02(this.A1T, C50273FWe.class);
        A002.A02(this.A1X, FWP.class);
        A002.A02(this.A1Y, C57064INe.class);
        A002.A02(this.A1Z, 2Cy.class);
        A002.A02(this.A1R, C50270FWb.class);
        A002.A02(this.A1U, FWW.class);
        super.onDestroy();
        AnonymousClass0fD.A09(1515525636, A022);
    }

    public final void onDestroyView() {
        C319656qy r1;
        int A022 = AnonymousClass0fD.A02(1782103383);
        super.onDestroyView();
        C66631pj.A00();
        UserSession userSession = this.A0V;
        String id = this.A0q.getId();
        MUW muw = this.A1N;
        DbY.A1S(userSession, muw);
        Map map = C63496Ky2.A00(userSession).A01;
        Set set = (Set) map.get(id);
        if (set == null) {
            set = DbS.A0y();
        }
        set.remove(muw);
        map.put(id, set);
        unregisterLifecycleListener(this.A0o);
        C318956po r0 = this.A0l;
        if (!(r0 == null || (r1 = r0.A0B) == null)) {
            ((2cs) r1.A02.getValue()).A00();
            ((2cs) r1.A03.getValue()).A00();
        }
        C321266tq r02 = this.A0Q;
        if (r02 != null) {
            r02.A03();
        }
        AnonymousClass73C A002 = AnonymousClass73B.A00(this.A0V);
        if (A002 != null && A002.A00) {
            A002.A03.markerEnd(129898941, 3);
            A002.A00 = false;
        }
        this.A0l = null;
        this.A0D = null;
        this.A0Y = null;
        this.A0X = null;
        this.A0W = null;
        this.A0L = null;
        this.A0M = null;
        this.A1J = null;
        this.A1K = null;
        this.A1L = null;
        this.A0p = null;
        this.A0I = null;
        this.A0N = null;
        this.A04 = null;
        this.A0B = null;
        this.A02 = null;
        this.A0A = null;
        this.A0K = null;
        this.A0J = null;
        this.A0b = null;
        this.A1F = null;
        this.A1I = null;
        this.A0Z = null;
        this.A1H = null;
        this.A1A = null;
        this.A0H = null;
        this.A0S = null;
        AnonymousClass0fD.A09(-1535535603, A022);
    }

    public final void onPause() {
        Window window;
        Window window2;
        int A022 = AnonymousClass0fD.A02(-1995793765);
        C46656Dib.super.onPause();
        if (!(getRootActivity() == null || (window2 = getRootActivity().getWindow()) == null)) {
            window2.setSoftInputMode(48);
        }
        DbZ.A1P(this, 0);
        if (!(getRootActivity() == null || (window = getRootActivity().getWindow()) == null)) {
            0nA.A0N(window.getDecorView());
        }
        AnonymousClass0fD.A09(-38924602, A022);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, androidx.fragment.app.Fragment, X.Dib, X.4DH] */
    public final void onResume() {
        Boolean BvD;
        Window window;
        int A022 = AnonymousClass0fD.A02(-1176107272);
        super.onResume();
        if (!(getRootActivity() == null || (window = getRootActivity().getWindow()) == null)) {
            window.setSoftInputMode(16);
        }
        DbZ.A1P(this, DbW.A01(this.A11 ? 1 : 0));
        if (this.A11 || 2Ek.A01(this.A0q) || AnonymousClass431.A00(this.A0V) || (BvD = this.A0q.A03.BvD()) == null || !BvD.booleanValue()) {
            this.A01.setVisibility(8);
        } else {
            this.A01.setVisibility(0);
            TextView A0G2 = DbU.A0G(this.A01, R.id.business_conversion_entry);
            if (A0G2 != null) {
                2eS.A01(A0G2);
            }
            CallerContext callerContext = FRZ.A00;
            boolean z = 1QE.A0E().A00;
            Context requireContext = requireContext();
            DbT.A17(requireContext, A0G2, DbZ.A00(requireContext, this, z ? 1 : 0));
            A0G2.setText(2131974883);
            A05(A0G2, this);
            FPC.A02(A0G2, this, 7);
        }
        A0J(this);
        A04();
        A0D(this);
        A0E(this);
        if (this.A0w || this.A14 || this.A15 || this.A0x) {
            this.A0w = false;
            this.A14 = false;
            this.A15 = false;
            this.A0x = false;
            A0C(this);
        }
        this.A0O.A02();
        UserSession userSession = this.A0V;
        C228602lw A0Q2 = DbW.A0Q(requireContext(), this);
        0qQ.A0B(userSession, 0);
        User A0Q3 = AnonymousClass7TF.A0Q(userSession);
        1NY A0b2 = AnonymousClass7TG.A0b(userSession);
        A0b2.A0A("fundraiser/can_create_personal_fundraisers/");
        1OC A0R2 = DbT.A0R((15p) null, A0b2, C47318Dul.class, F4U.class, false);
        C47696EDf.A01(A0R2, A0Q3, 55);
        A0Q2.schedule(A0R2);
        UserSession userSession2 = this.A0V;
        String valueOf = String.valueOf(this.A0q.A03.getFbidV2());
        F9X.A00 = null;
        F9X.A01(new EBP(), userSession2, valueOf);
        A06(this);
        AnonymousClass0fD.A09(-1564452687, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.A0L;
        if (textView != null) {
            bundle.putString("bundle_email_field", DbV.A0x(textView));
        }
        TextView textView2 = this.A0M;
        if (textView2 != null) {
            bundle.putString("bundle_phone_field", DbV.A0x(textView2));
        }
        bundle.putBoolean("bundle_saved_change", this.A10);
        bundle.putBoolean("bundle_request_business_pages_from_ux_flow", this.A16);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-2144183342);
        C46656Dib.super.onStart();
        this.A0D.getViewTreeObserver().addOnScrollChangedListener(this.A1Q);
        AnonymousClass0fD.A09(1692158595, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1616910401);
        C46656Dib.super.onStop();
        this.A0D.getViewTreeObserver().removeOnScrollChangedListener(this.A1Q);
        AnonymousClass0fD.A09(-1293846262, A022);
    }
}
