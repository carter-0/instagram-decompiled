package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.UZn  reason: case insensitive filesystem */
public final class C15283UZn extends AnonymousClass4DH implements X95, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromotePreviewFragment";
    public View A00;
    public SpinnerImageView A01;
    public XIGIGBoostCallToAction A02;
    public XIGIGBoostDestination A03;
    public C18784W1k A04;
    public ImageUrl A05;
    public 1Xj A06;
    public AudioOverlayTrack A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Map A0F = new LinkedHashMap();
    public final AnonymousClass0eM A0G = C227642jf.A02(this);

    public final void D7A(boolean z) {
        C13990Tnq.A0h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_back_button", false);
        UYr uYr = new UYr();
        uYr.setArguments(bundle);
        C331127Pr A0f = DbX.A0f(this.A0G);
        DbS.A1S(A0f, false);
        DbY.A13(this, uYr, A0f);
    }

    public final String getModuleName() {
        return "promote_story_eligible_preview";
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.UZn, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ArrayList<String> stringArrayList;
        String string;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        AudioOverlayTrack audioOverlayTrack;
        String str3;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C13991Tnr.A0w(this);
        AnonymousClass0eM r6 = this.A0G;
        UserSession A0l = AnonymousClass7TE.A0l(r6);
        FragmentActivity context = getContext();
        DbS.A1X(context);
        this.A04 = new C18784W1k(context, this, A0l);
        Bundle bundle2 = this.mArguments;
        ImageUrl imageUrl = null;
        if (bundle2 != null) {
            str = bundle2.getString("destination");
        } else {
            str = null;
        }
        if (str != null) {
            this.A03 = XIGIGBoostDestination.valueOf(str);
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (stringArrayList = bundle3.getStringArrayList("instagram_positions")) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ArrayList A0p = AnonymousClass7TF.A0p(stringArrayList);
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                0qQ.A0A(A18);
                A0p.add(AdsAPIInstagramPosition.valueOf(A18));
            }
            UserSession A0l2 = AnonymousClass7TE.A0l(r6);
            XIGIGBoostDestination xIGIGBoostDestination = this.A03;
            if (xIGIGBoostDestination != null) {
                ArrayList A002 = C305936Kd.A00(xIGIGBoostDestination, A0l2, A0p);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = A002.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) next;
                    if (adsAPIInstagramPosition == AdsAPIInstagramPosition.PROFILE_FEED) {
                        XIGIGBoostDestination xIGIGBoostDestination2 = this.A03;
                        if (xIGIGBoostDestination2 != null) {
                            if (!C305936Kd.A03(adsAPIInstagramPosition, xIGIGBoostDestination2, AnonymousClass7TE.A0l(r6))) {
                            }
                        }
                    }
                    arrayList.add(next);
                }
                this.A0B = arrayList;
                Bundle bundle4 = this.mArguments;
                if (bundle4 == null || (string = bundle4.getString("media_id")) == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.A09 = string;
                Bundle bundle5 = this.mArguments;
                if (bundle5 == null || (string2 = bundle5.getString("call_to_action")) == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.A02 = XIGIGBoostCallToAction.valueOf(string2);
                Bundle bundle6 = this.mArguments;
                if (bundle6 != null) {
                    z = bundle6.getBoolean("is_fb_placement_eligible");
                } else {
                    z = false;
                }
                this.A0C = z;
                Bundle bundle7 = this.mArguments;
                if (bundle7 != null) {
                    z2 = bundle7.getBoolean("is_fb_placement_selected");
                } else {
                    z2 = false;
                }
                this.A0D = z2;
                Bundle bundle8 = this.mArguments;
                if (bundle8 != null) {
                    bundle8.getBoolean("is_ad_format_preferences_eligible");
                }
                Bundle bundle9 = this.mArguments;
                if (bundle9 != null) {
                    z3 = bundle9.getBoolean("should_show_creative_optimization_toggle");
                } else {
                    z3 = false;
                }
                this.A0E = z3;
                Bundle bundle10 = this.mArguments;
                if (bundle10 != null) {
                    bundle10.getBoolean("should_show_multi_advertiser_ads_toggle");
                }
                Bundle bundle11 = this.mArguments;
                if (bundle11 != null) {
                    str2 = bundle11.getString("political_ad_byline_text");
                } else {
                    str2 = null;
                }
                this.A0A = str2;
                int i = Build.VERSION.SDK_INT;
                Bundle bundle12 = this.mArguments;
                if (i >= 33) {
                    if (bundle12 != null) {
                        audioOverlayTrack = (AudioOverlayTrack) 2Yc.A01(bundle12, AudioOverlayTrack.class, "selected_audio_overlay_track");
                    }
                    audioOverlayTrack = null;
                } else {
                    if (bundle12 != null) {
                        audioOverlayTrack = (AudioOverlayTrack) bundle12.getParcelable("selected_audio_overlay_track");
                    }
                    audioOverlayTrack = null;
                }
                this.A07 = audioOverlayTrack;
                Bundle bundle13 = this.mArguments;
                if (bundle13 != null) {
                    str3 = bundle13.getString("ab_text_banner_text");
                } else {
                    str3 = null;
                }
                this.A08 = str3;
                Bundle bundle14 = this.mArguments;
                if (bundle14 != null) {
                    imageUrl = (ImageUrl) bundle14.getParcelable("ab_test_banner_url");
                }
                this.A05 = imageUrl;
                this.A01 = DbX.A0k(view2);
                this.A00 = view2.requireViewById(R.id.preview_screen_content_view);
                1E8 A0d = DbX.A0d(r6);
                String str4 = this.A09;
                String str5 = "mediaId";
                if (str4 != null) {
                    this.A06 = A0d.A02(002.A0T(str4, DbU.A0u(r6), '_'));
                    SpinnerImageView spinnerImageView = this.A01;
                    if (spinnerImageView == null) {
                        0qQ.A0F("loadingSpinner");
                    } else {
                        DbS.A1T(spinnerImageView);
                        View view3 = this.A00;
                        if (view3 == null) {
                            0qQ.A0F("previewScreenContentView");
                        } else {
                            view3.setVisibility(8);
                            C18784W1k w1k = this.A04;
                            if (w1k == null) {
                                str5 = "dataFetcher";
                            } else {
                                String str6 = this.A09;
                                if (str6 != null) {
                                    XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
                                    if (xIGIGBoostCallToAction == null) {
                                        str5 = "callToAction";
                                    } else {
                                        String obj = xIGIGBoostCallToAction.toString();
                                        List<Object> list = this.A0B;
                                        if (list == null) {
                                            str5 = "instagramPositions";
                                        } else {
                                            ArrayList A0p2 = AnonymousClass7TF.A0p(list);
                                            for (Object A1X : list) {
                                                DbU.A1X(A1X, A0p2);
                                            }
                                            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0p2);
                                            C61500KAf kAf = new C61500KAf(this, 3);
                                            2IS r7 = new 2IS();
                                            PromoteData promoteData = w1k.A03;
                                            UserSession userSession = promoteData.A0y;
                                            r7.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, userSession.A06);
                                            r7.A04("media_id", str6);
                                            r7.A04("call_to_action", obj);
                                            r7.A05("instagram_positions", copyOf);
                                            r7.A05("regulated_categories", promoteData.A03());
                                            C363088j4.A00(userSession).ATL(new C19028WHf(kAf, 3), new C19040WHs(kAf, 4), new C239113Fa(r7, C60888Jsv.class, AnonymousClass000.A00(2295), false));
                                            C13988Tno.A1J(JTU.A0D(r6), C16678UzE.AD_PREVIEW);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F(str5);
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("selectedDestination");
            throw AnonymousClass00P.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(C15283UZn uZn) {
        boolean z;
        String str = "previewScreenContentView";
        C15283UZn uZn2 = uZn;
        SpinnerImageView spinnerImageView = uZn.A01;
        if (spinnerImageView == null) {
            0qQ.A0F("loadingSpinner");
        } else {
            JTO.A1X(spinnerImageView);
            View view = uZn.A00;
            if (view != null) {
                view.setVisibility(0);
                Bundle bundle = uZn.mArguments;
                if (bundle != null) {
                    z = bundle.getBoolean("is_view_pager_child");
                } else {
                    z = false;
                }
                FragmentActivity activity = uZn.getActivity();
                if (activity != null) {
                    View view2 = uZn.A00;
                    if (view2 != null) {
                        UserSession A0l = AnonymousClass7TE.A0l(uZn.A0G);
                        XIGIGBoostDestination xIGIGBoostDestination = uZn.A03;
                        if (xIGIGBoostDestination == null) {
                            str = "selectedDestination";
                        } else {
                            List list = uZn.A0B;
                            if (list == null) {
                                str = "instagramPositions";
                            } else {
                                boolean z2 = uZn.A0C;
                                boolean z3 = uZn.A0D;
                                boolean z4 = uZn.A0E;
                                C15283UZn uZn3 = uZn2;
                                VAG.A00(view2, activity, xIGIGBoostDestination, uZn2, uZn3, A0l, uZn2.A05, uZn2.A08, list, z, z2, z3, z4);
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final void DDh() {
        String str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            W1Y w1y = W1Y.A00;
            UserSession A0l = AnonymousClass7TE.A0l(this.A0G);
            1Xj r5 = this.A06;
            Map map = this.A0F;
            String str2 = this.A09;
            if (str2 == null) {
                str = "mediaId";
            } else {
                XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
                if (xIGIGBoostCallToAction == null) {
                    str = "callToAction";
                } else {
                    List list = this.A0B;
                    if (list == null) {
                        str = "instagramPositions";
                    } else {
                        w1y.A03(activity, xIGIGBoostCallToAction, A0l, r5, str2, list, map);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DF3() {
        String str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            W1Y w1y = W1Y.A00;
            AnonymousClass0eM r0 = this.A0G;
            UserSession A0l = AnonymousClass7TE.A0l(r0);
            1Xj r7 = this.A06;
            Map map = this.A0F;
            String str2 = this.A09;
            if (str2 == null) {
                str = "mediaId";
            } else {
                XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
                if (xIGIGBoostCallToAction == null) {
                    str = "callToAction";
                } else {
                    List list = this.A0B;
                    if (list == null) {
                        str = "instagramPositions";
                    } else {
                        UserSession A0l2 = AnonymousClass7TE.A0l(r0);
                        XIGIGBoostDestination xIGIGBoostDestination = this.A03;
                        if (xIGIGBoostDestination == null) {
                            str = "selectedDestination";
                        } else {
                            w1y.A04(activity, xIGIGBoostCallToAction, A0l, r7, str2, map, C305936Kd.A04(xIGIGBoostDestination, A0l2, list));
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Dc6() {
        String str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            W1Y w1y = W1Y.A00;
            UserSession A0l = AnonymousClass7TE.A0l(this.A0G);
            1Xj r5 = this.A06;
            Map map = this.A0F;
            String str2 = this.A09;
            if (str2 == null) {
                str = "mediaId";
            } else {
                XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
                if (xIGIGBoostCallToAction == null) {
                    str = "callToAction";
                } else {
                    w1y.A02(activity, xIGIGBoostCallToAction, A0l, r5, this.A07, str2, this.A0A, map);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Dnf() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0G);
            Map map = this.A0F;
            AnonymousClass7TG.A1O(A0l, map);
            W1Y.A00(activity, (LME) map.get(AdsAPIInstagramPosition.STORY), A0l);
        }
    }

    public final void Dng() {
        Dbb.A0k(requireActivity(), AnonymousClass7TE.A0l(this.A0G), 2EG.A34, AnonymousClass000.A00(1420));
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131970642);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-610369369);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_preview, false);
        AnonymousClass0fD.A09(-428924392, A022);
        return A0D2;
    }
}
