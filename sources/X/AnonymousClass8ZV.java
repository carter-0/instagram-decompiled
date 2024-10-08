package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.android.R;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.mediapicker.Folder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8ZV  reason: invalid class name */
public final class AnonymousClass8ZV extends AnonymousClass4DH implements C267834cI, C267844cJ, AnonymousClass4DR, AnonymousClass8ZW, C267854cK, AnonymousClass8ZX, C267864cL, C267874cM, AnonymousClass8ZY, AnonymousClass8ZZ, C267884cN {
    public static final String __redex_internal_original_name = "GalleryPickerFragment";
    public int A00 = 10;
    public 28D A01 = 28D.A5J;
    public AnonymousClass4MS A02;
    public JWG A03;
    public C361508gL A04;
    public C41776B0f A05;
    public JW7 A06;
    public JWH A07;
    public JW9 A08;
    public C41817B1x A09;
    public C3499582p A0A;
    public 1ua A0B;
    public C41781B0k A0C;
    public File A0D;
    public AtomicInteger A0E;
    public boolean A0F;
    public AnonymousClass9Q1 A0G;
    public C231002qi A0H;
    public boolean A0I;
    public final AnonymousClass0eM A0J;
    public final 1wn A0K = new AnonymousClass9Q4(this);
    public final String A0L;
    public final AnonymousClass0eM A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        if (r1 != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cuz(android.view.View r6, X.C361528gN r7) {
        /*
            r5 = this;
            r0 = 1
            X.0qQ.A0B(r6, r0)
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.JbO r1 = X.JZM.A00(r0)
            java.util.List r0 = r5.getFolders()
            r1.A0G(r0)
            com.instagram.common.session.UserSession r2 = r5.getSession()
            X.0Tu r4 = X.0Tu.A05
            r0 = 36316662907015732(0x8105d000001234, double:3.030142085636045E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r3 = r5.getSession()
            java.lang.String r2 = "posts"
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 501(0x1f5, float:7.02E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            X.AnonymousClass9PQ.A08(r5, r3, r1, r2, r0)
        L_0x0038:
            X.8gL r3 = r5.A04
            com.instagram.common.session.UserSession r1 = r5.getSession()
            X.8jC r0 = X.C363138jC.A00
            boolean r0 = X.C394259xn.A00(r1, r0)
            if (r0 == 0) goto L_0x0088
            if (r3 == 0) goto L_0x0074
            com.instagram.creation.base.CreationSession r0 = r5.AsK()
            boolean r0 = r0.A0M
            if (r0 != 0) goto L_0x0054
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x0063
        L_0x0054:
            com.instagram.common.session.UserSession r2 = r5.getSession()
            r0 = 36328834844409460(0x8110e200013e74, double:3.0378396678562964E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 != 0) goto L_0x006e
        L_0x0063:
            X.JW7 r0 = r5.A06
            if (r0 == 0) goto L_0x0096
            boolean r1 = r0.A0b()
            r0 = 0
            if (r1 == 0) goto L_0x006f
        L_0x006e:
            r0 = 1
        L_0x006f:
            r0 = r0 ^ 1
            r3.A01(r6, r7, r0)
        L_0x0074:
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.27r r1 = X.27p.A01(r0)
            X.JW7 r0 = r5.A06
            if (r0 == 0) goto L_0x0096
            java.util.List r0 = r0.getFolders()
            r1.A20(r0)
            return
        L_0x0088:
            if (r3 == 0) goto L_0x0074
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.LG7 r0 = (X.LG7) r0
            r0.A02(r3)
            goto L_0x0074
        L_0x0096:
            java.lang.String r0 = "galleryPickerView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ZV.Cuz(android.view.View, X.8gN):void");
    }

    public final void DCn(Exception exc) {
    }

    public final void DCx(Exception exc) {
        JW1.A00(getSession()).A0A(false, exc.getMessage());
    }

    public final void DHY(JW7 jw7, float f) {
    }

    public final void DSA(C357268Xf r2) {
        0qQ.A0B(r2, 0);
        JW7 jw7 = this.A06;
        if (jw7 == null) {
            0qQ.A0F("galleryPickerView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            jw7.DSA(r2);
        }
    }

    public final boolean DX6(Folder folder) {
        0qQ.A0B(folder, 0);
        0xI A002 = C59882Jb5.A00(AnonymousClass05K.A06);
        A002.A0C(AnonymousClass000.A00(1369), folder.A00());
        Set set = folder.A05;
        A002.A08(Integer.valueOf(set.size()), AnonymousClass000.A00(3138));
        C60510iO.A00(getSession()).EFq(A002);
        JZM.A00(getSession()).A0F(getFolders());
        int i = folder.A02;
        if (i == -5) {
            Context context = getContext();
            if (context != null) {
                File A042 = 0mb.A04(context);
                this.A0D = A042;
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    FFa.A02(activity, A042, 10002);
                }
            }
        } else if (!set.isEmpty()) {
            JW7 jw7 = this.A06;
            if (jw7 == null) {
                0qQ.A0F("galleryPickerView");
                throw AnonymousClass00P.createAndThrow();
            }
            jw7.setCurrentFolderById(i);
            return true;
        }
        return false;
    }

    public final boolean DX7(C65796Lzo lzo) {
        0qQ.A0B(lzo, 0);
        JW7 jw7 = this.A06;
        if (jw7 == null) {
            0qQ.A0F("galleryPickerView");
            throw AnonymousClass00P.createAndThrow();
        }
        jw7.setCurrentRemoteFolder(lzo);
        return false;
    }

    public final boolean Erj() {
        return true;
    }

    public final /* synthetic */ void Ex2(AnonymousClass3Q2 r1) {
    }

    public final /* synthetic */ void FMZ(AnonymousClass3Q2 r1) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A06 != null) {
            Configuration configuration2 = requireContext().getResources().getConfiguration();
            0qQ.A07(configuration2);
            if (O3Z.A00(configuration2, configuration)) {
                JW7 jw7 = this.A06;
                if (jw7 == null) {
                    0qQ.A0F("galleryPickerView");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    jw7.onConfigurationChanged(configuration);
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        PendingRecipient pendingRecipient = (PendingRecipient) requireArguments().getParcelable("ARG_TARGET_GROUP_PROFILE");
        if (pendingRecipient == null || !pendingRecipient.A0Y) {
            1Av A002 = 1Au.A00(getSession());
            0s0 r1 = A002.A0j;
            AnonymousClass0YZ[] r7 = 1Av.A8a;
            if (!((Boolean) r1.CDM(A002, r7[169])).booleanValue()) {
                UserSession A022 = getSession();
                0Tu r3 = 0Tu.A05;
                if (182.A06(r3, A022, 36316087382904768L) && 182.A06(r3, getSession(), 36316087382511547L) && JU9.A01(getSession())) {
                    C358248ab r2 = new C358248ab(requireContext());
                    r2.A0i(requireContext().getDrawable(R.drawable.instagram_icons_exceptions_close_friends_filled_56));
                    r2.A09(2131965941);
                    r2.A08(2131965940);
                    r2.A06();
                    r2.A0G(new C39923AJp(this), 2131964884);
                    AnonymousClass0fN.A00(r2.A02());
                    1Av A003 = 1Au.A00(getSession());
                    A003.A0j.Epx(A003, true, r7[169]);
                }
            }
        }
        UserSession A023 = getSession();
        0qQ.A0B(A023, 0);
        if (182.A06(0Tu.A05, A023, 36323758193192395L)) {
            AnonymousClass9Q6 r4 = new AnonymousClass9Q6(this);
            0h9 r12 = this.mLifecycleRegistry;
            0qQ.A07(r12);
            Integer num = AnonymousClass05K.A0Y;
            UserSession A024 = getSession();
            0wc A025 = AnonymousClass0kN.A02(getSession());
            FragmentActivity requireActivity = requireActivity();
            0qQ.A0B(A024, 2);
            AnonymousClass0xx A004 = C71772f0.A00(r12);
            AnonymousClass9KP r32 = new AnonymousClass9KP((Object) r4, (Object) A025, (Object) A024, (Object) num, (Object) requireActivity, (AnonymousClass4D7) null, 14);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r32, A004);
        }
    }

    public static final C3499682q A00(AnonymousClass8ZV r1) {
        C3499582p r0 = r1.A0A;
        if (r0 == null) {
            0qQ.A0F("_cameraSession");
            throw AnonymousClass00P.createAndThrow();
        }
        C3499682q r02 = r0.A00;
        if (r02 != null) {
            return r02;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: A02 */
    public final UserSession getSession() {
        return (UserSession) this.A0M.getValue();
    }

    public final C3499582p Ajn() {
        C3499582p r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("_cameraSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C59743JWb B6e() {
        JW7 jw7 = this.A06;
        if (jw7 != null) {
            return jw7.A11;
        }
        0qQ.A0F("galleryPickerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C226262fy B6f() {
        return C226262fy.ABOVE_ANCHOR;
    }

    public final boolean CX2() {
        JW7 jw7 = this.A06;
        if (jw7 == null) {
            0qQ.A0F("galleryPickerView");
            throw AnonymousClass00P.createAndThrow();
        } else if (jw7.A0B != null) {
            return true;
        } else {
            return false;
        }
    }

    public final void DGI(JW7 jw7, Folder folder) {
        JW9 jw9 = this.A08;
        if (jw9 == null) {
            0qQ.A0F("actionBar");
            throw AnonymousClass00P.createAndThrow();
        } else {
            jw9.setSelectedFolder(folder);
        }
    }

    public final void DHZ(JW7 jw7) {
        JW9 jw9 = this.A08;
        if (jw9 == null) {
            0qQ.A0F("actionBar");
            throw AnonymousClass00P.createAndThrow();
        } else {
            jw9.A02();
        }
    }

    public final void DQZ(JW7 jw7, List list, List list2) {
        String str;
        JW9 jw9 = this.A08;
        if (jw9 == null) {
            str = "actionBar";
        } else {
            BaseAdapter baseAdapter = jw9.A00;
            baseAdapter.getClass();
            0fE.A00(baseAdapter, 1687863073);
            JW1.A00(getSession()).A0A(true, (String) null);
            AnonymousClass9Q1 r0 = this.A0G;
            if (r0 == null) {
                str = "feedCaptureNavigationLogger";
            } else {
                r0.A01.A05();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DUJ() {
        String str = "galleryPickerView";
        if (this.A0I) {
            JW7 jw7 = this.A06;
            if (jw7 != null) {
                ArrayList arrayList = new ArrayList(jw7.A14.A0F.AN0());
                if (arrayList.size() == 1 && ((GalleryItem) arrayList.get(0)).A06()) {
                    C310336ap r2 = new C310336ap();
                    r2.A0D = requireContext().getString(2131971239);
                    r2.A0I = requireContext().getString(2131971238);
                    r2.A0L = true;
                    String string = requireContext().getString(2131968772);
                    0qQ.A07(string);
                    r2.A0G = string;
                    r2.A0A(new C40549Adw());
                    r2.A06();
                    r2.A0O = true;
                    1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        JW7 jw72 = this.A06;
        if (jw72 != null) {
            if (jw72.A0B != null) {
                jw72.A0W((L0A) null);
                C3499582p r0 = this.A0A;
                if (r0 == null) {
                    str = "_cameraSession";
                } else {
                    C63137Ks5.A00(requireActivity(), getSession(), r0.A00());
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EJy(boolean z) {
        AnonymousClass4MS r1 = this.A02;
        String str = "stopwatch";
        if (r1 != null) {
            if (r1.A02) {
                r1.A01();
            }
            r1.A02();
            UserSession A022 = getSession();
            JWG jwg = this.A03;
            if (jwg == null) {
                str = "dialogHelper";
            } else {
                0qQ.A0B(A022, 0);
                jwg.A0A((DialogInterface.OnClickListener) null, AnonymousClass05K.A0D);
                JW7 jw7 = this.A06;
                if (jw7 == null) {
                    str = "galleryPickerView";
                } else {
                    jw7.A0W(new L0A(this));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final List getCombinedFolders() {
        JW7 jw7 = this.A06;
        if (jw7 != null) {
            return jw7.getCombinedFolders();
        }
        0qQ.A0F("galleryPickerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C357268Xf getCurrentMixedFolder() {
        JW7 jw7 = this.A06;
        if (jw7 != null) {
            return jw7.getCurrentMixedFolder();
        }
        0qQ.A0F("galleryPickerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final List getFolders() {
        JW7 jw7 = this.A06;
        if (jw7 != null) {
            return jw7.getFolders();
        }
        0qQ.A0F("galleryPickerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return this.A0L;
    }

    public final boolean onBackPressed() {
        JW7 jw7 = this.A06;
        if (jw7 == null) {
            return false;
        }
        String str = "galleryPickerView";
        if (jw7.getSelectedMediaCount() >= 2) {
            UserSession A022 = getSession();
            0qQ.A0B(A022, 0);
            if (182.A06(0Tu.A05, A022, 36321550580065798L)) {
                JWG jwg = this.A03;
                if (jwg != null) {
                    return jwg.A0A((DialogInterface.OnClickListener) null, AnonymousClass05K.A0B);
                }
                str = "dialogHelper";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        JW7 jw72 = this.A06;
        if (jw72 != null) {
            return jw72.A0e();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onLocationChanged(Location location) {
        1Wr r1 = 1Wr.A00;
        if (r1 != null) {
            r1.removeLocationUpdates(getSession(), this);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass8ZV() {
        AnonymousClass9LM r6 = new AnonymousClass9LM(this, 40);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LM(new AnonymousClass9LM(this, 41), 42));
        this.A0J = new C227862kA(new AnonymousClass9LM(A002, 43), r6, new C377429Lu(7, (Object) null, A002), new 0Yh(ClipsCreationDraftViewModel.class));
        this.A0M = C227642jf.A02(this);
        this.A0L = "gallery_picker";
    }

    public static final void A01(AnonymousClass8ZV r5) {
        UserSession A022 = r5.getSession();
        AnonymousClass4MS r3 = r5.A02;
        if (r3 == null) {
            0qQ.A0F("stopwatch");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C64170LRv.A02(r3, A022, AnonymousClass05K.A0N, new MMT(r5, 23));
        }
    }

    public final void AIU() {
        28E.A00(getSession()).A04();
    }

    public final CreationSession AsK() {
        return ((JWE) A00(this)).A01;
    }

    public final AnonymousClass3Q2 BbQ(String str) {
        return 28K.A00(getSession()).A03(str);
    }

    public final UserSession CCy() {
        return getSession();
    }

    public final void EBv(Runnable runnable) {
        28E.A00(getSession()).A06(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r7 == r0) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 9
            if (r6 != r0) goto L_0x0032
            r0 = 2
            if (r7 == r0) goto L_0x000d
            r0 = 3
        L_0x000b:
            if (r7 != r0) goto L_0x003d
        L_0x000d:
            androidx.fragment.app.FragmentActivity r4 = r5.getActivity()
            if (r4 == 0) goto L_0x007e
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.JbO r3 = X.JZM.A00(r0)
            X.28t r2 = X.28t.A06
            java.util.List r1 = java.util.Collections.emptyList()
            X.0qQ.A07(r1)
            X.82p r0 = r5.A0A
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "_cameraSession"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0032:
            r0 = 9587(0x2573, float:1.3434E-41)
            if (r6 != r0) goto L_0x003d
            r0 = 9683(0x25d3, float:1.3569E-41)
            if (r7 == r0) goto L_0x000d
            r0 = 9685(0x25d5, float:1.3572E-41)
            goto L_0x000b
        L_0x003d:
            r0 = -1
            if (r7 != r0) goto L_0x007e
            r0 = 10002(0x2712, float:1.4016E-41)
            if (r6 != r0) goto L_0x007e
            java.lang.String r1 = "Required value was null."
            if (r8 == 0) goto L_0x006c
            java.io.File r0 = r5.A0D
            if (r0 == 0) goto L_0x0066
            android.net.Uri r2 = X.FFa.A01(r8, r0)
            X.0qQ.A07(r2)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = 3653(0xe45, float:5.119E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.4mm r1 = (X.C273554mm) r1
            r1.CpX(r2)
            return
        L_0x0066:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0072:
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r0.A09
            r3.A0A(r2, r0, r1)
            r4.finish()
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ZV.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCancel() {
        JZM.A00(getSession());
        requireActivity().onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        28D r1;
        int A022 = AnonymousClass0fD.A02(106587935);
        AnonymousClass8ZV.super.onCreate(bundle);
        this.A0F = requireArguments().getBoolean("standalone_mode", false);
        this.A0I = requireArguments().getBoolean("ARG_IS_QUIET_POSTING_FLOW", false);
        if (requireArguments().get("ARG_CAMERA_ENTRY_POINT") instanceof 28D) {
            Object obj = requireArguments().get("ARG_CAMERA_ENTRY_POINT");
            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
            r1 = (28D) obj;
        } else {
            r1 = 28D.A5J;
        }
        this.A01 = r1;
        AnonymousClass36W r8 = AnonymousClass36W.FOLLOWERS_SHARE;
        JWU jwu = new JWU(r8);
        if (requireArguments().containsKey("ARG_MUSIC_ATTRIBUTION_CONFIG")) {
            jwu.A00 = (MusicAttributionConfig) requireArguments().getParcelable("ARG_MUSIC_ATTRIBUTION_CONFIG");
        }
        if (requireArguments().containsKey("ARG_IS_EXCLUSIVE_BY_DEFAULT")) {
            jwu.A04 = requireArguments().getBoolean("ARG_IS_EXCLUSIVE_BY_DEFAULT");
        }
        CreationSession creationSession = new CreationSession();
        creationSession.A09 = new MediaCaptureConfig(jwu);
        creationSession.A0A = r8;
        creationSession.A0M = true;
        creationSession.A0B = (PendingRecipient) requireArguments().getParcelable("ARG_TARGET_GROUP_PROFILE");
        creationSession.A0L = requireArguments().getBoolean("ARG_IS_QUIET_POSTING_FLOW", false);
        this.A0A = JWD.A00(this.A01, getSession(), creationSession, new AnonymousClass82Y((C3499182k) null, (UserSession) null, (C357638Yz) null, (C3498682d) null, (C3498482b) null, (C3498382a) null, (C3499282m) null, (C3498882g) null, (C3498782e) null, (C3499382n) null, (ClipsCelebrationReshareViewModel) null, (AnonymousClass82f) null, (C2801950r) null, (SuperlativeStickerClientModel) null, (C3498982i) null, (C3498582c) null, (MusicAttributionConfig) null, (PendingRecipient) null, (C3499082j) null, (String) null, false, false, false, true, false, false, false, false));
        AnonymousClass9Q1 r2 = new AnonymousClass9Q1(getSession());
        this.A0G = r2;
        r2.A0R(requireContext(), C71342cb.A00(getSession()), this);
        1YN A002 = AnonymousClass2bO.A00();
        UserSession A023 = getSession();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0X;
        AnonymousClass2bO.A00();
        this.A0H = A002.A01(this, this, A023, 2bV.A07((C230922qa) null, (C230882qT) null, (AnonymousClass576) null), quickPromotionSlot);
        Activity rootActivity = getRootActivity();
        0qQ.A0A(rootActivity);
        this.A03 = new JWG(rootActivity, getSession(), this);
        this.A0B = 1ua.A0G.A01(requireContext(), getSession());
        FragmentActivity requireActivity = requireActivity();
        JWG jwg = this.A03;
        if (jwg == null) {
            0qQ.A0F("dialogHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A07 = new JWH(requireActivity, this, jwg, this);
        this.A02 = new AnonymousClass4MS();
        this.A00 = (int) 182.A01(0Tu.A06, getSession(), 36610086482745314L);
        if (182.A06(0Tu.A05, getSession(), 36323547739663616L)) {
            setDayNightMode(AnonymousClass2k4.NIGHT);
        }
        AnonymousClass0fD.A09(-149719550, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.8ZW} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0164, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A0z, 36328834844671608L) != false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0187, code lost:
        if (r0.A0c() != false) goto L_0x0189;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
            r19 = this;
            r0 = -1370595573(0xffffffffae4e5f0b, float:-4.6923392E-11)
            int r5 = X.AnonymousClass0fD.A02(r0)
            r4 = 0
            r2 = r20
            X.0qQ.A0B(r2, r4)
            r12 = r19
            r1 = r21
            r0 = r22
            X.AnonymousClass8ZV.super.onCreateView(r2, r1, r0)
            r0 = 2131626694(0x7f0e0ac6, float:1.8880631E38)
            android.view.View r3 = r2.inflate(r0, r1, r4)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r3, r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.content.Context r14 = r12.getThemedContext()
            com.instagram.common.session.UserSession r15 = r12.getSession()
            boolean r0 = r12.A0F
            r2 = 1
            r16 = r0 ^ 1
            boolean r6 = r12.A0I
            X.82q r0 = A00(r12)
            X.36W r1 = r0.AGg()
            X.36W r0 = X.AnonymousClass36W.PROFILE_PHOTO
            r18 = 0
            if (r1 != r0) goto L_0x0043
            r18 = 1
        L_0x0043:
            X.JW9 r13 = new X.JW9
            r17 = r6
            r13.<init>(r14, r15, r16, r17, r18)
            r12.A08 = r13
            com.instagram.common.session.UserSession r0 = r12.getSession()
            com.instagram.pendingmedia.store.PendingMediaStore r8 = X.28K.A00(r0)
            com.instagram.common.session.UserSession r1 = r12.getSession()
            X.JWV r0 = new X.JWV
            r0.<init>(r1)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r12)
            java.lang.Class<X.JWW> r0 = X.JWW.class
            X.2YL r10 = r1.A00(r0)
            X.JWW r10 = (X.JWW) r10
            X.05G r0 = r10.A02
            X.19B r9 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r7 = X.C226292g8.A00(r9, r0)
            X.07Z r6 = r12.getViewLifecycleOwner()
            r0 = 22
            X.9LG r1 = new X.9LG
            r1.<init>(r8, r0)
            X.9Q5 r0 = new X.9Q5
            r0.<init>(r1)
            r7.A06(r6, r0)
            X.6oS r6 = X.C318116oQ.A00(r10)
            r8 = 0
            r0 = 45
            X.MG8 r1 = new X.MG8
            r1.<init>(r10, r8, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r9, r1, r6)
            androidx.fragment.app.FragmentActivity r0 = r12.requireActivity()
            android.app.Application r6 = r0.getApplication()
            X.0qQ.A07(r6)
            com.instagram.common.session.UserSession r1 = r12.getSession()
            X.0qQ.A0B(r1, r2)
            X.JWa r0 = new X.JWa
            r0.<init>(r6, r1)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r12)
            java.lang.Class<X.JWZ> r0 = X.JWZ.class
            X.2YL r0 = r1.A00(r0)
            X.JWZ r0 = (X.JWZ) r0
            X.2Fk r7 = r0.A00
            X.07Z r6 = r12.getViewLifecycleOwner()
            r0 = 23
            X.9LG r1 = new X.9LG
            r1.<init>(r12, r0)
            X.9Q5 r0 = new X.9Q5
            r0.<init>(r1)
            r7.A06(r6, r0)
            X.9Q1 r0 = r12.A0G
            r1 = 0
            if (r0 != 0) goto L_0x00de
            java.lang.String r10 = "feedCaptureNavigationLogger"
        L_0x00d6:
            X.0qQ.A0F(r10)
        L_0x00d9:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00de:
            X.34p r0 = r0.A01
            r0.A08(r8)
            android.content.Context r10 = r12.getThemedContext()
            boolean r6 = r12.A0F
            r7 = -1
            int r0 = r12.A00
            com.instagram.common.session.UserSession r13 = r12.getSession()
            X.82p r15 = r12.A0A
            if (r15 != 0) goto L_0x00f7
            java.lang.String r10 = "_cameraSession"
            goto L_0x00d6
        L_0x00f7:
            X.28D r11 = r12.A01
            X.JW7 r9 = new X.JW7
            r14 = r12
            r16 = r8
            r17 = r0
            r18 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r12.A06 = r9
            com.instagram.creation.base.ui.mediatabbar.Tab r8 = X.JXL.A00
            r9.DqA(r8, r8)
            com.instagram.common.session.UserSession r0 = r12.getSession()
            X.JX9 r0 = X.JWX.A00(r0)
            java.util.List r6 = r0.A03
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0126
            com.instagram.common.session.UserSession r0 = r12.getSession()
            X.JX9 r0 = X.JWX.A00(r0)
            java.lang.Integer r1 = r0.A01
        L_0x0126:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            java.lang.String r10 = "galleryPickerView"
            if (r0 == 0) goto L_0x01fc
            X.JW7 r0 = r12.A06
            if (r0 == 0) goto L_0x00d6
            r0.A0Z(r1, r6, r7)
        L_0x0137:
            X.JW7 r1 = r12.A06
            if (r1 == 0) goto L_0x00d6
            r0 = 2131433465(0x7f0b17f9, float:1.8488716E38)
            r1.setId(r0)
            X.JW7 r0 = r12.A06
            if (r0 == 0) goto L_0x00d6
            r0.A0H = r12
            boolean r0 = r0.A0d()
            if (r0 != 0) goto L_0x0166
            X.JW7 r1 = r12.A06
            if (r1 == 0) goto L_0x00d6
            boolean r0 = X.JW7.A0R(r1)
            if (r0 == 0) goto L_0x01f1
            com.instagram.common.session.UserSession r9 = r1.A0z
            X.0Tu r6 = X.0Tu.A05
            r0 = 36328834844671608(0x8110e200053e78, double:3.03783966802208E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            if (r0 == 0) goto L_0x01f1
        L_0x0166:
            X.JW7 r1 = r12.A06
            if (r1 == 0) goto L_0x00d6
            X.B0f r0 = r12.A05
            r1.A0F = r0
            com.instagram.common.session.UserSession r9 = r12.getSession()
            X.0Tu r6 = X.0Tu.A05
            r0 = 36322435343067324(0x810b10000028bc, double:3.033792597438806E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            if (r0 != 0) goto L_0x0189
            X.JW7 r0 = r12.A06
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r0.A0c()
            if (r0 == 0) goto L_0x0195
        L_0x0189:
            X.JW7 r1 = r12.A06
            if (r1 == 0) goto L_0x00d6
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r7, r7)
            r1.setLayoutParams(r0)
        L_0x0195:
            boolean r1 = r12.A0F
            java.lang.String r7 = "actionBar"
            X.JW9 r0 = r12.A08
            if (r1 == 0) goto L_0x01ec
            if (r0 == 0) goto L_0x023b
            r0.A01()
        L_0x01a2:
            X.JW9 r0 = r12.A08
            if (r0 == 0) goto L_0x023b
            r0.setBaseDelegate(r12)
            X.82q r0 = A00(r12)
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x01bc
            X.JW9 r0 = r12.A08
            if (r0 == 0) goto L_0x023b
            r0.setUnifiedCameraGallery(r2)
        L_0x01bc:
            X.JW9 r1 = r12.A08
            if (r1 == 0) goto L_0x023b
            X.JW7 r0 = r12.A06
            if (r0 == 0) goto L_0x00d6
            r1.setGalleryDelegate(r12, r0)
            X.JW9 r0 = r12.A08
            if (r0 == 0) goto L_0x023b
            r3.addView(r0)
            X.JW7 r0 = r12.A06
            if (r0 == 0) goto L_0x00d6
            r3.addView(r0)
            com.instagram.common.session.UserSession r0 = r12.getSession()
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.Jbx> r1 = X.C59933Jbx.class
            X.1wn r0 = r12.A0K
            r2.A01(r0, r1)
            X.2qi r0 = r12.A0H
            if (r0 != 0) goto L_0x0205
            java.lang.String r10 = "quickPromotionDelegate"
            goto L_0x00d6
        L_0x01ec:
            if (r0 == 0) goto L_0x023b
            r0.A01 = r8
            goto L_0x01a2
        L_0x01f1:
            X.JW7 r1 = r12.A06
            if (r1 == 0) goto L_0x00d6
            X.B0k r0 = r12.A0C
            r1.setFastScrollControllerListener(r0)
            goto L_0x0166
        L_0x01fc:
            X.JW7 r0 = r12.A06
            if (r0 == 0) goto L_0x00d6
            r0.setCurrentFolderByIdAndSelectFirstItem(r7)
            goto L_0x0137
        L_0x0205:
            r0.Dh3()
            com.instagram.common.session.UserSession r2 = r12.getSession()
            r0 = 36329693837803777(0x8111aa00004101, double:3.038382898737751E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 == 0) goto L_0x025e
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "ARG_SHOULD_AUTO_LOAD_UNSAVED_DRAFT"
            boolean r7 = r1.getBoolean(r0, r4)
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "ARG_SHOULD_HIDE_UNSAVED_DRAFT_DIALOG"
            boolean r6 = r1.getBoolean(r0, r4)
            X.0eM r4 = r12.A0J
            java.lang.Object r2 = r4.getValue()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r2
            X.50r r1 = X.C2801950r.CLIPS
            X.82p r0 = r12.A0A
            if (r0 != 0) goto L_0x0240
            java.lang.String r7 = "_cameraSession"
        L_0x023b:
            X.0qQ.A0F(r7)
            goto L_0x00d9
        L_0x0240:
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = r0.A0i
            r2.A0F(r1, r0, r6)
            java.lang.Object r0 = r4.getValue()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r0
            X.2Fj r2 = r0.A0C
            X.APt r1 = new X.APt
            r1.<init>(r12, r7, r6)
            X.6q2 r0 = new X.6q2
            r0.<init>(r1)
            r2.A06(r12, r0)
        L_0x025e:
            r0 = 721178436(0x2afc4f44, float:4.4819194E-13)
            X.AnonymousClass0fD.A09(r0, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ZV.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1509017717);
        super.onDestroy();
        C41817B1x b1x = this.A09;
        if (b1x != null) {
            b1x.DTa();
            JW7 jw7 = this.A06;
            if (jw7 == null) {
                0qQ.A0F("galleryPickerView");
                throw AnonymousClass00P.createAndThrow();
            } else if (jw7.A14.A0F.A07) {
                UserSession userSession = jw7.A0z;
                if (182.A06(0Tu.A05, userSession, 36326734605334477L)) {
                    JX9 A002 = JWX.A00(userSession);
                    A002.A03.clear();
                    A002.A01 = null;
                    JWX.A00(userSession).A02 = false;
                }
            }
        }
        AnonymousClass0fD.A09(1377606150, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1719963265);
        super.onDestroyView();
        AnonymousClass1Nd.A00(getSession()).A02(this.A0K, C59933Jbx.class);
        AnonymousClass0fD.A09(1942798130, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-457137120);
        AnonymousClass8ZV.super.onPause();
        JW7 jw7 = this.A06;
        if (jw7 == null) {
            0qQ.A0F("galleryPickerView");
            throw AnonymousClass00P.createAndThrow();
        }
        jw7.A0U();
        1Wr r1 = 1Wr.A00;
        if (r1 != null) {
            r1.removeLocationUpdates(getSession(), this);
            AnonymousClass0fD.A09(-224303087, A022);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        AnonymousClass0fD.A09(-722652060, A022);
        throw illegalStateException;
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(-576413220);
        super.onResume();
        if (!this.A0F) {
            ((JWE) A00(this)).A01.A0P.clear();
        }
        JW7 jw7 = this.A06;
        if (jw7 == null) {
            str = "galleryPickerView";
        } else {
            jw7.A0V();
            1Wr r2 = 1Wr.A00;
            if (r2 != null) {
                r2.requestLocationUpdates(getSession(), this, __redex_internal_original_name);
                AnonymousClass9Q1 r22 = this.A0G;
                if (r22 == null) {
                    str = "feedCaptureNavigationLogger";
                } else {
                    C2366634p r1 = r22.A01;
                    r22.A07.add(r1);
                    r22.A06.add(r1);
                    r22.A0J(DatePickerDialogModule.ARG_MODE, "gallery");
                    AnonymousClass0fD.A09(-298367620, A022);
                    return;
                }
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
                AnonymousClass0fD.A09(-435196362, A022);
                throw illegalStateException;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(688246577);
        AnonymousClass8ZV.super.onStop();
        JW7 jw7 = this.A06;
        if (jw7 == null) {
            0qQ.A0F("galleryPickerView");
            throw AnonymousClass00P.createAndThrow();
        }
        if (jw7.A14.A0F.A07) {
            if (182.A06(0Tu.A05, jw7.A0z, 36326734605334477L)) {
                JW7.A0I(jw7);
            }
        }
        AnonymousClass0fD.A09(396931922, A022);
    }
}
