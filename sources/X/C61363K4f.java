package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* renamed from: X.K4f  reason: case insensitive filesystem */
public final class C61363K4f extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SmartGlassesEducationToolkitFragment";
    public int A00;
    public Dialog A01;
    public View A02;
    public View A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public ShimmerFrameLayout A0A;
    public ShimmerFrameLayout A0B;
    public ShimmerFrameLayout A0C;
    public C18078Vl7 A0D;
    public 2dZ A0E;
    public CircularImageView A0F;
    public IgImageView A0G;
    public IgImageView A0H;
    public IgImageView A0I;
    public IgdsListCell A0J;
    public IgdsListCell A0K;
    public IgdsListCell A0L;
    public IgdsListCell A0M;
    public Integer A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public C262204Co A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public Integer A0V;
    public final AnonymousClass0mG A0W;
    public final AnonymousClass0mG A0X;
    public final AnonymousClass0mG A0Y;
    public final String A0Z;
    public final AnonymousClass0eM A0a = C227642jf.A02(this);
    public final AnonymousClass0eM A0b = AnonymousClass0eN.A01(new C13998To0(this, 49));
    public final AnonymousClass0eM A0c;
    public final AnonymousClass2gO A0d;

    public final String getModuleName() {
        return "dev_options_xme_glasses_toolkit";
    }

    /* JADX WARNING: type inference failed for: r0v40, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r5 = this.A0a;
        1Av A0h = DbX.A0h(r5);
        0s0 r0 = A0h.A89;
        AnonymousClass0YZ[] r4 = 1Av.A8a;
        if (DbV.A13(A0h, r0, r4, 347).length() > 0) {
            1Av A0h2 = DbX.A0h(r5);
            this.A0O = DbV.A13(A0h2, A0h2.A89, r4, 347);
        }
        1Av A0h3 = DbX.A0h(r5);
        if (DbV.A13(A0h3, A0h3.A8A, r4, 348).length() > 0) {
            1Av A0h4 = DbX.A0h(r5);
            this.A0P = DbV.A13(A0h4, A0h4.A8A, r4, 348);
        }
        1Av A0h5 = DbX.A0h(r5);
        if (DbV.A13(A0h5, A0h5.A88, r4, 349).length() > 0) {
            1Av A0h6 = DbX.A0h(r5);
            this.A0Q = DbV.A13(A0h6, A0h6.A88, r4, 349);
        }
        ((C60192JhB) this.A0c.getValue()).A00.A06(getViewLifecycleOwner(), this.A0d);
        2dZ A012 = 2dY.A01(new WBC(this, 26), DbX.A0I(requireView(), R.id.smart_glasses_education_toolkit_action_bar));
        this.A0E = A012;
        A012.A0X(C64467LcU.A00);
        this.A0I = JTO.A0Y(view, R.id.smart_glasses_thumbnail_container);
        this.A07 = AnonymousClass7TE.A0d(view, R.id.smart_glasses_device_name);
        this.A08 = AnonymousClass7TE.A0d(view, R.id.smart_glasses_model_name);
        this.A0B = (ShimmerFrameLayout) view.findViewById(R.id.smart_glasses_image_shimmer_container);
        this.A0A = (ShimmerFrameLayout) view.findViewById(R.id.smart_glasses_device_name_shimmer_container);
        this.A0C = (ShimmerFrameLayout) view.findViewById(R.id.smart_glasses_model_name_shimmer_container);
        this.A02 = view.findViewById(R.id.smart_glasses_device_name_empty);
        this.A03 = view.findViewById(R.id.smart_glasses_model_name_empty);
        this.A0F = (CircularImageView) view.findViewById(R.id.smart_glasses_thumbnail_container_empty);
        View view2 = this.A02;
        if (view2 == null) {
            str = "headerGlassesDeviceNameEmpty";
        } else {
            view2.setVisibility(0);
            View view3 = this.A03;
            if (view3 == null) {
                str = "headerGlassesModelNameEmpty";
            } else {
                view3.setVisibility(0);
                ? r02 = this.A0F;
                if (r02 == 0) {
                    str = "headerGlassesPictureEmpty";
                } else {
                    r02.setVisibility(0);
                    ShimmerFrameLayout shimmerFrameLayout = this.A0C;
                    if (shimmerFrameLayout == null) {
                        str = "headerGlassesModelNameShimmer";
                    } else {
                        shimmerFrameLayout.A02();
                        ShimmerFrameLayout shimmerFrameLayout2 = this.A0A;
                        if (shimmerFrameLayout2 == null) {
                            str = "headerGlassesDeviceNameShimmer";
                        } else {
                            shimmerFrameLayout2.A02();
                            ShimmerFrameLayout shimmerFrameLayout3 = this.A0B;
                            if (shimmerFrameLayout3 == null) {
                                str = "headerGlassesImageShimmer";
                            } else {
                                shimmerFrameLayout3.A02();
                                TextView textView = this.A08;
                                if (textView == null) {
                                    str = "headerGlassesModelName";
                                } else {
                                    textView.setVisibility(8);
                                    TextView textView2 = this.A07;
                                    if (textView2 == null) {
                                        str = "headerGlassesDeviceName";
                                    } else {
                                        textView2.setVisibility(8);
                                        IgImageView igImageView = this.A0I;
                                        if (igImageView == null) {
                                            str = "headerUserProfilePicture";
                                        } else {
                                            igImageView.setVisibility(8);
                                            A02(this);
                                            IgdsListCell igdsListCell = this.A0K;
                                            String str2 = "glassesVersionListCell";
                                            if (igdsListCell != null) {
                                                igdsListCell.A06(2131974036);
                                                Drawable drawable = requireContext().getDrawable(R.drawable.instagram_glasses_pano_outline_24);
                                                if (drawable != null) {
                                                    IgdsListCell igdsListCell2 = this.A0K;
                                                    if (igdsListCell2 != null) {
                                                        igdsListCell2.A09(drawable);
                                                    }
                                                }
                                                IgdsListCell igdsListCell3 = this.A0J;
                                                str2 = "glassesMediaListCell";
                                                if (igdsListCell3 != null) {
                                                    igdsListCell3.A06(2131974038);
                                                    Drawable drawable2 = requireContext().getDrawable(R.drawable.instagram_photo_pano_outline_24);
                                                    if (drawable2 != null) {
                                                        IgdsListCell igdsListCell4 = this.A0J;
                                                        if (igdsListCell4 != null) {
                                                            igdsListCell4.A09(drawable2);
                                                        }
                                                    }
                                                    IgdsListCell igdsListCell5 = this.A0J;
                                                    if (igdsListCell5 != null) {
                                                        AnonymousClass0fU.A00(this.A0X, igdsListCell5);
                                                        IgdsListCell igdsListCell6 = this.A0M;
                                                        str2 = "helpStreamingListCell";
                                                        if (igdsListCell6 != null) {
                                                            igdsListCell6.A06(2131974037);
                                                            IgdsListCell igdsListCell7 = this.A0M;
                                                            if (igdsListCell7 != null) {
                                                                AnonymousClass0fU.A00(this.A0W, igdsListCell7);
                                                                IgdsListCell igdsListCell8 = this.A0L;
                                                                str2 = "helpGlassesContentListCell";
                                                                if (igdsListCell8 != null) {
                                                                    igdsListCell8.A06(2131974041);
                                                                    IgdsListCell igdsListCell9 = this.A0L;
                                                                    if (igdsListCell9 != null) {
                                                                        AnonymousClass0fU.A00(this.A0Y, igdsListCell9);
                                                                        AnonymousClass0eM r3 = this.A0b;
                                                                        Integer num = AnonymousClass05K.A0N;
                                                                        Integer num2 = AnonymousClass05K.A00;
                                                                        ((C63942LEg) r3.getValue()).A00(num, num2);
                                                                        ((C63942LEg) r3.getValue()).A00(num2, num2);
                                                                        ((C63942LEg) r3.getValue()).A00(AnonymousClass05K.A01, num2);
                                                                        ((C63942LEg) r3.getValue()).A00(AnonymousClass05K.A0C, num2);
                                                                        TextView textView3 = this.A06;
                                                                        if (textView3 == null) {
                                                                            str2 = "glassesConnectedLink";
                                                                        } else {
                                                                            AnonymousClass0fU.A00(new FP9((Object) this, 42), textView3);
                                                                            A01(this);
                                                                            A00(this);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            0qQ.A0F(str2);
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C61363K4f k4f) {
        AnonymousClass0eM r2 = k4f.A0a;
        if (C362988ir.A01(k4f.requireContext(), AnonymousClass7TE.A0l(r2))) {
            1pd.A00(C362988ir.A00()).A00(k4f.requireContext(), AnonymousClass7TE.A0l(r2), new C19667WdV(k4f, 0), "sup:SupGlassesToolkit_ADD_CB");
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A02(C61363K4f k4f) {
        String str;
        String str2;
        String str3 = k4f.A0P;
        if ((str3 != null && str3.length() != 0) || (((str = k4f.A0O) != null && str.length() != 0) || ((str2 = k4f.A0Q) != null && str2.length() != 0))) {
            ShimmerFrameLayout shimmerFrameLayout = k4f.A0A;
            String str4 = "headerGlassesDeviceNameShimmer";
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.A03();
                ShimmerFrameLayout shimmerFrameLayout2 = k4f.A0A;
                if (shimmerFrameLayout2 != null) {
                    shimmerFrameLayout2.setVisibility(8);
                    View view = k4f.A02;
                    if (view == null) {
                        str4 = "headerGlassesDeviceNameEmpty";
                    } else {
                        view.setVisibility(8);
                        TextView textView = k4f.A07;
                        if (textView != null) {
                            textView.setVisibility(0);
                            ShimmerFrameLayout shimmerFrameLayout3 = k4f.A0C;
                            String str5 = "headerGlassesModelNameShimmer";
                            if (shimmerFrameLayout3 != null) {
                                shimmerFrameLayout3.A03();
                                ShimmerFrameLayout shimmerFrameLayout4 = k4f.A0C;
                                if (shimmerFrameLayout4 != null) {
                                    shimmerFrameLayout4.setVisibility(8);
                                    View view2 = k4f.A03;
                                    if (view2 == null) {
                                        str4 = "headerGlassesModelNameEmpty";
                                    } else {
                                        view2.setVisibility(8);
                                        TextView textView2 = k4f.A08;
                                        str5 = "headerGlassesModelName";
                                        if (textView2 != null) {
                                            textView2.setVisibility(0);
                                            ShimmerFrameLayout shimmerFrameLayout5 = k4f.A0B;
                                            if (shimmerFrameLayout5 != null) {
                                                shimmerFrameLayout5.A03();
                                                ShimmerFrameLayout shimmerFrameLayout6 = k4f.A0B;
                                                if (shimmerFrameLayout6 != null) {
                                                    shimmerFrameLayout6.setVisibility(8);
                                                    ? r0 = k4f.A0F;
                                                    if (r0 == 0) {
                                                        str4 = "headerGlassesPictureEmpty";
                                                    } else {
                                                        r0.setVisibility(8);
                                                        IgImageView igImageView = k4f.A0I;
                                                        str4 = "headerUserProfilePicture";
                                                        if (igImageView != null) {
                                                            igImageView.setVisibility(0);
                                                            TextView textView3 = k4f.A08;
                                                            if (textView3 != null) {
                                                                textView3.setText(k4f.A0P);
                                                                IgImageView igImageView2 = k4f.A0I;
                                                                if (igImageView2 != null) {
                                                                    igImageView2.setUrl(DbT.A0X(k4f.A0a), DbS.A0V(k4f.A0O), k4f);
                                                                    IgdsListCell igdsListCell = k4f.A0K;
                                                                    if (igdsListCell == null) {
                                                                        str4 = "glassesVersionListCell";
                                                                    } else {
                                                                        igdsListCell.A0K(String.valueOf(k4f.A0Q), false);
                                                                        TextView textView4 = k4f.A07;
                                                                        if (textView4 != null) {
                                                                            DbU.A1G(textView4, k4f, 2131974034);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            0qQ.A0F("headerGlassesImageShimmer");
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                    }
                                }
                            }
                            0qQ.A0F(str5);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("headerGlassesDeviceName");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            0qQ.A0F(str4);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0a);
    }

    public C61363K4f() {
        C46573DhF dhF = new C46573DhF(this, 0);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C13998To0(new C13998To0(this, 46), 47));
        this.A0c = DbS.A0I(new C13998To0(A002, 48), dhF, new C58691Iw0(47, (Object) null, A002), DbS.A0z(C60192JhB.class));
        this.A0Z = "sup:GlassesEducationToolkit";
        this.A0U = true;
        this.A0d = new C64317LZr(this, 22);
        this.A0X = new KIR(this, 6);
        this.A0Y = new KIR(this, 7);
        this.A0W = new KIR(this, 5);
    }

    public static final void A00(C61363K4f k4f) {
        SettableFuture settableFuture;
        Context requireContext = k4f.requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(k4f.A0a);
        0qQ.A0B(A0l, 1);
        StellaIpcDirectMessagingServiceClient A002 = C64011LIy.A00(requireContext, A0l);
        ONU onu = new ONU(requireContext, ImmutableMap.of(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "", TraceFieldType.RequestID, ""), A0l);
        if (A002 != null) {
            settableFuture = A002.runIpcRequest(onu);
        } else {
            settableFuture = null;
        }
        C255183ti.A04(new C19136WMs(k4f, 1), C303646Ae.A02(new Lc4(new C74185PqR(47, (Object) onu, (Object) A0l), 5), settableFuture, C61560nl.A00().A00), 1Lf.A01);
    }

    public static final void A03(C61363K4f k4f, boolean z) {
        String str;
        if (C2604245p.A03(k4f.requireContext())) {
            Context requireContext = k4f.requireContext();
            ArrayList arrayList = 0sn.A00;
            try {
                arrayList = C358038aG.A02(JTP.A0B(requireContext), "Meta View", false);
            } catch (SecurityException unused) {
            }
            k4f.A0V = C51968G9o.A0t(arrayList);
        }
        Integer num = k4f.A0V;
        if (num != null) {
            str = String.valueOf(num);
        } else {
            str = "";
        }
        if (k4f.A00 <= 0 || !z) {
            IgdsListCell igdsListCell = k4f.A0J;
            if (igdsListCell != null) {
                igdsListCell.A0K("", false);
                IgdsListCell igdsListCell2 = k4f.A0J;
                if (igdsListCell2 != null) {
                    igdsListCell2.A0K(str, false);
                    return;
                }
            }
        } else {
            IgdsListCell igdsListCell3 = k4f.A0J;
            if (igdsListCell3 != null) {
                igdsListCell3.A0K(str, true);
                return;
            }
        }
        0qQ.A0F("glassesMediaListCell");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-804281864);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.smart_glasses_education_toolkit_fragment, viewGroup, false);
        this.A0K = (IgdsListCell) inflate.requireViewById(R.id.glasses_version_list_cell);
        this.A0J = (IgdsListCell) inflate.requireViewById(R.id.glasses_media_list_cell);
        this.A0M = (IgdsListCell) inflate.requireViewById(R.id.help_streaming_list_cell);
        this.A0L = (IgdsListCell) inflate.requireViewById(R.id.help_content_list_cell);
        this.A04 = DbU.A0G(inflate, R.id.connectivity_title);
        this.A05 = DbU.A0G(inflate, R.id.connectivity_text);
        this.A06 = DbU.A0G(inflate, R.id.connectivity_link);
        this.A09 = DbU.A0G(inflate, R.id.health_percentage);
        this.A0H = DbT.A0b(inflate, R.id.connectivity_icon);
        this.A0G = DbT.A0b(inflate, R.id.battery_health_icon);
        AnonymousClass0fD.A09(669506726, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1717302220);
        super.onDestroyView();
        C18078Vl7 vl7 = this.A0D;
        if (vl7 != null) {
            vl7.A07(AnonymousClass000.A00(1864));
        }
        AnonymousClass0fD.A09(375021165, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-257238266);
        C61363K4f.super.onPause();
        C18078Vl7 vl7 = this.A0D;
        if (vl7 != null) {
            vl7.A03(0);
            this.A0T = false;
        }
        AnonymousClass0fD.A09(-1861473573, A022);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.K4f, java.lang.Object, X.4DH] */
    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(965491804);
        super.onResume();
        C18078Vl7 vl7 = this.A0D;
        if (vl7 != null) {
            XBm xBm = vl7.A0B;
            if (!xBm.isConnected() && !this.A0T) {
                xBm.release();
                AnonymousClass7TE.A1Z(new MG4(this, (AnonymousClass4D7) null, 18), DbW.A0E(this));
            }
        }
        AnonymousClass0fD.A09(-1045779211, A022);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.K4f, java.lang.Object, X.4DH] */
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        W0T A002;
        super.onSetUserVisibleHint(z, z2);
        if (z2) {
            if (!z) {
                C357498Yd r2 = C357488Yc.A03;
                AnonymousClass0eM r1 = this.A0a;
                C357488Yc A012 = r2.A01(AnonymousClass7TE.A0l(r1));
                if (A012 != null) {
                    A012.A00();
                }
                C357488Yc A013 = r2.A01(AnonymousClass7TE.A0l(r1));
                if (!(A013 == null || (A002 = A013.A00()) == null)) {
                    A002.A07(new UUl(false));
                }
                C18078Vl7 vl7 = this.A0D;
                if (vl7 != null) {
                    vl7.A07(AnonymousClass000.A00(1864));
                    C262204Co r0 = this.A0R;
                    if (r0 != null) {
                        r0.AG7((CancellationException) null);
                    }
                    AnonymousClass0eM r12 = this.A0c;
                    ((C60192JhB) r12.getValue()).A04.Epw((Object) null);
                    ((C60192JhB) r12.getValue()).A03.Epw(C62504Kgu.DISCONNECTED);
                    C18078Vl7 vl72 = this.A0D;
                    if (vl72 != null) {
                        vl72.A03(0);
                        this.A0U = false;
                        return;
                    }
                }
                0qQ.A0F("mediaStreamController");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (z) {
            this.A0U = true;
            AnonymousClass7TE.A1Z(new MG4(this, (AnonymousClass4D7) null, 19), DbW.A0E(this));
        }
    }
}
