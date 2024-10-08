package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.shopping.intf.productpicker.MultiProductPickerResult;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.KSr  reason: case insensitive filesystem */
public final class C61942KSr extends K8A implements AnonymousClass4DU, AnonymousClass4DR, C66517MUv, AnonymousClass2Zd {
    public static final String __redex_internal_original_name = "VideoUploadMetadataFragment";
    public Location A00;
    public View A01;
    public View A02;
    public TextView A03;
    public ImmutableList A04;
    public 1wn A05;
    public 1wn A06;
    public 1wn A07;
    public 1wn A08;
    public 1wn A09;
    public LM3 A0A;
    public C65827M0t A0B;
    public L8F A0C;
    public C63862L9r A0D;
    public C60258JiF A0E;
    public L9B A0F;
    public L8G A0G;
    public LAS A0H;
    public String A0I;
    public List A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = true;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public View A0Q;
    public ConstraintLayout A0R;
    public 1ua A0S;
    public boolean A0T;
    public final C65423Lt3 A0U = new C65423Lt3(this, 4);
    public final AnonymousClass0eM A0V = C66306MMp.A01(this, 48);
    public final AnonymousClass0eM A0W;
    public final AnonymousClass0eM A0X = C66299MMi.A01(this, 5);
    public final AnonymousClass0eM A0Y = C66299MMi.A00(this, new C66299MMi(this, 3), new C73666Phf(15, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 4);
    public final CallerContext A0Z = CallerContext.A01(__redex_internal_original_name);

    private final K95 A00(UserSession userSession, String str) {
        UserSession userSession2 = userSession;
        if (userSession == null) {
            return null;
        }
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        C295095nZ A0S2 = JTT.A0S(userSession);
        if (A0S2 == null) {
            return null;
        }
        int A042 = Dbb.A04(this);
        Integer num = AnonymousClass05K.A01;
        return new K95(new 04x(16, str), num, userSession2, A0S2, this, str, A042, 0);
    }

    public static final void A04(C295095nZ r3, C61942KSr kSr) {
        L9B l9b;
        r3.A00 = true;
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        AnonymousClass0eM r1 = kSr.A0W;
        AnonymousClass5w9.A00(AnonymousClass7TE.A0l(r1)).A0A(r3);
        if ((kSr.A0K || C363558jv.A00(AnonymousClass7TE.A0l(r1))) && (l9b = kSr.A0F) != null) {
            l9b.A00 = true;
        }
        A0A(kSr);
    }

    public final void DFp(AnonymousClass3Q2 r9) {
        String id;
        0qQ.A0B(r9, 0);
        1Xj r0 = r9.A1C;
        if (r0 != null && (id = r0.getId()) != null) {
            A08(this);
            C61520KAz A0C2 = A0C();
            boolean A0t = LJ9.A01(this).A0t();
            if (A0C2.A01 != null && A0C2.A00() && A0C2.A0A) {
                1Yh A002 = C18138VmE.A00();
                1Yg A003 = VA4.A00();
                String str = A0C2.A0E;
                UserSession userSession = A0C2.A0D;
                Context context = A0C2.A01;
                if (context != null) {
                    W29 A004 = A003.A00(context, userSession, id, str);
                    A004.A0B = A0t;
                    A002.A0B(A004);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final /* synthetic */ void DQx(AnonymousClass3Q2 r1) {
    }

    public final String getModuleName() {
        return "ig_video_sharing_settings";
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.K8A, X.0iw, X.07g, androidx.fragment.app.Fragment, X.KSr, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String A0l;
        BitmapDrawable bitmapDrawable;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Location lastLocation;
        List list;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (!requireActivity().isFinishing()) {
            AnonymousClass0eM r4 = this.A0Y;
            Dba.A15(getViewLifecycleOwner(), JTO.A0k(r4).A04, MPA.A00(this, 27), 68);
            Dba.A15(getViewLifecycleOwner(), JTO.A0k(r4).A03, MPA.A00(this, 28), 68);
            if (JTT.A1a(this)) {
                Dba.A15(getViewLifecycleOwner(), DbT.A0G(JTO.A0k(r4).A0J), MPA.A00(this, 29), 68);
            }
            LAS las = this.A0H;
            if (las != null) {
                if (las.A04) {
                    AnonymousClass0eM r1 = this.A0W;
                    KTX A0X2 = JTT.A0X(this);
                    CallerContext callerContext = C64368Lak.A03;
                    C60258JiF A002 = JTO.A0L(new KEJ(AnonymousClass7TE.A0l(r1), new C64368Lak(this, AnonymousClass7TE.A0l(r1)), A0X2, (1Av) this.A0X.getValue(), new C66299MMi(this, 2)), this).A00(C60258JiF.class);
                    this.A0E = A002;
                    this.A0F = new L9B(getViewLifecycleOwner(), A002, new C66299MMi(this, 1));
                }
                LAS las2 = this.A0H;
                if (las2 != null) {
                    if (las2.A02.A01) {
                        this.A0C = new L8F(new AnonymousClass847(requireActivity()), this, AnonymousClass7TE.A0l(this.A0W));
                    }
                    LAS las3 = this.A0H;
                    if (las3 != null) {
                        if (las3.A01) {
                            LgJ lgJ = new LgJ(this, 0);
                            JTT.A0I(this).A01(lgJ, C64679Lg6.class);
                            this.A06 = lgJ;
                        }
                        LAS las4 = this.A0H;
                        if (las4 != null) {
                            if (las4.A02.A02) {
                                JTO.A0k(r4).A0M.A0Q = AnonymousClass3WP.A06(AnonymousClass7TE.A0l(this.A0W));
                            }
                            if (this.A0H != null) {
                                LgJ lgJ2 = new LgJ(this, 3);
                                JTT.A0I(this).A01(lgJ2, C64648Lfa.class);
                                this.A08 = lgJ2;
                                LgJ lgJ3 = new LgJ(this, 4);
                                JTT.A0I(this).A01(lgJ3, C64677Lg3.class);
                                this.A09 = lgJ3;
                                C22328Xzd A003 = NearbyVenuesService.A00(this.A00);
                                if (A003 != null) {
                                    List items = A003.getItems();
                                    this.A0P = true;
                                    if (items != null) {
                                        int size = items.size();
                                        if (size > 5) {
                                            size = 5;
                                        }
                                        list = items.subList(0, size);
                                    } else {
                                        list = null;
                                    }
                                    this.A0J = list;
                                    A0A(this);
                                }
                                1Wr r2 = 1Wr.A00;
                                if (r2 == null || (lastLocation = r2.getLastLocation(AnonymousClass7TE.A0l(this.A0W), __redex_internal_original_name)) == null || 1Wr.A00 == null || !C270984hi.A00(lastLocation)) {
                                    1Wr r3 = 1Wr.A00;
                                    if (r3 != null) {
                                        r3.requestLocationUpdates(AnonymousClass7TE.A0l(this.A0W), this.A0U, "ig_video_sharing_settings");
                                    }
                                } else {
                                    A02(lastLocation, this);
                                }
                                if (JTT.A0Y(this).A0i) {
                                    LgJ lgJ4 = new LgJ(this, 1);
                                    JTT.A0I(this).A01(lgJ4, C64664Lfq.class);
                                    this.A07 = lgJ4;
                                    LgJ lgJ5 = new LgJ(this, 2);
                                    JTT.A0I(this).A01(lgJ5, C64663Lfp.class);
                                    this.A05 = lgJ5;
                                }
                                boolean A1a = JTT.A1a(this);
                                this.A0M = !A1a;
                                if (A1a) {
                                    Dba.A15(getViewLifecycleOwner(), JTT.A0Y(this).A0j, MPA.A00(this, 30), 68);
                                }
                                AnonymousClass3Q2 A012 = LJ9.A01(this);
                                A0E();
                                TextView A0d = AnonymousClass7TE.A0d(JTR.A0V(view, R.id.action_buttons_stub), R.id.post_button);
                                this.A03 = A0d;
                                if (A0d != null) {
                                    DbU.A1G(A0d, this, 2131973441);
                                    LY7.A00(A0d, 17, A012, this);
                                    LJB.A00(A0d, this.A0L);
                                    2eS.A01(A0d);
                                    ViewGroup.LayoutParams layoutParams = A0d.getLayoutParams();
                                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                                        i = 0;
                                    } else {
                                        i = marginLayoutParams.topMargin;
                                    }
                                    0nA.A0T(A0d, i);
                                } else {
                                    A0d = null;
                                }
                                this.A01 = A0d;
                                this.A02 = view.findViewById(R.id.post_sharing_overlay);
                                this.A0R = (ConstraintLayout) view.findViewById(R.id.metadata_container);
                                AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
                                AnonymousClass0eM r8 = this.A0W;
                                C295095nZ A0S2 = JTT.A0S(AnonymousClass7TE.A0l(r8));
                                boolean A1a2 = JTT.A1a(this);
                                A0G();
                                if (!A1a2) {
                                    if (!this.A0T && A0S2 != null && AnonymousClass5w9.A02(A0S2)) {
                                        UserSession A0l2 = AnonymousClass7TE.A0l(r8);
                                        0qQ.A0B(A0l2, 0);
                                        if (AnonymousClass5w9.A01(A0l2) && !A0S2.A00 && A0S2.A05) {
                                            A05(A0S2, this, true);
                                            this.A0T = true;
                                        }
                                    }
                                    C250563lf.A0h(AnonymousClass7TE.A0l(r8), requireContext(), requireActivity());
                                } else {
                                    1Av A004 = 1Au.A00(AnonymousClass7TE.A0l(r8));
                                    0s0 r02 = A004.A7T;
                                    AnonymousClass0YZ[] r6 = 1Av.A8a;
                                    if (!AnonymousClass7TG.A1a(A004, r02, r6, 285)) {
                                        if (JTQ.A0R(AnonymousClass7TE.A0l(r8), AnonymousClass0t1.A01) == AnonymousClass05K.A0C) {
                                            A0l = requireContext().getString(2131965392);
                                        } else {
                                            StringBuilder A1A = AnonymousClass7TE.A1A();
                                            A1A.append(requireContext().getString(2131965393));
                                            A1A.append(10);
                                            A1A.append(10);
                                            A0l = AnonymousClass7TF.A0l(requireContext().getString(2131965394), A1A);
                                        }
                                        0qQ.A0A(A0l);
                                        C358248ab A0U2 = DbW.A0U(this);
                                        DbT.A19(requireContext(), A0U2, 2131965395);
                                        A0U2.A0q(A0l);
                                        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_reels_outline_96);
                                        if (drawable != null) {
                                            bitmapDrawable = AnonymousClass3JT.A03(requireActivity(), drawable, JTP.A02(getContext(), requireActivity(), R.attr.igds_color_gradient_red), JTP.A02(getContext(), requireActivity(), R.attr.igds_color_gradient_purple));
                                        } else {
                                            bitmapDrawable = null;
                                        }
                                        A0U2.A0i(bitmapDrawable);
                                        A0U2.A06();
                                        LV2.A01(A0U2, this, 30, 2131964884);
                                        A0U2.A0f((DialogInterface.OnDismissListener) null);
                                        DbT.A1V(A0U2);
                                        1Av A005 = 1Au.A00(AnonymousClass7TE.A0l(r8));
                                        AnonymousClass7TF.A1J(A005, A005.A7T, r6, 285, true);
                                    }
                                }
                                C63776L6i l6i = (C63776L6i) JTO.A0k(r4).A0E.getValue();
                                1Ln A0U3 = C51965G9l.A0U(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, l6i.A00), "ig_camera_share_sheet_load"), 202);
                                if (DbT.A1Y(A0U3)) {
                                    A0U3.A0a(C279294yP.FEED);
                                    A0U3.A0M(28D.A5J, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                                    A0U3.A0W(1);
                                    A0U3.A0M(C59725JVj.SHARE_SHEET, "surface");
                                    A0U3.A0c(28t.A06);
                                    JTO.A1U(A0U3, l6i.A01);
                                    A0U3.A0n("ig_video_sharing_settings");
                                    A0U3.A0O("funded_content_available", false);
                                    A0U3.A0M(C360948fP.FEED, "capture_type");
                                    A0U3.A0O("is_panavision", false);
                                    A0U3.A0O("is_feed_fork", true);
                                    A0U3.Cgf();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final IGTVUploadViewModel A01(C61942KSr kSr) {
        return JTO.A0k(kSr.A0Y);
    }

    public static final void A02(Location location, C61942KSr kSr) {
        kSr.A00 = location;
        1Wr r2 = 1Wr.A00;
        if (r2 != null) {
            r2.removeLocationUpdates(AnonymousClass7TE.A0l(kSr.A0W), kSr.A0U);
        }
        FragmentActivity activity = kSr.getActivity();
        if (activity != null) {
            NearbyVenuesService.A01(activity, location, AnonymousClass7TE.A0l(kSr.A0W), (LocationSignalPackage) null, -1L);
        }
    }

    public static void A03(0Ak r4, Long l, int i, int i2) {
        r4.A0Q("posting_surface", l);
        r4.A0R("product", "");
        0bb r2 = new 0bb();
        r2.A05(IgReactMediaPickerNativeModule.WIDTH, Long.valueOf((long) i));
        r2.A05(IgReactMediaPickerNativeModule.HEIGHT, Long.valueOf((long) i2));
        r4.A0N(r2, "input_metadata");
        r4.A0R("media_original_folder", "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r0v145, types: [X.L1x, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v158, types: [X.1us, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C61942KSr r31) {
        /*
            r8 = r31
            X.KTX r1 = X.JTT.A0X(r8)
            X.L9B r0 = r8.A0F
            r7 = 0
            if (r0 == 0) goto L_0x0012
            X.JiF r0 = r0.A02
            com.instagram.common.session.UserSession r0 = r0.A04
            X.C363558jv.A00(r0)
        L_0x0012:
            X.L9r r0 = r8.A0D
            if (r0 == 0) goto L_0x01db
            boolean r13 = r0.A00
        L_0x0018:
            X.3Q2 r2 = r1.A02
            java.lang.Boolean r0 = r2.A23
            boolean r14 = X.C51972G9s.A1Z(r0)
            X.0eM r0 = r8.A0Y
            r31 = r0
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r31)
            boolean r5 = r8.A0N
            r2.CJe()
            java.util.List r0 = r2.A4C
            r6 = 0
            if (r0 == 0) goto L_0x0035
            X.00k.A0O(r0, r7)
        L_0x0035:
            X.KTX r0 = r1.A02()
            X.3Q2 r0 = r0.A02
            int r2 = r0.A0H
            float r11 = (float) r2
            int r3 = r0.A0G
            float r10 = (float) r3
            float r9 = r11 / r10
            float r4 = r0.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r4 = 1058013184(0x3f100000, float:0.5625)
            if (r0 <= 0) goto L_0x0050
            r4 = 1071877875(0x3fe38ef3, float:1.7778)
        L_0x0050:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d5
            int r2 = X.AnonymousClass7TE.A06(r10, r4)
        L_0x0058:
            X.KTX r0 = r1.A02()
            X.MW0 r0 = r0.A01
            int r0 = r0.B5s()
            java.util.Map r4 = X.C366508p8.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.get(r0)
            X.KTX r0 = r1.A02()
            X.3Q2 r0 = r0.A02
            java.lang.String r0 = r0.A2Z
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = ""
        L_0x0077:
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0080
            r1.A02()
        L_0x0080:
            X.KTX r0 = r1.A02()
            X.MW0 r0 = r0.A01
            java.util.List r0 = r0.BbY()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009d
            X.KTX r0 = r1.A02()
            X.MW0 r0 = r0.A01
            java.util.List r0 = r0.BbY()
            r0.size()
        L_0x009d:
            r1.A02()
            X.0eM r0 = r1.A0E
            r0.getValue()
            r1.A02()
            X.C376399Hv.A00()
            java.lang.Object r1 = r0.getValue()
            X.L6i r1 = (X.C63776L6i) r1
            X.C376399Hv.A00()
            com.instagram.common.session.UserSession r9 = r1.A00
            X.0wc r0 = X.AnonymousClass0kN.A01(r8, r9)
            X.1Ln r4 = X.1Ln.A09(r0)
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x013a
            X.2D6 r0 = X.2D5.A00(r9)
            X.0xa r9 = r0.A04
            java.lang.String r0 = "PREFERENCE_IG_TO_FB_WASLIVE_IS_CROSSPOSTING_ENABLED"
            boolean r0 = r9.getBoolean(r0, r7)
            r11 = 2
            r10 = 1
            if (r0 == 0) goto L_0x0183
            if (r14 == 0) goto L_0x0180
            X.Kk5 r9 = X.C62643Kk5.CROSSPOST
        L_0x00d9:
            X.4yP r0 = X.C279294yP.CLIPS
            r4.A0a(r0)
            r0 = 3
            r4.A0V(r0)
            java.lang.String r0 = r1.A01
            X.JTU.A13(r4, r0)
            X.8fP r1 = X.C360948fP.CLIPS
            java.lang.String r0 = "capture_type"
            r4.A0M(r1, r0)
            X.28D r0 = X.28D.A5J
            X.JTU.A0u(r0, r4)
            X.28t r0 = X.28t.A06
            r4.A0c(r0)
            java.lang.String r0 = "ig_video_sharing_settings"
            r4.A0n(r0)
            X.KkU r1 = X.C62668KkU.CLIPS
            java.lang.String r0 = "share_destination"
            r4.A0M(r1, r0)
            X.JVj r1 = X.C59725JVj.WASLIVE_SHARE_SHEET
            java.lang.String r0 = "surface"
            r4.A0M(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_edited"
            r4.A0O(r0, r1)
            java.lang.String r0 = "is_panavision"
            r4.A0O(r0, r1)
            java.lang.String r0 = "cross_app_share_type"
            r4.A0M(r9, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "is_feed_fork"
            r4.A0O(r0, r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            A03(r4, r0, r2, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_crosspost"
            r4.A0O(r0, r1)
        L_0x0137:
            r4.Cgf()
        L_0x013a:
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r12 = X.JTO.A0k(r31)
            X.0eM r0 = r8.A06
            X.LMg r0 = X.JTT.A0W(r0)
            java.lang.String r0 = r0.A02
            r30 = r0
            r5 = 1
            X.0eM r0 = r12.A0H
            java.lang.Object r10 = r0.getValue()
            X.LF4 r10 = (X.LF4) r10
            com.instagram.common.session.UserSession r0 = r12.A06
            r29 = r0
            X.KTX r9 = r12.A02()
            X.0eM r0 = r12.A0I
            java.lang.Object r11 = r0.getValue()
            X.LAS r11 = (X.LAS) r11
            java.lang.String r15 = r12.A0B
            X.28D r4 = r12.A00
            boolean r0 = r10 instanceof X.KTZ
            if (r0 == 0) goto L_0x026d
            X.KTZ r10 = (X.KTZ) r10
            X.AnonymousClass7TF.A1B(r9, r5, r11)
            r1 = 62652418(0x3bc0002, float:1.1049649E-36)
            X.L3G r0 = new X.L3G
            r0.<init>(r1)
            r10.A00 = r0
            X.3Q2 r3 = r9.A02
            java.lang.Class<X.KTg> r2 = X.C61957KTg.class
            java.lang.Object r1 = r3.A6H
            monitor-enter(r1)
            goto L_0x01de
        L_0x0180:
            r9 = 0
            goto L_0x00d9
        L_0x0183:
            X.4yP r0 = X.C279294yP.FEED
            r4.A0a(r0)
            r0 = 3
            r4.A0V(r0)
            java.lang.String r0 = r1.A01
            X.JTU.A13(r4, r0)
            X.8fP r1 = X.C360948fP.FEED
            java.lang.String r0 = "capture_type"
            r4.A0M(r1, r0)
            X.28D r0 = X.28D.A5J
            X.JTU.A0u(r0, r4)
            X.28t r0 = X.28t.A06
            r4.A0c(r0)
            java.lang.String r0 = "ig_video_sharing_settings"
            r4.A0n(r0)
            X.KkU r1 = X.C62668KkU.FEED
            java.lang.String r0 = "share_destination"
            r4.A0M(r1, r0)
            X.JVj r1 = X.C59725JVj.SHARE_SHEET
            java.lang.String r0 = "surface"
            r4.A0M(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_edited"
            r4.A0O(r0, r1)
            java.lang.String r0 = "is_panavision"
            r4.A0O(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "is_feed_fork"
            r4.A0O(r0, r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            A03(r4, r0, r2, r3)
            goto L_0x0137
        L_0x01d5:
            int r3 = X.JTO.A05(r11, r4)
            goto L_0x0058
        L_0x01db:
            r13 = 0
            goto L_0x0018
        L_0x01de:
            X.LcI r0 = X.LcI.A00     // Catch:{ all -> 0x026a }
            r3.A0T(r0, r2)     // Catch:{ all -> 0x026a }
            monitor-exit(r1)
            X.Lux r1 = r10.A01
            r1.A06 = r15
            r1.A0F = r5
            int r0 = r30.length()
            if (r0 == 0) goto L_0x01f4
            r0 = r30
            r1.A09 = r0
        L_0x01f4:
            X.LAR r0 = r11.A02
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0200
            boolean r0 = r12.CU6()
            r1.A0C = r0
        L_0x0200:
            X.LBS r0 = r12.BeC()
            X.0qQ.A0A(r0)
            boolean r0 = r0.A03
            r1.A0E = r0
            r1.A0A = r13
            com.instagram.api.schemas.MediaCroppingCoordinates r0 = r12.Bgq()
            if (r0 == 0) goto L_0x0215
            r1.A02 = r0
        L_0x0215:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.POST_LIVE_IGTV
            r3.A0e(r0)
            r3.A0a(r1)
            r3.A0i = r4
            boolean r0 = r12.AcP()
            r3.A4y = r0
            java.lang.String r0 = r12.B2V()
            r3.A2x = r0
            r0 = r29
            java.lang.String r0 = r0.A06
            r3.A2y = r0
            com.instagram.model.fundraiser.NewFundraiserInfo r1 = r12.BVx()
            if (r1 == 0) goto L_0x0264
            int r13 = r1.A00
            java.lang.String r12 = r1.A02
            java.lang.String r11 = r1.A05
            java.lang.String r4 = r1.A07
            boolean r0 = r1.A09
            boolean r25 = X.AnonymousClass7TF.A1S(r0, r5)
            java.lang.String r2 = r1.A01
            java.util.List r1 = r1.A08
            java.lang.String r18 = ""
            java.lang.String r19 = "LIVE_VIDEO"
            com.instagram.model.fundraiser.NewFundraiserInfo r0 = new com.instagram.model.fundraiser.NewFundraiserInfo
            r14 = r0
            r15 = r12
            r16 = r11
            r17 = r4
            r20 = r2
            r21 = r6
            r22 = r6
            r23 = r1
            r24 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3.A1E = r0
        L_0x0264:
            X.L3G r2 = r10.A00()
            goto L_0x03b5
        L_0x026a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x026d:
            X.AnonymousClass7TF.A1B(r9, r5, r11)
            r1 = 62652417(0x3bc0001, float:1.1049648E-36)
            X.L3G r0 = new X.L3G
            r0.<init>(r1)
            r10.A02 = r0
            X.3Q2 r3 = r9.A02
            java.lang.Class<X.Lux> r1 = X.C65534Lux.class
            java.util.ArrayList r0 = r3.A0K(r6, r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0293
            r3.A0N()
            X.Lux r0 = new X.Lux
            r0.<init>()
            r3.A0a(r0)
        L_0x0293:
            java.util.ArrayList r0 = r3.A0K(r6, r1)
            java.util.Iterator r16 = r0.iterator()
        L_0x029b:
            boolean r1 = r16.hasNext()
            r0 = 0
            if (r1 == 0) goto L_0x0347
            java.lang.Object r2 = r16.next()
            X.Lux r2 = (X.C65534Lux) r2
            r2.A06 = r15
            r2.A0F = r5
            int r0 = r30.length()
            if (r0 == 0) goto L_0x02b6
            r0 = r30
            r2.A09 = r0
        L_0x02b6:
            r2.A0A = r13
            com.instagram.api.schemas.MediaCroppingCoordinates r0 = r12.B5R()
            if (r0 == 0) goto L_0x02c0
            r2.A01 = r0
        L_0x02c0:
            com.instagram.api.schemas.MediaCroppingCoordinates r0 = r12.Bgq()
            if (r0 == 0) goto L_0x02c8
            r2.A02 = r0
        L_0x02c8:
            X.LAR r1 = r11.A02
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x02d4
            boolean r0 = r12.CU6()
            r2.A0C = r0
        L_0x02d4:
            com.instagram.igtv.model.IGTVCreationToolsResponse r0 = r11.A00
            if (r0 == 0) goto L_0x02e2
            com.instagram.model.shopping.video.ShoppingCreationConfig r0 = r0.A00
            if (r0 == 0) goto L_0x02e2
            com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata r0 = r12.Bto()
            r2.A03 = r0
        L_0x02e2:
            com.instagram.model.fundraiser.NewFundraiserInfo r14 = r12.BVx()
            if (r14 == 0) goto L_0x0318
            java.lang.String r0 = r14.A02
            r18 = r0
            int r0 = r14.A00
            r27 = r0
            java.lang.String r0 = r14.A05
            r19 = r0
            java.lang.String r0 = r14.A07
            r20 = r0
            boolean r0 = r14.A09
            r28 = r0
            java.lang.String r21 = r12.AlL()
            java.lang.String r0 = r14.A01
            r23 = r0
            java.util.List r0 = r14.A08
            r14 = r0
            java.lang.String r22 = "VIDEO_COMPOSER"
            com.instagram.model.fundraiser.NewFundraiserInfo r0 = new com.instagram.model.fundraiser.NewFundraiserInfo
            r17 = r0
            r24 = r6
            r25 = r6
            r26 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2.A05 = r0
        L_0x0318:
            java.lang.String r0 = r12.B2V()
            if (r0 == 0) goto L_0x0320
            r2.A07 = r0
        L_0x0320:
            X.1Av r14 = X.1Au.A00(r29)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x029b
            java.lang.String r1 = "feed"
            boolean r0 = r14.A24(r1)
            if (r0 == 0) goto L_0x029b
            java.util.Set r0 = r14.A0I(r1)
            java.util.List r0 = X.00k.A0X(r0)
            java.util.Set r1 = X.00k.A0k(r0)
            X.L1x r0 = new X.L1x
            r0.<init>()
            r0.A00 = r1
            r2.A04 = r0
            goto L_0x029b
        L_0x0347:
            X.LAR r2 = r11.A02
            boolean r1 = r2.A01
            if (r1 == 0) goto L_0x0367
            java.util.List r1 = r12.Ahr()
            if (r1 == 0) goto L_0x0361
            r3.A4C = r1
            java.lang.Object r1 = X.00k.A0O(r1, r7)
            com.instagram.pendingmedia.model.BrandedContentTag r1 = (com.instagram.pendingmedia.model.BrandedContentTag) r1
            if (r1 == 0) goto L_0x035f
            boolean r0 = r1.A04
        L_0x035f:
            r3.A65 = r0
        L_0x0361:
            boolean r0 = r12.isPaidPartnership()
            r3.A5i = r0
        L_0x0367:
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r12.BQ3()
            r1 = 0
            if (r0 == 0) goto L_0x05f4
            com.instagram.api.schemas.BrandedContentGatingInfo r0 = r0.F0x()
        L_0x0372:
            r3.A0s = r0
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r0 = r12.Aho()
            if (r0 == 0) goto L_0x05f1
            com.instagram.api.schemas.BrandedContentProjectMetadata r0 = r0.F0y()
        L_0x037e:
            r3.A0t = r0
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x038a
            boolean r0 = r12.AcO()
            r3.A62 = r0
        L_0x038a:
            boolean r0 = r12.B2Q()
            if (r0 == 0) goto L_0x03a9
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
            r3.A0U(r0)
            X.4Cl r0 = X.DbV.A0k(r29)
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B3v()
            if (r0 == 0) goto L_0x03a3
            java.lang.String r1 = r0.getFanClubId()
        L_0x03a3:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r3.A2q = r0
        L_0x03a9:
            boolean r0 = r12.AcP()
            r3.A4y = r0
            r3.A0i = r4
            X.L3G r2 = r10.A00()
        L_0x03b5:
            long r0 = r9.A00()
            X.02m r10 = r2.A01
            int r9 = r2.A00
            java.lang.String r4 = r3.A3t
            java.lang.String r2 = "upload_id"
            r10.markerAnnotate(r9, r2, r4)
            r2 = r29
            java.lang.String r4 = r2.A06
            java.lang.String r2 = "uploader_id"
            r10.markerAnnotate(r9, r2, r4)
            X.1iA r2 = r3.A07()
            java.lang.String r4 = r2.name()
            java.lang.String r2 = "media_type"
            r10.markerAnnotate(r9, r2, r4)
            com.instagram.pendingmedia.model.constants.ShareType r2 = r3.A0E()
            java.lang.String r4 = r2.name()
            r2 = 5037(0x13ad, float:7.058E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r10.markerAnnotate(r9, r2, r4)
            boolean r3 = r3.A5g
            java.lang.String r2 = "is_optimistic_upload"
            r10.markerAnnotate(r9, r2, r3)
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0401
            r2 = 822(0x336, float:1.152E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r10.markerAnnotate(r9, r2, r0)
        L_0x0401:
            android.content.Context r0 = r8.requireContext()
            X.LZq r2 = new X.LZq
            r2.<init>(r0)
            r1 = 9
            X.MIX r0 = new X.MIX
            r0.<init>(r8, r1)
            r2.A00 = r0
            r0 = 46
            X.MMp r0 = X.C66306MMp.A02(r8, r0)
            r2.A01 = r0
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r31)
            X.0eM r0 = r0.A0H
            java.lang.Object r0 = r0.getValue()
            X.LF4 r0 = (X.LF4) r0
            X.2Fk r0 = r0.A00
            r0.A06(r8, r2)
            X.KAz r0 = r8.A0C()
            boolean r0 = r0.A00()
            java.lang.String r12 = "pendingMediaManager"
            if (r0 == 0) goto L_0x043f
            X.1ua r0 = r8.A0S
            if (r0 == 0) goto L_0x050c
            r0.A0J(r8)
        L_0x043f:
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r11 = X.JTO.A0k(r31)
            X.1ua r10 = r8.A0S
            if (r10 == 0) goto L_0x050c
            X.Lsu r0 = X.JTT.A0Y(r8)
            java.lang.String r12 = r0.A0H
            android.content.Context r4 = r8.requireContext()
            r2 = 2
            X.Lsu r3 = r11.A0M
            X.L4g r0 = r3.A0C
            if (r0 == 0) goto L_0x0464
            X.6oS r1 = X.C318116oQ.A00(r11)
            X.JTZ r0 = new X.JTZ
            r0.<init>((android.content.Context) r4, (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r11, (X.AnonymousClass4D7) r6)
            X.AnonymousClass7TE.A1Z(r0, r1)
        L_0x0464:
            X.KTX r0 = r11.A02()
            X.3Q2 r9 = r0.A02
            com.instagram.common.session.UserSession r4 = r11.A06
            X.0qQ.A0B(r9, r2)
            r9.A2Z = r12
            java.util.List r0 = r3.A0O
            r9.A4C = r0
            boolean r0 = r3.A0f
            r9.A5i = r0
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r3.A07
            r2 = 0
            if (r0 == 0) goto L_0x05ee
            com.instagram.api.schemas.BrandedContentGatingInfo r0 = r0.F0x()
        L_0x0482:
            r9.A0s = r0
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r0 = r3.A08
            if (r0 == 0) goto L_0x05eb
            com.instagram.api.schemas.BrandedContentProjectMetadata r0 = r0.F0y()
        L_0x048c:
            r9.A0t = r0
            java.lang.String r0 = r3.A0J
            r9.A33 = r0
            int r1 = r3.A04
            int r0 = r3.A03
            r9.A0C = r1
            r9.A0B = r0
            boolean r0 = r3.A0Y
            r9.A5M = r0
            int r0 = r3.A02
            r9.A05 = r0
            boolean r0 = r3.A0Z
            r9.A5L = r0
            int r0 = r3.A01
            r9.A07 = r0
            X.LBS r1 = r3.A0D
            if (r1 == 0) goto L_0x04b6
            int r0 = r1.A01
            r9.A0H = r0
            int r0 = r1.A00
            r9.A0G = r0
        L_0x04b6:
            boolean r0 = r3.A0b
            r9.A5Z = r0
            boolean r0 = r3.A0U
            if (r0 == 0) goto L_0x05e5
            X.4Cl r0 = X.DbV.A0k(r4)
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B3v()
            if (r0 == 0) goto L_0x04cc
            java.lang.String r2 = r0.getFanClubId()
        L_0x04cc:
            r9.A2q = r2
            if (r2 == 0) goto L_0x05e7
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
        L_0x04d2:
            r9.A1F = r0
            com.instagram.pendingmedia.store.PendingMediaStore r2 = X.28K.A00(r4)
            java.lang.String r1 = r9.A35
            X.0qQ.A0B(r1, r7)
            java.util.Map r0 = r2.A06
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x04ea
            java.lang.String r0 = r9.A35
            r2.A0D(r9, r0)
        L_0x04ea:
            X.LQk r0 = r11.A08
            X.KiE r3 = X.C62581KiE.PUBLISHED
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r2 = r0.A01
            r1 = 6
            X.KiE r0 = r2.A00
            int r0 = r0.A00
            if (r1 <= r0) goto L_0x04f9
            r2.A00 = r3
        L_0x04f9:
            X.0eM r0 = r11.A0H
            java.lang.Object r0 = r0.getValue()
            X.LF4 r0 = (X.LF4) r0
            r0.A01(r4, r9, r10)
            r11.A02 = r5
            X.LAS r0 = r8.A0H
            if (r0 != 0) goto L_0x0514
            java.lang.String r12 = "config"
        L_0x050c:
            X.0qQ.A0F(r12)
        L_0x050f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0514:
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0545
            X.3Q2 r0 = X.LJ9.A01(r8)
            java.lang.String r3 = r0.A3t
            if (r3 == 0) goto L_0x0545
            X.Lsu r0 = X.JTT.A0Y(r8)
            java.util.List r0 = r0.A0P
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x052e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0538
            X.JTU.A1M(r2, r1)
            goto L_0x052e
        L_0x0538:
            X.0eM r0 = r8.A0W
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.8Oa r0 = X.AnonymousClass8OY.A00(r0)
            r0.A01(r3, r2)
        L_0x0545:
            X.KAz r0 = r8.A0C()
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x05da
            android.content.Context r4 = r8.requireContext()
            X.0eM r3 = r8.A0W
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            r1.A01(r0)
            android.view.View r0 = X.C64192LSz.A00(r4, r2)
            r8.A0Q = r0
            java.lang.String r9 = "pendingMediaRowView"
            java.lang.Object r2 = r0.getTag()
            r0 = 1632(0x660, float:2.287E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            X.Luw r2 = (X.C65533Luw) r2
            X.3Q2 r1 = X.LJ9.A01(r8)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.C64192LSz.A01(r0, r6, r6, r2, r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r8.A0R
            java.lang.String r5 = "metadataContainer"
            if (r1 == 0) goto L_0x05e0
            android.view.View r0 = r8.A0Q
            if (r0 == 0) goto L_0x05db
            r1.addView(r0, r7)
            X.4gb r4 = new X.4gb
            r4.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.A0R
            if (r0 == 0) goto L_0x05e0
            r4.A0I(r0)
            android.view.View r0 = r8.A02
            java.lang.String r12 = "promotePostSharingOverlay"
            if (r0 == 0) goto L_0x050c
            int r1 = r0.getId()
            android.view.View r0 = r8.A0Q
            if (r0 == 0) goto L_0x05db
            int r0 = r0.getId()
            r3 = 3
            r2 = 4
            r4.A0C(r1, r3, r0, r2)
            r1 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            android.view.View r0 = r8.A0Q
            if (r0 == 0) goto L_0x05db
            int r0 = r0.getId()
            r4.A0C(r1, r3, r0, r2)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.A0R
            if (r0 == 0) goto L_0x05e0
            r4.A0G(r0)
            android.view.View r0 = r8.A02
            if (r0 == 0) goto L_0x050c
            r0.setVisibility(r7)
            android.widget.TextView r1 = r8.A03
            if (r1 == 0) goto L_0x05da
            r0 = 2131973670(0x7f135626, float:1.9584382E38)
            X.DbU.A1G(r1, r8, r0)
        L_0x05da:
            return
        L_0x05db:
            X.0qQ.A0F(r9)
            goto L_0x050f
        L_0x05e0:
            X.0qQ.A0F(r5)
            goto L_0x050f
        L_0x05e5:
            r9.A2q = r6
        L_0x05e7:
            X.3QO r0 = X.AnonymousClass3QO.DEFAULT
            goto L_0x04d2
        L_0x05eb:
            r0 = r6
            goto L_0x048c
        L_0x05ee:
            r0 = r6
            goto L_0x0482
        L_0x05f1:
            r0 = r6
            goto L_0x037e
        L_0x05f4:
            r0 = r6
            goto L_0x0372
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61942KSr.A06(X.KSr):void");
    }

    public static final void A08(C61942KSr kSr) {
        Object obj;
        AnonymousClass0eM r3 = kSr.A0Y;
        IGTVUploadViewModel A0k = JTO.A0k(r3);
        28D r1 = A0k.A00;
        if (r1 == 28D.A3A || A0k.A06() || r1 == 28D.A39) {
            obj = C61950KSz.A00;
        } else {
            obj = KT0.A00;
        }
        JTO.A0k(r3).A04(kSr, obj);
    }

    public static final void A09(C61942KSr kSr) {
        JTO.A0k(kSr.A0Y).A04(kSr, new KTF(new M02(kSr, 2), LJ9.A01(kSr).A1p));
    }

    public final UserSession A0G() {
        return AnonymousClass7TE.A0l(this.A0W);
    }

    public final boolean BCK() {
        AnonymousClass0eM r2 = this.A0Y;
        IGTVUploadViewModel A0k = JTO.A0k(r2);
        IGTVDraftsRepository A0a = JTP.A0a(A0k);
        Object obj = A0a.A00.get(A0k.A0B);
        if (obj == null) {
            return false;
        }
        IGTVUploadViewModel A0k2 = JTO.A0k(r2);
        L9B l9b = this.A0F;
        if (l9b != null) {
            C363558jv.A00(l9b.A02.A04);
        }
        String str = JTT.A0W(this.A06).A02;
        if (str.length() == 0) {
            str = null;
        }
        return C51966G9m.A1a(A0k2.A01(str), obj);
    }

    public final void Cxb() {
        JTO.A0k(this.A0Y).A04(this, C61947KSw.A00);
    }

    public final void D92() {
        JTO.A0k(this.A0Y).A04(this, C61947KSw.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0W);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata, java.lang.Object] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        L8G l8g;
        String str;
        String str2;
        String str3;
        String str4;
        Object obj;
        List A18;
        String str5;
        User user;
        C60258JiF jiF;
        Bundle extras;
        LoginClient$Result loginClient$Result;
        if (i == 16 || i == 1000 || i == 1001) {
            if (!(i2 != -1 || intent == null || (l8g = this.A0G) == null)) {
                if (i == 16) {
                    IGTVUploadViewModel iGTVUploadViewModel = l8g.A02;
                    IGTVShoppingMetadata iGTVShoppingMetadata = null;
                    MultiProductPickerResult multiProductPickerResult = (MultiProductPickerResult) intent.getParcelableExtra(AnonymousClass000.A00(83));
                    if (multiProductPickerResult != null) {
                        ProductCollection productCollection = multiProductPickerResult.A01;
                        if (productCollection != null) {
                            str = productCollection.Aoi();
                        } else {
                            str = null;
                        }
                        if (productCollection != null) {
                            str2 = productCollection.Aoi();
                            ProductCollectionV2Type Aou = productCollection.Aou();
                            if (Aou != null) {
                                str3 = Aou.A00;
                            }
                            str3 = null;
                        } else {
                            str2 = null;
                            str3 = null;
                        }
                        AnonymousClass57K A002 = C17025VEz.A00(str3);
                        List<Product> list = multiProductPickerResult.A02;
                        Iterator it = list.iterator();
                        while (true) {
                            str4 = null;
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            User user2 = ((Product) obj).A0B;
                            if (user2 != null && AnonymousClass3ZA.A00(user2) != null) {
                                break;
                            }
                        }
                        Product product = (Product) obj;
                        if (product != null && (user = product.A0B) != null) {
                            str4 = user.getId();
                        } else if (A002 == AnonymousClass57K.DISCOUNT) {
                            if (productCollection != null) {
                                str4 = productCollection.BRr();
                            }
                        } else if (str2 == null || (A18 = DbV.A18(str2, ":")) == null) {
                            str4 = null;
                        } else {
                            str4 = C51966G9m.A1G(A18, 2);
                        }
                        TaggingFeedSessionInformation taggingFeedSessionInformation = (TaggingFeedSessionInformation) intent.getParcelableExtra(AnonymousClass000.A00(3978));
                        if (str4 != null) {
                            ? obj2 = new Object();
                            obj2.A01 = str;
                            LinkedHashMap A1H = AnonymousClass7TE.A1H();
                            for (Object next : list) {
                                User user3 = ((Product) next).A0B;
                                if (user3 != null) {
                                    str5 = AnonymousClass3ZA.A00(user3);
                                } else {
                                    str5 = null;
                                }
                                0qQ.A0A(str5);
                                ((List) JTS.A0h(str5, A1H)).add(next);
                            }
                            LinkedHashMap A0o = C51975G9x.A0o(A1H);
                            Iterator A0s = AnonymousClass7TF.A0s(A1H);
                            while (A0s.hasNext()) {
                                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                                Object key = A1J.getKey();
                                ArrayList A1C = AnonymousClass7TE.A1C();
                                for (Product product2 : (Iterable) A1J.getValue()) {
                                    String str6 = product2.A0H;
                                    if (str6 != null) {
                                        A1C.add(str6);
                                    }
                                }
                                A0o.put(key, A1C);
                            }
                            obj2.A04 = A0o;
                            obj2.A00 = taggingFeedSessionInformation;
                            ArrayList A0r = AnonymousClass7TG.A0r(list);
                            for (Product product3 : list) {
                                A0r.add(product3.A0H);
                            }
                            obj2.A03 = A0r;
                            obj2.A02 = str4;
                            boolean z = false;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((Product) it2.next()).A04 != null) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            obj2.A05 = z;
                            iGTVShoppingMetadata = obj2;
                        }
                    }
                    C65414Lsu lsu = iGTVUploadViewModel.A0M;
                    lsu.A0B = iGTVShoppingMetadata;
                    lsu.A0F = C64182LSo.A00(intent);
                    IGTVShoppingMetadata iGTVShoppingMetadata2 = lsu.A0B;
                    if ((iGTVShoppingMetadata2 == null || !iGTVShoppingMetadata2.A05) && !lsu.A0f) {
                        lsu.A07 = null;
                    }
                } else if (i == 1000 || i == 1001) {
                    0sn<MediaTaggingInfo> parcelableArrayListExtra = intent.getParcelableArrayListExtra("media_tagging_info_list");
                    if (parcelableArrayListExtra == null) {
                        parcelableArrayListExtra = 0sn.A00;
                    }
                    for (MediaTaggingInfo mediaTaggingInfo : parcelableArrayListExtra) {
                        if (mediaTaggingInfo != null) {
                            IGTVUploadViewModel iGTVUploadViewModel2 = l8g.A02;
                            if (0qQ.A0K(iGTVUploadViewModel2.A02().A02.A3t, mediaTaggingInfo.A06)) {
                                KTX A022 = iGTVUploadViewModel2.A02();
                                ArrayList arrayList = mediaTaggingInfo.A0B;
                                0qQ.A0B(arrayList, 0);
                                AnonymousClass3Q2 r1 = A022.A02;
                                ArrayList A1D = AnonymousClass7TE.A1D(arrayList);
                                0qQ.A0B(A1D, 0);
                                r1.A40 = A1D;
                                A022.A01.EfX(arrayList);
                                iGTVUploadViewModel2.A02().A02.A2d = mediaTaggingInfo.A05;
                            }
                        }
                    }
                }
            }
        } else if (i2 == -1) {
            C60258JiF jiF2 = this.A0E;
            if (jiF2 != null) {
                UserSession userSession = jiF2.A04;
                CallerContext callerContext = 1KM.A00;
                String str7 = null;
                boolean z2 = false;
                if (!(intent == null || (extras = intent.getExtras()) == null)) {
                    Object obj3 = extras.get(AnonymousClass000.A00(554));
                    if ((obj3 instanceof LoginClient$Result) && (loginClient$Result = (LoginClient$Result) obj3) != null) {
                        LoginClient$Request loginClient$Request = loginClient$Result.A01;
                        str7 = loginClient$Request.A01;
                        z2 = loginClient$Request.A02;
                    }
                }
                C49822F8k.A00();
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put(AnonymousClass000.A00(601), String.valueOf(AnonymousClass1G3.A03()));
                A1E.put("exception", (Object) null);
                C9831Rht.A00(userSession, AnonymousClass000.A00(1336), str7, A1E, z2);
            }
            if (!(i != 132 || intent == null || intent.getStringExtra("page_name") == null || (jiF = this.A0E) == null)) {
                KTX ktx = jiF.A06;
                boolean A1P = AnonymousClass7TF.A1P(DbX.A1b(jiF.A07) ? 1 : 0);
                ktx.A02.A5T = A1P;
                ktx.A01.EkA(A1P);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public C61942KSr() {
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A04 = of;
        this.A0W = C227642jf.A02(this);
    }

    public static final void A05(C295095nZ r5, C61942KSr kSr, boolean z) {
        FragmentActivity requireActivity = kSr.requireActivity();
        K51 A002 = C63224KtV.A00("video_feed");
        A002.A01 = new C65255Lpz(1, kSr, r5);
        C331127Pr A0W2 = DbS.A0W(AnonymousClass7TE.A0l(kSr.A0W));
        DbS.A1S(A0W2, false);
        A0W2.A0U = new C65741Lyv(2, r5, kSr);
        A0W2.A0F = ViewConfiguration.get(requireActivity).getScaledPagingTouchSlop();
        C331157Pu A003 = A0W2.A00();
        if (z) {
            AnonymousClass7TE.A1Z(new MHE(A003, requireActivity, A002, (AnonymousClass4D7) null, 47), AnonymousClass07a.A00(requireActivity));
            return;
        }
        A003.A02(requireActivity, A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0.A01 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C61942KSr r17) {
        /*
            X.KAz r0 = r17.A0C()
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0096
            X.KTX r2 = X.JTT.A0X(r17)
            X.Lsu r0 = X.JTT.A0Y(r17)
            com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata r0 = r0.A0B
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = r0.A01
            r13 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r13 = 0
        L_0x001c:
            X.KAz r0 = r17.A0C()
            X.Lsu r1 = X.JTT.A0Y(r17)
            java.lang.String r5 = r1.A0H
            X.3Q2 r3 = X.LJ9.A01(r17)
            boolean r1 = r3.CJe()
            r11 = 1
            r15 = 0
            if (r1 == 0) goto L_0x008c
            java.util.List r1 = r3.A4C
            if (r1 == 0) goto L_0x008c
            int r1 = r1.size()
            if (r1 != r11) goto L_0x008c
            java.util.List r1 = r3.A4C
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = X.00k.A0O(r1, r15)
            com.instagram.pendingmedia.model.BrandedContentTag r1 = (com.instagram.pendingmedia.model.BrandedContentTag) r1
            if (r1 == 0) goto L_0x0091
            boolean r1 = r1.A03
            if (r1 != 0) goto L_0x008a
            r17.A0G()
        L_0x004f:
            X.3Q2 r3 = r2.A02
            boolean r12 = r3.A0t()
            com.instagram.user.model.UpcomingEventImpl r1 = r3.A1p
            boolean r14 = X.AnonymousClass7TF.A1V(r1)
            int r8 = r3.A0R
            int r9 = r3.A0S
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r2.A00()
            long r1 = r4.toSeconds(r1)
            double r6 = (double) r1
            boolean r17 = r3.A0u()
            java.util.List r1 = r3.A0L()
            int r10 = r1.size()
            r16 = 1
            com.instagram.common.session.UserSession r4 = r0.A0D
            X.1OC r2 = X.C18765W0j.A02(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1P0 r1 = r0.A0C
            r2.A00 = r1
            X.4D6 r0 = r0.A05
            if (r0 == 0) goto L_0x0089
            r0.schedule(r2)
        L_0x0089:
            return
        L_0x008a:
            r11 = 0
            goto L_0x004f
        L_0x008c:
            boolean r11 = r3.CJe()
            goto L_0x004f
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0096:
            A06(r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61942KSr.A07(X.KSr):void");
    }

    public static final void A0A(C61942KSr kSr) {
        if (kSr.getContext() != null) {
            kSr.A0B(kSr.A0D());
        }
    }

    /* JADX WARNING: type inference failed for: r3v35, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v21, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x04ab, code lost:
        if (r5.A00 != true) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0515, code lost:
        if (r5.A00 != true) goto L_0x0517;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0591, code lost:
        if (r5 != null) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x068a, code lost:
        if (X.C51968G9o.A0o(r11).getInt("igtv_creation_monetization_toggle_turn_off_count", 0) > 2) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x06ad, code lost:
        if (r5.A00 == false) goto L_0x06af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0701, code lost:
        if (r0.A0O == false) goto L_0x0703;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0341, code lost:
        if (X.182.A06(X.DbS.A0J(r11, 0), r11, 36323186962410474L) == false) goto L_0x0343;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A0D() {
        /*
            r37 = this;
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r0 = r37
            X.Lsu r2 = X.JTT.A0Y(r0)
            java.lang.String r5 = r2.A0H
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            X.Lsu r2 = X.JTT.A0Y(r0)
            java.lang.String r2 = r2.A0J
            if (r2 == 0) goto L_0x074a
            android.net.Uri r16 = X.0cp.A03(r2)
        L_0x001a:
            boolean r3 = X.JTT.A1a(r0)
            r6 = 1
            r2 = 0
            if (r3 == 0) goto L_0x0747
            X.Lsu r3 = X.JTT.A0Y(r0)
            boolean r3 = r3.A0Y
            if (r3 != 0) goto L_0x0747
            X.Lsu r3 = X.JTT.A0Y(r0)
            java.lang.String r3 = r3.A0J
            if (r3 != 0) goto L_0x0747
            com.google.common.collect.ImmutableList r3 = r0.A04
            boolean r3 = X.AnonymousClass7TE.A1b(r3)
            if (r3 == 0) goto L_0x0747
            com.google.common.collect.ImmutableList r3 = r0.A04
            java.lang.Object r4 = r3.get(r2)
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
        L_0x0042:
            r10 = 0
            X.KGM r3 = new X.KGM
            r15 = r3
            r17 = r0
            r18 = r4
            r19 = r14
            r20 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            r1.add(r3)
            X.LAS r3 = r0.A0H
            java.lang.String r19 = "config"
            if (r3 == 0) goto L_0x074e
            r3 = 2131969343(0x7f13453f, float:1.9575606E38)
            java.lang.String r8 = X.DbU.A0m(r0, r3)
            X.Lss r7 = new X.Lss
            r7.<init>(r0)
            X.L8G r4 = r0.A0G
            if (r4 == 0) goto L_0x0744
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r12 = r4.A02
            X.KTX r3 = r12.A02()
            X.MW0 r3 = r3.A01
            java.util.List r3 = r3.BbY()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0744
            X.4DH r3 = r4.A00
            android.content.res.Resources r9 = X.DbV.A05(r3)
            r5 = 2131820887(0x7f110157, float:1.9274502E38)
            X.KTX r3 = r12.A02()
            X.MW0 r3 = r3.A01
            java.util.List r3 = r3.BbY()
            int r4 = r3.size()
            X.KTX r3 = r12.A02()
            X.MW0 r3 = r3.A01
            java.util.List r3 = r3.BbY()
            java.lang.Object r3 = X.00k.A0I(r3)
            com.instagram.model.people.PeopleTag r3 = (com.instagram.model.people.PeopleTag) r3
            com.instagram.model.people.PeopleTag$UserInfo r3 = r3.A00
            java.lang.String r11 = r3.A04
            X.KTX r3 = r12.A02()
            X.MW0 r3 = r3.A01
            java.util.List r3 = r3.BbY()
            int r3 = r3.size()
            java.lang.Object[] r3 = X.C51968G9o.A1Z(r11, r3)
            java.lang.String r5 = r9.getQuantityString(r5, r4, r3)
        L_0x00bd:
            X.0eM r3 = r0.A0W
            r32 = r3
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r32)
            X.LiI r3 = new X.LiI
            r3.<init>(r4, r7, r8, r5)
            r1.add(r3)
            X.LAS r3 = r0.A0H
            if (r3 == 0) goto L_0x074e
            boolean r3 = r3.A01
            if (r3 == 0) goto L_0x0116
            r8 = 2131952328(0x7f1302c8, float:1.9541096E38)
            r3 = 20
            X.LY6 r7 = X.LY6.A00(r0, r3)
            r0.A0G()
            X.Lsu r3 = X.JTT.A0Y(r0)
            java.util.List r9 = r3.A0O
            android.content.Context r5 = r0.requireContext()
            X.Lsu r3 = X.JTT.A0Y(r0)
            boolean r4 = r3.A0f
            X.Lsu r3 = X.JTT.A0Y(r0)
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r3 = r3.A08
            java.lang.String r4 = X.LSV.A00(r5, r3, r9, r4)
            X.Li6 r3 = new X.Li6
            r3.<init>(r7, r4, r8)
            r1.add(r3)
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r32)
            java.lang.Integer r5 = X.AnonymousClass05K.A0F
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r32)
            java.lang.Integer r3 = X.LPL.A00(r3)
            X.JVF.A02(r0, r7, r5, r4, r3)
        L_0x0116:
            X.LAS r3 = r0.A0H
            if (r3 == 0) goto L_0x074e
            X.3Q2 r3 = X.LJ9.A01(r0)
            com.instagram.model.venue.LocationDict r3 = r3.A1H
            if (r3 == 0) goto L_0x0741
            com.instagram.model.venue.Venue r7 = new com.instagram.model.venue.Venue
            r7.<init>()
            r7.A00 = r3
        L_0x0129:
            java.util.List r5 = r0.A0J
            boolean r4 = r0.A0P
            X.Li8 r3 = new X.Li8
            r3.<init>(r7, r5, r4)
            r1.add(r3)
            X.LAS r3 = r0.A0H
            if (r3 == 0) goto L_0x074e
            boolean r3 = r0.A03
            r7 = 2
            if (r3 == 0) goto L_0x0161
            boolean r3 = X.JTT.A1a(r0)
            r0.A0G()
            if (r3 != 0) goto L_0x0161
            r3 = 2131964093(0x7f1330bd, float:1.9564958E38)
            java.lang.String r8 = X.DbU.A0m(r0, r3)
            boolean r3 = r0.A02
            if (r3 == 0) goto L_0x0717
            r3 = 2131964112(0x7f1330d0, float:1.9564996E38)
            java.lang.String r4 = r0.getString(r3)
        L_0x0159:
            X.Lhy r3 = new X.Lhy
            r3.<init>(r8, r4)
            r1.add(r3)
        L_0x0161:
            X.Lsu r3 = X.JTT.A0Y(r0)
            boolean r3 = r3.A0i
            if (r3 == 0) goto L_0x01f8
            X.Lsu r3 = X.JTT.A0Y(r0)
            com.instagram.model.fundraiser.NewFundraiserInfo r13 = r3.A0E
            X.0eM r3 = r0.A0Y
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r4 = X.JTO.A0k(r3)
            X.0eE r5 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r4 = r4.A06
            X.4Cl r4 = X.DbS.A0h(r4, r5)
            X.DV3 r5 = r4.Bya()
            r21 = 0
            if (r5 == 0) goto L_0x0193
            boolean r4 = r5.BAV()
            if (r4 == 0) goto L_0x0714
            boolean r4 = r5.Al4()
            if (r4 == 0) goto L_0x0714
        L_0x0191:
            r21 = r5
        L_0x0193:
            X.Lsu r4 = X.JTT.A0Y(r0)
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r12 = r4.A0G
            A01(r0)
            r4 = 10
            X.MIX r9 = new X.MIX
            r9.<init>(r0, r4)
            r4 = 64
            X.MId r26 = X.JTO.A1C(r0, r4)
            r4 = 65
            X.MId r27 = X.JTO.A1C(r0, r4)
            r4 = 11
            X.MIX r8 = new X.MIX
            r8.<init>(r0, r4)
            r4 = 66
            X.MId r28 = X.JTO.A1C(r0, r4)
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r32)
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r3 = X.JTO.A0k(r3)
            X.0eM r3 = r3.A0D
            java.lang.Object r5 = X.AnonymousClass7TE.A14(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = "VIDEO_COMPOSER"
            X.L8e r3 = new X.L8e
            r3.<init>(r0, r11, r4, r5)
            if (r21 == 0) goto L_0x01db
            boolean r4 = r21.Al4()
            if (r4 == r6) goto L_0x01dd
        L_0x01db:
            r21 = 0
        L_0x01dd:
            X.M10 r23 = new X.M10
            r24 = r9
            r25 = r8
            r23.<init>(r24, r25, r26, r27, r28)
            r26 = 8
            X.Kfb r4 = new X.Kfb
            r20 = r4
            r22 = r13
            r24 = r3
            r25 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r1.add(r4)
        L_0x01f8:
            X.0eE r4 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r32)
            com.instagram.user.model.User r3 = r4.A01(r3)
            boolean r3 = r3.A1M()
            if (r3 == 0) goto L_0x0228
            X.3Q2 r3 = X.LJ9.A01(r0)
            java.util.ArrayList r3 = r3.A41
            java.util.Iterator r5 = r3.iterator()
        L_0x0212:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x06ed
            java.lang.Object r3 = r5.next()
            com.instagram.model.shopping.ProductTag r3 = (com.instagram.model.shopping.ProductTag) r3
            com.instagram.api.schemas.ProductReviewStatus r4 = com.instagram.api.schemas.ProductReviewStatus.APPROVED
            com.instagram.user.model.ProductDetailsProductItemDictIntf r3 = r3.A02
            com.instagram.api.schemas.ProductReviewStatus r3 = r3.BoK()
            if (r4 == r3) goto L_0x0212
        L_0x0228:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r32)
            boolean r3 = X.AnonymousClass2o2.A00(r3)
            if (r3 == 0) goto L_0x0273
            android.content.Context r4 = r0.requireContext()
            X.LM3 r3 = new X.LM3
            r3.<init>(r4)
            r0.A0A = r3
            r3 = 31
            X.LsA r5 = new X.LsA
            r5.<init>(r0, r3)
            android.content.Context r4 = r0.requireContext()
            r3 = 2131961790(0x7f1327be, float:1.9560287E38)
            java.lang.String r25 = X.AnonymousClass7TE.A16(r4, r3)
            X.Lsu r3 = X.JTT.A0Y(r0)
            boolean r4 = r3.A0U
            X.LiV r3 = new X.LiV
            r20 = r3
            r21 = r10
            r22 = r10
            r23 = r5
            r24 = r10
            r26 = r10
            r27 = r10
            r28 = r4
            r29 = r6
            r30 = r2
            r31 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.add(r3)
        L_0x0273:
            X.LAS r3 = r0.A0H
            if (r3 == 0) goto L_0x074e
            boolean r3 = r3.A06
            if (r3 == 0) goto L_0x02da
            boolean r3 = X.JTT.A1a(r0)
            r0.A0G()
            if (r3 != 0) goto L_0x02da
            X.L9r r5 = r0.A0D
            if (r5 == 0) goto L_0x02da
            X.KTX r3 = X.JTT.A0X(r0)
            long r21 = r3.A00()
            X.KAz r3 = r0.A0C()
            boolean r20 = r3.A00()
            r3 = 26
            X.MPA r9 = X.MPA.A00(r0, r3)
            X.LFB r8 = r5.A04
            com.instagram.monetization.repository.MonetizationRepository r15 = r8.A02
            com.instagram.api.schemas.UserMonetizationProductType r13 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE
            boolean r3 = r15.A04(r13)
            if (r3 != 0) goto L_0x063b
            boolean r7 = r5.A00
            android.content.res.Resources r4 = r5.A01
            r3 = 2131964043(0x7f13308b, float:1.9564856E38)
            java.lang.String r23 = X.AnonymousClass7TF.A0d(r4, r3)
            X.MBg r4 = new X.MBg
            r4.<init>(r9)
            r3 = 4852(0x12f4, float:6.799E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            android.text.SpannableStringBuilder r22 = r8.A01(r4, r3, r6)
            com.instagram.common.session.UserSession r3 = r5.A02
            X.LiR r4 = new X.LiR
            r20 = r4
            r21 = r3
            r24 = r2
            r25 = r7
            r26 = r2
            r27 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
        L_0x02d7:
            r1.add(r4)
        L_0x02da:
            android.content.Context r8 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r32)
            X.KCi r3 = new X.KCi
            r3.<init>(r4, r2)
            X.2YN r4 = X.JTO.A0L(r3, r5)
            java.lang.Class<X.Jik> r3 = X.C60288Jik.class
            X.2YL r7 = r4.A00(r3)
            X.Jik r7 = (X.C60288Jik) r7
            com.facebook.common.callercontext.CallerContext r4 = r0.A0Z
            X.0qQ.A06(r4)
            com.instagram.common.session.UserSession r3 = r7.A00
            X.Ju9 r5 = X.C367288qV.A01(r4, r3)
            if (r5 == 0) goto L_0x0438
            boolean r3 = X.JTT.A1a(r0)
            if (r3 == 0) goto L_0x0343
            boolean r3 = X.JTT.A1a(r0)
            r0.A0G()
            if (r3 == 0) goto L_0x0343
            X.0Ud r3 = r7.A04
            java.lang.Object r3 = r3.getValue()
            X.Drk r3 = (X.C47169Drk) r3
            boolean r3 = r3.A05
            if (r3 != 0) goto L_0x0343
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r32)
            boolean r3 = X.C367288qV.A04(r10, r3)
            if (r3 == 0) goto L_0x0343
            com.instagram.share.facebook.model.FBReelsAudienceType r9 = r5.A01
            com.instagram.share.facebook.model.FBReelsAudienceType r3 = com.instagram.share.facebook.model.FBReelsAudienceType.A07
            if (r9 == r3) goto L_0x0343
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r32)
            X.0Tu r9 = X.DbS.A0J(r11, r2)
            r2 = 36323186962410474(0x810bbf00012bea, double:3.034267924537942E-306)
            boolean r2 = X.182.A06(r9, r11, r2)
            r9 = 1
            if (r2 != 0) goto L_0x0344
        L_0x0343:
            r9 = 0
        L_0x0344:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r32)
            X.2D6 r2 = X.2D5.A00(r2)
            X.0xa r2 = r2.A04
            X.0xY r3 = r2.AR4()
            java.lang.String r2 = "PREFERENCE_IG_TO_FB_WASLIVE_IS_CROSSPOSTING_ENABLED"
            r3.E5T(r2, r9)
            r3.apply()
            if (r9 == 0) goto L_0x0438
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131971821(0x7f134eed, float:1.9580632E38)
            java.lang.String r23 = X.AnonymousClass7TF.A0d(r3, r2)
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131968751(0x7f1342ef, float:1.9574405E38)
            java.lang.String r24 = X.AnonymousClass7TF.A0d(r3, r2)
            X.0Ud r7 = r7.A04
            java.lang.Object r2 = r7.getValue()
            X.Drk r2 = (X.C47169Drk) r2
            boolean r2 = r2.A05
            r2 = r2 ^ 1
            r0.A0N = r2
            java.lang.Object r2 = r7.getValue()
            X.Drk r2 = (X.C47169Drk) r2
            boolean r3 = r2.A04
            if (r3 == 0) goto L_0x0637
            android.content.res.Resources r9 = r8.getResources()
            r2 = 2131968777(0x7f134309, float:1.9574458E38)
            java.lang.String r24 = r9.getString(r2)
            java.lang.CharSequence r22 = X.LPW.A00(r8, r5)
        L_0x0399:
            r9 = 4
            X.LXJ r2 = new X.LXJ
            r2.<init>(r9, r0, r3)
            int r25 = X.AnonymousClass7TG.A02(r8)
            java.lang.String r9 = "ig_video_sharing_settings"
            X.LiP r8 = new X.LiP
            r20 = r8
            r21 = r2
            r26 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r1.add(r8)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r32)
            X.27r r8 = X.27p.A01(r2)
            X.JVj r15 = X.C59725JVj.WASLIVE_SHARE_SHEET
            boolean r2 = r0.A0N
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            X.0wc r11 = r8.A01
            java.lang.String r2 = "ig_camera_share_sheet_entity_impression"
            X.0Aj r12 = X.AnonymousClass7TE.A0e(r11, r2)
            boolean r2 = r12.isSampled()
            if (r2 == 0) goto L_0x03f4
            X.AnonymousClass7TH.A0W(r12, r8)
            X.283 r11 = r8.A04
            X.JTP.A1I(r12, r11)
            r8 = 51
            java.lang.String r2 = "entity_type"
            X.AnonymousClass7TE.A1W(r12, r2, r8)
            X.DbS.A1K(r12, r9)
            X.JTS.A19(r12, r11)
            X.C51965G9l.A1A(r15, r12)
            X.DbY.A1C(r12)
            java.lang.String r2 = "is_crosspost"
            r12.A7p(r2, r13)
            r12.Cgf()
        L_0x03f4:
            X.KTX r2 = X.JTT.A0X(r0)
            if (r3 == 0) goto L_0x061a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            X.3Q2 r2 = r2.A02
            r2.A23 = r3
            X.KTX r2 = X.JTT.A0X(r0)
            java.lang.String r3 = r5.A03
            X.3Q2 r2 = r2.A02
            r2.A3R = r3
            X.3Q2 r2 = X.LJ9.A01(r0)
            r2.A2C = r14
            X.KTX r3 = X.JTT.A0X(r0)
            java.lang.Object r2 = r7.getValue()
            X.Drk r2 = (X.C47169Drk) r2
            boolean r2 = r2.A03
            X.3Q2 r3 = r3.A02
            if (r2 == 0) goto L_0x0617
            r2 = 416(0x1a0, float:5.83E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r2)
        L_0x042c:
            r3.A4N = r2
            X.KTX r2 = X.JTT.A0X(r0)
            com.instagram.share.facebook.model.FBReelsAudienceType r3 = r5.A01
        L_0x0434:
            X.3Q2 r2 = r2.A02
            r2.A1n = r3
        L_0x0438:
            X.LAS r2 = r0.A0H
            if (r2 == 0) goto L_0x074e
            boolean r2 = r2.A04
            if (r2 == 0) goto L_0x0550
            X.JiF r2 = r0.A0E
            if (r2 == 0) goto L_0x0614
            X.2Fk r2 = r2.A00
            if (r2 == 0) goto L_0x0614
            java.lang.Object r2 = r2.A02()
            X.L4f r2 = (X.C63721L4f) r2
            if (r2 == 0) goto L_0x0614
            java.lang.String r2 = r2.A00
        L_0x0452:
            X.5w9 r3 = X.AnonymousClass5w8.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r32)
            X.5nZ r5 = X.JTT.A0S(r3)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r32)
            X.AnonymousClass5w9.A00(r3)
            android.content.res.Resources r7 = X.DbV.A05(r0)
            r3 = 2131952005(0x7f130185, float:1.954044E38)
            java.lang.String r12 = r7.getString(r3)
            android.content.res.Resources r8 = X.Dbb.A09(r0, r12)
            r7 = 2131973684(0x7f135634, float:1.958441E38)
            if (r5 == 0) goto L_0x0611
            java.lang.String r3 = r5.A03
        L_0x0479:
            java.lang.String r11 = X.DbV.A0w(r8, r12, r3, r7)
            android.content.res.Resources r7 = X.Dbb.A09(r0, r11)
            r3 = 2131952006(0x7f130186, float:1.9540443E38)
            java.lang.String r9 = r7.getString(r3)
            android.content.res.Resources r7 = X.Dbb.A09(r0, r9)
            r3 = 2131973685(0x7f135635, float:1.9584413E38)
            java.lang.String r7 = X.AnonymousClass7TF.A0e(r7, r9, r3)
            X.0qQ.A07(r7)
            X.0r1 r3 = new X.0r1
            r3.<init>()
            android.content.res.Resources r13 = X.DbV.A05(r0)
            r8 = 2131962383(0x7f132a0f, float:1.956149E38)
            java.lang.String r8 = X.AnonymousClass7TF.A0d(r13, r8)
            if (r5 == 0) goto L_0x04ad
            boolean r14 = r5.A00
            r13 = 1
            if (r14 == r6) goto L_0x04ae
        L_0x04ad:
            r13 = 0
        L_0x04ae:
            r15 = r13 ^ 1
            X.JiF r13 = r0.A0E
            if (r13 == 0) goto L_0x060b
            com.instagram.common.session.UserSession r13 = r13.A04
            boolean r13 = X.AnonymousClass5w9.A01(r13)
            if (r13 != r6) goto L_0x060b
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r32)
            X.8jd r2 = X.C363388je.A00(r2)
            X.5wF r13 = r2.A00(r4)
            android.content.Context r4 = r0.requireContext()
            X.JiF r2 = r0.A0E
            if (r2 == 0) goto L_0x0608
            X.2Fk r2 = r2.A00
            if (r2 == 0) goto L_0x0608
            java.lang.Object r2 = r2.A02()
            X.L4f r2 = (X.C63721L4f) r2
            if (r2 == 0) goto L_0x0608
            java.lang.String r14 = r2.A00
        L_0x04de:
            boolean r2 = X.C363388je.A02(r13)
            java.lang.String r2 = X.C59912Jbb.A02(r4, r5, r2)
            if (r14 != 0) goto L_0x05e3
            if (r2 != 0) goto L_0x05e3
            r2 = 0
        L_0x04eb:
            if (r5 == 0) goto L_0x058f
            boolean r4 = r5.A00
            if (r4 != 0) goto L_0x058f
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r32)
            if (r15 == 0) goto L_0x0589
            X.K95 r22 = r0.A00(r4, r7)
        L_0x04fb:
            boolean r4 = r5.A00
            if (r4 != r6) goto L_0x0595
            r27 = 0
        L_0x0501:
            if (r15 == 0) goto L_0x0587
            r4 = 4
            X.LXV r7 = new X.LXV
            r7.<init>(r3, r0, r8, r4)
        L_0x0509:
            r4 = 32
            X.LsA r8 = new X.LsA
            r8.<init>(r0, r4)
            if (r5 == 0) goto L_0x0517
            boolean r5 = r5.A00
            r4 = 1
            if (r5 == r6) goto L_0x0518
        L_0x0517:
            r4 = 0
        L_0x0518:
            r30 = r4 ^ 1
            X.L9B r4 = r0.A0F
            if (r4 == 0) goto L_0x0585
            boolean r9 = r4.A00
        L_0x0520:
            if (r30 == 0) goto L_0x0523
            r9 = 0
        L_0x0523:
            android.content.Context r5 = r0.requireContext()
            r4 = 2131973560(0x7f1355b8, float:1.958416E38)
            java.lang.String r25 = X.AnonymousClass7TE.A16(r5, r4)
            X.L9B r4 = r0.A0F
            if (r4 == 0) goto L_0x0534
            boolean r6 = r4.A01
        L_0x0534:
            java.lang.String r5 = r0.A0I
            boolean r4 = r3.A00
            X.LiV r3 = new X.LiV
            r20 = r3
            r21 = r7
            r23 = r8
            r24 = r2
            r26 = r5
            r28 = r9
            r29 = r6
            r31 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.add(r3)
        L_0x0550:
            X.LAS r2 = r0.A0H
            if (r2 == 0) goto L_0x074e
            boolean r2 = r2.A05
            if (r2 == 0) goto L_0x0576
            r6 = 2131964038(0x7f133086, float:1.9564846E38)
            r2 = 30
            X.LsA r5 = new X.LsA
            r5.<init>(r0, r2)
            X.Lsu r2 = X.JTT.A0Y(r0)
            boolean r4 = r2.A0b
            X.Lsu r2 = X.JTT.A0Y(r0)
            boolean r3 = r2.A0c
            X.LiH r2 = new X.LiH
            r2.<init>(r5, r6, r4, r3)
            r1.add(r2)
        L_0x0576:
            r2 = 19
            X.LY6 r2 = X.LY6.A00(r0, r2)
            X.JyP r0 = new X.JyP
            r0.<init>(r2)
            r1.add(r0)
            return r1
        L_0x0585:
            r9 = 0
            goto L_0x0520
        L_0x0587:
            r7 = 0
            goto L_0x0509
        L_0x0589:
            X.K95 r22 = r0.A00(r4, r11)
            goto L_0x04fb
        L_0x058f:
            r22 = 0
            if (r5 == 0) goto L_0x0595
            goto L_0x04fb
        L_0x0595:
            if (r15 == 0) goto L_0x05de
            java.lang.String[] r4 = new java.lang.String[]{r9, r7}
        L_0x059b:
            java.util.List r27 = X.0sr.A1P(r4)
            com.instagram.common.session.UserSession r28 = X.AnonymousClass7TE.A0l(r32)
            if (r5 == 0) goto L_0x05db
            boolean r7 = r5.A00
            X.5nW r4 = r5.A02
        L_0x05a9:
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r0.requireContext()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r32)
            X.AnonymousClass5w9.A00(r4)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r32)
            boolean r35 = X.C363558jv.A00(r4)
            if (r5 == 0) goto L_0x05d8
            boolean r4 = r5.A05
            X.5nY r9 = r5.A01
        L_0x05c5:
            java.lang.String r33 = java.lang.String.valueOf(r9)
            java.lang.String r29 = "default_privacy_instruction_view_impression"
            java.lang.String r32 = "video_feed"
            r31 = r10
            r34 = r7
            r36 = r4
            X.C295105na.A02(r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x0501
        L_0x05d8:
            r4 = 0
            r9 = 0
            goto L_0x05c5
        L_0x05db:
            r7 = 0
            r4 = 0
            goto L_0x05a9
        L_0x05de:
            java.lang.String[] r4 = new java.lang.String[]{r12, r11}
            goto L_0x059b
        L_0x05e3:
            android.content.res.Resources r13 = r4.getResources()
            if (r2 != 0) goto L_0x05f6
            r4 = 2131962369(0x7f132a01, float:1.9561461E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r14}
        L_0x05f0:
            android.text.Spanned r2 = X.0bC.A00(r13, r2, r4)
            goto L_0x04eb
        L_0x05f6:
            if (r14 != 0) goto L_0x0600
            r4 = 2131962370(0x7f132a02, float:1.9561463E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            goto L_0x05f0
        L_0x0600:
            r4 = 2131962368(0x7f132a00, float:1.956146E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r14, r2}
            goto L_0x05f0
        L_0x0608:
            r14 = 0
            goto L_0x04de
        L_0x060b:
            r27 = 0
            r22 = 0
            goto L_0x0501
        L_0x0611:
            r3 = 0
            goto L_0x0479
        L_0x0614:
            r2 = 0
            goto L_0x0452
        L_0x0617:
            r2 = 0
            goto L_0x042c
        L_0x061a:
            r3 = 0
            X.3Q2 r2 = r2.A02
            r2.A23 = r10
            X.3Q2 r2 = X.LJ9.A01(r0)
            r2.A3R = r10
            X.3Q2 r2 = X.LJ9.A01(r0)
            r2.A2C = r10
            X.3Q2 r2 = X.LJ9.A01(r0)
            r2.A4N = r10
            X.KTX r2 = X.JTT.A0X(r0)
            goto L_0x0434
        L_0x0637:
            r22 = 0
            goto L_0x0399
        L_0x063b:
            com.instagram.common.session.UserSession r12 = r8.A01
            X.0Tu r11 = X.0Tu.A05
            r3 = 36592966743098114(0x82011c00000302, double:3.2048777441607886E-306)
            long r17 = X.JTS.A05(r11, r12, r3)
            int r16 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r16 < 0) goto L_0x06c2
            long r16 = X.JTS.A05(r11, r12, r3)
            int r3 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r3 < 0) goto L_0x02da
            boolean r3 = r15.A04(r13)
            if (r3 == 0) goto L_0x02da
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r3 = r5.A03
            X.Lsu r3 = r3.A0M
            boolean r4 = r3.A0V
            boolean r3 = r5.A00
            if (r4 != 0) goto L_0x068c
            if (r3 != 0) goto L_0x068c
            r3 = 36310800276652338(0x81007b00000132, double:3.026434534587317E-306)
            boolean r3 = X.182.A06(r11, r12, r3)
            if (r3 == 0) goto L_0x068c
            X.0eM r11 = r8.A03
            X.0xa r4 = X.C51968G9o.A0o(r11)
            java.lang.String r3 = "igtv_creation_monetization_toggle_tooltip_impression"
            int r3 = r4.getInt(r3, r2)
            if (r3 >= r7) goto L_0x068c
            X.0xa r4 = X.C51968G9o.A0o(r11)
            java.lang.String r3 = "igtv_creation_monetization_toggle_turn_off_count"
            int r4 = r4.getInt(r3, r2)
            r3 = 1
            if (r4 <= r7) goto L_0x068d
        L_0x068c:
            r3 = 0
        L_0x068d:
            boolean r7 = r5.A00
            r26 = 0
            if (r3 == 0) goto L_0x0695
            r26 = 1
        L_0x0695:
            android.content.res.Resources r4 = r5.A01
            r3 = 2131964001(0x7f133061, float:1.9564771E38)
            java.lang.String r23 = X.AnonymousClass7TF.A0d(r4, r3)
            X.MBg r3 = new X.MBg
            r3.<init>(r9)
            android.text.SpannableStringBuilder r22 = r8.A00(r3)
            if (r20 == 0) goto L_0x06af
            boolean r3 = r5.A00
            r27 = 1
            if (r3 != 0) goto L_0x06b1
        L_0x06af:
            r27 = 0
        L_0x06b1:
            com.instagram.common.session.UserSession r3 = r5.A02
            X.LiR r4 = new X.LiR
            r20 = r4
            r21 = r3
            r24 = r6
            r25 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x02d7
        L_0x06c2:
            boolean r7 = r5.A00
            android.content.res.Resources r4 = r5.A01
            r3 = 2131964045(0x7f13308d, float:1.956486E38)
            java.lang.String r23 = X.AnonymousClass7TF.A0d(r4, r3)
            X.MBg r4 = new X.MBg
            r4.<init>(r9)
            java.lang.String r3 = "https://help.instagram.com/2635536099905516"
            android.text.SpannableStringBuilder r22 = r8.A01(r4, r3, r2)
            com.instagram.common.session.UserSession r3 = r5.A02
            X.LiR r4 = new X.LiR
            r20 = r4
            r21 = r3
            r24 = r2
            r25 = r7
            r26 = r2
            r27 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x02d7
        L_0x06ed:
            boolean r3 = X.JTT.A1a(r0)
            r0.A0G()
            if (r3 != 0) goto L_0x0228
            X.L9r r3 = r0.A0D
            if (r3 == 0) goto L_0x0703
            boolean r3 = r3.A00
            if (r3 != r6) goto L_0x0703
            boolean r3 = r0.A0O
            r8 = 1
            if (r3 != 0) goto L_0x0704
        L_0x0703:
            r8 = 0
        L_0x0704:
            boolean r5 = r0.A0O
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r32)
            X.Li9 r3 = new X.Li9
            r3.<init>(r4, r8, r5)
            r1.add(r3)
            goto L_0x0228
        L_0x0714:
            r5 = r10
            goto L_0x0191
        L_0x0717:
            X.0eM r9 = r0.A06
            X.LMg r3 = X.JTT.A0W(r9)
            java.lang.String r3 = r3.A03
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x073e
            r5 = 2131964109(0x7f1330cd, float:1.956499E38)
            X.LMg r3 = X.JTT.A0W(r9)
            java.lang.String r4 = r3.A03
            X.LMg r3 = X.JTT.A0W(r9)
            int r3 = r3.A00
            java.lang.Object[] r3 = X.C51968G9o.A1Z(r4, r3)
            java.lang.String r4 = r0.getString(r5, r3)
            goto L_0x0159
        L_0x073e:
            r4 = 0
            goto L_0x0159
        L_0x0741:
            r7 = 0
            goto L_0x0129
        L_0x0744:
            r5 = 0
            goto L_0x00bd
        L_0x0747:
            r4 = 0
            goto L_0x0042
        L_0x074a:
            r16 = 0
            goto L_0x001a
        L_0x074e:
            X.0qQ.A0F(r19)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61942KSr.A0D():java.util.ArrayList");
    }

    public final void configureActionBar(2da r5) {
        Dbb.A1I(r5);
        boolean A1a = JTT.A1a(this);
        A0G();
        int i = 2131973482;
        if (A1a) {
            i = 2131973661;
        }
        r5.Eom(i);
        if (JTT.A0Y(this).A0C != null) {
            String A0m = DbU.A0m(this, 2131964022);
            C66306MMp A022 = C66306MMp.A02(this, 47);
            AnonymousClass3JR A0K2 = DbS.A0K();
            A0K2.A0K = A0m;
            DbX.A19(LY6.A00(A022, 33), A0K2, r5);
        }
    }

    public final boolean onBackPressed() {
        if (AnonymousClass7TF.A1V(JTT.A0Y(this).A0C)) {
            ((C64720Lgx) this.A0V.getValue()).onBackPressed();
            return true;
        } else if (!A0C().A00() || !JTO.A0k(this.A0Y).A02) {
            JTO.A0k(this.A0Y).A04(this, C61945KSu.A00);
            return false;
        } else {
            1ua r0 = this.A0S;
            if (r0 == null) {
                0qQ.A0F("pendingMediaManager");
                throw AnonymousClass00P.createAndThrow();
            }
            r0.A0K(this);
            A08(this);
            return true;
        }
    }

    public final void onCreate(Bundle bundle) {
        LBS lbs;
        int A022 = AnonymousClass0fD.A02(-703337488);
        super.onCreate(bundle);
        AnonymousClass0eM r5 = this.A0Y;
        this.A0H = (LAS) JTO.A0k(r5).A0I.getValue();
        1ud r2 = 1ua.A0G;
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r8 = this.A0W;
        this.A0S = r2.A01(requireActivity, AnonymousClass7TE.A0l(r8));
        LAS las = this.A0H;
        if (las != null) {
            if (las.A06) {
                LFB lfb = new LFB(requireContext(), AnonymousClass7TE.A0l(r8), AnonymousClass2o3.A00(AnonymousClass7TE.A0l(r8)));
                this.A0D = new C63862L9r(JTR.A0R(this), AnonymousClass7TE.A0l(r8), JTO.A0k(r5), lfb);
            }
            if (this.A0H != null) {
                this.A0G = new L8G(this, AnonymousClass7TE.A0l(r8), this, JTO.A0k(r5));
                if (JTT.A1a(this) && this.A04.isEmpty() && (lbs = JTT.A0Y(this).A0D) != null) {
                    IGTVUploadViewModel A0k = JTO.A0k(r5);
                    DbX.A1W(A0k, lbs.A09, C318116oQ.A00(A0k), 2);
                }
                AnonymousClass0fD.A09(651571247, A022);
                return;
            }
        }
        0qQ.A0F("config");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(589761261);
        super.onDestroy();
        1wn r2 = this.A06;
        if (r2 != null) {
            JTT.A0I(this).A02(r2, C64679Lg6.class);
        }
        1wn r22 = this.A08;
        if (r22 != null) {
            JTT.A0I(this).A02(r22, C64648Lfa.class);
        }
        1wn r23 = this.A09;
        if (r23 != null) {
            JTT.A0I(this).A02(r23, C64677Lg3.class);
        }
        1wn r24 = this.A07;
        if (r24 != null) {
            JTT.A0I(this).A02(r24, C64664Lfq.class);
        }
        1wn r25 = this.A05;
        if (r25 != null) {
            JTT.A0I(this).A02(r25, C64663Lfp.class);
        }
        AnonymousClass0fD.A09(254309928, A022);
    }

    public final void onPause() {
        C379219Sz r0;
        AnonymousClass9RG r02;
        int A022 = AnonymousClass0fD.A02(1293326007);
        C61942KSr.super.onPause();
        C65827M0t m0t = this.A0B;
        if (!(m0t == null || (r0 = m0t.A01.A07) == null || (r02 = r0.A00) == null)) {
            r02.A01();
        }
        AnonymousClass0fD.A09(-463658179, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1613716886);
        super.onResume();
        C60258JiF jiF = this.A0E;
        if (jiF != null) {
            AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
            if (AnonymousClass5w9.A01(jiF.A04)) {
                AnonymousClass5w9.A00(AnonymousClass7TE.A0l(this.A0W)).A08((C3034168s) null);
            }
        }
        AnonymousClass5w9 r02 = AnonymousClass5w8.A05;
        AnonymousClass5w9.A00(AnonymousClass7TE.A0l(this.A0W)).A00 = LJ9.A01(this);
        A0A(this);
        C60258JiF jiF2 = this.A0E;
        if (jiF2 != null) {
            jiF2.A01();
        }
        C65827M0t m0t = this.A0B;
        if (m0t != null) {
            C378379Po r03 = m0t.A01;
            r03.A06 = m0t;
            r03.A00();
        }
        AnonymousClass0fD.A09(-1045041649, A022);
    }
}
