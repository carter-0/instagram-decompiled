package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.VideoView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.List;

/* renamed from: X.Uaf  reason: case insensitive filesystem */
public final class C15330Uaf extends AnonymousClass4DH implements C252293os {
    public static final String __redex_internal_original_name = "ChannelCreationNuxCarouselFragment";
    public int A00;
    public C252293os A01;
    public C252293os A02;
    public ReboundViewPager A03;
    public List A04;
    public boolean A05 = true;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final /* synthetic */ void DVx(int i, int i2) {
    }

    public final /* synthetic */ void DW9(int i, int i2, boolean z) {
    }

    public final /* synthetic */ void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final /* synthetic */ void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final /* synthetic */ void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final /* synthetic */ void DzE(View view) {
    }

    public final String getModuleName() {
        return "channel_creation_nux_carousel_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (ReboundViewPager) view.requireViewById(R.id.nux_pager);
        C255913uv r2 = (C255913uv) AnonymousClass7TF.A0F(view, R.id.page_indicator);
        C252293os r1 = this.A02;
        if (r1 != null) {
            ReboundViewPager reboundViewPager = this.A03;
            if (reboundViewPager != null) {
                reboundViewPager.A0P(r1);
            }
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        ReboundViewPager reboundViewPager2 = this.A03;
        if (reboundViewPager2 != null) {
            reboundViewPager2.A0P(r2);
            List list = this.A04;
            if (list != null) {
                int size = list.size();
                this.A00 = size;
                if (size == 0) {
                    r2.setVisibility(8);
                } else {
                    if (size > 1) {
                        r2.A01(0, size);
                        r2.setVisibility(0);
                    }
                    U4E u4e = new U4E(AnonymousClass7TE.A0l(this.A06), new C17221VMz(this), new VN0(this), list);
                    ReboundViewPager reboundViewPager3 = this.A03;
                    if (reboundViewPager3 != null) {
                        reboundViewPager3.setAdapter((Adapter) u4e);
                        ReboundViewPager reboundViewPager4 = this.A03;
                        if (reboundViewPager4 != null) {
                            reboundViewPager4.setCarouselModeEnabled(true);
                            C72239Oz7 oz7 = new C72239Oz7(this, 2);
                            this.A01 = oz7;
                            ReboundViewPager reboundViewPager5 = this.A03;
                            if (reboundViewPager5 != null) {
                                reboundViewPager5.A0P(oz7);
                            }
                        }
                    }
                }
            }
            A00(this);
            return;
        }
        0qQ.A0F("viewPager");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C15330Uaf uaf) {
        ReboundViewPager reboundViewPager = uaf.A03;
        if (reboundViewPager == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        View view = reboundViewPager.A0F;
        if (view != null) {
            VideoView videoView = (VideoView) AnonymousClass7TF.A0F(view, R.id.video);
            if (182.A06(0Tu.A05, DbT.A0X(uaf.A06), 36318058774468429L)) {
                videoView.setOnErrorListener(W64.A00);
            }
            videoView.seekTo(0);
            videoView.start();
        }
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1580523892);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_channels_nux_carousel, false);
        AnonymousClass0fD.A09(-516380671, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1890665582);
        super.onDestroyView();
        C252293os r1 = this.A02;
        if (r1 != null) {
            ReboundViewPager reboundViewPager = this.A03;
            if (reboundViewPager != null) {
                reboundViewPager.A0Q(r1);
                this.A02 = null;
            }
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        C252293os r12 = this.A01;
        if (r12 != null) {
            ReboundViewPager reboundViewPager2 = this.A03;
            if (reboundViewPager2 != null) {
                reboundViewPager2.A0Q(r12);
                this.A01 = null;
            }
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(130011896, A022);
    }
}
