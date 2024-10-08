package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class UZO extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromotePagedPreviewFragment";
    public WGU A00;
    public boolean A01 = true;
    public XIGIGBoostCallToAction A02;
    public XIGIGBoostDestination A03;
    public AudioOverlayTrack A04;
    public String A05;
    public String A06;
    public List A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final AnonymousClass0eM A0F = C227642jf.A02(this);

    public final String getModuleName() {
        return "promote_paged_preview";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        TabLayout tabLayout = (TabLayout) AnonymousClass7TF.A0F(view2, R.id.promote_preview_tab_layout);
        ViewPager2 viewPager2 = (ViewPager2) AnonymousClass7TF.A0F(view2, R.id.promote_preview_view_pager);
        this.A01 = true;
        UserSession A0l = AnonymousClass7TE.A0l(this.A0F);
        XIGIGBoostDestination xIGIGBoostDestination = this.A03;
        if (xIGIGBoostDestination == null) {
            str = "selectedDestination";
        } else {
            List list = this.A07;
            if (list == null) {
                str = "instagramPositions";
            } else {
                String str2 = this.A05;
                if (str2 == null) {
                    str = "mediaId";
                } else {
                    XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
                    if (xIGIGBoostCallToAction == null) {
                        str = "callToAction";
                    } else {
                        boolean z = this.A0A;
                        boolean z2 = this.A0B;
                        boolean z3 = this.A09;
                        boolean z4 = this.A0D;
                        boolean z5 = this.A0E;
                        String str3 = this.A06;
                        boolean z6 = this.A0C;
                        List list2 = this.A08;
                        if (list2 == null) {
                            str = "specialRequirementCategories";
                        } else {
                            boolean z7 = z;
                            boolean z8 = z2;
                            AudioOverlayTrack audioOverlayTrack = this.A04;
                            String str4 = str2;
                            String str5 = str3;
                            XIGIGBoostCallToAction xIGIGBoostCallToAction2 = xIGIGBoostCallToAction;
                            XIGIGBoostDestination xIGIGBoostDestination2 = xIGIGBoostDestination;
                            viewPager2.setAdapter(new UFU(this, xIGIGBoostCallToAction2, xIGIGBoostDestination2, A0l, audioOverlayTrack, str4, str5, list, list2, z7, z8, z3, z4, z5, z6));
                            new C66992MgQ(viewPager2, tabLayout, new C64447Lc2(this, 0)).A00();
                            viewPager2.A05(new UFV(this, 1));
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131970642);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        IllegalStateException illegalStateException;
        int i;
        ArrayList<String> stringArrayList;
        String string;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        ArrayList<String> arrayList;
        Object parcelable;
        int A022 = AnonymousClass0fD.A02(-1727949669);
        UZO.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AudioOverlayTrack audioOverlayTrack = null;
        if (bundle2 != null) {
            str = bundle2.getString("destination");
        } else {
            str = null;
        }
        if (str != null) {
            this.A03 = XIGIGBoostDestination.valueOf(str);
            Bundle bundle3 = this.mArguments;
            boolean z6 = false;
            if (bundle3 == null || (stringArrayList = bundle3.getStringArrayList("instagram_positions")) == null) {
                illegalStateException = new IllegalStateException("Required value was null.");
                i = -1944458711;
            } else {
                ArrayList A0r = AnonymousClass7TG.A0r(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    0qQ.A0A(A18);
                    A0r.add(AdsAPIInstagramPosition.valueOf(A18));
                }
                AnonymousClass0eM r6 = this.A0F;
                UserSession A0l = AnonymousClass7TE.A0l(r6);
                XIGIGBoostDestination xIGIGBoostDestination = this.A03;
                if (xIGIGBoostDestination != null) {
                    ArrayList A002 = C305936Kd.A00(xIGIGBoostDestination, A0l, A0r);
                    ArrayList arrayList2 = new ArrayList();
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
                        arrayList2.add(next);
                    }
                    this.A07 = arrayList2;
                    Bundle bundle4 = this.mArguments;
                    if (bundle4 == null || (string = bundle4.getString("media_id")) == null) {
                        illegalStateException = new IllegalStateException("Required value was null.");
                        i = -1923082090;
                    } else {
                        this.A05 = string;
                        Bundle bundle5 = this.mArguments;
                        if (bundle5 == null || (string2 = bundle5.getString("call_to_action")) == null) {
                            illegalStateException = new IllegalStateException("Required value was null.");
                            i = 384364960;
                        } else {
                            this.A02 = XIGIGBoostCallToAction.valueOf(string2);
                            Bundle bundle6 = this.mArguments;
                            if (bundle6 != null) {
                                z = bundle6.getBoolean("is_fb_placement_eligible");
                            } else {
                                z = false;
                            }
                            this.A0A = z;
                            Bundle bundle7 = this.mArguments;
                            if (bundle7 != null) {
                                z2 = bundle7.getBoolean("is_fb_placement_selected");
                            } else {
                                z2 = false;
                            }
                            this.A0B = z2;
                            Bundle bundle8 = this.mArguments;
                            if (bundle8 != null) {
                                z3 = bundle8.getBoolean("is_ad_format_preferences_eligible");
                            } else {
                                z3 = false;
                            }
                            this.A09 = z3;
                            Bundle bundle9 = this.mArguments;
                            if (bundle9 != null) {
                                z4 = bundle9.getBoolean("should_show_creative_optimization_toggle");
                            } else {
                                z4 = false;
                            }
                            this.A0D = z4;
                            Bundle bundle10 = this.mArguments;
                            if (bundle10 != null) {
                                z5 = bundle10.getBoolean("should_show_multi_advertiser_ads_toggle");
                            } else {
                                z5 = false;
                            }
                            this.A0E = z5;
                            Bundle bundle11 = this.mArguments;
                            if (bundle11 != null) {
                                str2 = bundle11.getString("political_ad_byline_text");
                            } else {
                                str2 = null;
                            }
                            this.A06 = str2;
                            Bundle bundle12 = this.mArguments;
                            if (bundle12 != null) {
                                z6 = bundle12.getBoolean("is_political_ads");
                            }
                            this.A0C = z6;
                            Bundle bundle13 = this.mArguments;
                            if (bundle13 == null || (arrayList = bundle13.getStringArrayList("special_requirement_categories")) == null) {
                                arrayList = new ArrayList<>();
                            }
                            this.A08 = arrayList;
                            int i2 = Build.VERSION.SDK_INT;
                            Bundle bundle14 = this.mArguments;
                            if (i2 >= 33) {
                                if (bundle14 != null) {
                                    parcelable = 2Yc.A01(bundle14, AudioOverlayTrack.class, "selected_audio_overlay_track");
                                }
                                this.A04 = audioOverlayTrack;
                                this.A00 = JTU.A0D(r6);
                                AnonymousClass0fD.A09(-1717729936, A022);
                                return;
                            }
                            if (bundle14 != null) {
                                parcelable = bundle14.getParcelable("selected_audio_overlay_track");
                            }
                            this.A04 = audioOverlayTrack;
                            this.A00 = JTU.A0D(r6);
                            AnonymousClass0fD.A09(-1717729936, A022);
                            return;
                            audioOverlayTrack = (AudioOverlayTrack) parcelable;
                            this.A04 = audioOverlayTrack;
                            this.A00 = JTU.A0D(r6);
                            AnonymousClass0fD.A09(-1717729936, A022);
                            return;
                        }
                    }
                }
                0qQ.A0F("selectedDestination");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -948142409;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(893069297);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_fragment_paged_preview, viewGroup, false);
        AnonymousClass0fD.A09(2122042238, A022);
        return inflate;
    }
}
