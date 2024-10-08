package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.android.maps.StaticMapView;
import com.facebook.android.maps.model.LatLng;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.DistanceUnit;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.maps.ui.IgStaticMapView;
import java.util.List;

/* renamed from: X.UZp  reason: case insensitive filesystem */
public final class C15285UZp extends AnonymousClass4DH implements X3S {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsLocalFragment";
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public WGU A04;
    public PromoteData A05;
    public PromoteState A06;
    public UserSession A07;
    public IgSimpleImageView A08;
    public IgSimpleImageView A09;
    public IgdsSwitch A0A;
    public IgStaticMapView A0B;
    public final View.OnClickListener A0C = new WBB(this, 12);
    public final View.OnClickListener A0D = new WBB(this, 13);
    public final X3O A0E = new C19168WOa(this);
    public final C358618bC A0F = new WYN(this, 5);
    public final C267874cM A0G = new C19424WYr(this, 0);
    public final C66494MTx A0H = new C19425WYu(this, 0);
    public final 1Wr A0I = 1Wr.A00;

    public final void Dab(PromoteState promoteState, Integer num) {
        0qQ.A0B(num, 1);
        if (num == AnonymousClass05K.A0u) {
            A03(this);
            A01(A00());
        }
    }

    public final String getModuleName() {
        return "promote_create_audience_locations_local";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0B = (IgStaticMapView) view.requireViewById(R.id.map_view);
        PromoteState promoteState = this.A06;
        if (promoteState != null) {
            promoteState.A0A(this);
            this.A0A = (IgdsSwitch) view.requireViewById(R.id.switch_button);
            PromoteData promoteData = this.A05;
            str = "promoteData";
            if (promoteData != null) {
                PendingLocation pendingLocation = promoteData.A0o;
                if (pendingLocation.A03 == null) {
                    Context requireContext = requireContext();
                    UserSession userSession = this.A07;
                    if (userSession != null) {
                        pendingLocation.A03 = Boolean.valueOf(1Wr.isLocationPermitted(requireContext, userSession, "PROMOTE_AUDIENCE"));
                    } else {
                        DbS.A14();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                IgdsSwitch igdsSwitch = this.A0A;
                String str2 = "useCurrentLocationSwitch";
                if (igdsSwitch != null) {
                    PromoteData promoteData2 = this.A05;
                    if (promoteData2 != null) {
                        igdsSwitch.setChecked(promoteData2.A0o.A00());
                        IgdsSwitch igdsSwitch2 = this.A0A;
                        if (igdsSwitch2 != null) {
                            igdsSwitch2.A07 = this.A0F;
                            View requireViewById = view.requireViewById(R.id.custom_address_entry);
                            this.A00 = requireViewById;
                            if (requireViewById == null) {
                                str2 = "customAddressEntry";
                            } else {
                                AnonymousClass0fU.A00(this.A0D, requireViewById);
                                this.A03 = DbU.A0G(view, R.id.custom_address_title);
                                this.A01 = DbU.A0G(view, R.id.custom_address);
                                this.A02 = DbU.A0G(view, R.id.custom_address_edit_button);
                                this.A08 = (IgSimpleImageView) view.requireViewById(R.id.custom_address_chevron_icon);
                                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.custom_address_cross_icon);
                                this.A09 = igSimpleImageView;
                                if (igSimpleImageView == null) {
                                    str2 = "customAddressCrossIcon";
                                } else {
                                    AnonymousClass0fU.A00(this.A0C, igSimpleImageView);
                                    A02(this);
                                    int A062 = 0nA.A06(requireContext());
                                    int A042 = JTO.A04((float) A062, 1.5f);
                                    IgStaticMapView igStaticMapView = this.A0B;
                                    if (igStaticMapView == null) {
                                        str2 = "mapView";
                                    } else {
                                        JTP.A14(igStaticMapView, A062, A042);
                                        A01(A00());
                                        Context A0S = AnonymousClass7TE.A0S(view);
                                        UserSession userSession2 = this.A07;
                                        if (userSession2 != null) {
                                            C17567VaL vaL = new C17567VaL(view, "radius_slider");
                                            List A032 = W2x.A03(requireContext());
                                            PromoteData promoteData3 = this.A05;
                                            if (promoteData3 != null) {
                                                PromoteState promoteState2 = this.A06;
                                                if (promoteState2 != null) {
                                                    VAH.A00(A0S, vaL, promoteData3, promoteState2, userSession2, A032);
                                                    if (this.mUserVisibleHint) {
                                                        A03(this);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        } else {
                                            DbS.A14();
                                            throw AnonymousClass00P.createAndThrow();
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
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "promoteState";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final LatLng A00() {
        PromoteData promoteData = this.A05;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
        } else {
            PendingLocation pendingLocation = promoteData.A0o;
            if (pendingLocation.A00()) {
                W2W w2w = C17149VKb.A00;
                UserSession userSession = this.A07;
                if (userSession != null) {
                    return W2W.A00(userSession);
                }
                DbS.A14();
            } else {
                AudienceGeoLocation audienceGeoLocation = pendingLocation.A02;
                if (audienceGeoLocation == null) {
                    return new LatLng(0.0d, 0.0d);
                }
                return new LatLng(audienceGeoLocation.A00, audienceGeoLocation.A01);
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01(LatLng latLng) {
        int i;
        String str;
        StaticMapView.StaticMapOptions staticMapOptions = new StaticMapView.StaticMapOptions("promote_audience_creation_map");
        staticMapOptions.A02(latLng.A00, latLng.A01);
        int A022 = JTP.A02(getContext(), requireContext(), R.attr.igds_color_legibility_gradient);
        W2W w2w = C17149VKb.A00;
        Context requireContext = requireContext();
        PromoteData promoteData = this.A05;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            int i2 = promoteData.A0o.A00;
            if (W2W.A01(requireContext) == DistanceUnit.MILE) {
                i = AnonymousClass7TE.A06((float) i2, 1609.34f);
            } else {
                i = i2 * IgNetworkConsentStorage.MAX_ENTRIES;
            }
            staticMapOptions.A04(latLng, A022, i);
            IgStaticMapView igStaticMapView = this.A0B;
            if (igStaticMapView == null) {
                str = "mapView";
            } else {
                igStaticMapView.setMapOptions(staticMapOptions);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C15285UZp uZp) {
        TextView textView;
        Context requireContext;
        Context context;
        int i;
        PromoteData promoteData = uZp.A05;
        String str = null;
        if (promoteData != null) {
            boolean A002 = promoteData.A0o.A00();
            String str2 = "customAddressEntry";
            View view = uZp.A00;
            if (A002) {
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
            } else if (view != null) {
                view.setVisibility(0);
                PromoteData promoteData2 = uZp.A05;
                if (promoteData2 != null) {
                    AudienceGeoLocation audienceGeoLocation = promoteData2.A0o.A02;
                    str2 = "customAddressDisplayName";
                    TextView textView2 = uZp.A03;
                    if (audienceGeoLocation == null) {
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                            TextView textView3 = uZp.A01;
                            if (textView3 != null) {
                                textView3.setText(2131970325);
                                textView = uZp.A01;
                                if (textView != null) {
                                    requireContext = uZp.requireContext();
                                    context = uZp.getContext();
                                    i = R.attr.igds_color_primary_text;
                                }
                            }
                        }
                        0qQ.A0F("customAddressTitle");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        PromoteData promoteData3 = uZp.A05;
                        if (promoteData3 != null) {
                            PendingLocation pendingLocation = promoteData3.A0o;
                            0qQ.A06(pendingLocation);
                            TextView textView4 = uZp.A01;
                            if (textView4 != null) {
                                AudienceGeoLocation audienceGeoLocation2 = pendingLocation.A02;
                                if (audienceGeoLocation2 != null) {
                                    str = audienceGeoLocation2.A05;
                                }
                                textView4.setText(str);
                                textView = uZp.A01;
                                if (textView != null) {
                                    requireContext = uZp.requireContext();
                                    context = uZp.getContext();
                                    i = R.attr.igds_color_secondary_text;
                                }
                            }
                        }
                    }
                    0qQ.A0F("customAddressTitle");
                    throw AnonymousClass00P.createAndThrow();
                    DbT.A17(requireContext, textView, 2Yu.A0H(context, i));
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    public static final void A03(C15285UZp uZp) {
        PromoteData promoteData = uZp.A05;
        String str = "promoteData";
        if (promoteData != null) {
            PendingLocation pendingLocation = promoteData.A0o;
            if (pendingLocation.A00()) {
                W2W w2w = C17149VKb.A00;
                UserSession userSession = uZp.A07;
                if (userSession != null) {
                    LatLng A002 = W2W.A00(userSession);
                    double d = A002.A00;
                    Double valueOf = Double.valueOf(d);
                    double d2 = A002.A01;
                    String A0e = C13991Tnr.A0e(uZp, valueOf, Double.valueOf(d2), 2131970326);
                    PromoteData promoteData2 = uZp.A05;
                    if (promoteData2 != null) {
                        PendingLocation pendingLocation2 = promoteData2.A0o;
                        int i = pendingLocation2.A00;
                        ? obj = new Object();
                        obj.A06 = null;
                        obj.A05 = A0e;
                        obj.A03 = null;
                        obj.A00 = d;
                        obj.A01 = d2;
                        obj.A02 = i;
                        obj.A04 = null;
                        obj.A08 = null;
                        obj.A07 = null;
                        pendingLocation2.A01 = obj;
                    }
                } else {
                    DbS.A14();
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                AudienceGeoLocation audienceGeoLocation = pendingLocation.A02;
                if (audienceGeoLocation != null) {
                    String str2 = audienceGeoLocation.A06;
                    String str3 = audienceGeoLocation.A05;
                    AdGeoLocationType adGeoLocationType = audienceGeoLocation.A03;
                    double d3 = audienceGeoLocation.A00;
                    double d4 = audienceGeoLocation.A01;
                    String str4 = audienceGeoLocation.A04;
                    String str5 = audienceGeoLocation.A08;
                    String str6 = audienceGeoLocation.A07;
                    int i2 = pendingLocation.A00;
                    ? obj2 = new Object();
                    obj2.A06 = str2;
                    obj2.A05 = str3;
                    obj2.A03 = adGeoLocationType;
                    obj2.A00 = d3;
                    obj2.A01 = d4;
                    obj2.A02 = i2;
                    obj2.A04 = str4;
                    obj2.A08 = str5;
                    obj2.A07 = str6;
                    pendingLocation.A02 = obj2;
                }
            }
            PromoteState promoteState = uZp.A06;
            if (promoteState == null) {
                str = "promoteState";
            } else {
                PromoteState.A01(promoteState, AnonymousClass05K.A02);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(C15285UZp uZp, boolean z) {
        PromoteData promoteData = uZp.A05;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        promoteData.A0o.A03 = Boolean.valueOf(z);
        A03(uZp);
        uZp.A01(uZp.A00());
        A02(uZp);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A07;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1566373024);
        C15285UZp.super.onCreate(bundle);
        this.A05 = XAI.A00(this);
        this.A06 = XA9.A00(this);
        PromoteData promoteData = this.A05;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
        } else {
            UserSession userSession = promoteData.A0y;
            this.A07 = userSession;
            if (userSession != null) {
                this.A04 = WGU.A00(userSession);
                AnonymousClass0fD.A09(-1647482808, A022);
                return;
            }
            DbS.A14();
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-530303958);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_locations_local_view, viewGroup, false);
        AnonymousClass0fD.A09(1332412964, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1002817415);
        PromoteState promoteState = this.A06;
        if (promoteState == null) {
            0qQ.A0F("promoteState");
            throw AnonymousClass00P.createAndThrow();
        }
        promoteState.A0B(this);
        super.onDestroyView();
        AnonymousClass0fD.A09(1631690410, A022);
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (z) {
            A03(this);
        }
    }
}
