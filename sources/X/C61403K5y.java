package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;

/* renamed from: X.K5y  reason: case insensitive filesystem */
public final class C61403K5y extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BoostMediaPickerFragment";
    public C60730JqJ A00;
    public IgSegmentedTabLayout2 A01;
    public Exception A02;
    public ViewPager2 A03;
    public 2da A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C20606Wvn(this, 43));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C20606Wvn(this, 44));
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C20606Wvn(this, 45));
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new C20606Wvn(this, 46));
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(new C20606Wvn(this, 47));
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B;
    public final C60731JqK A0C = new C60731JqK(this, 3);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        this.A04 = r2;
        r2.Eu4(true);
        A00(((C60293Jiq) this.A0B.getValue()).A01(), this);
    }

    public final String getModuleName() {
        return "boost_media_picker_fragment";
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.K5y, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C3021461u r3 = (C3021461u) AnonymousClass7TF.A0F(view, R.id.action_button);
        r3.setPrimaryAction(getString(2131968361), new LY1(this, 18));
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.media_picker_view_pager);
        if (viewPager2 != null) {
            viewPager2.A05(this.A0C);
            C60730JqJ jqJ = new C60730JqJ(this, AnonymousClass7TE.A0l(this.A0A));
            this.A00 = jqJ;
            viewPager2.setAdapter(jqJ);
            IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) view.findViewById(R.id.media_type_segmented_tab);
            igSegmentedTabLayout2.setViewPager(viewPager2);
            this.A01 = igSegmentedTabLayout2;
        } else {
            viewPager2 = null;
        }
        this.A03 = viewPager2;
        AnonymousClass7TE.A1Z(new MHC((Object) r3, (Object) this, (AnonymousClass4D7) null, 48), DbW.A0E(this));
        AnonymousClass0eM r5 = this.A0A;
        WGU A0D = JTU.A0D(r5);
        String A0t = DbS.A0t(this.A06);
        C16678UzE uzE = C16678UzE.MEDIA_PICKER;
        A0D.A0S(A0t, uzE.toString());
        AnonymousClass0eM r0 = this.A0B;
        ((C60293Jiq) r0.getValue()).A04((C16492Uvn) ((C61068Jw6) ((C60293Jiq) r0.getValue()).A01.getValue()).A05);
        if (this.A02 != null) {
            JTU.A0D(r5).A0Y(uzE.toString(), AnonymousClass000.A00(4109), this.A02);
            this.A02 = null;
            AnonymousClass7TF.A0D().postDelayed(new C65857M1y(this), 1000);
        }
    }

    public static final void A00(BoostMediaPickerTabType boostMediaPickerTabType, C61403K5y k5y) {
        if (boostMediaPickerTabType == null || boostMediaPickerTabType.ordinal() != 3) {
            2da r1 = k5y.A04;
            if (r1 != null) {
                r1.EfN(r1.C7y().getText(), "");
                return;
            }
            return;
        }
        2da r12 = k5y.A04;
        if (r12 != null) {
            r12.Eom(2131965949);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final boolean onBackPressed() {
        WGU A0D = JTU.A0D(this.A0A);
        String obj = C16678UzE.MEDIA_PICKER.toString();
        0Aj A0e = AnonymousClass7TE.A0e(A0D.A05, "promoted_posts_cancel");
        if (!A0e.isSampled()) {
            return false;
        }
        A0e.AAJ("waterfall_id", A0D.A03);
        0bb r2 = new 0bb();
        r2.A03("is_business_user_access_token_enabled", AnonymousClass7TE.A0v());
        r2.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(A0D.A04));
        A0e.AAK(r2, "configurations");
        DbS.A1N(A0e, A0D.A01);
        C51965G9l.A1I(A0e, A0D.A02);
        DbS.A1H(A0e, obj);
        A0e.Cgf();
        return false;
    }

    public C61403K5y() {
        C20703Wxa wxa = new C20703Wxa(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20606Wvn(new C20606Wvn(this, 48), 49));
        this.A0B = DbS.A0I(new C20703Wxa(A002, 0), wxa, new C41566AwY(6, (Object) null, A002), DbS.A0z(C60293Jiq.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(779330747);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_media_picker_revamp_fragment, false);
        AnonymousClass0fD.A09(963921973, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-285041904);
        super.onDestroyView();
        ViewPager2 viewPager2 = this.A03;
        if (viewPager2 != null) {
            viewPager2.A05.A00.remove(this.A0C);
        }
        this.A01 = null;
        this.A03 = null;
        this.A00 = null;
        A00((BoostMediaPickerTabType) null, this);
        this.A04 = null;
        AnonymousClass0fD.A09(764776118, A022);
    }
}
