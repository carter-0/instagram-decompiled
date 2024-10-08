package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.igds.components.banner.IgdsBanner;
import java.io.Serializable;

/* renamed from: X.E2i  reason: case insensitive filesystem */
public final class C47436E2i extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TrendFragment";
    public HM8 A00;
    public TrackOrOriginalSoundSchema A01;
    public IgdsBanner A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C20695WxR(this, 48));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        ((2dZ) this.A03.getValue()).Eom(2131975525);
        r3.Eu4(true);
        F3V f3v = new F3V(AnonymousClass05K.A00);
        f3v.A0A = FP4.A00(this, 26);
        f3v.A00();
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A02(AnonymousClass05K.A0Y);
        DbX.A19(FP4.A00(this, 27), A0K, r3);
    }

    public final String getModuleName() {
        return "trend_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (IgdsBanner) view.requireViewById(R.id.trend_header_banner);
        1Av A0h = DbX.A0h(this.A04);
        if (!AnonymousClass7TG.A1a(A0h, A0h.A5N, 1Av.A8a, 432)) {
            IgdsBanner igdsBanner = this.A02;
            if (igdsBanner != null) {
                igdsBanner.setIconBackground((Drawable) null);
            }
            IgdsBanner igdsBanner2 = this.A02;
            if (igdsBanner2 != null) {
                igdsBanner2.A00 = new C50468FcG(A0h, 13);
                igdsBanner2.setVisibility(0);
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        HM8 hm8;
        int A022 = AnonymousClass0fD.A02(696496360);
        C47436E2i.super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("trend_report_entrypoint");
        if (serializable instanceof HM8) {
            hm8 = (HM8) serializable;
        } else {
            hm8 = null;
        }
        this.A00 = hm8;
        Bundle requireArguments = requireArguments();
        String A002 = AnonymousClass000.A00(2671);
        this.A01 = (TrackOrOriginalSoundSchema) requireArguments.getParcelable(A002);
        C3515689j r1 = C3515689j.TREND_REPORT;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("referrer_audio_id", (String) null);
        A0a.putSerializable("music_selection_source", r1);
        AnonymousClass0eM r5 = this.A04;
        DbU.A1D(A0a, AnonymousClass7TE.A0l(r5));
        A0a.putParcelable(A002, this.A01);
        A0a.putSerializable("trend_report_entrypoint", this.A00);
        A0a.putBoolean(AnonymousClass000.A00(1815), 182.A06(0Tu.A05, DbY.A0R(r5), 36328401052974411L));
        r5.getValue();
        H1J h1j = new H1J();
        h1j.setArguments(A0a);
        0s1 A0C = DbW.A0C(this);
        A0C.A0A(h1j, R.id.trending_audio_container);
        A0C.A00();
        AnonymousClass0fD.A09(93954763, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-954207376);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_trend, false);
        AnonymousClass0fD.A09(-929439897, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1590217772);
        super.onDestroy();
        AnonymousClass0fD.A09(-1442679272, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1401791764);
        super.onDestroyView();
        this.A02 = null;
        AnonymousClass0fD.A09(813425901, A022);
    }
}
