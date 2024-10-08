package X;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.venue.Venue;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KSq  reason: case insensitive filesystem */
public final class C61941KSq extends K8A implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "VideoEditMetadataFragment";
    public Location A00;
    public Handler A01;
    public View A02;
    public View A03;
    public TextView A04;
    public C65423Lt3 A05 = new C65423Lt3(this, 3);
    public BrandedContentGatingInfoIntf A06;
    public BrandedContentProjectMetadataIntf A07;
    public 1Ng A08;
    public 1wn A09;
    public 1wn A0A;
    public C252063oV A0B;
    public 1Xj A0C;
    public LMW A0D;
    public Venue A0E;
    public String A0F = "";
    public String A0G;
    public String A0H;
    public String A0I;
    public ArrayList A0J;
    public ArrayList A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public 1wn A0X;
    public final AnonymousClass0eM A0Y;
    public TaggingFeedMultiSelectState shoppingMultiSelectState;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        if (getContext() != null) {
            ? obj = new Object();
            C59922Jbl.A02(DbV.A05(this), obj, 2131961455);
            ActionButton A002 = C59904JbT.A00(LY6.A00(this, 14), r4, obj);
            this.A03 = A002;
            float f = 0.5f;
            if (this.A0T) {
                f = 1.0f;
            }
            A002.setAlpha(f);
            r4.setIsLoading(this.A0S);
        }
    }

    public final String getModuleName() {
        return "video_edit_metadata_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Location lastLocation;
        List list;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A02 = view2;
        requireActivity();
        View view3 = this.A02;
        if (view3 != null) {
            this.A0B = DbU.A0Y(view3, R.id.captions_row_stub);
            C64698LgT A002 = C64698LgT.A00(this, 69);
            1Ng r1 = this.A08;
            str = "eventBus";
            if (r1 != null) {
                r1.A01(A002, C64648Lfa.class);
                this.A09 = A002;
                C64698LgT A003 = C64698LgT.A00(this, 70);
                1Ng r12 = this.A08;
                if (r12 != null) {
                    r12.A01(A003, C64677Lg3.class);
                    this.A0A = A003;
                    C22328Xzd A004 = NearbyVenuesService.A00(this.A00);
                    if (A004 != null) {
                        List items = A004.getItems();
                        this.A0U = true;
                        if (items != null) {
                            list = items.subList(0, Math.min(5, items.size()));
                        } else {
                            list = null;
                        }
                        this.A0L = list;
                        A03(this);
                    }
                    1Wr r2 = 1Wr.A00;
                    if (r2 == null || (lastLocation = r2.getLastLocation(AnonymousClass7TE.A0l(this.A0Y), __redex_internal_original_name)) == null || 1Wr.A00 == null || !C270984hi.A00(lastLocation)) {
                        1Wr r3 = 1Wr.A00;
                        if (r3 != null) {
                            r3.requestLocationUpdates(AnonymousClass7TE.A0l(this.A0Y), this.A05, "video_edit_metadata_fragment");
                        }
                    } else {
                        A00(lastLocation, this);
                    }
                    AnonymousClass0eM r32 = this.A0Y;
                    UserSession A0l = AnonymousClass7TE.A0l(r32);
                    UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.IGTV_REVSHARE;
                    0qQ.A0B(A0l, 0);
                    if (AnonymousClass2o3.A00(A0l).A05(userMonetizationProductType)) {
                        LFB lfb = new LFB(requireContext(), AnonymousClass7TE.A0l(r32), AnonymousClass2o3.A00(AnonymousClass7TE.A0l(r32)));
                        View view4 = this.A02;
                        if (view4 != null) {
                            View view5 = DbU.A0Y(view4, R.id.monetization_container_stub).getView();
                            if (view5 != null) {
                                TextView A0d = AnonymousClass7TE.A0d(view5, R.id.title);
                                TextView A0d2 = AnonymousClass7TE.A0d(view5, R.id.description);
                                DbT.A1H(A0d2);
                                MonetizationRepository monetizationRepository = lfb.A02;
                                if (!monetizationRepository.A04(userMonetizationProductType)) {
                                    DbU.A1G(A0d, this, 2131964043);
                                    A0d2.setText(lfb.A01(new C65489LuD(this, 2), "https://www.facebook.com/help/instagram/793848097773634", true));
                                } else {
                                    1Xj r0 = this.A0C;
                                    if (r0 != null) {
                                        if (r0.A1B() < JTS.A05(0Tu.A05, lfb.A01, 36592966743098114L) || !monetizationRepository.A04(userMonetizationProductType)) {
                                            DbU.A1G(A0d, this, 2131964045);
                                            A0d2.setText(lfb.A01(new C65489LuD(this, 4), "https://help.instagram.com/2635536099905516", false));
                                            view5.setVisibility(0);
                                        } else {
                                            DbU.A1G(A0d, this, 2131964001);
                                            A0d2.setText(lfb.A00(new C65489LuD(this, 3)));
                                            IgdsSwitch igdsSwitch = (IgdsSwitch) view5.findViewById(R.id.allow_ads_switch);
                                            igdsSwitch.setPadding(igdsSwitch.getPaddingStart(), igdsSwitch.getPaddingTop(), 8, igdsSwitch.getPaddingBottom());
                                            igdsSwitch.setGravity(17);
                                            igdsSwitch.setEnabled(true);
                                            igdsSwitch.setChecked(this.A0O);
                                            igdsSwitch.A07 = new C65369LsA(this, 28);
                                            igdsSwitch.setVisibility(0);
                                        }
                                    }
                                    str = "editMedia";
                                }
                            }
                        }
                    }
                    if (182.A06(0Tu.A05, DbT.A0X(r32), 36311315672728057L)) {
                        View view6 = this.A02;
                        str = "mainView";
                        if (view6 != null) {
                            View view7 = DbU.A0Y(view6, R.id.funded_content_toggle_stub).getView();
                            IgdsSwitch igdsSwitch2 = (IgdsSwitch) AnonymousClass7TE.A0b(view7, R.id.funded_content_toggle);
                            View view8 = this.A02;
                            if (view8 != null) {
                                C51967G9n.A0x(view8, R.id.funded_content_top_divider, 0);
                                1Xj r02 = this.A0C;
                                if (r02 != null) {
                                    Boolean CU7 = r02.A0C.CU7();
                                    if (CU7 == null || !CU7.booleanValue()) {
                                        igdsSwitch2.A07 = new C65369LsA(this, 27);
                                    } else {
                                        igdsSwitch2.setChecked(true);
                                        igdsSwitch2.setEnabled(false);
                                        DbU.A1A(DbV.A05(this), DbW.A0B(view7, R.id.funded_content_secondary_text), 2131964035);
                                    }
                                }
                                str = "editMedia";
                            }
                        }
                    }
                    if (AnonymousClass430.A00(AnonymousClass7TE.A0l(r32))) {
                        if (!this.A0Q) {
                            1Xj r03 = this.A0C;
                            str = "editMedia";
                            if (r03 != null) {
                                this.A0V = r03.A5l();
                                1Xj r04 = this.A0C;
                                if (r04 != null) {
                                    this.A0W = r04.A5l();
                                    1Xj r05 = this.A0C;
                                    if (r05 != null) {
                                        List<AnonymousClass536> A3j = r05.A3j();
                                        ArrayList A0r = AnonymousClass7TG.A0r(A3j);
                                        for (AnonymousClass536 r13 : A3j) {
                                            A0r.add(new BrandedContentTag(r13.ByI(), AnonymousClass7TG.A1X(r13.Bbh()), AnonymousClass7TG.A1X(r13.CYy())));
                                        }
                                        this.A0M = A0r;
                                        this.A0N = A0r;
                                        this.A0Q = true;
                                        1Xj r06 = this.A0C;
                                        if (r06 != null) {
                                            this.A07 = r06.A0C.Aho();
                                        }
                                    }
                                }
                            }
                        }
                        View view9 = this.A02;
                        str = "mainView";
                        if (view9 != null) {
                            View view10 = DbU.A0Y(view9, R.id.branded_content_tagging_stub).getView();
                            view10.setVisibility(0);
                            LY6.A01(view10, 15, this);
                            View view11 = this.A02;
                            if (view11 != null) {
                                this.A04 = DbU.A0G(view11, R.id.brand_partners_text);
                                A02(this);
                                LPL.A01(this, AnonymousClass7TE.A0l(r32), AnonymousClass05K.A0F, AnonymousClass05K.A15, r32);
                            }
                        }
                    }
                    1Xj r07 = this.A0C;
                    if (r07 != null) {
                        if (r07.A51()) {
                            C252063oV r08 = this.A0B;
                            if (r08 == null) {
                                str = "captionsStubHolder";
                            } else {
                                View view12 = r08.getView();
                                AnonymousClass0fU.A00(new LY7(15, (Object) view12, (Object) this), view12);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    str = "editMedia";
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "mainView";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(Location location, C61941KSq kSq) {
        kSq.A00 = location;
        1Wr r2 = 1Wr.A00;
        if (r2 != null) {
            r2.removeLocationUpdates(AnonymousClass7TE.A0l(kSq.A0Y), kSq.A05);
        }
        FragmentActivity activity = kSq.getActivity();
        if (activity != null) {
            NearbyVenuesService.A01(activity, location, AnonymousClass7TE.A0l(kSq.A0Y), (LocationSignalPackage) null, -1L);
        }
    }

    public static final void A01(1Xj r4, C61941KSq kSq) {
        String str;
        kSq.A0C = r4;
        C247733gp A1T = r4.A1T();
        if (A1T == null || (str = A1T.A0d) == null) {
            str = "";
        }
        kSq.A0F(str);
        1Xj r0 = kSq.A0C;
        if (r0 != null) {
            kSq.A0E = r0.A23();
            1Xj r02 = kSq.A0C;
            if (r02 != null) {
                kSq.A0P = r02.A4c();
                1Xj r03 = kSq.A0C;
                if (r03 != null) {
                    boolean z = false;
                    kSq.A03 = DbW.A1a(r03.A0C.BFp());
                    kSq.A02 = false;
                    1Xj r04 = kSq.A0C;
                    if (r04 != null) {
                        C46280DTj BFl = r04.A0C.BFl();
                        if (BFl != null) {
                            z = AnonymousClass7TF.A1Y(BFl.Aa6(), true);
                        }
                        kSq.A0O = z;
                        1Xj r05 = kSq.A0C;
                        if (r05 != null) {
                            ArrayList A3E = r05.A3E();
                            if (A3E == null) {
                                A3E = AnonymousClass7TE.A1C();
                            }
                            kSq.A0K = A3E;
                            1Xj r06 = kSq.A0C;
                            if (r06 != null) {
                                ArrayList A3I = r06.A3I();
                                if (A3I == null) {
                                    A3I = AnonymousClass7TE.A1C();
                                }
                                kSq.A0J = A3I;
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("editMedia");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C61941KSq kSq) {
        TextView textView = kSq.A04;
        if (textView != null) {
            kSq.A0Y.getValue();
            List list = kSq.A0N;
            textView.setText(LSV.A00(kSq.requireContext(), kSq.A07, list, kSq.A0W));
        }
    }

    public static final void A04(C61941KSq kSq, boolean z) {
        kSq.A0S = z;
        FragmentActivity activity = kSq.getActivity();
        if (activity != null) {
            2dZ.A0t.A03(activity).setIsLoading(kSq.A0S);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0Y);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<MediaTaggingInfo> arrayList;
        if (i == 1000 && i2 == -1) {
            if (intent == null || (arrayList = intent.getParcelableArrayListExtra("media_tagging_info_list")) == null) {
                arrayList = 0sn.A00;
            }
            for (MediaTaggingInfo mediaTaggingInfo : arrayList) {
                if (mediaTaggingInfo != null) {
                    1Xj r0 = this.A0C;
                    if (r0 == null) {
                        0qQ.A0F("editMedia");
                        throw AnonymousClass00P.createAndThrow();
                    } else if (0qQ.A0K(r0.getId(), mediaTaggingInfo.A06)) {
                        this.A0K = mediaTaggingInfo.A0B;
                        this.A0J = mediaTaggingInfo.A0A;
                    }
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        String str;
        LMW lmw = this.A0D;
        if (lmw == null) {
            str = "logger";
        } else {
            String str2 = this.A0H;
            if (str2 == null) {
                str = "mediaId";
            } else {
                LMW.A00(lmw, "tap_cancel", str2);
                return false;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C61941KSq() {
        0sn r0 = 0sn.A00;
        this.A0M = r0;
        this.A0N = r0;
        this.A0K = AnonymousClass7TE.A1C();
        this.A0J = AnonymousClass7TE.A1C();
        this.A0X = C64698LgT.A00(this, 68);
        this.A0Y = C227642jf.A02(this);
    }

    public static final void A03(C61941KSq kSq) {
        if (kSq.getContext() != null) {
            kSq.A0B(kSq.A0D());
            kSq.A0E();
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1020893400);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r4 = this.A0Y;
        this.A08 = DbX.A0R(r4);
        this.A01 = AnonymousClass7TF.A0D();
        this.A0G = C320236s2.A01(requireArguments, AnonymousClass000.A00(1448));
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        String str2 = this.A0G;
        if (str2 == null) {
            str = "composerSessionId";
        } else {
            this.A0D = new LMW(A0l, this, str2);
            String A012 = C320236s2.A01(requireArguments, AnonymousClass000.A00(1447));
            this.A0H = A012;
            str = "mediaId";
            if (A012 != null) {
                this.A0I = A012;
                LMW lmw = this.A0D;
                if (lmw == null) {
                    str = "logger";
                } else {
                    AnonymousClass4DU r5 = lmw.A01;
                    C254523sc r2 = new C254523sc(r5, "igtv_composer_start");
                    r2.A5g = lmw.A02;
                    r2.A22 = AnonymousClass7TE.A0v();
                    r2.A4r = "edit";
                    r2.A4J = "tap_edit";
                    r2.A5u = A012;
                    C233822wX.A0I(lmw.A00, r2, r5, AnonymousClass05K.A00);
                    requireActivity();
                    1Ng r22 = this.A08;
                    if (r22 == null) {
                        str = "eventBus";
                    } else {
                        r22.A01(this.A0X, C64679Lg6.class);
                        1E8 A0d = DbX.A0d(r4);
                        String str3 = this.A0H;
                        if (str3 != null) {
                            1Xj A023 = A0d.A02(str3);
                            if (A023 == null) {
                                String str4 = this.A0H;
                                if (str4 != null) {
                                    1OC A042 = C3724090s.A04(AnonymousClass7TE.A0l(r4), str4);
                                    C61500KAf.A00(A042, this, 26);
                                    schedule(A042);
                                }
                            } else {
                                A01(A023, this);
                            }
                            AnonymousClass0fD.A09(-231545372, A022);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-696167539);
        super.onDestroy();
        1Ng r2 = this.A08;
        if (r2 == null) {
            0qQ.A0F("eventBus");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.A02(this.A0X, C64679Lg6.class);
        AnonymousClass0fD.A09(-1881195353, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1976126684);
        this.A04 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(748464690, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-955167111);
        super.onResume();
        DbU.A0L(this, 2dZ.A0t).A0X(this);
        A03(this);
        AnonymousClass0fD.A09(1862399877, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1492565509);
        1Ng r2 = this.A08;
        String str = "eventBus";
        if (r2 != null) {
            Class<C64648Lfa> cls = C64648Lfa.class;
            1wn r0 = this.A09;
            if (r0 == null) {
                str = "venueSelectedListener";
            } else {
                r2.A02(r0, cls);
                1Ng r22 = this.A08;
                if (r22 != null) {
                    Class<C64677Lg3> cls2 = C64677Lg3.class;
                    1wn r02 = this.A0A;
                    if (r02 == null) {
                        str = "venuesFetchedEventListener";
                    } else {
                        r22.A02(r02, cls2);
                        C61941KSq.super.onStop();
                        AnonymousClass0fD.A09(-1960474956, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
